package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.RecognitionMetadata;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
/* loaded from: classes7.dex */
public interface RecognitionMetadataOrBuilder extends MessageOrBuilder {
    String getAudioTopic();

    ByteString getAudioTopicBytes();

    int getIndustryNaicsCodeOfAudio();

    RecognitionMetadata.InteractionType getInteractionType();

    int getInteractionTypeValue();

    RecognitionMetadata.MicrophoneDistance getMicrophoneDistance();

    int getMicrophoneDistanceValue();

    RecognitionMetadata.OriginalMediaType getOriginalMediaType();

    int getOriginalMediaTypeValue();

    String getOriginalMimeType();

    ByteString getOriginalMimeTypeBytes();

    String getRecordingDeviceName();

    ByteString getRecordingDeviceNameBytes();

    RecognitionMetadata.RecordingDeviceType getRecordingDeviceType();

    int getRecordingDeviceTypeValue();
}
