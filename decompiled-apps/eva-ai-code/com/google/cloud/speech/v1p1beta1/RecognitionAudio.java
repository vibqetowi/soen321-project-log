package com.google.cloud.speech.v1p1beta1;

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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class RecognitionAudio extends GeneratedMessageV3 implements RecognitionAudioOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 1;
    private static final RecognitionAudio DEFAULT_INSTANCE = new RecognitionAudio();
    private static final Parser<RecognitionAudio> PARSER = new AbstractParser<RecognitionAudio>() { // from class: com.google.cloud.speech.v1p1beta1.RecognitionAudio.1
        @Override // com.google.protobuf.Parser
        public RecognitionAudio parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RecognitionAudio(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int URI_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int audioSourceCase_;
    private Object audioSource_;
    private byte memoizedIsInitialized;

    private RecognitionAudio(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.audioSourceCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private RecognitionAudio() {
        this.audioSourceCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RecognitionAudio();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private RecognitionAudio(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.audioSourceCase_ = 1;
                            this.audioSource_ = codedInputStream.readBytes();
                        } else if (readTag == 18) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            this.audioSourceCase_ = 2;
                            this.audioSource_ = readStringRequireUtf8;
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
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognitionAudio.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public enum AudioSourceCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        CONTENT(1),
        URI(2),
        AUDIOSOURCE_NOT_SET(0);
        
        private final int value;

        AudioSourceCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static AudioSourceCase valueOf(int i) {
            return forNumber(i);
        }

        public static AudioSourceCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return URI;
                }
                return CONTENT;
            }
            return AUDIOSOURCE_NOT_SET;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
    public AudioSourceCase getAudioSourceCase() {
        return AudioSourceCase.forNumber(this.audioSourceCase_);
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
    public ByteString getContent() {
        if (this.audioSourceCase_ == 1) {
            return (ByteString) this.audioSource_;
        }
        return ByteString.EMPTY;
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
    public String getUri() {
        String str = this.audioSourceCase_ == 2 ? this.audioSource_ : "";
        if (str instanceof String) {
            return (String) str;
        }
        String stringUtf8 = ((ByteString) str).toStringUtf8();
        if (this.audioSourceCase_ == 2) {
            this.audioSource_ = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
    public ByteString getUriBytes() {
        String str = this.audioSourceCase_ == 2 ? this.audioSource_ : "";
        if (str instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) str);
            if (this.audioSourceCase_ == 2) {
                this.audioSource_ = copyFromUtf8;
            }
            return copyFromUtf8;
        }
        return (ByteString) str;
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
        if (this.audioSourceCase_ == 1) {
            codedOutputStream.writeBytes(1, (ByteString) this.audioSource_);
        }
        if (this.audioSourceCase_ == 2) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.audioSource_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeBytesSize = this.audioSourceCase_ == 1 ? 0 + CodedOutputStream.computeBytesSize(1, (ByteString) this.audioSource_) : 0;
        if (this.audioSourceCase_ == 2) {
            computeBytesSize += GeneratedMessageV3.computeStringSize(2, this.audioSource_);
        }
        int serializedSize = computeBytesSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognitionAudio)) {
            return super.equals(obj);
        }
        RecognitionAudio recognitionAudio = (RecognitionAudio) obj;
        if (getAudioSourceCase().equals(recognitionAudio.getAudioSourceCase())) {
            int i = this.audioSourceCase_;
            if (i == 1) {
                if (!getContent().equals(recognitionAudio.getContent())) {
                    return false;
                }
            } else if (i == 2 && !getUri().equals(recognitionAudio.getUri())) {
                return false;
            }
            return this.unknownFields.equals(recognitionAudio.unknownFields);
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
        int i2 = this.audioSourceCase_;
        if (i2 == 1) {
            i = ((hashCode2 * 37) + 1) * 53;
            hashCode = getContent().hashCode();
        } else {
            if (i2 == 2) {
                i = ((hashCode2 * 37) + 2) * 53;
                hashCode = getUri().hashCode();
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

    public static RecognitionAudio parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RecognitionAudio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RecognitionAudio parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RecognitionAudio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RecognitionAudio parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RecognitionAudio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RecognitionAudio parseFrom(InputStream inputStream) throws IOException {
        return (RecognitionAudio) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RecognitionAudio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionAudio) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognitionAudio parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecognitionAudio) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RecognitionAudio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionAudio) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognitionAudio parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecognitionAudio) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RecognitionAudio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognitionAudio) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RecognitionAudio recognitionAudio) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(recognitionAudio);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecognitionAudioOrBuilder {
        private int audioSourceCase_;
        private Object audioSource_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognitionAudio.class, Builder.class);
        }

        private Builder() {
            this.audioSourceCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.audioSourceCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = RecognitionAudio.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.audioSourceCase_ = 0;
            this.audioSource_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognitionAudio_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RecognitionAudio getDefaultInstanceForType() {
            return RecognitionAudio.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognitionAudio build() {
            RecognitionAudio buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognitionAudio buildPartial() {
            RecognitionAudio recognitionAudio = new RecognitionAudio(this);
            if (this.audioSourceCase_ == 1) {
                recognitionAudio.audioSource_ = this.audioSource_;
            }
            if (this.audioSourceCase_ == 2) {
                recognitionAudio.audioSource_ = this.audioSource_;
            }
            recognitionAudio.audioSourceCase_ = this.audioSourceCase_;
            onBuilt();
            return recognitionAudio;
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
            if (message instanceof RecognitionAudio) {
                return mergeFrom((RecognitionAudio) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RecognitionAudio recognitionAudio) {
            if (recognitionAudio == RecognitionAudio.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$com$google$cloud$speech$v1p1beta1$RecognitionAudio$AudioSourceCase[recognitionAudio.getAudioSourceCase().ordinal()];
            if (i == 1) {
                setContent(recognitionAudio.getContent());
            } else if (i == 2) {
                this.audioSourceCase_ = 2;
                this.audioSource_ = recognitionAudio.audioSource_;
                onChanged();
            }
            mergeUnknownFields(recognitionAudio.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            RecognitionAudio recognitionAudio = null;
            try {
                try {
                    RecognitionAudio recognitionAudio2 = (RecognitionAudio) RecognitionAudio.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (recognitionAudio2 != null) {
                        mergeFrom(recognitionAudio2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    RecognitionAudio recognitionAudio3 = (RecognitionAudio) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        recognitionAudio = recognitionAudio3;
                        if (recognitionAudio != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (recognitionAudio != null) {
                    mergeFrom(recognitionAudio);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
        public AudioSourceCase getAudioSourceCase() {
            return AudioSourceCase.forNumber(this.audioSourceCase_);
        }

        public Builder clearAudioSource() {
            this.audioSourceCase_ = 0;
            this.audioSource_ = null;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
        public ByteString getContent() {
            if (this.audioSourceCase_ == 1) {
                return (ByteString) this.audioSource_;
            }
            return ByteString.EMPTY;
        }

        public Builder setContent(ByteString byteString) {
            byteString.getClass();
            this.audioSourceCase_ = 1;
            this.audioSource_ = byteString;
            onChanged();
            return this;
        }

        public Builder clearContent() {
            if (this.audioSourceCase_ == 1) {
                this.audioSourceCase_ = 0;
                this.audioSource_ = null;
                onChanged();
            }
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
        public String getUri() {
            String str = this.audioSourceCase_ == 2 ? this.audioSource_ : "";
            if (!(str instanceof String)) {
                String stringUtf8 = ((ByteString) str).toStringUtf8();
                if (this.audioSourceCase_ == 2) {
                    this.audioSource_ = stringUtf8;
                }
                return stringUtf8;
            }
            return (String) str;
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognitionAudioOrBuilder
        public ByteString getUriBytes() {
            String str = this.audioSourceCase_ == 2 ? this.audioSource_ : "";
            if (str instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) str);
                if (this.audioSourceCase_ == 2) {
                    this.audioSource_ = copyFromUtf8;
                }
                return copyFromUtf8;
            }
            return (ByteString) str;
        }

        public Builder setUri(String str) {
            str.getClass();
            this.audioSourceCase_ = 2;
            this.audioSource_ = str;
            onChanged();
            return this;
        }

        public Builder clearUri() {
            if (this.audioSourceCase_ == 2) {
                this.audioSourceCase_ = 0;
                this.audioSource_ = null;
                onChanged();
            }
            return this;
        }

        public Builder setUriBytes(ByteString byteString) {
            byteString.getClass();
            RecognitionAudio.checkByteStringIsUtf8(byteString);
            this.audioSourceCase_ = 2;
            this.audioSource_ = byteString;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.cloud.speech.v1p1beta1.RecognitionAudio$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$google$cloud$speech$v1p1beta1$RecognitionAudio$AudioSourceCase;

        static {
            int[] iArr = new int[AudioSourceCase.values().length];
            $SwitchMap$com$google$cloud$speech$v1p1beta1$RecognitionAudio$AudioSourceCase = iArr;
            try {
                iArr[AudioSourceCase.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$cloud$speech$v1p1beta1$RecognitionAudio$AudioSourceCase[AudioSourceCase.URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$cloud$speech$v1p1beta1$RecognitionAudio$AudioSourceCase[AudioSourceCase.AUDIOSOURCE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static RecognitionAudio getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RecognitionAudio> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RecognitionAudio> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RecognitionAudio getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
