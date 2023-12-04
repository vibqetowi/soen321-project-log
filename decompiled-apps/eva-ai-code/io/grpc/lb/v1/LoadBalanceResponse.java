package io.grpc.lb.v1;

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
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import io.grpc.lb.v1.FallbackResponse;
import io.grpc.lb.v1.InitialLoadBalanceResponse;
import io.grpc.lb.v1.ServerList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes4.dex */
public final class LoadBalanceResponse extends GeneratedMessageV3 implements LoadBalanceResponseOrBuilder {
    public static final int FALLBACK_RESPONSE_FIELD_NUMBER = 3;
    public static final int INITIAL_RESPONSE_FIELD_NUMBER = 1;
    public static final int SERVER_LIST_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int loadBalanceResponseTypeCase_;
    private Object loadBalanceResponseType_;
    private byte memoizedIsInitialized;
    private static final LoadBalanceResponse DEFAULT_INSTANCE = new LoadBalanceResponse();
    private static final Parser<LoadBalanceResponse> PARSER = new AbstractParser<LoadBalanceResponse>() { // from class: io.grpc.lb.v1.LoadBalanceResponse.1
        @Override // com.google.protobuf.Parser
        public LoadBalanceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new LoadBalanceResponse(codedInputStream, extensionRegistryLite);
        }
    };

    private LoadBalanceResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.loadBalanceResponseTypeCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    private LoadBalanceResponse() {
        this.loadBalanceResponseTypeCase_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new LoadBalanceResponse();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private LoadBalanceResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                InitialLoadBalanceResponse.Builder builder = this.loadBalanceResponseTypeCase_ == 1 ? ((InitialLoadBalanceResponse) this.loadBalanceResponseType_).toBuilder() : null;
                                MessageLite readMessage = codedInputStream.readMessage(InitialLoadBalanceResponse.parser(), extensionRegistryLite);
                                this.loadBalanceResponseType_ = readMessage;
                                if (builder != null) {
                                    builder.mergeFrom((InitialLoadBalanceResponse) readMessage);
                                    this.loadBalanceResponseType_ = builder.buildPartial();
                                }
                                this.loadBalanceResponseTypeCase_ = 1;
                            } else if (readTag == 18) {
                                ServerList.Builder builder2 = this.loadBalanceResponseTypeCase_ == 2 ? ((ServerList) this.loadBalanceResponseType_).toBuilder() : null;
                                MessageLite readMessage2 = codedInputStream.readMessage(ServerList.parser(), extensionRegistryLite);
                                this.loadBalanceResponseType_ = readMessage2;
                                if (builder2 != null) {
                                    builder2.mergeFrom((ServerList) readMessage2);
                                    this.loadBalanceResponseType_ = builder2.buildPartial();
                                }
                                this.loadBalanceResponseTypeCase_ = 2;
                            } else if (readTag == 26) {
                                FallbackResponse.Builder builder3 = this.loadBalanceResponseTypeCase_ == 3 ? ((FallbackResponse) this.loadBalanceResponseType_).toBuilder() : null;
                                MessageLite readMessage3 = codedInputStream.readMessage(FallbackResponse.parser(), extensionRegistryLite);
                                this.loadBalanceResponseType_ = readMessage3;
                                if (builder3 != null) {
                                    builder3.mergeFrom((FallbackResponse) readMessage3);
                                    this.loadBalanceResponseType_ = builder3.buildPartial();
                                }
                                this.loadBalanceResponseTypeCase_ = 3;
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
        return LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LoadBalanceResponse.class, Builder.class);
    }

    /* loaded from: classes4.dex */
    public enum LoadBalanceResponseTypeCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
        INITIAL_RESPONSE(1),
        SERVER_LIST(2),
        FALLBACK_RESPONSE(3),
        LOADBALANCERESPONSETYPE_NOT_SET(0);
        
        private final int value;

        LoadBalanceResponseTypeCase(int i) {
            this.value = i;
        }

        @Deprecated
        public static LoadBalanceResponseTypeCase valueOf(int i) {
            return forNumber(i);
        }

        public static LoadBalanceResponseTypeCase forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return FALLBACK_RESPONSE;
                    }
                    return SERVER_LIST;
                }
                return INITIAL_RESPONSE;
            }
            return LOADBALANCERESPONSETYPE_NOT_SET;
        }

        @Override // com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public int getNumber() {
            return this.value;
        }
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public LoadBalanceResponseTypeCase getLoadBalanceResponseTypeCase() {
        return LoadBalanceResponseTypeCase.forNumber(this.loadBalanceResponseTypeCase_);
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public boolean hasInitialResponse() {
        return this.loadBalanceResponseTypeCase_ == 1;
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public InitialLoadBalanceResponse getInitialResponse() {
        if (this.loadBalanceResponseTypeCase_ == 1) {
            return (InitialLoadBalanceResponse) this.loadBalanceResponseType_;
        }
        return InitialLoadBalanceResponse.getDefaultInstance();
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public InitialLoadBalanceResponseOrBuilder getInitialResponseOrBuilder() {
        if (this.loadBalanceResponseTypeCase_ == 1) {
            return (InitialLoadBalanceResponse) this.loadBalanceResponseType_;
        }
        return InitialLoadBalanceResponse.getDefaultInstance();
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public boolean hasServerList() {
        return this.loadBalanceResponseTypeCase_ == 2;
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public ServerList getServerList() {
        if (this.loadBalanceResponseTypeCase_ == 2) {
            return (ServerList) this.loadBalanceResponseType_;
        }
        return ServerList.getDefaultInstance();
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public ServerListOrBuilder getServerListOrBuilder() {
        if (this.loadBalanceResponseTypeCase_ == 2) {
            return (ServerList) this.loadBalanceResponseType_;
        }
        return ServerList.getDefaultInstance();
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public boolean hasFallbackResponse() {
        return this.loadBalanceResponseTypeCase_ == 3;
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public FallbackResponse getFallbackResponse() {
        if (this.loadBalanceResponseTypeCase_ == 3) {
            return (FallbackResponse) this.loadBalanceResponseType_;
        }
        return FallbackResponse.getDefaultInstance();
    }

    @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
    public FallbackResponseOrBuilder getFallbackResponseOrBuilder() {
        if (this.loadBalanceResponseTypeCase_ == 3) {
            return (FallbackResponse) this.loadBalanceResponseType_;
        }
        return FallbackResponse.getDefaultInstance();
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
        if (this.loadBalanceResponseTypeCase_ == 1) {
            codedOutputStream.writeMessage(1, (InitialLoadBalanceResponse) this.loadBalanceResponseType_);
        }
        if (this.loadBalanceResponseTypeCase_ == 2) {
            codedOutputStream.writeMessage(2, (ServerList) this.loadBalanceResponseType_);
        }
        if (this.loadBalanceResponseTypeCase_ == 3) {
            codedOutputStream.writeMessage(3, (FallbackResponse) this.loadBalanceResponseType_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeMessageSize = this.loadBalanceResponseTypeCase_ == 1 ? 0 + CodedOutputStream.computeMessageSize(1, (InitialLoadBalanceResponse) this.loadBalanceResponseType_) : 0;
        if (this.loadBalanceResponseTypeCase_ == 2) {
            computeMessageSize += CodedOutputStream.computeMessageSize(2, (ServerList) this.loadBalanceResponseType_);
        }
        if (this.loadBalanceResponseTypeCase_ == 3) {
            computeMessageSize += CodedOutputStream.computeMessageSize(3, (FallbackResponse) this.loadBalanceResponseType_);
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
        if (!(obj instanceof LoadBalanceResponse)) {
            return super.equals(obj);
        }
        LoadBalanceResponse loadBalanceResponse = (LoadBalanceResponse) obj;
        if (getLoadBalanceResponseTypeCase().equals(loadBalanceResponse.getLoadBalanceResponseTypeCase())) {
            int i = this.loadBalanceResponseTypeCase_;
            if (i != 1) {
                if (i == 2) {
                    if (!getServerList().equals(loadBalanceResponse.getServerList())) {
                        return false;
                    }
                } else if (i == 3 && !getFallbackResponse().equals(loadBalanceResponse.getFallbackResponse())) {
                    return false;
                }
            } else if (!getInitialResponse().equals(loadBalanceResponse.getInitialResponse())) {
                return false;
            }
            return this.unknownFields.equals(loadBalanceResponse.unknownFields);
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
        int i2 = this.loadBalanceResponseTypeCase_;
        if (i2 == 1) {
            i = ((hashCode2 * 37) + 1) * 53;
            hashCode = getInitialResponse().hashCode();
        } else if (i2 == 2) {
            i = ((hashCode2 * 37) + 2) * 53;
            hashCode = getServerList().hashCode();
        } else {
            if (i2 == 3) {
                i = ((hashCode2 * 37) + 3) * 53;
                hashCode = getFallbackResponse().hashCode();
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

    public static LoadBalanceResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static LoadBalanceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LoadBalanceResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static LoadBalanceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static LoadBalanceResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static LoadBalanceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LoadBalanceResponse parseFrom(InputStream inputStream) throws IOException {
        return (LoadBalanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LoadBalanceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoadBalanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoadBalanceResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LoadBalanceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LoadBalanceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoadBalanceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LoadBalanceResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LoadBalanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LoadBalanceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LoadBalanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LoadBalanceResponse loadBalanceResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(loadBalanceResponse);
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

    /* loaded from: classes4.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoadBalanceResponseOrBuilder {
        private SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> fallbackResponseBuilder_;
        private SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> initialResponseBuilder_;
        private int loadBalanceResponseTypeCase_;
        private Object loadBalanceResponseType_;
        private SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> serverListBuilder_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(LoadBalanceResponse.class, Builder.class);
        }

        private Builder() {
            this.loadBalanceResponseTypeCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.loadBalanceResponseTypeCase_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = LoadBalanceResponse.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.loadBalanceResponseTypeCase_ = 0;
            this.loadBalanceResponseType_ = null;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return LoadBalancerProto.internal_static_grpc_lb_v1_LoadBalanceResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoadBalanceResponse getDefaultInstanceForType() {
            return LoadBalanceResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LoadBalanceResponse build() {
            LoadBalanceResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LoadBalanceResponse buildPartial() {
            LoadBalanceResponse loadBalanceResponse = new LoadBalanceResponse(this);
            if (this.loadBalanceResponseTypeCase_ == 1) {
                SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3 = this.initialResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    loadBalanceResponse.loadBalanceResponseType_ = this.loadBalanceResponseType_;
                } else {
                    loadBalanceResponse.loadBalanceResponseType_ = singleFieldBuilderV3.build();
                }
            }
            if (this.loadBalanceResponseTypeCase_ == 2) {
                SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV32 = this.serverListBuilder_;
                if (singleFieldBuilderV32 == null) {
                    loadBalanceResponse.loadBalanceResponseType_ = this.loadBalanceResponseType_;
                } else {
                    loadBalanceResponse.loadBalanceResponseType_ = singleFieldBuilderV32.build();
                }
            }
            if (this.loadBalanceResponseTypeCase_ == 3) {
                SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV33 = this.fallbackResponseBuilder_;
                if (singleFieldBuilderV33 == null) {
                    loadBalanceResponse.loadBalanceResponseType_ = this.loadBalanceResponseType_;
                } else {
                    loadBalanceResponse.loadBalanceResponseType_ = singleFieldBuilderV33.build();
                }
            }
            loadBalanceResponse.loadBalanceResponseTypeCase_ = this.loadBalanceResponseTypeCase_;
            onBuilt();
            return loadBalanceResponse;
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
            if (message instanceof LoadBalanceResponse) {
                return mergeFrom((LoadBalanceResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LoadBalanceResponse loadBalanceResponse) {
            if (loadBalanceResponse == LoadBalanceResponse.getDefaultInstance()) {
                return this;
            }
            int i = AnonymousClass2.$SwitchMap$io$grpc$lb$v1$LoadBalanceResponse$LoadBalanceResponseTypeCase[loadBalanceResponse.getLoadBalanceResponseTypeCase().ordinal()];
            if (i == 1) {
                mergeInitialResponse(loadBalanceResponse.getInitialResponse());
            } else if (i == 2) {
                mergeServerList(loadBalanceResponse.getServerList());
            } else if (i == 3) {
                mergeFallbackResponse(loadBalanceResponse.getFallbackResponse());
            }
            mergeUnknownFields(loadBalanceResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            LoadBalanceResponse loadBalanceResponse = null;
            try {
                try {
                    LoadBalanceResponse loadBalanceResponse2 = (LoadBalanceResponse) LoadBalanceResponse.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (loadBalanceResponse2 != null) {
                        mergeFrom(loadBalanceResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    LoadBalanceResponse loadBalanceResponse3 = (LoadBalanceResponse) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        loadBalanceResponse = loadBalanceResponse3;
                        if (loadBalanceResponse != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (loadBalanceResponse != null) {
                    mergeFrom(loadBalanceResponse);
                }
                throw th;
            }
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public LoadBalanceResponseTypeCase getLoadBalanceResponseTypeCase() {
            return LoadBalanceResponseTypeCase.forNumber(this.loadBalanceResponseTypeCase_);
        }

        public Builder clearLoadBalanceResponseType() {
            this.loadBalanceResponseTypeCase_ = 0;
            this.loadBalanceResponseType_ = null;
            onChanged();
            return this;
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public boolean hasInitialResponse() {
            return this.loadBalanceResponseTypeCase_ == 1;
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public InitialLoadBalanceResponse getInitialResponse() {
            SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3 = this.initialResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 1) {
                    return (InitialLoadBalanceResponse) this.loadBalanceResponseType_;
                }
                return InitialLoadBalanceResponse.getDefaultInstance();
            } else if (this.loadBalanceResponseTypeCase_ == 1) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return InitialLoadBalanceResponse.getDefaultInstance();
            }
        }

        public Builder setInitialResponse(InitialLoadBalanceResponse initialLoadBalanceResponse) {
            SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3 = this.initialResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                initialLoadBalanceResponse.getClass();
                this.loadBalanceResponseType_ = initialLoadBalanceResponse;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(initialLoadBalanceResponse);
            }
            this.loadBalanceResponseTypeCase_ = 1;
            return this;
        }

        public Builder setInitialResponse(InitialLoadBalanceResponse.Builder builder) {
            SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3 = this.initialResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.loadBalanceResponseType_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.loadBalanceResponseTypeCase_ = 1;
            return this;
        }

        public Builder mergeInitialResponse(InitialLoadBalanceResponse initialLoadBalanceResponse) {
            SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3 = this.initialResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 1 && this.loadBalanceResponseType_ != InitialLoadBalanceResponse.getDefaultInstance()) {
                    this.loadBalanceResponseType_ = InitialLoadBalanceResponse.newBuilder((InitialLoadBalanceResponse) this.loadBalanceResponseType_).mergeFrom(initialLoadBalanceResponse).buildPartial();
                } else {
                    this.loadBalanceResponseType_ = initialLoadBalanceResponse;
                }
                onChanged();
            } else {
                if (this.loadBalanceResponseTypeCase_ == 1) {
                    singleFieldBuilderV3.mergeFrom(initialLoadBalanceResponse);
                }
                this.initialResponseBuilder_.setMessage(initialLoadBalanceResponse);
            }
            this.loadBalanceResponseTypeCase_ = 1;
            return this;
        }

        public Builder clearInitialResponse() {
            SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3 = this.initialResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 1) {
                    this.loadBalanceResponseTypeCase_ = 0;
                    this.loadBalanceResponseType_ = null;
                    onChanged();
                }
            } else {
                if (this.loadBalanceResponseTypeCase_ == 1) {
                    this.loadBalanceResponseTypeCase_ = 0;
                    this.loadBalanceResponseType_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public InitialLoadBalanceResponse.Builder getInitialResponseBuilder() {
            return getInitialResponseFieldBuilder().getBuilder();
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public InitialLoadBalanceResponseOrBuilder getInitialResponseOrBuilder() {
            SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> singleFieldBuilderV3;
            int i = this.loadBalanceResponseTypeCase_;
            if (i != 1 || (singleFieldBuilderV3 = this.initialResponseBuilder_) == null) {
                if (i == 1) {
                    return (InitialLoadBalanceResponse) this.loadBalanceResponseType_;
                }
                return InitialLoadBalanceResponse.getDefaultInstance();
            }
            return singleFieldBuilderV3.getMessageOrBuilder();
        }

        private SingleFieldBuilderV3<InitialLoadBalanceResponse, InitialLoadBalanceResponse.Builder, InitialLoadBalanceResponseOrBuilder> getInitialResponseFieldBuilder() {
            if (this.initialResponseBuilder_ == null) {
                if (this.loadBalanceResponseTypeCase_ != 1) {
                    this.loadBalanceResponseType_ = InitialLoadBalanceResponse.getDefaultInstance();
                }
                this.initialResponseBuilder_ = new SingleFieldBuilderV3<>((InitialLoadBalanceResponse) this.loadBalanceResponseType_, getParentForChildren(), isClean());
                this.loadBalanceResponseType_ = null;
            }
            this.loadBalanceResponseTypeCase_ = 1;
            onChanged();
            return this.initialResponseBuilder_;
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public boolean hasServerList() {
            return this.loadBalanceResponseTypeCase_ == 2;
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public ServerList getServerList() {
            SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV3 = this.serverListBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 2) {
                    return (ServerList) this.loadBalanceResponseType_;
                }
                return ServerList.getDefaultInstance();
            } else if (this.loadBalanceResponseTypeCase_ == 2) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return ServerList.getDefaultInstance();
            }
        }

        public Builder setServerList(ServerList serverList) {
            SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV3 = this.serverListBuilder_;
            if (singleFieldBuilderV3 == null) {
                serverList.getClass();
                this.loadBalanceResponseType_ = serverList;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(serverList);
            }
            this.loadBalanceResponseTypeCase_ = 2;
            return this;
        }

        public Builder setServerList(ServerList.Builder builder) {
            SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV3 = this.serverListBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.loadBalanceResponseType_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.loadBalanceResponseTypeCase_ = 2;
            return this;
        }

        public Builder mergeServerList(ServerList serverList) {
            SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV3 = this.serverListBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 2 && this.loadBalanceResponseType_ != ServerList.getDefaultInstance()) {
                    this.loadBalanceResponseType_ = ServerList.newBuilder((ServerList) this.loadBalanceResponseType_).mergeFrom(serverList).buildPartial();
                } else {
                    this.loadBalanceResponseType_ = serverList;
                }
                onChanged();
            } else {
                if (this.loadBalanceResponseTypeCase_ == 2) {
                    singleFieldBuilderV3.mergeFrom(serverList);
                }
                this.serverListBuilder_.setMessage(serverList);
            }
            this.loadBalanceResponseTypeCase_ = 2;
            return this;
        }

        public Builder clearServerList() {
            SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV3 = this.serverListBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 2) {
                    this.loadBalanceResponseTypeCase_ = 0;
                    this.loadBalanceResponseType_ = null;
                    onChanged();
                }
            } else {
                if (this.loadBalanceResponseTypeCase_ == 2) {
                    this.loadBalanceResponseTypeCase_ = 0;
                    this.loadBalanceResponseType_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public ServerList.Builder getServerListBuilder() {
            return getServerListFieldBuilder().getBuilder();
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public ServerListOrBuilder getServerListOrBuilder() {
            SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> singleFieldBuilderV3;
            int i = this.loadBalanceResponseTypeCase_;
            if (i != 2 || (singleFieldBuilderV3 = this.serverListBuilder_) == null) {
                if (i == 2) {
                    return (ServerList) this.loadBalanceResponseType_;
                }
                return ServerList.getDefaultInstance();
            }
            return singleFieldBuilderV3.getMessageOrBuilder();
        }

        private SingleFieldBuilderV3<ServerList, ServerList.Builder, ServerListOrBuilder> getServerListFieldBuilder() {
            if (this.serverListBuilder_ == null) {
                if (this.loadBalanceResponseTypeCase_ != 2) {
                    this.loadBalanceResponseType_ = ServerList.getDefaultInstance();
                }
                this.serverListBuilder_ = new SingleFieldBuilderV3<>((ServerList) this.loadBalanceResponseType_, getParentForChildren(), isClean());
                this.loadBalanceResponseType_ = null;
            }
            this.loadBalanceResponseTypeCase_ = 2;
            onChanged();
            return this.serverListBuilder_;
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public boolean hasFallbackResponse() {
            return this.loadBalanceResponseTypeCase_ == 3;
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public FallbackResponse getFallbackResponse() {
            SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV3 = this.fallbackResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 3) {
                    return (FallbackResponse) this.loadBalanceResponseType_;
                }
                return FallbackResponse.getDefaultInstance();
            } else if (this.loadBalanceResponseTypeCase_ == 3) {
                return singleFieldBuilderV3.getMessage();
            } else {
                return FallbackResponse.getDefaultInstance();
            }
        }

        public Builder setFallbackResponse(FallbackResponse fallbackResponse) {
            SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV3 = this.fallbackResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                fallbackResponse.getClass();
                this.loadBalanceResponseType_ = fallbackResponse;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(fallbackResponse);
            }
            this.loadBalanceResponseTypeCase_ = 3;
            return this;
        }

        public Builder setFallbackResponse(FallbackResponse.Builder builder) {
            SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV3 = this.fallbackResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.loadBalanceResponseType_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.loadBalanceResponseTypeCase_ = 3;
            return this;
        }

        public Builder mergeFallbackResponse(FallbackResponse fallbackResponse) {
            SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV3 = this.fallbackResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 3 && this.loadBalanceResponseType_ != FallbackResponse.getDefaultInstance()) {
                    this.loadBalanceResponseType_ = FallbackResponse.newBuilder((FallbackResponse) this.loadBalanceResponseType_).mergeFrom(fallbackResponse).buildPartial();
                } else {
                    this.loadBalanceResponseType_ = fallbackResponse;
                }
                onChanged();
            } else {
                if (this.loadBalanceResponseTypeCase_ == 3) {
                    singleFieldBuilderV3.mergeFrom(fallbackResponse);
                }
                this.fallbackResponseBuilder_.setMessage(fallbackResponse);
            }
            this.loadBalanceResponseTypeCase_ = 3;
            return this;
        }

        public Builder clearFallbackResponse() {
            SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV3 = this.fallbackResponseBuilder_;
            if (singleFieldBuilderV3 == null) {
                if (this.loadBalanceResponseTypeCase_ == 3) {
                    this.loadBalanceResponseTypeCase_ = 0;
                    this.loadBalanceResponseType_ = null;
                    onChanged();
                }
            } else {
                if (this.loadBalanceResponseTypeCase_ == 3) {
                    this.loadBalanceResponseTypeCase_ = 0;
                    this.loadBalanceResponseType_ = null;
                }
                singleFieldBuilderV3.clear();
            }
            return this;
        }

        public FallbackResponse.Builder getFallbackResponseBuilder() {
            return getFallbackResponseFieldBuilder().getBuilder();
        }

        @Override // io.grpc.lb.v1.LoadBalanceResponseOrBuilder
        public FallbackResponseOrBuilder getFallbackResponseOrBuilder() {
            SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> singleFieldBuilderV3;
            int i = this.loadBalanceResponseTypeCase_;
            if (i != 3 || (singleFieldBuilderV3 = this.fallbackResponseBuilder_) == null) {
                if (i == 3) {
                    return (FallbackResponse) this.loadBalanceResponseType_;
                }
                return FallbackResponse.getDefaultInstance();
            }
            return singleFieldBuilderV3.getMessageOrBuilder();
        }

        private SingleFieldBuilderV3<FallbackResponse, FallbackResponse.Builder, FallbackResponseOrBuilder> getFallbackResponseFieldBuilder() {
            if (this.fallbackResponseBuilder_ == null) {
                if (this.loadBalanceResponseTypeCase_ != 3) {
                    this.loadBalanceResponseType_ = FallbackResponse.getDefaultInstance();
                }
                this.fallbackResponseBuilder_ = new SingleFieldBuilderV3<>((FallbackResponse) this.loadBalanceResponseType_, getParentForChildren(), isClean());
                this.loadBalanceResponseType_ = null;
            }
            this.loadBalanceResponseTypeCase_ = 3;
            onChanged();
            return this.fallbackResponseBuilder_;
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
    /* renamed from: io.grpc.lb.v1.LoadBalanceResponse$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$grpc$lb$v1$LoadBalanceResponse$LoadBalanceResponseTypeCase;

        static {
            int[] iArr = new int[LoadBalanceResponseTypeCase.values().length];
            $SwitchMap$io$grpc$lb$v1$LoadBalanceResponse$LoadBalanceResponseTypeCase = iArr;
            try {
                iArr[LoadBalanceResponseTypeCase.INITIAL_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$grpc$lb$v1$LoadBalanceResponse$LoadBalanceResponseTypeCase[LoadBalanceResponseTypeCase.SERVER_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$grpc$lb$v1$LoadBalanceResponse$LoadBalanceResponseTypeCase[LoadBalanceResponseTypeCase.FALLBACK_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$grpc$lb$v1$LoadBalanceResponse$LoadBalanceResponseTypeCase[LoadBalanceResponseTypeCase.LOADBALANCERESPONSETYPE_NOT_SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static LoadBalanceResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<LoadBalanceResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<LoadBalanceResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public LoadBalanceResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
