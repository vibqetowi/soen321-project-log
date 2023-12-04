package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.HmacPrfParams;
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
public final class HmacPrfKey extends GeneratedMessageLite<HmacPrfKey, Builder> implements HmacPrfKeyOrBuilder {
    private static final HmacPrfKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<HmacPrfKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private HmacPrfParams params_;
    private int version_;

    private HmacPrfKey() {
    }

    @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
    public HmacPrfParams getParams() {
        HmacPrfParams hmacPrfParams = this.params_;
        return hmacPrfParams == null ? HmacPrfParams.getDefaultInstance() : hmacPrfParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(HmacPrfParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(HmacPrfParams value) {
        value.getClass();
        HmacPrfParams hmacPrfParams = this.params_;
        if (hmacPrfParams != null && hmacPrfParams != HmacPrfParams.getDefaultInstance()) {
            this.params_ = HmacPrfParams.newBuilder(this.params_).mergeFrom((HmacPrfParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
    public ByteString getKeyValue() {
        return this.keyValue_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyValue(ByteString value) {
        value.getClass();
        this.keyValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyValue() {
        this.keyValue_ = getDefaultInstance().getKeyValue();
    }

    public static HmacPrfKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HmacPrfKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HmacPrfKey parseFrom(InputStream input) throws IOException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HmacPrfKey parseDelimitedFrom(InputStream input) throws IOException {
        return (HmacPrfKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HmacPrfKey parseFrom(CodedInputStream input) throws IOException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HmacPrfKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HmacPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HmacPrfKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HmacPrfKey, Builder> implements HmacPrfKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HmacPrfKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
        public int getVersion() {
            return ((HmacPrfKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((HmacPrfKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HmacPrfKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
        public boolean hasParams() {
            return ((HmacPrfKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
        public HmacPrfParams getParams() {
            return ((HmacPrfKey) this.instance).getParams();
        }

        public Builder setParams(HmacPrfParams value) {
            copyOnWrite();
            ((HmacPrfKey) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(HmacPrfParams.Builder builderForValue) {
            copyOnWrite();
            ((HmacPrfKey) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(HmacPrfParams value) {
            copyOnWrite();
            ((HmacPrfKey) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((HmacPrfKey) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HmacPrfKeyOrBuilder
        public ByteString getKeyValue() {
            return ((HmacPrfKey) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((HmacPrfKey) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((HmacPrfKey) this.instance).clearKeyValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HmacPrfKey$1  reason: invalid class name */
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
                return new HmacPrfKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HmacPrfKey> parser = PARSER;
                if (parser == null) {
                    synchronized (HmacPrfKey.class) {
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
        HmacPrfKey hmacPrfKey = new HmacPrfKey();
        DEFAULT_INSTANCE = hmacPrfKey;
        GeneratedMessageLite.registerDefaultInstance(HmacPrfKey.class, hmacPrfKey);
    }

    public static HmacPrfKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HmacPrfKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
