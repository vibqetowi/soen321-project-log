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
public final class HmacPrfParams extends GeneratedMessageLite<HmacPrfParams, Builder> implements HmacPrfParamsOrBuilder {
    private static final HmacPrfParams DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile Parser<HmacPrfParams> PARSER;
    private int hash_;

    private HmacPrfParams() {
    }

    @Override // com.google.crypto.tink.proto.HmacPrfParamsOrBuilder
    public int getHashValue() {
        return this.hash_;
    }

    @Override // com.google.crypto.tink.proto.HmacPrfParamsOrBuilder
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

    public static HmacPrfParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfParams parseFrom(InputStream input) throws IOException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HmacPrfParams parseDelimitedFrom(InputStream input) throws IOException {
        return (HmacPrfParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HmacPrfParams parseFrom(CodedInputStream input) throws IOException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HmacPrfParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HmacPrfParams, Builder> implements HmacPrfParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HmacPrfParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HmacPrfParamsOrBuilder
        public int getHashValue() {
            return ((HmacPrfParams) this.instance).getHashValue();
        }

        public Builder setHashValue(int value) {
            copyOnWrite();
            ((HmacPrfParams) this.instance).setHashValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacPrfParamsOrBuilder
        public HashType getHash() {
            return ((HmacPrfParams) this.instance).getHash();
        }

        public Builder setHash(HashType value) {
            copyOnWrite();
            ((HmacPrfParams) this.instance).setHash(value);
            return this;
        }

        public Builder clearHash() {
            copyOnWrite();
            ((HmacPrfParams) this.instance).clearHash();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HmacPrfParams$1  reason: invalid class name */
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
                return new HmacPrfParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HmacPrfParams> parser = PARSER;
                if (parser == null) {
                    synchronized (HmacPrfParams.class) {
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
        HmacPrfParams hmacPrfParams = new HmacPrfParams();
        DEFAULT_INSTANCE = hmacPrfParams;
        GeneratedMessageLite.registerDefaultInstance(HmacPrfParams.class, hmacPrfParams);
    }

    public static HmacPrfParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HmacPrfParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
