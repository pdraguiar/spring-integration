package com.poc.springintegration.config;

import com.poc.springintegration.model.wassenger.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Transformers;
import org.springframework.integration.http.dsl.Http;
import org.springframework.integration.kafka.dsl.Kafka;
import org.springframework.integration.kafka.inbound.KafkaMessageDrivenChannelAdapter;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.config.StreamsBuilderFactoryBean;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;

import java.util.regex.Pattern;

@Configuration
public class SpringIntegrationConfig {
    @Autowired
    private KafkaTemplate<String, String> wassengerToIntercomProducer;
    @Autowired
    ConsumerFactory<String, String> listener;

    @Bean
    public IntegrationFlow inbound() {
        return IntegrationFlows.from(
                Http.inboundChannelAdapter("/teste")
                    .requestMapping(mapping -> mapping.methods(HttpMethod.POST))
                    .requestPayloadType(String.class)
                )
                .transform(Transformers.fromJson(MessageEvent.class))
                .enrichHeaders(headers -> headers.headerExpression(KafkaHeaders.TOPIC, "payload.data.fromNumber.substring(1) + '-wassenger-to-intercom'"))
                .handle(Kafka.outboundChannelAdapter(wassengerToIntercomProducer)
                        .messageKey(message -> message.getHeaders().get(IntegrationMessageHeaderAccessor.SEQUENCE_NUMBER))
                )
                .get();
    }

    @Bean
    public IntegrationFlow kafka() {
        return IntegrationFlows.from(
                    Kafka.messageDrivenChannelAdapter(listener, KafkaMessageDrivenChannelAdapter.ListenerMode.record, Pattern.compile(".*-wassenger-to-intercom"))
                            .configureListenerContainer(c -> c.groupId("wassenger-to-intercom"))
                )
                .handle(m -> System.out.println("euuu >> " + m))
                .get();
    }
}
