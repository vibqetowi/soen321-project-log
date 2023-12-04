package io.grpc.alts.internal;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes4.dex */
public interface HandshakerStatusOrBuilder extends MessageOrBuilder {
    int getCode();

    String getDetails();

    ByteString getDetailsBytes();
}
