package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
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
public final class WordInfo extends GeneratedMessageV3 implements WordInfoOrBuilder {
    public static final int CONFIDENCE_FIELD_NUMBER = 4;
    public static final int END_TIME_FIELD_NUMBER = 2;
    public static final int SPEAKER_TAG_FIELD_NUMBER = 5;
    public static final int START_TIME_FIELD_NUMBER = 1;
    public static final int WORD_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private float confidence_;
    private Duration endTime_;
    private byte memoizedIsInitialized;
    private int speakerTag_;
    private Duration startTime_;
    private volatile Object word_;
    private static final WordInfo DEFAULT_INSTANCE = new WordInfo();
    private static final Parser<WordInfo> PARSER = new AbstractParser<WordInfo>() { // from class: com.google.cloud.speech.v1p1beta1.WordInfo.1
        @Override // com.google.protobuf.Parser
        public WordInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new WordInfo(codedInputStream, extensionRegistryLite);
        }
    };

    private WordInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private WordInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.word_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new WordInfo();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private WordInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        Duration.Builder builder;
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            Duration duration = this.startTime_;
                            builder = duration != null ? duration.toBuilder() : null;
                            Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                            this.startTime_ = duration2;
                            if (builder != null) {
                                builder.mergeFrom(duration2);
                                this.startTime_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            Duration duration3 = this.endTime_;
                            builder = duration3 != null ? duration3.toBuilder() : null;
                            Duration duration4 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                            this.endTime_ = duration4;
                            if (builder != null) {
                                builder.mergeFrom(duration4);
                                this.endTime_ = builder.buildPartial();
                            }
                        } else if (readTag == 26) {
                            this.word_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 37) {
                            this.confidence_ = codedInputStream.readFloat();
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
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_WordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WordInfo.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public boolean hasStartTime() {
        return this.startTime_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public Duration getStartTime() {
        Duration duration = this.startTime_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public DurationOrBuilder getStartTimeOrBuilder() {
        return getStartTime();
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public boolean hasEndTime() {
        return this.endTime_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public Duration getEndTime() {
        Duration duration = this.endTime_;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public DurationOrBuilder getEndTimeOrBuilder() {
        return getEndTime();
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public String getWord() {
        Object obj = this.word_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.word_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public ByteString getWordBytes() {
        Object obj = this.word_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.word_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
    public float getConfidence() {
        return this.confidence_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
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
        if (this.startTime_ != null) {
            codedOutputStream.writeMessage(1, getStartTime());
        }
        if (this.endTime_ != null) {
            codedOutputStream.writeMessage(2, getEndTime());
        }
        if (!getWordBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.word_);
        }
        float f = this.confidence_;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(4, f);
        }
        int i = this.speakerTag_;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.startTime_ != null ? 0 + CodedOutputStream.computeMessageSize(1, getStartTime()) : 0;
        if (this.endTime_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getEndTime());
        }
        if (!getWordBytes().isEmpty()) {
            computeMessageSize += GeneratedMessageV3.computeStringSize(3, this.word_);
        }
        float f = this.confidence_;
        if (f != 0.0f) {
            computeMessageSize += CodedOutputStream.computeFloatSize(4, f);
        }
        int i2 = this.speakerTag_;
        if (i2 != 0) {
            computeMessageSize += CodedOutputStream.computeInt32Size(5, i2);
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
        if (!(obj instanceof WordInfo)) {
            return super.equals(obj);
        }
        WordInfo wordInfo = (WordInfo) obj;
        if (hasStartTime() != wordInfo.hasStartTime()) {
            return false;
        }
        if ((!hasStartTime() || getStartTime().equals(wordInfo.getStartTime())) && hasEndTime() == wordInfo.hasEndTime()) {
            return (!hasEndTime() || getEndTime().equals(wordInfo.getEndTime())) && getWord().equals(wordInfo.getWord()) && Float.floatToIntBits(getConfidence()) == Float.floatToIntBits(wordInfo.getConfidence()) && getSpeakerTag() == wordInfo.getSpeakerTag() && this.unknownFields.equals(wordInfo.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasStartTime()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getStartTime().hashCode();
        }
        if (hasEndTime()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getEndTime().hashCode();
        }
        int hashCode2 = (((((((((((((hashCode * 37) + 3) * 53) + getWord().hashCode()) * 37) + 4) * 53) + Float.floatToIntBits(getConfidence())) * 37) + 5) * 53) + getSpeakerTag()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static WordInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static WordInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static WordInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static WordInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static WordInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static WordInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static WordInfo parseFrom(InputStream inputStream) throws IOException {
        return (WordInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static WordInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WordInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WordInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WordInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static WordInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WordInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WordInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WordInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static WordInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WordInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(WordInfo wordInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(wordInfo);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WordInfoOrBuilder {
        private float confidence_;
        private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> endTimeBuilder_;
        private Duration endTime_;
        private int speakerTag_;
        private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> startTimeBuilder_;
        private Duration startTime_;
        private Object word_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_WordInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(WordInfo.class, Builder.class);
        }

        private Builder() {
            this.word_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.word_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = WordInfo.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.startTimeBuilder_ == null) {
                this.startTime_ = null;
            } else {
                this.startTime_ = null;
                this.startTimeBuilder_ = null;
            }
            if (this.endTimeBuilder_ == null) {
                this.endTime_ = null;
            } else {
                this.endTime_ = null;
                this.endTimeBuilder_ = null;
            }
            this.word_ = "";
            this.confidence_ = 0.0f;
            this.speakerTag_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_WordInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WordInfo getDefaultInstanceForType() {
            return WordInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public WordInfo build() {
            WordInfo buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public WordInfo buildPartial() {
            WordInfo wordInfo = new WordInfo(this);
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                wordInfo.startTime_ = this.startTime_;
            } else {
                wordInfo.startTime_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.endTimeBuilder_;
            if (singleFieldBuilderV32 == null) {
                wordInfo.endTime_ = this.endTime_;
            } else {
                wordInfo.endTime_ = singleFieldBuilderV32.build();
            }
            wordInfo.word_ = this.word_;
            wordInfo.confidence_ = this.confidence_;
            wordInfo.speakerTag_ = this.speakerTag_;
            onBuilt();
            return wordInfo;
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
            if (message instanceof WordInfo) {
                return mergeFrom((WordInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(WordInfo wordInfo) {
            if (wordInfo == WordInfo.getDefaultInstance()) {
                return this;
            }
            if (wordInfo.hasStartTime()) {
                mergeStartTime(wordInfo.getStartTime());
            }
            if (wordInfo.hasEndTime()) {
                mergeEndTime(wordInfo.getEndTime());
            }
            if (!wordInfo.getWord().isEmpty()) {
                this.word_ = wordInfo.word_;
                onChanged();
            }
            if (wordInfo.getConfidence() != 0.0f) {
                setConfidence(wordInfo.getConfidence());
            }
            if (wordInfo.getSpeakerTag() != 0) {
                setSpeakerTag(wordInfo.getSpeakerTag());
            }
            mergeUnknownFields(wordInfo.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            WordInfo wordInfo = null;
            try {
                try {
                    WordInfo wordInfo2 = (WordInfo) WordInfo.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (wordInfo2 != null) {
                        mergeFrom(wordInfo2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    WordInfo wordInfo3 = (WordInfo) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        wordInfo = wordInfo3;
                        if (wordInfo != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (wordInfo != null) {
                    mergeFrom(wordInfo);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public boolean hasStartTime() {
            return (this.startTimeBuilder_ == null && this.startTime_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public Duration getStartTime() {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Duration duration = this.startTime_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setStartTime(Duration duration) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                duration.getClass();
                this.startTime_ = duration;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(duration);
            }
            return this;
        }

        public Builder setStartTime(Duration.Builder builder) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.startTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeStartTime(Duration duration) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Duration duration2 = this.startTime_;
                if (duration2 != null) {
                    this.startTime_ = Duration.newBuilder(duration2).mergeFrom(duration).buildPartial();
                } else {
                    this.startTime_ = duration;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(duration);
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

        public Duration.Builder getStartTimeBuilder() {
            onChanged();
            return getStartTimeFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public DurationOrBuilder getStartTimeOrBuilder() {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.startTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Duration duration = this.startTime_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getStartTimeFieldBuilder() {
            if (this.startTimeBuilder_ == null) {
                this.startTimeBuilder_ = new SingleFieldBuilderV3<>(getStartTime(), getParentForChildren(), isClean());
                this.startTime_ = null;
            }
            return this.startTimeBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public boolean hasEndTime() {
            return (this.endTimeBuilder_ == null && this.endTime_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public Duration getEndTime() {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.endTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Duration duration = this.endTime_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setEndTime(Duration duration) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.endTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                duration.getClass();
                this.endTime_ = duration;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(duration);
            }
            return this;
        }

        public Builder setEndTime(Duration.Builder builder) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.endTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.endTime_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeEndTime(Duration duration) {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.endTimeBuilder_;
            if (singleFieldBuilderV3 == null) {
                Duration duration2 = this.endTime_;
                if (duration2 != null) {
                    this.endTime_ = Duration.newBuilder(duration2).mergeFrom(duration).buildPartial();
                } else {
                    this.endTime_ = duration;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(duration);
            }
            return this;
        }

        public Builder clearEndTime() {
            if (this.endTimeBuilder_ == null) {
                this.endTime_ = null;
                onChanged();
            } else {
                this.endTime_ = null;
                this.endTimeBuilder_ = null;
            }
            return this;
        }

        public Duration.Builder getEndTimeBuilder() {
            onChanged();
            return getEndTimeFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public DurationOrBuilder getEndTimeOrBuilder() {
            SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.endTimeBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Duration duration = this.endTime_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getEndTimeFieldBuilder() {
            if (this.endTimeBuilder_ == null) {
                this.endTimeBuilder_ = new SingleFieldBuilderV3<>(getEndTime(), getParentForChildren(), isClean());
                this.endTime_ = null;
            }
            return this.endTimeBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public String getWord() {
            Object obj = this.word_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.word_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public ByteString getWordBytes() {
            Object obj = this.word_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.word_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setWord(String str) {
            str.getClass();
            this.word_ = str;
            onChanged();
            return this;
        }

        public Builder clearWord() {
            this.word_ = WordInfo.getDefaultInstance().getWord();
            onChanged();
            return this;
        }

        public Builder setWordBytes(ByteString byteString) {
            byteString.getClass();
            WordInfo.checkByteStringIsUtf8(byteString);
            this.word_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public float getConfidence() {
            return this.confidence_;
        }

        public Builder setConfidence(float f) {
            this.confidence_ = f;
            onChanged();
            return this;
        }

        public Builder clearConfidence() {
            this.confidence_ = 0.0f;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.WordInfoOrBuilder
        public int getSpeakerTag() {
            return this.speakerTag_;
        }

        public Builder setSpeakerTag(int i) {
            this.speakerTag_ = i;
            onChanged();
            return this;
        }

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

    public static WordInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<WordInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<WordInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public WordInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
