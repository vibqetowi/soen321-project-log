package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.PhraseSet;
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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class CreatePhraseSetRequest extends GeneratedMessageV3 implements CreatePhraseSetRequestOrBuilder {
    public static final int PARENT_FIELD_NUMBER = 1;
    public static final int PHRASE_SET_FIELD_NUMBER = 3;
    public static final int PHRASE_SET_ID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object parent_;
    private volatile Object phraseSetId_;
    private PhraseSet phraseSet_;
    private static final CreatePhraseSetRequest DEFAULT_INSTANCE = new CreatePhraseSetRequest();
    private static final Parser<CreatePhraseSetRequest> PARSER = new AbstractParser<CreatePhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequest.1
        @Override // com.google.protobuf.Parser
        public CreatePhraseSetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreatePhraseSetRequest(codedInputStream, extensionRegistryLite);
        }
    };

    private CreatePhraseSetRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private CreatePhraseSetRequest() {
        this.memoizedIsInitialized = (byte) -1;
        this.parent_ = "";
        this.phraseSetId_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new CreatePhraseSetRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private CreatePhraseSetRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.parent_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.phraseSetId_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            PhraseSet phraseSet = this.phraseSet_;
                            PhraseSet.Builder builder = phraseSet != null ? phraseSet.toBuilder() : null;
                            PhraseSet phraseSet2 = (PhraseSet) codedInputStream.readMessage(PhraseSet.parser(), extensionRegistryLite);
                            this.phraseSet_ = phraseSet2;
                            if (builder != null) {
                                builder.mergeFrom(phraseSet2);
                                this.phraseSet_ = builder.buildPartial();
                            }
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
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CreatePhraseSetRequest.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public String getParent() {
        Object obj = this.parent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.parent_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public ByteString getParentBytes() {
        Object obj = this.parent_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parent_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public String getPhraseSetId() {
        Object obj = this.phraseSetId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.phraseSetId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public ByteString getPhraseSetIdBytes() {
        Object obj = this.phraseSetId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phraseSetId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public boolean hasPhraseSet() {
        return this.phraseSet_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public PhraseSet getPhraseSet() {
        PhraseSet phraseSet = this.phraseSet_;
        return phraseSet == null ? PhraseSet.getDefaultInstance() : phraseSet;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
    public PhraseSetOrBuilder getPhraseSetOrBuilder() {
        return getPhraseSet();
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
        if (!getParentBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.parent_);
        }
        if (!getPhraseSetIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.phraseSetId_);
        }
        if (this.phraseSet_ != null) {
            codedOutputStream.writeMessage(3, getPhraseSet());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = getParentBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.parent_);
        if (!getPhraseSetIdBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.phraseSetId_);
        }
        if (this.phraseSet_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getPhraseSet());
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
        if (!(obj instanceof CreatePhraseSetRequest)) {
            return super.equals(obj);
        }
        CreatePhraseSetRequest createPhraseSetRequest = (CreatePhraseSetRequest) obj;
        if (getParent().equals(createPhraseSetRequest.getParent()) && getPhraseSetId().equals(createPhraseSetRequest.getPhraseSetId()) && hasPhraseSet() == createPhraseSetRequest.hasPhraseSet()) {
            return (!hasPhraseSet() || getPhraseSet().equals(createPhraseSetRequest.getPhraseSet())) && this.unknownFields.equals(createPhraseSetRequest.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getParent().hashCode()) * 37) + 2) * 53) + getPhraseSetId().hashCode();
        if (hasPhraseSet()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getPhraseSet().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static CreatePhraseSetRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static CreatePhraseSetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CreatePhraseSetRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static CreatePhraseSetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CreatePhraseSetRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static CreatePhraseSetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreatePhraseSetRequest parseFrom(InputStream inputStream) throws IOException {
        return (CreatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CreatePhraseSetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreatePhraseSetRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreatePhraseSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreatePhraseSetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreatePhraseSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreatePhraseSetRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreatePhraseSetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CreatePhraseSetRequest createPhraseSetRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(createPhraseSetRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreatePhraseSetRequestOrBuilder {
        private Object parent_;
        private SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> phraseSetBuilder_;
        private Object phraseSetId_;
        private PhraseSet phraseSet_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CreatePhraseSetRequest.class, Builder.class);
        }

        private Builder() {
            this.parent_ = "";
            this.phraseSetId_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.parent_ = "";
            this.phraseSetId_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = CreatePhraseSetRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.parent_ = "";
            this.phraseSetId_ = "";
            if (this.phraseSetBuilder_ == null) {
                this.phraseSet_ = null;
            } else {
                this.phraseSet_ = null;
                this.phraseSetBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreatePhraseSetRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CreatePhraseSetRequest getDefaultInstanceForType() {
            return CreatePhraseSetRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CreatePhraseSetRequest build() {
            CreatePhraseSetRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CreatePhraseSetRequest buildPartial() {
            CreatePhraseSetRequest createPhraseSetRequest = new CreatePhraseSetRequest(this);
            createPhraseSetRequest.parent_ = this.parent_;
            createPhraseSetRequest.phraseSetId_ = this.phraseSetId_;
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 == null) {
                createPhraseSetRequest.phraseSet_ = this.phraseSet_;
            } else {
                createPhraseSetRequest.phraseSet_ = singleFieldBuilderV3.build();
            }
            onBuilt();
            return createPhraseSetRequest;
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
            if (message instanceof CreatePhraseSetRequest) {
                return mergeFrom((CreatePhraseSetRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreatePhraseSetRequest createPhraseSetRequest) {
            if (createPhraseSetRequest == CreatePhraseSetRequest.getDefaultInstance()) {
                return this;
            }
            if (!createPhraseSetRequest.getParent().isEmpty()) {
                this.parent_ = createPhraseSetRequest.parent_;
                onChanged();
            }
            if (!createPhraseSetRequest.getPhraseSetId().isEmpty()) {
                this.phraseSetId_ = createPhraseSetRequest.phraseSetId_;
                onChanged();
            }
            if (createPhraseSetRequest.hasPhraseSet()) {
                mergePhraseSet(createPhraseSetRequest.getPhraseSet());
            }
            mergeUnknownFields(createPhraseSetRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CreatePhraseSetRequest createPhraseSetRequest = null;
            try {
                try {
                    CreatePhraseSetRequest createPhraseSetRequest2 = (CreatePhraseSetRequest) CreatePhraseSetRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (createPhraseSetRequest2 != null) {
                        mergeFrom(createPhraseSetRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    CreatePhraseSetRequest createPhraseSetRequest3 = (CreatePhraseSetRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        createPhraseSetRequest = createPhraseSetRequest3;
                        if (createPhraseSetRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (createPhraseSetRequest != null) {
                    mergeFrom(createPhraseSetRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public String getParent() {
            Object obj = this.parent_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.parent_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public ByteString getParentBytes() {
            Object obj = this.parent_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.parent_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setParent(String str) {
            str.getClass();
            this.parent_ = str;
            onChanged();
            return this;
        }

        public Builder clearParent() {
            this.parent_ = CreatePhraseSetRequest.getDefaultInstance().getParent();
            onChanged();
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            byteString.getClass();
            CreatePhraseSetRequest.checkByteStringIsUtf8(byteString);
            this.parent_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public String getPhraseSetId() {
            Object obj = this.phraseSetId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.phraseSetId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public ByteString getPhraseSetIdBytes() {
            Object obj = this.phraseSetId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phraseSetId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPhraseSetId(String str) {
            str.getClass();
            this.phraseSetId_ = str;
            onChanged();
            return this;
        }

        public Builder clearPhraseSetId() {
            this.phraseSetId_ = CreatePhraseSetRequest.getDefaultInstance().getPhraseSetId();
            onChanged();
            return this;
        }

        public Builder setPhraseSetIdBytes(ByteString byteString) {
            byteString.getClass();
            CreatePhraseSetRequest.checkByteStringIsUtf8(byteString);
            this.phraseSetId_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public boolean hasPhraseSet() {
            return (this.phraseSetBuilder_ == null && this.phraseSet_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public PhraseSet getPhraseSet() {
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 == null) {
                PhraseSet phraseSet = this.phraseSet_;
                return phraseSet == null ? PhraseSet.getDefaultInstance() : phraseSet;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setPhraseSet(PhraseSet phraseSet) {
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 == null) {
                phraseSet.getClass();
                this.phraseSet_ = phraseSet;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(phraseSet);
            }
            return this;
        }

        public Builder setPhraseSet(PhraseSet.Builder builder) {
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.phraseSet_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergePhraseSet(PhraseSet phraseSet) {
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 == null) {
                PhraseSet phraseSet2 = this.phraseSet_;
                if (phraseSet2 != null) {
                    this.phraseSet_ = PhraseSet.newBuilder(phraseSet2).mergeFrom(phraseSet).buildPartial();
                } else {
                    this.phraseSet_ = phraseSet;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(phraseSet);
            }
            return this;
        }

        public Builder clearPhraseSet() {
            if (this.phraseSetBuilder_ == null) {
                this.phraseSet_ = null;
                onChanged();
            } else {
                this.phraseSet_ = null;
                this.phraseSetBuilder_ = null;
            }
            return this;
        }

        public PhraseSet.Builder getPhraseSetBuilder() {
            onChanged();
            return getPhraseSetFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequestOrBuilder
        public PhraseSetOrBuilder getPhraseSetOrBuilder() {
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            PhraseSet phraseSet = this.phraseSet_;
            return phraseSet == null ? PhraseSet.getDefaultInstance() : phraseSet;
        }

        private SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> getPhraseSetFieldBuilder() {
            if (this.phraseSetBuilder_ == null) {
                this.phraseSetBuilder_ = new SingleFieldBuilderV3<>(getPhraseSet(), getParentForChildren(), isClean());
                this.phraseSet_ = null;
            }
            return this.phraseSetBuilder_;
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

    public static CreatePhraseSetRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CreatePhraseSetRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<CreatePhraseSetRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public CreatePhraseSetRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
