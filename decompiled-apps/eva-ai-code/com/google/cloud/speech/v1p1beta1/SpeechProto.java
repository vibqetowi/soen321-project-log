package com.google.cloud.speech.v1p1beta1;

import androidx.exifinterface.media.ExifInterface;
import com.google.api.AnnotationsProto;
import com.google.api.ClientProto;
import com.google.api.FieldBehaviorProto;
import com.google.api.ResourceProto;
import com.google.longrunning.OperationsProto;
import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.google.rpc.StatusProto;
/* loaded from: classes7.dex */
public final class SpeechProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n0google/cloud/speech/v1p1beta1/cloud_speech.proto\u0012\u001dgoogle.cloud.speech.v1p1beta1\u001a\u001cgoogle/api/annotations.proto\u001a\u0017google/api/client.proto\u001a\u001fgoogle/api/field_behavior.proto\u001a\u0019google/api/resource.proto\u001a,google/cloud/speech/v1p1beta1/resource.proto\u001a#google/longrunning/operations.proto\u001a\u0019google/protobuf/any.proto\u001a\u001egoogle/protobuf/duration.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u0017google/rpc/status.proto\"\u009e\u0001\n\u0010RecognizeRequest\u0012E\n\u0006config\u0018\u0001 \u0001(\u000b20.google.cloud.speech.v1p1beta1.RecognitionConfigB\u0003àA\u0002\u0012C\n\u0005audio\u0018\u0002 \u0001(\u000b2/.google.cloud.speech.v1p1beta1.RecognitionAudioB\u0003àA\u0002\"©\u0001\n\u001bLongRunningRecognizeRequest\u0012E\n\u0006config\u0018\u0001 \u0001(\u000b20.google.cloud.speech.v1p1beta1.RecognitionConfigB\u0003àA\u0002\u0012C\n\u0005audio\u0018\u0002 \u0001(\u000b2/.google.cloud.speech.v1p1beta1.RecognitionAudioB\u0003àA\u0002\" \u0001\n\u0019StreamingRecognizeRequest\u0012U\n\u0010streaming_config\u0018\u0001 \u0001(\u000b29.google.cloud.speech.v1p1beta1.StreamingRecognitionConfigH\u0000\u0012\u0017\n\raudio_content\u0018\u0002 \u0001(\fH\u0000B\u0013\n\u0011streaming_request\"\u0096\u0001\n\u001aStreamingRecognitionConfig\u0012E\n\u0006config\u0018\u0001 \u0001(\u000b20.google.cloud.speech.v1p1beta1.RecognitionConfigB\u0003àA\u0002\u0012\u0018\n\u0010single_utterance\u0018\u0002 \u0001(\b\u0012\u0017\n\u000finterim_results\u0018\u0003 \u0001(\b\"Ü\u0007\n\u0011RecognitionConfig\u0012P\n\bencoding\u0018\u0001 \u0001(\u000e2>.google.cloud.speech.v1p1beta1.RecognitionConfig.AudioEncoding\u0012\u0019\n\u0011sample_rate_hertz\u0018\u0002 \u0001(\u0005\u0012\u001b\n\u0013audio_channel_count\u0018\u0007 \u0001(\u0005\u0012/\n'enable_separate_recognition_per_channel\u0018\f \u0001(\b\u0012\u001a\n\rlanguage_code\u0018\u0003 \u0001(\tB\u0003àA\u0002\u0012\"\n\u001aalternative_language_codes\u0018\u0012 \u0003(\t\u0012\u0018\n\u0010max_alternatives\u0018\u0004 \u0001(\u0005\u0012\u0018\n\u0010profanity_filter\u0018\u0005 \u0001(\b\u0012C\n\nadaptation\u0018\u0014 \u0001(\u000b2/.google.cloud.speech.v1p1beta1.SpeechAdaptation\u0012E\n\u000fspeech_contexts\u0018\u0006 \u0003(\u000b2,.google.cloud.speech.v1p1beta1.SpeechContext\u0012 \n\u0018enable_word_time_offsets\u0018\b \u0001(\b\u0012\u001e\n\u0016enable_word_confidence\u0018\u000f \u0001(\b\u0012$\n\u001cenable_automatic_punctuation\u0018\u000b \u0001(\b\u0012&\n\u001aenable_speaker_diarization\u0018\u0010 \u0001(\bB\u0002\u0018\u0001\u0012%\n\u0019diarization_speaker_count\u0018\u0011 \u0001(\u0005B\u0002\u0018\u0001\u0012S\n\u0012diarization_config\u0018\u0013 \u0001(\u000b27.google.cloud.speech.v1p1beta1.SpeakerDiarizationConfig\u0012D\n\bmetadata\u0018\t \u0001(\u000b22.google.cloud.speech.v1p1beta1.RecognitionMetadata\u0012\r\n\u0005model\u0018\r \u0001(\t\u0012\u0014\n\fuse_enhanced\u0018\u000e \u0001(\b\"\u0094\u0001\n\rAudioEncoding\u0012\u0018\n\u0014ENCODING_UNSPECIFIED\u0010\u0000\u0012\f\n\bLINEAR16\u0010\u0001\u0012\b\n\u0004FLAC\u0010\u0002\u0012\t\n\u0005MULAW\u0010\u0003\u0012\u0007\n\u0003AMR\u0010\u0004\u0012\n\n\u0006AMR_WB\u0010\u0005\u0012\f\n\bOGG_OPUS\u0010\u0006\u0012\u001a\n\u0016SPEEX_WITH_HEADER_BYTE\u0010\u0007\u0012\u0007\n\u0003MP3\u0010\b\"\u0090\u0001\n\u0018SpeakerDiarizationConfig\u0012\"\n\u001aenable_speaker_diarization\u0018\u0001 \u0001(\b\u0012\u0019\n\u0011min_speaker_count\u0018\u0002 \u0001(\u0005\u0012\u0019\n\u0011max_speaker_count\u0018\u0003 \u0001(\u0005\u0012\u001a\n\u000bspeaker_tag\u0018\u0005 \u0001(\u0005B\u0005\u0018\u0001àA\u0003\"×\b\n\u0013RecognitionMetadata\u0012\\\n\u0010interaction_type\u0018\u0001 \u0001(\u000e2B.google.cloud.speech.v1p1beta1.RecognitionMetadata.InteractionType\u0012$\n\u001cindustry_naics_code_of_audio\u0018\u0003 \u0001(\r\u0012b\n\u0013microphone_distance\u0018\u0004 \u0001(\u000e2E.google.cloud.speech.v1p1beta1.RecognitionMetadata.MicrophoneDistance\u0012a\n\u0013original_media_type\u0018\u0005 \u0001(\u000e2D.google.cloud.speech.v1p1beta1.RecognitionMetadata.OriginalMediaType\u0012e\n\u0015recording_device_type\u0018\u0006 \u0001(\u000e2F.google.cloud.speech.v1p1beta1.RecognitionMetadata.RecordingDeviceType\u0012\u001d\n\u0015recording_device_name\u0018\u0007 \u0001(\t\u0012\u001a\n\u0012original_mime_type\u0018\b \u0001(\t\u0012\u0019\n\robfuscated_id\u0018\t \u0001(\u0003B\u0002\u0018\u0001\u0012\u0013\n\u000baudio_topic\u0018\n \u0001(\t\"Å\u0001\n\u000fInteractionType\u0012 \n\u001cINTERACTION_TYPE_UNSPECIFIED\u0010\u0000\u0012\u000e\n\nDISCUSSION\u0010\u0001\u0012\u0010\n\fPRESENTATION\u0010\u0002\u0012\u000e\n\nPHONE_CALL\u0010\u0003\u0012\r\n\tVOICEMAIL\u0010\u0004\u0012\u001b\n\u0017PROFESSIONALLY_PRODUCED\u0010\u0005\u0012\u0010\n\fVOICE_SEARCH\u0010\u0006\u0012\u0011\n\rVOICE_COMMAND\u0010\u0007\u0012\r\n\tDICTATION\u0010\b\"d\n\u0012MicrophoneDistance\u0012#\n\u001fMICROPHONE_DISTANCE_UNSPECIFIED\u0010\u0000\u0012\r\n\tNEARFIELD\u0010\u0001\u0012\f\n\bMIDFIELD\u0010\u0002\u0012\f\n\bFARFIELD\u0010\u0003\"N\n\u0011OriginalMediaType\u0012#\n\u001fORIGINAL_MEDIA_TYPE_UNSPECIFIED\u0010\u0000\u0012\t\n\u0005AUDIO\u0010\u0001\u0012\t\n\u0005VIDEO\u0010\u0002\"¤\u0001\n\u0013RecordingDeviceType\u0012%\n!RECORDING_DEVICE_TYPE_UNSPECIFIED\u0010\u0000\u0012\u000e\n\nSMARTPHONE\u0010\u0001\u0012\u0006\n\u0002PC\u0010\u0002\u0012\u000e\n\nPHONE_LINE\u0010\u0003\u0012\u000b\n\u0007VEHICLE\u0010\u0004\u0012\u0018\n\u0014OTHER_OUTDOOR_DEVICE\u0010\u0005\u0012\u0017\n\u0013OTHER_INDOOR_DEVICE\u0010\u0006\"/\n\rSpeechContext\u0012\u000f\n\u0007phrases\u0018\u0001 \u0003(\t\u0012\r\n\u0005boost\u0018\u0004 \u0001(\u0002\"D\n\u0010RecognitionAudio\u0012\u0011\n\u0007content\u0018\u0001 \u0001(\fH\u0000\u0012\r\n\u0003uri\u0018\u0002 \u0001(\tH\u0000B\u000e\n\faudio_source\"\\\n\u0011RecognizeResponse\u0012G\n\u0007results\u0018\u0002 \u0003(\u000b26.google.cloud.speech.v1p1beta1.SpeechRecognitionResult\"g\n\u001cLongRunningRecognizeResponse\u0012G\n\u0007results\u0018\u0002 \u0003(\u000b26.google.cloud.speech.v1p1beta1.SpeechRecognitionResult\"°\u0001\n\u001cLongRunningRecognizeMetadata\u0012\u0018\n\u0010progress_percent\u0018\u0001 \u0001(\u0005\u0012.\n\nstart_time\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u00124\n\u0010last_update_time\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0010\n\u0003uri\u0018\u0004 \u0001(\tB\u0003àA\u0003\"¿\u0002\n\u001aStreamingRecognizeResponse\u0012!\n\u0005error\u0018\u0001 \u0001(\u000b2\u0012.google.rpc.Status\u0012J\n\u0007results\u0018\u0002 \u0003(\u000b29.google.cloud.speech.v1p1beta1.StreamingRecognitionResult\u0012d\n\u0011speech_event_type\u0018\u0004 \u0001(\u000e2I.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse.SpeechEventType\"L\n\u000fSpeechEventType\u0012\u001c\n\u0018SPEECH_EVENT_UNSPECIFIED\u0010\u0000\u0012\u001b\n\u0017END_OF_SINGLE_UTTERANCE\u0010\u0001\"ù\u0001\n\u001aStreamingRecognitionResult\u0012Q\n\falternatives\u0018\u0001 \u0003(\u000b2;.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative\u0012\u0010\n\bis_final\u0018\u0002 \u0001(\b\u0012\u0011\n\tstability\u0018\u0003 \u0001(\u0002\u00122\n\u000fresult_end_time\u0018\u0004 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012\u0013\n\u000bchannel_tag\u0018\u0005 \u0001(\u0005\u0012\u001a\n\rlanguage_code\u0018\u0006 \u0001(\tB\u0003àA\u0003\"\u009d\u0001\n\u0017SpeechRecognitionResult\u0012Q\n\falternatives\u0018\u0001 \u0003(\u000b2;.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative\u0012\u0013\n\u000bchannel_tag\u0018\u0002 \u0001(\u0005\u0012\u001a\n\rlanguage_code\u0018\u0005 \u0001(\tB\u0003àA\u0003\"~\n\u001cSpeechRecognitionAlternative\u0012\u0012\n\ntranscript\u0018\u0001 \u0001(\t\u0012\u0012\n\nconfidence\u0018\u0002 \u0001(\u0002\u00126\n\u0005words\u0018\u0003 \u0003(\u000b2'.google.cloud.speech.v1p1beta1.WordInfo\"¢\u0001\n\bWordInfo\u0012-\n\nstart_time\u0018\u0001 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012+\n\bend_time\u0018\u0002 \u0001(\u000b2\u0019.google.protobuf.Duration\u0012\f\n\u0004word\u0018\u0003 \u0001(\t\u0012\u0012\n\nconfidence\u0018\u0004 \u0001(\u0002\u0012\u0018\n\u000bspeaker_tag\u0018\u0005 \u0001(\u0005B\u0003àA\u00032\u0082\u0005\n\u0006Speech\u0012¥\u0001\n\tRecognize\u0012/.google.cloud.speech.v1p1beta1.RecognizeRequest\u001a0.google.cloud.speech.v1p1beta1.RecognizeResponse\"5\u0082Óä\u0093\u0002 \"\u001b/v1p1beta1/speech:recognize:\u0001*ÚA\fconfig,audio\u0012ò\u0001\n\u0014LongRunningRecognize\u0012:.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest\u001a\u001d.google.longrunning.Operation\"\u007f\u0082Óä\u0093\u0002+\"&/v1p1beta1/speech:longrunningrecognize:\u0001*ÚA\fconfig,audioÊA<\n\u001cLongRunningRecognizeResponse\u0012\u001cLongRunningRecognizeMetadata\u0012\u008f\u0001\n\u0012StreamingRecognize\u00128.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest\u001a9.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse\"\u0000(\u00010\u0001\u001aIÊA\u0015speech.googleapis.comÒA.https://www.googleapis.com/auth/cloud-platformB\u0080\u0001\n!com.google.cloud.speech.v1p1beta1B\u000bSpeechProtoP\u0001ZCgoogle.golang.org/genproto/googleapis/cloud/speech/v1p1beta1;speechø\u0001\u0001¢\u0002\u0003GCSb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnnotationsProto.getDescriptor(), ClientProto.getDescriptor(), FieldBehaviorProto.getDescriptor(), ResourceProto.getDescriptor(), SpeechResourceProto.getDescriptor(), OperationsProto.getDescriptor(), AnyProto.getDescriptor(), DurationProto.getDescriptor(), TimestampProto.getDescriptor(), StatusProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_RecognitionMetadata_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_RecognitionMetadata_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_SpeechContext_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_SpeechContext_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_google_cloud_speech_v1p1beta1_WordInfo_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private SpeechProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_descriptor = descriptor2;
        internal_static_google_cloud_speech_v1p1beta1_RecognizeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Config", "Audio"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_descriptor = descriptor3;
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Config", "Audio"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_descriptor = descriptor4;
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"StreamingConfig", "AudioContent", "StreamingRequest"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_descriptor = descriptor5;
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Config", "SingleUtterance", "InterimResults"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_descriptor = descriptor6;
        internal_static_google_cloud_speech_v1p1beta1_RecognitionConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Encoding", "SampleRateHertz", "AudioChannelCount", "EnableSeparateRecognitionPerChannel", "LanguageCode", "AlternativeLanguageCodes", "MaxAlternatives", "ProfanityFilter", "Adaptation", "SpeechContexts", "EnableWordTimeOffsets", "EnableWordConfidence", "EnableAutomaticPunctuation", "EnableSpeakerDiarization", "DiarizationSpeakerCount", "DiarizationConfig", "Metadata", ExifInterface.TAG_MODEL, "UseEnhanced"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_descriptor = descriptor7;
        internal_static_google_cloud_speech_v1p1beta1_SpeakerDiarizationConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"EnableSpeakerDiarization", "MinSpeakerCount", "MaxSpeakerCount", "SpeakerTag"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_google_cloud_speech_v1p1beta1_RecognitionMetadata_descriptor = descriptor8;
        internal_static_google_cloud_speech_v1p1beta1_RecognitionMetadata_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"InteractionType", "IndustryNaicsCodeOfAudio", "MicrophoneDistance", "OriginalMediaType", "RecordingDeviceType", "RecordingDeviceName", "OriginalMimeType", "ObfuscatedId", "AudioTopic"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_google_cloud_speech_v1p1beta1_SpeechContext_descriptor = descriptor9;
        internal_static_google_cloud_speech_v1p1beta1_SpeechContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Phrases", "Boost"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor = descriptor10;
        internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Content", "Uri", "AudioSource"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor = descriptor11;
        internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Results"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_descriptor = descriptor12;
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Results"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor = descriptor13;
        internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"ProgressPercent", "StartTime", "LastUpdateTime", "Uri"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_descriptor = descriptor14;
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognizeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Error", "Results", "SpeechEventType"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor = descriptor15;
        internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Alternatives", "IsFinal", "Stability", "ResultEndTime", "ChannelTag", "LanguageCode"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_descriptor = descriptor16;
        internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Alternatives", "ChannelTag", "LanguageCode"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_descriptor = descriptor17;
        internal_static_google_cloud_speech_v1p1beta1_SpeechRecognitionAlternative_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Transcript", "Confidence", "Words"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor = descriptor18;
        internal_static_google_cloud_speech_v1p1beta1_WordInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"StartTime", "EndTime", "Word", "Confidence", "SpeakerTag"});
        ExtensionRegistry newInstance = ExtensionRegistry.newInstance();
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.defaultHost);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) FieldBehaviorProto.fieldBehavior);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) AnnotationsProto.http);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.methodSignature);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) ClientProto.oauthScopes);
        newInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) OperationsProto.operationInfo);
        Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, newInstance);
        AnnotationsProto.getDescriptor();
        ClientProto.getDescriptor();
        FieldBehaviorProto.getDescriptor();
        ResourceProto.getDescriptor();
        SpeechResourceProto.getDescriptor();
        OperationsProto.getDescriptor();
        AnyProto.getDescriptor();
        DurationProto.getDescriptor();
        TimestampProto.getDescriptor();
        StatusProto.getDescriptor();
    }
}
