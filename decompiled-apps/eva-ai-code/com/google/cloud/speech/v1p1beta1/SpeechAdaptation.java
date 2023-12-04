package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.cloud.speech.v1p1beta1.PhraseSet;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class SpeechAdaptation extends GeneratedMessageV3 implements SpeechAdaptationOrBuilder {
    public static final int CUSTOM_CLASSES_FIELD_NUMBER = 3;
    private static final SpeechAdaptation DEFAULT_INSTANCE = new SpeechAdaptation();
    private static final Parser<SpeechAdaptation> PARSER = new AbstractParser<SpeechAdaptation>() { // from class: com.google.cloud.speech.v1p1beta1.SpeechAdaptation.1
        @Override // com.google.protobuf.Parser
        public SpeechAdaptation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SpeechAdaptation(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PHRASE_SETS_FIELD_NUMBER = 1;
    public static final int PHRASE_SET_REFERENCES_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private List<CustomClass> customClasses_;
    private byte memoizedIsInitialized;
    private LazyStringList phraseSetReferences_;
    private List<PhraseSet> phraseSets_;

    private SpeechAdaptation(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private SpeechAdaptation() {
        this.memoizedIsInitialized = (byte) -1;
        this.phraseSets_ = Collections.emptyList();
        this.phraseSetReferences_ = LazyStringArrayList.EMPTY;
        this.customClasses_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SpeechAdaptation();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SpeechAdaptation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.phraseSets_ = new ArrayList();
                                z2 |= true;
                            }
                            this.phraseSets_.add(codedInputStream.readMessage(PhraseSet.parser(), extensionRegistryLite));
                        } else if (readTag == 18) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!(z2 & true)) {
                                this.phraseSetReferences_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.phraseSetReferences_.add(readStringRequireUtf8);
                        } else if (readTag == 26) {
                            if (!(z2 & true)) {
                                this.customClasses_ = new ArrayList();
                                z2 |= true;
                            }
                            this.customClasses_.add(codedInputStream.readMessage(CustomClass.parser(), extensionRegistryLite));
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
                    this.phraseSets_ = Collections.unmodifiableList(this.phraseSets_);
                }
                if (z2 & true) {
                    this.phraseSetReferences_ = this.phraseSetReferences_.getUnmodifiableView();
                }
                if (z2 & true) {
                    this.customClasses_ = Collections.unmodifiableList(this.customClasses_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechAdaptation.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public List<PhraseSet> getPhraseSetsList() {
        return this.phraseSets_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public List<? extends PhraseSetOrBuilder> getPhraseSetsOrBuilderList() {
        return this.phraseSets_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public int getPhraseSetsCount() {
        return this.phraseSets_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public PhraseSet getPhraseSets(int i) {
        return this.phraseSets_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public PhraseSetOrBuilder getPhraseSetsOrBuilder(int i) {
        return this.phraseSets_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public ProtocolStringList getPhraseSetReferencesList() {
        return this.phraseSetReferences_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public int getPhraseSetReferencesCount() {
        return this.phraseSetReferences_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public String getPhraseSetReferences(int i) {
        return (String) this.phraseSetReferences_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public ByteString getPhraseSetReferencesBytes(int i) {
        return this.phraseSetReferences_.getByteString(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public List<CustomClass> getCustomClassesList() {
        return this.customClasses_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public List<? extends CustomClassOrBuilder> getCustomClassesOrBuilderList() {
        return this.customClasses_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public int getCustomClassesCount() {
        return this.customClasses_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public CustomClass getCustomClasses(int i) {
        return this.customClasses_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
    public CustomClassOrBuilder getCustomClassesOrBuilder(int i) {
        return this.customClasses_.get(i);
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
        for (int i = 0; i < this.phraseSets_.size(); i++) {
            codedOutputStream.writeMessage(1, this.phraseSets_.get(i));
        }
        for (int i2 = 0; i2 < this.phraseSetReferences_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.phraseSetReferences_.getRaw(i2));
        }
        for (int i3 = 0; i3 < this.customClasses_.size(); i3++) {
            codedOutputStream.writeMessage(3, this.customClasses_.get(i3));
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
        for (int i3 = 0; i3 < this.phraseSets_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.phraseSets_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.phraseSetReferences_.size(); i5++) {
            i4 += computeStringSizeNoTag(this.phraseSetReferences_.getRaw(i5));
        }
        int size = i2 + i4 + (getPhraseSetReferencesList().size() * 1);
        for (int i6 = 0; i6 < this.customClasses_.size(); i6++) {
            size += CodedOutputStream.computeMessageSize(3, this.customClasses_.get(i6));
        }
        int serializedSize = size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpeechAdaptation)) {
            return super.equals(obj);
        }
        SpeechAdaptation speechAdaptation = (SpeechAdaptation) obj;
        return getPhraseSetsList().equals(speechAdaptation.getPhraseSetsList()) && getPhraseSetReferencesList().equals(speechAdaptation.getPhraseSetReferencesList()) && getCustomClassesList().equals(speechAdaptation.getCustomClassesList()) && this.unknownFields.equals(speechAdaptation.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getPhraseSetsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getPhraseSetsList().hashCode();
        }
        if (getPhraseSetReferencesCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getPhraseSetReferencesList().hashCode();
        }
        if (getCustomClassesCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getCustomClassesList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static SpeechAdaptation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SpeechAdaptation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SpeechAdaptation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SpeechAdaptation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SpeechAdaptation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SpeechAdaptation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SpeechAdaptation parseFrom(InputStream inputStream) throws IOException {
        return (SpeechAdaptation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SpeechAdaptation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechAdaptation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeechAdaptation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeechAdaptation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SpeechAdaptation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechAdaptation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SpeechAdaptation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SpeechAdaptation) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SpeechAdaptation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SpeechAdaptation) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SpeechAdaptation speechAdaptation) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(speechAdaptation);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeechAdaptationOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> customClassesBuilder_;
        private List<CustomClass> customClasses_;
        private LazyStringList phraseSetReferences_;
        private RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> phraseSetsBuilder_;
        private List<PhraseSet> phraseSets_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechAdaptation.class, Builder.class);
        }

        private Builder() {
            this.phraseSets_ = Collections.emptyList();
            this.phraseSetReferences_ = LazyStringArrayList.EMPTY;
            this.customClasses_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.phraseSets_ = Collections.emptyList();
            this.phraseSetReferences_ = LazyStringArrayList.EMPTY;
            this.customClasses_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (SpeechAdaptation.alwaysUseFieldBuilders) {
                getPhraseSetsFieldBuilder();
                getCustomClassesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.phraseSets_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.phraseSetReferences_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV32 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.customClasses_ = Collections.emptyList();
                this.bitField0_ &= -5;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_SpeechAdaptation_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeechAdaptation getDefaultInstanceForType() {
            return SpeechAdaptation.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeechAdaptation build() {
            SpeechAdaptation buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SpeechAdaptation buildPartial() {
            SpeechAdaptation speechAdaptation = new SpeechAdaptation(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.phraseSets_ = Collections.unmodifiableList(this.phraseSets_);
                    this.bitField0_ &= -2;
                }
                speechAdaptation.phraseSets_ = this.phraseSets_;
            } else {
                speechAdaptation.phraseSets_ = repeatedFieldBuilderV3.build();
            }
            if ((this.bitField0_ & 2) != 0) {
                this.phraseSetReferences_ = this.phraseSetReferences_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            speechAdaptation.phraseSetReferences_ = this.phraseSetReferences_;
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV32 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV32 != null) {
                speechAdaptation.customClasses_ = repeatedFieldBuilderV32.build();
            } else {
                if ((this.bitField0_ & 4) != 0) {
                    this.customClasses_ = Collections.unmodifiableList(this.customClasses_);
                    this.bitField0_ &= -5;
                }
                speechAdaptation.customClasses_ = this.customClasses_;
            }
            onBuilt();
            return speechAdaptation;
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
            if (message instanceof SpeechAdaptation) {
                return mergeFrom((SpeechAdaptation) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SpeechAdaptation speechAdaptation) {
            if (speechAdaptation == SpeechAdaptation.getDefaultInstance()) {
                return this;
            }
            if (this.phraseSetsBuilder_ == null) {
                if (!speechAdaptation.phraseSets_.isEmpty()) {
                    if (this.phraseSets_.isEmpty()) {
                        this.phraseSets_ = speechAdaptation.phraseSets_;
                        this.bitField0_ &= -2;
                    } else {
                        ensurePhraseSetsIsMutable();
                        this.phraseSets_.addAll(speechAdaptation.phraseSets_);
                    }
                    onChanged();
                }
            } else if (!speechAdaptation.phraseSets_.isEmpty()) {
                if (!this.phraseSetsBuilder_.isEmpty()) {
                    this.phraseSetsBuilder_.addAllMessages(speechAdaptation.phraseSets_);
                } else {
                    this.phraseSetsBuilder_.dispose();
                    this.phraseSetsBuilder_ = null;
                    this.phraseSets_ = speechAdaptation.phraseSets_;
                    this.bitField0_ &= -2;
                    this.phraseSetsBuilder_ = SpeechAdaptation.alwaysUseFieldBuilders ? getPhraseSetsFieldBuilder() : null;
                }
            }
            if (!speechAdaptation.phraseSetReferences_.isEmpty()) {
                if (this.phraseSetReferences_.isEmpty()) {
                    this.phraseSetReferences_ = speechAdaptation.phraseSetReferences_;
                    this.bitField0_ &= -3;
                } else {
                    ensurePhraseSetReferencesIsMutable();
                    this.phraseSetReferences_.addAll(speechAdaptation.phraseSetReferences_);
                }
                onChanged();
            }
            if (this.customClassesBuilder_ == null) {
                if (!speechAdaptation.customClasses_.isEmpty()) {
                    if (this.customClasses_.isEmpty()) {
                        this.customClasses_ = speechAdaptation.customClasses_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureCustomClassesIsMutable();
                        this.customClasses_.addAll(speechAdaptation.customClasses_);
                    }
                    onChanged();
                }
            } else if (!speechAdaptation.customClasses_.isEmpty()) {
                if (!this.customClassesBuilder_.isEmpty()) {
                    this.customClassesBuilder_.addAllMessages(speechAdaptation.customClasses_);
                } else {
                    this.customClassesBuilder_.dispose();
                    this.customClassesBuilder_ = null;
                    this.customClasses_ = speechAdaptation.customClasses_;
                    this.bitField0_ &= -5;
                    this.customClassesBuilder_ = SpeechAdaptation.alwaysUseFieldBuilders ? getCustomClassesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(speechAdaptation.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            SpeechAdaptation speechAdaptation = null;
            try {
                try {
                    SpeechAdaptation speechAdaptation2 = (SpeechAdaptation) SpeechAdaptation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (speechAdaptation2 != null) {
                        mergeFrom(speechAdaptation2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    SpeechAdaptation speechAdaptation3 = (SpeechAdaptation) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        speechAdaptation = speechAdaptation3;
                        if (speechAdaptation != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (speechAdaptation != null) {
                    mergeFrom(speechAdaptation);
                }
                throw th;
            }
        }

        private void ensurePhraseSetsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.phraseSets_ = new ArrayList(this.phraseSets_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public List<PhraseSet> getPhraseSetsList() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.phraseSets_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public int getPhraseSetsCount() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phraseSets_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public PhraseSet getPhraseSets(int i) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phraseSets_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setPhraseSets(int i, PhraseSet phraseSet) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phraseSet.getClass();
                ensurePhraseSetsIsMutable();
                this.phraseSets_.set(i, phraseSet);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, phraseSet);
            }
            return this;
        }

        public Builder setPhraseSets(int i, PhraseSet.Builder builder) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addPhraseSets(PhraseSet phraseSet) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phraseSet.getClass();
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(phraseSet);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(phraseSet);
            }
            return this;
        }

        public Builder addPhraseSets(int i, PhraseSet phraseSet) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phraseSet.getClass();
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(i, phraseSet);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, phraseSet);
            }
            return this;
        }

        public Builder addPhraseSets(PhraseSet.Builder builder) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addPhraseSets(int i, PhraseSet.Builder builder) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllPhraseSets(Iterable<? extends PhraseSet> iterable) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.phraseSets_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearPhraseSets() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.phraseSets_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removePhraseSets(int i) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public PhraseSet.Builder getPhraseSetsBuilder(int i) {
            return getPhraseSetsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public PhraseSetOrBuilder getPhraseSetsOrBuilder(int i) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phraseSets_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public List<? extends PhraseSetOrBuilder> getPhraseSetsOrBuilderList() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.phraseSets_);
        }

        public PhraseSet.Builder addPhraseSetsBuilder() {
            return getPhraseSetsFieldBuilder().addBuilder(PhraseSet.getDefaultInstance());
        }

        public PhraseSet.Builder addPhraseSetsBuilder(int i) {
            return getPhraseSetsFieldBuilder().addBuilder(i, PhraseSet.getDefaultInstance());
        }

        public List<PhraseSet.Builder> getPhraseSetsBuilderList() {
            return getPhraseSetsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> getPhraseSetsFieldBuilder() {
            if (this.phraseSetsBuilder_ == null) {
                this.phraseSetsBuilder_ = new RepeatedFieldBuilderV3<>(this.phraseSets_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.phraseSets_ = null;
            }
            return this.phraseSetsBuilder_;
        }

        private void ensurePhraseSetReferencesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.phraseSetReferences_ = new LazyStringArrayList(this.phraseSetReferences_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public ProtocolStringList getPhraseSetReferencesList() {
            return this.phraseSetReferences_.getUnmodifiableView();
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public int getPhraseSetReferencesCount() {
            return this.phraseSetReferences_.size();
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public String getPhraseSetReferences(int i) {
            return (String) this.phraseSetReferences_.get(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public ByteString getPhraseSetReferencesBytes(int i) {
            return this.phraseSetReferences_.getByteString(i);
        }

        public Builder setPhraseSetReferences(int i, String str) {
            str.getClass();
            ensurePhraseSetReferencesIsMutable();
            this.phraseSetReferences_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addPhraseSetReferences(String str) {
            str.getClass();
            ensurePhraseSetReferencesIsMutable();
            this.phraseSetReferences_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllPhraseSetReferences(Iterable<String> iterable) {
            ensurePhraseSetReferencesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.phraseSetReferences_);
            onChanged();
            return this;
        }

        public Builder clearPhraseSetReferences() {
            this.phraseSetReferences_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addPhraseSetReferencesBytes(ByteString byteString) {
            byteString.getClass();
            SpeechAdaptation.checkByteStringIsUtf8(byteString);
            ensurePhraseSetReferencesIsMutable();
            this.phraseSetReferences_.add(byteString);
            onChanged();
            return this;
        }

        private void ensureCustomClassesIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.customClasses_ = new ArrayList(this.customClasses_);
                this.bitField0_ |= 4;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public List<CustomClass> getCustomClassesList() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.customClasses_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public int getCustomClassesCount() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.customClasses_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public CustomClass getCustomClasses(int i) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.customClasses_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setCustomClasses(int i, CustomClass customClass) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customClass.getClass();
                ensureCustomClassesIsMutable();
                this.customClasses_.set(i, customClass);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, customClass);
            }
            return this;
        }

        public Builder setCustomClasses(int i, CustomClass.Builder builder) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addCustomClasses(CustomClass customClass) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customClass.getClass();
                ensureCustomClassesIsMutable();
                this.customClasses_.add(customClass);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(customClass);
            }
            return this;
        }

        public Builder addCustomClasses(int i, CustomClass customClass) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customClass.getClass();
                ensureCustomClassesIsMutable();
                this.customClasses_.add(i, customClass);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, customClass);
            }
            return this;
        }

        public Builder addCustomClasses(CustomClass.Builder builder) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addCustomClasses(int i, CustomClass.Builder builder) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllCustomClasses(Iterable<? extends CustomClass> iterable) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.customClasses_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearCustomClasses() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.customClasses_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeCustomClasses(int i) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public CustomClass.Builder getCustomClassesBuilder(int i) {
            return getCustomClassesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public CustomClassOrBuilder getCustomClassesOrBuilder(int i) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.customClasses_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.SpeechAdaptationOrBuilder
        public List<? extends CustomClassOrBuilder> getCustomClassesOrBuilderList() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.customClasses_);
        }

        public CustomClass.Builder addCustomClassesBuilder() {
            return getCustomClassesFieldBuilder().addBuilder(CustomClass.getDefaultInstance());
        }

        public CustomClass.Builder addCustomClassesBuilder(int i) {
            return getCustomClassesFieldBuilder().addBuilder(i, CustomClass.getDefaultInstance());
        }

        public List<CustomClass.Builder> getCustomClassesBuilderList() {
            return getCustomClassesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> getCustomClassesFieldBuilder() {
            if (this.customClassesBuilder_ == null) {
                this.customClassesBuilder_ = new RepeatedFieldBuilderV3<>(this.customClasses_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.customClasses_ = null;
            }
            return this.customClassesBuilder_;
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

    public static SpeechAdaptation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SpeechAdaptation> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SpeechAdaptation> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SpeechAdaptation getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
