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
public final class AesCmacPrfKeyFormat extends GeneratedMessageLite<AesCmacPrfKeyFormat, Builder> implements AesCmacPrfKeyFormatOrBuilder {
    private static final AesCmacPrfKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile Parser<AesCmacPrfKeyFormat> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    private AesCmacPrfKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.AesCmacPrfKeyFormatOrBuilder
    public int getVersion() {
        return this.version_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int value) {
        this.version_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    @Override // com.google.crypto.tink.proto.AesCmacPrfKeyFormatOrBuilder
    public int getKeySize() {
        return this.keySize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeySize(int value) {
        this.keySize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeySize() {
        this.keySize_ = 0;
    }

    public static AesCmacPrfKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCmacPrfKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCmacPrfKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCmacPrfKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCmacPrfKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCmacPrfKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCmacPrfKeyFormat parseFrom(InputStream input) throws IOException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCmacPrfKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCmacPrfKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (AesCmacPrfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCmacPrfKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCmacPrfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCmacPrfKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCmacPrfKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCmacPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCmacPrfKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCmacPrfKeyFormat, Builder> implements AesCmacPrfKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(AesCmacPrfKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCmacPrfKeyFormatOrBuilder
        public int getVersion() {
            return ((AesCmacPrfKeyFormat) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((AesCmacPrfKeyFormat) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesCmacPrfKeyFormat) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCmacPrfKeyFormatOrBuilder
        public int getKeySize() {
            return ((AesCmacPrfKeyFormat) this.instance).getKeySize();
        }

        public Builder setKeySize(int value) {
            copyOnWrite();
            ((AesCmacPrfKeyFormat) this.instance).setKeySize(value);
            return this;
        }

        public Builder clearKeySize() {
            copyOnWrite();
            ((AesCmacPrfKeyFormat) this.instance).clearKeySize();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCmacPrfKeyFormat$1  reason: invalid class name */
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
                return new AesCmacPrfKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCmacPrfKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCmacPrfKeyFormat.class) {
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
        AesCmacPrfKeyFormat aesCmacPrfKeyFormat = new AesCmacPrfKeyFormat();
        DEFAULT_INSTANCE = aesCmacPrfKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCmacPrfKeyFormat.class, aesCmacPrfKeyFormat);
    }

    public static AesCmacPrfKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesCmacPrfKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
