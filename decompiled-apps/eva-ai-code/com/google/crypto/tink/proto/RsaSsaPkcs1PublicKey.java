package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class RsaSsaPkcs1PublicKey extends GeneratedMessageLite<RsaSsaPkcs1PublicKey, Builder> implements RsaSsaPkcs1PublicKeyOrBuilder {
    private static final RsaSsaPkcs1PublicKey DEFAULT_INSTANCE;
    public static final int E_FIELD_NUMBER = 4;
    public static final int N_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<RsaSsaPkcs1PublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private RsaSsaPkcs1Params params_;
    private int version_;
    private ByteString n_ = ByteString.EMPTY;
    private ByteString e_ = ByteString.EMPTY;

    private RsaSsaPkcs1PublicKey() {
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
    public int getVersion() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int value) {
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
    public RsaSsaPkcs1Params getParams() {
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        return rsaSsaPkcs1Params == null ? RsaSsaPkcs1Params.getDefaultInstance() : rsaSsaPkcs1Params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(RsaSsaPkcs1Params value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(RsaSsaPkcs1Params value) {
        value.getClass();
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        if (rsaSsaPkcs1Params != null && rsaSsaPkcs1Params != RsaSsaPkcs1Params.getDefaultInstance()) {
            this.params_ = RsaSsaPkcs1Params.newBuilder(this.params_).mergeFrom((RsaSsaPkcs1Params.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
    public ByteString getN() {
        return this.n_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setN(ByteString value) {
        value.getClass();
        this.n_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearN() {
        this.n_ = getDefaultInstance().getN();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
    public ByteString getE() {
        return this.e_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setE(ByteString value) {
        value.getClass();
        this.e_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearE() {
        this.e_ = getDefaultInstance().getE();
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1PublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PublicKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(CodedInputStream input) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PublicKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1PublicKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1PublicKey, Builder> implements RsaSsaPkcs1PublicKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(RsaSsaPkcs1PublicKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
        public int getVersion() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
        public boolean hasParams() {
            return ((RsaSsaPkcs1PublicKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
        public RsaSsaPkcs1Params getParams() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getParams();
        }

        public Builder setParams(RsaSsaPkcs1Params value) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(RsaSsaPkcs1Params.Builder builderForValue) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(RsaSsaPkcs1Params value) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
        public ByteString getN() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getN();
        }

        public Builder setN(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setN(value);
            return this;
        }

        public Builder clearN() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearN();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PublicKeyOrBuilder
        public ByteString getE() {
            return ((RsaSsaPkcs1PublicKey) this.instance).getE();
        }

        public Builder setE(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).setE(value);
            return this;
        }

        public Builder clearE() {
            copyOnWrite();
            ((RsaSsaPkcs1PublicKey) this.instance).clearE();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new RsaSsaPkcs1PublicKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "n_", "e_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPkcs1PublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPkcs1PublicKey.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = new RsaSsaPkcs1PublicKey();
        DEFAULT_INSTANCE = rsaSsaPkcs1PublicKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1PublicKey.class, rsaSsaPkcs1PublicKey);
    }

    public static RsaSsaPkcs1PublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RsaSsaPkcs1PublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
