package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPkcs1Params;
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
public final class RsaSsaPkcs1KeyFormat extends GeneratedMessageLite<RsaSsaPkcs1KeyFormat, Builder> implements RsaSsaPkcs1KeyFormatOrBuilder {
    private static final RsaSsaPkcs1KeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<RsaSsaPkcs1KeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int modulusSizeInBits_;
    private RsaSsaPkcs1Params params_;
    private ByteString publicExponent_ = ByteString.EMPTY;

    private RsaSsaPkcs1KeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public RsaSsaPkcs1Params getParams() {
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        return rsaSsaPkcs1Params == null ? RsaSsaPkcs1Params.getDefaultInstance() : rsaSsaPkcs1Params;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(RsaSsaPkcs1Params value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(RsaSsaPkcs1Params value) {
        value.getClass();
        RsaSsaPkcs1Params rsaSsaPkcs1Params = this.params_;
        if (rsaSsaPkcs1Params != null && rsaSsaPkcs1Params != RsaSsaPkcs1Params.getDefaultInstance()) {
            this.params_ = RsaSsaPkcs1Params.newBuilder(this.params_).mergeFrom((RsaSsaPkcs1Params.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public int getModulusSizeInBits() {
        return this.modulusSizeInBits_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModulusSizeInBits(int value) {
        this.modulusSizeInBits_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModulusSizeInBits() {
        this.modulusSizeInBits_ = 0;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
    public ByteString getPublicExponent() {
        return this.publicExponent_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicExponent(ByteString value) {
        value.getClass();
        this.publicExponent_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicExponent() {
        this.publicExponent_ = getDefaultInstance().getPublicExponent();
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1KeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (RsaSsaPkcs1KeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1KeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1KeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPkcs1KeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPkcs1KeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPkcs1KeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPkcs1KeyFormat, Builder> implements RsaSsaPkcs1KeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(RsaSsaPkcs1KeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public boolean hasParams() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public RsaSsaPkcs1Params getParams() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getParams();
        }

        public Builder setParams(RsaSsaPkcs1Params value) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(RsaSsaPkcs1Params.Builder builderForValue) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(RsaSsaPkcs1Params value) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public int getModulusSizeInBits() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getModulusSizeInBits();
        }

        public Builder setModulusSizeInBits(int value) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setModulusSizeInBits(value);
            return this;
        }

        public Builder clearModulusSizeInBits() {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).clearModulusSizeInBits();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormatOrBuilder
        public ByteString getPublicExponent() {
            return ((RsaSsaPkcs1KeyFormat) this.instance).getPublicExponent();
        }

        public Builder setPublicExponent(ByteString value) {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).setPublicExponent(value);
            return this;
        }

        public Builder clearPublicExponent() {
            copyOnWrite();
            ((RsaSsaPkcs1KeyFormat) this.instance).clearPublicExponent();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat$1  reason: invalid class name */
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
                return new RsaSsaPkcs1KeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"params_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPkcs1KeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPkcs1KeyFormat.class) {
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
        RsaSsaPkcs1KeyFormat rsaSsaPkcs1KeyFormat = new RsaSsaPkcs1KeyFormat();
        DEFAULT_INSTANCE = rsaSsaPkcs1KeyFormat;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPkcs1KeyFormat.class, rsaSsaPkcs1KeyFormat);
    }

    public static RsaSsaPkcs1KeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RsaSsaPkcs1KeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
