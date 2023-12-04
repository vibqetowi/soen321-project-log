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
@Deprecated
/* loaded from: classes7.dex */
public final class KeyTypeEntry extends GeneratedMessageLite<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final KeyTypeEntry DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile Parser<KeyTypeEntry> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    private KeyTypeEntry() {
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public String getPrimitiveName() {
        return this.primitiveName_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public ByteString getPrimitiveNameBytes() {
        return ByteString.copyFromUtf8(this.primitiveName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveName(String value) {
        value.getClass();
        this.primitiveName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimitiveName() {
        this.primitiveName_ = getDefaultInstance().getPrimitiveName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.primitiveName_ = value.toStringUtf8();
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
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

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public int getKeyManagerVersion() {
        return this.keyManagerVersion_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyManagerVersion(int value) {
        this.keyManagerVersion_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyManagerVersion() {
        this.keyManagerVersion_ = 0;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public boolean getNewKeyAllowed() {
        return this.newKeyAllowed_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewKeyAllowed(boolean value) {
        this.newKeyAllowed_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewKeyAllowed() {
        this.newKeyAllowed_ = false;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public String getCatalogueName() {
        return this.catalogueName_;
    }

    @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
    public ByteString getCatalogueNameBytes() {
        return ByteString.copyFromUtf8(this.catalogueName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueName(String value) {
        value.getClass();
        this.catalogueName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCatalogueName() {
        this.catalogueName_ = getDefaultInstance().getCatalogueName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.catalogueName_ = value.toStringUtf8();
    }

    public static KeyTypeEntry parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeyTypeEntry parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeyTypeEntry parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeyTypeEntry parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeyTypeEntry parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static KeyTypeEntry parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static KeyTypeEntry parseFrom(InputStream input) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KeyTypeEntry parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream input) throws IOException {
        return (KeyTypeEntry) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static KeyTypeEntry parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeyTypeEntry) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static KeyTypeEntry parseFrom(CodedInputStream input) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static KeyTypeEntry parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (KeyTypeEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(KeyTypeEntry prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<KeyTypeEntry, Builder> implements KeyTypeEntryOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(KeyTypeEntry.DEFAULT_INSTANCE);
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public String getPrimitiveName() {
            return ((KeyTypeEntry) this.instance).getPrimitiveName();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public ByteString getPrimitiveNameBytes() {
            return ((KeyTypeEntry) this.instance).getPrimitiveNameBytes();
        }

        public Builder setPrimitiveName(String value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setPrimitiveName(value);
            return this;
        }

        public Builder clearPrimitiveName() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearPrimitiveName();
            return this;
        }

        public Builder setPrimitiveNameBytes(ByteString value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setPrimitiveNameBytes(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public String getTypeUrl() {
            return ((KeyTypeEntry) this.instance).getTypeUrl();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public ByteString getTypeUrlBytes() {
            return ((KeyTypeEntry) this.instance).getTypeUrlBytes();
        }

        public Builder setTypeUrl(String value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setTypeUrl(value);
            return this;
        }

        public Builder clearTypeUrl() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearTypeUrl();
            return this;
        }

        public Builder setTypeUrlBytes(ByteString value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setTypeUrlBytes(value);
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public int getKeyManagerVersion() {
            return ((KeyTypeEntry) this.instance).getKeyManagerVersion();
        }

        public Builder setKeyManagerVersion(int value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setKeyManagerVersion(value);
            return this;
        }

        public Builder clearKeyManagerVersion() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearKeyManagerVersion();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public boolean getNewKeyAllowed() {
            return ((KeyTypeEntry) this.instance).getNewKeyAllowed();
        }

        public Builder setNewKeyAllowed(boolean value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setNewKeyAllowed(value);
            return this;
        }

        public Builder clearNewKeyAllowed() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearNewKeyAllowed();
            return this;
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public String getCatalogueName() {
            return ((KeyTypeEntry) this.instance).getCatalogueName();
        }

        @Override // com.google.crypto.tink.proto.KeyTypeEntryOrBuilder
        public ByteString getCatalogueNameBytes() {
            return ((KeyTypeEntry) this.instance).getCatalogueNameBytes();
        }

        public Builder setCatalogueName(String value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setCatalogueName(value);
            return this;
        }

        public Builder clearCatalogueName() {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).clearCatalogueName();
            return this;
        }

        public Builder setCatalogueNameBytes(ByteString value) {
            copyOnWrite();
            ((KeyTypeEntry) this.instance).setCatalogueNameBytes(value);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.proto.KeyTypeEntry$1  reason: invalid class name */
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
                return new KeyTypeEntry();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KeyTypeEntry> parser = PARSER;
                if (parser == null) {
                    synchronized (KeyTypeEntry.class) {
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
        KeyTypeEntry keyTypeEntry = new KeyTypeEntry();
        DEFAULT_INSTANCE = keyTypeEntry;
        GeneratedMessageLite.registerDefaultInstance(KeyTypeEntry.class, keyTypeEntry);
    }

    public static KeyTypeEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<KeyTypeEntry> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
