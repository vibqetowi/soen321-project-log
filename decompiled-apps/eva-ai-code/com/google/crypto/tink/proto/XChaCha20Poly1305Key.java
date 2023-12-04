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
public final class XChaCha20Poly1305Key extends GeneratedMessageLite<XChaCha20Poly1305Key, Builder> implements XChaCha20Poly1305KeyOrBuilder {
    private static final XChaCha20Poly1305Key DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile Parser<XChaCha20Poly1305Key> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private ByteString keyValue_ = ByteString.EMPTY;
    private int version_;

    private XChaCha20Poly1305Key() {
    }

    @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
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

    @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
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

    public static XChaCha20Poly1305Key parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static XChaCha20Poly1305Key parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static XChaCha20Poly1305Key parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static XChaCha20Poly1305Key parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static XChaCha20Poly1305Key parseFrom(InputStream input) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static XChaCha20Poly1305Key parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static XChaCha20Poly1305Key parseDelimitedFrom(InputStream input) throws IOException {
        return (XChaCha20Poly1305Key) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static XChaCha20Poly1305Key parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (XChaCha20Poly1305Key) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static XChaCha20Poly1305Key parseFrom(CodedInputStream input) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static XChaCha20Poly1305Key parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (XChaCha20Poly1305Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(XChaCha20Poly1305Key prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<XChaCha20Poly1305Key, Builder> implements XChaCha20Poly1305KeyOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(XChaCha20Poly1305Key.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
        public int getVersion() {
            return ((XChaCha20Poly1305Key) this.instance).getVersion();
        }

        public Builder setVersion(int value) {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).setVersion(value);
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.XChaCha20Poly1305KeyOrBuilder
        public ByteString getKeyValue() {
            return ((XChaCha20Poly1305Key) this.instance).getKeyValue();
        }

        public Builder setKeyValue(ByteString value) {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).setKeyValue(value);
            return this;
        }

        public Builder clearKeyValue() {
            copyOnWrite();
            ((XChaCha20Poly1305Key) this.instance).clearKeyValue();
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.XChaCha20Poly1305Key$1  reason: invalid class name */
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
                return new XChaCha20Poly1305Key();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<XChaCha20Poly1305Key> parser = PARSER;
                if (parser == null) {
                    synchronized (XChaCha20Poly1305Key.class) {
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
        XChaCha20Poly1305Key xChaCha20Poly1305Key = new XChaCha20Poly1305Key();
        DEFAULT_INSTANCE = xChaCha20Poly1305Key;
        GeneratedMessageLite.registerDefaultInstance(XChaCha20Poly1305Key.class, xChaCha20Poly1305Key);
    }

    public static XChaCha20Poly1305Key getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<XChaCha20Poly1305Key> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
