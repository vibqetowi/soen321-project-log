package com.google.crypto.tink.proto;

import com.google.crypto.tink.proto.KeyTypeEntry;
import com.google.crypto.tink.shaded.protobuf.AbstractMessageLite;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.CodedInputStream;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
@Deprecated
/* loaded from: classes7.dex */
public final class RegistryConfig extends GeneratedMessageLite<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final RegistryConfig DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile Parser<RegistryConfig> PARSER;
    private String configName_ = "";
    private Internal.ProtobufList<KeyTypeEntry> entry_ = emptyProtobufList();

    private RegistryConfig() {
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public String getConfigName() {
        return this.configName_;
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public ByteString getConfigNameBytes() {
        return ByteString.copyFromUtf8(this.configName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigName(String value) {
        value.getClass();
        this.configName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigName() {
        this.configName_ = getDefaultInstance().getConfigName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.configName_ = value.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public List<KeyTypeEntry> getEntryList() {
        return this.entry_;
    }

    public List<? extends KeyTypeEntryOrBuilder> getEntryOrBuilderList() {
        return this.entry_;
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public int getEntryCount() {
        return this.entry_.size();
    }

    @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
    public KeyTypeEntry getEntry(int index) {
        return this.entry_.get(index);
    }

    public KeyTypeEntryOrBuilder getEntryOrBuilder(int index) {
        return this.entry_.get(index);
    }

    private void ensureEntryIsMutable() {
        if (this.entry_.isModifiable()) {
            return;
        }
        this.entry_ = GeneratedMessageLite.mutableCopy(this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntry(int index, KeyTypeEntry value) {
        value.getClass();
        ensureEntryIsMutable();
        this.entry_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(KeyTypeEntry value) {
        value.getClass();
        ensureEntryIsMutable();
        this.entry_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntry(int index, KeyTypeEntry value) {
        value.getClass();
        ensureEntryIsMutable();
        this.entry_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntry(Iterable<? extends KeyTypeEntry> values) {
        ensureEntryIsMutable();
        AbstractMessageLite.addAll((Iterable) values, (List) this.entry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntry() {
        this.entry_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntry(int index) {
        ensureEntryIsMutable();
        this.entry_.remove(index);
    }

    public static RegistryConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RegistryConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RegistryConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RegistryConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RegistryConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static RegistryConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static RegistryConfig parseFrom(InputStream input) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RegistryConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RegistryConfig parseDelimitedFrom(InputStream input) throws IOException {
        return (RegistryConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static RegistryConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RegistryConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static RegistryConfig parseFrom(CodedInputStream input) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static RegistryConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (RegistryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(RegistryConfig prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<RegistryConfig, Builder> implements RegistryConfigOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(RegistryConfig.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public String getConfigName() {
            return ((RegistryConfig) this.instance).getConfigName();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public ByteString getConfigNameBytes() {
            return ((RegistryConfig) this.instance).getConfigNameBytes();
        }

        public Builder setConfigName(String value) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setConfigName(value);
            return this;
        }

        public Builder clearConfigName() {
            copyOnWrite();
            ((RegistryConfig) this.instance).clearConfigName();
            return this;
        }

        public Builder setConfigNameBytes(ByteString value) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setConfigNameBytes(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public List<KeyTypeEntry> getEntryList() {
            return Collections.unmodifiableList(((RegistryConfig) this.instance).getEntryList());
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public int getEntryCount() {
            return ((RegistryConfig) this.instance).getEntryCount();
        }

        @Override // com.google.crypto.tink.proto.RegistryConfigOrBuilder
        public KeyTypeEntry getEntry(int index) {
            return ((RegistryConfig) this.instance).getEntry(index);
        }

        public Builder setEntry(int index, KeyTypeEntry value) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setEntry(index, value);
            return this;
        }

        public Builder setEntry(int index, KeyTypeEntry.Builder builderForValue) {
            copyOnWrite();
            ((RegistryConfig) this.instance).setEntry(index, builderForValue.build());
            return this;
        }

        public Builder addEntry(KeyTypeEntry value) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(value);
            return this;
        }

        public Builder addEntry(int index, KeyTypeEntry value) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(index, value);
            return this;
        }

        public Builder addEntry(KeyTypeEntry.Builder builderForValue) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(builderForValue.build());
            return this;
        }

        public Builder addEntry(int index, KeyTypeEntry.Builder builderForValue) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addEntry(index, builderForValue.build());
            return this;
        }

        public Builder addAllEntry(Iterable<? extends KeyTypeEntry> values) {
            copyOnWrite();
            ((RegistryConfig) this.instance).addAllEntry(values);
            return this;
        }

        public Builder clearEntry() {
            copyOnWrite();
            ((RegistryConfig) this.instance).clearEntry();
            return this;
        }

        public Builder removeEntry(int index) {
            copyOnWrite();
            ((RegistryConfig) this.instance).removeEntry(index);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.RegistryConfig$1  reason: invalid class name */
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
                return new RegistryConfig();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", KeyTypeEntry.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RegistryConfig> parser = PARSER;
                if (parser == null) {
                    synchronized (RegistryConfig.class) {
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
        RegistryConfig registryConfig = new RegistryConfig();
        DEFAULT_INSTANCE = registryConfig;
        GeneratedMessageLite.registerDefaultInstance(RegistryConfig.class, registryConfig);
    }

    public static RegistryConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RegistryConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
