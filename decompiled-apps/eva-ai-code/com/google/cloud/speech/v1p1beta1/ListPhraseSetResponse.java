package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.PhraseSet;
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
public final class ListPhraseSetResponse extends GeneratedMessageV3 implements ListPhraseSetResponseOrBuilder {
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int PHRASE_SETS_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private volatile Object nextPageToken_;
    private List<PhraseSet> phraseSets_;
    private static final ListPhraseSetResponse DEFAULT_INSTANCE = new ListPhraseSetResponse();
    private static final Parser<ListPhraseSetResponse> PARSER = new AbstractParser<ListPhraseSetResponse>() { // from class: com.google.cloud.speech.v1p1beta1.ListPhraseSetResponse.1
        @Override // com.google.protobuf.Parser
        public ListPhraseSetResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new ListPhraseSetResponse(codedInputStream, extensionRegistryLite);
        }
    };

    private ListPhraseSetResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private ListPhraseSetResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.phraseSets_ = Collections.emptyList();
        this.nextPageToken_ = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ListPhraseSetResponse();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ListPhraseSetResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.phraseSets_ = new ArrayList();
                                z2 |= true;
                            }
                            this.phraseSets_.add(codedInputStream.readMessage(PhraseSet.parser(), extensionRegistryLite));
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
                    this.phraseSets_ = Collections.unmodifiableList(this.phraseSets_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ListPhraseSetResponse.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
    public List<PhraseSet> getPhraseSetsList() {
        return this.phraseSets_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
    public List<? extends PhraseSetOrBuilder> getPhraseSetsOrBuilderList() {
        return this.phraseSets_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
    public int getPhraseSetsCount() {
        return this.phraseSets_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
    public PhraseSet getPhraseSets(int i) {
        return this.phraseSets_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
    public PhraseSetOrBuilder getPhraseSetsOrBuilder(int i) {
        return this.phraseSets_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
    public String getNextPageToken() {
        Object obj = this.nextPageToken_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.nextPageToken_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
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
        for (int i = 0; i < this.phraseSets_.size(); i++) {
            codedOutputStream.writeMessage(1, this.phraseSets_.get(i));
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
        for (int i3 = 0; i3 < this.phraseSets_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.phraseSets_.get(i3));
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
        if (!(obj instanceof ListPhraseSetResponse)) {
            return super.equals(obj);
        }
        ListPhraseSetResponse listPhraseSetResponse = (ListPhraseSetResponse) obj;
        return getPhraseSetsList().equals(listPhraseSetResponse.getPhraseSetsList()) && getNextPageToken().equals(listPhraseSetResponse.getNextPageToken()) && this.unknownFields.equals(listPhraseSetResponse.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getPhraseSetsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getPhraseSetsList().hashCode();
        }
        int hashCode2 = (((((hashCode * 37) + 2) * 53) + getNextPageToken().hashCode()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static ListPhraseSetResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static ListPhraseSetResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ListPhraseSetResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static ListPhraseSetResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static ListPhraseSetResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static ListPhraseSetResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ListPhraseSetResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListPhraseSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ListPhraseSetResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListPhraseSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListPhraseSetResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListPhraseSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListPhraseSetResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListPhraseSetResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListPhraseSetResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListPhraseSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ListPhraseSetResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListPhraseSetResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListPhraseSetResponse listPhraseSetResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listPhraseSetResponse);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ListPhraseSetResponseOrBuilder {
        private int bitField0_;
        private Object nextPageToken_;
        private RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> phraseSetsBuilder_;
        private List<PhraseSet> phraseSets_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ListPhraseSetResponse.class, Builder.class);
        }

        private Builder() {
            this.phraseSets_ = Collections.emptyList();
            this.nextPageToken_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.phraseSets_ = Collections.emptyList();
            this.nextPageToken_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (ListPhraseSetResponse.alwaysUseFieldBuilders) {
                getPhraseSetsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.phraseSets_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.nextPageToken_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechAdaptationProto.internal_static_google_cloud_speech_v1p1beta1_ListPhraseSetResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ListPhraseSetResponse getDefaultInstanceForType() {
            return ListPhraseSetResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListPhraseSetResponse build() {
            ListPhraseSetResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListPhraseSetResponse buildPartial() {
            ListPhraseSetResponse listPhraseSetResponse = new ListPhraseSetResponse(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.phraseSets_ = Collections.unmodifiableList(this.phraseSets_);
                    this.bitField0_ &= -2;
                }
                listPhraseSetResponse.phraseSets_ = this.phraseSets_;
            } else {
                listPhraseSetResponse.phraseSets_ = repeatedFieldBuilderV3.build();
            }
            listPhraseSetResponse.nextPageToken_ = this.nextPageToken_;
            onBuilt();
            return listPhraseSetResponse;
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
            if (message instanceof ListPhraseSetResponse) {
                return mergeFrom((ListPhraseSetResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ListPhraseSetResponse listPhraseSetResponse) {
            if (listPhraseSetResponse == ListPhraseSetResponse.getDefaultInstance()) {
                return this;
            }
            if (this.phraseSetsBuilder_ == null) {
                if (!listPhraseSetResponse.phraseSets_.isEmpty()) {
                    if (this.phraseSets_.isEmpty()) {
                        this.phraseSets_ = listPhraseSetResponse.phraseSets_;
                        this.bitField0_ &= -2;
                    } else {
                        ensurePhraseSetsIsMutable();
                        this.phraseSets_.addAll(listPhraseSetResponse.phraseSets_);
                    }
                    onChanged();
                }
            } else if (!listPhraseSetResponse.phraseSets_.isEmpty()) {
                if (!this.phraseSetsBuilder_.isEmpty()) {
                    this.phraseSetsBuilder_.addAllMessages(listPhraseSetResponse.phraseSets_);
                } else {
                    this.phraseSetsBuilder_.dispose();
                    this.phraseSetsBuilder_ = null;
                    this.phraseSets_ = listPhraseSetResponse.phraseSets_;
                    this.bitField0_ &= -2;
                    this.phraseSetsBuilder_ = ListPhraseSetResponse.alwaysUseFieldBuilders ? getPhraseSetsFieldBuilder() : null;
                }
            }
            if (!listPhraseSetResponse.getNextPageToken().isEmpty()) {
                this.nextPageToken_ = listPhraseSetResponse.nextPageToken_;
                onChanged();
            }
            mergeUnknownFields(listPhraseSetResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            ListPhraseSetResponse listPhraseSetResponse = null;
            try {
                try {
                    ListPhraseSetResponse listPhraseSetResponse2 = (ListPhraseSetResponse) ListPhraseSetResponse.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (listPhraseSetResponse2 != null) {
                        mergeFrom(listPhraseSetResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    ListPhraseSetResponse listPhraseSetResponse3 = (ListPhraseSetResponse) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        listPhraseSetResponse = listPhraseSetResponse3;
                        if (listPhraseSetResponse != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (listPhraseSetResponse != null) {
                    mergeFrom(listPhraseSetResponse);
                }
                throw th;
            }
        }

        private void ensurePhraseSetsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.phraseSets_ = new ArrayList(this.phraseSets_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
        public List<PhraseSet> getPhraseSetsList() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.phraseSets_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
        public int getPhraseSetsCount() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phraseSets_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
        public PhraseSet getPhraseSets(int i) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phraseSets_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setPhraseSets(int i, PhraseSet phraseSet) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phraseSet.getClass();
                ensurePhraseSetsIsMutable();
                this.phraseSets_.set(i, phraseSet);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, phraseSet);
            }
            return this;
        }

        public Builder setPhraseSets(int i, PhraseSet.Builder builder) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addPhraseSets(PhraseSet phraseSet) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phraseSet.getClass();
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(phraseSet);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(phraseSet);
            }
            return this;
        }

        public Builder addPhraseSets(int i, PhraseSet phraseSet) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                phraseSet.getClass();
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(i, phraseSet);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, phraseSet);
            }
            return this;
        }

        public Builder addPhraseSets(PhraseSet.Builder builder) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addPhraseSets(int i, PhraseSet.Builder builder) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllPhraseSets(Iterable<? extends PhraseSet> iterable) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.phraseSets_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearPhraseSets() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.phraseSets_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removePhraseSets(int i) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePhraseSetsIsMutable();
                this.phraseSets_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public PhraseSet.Builder getPhraseSetsBuilder(int i) {
            return getPhraseSetsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
        public PhraseSetOrBuilder getPhraseSetsOrBuilder(int i) {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.phraseSets_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
        public List<? extends PhraseSetOrBuilder> getPhraseSetsOrBuilderList() {
            RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> repeatedFieldBuilderV3 = this.phraseSetsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.phraseSets_);
        }

        public PhraseSet.Builder addPhraseSetsBuilder() {
            return getPhraseSetsFieldBuilder().addBuilder(PhraseSet.getDefaultInstance());
        }

        public PhraseSet.Builder addPhraseSetsBuilder(int i) {
            return getPhraseSetsFieldBuilder().addBuilder(i, PhraseSet.getDefaultInstance());
        }

        public List<PhraseSet.Builder> getPhraseSetsBuilderList() {
            return getPhraseSetsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<PhraseSet, PhraseSet.Builder, PhraseSetOrBuilder> getPhraseSetsFieldBuilder() {
            if (this.phraseSetsBuilder_ == null) {
                this.phraseSetsBuilder_ = new RepeatedFieldBuilderV3<>(this.phraseSets_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.phraseSets_ = null;
            }
            return this.phraseSetsBuilder_;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
        public String getNextPageToken() {
            Object obj = this.nextPageToken_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.nextPageToken_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.cloud.speech.v1p1beta1.ListPhraseSetResponseOrBuilder
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
            this.nextPageToken_ = ListPhraseSetResponse.getDefaultInstance().getNextPageToken();
            onChanged();
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            byteString.getClass();
            ListPhraseSetResponse.checkByteStringIsUtf8(byteString);
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

    public static ListPhraseSetResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<ListPhraseSetResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ListPhraseSetResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ListPhraseSetResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
