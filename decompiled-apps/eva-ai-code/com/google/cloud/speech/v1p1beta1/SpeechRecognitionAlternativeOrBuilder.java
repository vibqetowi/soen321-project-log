package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface SpeechRecognitionAlternativeOrBuilder extends MessageOrBuilder {
    float getConfidence();

    String getTranscript();

    ByteString getTranscriptBytes();

    WordInfo getWords(int i);

    int getWordsCount();

    List<WordInfo> getWordsList();

    WordInfoOrBuilder getWordsOrBuilder(int i);

    List<? extends WordInfoOrBuilder> getWordsOrBuilderList();
}
