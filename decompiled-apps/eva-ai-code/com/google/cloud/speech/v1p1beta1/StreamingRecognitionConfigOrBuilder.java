package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface StreamingRecognitionConfigOrBuilder extends MessageOrBuilder {
    RecognitionConfig getConfig();

    RecognitionConfigOrBuilder getConfigOrBuilder();

    boolean getInterimResults();

    boolean getSingleUtterance();

    boolean hasConfig();
}
