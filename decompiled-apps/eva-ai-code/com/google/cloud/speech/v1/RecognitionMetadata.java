package com.google.cloud.speech.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class RecognitionMetadata extends GeneratedMessageV3 implements RecognitionMetadataOrBuilder {
    public static final int AUDIO_TOPIC_FIELD_NUMBER = 10;
    public static final int INDUSTRY_NAICS_CODE_OF_AUDIO_FIELD_NUMBER = 3;
    public static final int INTERACTION_TYPE_FIELD_NUMBER = 1;
    public static final int MICROPHONE_DISTANCE_FIELD_NUMBER = 4;
    public static final int ORIGINAL_MEDIA_TYPE_FIELD_NUMBER = 5;
    public static final int ORIGINAL_MIME_TYPE_FIELD_NUMBER = 8;
    public static final int RECORDING_DEVICE_NAME_FIELD_NUMBER = 7;
    public static final int RECORDING_DEVICE_TYPE_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object audioTopic_;
    private int industryNaicsCodeOfAudio_;
    private int interactionType_;
    private byte memoizedIsInitialized;
    private int microphoneDistance_;
    private int originalMediaType_;
    private volatile Object originalMimeType_;
    private volatile Object recordingDeviceName_;
    private int recordingDeviceType_;
    private static final RecognitionMetadata DEFAULT_INSTANCE = new RecognitionMetadata();
    private static final Parser<RecognitionMetadata> PARSER = new AbstractParser<RecognitionMetadata>() { // from class: com.google.cloud.speech.v1.RecognitionMetadata.1
        @Override // com.google.protobuf.Parser
        public RecognitionMetadata parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RecognitionMetadata(codedInputStream, extensionRegistryLite);
        }
    };

    private RecognitionMetadata(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private RecognitionMetadata() {
        this.memoizedIsInitialized = (byte) -1;
        this.interactionType_ = 0;
        this.microphoneDistance_ = 0;
        this.originalMediaType_ = 0;
        this.recordingDeviceType_ = 0;
        this.recordingDeviceName_ = "";
        this.originalMimeType_ = "";
        this.audioTopic_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RecognitionMetadata();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RecognitionMetadata(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.interactionType_ = codedInputStream.readEnum();
                        } else if (readTag == 24) {
                            this.industryNaicsCodeOfAudio_ = codedInputStream.readUInt32();
                        } else if (readTag == 32) {
                            this.microphoneDistance_ = codedInputStream.readEnum();
                        } else if (readTag == 40) {
                            this.originalMediaType_ = codedInputStream.readEnum();
                        } else if (readTag == 48) {
                            this.recordingDeviceType_ = codedInputStream.readEnum();
                        } else if (readTag == 58) {
                            this.recordingDeviceName_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 66) {
                            this.originalMimeType_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 82) {
                            this.audioTopic_ = codedInputStream.readStringRequireUtf8();
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } finally {
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognitionMetadata.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public enum InteractionType implements ProtocolMessageEnum {
        INTERACTION_TYPE_UNSPECIFIED(0),
        DISCUSSION(1),
        PRESENTATION(2),
        PHONE_CALL(3),
        VOICEMAIL(4),
        PROFESSIONALLY_PRODUCED(5),
        VOICE_SEARCH(6),
        VOICE_COMMAND(7),
        DICTATION(8),
        UNRECOGNIZED(-1);
        
        public static final int DICTATION_VALUE = 8;
        public static final int DISCUSSION_VALUE = 1;
        public static final int INTERACTION_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int PHONE_CALL_VALUE = 3;
        public static final int PRESENTATION_VALUE = 2;
        public static final int PROFESSIONALLY_PRODUCED_VALUE = 5;
        public static final int VOICEMAIL_VALUE = 4;
        public static final int VOICE_COMMAND_VALUE = 7;
        public static final int VOICE_SEARCH_VALUE = 6;
        private final int value;
        private static final Internal.EnumLiteMap<InteractionType> internalValueMap = new Internal.EnumLiteMap<InteractionType>() { // from class: com.google.cloud.speech.v1.RecognitionMetadata.InteractionType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InteractionType findValueByNumber(int i) {
                return InteractionType.forNumber(i);
            }
        };
        private static final InteractionType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static InteractionType valueOf(int i) {
            return forNumber(i);
        }

        public static InteractionType forNumber(int i) {
            switch (i) {
                case 0:
                    return INTERACTION_TYPE_UNSPECIFIED;
                case 1:
                    return DISCUSSION;
                case 2:
                    return PRESENTATION;
                case 3:
                    return PHONE_CALL;
                case 4:
                    return VOICEMAIL;
                case 5:
                    return PROFESSIONALLY_PRODUCED;
                case 6:
                    return VOICE_SEARCH;
                case 7:
                    return VOICE_COMMAND;
                case 8:
                    return DICTATION;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<InteractionType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return RecognitionMetadata.getDescriptor().getEnumTypes().get(0);
        }

        public static InteractionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        InteractionType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes7.dex */
    public enum MicrophoneDistance implements ProtocolMessageEnum {
        MICROPHONE_DISTANCE_UNSPECIFIED(0),
        NEARFIELD(1),
        MIDFIELD(2),
        FARFIELD(3),
        UNRECOGNIZED(-1);
        
        public static final int FARFIELD_VALUE = 3;
        public static final int MICROPHONE_DISTANCE_UNSPECIFIED_VALUE = 0;
        public static final int MIDFIELD_VALUE = 2;
        public static final int NEARFIELD_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<MicrophoneDistance> internalValueMap = new Internal.EnumLiteMap<MicrophoneDistance>() { // from class: com.google.cloud.speech.v1.RecognitionMetadata.MicrophoneDistance.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MicrophoneDistance findValueByNumber(int i) {
                return MicrophoneDistance.forNumber(i);
            }
        };
        private static final MicrophoneDistance[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static MicrophoneDistance valueOf(int i) {
            return forNumber(i);
        }

        public static MicrophoneDistance forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return FARFIELD;
                    }
                    return MIDFIELD;
                }
                return NEARFIELD;
            }
            return MICROPHONE_DISTANCE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<MicrophoneDistance> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return RecognitionMetadata.getDescriptor().getEnumTypes().get(1);
        }

        public static MicrophoneDistance valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        MicrophoneDistance(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes7.dex */
    public enum OriginalMediaType implements ProtocolMessageEnum {
        ORIGINAL_MEDIA_TYPE_UNSPECIFIED(0),
        AUDIO(1),
        VIDEO(2),
        UNRECOGNIZED(-1);
        
        public static final int AUDIO_VALUE = 1;
        public static final int ORIGINAL_MEDIA_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int VIDEO_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<OriginalMediaType> internalValueMap = new Internal.EnumLiteMap<OriginalMediaType>() { // from class: com.google.cloud.speech.v1.RecognitionMetadata.OriginalMediaType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public OriginalMediaType findValueByNumber(int i) {
                return OriginalMediaType.forNumber(i);
            }
        };
        private static final OriginalMediaType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static OriginalMediaType valueOf(int i) {
            return forNumber(i);
        }

        public static OriginalMediaType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return VIDEO;
                }
                return AUDIO;
            }
            return ORIGINAL_MEDIA_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<OriginalMediaType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return RecognitionMetadata.getDescriptor().getEnumTypes().get(2);
        }

        public static OriginalMediaType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        OriginalMediaType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes7.dex */
    public enum RecordingDeviceType implements ProtocolMessageEnum {
        RECORDING_DEVICE_TYPE_UNSPECIFIED(0),
        SMARTPHONE(1),
        PC(2),
        PHONE_LINE(3),
        VEHICLE(4),
        OTHER_OUTDOOR_DEVICE(5),
        OTHER_INDOOR_DEVICE(6),
        UNRECOGNIZED(-1);
        
        public static final int OTHER_INDOOR_DEVICE_VALUE = 6;
        public static final int OTHER_OUTDOOR_DEVICE_VALUE = 5;
        public static final int PC_VALUE = 2;
        public static final int PHONE_LINE_VALUE = 3;
        public static final int RECORDING_DEVICE_TYPE_UNSPECIFIED_VALUE = 0;
        public static final int SMARTPHONE_VALUE = 1;
        public static final int VEHICLE_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<RecordingDeviceType> internalValueMap = new Internal.EnumLiteMap<RecordingDeviceType>() { // from class: com.google.cloud.speech.v1.RecognitionMetadata.RecordingDeviceType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public RecordingDeviceType findValueByNumber(int i) {
                return RecordingDeviceType.forNumber(i);
            }
        };
        private static final RecordingDeviceType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static RecordingDeviceType valueOf(int i) {
            return forNumber(i);
        }

        public static RecordingDeviceType forNumber(int i) {
            switch (i) {
                case 0:
                    return RECORDING_DEVICE_TYPE_UNSPECIFIED;
                case 1:
                    return SMARTPHONE;
                case 2:
                    return PC;
                case 3:
                    return PHONE_LINE;
                case 4:
                    return VEHICLE;
                case 5:
                    return OTHER_OUTDOOR_DEVICE;
                case 6:
                    return OTHER_INDOOR_DEVICE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<RecordingDeviceType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return RecognitionMetadata.getDescriptor().getEnumTypes().get(3);
        }

        public static RecordingDeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        RecordingDeviceType(int i) {
            this.value = i;
        }
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public int getInteractionTypeValue() {
        return this.interactionType_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public InteractionType getInteractionType() {
        InteractionType valueOf = InteractionType.valueOf(this.interactionType_);
        return valueOf == null ? InteractionType.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public int getIndustryNaicsCodeOfAudio() {
        return this.industryNaicsCodeOfAudio_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public int getMicrophoneDistanceValue() {
        return this.microphoneDistance_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public MicrophoneDistance getMicrophoneDistance() {
        MicrophoneDistance valueOf = MicrophoneDistance.valueOf(this.microphoneDistance_);
        return valueOf == null ? MicrophoneDistance.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public int getOriginalMediaTypeValue() {
        return this.originalMediaType_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public OriginalMediaType getOriginalMediaType() {
        OriginalMediaType valueOf = OriginalMediaType.valueOf(this.originalMediaType_);
        return valueOf == null ? OriginalMediaType.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public int getRecordingDeviceTypeValue() {
        return this.recordingDeviceType_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public RecordingDeviceType getRecordingDeviceType() {
        RecordingDeviceType valueOf = RecordingDeviceType.valueOf(this.recordingDeviceType_);
        return valueOf == null ? RecordingDeviceType.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public String getRecordingDeviceName() {
        Object obj = this.recordingDeviceName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.recordingDeviceName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public ByteString getRecordingDeviceNameBytes() {
        Object obj = this.recordingDeviceName_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.recordingDeviceName_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public String getOriginalMimeType() {
        Object obj = this.originalMimeType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.originalMimeType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public ByteString getOriginalMimeTypeBytes() {
        Object obj = this.originalMimeType_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.originalMimeType_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public String getAudioTopic() {
        Object obj = this.audioTopic_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.audioTopic_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
    public ByteString getAudioTopicBytes() {
        Object obj = this.audioTopic_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.audioTopic_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.interactionType_ != InteractionType.INTERACTION_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(1, this.interactionType_);
        }
        int i = this.industryNaicsCodeOfAudio_;
        if (i != 0) {
            codedOutputStream.writeUInt32(3, i);
        }
        if (this.microphoneDistance_ != MicrophoneDistance.MICROPHONE_DISTANCE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.microphoneDistance_);
        }
        if (this.originalMediaType_ != OriginalMediaType.ORIGINAL_MEDIA_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(5, this.originalMediaType_);
        }
        if (this.recordingDeviceType_ != RecordingDeviceType.RECORDING_DEVICE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(6, this.recordingDeviceType_);
        }
        if (!getRecordingDeviceNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.recordingDeviceName_);
        }
        if (!getOriginalMimeTypeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.originalMimeType_);
        }
        if (!getAudioTopicBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.audioTopic_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.interactionType_ != InteractionType.INTERACTION_TYPE_UNSPECIFIED.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.interactionType_) : 0;
        int i2 = this.industryNaicsCodeOfAudio_;
        if (i2 != 0) {
            computeEnumSize += CodedOutputStream.computeUInt32Size(3, i2);
        }
        if (this.microphoneDistance_ != MicrophoneDistance.MICROPHONE_DISTANCE_UNSPECIFIED.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(4, this.microphoneDistance_);
        }
        if (this.originalMediaType_ != OriginalMediaType.ORIGINAL_MEDIA_TYPE_UNSPECIFIED.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(5, this.originalMediaType_);
        }
        if (this.recordingDeviceType_ != RecordingDeviceType.RECORDING_DEVICE_TYPE_UNSPECIFIED.getNumber()) {
            computeEnumSize += CodedOutputStream.computeEnumSize(6, this.recordingDeviceType_);
        }
        if (!getRecordingDeviceNameBytes().isEmpty()) {
            computeEnumSize += GeneratedMessageV3.computeStringSize(7, this.recordingDeviceName_);
        }
        if (!getOriginalMimeTypeBytes().isEmpty()) {
            computeEnumSize += GeneratedMessageV3.computeStringSize(8, this.originalMimeType_);
        }
        if (!getAudioTopicBytes().isEmpty()) {
            computeEnumSize += GeneratedMessageV3.computeStringSize(10, this.audioTopic_);
        }
        int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognitionMetadata)) {
            return super.equals(obj);
        }
        RecognitionMetadata recognitionMetadata = (RecognitionMetadata) obj;
        return this.interactionType_ == recognitionMetadata.interactionType_ && getIndustryNaicsCodeOfAudio() == recognitionMetadata.getIndustryNaicsCodeOfAudio() && this.microphoneDistance_ == recognitionMetadata.microphoneDistance_ && this.originalMediaType_ == recognitionMetadata.originalMediaType_ && this.recordingDeviceType_ == recognitionMetadata.recordingDeviceType_ && getRecordingDeviceName().equals(recognitionMetadata.getRecordingDeviceName()) && getOriginalMimeType().equals(recognitionMetadata.getOriginalMimeType()) && getAudioTopic().equals(recognitionMetadata.getAudioTopic()) && this.unknownFields.equals(recognitionMetadata.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.interactionType_) * 37) + 3) * 53) + getIndustryNaicsCodeOfAudio()) * 37) + 4) * 53) + this.microphoneDistance_) * 37) + 5) * 53) + this.originalMediaType_) * 37) + 6) * 53) + this.recordingDeviceType_) * 37) + 7) * 53) + getRecordingDeviceName().hashCode()) * 37) + 8) * 53) + getOriginalMimeType().hashCode()) * 37) + 10) * 53) + getAudioTopic().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static RecognitionMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RecognitionMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RecognitionMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RecognitionMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RecognitionMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RecognitionMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RecognitionMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RecognitionMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RecognitionMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognitionMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecognitionMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RecognitionMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognitionMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecognitionMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RecognitionMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RecognitionMetadata recognitionMetadata) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(recognitionMetadata);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecognitionMetadataOrBuilder {
        private Object audioTopic_;
        private int industryNaicsCodeOfAudio_;
        private int interactionType_;
        private int microphoneDistance_;
        private int originalMediaType_;
        private Object originalMimeType_;
        private Object recordingDeviceName_;
        private int recordingDeviceType_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognitionMetadata.class, Builder.class);
        }

        private Builder() {
            this.interactionType_ = 0;
            this.microphoneDistance_ = 0;
            this.originalMediaType_ = 0;
            this.recordingDeviceType_ = 0;
            this.recordingDeviceName_ = "";
            this.originalMimeType_ = "";
            this.audioTopic_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.interactionType_ = 0;
            this.microphoneDistance_ = 0;
            this.originalMediaType_ = 0;
            this.recordingDeviceType_ = 0;
            this.recordingDeviceName_ = "";
            this.originalMimeType_ = "";
            this.audioTopic_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = RecognitionMetadata.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.interactionType_ = 0;
            this.industryNaicsCodeOfAudio_ = 0;
            this.microphoneDistance_ = 0;
            this.originalMediaType_ = 0;
            this.recordingDeviceType_ = 0;
            this.recordingDeviceName_ = "";
            this.originalMimeType_ = "";
            this.audioTopic_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionMetadata_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RecognitionMetadata getDefaultInstanceForType() {
            return RecognitionMetadata.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognitionMetadata build() {
            RecognitionMetadata buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognitionMetadata buildPartial() {
            RecognitionMetadata recognitionMetadata = new RecognitionMetadata(this);
            recognitionMetadata.interactionType_ = this.interactionType_;
            recognitionMetadata.industryNaicsCodeOfAudio_ = this.industryNaicsCodeOfAudio_;
            recognitionMetadata.microphoneDistance_ = this.microphoneDistance_;
            recognitionMetadata.originalMediaType_ = this.originalMediaType_;
            recognitionMetadata.recordingDeviceType_ = this.recordingDeviceType_;
            recognitionMetadata.recordingDeviceName_ = this.recordingDeviceName_;
            recognitionMetadata.originalMimeType_ = this.originalMimeType_;
            recognitionMetadata.audioTopic_ = this.audioTopic_;
            onBuilt();
            return recognitionMetadata;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clone() {
            return (Builder) super.clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof RecognitionMetadata) {
                return mergeFrom((RecognitionMetadata) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RecognitionMetadata recognitionMetadata) {
            if (recognitionMetadata == RecognitionMetadata.getDefaultInstance()) {
                return this;
            }
            if (recognitionMetadata.interactionType_ != 0) {
                setInteractionTypeValue(recognitionMetadata.getInteractionTypeValue());
            }
            if (recognitionMetadata.getIndustryNaicsCodeOfAudio() != 0) {
                setIndustryNaicsCodeOfAudio(recognitionMetadata.getIndustryNaicsCodeOfAudio());
            }
            if (recognitionMetadata.microphoneDistance_ != 0) {
                setMicrophoneDistanceValue(recognitionMetadata.getMicrophoneDistanceValue());
            }
            if (recognitionMetadata.originalMediaType_ != 0) {
                setOriginalMediaTypeValue(recognitionMetadata.getOriginalMediaTypeValue());
            }
            if (recognitionMetadata.recordingDeviceType_ != 0) {
                setRecordingDeviceTypeValue(recognitionMetadata.getRecordingDeviceTypeValue());
            }
            if (!recognitionMetadata.getRecordingDeviceName().isEmpty()) {
                this.recordingDeviceName_ = recognitionMetadata.recordingDeviceName_;
                onChanged();
            }
            if (!recognitionMetadata.getOriginalMimeType().isEmpty()) {
                this.originalMimeType_ = recognitionMetadata.originalMimeType_;
                onChanged();
            }
            if (!recognitionMetadata.getAudioTopic().isEmpty()) {
                this.audioTopic_ = recognitionMetadata.audioTopic_;
                onChanged();
            }
            mergeUnknownFields(recognitionMetadata.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            RecognitionMetadata recognitionMetadata = null;
            try {
                try {
                    RecognitionMetadata recognitionMetadata2 = (RecognitionMetadata) RecognitionMetadata.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (recognitionMetadata2 != null) {
                        mergeFrom(recognitionMetadata2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    RecognitionMetadata recognitionMetadata3 = (RecognitionMetadata) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        recognitionMetadata = recognitionMetadata3;
                        if (recognitionMetadata != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (recognitionMetadata != null) {
                    mergeFrom(recognitionMetadata);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public int getInteractionTypeValue() {
            return this.interactionType_;
        }

        public Builder setInteractionTypeValue(int i) {
            this.interactionType_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public InteractionType getInteractionType() {
            InteractionType valueOf = InteractionType.valueOf(this.interactionType_);
            return valueOf == null ? InteractionType.UNRECOGNIZED : valueOf;
        }

        public Builder setInteractionType(InteractionType interactionType) {
            interactionType.getClass();
            this.interactionType_ = interactionType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearInteractionType() {
            this.interactionType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public int getIndustryNaicsCodeOfAudio() {
            return this.industryNaicsCodeOfAudio_;
        }

        public Builder setIndustryNaicsCodeOfAudio(int i) {
            this.industryNaicsCodeOfAudio_ = i;
            onChanged();
            return this;
        }

        public Builder clearIndustryNaicsCodeOfAudio() {
            this.industryNaicsCodeOfAudio_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public int getMicrophoneDistanceValue() {
            return this.microphoneDistance_;
        }

        public Builder setMicrophoneDistanceValue(int i) {
            this.microphoneDistance_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public MicrophoneDistance getMicrophoneDistance() {
            MicrophoneDistance valueOf = MicrophoneDistance.valueOf(this.microphoneDistance_);
            return valueOf == null ? MicrophoneDistance.UNRECOGNIZED : valueOf;
        }

        public Builder setMicrophoneDistance(MicrophoneDistance microphoneDistance) {
            microphoneDistance.getClass();
            this.microphoneDistance_ = microphoneDistance.getNumber();
            onChanged();
            return this;
        }

        public Builder clearMicrophoneDistance() {
            this.microphoneDistance_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public int getOriginalMediaTypeValue() {
            return this.originalMediaType_;
        }

        public Builder setOriginalMediaTypeValue(int i) {
            this.originalMediaType_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public OriginalMediaType getOriginalMediaType() {
            OriginalMediaType valueOf = OriginalMediaType.valueOf(this.originalMediaType_);
            return valueOf == null ? OriginalMediaType.UNRECOGNIZED : valueOf;
        }

        public Builder setOriginalMediaType(OriginalMediaType originalMediaType) {
            originalMediaType.getClass();
            this.originalMediaType_ = originalMediaType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearOriginalMediaType() {
            this.originalMediaType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public int getRecordingDeviceTypeValue() {
            return this.recordingDeviceType_;
        }

        public Builder setRecordingDeviceTypeValue(int i) {
            this.recordingDeviceType_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public RecordingDeviceType getRecordingDeviceType() {
            RecordingDeviceType valueOf = RecordingDeviceType.valueOf(this.recordingDeviceType_);
            return valueOf == null ? RecordingDeviceType.UNRECOGNIZED : valueOf;
        }

        public Builder setRecordingDeviceType(RecordingDeviceType recordingDeviceType) {
            recordingDeviceType.getClass();
            this.recordingDeviceType_ = recordingDeviceType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearRecordingDeviceType() {
            this.recordingDeviceType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public String getRecordingDeviceName() {
            Object obj = this.recordingDeviceName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.recordingDeviceName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public ByteString getRecordingDeviceNameBytes() {
            Object obj = this.recordingDeviceName_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.recordingDeviceName_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setRecordingDeviceName(String str) {
            str.getClass();
            this.recordingDeviceName_ = str;
            onChanged();
            return this;
        }

        public Builder clearRecordingDeviceName() {
            this.recordingDeviceName_ = RecognitionMetadata.getDefaultInstance().getRecordingDeviceName();
            onChanged();
            return this;
        }

        public Builder setRecordingDeviceNameBytes(ByteString byteString) {
            byteString.getClass();
            RecognitionMetadata.checkByteStringIsUtf8(byteString);
            this.recordingDeviceName_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public String getOriginalMimeType() {
            Object obj = this.originalMimeType_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.originalMimeType_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public ByteString getOriginalMimeTypeBytes() {
            Object obj = this.originalMimeType_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.originalMimeType_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setOriginalMimeType(String str) {
            str.getClass();
            this.originalMimeType_ = str;
            onChanged();
            return this;
        }

        public Builder clearOriginalMimeType() {
            this.originalMimeType_ = RecognitionMetadata.getDefaultInstance().getOriginalMimeType();
            onChanged();
            return this;
        }

        public Builder setOriginalMimeTypeBytes(ByteString byteString) {
            byteString.getClass();
            RecognitionMetadata.checkByteStringIsUtf8(byteString);
            this.originalMimeType_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public String getAudioTopic() {
            Object obj = this.audioTopic_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.audioTopic_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1.RecognitionMetadataOrBuilder
        public ByteString getAudioTopicBytes() {
            Object obj = this.audioTopic_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.audioTopic_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setAudioTopic(String str) {
            str.getClass();
            this.audioTopic_ = str;
            onChanged();
            return this;
        }

        public Builder clearAudioTopic() {
            this.audioTopic_ = RecognitionMetadata.getDefaultInstance().getAudioTopic();
            onChanged();
            return this;
        }

        public Builder setAudioTopicBytes(ByteString byteString) {
            byteString.getClass();
            RecognitionMetadata.checkByteStringIsUtf8(byteString);
            this.audioTopic_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static RecognitionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RecognitionMetadata> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RecognitionMetadata> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RecognitionMetadata getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
