package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeyData;
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
public final class Keyset extends GeneratedMessageLite<Keyset, Builder> implements KeysetOrBuilder {
    private static final Keyset DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Parser<Keyset> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Key> key_ = emptyProtobufList();
    private int primaryKeyId_;

    /* loaded from: classes7.dex */
    public interface KeyOrBuilder extends MessageLiteOrBuilder {
        KeyData getKeyData();

        int getKeyId();

        OutputPrefixType getOutputPrefixType();

        int getOutputPrefixTypeValue();

        KeyStatusType getStatus();

        int getStatusValue();

        boolean hasKeyData();
    }

    private Keyset() {
    }

    /* loaded from: classes7.dex */
    public static final class Key extends GeneratedMessageLite<Key, Builder> implements KeyOrBuilder {
        private static final Key DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile Parser<Key> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private KeyData keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        private Key() {
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public boolean hasKeyData() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public KeyData getKeyData() {
            KeyData keyData = this.keyData_;
            return keyData == null ? KeyData.getDefaultInstance() : keyData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setKeyData(KeyData value) {
            value.getClass();
            this.keyData_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeKeyData(KeyData value) {
            value.getClass();
            KeyData keyData = this.keyData_;
            if (keyData != null && keyData != KeyData.getDefaultInstance()) {
                this.keyData_ = KeyData.newBuilder(this.keyData_).mergeFrom((KeyData.Builder) value).buildPartial();
            } else {
                this.keyData_ = value;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearKeyData() {
            this.keyData_ = null;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
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

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
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

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
        public int getOutputPrefixTypeValue() {
            return this.outputPrefixType_;
        }

        @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
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

        public static Key parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Key parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Key parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Key parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Key parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Key parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Key parseFrom(InputStream input) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Key parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Key parseDelimitedFrom(InputStream input) throws IOException {
            return (Key) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Key parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Key) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Key parseFrom(CodedInputStream input) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Key parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Key) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Key prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<Key, Builder> implements KeyOrBuilder {
            /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            private Builder() {
                super(Key.DEFAULT_INSTANCE);
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public boolean hasKeyData() {
                return ((Key) this.instance).hasKeyData();
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public KeyData getKeyData() {
                return ((Key) this.instance).getKeyData();
            }

            public Builder setKeyData(KeyData value) {
                copyOnWrite();
                ((Key) this.instance).setKeyData(value);
                return this;
            }

            public Builder setKeyData(KeyData.Builder builderForValue) {
                copyOnWrite();
                ((Key) this.instance).setKeyData(builderForValue.build());
                return this;
            }

            public Builder mergeKeyData(KeyData value) {
                copyOnWrite();
                ((Key) this.instance).mergeKeyData(value);
                return this;
            }

            public Builder clearKeyData() {
                copyOnWrite();
                ((Key) this.instance).clearKeyData();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getStatusValue() {
                return ((Key) this.instance).getStatusValue();
            }

            public Builder setStatusValue(int value) {
                copyOnWrite();
                ((Key) this.instance).setStatusValue(value);
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public KeyStatusType getStatus() {
                return ((Key) this.instance).getStatus();
            }

            public Builder setStatus(KeyStatusType value) {
                copyOnWrite();
                ((Key) this.instance).setStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((Key) this.instance).clearStatus();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getKeyId() {
                return ((Key) this.instance).getKeyId();
            }

            public Builder setKeyId(int value) {
                copyOnWrite();
                ((Key) this.instance).setKeyId(value);
                return this;
            }

            public Builder clearKeyId() {
                copyOnWrite();
                ((Key) this.instance).clearKeyId();
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public int getOutputPrefixTypeValue() {
                return ((Key) this.instance).getOutputPrefixTypeValue();
            }

            public Builder setOutputPrefixTypeValue(int value) {
                copyOnWrite();
                ((Key) this.instance).setOutputPrefixTypeValue(value);
                return this;
            }

            @Override // com.google.crypto.tink.proto.Keyset.KeyOrBuilder
            public OutputPrefixType getOutputPrefixType() {
                return ((Key) this.instance).getOutputPrefixType();
            }

            public Builder setOutputPrefixType(OutputPrefixType value) {
                copyOnWrite();
                ((Key) this.instance).setOutputPrefixType(value);
                return this;
            }

            public Builder clearOutputPrefixType() {
                copyOnWrite();
                ((Key) this.instance).clearOutputPrefixType();
                return this;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new Key();
                case 2:
                    return new Builder(null);
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Key> parser = PARSER;
                    if (parser == null) {
                        synchronized (Key.class) {
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
            Key key = new Key();
            DEFAULT_INSTANCE = key;
            GeneratedMessageLite.registerDefaultInstance(Key.class, key);
        }

        public static Key getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Key> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.google.crypto.tink.proto.Keyset$1  reason: invalid class name */
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

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
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

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public List<Key> getKeyList() {
        return this.key_;
    }

    public List<? extends KeyOrBuilder> getKeyOrBuilderList() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public int getKeyCount() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.proto.KeysetOrBuilder
    public Key getKey(int index) {
        return this.key_.get(index);
    }

    public KeyOrBuilder getKeyOrBuilder(int index) {
        return this.key_.get(index);
    }

    private void ensureKeyIsMutable() {
        if (this.key_.isModifiable()) {
            return;
        }
        this.key_ = GeneratedMessageLite.mutableCopy(this.key_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(int index, Key value) {
        value.getClass();
        ensureKeyIsMutable();
        this.key_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(Key value) {
        value.getClass();
        ensureKeyIsMutable();
        this.key_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKey(int index, Key value) {
        value.getClass();
        ensureKeyIsMutable();
        this.key_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKey(Iterable<? extends Key> values) {
        ensureKeyIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.key_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKey(int index) {
        ensureKeyIsMutable();
        this.key_.remove(index);
    }

    public static Keyset parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Keyset parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Keyset parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Keyset parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Keyset parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Keyset parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Keyset parseFrom(InputStream input) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Keyset parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Keyset parseDelimitedFrom(InputStream input) throws IOException {
        return (Keyset) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Keyset parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Keyset) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Keyset parseFrom(CodedInputStream input) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Keyset parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Keyset) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Keyset prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<Keyset, Builder> implements KeysetOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(Keyset.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public int getPrimaryKeyId() {
            return ((Keyset) this.instance).getPrimaryKeyId();
        }

        public Builder setPrimaryKeyId(int value) {
            copyOnWrite();
            ((Keyset) this.instance).setPrimaryKeyId(value);
            return this;
        }

        public Builder clearPrimaryKeyId() {
            copyOnWrite();
            ((Keyset) this.instance).clearPrimaryKeyId();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public List<Key> getKeyList() {
            return Collections.unmodifiableList(((Keyset) this.instance).getKeyList());
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public int getKeyCount() {
            return ((Keyset) this.instance).getKeyCount();
        }

        @Override // com.google.crypto.tink.proto.KeysetOrBuilder
        public Key getKey(int index) {
            return ((Keyset) this.instance).getKey(index);
        }

        public Builder setKey(int index, Key value) {
            copyOnWrite();
            ((Keyset) this.instance).setKey(index, value);
            return this;
        }

        public Builder setKey(int index, Key.Builder builderForValue) {
            copyOnWrite();
            ((Keyset) this.instance).setKey(index, builderForValue.build());
            return this;
        }

        public Builder addKey(Key value) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(value);
            return this;
        }

        public Builder addKey(int index, Key value) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(index, value);
            return this;
        }

        public Builder addKey(Key.Builder builderForValue) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(builderForValue.build());
            return this;
        }

        public Builder addKey(int index, Key.Builder builderForValue) {
            copyOnWrite();
            ((Keyset) this.instance).addKey(index, builderForValue.build());
            return this;
        }

        public Builder addAllKey(Iterable<? extends Key> values) {
            copyOnWrite();
            ((Keyset) this.instance).addAllKey(values);
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((Keyset) this.instance).clearKey();
            return this;
        }

        public Builder removeKey(int index) {
            copyOnWrite();
            ((Keyset) this.instance).removeKey(index);
            return this;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new Keyset();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", Key.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Keyset> parser = PARSER;
                if (parser == null) {
                    synchronized (Keyset.class) {
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
        Keyset keyset = new Keyset();
        DEFAULT_INSTANCE = keyset;
        GeneratedMessageLite.registerDefaultInstance(Keyset.class, keyset);
    }

    public static Keyset getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Keyset> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
