package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.RecognitionAudio;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface RecognitionAudioOrBuilder extends MessageOrBuilder {
    RecognitionAudio.AudioSourceCase getAudioSourceCase();

    ByteString getContent();

    String getUri();

    ByteString getUriBytes();
}
