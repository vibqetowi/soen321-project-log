package com.google.cloud.speech.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface StreamingRecognitionResultOrBuilder extends MessageOrBuilder {
    SpeechRecognitionAlternative getAlternatives(int i);

    int getAlternativesCount();

    List<SpeechRecognitionAlternative> getAlternativesList();

    SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(int i);

    List<? extends SpeechRecognitionAlternativeOrBuilder> getAlternativesOrBuilderList();

    int getChannelTag();

    boolean getIsFinal();

    String getLanguageCode();

    ByteString getLanguageCodeBytes();

    Duration getResultEndTime();

    DurationOrBuilder getResultEndTimeOrBuilder();

    float getStability();

    boolean hasResultEndTime();
}
