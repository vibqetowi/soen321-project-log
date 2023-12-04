package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeyTemplate;
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
public final class EciesAeadDemParams extends GeneratedMessageLite<EciesAeadDemParams, Builder> implements EciesAeadDemParamsOrBuilder {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final EciesAeadDemParams DEFAULT_INSTANCE;
    private static volatile Parser<EciesAeadDemParams> PARSER;
    private KeyTemplate aeadDem_;

    private EciesAeadDemParams() {
    }

    @Override // com.google.crypto.tink.proto.EciesAeadDemParamsOrBuilder
    public boolean hasAeadDem() {
        return this.aeadDem_ != null;
    }

    @Override // com.google.crypto.tink.proto.EciesAeadDemParamsOrBuilder
    public KeyTemplate getAeadDem() {
        KeyTemplate keyTemplate = this.aeadDem_;
        return keyTemplate == null ? KeyTemplate.getDefaultInstance() : keyTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAeadDem(KeyTemplate value) {
        value.getClass();
        this.aeadDem_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAeadDem(KeyTemplate value) {
        value.getClass();
        KeyTemplate keyTemplate = this.aeadDem_;
        if (keyTemplate != null && keyTemplate != KeyTemplate.getDefaultInstance()) {
            this.aeadDem_ = KeyTemplate.newBuilder(this.aeadDem_).mergeFrom((KeyTemplate.Builder) value).buildPartial();
        } else {
            this.aeadDem_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAeadDem() {
        this.aeadDem_ = null;
    }

    public static EciesAeadDemParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadDemParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadDemParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadDemParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadDemParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static EciesAeadDemParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static EciesAeadDemParams parseFrom(InputStream input) throws IOException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadDemParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadDemParams parseDelimitedFrom(InputStream input) throws IOException {
        return (EciesAeadDemParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadDemParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadDemParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static EciesAeadDemParams parseFrom(CodedInputStream input) throws IOException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static EciesAeadDemParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (EciesAeadDemParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(EciesAeadDemParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<EciesAeadDemParams, Builder> implements EciesAeadDemParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(EciesAeadDemParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.EciesAeadDemParamsOrBuilder
        public boolean hasAeadDem() {
            return ((EciesAeadDemParams) this.instance).hasAeadDem();
        }

        @Override // com.google.crypto.tink.proto.EciesAeadDemParamsOrBuilder
        public KeyTemplate getAeadDem() {
            return ((EciesAeadDemParams) this.instance).getAeadDem();
        }

        public Builder setAeadDem(KeyTemplate value) {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).setAeadDem(value);
            return this;
        }

        public Builder setAeadDem(KeyTemplate.Builder builderForValue) {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).setAeadDem(builderForValue.build());
            return this;
        }

        public Builder mergeAeadDem(KeyTemplate value) {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).mergeAeadDem(value);
            return this;
        }

        public Builder clearAeadDem() {
            copyOnWrite();
            ((EciesAeadDemParams) this.instance).clearAeadDem();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.EciesAeadDemParams$1  reason: invalid class name */
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
                return new EciesAeadDemParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"aeadDem_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EciesAeadDemParams> parser = PARSER;
                if (parser == null) {
                    synchronized (EciesAeadDemParams.class) {
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
        EciesAeadDemParams eciesAeadDemParams = new EciesAeadDemParams();
        DEFAULT_INSTANCE = eciesAeadDemParams;
        GeneratedMessageLite.registerDefaultInstance(EciesAeadDemParams.class, eciesAeadDemParams);
    }

    public static EciesAeadDemParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<EciesAeadDemParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
