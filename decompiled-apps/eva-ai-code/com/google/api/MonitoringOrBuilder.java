package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface MonitoringOrBuilder extends MessageOrBuilder {
    Monitoring.MonitoringDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    Monitoring.MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(int i);

    List<? extends Monitoring.MonitoringDestinationOrBuilder> getConsumerDestinationsOrBuilderList();

    Monitoring.MonitoringDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Monitoring.MonitoringDestination> getProducerDestinationsList();

    Monitoring.MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(int i);

    List<? extends Monitoring.MonitoringDestinationOrBuilder> getProducerDestinationsOrBuilderList();
}
