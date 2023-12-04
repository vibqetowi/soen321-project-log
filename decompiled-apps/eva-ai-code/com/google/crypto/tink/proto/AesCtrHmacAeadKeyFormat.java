package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesCtrKeyFormat;
import com.google.crypto.tink.proto.HmacKeyFormat;
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
public final class AesCtrHmacAeadKeyFormat extends GeneratedMessageLite<AesCtrHmacAeadKeyFormat, Builder> implements AesCtrHmacAeadKeyFormatOrBuilder {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final AesCtrHmacAeadKeyFormat DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile Parser<AesCtrHmacAeadKeyFormat> PARSER;
    private AesCtrKeyFormat aesCtrKeyFormat_;
    private HmacKeyFormat hmacKeyFormat_;

    private AesCtrHmacAeadKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public boolean hasAesCtrKeyFormat() {
        return this.aesCtrKeyFormat_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public AesCtrKeyFormat getAesCtrKeyFormat() {
        AesCtrKeyFormat aesCtrKeyFormat = this.aesCtrKeyFormat_;
        return aesCtrKeyFormat == null ? AesCtrKeyFormat.getDefaultInstance() : aesCtrKeyFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAesCtrKeyFormat(AesCtrKeyFormat value) {
        value.getClass();
        this.aesCtrKeyFormat_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAesCtrKeyFormat(AesCtrKeyFormat value) {
        value.getClass();
        AesCtrKeyFormat aesCtrKeyFormat = this.aesCtrKeyFormat_;
        if (aesCtrKeyFormat != null && aesCtrKeyFormat != AesCtrKeyFormat.getDefaultInstance()) {
            this.aesCtrKeyFormat_ = AesCtrKeyFormat.newBuilder(this.aesCtrKeyFormat_).mergeFrom((AesCtrKeyFormat.Builder) value).buildPartial();
        } else {
            this.aesCtrKeyFormat_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAesCtrKeyFormat() {
        this.aesCtrKeyFormat_ = null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public boolean hasHmacKeyFormat() {
        return this.hmacKeyFormat_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
    public HmacKeyFormat getHmacKeyFormat() {
        HmacKeyFormat hmacKeyFormat = this.hmacKeyFormat_;
        return hmacKeyFormat == null ? HmacKeyFormat.getDefaultInstance() : hmacKeyFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacKeyFormat(HmacKeyFormat value) {
        value.getClass();
        this.hmacKeyFormat_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacKeyFormat(HmacKeyFormat value) {
        value.getClass();
        HmacKeyFormat hmacKeyFormat = this.hmacKeyFormat_;
        if (hmacKeyFormat != null && hmacKeyFormat != HmacKeyFormat.getDefaultInstance()) {
            this.hmacKeyFormat_ = HmacKeyFormat.newBuilder(this.hmacKeyFormat_).mergeFrom((HmacKeyFormat.Builder) value).buildPartial();
        } else {
            this.hmacKeyFormat_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacKeyFormat() {
        this.hmacKeyFormat_ = null;
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(InputStream input) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacAeadKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (AesCtrHmacAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacAeadKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacAeadKeyFormat, Builder> implements AesCtrHmacAeadKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(AesCtrHmacAeadKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public boolean hasAesCtrKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).hasAesCtrKeyFormat();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public AesCtrKeyFormat getAesCtrKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).getAesCtrKeyFormat();
        }

        public Builder setAesCtrKeyFormat(AesCtrKeyFormat value) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setAesCtrKeyFormat(value);
            return this;
        }

        public Builder setAesCtrKeyFormat(AesCtrKeyFormat.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setAesCtrKeyFormat(builderForValue.build());
            return this;
        }

        public Builder mergeAesCtrKeyFormat(AesCtrKeyFormat value) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).mergeAesCtrKeyFormat(value);
            return this;
        }

        public Builder clearAesCtrKeyFormat() {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).clearAesCtrKeyFormat();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public boolean hasHmacKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).hasHmacKeyFormat();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormatOrBuilder
        public HmacKeyFormat getHmacKeyFormat() {
            return ((AesCtrHmacAeadKeyFormat) this.instance).getHmacKeyFormat();
        }

        public Builder setHmacKeyFormat(HmacKeyFormat value) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setHmacKeyFormat(value);
            return this;
        }

        public Builder setHmacKeyFormat(HmacKeyFormat.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).setHmacKeyFormat(builderForValue.build());
            return this;
        }

        public Builder mergeHmacKeyFormat(HmacKeyFormat value) {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).mergeHmacKeyFormat(value);
            return this;
        }

        public Builder clearHmacKeyFormat() {
            copyOnWrite();
            ((AesCtrHmacAeadKeyFormat) this.instance).clearHmacKeyFormat();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacAeadKeyFormat$1  reason: invalid class name */
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
                return new AesCtrHmacAeadKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacAeadKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrHmacAeadKeyFormat.class) {
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
        AesCtrHmacAeadKeyFormat aesCtrHmacAeadKeyFormat = new AesCtrHmacAeadKeyFormat();
        DEFAULT_INSTANCE = aesCtrHmacAeadKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKeyFormat.class, aesCtrHmacAeadKeyFormat);
    }

    public static AesCtrHmacAeadKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesCtrHmacAeadKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
