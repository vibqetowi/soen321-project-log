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
public final class RsaSsaPssParams extends GeneratedMessageLite<RsaSsaPssParams, Builder> implements RsaSsaPssParamsOrBuilder {
    private static final RsaSsaPssParams DEFAULT_INSTANCE;
    public static final int MGF1_HASH_FIELD_NUMBER = 2;
    private static volatile Parser<RsaSsaPssParams> PARSER = null;
    public static final int SALT_LENGTH_FIELD_NUMBER = 3;
    public static final int SIG_HASH_FIELD_NUMBER = 1;
    private int mgf1Hash_;
    private int saltLength_;
    private int sigHash_;

    private RsaSsaPssParams() {
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
    public int getSigHashValue() {
        return this.sigHash_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
    public HashType getSigHash() {
        HashType forNumber = HashType.forNumber(this.sigHash_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSigHashValue(int value) {
        this.sigHash_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSigHash(HashType value) {
        this.sigHash_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSigHash() {
        this.sigHash_ = 0;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
    public int getMgf1HashValue() {
        return this.mgf1Hash_;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
    public HashType getMgf1Hash() {
        HashType forNumber = HashType.forNumber(this.mgf1Hash_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMgf1HashValue(int value) {
        this.mgf1Hash_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMgf1Hash(HashType value) {
        this.mgf1Hash_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMgf1Hash() {
        this.mgf1Hash_ = 0;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
    public int getSaltLength() {
        return this.saltLength_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSaltLength(int value) {
        this.saltLength_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSaltLength() {
        this.saltLength_ = 0;
    }

    public static RsaSsaPssParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPssParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPssParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPssParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPssParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPssParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPssParams parseFrom(InputStream input) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPssParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPssParams parseDelimitedFrom(InputStream input) throws IOException {
        return (RsaSsaPssParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPssParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPssParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPssParams parseFrom(CodedInputStream input) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPssParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPssParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPssParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssParams, Builder> implements RsaSsaPssParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(RsaSsaPssParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
        public int getSigHashValue() {
            return ((RsaSsaPssParams) this.instance).getSigHashValue();
        }

        public Builder setSigHashValue(int value) {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).setSigHashValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
        public HashType getSigHash() {
            return ((RsaSsaPssParams) this.instance).getSigHash();
        }

        public Builder setSigHash(HashType value) {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).setSigHash(value);
            return this;
        }

        public Builder clearSigHash() {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).clearSigHash();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
        public int getMgf1HashValue() {
            return ((RsaSsaPssParams) this.instance).getMgf1HashValue();
        }

        public Builder setMgf1HashValue(int value) {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).setMgf1HashValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
        public HashType getMgf1Hash() {
            return ((RsaSsaPssParams) this.instance).getMgf1Hash();
        }

        public Builder setMgf1Hash(HashType value) {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).setMgf1Hash(value);
            return this;
        }

        public Builder clearMgf1Hash() {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).clearMgf1Hash();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssParamsOrBuilder
        public int getSaltLength() {
            return ((RsaSsaPssParams) this.instance).getSaltLength();
        }

        public Builder setSaltLength(int value) {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).setSaltLength(value);
            return this;
        }

        public Builder clearSaltLength() {
            copyOnWrite();
            ((RsaSsaPssParams) this.instance).clearSaltLength();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssParams$1  reason: invalid class name */
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
                return new RsaSsaPssParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"sigHash_", "mgf1Hash_", "saltLength_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPssParams> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPssParams.class) {
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
        RsaSsaPssParams rsaSsaPssParams = new RsaSsaPssParams();
        DEFAULT_INSTANCE = rsaSsaPssParams;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssParams.class, rsaSsaPssParams);
    }

    public static RsaSsaPssParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RsaSsaPssParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
