package io.grpc.lb.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes4.dex */
public interface ServerOrBuilder extends MessageOrBuilder {
    boolean getDrop();

    ByteString getIpAddress();

    String getLoadBalanceToken();

    ByteString getLoadBalanceTokenBytes();

    int getPort();
}
