package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.RecognitionConfig;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface RecognitionConfigOrBuilder extends MessageOrBuilder {
    SpeechAdaptation getAdaptation();

    SpeechAdaptationOrBuilder getAdaptationOrBuilder();

    String getAlternativeLanguageCodes(int i);

    ByteString getAlternativeLanguageCodesBytes(int i);

    int getAlternativeLanguageCodesCount();

    List<String> getAlternativeLanguageCodesList();

    int getAudioChannelCount();

    SpeakerDiarizationConfig getDiarizationConfig();

    SpeakerDiarizationConfigOrBuilder getDiarizationConfigOrBuilder();

    @Deprecated
    int getDiarizationSpeakerCount();

    boolean getEnableAutomaticPunctuation();

    boolean getEnableSeparateRecognitionPerChannel();

    @Deprecated
    boolean getEnableSpeakerDiarization();

    boolean getEnableWordConfidence();

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

    boolean hasAdaptation();

    boolean hasDiarizationConfig();

    boolean hasMetadata();
}
