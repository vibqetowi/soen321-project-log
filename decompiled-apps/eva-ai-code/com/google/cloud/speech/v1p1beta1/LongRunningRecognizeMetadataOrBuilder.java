package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
/* loaded from: classes7.dex */
public interface LongRunningRecognizeMetadataOrBuilder extends MessageOrBuilder {
    Timestamp getLastUpdateTime();

    TimestampOrBuilder getLastUpdateTimeOrBuilder();

    int getProgressPercent();

    Timestamp getStartTime();

    TimestampOrBuilder getStartTimeOrBuilder();

    String getUri();

    ByteString getUriBytes();

    boolean hasLastUpdateTime();

    boolean hasStartTime();
}
