package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EcdsaPublicKey;
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
public final class EcdsaPrivateKey extends GeneratedMessageLite<EcdsaPrivateKey, Builder> implements EcdsaPrivateKeyOrBuilder {
    private static final EcdsaPrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<EcdsaPrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private EcdsaPublicKey publicKey_;
    private int version_;

    private EcdsaPrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
    public EcdsaPublicKey getPublicKey() {
        EcdsaPublicKey ecdsaPublicKey = this.publicKey_;
        return ecdsaPublicKey == null ? EcdsaPublicKey.getDefaultInstance() : ecdsaPublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(EcdsaPublicKey value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(EcdsaPublicKey value) {
        value.getClass();
        EcdsaPublicKey ecdsaPublicKey = this.publicKey_;
        if (ecdsaPublicKey != null && ecdsaPublicKey != EcdsaPublicKey.getDefaultInstance()) {
            this.publicKey_ = EcdsaPublicKey.newBuilder(this.publicKey_).mergeFrom((EcdsaPublicKey.Builder) value).buildPartial();
        } else {
            this.publicKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
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

    public static EcdsaPrivateKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaPrivateKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaPrivateKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaPrivateKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaPrivateKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaPrivateKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaPrivateKey parseFrom(InputStream input) throws IOException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaPrivateKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EcdsaPrivateKey parseDelimitedFrom(InputStream input) throws IOException {
        return (EcdsaPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaPrivateKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaPrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EcdsaPrivateKey parseFrom(CodedInputStream input) throws IOException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaPrivateKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaPrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EcdsaPrivateKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaPrivateKey, Builder> implements EcdsaPrivateKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EcdsaPrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
        public int getVersion() {
            return ((EcdsaPrivateKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((EcdsaPrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
        public EcdsaPublicKey getPublicKey() {
            return ((EcdsaPrivateKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(EcdsaPublicKey value) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder setPublicKey(EcdsaPublicKey.Builder builderForValue) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setPublicKey(builderForValue.build());
            return this;
        }

        public Builder mergePublicKey(EcdsaPublicKey value) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).mergePublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).clearPublicKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaPrivateKeyOrBuilder
        public ByteString getKeyValue() {
            return ((EcdsaPrivateKey) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((EcdsaPrivateKey) this.instance).clearKeyValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EcdsaPrivateKey$1  reason: invalid class name */
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
                return new EcdsaPrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaPrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (EcdsaPrivateKey.class) {
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
        EcdsaPrivateKey ecdsaPrivateKey = new EcdsaPrivateKey();
        DEFAULT_INSTANCE = ecdsaPrivateKey;
        GeneratedMessageLite.registerDefaultInstance(EcdsaPrivateKey.class, ecdsaPrivateKey);
    }

    public static EcdsaPrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EcdsaPrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
