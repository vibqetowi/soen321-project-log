package com.google.cloud.speech.v1;

import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface RecognizeRequestOrBuilder extends MessageOrBuilder {
    RecognitionAudio getAudio();

    RecognitionAudioOrBuilder getAudioOrBuilder();

    RecognitionConfig getConfig();

    RecognitionConfigOrBuilder getConfigOrBuilder();

    boolean hasAudio();

    boolean hasConfig();
}
