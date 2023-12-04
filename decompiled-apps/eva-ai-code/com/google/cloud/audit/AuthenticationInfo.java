package com.google.cloud.audit;

import com.google.cloud.audit.ServiceAccountDelegationInfo;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class AuthenticationInfo extends GeneratedMessageV3 implements AuthenticationInfoOrBuilder {
    public static final int AUTHORITY_SELECTOR_FIELD_NUMBER = 2;
    private static final AuthenticationInfo DEFAULT_INSTANCE = new AuthenticationInfo();
    private static final Parser<AuthenticationInfo> PARSER = new AbstractParser<AuthenticationInfo>() { // from class: com.google.cloud.audit.AuthenticationInfo.1
        @Override // com.google.protobuf.Parser
        public AuthenticationInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AuthenticationInfo(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PRINCIPAL_EMAIL_FIELD_NUMBER = 1;
    public static final int PRINCIPAL_SUBJECT_FIELD_NUMBER = 8;
    public static final int SERVICE_ACCOUNT_DELEGATION_INFO_FIELD_NUMBER = 6;
    public static final int SERVICE_ACCOUNT_KEY_NAME_FIELD_NUMBER = 5;
    public static final int THIRD_PARTY_PRINCIPAL_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object authoritySelector_;
    private byte memoizedIsInitialized;
    private volatile Object principalEmail_;
    private volatile Object principalSubject_;
    private List<ServiceAccountDelegationInfo> serviceAccountDelegationInfo_;
    private volatile Object serviceAccountKeyName_;
    private Struct thirdPartyPrincipal_;

    private AuthenticationInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private AuthenticationInfo() {
        this.memoizedIsInitialized = (byte) -1;
        this.principalEmail_ = "";
        this.authoritySelector_ = "";
        this.serviceAccountKeyName_ = "";
        this.serviceAccountDelegationInfo_ = Collections.emptyList();
        this.principalSubject_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuthenticationInfo();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AuthenticationInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.principalEmail_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.authoritySelector_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Struct struct = this.thirdPartyPrincipal_;
                                Struct.Builder builder = struct != null ? struct.toBuilder() : null;
                                Struct struct2 = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.thirdPartyPrincipal_ = struct2;
                                if (builder != null) {
                                    builder.mergeFrom(struct2);
                                    this.thirdPartyPrincipal_ = builder.buildPartial();
                                }
                            } else if (readTag == 42) {
                                this.serviceAccountKeyName_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                if (!(z2 & true)) {
                                    this.serviceAccountDelegationInfo_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.serviceAccountDelegationInfo_.add(codedInputStream.readMessage(ServiceAccountDelegationInfo.parser(), extensionRegistryLite));
                            } else if (readTag == 66) {
                                this.principalSubject_ = codedInputStream.readStringRequireUtf8();
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
                    this.serviceAccountDelegationInfo_ = Collections.unmodifiableList(this.serviceAccountDelegationInfo_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return AuditLogProto.internal_static_google_cloud_audit_AuthenticationInfo_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AuditLogProto.internal_static_google_cloud_audit_AuthenticationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthenticationInfo.class, Builder.class);
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public String getPrincipalEmail() {
        Object obj = this.principalEmail_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.principalEmail_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ByteString getPrincipalEmailBytes() {
        Object obj = this.principalEmail_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.principalEmail_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public String getAuthoritySelector() {
        Object obj = this.authoritySelector_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.authoritySelector_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ByteString getAuthoritySelectorBytes() {
        Object obj = this.authoritySelector_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.authoritySelector_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public boolean hasThirdPartyPrincipal() {
        return this.thirdPartyPrincipal_ != null;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public Struct getThirdPartyPrincipal() {
        Struct struct = this.thirdPartyPrincipal_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public StructOrBuilder getThirdPartyPrincipalOrBuilder() {
        return getThirdPartyPrincipal();
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public String getServiceAccountKeyName() {
        Object obj = this.serviceAccountKeyName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.serviceAccountKeyName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ByteString getServiceAccountKeyNameBytes() {
        Object obj = this.serviceAccountKeyName_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serviceAccountKeyName_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public List<ServiceAccountDelegationInfo> getServiceAccountDelegationInfoList() {
        return this.serviceAccountDelegationInfo_;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public List<? extends ServiceAccountDelegationInfoOrBuilder> getServiceAccountDelegationInfoOrBuilderList() {
        return this.serviceAccountDelegationInfo_;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public int getServiceAccountDelegationInfoCount() {
        return this.serviceAccountDelegationInfo_.size();
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ServiceAccountDelegationInfo getServiceAccountDelegationInfo(int i) {
        return this.serviceAccountDelegationInfo_.get(i);
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ServiceAccountDelegationInfoOrBuilder getServiceAccountDelegationInfoOrBuilder(int i) {
        return this.serviceAccountDelegationInfo_.get(i);
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public String getPrincipalSubject() {
        Object obj = this.principalSubject_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.principalSubject_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
    public ByteString getPrincipalSubjectBytes() {
        Object obj = this.principalSubject_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.principalSubject_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
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
        if (!getPrincipalEmailBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.principalEmail_);
        }
        if (!getAuthoritySelectorBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.authoritySelector_);
        }
        if (this.thirdPartyPrincipal_ != null) {
            codedOutputStream.writeMessage(4, getThirdPartyPrincipal());
        }
        if (!getServiceAccountKeyNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.serviceAccountKeyName_);
        }
        for (int i = 0; i < this.serviceAccountDelegationInfo_.size(); i++) {
            codedOutputStream.writeMessage(6, this.serviceAccountDelegationInfo_.get(i));
        }
        if (!getPrincipalSubjectBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.principalSubject_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getPrincipalEmailBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.principalEmail_) + 0 : 0;
        if (!getAuthoritySelectorBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.authoritySelector_);
        }
        if (this.thirdPartyPrincipal_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, getThirdPartyPrincipal());
        }
        if (!getServiceAccountKeyNameBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(5, this.serviceAccountKeyName_);
        }
        for (int i2 = 0; i2 < this.serviceAccountDelegationInfo_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, this.serviceAccountDelegationInfo_.get(i2));
        }
        if (!getPrincipalSubjectBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(8, this.principalSubject_);
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
        if (!(obj instanceof AuthenticationInfo)) {
            return super.equals(obj);
        }
        AuthenticationInfo authenticationInfo = (AuthenticationInfo) obj;
        if (getPrincipalEmail().equals(authenticationInfo.getPrincipalEmail()) && getAuthoritySelector().equals(authenticationInfo.getAuthoritySelector()) && hasThirdPartyPrincipal() == authenticationInfo.hasThirdPartyPrincipal()) {
            return (!hasThirdPartyPrincipal() || getThirdPartyPrincipal().equals(authenticationInfo.getThirdPartyPrincipal())) && getServiceAccountKeyName().equals(authenticationInfo.getServiceAccountKeyName()) && getServiceAccountDelegationInfoList().equals(authenticationInfo.getServiceAccountDelegationInfoList()) && getPrincipalSubject().equals(authenticationInfo.getPrincipalSubject()) && this.unknownFields.equals(authenticationInfo.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPrincipalEmail().hashCode()) * 37) + 2) * 53) + getAuthoritySelector().hashCode();
        if (hasThirdPartyPrincipal()) {
            hashCode = (((hashCode * 37) + 4) * 53) + getThirdPartyPrincipal().hashCode();
        }
        int hashCode2 = (((hashCode * 37) + 5) * 53) + getServiceAccountKeyName().hashCode();
        if (getServiceAccountDelegationInfoCount() > 0) {
            hashCode2 = (((hashCode2 * 37) + 6) * 53) + getServiceAccountDelegationInfoList().hashCode();
        }
        int hashCode3 = (((((hashCode2 * 37) + 8) * 53) + getPrincipalSubject().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuthenticationInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuthenticationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuthenticationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AuthenticationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuthenticationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuthenticationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthenticationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuthenticationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthenticationInfo authenticationInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(authenticationInfo);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuthenticationInfoOrBuilder {
        private Object authoritySelector_;
        private int bitField0_;
        private Object principalEmail_;
        private Object principalSubject_;
        private RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> serviceAccountDelegationInfoBuilder_;
        private List<ServiceAccountDelegationInfo> serviceAccountDelegationInfo_;
        private Object serviceAccountKeyName_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> thirdPartyPrincipalBuilder_;
        private Struct thirdPartyPrincipal_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AuditLogProto.internal_static_google_cloud_audit_AuthenticationInfo_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AuditLogProto.internal_static_google_cloud_audit_AuthenticationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AuthenticationInfo.class, Builder.class);
        }

        private Builder() {
            this.principalEmail_ = "";
            this.authoritySelector_ = "";
            this.serviceAccountKeyName_ = "";
            this.serviceAccountDelegationInfo_ = Collections.emptyList();
            this.principalSubject_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.principalEmail_ = "";
            this.authoritySelector_ = "";
            this.serviceAccountKeyName_ = "";
            this.serviceAccountDelegationInfo_ = Collections.emptyList();
            this.principalSubject_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (AuthenticationInfo.alwaysUseFieldBuilders) {
                getServiceAccountDelegationInfoFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.principalEmail_ = "";
            this.authoritySelector_ = "";
            if (this.thirdPartyPrincipalBuilder_ == null) {
                this.thirdPartyPrincipal_ = null;
            } else {
                this.thirdPartyPrincipal_ = null;
                this.thirdPartyPrincipalBuilder_ = null;
            }
            this.serviceAccountKeyName_ = "";
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.serviceAccountDelegationInfo_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.principalSubject_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return AuditLogProto.internal_static_google_cloud_audit_AuthenticationInfo_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AuthenticationInfo getDefaultInstanceForType() {
            return AuthenticationInfo.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthenticationInfo build() {
            AuthenticationInfo buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public AuthenticationInfo buildPartial() {
            AuthenticationInfo authenticationInfo = new AuthenticationInfo(this);
            authenticationInfo.principalEmail_ = this.principalEmail_;
            authenticationInfo.authoritySelector_ = this.authoritySelector_;
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.thirdPartyPrincipalBuilder_;
            if (singleFieldBuilderV3 == null) {
                authenticationInfo.thirdPartyPrincipal_ = this.thirdPartyPrincipal_;
            } else {
                authenticationInfo.thirdPartyPrincipal_ = singleFieldBuilderV3.build();
            }
            authenticationInfo.serviceAccountKeyName_ = this.serviceAccountKeyName_;
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                authenticationInfo.serviceAccountDelegationInfo_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.serviceAccountDelegationInfo_ = Collections.unmodifiableList(this.serviceAccountDelegationInfo_);
                    this.bitField0_ &= -2;
                }
                authenticationInfo.serviceAccountDelegationInfo_ = this.serviceAccountDelegationInfo_;
            }
            authenticationInfo.principalSubject_ = this.principalSubject_;
            onBuilt();
            return authenticationInfo;
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
            if (message instanceof AuthenticationInfo) {
                return mergeFrom((AuthenticationInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuthenticationInfo authenticationInfo) {
            if (authenticationInfo == AuthenticationInfo.getDefaultInstance()) {
                return this;
            }
            if (!authenticationInfo.getPrincipalEmail().isEmpty()) {
                this.principalEmail_ = authenticationInfo.principalEmail_;
                onChanged();
            }
            if (!authenticationInfo.getAuthoritySelector().isEmpty()) {
                this.authoritySelector_ = authenticationInfo.authoritySelector_;
                onChanged();
            }
            if (authenticationInfo.hasThirdPartyPrincipal()) {
                mergeThirdPartyPrincipal(authenticationInfo.getThirdPartyPrincipal());
            }
            if (!authenticationInfo.getServiceAccountKeyName().isEmpty()) {
                this.serviceAccountKeyName_ = authenticationInfo.serviceAccountKeyName_;
                onChanged();
            }
            if (this.serviceAccountDelegationInfoBuilder_ == null) {
                if (!authenticationInfo.serviceAccountDelegationInfo_.isEmpty()) {
                    if (this.serviceAccountDelegationInfo_.isEmpty()) {
                        this.serviceAccountDelegationInfo_ = authenticationInfo.serviceAccountDelegationInfo_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureServiceAccountDelegationInfoIsMutable();
                        this.serviceAccountDelegationInfo_.addAll(authenticationInfo.serviceAccountDelegationInfo_);
                    }
                    onChanged();
                }
            } else if (!authenticationInfo.serviceAccountDelegationInfo_.isEmpty()) {
                if (this.serviceAccountDelegationInfoBuilder_.isEmpty()) {
                    this.serviceAccountDelegationInfoBuilder_.dispose();
                    this.serviceAccountDelegationInfoBuilder_ = null;
                    this.serviceAccountDelegationInfo_ = authenticationInfo.serviceAccountDelegationInfo_;
                    this.bitField0_ &= -2;
                    this.serviceAccountDelegationInfoBuilder_ = AuthenticationInfo.alwaysUseFieldBuilders ? getServiceAccountDelegationInfoFieldBuilder() : null;
                } else {
                    this.serviceAccountDelegationInfoBuilder_.addAllMessages(authenticationInfo.serviceAccountDelegationInfo_);
                }
            }
            if (!authenticationInfo.getPrincipalSubject().isEmpty()) {
                this.principalSubject_ = authenticationInfo.principalSubject_;
                onChanged();
            }
            mergeUnknownFields(authenticationInfo.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            AuthenticationInfo authenticationInfo = null;
            try {
                try {
                    AuthenticationInfo authenticationInfo2 = (AuthenticationInfo) AuthenticationInfo.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (authenticationInfo2 != null) {
                        mergeFrom(authenticationInfo2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    AuthenticationInfo authenticationInfo3 = (AuthenticationInfo) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        authenticationInfo = authenticationInfo3;
                        if (authenticationInfo != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (authenticationInfo != null) {
                    mergeFrom(authenticationInfo);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public String getPrincipalEmail() {
            Object obj = this.principalEmail_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.principalEmail_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ByteString getPrincipalEmailBytes() {
            Object obj = this.principalEmail_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.principalEmail_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPrincipalEmail(String str) {
            str.getClass();
            this.principalEmail_ = str;
            onChanged();
            return this;
        }

        public Builder clearPrincipalEmail() {
            this.principalEmail_ = AuthenticationInfo.getDefaultInstance().getPrincipalEmail();
            onChanged();
            return this;
        }

        public Builder setPrincipalEmailBytes(ByteString byteString) {
            byteString.getClass();
            AuthenticationInfo.checkByteStringIsUtf8(byteString);
            this.principalEmail_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public String getAuthoritySelector() {
            Object obj = this.authoritySelector_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.authoritySelector_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ByteString getAuthoritySelectorBytes() {
            Object obj = this.authoritySelector_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.authoritySelector_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setAuthoritySelector(String str) {
            str.getClass();
            this.authoritySelector_ = str;
            onChanged();
            return this;
        }

        public Builder clearAuthoritySelector() {
            this.authoritySelector_ = AuthenticationInfo.getDefaultInstance().getAuthoritySelector();
            onChanged();
            return this;
        }

        public Builder setAuthoritySelectorBytes(ByteString byteString) {
            byteString.getClass();
            AuthenticationInfo.checkByteStringIsUtf8(byteString);
            this.authoritySelector_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public boolean hasThirdPartyPrincipal() {
            return (this.thirdPartyPrincipalBuilder_ == null && this.thirdPartyPrincipal_ == null) ? false : true;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public Struct getThirdPartyPrincipal() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.thirdPartyPrincipalBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct = this.thirdPartyPrincipal_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setThirdPartyPrincipal(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.thirdPartyPrincipalBuilder_;
            if (singleFieldBuilderV3 == null) {
                struct.getClass();
                this.thirdPartyPrincipal_ = struct;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(struct);
            }
            return this;
        }

        public Builder setThirdPartyPrincipal(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.thirdPartyPrincipalBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.thirdPartyPrincipal_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeThirdPartyPrincipal(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.thirdPartyPrincipalBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.thirdPartyPrincipal_;
                if (struct2 != null) {
                    this.thirdPartyPrincipal_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.thirdPartyPrincipal_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearThirdPartyPrincipal() {
            if (this.thirdPartyPrincipalBuilder_ == null) {
                this.thirdPartyPrincipal_ = null;
                onChanged();
            } else {
                this.thirdPartyPrincipal_ = null;
                this.thirdPartyPrincipalBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getThirdPartyPrincipalBuilder() {
            onChanged();
            return getThirdPartyPrincipalFieldBuilder().getBuilder();
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public StructOrBuilder getThirdPartyPrincipalOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.thirdPartyPrincipalBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.thirdPartyPrincipal_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getThirdPartyPrincipalFieldBuilder() {
            if (this.thirdPartyPrincipalBuilder_ == null) {
                this.thirdPartyPrincipalBuilder_ = new SingleFieldBuilderV3<>(getThirdPartyPrincipal(), getParentForChildren(), isClean());
                this.thirdPartyPrincipal_ = null;
            }
            return this.thirdPartyPrincipalBuilder_;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public String getServiceAccountKeyName() {
            Object obj = this.serviceAccountKeyName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.serviceAccountKeyName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ByteString getServiceAccountKeyNameBytes() {
            Object obj = this.serviceAccountKeyName_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serviceAccountKeyName_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setServiceAccountKeyName(String str) {
            str.getClass();
            this.serviceAccountKeyName_ = str;
            onChanged();
            return this;
        }

        public Builder clearServiceAccountKeyName() {
            this.serviceAccountKeyName_ = AuthenticationInfo.getDefaultInstance().getServiceAccountKeyName();
            onChanged();
            return this;
        }

        public Builder setServiceAccountKeyNameBytes(ByteString byteString) {
            byteString.getClass();
            AuthenticationInfo.checkByteStringIsUtf8(byteString);
            this.serviceAccountKeyName_ = byteString;
            onChanged();
            return this;
        }

        private void ensureServiceAccountDelegationInfoIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.serviceAccountDelegationInfo_ = new ArrayList(this.serviceAccountDelegationInfo_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public List<ServiceAccountDelegationInfo> getServiceAccountDelegationInfoList() {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.serviceAccountDelegationInfo_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public int getServiceAccountDelegationInfoCount() {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.serviceAccountDelegationInfo_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ServiceAccountDelegationInfo getServiceAccountDelegationInfo(int i) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.serviceAccountDelegationInfo_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setServiceAccountDelegationInfo(int i, ServiceAccountDelegationInfo serviceAccountDelegationInfo) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                serviceAccountDelegationInfo.getClass();
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.set(i, serviceAccountDelegationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, serviceAccountDelegationInfo);
            }
            return this;
        }

        public Builder setServiceAccountDelegationInfo(int i, ServiceAccountDelegationInfo.Builder builder) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addServiceAccountDelegationInfo(ServiceAccountDelegationInfo serviceAccountDelegationInfo) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                serviceAccountDelegationInfo.getClass();
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.add(serviceAccountDelegationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(serviceAccountDelegationInfo);
            }
            return this;
        }

        public Builder addServiceAccountDelegationInfo(int i, ServiceAccountDelegationInfo serviceAccountDelegationInfo) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                serviceAccountDelegationInfo.getClass();
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.add(i, serviceAccountDelegationInfo);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, serviceAccountDelegationInfo);
            }
            return this;
        }

        public Builder addServiceAccountDelegationInfo(ServiceAccountDelegationInfo.Builder builder) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addServiceAccountDelegationInfo(int i, ServiceAccountDelegationInfo.Builder builder) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllServiceAccountDelegationInfo(Iterable<? extends ServiceAccountDelegationInfo> iterable) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureServiceAccountDelegationInfoIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.serviceAccountDelegationInfo_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearServiceAccountDelegationInfo() {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.serviceAccountDelegationInfo_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeServiceAccountDelegationInfo(int i) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureServiceAccountDelegationInfoIsMutable();
                this.serviceAccountDelegationInfo_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public ServiceAccountDelegationInfo.Builder getServiceAccountDelegationInfoBuilder(int i) {
            return getServiceAccountDelegationInfoFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ServiceAccountDelegationInfoOrBuilder getServiceAccountDelegationInfoOrBuilder(int i) {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.serviceAccountDelegationInfo_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public List<? extends ServiceAccountDelegationInfoOrBuilder> getServiceAccountDelegationInfoOrBuilderList() {
            RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> repeatedFieldBuilderV3 = this.serviceAccountDelegationInfoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.serviceAccountDelegationInfo_);
        }

        public ServiceAccountDelegationInfo.Builder addServiceAccountDelegationInfoBuilder() {
            return getServiceAccountDelegationInfoFieldBuilder().addBuilder(ServiceAccountDelegationInfo.getDefaultInstance());
        }

        public ServiceAccountDelegationInfo.Builder addServiceAccountDelegationInfoBuilder(int i) {
            return getServiceAccountDelegationInfoFieldBuilder().addBuilder(i, ServiceAccountDelegationInfo.getDefaultInstance());
        }

        public List<ServiceAccountDelegationInfo.Builder> getServiceAccountDelegationInfoBuilderList() {
            return getServiceAccountDelegationInfoFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ServiceAccountDelegationInfo, ServiceAccountDelegationInfo.Builder, ServiceAccountDelegationInfoOrBuilder> getServiceAccountDelegationInfoFieldBuilder() {
            if (this.serviceAccountDelegationInfoBuilder_ == null) {
                this.serviceAccountDelegationInfoBuilder_ = new RepeatedFieldBuilderV3<>(this.serviceAccountDelegationInfo_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.serviceAccountDelegationInfo_ = null;
            }
            return this.serviceAccountDelegationInfoBuilder_;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public String getPrincipalSubject() {
            Object obj = this.principalSubject_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.principalSubject_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.audit.AuthenticationInfoOrBuilder
        public ByteString getPrincipalSubjectBytes() {
            Object obj = this.principalSubject_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.principalSubject_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPrincipalSubject(String str) {
            str.getClass();
            this.principalSubject_ = str;
            onChanged();
            return this;
        }

        public Builder clearPrincipalSubject() {
            this.principalSubject_ = AuthenticationInfo.getDefaultInstance().getPrincipalSubject();
            onChanged();
            return this;
        }

        public Builder setPrincipalSubjectBytes(ByteString byteString) {
            byteString.getClass();
            AuthenticationInfo.checkByteStringIsUtf8(byteString);
            this.principalSubject_ = byteString;
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

    public static AuthenticationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuthenticationInfo> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<AuthenticationInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public AuthenticationInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
