package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.EciesAeadHkdfParams;
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
public final class EciesAeadHkdfKeyFormat extends GeneratedMessageLite<EciesAeadHkdfKeyFormat, Builder> implements EciesAeadHkdfKeyFormatOrBuilder {
    private static final EciesAeadHkdfKeyFormat DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<EciesAeadHkdfKeyFormat> PARSER;
    private EciesAeadHkdfParams params_;

    private EciesAeadHkdfKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadHkdfKeyFormatOrBuilder
    public EciesAeadHkdfParams getParams() {
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        return eciesAeadHkdfParams == null ? EciesAeadHkdfParams.getDefaultInstance() : eciesAeadHkdfParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(EciesAeadHkdfParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(EciesAeadHkdfParams value) {
        value.getClass();
        EciesAeadHkdfParams eciesAeadHkdfParams = this.params_;
        if (eciesAeadHkdfParams != null && eciesAeadHkdfParams != EciesAeadHkdfParams.getDefaultInstance()) {
            this.params_ = EciesAeadHkdfParams.newBuilder(this.params_).mergeFrom((EciesAeadHkdfParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    public static EciesAeadHkdfKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesAeadHkdfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadHkdfKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadHkdfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadHkdfKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadHkdfKeyFormat, Builder> implements EciesAeadHkdfKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EciesAeadHkdfKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfKeyFormatOrBuilder
        public boolean hasParams() {
            return ((EciesAeadHkdfKeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadHkdfKeyFormatOrBuilder
        public EciesAeadHkdfParams getParams() {
            return ((EciesAeadHkdfKeyFormat) this.instance).getParams();
        }

        public Builder setParams(EciesAeadHkdfParams value) {
            copyOnWrite();
            ((EciesAeadHkdfKeyFormat) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(EciesAeadHkdfParams.Builder builderForValue) {
            copyOnWrite();
            ((EciesAeadHkdfKeyFormat) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(EciesAeadHkdfParams value) {
            copyOnWrite();
            ((EciesAeadHkdfKeyFormat) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((EciesAeadHkdfKeyFormat) this.instance).clearParams();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat$1  reason: invalid class name */
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
                return new EciesAeadHkdfKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadHkdfKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesAeadHkdfKeyFormat.class) {
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
        EciesAeadHkdfKeyFormat eciesAeadHkdfKeyFormat = new EciesAeadHkdfKeyFormat();
        DEFAULT_INSTANCE = eciesAeadHkdfKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadHkdfKeyFormat.class, eciesAeadHkdfKeyFormat);
    }

    public static EciesAeadHkdfKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesAeadHkdfKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
