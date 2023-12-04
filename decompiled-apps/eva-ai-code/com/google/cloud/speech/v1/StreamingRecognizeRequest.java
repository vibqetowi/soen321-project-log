package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.StreamingRecognitionConfig;
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
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class StreamingRecognizeRequest extends GeneratedMessageV3 implements StreamingRecognizeRequestOrBuilder {
    public static final int AUDIO_CONTENT_FIELD_NUMBER = 2;
    private static final StreamingRecognizeRequest DEFAULT_INSTANCE = new StreamingRecognizeRequest();
    private static final Parser<StreamingRecognizeRequest> PARSER = new AbstractParser<StreamingRecognizeRequest>() { // from class: com.google.cloud.speech.v1.StreamingRecognizeRequest.1
        @Override // com.google.protobuf.Parser
        public StreamingRecognizeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new StreamingRecognizeRequest(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int STREAMING_CONFIG_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int streamingRequestCase_;
    private Object streamingRequest_;

    private StreamingRecognizeRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.streamingRequestCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private StreamingRecognizeRequest() {
        this.streamingRequestCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new StreamingRecognizeRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private StreamingRecognizeRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            StreamingRecognitionConfig.Builder builder = this.streamingRequestCase_ == 1 ? ((StreamingRecognitionConfig) this.streamingRequest_).toBuilder() : null;
                            MessageLite readMessage = codedInputStream.readMessage(StreamingRecognitionConfig.parser(), extensionRegistryLite);
                            this.streamingRequest_ = readMessage;
                            if (builder != null) {
                                builder.mergeFrom((StreamingRecognitionConfig) readMessage);
                                this.streamingRequest_ = builder.buildPartial();
                            }
                            this.streamingRequestCase_ = 1;
                        } else if (readTag == 18) {
                            this.streamingRequestCase_ = 2;
                            this.streamingRequest_ = codedInputStream.readBytes();
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
        return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognizeRequest.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public enum StreamingRequestCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        STREAMING_CONFIG(1),
        AUDIO_CONTENT(2),
        STREAMINGREQUEST_NOT_SET(0);
        
        private final int value;

        StreamingRequestCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static StreamingRequestCase valueOf(int i) {
            return forNumber(i);
        }

        public static StreamingRequestCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return AUDIO_CONTENT;
                }
                return STREAMING_CONFIG;
            }
            return STREAMINGREQUEST_NOT_SET;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
    public StreamingRequestCase getStreamingRequestCase() {
        return StreamingRequestCase.forNumber(this.streamingRequestCase_);
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
    public boolean hasStreamingConfig() {
        return this.streamingRequestCase_ == 1;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
    public StreamingRecognitionConfig getStreamingConfig() {
        if (this.streamingRequestCase_ == 1) {
            return (StreamingRecognitionConfig) this.streamingRequest_;
        }
        return StreamingRecognitionConfig.getDefaultInstance();
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
    public StreamingRecognitionConfigOrBuilder getStreamingConfigOrBuilder() {
        if (this.streamingRequestCase_ == 1) {
            return (StreamingRecognitionConfig) this.streamingRequest_;
        }
        return StreamingRecognitionConfig.getDefaultInstance();
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
    public ByteString getAudioContent() {
        if (this.streamingRequestCase_ == 2) {
            return (ByteString) this.streamingRequest_;
        }
        return ByteString.EMPTY;
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
        if (this.streamingRequestCase_ == 1) {
            codedOutputStream.writeMessage(1, (StreamingRecognitionConfig) this.streamingRequest_);
        }
        if (this.streamingRequestCase_ == 2) {
            codedOutputStream.writeBytes(2, (ByteString) this.streamingRequest_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.streamingRequestCase_ == 1 ? 0 + CodedOutputStream.computeMessageSize(1, (StreamingRecognitionConfig) this.streamingRequest_) : 0;
        if (this.streamingRequestCase_ == 2) {
            computeMessageSize += CodedOutputStream.computeBytesSize(2, (ByteString) this.streamingRequest_);
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
        if (!(obj instanceof StreamingRecognizeRequest)) {
            return super.equals(obj);
        }
        StreamingRecognizeRequest streamingRecognizeRequest = (StreamingRecognizeRequest) obj;
        if (getStreamingRequestCase().equals(streamingRecognizeRequest.getStreamingRequestCase())) {
            int i = this.streamingRequestCase_;
            if (i == 1) {
                if (!getStreamingConfig().equals(streamingRecognizeRequest.getStreamingConfig())) {
                    return false;
                }
            } else if (i == 2 && !getAudioContent().equals(streamingRecognizeRequest.getAudioContent())) {
                return false;
            }
            return this.unknownFields.equals(streamingRecognizeRequest.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i;
        int hashCode;
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode2 = 779 + getDescriptor().hashCode();
        int i2 = this.streamingRequestCase_;
        if (i2 == 1) {
            i = ((hashCode2 * 37) + 1) * 53;
            hashCode = getStreamingConfig().hashCode();
        } else {
            if (i2 == 2) {
                i = ((hashCode2 * 37) + 2) * 53;
                hashCode = getAudioContent().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }
        hashCode2 = i + hashCode;
        int hashCode32 = (hashCode2 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode32;
        return hashCode32;
    }

    public static StreamingRecognizeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static StreamingRecognizeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static StreamingRecognizeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static StreamingRecognizeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static StreamingRecognizeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static StreamingRecognizeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static StreamingRecognizeRequest parseFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognizeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognizeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognizeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognizeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognizeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognizeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StreamingRecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static StreamingRecognizeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(StreamingRecognizeRequest streamingRecognizeRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamingRecognizeRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StreamingRecognizeRequestOrBuilder {
        private SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> streamingConfigBuilder_;
        private int streamingRequestCase_;
        private Object streamingRequest_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognizeRequest.class, Builder.class);
        }

        private Builder() {
            this.streamingRequestCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.streamingRequestCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = StreamingRecognizeRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.streamingRequestCase_ = 0;
            this.streamingRequest_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StreamingRecognizeRequest getDefaultInstanceForType() {
            return StreamingRecognizeRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognizeRequest build() {
            StreamingRecognizeRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognizeRequest buildPartial() {
            StreamingRecognizeRequest streamingRecognizeRequest = new StreamingRecognizeRequest(this);
            if (this.streamingRequestCase_ == 1) {
                SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3 = this.streamingConfigBuilder_;
                if (singleFieldBuilderV3 == null) {
                    streamingRecognizeRequest.streamingRequest_ = this.streamingRequest_;
                } else {
                    streamingRecognizeRequest.streamingRequest_ = singleFieldBuilderV3.build();
                }
            }
            if (this.streamingRequestCase_ == 2) {
                streamingRecognizeRequest.streamingRequest_ = this.streamingRequest_;
            }
            streamingRecognizeRequest.streamingRequestCase_ = this.streamingRequestCase_;
            onBuilt();
            return streamingRecognizeRequest;
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
            if (message instanceof StreamingRecognizeRequest) {
                return mergeFrom((StreamingRecognizeRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(StreamingRecognizeRequest streamingRecognizeRequest) {
            if (streamingRecognizeRequest == StreamingRecognizeRequest.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$com$google$cloud$speech$v1$StreamingRecognizeRequest$StreamingRequestCase[streamingRecognizeRequest.getStreamingRequestCase().ordinal()];
            if (i == 1) {
                mergeStreamingConfig(streamingRecognizeRequest.getStreamingConfig());
            } else if (i == 2) {
                setAudioContent(streamingRecognizeRequest.getAudioContent());
            }
            mergeUnknownFields(streamingRecognizeRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            StreamingRecognizeRequest streamingRecognizeRequest = null;
            try {
                try {
                    StreamingRecognizeRequest streamingRecognizeRequest2 = (StreamingRecognizeRequest) StreamingRecognizeRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (streamingRecognizeRequest2 != null) {
                        mergeFrom(streamingRecognizeRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    StreamingRecognizeRequest streamingRecognizeRequest3 = (StreamingRecognizeRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        streamingRecognizeRequest = streamingRecognizeRequest3;
                        if (streamingRecognizeRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (streamingRecognizeRequest != null) {
                    mergeFrom(streamingRecognizeRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
        public StreamingRequestCase getStreamingRequestCase() {
            return StreamingRequestCase.forNumber(this.streamingRequestCase_);
        }

        public Builder clearStreamingRequest() {
            this.streamingRequestCase_ = 0;
            this.streamingRequest_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
        public boolean hasStreamingConfig() {
            return this.streamingRequestCase_ == 1;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
        public StreamingRecognitionConfig getStreamingConfig() {
            SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3 = this.streamingConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.streamingRequestCase_ == 1) {
                    return (StreamingRecognitionConfig) this.streamingRequest_;
                }
                return StreamingRecognitionConfig.getDefaultInstance();
            } else if (this.streamingRequestCase_ == 1) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return StreamingRecognitionConfig.getDefaultInstance();
            }
        }

        public Builder setStreamingConfig(StreamingRecognitionConfig streamingRecognitionConfig) {
            SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3 = this.streamingConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                streamingRecognitionConfig.getClass();
                this.streamingRequest_ = streamingRecognitionConfig;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(streamingRecognitionConfig);
            }
            this.streamingRequestCase_ = 1;
            return this;
        }

        public Builder setStreamingConfig(StreamingRecognitionConfig.Builder builder) {
            SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3 = this.streamingConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.streamingRequest_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.streamingRequestCase_ = 1;
            return this;
        }

        public Builder mergeStreamingConfig(StreamingRecognitionConfig streamingRecognitionConfig) {
            SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3 = this.streamingConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.streamingRequestCase_ == 1 && this.streamingRequest_ != StreamingRecognitionConfig.getDefaultInstance()) {
                    this.streamingRequest_ = StreamingRecognitionConfig.newBuilder((StreamingRecognitionConfig) this.streamingRequest_).mergeFrom(streamingRecognitionConfig).buildPartial();
                } else {
                    this.streamingRequest_ = streamingRecognitionConfig;
                }
                onChanged();
            } else {
                if (this.streamingRequestCase_ == 1) {
                    singleFieldBuilderV3.mergeFrom(streamingRecognitionConfig);
                }
                this.streamingConfigBuilder_.setMessage(streamingRecognitionConfig);
            }
            this.streamingRequestCase_ = 1;
            return this;
        }

        public Builder clearStreamingConfig() {
            SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3 = this.streamingConfigBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.streamingRequestCase_ == 1) {
                    this.streamingRequestCase_ = 0;
                    this.streamingRequest_ = null;
                    onChanged();
                }
            } else {
                if (this.streamingRequestCase_ == 1) {
                    this.streamingRequestCase_ = 0;
                    this.streamingRequest_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public StreamingRecognitionConfig.Builder getStreamingConfigBuilder() {
            return getStreamingConfigFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
        public StreamingRecognitionConfigOrBuilder getStreamingConfigOrBuilder() {
            SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> singleFieldBuilderV3;
            int i = this.streamingRequestCase_;
            if (i != 1 || (singleFieldBuilderV3 = this.streamingConfigBuilder_) == null) {
                if (i == 1) {
                    return (StreamingRecognitionConfig) this.streamingRequest_;
                }
                return StreamingRecognitionConfig.getDefaultInstance();
            }
            return singleFieldBuilderV3.getMessageOrBuilder();
        }

        private SingleFieldBuilderV3<StreamingRecognitionConfig, StreamingRecognitionConfig.Builder, StreamingRecognitionConfigOrBuilder> getStreamingConfigFieldBuilder() {
            if (this.streamingConfigBuilder_ == null) {
                if (this.streamingRequestCase_ != 1) {
                    this.streamingRequest_ = StreamingRecognitionConfig.getDefaultInstance();
                }
                this.streamingConfigBuilder_ = new SingleFieldBuilderV3<>((StreamingRecognitionConfig) this.streamingRequest_, getParentForChildren(), isClean());
                this.streamingRequest_ = null;
            }
            this.streamingRequestCase_ = 1;
            onChanged();
            return this.streamingConfigBuilder_;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeRequestOrBuilder
        public ByteString getAudioContent() {
            if (this.streamingRequestCase_ == 2) {
                return (ByteString) this.streamingRequest_;
            }
            return ByteString.EMPTY;
        }

        public Builder setAudioContent(ByteString byteString) {
            byteString.getClass();
            this.streamingRequestCase_ = 2;
            this.streamingRequest_ = byteString;
            onChanged();
            return this;
        }

        public Builder clearAudioContent() {
            if (this.streamingRequestCase_ == 2) {
                this.streamingRequestCase_ = 0;
                this.streamingRequest_ = null;
                onChanged();
            }
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.cloud.speech.v1.StreamingRecognizeRequest$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$cloud$speech$v1$StreamingRecognizeRequest$StreamingRequestCase;

        static {
            int[] iArr = new int[StreamingRequestCase.values().length];
            $SwitchMap$com$google$cloud$speech$v1$StreamingRecognizeRequest$StreamingRequestCase = iArr;
            try {
                iArr[StreamingRequestCase.STREAMING_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$cloud$speech$v1$StreamingRecognizeRequest$StreamingRequestCase[StreamingRequestCase.AUDIO_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$cloud$speech$v1$StreamingRecognizeRequest$StreamingRequestCase[StreamingRequestCase.STREAMINGREQUEST_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static StreamingRecognizeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<StreamingRecognizeRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<StreamingRecognizeRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public StreamingRecognizeRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
