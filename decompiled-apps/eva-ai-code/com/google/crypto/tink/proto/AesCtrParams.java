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
public final class AesCtrParams extends GeneratedMessageLite<AesCtrParams, Builder> implements AesCtrParamsOrBuilder {
    private static final AesCtrParams DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile Parser<AesCtrParams> PARSER;
    private int ivSize_;

    private AesCtrParams() {
    }

    @Override // com.google.crypto.tink.proto.AesCtrParamsOrBuilder
    public int getIvSize() {
        return this.ivSize_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIvSize(int value) {
        this.ivSize_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIvSize() {
        this.ivSize_ = 0;
    }

    public static AesCtrParams parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrParams parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrParams parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrParams parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrParams parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static AesCtrParams parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static AesCtrParams parseFrom(InputStream input) throws IOException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrParams parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrParams parseDelimitedFrom(InputStream input) throws IOException {
        return (AesCtrParams) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrParams parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrParams) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static AesCtrParams parseFrom(CodedInputStream input) throws IOException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static AesCtrParams parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (AesCtrParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AesCtrParams prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<AesCtrParams, Builder> implements AesCtrParamsOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(AesCtrParams.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.AesCtrParamsOrBuilder
        public int getIvSize() {
            return ((AesCtrParams) this.instance).getIvSize();
        }

        public Builder setIvSize(int value) {
            copyOnWrite();
            ((AesCtrParams) this.instance).setIvSize(value);
            return this;
        }

        public Builder clearIvSize() {
            copyOnWrite();
            ((AesCtrParams) this.instance).clearIvSize();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.AesCtrParams$1  reason: invalid class name */
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
                return new AesCtrParams();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AesCtrParams> parser = PARSER;
                if (parser == null) {
                    synchronized (AesCtrParams.class) {
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
        AesCtrParams aesCtrParams = new AesCtrParams();
        DEFAULT_INSTANCE = aesCtrParams;
        GeneratedMessageLite.registerDefaultInstance(AesCtrParams.class, aesCtrParams);
    }

    public static AesCtrParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AesCtrParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
