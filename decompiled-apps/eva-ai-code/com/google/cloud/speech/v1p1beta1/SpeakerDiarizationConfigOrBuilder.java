package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface SpeakerDiarizationConfigOrBuilder extends MessageOrBuilder {
    boolean getEnableSpeakerDiarization();

    int getMaxSpeakerCount();

    int getMinSpeakerCount();

    @Deprecated
    int getSpeakerTag();
}
