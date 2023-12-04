package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.Ed25519PublicKey;
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
public final class Ed25519PrivateKey extends GeneratedMessageLite<Ed25519PrivateKey, Builder> implements Ed25519PrivateKeyOrBuilder {
    private static final Ed25519PrivateKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<Ed25519PrivateKey> PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private Ed25519PublicKey publicKey_;
    private int version_;

    private Ed25519PrivateKey() {
    }

    @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
    public boolean hasPublicKey() {
        return this.publicKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
    public Ed25519PublicKey getPublicKey() {
        Ed25519PublicKey ed25519PublicKey = this.publicKey_;
        return ed25519PublicKey == null ? Ed25519PublicKey.getDefaultInstance() : ed25519PublicKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicKey(Ed25519PublicKey value) {
        value.getClass();
        this.publicKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePublicKey(Ed25519PublicKey value) {
        value.getClass();
        Ed25519PublicKey ed25519PublicKey = this.publicKey_;
        if (ed25519PublicKey != null && ed25519PublicKey != Ed25519PublicKey.getDefaultInstance()) {
            this.publicKey_ = Ed25519PublicKey.newBuilder(this.publicKey_).mergeFrom((Ed25519PublicKey.Builder) value).buildPartial();
        } else {
            this.publicKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicKey() {
        this.publicKey_ = null;
    }

    public static Ed25519PrivateKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Ed25519PrivateKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Ed25519PrivateKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Ed25519PrivateKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Ed25519PrivateKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Ed25519PrivateKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Ed25519PrivateKey parseFrom(InputStream input) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Ed25519PrivateKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Ed25519PrivateKey parseDelimitedFrom(InputStream input) throws IOException {
        return (Ed25519PrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Ed25519PrivateKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Ed25519PrivateKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Ed25519PrivateKey parseFrom(CodedInputStream input) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Ed25519PrivateKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Ed25519PrivateKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Ed25519PrivateKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Ed25519PrivateKey, Builder> implements Ed25519PrivateKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(Ed25519PrivateKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
        public int getVersion() {
            return ((Ed25519PrivateKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
        public ByteString getKeyValue() {
            return ((Ed25519PrivateKey) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).clearKeyValue();
            return this;
        }

        @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
        public boolean hasPublicKey() {
            return ((Ed25519PrivateKey) this.instance).hasPublicKey();
        }

        @Override // com.google.crypto.tink.proto.Ed25519PrivateKeyOrBuilder
        public Ed25519PublicKey getPublicKey() {
            return ((Ed25519PrivateKey) this.instance).getPublicKey();
        }

        public Builder setPublicKey(Ed25519PublicKey value) {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).setPublicKey(value);
            return this;
        }

        public Builder setPublicKey(Ed25519PublicKey.Builder builderForValue) {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).setPublicKey(builderForValue.build());
            return this;
        }

        public Builder mergePublicKey(Ed25519PublicKey value) {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).mergePublicKey(value);
            return this;
        }

        public Builder clearPublicKey() {
            copyOnWrite();
            ((Ed25519PrivateKey) this.instance).clearPublicKey();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.Ed25519PrivateKey$1  reason: invalid class name */
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
                return new Ed25519PrivateKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "publicKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Ed25519PrivateKey> parser = PARSER;
                if (parser == null) {
                    synchronized (Ed25519PrivateKey.class) {
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
        Ed25519PrivateKey ed25519PrivateKey = new Ed25519PrivateKey();
        DEFAULT_INSTANCE = ed25519PrivateKey;
        GeneratedMessageLite.registerDefaultInstance(Ed25519PrivateKey.class, ed25519PrivateKey);
    }

    public static Ed25519PrivateKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Ed25519PrivateKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
