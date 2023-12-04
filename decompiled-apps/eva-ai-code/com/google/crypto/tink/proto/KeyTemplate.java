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
public final class KeyTemplate extends GeneratedMessageLite<KeyTemplate, Builder> implements KeyTemplateOrBuilder {
    private static final KeyTemplate DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile Parser<KeyTemplate> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.EMPTY;

    private KeyTemplate() {
    }

    @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
    public ByteString getTypeUrlBytes() {
        return ByteString.copyFromUtf8(this.typeUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String value) {
        value.getClass();
        this.typeUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.typeUrl_ = value.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
    public ByteString getValue() {
        return this.value_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(ByteString value) {
        value.getClass();
        this.value_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
    public int getOutputPrefixTypeValue() {
        return this.outputPrefixType_;
    }

    @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
    public OutputPrefixType getOutputPrefixType() {
        OutputPrefixType forNumber = OutputPrefixType.forNumber(this.outputPrefixType_);
        return forNumber == null ? OutputPrefixType.UNRECOGNIZED : forNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputPrefixTypeValue(int value) {
        this.outputPrefixType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutputPrefixType(OutputPrefixType value) {
        this.outputPrefixType_ = value.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutputPrefixType() {
        this.outputPrefixType_ = 0;
    }

    public static KeyTemplate parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeyTemplate parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeyTemplate parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeyTemplate parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeyTemplate parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeyTemplate parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeyTemplate parseFrom(InputStream input) throws IOException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KeyTemplate parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KeyTemplate parseDelimitedFrom(InputStream input) throws IOException {
        return (KeyTemplate) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static KeyTemplate parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeyTemplate) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KeyTemplate parseFrom(CodedInputStream input) throws IOException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KeyTemplate parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeyTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeyTemplate prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KeyTemplate, Builder> implements KeyTemplateOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(KeyTemplate.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
        public String getTypeUrl() {
            return ((KeyTemplate) this.instance).getTypeUrl();
        }

        @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((KeyTemplate) this.instance).getTypeUrlBytes();
        }

        public Builder setTypeUrl(String value) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setTypeUrl(value);
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((KeyTemplate) this.instance).clearTypeUrl();
            return this;
        }

        public Builder setTypeUrlBytes(ByteString value) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setTypeUrlBytes(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
        public ByteString getValue() {
            return ((KeyTemplate) this.instance).getValue();
        }

        public Builder setValue(ByteString value) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setValue(value);
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((KeyTemplate) this.instance).clearValue();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
        public int getOutputPrefixTypeValue() {
            return ((KeyTemplate) this.instance).getOutputPrefixTypeValue();
        }

        public Builder setOutputPrefixTypeValue(int value) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setOutputPrefixTypeValue(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTemplateOrBuilder
        public OutputPrefixType getOutputPrefixType() {
            return ((KeyTemplate) this.instance).getOutputPrefixType();
        }

        public Builder setOutputPrefixType(OutputPrefixType value) {
            copyOnWrite();
            ((KeyTemplate) this.instance).setOutputPrefixType(value);
            return this;
        }

        public Builder clearOutputPrefixType() {
            copyOnWrite();
            ((KeyTemplate) this.instance).clearOutputPrefixType();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeyTemplate$1  reason: invalid class name */
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
                return new KeyTemplate();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KeyTemplate> parser = PARSER;
                if (parser == null) {
                    synchronized (KeyTemplate.class) {
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
        KeyTemplate keyTemplate = new KeyTemplate();
        DEFAULT_INSTANCE = keyTemplate;
        GeneratedMessageLite.registerDefaultInstance(KeyTemplate.class, keyTemplate);
    }

    public static KeyTemplate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<KeyTemplate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
