package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.HkdfPrfParams;
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
public final class HkdfPrfKey extends GeneratedMessageLite<HkdfPrfKey, Builder> implements HkdfPrfKeyOrBuilder {
    private static final HkdfPrfKey DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile Parser<HkdfPrfKey> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private HkdfPrfParams params_;
    private int version_;

    private HkdfPrfKey() {
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
    public HkdfPrfParams getParams() {
        HkdfPrfParams hkdfPrfParams = this.params_;
        return hkdfPrfParams == null ? HkdfPrfParams.getDefaultInstance() : hkdfPrfParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParams(HkdfPrfParams value) {
        value.getClass();
        this.params_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParams(HkdfPrfParams value) {
        value.getClass();
        HkdfPrfParams hkdfPrfParams = this.params_;
        if (hkdfPrfParams != null && hkdfPrfParams != HkdfPrfParams.getDefaultInstance()) {
            this.params_ = HkdfPrfParams.newBuilder(this.params_).mergeFrom((HkdfPrfParams.Builder) value).buildPartial();
        } else {
            this.params_ = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParams() {
        this.params_ = null;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
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

    public static HkdfPrfKey parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfKey parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfKey parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfKey parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfKey parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfKey parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfKey parseFrom(InputStream input) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfKey parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HkdfPrfKey parseDelimitedFrom(InputStream input) throws IOException {
        return (HkdfPrfKey) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfKey parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfKey) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HkdfPrfKey parseFrom(CodedInputStream input) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfKey parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HkdfPrfKey prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HkdfPrfKey, Builder> implements HkdfPrfKeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HkdfPrfKey.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
        public int getVersion() {
            return ((HkdfPrfKey) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
        public boolean hasParams() {
            return ((HkdfPrfKey) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
        public HkdfPrfParams getParams() {
            return ((HkdfPrfKey) this.instance).getParams();
        }

        public Builder setParams(HkdfPrfParams value) {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(HkdfPrfParams.Builder builderForValue) {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(HkdfPrfParams value) {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyOrBuilder
        public ByteString getKeyValue() {
            return ((HkdfPrfKey) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((HkdfPrfKey) this.instance).clearKeyValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HkdfPrfKey$1  reason: invalid class name */
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
                return new HkdfPrfKey();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HkdfPrfKey> parser = PARSER;
                if (parser == null) {
                    synchronized (HkdfPrfKey.class) {
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
        HkdfPrfKey hkdfPrfKey = new HkdfPrfKey();
        DEFAULT_INSTANCE = hkdfPrfKey;
        GeneratedMessageLite.registerDefaultInstance(HkdfPrfKey.class, hkdfPrfKey);
    }

    public static HkdfPrfKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HkdfPrfKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
