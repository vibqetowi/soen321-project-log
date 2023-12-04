package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface StreamingRecognizeRequestOrBuilder extends MessageOrBuilder {
    ByteString getAudioContent();

    StreamingRecognitionConfig getStreamingConfig();

    StreamingRecognitionConfigOrBuilder getStreamingConfigOrBuilder();

    StreamingRecognizeRequest.StreamingRequestCase getStreamingRequestCase();

    boolean hasStreamingConfig();
}
