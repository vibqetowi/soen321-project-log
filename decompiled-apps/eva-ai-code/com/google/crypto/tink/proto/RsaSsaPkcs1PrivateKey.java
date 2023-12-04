package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPkcs1PublicKey;
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
public final class RsaSsaPkcs1PrivateKey extends GeneratedMessageLite<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
    public static final int CRT_FIELD_NUMBER = 8;
    private static final RsaSsaPkcs1PrivateKey DEFAULT_INSTANCE;
    public static final int DP_FIELD_NUMBER = 6;
    public static final int DQ_FIELD_NUMBER = 7;
    public static final int D_FIELD_NUMBER = 3;
    private static volatile Parser<RsaSsaPkcs1PrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int P_FIELD_NUMBER = 4;
    public static final int Q_FIELD_NUMBER = 5;
    public static final int VERSION_FIELD_NUMBER = 1;
    private RsaSsaPkcs1PublicKey publicKey_;
    private int version_;
    private ByteString d_ = ByteString.EMPTY;
    private ByteString p_ = ByteString.EMPTY;
    private ByteString q_ = ByteString.EMPTY;
    private ByteString dp_ = ByteString.EMPTY;
    private ByteString dq_ = ByteString.EMPTY;
    private ByteString crt_ = ByteString.EMPTY;

    private RsaSsaPkcs1PrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public RsaSsaPkcs1PublicKey getPublicKey() {
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = this.publicKey_;
        return rsaSsaPkcs1PublicKey == null ? RsaSsaPkcs1PublicKey.getDefaultInstance() : rsaSsaPkcs1PublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(RsaSsaPkcs1PublicKey value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(RsaSsaPkcs1PublicKey value) {
        value.getClass();
        RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey = this.publicKey_;
        if (rsaSsaPkcs1PublicKey != null && rsaSsaPkcs1PublicKey != RsaSsaPkcs1PublicKey.getDefaultInstance()) {
            this.publicKey_ = RsaSsaPkcs1PublicKey.newBuilder(this.publicKey_).mergeFrom((RsaSsaPkcs1PublicKey.Builder) value).buildPartial();
        } else {
            this.publicKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getD() {
        return this.d_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setD(ByteString value) {
        value.getClass();
        this.d_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearD() {
        this.d_ = getDefaultInstance().getD();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getP() {
        return this.p_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setP(ByteString value) {
        value.getClass();
        this.p_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearP() {
        this.p_ = getDefaultInstance().getP();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getQ() {
        return this.q_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQ(ByteString value) {
        value.getClass();
        this.q_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQ() {
        this.q_ = getDefaultInstance().getQ();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getDp() {
        return this.dp_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDp(ByteString value) {
        value.getClass();
        this.dp_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDp() {
        this.dp_ = getDefaultInstance().getDp();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getDq() {
        return this.dq_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDq(ByteString value) {
        value.getClass();
        this.dq_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDq() {
        this.dq_ = getDefaultInstance().getDq();
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
    public ByteString getCrt() {
        return this.crt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrt(ByteString value) {
        value.getClass();
        this.crt_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrt() {
        this.crt_ = getDefaultInstance().getCrt();
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1PrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PrivateKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(CodedInputStream input) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1PrivateKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1PrivateKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1PrivateKey, Builder> implements RsaSsaPkcs1PrivateKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(RsaSsaPkcs1PrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public int getVersion() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public RsaSsaPkcs1PublicKey getPublicKey() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder setPublicKey(RsaSsaPkcs1PublicKey.Builder builderForValue) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setPublicKey(builderForValue.build());
            return this;
        }

        public Builder mergePublicKey(RsaSsaPkcs1PublicKey value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).mergePublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearPublicKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getD() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getD();
        }

        public Builder setD(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setD(value);
            return this;
        }

        public Builder clearD() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearD();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getP() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getP();
        }

        public Builder setP(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setP(value);
            return this;
        }

        public Builder clearP() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearP();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getQ() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getQ();
        }

        public Builder setQ(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setQ(value);
            return this;
        }

        public Builder clearQ() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearQ();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDp() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDp();
        }

        public Builder setDp(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDp(value);
            return this;
        }

        public Builder clearDp() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDp();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getDq() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getDq();
        }

        public Builder setDq(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setDq(value);
            return this;
        }

        public Builder clearDq() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearDq();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKeyOrBuilder
        public ByteString getCrt() {
            return ((RsaSsaPkcs1PrivateKey) this.instance).getCrt();
        }

        public Builder setCrt(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).setCrt(value);
            return this;
        }

        public Builder clearCrt() {
            copyOnWrite();
            ((RsaSsaPkcs1PrivateKey) this.instance).clearCrt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1PrivateKey$1  reason: invalid class name */
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
                return new RsaSsaPkcs1PrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"version_", "publicKey_", "d_", "p_", "q_", "dp_", "dq_", "crt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPkcs1PrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPkcs1PrivateKey.class) {
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
        RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey = new RsaSsaPkcs1PrivateKey();
        DEFAULT_INSTANCE = rsaSsaPkcs1PrivateKey;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1PrivateKey.class, rsaSsaPkcs1PrivateKey);
    }

    public static RsaSsaPkcs1PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RsaSsaPkcs1PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
