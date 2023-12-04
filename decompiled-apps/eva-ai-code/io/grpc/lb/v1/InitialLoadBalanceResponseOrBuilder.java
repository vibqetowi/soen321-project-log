package io.grpc.lb.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes4.dex */
public interface InitialLoadBalanceResponseOrBuilder extends MessageOrBuilder {
    Duration getClientStatsReportInterval();

    DurationOrBuilder getClientStatsReportIntervalOrBuilder();

    String getLoadBalancerDelegate();

    ByteString getLoadBalancerDelegateBytes();

    boolean hasClientStatsReportInterval();
}
