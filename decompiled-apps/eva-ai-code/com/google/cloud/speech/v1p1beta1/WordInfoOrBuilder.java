package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface WordInfoOrBuilder extends MessageOrBuilder {
    float getConfidence();

    Duration getEndTime();

    DurationOrBuilder getEndTimeOrBuilder();

    int getSpeakerTag();

    Duration getStartTime();

    DurationOrBuilder getStartTimeOrBuilder();

    String getWord();

    ByteString getWordBytes();

    boolean hasEndTime();

    boolean hasStartTime();
}
