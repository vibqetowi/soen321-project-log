package com.google.cloud.speech.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface RecognizeResponseOrBuilder extends MessageOrBuilder {
    SpeechRecognitionResult getResults(int i);

    int getResultsCount();

    List<SpeechRecognitionResult> getResultsList();

    SpeechRecognitionResultOrBuilder getResultsOrBuilder(int i);

    List<? extends SpeechRecognitionResultOrBuilder> getResultsOrBuilderList();
}
