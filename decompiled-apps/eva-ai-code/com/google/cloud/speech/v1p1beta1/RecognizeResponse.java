package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.SpeechRecognitionResult;
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
public final class RecognizeResponse extends GeneratedMessageV3 implements RecognizeResponseOrBuilder {
    private static final RecognizeResponse DEFAULT_INSTANCE = new RecognizeResponse();
    private static final Parser<RecognizeResponse> PARSER = new AbstractParser<RecognizeResponse>() { // from class: com.google.cloud.speech.v1p1beta1.RecognizeResponse.1
        @Override // com.google.protobuf.Parser
        public RecognizeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new RecognizeResponse(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int RESULTS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<SpeechRecognitionResult> results_;

    private RecognizeResponse(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private RecognizeResponse() {
        this.memoizedIsInitialized = (byte) -1;
        this.results_ = Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new RecognizeResponse();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private RecognizeResponse(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        if (readTag == 18) {
                            if (!(z2 & true)) {
                                this.results_ = new ArrayList();
                                z2 |= true;
                            }
                            this.results_.add(codedInputStream.readMessage(SpeechRecognitionResult.parser(), extensionRegistryLite));
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
                    this.results_ = Collections.unmodifiableList(this.results_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognizeResponse.class, Builder.class);
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
    public List<SpeechRecognitionResult> getResultsList() {
        return this.results_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
    public List<? extends SpeechRecognitionResultOrBuilder> getResultsOrBuilderList() {
        return this.results_;
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
    public int getResultsCount() {
        return this.results_.size();
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
    public SpeechRecognitionResult getResults(int i) {
        return this.results_.get(i);
    }

    @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
    public SpeechRecognitionResultOrBuilder getResultsOrBuilder(int i) {
        return this.results_.get(i);
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
        for (int i = 0; i < this.results_.size(); i++) {
            codedOutputStream.writeMessage(2, this.results_.get(i));
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
        for (int i3 = 0; i3 < this.results_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(2, this.results_.get(i3));
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
        if (!(obj instanceof RecognizeResponse)) {
            return super.equals(obj);
        }
        RecognizeResponse recognizeResponse = (RecognizeResponse) obj;
        return getResultsList().equals(recognizeResponse.getResultsList()) && this.unknownFields.equals(recognizeResponse.unknownFields);
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getResultsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getResultsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static RecognizeResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static RecognizeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static RecognizeResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static RecognizeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static RecognizeResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static RecognizeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static RecognizeResponse parseFrom(InputStream inputStream) throws IOException {
        return (RecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static RecognizeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognizeResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecognizeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static RecognizeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognizeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static RecognizeResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static RecognizeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecognizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RecognizeResponse recognizeResponse) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(recognizeResponse);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RecognizeResponseOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> resultsBuilder_;
        private List<SpeechRecognitionResult> results_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RecognizeResponse.class, Builder.class);
        }

        private Builder() {
            this.results_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.results_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (RecognizeResponse.alwaysUseFieldBuilders) {
                getResultsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.results_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SpeechProto.internal_static_google_cloud_speech_v1p1beta1_RecognizeResponse_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RecognizeResponse getDefaultInstanceForType() {
            return RecognizeResponse.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognizeResponse build() {
            RecognizeResponse buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public RecognizeResponse buildPartial() {
            RecognizeResponse recognizeResponse = new RecognizeResponse(this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.results_ = Collections.unmodifiableList(this.results_);
                    this.bitField0_ &= -2;
                }
                recognizeResponse.results_ = this.results_;
            } else {
                recognizeResponse.results_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return recognizeResponse;
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
            if (message instanceof RecognizeResponse) {
                return mergeFrom((RecognizeResponse) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(RecognizeResponse recognizeResponse) {
            if (recognizeResponse == RecognizeResponse.getDefaultInstance()) {
                return this;
            }
            if (this.resultsBuilder_ == null) {
                if (!recognizeResponse.results_.isEmpty()) {
                    if (this.results_.isEmpty()) {
                        this.results_ = recognizeResponse.results_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureResultsIsMutable();
                        this.results_.addAll(recognizeResponse.results_);
                    }
                    onChanged();
                }
            } else if (!recognizeResponse.results_.isEmpty()) {
                if (!this.resultsBuilder_.isEmpty()) {
                    this.resultsBuilder_.addAllMessages(recognizeResponse.results_);
                } else {
                    this.resultsBuilder_.dispose();
                    this.resultsBuilder_ = null;
                    this.results_ = recognizeResponse.results_;
                    this.bitField0_ &= -2;
                    this.resultsBuilder_ = RecognizeResponse.alwaysUseFieldBuilders ? getResultsFieldBuilder() : null;
                }
            }
            mergeUnknownFields(recognizeResponse.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            RecognizeResponse recognizeResponse = null;
            try {
                try {
                    RecognizeResponse recognizeResponse2 = (RecognizeResponse) RecognizeResponse.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (recognizeResponse2 != null) {
                        mergeFrom(recognizeResponse2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    RecognizeResponse recognizeResponse3 = (RecognizeResponse) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        recognizeResponse = recognizeResponse3;
                        if (recognizeResponse != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (recognizeResponse != null) {
                    mergeFrom(recognizeResponse);
                }
                throw th;
            }
        }

        private void ensureResultsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.results_ = new ArrayList(this.results_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
        public List<SpeechRecognitionResult> getResultsList() {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.results_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
        public int getResultsCount() {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.results_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
        public SpeechRecognitionResult getResults(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.results_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setResults(int i, SpeechRecognitionResult speechRecognitionResult) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechRecognitionResult.getClass();
                ensureResultsIsMutable();
                this.results_.set(i, speechRecognitionResult);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, speechRecognitionResult);
            }
            return this;
        }

        public Builder setResults(int i, SpeechRecognitionResult.Builder builder) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addResults(SpeechRecognitionResult speechRecognitionResult) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechRecognitionResult.getClass();
                ensureResultsIsMutable();
                this.results_.add(speechRecognitionResult);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(speechRecognitionResult);
            }
            return this;
        }

        public Builder addResults(int i, SpeechRecognitionResult speechRecognitionResult) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                speechRecognitionResult.getClass();
                ensureResultsIsMutable();
                this.results_.add(i, speechRecognitionResult);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, speechRecognitionResult);
            }
            return this;
        }

        public Builder addResults(SpeechRecognitionResult.Builder builder) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addResults(int i, SpeechRecognitionResult.Builder builder) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllResults(Iterable<? extends SpeechRecognitionResult> iterable) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.results_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearResults() {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.results_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeResults(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureResultsIsMutable();
                this.results_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public SpeechRecognitionResult.Builder getResultsBuilder(int i) {
            return getResultsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
        public SpeechRecognitionResultOrBuilder getResultsOrBuilder(int i) {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.results_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.cloud.speech.v1p1beta1.RecognizeResponseOrBuilder
        public List<? extends SpeechRecognitionResultOrBuilder> getResultsOrBuilderList() {
            RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> repeatedFieldBuilderV3 = this.resultsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.results_);
        }

        public SpeechRecognitionResult.Builder addResultsBuilder() {
            return getResultsFieldBuilder().addBuilder(SpeechRecognitionResult.getDefaultInstance());
        }

        public SpeechRecognitionResult.Builder addResultsBuilder(int i) {
            return getResultsFieldBuilder().addBuilder(i, SpeechRecognitionResult.getDefaultInstance());
        }

        public List<SpeechRecognitionResult.Builder> getResultsBuilderList() {
            return getResultsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<SpeechRecognitionResult, SpeechRecognitionResult.Builder, SpeechRecognitionResultOrBuilder> getResultsFieldBuilder() {
            if (this.resultsBuilder_ == null) {
                this.resultsBuilder_ = new RepeatedFieldBuilderV3<>(this.results_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.results_ = null;
            }
            return this.resultsBuilder_;
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

    public static RecognizeResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<RecognizeResponse> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<RecognizeResponse> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public RecognizeResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
