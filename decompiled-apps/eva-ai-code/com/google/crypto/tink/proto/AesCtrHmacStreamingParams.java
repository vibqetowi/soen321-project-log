package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.HmacParams;
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
public final class AesCtrHmacStreamingParams extends GeneratedMessageLite<AesCtrHmacStreamingParams, Builder> implements AesCtrHmacStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final AesCtrHmacStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    public static final int HMAC_PARAMS_FIELD_NUMBER = 4;
    private static volatile Parser<AesCtrHmacStreamingParams> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;
    private HmacParams hmacParams_;

    private AesCtrHmacStreamingParams() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCiphertextSegmentSize(int value) {
        this.ciphertextSegmentSize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCiphertextSegmentSize() {
        this.ciphertextSegmentSize_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public int getDerivedKeySize() {
        return this.derivedKeySize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDerivedKeySize(int value) {
        this.derivedKeySize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDerivedKeySize() {
        this.derivedKeySize_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public boolean hasHmacParams() {
        return this.hmacParams_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
    public HmacParams getHmacParams() {
        HmacParams hmacParams = this.hmacParams_;
        return hmacParams == null ? HmacParams.getDefaultInstance() : hmacParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacParams(HmacParams value) {
        value.getClass();
        this.hmacParams_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacParams(HmacParams value) {
        value.getClass();
        HmacParams hmacParams = this.hmacParams_;
        if (hmacParams != null && hmacParams != HmacParams.getDefaultInstance()) {
            this.hmacParams_ = HmacParams.newBuilder(this.hmacParams_).mergeFrom((HmacParams.Builder) value).buildPartial();
        } else {
            this.hmacParams_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacParams() {
        this.hmacParams_ = null;
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacStreamingParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacStreamingParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacStreamingParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacStreamingParams parseFrom(InputStream input) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacStreamingParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacStreamingParams parseDelimitedFrom(InputStream input) throws IOException {
        return (AesCtrHmacStreamingParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacStreamingParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacStreamingParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacStreamingParams parseFrom(CodedInputStream input) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacStreamingParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacStreamingParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacStreamingParams, Builder> implements AesCtrHmacStreamingParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(AesCtrHmacStreamingParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public int getCiphertextSegmentSize() {
            return ((AesCtrHmacStreamingParams) this.instance).getCiphertextSegmentSize();
        }

        public Builder setCiphertextSegmentSize(int value) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setCiphertextSegmentSize(value);
            return this;
        }

        public Builder clearCiphertextSegmentSize() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearCiphertextSegmentSize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public int getDerivedKeySize() {
            return ((AesCtrHmacStreamingParams) this.instance).getDerivedKeySize();
        }

        public Builder setDerivedKeySize(int value) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setDerivedKeySize(value);
            return this;
        }

        public Builder clearDerivedKeySize() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearDerivedKeySize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public int getHkdfHashTypeValue() {
            return ((AesCtrHmacStreamingParams) this.instance).getHkdfHashTypeValue();
        }

        public Builder setHkdfHashTypeValue(int value) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHkdfHashTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public HashType getHkdfHashType() {
            return ((AesCtrHmacStreamingParams) this.instance).getHkdfHashType();
        }

        public Builder setHkdfHashType(HashType value) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHkdfHashType(value);
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearHkdfHashType();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public boolean hasHmacParams() {
            return ((AesCtrHmacStreamingParams) this.instance).hasHmacParams();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacStreamingParamsOrBuilder
        public HmacParams getHmacParams() {
            return ((AesCtrHmacStreamingParams) this.instance).getHmacParams();
        }

        public Builder setHmacParams(HmacParams value) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHmacParams(value);
            return this;
        }

        public Builder setHmacParams(HmacParams.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).setHmacParams(builderForValue.build());
            return this;
        }

        public Builder mergeHmacParams(HmacParams value) {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).mergeHmacParams(value);
            return this;
        }

        public Builder clearHmacParams() {
            copyOnWrite();
            ((AesCtrHmacStreamingParams) this.instance).clearHmacParams();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacStreamingParams$1  reason: invalid class name */
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
                return new AesCtrHmacStreamingParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f\u0004\t", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_", "hmacParams_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacStreamingParams> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrHmacStreamingParams.class) {
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
        AesCtrHmacStreamingParams aesCtrHmacStreamingParams = new AesCtrHmacStreamingParams();
        DEFAULT_INSTANCE = aesCtrHmacStreamingParams;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacStreamingParams.class, aesCtrHmacStreamingParams);
    }

    public static AesCtrHmacStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesCtrHmacStreamingParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
