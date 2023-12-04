package com.google.cloud.speech.v1p1beta1;

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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class LongRunningRecognizeMetadata extends GeneratedMessageV3 implements LongRunningRecognizeMetadataOrBuilder {
    public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 3;
    public static final int PROGRESS_PERCENT_FIELD_NUMBER = 1;
    public static final int START_TIME_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private Timestamp lastUpdateTime_;
    private byte memoizedIsInitialized;
    private int progressPercent_;
    private Timestamp startTime_;
    private volatile Object uri_;
    private static final LongRunningRecognizeMetadata DEFAULT_INSTANCE = new LongRunningRecognizeMetadata();
    private static final Parser<LongRunningRecognizeMetadata> PARSER = new AbstractParser<LongRunningRecognizeMetadata>() { // from class: com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata.1
        @Override // com.google.protobuf.Parser
        public LongRunningRecognizeMetadata parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LongRunningRecognizeMetadata(codedInputStream, extensionRegistryLite);
        }
    };

    private LongRunningRecognizeMetadata(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private LongRunningRecognizeMetadata() {
        this.memoizedIsInitialized = (byte) -1;
        this.uri_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new LongRunningRecognizeMetadata();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private LongRunningRecognizeMetadata(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Timestamp.Builder builder;
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag != 8) {
                                if (readTag == 18) {
                                    Timestamp timestamp = this.startTime_;
                                    builder = timestamp != null ? timestamp.toBuilder() : null;
                                    Timestamp timestamp2 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.startTime_ = timestamp2;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp2);
                                        this.startTime_ = builder.buildPartial();
                                    }
                                } else if (readTag == 26) {
                                    Timestamp timestamp3 = this.lastUpdateTime_;
                                    builder = timestamp3 != null ? timestamp3.toBuilder() : null;
                                    Timestamp timestamp4 = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    this.lastUpdateTime_ = timestamp4;
                                    if (builder != null) {
                                        builder.mergeFrom(timestamp4);
                                        this.lastUpdateTime_ = builder.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    this.uri_ = codedInputStream.readStringRequireUtf8();
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            } else {
                                this.progressPercent_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
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
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(LongRunningRecognizeMetadata.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public int getProgressPercent() {
        return this.progressPercent_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public TimestampOrBuilder getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public boolean hasLastUpdateTime() {
        return this.lastUpdateTime_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public Timestamp getLastUpdateTime() {
        Timestamp timestamp = this.lastUpdateTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public TimestampOrBuilder getLastUpdateTimeOrBuilder() {
        return getLastUpdateTime();
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public String getUri() {
        Object obj = this.uri_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.uri_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
    public ByteString getUriBytes() {
        Object obj = this.uri_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.uri_ = copyFromUtf8;
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
        int i = this.progressPercent_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (this.startTime_ != null) {
            codedOutputStream.writeMessage(2, getStartTime());
        }
        if (this.lastUpdateTime_ != null) {
            codedOutputStream.writeMessage(3, getLastUpdateTime());
        }
        if (!getUriBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.uri_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.progressPercent_;
        int computeInt32Size = i2 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i2) : 0;
        if (this.startTime_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(2, getStartTime());
        }
        if (this.lastUpdateTime_ != null) {
            computeInt32Size += CodedOutputStream.computeMessageSize(3, getLastUpdateTime());
        }
        if (!getUriBytes().isEmpty()) {
            computeInt32Size += GeneratedMessageV3.computeStringSize(4, this.uri_);
        }
        int serializedSize = computeInt32Size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongRunningRecognizeMetadata)) {
            return super.equals(obj);
        }
        LongRunningRecognizeMetadata longRunningRecognizeMetadata = (LongRunningRecognizeMetadata) obj;
        if (getProgressPercent() == longRunningRecognizeMetadata.getProgressPercent() && hasStartTime() == longRunningRecognizeMetadata.hasStartTime()) {
            if ((!hasStartTime() || getStartTime().equals(longRunningRecognizeMetadata.getStartTime())) && hasLastUpdateTime() == longRunningRecognizeMetadata.hasLastUpdateTime()) {
                return (!hasLastUpdateTime() || getLastUpdateTime().equals(longRunningRecognizeMetadata.getLastUpdateTime())) && getUri().equals(longRunningRecognizeMetadata.getUri()) && this.unknownFields.equals(longRunningRecognizeMetadata.unknownFields);
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
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getProgressPercent();
        if (hasStartTime()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getStartTime().hashCode();
        }
        if (hasLastUpdateTime()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getLastUpdateTime().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 4) * 53) + getUri().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static LongRunningRecognizeMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static LongRunningRecognizeMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LongRunningRecognizeMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static LongRunningRecognizeMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static LongRunningRecognizeMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static LongRunningRecognizeMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LongRunningRecognizeMetadata parseFrom(InputStream inputStream) throws IOException {
        return (LongRunningRecognizeMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LongRunningRecognizeMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LongRunningRecognizeMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LongRunningRecognizeMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LongRunningRecognizeMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LongRunningRecognizeMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LongRunningRecognizeMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LongRunningRecognizeMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LongRunningRecognizeMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LongRunningRecognizeMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LongRunningRecognizeMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LongRunningRecognizeMetadata longRunningRecognizeMetadata) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(longRunningRecognizeMetadata);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LongRunningRecognizeMetadataOrBuilder {
        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastUpdateTimeBuilder_;
        private Timestamp lastUpdateTime_;
        private int progressPercent_;
        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> startTimeBuilder_;
        private Timestamp startTime_;
        private Object uri_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(LongRunningRecognizeMetadata.class, Builder.class);
        }

        private Builder() {
            this.uri_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.uri_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = LongRunningRecognizeMetadata.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.progressPercent_ = 0;
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            if (this.lastUpdateTimeBuilder_ == null) {
                this.lastUpdateTime_ = null;
            } else {
                this.lastUpdateTime_ = null;
                this.lastUpdateTimeBuilder_ = null;
            }
            this.uri_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_LongRunningRecognizeMetadata_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LongRunningRecognizeMetadata getDefaultInstanceForType() {
            return LongRunningRecognizeMetadata.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LongRunningRecognizeMetadata build() {
            LongRunningRecognizeMetadata buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LongRunningRecognizeMetadata buildPartial() {
            LongRunningRecognizeMetadata longRunningRecognizeMetadata = new LongRunningRecognizeMetadata(this);
            longRunningRecognizeMetadata.progressPercent_ = this.progressPercent_;
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                longRunningRecognizeMetadata.startTime_ = this.startTime_;
            } else {
                longRunningRecognizeMetadata.startTime_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV32 = this.lastUpdateTimeBuilder_;
            if (singleFieldBuilderV32 == null) {
                longRunningRecognizeMetadata.lastUpdateTime_ = this.lastUpdateTime_;
            } else {
                longRunningRecognizeMetadata.lastUpdateTime_ = singleFieldBuilderV32.build();
            }
            longRunningRecognizeMetadata.uri_ = this.uri_;
            onBuilt();
            return longRunningRecognizeMetadata;
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
            if (message instanceof LongRunningRecognizeMetadata) {
                return mergeFrom((LongRunningRecognizeMetadata) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LongRunningRecognizeMetadata longRunningRecognizeMetadata) {
            if (longRunningRecognizeMetadata == LongRunningRecognizeMetadata.getDefaultInstance()) {
                return this;
            }
            if (longRunningRecognizeMetadata.getProgressPercent() != 0) {
                setProgressPercent(longRunningRecognizeMetadata.getProgressPercent());
            }
            if (longRunningRecognizeMetadata.hasStartTime()) {
                mergeStartTime(longRunningRecognizeMetadata.getStartTime());
            }
            if (longRunningRecognizeMetadata.hasLastUpdateTime()) {
                mergeLastUpdateTime(longRunningRecognizeMetadata.getLastUpdateTime());
            }
            if (!longRunningRecognizeMetadata.getUri().isEmpty()) {
                this.uri_ = longRunningRecognizeMetadata.uri_;
                onChanged();
            }
            mergeUnknownFields(longRunningRecognizeMetadata.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            LongRunningRecognizeMetadata longRunningRecognizeMetadata = null;
            try {
                try {
                    LongRunningRecognizeMetadata longRunningRecognizeMetadata2 = (LongRunningRecognizeMetadata) LongRunningRecognizeMetadata.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (longRunningRecognizeMetadata2 != null) {
                        mergeFrom(longRunningRecognizeMetadata2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    LongRunningRecognizeMetadata longRunningRecognizeMetadata3 = (LongRunningRecognizeMetadata) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        longRunningRecognizeMetadata = longRunningRecognizeMetadata3;
                        if (longRunningRecognizeMetadata != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (longRunningRecognizeMetadata != null) {
                    mergeFrom(longRunningRecognizeMetadata);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public int getProgressPercent() {
            return this.progressPercent_;
        }

        public Builder setProgressPercent(int i) {
            this.progressPercent_ = i;
            onChanged();
            return this;
        }

        public Builder clearProgressPercent() {
            this.progressPercent_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public boolean hasStartTime() {
            return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public Timestamp getStartTime() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.startTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setStartTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.startTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setStartTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.startTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeStartTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.startTime_;
                if (timestamp2 != null) {
                    this.startTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.startTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearStartTime() {
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
                onChanged();
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getStartTimeBuilder() {
            onChanged();
            return getStartTimeFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public TimestampOrBuilder getStartTimeOrBuilder() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.startTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getStartTimeFieldBuilder() {
            if (this.startTimeBuilder_ == null) {
                this.startTimeBuilder_ = new SingleFieldBuilderV3<>(getStartTime(), getParentForChildren(), isClean());
                this.startTime_ = null;
            }
            return this.startTimeBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public boolean hasLastUpdateTime() {
            return (this.lastUpdateTimeBuilder_ == null && this.lastUpdateTime_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public Timestamp getLastUpdateTime() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.lastUpdateTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp = this.lastUpdateTime_;
                return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setLastUpdateTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.lastUpdateTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                timestamp.getClass();
                this.lastUpdateTime_ = timestamp;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(timestamp);
            }
            return this;
        }

        public Builder setLastUpdateTime(Timestamp.Builder builder) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.lastUpdateTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.lastUpdateTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeLastUpdateTime(Timestamp timestamp) {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.lastUpdateTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Timestamp timestamp2 = this.lastUpdateTime_;
                if (timestamp2 != null) {
                    this.lastUpdateTime_ = Timestamp.newBuilder(timestamp2).mergeFrom(timestamp).buildPartial();
                } else {
                    this.lastUpdateTime_ = timestamp;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(timestamp);
            }
            return this;
        }

        public Builder clearLastUpdateTime() {
            if (this.lastUpdateTimeBuilder_ == null) {
                this.lastUpdateTime_ = null;
                onChanged();
            } else {
                this.lastUpdateTime_ = null;
                this.lastUpdateTimeBuilder_ = null;
            }
            return this;
        }

        public Timestamp.Builder getLastUpdateTimeBuilder() {
            onChanged();
            return getLastUpdateTimeFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public TimestampOrBuilder getLastUpdateTimeOrBuilder() {
            SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> singleFieldBuilderV3 = this.lastUpdateTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Timestamp timestamp = this.lastUpdateTime_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastUpdateTimeFieldBuilder() {
            if (this.lastUpdateTimeBuilder_ == null) {
                this.lastUpdateTimeBuilder_ = new SingleFieldBuilderV3<>(getLastUpdateTime(), getParentForChildren(), isClean());
                this.lastUpdateTime_ = null;
            }
            return this.lastUpdateTimeBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public String getUri() {
            Object obj = this.uri_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.uri_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadataOrBuilder
        public ByteString getUriBytes() {
            Object obj = this.uri_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.uri_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setUri(String str) {
            str.getClass();
            this.uri_ = str;
            onChanged();
            return this;
        }

        public Builder clearUri() {
            this.uri_ = LongRunningRecognizeMetadata.getDefaultInstance().getUri();
            onChanged();
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            byteString.getClass();
            LongRunningRecognizeMetadata.checkByteStringIsUtf8(byteString);
            this.uri_ = byteString;
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

    public static LongRunningRecognizeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LongRunningRecognizeMetadata> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<LongRunningRecognizeMetadata> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public LongRunningRecognizeMetadata getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
