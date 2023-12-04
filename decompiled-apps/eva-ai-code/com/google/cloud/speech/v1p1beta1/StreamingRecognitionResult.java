package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
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
public final class StreamingRecognitionResult extends GeneratedMessageV3 implements StreamingRecognitionResultOrBuilder {
    public static final int ALTERNATIVES_FIELD_NUMBER = 1;
    public static final int CHANNEL_TAG_FIELD_NUMBER = 5;
    public static final int IS_FINAL_FIELD_NUMBER = 2;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 6;
    public static final int RESULT_END_TIME_FIELD_NUMBER = 4;
    public static final int STABILITY_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private List<SpeechRecognitionAlternative> alternatives_;
    private int channelTag_;
    private boolean isFinal_;
    private volatile Object languageCode_;
    private byte memoizedIsInitialized;
    private Duration resultEndTime_;
    private float stability_;
    private static final StreamingRecognitionResult DEFAULT_INSTANCE = new StreamingRecognitionResult();
    private static final Parser<StreamingRecognitionResult> PARSER = new AbstractParser<StreamingRecognitionResult>() { // from class: com.google.cloud.speech.v1p1beta1.StreamingRecognitionResult.1
        @Override // com.google.protobuf.Parser
        public StreamingRecognitionResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new StreamingRecognitionResult(codedInputStream, extensionRegistryLite);
        }
    };

    private StreamingRecognitionResult(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private StreamingRecognitionResult() {
        this.memoizedIsInitialized = (byte) -1;
        this.alternatives_ = Collections.emptyList();
        this.languageCode_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new StreamingRecognitionResult();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StreamingRecognitionResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!(z2 & true)) {
                                    this.alternatives_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.alternatives_.add(codedInputStream.readMessage(SpeechRecognitionAlternative.parser(), extensionRegistryLite));
                            } else if (readTag == 16) {
                                this.isFinal_ = codedInputStream.readBool();
                            } else if (readTag == 29) {
                                this.stability_ = codedInputStream.readFloat();
                            } else if (readTag == 34) {
                                Duration duration = this.resultEndTime_;
                                Duration.Builder builder = duration != null ? duration.toBuilder() : null;
                                Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                this.resultEndTime_ = duration2;
                                if (builder != null) {
                                    builder.mergeFrom(duration2);
                                    this.resultEndTime_ = builder.buildPartial();
                                }
                            } else if (readTag == 40) {
                                this.channelTag_ = codedInputStream.readInt32();
                            } else if (readTag == 50) {
                                this.languageCode_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
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
                if (z2 & true) {
                    this.alternatives_ = Collections.unmodifiableList(this.alternatives_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognitionResult.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public List<SpeechRecognitionAlternative> getAlternativesList() {
        return this.alternatives_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public List<? extends SpeechRecognitionAlternativeOrBuilder> getAlternativesOrBuilderList() {
        return this.alternatives_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public int getAlternativesCount() {
        return this.alternatives_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public SpeechRecognitionAlternative getAlternatives(int i) {
        return this.alternatives_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(int i) {
        return this.alternatives_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public boolean getIsFinal() {
        return this.isFinal_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public float getStability() {
        return this.stability_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public boolean hasResultEndTime() {
        return this.resultEndTime_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public Duration getResultEndTime() {
        Duration duration = this.resultEndTime_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public DurationOrBuilder getResultEndTimeOrBuilder() {
        return getResultEndTime();
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public int getChannelTag() {
        return this.channelTag_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public String getLanguageCode() {
        Object obj = this.languageCode_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.languageCode_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
    public ByteString getLanguageCodeBytes() {
        Object obj = this.languageCode_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.languageCode_ = copyFromUtf8;
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
        for (int i = 0; i < this.alternatives_.size(); i++) {
            codedOutputStream.writeMessage(1, this.alternatives_.get(i));
        }
        boolean z = this.isFinal_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        float f = this.stability_;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(3, f);
        }
        if (this.resultEndTime_ != null) {
            codedOutputStream.writeMessage(4, getResultEndTime());
        }
        int i2 = this.channelTag_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(5, i2);
        }
        if (!getLanguageCodeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.languageCode_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.alternatives_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.alternatives_.get(i3));
        }
        boolean z = this.isFinal_;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(2, z);
        }
        float f = this.stability_;
        if (f != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(3, f);
        }
        if (this.resultEndTime_ != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getResultEndTime());
        }
        int i4 = this.channelTag_;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(5, i4);
        }
        if (!getLanguageCodeBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(6, this.languageCode_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamingRecognitionResult)) {
            return super.equals(obj);
        }
        StreamingRecognitionResult streamingRecognitionResult = (StreamingRecognitionResult) obj;
        if (getAlternativesList().equals(streamingRecognitionResult.getAlternativesList()) && getIsFinal() == streamingRecognitionResult.getIsFinal() && Float.floatToIntBits(getStability()) == Float.floatToIntBits(streamingRecognitionResult.getStability()) && hasResultEndTime() == streamingRecognitionResult.hasResultEndTime()) {
            return (!hasResultEndTime() || getResultEndTime().equals(streamingRecognitionResult.getResultEndTime())) && getChannelTag() == streamingRecognitionResult.getChannelTag() && getLanguageCode().equals(streamingRecognitionResult.getLanguageCode()) && this.unknownFields.equals(streamingRecognitionResult.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getAlternativesCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getAlternativesList().hashCode();
        }
        int hashBoolean = (((((((hashCode * 37) + 2) * 53) + Internal.hashBoolean(getIsFinal())) * 37) + 3) * 53) + Float.floatToIntBits(getStability());
        if (hasResultEndTime()) {
            hashBoolean = (((hashBoolean * 37) + 4) * 53) + getResultEndTime().hashCode();
        }
        int channelTag = (((((((((hashBoolean * 37) + 5) * 53) + getChannelTag()) * 37) + 6) * 53) + getLanguageCode().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = channelTag;
        return channelTag;
    }

    public static StreamingRecognitionResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static StreamingRecognitionResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static StreamingRecognitionResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static StreamingRecognitionResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static StreamingRecognitionResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static StreamingRecognitionResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static StreamingRecognitionResult parseFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognitionResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognitionResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StreamingRecognitionResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static StreamingRecognitionResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognitionResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static StreamingRecognitionResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StreamingRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static StreamingRecognitionResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StreamingRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(StreamingRecognitionResult streamingRecognitionResult) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(streamingRecognitionResult);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StreamingRecognitionResultOrBuilder {
        private RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> alternativesBuilder_;
        private List<SpeechRecognitionAlternative> alternatives_;
        private int bitField0_;
        private int channelTag_;
        private boolean isFinal_;
        private Object languageCode_;
        private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> resultEndTimeBuilder_;
        private Duration resultEndTime_;
        private float stability_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_fieldAccessorTable.ensureFieldAccessorsInitialized(StreamingRecognitionResult.class, Builder.class);
        }

        private Builder() {
            this.alternatives_ = Collections.emptyList();
            this.languageCode_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.alternatives_ = Collections.emptyList();
            this.languageCode_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (StreamingRecognitionResult.alwaysUseFieldBuilders) {
                getAlternativesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.alternatives_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.isFinal_ = false;
            this.stability_ = 0.0f;
            if (this.resultEndTimeBuilder_ == null) {
                this.resultEndTime_ = null;
            } else {
                this.resultEndTime_ = null;
                this.resultEndTimeBuilder_ = null;
            }
            this.channelTag_ = 0;
            this.languageCode_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_StreamingRecognitionResult_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StreamingRecognitionResult getDefaultInstanceForType() {
            return StreamingRecognitionResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognitionResult build() {
            StreamingRecognitionResult buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public StreamingRecognitionResult buildPartial() {
            StreamingRecognitionResult streamingRecognitionResult = new StreamingRecognitionResult(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.alternatives_ = Collections.unmodifiableList(this.alternatives_);
                    this.bitField0_ &= -2;
                }
                streamingRecognitionResult.alternatives_ = this.alternatives_;
            } else {
                streamingRecognitionResult.alternatives_ = repeatedFieldBuilderV3.build();
            }
            streamingRecognitionResult.isFinal_ = this.isFinal_;
            streamingRecognitionResult.stability_ = this.stability_;
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.resultEndTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                streamingRecognitionResult.resultEndTime_ = this.resultEndTime_;
            } else {
                streamingRecognitionResult.resultEndTime_ = singleFieldBuilderV3.build();
            }
            streamingRecognitionResult.channelTag_ = this.channelTag_;
            streamingRecognitionResult.languageCode_ = this.languageCode_;
            onBuilt();
            return streamingRecognitionResult;
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
            if (message instanceof StreamingRecognitionResult) {
                return mergeFrom((StreamingRecognitionResult) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(StreamingRecognitionResult streamingRecognitionResult) {
            if (streamingRecognitionResult == StreamingRecognitionResult.getDefaultInstance()) {
                return this;
            }
            if (this.alternativesBuilder_ == null) {
                if (!streamingRecognitionResult.alternatives_.isEmpty()) {
                    if (this.alternatives_.isEmpty()) {
                        this.alternatives_ = streamingRecognitionResult.alternatives_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAlternativesIsMutable();
                        this.alternatives_.addAll(streamingRecognitionResult.alternatives_);
                    }
                    onChanged();
                }
            } else if (!streamingRecognitionResult.alternatives_.isEmpty()) {
                if (!this.alternativesBuilder_.isEmpty()) {
                    this.alternativesBuilder_.addAllMessages(streamingRecognitionResult.alternatives_);
                } else {
                    this.alternativesBuilder_.dispose();
                    this.alternativesBuilder_ = null;
                    this.alternatives_ = streamingRecognitionResult.alternatives_;
                    this.bitField0_ &= -2;
                    this.alternativesBuilder_ = StreamingRecognitionResult.alwaysUseFieldBuilders ? getAlternativesFieldBuilder() : null;
                }
            }
            if (streamingRecognitionResult.getIsFinal()) {
                setIsFinal(streamingRecognitionResult.getIsFinal());
            }
            if (streamingRecognitionResult.getStability() != 0.0f) {
                setStability(streamingRecognitionResult.getStability());
            }
            if (streamingRecognitionResult.hasResultEndTime()) {
                mergeResultEndTime(streamingRecognitionResult.getResultEndTime());
            }
            if (streamingRecognitionResult.getChannelTag() != 0) {
                setChannelTag(streamingRecognitionResult.getChannelTag());
            }
            if (!streamingRecognitionResult.getLanguageCode().isEmpty()) {
                this.languageCode_ = streamingRecognitionResult.languageCode_;
                onChanged();
            }
            mergeUnknownFields(streamingRecognitionResult.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            StreamingRecognitionResult streamingRecognitionResult = null;
            try {
                try {
                    StreamingRecognitionResult streamingRecognitionResult2 = (StreamingRecognitionResult) StreamingRecognitionResult.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (streamingRecognitionResult2 != null) {
                        mergeFrom(streamingRecognitionResult2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    StreamingRecognitionResult streamingRecognitionResult3 = (StreamingRecognitionResult) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        streamingRecognitionResult = streamingRecognitionResult3;
                        if (streamingRecognitionResult != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (streamingRecognitionResult != null) {
                    mergeFrom(streamingRecognitionResult);
                }
                throw th;
            }
        }

        private void ensureAlternativesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.alternatives_ = new ArrayList(this.alternatives_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public List<SpeechRecognitionAlternative> getAlternativesList() {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.alternatives_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public int getAlternativesCount() {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.alternatives_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public SpeechRecognitionAlternative getAlternatives(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.alternatives_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setAlternatives(int i, SpeechRecognitionAlternative speechRecognitionAlternative) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechRecognitionAlternative.getClass();
                ensureAlternativesIsMutable();
                this.alternatives_.set(i, speechRecognitionAlternative);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, speechRecognitionAlternative);
            }
            return this;
        }

        public Builder setAlternatives(int i, SpeechRecognitionAlternative.Builder builder) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAlternativesIsMutable();
                this.alternatives_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAlternatives(SpeechRecognitionAlternative speechRecognitionAlternative) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechRecognitionAlternative.getClass();
                ensureAlternativesIsMutable();
                this.alternatives_.add(speechRecognitionAlternative);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(speechRecognitionAlternative);
            }
            return this;
        }

        public Builder addAlternatives(int i, SpeechRecognitionAlternative speechRecognitionAlternative) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechRecognitionAlternative.getClass();
                ensureAlternativesIsMutable();
                this.alternatives_.add(i, speechRecognitionAlternative);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, speechRecognitionAlternative);
            }
            return this;
        }

        public Builder addAlternatives(SpeechRecognitionAlternative.Builder builder) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAlternativesIsMutable();
                this.alternatives_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addAlternatives(int i, SpeechRecognitionAlternative.Builder builder) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAlternativesIsMutable();
                this.alternatives_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllAlternatives(Iterable<? extends SpeechRecognitionAlternative> iterable) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAlternativesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.alternatives_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearAlternatives() {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.alternatives_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeAlternatives(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAlternativesIsMutable();
                this.alternatives_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public SpeechRecognitionAlternative.Builder getAlternativesBuilder(int i) {
            return getAlternativesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.alternatives_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public List<? extends SpeechRecognitionAlternativeOrBuilder> getAlternativesOrBuilderList() {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.alternatives_);
        }

        public SpeechRecognitionAlternative.Builder addAlternativesBuilder() {
            return getAlternativesFieldBuilder().addBuilder(SpeechRecognitionAlternative.getDefaultInstance());
        }

        public SpeechRecognitionAlternative.Builder addAlternativesBuilder(int i) {
            return getAlternativesFieldBuilder().addBuilder(i, SpeechRecognitionAlternative.getDefaultInstance());
        }

        public List<SpeechRecognitionAlternative.Builder> getAlternativesBuilderList() {
            return getAlternativesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> getAlternativesFieldBuilder() {
            if (this.alternativesBuilder_ == null) {
                this.alternativesBuilder_ = new RepeatedFieldBuilderV3<>(this.alternatives_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.alternatives_ = null;
            }
            return this.alternativesBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public boolean getIsFinal() {
            return this.isFinal_;
        }

        public Builder setIsFinal(boolean z) {
            this.isFinal_ = z;
            onChanged();
            return this;
        }

        public Builder clearIsFinal() {
            this.isFinal_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public float getStability() {
            return this.stability_;
        }

        public Builder setStability(float f) {
            this.stability_ = f;
            onChanged();
            return this;
        }

        public Builder clearStability() {
            this.stability_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public boolean hasResultEndTime() {
            return (this.resultEndTimeBuilder_ == null && this.resultEndTime_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public Duration getResultEndTime() {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.resultEndTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Duration duration = this.resultEndTime_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setResultEndTime(Duration duration) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.resultEndTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                duration.getClass();
                this.resultEndTime_ = duration;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(duration);
            }
            return this;
        }

        public Builder setResultEndTime(Duration.Builder builder) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.resultEndTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.resultEndTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeResultEndTime(Duration duration) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.resultEndTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Duration duration2 = this.resultEndTime_;
                if (duration2 != null) {
                    this.resultEndTime_ = Duration.newBuilder(duration2).mergeFrom(duration).buildPartial();
                } else {
                    this.resultEndTime_ = duration;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(duration);
            }
            return this;
        }

        public Builder clearResultEndTime() {
            if (this.resultEndTimeBuilder_ == null) {
                this.resultEndTime_ = null;
                onChanged();
            } else {
                this.resultEndTime_ = null;
                this.resultEndTimeBuilder_ = null;
            }
            return this;
        }

        public Duration.Builder getResultEndTimeBuilder() {
            onChanged();
            return getResultEndTimeFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public DurationOrBuilder getResultEndTimeOrBuilder() {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.resultEndTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Duration duration = this.resultEndTime_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getResultEndTimeFieldBuilder() {
            if (this.resultEndTimeBuilder_ == null) {
                this.resultEndTimeBuilder_ = new SingleFieldBuilderV3<>(getResultEndTime(), getParentForChildren(), isClean());
                this.resultEndTime_ = null;
            }
            return this.resultEndTimeBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public int getChannelTag() {
            return this.channelTag_;
        }

        public Builder setChannelTag(int i) {
            this.channelTag_ = i;
            onChanged();
            return this;
        }

        public Builder clearChannelTag() {
            this.channelTag_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
        public String getLanguageCode() {
            Object obj = this.languageCode_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.languageCode_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.StreamingRecognitionResultOrBuilder
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
            this.languageCode_ = StreamingRecognitionResult.getDefaultInstance().getLanguageCode();
            onChanged();
            return this;
        }

        public Builder setLanguageCodeBytes(ByteString byteString) {
            byteString.getClass();
            StreamingRecognitionResult.checkByteStringIsUtf8(byteString);
            this.languageCode_ = byteString;
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

    public static StreamingRecognitionResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<StreamingRecognitionResult> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<StreamingRecognitionResult> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public StreamingRecognitionResult getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
