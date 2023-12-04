package com.google.crypto.tink.proto;

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
public final class EciesHkdfKemParams extends GeneratedMessageLite<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final EciesHkdfKemParams DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile Parser<EciesHkdfKemParams> PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private ByteString hkdfSalt_ = ByteString.EMPTY;

    private EciesHkdfKemParams() {
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getCurveTypeValue() {
        return this.curveType_;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public EllipticCurveType getCurveType() {
        EllipticCurveType forNumber = EllipticCurveType.forNumber(this.curveType_);
        return forNumber == null ? EllipticCurveType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveTypeValue(int value) {
        this.curveType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveType(EllipticCurveType value) {
        this.curveType_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurveType() {
        this.curveType_ = 0;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public HashType getHkdfHashType() {
        HashType forNumber = HashType.forNumber(this.hkdfHashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashTypeValue(int value) {
        this.hkdfHashType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfHashType(HashType value) {
        this.hkdfHashType_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfHashType() {
        this.hkdfHashType_ = 0;
    }

    @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
    public ByteString getHkdfSalt() {
        return this.hkdfSalt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHkdfSalt(ByteString value) {
        value.getClass();
        this.hkdfSalt_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHkdfSalt() {
        this.hkdfSalt_ = getDefaultInstance().getHkdfSalt();
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesHkdfKemParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesHkdfKemParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesHkdfKemParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(InputStream input) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesHkdfKemParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesHkdfKemParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesHkdfKemParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesHkdfKemParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream input) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesHkdfKemParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesHkdfKemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesHkdfKemParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesHkdfKemParams, Builder> implements EciesHkdfKemParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EciesHkdfKemParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getCurveTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getCurveTypeValue();
        }

        public Builder setCurveTypeValue(int value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setCurveTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public EllipticCurveType getCurveType() {
            return ((EciesHkdfKemParams) this.instance).getCurveType();
        }

        public Builder setCurveType(EllipticCurveType value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setCurveType(value);
            return this;
        }

        public Builder clearCurveType() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearCurveType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public int getHkdfHashTypeValue() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashTypeValue();
        }

        public Builder setHkdfHashTypeValue(int value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfHashTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public HashType getHkdfHashType() {
            return ((EciesHkdfKemParams) this.instance).getHkdfHashType();
        }

        public Builder setHkdfHashType(HashType value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfHashType(value);
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearHkdfHashType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EciesHkdfKemParamsOrBuilder
        public ByteString getHkdfSalt() {
            return ((EciesHkdfKemParams) this.instance).getHkdfSalt();
        }

        public Builder setHkdfSalt(ByteString value) {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).setHkdfSalt(value);
            return this;
        }

        public Builder clearHkdfSalt() {
            copyOnWrite();
            ((EciesHkdfKemParams) this.instance).clearHkdfSalt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesHkdfKemParams$1  reason: invalid class name */
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
                return new EciesHkdfKemParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesHkdfKemParams> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesHkdfKemParams.class) {
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
        EciesHkdfKemParams eciesHkdfKemParams = new EciesHkdfKemParams();
        DEFAULT_INSTANCE = eciesHkdfKemParams;
        GeneratedMessageLite.registerDefaultInstance(EciesHkdfKemParams.class, eciesHkdfKemParams);
    }

    public static EciesHkdfKemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesHkdfKemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
