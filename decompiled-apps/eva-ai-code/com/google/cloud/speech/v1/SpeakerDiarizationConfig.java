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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class SpeakerDiarizationConfig extends GeneratedMessageV3 implements SpeakerDiarizationConfigOrBuilder {
    public static final int ENABLE_SPEAKER_DIARIZATION_FIELD_NUMBER = 1;
    public static final int MAX_SPEAKER_COUNT_FIELD_NUMBER = 3;
    public static final int MIN_SPEAKER_COUNT_FIELD_NUMBER = 2;
    public static final int SPEAKER_TAG_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private boolean enableSpeakerDiarization_;
    private int maxSpeakerCount_;
    private byte memoizedIsInitialized;
    private int minSpeakerCount_;
    private int speakerTag_;
    private static final SpeakerDiarizationConfig DEFAULT_INSTANCE = new SpeakerDiarizationConfig();
    private static final Parser<SpeakerDiarizationConfig> PARSER = new AbstractParser<SpeakerDiarizationConfig>() { // from class: com.google.cloud.speech.v1.SpeakerDiarizationConfig.1
        @Override // com.google.protobuf.Parser
        public SpeakerDiarizationConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SpeakerDiarizationConfig(codedInputStream, extensionRegistryLite);
        }
    };

    private SpeakerDiarizationConfig(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private SpeakerDiarizationConfig() {
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SpeakerDiarizationConfig();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private SpeakerDiarizationConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.enableSpeakerDiarization_ = codedInputStream.readBool();
                        } else if (readTag == 16) {
                            this.minSpeakerCount_ = codedInputStream.readInt32();
                        } else if (readTag == 24) {
                            this.maxSpeakerCount_ = codedInputStream.readInt32();
                        } else if (readTag == 40) {
                            this.speakerTag_ = codedInputStream.readInt32();
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
        return SpeechProto.internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeakerDiarizationConfig.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
    public boolean getEnableSpeakerDiarization() {
        return this.enableSpeakerDiarization_;
    }

    @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
    public int getMinSpeakerCount() {
        return this.minSpeakerCount_;
    }

    @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
    public int getMaxSpeakerCount() {
        return this.maxSpeakerCount_;
    }

    @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
    @Deprecated
    public int getSpeakerTag() {
        return this.speakerTag_;
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
        boolean z = this.enableSpeakerDiarization_;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        int i = this.minSpeakerCount_;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        int i2 = this.maxSpeakerCount_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(3, i2);
        }
        int i3 = this.speakerTag_;
        if (i3 != 0) {
            codedOutputStream.writeInt32(5, i3);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.enableSpeakerDiarization_;
        int computeBoolSize = z ? 0 + CodedOutputStream.computeBoolSize(1, z) : 0;
        int i2 = this.minSpeakerCount_;
        if (i2 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(2, i2);
        }
        int i3 = this.maxSpeakerCount_;
        if (i3 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(3, i3);
        }
        int i4 = this.speakerTag_;
        if (i4 != 0) {
            computeBoolSize += CodedOutputStream.computeInt32Size(5, i4);
        }
        int serializedSize = computeBoolSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpeakerDiarizationConfig)) {
            return super.equals(obj);
        }
        SpeakerDiarizationConfig speakerDiarizationConfig = (SpeakerDiarizationConfig) obj;
        return getEnableSpeakerDiarization() == speakerDiarizationConfig.getEnableSpeakerDiarization() && getMinSpeakerCount() == speakerDiarizationConfig.getMinSpeakerCount() && getMaxSpeakerCount() == speakerDiarizationConfig.getMaxSpeakerCount() && getSpeakerTag() == speakerDiarizationConfig.getSpeakerTag() && this.unknownFields.equals(speakerDiarizationConfig.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashBoolean(getEnableSpeakerDiarization())) * 37) + 2) * 53) + getMinSpeakerCount()) * 37) + 3) * 53) + getMaxSpeakerCount()) * 37) + 5) * 53) + getSpeakerTag()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static SpeakerDiarizationConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SpeakerDiarizationConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SpeakerDiarizationConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SpeakerDiarizationConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SpeakerDiarizationConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SpeakerDiarizationConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SpeakerDiarizationConfig parseFrom(InputStream inputStream) throws IOException {
        return (SpeakerDiarizationConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SpeakerDiarizationConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeakerDiarizationConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeakerDiarizationConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeakerDiarizationConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SpeakerDiarizationConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeakerDiarizationConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeakerDiarizationConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpeakerDiarizationConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SpeakerDiarizationConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeakerDiarizationConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SpeakerDiarizationConfig speakerDiarizationConfig) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(speakerDiarizationConfig);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeakerDiarizationConfigOrBuilder {
        private boolean enableSpeakerDiarization_;
        private int maxSpeakerCount_;
        private int minSpeakerCount_;
        private int speakerTag_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeakerDiarizationConfig.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = SpeakerDiarizationConfig.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.enableSpeakerDiarization_ = false;
            this.minSpeakerCount_ = 0;
            this.maxSpeakerCount_ = 0;
            this.speakerTag_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeakerDiarizationConfig_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeakerDiarizationConfig getDefaultInstanceForType() {
            return SpeakerDiarizationConfig.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeakerDiarizationConfig build() {
            SpeakerDiarizationConfig buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeakerDiarizationConfig buildPartial() {
            SpeakerDiarizationConfig speakerDiarizationConfig = new SpeakerDiarizationConfig(this);
            speakerDiarizationConfig.enableSpeakerDiarization_ = this.enableSpeakerDiarization_;
            speakerDiarizationConfig.minSpeakerCount_ = this.minSpeakerCount_;
            speakerDiarizationConfig.maxSpeakerCount_ = this.maxSpeakerCount_;
            speakerDiarizationConfig.speakerTag_ = this.speakerTag_;
            onBuilt();
            return speakerDiarizationConfig;
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
            if (message instanceof SpeakerDiarizationConfig) {
                return mergeFrom((SpeakerDiarizationConfig) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SpeakerDiarizationConfig speakerDiarizationConfig) {
            if (speakerDiarizationConfig == SpeakerDiarizationConfig.getDefaultInstance()) {
                return this;
            }
            if (speakerDiarizationConfig.getEnableSpeakerDiarization()) {
                setEnableSpeakerDiarization(speakerDiarizationConfig.getEnableSpeakerDiarization());
            }
            if (speakerDiarizationConfig.getMinSpeakerCount() != 0) {
                setMinSpeakerCount(speakerDiarizationConfig.getMinSpeakerCount());
            }
            if (speakerDiarizationConfig.getMaxSpeakerCount() != 0) {
                setMaxSpeakerCount(speakerDiarizationConfig.getMaxSpeakerCount());
            }
            if (speakerDiarizationConfig.getSpeakerTag() != 0) {
                setSpeakerTag(speakerDiarizationConfig.getSpeakerTag());
            }
            mergeUnknownFields(speakerDiarizationConfig.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            SpeakerDiarizationConfig speakerDiarizationConfig = null;
            try {
                try {
                    SpeakerDiarizationConfig speakerDiarizationConfig2 = (SpeakerDiarizationConfig) SpeakerDiarizationConfig.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (speakerDiarizationConfig2 != null) {
                        mergeFrom(speakerDiarizationConfig2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SpeakerDiarizationConfig speakerDiarizationConfig3 = (SpeakerDiarizationConfig) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        speakerDiarizationConfig = speakerDiarizationConfig3;
                        if (speakerDiarizationConfig != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (speakerDiarizationConfig != null) {
                    mergeFrom(speakerDiarizationConfig);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
        public boolean getEnableSpeakerDiarization() {
            return this.enableSpeakerDiarization_;
        }

        public Builder setEnableSpeakerDiarization(boolean z) {
            this.enableSpeakerDiarization_ = z;
            onChanged();
            return this;
        }

        public Builder clearEnableSpeakerDiarization() {
            this.enableSpeakerDiarization_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
        public int getMinSpeakerCount() {
            return this.minSpeakerCount_;
        }

        public Builder setMinSpeakerCount(int i) {
            this.minSpeakerCount_ = i;
            onChanged();
            return this;
        }

        public Builder clearMinSpeakerCount() {
            this.minSpeakerCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
        public int getMaxSpeakerCount() {
            return this.maxSpeakerCount_;
        }

        public Builder setMaxSpeakerCount(int i) {
            this.maxSpeakerCount_ = i;
            onChanged();
            return this;
        }

        public Builder clearMaxSpeakerCount() {
            this.maxSpeakerCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.SpeakerDiarizationConfigOrBuilder
        @Deprecated
        public int getSpeakerTag() {
            return this.speakerTag_;
        }

        @Deprecated
        public Builder setSpeakerTag(int i) {
            this.speakerTag_ = i;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearSpeakerTag() {
            this.speakerTag_ = 0;
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

    public static SpeakerDiarizationConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SpeakerDiarizationConfig> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SpeakerDiarizationConfig> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SpeakerDiarizationConfig getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
