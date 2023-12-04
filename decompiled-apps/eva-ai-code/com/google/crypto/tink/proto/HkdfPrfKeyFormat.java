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
public final class HkdfPrfKeyFormat extends GeneratedMessageLite<HkdfPrfKeyFormat, Builder> implements HkdfPrfKeyFormatOrBuilder {
    private static final HkdfPrfKeyFormat DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile Parser<HkdfPrfKeyFormat> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private HkdfPrfParams params_;
    private int version_;

    private HkdfPrfKeyFormat() {
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
    public boolean hasParams() {
        return this.params_ != null;
    }

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
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

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
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

    @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
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

    public static HkdfPrfKeyFormat parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfKeyFormat parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfKeyFormat parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfKeyFormat parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfKeyFormat parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static HkdfPrfKeyFormat parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static HkdfPrfKeyFormat parseFrom(InputStream input) throws IOException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfKeyFormat parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HkdfPrfKeyFormat parseDelimitedFrom(InputStream input) throws IOException {
        return (HkdfPrfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfKeyFormat parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfKeyFormat) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static HkdfPrfKeyFormat parseFrom(CodedInputStream input) throws IOException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static HkdfPrfKeyFormat parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (HkdfPrfKeyFormat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(HkdfPrfKeyFormat prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<HkdfPrfKeyFormat, Builder> implements HkdfPrfKeyFormatOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(HkdfPrfKeyFormat.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
        public boolean hasParams() {
            return ((HkdfPrfKeyFormat) this.instance).hasParams();
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
        public HkdfPrfParams getParams() {
            return ((HkdfPrfKeyFormat) this.instance).getParams();
        }

        public Builder setParams(HkdfPrfParams value) {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).setParams(value);
            return this;
        }

        public Builder setParams(HkdfPrfParams.Builder builderForValue) {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).setParams(builderForValue.build());
            return this;
        }

        public Builder mergeParams(HkdfPrfParams value) {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).mergeParams(value);
            return this;
        }

        public Builder clearParams() {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).clearParams();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
        public int getKeySize() {
            return ((HkdfPrfKeyFormat) this.instance).getKeySize();
        }

        public Builder setKeySize(int value) {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).setKeySize(value);
            return this;
        }

        public Builder clearKeySize() {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).clearKeySize();
            return this;
        }

        @Override // com.google.crypto.tink.proto.HkdfPrfKeyFormatOrBuilder
        public int getVersion() {
            return ((HkdfPrfKeyFormat) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HkdfPrfKeyFormat) this.instance).clearVersion();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.HkdfPrfKeyFormat$1  reason: invalid class name */
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
                return new HkdfPrfKeyFormat();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HkdfPrfKeyFormat> parser = PARSER;
                if (parser == null) {
                    synchronized (HkdfPrfKeyFormat.class) {
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
        HkdfPrfKeyFormat hkdfPrfKeyFormat = new HkdfPrfKeyFormat();
        DEFAULT_INSTANCE = hkdfPrfKeyFormat;
        GeneratedMessageLite.registerDefaultInstance(HkdfPrfKeyFormat.class, hkdfPrfKeyFormat);
    }

    public static HkdfPrfKeyFormat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HkdfPrfKeyFormat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
