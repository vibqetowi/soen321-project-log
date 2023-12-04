package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.AesCtrKey;
import com.google.crypto.tink.proto.HmacKey;
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
public final class AesCtrHmacAeadKey extends GeneratedMessageLite<AesCtrHmacAeadKey, Builder> implements AesCtrHmacAeadKeyOrBuilder {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final AesCtrHmacAeadKey DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile Parser<AesCtrHmacAeadKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AesCtrKey aesCtrKey_;
    private HmacKey hmacKey_;
    private int version_;

    private AesCtrHmacAeadKey() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public boolean hasAesCtrKey() {
        return this.aesCtrKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public AesCtrKey getAesCtrKey() {
        AesCtrKey aesCtrKey = this.aesCtrKey_;
        return aesCtrKey == null ? AesCtrKey.getDefaultInstance() : aesCtrKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAesCtrKey(AesCtrKey value) {
        value.getClass();
        this.aesCtrKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAesCtrKey(AesCtrKey value) {
        value.getClass();
        AesCtrKey aesCtrKey = this.aesCtrKey_;
        if (aesCtrKey != null && aesCtrKey != AesCtrKey.getDefaultInstance()) {
            this.aesCtrKey_ = AesCtrKey.newBuilder(this.aesCtrKey_).mergeFrom((AesCtrKey.Builder) value).buildPartial();
        } else {
            this.aesCtrKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAesCtrKey() {
        this.aesCtrKey_ = null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public boolean hasHmacKey() {
        return this.hmacKey_ != null;
    }

    @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
    public HmacKey getHmacKey() {
        HmacKey hmacKey = this.hmacKey_;
        return hmacKey == null ? HmacKey.getDefaultInstance() : hmacKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHmacKey(HmacKey value) {
        value.getClass();
        this.hmacKey_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHmacKey(HmacKey value) {
        value.getClass();
        HmacKey hmacKey = this.hmacKey_;
        if (hmacKey != null && hmacKey != HmacKey.getDefaultInstance()) {
            this.hmacKey_ = HmacKey.newBuilder(this.hmacKey_).mergeFrom((HmacKey.Builder) value).buildPartial();
        } else {
            this.hmacKey_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHmacKey() {
        this.hmacKey_ = null;
    }

    public static AesCtrHmacAeadKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrHmacAeadKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(InputStream input) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseDelimitedFrom(InputStream input) throws IOException {
        return (AesCtrHmacAeadKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrHmacAeadKey parseFrom(CodedInputStream input) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrHmacAeadKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrHmacAeadKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrHmacAeadKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrHmacAeadKey, Builder> implements AesCtrHmacAeadKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(AesCtrHmacAeadKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public int getVersion() {
            return ((AesCtrHmacAeadKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public boolean hasAesCtrKey() {
            return ((AesCtrHmacAeadKey) this.instance).hasAesCtrKey();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public AesCtrKey getAesCtrKey() {
            return ((AesCtrHmacAeadKey) this.instance).getAesCtrKey();
        }

        public Builder setAesCtrKey(AesCtrKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setAesCtrKey(value);
            return this;
        }

        public Builder setAesCtrKey(AesCtrKey.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setAesCtrKey(builderForValue.build());
            return this;
        }

        public Builder mergeAesCtrKey(AesCtrKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).mergeAesCtrKey(value);
            return this;
        }

        public Builder clearAesCtrKey() {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).clearAesCtrKey();
            return this;
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public boolean hasHmacKey() {
            return ((AesCtrHmacAeadKey) this.instance).hasHmacKey();
        }

        @Override // com.google.crypto.tink.proto.AesCtrHmacAeadKeyOrBuilder
        public HmacKey getHmacKey() {
            return ((AesCtrHmacAeadKey) this.instance).getHmacKey();
        }

        public Builder setHmacKey(HmacKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setHmacKey(value);
            return this;
        }

        public Builder setHmacKey(HmacKey.Builder builderForValue) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).setHmacKey(builderForValue.build());
            return this;
        }

        public Builder mergeHmacKey(HmacKey value) {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).mergeHmacKey(value);
            return this;
        }

        public Builder clearHmacKey() {
            copyOnWrite();
            ((AesCtrHmacAeadKey) this.instance).clearHmacKey();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrHmacAeadKey$1  reason: invalid class name */
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
                return new AesCtrHmacAeadKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrHmacAeadKey> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrHmacAeadKey.class) {
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
        AesCtrHmacAeadKey aesCtrHmacAeadKey = new AesCtrHmacAeadKey();
        DEFAULT_INSTANCE = aesCtrHmacAeadKey;
        GeneratedMessageLite.registerDefaultInstance(AesCtrHmacAeadKey.class, aesCtrHmacAeadKey);
    }

    public static AesCtrHmacAeadKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesCtrHmacAeadKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
