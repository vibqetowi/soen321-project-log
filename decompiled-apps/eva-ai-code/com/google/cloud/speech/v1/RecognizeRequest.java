package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.RecognitionAudio;
import com.google.cloud.speech.v1.RecognitionConfig;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class RecognizeRequest extends GeneratedMessageV3 implements RecognizeRequestOrBuilder {
    public static final int AUDIO_FIELD_NUMBER = 2;
    public static final int CONFIG_FIELD_NUMBER = 1;
    private static final RecognizeRequest DEFAULT_INSTANCE = new RecognizeRequest();
    private static final Parser<RecognizeRequest> PARSER = new AbstractParser<RecognizeRequest>() { // from class: com.google.cloud.speech.v1.RecognizeRequest.1
        @Override // com.google.protobuf.Parser
        public RecognizeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RecognizeRequest(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private RecognitionAudio audio_;
    private RecognitionConfig config_;
    private byte memoizedIsInitialized;

    private RecognizeRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private RecognizeRequest() {
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RecognizeRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RecognizeRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            RecognitionConfig recognitionConfig = this.config_;
                            RecognitionConfig.Builder builder = recognitionConfig != null ? recognitionConfig.toBuilder() : null;
                            RecognitionConfig recognitionConfig2 = (RecognitionConfig) codedInputStream.readMessage(RecognitionConfig.parser(), extensionRegistryLite);
                            this.config_ = recognitionConfig2;
                            if (builder != null) {
                                builder.mergeFrom(recognitionConfig2);
                                this.config_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            RecognitionAudio recognitionAudio = this.audio_;
                            RecognitionAudio.Builder builder2 = recognitionAudio != null ? recognitionAudio.toBuilder() : null;
                            RecognitionAudio recognitionAudio2 = (RecognitionAudio) codedInputStream.readMessage(RecognitionAudio.parser(), extensionRegistryLite);
                            this.audio_ = recognitionAudio2;
                            if (builder2 != null) {
                                builder2.mergeFrom(recognitionAudio2);
                                this.audio_ = builder2.buildPartial();
                            }
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
        return SpeechProto.internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognizeRequest.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
    public boolean hasConfig() {
        return this.config_ != null;
    }

    @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
    public RecognitionConfig getConfig() {
        RecognitionConfig recognitionConfig = this.config_;
        return recognitionConfig == null ? RecognitionConfig.getDefaultInstance() : recognitionConfig;
    }

    @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
    public RecognitionConfigOrBuilder getConfigOrBuilder() {
        return getConfig();
    }

    @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
    public boolean hasAudio() {
        return this.audio_ != null;
    }

    @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
    public RecognitionAudio getAudio() {
        RecognitionAudio recognitionAudio = this.audio_;
        return recognitionAudio == null ? RecognitionAudio.getDefaultInstance() : recognitionAudio;
    }

    @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
    public RecognitionAudioOrBuilder getAudioOrBuilder() {
        return getAudio();
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
        if (this.config_ != null) {
            codedOutputStream.writeMessage(1, getConfig());
        }
        if (this.audio_ != null) {
            codedOutputStream.writeMessage(2, getAudio());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.config_ != null ? 0 + CodedOutputStream.computeMessageSize(1, getConfig()) : 0;
        if (this.audio_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getAudio());
        }
        int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognizeRequest)) {
            return super.equals(obj);
        }
        RecognizeRequest recognizeRequest = (RecognizeRequest) obj;
        if (hasConfig() != recognizeRequest.hasConfig()) {
            return false;
        }
        if ((!hasConfig() || getConfig().equals(recognizeRequest.getConfig())) && hasAudio() == recognizeRequest.hasAudio()) {
            return (!hasAudio() || getAudio().equals(recognizeRequest.getAudio())) && this.unknownFields.equals(recognizeRequest.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasConfig()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getConfig().hashCode();
        }
        if (hasAudio()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getAudio().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static RecognizeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RecognizeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RecognizeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RecognizeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RecognizeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RecognizeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RecognizeRequest parseFrom(InputStream inputStream) throws IOException {
        return (RecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RecognizeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognizeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecognizeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RecognizeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognizeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognizeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RecognizeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RecognizeRequest recognizeRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(recognizeRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecognizeRequestOrBuilder {
        private SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> audioBuilder_;
        private RecognitionAudio audio_;
        private SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> configBuilder_;
        private RecognitionConfig config_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognizeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognizeRequest.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = RecognizeRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.configBuilder_ == null) {
                this.config_ = null;
            } else {
                this.config_ = null;
                this.configBuilder_ = null;
            }
            if (this.audioBuilder_ == null) {
                this.audio_ = null;
            } else {
                this.audio_ = null;
                this.audioBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_RecognizeRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RecognizeRequest getDefaultInstanceForType() {
            return RecognizeRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognizeRequest build() {
            RecognizeRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognizeRequest buildPartial() {
            RecognizeRequest recognizeRequest = new RecognizeRequest(this);
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 == null) {
                recognizeRequest.config_ = this.config_;
            } else {
                recognizeRequest.config_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> singleFieldBuilderV32 = this.audioBuilder_;
            if (singleFieldBuilderV32 == null) {
                recognizeRequest.audio_ = this.audio_;
            } else {
                recognizeRequest.audio_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return recognizeRequest;
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
            if (message instanceof RecognizeRequest) {
                return mergeFrom((RecognizeRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RecognizeRequest recognizeRequest) {
            if (recognizeRequest == RecognizeRequest.getDefaultInstance()) {
                return this;
            }
            if (recognizeRequest.hasConfig()) {
                mergeConfig(recognizeRequest.getConfig());
            }
            if (recognizeRequest.hasAudio()) {
                mergeAudio(recognizeRequest.getAudio());
            }
            mergeUnknownFields(recognizeRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            RecognizeRequest recognizeRequest = null;
            try {
                try {
                    RecognizeRequest recognizeRequest2 = (RecognizeRequest) RecognizeRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (recognizeRequest2 != null) {
                        mergeFrom(recognizeRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    RecognizeRequest recognizeRequest3 = (RecognizeRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        recognizeRequest = recognizeRequest3;
                        if (recognizeRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (recognizeRequest != null) {
                    mergeFrom(recognizeRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
        public boolean hasConfig() {
            return (this.configBuilder_ == null && this.config_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
        public RecognitionConfig getConfig() {
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 == null) {
                RecognitionConfig recognitionConfig = this.config_;
                return recognitionConfig == null ? RecognitionConfig.getDefaultInstance() : recognitionConfig;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setConfig(RecognitionConfig recognitionConfig) {
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 == null) {
                recognitionConfig.getClass();
                this.config_ = recognitionConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(recognitionConfig);
            }
            return this;
        }

        public Builder setConfig(RecognitionConfig.Builder builder) {
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.config_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeConfig(RecognitionConfig recognitionConfig) {
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 == null) {
                RecognitionConfig recognitionConfig2 = this.config_;
                if (recognitionConfig2 != null) {
                    this.config_ = RecognitionConfig.newBuilder(recognitionConfig2).mergeFrom(recognitionConfig).buildPartial();
                } else {
                    this.config_ = recognitionConfig;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(recognitionConfig);
            }
            return this;
        }

        public Builder clearConfig() {
            if (this.configBuilder_ == null) {
                this.config_ = null;
                onChanged();
            } else {
                this.config_ = null;
                this.configBuilder_ = null;
            }
            return this;
        }

        public RecognitionConfig.Builder getConfigBuilder() {
            onChanged();
            return getConfigFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
        public RecognitionConfigOrBuilder getConfigOrBuilder() {
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            RecognitionConfig recognitionConfig = this.config_;
            return recognitionConfig == null ? RecognitionConfig.getDefaultInstance() : recognitionConfig;
        }

        private SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> getConfigFieldBuilder() {
            if (this.configBuilder_ == null) {
                this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                this.config_ = null;
            }
            return this.configBuilder_;
        }

        @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
        public boolean hasAudio() {
            return (this.audioBuilder_ == null && this.audio_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
        public RecognitionAudio getAudio() {
            SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> singleFieldBuilderV3 = this.audioBuilder_;
            if (singleFieldBuilderV3 == null) {
                RecognitionAudio recognitionAudio = this.audio_;
                return recognitionAudio == null ? RecognitionAudio.getDefaultInstance() : recognitionAudio;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setAudio(RecognitionAudio recognitionAudio) {
            SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> singleFieldBuilderV3 = this.audioBuilder_;
            if (singleFieldBuilderV3 == null) {
                recognitionAudio.getClass();
                this.audio_ = recognitionAudio;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(recognitionAudio);
            }
            return this;
        }

        public Builder setAudio(RecognitionAudio.Builder builder) {
            SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> singleFieldBuilderV3 = this.audioBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.audio_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAudio(RecognitionAudio recognitionAudio) {
            SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> singleFieldBuilderV3 = this.audioBuilder_;
            if (singleFieldBuilderV3 == null) {
                RecognitionAudio recognitionAudio2 = this.audio_;
                if (recognitionAudio2 != null) {
                    this.audio_ = RecognitionAudio.newBuilder(recognitionAudio2).mergeFrom(recognitionAudio).buildPartial();
                } else {
                    this.audio_ = recognitionAudio;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(recognitionAudio);
            }
            return this;
        }

        public Builder clearAudio() {
            if (this.audioBuilder_ == null) {
                this.audio_ = null;
                onChanged();
            } else {
                this.audio_ = null;
                this.audioBuilder_ = null;
            }
            return this;
        }

        public RecognitionAudio.Builder getAudioBuilder() {
            onChanged();
            return getAudioFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1.RecognizeRequestOrBuilder
        public RecognitionAudioOrBuilder getAudioOrBuilder() {
            SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> singleFieldBuilderV3 = this.audioBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            RecognitionAudio recognitionAudio = this.audio_;
            return recognitionAudio == null ? RecognitionAudio.getDefaultInstance() : recognitionAudio;
        }

        private SingleFieldBuilderV3<RecognitionAudio, RecognitionAudio.Builder, RecognitionAudioOrBuilder> getAudioFieldBuilder() {
            if (this.audioBuilder_ == null) {
                this.audioBuilder_ = new SingleFieldBuilderV3<>(getAudio(), getParentForChildren(), isClean());
                this.audio_ = null;
            }
            return this.audioBuilder_;
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

    public static RecognizeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RecognizeRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RecognizeRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RecognizeRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
