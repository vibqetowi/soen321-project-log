package io.grpc.lb.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes4.dex */
public interface ClientStatsPerTokenOrBuilder extends MessageOrBuilder {
    String getLoadBalanceToken();

    ByteString getLoadBalanceTokenBytes();

    long getNumCalls();
}
