package com.google.cloud.speech.v1p1beta1;

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
import com.google.protobuf.MessageOrBuilder;
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
public final class PhraseSet extends GeneratedMessageV3 implements PhraseSetOrBuilder {
    public static final int BOOST_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PHRASES_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private float boost_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Phrase> phrases_;
    private static final PhraseSet DEFAULT_INSTANCE = new PhraseSet();
    private static final Parser<PhraseSet> PARSER = new AbstractParser<PhraseSet>() { // from class: com.google.cloud.speech.v1p1beta1.PhraseSet.1
        @Override // com.google.protobuf.Parser
        public PhraseSet parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new PhraseSet(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes7.dex */
    public interface PhraseOrBuilder extends MessageOrBuilder {
        float getBoost();

        String getValue();

        ByteString getValueBytes();
    }

    private PhraseSet(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private PhraseSet() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.phrases_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new PhraseSet();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PhraseSet(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.name_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!(z2 & true)) {
                                    this.phrases_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.phrases_.add(codedInputStream.readMessage(Phrase.parser(), extensionRegistryLite));
                            } else if (readTag == 37) {
                                this.boost_ = codedInputStream.readFloat();
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
                    this.phrases_ = Collections.unmodifiableList(this.phrases_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_fieldAccessorTable.ensureFieldAccessorsInitialized(PhraseSet.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public static final class Phrase extends GeneratedMessageV3 implements PhraseOrBuilder {
        public static final int BOOST_FIELD_NUMBER = 2;
        private static final Phrase DEFAULT_INSTANCE = new Phrase();
        private static final Parser<Phrase> PARSER = new AbstractParser<Phrase>() { // from class: com.google.cloud.speech.v1p1beta1.PhraseSet.Phrase.1
            @Override // com.google.protobuf.Parser
            public Phrase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Phrase(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float boost_;
        private byte memoizedIsInitialized;
        private volatile Object value_;

        private Phrase(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private Phrase() {
            this.memoizedIsInitialized = (byte) -1;
            this.value_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Phrase();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Phrase(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 21) {
                                    this.boost_ = codedInputStream.readFloat();
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
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_fieldAccessorTable.ensureFieldAccessorsInitialized(Phrase.class, Builder.class);
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder
        public float getBoost() {
            return this.boost_;
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
            if (!getValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.value_);
            }
            float f = this.boost_;
            if (f != 0.0f) {
                codedOutputStream.writeFloat(2, f);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = getValueBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.value_);
            float f = this.boost_;
            if (f != 0.0f) {
                computeStringSize += CodedOutputStream.computeFloatSize(2, f);
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
            if (!(obj instanceof Phrase)) {
                return super.equals(obj);
            }
            Phrase phrase = (Phrase) obj;
            return getValue().equals(phrase.getValue()) && Float.floatToIntBits(getBoost()) == Float.floatToIntBits(phrase.getBoost()) && this.unknownFields.equals(phrase.unknownFields);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 37) + 2) * 53) + Float.floatToIntBits(getBoost())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static Phrase parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Phrase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Phrase parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Phrase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Phrase parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Phrase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Phrase parseFrom(InputStream inputStream) throws IOException {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Phrase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Phrase parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Phrase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Phrase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Phrase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Phrase parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Phrase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Phrase phrase) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(phrase);
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
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PhraseOrBuilder {
            private float boost_;
            private Object value_;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_fieldAccessorTable.ensureFieldAccessorsInitialized(Phrase.class, Builder.class);
            }

            private Builder() {
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = Phrase.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.value_ = "";
                this.boost_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_Phrase_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Phrase getDefaultInstanceForType() {
                return Phrase.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Phrase build() {
                Phrase buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Phrase buildPartial() {
                Phrase phrase = new Phrase(this);
                phrase.value_ = this.value_;
                phrase.boost_ = this.boost_;
                onBuilt();
                return phrase;
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
                if (message instanceof Phrase) {
                    return mergeFrom((Phrase) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Phrase phrase) {
                if (phrase == Phrase.getDefaultInstance()) {
                    return this;
                }
                if (!phrase.getValue().isEmpty()) {
                    this.value_ = phrase.value_;
                    onChanged();
                }
                if (phrase.getBoost() != 0.0f) {
                    setBoost(phrase.getBoost());
                }
                mergeUnknownFields(phrase.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                Phrase phrase = null;
                try {
                    try {
                        Phrase phrase2 = (Phrase) Phrase.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (phrase2 != null) {
                            mergeFrom(phrase2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Phrase phrase3 = (Phrase) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            phrase = phrase3;
                            if (phrase != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (phrase != null) {
                        mergeFrom(phrase);
                    }
                    throw th;
                }
            }

            @Override // com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = Phrase.getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                Phrase.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.google.cloud.speech.v1p1beta1.PhraseSet.PhraseOrBuilder
            public float getBoost() {
                return this.boost_;
            }

            public Builder setBoost(float f) {
                this.boost_ = f;
                onChanged();
                return this;
            }

            public Builder clearBoost() {
                this.boost_ = 0.0f;
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

        public static Phrase getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Phrase> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Phrase> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Phrase getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public List<Phrase> getPhrasesList() {
        return this.phrases_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public List<? extends PhraseOrBuilder> getPhrasesOrBuilderList() {
        return this.phrases_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public int getPhrasesCount() {
        return this.phrases_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public Phrase getPhrases(int i) {
        return this.phrases_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public PhraseOrBuilder getPhrasesOrBuilder(int i) {
        return this.phrases_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
    public float getBoost() {
        return this.boost_;
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
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i = 0; i < this.phrases_.size(); i++) {
            codedOutputStream.writeMessage(2, this.phrases_.get(i));
        }
        float f = this.boost_;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(4, f);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) + 0 : 0;
        for (int i2 = 0; i2 < this.phrases_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, this.phrases_.get(i2));
        }
        float f = this.boost_;
        if (f != 0.0f) {
            computeStringSize += CodedOutputStream.computeFloatSize(4, f);
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
        if (!(obj instanceof PhraseSet)) {
            return super.equals(obj);
        }
        PhraseSet phraseSet = (PhraseSet) obj;
        return getName().equals(phraseSet.getName()) && getPhrasesList().equals(phraseSet.getPhrasesList()) && Float.floatToIntBits(getBoost()) == Float.floatToIntBits(phraseSet.getBoost()) && this.unknownFields.equals(phraseSet.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (getPhrasesCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getPhrasesList().hashCode();
        }
        int floatToIntBits = (((((hashCode * 37) + 4) * 53) + Float.floatToIntBits(getBoost())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = floatToIntBits;
        return floatToIntBits;
    }

    public static PhraseSet parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static PhraseSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static PhraseSet parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static PhraseSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static PhraseSet parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static PhraseSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static PhraseSet parseFrom(InputStream inputStream) throws IOException {
        return (PhraseSet) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static PhraseSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhraseSet) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PhraseSet parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PhraseSet) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PhraseSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhraseSet) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PhraseSet parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PhraseSet) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static PhraseSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PhraseSet) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(PhraseSet phraseSet) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(phraseSet);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PhraseSetOrBuilder {
        private int bitField0_;
        private float boost_;
        private Object name_;
        private RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> phrasesBuilder_;
        private List<Phrase> phrases_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_fieldAccessorTable.ensureFieldAccessorsInitialized(PhraseSet.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.phrases_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.phrases_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (PhraseSet.alwaysUseFieldBuilders) {
                getPhrasesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.phrases_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.boost_ = 0.0f;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_PhraseSet_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PhraseSet getDefaultInstanceForType() {
            return PhraseSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PhraseSet build() {
            PhraseSet buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PhraseSet buildPartial() {
            PhraseSet phraseSet = new PhraseSet(this);
            phraseSet.name_ = this.name_;
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                phraseSet.phrases_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.phrases_ = Collections.unmodifiableList(this.phrases_);
                    this.bitField0_ &= -2;
                }
                phraseSet.phrases_ = this.phrases_;
            }
            phraseSet.boost_ = this.boost_;
            onBuilt();
            return phraseSet;
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
            if (message instanceof PhraseSet) {
                return mergeFrom((PhraseSet) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(PhraseSet phraseSet) {
            if (phraseSet == PhraseSet.getDefaultInstance()) {
                return this;
            }
            if (!phraseSet.getName().isEmpty()) {
                this.name_ = phraseSet.name_;
                onChanged();
            }
            if (this.phrasesBuilder_ == null) {
                if (!phraseSet.phrases_.isEmpty()) {
                    if (this.phrases_.isEmpty()) {
                        this.phrases_ = phraseSet.phrases_;
                        this.bitField0_ &= -2;
                    } else {
                        ensurePhrasesIsMutable();
                        this.phrases_.addAll(phraseSet.phrases_);
                    }
                    onChanged();
                }
            } else if (!phraseSet.phrases_.isEmpty()) {
                if (!this.phrasesBuilder_.isEmpty()) {
                    this.phrasesBuilder_.addAllMessages(phraseSet.phrases_);
                } else {
                    this.phrasesBuilder_.dispose();
                    this.phrasesBuilder_ = null;
                    this.phrases_ = phraseSet.phrases_;
                    this.bitField0_ &= -2;
                    this.phrasesBuilder_ = PhraseSet.alwaysUseFieldBuilders ? getPhrasesFieldBuilder() : null;
                }
            }
            if (phraseSet.getBoost() != 0.0f) {
                setBoost(phraseSet.getBoost());
            }
            mergeUnknownFields(phraseSet.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            PhraseSet phraseSet = null;
            try {
                try {
                    PhraseSet phraseSet2 = (PhraseSet) PhraseSet.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (phraseSet2 != null) {
                        mergeFrom(phraseSet2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    PhraseSet phraseSet3 = (PhraseSet) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        phraseSet = phraseSet3;
                        if (phraseSet != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (phraseSet != null) {
                    mergeFrom(phraseSet);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = PhraseSet.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            PhraseSet.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        private void ensurePhrasesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.phrases_ = new ArrayList(this.phrases_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public List<Phrase> getPhrasesList() {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.phrases_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public int getPhrasesCount() {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phrases_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public Phrase getPhrases(int i) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phrases_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setPhrases(int i, Phrase phrase) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phrase.getClass();
                ensurePhrasesIsMutable();
                this.phrases_.set(i, phrase);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, phrase);
            }
            return this;
        }

        public Builder setPhrases(int i, Phrase.Builder builder) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhrasesIsMutable();
                this.phrases_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addPhrases(Phrase phrase) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phrase.getClass();
                ensurePhrasesIsMutable();
                this.phrases_.add(phrase);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(phrase);
            }
            return this;
        }

        public Builder addPhrases(int i, Phrase phrase) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phrase.getClass();
                ensurePhrasesIsMutable();
                this.phrases_.add(i, phrase);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, phrase);
            }
            return this;
        }

        public Builder addPhrases(Phrase.Builder builder) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhrasesIsMutable();
                this.phrases_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addPhrases(int i, Phrase.Builder builder) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhrasesIsMutable();
                this.phrases_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllPhrases(Iterable<? extends Phrase> iterable) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhrasesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.phrases_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearPhrases() {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.phrases_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removePhrases(int i) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhrasesIsMutable();
                this.phrases_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Phrase.Builder getPhrasesBuilder(int i) {
            return getPhrasesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public PhraseOrBuilder getPhrasesOrBuilder(int i) {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phrases_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public List<? extends PhraseOrBuilder> getPhrasesOrBuilderList() {
            RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.phrases_);
        }

        public Phrase.Builder addPhrasesBuilder() {
            return getPhrasesFieldBuilder().addBuilder(Phrase.getDefaultInstance());
        }

        public Phrase.Builder addPhrasesBuilder(int i) {
            return getPhrasesFieldBuilder().addBuilder(i, Phrase.getDefaultInstance());
        }

        public List<Phrase.Builder> getPhrasesBuilderList() {
            return getPhrasesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> getPhrasesFieldBuilder() {
            if (this.phrasesBuilder_ == null) {
                this.phrasesBuilder_ = new RepeatedFieldBuilderV3<>(this.phrases_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.phrases_ = null;
            }
            return this.phrasesBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.PhraseSetOrBuilder
        public float getBoost() {
            return this.boost_;
        }

        public Builder setBoost(float f) {
            this.boost_ = f;
            onChanged();
            return this;
        }

        public Builder clearBoost() {
            this.boost_ = 0.0f;
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

    public static PhraseSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PhraseSet> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<PhraseSet> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public PhraseSet getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
