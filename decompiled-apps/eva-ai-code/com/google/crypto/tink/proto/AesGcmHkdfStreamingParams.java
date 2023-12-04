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
public final class AesGcmHkdfStreamingParams extends GeneratedMessageLite<AesGcmHkdfStreamingParams, Builder> implements AesGcmHkdfStreamingParamsOrBuilder {
    public static final int CIPHERTEXT_SEGMENT_SIZE_FIELD_NUMBER = 1;
    private static final AesGcmHkdfStreamingParams DEFAULT_INSTANCE;
    public static final int DERIVED_KEY_SIZE_FIELD_NUMBER = 2;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser<AesGcmHkdfStreamingParams> PARSER;
    private int ciphertextSegmentSize_;
    private int derivedKeySize_;
    private int hkdfHashType_;

    private AesGcmHkdfStreamingParams() {
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
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

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
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

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
    public int getHkdfHashTypeValue() {
        return this.hkdfHashType_;
    }

    @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
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

    public static AesGcmHkdfStreamingParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmHkdfStreamingParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmHkdfStreamingParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesGcmHkdfStreamingParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesGcmHkdfStreamingParams parseFrom(InputStream input) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmHkdfStreamingParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesGcmHkdfStreamingParams parseDelimitedFrom(InputStream input) throws IOException {
        return (AesGcmHkdfStreamingParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmHkdfStreamingParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmHkdfStreamingParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesGcmHkdfStreamingParams parseFrom(CodedInputStream input) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesGcmHkdfStreamingParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesGcmHkdfStreamingParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesGcmHkdfStreamingParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesGcmHkdfStreamingParams, Builder> implements AesGcmHkdfStreamingParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(AesGcmHkdfStreamingParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public int getCiphertextSegmentSize() {
            return ((AesGcmHkdfStreamingParams) this.instance).getCiphertextSegmentSize();
        }

        public Builder setCiphertextSegmentSize(int value) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setCiphertextSegmentSize(value);
            return this;
        }

        public Builder clearCiphertextSegmentSize() {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).clearCiphertextSegmentSize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public int getDerivedKeySize() {
            return ((AesGcmHkdfStreamingParams) this.instance).getDerivedKeySize();
        }

        public Builder setDerivedKeySize(int value) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setDerivedKeySize(value);
            return this;
        }

        public Builder clearDerivedKeySize() {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).clearDerivedKeySize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public int getHkdfHashTypeValue() {
            return ((AesGcmHkdfStreamingParams) this.instance).getHkdfHashTypeValue();
        }

        public Builder setHkdfHashTypeValue(int value) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setHkdfHashTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesGcmHkdfStreamingParamsOrBuilder
        public HashType getHkdfHashType() {
            return ((AesGcmHkdfStreamingParams) this.instance).getHkdfHashType();
        }

        public Builder setHkdfHashType(HashType value) {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).setHkdfHashType(value);
            return this;
        }

        public Builder clearHkdfHashType() {
            copyOnWrite();
            ((AesGcmHkdfStreamingParams) this.instance).clearHkdfHashType();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesGcmHkdfStreamingParams$1  reason: invalid class name */
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
                return new AesGcmHkdfStreamingParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"ciphertextSegmentSize_", "derivedKeySize_", "hkdfHashType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesGcmHkdfStreamingParams> parser = PARSER;
                if (parser == null) {
                    synchronized (AesGcmHkdfStreamingParams.class) {
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
        AesGcmHkdfStreamingParams aesGcmHkdfStreamingParams = new AesGcmHkdfStreamingParams();
        DEFAULT_INSTANCE = aesGcmHkdfStreamingParams;
        GeneratedMessageLite.registerDefaultInstance(AesGcmHkdfStreamingParams.class, aesGcmHkdfStreamingParams);
    }

    public static AesGcmHkdfStreamingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesGcmHkdfStreamingParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
