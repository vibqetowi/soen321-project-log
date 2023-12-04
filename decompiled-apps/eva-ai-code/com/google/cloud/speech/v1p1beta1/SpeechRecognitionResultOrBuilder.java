package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface SpeechRecognitionResultOrBuilder extends MessageOrBuilder {
    SpeechRecognitionAlternative getAlternatives(int i);

    int getAlternativesCount();

    List<SpeechRecognitionAlternative> getAlternativesList();

    SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(int i);

    List<? extends SpeechRecognitionAlternativeOrBuilder> getAlternativesOrBuilderList();

    int getChannelTag();

    String getLanguageCode();

    ByteString getLanguageCodeBytes();
}
