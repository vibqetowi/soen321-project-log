package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EcdsaParams;
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
public final class EcdsaPublicKey extends GeneratedMessageLite<EcdsaPublicKey, Builder> implements EcdsaPublicKeyOrBuilder {
    private static final EcdsaPublicKey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<EcdsaPublicKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private EcdsaParams params_;
    private int version_;
    private ByteString x_ = ByteString.EMPTY;
    private ByteString y_ = ByteString.EMPTY;

    private EcdsaPublicKey() {
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public EcdsaParams getParams() {
        EcdsaParams ecdsaParams = this.params_;
        return ecdsaParams == null ? EcdsaParams.getDefaultInstance() : ecdsaParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(EcdsaParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(EcdsaParams value) {
        value.getClass();
        EcdsaParams ecdsaParams = this.params_;
        if (ecdsaParams != null && ecdsaParams != EcdsaParams.getDefaultInstance()) {
            this.params_ = EcdsaParams.newBuilder(this.params_).mergeFrom((EcdsaParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public ByteString getX() {
        return this.x_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(ByteString value) {
        value.getClass();
        this.x_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.x_ = getDefaultInstance().getX();
    }

    @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
    public ByteString getY() {
        return this.y_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(ByteString value) {
        value.getClass();
        this.y_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.y_ = getDefaultInstance().getY();
    }

    public static EcdsaPublicKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaPublicKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaPublicKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaPublicKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaPublicKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaPublicKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaPublicKey parseFrom(InputStream input) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaPublicKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EcdsaPublicKey parseDelimitedFrom(InputStream input) throws IOException {
        return (EcdsaPublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaPublicKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaPublicKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EcdsaPublicKey parseFrom(CodedInputStream input) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaPublicKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaPublicKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EcdsaPublicKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaPublicKey, Builder> implements EcdsaPublicKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EcdsaPublicKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public int getVersion() {
            return ((EcdsaPublicKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public boolean hasParams() {
            return ((EcdsaPublicKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public EcdsaParams getParams() {
            return ((EcdsaPublicKey) this.instance).getParams();
        }

        public Builder setParams(EcdsaParams value) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(EcdsaParams.Builder builderForValue) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(EcdsaParams value) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public ByteString getX() {
            return ((EcdsaPublicKey) this.instance).getX();
        }

        public Builder setX(ByteString value) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setX(value);
            return this;
        }

        public Builder clearX() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearX();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaPublicKeyOrBuilder
        public ByteString getY() {
            return ((EcdsaPublicKey) this.instance).getY();
        }

        public Builder setY(ByteString value) {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).setY(value);
            return this;
        }

        public Builder clearY() {
            copyOnWrite();
            ((EcdsaPublicKey) this.instance).clearY();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EcdsaPublicKey$1  reason: invalid class name */
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
                return new EcdsaPublicKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaPublicKey> parser = PARSER;
                if (parser == null) {
                    synchronized (EcdsaPublicKey.class) {
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
        EcdsaPublicKey ecdsaPublicKey = new EcdsaPublicKey();
        DEFAULT_INSTANCE = ecdsaPublicKey;
        GeneratedMessageLite.registerDefaultInstance(EcdsaPublicKey.class, ecdsaPublicKey);
    }

    public static EcdsaPublicKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EcdsaPublicKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
