package io.grpc.lb.v1;

import com.google.protobuf.MessageOrBuilder;
import io.grpc.lb.v1.LoadBalanceRequest;
/* loaded from: classes4.dex */
public interface LoadBalanceRequestOrBuilder extends MessageOrBuilder {
    ClientStats getClientStats();

    ClientStatsOrBuilder getClientStatsOrBuilder();

    InitialLoadBalanceRequest getInitialRequest();

    InitialLoadBalanceRequestOrBuilder getInitialRequestOrBuilder();

    LoadBalanceRequest.LoadBalanceRequestTypeCase getLoadBalanceRequestTypeCase();

    boolean hasClientStats();

    boolean hasInitialRequest();
}
