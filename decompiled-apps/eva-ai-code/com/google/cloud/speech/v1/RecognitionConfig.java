package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.RecognitionMetadata;
import com.google.cloud.speech.v1.SpeakerDiarizationConfig;
import com.google.cloud.speech.v1.SpeechContext;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class RecognitionConfig extends GeneratedMessageV3 implements RecognitionConfigOrBuilder {
    public static final int AUDIO_CHANNEL_COUNT_FIELD_NUMBER = 7;
    public static final int DIARIZATION_CONFIG_FIELD_NUMBER = 19;
    public static final int ENABLE_AUTOMATIC_PUNCTUATION_FIELD_NUMBER = 11;
    public static final int ENABLE_SEPARATE_RECOGNITION_PER_CHANNEL_FIELD_NUMBER = 12;
    public static final int ENABLE_WORD_TIME_OFFSETS_FIELD_NUMBER = 8;
    public static final int ENCODING_FIELD_NUMBER = 1;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int MAX_ALTERNATIVES_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 9;
    public static final int MODEL_FIELD_NUMBER = 13;
    public static final int PROFANITY_FILTER_FIELD_NUMBER = 5;
    public static final int SAMPLE_RATE_HERTZ_FIELD_NUMBER = 2;
    public static final int SPEECH_CONTEXTS_FIELD_NUMBER = 6;
    public static final int USE_ENHANCED_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    private int audioChannelCount_;
    private SpeakerDiarizationConfig diarizationConfig_;
    private boolean enableAutomaticPunctuation_;
    private boolean enableSeparateRecognitionPerChannel_;
    private boolean enableWordTimeOffsets_;
    private int encoding_;
    private volatile Object languageCode_;
    private int maxAlternatives_;
    private byte memoizedIsInitialized;
    private RecognitionMetadata metadata_;
    private volatile Object model_;
    private boolean profanityFilter_;
    private int sampleRateHertz_;
    private List<SpeechContext> speechContexts_;
    private boolean useEnhanced_;
    private static final RecognitionConfig DEFAULT_INSTANCE = new RecognitionConfig();
    private static final Parser<RecognitionConfig> PARSER = new AbstractParser<RecognitionConfig>() { // from class: com.google.cloud.speech.v1.RecognitionConfig.1
        @Override // com.google.protobuf.Parser
        public RecognitionConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RecognitionConfig(codedInputStream, extensionRegistryLite);
        }
    };

    private RecognitionConfig(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private RecognitionConfig() {
        this.memoizedIsInitialized = (byte) -1;
        this.encoding_ = 0;
        this.languageCode_ = "";
        this.speechContexts_ = Collections.emptyList();
        this.model_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RecognitionConfig();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RecognitionConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                break;
                            case 8:
                                this.encoding_ = codedInputStream.readEnum();
                                continue;
                            case 16:
                                this.sampleRateHertz_ = codedInputStream.readInt32();
                                continue;
                            case 26:
                                this.languageCode_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 32:
                                this.maxAlternatives_ = codedInputStream.readInt32();
                                continue;
                            case 40:
                                this.profanityFilter_ = codedInputStream.readBool();
                                continue;
                            case 50:
                                boolean z3 = (z2 ? 1 : 0) & true;
                                z2 = z2;
                                if (!z3) {
                                    this.speechContexts_ = new ArrayList();
                                    z2 = (z2 ? 1 : 0) | true;
                                }
                                this.speechContexts_.add(codedInputStream.readMessage(SpeechContext.parser(), extensionRegistryLite));
                                continue;
                            case 56:
                                this.audioChannelCount_ = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.enableWordTimeOffsets_ = codedInputStream.readBool();
                                continue;
                            case 74:
                                RecognitionMetadata recognitionMetadata = this.metadata_;
                                RecognitionMetadata.Builder builder = recognitionMetadata != null ? recognitionMetadata.toBuilder() : null;
                                RecognitionMetadata recognitionMetadata2 = (RecognitionMetadata) codedInputStream.readMessage(RecognitionMetadata.parser(), extensionRegistryLite);
                                this.metadata_ = recognitionMetadata2;
                                if (builder != null) {
                                    builder.mergeFrom(recognitionMetadata2);
                                    this.metadata_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 88:
                                this.enableAutomaticPunctuation_ = codedInputStream.readBool();
                                continue;
                            case 96:
                                this.enableSeparateRecognitionPerChannel_ = codedInputStream.readBool();
                                continue;
                            case 106:
                                this.model_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 112:
                                this.useEnhanced_ = codedInputStream.readBool();
                                continue;
                            case 154:
                                SpeakerDiarizationConfig speakerDiarizationConfig = this.diarizationConfig_;
                                SpeakerDiarizationConfig.Builder builder2 = speakerDiarizationConfig != null ? speakerDiarizationConfig.toBuilder() : null;
                                SpeakerDiarizationConfig speakerDiarizationConfig2 = (SpeakerDiarizationConfig) codedInputStream.readMessage(SpeakerDiarizationConfig.parser(), extensionRegistryLite);
                                this.diarizationConfig_ = speakerDiarizationConfig2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(speakerDiarizationConfig2);
                                    this.diarizationConfig_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } finally {
                if ((z2 ? 1 : 0) & true) {
                    this.speechContexts_ = Collections.unmodifiableList(this.speechContexts_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognitionConfig.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public enum AudioEncoding implements ProtocolMessageEnum {
        ENCODING_UNSPECIFIED(0),
        LINEAR16(1),
        FLAC(2),
        MULAW(3),
        AMR(4),
        AMR_WB(5),
        OGG_OPUS(6),
        SPEEX_WITH_HEADER_BYTE(7),
        UNRECOGNIZED(-1);
        
        public static final int AMR_VALUE = 4;
        public static final int AMR_WB_VALUE = 5;
        public static final int ENCODING_UNSPECIFIED_VALUE = 0;
        public static final int FLAC_VALUE = 2;
        public static final int LINEAR16_VALUE = 1;
        public static final int MULAW_VALUE = 3;
        public static final int OGG_OPUS_VALUE = 6;
        public static final int SPEEX_WITH_HEADER_BYTE_VALUE = 7;
        private final int value;
        private static final Internal.EnumLiteMap<AudioEncoding> internalValueMap = new Internal.EnumLiteMap<AudioEncoding>() { // from class: com.google.cloud.speech.v1.RecognitionConfig.AudioEncoding.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AudioEncoding findValueByNumber(int i) {
                return AudioEncoding.forNumber(i);
            }
        };
        private static final AudioEncoding[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static AudioEncoding valueOf(int i) {
            return forNumber(i);
        }

        public static AudioEncoding forNumber(int i) {
            switch (i) {
                case 0:
                    return ENCODING_UNSPECIFIED;
                case 1:
                    return LINEAR16;
                case 2:
                    return FLAC;
                case 3:
                    return MULAW;
                case 4:
                    return AMR;
                case 5:
                    return AMR_WB;
                case 6:
                    return OGG_OPUS;
                case 7:
                    return SPEEX_WITH_HEADER_BYTE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<AudioEncoding> internalGetValueMap() {
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
            return RecognitionConfig.getDescriptor().getEnumTypes().get(0);
        }

        public static AudioEncoding valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        AudioEncoding(int i) {
            this.value = i;
        }
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public int getEncodingValue() {
        return this.encoding_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public AudioEncoding getEncoding() {
        AudioEncoding valueOf = AudioEncoding.valueOf(this.encoding_);
        return valueOf == null ? AudioEncoding.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public int getSampleRateHertz() {
        return this.sampleRateHertz_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public int getAudioChannelCount() {
        return this.audioChannelCount_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean getEnableSeparateRecognitionPerChannel() {
        return this.enableSeparateRecognitionPerChannel_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public String getLanguageCode() {
        Object obj = this.languageCode_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.languageCode_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public ByteString getLanguageCodeBytes() {
        Object obj = this.languageCode_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.languageCode_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public int getMaxAlternatives() {
        return this.maxAlternatives_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean getProfanityFilter() {
        return this.profanityFilter_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public List<SpeechContext> getSpeechContextsList() {
        return this.speechContexts_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public List<? extends SpeechContextOrBuilder> getSpeechContextsOrBuilderList() {
        return this.speechContexts_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public int getSpeechContextsCount() {
        return this.speechContexts_.size();
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public SpeechContext getSpeechContexts(int i) {
        return this.speechContexts_.get(i);
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public SpeechContextOrBuilder getSpeechContextsOrBuilder(int i) {
        return this.speechContexts_.get(i);
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean getEnableWordTimeOffsets() {
        return this.enableWordTimeOffsets_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean getEnableAutomaticPunctuation() {
        return this.enableAutomaticPunctuation_;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean hasDiarizationConfig() {
        return this.diarizationConfig_ != null;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public SpeakerDiarizationConfig getDiarizationConfig() {
        SpeakerDiarizationConfig speakerDiarizationConfig = this.diarizationConfig_;
        return speakerDiarizationConfig == null ? SpeakerDiarizationConfig.getDefaultInstance() : speakerDiarizationConfig;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public SpeakerDiarizationConfigOrBuilder getDiarizationConfigOrBuilder() {
        return getDiarizationConfig();
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public RecognitionMetadata getMetadata() {
        RecognitionMetadata recognitionMetadata = this.metadata_;
        return recognitionMetadata == null ? RecognitionMetadata.getDefaultInstance() : recognitionMetadata;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public RecognitionMetadataOrBuilder getMetadataOrBuilder() {
        return getMetadata();
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public String getModel() {
        Object obj = this.model_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.model_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public ByteString getModelBytes() {
        Object obj = this.model_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.model_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
    public boolean getUseEnhanced() {
        return this.useEnhanced_;
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
        if (this.encoding_ != AudioEncoding.ENCODING_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(1, this.encoding_);
        }
        int i = this.sampleRateHertz_;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        if (!getLanguageCodeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.languageCode_);
        }
        int i2 = this.maxAlternatives_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        boolean z = this.profanityFilter_;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        for (int i3 = 0; i3 < this.speechContexts_.size(); i3++) {
            codedOutputStream.writeMessage(6, this.speechContexts_.get(i3));
        }
        int i4 = this.audioChannelCount_;
        if (i4 != 0) {
            codedOutputStream.writeInt32(7, i4);
        }
        boolean z2 = this.enableWordTimeOffsets_;
        if (z2) {
            codedOutputStream.writeBool(8, z2);
        }
        if (this.metadata_ != null) {
            codedOutputStream.writeMessage(9, getMetadata());
        }
        boolean z3 = this.enableAutomaticPunctuation_;
        if (z3) {
            codedOutputStream.writeBool(11, z3);
        }
        boolean z4 = this.enableSeparateRecognitionPerChannel_;
        if (z4) {
            codedOutputStream.writeBool(12, z4);
        }
        if (!getModelBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.model_);
        }
        boolean z5 = this.useEnhanced_;
        if (z5) {
            codedOutputStream.writeBool(14, z5);
        }
        if (this.diarizationConfig_ != null) {
            codedOutputStream.writeMessage(19, getDiarizationConfig());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeEnumSize = this.encoding_ != AudioEncoding.ENCODING_UNSPECIFIED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.encoding_) + 0 : 0;
        int i2 = this.sampleRateHertz_;
        if (i2 != 0) {
            computeEnumSize += CodedOutputStream.computeInt32Size(2, i2);
        }
        if (!getLanguageCodeBytes().isEmpty()) {
            computeEnumSize += GeneratedMessageV3.computeStringSize(3, this.languageCode_);
        }
        int i3 = this.maxAlternatives_;
        if (i3 != 0) {
            computeEnumSize += CodedOutputStream.computeInt32Size(4, i3);
        }
        boolean z = this.profanityFilter_;
        if (z) {
            computeEnumSize += CodedOutputStream.computeBoolSize(5, z);
        }
        for (int i4 = 0; i4 < this.speechContexts_.size(); i4++) {
            computeEnumSize += CodedOutputStream.computeMessageSize(6, this.speechContexts_.get(i4));
        }
        int i5 = this.audioChannelCount_;
        if (i5 != 0) {
            computeEnumSize += CodedOutputStream.computeInt32Size(7, i5);
        }
        boolean z2 = this.enableWordTimeOffsets_;
        if (z2) {
            computeEnumSize += CodedOutputStream.computeBoolSize(8, z2);
        }
        if (this.metadata_ != null) {
            computeEnumSize += CodedOutputStream.computeMessageSize(9, getMetadata());
        }
        boolean z3 = this.enableAutomaticPunctuation_;
        if (z3) {
            computeEnumSize += CodedOutputStream.computeBoolSize(11, z3);
        }
        boolean z4 = this.enableSeparateRecognitionPerChannel_;
        if (z4) {
            computeEnumSize += CodedOutputStream.computeBoolSize(12, z4);
        }
        if (!getModelBytes().isEmpty()) {
            computeEnumSize += GeneratedMessageV3.computeStringSize(13, this.model_);
        }
        boolean z5 = this.useEnhanced_;
        if (z5) {
            computeEnumSize += CodedOutputStream.computeBoolSize(14, z5);
        }
        if (this.diarizationConfig_ != null) {
            computeEnumSize += CodedOutputStream.computeMessageSize(19, getDiarizationConfig());
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
        if (!(obj instanceof RecognitionConfig)) {
            return super.equals(obj);
        }
        RecognitionConfig recognitionConfig = (RecognitionConfig) obj;
        if (this.encoding_ == recognitionConfig.encoding_ && getSampleRateHertz() == recognitionConfig.getSampleRateHertz() && getAudioChannelCount() == recognitionConfig.getAudioChannelCount() && getEnableSeparateRecognitionPerChannel() == recognitionConfig.getEnableSeparateRecognitionPerChannel() && getLanguageCode().equals(recognitionConfig.getLanguageCode()) && getMaxAlternatives() == recognitionConfig.getMaxAlternatives() && getProfanityFilter() == recognitionConfig.getProfanityFilter() && getSpeechContextsList().equals(recognitionConfig.getSpeechContextsList()) && getEnableWordTimeOffsets() == recognitionConfig.getEnableWordTimeOffsets() && getEnableAutomaticPunctuation() == recognitionConfig.getEnableAutomaticPunctuation() && hasDiarizationConfig() == recognitionConfig.hasDiarizationConfig()) {
            if ((!hasDiarizationConfig() || getDiarizationConfig().equals(recognitionConfig.getDiarizationConfig())) && hasMetadata() == recognitionConfig.hasMetadata()) {
                return (!hasMetadata() || getMetadata().equals(recognitionConfig.getMetadata())) && getModel().equals(recognitionConfig.getModel()) && getUseEnhanced() == recognitionConfig.getUseEnhanced() && this.unknownFields.equals(recognitionConfig.unknownFields);
            }
            return false;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.encoding_) * 37) + 2) * 53) + getSampleRateHertz()) * 37) + 7) * 53) + getAudioChannelCount()) * 37) + 12) * 53) + Internal.hashBoolean(getEnableSeparateRecognitionPerChannel())) * 37) + 3) * 53) + getLanguageCode().hashCode()) * 37) + 4) * 53) + getMaxAlternatives()) * 37) + 5) * 53) + Internal.hashBoolean(getProfanityFilter());
        if (getSpeechContextsCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getSpeechContextsList().hashCode();
        }
        int hashBoolean = (((((((hashCode * 37) + 8) * 53) + Internal.hashBoolean(getEnableWordTimeOffsets())) * 37) + 11) * 53) + Internal.hashBoolean(getEnableAutomaticPunctuation());
        if (hasDiarizationConfig()) {
            hashBoolean = (((hashBoolean * 37) + 19) * 53) + getDiarizationConfig().hashCode();
        }
        if (hasMetadata()) {
            hashBoolean = (((hashBoolean * 37) + 9) * 53) + getMetadata().hashCode();
        }
        int hashCode2 = (((((((((hashBoolean * 37) + 13) * 53) + getModel().hashCode()) * 37) + 14) * 53) + Internal.hashBoolean(getUseEnhanced())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static RecognitionConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RecognitionConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RecognitionConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RecognitionConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RecognitionConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RecognitionConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RecognitionConfig parseFrom(InputStream inputStream) throws IOException {
        return (RecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RecognitionConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognitionConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecognitionConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RecognitionConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognitionConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RecognitionConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RecognitionConfig recognitionConfig) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(recognitionConfig);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecognitionConfigOrBuilder {
        private int audioChannelCount_;
        private int bitField0_;
        private SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> diarizationConfigBuilder_;
        private SpeakerDiarizationConfig diarizationConfig_;
        private boolean enableAutomaticPunctuation_;
        private boolean enableSeparateRecognitionPerChannel_;
        private boolean enableWordTimeOffsets_;
        private int encoding_;
        private Object languageCode_;
        private int maxAlternatives_;
        private SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> metadataBuilder_;
        private RecognitionMetadata metadata_;
        private Object model_;
        private boolean profanityFilter_;
        private int sampleRateHertz_;
        private RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> speechContextsBuilder_;
        private List<SpeechContext> speechContexts_;
        private boolean useEnhanced_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognitionConfig.class, Builder.class);
        }

        private Builder() {
            this.encoding_ = 0;
            this.languageCode_ = "";
            this.speechContexts_ = Collections.emptyList();
            this.model_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.encoding_ = 0;
            this.languageCode_ = "";
            this.speechContexts_ = Collections.emptyList();
            this.model_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (RecognitionConfig.alwaysUseFieldBuilders) {
                getSpeechContextsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.encoding_ = 0;
            this.sampleRateHertz_ = 0;
            this.audioChannelCount_ = 0;
            this.enableSeparateRecognitionPerChannel_ = false;
            this.languageCode_ = "";
            this.maxAlternatives_ = 0;
            this.profanityFilter_ = false;
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.speechContexts_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.enableWordTimeOffsets_ = false;
            this.enableAutomaticPunctuation_ = false;
            if (this.diarizationConfigBuilder_ == null) {
                this.diarizationConfig_ = null;
            } else {
                this.diarizationConfig_ = null;
                this.diarizationConfigBuilder_ = null;
            }
            if (this.metadataBuilder_ == null) {
                this.metadata_ = null;
            } else {
                this.metadata_ = null;
                this.metadataBuilder_ = null;
            }
            this.model_ = "";
            this.useEnhanced_ = false;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognitionConfig_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RecognitionConfig getDefaultInstanceForType() {
            return RecognitionConfig.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognitionConfig build() {
            RecognitionConfig buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognitionConfig buildPartial() {
            RecognitionConfig recognitionConfig = new RecognitionConfig(this);
            recognitionConfig.encoding_ = this.encoding_;
            recognitionConfig.sampleRateHertz_ = this.sampleRateHertz_;
            recognitionConfig.audioChannelCount_ = this.audioChannelCount_;
            recognitionConfig.enableSeparateRecognitionPerChannel_ = this.enableSeparateRecognitionPerChannel_;
            recognitionConfig.languageCode_ = this.languageCode_;
            recognitionConfig.maxAlternatives_ = this.maxAlternatives_;
            recognitionConfig.profanityFilter_ = this.profanityFilter_;
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                recognitionConfig.speechContexts_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.speechContexts_ = Collections.unmodifiableList(this.speechContexts_);
                    this.bitField0_ &= -2;
                }
                recognitionConfig.speechContexts_ = this.speechContexts_;
            }
            recognitionConfig.enableWordTimeOffsets_ = this.enableWordTimeOffsets_;
            recognitionConfig.enableAutomaticPunctuation_ = this.enableAutomaticPunctuation_;
            SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> singleFieldBuilderV3 = this.diarizationConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                recognitionConfig.diarizationConfig_ = this.diarizationConfig_;
            } else {
                recognitionConfig.diarizationConfig_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> singleFieldBuilderV32 = this.metadataBuilder_;
            if (singleFieldBuilderV32 == null) {
                recognitionConfig.metadata_ = this.metadata_;
            } else {
                recognitionConfig.metadata_ = singleFieldBuilderV32.build();
            }
            recognitionConfig.model_ = this.model_;
            recognitionConfig.useEnhanced_ = this.useEnhanced_;
            onBuilt();
            return recognitionConfig;
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
            if (message instanceof RecognitionConfig) {
                return mergeFrom((RecognitionConfig) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RecognitionConfig recognitionConfig) {
            if (recognitionConfig == RecognitionConfig.getDefaultInstance()) {
                return this;
            }
            if (recognitionConfig.encoding_ != 0) {
                setEncodingValue(recognitionConfig.getEncodingValue());
            }
            if (recognitionConfig.getSampleRateHertz() != 0) {
                setSampleRateHertz(recognitionConfig.getSampleRateHertz());
            }
            if (recognitionConfig.getAudioChannelCount() != 0) {
                setAudioChannelCount(recognitionConfig.getAudioChannelCount());
            }
            if (recognitionConfig.getEnableSeparateRecognitionPerChannel()) {
                setEnableSeparateRecognitionPerChannel(recognitionConfig.getEnableSeparateRecognitionPerChannel());
            }
            if (!recognitionConfig.getLanguageCode().isEmpty()) {
                this.languageCode_ = recognitionConfig.languageCode_;
                onChanged();
            }
            if (recognitionConfig.getMaxAlternatives() != 0) {
                setMaxAlternatives(recognitionConfig.getMaxAlternatives());
            }
            if (recognitionConfig.getProfanityFilter()) {
                setProfanityFilter(recognitionConfig.getProfanityFilter());
            }
            if (this.speechContextsBuilder_ == null) {
                if (!recognitionConfig.speechContexts_.isEmpty()) {
                    if (this.speechContexts_.isEmpty()) {
                        this.speechContexts_ = recognitionConfig.speechContexts_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSpeechContextsIsMutable();
                        this.speechContexts_.addAll(recognitionConfig.speechContexts_);
                    }
                    onChanged();
                }
            } else if (!recognitionConfig.speechContexts_.isEmpty()) {
                if (!this.speechContextsBuilder_.isEmpty()) {
                    this.speechContextsBuilder_.addAllMessages(recognitionConfig.speechContexts_);
                } else {
                    this.speechContextsBuilder_.dispose();
                    this.speechContextsBuilder_ = null;
                    this.speechContexts_ = recognitionConfig.speechContexts_;
                    this.bitField0_ &= -2;
                    this.speechContextsBuilder_ = RecognitionConfig.alwaysUseFieldBuilders ? getSpeechContextsFieldBuilder() : null;
                }
            }
            if (recognitionConfig.getEnableWordTimeOffsets()) {
                setEnableWordTimeOffsets(recognitionConfig.getEnableWordTimeOffsets());
            }
            if (recognitionConfig.getEnableAutomaticPunctuation()) {
                setEnableAutomaticPunctuation(recognitionConfig.getEnableAutomaticPunctuation());
            }
            if (recognitionConfig.hasDiarizationConfig()) {
                mergeDiarizationConfig(recognitionConfig.getDiarizationConfig());
            }
            if (recognitionConfig.hasMetadata()) {
                mergeMetadata(recognitionConfig.getMetadata());
            }
            if (!recognitionConfig.getModel().isEmpty()) {
                this.model_ = recognitionConfig.model_;
                onChanged();
            }
            if (recognitionConfig.getUseEnhanced()) {
                setUseEnhanced(recognitionConfig.getUseEnhanced());
            }
            mergeUnknownFields(recognitionConfig.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            RecognitionConfig recognitionConfig = null;
            try {
                try {
                    RecognitionConfig recognitionConfig2 = (RecognitionConfig) RecognitionConfig.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (recognitionConfig2 != null) {
                        mergeFrom(recognitionConfig2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    RecognitionConfig recognitionConfig3 = (RecognitionConfig) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        recognitionConfig = recognitionConfig3;
                        if (recognitionConfig != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (recognitionConfig != null) {
                    mergeFrom(recognitionConfig);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public int getEncodingValue() {
            return this.encoding_;
        }

        public Builder setEncodingValue(int i) {
            this.encoding_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public AudioEncoding getEncoding() {
            AudioEncoding valueOf = AudioEncoding.valueOf(this.encoding_);
            return valueOf == null ? AudioEncoding.UNRECOGNIZED : valueOf;
        }

        public Builder setEncoding(AudioEncoding audioEncoding) {
            audioEncoding.getClass();
            this.encoding_ = audioEncoding.getNumber();
            onChanged();
            return this;
        }

        public Builder clearEncoding() {
            this.encoding_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public int getSampleRateHertz() {
            return this.sampleRateHertz_;
        }

        public Builder setSampleRateHertz(int i) {
            this.sampleRateHertz_ = i;
            onChanged();
            return this;
        }

        public Builder clearSampleRateHertz() {
            this.sampleRateHertz_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public int getAudioChannelCount() {
            return this.audioChannelCount_;
        }

        public Builder setAudioChannelCount(int i) {
            this.audioChannelCount_ = i;
            onChanged();
            return this;
        }

        public Builder clearAudioChannelCount() {
            this.audioChannelCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean getEnableSeparateRecognitionPerChannel() {
            return this.enableSeparateRecognitionPerChannel_;
        }

        public Builder setEnableSeparateRecognitionPerChannel(boolean z) {
            this.enableSeparateRecognitionPerChannel_ = z;
            onChanged();
            return this;
        }

        public Builder clearEnableSeparateRecognitionPerChannel() {
            this.enableSeparateRecognitionPerChannel_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public String getLanguageCode() {
            Object obj = this.languageCode_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.languageCode_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public ByteString getLanguageCodeBytes() {
            Object obj = this.languageCode_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.languageCode_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setLanguageCode(String str) {
            str.getClass();
            this.languageCode_ = str;
            onChanged();
            return this;
        }

        public Builder clearLanguageCode() {
            this.languageCode_ = RecognitionConfig.getDefaultInstance().getLanguageCode();
            onChanged();
            return this;
        }

        public Builder setLanguageCodeBytes(ByteString byteString) {
            byteString.getClass();
            RecognitionConfig.checkByteStringIsUtf8(byteString);
            this.languageCode_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public int getMaxAlternatives() {
            return this.maxAlternatives_;
        }

        public Builder setMaxAlternatives(int i) {
            this.maxAlternatives_ = i;
            onChanged();
            return this;
        }

        public Builder clearMaxAlternatives() {
            this.maxAlternatives_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean getProfanityFilter() {
            return this.profanityFilter_;
        }

        public Builder setProfanityFilter(boolean z) {
            this.profanityFilter_ = z;
            onChanged();
            return this;
        }

        public Builder clearProfanityFilter() {
            this.profanityFilter_ = false;
            onChanged();
            return this;
        }

        private void ensureSpeechContextsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.speechContexts_ = new ArrayList(this.speechContexts_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public List<SpeechContext> getSpeechContextsList() {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.speechContexts_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public int getSpeechContextsCount() {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.speechContexts_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public SpeechContext getSpeechContexts(int i) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.speechContexts_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setSpeechContexts(int i, SpeechContext speechContext) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechContext.getClass();
                ensureSpeechContextsIsMutable();
                this.speechContexts_.set(i, speechContext);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, speechContext);
            }
            return this;
        }

        public Builder setSpeechContexts(int i, SpeechContext.Builder builder) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSpeechContextsIsMutable();
                this.speechContexts_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addSpeechContexts(SpeechContext speechContext) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechContext.getClass();
                ensureSpeechContextsIsMutable();
                this.speechContexts_.add(speechContext);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(speechContext);
            }
            return this;
        }

        public Builder addSpeechContexts(int i, SpeechContext speechContext) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechContext.getClass();
                ensureSpeechContextsIsMutable();
                this.speechContexts_.add(i, speechContext);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, speechContext);
            }
            return this;
        }

        public Builder addSpeechContexts(SpeechContext.Builder builder) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSpeechContextsIsMutable();
                this.speechContexts_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addSpeechContexts(int i, SpeechContext.Builder builder) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSpeechContextsIsMutable();
                this.speechContexts_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllSpeechContexts(Iterable<? extends SpeechContext> iterable) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSpeechContextsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.speechContexts_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearSpeechContexts() {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.speechContexts_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeSpeechContexts(int i) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSpeechContextsIsMutable();
                this.speechContexts_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public SpeechContext.Builder getSpeechContextsBuilder(int i) {
            return getSpeechContextsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public SpeechContextOrBuilder getSpeechContextsOrBuilder(int i) {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.speechContexts_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public List<? extends SpeechContextOrBuilder> getSpeechContextsOrBuilderList() {
            RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> repeatedFieldBuilderV3 = this.speechContextsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.speechContexts_);
        }

        public SpeechContext.Builder addSpeechContextsBuilder() {
            return getSpeechContextsFieldBuilder().addBuilder(SpeechContext.getDefaultInstance());
        }

        public SpeechContext.Builder addSpeechContextsBuilder(int i) {
            return getSpeechContextsFieldBuilder().addBuilder(i, SpeechContext.getDefaultInstance());
        }

        public List<SpeechContext.Builder> getSpeechContextsBuilderList() {
            return getSpeechContextsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<SpeechContext, SpeechContext.Builder, SpeechContextOrBuilder> getSpeechContextsFieldBuilder() {
            if (this.speechContextsBuilder_ == null) {
                this.speechContextsBuilder_ = new RepeatedFieldBuilderV3<>(this.speechContexts_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.speechContexts_ = null;
            }
            return this.speechContextsBuilder_;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean getEnableWordTimeOffsets() {
            return this.enableWordTimeOffsets_;
        }

        public Builder setEnableWordTimeOffsets(boolean z) {
            this.enableWordTimeOffsets_ = z;
            onChanged();
            return this;
        }

        public Builder clearEnableWordTimeOffsets() {
            this.enableWordTimeOffsets_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean getEnableAutomaticPunctuation() {
            return this.enableAutomaticPunctuation_;
        }

        public Builder setEnableAutomaticPunctuation(boolean z) {
            this.enableAutomaticPunctuation_ = z;
            onChanged();
            return this;
        }

        public Builder clearEnableAutomaticPunctuation() {
            this.enableAutomaticPunctuation_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean hasDiarizationConfig() {
            return (this.diarizationConfigBuilder_ == null && this.diarizationConfig_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public SpeakerDiarizationConfig getDiarizationConfig() {
            SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> singleFieldBuilderV3 = this.diarizationConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                SpeakerDiarizationConfig speakerDiarizationConfig = this.diarizationConfig_;
                return speakerDiarizationConfig == null ? SpeakerDiarizationConfig.getDefaultInstance() : speakerDiarizationConfig;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setDiarizationConfig(SpeakerDiarizationConfig speakerDiarizationConfig) {
            SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> singleFieldBuilderV3 = this.diarizationConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                speakerDiarizationConfig.getClass();
                this.diarizationConfig_ = speakerDiarizationConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(speakerDiarizationConfig);
            }
            return this;
        }

        public Builder setDiarizationConfig(SpeakerDiarizationConfig.Builder builder) {
            SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> singleFieldBuilderV3 = this.diarizationConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.diarizationConfig_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDiarizationConfig(SpeakerDiarizationConfig speakerDiarizationConfig) {
            SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> singleFieldBuilderV3 = this.diarizationConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                SpeakerDiarizationConfig speakerDiarizationConfig2 = this.diarizationConfig_;
                if (speakerDiarizationConfig2 != null) {
                    this.diarizationConfig_ = SpeakerDiarizationConfig.newBuilder(speakerDiarizationConfig2).mergeFrom(speakerDiarizationConfig).buildPartial();
                } else {
                    this.diarizationConfig_ = speakerDiarizationConfig;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(speakerDiarizationConfig);
            }
            return this;
        }

        public Builder clearDiarizationConfig() {
            if (this.diarizationConfigBuilder_ == null) {
                this.diarizationConfig_ = null;
                onChanged();
            } else {
                this.diarizationConfig_ = null;
                this.diarizationConfigBuilder_ = null;
            }
            return this;
        }

        public SpeakerDiarizationConfig.Builder getDiarizationConfigBuilder() {
            onChanged();
            return getDiarizationConfigFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public SpeakerDiarizationConfigOrBuilder getDiarizationConfigOrBuilder() {
            SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> singleFieldBuilderV3 = this.diarizationConfigBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            SpeakerDiarizationConfig speakerDiarizationConfig = this.diarizationConfig_;
            return speakerDiarizationConfig == null ? SpeakerDiarizationConfig.getDefaultInstance() : speakerDiarizationConfig;
        }

        private SingleFieldBuilderV3<SpeakerDiarizationConfig, SpeakerDiarizationConfig.Builder, SpeakerDiarizationConfigOrBuilder> getDiarizationConfigFieldBuilder() {
            if (this.diarizationConfigBuilder_ == null) {
                this.diarizationConfigBuilder_ = new SingleFieldBuilderV3<>(getDiarizationConfig(), getParentForChildren(), isClean());
                this.diarizationConfig_ = null;
            }
            return this.diarizationConfigBuilder_;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean hasMetadata() {
            return (this.metadataBuilder_ == null && this.metadata_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public RecognitionMetadata getMetadata() {
            SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                RecognitionMetadata recognitionMetadata = this.metadata_;
                return recognitionMetadata == null ? RecognitionMetadata.getDefaultInstance() : recognitionMetadata;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setMetadata(RecognitionMetadata recognitionMetadata) {
            SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                recognitionMetadata.getClass();
                this.metadata_ = recognitionMetadata;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(recognitionMetadata);
            }
            return this;
        }

        public Builder setMetadata(RecognitionMetadata.Builder builder) {
            SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metadata_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeMetadata(RecognitionMetadata recognitionMetadata) {
            SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                RecognitionMetadata recognitionMetadata2 = this.metadata_;
                if (recognitionMetadata2 != null) {
                    this.metadata_ = RecognitionMetadata.newBuilder(recognitionMetadata2).mergeFrom(recognitionMetadata).buildPartial();
                } else {
                    this.metadata_ = recognitionMetadata;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(recognitionMetadata);
            }
            return this;
        }

        public Builder clearMetadata() {
            if (this.metadataBuilder_ == null) {
                this.metadata_ = null;
                onChanged();
            } else {
                this.metadata_ = null;
                this.metadataBuilder_ = null;
            }
            return this;
        }

        public RecognitionMetadata.Builder getMetadataBuilder() {
            onChanged();
            return getMetadataFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public RecognitionMetadataOrBuilder getMetadataOrBuilder() {
            SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            RecognitionMetadata recognitionMetadata = this.metadata_;
            return recognitionMetadata == null ? RecognitionMetadata.getDefaultInstance() : recognitionMetadata;
        }

        private SingleFieldBuilderV3<RecognitionMetadata, RecognitionMetadata.Builder, RecognitionMetadataOrBuilder> getMetadataFieldBuilder() {
            if (this.metadataBuilder_ == null) {
                this.metadataBuilder_ = new SingleFieldBuilderV3<>(getMetadata(), getParentForChildren(), isClean());
                this.metadata_ = null;
            }
            return this.metadataBuilder_;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public String getModel() {
            Object obj = this.model_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.model_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public ByteString getModelBytes() {
            Object obj = this.model_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.model_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setModel(String str) {
            str.getClass();
            this.model_ = str;
            onChanged();
            return this;
        }

        public Builder clearModel() {
            this.model_ = RecognitionConfig.getDefaultInstance().getModel();
            onChanged();
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            byteString.getClass();
            RecognitionConfig.checkByteStringIsUtf8(byteString);
            this.model_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.RecognitionConfigOrBuilder
        public boolean getUseEnhanced() {
            return this.useEnhanced_;
        }

        public Builder setUseEnhanced(boolean z) {
            this.useEnhanced_ = z;
            onChanged();
            return this;
        }

        public Builder clearUseEnhanced() {
            this.useEnhanced_ = false;
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

    public static RecognitionConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RecognitionConfig> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RecognitionConfig> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RecognitionConfig getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
