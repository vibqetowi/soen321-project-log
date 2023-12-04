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
public final class KmsEnvelopeAeadKeyFormat extends GeneratedMessageLite<KmsEnvelopeAeadKeyFormat, Builder> implements KmsEnvelopeAeadKeyFormatOrBuilder {
    private static final KmsEnvelopeAeadKeyFormat DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile Parser<KmsEnvelopeAeadKeyFormat> PARSER;
    private KeyTemplate dekTemplate_;
    private String kekUri_ = "";

    private KmsEnvelopeAeadKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
    public String getKekUri() {
        return this.kekUri_;
    }

    @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
    public ByteString getKekUriBytes() {
        return ByteString.copyFromUtf8(this.kekUri_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKekUri(String value) {
        value.getClass();
        this.kekUri_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKekUri() {
        this.kekUri_ = getDefaultInstance().getKekUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKekUriBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.kekUri_ = value.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
    public boolean hasDekTemplate() {
        return this.dekTemplate_ != null;
    }

    @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
    public KeyTemplate getDekTemplate() {
        KeyTemplate keyTemplate = this.dekTemplate_;
        return keyTemplate == null ? KeyTemplate.getDefaultInstance() : keyTemplate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDekTemplate(KeyTemplate value) {
        value.getClass();
        this.dekTemplate_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDekTemplate(KeyTemplate value) {
        value.getClass();
        KeyTemplate keyTemplate = this.dekTemplate_;
        if (keyTemplate != null && keyTemplate != KeyTemplate.getDefaultInstance()) {
            this.dekTemplate_ = KeyTemplate.newBuilder(this.dekTemplate_).mergeFrom((KeyTemplate.Builder) value).buildPartial();
        } else {
            this.dekTemplate_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDekTemplate() {
        this.dekTemplate_ = null;
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(InputStream input) throws IOException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KmsEnvelopeAeadKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (KmsEnvelopeAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static KmsEnvelopeAeadKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KmsEnvelopeAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KmsEnvelopeAeadKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KmsEnvelopeAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KmsEnvelopeAeadKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KmsEnvelopeAeadKeyFormat, Builder> implements KmsEnvelopeAeadKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(KmsEnvelopeAeadKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
        public String getKekUri() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).getKekUri();
        }

        @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
        public ByteString getKekUriBytes() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).getKekUriBytes();
        }

        public Builder setKekUri(String value) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setKekUri(value);
            return this;
        }

        public Builder clearKekUri() {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).clearKekUri();
            return this;
        }

        public Builder setKekUriBytes(ByteString value) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setKekUriBytes(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
        public boolean hasDekTemplate() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).hasDekTemplate();
        }

        @Override // com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormatOrBuilder
        public KeyTemplate getDekTemplate() {
            return ((KmsEnvelopeAeadKeyFormat) this.instance).getDekTemplate();
        }

        public Builder setDekTemplate(KeyTemplate value) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setDekTemplate(value);
            return this;
        }

        public Builder setDekTemplate(KeyTemplate.Builder builderForValue) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).setDekTemplate(builderForValue.build());
            return this;
        }

        public Builder mergeDekTemplate(KeyTemplate value) {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).mergeDekTemplate(value);
            return this;
        }

        public Builder clearDekTemplate() {
            copyOnWrite();
            ((KmsEnvelopeAeadKeyFormat) this.instance).clearDekTemplate();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KmsEnvelopeAeadKeyFormat$1  reason: invalid class name */
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
                return new KmsEnvelopeAeadKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KmsEnvelopeAeadKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (KmsEnvelopeAeadKeyFormat.class) {
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
        KmsEnvelopeAeadKeyFormat kmsEnvelopeAeadKeyFormat = new KmsEnvelopeAeadKeyFormat();
        DEFAULT_INSTANCE = kmsEnvelopeAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(KmsEnvelopeAeadKeyFormat.class, kmsEnvelopeAeadKeyFormat);
    }

    public static KmsEnvelopeAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<KmsEnvelopeAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
