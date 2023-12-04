package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
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
public final class EciesAeadHkdfPrivateKey extends GeneratedMessageLite<EciesAeadHkdfPrivateKey, Builder> implements EciesAeadHkdfPrivateKeyOrBuilder {
    private static final EciesAeadHkdfPrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<EciesAeadHkdfPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private EciesAeadHkdfPublicKey publicKey_;
    private int version_;

    private EciesAeadHkdfPrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
    public EciesAeadHkdfPublicKey getPublicKey() {
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = this.publicKey_;
        return eciesAeadHkdfPublicKey == null ? EciesAeadHkdfPublicKey.getDefaultInstance() : eciesAeadHkdfPublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(EciesAeadHkdfPublicKey value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(EciesAeadHkdfPublicKey value) {
        value.getClass();
        EciesAeadHkdfPublicKey eciesAeadHkdfPublicKey = this.publicKey_;
        if (eciesAeadHkdfPublicKey != null && eciesAeadHkdfPublicKey != EciesAeadHkdfPublicKey.getDefaultInstance()) {
            this.publicKey_ = EciesAeadHkdfPublicKey.newBuilder(this.publicKey_).mergeFrom((EciesAeadHkdfPublicKey.Builder) value).buildPartial();
        } else {
            this.publicKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString value) {
        value.getClass();
        this.keyValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    public static EciesAeadHkdfPrivateKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfPrivateKey parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfPrivateKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(CodedInputStream input) throws IOException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfPrivateKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfPrivateKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfPrivateKey, Builder> implements EciesAeadHkdfPrivateKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EciesAeadHkdfPrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
        public int getVersion() {
            return ((EciesAeadHkdfPrivateKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((EciesAeadHkdfPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
        public EciesAeadHkdfPublicKey getPublicKey() {
            return ((EciesAeadHkdfPrivateKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(EciesAeadHkdfPublicKey value) {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder setPublicKey(EciesAeadHkdfPublicKey.Builder builderForValue) {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).setPublicKey(builderForValue.build());
            return this;
        }

        public Builder mergePublicKey(EciesAeadHkdfPublicKey value) {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).mergePublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).clearPublicKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfPrivateKeyOrBuilder
        public ByteString getKeyValue() {
            return ((EciesAeadHkdfPrivateKey) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((EciesAeadHkdfPrivateKey) this.instance).clearKeyValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey$1  reason: invalid class name */
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
                return new EciesAeadHkdfPrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadHkdfPrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesAeadHkdfPrivateKey.class) {
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
        EciesAeadHkdfPrivateKey eciesAeadHkdfPrivateKey = new EciesAeadHkdfPrivateKey();
        DEFAULT_INSTANCE = eciesAeadHkdfPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfPrivateKey.class, eciesAeadHkdfPrivateKey);
    }

    public static EciesAeadHkdfPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesAeadHkdfPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
