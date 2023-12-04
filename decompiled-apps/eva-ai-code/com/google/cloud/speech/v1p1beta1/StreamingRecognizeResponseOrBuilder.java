package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse;
import com.google.protobuf.MessageOrBuilder;
import com.google.rpc.Status;
import com.google.rpc.StatusOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface StreamingRecognizeResponseOrBuilder extends MessageOrBuilder {
    Status getError();

    StatusOrBuilder getErrorOrBuilder();

    StreamingRecognitionResult getResults(int i);

    int getResultsCount();

    List<StreamingRecognitionResult> getResultsList();

    StreamingRecognitionResultOrBuilder getResultsOrBuilder(int i);

    List<? extends StreamingRecognitionResultOrBuilder> getResultsOrBuilderList();

    StreamingRecognizeResponse.SpeechEventType getSpeechEventType();

    int getSpeechEventTypeValue();

    boolean hasError();
}
