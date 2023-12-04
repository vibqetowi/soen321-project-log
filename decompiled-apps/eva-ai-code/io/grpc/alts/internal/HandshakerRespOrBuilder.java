package io.grpc.alts.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes4.dex */
public interface HandshakerRespOrBuilder extends MessageOrBuilder {
    int getBytesConsumed();

    ByteString getOutFrames();

    HandshakerResult getResult();

    HandshakerResultOrBuilder getResultOrBuilder();

    HandshakerStatus getStatus();

    HandshakerStatusOrBuilder getStatusOrBuilder();

    boolean hasResult();

    boolean hasStatus();
}
