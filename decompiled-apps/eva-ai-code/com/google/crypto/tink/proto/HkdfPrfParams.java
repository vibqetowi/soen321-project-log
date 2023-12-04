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
public final class HkdfPrfParams extends GeneratedMessageLite<HkdfPrfParams, Builder> implements HkdfPrfParamsOrBuilder {
    private static final HkdfPrfParams DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile Parser<HkdfPrfParams> PARSER = null;
    public static final int SALT_FIELD_NUMBER = 2;
    private int hash_;
    private ByteString salt_ = ByteString.EMPTY;

    private HkdfPrfParams() {
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
    public int getHashValue() {
        return this.hash_;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
    public HashType getHash() {
        HashType forNumber = HashType.forNumber(this.hash_);
        return forNumber == null ? HashType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashValue(int value) {
        this.hash_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHash(HashType value) {
        this.hash_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHash() {
        this.hash_ = 0;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
    public ByteString getSalt() {
        return this.salt_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSalt(ByteString value) {
        value.getClass();
        this.salt_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSalt() {
        this.salt_ = getDefaultInstance().getSalt();
    }

    public static HkdfPrfParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfParams parseFrom(InputStream input) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HkdfPrfParams parseDelimitedFrom(InputStream input) throws IOException {
        return (HkdfPrfParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HkdfPrfParams parseFrom(CodedInputStream input) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HkdfPrfParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HkdfPrfParams, Builder> implements HkdfPrfParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HkdfPrfParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
        public int getHashValue() {
            return ((HkdfPrfParams) this.instance).getHashValue();
        }

        public Builder setHashValue(int value) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setHashValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
        public HashType getHash() {
            return ((HkdfPrfParams) this.instance).getHash();
        }

        public Builder setHash(HashType value) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setHash(value);
            return this;
        }

        public Builder clearHash() {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).clearHash();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfParamsOrBuilder
        public ByteString getSalt() {
            return ((HkdfPrfParams) this.instance).getSalt();
        }

        public Builder setSalt(ByteString value) {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).setSalt(value);
            return this;
        }

        public Builder clearSalt() {
            copyOnWrite();
            ((HkdfPrfParams) this.instance).clearSalt();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HkdfPrfParams$1  reason: invalid class name */
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
                return new HkdfPrfParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"hash_", "salt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HkdfPrfParams> parser = PARSER;
                if (parser == null) {
                    synchronized (HkdfPrfParams.class) {
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
        HkdfPrfParams hkdfPrfParams = new HkdfPrfParams();
        DEFAULT_INSTANCE = hkdfPrfParams;
        GeneratedMessageLite.registerDefaultInstance(HkdfPrfParams.class, hkdfPrfParams);
    }

    public static HkdfPrfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HkdfPrfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
