package com.google.api;

import com.google.api.BackendRule;
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
public final class Backend extends GeneratedMessageV3 implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE = new Backend();
    private static final Parser<Backend> PARSER = new AbstractParser<Backend>() { // from class: com.google.api.Backend.1
        @Override // com.google.protobuf.Parser
        public Backend parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Backend(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int RULES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<BackendRule> rules_;

    private Backend(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private Backend() {
        this.memoizedIsInitialized = (byte) -1;
        this.rules_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Backend();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Backend(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.rules_ = new ArrayList();
                                z2 |= true;
                            }
                            this.rules_.add(codedInputStream.readMessage(BackendRule.parser(), extensionRegistryLite));
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
                    this.rules_ = Collections.unmodifiableList(this.rules_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return BackendProto.internal_static_google_api_Backend_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return BackendProto.internal_static_google_api_Backend_fieldAccessorTable.ensureFieldAccessorsInitialized(Backend.class, Builder.class);
    }

    @Override // com.google.api.BackendOrBuilder
    public List<BackendRule> getRulesList() {
        return this.rules_;
    }

    @Override // com.google.api.BackendOrBuilder
    public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    @Override // com.google.api.BackendOrBuilder
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override // com.google.api.BackendOrBuilder
    public BackendRule getRules(int i) {
        return this.rules_.get(i);
    }

    @Override // com.google.api.BackendOrBuilder
    public BackendRuleOrBuilder getRulesOrBuilder(int i) {
        return this.rules_.get(i);
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
        for (int i = 0; i < this.rules_.size(); i++) {
            codedOutputStream.writeMessage(1, this.rules_.get(i));
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
        for (int i3 = 0; i3 < this.rules_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.rules_.get(i3));
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
        if (!(obj instanceof Backend)) {
            return super.equals(obj);
        }
        Backend backend = (Backend) obj;
        return getRulesList().equals(backend.getRulesList()) && this.unknownFields.equals(backend.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getRulesCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getRulesList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Backend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Backend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Backend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Backend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Backend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Backend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Backend parseFrom(InputStream inputStream) throws IOException {
        return (Backend) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Backend) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Backend) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Backend backend) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(backend);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BackendOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> rulesBuilder_;
        private List<BackendRule> rules_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return BackendProto.internal_static_google_api_Backend_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return BackendProto.internal_static_google_api_Backend_fieldAccessorTable.ensureFieldAccessorsInitialized(Backend.class, Builder.class);
        }

        private Builder() {
            this.rules_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.rules_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Backend.alwaysUseFieldBuilders) {
                getRulesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return BackendProto.internal_static_google_api_Backend_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Backend getDefaultInstanceForType() {
            return Backend.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Backend build() {
            Backend buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Backend buildPartial() {
            Backend backend = new Backend(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.rules_ = Collections.unmodifiableList(this.rules_);
                    this.bitField0_ &= -2;
                }
                backend.rules_ = this.rules_;
            } else {
                backend.rules_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return backend;
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
            if (message instanceof Backend) {
                return mergeFrom((Backend) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Backend backend) {
            if (backend == Backend.getDefaultInstance()) {
                return this;
            }
            if (this.rulesBuilder_ == null) {
                if (!backend.rules_.isEmpty()) {
                    if (this.rules_.isEmpty()) {
                        this.rules_ = backend.rules_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRulesIsMutable();
                        this.rules_.addAll(backend.rules_);
                    }
                    onChanged();
                }
            } else if (!backend.rules_.isEmpty()) {
                if (!this.rulesBuilder_.isEmpty()) {
                    this.rulesBuilder_.addAllMessages(backend.rules_);
                } else {
                    this.rulesBuilder_.dispose();
                    this.rulesBuilder_ = null;
                    this.rules_ = backend.rules_;
                    this.bitField0_ &= -2;
                    this.rulesBuilder_ = Backend.alwaysUseFieldBuilders ? getRulesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(backend.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            Backend backend = null;
            try {
                try {
                    Backend backend2 = (Backend) Backend.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (backend2 != null) {
                        mergeFrom(backend2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    Backend backend3 = (Backend) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        backend = backend3;
                        if (backend != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (backend != null) {
                    mergeFrom(backend);
                }
                throw th;
            }
        }

        private void ensureRulesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.rules_ = new ArrayList(this.rules_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.api.BackendOrBuilder
        public List<BackendRule> getRulesList() {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.rules_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.BackendOrBuilder
        public int getRulesCount() {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.BackendOrBuilder
        public BackendRule getRules(int i) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setRules(int i, BackendRule backendRule) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                backendRule.getClass();
                ensureRulesIsMutable();
                this.rules_.set(i, backendRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, backendRule);
            }
            return this;
        }

        public Builder setRules(int i, BackendRule.Builder builder) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addRules(BackendRule backendRule) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                backendRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(backendRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(backendRule);
            }
            return this;
        }

        public Builder addRules(int i, BackendRule backendRule) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                backendRule.getClass();
                ensureRulesIsMutable();
                this.rules_.add(i, backendRule);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, backendRule);
            }
            return this;
        }

        public Builder addRules(BackendRule.Builder builder) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addRules(int i, BackendRule.Builder builder) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllRules(Iterable<? extends BackendRule> iterable) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.rules_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearRules() {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.rules_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeRules(int i) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureRulesIsMutable();
                this.rules_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public BackendRule.Builder getRulesBuilder(int i) {
            return getRulesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.BackendOrBuilder
        public BackendRuleOrBuilder getRulesOrBuilder(int i) {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.rules_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.BackendOrBuilder
        public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
            RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> repeatedFieldBuilderV3 = this.rulesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.rules_);
        }

        public BackendRule.Builder addRulesBuilder() {
            return getRulesFieldBuilder().addBuilder(BackendRule.getDefaultInstance());
        }

        public BackendRule.Builder addRulesBuilder(int i) {
            return getRulesFieldBuilder().addBuilder(i, BackendRule.getDefaultInstance());
        }

        public List<BackendRule.Builder> getRulesBuilderList() {
            return getRulesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<BackendRule, BackendRule.Builder, BackendRuleOrBuilder> getRulesFieldBuilder() {
            if (this.rulesBuilder_ == null) {
                this.rulesBuilder_ = new RepeatedFieldBuilderV3<>(this.rules_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.rules_ = null;
            }
            return this.rulesBuilder_;
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

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Backend> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Backend> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Backend getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
