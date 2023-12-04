package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.SpeechRecognitionAlternative;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class SpeechRecognitionResult extends GeneratedMessageV3 implements SpeechRecognitionResultOrBuilder {
    public static final int ALTERNATIVES_FIELD_NUMBER = 1;
    public static final int CHANNEL_TAG_FIELD_NUMBER = 2;
    private static final SpeechRecognitionResult DEFAULT_INSTANCE = new SpeechRecognitionResult();
    private static final Parser<SpeechRecognitionResult> PARSER = new AbstractParser<SpeechRecognitionResult>() { // from class: com.google.cloud.speech.v1.SpeechRecognitionResult.1
        @Override // com.google.protobuf.Parser
        public SpeechRecognitionResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SpeechRecognitionResult(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private List<SpeechRecognitionAlternative> alternatives_;
    private int channelTag_;
    private byte memoizedIsInitialized;

    private SpeechRecognitionResult(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private SpeechRecognitionResult() {
        this.memoizedIsInitialized = (byte) -1;
        this.alternatives_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SpeechRecognitionResult();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SpeechRecognitionResult(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (!(z2 & true)) {
                                this.alternatives_ = new ArrayList();
                                z2 |= true;
                            }
                            this.alternatives_.add(codedInputStream.readMessage(SpeechRecognitionAlternative.parser(), extensionRegistryLite));
                        } else if (readTag == 16) {
                            this.channelTag_ = codedInputStream.readInt32();
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
                    this.alternatives_ = Collections.unmodifiableList(this.alternatives_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechRecognitionResult.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
    public List<SpeechRecognitionAlternative> getAlternativesList() {
        return this.alternatives_;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
    public List<? extends SpeechRecognitionAlternativeOrBuilder> getAlternativesOrBuilderList() {
        return this.alternatives_;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
    public int getAlternativesCount() {
        return this.alternatives_.size();
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
    public SpeechRecognitionAlternative getAlternatives(int i) {
        return this.alternatives_.get(i);
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
    public SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(int i) {
        return this.alternatives_.get(i);
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
    public int getChannelTag() {
        return this.channelTag_;
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
        int i2 = this.channelTag_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
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
        int i4 = this.channelTag_;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i4);
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
        if (!(obj instanceof SpeechRecognitionResult)) {
            return super.equals(obj);
        }
        SpeechRecognitionResult speechRecognitionResult = (SpeechRecognitionResult) obj;
        return getAlternativesList().equals(speechRecognitionResult.getAlternativesList()) && getChannelTag() == speechRecognitionResult.getChannelTag() && this.unknownFields.equals(speechRecognitionResult.unknownFields);
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
        int channelTag = (((((hashCode * 37) + 2) * 53) + getChannelTag()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = channelTag;
        return channelTag;
    }

    public static SpeechRecognitionResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SpeechRecognitionResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SpeechRecognitionResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SpeechRecognitionResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SpeechRecognitionResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SpeechRecognitionResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SpeechRecognitionResult parseFrom(InputStream inputStream) throws IOException {
        return (SpeechRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SpeechRecognitionResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeechRecognitionResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeechRecognitionResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SpeechRecognitionResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechRecognitionResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeechRecognitionResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpeechRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SpeechRecognitionResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechRecognitionResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SpeechRecognitionResult speechRecognitionResult) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(speechRecognitionResult);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeechRecognitionResultOrBuilder {
        private RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> alternativesBuilder_;
        private List<SpeechRecognitionAlternative> alternatives_;
        private int bitField0_;
        private int channelTag_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechRecognitionResult.class, Builder.class);
        }

        private Builder() {
            this.alternatives_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.alternatives_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (SpeechRecognitionResult.alwaysUseFieldBuilders) {
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
            this.channelTag_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionResult_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeechRecognitionResult getDefaultInstanceForType() {
            return SpeechRecognitionResult.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeechRecognitionResult build() {
            SpeechRecognitionResult buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeechRecognitionResult buildPartial() {
            SpeechRecognitionResult speechRecognitionResult = new SpeechRecognitionResult(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.alternatives_ = Collections.unmodifiableList(this.alternatives_);
                    this.bitField0_ &= -2;
                }
                speechRecognitionResult.alternatives_ = this.alternatives_;
            } else {
                speechRecognitionResult.alternatives_ = repeatedFieldBuilderV3.build();
            }
            speechRecognitionResult.channelTag_ = this.channelTag_;
            onBuilt();
            return speechRecognitionResult;
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
            if (message instanceof SpeechRecognitionResult) {
                return mergeFrom((SpeechRecognitionResult) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SpeechRecognitionResult speechRecognitionResult) {
            if (speechRecognitionResult == SpeechRecognitionResult.getDefaultInstance()) {
                return this;
            }
            if (this.alternativesBuilder_ == null) {
                if (!speechRecognitionResult.alternatives_.isEmpty()) {
                    if (this.alternatives_.isEmpty()) {
                        this.alternatives_ = speechRecognitionResult.alternatives_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAlternativesIsMutable();
                        this.alternatives_.addAll(speechRecognitionResult.alternatives_);
                    }
                    onChanged();
                }
            } else if (!speechRecognitionResult.alternatives_.isEmpty()) {
                if (!this.alternativesBuilder_.isEmpty()) {
                    this.alternativesBuilder_.addAllMessages(speechRecognitionResult.alternatives_);
                } else {
                    this.alternativesBuilder_.dispose();
                    this.alternativesBuilder_ = null;
                    this.alternatives_ = speechRecognitionResult.alternatives_;
                    this.bitField0_ &= -2;
                    this.alternativesBuilder_ = SpeechRecognitionResult.alwaysUseFieldBuilders ? getAlternativesFieldBuilder() : null;
                }
            }
            if (speechRecognitionResult.getChannelTag() != 0) {
                setChannelTag(speechRecognitionResult.getChannelTag());
            }
            mergeUnknownFields(speechRecognitionResult.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            SpeechRecognitionResult speechRecognitionResult = null;
            try {
                try {
                    SpeechRecognitionResult speechRecognitionResult2 = (SpeechRecognitionResult) SpeechRecognitionResult.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (speechRecognitionResult2 != null) {
                        mergeFrom(speechRecognitionResult2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SpeechRecognitionResult speechRecognitionResult3 = (SpeechRecognitionResult) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        speechRecognitionResult = speechRecognitionResult3;
                        if (speechRecognitionResult != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (speechRecognitionResult != null) {
                    mergeFrom(speechRecognitionResult);
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

        @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
        public List<SpeechRecognitionAlternative> getAlternativesList() {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.alternatives_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
        public int getAlternativesCount() {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.alternatives_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
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

        @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
        public SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionAlternative, SpeechRecognitionAlternative.Builder, SpeechRecognitionAlternativeOrBuilder> repeatedFieldBuilderV3 = this.alternativesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.alternatives_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
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

        @Override // com.google.cloud.speech.v1.SpeechRecognitionResultOrBuilder
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

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static SpeechRecognitionResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SpeechRecognitionResult> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SpeechRecognitionResult> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SpeechRecognitionResult getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
