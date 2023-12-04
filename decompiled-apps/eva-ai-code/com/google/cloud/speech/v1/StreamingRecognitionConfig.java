package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.RecognitionConfig;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class StreamingRecognitionConfig extends GeneratedMessageV3 implements StreamingRecognitionConfigOrBuilder {
    public static final int CONFIG_FIELD_NUMBER = 1;
    public static final int INTERIM_RESULTS_FIELD_NUMBER = 3;
    public static final int SINGLE_UTTERANCE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private RecognitionConfig config_;
    private boolean interimResults_;
    private byte memoizedIsInitialized;
    private boolean singleUtterance_;
    private static final StreamingRecognitionConfig DEFAULT_INSTANCE = new StreamingRecognitionConfig();
    private static final Parser<StreamingRecognitionConfig> PARSER = new AbstractParser<StreamingRecognitionConfig>() { // from class: com.google.cloud.speech.v1.StreamingRecognitionConfig.1
        @Override // com.google.protobuf.Parser
        public StreamingRecognitionConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new StreamingRecognitionConfig(codedInputStream, extensionRegistryLite);
        }
    };

    private StreamingRecognitionConfig(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private StreamingRecognitionConfig() {
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new StreamingRecognitionConfig();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private StreamingRecognitionConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        } else if (readTag == 16) {
                            this.singleUtterance_ = codedInputStream.readBool();
                        } else if (readTag == 24) {
                            this.interimResults_ = codedInputStream.readBool();
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
        return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognitionConfig.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
    public boolean hasConfig() {
        return this.config_ != null;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
    public RecognitionConfig getConfig() {
        RecognitionConfig recognitionConfig = this.config_;
        return recognitionConfig == null ? RecognitionConfig.getDefaultInstance() : recognitionConfig;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
    public RecognitionConfigOrBuilder getConfigOrBuilder() {
        return getConfig();
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
    public boolean getSingleUtterance() {
        return this.singleUtterance_;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
    public boolean getInterimResults() {
        return this.interimResults_;
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
        boolean z = this.singleUtterance_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        boolean z2 = this.interimResults_;
        if (z2) {
            codedOutputStream.writeBool(3, z2);
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
        boolean z = this.singleUtterance_;
        if (z) {
            computeMessageSize += CodedOutputStream.computeBoolSize(2, z);
        }
        boolean z2 = this.interimResults_;
        if (z2) {
            computeMessageSize += CodedOutputStream.computeBoolSize(3, z2);
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
        if (!(obj instanceof StreamingRecognitionConfig)) {
            return super.equals(obj);
        }
        StreamingRecognitionConfig streamingRecognitionConfig = (StreamingRecognitionConfig) obj;
        if (hasConfig() != streamingRecognitionConfig.hasConfig()) {
            return false;
        }
        return (!hasConfig() || getConfig().equals(streamingRecognitionConfig.getConfig())) && getSingleUtterance() == streamingRecognitionConfig.getSingleUtterance() && getInterimResults() == streamingRecognitionConfig.getInterimResults() && this.unknownFields.equals(streamingRecognitionConfig.unknownFields);
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
        int hashBoolean = (((((((((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getSingleUtterance())) * 37) + 3) * 53) + Internal.hashBoolean(getInterimResults())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashBoolean;
        return hashBoolean;
    }

    public static StreamingRecognitionConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static StreamingRecognitionConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static StreamingRecognitionConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static StreamingRecognitionConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static StreamingRecognitionConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static StreamingRecognitionConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static StreamingRecognitionConfig parseFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognitionConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognitionConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognitionConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognitionConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognitionConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognitionConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StreamingRecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static StreamingRecognitionConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognitionConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(StreamingRecognitionConfig streamingRecognitionConfig) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamingRecognitionConfig);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StreamingRecognitionConfigOrBuilder {
        private SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> configBuilder_;
        private RecognitionConfig config_;
        private boolean interimResults_;
        private boolean singleUtterance_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognitionConfig.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = StreamingRecognitionConfig.alwaysUseFieldBuilders;
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
            this.singleUtterance_ = false;
            this.interimResults_ = false;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognitionConfig_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StreamingRecognitionConfig getDefaultInstanceForType() {
            return StreamingRecognitionConfig.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognitionConfig build() {
            StreamingRecognitionConfig buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognitionConfig buildPartial() {
            StreamingRecognitionConfig streamingRecognitionConfig = new StreamingRecognitionConfig(this);
            SingleFieldBuilderV3<RecognitionConfig, RecognitionConfig.Builder, RecognitionConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
            if (singleFieldBuilderV3 == null) {
                streamingRecognitionConfig.config_ = this.config_;
            } else {
                streamingRecognitionConfig.config_ = singleFieldBuilderV3.build();
            }
            streamingRecognitionConfig.singleUtterance_ = this.singleUtterance_;
            streamingRecognitionConfig.interimResults_ = this.interimResults_;
            onBuilt();
            return streamingRecognitionConfig;
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
            if (message instanceof StreamingRecognitionConfig) {
                return mergeFrom((StreamingRecognitionConfig) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(StreamingRecognitionConfig streamingRecognitionConfig) {
            if (streamingRecognitionConfig == StreamingRecognitionConfig.getDefaultInstance()) {
                return this;
            }
            if (streamingRecognitionConfig.hasConfig()) {
                mergeConfig(streamingRecognitionConfig.getConfig());
            }
            if (streamingRecognitionConfig.getSingleUtterance()) {
                setSingleUtterance(streamingRecognitionConfig.getSingleUtterance());
            }
            if (streamingRecognitionConfig.getInterimResults()) {
                setInterimResults(streamingRecognitionConfig.getInterimResults());
            }
            mergeUnknownFields(streamingRecognitionConfig.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            StreamingRecognitionConfig streamingRecognitionConfig = null;
            try {
                try {
                    StreamingRecognitionConfig streamingRecognitionConfig2 = (StreamingRecognitionConfig) StreamingRecognitionConfig.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (streamingRecognitionConfig2 != null) {
                        mergeFrom(streamingRecognitionConfig2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    StreamingRecognitionConfig streamingRecognitionConfig3 = (StreamingRecognitionConfig) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        streamingRecognitionConfig = streamingRecognitionConfig3;
                        if (streamingRecognitionConfig != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (streamingRecognitionConfig != null) {
                    mergeFrom(streamingRecognitionConfig);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
        public boolean hasConfig() {
            return (this.configBuilder_ == null && this.config_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
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

        @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
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

        @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
        public boolean getSingleUtterance() {
            return this.singleUtterance_;
        }

        public Builder setSingleUtterance(boolean z) {
            this.singleUtterance_ = z;
            onChanged();
            return this;
        }

        public Builder clearSingleUtterance() {
            this.singleUtterance_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder
        public boolean getInterimResults() {
            return this.interimResults_;
        }

        public Builder setInterimResults(boolean z) {
            this.interimResults_ = z;
            onChanged();
            return this;
        }

        public Builder clearInterimResults() {
            this.interimResults_ = false;
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

    public static StreamingRecognitionConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<StreamingRecognitionConfig> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<StreamingRecognitionConfig> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public StreamingRecognitionConfig getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
