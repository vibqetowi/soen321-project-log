package com.google.cloud.speech.v1;

import com.google.cloud.speech.v1.WordInfo;
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
public final class SpeechRecognitionAlternative extends GeneratedMessageV3 implements SpeechRecognitionAlternativeOrBuilder {
    public static final int CONFIDENCE_FIELD_NUMBER = 2;
    private static final SpeechRecognitionAlternative DEFAULT_INSTANCE = new SpeechRecognitionAlternative();
    private static final Parser<SpeechRecognitionAlternative> PARSER = new AbstractParser<SpeechRecognitionAlternative>() { // from class: com.google.cloud.speech.v1.SpeechRecognitionAlternative.1
        @Override // com.google.protobuf.Parser
        public SpeechRecognitionAlternative parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SpeechRecognitionAlternative(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int TRANSCRIPT_FIELD_NUMBER = 1;
    public static final int WORDS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private float confidence_;
    private byte memoizedIsInitialized;
    private volatile Object transcript_;
    private List<WordInfo> words_;

    private SpeechRecognitionAlternative(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private SpeechRecognitionAlternative() {
        this.memoizedIsInitialized = (byte) -1;
        this.transcript_ = "";
        this.words_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SpeechRecognitionAlternative();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SpeechRecognitionAlternative(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.transcript_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 21) {
                                this.confidence_ = codedInputStream.readFloat();
                            } else if (readTag == 26) {
                                if (!(z2 & true)) {
                                    this.words_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.words_.add(codedInputStream.readMessage(WordInfo.parser(), extensionRegistryLite));
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
                    this.words_ = Collections.unmodifiableList(this.words_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechRecognitionAlternative.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public String getTranscript() {
        Object obj = this.transcript_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.transcript_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public ByteString getTranscriptBytes() {
        Object obj = this.transcript_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.transcript_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public float getConfidence() {
        return this.confidence_;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public List<WordInfo> getWordsList() {
        return this.words_;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public List<? extends WordInfoOrBuilder> getWordsOrBuilderList() {
        return this.words_;
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public int getWordsCount() {
        return this.words_.size();
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public WordInfo getWords(int i) {
        return this.words_.get(i);
    }

    @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
    public WordInfoOrBuilder getWordsOrBuilder(int i) {
        return this.words_.get(i);
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
        if (!getTranscriptBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.transcript_);
        }
        float f = this.confidence_;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(2, f);
        }
        for (int i = 0; i < this.words_.size(); i++) {
            codedOutputStream.writeMessage(3, this.words_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getTranscriptBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.transcript_) + 0 : 0;
        float f = this.confidence_;
        if (f != 0.0f) {
            computeStringSize += CodedOutputStream.computeFloatSize(2, f);
        }
        for (int i2 = 0; i2 < this.words_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, this.words_.get(i2));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpeechRecognitionAlternative)) {
            return super.equals(obj);
        }
        SpeechRecognitionAlternative speechRecognitionAlternative = (SpeechRecognitionAlternative) obj;
        return getTranscript().equals(speechRecognitionAlternative.getTranscript()) && Float.floatToIntBits(getConfidence()) == Float.floatToIntBits(speechRecognitionAlternative.getConfidence()) && getWordsList().equals(speechRecognitionAlternative.getWordsList()) && this.unknownFields.equals(speechRecognitionAlternative.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTranscript().hashCode()) * 37) + 2) * 53) + Float.floatToIntBits(getConfidence());
        if (getWordsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getWordsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static SpeechRecognitionAlternative parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SpeechRecognitionAlternative parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SpeechRecognitionAlternative parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SpeechRecognitionAlternative parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SpeechRecognitionAlternative parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SpeechRecognitionAlternative parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SpeechRecognitionAlternative parseFrom(InputStream inputStream) throws IOException {
        return (SpeechRecognitionAlternative) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SpeechRecognitionAlternative parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechRecognitionAlternative) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeechRecognitionAlternative parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeechRecognitionAlternative) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SpeechRecognitionAlternative parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechRecognitionAlternative) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeechRecognitionAlternative parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpeechRecognitionAlternative) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SpeechRecognitionAlternative parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechRecognitionAlternative) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SpeechRecognitionAlternative speechRecognitionAlternative) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(speechRecognitionAlternative);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeechRecognitionAlternativeOrBuilder {
        private int bitField0_;
        private float confidence_;
        private Object transcript_;
        private RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> wordsBuilder_;
        private List<WordInfo> words_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechRecognitionAlternative.class, Builder.class);
        }

        private Builder() {
            this.transcript_ = "";
            this.words_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.transcript_ = "";
            this.words_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (SpeechRecognitionAlternative.alwaysUseFieldBuilders) {
                getWordsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.transcript_ = "";
            this.confidence_ = 0.0f;
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.words_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1_SpeechRecognitionAlternative_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeechRecognitionAlternative getDefaultInstanceForType() {
            return SpeechRecognitionAlternative.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeechRecognitionAlternative build() {
            SpeechRecognitionAlternative buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeechRecognitionAlternative buildPartial() {
            SpeechRecognitionAlternative speechRecognitionAlternative = new SpeechRecognitionAlternative(this);
            speechRecognitionAlternative.transcript_ = this.transcript_;
            speechRecognitionAlternative.confidence_ = this.confidence_;
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                speechRecognitionAlternative.words_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.words_ = Collections.unmodifiableList(this.words_);
                    this.bitField0_ &= -2;
                }
                speechRecognitionAlternative.words_ = this.words_;
            }
            onBuilt();
            return speechRecognitionAlternative;
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
            if (message instanceof SpeechRecognitionAlternative) {
                return mergeFrom((SpeechRecognitionAlternative) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SpeechRecognitionAlternative speechRecognitionAlternative) {
            if (speechRecognitionAlternative == SpeechRecognitionAlternative.getDefaultInstance()) {
                return this;
            }
            if (!speechRecognitionAlternative.getTranscript().isEmpty()) {
                this.transcript_ = speechRecognitionAlternative.transcript_;
                onChanged();
            }
            if (speechRecognitionAlternative.getConfidence() != 0.0f) {
                setConfidence(speechRecognitionAlternative.getConfidence());
            }
            if (this.wordsBuilder_ == null) {
                if (!speechRecognitionAlternative.words_.isEmpty()) {
                    if (this.words_.isEmpty()) {
                        this.words_ = speechRecognitionAlternative.words_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureWordsIsMutable();
                        this.words_.addAll(speechRecognitionAlternative.words_);
                    }
                    onChanged();
                }
            } else if (!speechRecognitionAlternative.words_.isEmpty()) {
                if (!this.wordsBuilder_.isEmpty()) {
                    this.wordsBuilder_.addAllMessages(speechRecognitionAlternative.words_);
                } else {
                    this.wordsBuilder_.dispose();
                    this.wordsBuilder_ = null;
                    this.words_ = speechRecognitionAlternative.words_;
                    this.bitField0_ &= -2;
                    this.wordsBuilder_ = SpeechRecognitionAlternative.alwaysUseFieldBuilders ? getWordsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(speechRecognitionAlternative.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            SpeechRecognitionAlternative speechRecognitionAlternative = null;
            try {
                try {
                    SpeechRecognitionAlternative speechRecognitionAlternative2 = (SpeechRecognitionAlternative) SpeechRecognitionAlternative.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (speechRecognitionAlternative2 != null) {
                        mergeFrom(speechRecognitionAlternative2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SpeechRecognitionAlternative speechRecognitionAlternative3 = (SpeechRecognitionAlternative) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        speechRecognitionAlternative = speechRecognitionAlternative3;
                        if (speechRecognitionAlternative != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (speechRecognitionAlternative != null) {
                    mergeFrom(speechRecognitionAlternative);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public String getTranscript() {
            Object obj = this.transcript_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.transcript_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public ByteString getTranscriptBytes() {
            Object obj = this.transcript_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.transcript_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setTranscript(String str) {
            str.getClass();
            this.transcript_ = str;
            onChanged();
            return this;
        }

        public Builder clearTranscript() {
            this.transcript_ = SpeechRecognitionAlternative.getDefaultInstance().getTranscript();
            onChanged();
            return this;
        }

        public Builder setTranscriptBytes(ByteString byteString) {
            byteString.getClass();
            SpeechRecognitionAlternative.checkByteStringIsUtf8(byteString);
            this.transcript_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
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

        private void ensureWordsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.words_ = new ArrayList(this.words_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public List<WordInfo> getWordsList() {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.words_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public int getWordsCount() {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.words_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public WordInfo getWords(int i) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.words_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setWords(int i, WordInfo wordInfo) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                wordInfo.getClass();
                ensureWordsIsMutable();
                this.words_.set(i, wordInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, wordInfo);
            }
            return this;
        }

        public Builder setWords(int i, WordInfo.Builder builder) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWordsIsMutable();
                this.words_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addWords(WordInfo wordInfo) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                wordInfo.getClass();
                ensureWordsIsMutable();
                this.words_.add(wordInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(wordInfo);
            }
            return this;
        }

        public Builder addWords(int i, WordInfo wordInfo) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                wordInfo.getClass();
                ensureWordsIsMutable();
                this.words_.add(i, wordInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, wordInfo);
            }
            return this;
        }

        public Builder addWords(WordInfo.Builder builder) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWordsIsMutable();
                this.words_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addWords(int i, WordInfo.Builder builder) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWordsIsMutable();
                this.words_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllWords(Iterable<? extends WordInfo> iterable) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWordsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.words_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearWords() {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.words_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeWords(int i) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureWordsIsMutable();
                this.words_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public WordInfo.Builder getWordsBuilder(int i) {
            return getWordsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public WordInfoOrBuilder getWordsOrBuilder(int i) {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.words_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1.SpeechRecognitionAlternativeOrBuilder
        public List<? extends WordInfoOrBuilder> getWordsOrBuilderList() {
            RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> repeatedFieldBuilderV3 = this.wordsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.words_);
        }

        public WordInfo.Builder addWordsBuilder() {
            return getWordsFieldBuilder().addBuilder(WordInfo.getDefaultInstance());
        }

        public WordInfo.Builder addWordsBuilder(int i) {
            return getWordsFieldBuilder().addBuilder(i, WordInfo.getDefaultInstance());
        }

        public List<WordInfo.Builder> getWordsBuilderList() {
            return getWordsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<WordInfo, WordInfo.Builder, WordInfoOrBuilder> getWordsFieldBuilder() {
            if (this.wordsBuilder_ == null) {
                this.wordsBuilder_ = new RepeatedFieldBuilderV3<>(this.words_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.words_ = null;
            }
            return this.wordsBuilder_;
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

    public static SpeechRecognitionAlternative getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SpeechRecognitionAlternative> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SpeechRecognitionAlternative> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SpeechRecognitionAlternative getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
