package com.google.api;

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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes7.dex */
public final class ContextRule extends GeneratedMessageV3 implements ContextRuleOrBuilder {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE = new ContextRule();
    private static final Parser<ContextRule> PARSER = new AbstractParser<ContextRule>() { // from class: com.google.api.ContextRule.1
        @Override // com.google.protobuf.Parser
        public ContextRule parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ContextRule(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private LazyStringList allowedRequestExtensions_;
    private LazyStringList allowedResponseExtensions_;
    private byte memoizedIsInitialized;
    private LazyStringList provided_;
    private LazyStringList requested_;
    private volatile Object selector_;

    private ContextRule(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ContextRule() {
        this.memoizedIsInitialized = (byte) -1;
        this.selector_ = "";
        this.requested_ = LazyStringArrayList.EMPTY;
        this.provided_ = LazyStringArrayList.EMPTY;
        this.allowedRequestExtensions_ = LazyStringArrayList.EMPTY;
        this.allowedResponseExtensions_ = LazyStringArrayList.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ContextRule();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ContextRule(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.selector_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!(z2 & true)) {
                                this.requested_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.requested_.add(readStringRequireUtf8);
                        } else if (readTag == 26) {
                            String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                            if (!(z2 & true)) {
                                this.provided_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.provided_.add(readStringRequireUtf82);
                        } else if (readTag == 34) {
                            String readStringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                            if (!(z2 & true)) {
                                this.allowedRequestExtensions_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.allowedRequestExtensions_.add(readStringRequireUtf83);
                        } else if (readTag == 42) {
                            String readStringRequireUtf84 = codedInputStream.readStringRequireUtf8();
                            if (!(z2 & true)) {
                                this.allowedResponseExtensions_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.allowedResponseExtensions_.add(readStringRequireUtf84);
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
                    this.requested_ = this.requested_.getUnmodifiableView();
                }
                if (z2 & true) {
                    this.provided_ = this.provided_.getUnmodifiableView();
                }
                if (z2 & true) {
                    this.allowedRequestExtensions_ = this.allowedRequestExtensions_.getUnmodifiableView();
                }
                if (z2 & true) {
                    this.allowedResponseExtensions_ = this.allowedResponseExtensions_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ContextProto.internal_static_google_api_ContextRule_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable.ensureFieldAccessorsInitialized(ContextRule.class, Builder.class);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getSelector() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.selector_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getSelectorBytes() {
        Object obj = this.selector_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.selector_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getRequestedList() {
        return this.requested_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getRequested(int i) {
        return (String) this.requested_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getRequestedBytes(int i) {
        return this.requested_.getByteString(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getProvidedList() {
        return this.provided_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getProvided(int i) {
        return (String) this.provided_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getProvidedBytes(int i) {
        return this.provided_.getByteString(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedRequestExtensions(int i) {
        return (String) this.allowedRequestExtensions_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getAllowedRequestExtensionsBytes(int i) {
        return this.allowedRequestExtensions_.getByteString(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ProtocolStringList getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public String getAllowedResponseExtensions(int i) {
        return (String) this.allowedResponseExtensions_.get(i);
    }

    @Override // com.google.api.ContextRuleOrBuilder
    public ByteString getAllowedResponseExtensionsBytes(int i) {
        return this.allowedResponseExtensions_.getByteString(i);
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
        if (!getSelectorBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.selector_);
        }
        for (int i = 0; i < this.requested_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.requested_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.provided_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.provided_.getRaw(i2));
        }
        for (int i3 = 0; i3 < this.allowedRequestExtensions_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.allowedRequestExtensions_.getRaw(i3));
        }
        for (int i4 = 0; i4 < this.allowedResponseExtensions_.size(); i4++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.allowedResponseExtensions_.getRaw(i4));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getSelectorBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.selector_) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.requested_.size(); i3++) {
            i2 += computeStringSizeNoTag(this.requested_.getRaw(i3));
        }
        int size = computeStringSize + i2 + (getRequestedList().size() * 1);
        int i4 = 0;
        for (int i5 = 0; i5 < this.provided_.size(); i5++) {
            i4 += computeStringSizeNoTag(this.provided_.getRaw(i5));
        }
        int size2 = size + i4 + (getProvidedList().size() * 1);
        int i6 = 0;
        for (int i7 = 0; i7 < this.allowedRequestExtensions_.size(); i7++) {
            i6 += computeStringSizeNoTag(this.allowedRequestExtensions_.getRaw(i7));
        }
        int size3 = size2 + i6 + (getAllowedRequestExtensionsList().size() * 1);
        int i8 = 0;
        for (int i9 = 0; i9 < this.allowedResponseExtensions_.size(); i9++) {
            i8 += computeStringSizeNoTag(this.allowedResponseExtensions_.getRaw(i9));
        }
        int size4 = size3 + i8 + (getAllowedResponseExtensionsList().size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size4;
        return size4;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContextRule)) {
            return super.equals(obj);
        }
        ContextRule contextRule = (ContextRule) obj;
        return getSelector().equals(contextRule.getSelector()) && getRequestedList().equals(contextRule.getRequestedList()) && getProvidedList().equals(contextRule.getProvidedList()) && getAllowedRequestExtensionsList().equals(contextRule.getAllowedRequestExtensionsList()) && getAllowedResponseExtensionsList().equals(contextRule.getAllowedResponseExtensionsList()) && this.unknownFields.equals(contextRule.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSelector().hashCode();
        if (getRequestedCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getRequestedList().hashCode();
        }
        if (getProvidedCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getProvidedList().hashCode();
        }
        if (getAllowedRequestExtensionsCount() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + getAllowedRequestExtensionsList().hashCode();
        }
        if (getAllowedResponseExtensionsCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getAllowedResponseExtensionsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ContextRule contextRule) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(contextRule);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContextRuleOrBuilder {
        private LazyStringList allowedRequestExtensions_;
        private LazyStringList allowedResponseExtensions_;
        private int bitField0_;
        private LazyStringList provided_;
        private LazyStringList requested_;
        private Object selector_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ContextProto.internal_static_google_api_ContextRule_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ContextProto.internal_static_google_api_ContextRule_fieldAccessorTable.ensureFieldAccessorsInitialized(ContextRule.class, Builder.class);
        }

        private Builder() {
            this.selector_ = "";
            this.requested_ = LazyStringArrayList.EMPTY;
            this.provided_ = LazyStringArrayList.EMPTY;
            this.allowedRequestExtensions_ = LazyStringArrayList.EMPTY;
            this.allowedResponseExtensions_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.selector_ = "";
            this.requested_ = LazyStringArrayList.EMPTY;
            this.provided_ = LazyStringArrayList.EMPTY;
            this.allowedRequestExtensions_ = LazyStringArrayList.EMPTY;
            this.allowedResponseExtensions_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = ContextRule.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.selector_ = "";
            this.requested_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.provided_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.allowedRequestExtensions_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            this.allowedResponseExtensions_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -9;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ContextProto.internal_static_google_api_ContextRule_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ContextRule getDefaultInstanceForType() {
            return ContextRule.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ContextRule build() {
            ContextRule buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ContextRule buildPartial() {
            ContextRule contextRule = new ContextRule(this);
            contextRule.selector_ = this.selector_;
            if ((this.bitField0_ & 1) != 0) {
                this.requested_ = this.requested_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            contextRule.requested_ = this.requested_;
            if ((this.bitField0_ & 2) != 0) {
                this.provided_ = this.provided_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            contextRule.provided_ = this.provided_;
            if ((this.bitField0_ & 4) != 0) {
                this.allowedRequestExtensions_ = this.allowedRequestExtensions_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            contextRule.allowedRequestExtensions_ = this.allowedRequestExtensions_;
            if ((this.bitField0_ & 8) != 0) {
                this.allowedResponseExtensions_ = this.allowedResponseExtensions_.getUnmodifiableView();
                this.bitField0_ &= -9;
            }
            contextRule.allowedResponseExtensions_ = this.allowedResponseExtensions_;
            onBuilt();
            return contextRule;
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
            if (message instanceof ContextRule) {
                return mergeFrom((ContextRule) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ContextRule contextRule) {
            if (contextRule == ContextRule.getDefaultInstance()) {
                return this;
            }
            if (!contextRule.getSelector().isEmpty()) {
                this.selector_ = contextRule.selector_;
                onChanged();
            }
            if (!contextRule.requested_.isEmpty()) {
                if (this.requested_.isEmpty()) {
                    this.requested_ = contextRule.requested_;
                    this.bitField0_ &= -2;
                } else {
                    ensureRequestedIsMutable();
                    this.requested_.addAll(contextRule.requested_);
                }
                onChanged();
            }
            if (!contextRule.provided_.isEmpty()) {
                if (this.provided_.isEmpty()) {
                    this.provided_ = contextRule.provided_;
                    this.bitField0_ &= -3;
                } else {
                    ensureProvidedIsMutable();
                    this.provided_.addAll(contextRule.provided_);
                }
                onChanged();
            }
            if (!contextRule.allowedRequestExtensions_.isEmpty()) {
                if (this.allowedRequestExtensions_.isEmpty()) {
                    this.allowedRequestExtensions_ = contextRule.allowedRequestExtensions_;
                    this.bitField0_ &= -5;
                } else {
                    ensureAllowedRequestExtensionsIsMutable();
                    this.allowedRequestExtensions_.addAll(contextRule.allowedRequestExtensions_);
                }
                onChanged();
            }
            if (!contextRule.allowedResponseExtensions_.isEmpty()) {
                if (this.allowedResponseExtensions_.isEmpty()) {
                    this.allowedResponseExtensions_ = contextRule.allowedResponseExtensions_;
                    this.bitField0_ &= -9;
                } else {
                    ensureAllowedResponseExtensionsIsMutable();
                    this.allowedResponseExtensions_.addAll(contextRule.allowedResponseExtensions_);
                }
                onChanged();
            }
            mergeUnknownFields(contextRule.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ContextRule contextRule = null;
            try {
                try {
                    ContextRule contextRule2 = (ContextRule) ContextRule.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (contextRule2 != null) {
                        mergeFrom(contextRule2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ContextRule contextRule3 = (ContextRule) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        contextRule = contextRule3;
                        if (contextRule != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (contextRule != null) {
                    mergeFrom(contextRule);
                }
                throw th;
            }
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getSelector() {
            Object obj = this.selector_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.selector_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getSelectorBytes() {
            Object obj = this.selector_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.selector_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setSelector(String str) {
            str.getClass();
            this.selector_ = str;
            onChanged();
            return this;
        }

        public Builder clearSelector() {
            this.selector_ = ContextRule.getDefaultInstance().getSelector();
            onChanged();
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            this.selector_ = byteString;
            onChanged();
            return this;
        }

        private void ensureRequestedIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.requested_ = new LazyStringArrayList(this.requested_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getRequestedList() {
            return this.requested_.getUnmodifiableView();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getRequestedCount() {
            return this.requested_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getRequested(int i) {
            return (String) this.requested_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getRequestedBytes(int i) {
            return this.requested_.getByteString(i);
        }

        public Builder setRequested(int i, String str) {
            str.getClass();
            ensureRequestedIsMutable();
            this.requested_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addRequested(String str) {
            str.getClass();
            ensureRequestedIsMutable();
            this.requested_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllRequested(Iterable<String> iterable) {
            ensureRequestedIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.requested_);
            onChanged();
            return this;
        }

        public Builder clearRequested() {
            this.requested_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder addRequestedBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureRequestedIsMutable();
            this.requested_.add(byteString);
            onChanged();
            return this;
        }

        private void ensureProvidedIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.provided_ = new LazyStringArrayList(this.provided_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getProvidedList() {
            return this.provided_.getUnmodifiableView();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getProvidedCount() {
            return this.provided_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getProvided(int i) {
            return (String) this.provided_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getProvidedBytes(int i) {
            return this.provided_.getByteString(i);
        }

        public Builder setProvided(int i, String str) {
            str.getClass();
            ensureProvidedIsMutable();
            this.provided_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addProvided(String str) {
            str.getClass();
            ensureProvidedIsMutable();
            this.provided_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllProvided(Iterable<String> iterable) {
            ensureProvidedIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.provided_);
            onChanged();
            return this;
        }

        public Builder clearProvided() {
            this.provided_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addProvidedBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureProvidedIsMutable();
            this.provided_.add(byteString);
            onChanged();
            return this;
        }

        private void ensureAllowedRequestExtensionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.allowedRequestExtensions_ = new LazyStringArrayList(this.allowedRequestExtensions_);
                this.bitField0_ |= 4;
            }
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getAllowedRequestExtensionsList() {
            return this.allowedRequestExtensions_.getUnmodifiableView();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedRequestExtensionsCount() {
            return this.allowedRequestExtensions_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedRequestExtensions(int i) {
            return (String) this.allowedRequestExtensions_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getAllowedRequestExtensionsBytes(int i) {
            return this.allowedRequestExtensions_.getByteString(i);
        }

        public Builder setAllowedRequestExtensions(int i, String str) {
            str.getClass();
            ensureAllowedRequestExtensionsIsMutable();
            this.allowedRequestExtensions_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addAllowedRequestExtensions(String str) {
            str.getClass();
            ensureAllowedRequestExtensionsIsMutable();
            this.allowedRequestExtensions_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllAllowedRequestExtensions(Iterable<String> iterable) {
            ensureAllowedRequestExtensionsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.allowedRequestExtensions_);
            onChanged();
            return this;
        }

        public Builder clearAllowedRequestExtensions() {
            this.allowedRequestExtensions_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addAllowedRequestExtensionsBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureAllowedRequestExtensionsIsMutable();
            this.allowedRequestExtensions_.add(byteString);
            onChanged();
            return this;
        }

        private void ensureAllowedResponseExtensionsIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.allowedResponseExtensions_ = new LazyStringArrayList(this.allowedResponseExtensions_);
                this.bitField0_ |= 8;
            }
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ProtocolStringList getAllowedResponseExtensionsList() {
            return this.allowedResponseExtensions_.getUnmodifiableView();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public int getAllowedResponseExtensionsCount() {
            return this.allowedResponseExtensions_.size();
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public String getAllowedResponseExtensions(int i) {
            return (String) this.allowedResponseExtensions_.get(i);
        }

        @Override // com.google.api.ContextRuleOrBuilder
        public ByteString getAllowedResponseExtensionsBytes(int i) {
            return this.allowedResponseExtensions_.getByteString(i);
        }

        public Builder setAllowedResponseExtensions(int i, String str) {
            str.getClass();
            ensureAllowedResponseExtensionsIsMutable();
            this.allowedResponseExtensions_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addAllowedResponseExtensions(String str) {
            str.getClass();
            ensureAllowedResponseExtensionsIsMutable();
            this.allowedResponseExtensions_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllAllowedResponseExtensions(Iterable<String> iterable) {
            ensureAllowedResponseExtensionsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.allowedResponseExtensions_);
            onChanged();
            return this;
        }

        public Builder clearAllowedResponseExtensions() {
            this.allowedResponseExtensions_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder addAllowedResponseExtensionsBytes(ByteString byteString) {
            byteString.getClass();
            ContextRule.checkByteStringIsUtf8(byteString);
            ensureAllowedResponseExtensionsIsMutable();
            this.allowedResponseExtensions_.add(byteString);
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

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ContextRule> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ContextRule> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ContextRule getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
