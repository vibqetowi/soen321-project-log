package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class KeysetInfo extends GeneratedMessageLite<KeysetInfo, Builder> implements KeysetInfoOrBuilder {
    private static final KeysetInfo DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile Parser<KeysetInfo> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<KeyInfo> keyInfo_ = emptyProtobufList();
    private int primaryKeyId_;

    /* loaded from: classes7.dex */
    public interface KeyInfoOrBuilder extends MessageLiteOrBuilder {
        int getKeyId();

        OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        KeyStatusType getStatus();

        int getStatusValue();

        String getTypeUrl();

        ByteString getTypeUrlBytes();
    }

    private KeysetInfo() {
    }

    /* loaded from: classes7.dex */
    public static final class KeyInfo extends GeneratedMessageLite<KeyInfo, Builder> implements KeyInfoOrBuilder {
        private static final KeyInfo DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<KeyInfo> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        private KeyInfo() {
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public String getTypeUrl() {
            return this.typeUrl_;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
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

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public KeyStatusType getStatus() {
            KeyStatusType forNumber = KeyStatusType.forNumber(this.status_);
            return forNumber == null ? KeyStatusType.UNRECOGNIZED : forNumber;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusValue(int value) {
            this.status_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(KeyStatusType value) {
            this.status_ = value.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = 0;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public int getKeyId() {
            return this.keyId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyId(int value) {
            this.keyId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyId() {
            this.keyId_ = 0;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
        public int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
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

        public static KeyInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KeyInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KeyInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KeyInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KeyInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KeyInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KeyInfo parseFrom(InputStream input) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static KeyInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static KeyInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (KeyInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static KeyInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KeyInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static KeyInfo parseFrom(CodedInputStream input) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static KeyInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KeyInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(KeyInfo prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<KeyInfo, Builder> implements KeyInfoOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(KeyInfo.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public String getTypeUrl() {
                return ((KeyInfo) this.instance).getTypeUrl();
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public ByteString getTypeUrlBytes() {
                return ((KeyInfo) this.instance).getTypeUrlBytes();
            }

            public Builder setTypeUrl(String value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setTypeUrl(value);
                return this;
            }

            public Builder clearTypeUrl() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearTypeUrl();
                return this;
            }

            public Builder setTypeUrlBytes(ByteString value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setTypeUrlBytes(value);
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public int getStatusValue() {
                return ((KeyInfo) this.instance).getStatusValue();
            }

            public Builder setStatusValue(int value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setStatusValue(value);
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public KeyStatusType getStatus() {
                return ((KeyInfo) this.instance).getStatus();
            }

            public Builder setStatus(KeyStatusType value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearStatus();
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public int getKeyId() {
                return ((KeyInfo) this.instance).getKeyId();
            }

            public Builder setKeyId(int value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setKeyId(value);
                return this;
            }

            public Builder clearKeyId() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearKeyId();
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public int getOutputPrefixTypeValue() {
                return ((KeyInfo) this.instance).getOutputPrefixTypeValue();
            }

            public Builder setOutputPrefixTypeValue(int value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setOutputPrefixTypeValue(value);
                return this;
            }

            @Override // com.google.crypto.tink.proto.KeysetInfo.KeyInfoOrBuilder
            public OutputPrefixType getOutputPrefixType() {
                return ((KeyInfo) this.instance).getOutputPrefixType();
            }

            public Builder setOutputPrefixType(OutputPrefixType value) {
                copyOnWrite();
                ((KeyInfo) this.instance).setOutputPrefixType(value);
                return this;
            }

            public Builder clearOutputPrefixType() {
                copyOnWrite();
                ((KeyInfo) this.instance).clearOutputPrefixType();
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new KeyInfo();
                case 2:
                    return new Builder(null);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<KeyInfo> parser = PARSER;
                    if (parser == null) {
                        synchronized (KeyInfo.class) {
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
            KeyInfo keyInfo = new KeyInfo();
            DEFAULT_INSTANCE = keyInfo;
            GeneratedMessageLite.registerDefaultInstance(KeyInfo.class, keyInfo);
        }

        public static KeyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<KeyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeysetInfo$1  reason: invalid class name */
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

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public int getPrimaryKeyId() {
        return this.primaryKeyId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryKeyId(int value) {
        this.primaryKeyId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryKeyId() {
        this.primaryKeyId_ = 0;
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public List<KeyInfo> getKeyInfoList() {
        return this.keyInfo_;
    }

    public List<? extends KeyInfoOrBuilder> getKeyInfoOrBuilderList() {
        return this.keyInfo_;
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public int getKeyInfoCount() {
        return this.keyInfo_.size();
    }

    @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
    public KeyInfo getKeyInfo(int index) {
        return this.keyInfo_.get(index);
    }

    public KeyInfoOrBuilder getKeyInfoOrBuilder(int index) {
        return this.keyInfo_.get(index);
    }

    private void ensureKeyInfoIsMutable() {
        if (this.keyInfo_.isModifiable()) {
            return;
        }
        this.keyInfo_ = GeneratedMessageLite.mutableCopy(this.keyInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyInfo(int index, KeyInfo value) {
        value.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(KeyInfo value) {
        value.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKeyInfo(int index, KeyInfo value) {
        value.getClass();
        ensureKeyInfoIsMutable();
        this.keyInfo_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKeyInfo(Iterable<? extends KeyInfo> values) {
        ensureKeyInfoIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.keyInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyInfo() {
        this.keyInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKeyInfo(int index) {
        ensureKeyInfoIsMutable();
        this.keyInfo_.remove(index);
    }

    public static KeysetInfo parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeysetInfo parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeysetInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeysetInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeysetInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeysetInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeysetInfo parseFrom(InputStream input) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KeysetInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KeysetInfo parseDelimitedFrom(InputStream input) throws IOException {
        return (KeysetInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static KeysetInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeysetInfo) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KeysetInfo parseFrom(CodedInputStream input) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KeysetInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeysetInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeysetInfo prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KeysetInfo, Builder> implements KeysetInfoOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(KeysetInfo.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public int getPrimaryKeyId() {
            return ((KeysetInfo) this.instance).getPrimaryKeyId();
        }

        public Builder setPrimaryKeyId(int value) {
            copyOnWrite();
            ((KeysetInfo) this.instance).setPrimaryKeyId(value);
            return this;
        }

        public Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((KeysetInfo) this.instance).clearPrimaryKeyId();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public List<KeyInfo> getKeyInfoList() {
            return Collections.unmodifiableList(((KeysetInfo) this.instance).getKeyInfoList());
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public int getKeyInfoCount() {
            return ((KeysetInfo) this.instance).getKeyInfoCount();
        }

        @Override // com.google.crypto.tink.proto.KeysetInfoOrBuilder
        public KeyInfo getKeyInfo(int index) {
            return ((KeysetInfo) this.instance).getKeyInfo(index);
        }

        public Builder setKeyInfo(int index, KeyInfo value) {
            copyOnWrite();
            ((KeysetInfo) this.instance).setKeyInfo(index, value);
            return this;
        }

        public Builder setKeyInfo(int index, KeyInfo.Builder builderForValue) {
            copyOnWrite();
            ((KeysetInfo) this.instance).setKeyInfo(index, builderForValue.build());
            return this;
        }

        public Builder addKeyInfo(KeyInfo value) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(value);
            return this;
        }

        public Builder addKeyInfo(int index, KeyInfo value) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(index, value);
            return this;
        }

        public Builder addKeyInfo(KeyInfo.Builder builderForValue) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(builderForValue.build());
            return this;
        }

        public Builder addKeyInfo(int index, KeyInfo.Builder builderForValue) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addKeyInfo(index, builderForValue.build());
            return this;
        }

        public Builder addAllKeyInfo(Iterable<? extends KeyInfo> values) {
            copyOnWrite();
            ((KeysetInfo) this.instance).addAllKeyInfo(values);
            return this;
        }

        public Builder clearKeyInfo() {
            copyOnWrite();
            ((KeysetInfo) this.instance).clearKeyInfo();
            return this;
        }

        public Builder removeKeyInfo(int index) {
            copyOnWrite();
            ((KeysetInfo) this.instance).removeKeyInfo(index);
            return this;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new KeysetInfo();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", KeyInfo.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KeysetInfo> parser = PARSER;
                if (parser == null) {
                    synchronized (KeysetInfo.class) {
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
        KeysetInfo keysetInfo = new KeysetInfo();
        DEFAULT_INSTANCE = keysetInfo;
        GeneratedMessageLite.registerDefaultInstance(KeysetInfo.class, keysetInfo);
    }

    public static KeysetInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<KeysetInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
