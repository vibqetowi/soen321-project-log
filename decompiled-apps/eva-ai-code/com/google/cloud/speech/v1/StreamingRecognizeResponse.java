package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.StreamingRecognitionResult;
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
import com.google.rpc.Status;
import com.google.rpc.StatusOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class StreamingRecognizeResponse extends GeneratedMessageV3 implements StreamingRecognizeResponseOrBuilder {
    public static final int ERROR_FIELD_NUMBER = 1;
    public static final int RESULTS_FIELD_NUMBER = 2;
    public static final int SPEECH_EVENT_TYPE_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private Status error_;
    private byte memoizedIsInitialized;
    private List<StreamingRecognitionResult> results_;
    private int speechEventType_;
    private static final StreamingRecognizeResponse DEFAULT_INSTANCE = new StreamingRecognizeResponse();
    private static final Parser<StreamingRecognizeResponse> PARSER = new AbstractParser<StreamingRecognizeResponse>() { // from class: com.google.cloud.speech.v1.StreamingRecognizeResponse.1
        @Override // com.google.protobuf.Parser
        public StreamingRecognizeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new StreamingRecognizeResponse(codedInputStream, extensionRegistryLite);
        }
    };

    private StreamingRecognizeResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private StreamingRecognizeResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.results_ = Collections.emptyList();
        this.speechEventType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new StreamingRecognizeResponse();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StreamingRecognizeResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            Status status = this.error_;
                            Status.Builder builder = status != null ? status.toBuilder() : null;
                            Status status2 = (Status) codedInputStream.readMessage(Status.parser(), extensionRegistryLite);
                            this.error_ = status2;
                            if (builder != null) {
                                builder.mergeFrom(status2);
                                this.error_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.results_ = new ArrayList();
                                z2 |= true;
                            }
                            this.results_.add(codedInputStream.readMessage(StreamingRecognitionResult.parser(), extensionRegistryLite));
                        } else if (readTag == 32) {
                            this.speechEventType_ = codedInputStream.readEnum();
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
                if (z2 & true) {
                    this.results_ = Collections.unmodifiableList(this.results_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognizeResponse.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public enum SpeechEventType implements ProtocolMessageEnum {
        SPEECH_EVENT_UNSPECIFIED(0),
        END_OF_SINGLE_UTTERANCE(1),
        UNRECOGNIZED(-1);
        
        public static final int END_OF_SINGLE_UTTERANCE_VALUE = 1;
        public static final int SPEECH_EVENT_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<SpeechEventType> internalValueMap = new Internal.EnumLiteMap<SpeechEventType>() { // from class: com.google.cloud.speech.v1.StreamingRecognizeResponse.SpeechEventType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SpeechEventType findValueByNumber(int i) {
                return SpeechEventType.forNumber(i);
            }
        };
        private static final SpeechEventType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static SpeechEventType valueOf(int i) {
            return forNumber(i);
        }

        public static SpeechEventType forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return END_OF_SINGLE_UTTERANCE;
            }
            return SPEECH_EVENT_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<SpeechEventType> internalGetValueMap() {
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
            return StreamingRecognizeResponse.getDescriptor().getEnumTypes().get(0);
        }

        public static SpeechEventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        SpeechEventType(int i) {
            this.value = i;
        }
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public boolean hasError() {
        return this.error_ != null;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public Status getError() {
        Status status = this.error_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public StatusOrBuilder getErrorOrBuilder() {
        return getError();
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public List<StreamingRecognitionResult> getResultsList() {
        return this.results_;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public List<? extends StreamingRecognitionResultOrBuilder> getResultsOrBuilderList() {
        return this.results_;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public int getResultsCount() {
        return this.results_.size();
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public StreamingRecognitionResult getResults(int i) {
        return this.results_.get(i);
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public StreamingRecognitionResultOrBuilder getResultsOrBuilder(int i) {
        return this.results_.get(i);
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public int getSpeechEventTypeValue() {
        return this.speechEventType_;
    }

    @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
    public SpeechEventType getSpeechEventType() {
        SpeechEventType valueOf = SpeechEventType.valueOf(this.speechEventType_);
        return valueOf == null ? SpeechEventType.UNRECOGNIZED : valueOf;
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
        if (this.error_ != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        for (int i = 0; i < this.results_.size(); i++) {
            codedOutputStream.writeMessage(2, this.results_.get(i));
        }
        if (this.speechEventType_ != SpeechEventType.SPEECH_EVENT_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.speechEventType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.error_ != null ? CodedOutputStream.computeMessageSize(1, getError()) + 0 : 0;
        for (int i2 = 0; i2 < this.results_.size(); i2++) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, this.results_.get(i2));
        }
        if (this.speechEventType_ != SpeechEventType.SPEECH_EVENT_UNSPECIFIED.getNumber()) {
            computeMessageSize += CodedOutputStream.computeEnumSize(4, this.speechEventType_);
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
        if (!(obj instanceof StreamingRecognizeResponse)) {
            return super.equals(obj);
        }
        StreamingRecognizeResponse streamingRecognizeResponse = (StreamingRecognizeResponse) obj;
        if (hasError() != streamingRecognizeResponse.hasError()) {
            return false;
        }
        return (!hasError() || getError().equals(streamingRecognizeResponse.getError())) && getResultsList().equals(streamingRecognizeResponse.getResultsList()) && this.speechEventType_ == streamingRecognizeResponse.speechEventType_ && this.unknownFields.equals(streamingRecognizeResponse.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasError()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getError().hashCode();
        }
        if (getResultsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getResultsList().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 4) * 53) + this.speechEventType_) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static StreamingRecognizeResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static StreamingRecognizeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static StreamingRecognizeResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static StreamingRecognizeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static StreamingRecognizeResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static StreamingRecognizeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static StreamingRecognizeResponse parseFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognizeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognizeResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognizeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognizeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognizeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognizeResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StreamingRecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static StreamingRecognizeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(StreamingRecognizeResponse streamingRecognizeResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamingRecognizeResponse);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StreamingRecognizeResponseOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> errorBuilder_;
        private Status error_;
        private RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> resultsBuilder_;
        private List<StreamingRecognitionResult> results_;
        private int speechEventType_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognizeResponse.class, Builder.class);
        }

        private Builder() {
            this.results_ = Collections.emptyList();
            this.speechEventType_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.results_ = Collections.emptyList();
            this.speechEventType_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (StreamingRecognizeResponse.alwaysUseFieldBuilders) {
                getResultsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.errorBuilder_ == null) {
                this.error_ = null;
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.results_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.speechEventType_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_StreamingRecognizeResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StreamingRecognizeResponse getDefaultInstanceForType() {
            return StreamingRecognizeResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognizeResponse build() {
            StreamingRecognizeResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognizeResponse buildPartial() {
            StreamingRecognizeResponse streamingRecognizeResponse = new StreamingRecognizeResponse(this);
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                streamingRecognizeResponse.error_ = this.error_;
            } else {
                streamingRecognizeResponse.error_ = singleFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                streamingRecognizeResponse.results_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.results_ = Collections.unmodifiableList(this.results_);
                    this.bitField0_ &= -2;
                }
                streamingRecognizeResponse.results_ = this.results_;
            }
            streamingRecognizeResponse.speechEventType_ = this.speechEventType_;
            onBuilt();
            return streamingRecognizeResponse;
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
            if (message instanceof StreamingRecognizeResponse) {
                return mergeFrom((StreamingRecognizeResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(StreamingRecognizeResponse streamingRecognizeResponse) {
            if (streamingRecognizeResponse == StreamingRecognizeResponse.getDefaultInstance()) {
                return this;
            }
            if (streamingRecognizeResponse.hasError()) {
                mergeError(streamingRecognizeResponse.getError());
            }
            if (this.resultsBuilder_ == null) {
                if (!streamingRecognizeResponse.results_.isEmpty()) {
                    if (this.results_.isEmpty()) {
                        this.results_ = streamingRecognizeResponse.results_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureResultsIsMutable();
                        this.results_.addAll(streamingRecognizeResponse.results_);
                    }
                    onChanged();
                }
            } else if (!streamingRecognizeResponse.results_.isEmpty()) {
                if (!this.resultsBuilder_.isEmpty()) {
                    this.resultsBuilder_.addAllMessages(streamingRecognizeResponse.results_);
                } else {
                    this.resultsBuilder_.dispose();
                    this.resultsBuilder_ = null;
                    this.results_ = streamingRecognizeResponse.results_;
                    this.bitField0_ &= -2;
                    this.resultsBuilder_ = StreamingRecognizeResponse.alwaysUseFieldBuilders ? getResultsFieldBuilder() : null;
                }
            }
            if (streamingRecognizeResponse.speechEventType_ != 0) {
                setSpeechEventTypeValue(streamingRecognizeResponse.getSpeechEventTypeValue());
            }
            mergeUnknownFields(streamingRecognizeResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            StreamingRecognizeResponse streamingRecognizeResponse = null;
            try {
                try {
                    StreamingRecognizeResponse streamingRecognizeResponse2 = (StreamingRecognizeResponse) StreamingRecognizeResponse.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (streamingRecognizeResponse2 != null) {
                        mergeFrom(streamingRecognizeResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    StreamingRecognizeResponse streamingRecognizeResponse3 = (StreamingRecognizeResponse) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        streamingRecognizeResponse = streamingRecognizeResponse3;
                        if (streamingRecognizeResponse != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (streamingRecognizeResponse != null) {
                    mergeFrom(streamingRecognizeResponse);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public boolean hasError() {
            return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public Status getError() {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Status status = this.error_;
                return status == null ? Status.getDefaultInstance() : status;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setError(Status status) {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                status.getClass();
                this.error_ = status;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(status);
            }
            return this;
        }

        public Builder setError(Status.Builder builder) {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.error_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeError(Status status) {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 == null) {
                Status status2 = this.error_;
                if (status2 != null) {
                    this.error_ = Status.newBuilder(status2).mergeFrom(status).buildPartial();
                } else {
                    this.error_ = status;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(status);
            }
            return this;
        }

        public Builder clearError() {
            if (this.errorBuilder_ == null) {
                this.error_ = null;
                onChanged();
            } else {
                this.error_ = null;
                this.errorBuilder_ = null;
            }
            return this;
        }

        public Status.Builder getErrorBuilder() {
            onChanged();
            return getErrorFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public StatusOrBuilder getErrorOrBuilder() {
            SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Status status = this.error_;
            return status == null ? Status.getDefaultInstance() : status;
        }

        private SingleFieldBuilderV3<Status, Status.Builder, StatusOrBuilder> getErrorFieldBuilder() {
            if (this.errorBuilder_ == null) {
                this.errorBuilder_ = new SingleFieldBuilderV3<>(getError(), getParentForChildren(), isClean());
                this.error_ = null;
            }
            return this.errorBuilder_;
        }

        private void ensureResultsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.results_ = new ArrayList(this.results_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public List<StreamingRecognitionResult> getResultsList() {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.results_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public int getResultsCount() {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.results_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public StreamingRecognitionResult getResults(int i) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.results_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setResults(int i, StreamingRecognitionResult streamingRecognitionResult) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                streamingRecognitionResult.getClass();
                ensureResultsIsMutable();
                this.results_.set(i, streamingRecognitionResult);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, streamingRecognitionResult);
            }
            return this;
        }

        public Builder setResults(int i, StreamingRecognitionResult.Builder builder) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addResults(StreamingRecognitionResult streamingRecognitionResult) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                streamingRecognitionResult.getClass();
                ensureResultsIsMutable();
                this.results_.add(streamingRecognitionResult);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(streamingRecognitionResult);
            }
            return this;
        }

        public Builder addResults(int i, StreamingRecognitionResult streamingRecognitionResult) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                streamingRecognitionResult.getClass();
                ensureResultsIsMutable();
                this.results_.add(i, streamingRecognitionResult);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, streamingRecognitionResult);
            }
            return this;
        }

        public Builder addResults(StreamingRecognitionResult.Builder builder) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addResults(int i, StreamingRecognitionResult.Builder builder) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllResults(Iterable<? extends StreamingRecognitionResult> iterable) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.results_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearResults() {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.results_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeResults(int i) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public StreamingRecognitionResult.Builder getResultsBuilder(int i) {
            return getResultsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public StreamingRecognitionResultOrBuilder getResultsOrBuilder(int i) {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.results_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public List<? extends StreamingRecognitionResultOrBuilder> getResultsOrBuilderList() {
            RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.results_);
        }

        public StreamingRecognitionResult.Builder addResultsBuilder() {
            return getResultsFieldBuilder().addBuilder(StreamingRecognitionResult.getDefaultInstance());
        }

        public StreamingRecognitionResult.Builder addResultsBuilder(int i) {
            return getResultsFieldBuilder().addBuilder(i, StreamingRecognitionResult.getDefaultInstance());
        }

        public List<StreamingRecognitionResult.Builder> getResultsBuilderList() {
            return getResultsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<StreamingRecognitionResult, StreamingRecognitionResult.Builder, StreamingRecognitionResultOrBuilder> getResultsFieldBuilder() {
            if (this.resultsBuilder_ == null) {
                this.resultsBuilder_ = new RepeatedFieldBuilderV3<>(this.results_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.results_ = null;
            }
            return this.resultsBuilder_;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public int getSpeechEventTypeValue() {
            return this.speechEventType_;
        }

        public Builder setSpeechEventTypeValue(int i) {
            this.speechEventType_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.StreamingRecognizeResponseOrBuilder
        public SpeechEventType getSpeechEventType() {
            SpeechEventType valueOf = SpeechEventType.valueOf(this.speechEventType_);
            return valueOf == null ? SpeechEventType.UNRECOGNIZED : valueOf;
        }

        public Builder setSpeechEventType(SpeechEventType speechEventType) {
            speechEventType.getClass();
            this.speechEventType_ = speechEventType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearSpeechEventType() {
            this.speechEventType_ = 0;
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

    public static StreamingRecognizeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<StreamingRecognizeResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<StreamingRecognizeResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public StreamingRecognizeResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
