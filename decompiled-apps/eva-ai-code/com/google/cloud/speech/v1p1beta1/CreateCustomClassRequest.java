package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.CustomClass;
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
public final class CreateCustomClassRequest extends GeneratedMessageV3 implements CreateCustomClassRequestOrBuilder {
    public static final int CUSTOM_CLASS_FIELD_NUMBER = 3;
    public static final int CUSTOM_CLASS_ID_FIELD_NUMBER = 2;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object customClassId_;
    private CustomClass customClass_;
    private byte memoizedIsInitialized;
    private volatile Object parent_;
    private static final CreateCustomClassRequest DEFAULT_INSTANCE = new CreateCustomClassRequest();
    private static final Parser<CreateCustomClassRequest> PARSER = new AbstractParser<CreateCustomClassRequest>() { // from class: com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest.1
        @Override // com.google.protobuf.Parser
        public CreateCustomClassRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreateCustomClassRequest(codedInputStream, extensionRegistryLite);
        }
    };

    private CreateCustomClassRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private CreateCustomClassRequest() {
        this.memoizedIsInitialized = (byte) -1;
        this.parent_ = "";
        this.customClassId_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new CreateCustomClassRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private CreateCustomClassRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.customClassId_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 26) {
                            CustomClass customClass = this.customClass_;
                            CustomClass.Builder builder = customClass != null ? customClass.toBuilder() : null;
                            CustomClass customClass2 = (CustomClass) codedInputStream.readMessage(CustomClass.parser(), extensionRegistryLite);
                            this.customClass_ = customClass2;
                            if (builder != null) {
                                builder.mergeFrom(customClass2);
                                this.customClass_ = builder.buildPartial();
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
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateCustomClassRequest.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public String getParent() {
        Object obj = this.parent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.parent_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public ByteString getParentBytes() {
        Object obj = this.parent_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parent_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public String getCustomClassId() {
        Object obj = this.customClassId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.customClassId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public ByteString getCustomClassIdBytes() {
        Object obj = this.customClassId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.customClassId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public boolean hasCustomClass() {
        return this.customClass_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public CustomClass getCustomClass() {
        CustomClass customClass = this.customClass_;
        return customClass == null ? CustomClass.getDefaultInstance() : customClass;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
    public CustomClassOrBuilder getCustomClassOrBuilder() {
        return getCustomClass();
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
        if (!getCustomClassIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.customClassId_);
        }
        if (this.customClass_ != null) {
            codedOutputStream.writeMessage(3, getCustomClass());
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
        if (!getCustomClassIdBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.customClassId_);
        }
        if (this.customClass_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, getCustomClass());
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
        if (!(obj instanceof CreateCustomClassRequest)) {
            return super.equals(obj);
        }
        CreateCustomClassRequest createCustomClassRequest = (CreateCustomClassRequest) obj;
        if (getParent().equals(createCustomClassRequest.getParent()) && getCustomClassId().equals(createCustomClassRequest.getCustomClassId()) && hasCustomClass() == createCustomClassRequest.hasCustomClass()) {
            return (!hasCustomClass() || getCustomClass().equals(createCustomClassRequest.getCustomClass())) && this.unknownFields.equals(createCustomClassRequest.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getParent().hashCode()) * 37) + 2) * 53) + getCustomClassId().hashCode();
        if (hasCustomClass()) {
            hashCode = (((hashCode * 37) + 3) * 53) + getCustomClass().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static CreateCustomClassRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static CreateCustomClassRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CreateCustomClassRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static CreateCustomClassRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CreateCustomClassRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static CreateCustomClassRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreateCustomClassRequest parseFrom(InputStream inputStream) throws IOException {
        return (CreateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CreateCustomClassRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreateCustomClassRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreateCustomClassRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreateCustomClassRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateCustomClassRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreateCustomClassRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreateCustomClassRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CreateCustomClassRequest createCustomClassRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(createCustomClassRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreateCustomClassRequestOrBuilder {
        private SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> customClassBuilder_;
        private Object customClassId_;
        private CustomClass customClass_;
        private Object parent_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CreateCustomClassRequest.class, Builder.class);
        }

        private Builder() {
            this.parent_ = "";
            this.customClassId_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.parent_ = "";
            this.customClassId_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = CreateCustomClassRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.parent_ = "";
            this.customClassId_ = "";
            if (this.customClassBuilder_ == null) {
                this.customClass_ = null;
            } else {
                this.customClass_ = null;
                this.customClassBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_CreateCustomClassRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CreateCustomClassRequest getDefaultInstanceForType() {
            return CreateCustomClassRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CreateCustomClassRequest build() {
            CreateCustomClassRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CreateCustomClassRequest buildPartial() {
            CreateCustomClassRequest createCustomClassRequest = new CreateCustomClassRequest(this);
            createCustomClassRequest.parent_ = this.parent_;
            createCustomClassRequest.customClassId_ = this.customClassId_;
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 == null) {
                createCustomClassRequest.customClass_ = this.customClass_;
            } else {
                createCustomClassRequest.customClass_ = singleFieldBuilderV3.build();
            }
            onBuilt();
            return createCustomClassRequest;
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
            if (message instanceof CreateCustomClassRequest) {
                return mergeFrom((CreateCustomClassRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CreateCustomClassRequest createCustomClassRequest) {
            if (createCustomClassRequest == CreateCustomClassRequest.getDefaultInstance()) {
                return this;
            }
            if (!createCustomClassRequest.getParent().isEmpty()) {
                this.parent_ = createCustomClassRequest.parent_;
                onChanged();
            }
            if (!createCustomClassRequest.getCustomClassId().isEmpty()) {
                this.customClassId_ = createCustomClassRequest.customClassId_;
                onChanged();
            }
            if (createCustomClassRequest.hasCustomClass()) {
                mergeCustomClass(createCustomClassRequest.getCustomClass());
            }
            mergeUnknownFields(createCustomClassRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CreateCustomClassRequest createCustomClassRequest = null;
            try {
                try {
                    CreateCustomClassRequest createCustomClassRequest2 = (CreateCustomClassRequest) CreateCustomClassRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (createCustomClassRequest2 != null) {
                        mergeFrom(createCustomClassRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    CreateCustomClassRequest createCustomClassRequest3 = (CreateCustomClassRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        createCustomClassRequest = createCustomClassRequest3;
                        if (createCustomClassRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (createCustomClassRequest != null) {
                    mergeFrom(createCustomClassRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
        public String getParent() {
            Object obj = this.parent_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.parent_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
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
            this.parent_ = CreateCustomClassRequest.getDefaultInstance().getParent();
            onChanged();
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            byteString.getClass();
            CreateCustomClassRequest.checkByteStringIsUtf8(byteString);
            this.parent_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
        public String getCustomClassId() {
            Object obj = this.customClassId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.customClassId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
        public ByteString getCustomClassIdBytes() {
            Object obj = this.customClassId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.customClassId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCustomClassId(String str) {
            str.getClass();
            this.customClassId_ = str;
            onChanged();
            return this;
        }

        public Builder clearCustomClassId() {
            this.customClassId_ = CreateCustomClassRequest.getDefaultInstance().getCustomClassId();
            onChanged();
            return this;
        }

        public Builder setCustomClassIdBytes(ByteString byteString) {
            byteString.getClass();
            CreateCustomClassRequest.checkByteStringIsUtf8(byteString);
            this.customClassId_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
        public boolean hasCustomClass() {
            return (this.customClassBuilder_ == null && this.customClass_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
        public CustomClass getCustomClass() {
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 == null) {
                CustomClass customClass = this.customClass_;
                return customClass == null ? CustomClass.getDefaultInstance() : customClass;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setCustomClass(CustomClass customClass) {
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 == null) {
                customClass.getClass();
                this.customClass_ = customClass;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(customClass);
            }
            return this;
        }

        public Builder setCustomClass(CustomClass.Builder builder) {
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.customClass_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeCustomClass(CustomClass customClass) {
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 == null) {
                CustomClass customClass2 = this.customClass_;
                if (customClass2 != null) {
                    this.customClass_ = CustomClass.newBuilder(customClass2).mergeFrom(customClass).buildPartial();
                } else {
                    this.customClass_ = customClass;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(customClass);
            }
            return this;
        }

        public Builder clearCustomClass() {
            if (this.customClassBuilder_ == null) {
                this.customClass_ = null;
                onChanged();
            } else {
                this.customClass_ = null;
                this.customClassBuilder_ = null;
            }
            return this;
        }

        public CustomClass.Builder getCustomClassBuilder() {
            onChanged();
            return getCustomClassFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.CreateCustomClassRequestOrBuilder
        public CustomClassOrBuilder getCustomClassOrBuilder() {
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            CustomClass customClass = this.customClass_;
            return customClass == null ? CustomClass.getDefaultInstance() : customClass;
        }

        private SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> getCustomClassFieldBuilder() {
            if (this.customClassBuilder_ == null) {
                this.customClassBuilder_ = new SingleFieldBuilderV3<>(getCustomClass(), getParentForChildren(), isClean());
                this.customClass_ = null;
            }
            return this.customClassBuilder_;
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

    public static CreateCustomClassRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CreateCustomClassRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<CreateCustomClassRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public CreateCustomClassRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
