package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.CustomClass;
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
public final class ListCustomClassesResponse extends GeneratedMessageV3 implements ListCustomClassesResponseOrBuilder {
    public static final int CUSTOM_CLASSES_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private List<CustomClass> customClasses_;
    private byte memoizedIsInitialized;
    private volatile Object nextPageToken_;
    private static final ListCustomClassesResponse DEFAULT_INSTANCE = new ListCustomClassesResponse();
    private static final Parser<ListCustomClassesResponse> PARSER = new AbstractParser<ListCustomClassesResponse>() { // from class: com.google.cloud.speech.v1p1beta1.ListCustomClassesResponse.1
        @Override // com.google.protobuf.Parser
        public ListCustomClassesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ListCustomClassesResponse(codedInputStream, extensionRegistryLite);
        }
    };

    private ListCustomClassesResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ListCustomClassesResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.customClasses_ = Collections.emptyList();
        this.nextPageToken_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ListCustomClassesResponse();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ListCustomClassesResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            if (!(z2 & true)) {
                                this.customClasses_ = new ArrayList();
                                z2 |= true;
                            }
                            this.customClasses_.add(codedInputStream.readMessage(CustomClass.parser(), extensionRegistryLite));
                        } else if (readTag == 18) {
                            this.nextPageToken_ = codedInputStream.readStringRequireUtf8();
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
                if (z2 & true) {
                    this.customClasses_ = Collections.unmodifiableList(this.customClasses_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ListCustomClassesResponse.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public List<CustomClass> getCustomClassesList() {
        return this.customClasses_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public List<? extends CustomClassOrBuilder> getCustomClassesOrBuilderList() {
        return this.customClasses_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public int getCustomClassesCount() {
        return this.customClasses_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public CustomClass getCustomClasses(int i) {
        return this.customClasses_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public CustomClassOrBuilder getCustomClassesOrBuilder(int i) {
        return this.customClasses_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public String getNextPageToken() {
        Object obj = this.nextPageToken_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.nextPageToken_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
    public ByteString getNextPageTokenBytes() {
        Object obj = this.nextPageToken_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nextPageToken_ = copyFromUtf8;
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
        for (int i = 0; i < this.customClasses_.size(); i++) {
            codedOutputStream.writeMessage(1, this.customClasses_.get(i));
        }
        if (!getNextPageTokenBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.nextPageToken_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.customClasses_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.customClasses_.get(i3));
        }
        if (!getNextPageTokenBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.nextPageToken_);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCustomClassesResponse)) {
            return super.equals(obj);
        }
        ListCustomClassesResponse listCustomClassesResponse = (ListCustomClassesResponse) obj;
        return getCustomClassesList().equals(listCustomClassesResponse.getCustomClassesList()) && getNextPageToken().equals(listCustomClassesResponse.getNextPageToken()) && this.unknownFields.equals(listCustomClassesResponse.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getCustomClassesCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getCustomClassesList().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 2) * 53) + getNextPageToken().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static ListCustomClassesResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ListCustomClassesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ListCustomClassesResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ListCustomClassesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ListCustomClassesResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ListCustomClassesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ListCustomClassesResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListCustomClassesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ListCustomClassesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCustomClassesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListCustomClassesResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCustomClassesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListCustomClassesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCustomClassesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListCustomClassesResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCustomClassesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ListCustomClassesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCustomClassesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListCustomClassesResponse listCustomClassesResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listCustomClassesResponse);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListCustomClassesResponseOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> customClassesBuilder_;
        private List<CustomClass> customClasses_;
        private Object nextPageToken_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ListCustomClassesResponse.class, Builder.class);
        }

        private Builder() {
            this.customClasses_ = Collections.emptyList();
            this.nextPageToken_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.customClasses_ = Collections.emptyList();
            this.nextPageToken_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (ListCustomClassesResponse.alwaysUseFieldBuilders) {
                getCustomClassesFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.customClasses_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.nextPageToken_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ListCustomClassesResponse getDefaultInstanceForType() {
            return ListCustomClassesResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListCustomClassesResponse build() {
            ListCustomClassesResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListCustomClassesResponse buildPartial() {
            ListCustomClassesResponse listCustomClassesResponse = new ListCustomClassesResponse(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.customClasses_ = Collections.unmodifiableList(this.customClasses_);
                    this.bitField0_ &= -2;
                }
                listCustomClassesResponse.customClasses_ = this.customClasses_;
            } else {
                listCustomClassesResponse.customClasses_ = repeatedFieldBuilderV3.build();
            }
            listCustomClassesResponse.nextPageToken_ = this.nextPageToken_;
            onBuilt();
            return listCustomClassesResponse;
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
            if (message instanceof ListCustomClassesResponse) {
                return mergeFrom((ListCustomClassesResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ListCustomClassesResponse listCustomClassesResponse) {
            if (listCustomClassesResponse == ListCustomClassesResponse.getDefaultInstance()) {
                return this;
            }
            if (this.customClassesBuilder_ == null) {
                if (!listCustomClassesResponse.customClasses_.isEmpty()) {
                    if (this.customClasses_.isEmpty()) {
                        this.customClasses_ = listCustomClassesResponse.customClasses_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureCustomClassesIsMutable();
                        this.customClasses_.addAll(listCustomClassesResponse.customClasses_);
                    }
                    onChanged();
                }
            } else if (!listCustomClassesResponse.customClasses_.isEmpty()) {
                if (!this.customClassesBuilder_.isEmpty()) {
                    this.customClassesBuilder_.addAllMessages(listCustomClassesResponse.customClasses_);
                } else {
                    this.customClassesBuilder_.dispose();
                    this.customClassesBuilder_ = null;
                    this.customClasses_ = listCustomClassesResponse.customClasses_;
                    this.bitField0_ &= -2;
                    this.customClassesBuilder_ = ListCustomClassesResponse.alwaysUseFieldBuilders ? getCustomClassesFieldBuilder() : null;
                }
            }
            if (!listCustomClassesResponse.getNextPageToken().isEmpty()) {
                this.nextPageToken_ = listCustomClassesResponse.nextPageToken_;
                onChanged();
            }
            mergeUnknownFields(listCustomClassesResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ListCustomClassesResponse listCustomClassesResponse = null;
            try {
                try {
                    ListCustomClassesResponse listCustomClassesResponse2 = (ListCustomClassesResponse) ListCustomClassesResponse.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (listCustomClassesResponse2 != null) {
                        mergeFrom(listCustomClassesResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ListCustomClassesResponse listCustomClassesResponse3 = (ListCustomClassesResponse) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        listCustomClassesResponse = listCustomClassesResponse3;
                        if (listCustomClassesResponse != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (listCustomClassesResponse != null) {
                    mergeFrom(listCustomClassesResponse);
                }
                throw th;
            }
        }

        private void ensureCustomClassesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.customClasses_ = new ArrayList(this.customClasses_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public List<CustomClass> getCustomClassesList() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.customClasses_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public int getCustomClassesCount() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.customClasses_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public CustomClass getCustomClasses(int i) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.customClasses_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setCustomClasses(int i, CustomClass customClass) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customClass.getClass();
                ensureCustomClassesIsMutable();
                this.customClasses_.set(i, customClass);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, customClass);
            }
            return this;
        }

        public Builder setCustomClasses(int i, CustomClass.Builder builder) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addCustomClasses(CustomClass customClass) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customClass.getClass();
                ensureCustomClassesIsMutable();
                this.customClasses_.add(customClass);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(customClass);
            }
            return this;
        }

        public Builder addCustomClasses(int i, CustomClass customClass) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                customClass.getClass();
                ensureCustomClassesIsMutable();
                this.customClasses_.add(i, customClass);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, customClass);
            }
            return this;
        }

        public Builder addCustomClasses(CustomClass.Builder builder) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addCustomClasses(int i, CustomClass.Builder builder) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllCustomClasses(Iterable<? extends CustomClass> iterable) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.customClasses_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearCustomClasses() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.customClasses_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeCustomClasses(int i) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureCustomClassesIsMutable();
                this.customClasses_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public CustomClass.Builder getCustomClassesBuilder(int i) {
            return getCustomClassesFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public CustomClassOrBuilder getCustomClassesOrBuilder(int i) {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.customClasses_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public List<? extends CustomClassOrBuilder> getCustomClassesOrBuilderList() {
            RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> repeatedFieldBuilderV3 = this.customClassesBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.customClasses_);
        }

        public CustomClass.Builder addCustomClassesBuilder() {
            return getCustomClassesFieldBuilder().addBuilder(CustomClass.getDefaultInstance());
        }

        public CustomClass.Builder addCustomClassesBuilder(int i) {
            return getCustomClassesFieldBuilder().addBuilder(i, CustomClass.getDefaultInstance());
        }

        public List<CustomClass.Builder> getCustomClassesBuilderList() {
            return getCustomClassesFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<CustomClass, CustomClass.Builder, CustomClassOrBuilder> getCustomClassesFieldBuilder() {
            if (this.customClassesBuilder_ == null) {
                this.customClassesBuilder_ = new RepeatedFieldBuilderV3<>(this.customClasses_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.customClasses_ = null;
            }
            return this.customClassesBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public String getNextPageToken() {
            Object obj = this.nextPageToken_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nextPageToken_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesResponseOrBuilder
        public ByteString getNextPageTokenBytes() {
            Object obj = this.nextPageToken_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nextPageToken_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setNextPageToken(String str) {
            str.getClass();
            this.nextPageToken_ = str;
            onChanged();
            return this;
        }

        public Builder clearNextPageToken() {
            this.nextPageToken_ = ListCustomClassesResponse.getDefaultInstance().getNextPageToken();
            onChanged();
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            byteString.getClass();
            ListCustomClassesResponse.checkByteStringIsUtf8(byteString);
            this.nextPageToken_ = byteString;
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

    public static ListCustomClassesResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ListCustomClassesResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ListCustomClassesResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ListCustomClassesResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
