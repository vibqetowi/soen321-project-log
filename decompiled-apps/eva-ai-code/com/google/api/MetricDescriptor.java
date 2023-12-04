package com.google.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.api.LabelDescriptor;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class MetricDescriptor extends GeneratedMessageV3 implements MetricDescriptorOrBuilder {
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int MONITORED_RESOURCE_TYPES_FIELD_NUMBER = 13;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private volatile Object description_;
    private volatile Object displayName_;
    private List<LabelDescriptor> labels_;
    private int launchStage_;
    private byte memoizedIsInitialized;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private LazyStringList monitoredResourceTypes_;
    private volatile Object name_;
    private volatile Object type_;
    private volatile Object unit_;
    private int valueType_;
    private static final MetricDescriptor DEFAULT_INSTANCE = new MetricDescriptor();
    private static final Parser<MetricDescriptor> PARSER = new AbstractParser<MetricDescriptor>() { // from class: com.google.api.MetricDescriptor.1
        @Override // com.google.protobuf.Parser
        public MetricDescriptor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new MetricDescriptor(codedInputStream, extensionRegistryLite);
        }
    };

    /* loaded from: classes7.dex */
    public interface MetricDescriptorMetadataOrBuilder extends MessageOrBuilder {
        Duration getIngestDelay();

        DurationOrBuilder getIngestDelayOrBuilder();

        @Deprecated
        LaunchStage getLaunchStage();

        @Deprecated
        int getLaunchStageValue();

        Duration getSamplePeriod();

        DurationOrBuilder getSamplePeriodOrBuilder();

        boolean hasIngestDelay();

        boolean hasSamplePeriod();
    }

    private MetricDescriptor(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    private MetricDescriptor() {
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        this.type_ = "";
        this.labels_ = Collections.emptyList();
        this.metricKind_ = 0;
        this.valueType_ = 0;
        this.unit_ = "";
        this.description_ = "";
        this.displayName_ = "";
        this.launchStage_ = 0;
        this.monitoredResourceTypes_ = LazyStringArrayList.EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new MetricDescriptor();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MetricDescriptor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        switch (readTag) {
                            case 0:
                                break;
                            case 10:
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                if (!(z2 & true)) {
                                    this.labels_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.labels_.add(codedInputStream.readMessage(LabelDescriptor.parser(), extensionRegistryLite));
                                continue;
                            case 24:
                                this.metricKind_ = codedInputStream.readEnum();
                                continue;
                            case 32:
                                this.valueType_ = codedInputStream.readEnum();
                                continue;
                            case 42:
                                this.unit_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 50:
                                this.description_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 58:
                                this.displayName_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                this.type_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 82:
                                MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
                                MetricDescriptorMetadata.Builder builder = metricDescriptorMetadata != null ? metricDescriptorMetadata.toBuilder() : null;
                                MetricDescriptorMetadata metricDescriptorMetadata2 = (MetricDescriptorMetadata) codedInputStream.readMessage(MetricDescriptorMetadata.parser(), extensionRegistryLite);
                                this.metadata_ = metricDescriptorMetadata2;
                                if (builder != null) {
                                    builder.mergeFrom(metricDescriptorMetadata2);
                                    this.metadata_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                            case 96:
                                this.launchStage_ = codedInputStream.readEnum();
                                continue;
                            case 106:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!(z2 & true)) {
                                    this.monitoredResourceTypes_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.monitoredResourceTypes_.add(readStringRequireUtf8);
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    }
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                }
            } finally {
                if (z2 & true) {
                    this.labels_ = Collections.unmodifiableList(this.labels_);
                }
                if (z2 & true) {
                    this.monitoredResourceTypes_ = this.monitoredResourceTypes_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
            }
        }
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return MetricProto.internal_static_google_api_MetricDescriptor_descriptor;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return MetricProto.internal_static_google_api_MetricDescriptor_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptor.class, Builder.class);
    }

    /* loaded from: classes7.dex */
    public enum MetricKind implements ProtocolMessageEnum {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);
        
        public static final int CUMULATIVE_VALUE = 3;
        public static final int DELTA_VALUE = 2;
        public static final int GAUGE_VALUE = 1;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<MetricKind> internalValueMap = new Internal.EnumLiteMap<MetricKind>() { // from class: com.google.api.MetricDescriptor.MetricKind.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MetricKind findValueByNumber(int i) {
                return MetricKind.forNumber(i);
            }
        };
        private static final MetricKind[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static MetricKind valueOf(int i) {
            return forNumber(i);
        }

        public static MetricKind forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return CUMULATIVE;
                    }
                    return DELTA;
                }
                return GAUGE;
            }
            return METRIC_KIND_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<MetricKind> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MetricDescriptor.getDescriptor().getEnumTypes().get(0);
        }

        public static MetricKind valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        MetricKind(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes7.dex */
    public enum ValueType implements ProtocolMessageEnum {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);
        
        public static final int BOOL_VALUE = 1;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final int DOUBLE_VALUE = 3;
        public static final int INT64_VALUE = 2;
        public static final int MONEY_VALUE = 6;
        public static final int STRING_VALUE = 4;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap = new Internal.EnumLiteMap<ValueType>() { // from class: com.google.api.MetricDescriptor.ValueType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ValueType findValueByNumber(int i) {
                return ValueType.forNumber(i);
            }
        };
        private static final ValueType[] VALUES = values();

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite, com.google.protobuf.AbstractMessageLite.InternalOneOfEnum
        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        @Deprecated
        public static ValueType valueOf(int i) {
            return forNumber(i);
        }

        public static ValueType forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return MetricDescriptor.getDescriptor().getEnumTypes().get(1);
        }

        public static ValueType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() != getDescriptor()) {
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }

        ValueType(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes7.dex */
    public static final class MetricDescriptorMetadata extends GeneratedMessageV3 implements MetricDescriptorMetadataOrBuilder {
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private Duration ingestDelay_;
        private int launchStage_;
        private byte memoizedIsInitialized;
        private Duration samplePeriod_;
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE = new MetricDescriptorMetadata();
        private static final Parser<MetricDescriptorMetadata> PARSER = new AbstractParser<MetricDescriptorMetadata>() { // from class: com.google.api.MetricDescriptor.MetricDescriptorMetadata.1
            @Override // com.google.protobuf.Parser
            public MetricDescriptorMetadata parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MetricDescriptorMetadata(codedInputStream, extensionRegistryLite);
            }
        };

        private MetricDescriptorMetadata(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        private MetricDescriptorMetadata() {
            this.memoizedIsInitialized = (byte) -1;
            this.launchStage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MetricDescriptorMetadata();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MetricDescriptorMetadata(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            Duration.Builder builder;
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag != 8) {
                                    if (readTag == 18) {
                                        Duration duration = this.samplePeriod_;
                                        builder = duration != null ? duration.toBuilder() : null;
                                        Duration duration2 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                        this.samplePeriod_ = duration2;
                                        if (builder != null) {
                                            builder.mergeFrom(duration2);
                                            this.samplePeriod_ = builder.buildPartial();
                                        }
                                    } else if (readTag == 26) {
                                        Duration duration3 = this.ingestDelay_;
                                        builder = duration3 != null ? duration3.toBuilder() : null;
                                        Duration duration4 = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                        this.ingestDelay_ = duration4;
                                        if (builder != null) {
                                            builder.mergeFrom(duration4);
                                            this.ingestDelay_ = builder.buildPartial();
                                        }
                                    } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                } else {
                                    this.launchStage_ = codedInputStream.readEnum();
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
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptorMetadata.class, Builder.class);
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        @Deprecated
        public LaunchStage getLaunchStage() {
            LaunchStage valueOf = LaunchStage.valueOf(this.launchStage_);
            return valueOf == null ? LaunchStage.UNRECOGNIZED : valueOf;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasSamplePeriod() {
            return this.samplePeriod_ != null;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public DurationOrBuilder getSamplePeriodOrBuilder() {
            return getSamplePeriod();
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public boolean hasIngestDelay() {
            return this.ingestDelay_ != null;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
        public DurationOrBuilder getIngestDelayOrBuilder() {
            return getIngestDelay();
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
            if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.launchStage_);
            }
            if (this.samplePeriod_ != null) {
                codedOutputStream.writeMessage(2, getSamplePeriod());
            }
            if (this.ingestDelay_ != null) {
                codedOutputStream.writeMessage(3, getIngestDelay());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.launchStage_) : 0;
            if (this.samplePeriod_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(2, getSamplePeriod());
            }
            if (this.ingestDelay_ != null) {
                computeEnumSize += CodedOutputStream.computeMessageSize(3, getIngestDelay());
            }
            int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricDescriptorMetadata)) {
                return super.equals(obj);
            }
            MetricDescriptorMetadata metricDescriptorMetadata = (MetricDescriptorMetadata) obj;
            if (this.launchStage_ == metricDescriptorMetadata.launchStage_ && hasSamplePeriod() == metricDescriptorMetadata.hasSamplePeriod()) {
                if ((!hasSamplePeriod() || getSamplePeriod().equals(metricDescriptorMetadata.getSamplePeriod())) && hasIngestDelay() == metricDescriptorMetadata.hasIngestDelay()) {
                    return (!hasIngestDelay() || getIngestDelay().equals(metricDescriptorMetadata.getIngestDelay())) && this.unknownFields.equals(metricDescriptorMetadata.unknownFields);
                }
                return false;
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.launchStage_;
            if (hasSamplePeriod()) {
                hashCode = (((hashCode * 37) + 2) * 53) + getSamplePeriod().hashCode();
            }
            if (hasIngestDelay()) {
                hashCode = (((hashCode * 37) + 3) * 53) + getIngestDelay().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static MetricDescriptorMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MetricDescriptorMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricDescriptorMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricDescriptorMetadata);
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
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricDescriptorMetadataOrBuilder {
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> ingestDelayBuilder_;
            private Duration ingestDelay_;
            private int launchStage_;
            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> samplePeriodBuilder_;
            private Duration samplePeriod_;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptorMetadata.class, Builder.class);
            }

            private Builder() {
                this.launchStage_ = 0;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.launchStage_ = 0;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = MetricDescriptorMetadata.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.launchStage_ = 0;
                if (this.samplePeriodBuilder_ == null) {
                    this.samplePeriod_ = null;
                } else {
                    this.samplePeriod_ = null;
                    this.samplePeriodBuilder_ = null;
                }
                if (this.ingestDelayBuilder_ == null) {
                    this.ingestDelay_ = null;
                } else {
                    this.ingestDelay_ = null;
                    this.ingestDelayBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return MetricProto.internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MetricDescriptorMetadata getDefaultInstanceForType() {
                return MetricDescriptorMetadata.getDefaultInstance();
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MetricDescriptorMetadata build() {
                MetricDescriptorMetadata buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException((Message) buildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MetricDescriptorMetadata buildPartial() {
                MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata(this);
                metricDescriptorMetadata.launchStage_ = this.launchStage_;
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    metricDescriptorMetadata.samplePeriod_ = this.samplePeriod_;
                } else {
                    metricDescriptorMetadata.samplePeriod_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV32 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV32 == null) {
                    metricDescriptorMetadata.ingestDelay_ = this.ingestDelay_;
                } else {
                    metricDescriptorMetadata.ingestDelay_ = singleFieldBuilderV32.build();
                }
                onBuilt();
                return metricDescriptorMetadata;
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
                if (message instanceof MetricDescriptorMetadata) {
                    return mergeFrom((MetricDescriptorMetadata) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MetricDescriptorMetadata metricDescriptorMetadata) {
                if (metricDescriptorMetadata == MetricDescriptorMetadata.getDefaultInstance()) {
                    return this;
                }
                if (metricDescriptorMetadata.launchStage_ != 0) {
                    setLaunchStageValue(metricDescriptorMetadata.getLaunchStageValue());
                }
                if (metricDescriptorMetadata.hasSamplePeriod()) {
                    mergeSamplePeriod(metricDescriptorMetadata.getSamplePeriod());
                }
                if (metricDescriptorMetadata.hasIngestDelay()) {
                    mergeIngestDelay(metricDescriptorMetadata.getIngestDelay());
                }
                mergeUnknownFields(metricDescriptorMetadata.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                MetricDescriptorMetadata metricDescriptorMetadata = null;
                try {
                    try {
                        MetricDescriptorMetadata metricDescriptorMetadata2 = (MetricDescriptorMetadata) MetricDescriptorMetadata.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (metricDescriptorMetadata2 != null) {
                            mergeFrom(metricDescriptorMetadata2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        MetricDescriptorMetadata metricDescriptorMetadata3 = (MetricDescriptorMetadata) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            metricDescriptorMetadata = metricDescriptorMetadata3;
                            if (metricDescriptorMetadata != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (metricDescriptorMetadata != null) {
                        mergeFrom(metricDescriptorMetadata);
                    }
                    throw th;
                }
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public int getLaunchStageValue() {
                return this.launchStage_;
            }

            @Deprecated
            public Builder setLaunchStageValue(int i) {
                this.launchStage_ = i;
                onChanged();
                return this;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            @Deprecated
            public LaunchStage getLaunchStage() {
                LaunchStage valueOf = LaunchStage.valueOf(this.launchStage_);
                return valueOf == null ? LaunchStage.UNRECOGNIZED : valueOf;
            }

            @Deprecated
            public Builder setLaunchStage(LaunchStage launchStage) {
                launchStage.getClass();
                this.launchStage_ = launchStage.getNumber();
                onChanged();
                return this;
            }

            @Deprecated
            public Builder clearLaunchStage() {
                this.launchStage_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasSamplePeriod() {
                return (this.samplePeriodBuilder_ == null && this.samplePeriod_ == null) ? false : true;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public Duration getSamplePeriod() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.samplePeriod_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder setSamplePeriod(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.samplePeriod_ = duration;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                return this;
            }

            public Builder setSamplePeriod(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.samplePeriod_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeSamplePeriod(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration2 = this.samplePeriod_;
                    if (duration2 != null) {
                        this.samplePeriod_ = Duration.newBuilder(duration2).mergeFrom(duration).buildPartial();
                    } else {
                        this.samplePeriod_ = duration;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                return this;
            }

            public Builder clearSamplePeriod() {
                if (this.samplePeriodBuilder_ == null) {
                    this.samplePeriod_ = null;
                    onChanged();
                } else {
                    this.samplePeriod_ = null;
                    this.samplePeriodBuilder_ = null;
                }
                return this;
            }

            public Duration.Builder getSamplePeriodBuilder() {
                onChanged();
                return getSamplePeriodFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public DurationOrBuilder getSamplePeriodOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.samplePeriodBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.samplePeriod_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getSamplePeriodFieldBuilder() {
                if (this.samplePeriodBuilder_ == null) {
                    this.samplePeriodBuilder_ = new SingleFieldBuilderV3<>(getSamplePeriod(), getParentForChildren(), isClean());
                    this.samplePeriod_ = null;
                }
                return this.samplePeriodBuilder_;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public boolean hasIngestDelay() {
                return (this.ingestDelayBuilder_ == null && this.ingestDelay_ == null) ? false : true;
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public Duration getIngestDelay() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration = this.ingestDelay_;
                    return duration == null ? Duration.getDefaultInstance() : duration;
                }
                return singleFieldBuilderV3.getMessage();
            }

            public Builder setIngestDelay(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    duration.getClass();
                    this.ingestDelay_ = duration;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(duration);
                }
                return this;
            }

            public Builder setIngestDelay(Duration.Builder builder) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ingestDelay_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeIngestDelay(Duration duration) {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Duration duration2 = this.ingestDelay_;
                    if (duration2 != null) {
                        this.ingestDelay_ = Duration.newBuilder(duration2).mergeFrom(duration).buildPartial();
                    } else {
                        this.ingestDelay_ = duration;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(duration);
                }
                return this;
            }

            public Builder clearIngestDelay() {
                if (this.ingestDelayBuilder_ == null) {
                    this.ingestDelay_ = null;
                    onChanged();
                } else {
                    this.ingestDelay_ = null;
                    this.ingestDelayBuilder_ = null;
                }
                return this;
            }

            public Duration.Builder getIngestDelayBuilder() {
                onChanged();
                return getIngestDelayFieldBuilder().getBuilder();
            }

            @Override // com.google.api.MetricDescriptor.MetricDescriptorMetadataOrBuilder
            public DurationOrBuilder getIngestDelayOrBuilder() {
                SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> singleFieldBuilderV3 = this.ingestDelayBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Duration duration = this.ingestDelay_;
                return duration == null ? Duration.getDefaultInstance() : duration;
            }

            private SingleFieldBuilderV3<Duration, Duration.Builder, DurationOrBuilder> getIngestDelayFieldBuilder() {
                if (this.ingestDelayBuilder_ == null) {
                    this.ingestDelayBuilder_ = new SingleFieldBuilderV3<>(getIngestDelay(), getParentForChildren(), isClean());
                    this.ingestDelay_ = null;
                }
                return this.ingestDelayBuilder_;
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

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricDescriptorMetadata> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MetricDescriptorMetadata> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MetricDescriptorMetadata getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LabelDescriptor getLabels(int i) {
        return this.labels_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
        return this.labels_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getMetricKindValue() {
        return this.metricKind_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricKind getMetricKind() {
        MetricKind valueOf = MetricKind.valueOf(this.metricKind_);
        return valueOf == null ? MetricKind.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getValueTypeValue() {
        return this.valueType_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ValueType getValueType() {
        ValueType valueOf = ValueType.valueOf(this.valueType_);
        return valueOf == null ? ValueType.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getUnit() {
        Object obj = this.unit_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.unit_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getUnitBytes() {
        Object obj = this.unit_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.unit_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDescription() {
        Object obj = this.description_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.description_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getDescriptionBytes() {
        Object obj = this.description_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getDisplayName() {
        Object obj = this.displayName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.displayName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getDisplayNameBytes() {
        Object obj = this.displayName_;
        if (obj instanceof String) {
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.displayName_ = copyFromUtf8;
            return copyFromUtf8;
        }
        return (ByteString) obj;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public MetricDescriptorMetadataOrBuilder getMetadataOrBuilder() {
        return getMetadata();
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public LaunchStage getLaunchStage() {
        LaunchStage valueOf = LaunchStage.valueOf(this.launchStage_);
        return valueOf == null ? LaunchStage.UNRECOGNIZED : valueOf;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ProtocolStringList getMonitoredResourceTypesList() {
        return this.monitoredResourceTypes_;
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public int getMonitoredResourceTypesCount() {
        return this.monitoredResourceTypes_.size();
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public String getMonitoredResourceTypes(int i) {
        return (String) this.monitoredResourceTypes_.get(i);
    }

    @Override // com.google.api.MetricDescriptorOrBuilder
    public ByteString getMonitoredResourceTypesBytes(int i) {
        return this.monitoredResourceTypes_.getByteString(i);
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
        for (int i = 0; i < this.labels_.size(); i++) {
            codedOutputStream.writeMessage(2, this.labels_.get(i));
        }
        if (this.metricKind_ != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(3, this.metricKind_);
        }
        if (this.valueType_ != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.valueType_);
        }
        if (!getUnitBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.unit_);
        }
        if (!getDescriptionBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.description_);
        }
        if (!getDisplayNameBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.displayName_);
        }
        if (!getTypeBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.type_);
        }
        if (this.metadata_ != null) {
            codedOutputStream.writeMessage(10, getMetadata());
        }
        if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(12, this.launchStage_);
        }
        for (int i2 = 0; i2 < this.monitoredResourceTypes_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.monitoredResourceTypes_.getRaw(i2));
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
        for (int i2 = 0; i2 < this.labels_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(2, this.labels_.get(i2));
        }
        if (this.metricKind_ != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(3, this.metricKind_);
        }
        if (this.valueType_ != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(4, this.valueType_);
        }
        if (!getUnitBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(5, this.unit_);
        }
        if (!getDescriptionBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(6, this.description_);
        }
        if (!getDisplayNameBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(7, this.displayName_);
        }
        if (!getTypeBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(8, this.type_);
        }
        if (this.metadata_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(10, getMetadata());
        }
        if (this.launchStage_ != LaunchStage.LAUNCH_STAGE_UNSPECIFIED.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(12, this.launchStage_);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.monitoredResourceTypes_.size(); i4++) {
            i3 += computeStringSizeNoTag(this.monitoredResourceTypes_.getRaw(i4));
        }
        int size = computeStringSize + i3 + (getMonitoredResourceTypesList().size() * 1) + this.unknownFields.getSerializedSize();
        this.memoizedSize = size;
        return size;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricDescriptor)) {
            return super.equals(obj);
        }
        MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
        if (getName().equals(metricDescriptor.getName()) && getType().equals(metricDescriptor.getType()) && getLabelsList().equals(metricDescriptor.getLabelsList()) && this.metricKind_ == metricDescriptor.metricKind_ && this.valueType_ == metricDescriptor.valueType_ && getUnit().equals(metricDescriptor.getUnit()) && getDescription().equals(metricDescriptor.getDescription()) && getDisplayName().equals(metricDescriptor.getDisplayName()) && hasMetadata() == metricDescriptor.hasMetadata()) {
            return (!hasMetadata() || getMetadata().equals(metricDescriptor.getMetadata())) && this.launchStage_ == metricDescriptor.launchStage_ && getMonitoredResourceTypesList().equals(metricDescriptor.getMonitoredResourceTypesList()) && this.unknownFields.equals(metricDescriptor.unknownFields);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 8) * 53) + getType().hashCode();
        if (getLabelsCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getLabelsList().hashCode();
        }
        int hashCode2 = (((((((((((((((((((hashCode * 37) + 3) * 53) + this.metricKind_) * 37) + 4) * 53) + this.valueType_) * 37) + 5) * 53) + getUnit().hashCode()) * 37) + 6) * 53) + getDescription().hashCode()) * 37) + 7) * 53) + getDisplayName().hashCode();
        if (hasMetadata()) {
            hashCode2 = (((hashCode2 * 37) + 10) * 53) + getMetadata().hashCode();
        }
        int i = (((hashCode2 * 37) + 12) * 53) + this.launchStage_;
        if (getMonitoredResourceTypesCount() > 0) {
            i = (((i * 37) + 13) * 53) + getMonitoredResourceTypesList().hashCode();
        }
        int hashCode3 = (i * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode3;
        return hashCode3;
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static MetricDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MetricDescriptor metricDescriptor) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricDescriptor);
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
    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricDescriptorOrBuilder {
        private int bitField0_;
        private Object description_;
        private Object displayName_;
        private RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> labelsBuilder_;
        private List<LabelDescriptor> labels_;
        private int launchStage_;
        private SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> metadataBuilder_;
        private MetricDescriptorMetadata metadata_;
        private int metricKind_;
        private LazyStringList monitoredResourceTypes_;
        private Object name_;
        private Object type_;
        private Object unit_;
        private int valueType_;

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return MetricProto.internal_static_google_api_MetricDescriptor_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return MetricProto.internal_static_google_api_MetricDescriptor_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricDescriptor.class, Builder.class);
        }

        private Builder() {
            this.name_ = "";
            this.type_ = "";
            this.labels_ = Collections.emptyList();
            this.metricKind_ = 0;
            this.valueType_ = 0;
            this.unit_ = "";
            this.description_ = "";
            this.displayName_ = "";
            this.launchStage_ = 0;
            this.monitoredResourceTypes_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            this.type_ = "";
            this.labels_ = Collections.emptyList();
            this.metricKind_ = 0;
            this.valueType_ = 0;
            this.unit_ = "";
            this.description_ = "";
            this.displayName_ = "";
            this.launchStage_ = 0;
            this.monitoredResourceTypes_ = LazyStringArrayList.EMPTY;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (MetricDescriptor.alwaysUseFieldBuilders) {
                getLabelsFieldBuilder();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.name_ = "";
            this.type_ = "";
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.labels_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.metricKind_ = 0;
            this.valueType_ = 0;
            this.unit_ = "";
            this.description_ = "";
            this.displayName_ = "";
            if (this.metadataBuilder_ == null) {
                this.metadata_ = null;
            } else {
                this.metadata_ = null;
                this.metadataBuilder_ = null;
            }
            this.launchStage_ = 0;
            this.monitoredResourceTypes_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return MetricProto.internal_static_google_api_MetricDescriptor_descriptor;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MetricDescriptor getDefaultInstanceForType() {
            return MetricDescriptor.getDefaultInstance();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MetricDescriptor build() {
            MetricDescriptor buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException((Message) buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MetricDescriptor buildPartial() {
            MetricDescriptor metricDescriptor = new MetricDescriptor(this);
            metricDescriptor.name_ = this.name_;
            metricDescriptor.type_ = this.type_;
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                metricDescriptor.labels_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.labels_ = Collections.unmodifiableList(this.labels_);
                    this.bitField0_ &= -2;
                }
                metricDescriptor.labels_ = this.labels_;
            }
            metricDescriptor.metricKind_ = this.metricKind_;
            metricDescriptor.valueType_ = this.valueType_;
            metricDescriptor.unit_ = this.unit_;
            metricDescriptor.description_ = this.description_;
            metricDescriptor.displayName_ = this.displayName_;
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                metricDescriptor.metadata_ = this.metadata_;
            } else {
                metricDescriptor.metadata_ = singleFieldBuilderV3.build();
            }
            metricDescriptor.launchStage_ = this.launchStage_;
            if ((this.bitField0_ & 2) != 0) {
                this.monitoredResourceTypes_ = this.monitoredResourceTypes_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            metricDescriptor.monitoredResourceTypes_ = this.monitoredResourceTypes_;
            onBuilt();
            return metricDescriptor;
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
            if (message instanceof MetricDescriptor) {
                return mergeFrom((MetricDescriptor) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MetricDescriptor metricDescriptor) {
            if (metricDescriptor == MetricDescriptor.getDefaultInstance()) {
                return this;
            }
            if (!metricDescriptor.getName().isEmpty()) {
                this.name_ = metricDescriptor.name_;
                onChanged();
            }
            if (!metricDescriptor.getType().isEmpty()) {
                this.type_ = metricDescriptor.type_;
                onChanged();
            }
            if (this.labelsBuilder_ == null) {
                if (!metricDescriptor.labels_.isEmpty()) {
                    if (this.labels_.isEmpty()) {
                        this.labels_ = metricDescriptor.labels_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureLabelsIsMutable();
                        this.labels_.addAll(metricDescriptor.labels_);
                    }
                    onChanged();
                }
            } else if (!metricDescriptor.labels_.isEmpty()) {
                if (!this.labelsBuilder_.isEmpty()) {
                    this.labelsBuilder_.addAllMessages(metricDescriptor.labels_);
                } else {
                    this.labelsBuilder_.dispose();
                    this.labelsBuilder_ = null;
                    this.labels_ = metricDescriptor.labels_;
                    this.bitField0_ &= -2;
                    this.labelsBuilder_ = MetricDescriptor.alwaysUseFieldBuilders ? getLabelsFieldBuilder() : null;
                }
            }
            if (metricDescriptor.metricKind_ != 0) {
                setMetricKindValue(metricDescriptor.getMetricKindValue());
            }
            if (metricDescriptor.valueType_ != 0) {
                setValueTypeValue(metricDescriptor.getValueTypeValue());
            }
            if (!metricDescriptor.getUnit().isEmpty()) {
                this.unit_ = metricDescriptor.unit_;
                onChanged();
            }
            if (!metricDescriptor.getDescription().isEmpty()) {
                this.description_ = metricDescriptor.description_;
                onChanged();
            }
            if (!metricDescriptor.getDisplayName().isEmpty()) {
                this.displayName_ = metricDescriptor.displayName_;
                onChanged();
            }
            if (metricDescriptor.hasMetadata()) {
                mergeMetadata(metricDescriptor.getMetadata());
            }
            if (metricDescriptor.launchStage_ != 0) {
                setLaunchStageValue(metricDescriptor.getLaunchStageValue());
            }
            if (!metricDescriptor.monitoredResourceTypes_.isEmpty()) {
                if (this.monitoredResourceTypes_.isEmpty()) {
                    this.monitoredResourceTypes_ = metricDescriptor.monitoredResourceTypes_;
                    this.bitField0_ &= -3;
                } else {
                    ensureMonitoredResourceTypesIsMutable();
                    this.monitoredResourceTypes_.addAll(metricDescriptor.monitoredResourceTypes_);
                }
                onChanged();
            }
            mergeUnknownFields(metricDescriptor.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            MetricDescriptor metricDescriptor = null;
            try {
                try {
                    MetricDescriptor metricDescriptor2 = (MetricDescriptor) MetricDescriptor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (metricDescriptor2 != null) {
                        mergeFrom(metricDescriptor2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    MetricDescriptor metricDescriptor3 = (MetricDescriptor) e.getUnfinishedMessage();
                    try {
                        throw e.unwrapIOException();
                    } catch (Throwable th) {
                        th = th;
                        metricDescriptor = metricDescriptor3;
                        if (metricDescriptor != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (metricDescriptor != null) {
                    mergeFrom(metricDescriptor);
                }
                throw th;
            }
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
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
            this.name_ = MetricDescriptor.getDefaultInstance().getName();
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setType(String str) {
            str.getClass();
            this.type_ = str;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = MetricDescriptor.getDefaultInstance().getType();
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.type_ = byteString;
            onChanged();
            return this;
        }

        private void ensureLabelsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.labels_ = new ArrayList(this.labels_);
                this.bitField0_ |= 1;
            }
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public List<LabelDescriptor> getLabelsList() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.labels_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLabelsCount() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.labels_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LabelDescriptor getLabels(int i) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.labels_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setLabels(int i, LabelDescriptor labelDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                labelDescriptor.getClass();
                ensureLabelsIsMutable();
                this.labels_.set(i, labelDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, labelDescriptor);
            }
            return this;
        }

        public Builder setLabels(int i, LabelDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                labelDescriptor.getClass();
                ensureLabelsIsMutable();
                this.labels_.add(labelDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(labelDescriptor);
            }
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor labelDescriptor) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                labelDescriptor.getClass();
                ensureLabelsIsMutable();
                this.labels_.add(i, labelDescriptor);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, labelDescriptor);
            }
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addLabels(int i, LabelDescriptor.Builder builder) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.labels_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearLabels() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.labels_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeLabels(int i) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureLabelsIsMutable();
                this.labels_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public LabelDescriptor.Builder getLabelsBuilder(int i) {
            return getLabelsFieldBuilder().getBuilder(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LabelDescriptorOrBuilder getLabelsOrBuilder(int i) {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.labels_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
            RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> repeatedFieldBuilderV3 = this.labelsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.labels_);
        }

        public LabelDescriptor.Builder addLabelsBuilder() {
            return getLabelsFieldBuilder().addBuilder(LabelDescriptor.getDefaultInstance());
        }

        public LabelDescriptor.Builder addLabelsBuilder(int i) {
            return getLabelsFieldBuilder().addBuilder(i, LabelDescriptor.getDefaultInstance());
        }

        public List<LabelDescriptor.Builder> getLabelsBuilderList() {
            return getLabelsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<LabelDescriptor, LabelDescriptor.Builder, LabelDescriptorOrBuilder> getLabelsFieldBuilder() {
            if (this.labelsBuilder_ == null) {
                this.labelsBuilder_ = new RepeatedFieldBuilderV3<>(this.labels_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.labels_ = null;
            }
            return this.labelsBuilder_;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getMetricKindValue() {
            return this.metricKind_;
        }

        public Builder setMetricKindValue(int i) {
            this.metricKind_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricKind getMetricKind() {
            MetricKind valueOf = MetricKind.valueOf(this.metricKind_);
            return valueOf == null ? MetricKind.UNRECOGNIZED : valueOf;
        }

        public Builder setMetricKind(MetricKind metricKind) {
            metricKind.getClass();
            this.metricKind_ = metricKind.getNumber();
            onChanged();
            return this;
        }

        public Builder clearMetricKind() {
            this.metricKind_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getValueTypeValue() {
            return this.valueType_;
        }

        public Builder setValueTypeValue(int i) {
            this.valueType_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ValueType getValueType() {
            ValueType valueOf = ValueType.valueOf(this.valueType_);
            return valueOf == null ? ValueType.UNRECOGNIZED : valueOf;
        }

        public Builder setValueType(ValueType valueType) {
            valueType.getClass();
            this.valueType_ = valueType.getNumber();
            onChanged();
            return this;
        }

        public Builder clearValueType() {
            this.valueType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getUnit() {
            Object obj = this.unit_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.unit_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getUnitBytes() {
            Object obj = this.unit_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.unit_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setUnit(String str) {
            str.getClass();
            this.unit_ = str;
            onChanged();
            return this;
        }

        public Builder clearUnit() {
            this.unit_ = MetricDescriptor.getDefaultInstance().getUnit();
            onChanged();
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.unit_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDescription(String str) {
            str.getClass();
            this.description_ = str;
            onChanged();
            return this;
        }

        public Builder clearDescription() {
            this.description_ = MetricDescriptor.getDefaultInstance().getDescription();
            onChanged();
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.description_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getDisplayName() {
            Object obj = this.displayName_;
            if (!(obj instanceof String)) {
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.displayName_ = stringUtf8;
                return stringUtf8;
            }
            return (String) obj;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getDisplayNameBytes() {
            Object obj = this.displayName_;
            if (obj instanceof String) {
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.displayName_ = copyFromUtf8;
                return copyFromUtf8;
            }
            return (ByteString) obj;
        }

        public Builder setDisplayName(String str) {
            str.getClass();
            this.displayName_ = str;
            onChanged();
            return this;
        }

        public Builder clearDisplayName() {
            this.displayName_ = MetricDescriptor.getDefaultInstance().getDisplayName();
            onChanged();
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            this.displayName_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public boolean hasMetadata() {
            return (this.metadataBuilder_ == null && this.metadata_ == null) ? false : true;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricDescriptorMetadata getMetadata() {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
                return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
            }
            return singleFieldBuilderV3.getMessage();
        }

        public Builder setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                metricDescriptorMetadata.getClass();
                this.metadata_ = metricDescriptorMetadata;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(metricDescriptorMetadata);
            }
            return this;
        }

        public Builder setMetadata(MetricDescriptorMetadata.Builder builder) {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.metadata_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 == null) {
                MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
                if (metricDescriptorMetadata2 != null) {
                    this.metadata_ = MetricDescriptorMetadata.newBuilder(metricDescriptorMetadata2).mergeFrom(metricDescriptorMetadata).buildPartial();
                } else {
                    this.metadata_ = metricDescriptorMetadata;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(metricDescriptorMetadata);
            }
            return this;
        }

        public Builder clearMetadata() {
            if (this.metadataBuilder_ == null) {
                this.metadata_ = null;
                onChanged();
            } else {
                this.metadata_ = null;
                this.metadataBuilder_ = null;
            }
            return this;
        }

        public MetricDescriptorMetadata.Builder getMetadataBuilder() {
            onChanged();
            return getMetadataFieldBuilder().getBuilder();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public MetricDescriptorMetadataOrBuilder getMetadataOrBuilder() {
            SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> singleFieldBuilderV3 = this.metadataBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
            return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
        }

        private SingleFieldBuilderV3<MetricDescriptorMetadata, MetricDescriptorMetadata.Builder, MetricDescriptorMetadataOrBuilder> getMetadataFieldBuilder() {
            if (this.metadataBuilder_ == null) {
                this.metadataBuilder_ = new SingleFieldBuilderV3<>(getMetadata(), getParentForChildren(), isClean());
                this.metadata_ = null;
            }
            return this.metadataBuilder_;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        public Builder setLaunchStageValue(int i) {
            this.launchStage_ = i;
            onChanged();
            return this;
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public LaunchStage getLaunchStage() {
            LaunchStage valueOf = LaunchStage.valueOf(this.launchStage_);
            return valueOf == null ? LaunchStage.UNRECOGNIZED : valueOf;
        }

        public Builder setLaunchStage(LaunchStage launchStage) {
            launchStage.getClass();
            this.launchStage_ = launchStage.getNumber();
            onChanged();
            return this;
        }

        public Builder clearLaunchStage() {
            this.launchStage_ = 0;
            onChanged();
            return this;
        }

        private void ensureMonitoredResourceTypesIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.monitoredResourceTypes_ = new LazyStringArrayList(this.monitoredResourceTypes_);
                this.bitField0_ |= 2;
            }
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ProtocolStringList getMonitoredResourceTypesList() {
            return this.monitoredResourceTypes_.getUnmodifiableView();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public int getMonitoredResourceTypesCount() {
            return this.monitoredResourceTypes_.size();
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public String getMonitoredResourceTypes(int i) {
            return (String) this.monitoredResourceTypes_.get(i);
        }

        @Override // com.google.api.MetricDescriptorOrBuilder
        public ByteString getMonitoredResourceTypesBytes(int i) {
            return this.monitoredResourceTypes_.getByteString(i);
        }

        public Builder setMonitoredResourceTypes(int i, String str) {
            str.getClass();
            ensureMonitoredResourceTypesIsMutable();
            this.monitoredResourceTypes_.set(i, str);
            onChanged();
            return this;
        }

        public Builder addMonitoredResourceTypes(String str) {
            str.getClass();
            ensureMonitoredResourceTypesIsMutable();
            this.monitoredResourceTypes_.add(str);
            onChanged();
            return this;
        }

        public Builder addAllMonitoredResourceTypes(Iterable<String> iterable) {
            ensureMonitoredResourceTypesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.monitoredResourceTypes_);
            onChanged();
            return this;
        }

        public Builder clearMonitoredResourceTypes() {
            this.monitoredResourceTypes_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addMonitoredResourceTypesBytes(ByteString byteString) {
            byteString.getClass();
            MetricDescriptor.checkByteStringIsUtf8(byteString);
            ensureMonitoredResourceTypesIsMutable();
            this.monitoredResourceTypes_.add(byteString);
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

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<MetricDescriptor> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<MetricDescriptor> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public MetricDescriptor getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
