package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface RecognitionConfigOrBuilder extends MessageOrBuilder {
    int getAudioChannelCount();

    SpeakerDiarizationConfig getDiarizationConfig();

    SpeakerDiarizationConfigOrBuilder getDiarizationConfigOrBuilder();

    boolean getEnableAutomaticPunctuation();

    boolean getEnableSeparateRecognitionPerChannel();

    boolean getEnableWordTimeOffsets();

    RecognitionConfig.AudioEncoding getEncoding();

    int getEncodingValue();

    String getLanguageCode();

    ByteString getLanguageCodeBytes();

    int getMaxAlternatives();

    RecognitionMetadata getMetadata();

    RecognitionMetadataOrBuilder getMetadataOrBuilder();

    String getModel();

    ByteString getModelBytes();

    boolean getProfanityFilter();

    int getSampleRateHertz();

    SpeechContext getSpeechContexts(int i);

    int getSpeechContextsCount();

    List<SpeechContext> getSpeechContextsList();

    SpeechContextOrBuilder getSpeechContextsOrBuilder(int i);

    List<? extends SpeechContextOrBuilder> getSpeechContextsOrBuilderList();

    boolean getUseEnhanced();

    boolean hasDiarizationConfig();

    boolean hasMetadata();
}
