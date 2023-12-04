package com.google.cloud.speech.v1p1beta1;

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
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class ListCustomClassesRequest extends GeneratedMessageV3 implements ListCustomClassesRequestOrBuilder {
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private int pageSize_;
    private volatile Object pageToken_;
    private volatile Object parent_;
    private static final ListCustomClassesRequest DEFAULT_INSTANCE = new ListCustomClassesRequest();
    private static final Parser<ListCustomClassesRequest> PARSER = new AbstractParser<ListCustomClassesRequest>() { // from class: com.google.cloud.speech.v1p1beta1.ListCustomClassesRequest.1
        @Override // com.google.protobuf.Parser
        public ListCustomClassesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ListCustomClassesRequest(codedInputStream, extensionRegistryLite);
        }
    };

    private ListCustomClassesRequest(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ListCustomClassesRequest() {
        this.memoizedIsInitialized = (byte) -1;
        this.parent_ = "";
        this.pageToken_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ListCustomClassesRequest();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private ListCustomClassesRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.parent_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 16) {
                            this.pageSize_ = codedInputStream.readInt32();
                        } else if (readTag == 26) {
                            this.pageToken_ = codedInputStream.readStringRequireUtf8();
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
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ListCustomClassesRequest.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
    public String getParent() {
        Object obj = this.parent_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.parent_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
    public ByteString getParentBytes() {
        Object obj = this.parent_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.parent_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
    public int getPageSize() {
        return this.pageSize_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
    public String getPageToken() {
        Object obj = this.pageToken_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.pageToken_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
    public ByteString getPageTokenBytes() {
        Object obj = this.pageToken_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pageToken_ = copyFromUtf8;
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
        if (!getParentBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.parent_);
        }
        int i = this.pageSize_;
        if (i != 0) {
            codedOutputStream.writeInt32(2, i);
        }
        if (!getPageTokenBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.pageToken_);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = getParentBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.parent_);
        int i2 = this.pageSize_;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(2, i2);
        }
        if (!getPageTokenBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(3, this.pageToken_);
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
        if (!(obj instanceof ListCustomClassesRequest)) {
            return super.equals(obj);
        }
        ListCustomClassesRequest listCustomClassesRequest = (ListCustomClassesRequest) obj;
        return getParent().equals(listCustomClassesRequest.getParent()) && getPageSize() == listCustomClassesRequest.getPageSize() && getPageToken().equals(listCustomClassesRequest.getPageToken()) && this.unknownFields.equals(listCustomClassesRequest.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getParent().hashCode()) * 37) + 2) * 53) + getPageSize()) * 37) + 3) * 53) + getPageToken().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public static ListCustomClassesRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ListCustomClassesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ListCustomClassesRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ListCustomClassesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ListCustomClassesRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ListCustomClassesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ListCustomClassesRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListCustomClassesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ListCustomClassesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCustomClassesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListCustomClassesRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCustomClassesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListCustomClassesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCustomClassesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListCustomClassesRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCustomClassesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ListCustomClassesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCustomClassesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListCustomClassesRequest listCustomClassesRequest) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listCustomClassesRequest);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListCustomClassesRequestOrBuilder {
        private int pageSize_;
        private Object pageToken_;
        private Object parent_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ListCustomClassesRequest.class, Builder.class);
        }

        private Builder() {
            this.parent_ = "";
            this.pageToken_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.parent_ = "";
            this.pageToken_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = ListCustomClassesRequest.alwaysUseFieldBuilders;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.parent_ = "";
            this.pageSize_ = 0;
            this.pageToken_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListCustomClassesRequest_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ListCustomClassesRequest getDefaultInstanceForType() {
            return ListCustomClassesRequest.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListCustomClassesRequest build() {
            ListCustomClassesRequest buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListCustomClassesRequest buildPartial() {
            ListCustomClassesRequest listCustomClassesRequest = new ListCustomClassesRequest(this);
            listCustomClassesRequest.parent_ = this.parent_;
            listCustomClassesRequest.pageSize_ = this.pageSize_;
            listCustomClassesRequest.pageToken_ = this.pageToken_;
            onBuilt();
            return listCustomClassesRequest;
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
            if (message instanceof ListCustomClassesRequest) {
                return mergeFrom((ListCustomClassesRequest) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ListCustomClassesRequest listCustomClassesRequest) {
            if (listCustomClassesRequest == ListCustomClassesRequest.getDefaultInstance()) {
                return this;
            }
            if (!listCustomClassesRequest.getParent().isEmpty()) {
                this.parent_ = listCustomClassesRequest.parent_;
                onChanged();
            }
            if (listCustomClassesRequest.getPageSize() != 0) {
                setPageSize(listCustomClassesRequest.getPageSize());
            }
            if (!listCustomClassesRequest.getPageToken().isEmpty()) {
                this.pageToken_ = listCustomClassesRequest.pageToken_;
                onChanged();
            }
            mergeUnknownFields(listCustomClassesRequest.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ListCustomClassesRequest listCustomClassesRequest = null;
            try {
                try {
                    ListCustomClassesRequest listCustomClassesRequest2 = (ListCustomClassesRequest) ListCustomClassesRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (listCustomClassesRequest2 != null) {
                        mergeFrom(listCustomClassesRequest2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ListCustomClassesRequest listCustomClassesRequest3 = (ListCustomClassesRequest) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        listCustomClassesRequest = listCustomClassesRequest3;
                        if (listCustomClassesRequest != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (listCustomClassesRequest != null) {
                    mergeFrom(listCustomClassesRequest);
                }
                throw th;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
        public String getParent() {
            Object obj = this.parent_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.parent_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
        public ByteString getParentBytes() {
            Object obj = this.parent_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.parent_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setParent(String str) {
            str.getClass();
            this.parent_ = str;
            onChanged();
            return this;
        }

        public Builder clearParent() {
            this.parent_ = ListCustomClassesRequest.getDefaultInstance().getParent();
            onChanged();
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            byteString.getClass();
            ListCustomClassesRequest.checkByteStringIsUtf8(byteString);
            this.parent_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
        public int getPageSize() {
            return this.pageSize_;
        }

        public Builder setPageSize(int i) {
            this.pageSize_ = i;
            onChanged();
            return this;
        }

        public Builder clearPageSize() {
            this.pageSize_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
        public String getPageToken() {
            Object obj = this.pageToken_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.pageToken_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListCustomClassesRequestOrBuilder
        public ByteString getPageTokenBytes() {
            Object obj = this.pageToken_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pageToken_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setPageToken(String str) {
            str.getClass();
            this.pageToken_ = str;
            onChanged();
            return this;
        }

        public Builder clearPageToken() {
            this.pageToken_ = ListCustomClassesRequest.getDefaultInstance().getPageToken();
            onChanged();
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            byteString.getClass();
            ListCustomClassesRequest.checkByteStringIsUtf8(byteString);
            this.pageToken_ = byteString;
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

    public static ListCustomClassesRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ListCustomClassesRequest> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ListCustomClassesRequest> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ListCustomClassesRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
