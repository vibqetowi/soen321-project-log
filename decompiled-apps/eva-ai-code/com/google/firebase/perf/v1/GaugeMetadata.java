package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes7.dex */
public final class GaugeMetadata extends GeneratedMessageLite<GaugeMetadata, Builder> implements GaugeMetadataOrBuilder {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final GaugeMetadata DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Parser<GaugeMetadata> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    private GaugeMetadata() {
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    @Deprecated
    public boolean hasProcessName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    @Deprecated
    public String getProcessName() {
        return this.processName_;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    @Deprecated
    public ByteString getProcessNameBytes() {
        return ByteString.copyFromUtf8(this.processName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.processName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcessName() {
        this.bitField0_ &= -2;
        this.processName_ = getDefaultInstance().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcessNameBytes(ByteString byteString) {
        this.processName_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasCpuClockRateKhz() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getCpuClockRateKhz() {
        return this.cpuClockRateKhz_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuClockRateKhz(int i) {
        this.bitField0_ |= 2;
        this.cpuClockRateKhz_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuClockRateKhz() {
        this.bitField0_ &= -3;
        this.cpuClockRateKhz_ = 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasCpuProcessorCount() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getCpuProcessorCount() {
        return this.cpuProcessorCount_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuProcessorCount(int i) {
        this.bitField0_ |= 4;
        this.cpuProcessorCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuProcessorCount() {
        this.bitField0_ &= -5;
        this.cpuProcessorCount_ = 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasDeviceRamSizeKb() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getDeviceRamSizeKb() {
        return this.deviceRamSizeKb_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceRamSizeKb(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceRamSizeKb() {
        this.bitField0_ &= -9;
        this.deviceRamSizeKb_ = 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasMaxAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getMaxAppJavaHeapMemoryKb() {
        return this.maxAppJavaHeapMemoryKb_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxAppJavaHeapMemoryKb(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxAppJavaHeapMemoryKb() {
        this.bitField0_ &= -17;
        this.maxAppJavaHeapMemoryKb_ = 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
    public int getMaxEncouragedAppJavaHeapMemoryKb() {
        return this.maxEncouragedAppJavaHeapMemoryKb_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxEncouragedAppJavaHeapMemoryKb(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxEncouragedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -33;
        this.maxEncouragedAppJavaHeapMemoryKb_ = 0;
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static GaugeMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GaugeMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GaugeMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GaugeMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream) throws IOException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GaugeMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GaugeMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GaugeMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GaugeMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(GaugeMetadata gaugeMetadata) {
        return DEFAULT_INSTANCE.createBuilder(gaugeMetadata);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<GaugeMetadata, Builder> implements GaugeMetadataOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(GaugeMetadata.DEFAULT_INSTANCE);
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        @Deprecated
        public boolean hasProcessName() {
            return ((GaugeMetadata) this.instance).hasProcessName();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        @Deprecated
        public String getProcessName() {
            return ((GaugeMetadata) this.instance).getProcessName();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        @Deprecated
        public ByteString getProcessNameBytes() {
            return ((GaugeMetadata) this.instance).getProcessNameBytes();
        }

        @Deprecated
        public Builder setProcessName(String str) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setProcessName(str);
            return this;
        }

        @Deprecated
        public Builder clearProcessName() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearProcessName();
            return this;
        }

        @Deprecated
        public Builder setProcessNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setProcessNameBytes(byteString);
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasCpuClockRateKhz() {
            return ((GaugeMetadata) this.instance).hasCpuClockRateKhz();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getCpuClockRateKhz() {
            return ((GaugeMetadata) this.instance).getCpuClockRateKhz();
        }

        public Builder setCpuClockRateKhz(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setCpuClockRateKhz(i);
            return this;
        }

        public Builder clearCpuClockRateKhz() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearCpuClockRateKhz();
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasCpuProcessorCount() {
            return ((GaugeMetadata) this.instance).hasCpuProcessorCount();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getCpuProcessorCount() {
            return ((GaugeMetadata) this.instance).getCpuProcessorCount();
        }

        public Builder setCpuProcessorCount(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setCpuProcessorCount(i);
            return this;
        }

        public Builder clearCpuProcessorCount() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearCpuProcessorCount();
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasDeviceRamSizeKb() {
            return ((GaugeMetadata) this.instance).hasDeviceRamSizeKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getDeviceRamSizeKb() {
            return ((GaugeMetadata) this.instance).getDeviceRamSizeKb();
        }

        public Builder setDeviceRamSizeKb(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setDeviceRamSizeKb(i);
            return this;
        }

        public Builder clearDeviceRamSizeKb() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearDeviceRamSizeKb();
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasMaxAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).hasMaxAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getMaxAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).getMaxAppJavaHeapMemoryKb();
        }

        public Builder setMaxAppJavaHeapMemoryKb(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setMaxAppJavaHeapMemoryKb(i);
            return this;
        }

        public Builder clearMaxAppJavaHeapMemoryKb() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearMaxAppJavaHeapMemoryKb();
            return this;
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public boolean hasMaxEncouragedAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).hasMaxEncouragedAppJavaHeapMemoryKb();
        }

        @Override // com.google.firebase.perf.v1.GaugeMetadataOrBuilder
        public int getMaxEncouragedAppJavaHeapMemoryKb() {
            return ((GaugeMetadata) this.instance).getMaxEncouragedAppJavaHeapMemoryKb();
        }

        public Builder setMaxEncouragedAppJavaHeapMemoryKb(int i) {
            copyOnWrite();
            ((GaugeMetadata) this.instance).setMaxEncouragedAppJavaHeapMemoryKb(i);
            return this;
        }

        public Builder clearMaxEncouragedAppJavaHeapMemoryKb() {
            copyOnWrite();
            ((GaugeMetadata) this.instance).clearMaxEncouragedAppJavaHeapMemoryKb();
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.GaugeMetadata$1  reason: invalid class name */
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

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new GaugeMetadata();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GaugeMetadata> parser = PARSER;
                if (parser == null) {
                    synchronized (GaugeMetadata.class) {
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
        GaugeMetadata gaugeMetadata = new GaugeMetadata();
        DEFAULT_INSTANCE = gaugeMetadata;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetadata.class, gaugeMetadata);
    }

    public static GaugeMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<GaugeMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
