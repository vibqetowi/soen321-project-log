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
public final class EcdsaParams extends GeneratedMessageLite<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
    public static final int CURVE_FIELD_NUMBER = 2;
    private static final EcdsaParams DEFAULT_INSTANCE;
    public static final int ENCODING_FIELD_NUMBER = 3;
    public static final int HASH_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<EcdsaParams> PARSER;
    private int curve_;
    private int encoding_;
    private int hashType_;

    private EcdsaParams() {
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public int getHashTypeValue() {
        return this.hashType_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public HashType getHashType() {
        HashType forNumber = HashType.forNumber(this.hashType_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashTypeValue(int value) {
        this.hashType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashType(HashType value) {
        this.hashType_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHashType() {
        this.hashType_ = 0;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public int getCurveValue() {
        return this.curve_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public EllipticCurveType getCurve() {
        EllipticCurveType forNumber = EllipticCurveType.forNumber(this.curve_);
        return forNumber == null ? EllipticCurveType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurveValue(int value) {
        this.curve_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurve(EllipticCurveType value) {
        this.curve_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurve() {
        this.curve_ = 0;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public int getEncodingValue() {
        return this.encoding_;
    }

    @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
    public EcdsaSignatureEncoding getEncoding() {
        EcdsaSignatureEncoding forNumber = EcdsaSignatureEncoding.forNumber(this.encoding_);
        return forNumber == null ? EcdsaSignatureEncoding.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodingValue(int value) {
        this.encoding_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncoding(EcdsaSignatureEncoding value) {
        this.encoding_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncoding() {
        this.encoding_ = 0;
    }

    public static EcdsaParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EcdsaParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EcdsaParams parseFrom(InputStream input) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EcdsaParams parseDelimitedFrom(InputStream input) throws IOException {
        return (EcdsaParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EcdsaParams parseFrom(CodedInputStream input) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EcdsaParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EcdsaParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EcdsaParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EcdsaParams, Builder> implements EcdsaParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EcdsaParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public int getHashTypeValue() {
            return ((EcdsaParams) this.instance).getHashTypeValue();
        }

        public Builder setHashTypeValue(int value) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setHashTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public HashType getHashType() {
            return ((EcdsaParams) this.instance).getHashType();
        }

        public Builder setHashType(HashType value) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setHashType(value);
            return this;
        }

        public Builder clearHashType() {
            copyOnWrite();
            ((EcdsaParams) this.instance).clearHashType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public int getCurveValue() {
            return ((EcdsaParams) this.instance).getCurveValue();
        }

        public Builder setCurveValue(int value) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setCurveValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public EllipticCurveType getCurve() {
            return ((EcdsaParams) this.instance).getCurve();
        }

        public Builder setCurve(EllipticCurveType value) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setCurve(value);
            return this;
        }

        public Builder clearCurve() {
            copyOnWrite();
            ((EcdsaParams) this.instance).clearCurve();
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public int getEncodingValue() {
            return ((EcdsaParams) this.instance).getEncodingValue();
        }

        public Builder setEncodingValue(int value) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setEncodingValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.EcdsaParamsOrBuilder
        public EcdsaSignatureEncoding getEncoding() {
            return ((EcdsaParams) this.instance).getEncoding();
        }

        public Builder setEncoding(EcdsaSignatureEncoding value) {
            copyOnWrite();
            ((EcdsaParams) this.instance).setEncoding(value);
            return this;
        }

        public Builder clearEncoding() {
            copyOnWrite();
            ((EcdsaParams) this.instance).clearEncoding();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EcdsaParams$1  reason: invalid class name */
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
                return new EcdsaParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"hashType_", "curve_", "encoding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EcdsaParams> parser = PARSER;
                if (parser == null) {
                    synchronized (EcdsaParams.class) {
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
        EcdsaParams ecdsaParams = new EcdsaParams();
        DEFAULT_INSTANCE = ecdsaParams;
        GeneratedMessageLite.registerDefaultInstance(EcdsaParams.class, ecdsaParams);
    }

    public static EcdsaParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EcdsaParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
