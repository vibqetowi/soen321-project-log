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
public final class KmsAeadKeyFormat extends GeneratedMessageLite<KmsAeadKeyFormat, Builder> implements KmsAeadKeyFormatOrBuilder {
    private static final KmsAeadKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile Parser<KmsAeadKeyFormat> PARSER;
    private String keyUri_ = "";

    private KmsAeadKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.KmsAeadKeyFormatOrBuilder
    public String getKeyUri() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.proto.KmsAeadKeyFormatOrBuilder
    public ByteString getKeyUriBytes() {
        return ByteString.copyFromUtf8(this.keyUri_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyUri(String value) {
        value.getClass();
        this.keyUri_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyUri() {
        this.keyUri_ = getDefaultInstance().getKeyUri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyUriBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.keyUri_ = value.toStringUtf8();
    }

    public static KmsAeadKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KmsAeadKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KmsAeadKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KmsAeadKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KmsAeadKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KmsAeadKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KmsAeadKeyFormat parseFrom(InputStream input) throws IOException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KmsAeadKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KmsAeadKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (KmsAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static KmsAeadKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KmsAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KmsAeadKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KmsAeadKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KmsAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KmsAeadKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KmsAeadKeyFormat, Builder> implements KmsAeadKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(KmsAeadKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KmsAeadKeyFormatOrBuilder
        public String getKeyUri() {
            return ((KmsAeadKeyFormat) this.instance).getKeyUri();
        }

        @Override // com.google.crypto.tink.proto.KmsAeadKeyFormatOrBuilder
        public ByteString getKeyUriBytes() {
            return ((KmsAeadKeyFormat) this.instance).getKeyUriBytes();
        }

        public Builder setKeyUri(String value) {
            copyOnWrite();
            ((KmsAeadKeyFormat) this.instance).setKeyUri(value);
            return this;
        }

        public Builder clearKeyUri() {
            copyOnWrite();
            ((KmsAeadKeyFormat) this.instance).clearKeyUri();
            return this;
        }

        public Builder setKeyUriBytes(ByteString value) {
            copyOnWrite();
            ((KmsAeadKeyFormat) this.instance).setKeyUriBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KmsAeadKeyFormat$1  reason: invalid class name */
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
                return new KmsAeadKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KmsAeadKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (KmsAeadKeyFormat.class) {
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
        KmsAeadKeyFormat kmsAeadKeyFormat = new KmsAeadKeyFormat();
        DEFAULT_INSTANCE = kmsAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(KmsAeadKeyFormat.class, kmsAeadKeyFormat);
    }

    public static KmsAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<KmsAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
