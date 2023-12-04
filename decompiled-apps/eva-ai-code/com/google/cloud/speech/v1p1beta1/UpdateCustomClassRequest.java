package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FieldMask;
import com.google.protobuf.FieldMaskOrBuilder;
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
public final class UpdateCustomClassRequest extends GeneratedMessageV3 implements UpdateCustomClassRequestOrBuilder {
    public static final int CUSTOM_CLASS_FIELD_NUMBER = 1;
    private static final UpdateCustomClassRequest DEFAULT_INSTANCE = new UpdateCustomClassRequest();
    private static final Parser<UpdateCustomClassRequest> PARSER = new AbstractParser<UpdateCustomClassRequest>() { // from class: com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest.1
        @Override // com.google.protobuf.Parser
        public UpdateCustomClassRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new UpdateCustomClassRequest(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private CustomClass customClass_;
    private byte memoizedIsInitialized;
    private FieldMask updateMask_;

    private UpdateCustomClassRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private UpdateCustomClassRequest() {
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new UpdateCustomClassRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private UpdateCustomClassRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            CustomClass customClass = this.customClass_;
                            CustomClass.Builder builder = customClass != null ? customClass.toBuilder() : null;
                            CustomClass customClass2 = (CustomClass) codedInputStream.readMessage(CustomClass.parser(), extensionRegistryLite);
                            this.customClass_ = customClass2;
                            if (builder != null) {
                                builder.mergeFrom(customClass2);
                                this.customClass_ = builder.buildPartial();
                            }
                        } else if (readTag == 18) {
                            FieldMask fieldMask = this.updateMask_;
                            FieldMask.Builder builder2 = fieldMask != null ? fieldMask.toBuilder() : null;
                            FieldMask fieldMask2 = (FieldMask) codedInputStream.readMessage(FieldMask.parser(), extensionRegistryLite);
                            this.updateMask_ = fieldMask2;
                            if (builder2 != null) {
                                builder2.mergeFrom(fieldMask2);
                                this.updateMask_ = builder2.buildPartial();
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
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateCustomClassRequest.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
    public boolean hasCustomClass() {
        return this.customClass_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
    public CustomClass getCustomClass() {
        CustomClass customClass = this.customClass_;
        return customClass == null ? CustomClass.getDefaultInstance() : customClass;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
    public CustomClassOrBuilder getCustomClassOrBuilder() {
        return getCustomClass();
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
    public boolean hasUpdateMask() {
        return this.updateMask_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
    public FieldMask getUpdateMask() {
        FieldMask fieldMask = this.updateMask_;
        return fieldMask == null ? FieldMask.getDefaultInstance() : fieldMask;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
    public FieldMaskOrBuilder getUpdateMaskOrBuilder() {
        return getUpdateMask();
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
        if (this.customClass_ != null) {
            codedOutputStream.writeMessage(1, getCustomClass());
        }
        if (this.updateMask_ != null) {
            codedOutputStream.writeMessage(2, getUpdateMask());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.customClass_ != null ? 0 + CodedOutputStream.computeMessageSize(1, getCustomClass()) : 0;
        if (this.updateMask_ != null) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
        if (!(obj instanceof UpdateCustomClassRequest)) {
            return super.equals(obj);
        }
        UpdateCustomClassRequest updateCustomClassRequest = (UpdateCustomClassRequest) obj;
        if (hasCustomClass() != updateCustomClassRequest.hasCustomClass()) {
            return false;
        }
        if ((!hasCustomClass() || getCustomClass().equals(updateCustomClassRequest.getCustomClass())) && hasUpdateMask() == updateCustomClassRequest.hasUpdateMask()) {
            return (!hasUpdateMask() || getUpdateMask().equals(updateCustomClassRequest.getUpdateMask())) && this.unknownFields.equals(updateCustomClassRequest.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasCustomClass()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCustomClass().hashCode();
        }
        if (hasUpdateMask()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getUpdateMask().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static UpdateCustomClassRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static UpdateCustomClassRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static UpdateCustomClassRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static UpdateCustomClassRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static UpdateCustomClassRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static UpdateCustomClassRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static UpdateCustomClassRequest parseFrom(InputStream inputStream) throws IOException {
        return (UpdateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static UpdateCustomClassRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UpdateCustomClassRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpdateCustomClassRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UpdateCustomClassRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateCustomClassRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UpdateCustomClassRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpdateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static UpdateCustomClassRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateCustomClassRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UpdateCustomClassRequest updateCustomClassRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateCustomClassRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateCustomClassRequestOrBuilder {
        private SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> customClassBuilder_;
        private CustomClass customClass_;
        private SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> updateMaskBuilder_;
        private FieldMask updateMask_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateCustomClassRequest.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = UpdateCustomClassRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.customClassBuilder_ == null) {
                this.customClass_ = null;
            } else {
                this.customClass_ = null;
                this.customClassBuilder_ = null;
            }
            if (this.updateMaskBuilder_ == null) {
                this.updateMask_ = null;
            } else {
                this.updateMask_ = null;
                this.updateMaskBuilder_ = null;
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdateCustomClassRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateCustomClassRequest getDefaultInstanceForType() {
            return UpdateCustomClassRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UpdateCustomClassRequest build() {
            UpdateCustomClassRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UpdateCustomClassRequest buildPartial() {
            UpdateCustomClassRequest updateCustomClassRequest = new UpdateCustomClassRequest(this);
            SingleFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> singleFieldBuilderV3 = this.customClassBuilder_;
            if (singleFieldBuilderV3 == null) {
                updateCustomClassRequest.customClass_ = this.customClass_;
            } else {
                updateCustomClassRequest.customClass_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV32 = this.updateMaskBuilder_;
            if (singleFieldBuilderV32 == null) {
                updateCustomClassRequest.updateMask_ = this.updateMask_;
            } else {
                updateCustomClassRequest.updateMask_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return updateCustomClassRequest;
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
            if (message instanceof UpdateCustomClassRequest) {
                return mergeFrom((UpdateCustomClassRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(UpdateCustomClassRequest updateCustomClassRequest) {
            if (updateCustomClassRequest == UpdateCustomClassRequest.getDefaultInstance()) {
                return this;
            }
            if (updateCustomClassRequest.hasCustomClass()) {
                mergeCustomClass(updateCustomClassRequest.getCustomClass());
            }
            if (updateCustomClassRequest.hasUpdateMask()) {
                mergeUpdateMask(updateCustomClassRequest.getUpdateMask());
            }
            mergeUnknownFields(updateCustomClassRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            UpdateCustomClassRequest updateCustomClassRequest = null;
            try {
                try {
                    UpdateCustomClassRequest updateCustomClassRequest2 = (UpdateCustomClassRequest) UpdateCustomClassRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (updateCustomClassRequest2 != null) {
                        mergeFrom(updateCustomClassRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    UpdateCustomClassRequest updateCustomClassRequest3 = (UpdateCustomClassRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        updateCustomClassRequest = updateCustomClassRequest3;
                        if (updateCustomClassRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (updateCustomClassRequest != null) {
                    mergeFrom(updateCustomClassRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
        public boolean hasCustomClass() {
            return (this.customClassBuilder_ == null && this.customClass_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
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

        @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
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

        @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
        public boolean hasUpdateMask() {
            return (this.updateMaskBuilder_ == null && this.updateMask_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
        public FieldMask getUpdateMask() {
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV3 = this.updateMaskBuilder_;
            if (singleFieldBuilderV3 == null) {
                FieldMask fieldMask = this.updateMask_;
                return fieldMask == null ? FieldMask.getDefaultInstance() : fieldMask;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setUpdateMask(FieldMask fieldMask) {
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV3 = this.updateMaskBuilder_;
            if (singleFieldBuilderV3 == null) {
                fieldMask.getClass();
                this.updateMask_ = fieldMask;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(fieldMask);
            }
            return this;
        }

        public Builder setUpdateMask(FieldMask.Builder builder) {
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV3 = this.updateMaskBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.updateMask_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeUpdateMask(FieldMask fieldMask) {
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV3 = this.updateMaskBuilder_;
            if (singleFieldBuilderV3 == null) {
                FieldMask fieldMask2 = this.updateMask_;
                if (fieldMask2 != null) {
                    this.updateMask_ = FieldMask.newBuilder(fieldMask2).mergeFrom(fieldMask).buildPartial();
                } else {
                    this.updateMask_ = fieldMask;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(fieldMask);
            }
            return this;
        }

        public Builder clearUpdateMask() {
            if (this.updateMaskBuilder_ == null) {
                this.updateMask_ = null;
                onChanged();
            } else {
                this.updateMask_ = null;
                this.updateMaskBuilder_ = null;
            }
            return this;
        }

        public FieldMask.Builder getUpdateMaskBuilder() {
            onChanged();
            return getUpdateMaskFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequestOrBuilder
        public FieldMaskOrBuilder getUpdateMaskOrBuilder() {
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV3 = this.updateMaskBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            FieldMask fieldMask = this.updateMask_;
            return fieldMask == null ? FieldMask.getDefaultInstance() : fieldMask;
        }

        private SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> getUpdateMaskFieldBuilder() {
            if (this.updateMaskBuilder_ == null) {
                this.updateMaskBuilder_ = new SingleFieldBuilderV3<>(getUpdateMask(), getParentForChildren(), isClean());
                this.updateMask_ = null;
            }
            return this.updateMaskBuilder_;
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

    public static UpdateCustomClassRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<UpdateCustomClassRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<UpdateCustomClassRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public UpdateCustomClassRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
