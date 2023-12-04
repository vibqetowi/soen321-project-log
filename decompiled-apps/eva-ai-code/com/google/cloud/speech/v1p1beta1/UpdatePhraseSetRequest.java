package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.PhraseSet;
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
public final class UpdatePhraseSetRequest extends GeneratedMessageV3 implements UpdatePhraseSetRequestOrBuilder {
    private static final UpdatePhraseSetRequest DEFAULT_INSTANCE = new UpdatePhraseSetRequest();
    private static final Parser<UpdatePhraseSetRequest> PARSER = new AbstractParser<UpdatePhraseSetRequest>() { // from class: com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequest.1
        @Override // com.google.protobuf.Parser
        public UpdatePhraseSetRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new UpdatePhraseSetRequest(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PHRASE_SET_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private PhraseSet phraseSet_;
    private FieldMask updateMask_;

    private UpdatePhraseSetRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private UpdatePhraseSetRequest() {
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new UpdatePhraseSetRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private UpdatePhraseSetRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            PhraseSet phraseSet = this.phraseSet_;
                            PhraseSet.Builder builder = phraseSet != null ? phraseSet.toBuilder() : null;
                            PhraseSet phraseSet2 = (PhraseSet) codedInputStream.readMessage(PhraseSet.parser(), extensionRegistryLite);
                            this.phraseSet_ = phraseSet2;
                            if (builder != null) {
                                builder.mergeFrom(phraseSet2);
                                this.phraseSet_ = builder.buildPartial();
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
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdatePhraseSetRequest.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
    public boolean hasPhraseSet() {
        return this.phraseSet_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
    public PhraseSet getPhraseSet() {
        PhraseSet phraseSet = this.phraseSet_;
        return phraseSet == null ? PhraseSet.getDefaultInstance() : phraseSet;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
    public PhraseSetOrBuilder getPhraseSetOrBuilder() {
        return getPhraseSet();
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
    public boolean hasUpdateMask() {
        return this.updateMask_ != null;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
    public FieldMask getUpdateMask() {
        FieldMask fieldMask = this.updateMask_;
        return fieldMask == null ? FieldMask.getDefaultInstance() : fieldMask;
    }

    @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
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
        if (this.phraseSet_ != null) {
            codedOutputStream.writeMessage(1, getPhraseSet());
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
        int computeMessageSize = this.phraseSet_ != null ? 0 + CodedOutputStream.computeMessageSize(1, getPhraseSet()) : 0;
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
        if (!(obj instanceof UpdatePhraseSetRequest)) {
            return super.equals(obj);
        }
        UpdatePhraseSetRequest updatePhraseSetRequest = (UpdatePhraseSetRequest) obj;
        if (hasPhraseSet() != updatePhraseSetRequest.hasPhraseSet()) {
            return false;
        }
        if ((!hasPhraseSet() || getPhraseSet().equals(updatePhraseSetRequest.getPhraseSet())) && hasUpdateMask() == updatePhraseSetRequest.hasUpdateMask()) {
            return (!hasUpdateMask() || getUpdateMask().equals(updatePhraseSetRequest.getUpdateMask())) && this.unknownFields.equals(updatePhraseSetRequest.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (hasPhraseSet()) {
            hashCode = (((hashCode * 37) + 1) * 53) + getPhraseSet().hashCode();
        }
        if (hasUpdateMask()) {
            hashCode = (((hashCode * 37) + 2) * 53) + getUpdateMask().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static UpdatePhraseSetRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static UpdatePhraseSetRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static UpdatePhraseSetRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static UpdatePhraseSetRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static UpdatePhraseSetRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static UpdatePhraseSetRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static UpdatePhraseSetRequest parseFrom(InputStream inputStream) throws IOException {
        return (UpdatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static UpdatePhraseSetRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UpdatePhraseSetRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpdatePhraseSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static UpdatePhraseSetRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdatePhraseSetRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static UpdatePhraseSetRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpdatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static UpdatePhraseSetRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdatePhraseSetRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UpdatePhraseSetRequest updatePhraseSetRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(updatePhraseSetRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdatePhraseSetRequestOrBuilder {
        private SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> phraseSetBuilder_;
        private PhraseSet phraseSet_;
        private SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> updateMaskBuilder_;
        private FieldMask updateMask_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdatePhraseSetRequest.class, Builder.class);
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = UpdatePhraseSetRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            if (this.phraseSetBuilder_ == null) {
                this.phraseSet_ = null;
            } else {
                this.phraseSet_ = null;
                this.phraseSetBuilder_ = null;
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
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_UpdatePhraseSetRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdatePhraseSetRequest getDefaultInstanceForType() {
            return UpdatePhraseSetRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UpdatePhraseSetRequest build() {
            UpdatePhraseSetRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public UpdatePhraseSetRequest buildPartial() {
            UpdatePhraseSetRequest updatePhraseSetRequest = new UpdatePhraseSetRequest(this);
            SingleFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> singleFieldBuilderV3 = this.phraseSetBuilder_;
            if (singleFieldBuilderV3 == null) {
                updatePhraseSetRequest.phraseSet_ = this.phraseSet_;
            } else {
                updatePhraseSetRequest.phraseSet_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<FieldMask, FieldMask.Builder, FieldMaskOrBuilder> singleFieldBuilderV32 = this.updateMaskBuilder_;
            if (singleFieldBuilderV32 == null) {
                updatePhraseSetRequest.updateMask_ = this.updateMask_;
            } else {
                updatePhraseSetRequest.updateMask_ = singleFieldBuilderV32.build();
            }
            onBuilt();
            return updatePhraseSetRequest;
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
            if (message instanceof UpdatePhraseSetRequest) {
                return mergeFrom((UpdatePhraseSetRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(UpdatePhraseSetRequest updatePhraseSetRequest) {
            if (updatePhraseSetRequest == UpdatePhraseSetRequest.getDefaultInstance()) {
                return this;
            }
            if (updatePhraseSetRequest.hasPhraseSet()) {
                mergePhraseSet(updatePhraseSetRequest.getPhraseSet());
            }
            if (updatePhraseSetRequest.hasUpdateMask()) {
                mergeUpdateMask(updatePhraseSetRequest.getUpdateMask());
            }
            mergeUnknownFields(updatePhraseSetRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            UpdatePhraseSetRequest updatePhraseSetRequest = null;
            try {
                try {
                    UpdatePhraseSetRequest updatePhraseSetRequest2 = (UpdatePhraseSetRequest) UpdatePhraseSetRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (updatePhraseSetRequest2 != null) {
                        mergeFrom(updatePhraseSetRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    UpdatePhraseSetRequest updatePhraseSetRequest3 = (UpdatePhraseSetRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        updatePhraseSetRequest = updatePhraseSetRequest3;
                        if (updatePhraseSetRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (updatePhraseSetRequest != null) {
                    mergeFrom(updatePhraseSetRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
        public boolean hasPhraseSet() {
            return (this.phraseSetBuilder_ == null && this.phraseSet_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
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

        @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
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

        @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
        public boolean hasUpdateMask() {
            return (this.updateMaskBuilder_ == null && this.updateMask_ == null) ? false : true;
        }

        @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
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

        @Override // com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequestOrBuilder
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

    public static UpdatePhraseSetRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<UpdatePhraseSetRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<UpdatePhraseSetRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public UpdatePhraseSetRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
