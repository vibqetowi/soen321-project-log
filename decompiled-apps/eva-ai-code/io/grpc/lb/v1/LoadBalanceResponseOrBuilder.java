package io.grpc.lb.v1;

import com.google.protobuf.MessageOrBuilder;
import io.grpc.lb.v1.LoadBalanceResponse;
/* loaded from: classes4.dex */
public interface LoadBalanceResponseOrBuilder extends MessageOrBuilder {
    FallbackResponse getFallbackResponse();

    FallbackResponseOrBuilder getFallbackResponseOrBuilder();

    InitialLoadBalanceResponse getInitialResponse();

    InitialLoadBalanceResponseOrBuilder getInitialResponseOrBuilder();

    LoadBalanceResponse.LoadBalanceResponseTypeCase getLoadBalanceResponseTypeCase();

    ServerList getServerList();

    ServerListOrBuilder getServerListOrBuilder();

    boolean hasFallbackResponse();

    boolean hasInitialResponse();

    boolean hasServerList();
}
