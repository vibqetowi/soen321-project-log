package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.RsaSsaPssParams;
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
public final class RsaSsaPssKeyFormat extends GeneratedMessageLite<RsaSsaPssKeyFormat, Builder> implements RsaSsaPssKeyFormatOrBuilder {
    private static final RsaSsaPssKeyFormat DEFAULT_INSTANCE;
    public static final int MODULUS_SIZE_IN_BITS_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<RsaSsaPssKeyFormat> PARSER = null;
    public static final int PUBLIC_EXPONENT_FIELD_NUMBER = 3;
    private int modulusSizeInBits_;
    private RsaSsaPssParams params_;
    private ByteString publicExponent_ = ByteString.EMPTY;

    private RsaSsaPssKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
    public RsaSsaPssParams getParams() {
        RsaSsaPssParams rsaSsaPssParams = this.params_;
        return rsaSsaPssParams == null ? RsaSsaPssParams.getDefaultInstance() : rsaSsaPssParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(RsaSsaPssParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(RsaSsaPssParams value) {
        value.getClass();
        RsaSsaPssParams rsaSsaPssParams = this.params_;
        if (rsaSsaPssParams != null && rsaSsaPssParams != RsaSsaPssParams.getDefaultInstance()) {
            this.params_ = RsaSsaPssParams.newBuilder(this.params_).mergeFrom((RsaSsaPssParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
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

    @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
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

    public static RsaSsaPssKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPssKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPssKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RsaSsaPssKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RsaSsaPssKeyFormat parseFrom(InputStream input) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPssKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPssKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (RsaSsaPssKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPssKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPssKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RsaSsaPssKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RsaSsaPssKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RsaSsaPssKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RsaSsaPssKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RsaSsaPssKeyFormat, Builder> implements RsaSsaPssKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(RsaSsaPssKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
        public boolean hasParams() {
            return ((RsaSsaPssKeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
        public RsaSsaPssParams getParams() {
            return ((RsaSsaPssKeyFormat) this.instance).getParams();
        }

        public Builder setParams(RsaSsaPssParams value) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(RsaSsaPssParams.Builder builderForValue) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(RsaSsaPssParams value) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
        public int getModulusSizeInBits() {
            return ((RsaSsaPssKeyFormat) this.instance).getModulusSizeInBits();
        }

        public Builder setModulusSizeInBits(int value) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setModulusSizeInBits(value);
            return this;
        }

        public Builder clearModulusSizeInBits() {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).clearModulusSizeInBits();
            return this;
        }

        @Override // com.google.crypto.tink.proto.RsaSsaPssKeyFormatOrBuilder
        public ByteString getPublicExponent() {
            return ((RsaSsaPssKeyFormat) this.instance).getPublicExponent();
        }

        public Builder setPublicExponent(ByteString value) {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).setPublicExponent(value);
            return this;
        }

        public Builder clearPublicExponent() {
            copyOnWrite();
            ((RsaSsaPssKeyFormat) this.instance).clearPublicExponent();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RsaSsaPssKeyFormat$1  reason: invalid class name */
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
                return new RsaSsaPssKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"params_", "modulusSizeInBits_", "publicExponent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RsaSsaPssKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (RsaSsaPssKeyFormat.class) {
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
        RsaSsaPssKeyFormat rsaSsaPssKeyFormat = new RsaSsaPssKeyFormat();
        DEFAULT_INSTANCE = rsaSsaPssKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(RsaSsaPssKeyFormat.class, rsaSsaPssKeyFormat);
    }

    public static RsaSsaPssKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RsaSsaPssKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
