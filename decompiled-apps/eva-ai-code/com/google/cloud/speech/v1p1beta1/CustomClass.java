package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class CustomClass extends GeneratedMessageV3 implements CustomClassOrBuilder {
    public static final int CUSTOM_CLASS_ID_FIELD_NUMBER = 2;
    public static final int ITEMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private volatile Object customClassId_;
    private List<ClassItem> items_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private static final CustomClass DEFAULT_INSTANCE = new CustomClass();
    private static final Parser<CustomClass> PARSER = new AbstractParser<CustomClass>() { // from class: com.google.cloud.speech.v1p1beta1.CustomClass.1
        @Override // com.google.protobuf.Parser
        public CustomClass parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CustomClass(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes7.dex */
    public interface ClassItemOrBuilder extends MessageOrBuilder {
        String getValue();

        ByteString getValueBytes();
    }

    private CustomClass(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private CustomClass() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.customClassId_ = "";
        this.items_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new CustomClass();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CustomClass(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.name_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.customClassId_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!(z2 & true)) {
                                    this.items_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.items_.add(codedInputStream.readMessage(ClassItem.parser(), extensionRegistryLite));
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                }
            } finally {
                if (z2 & true) {
                    this.items_ = Collections.unmodifiableList(this.items_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomClass.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public static final class ClassItem extends GeneratedMessageV3 implements ClassItemOrBuilder {
        private static final ClassItem DEFAULT_INSTANCE = new ClassItem();
        private static final Parser<ClassItem> PARSER = new AbstractParser<ClassItem>() { // from class: com.google.cloud.speech.v1p1beta1.CustomClass.ClassItem.1
            @Override // com.google.protobuf.Parser
            public ClassItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ClassItem(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object value_;

        private ClassItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private ClassItem() {
            this.memoizedIsInitialized = (byte) -1;
            this.value_ = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ClassItem();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ClassItem(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.value_ = codedInputStream.readStringRequireUtf8();
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } finally {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ClassItem.class, Builder.class);
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClass.ClassItemOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClass.ClassItemOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.value_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = (getValueBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.value_)) + this.unknownFields.getSerializedSize();
            this.memoizedSize = computeStringSize;
            return computeStringSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClassItem)) {
                return super.equals(obj);
            }
            ClassItem classItem = (ClassItem) obj;
            return getValue().equals(classItem.getValue()) && this.unknownFields.equals(classItem.unknownFields);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        public static ClassItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ClassItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ClassItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static ClassItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ClassItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static ClassItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClassItem parseFrom(InputStream inputStream) throws IOException {
            return (ClassItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ClassItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClassItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClassItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ClassItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClassItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClassItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClassItem parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ClassItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ClassItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ClassItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ClassItem classItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(classItem);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        /* loaded from: classes7.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClassItemOrBuilder {
            private Object value_;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ClassItem.class, Builder.class);
            }

            private Builder() {
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = ClassItem.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.value_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_ClassItem_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ClassItem getDefaultInstanceForType() {
                return ClassItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClassItem build() {
                ClassItem buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClassItem buildPartial() {
                ClassItem classItem = new ClassItem(this);
                classItem.value_ = this.value_;
                onBuilt();
                return classItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClassItem) {
                    return mergeFrom((ClassItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClassItem classItem) {
                if (classItem == ClassItem.getDefaultInstance()) {
                    return this;
                }
                if (!classItem.getValue().isEmpty()) {
                    this.value_ = classItem.value_;
                    onChanged();
                }
                mergeUnknownFields(classItem.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                ClassItem classItem = null;
                try {
                    try {
                        ClassItem classItem2 = (ClassItem) ClassItem.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (classItem2 != null) {
                            mergeFrom(classItem2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ClassItem classItem3 = (ClassItem) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            classItem = classItem3;
                            if (classItem != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (classItem != null) {
                        mergeFrom(classItem);
                    }
                    throw th;
                }
            }

            @Override // com.google.cloud.speech.v1p1beta1.CustomClass.ClassItemOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }
                return (String) obj;
            }

            @Override // com.google.cloud.speech.v1p1beta1.CustomClass.ClassItemOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = copyFromUtf8;
                    return copyFromUtf8;
                }
                return (ByteString) obj;
            }

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = ClassItem.getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                ClassItem.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static ClassItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ClassItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClassItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClassItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public String getCustomClassId() {
        Object obj = this.customClassId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.customClassId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public ByteString getCustomClassIdBytes() {
        Object obj = this.customClassId_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.customClassId_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public List<ClassItem> getItemsList() {
        return this.items_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public List<? extends ClassItemOrBuilder> getItemsOrBuilderList() {
        return this.items_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public int getItemsCount() {
        return this.items_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public ClassItem getItems(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
    public ClassItemOrBuilder getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
        }
        if (!getCustomClassIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.customClassId_);
        }
        for (int i = 0; i < this.items_.size(); i++) {
            codedOutputStream.writeMessage(3, this.items_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) + 0 : 0;
        if (!getCustomClassIdBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.customClassId_);
        }
        for (int i2 = 0; i2 < this.items_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(3, this.items_.get(i2));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomClass)) {
            return super.equals(obj);
        }
        CustomClass customClass = (CustomClass) obj;
        return getName().equals(customClass.getName()) && getCustomClassId().equals(customClass.getCustomClassId()) && getItemsList().equals(customClass.getItemsList()) && this.unknownFields.equals(customClass.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getCustomClassId().hashCode();
        if (getItemsCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getItemsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static CustomClass parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static CustomClass parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static CustomClass parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static CustomClass parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static CustomClass parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static CustomClass parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CustomClass parseFrom(InputStream inputStream) throws IOException {
        return (CustomClass) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static CustomClass parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomClass) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CustomClass parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomClass) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CustomClass parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomClass) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CustomClass parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CustomClass) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CustomClass parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomClass) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CustomClass customClass) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(customClass);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CustomClassOrBuilder {
        private int bitField0_;
        private Object customClassId_;
        private RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> itemsBuilder_;
        private List<ClassItem> items_;
        private Object name_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_fieldAccessorTable.ensureFieldAccessorsInitialized(CustomClass.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.customClassId_ = "";
            this.items_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.customClassId_ = "";
            this.items_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (CustomClass.alwaysUseFieldBuilders) {
                getItemsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            this.customClassId_ = "";
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechResourceProto.internal_static_google_cloud_speech_v1p1beta1_CustomClass_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CustomClass getDefaultInstanceForType() {
            return CustomClass.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CustomClass build() {
            CustomClass buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public CustomClass buildPartial() {
            CustomClass customClass = new CustomClass(this);
            customClass.name_ = this.name_;
            customClass.customClassId_ = this.customClassId_;
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                customClass.items_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.items_ = Collections.unmodifiableList(this.items_);
                    this.bitField0_ &= -2;
                }
                customClass.items_ = this.items_;
            }
            onBuilt();
            return customClass;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clone() {
            return (Builder) super.clone();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof CustomClass) {
                return mergeFrom((CustomClass) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(CustomClass customClass) {
            if (customClass == CustomClass.getDefaultInstance()) {
                return this;
            }
            if (!customClass.getName().isEmpty()) {
                this.name_ = customClass.name_;
                onChanged();
            }
            if (!customClass.getCustomClassId().isEmpty()) {
                this.customClassId_ = customClass.customClassId_;
                onChanged();
            }
            if (this.itemsBuilder_ == null) {
                if (!customClass.items_.isEmpty()) {
                    if (this.items_.isEmpty()) {
                        this.items_ = customClass.items_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureItemsIsMutable();
                        this.items_.addAll(customClass.items_);
                    }
                    onChanged();
                }
            } else if (!customClass.items_.isEmpty()) {
                if (!this.itemsBuilder_.isEmpty()) {
                    this.itemsBuilder_.addAllMessages(customClass.items_);
                } else {
                    this.itemsBuilder_.dispose();
                    this.itemsBuilder_ = null;
                    this.items_ = customClass.items_;
                    this.bitField0_ &= -2;
                    this.itemsBuilder_ = CustomClass.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(customClass.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            CustomClass customClass = null;
            try {
                try {
                    CustomClass customClass2 = (CustomClass) CustomClass.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (customClass2 != null) {
                        mergeFrom(customClass2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    CustomClass customClass3 = (CustomClass) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        customClass = customClass3;
                        if (customClass != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (customClass != null) {
                    mergeFrom(customClass);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = CustomClass.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            CustomClass.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public String getCustomClassId() {
            Object obj = this.customClassId_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.customClassId_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public ByteString getCustomClassIdBytes() {
            Object obj = this.customClassId_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.customClassId_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setCustomClassId(String str) {
            str.getClass();
            this.customClassId_ = str;
            onChanged();
            return this;
        }

        public Builder clearCustomClassId() {
            this.customClassId_ = CustomClass.getDefaultInstance().getCustomClassId();
            onChanged();
            return this;
        }

        public Builder setCustomClassIdBytes(ByteString byteString) {
            byteString.getClass();
            CustomClass.checkByteStringIsUtf8(byteString);
            this.customClassId_ = byteString;
            onChanged();
            return this;
        }

        private void ensureItemsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.items_ = new ArrayList(this.items_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public List<ClassItem> getItemsList() {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.items_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public int getItemsCount() {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public ClassItem getItems(int i) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setItems(int i, ClassItem classItem) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                classItem.getClass();
                ensureItemsIsMutable();
                this.items_.set(i, classItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, classItem);
            }
            return this;
        }

        public Builder setItems(int i, ClassItem.Builder builder) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addItems(ClassItem classItem) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                classItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(classItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(classItem);
            }
            return this;
        }

        public Builder addItems(int i, ClassItem classItem) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                classItem.getClass();
                ensureItemsIsMutable();
                this.items_.add(i, classItem);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, classItem);
            }
            return this;
        }

        public Builder addItems(ClassItem.Builder builder) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addItems(int i, ClassItem.Builder builder) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllItems(Iterable<? extends ClassItem> iterable) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearItems() {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.items_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeItems(int i) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemsIsMutable();
                this.items_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public ClassItem.Builder getItemsBuilder(int i) {
            return getItemsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public ClassItemOrBuilder getItemsOrBuilder(int i) {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.items_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.CustomClassOrBuilder
        public List<? extends ClassItemOrBuilder> getItemsOrBuilderList() {
            RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.items_);
        }

        public ClassItem.Builder addItemsBuilder() {
            return getItemsFieldBuilder().addBuilder(ClassItem.getDefaultInstance());
        }

        public ClassItem.Builder addItemsBuilder(int i) {
            return getItemsFieldBuilder().addBuilder(i, ClassItem.getDefaultInstance());
        }

        public List<ClassItem.Builder> getItemsBuilderList() {
            return getItemsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<ClassItem, ClassItem.Builder, ClassItemOrBuilder> getItemsFieldBuilder() {
            if (this.itemsBuilder_ == null) {
                this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.items_ = null;
            }
            return this.itemsBuilder_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static CustomClass getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CustomClass> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<CustomClass> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public CustomClass getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
