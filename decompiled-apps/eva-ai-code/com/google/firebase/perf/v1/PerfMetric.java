package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TransportInfo;
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
public final class PerfMetric extends GeneratedMessageLite<PerfMetric, Builder> implements PerfMetricOrBuilder {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile Parser<PerfMetric> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    private PerfMetric() {
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        return applicationInfo == null ? ApplicationInfo.getDefaultInstance() : applicationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        this.applicationInfo_ = applicationInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        ApplicationInfo applicationInfo2 = this.applicationInfo_;
        if (applicationInfo2 != null && applicationInfo2 != ApplicationInfo.getDefaultInstance()) {
            this.applicationInfo_ = ApplicationInfo.newBuilder(this.applicationInfo_).mergeFrom((ApplicationInfo.Builder) applicationInfo).buildPartial();
        } else {
            this.applicationInfo_ = applicationInfo;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public TraceMetric getTraceMetric() {
        TraceMetric traceMetric = this.traceMetric_;
        return traceMetric == null ? TraceMetric.getDefaultInstance() : traceMetric;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        this.traceMetric_ = traceMetric;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        TraceMetric traceMetric2 = this.traceMetric_;
        if (traceMetric2 != null && traceMetric2 != TraceMetric.getDefaultInstance()) {
            this.traceMetric_ = TraceMetric.newBuilder(this.traceMetric_).mergeFrom((TraceMetric.Builder) traceMetric).buildPartial();
        } else {
            this.traceMetric_ = traceMetric;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public NetworkRequestMetric getNetworkRequestMetric() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.getDefaultInstance() : networkRequestMetric;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        this.networkRequestMetric_ = networkRequestMetric;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        NetworkRequestMetric networkRequestMetric2 = this.networkRequestMetric_;
        if (networkRequestMetric2 != null && networkRequestMetric2 != NetworkRequestMetric.getDefaultInstance()) {
            this.networkRequestMetric_ = NetworkRequestMetric.newBuilder(this.networkRequestMetric_).mergeFrom((NetworkRequestMetric.Builder) networkRequestMetric).buildPartial();
        } else {
            this.networkRequestMetric_ = networkRequestMetric;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public GaugeMetric getGaugeMetric() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        return gaugeMetric == null ? GaugeMetric.getDefaultInstance() : gaugeMetric;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        this.gaugeMetric_ = gaugeMetric;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        GaugeMetric gaugeMetric2 = this.gaugeMetric_;
        if (gaugeMetric2 != null && gaugeMetric2 != GaugeMetric.getDefaultInstance()) {
            this.gaugeMetric_ = GaugeMetric.newBuilder(this.gaugeMetric_).mergeFrom((GaugeMetric.Builder) gaugeMetric).buildPartial();
        } else {
            this.gaugeMetric_ = gaugeMetric;
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
    public TransportInfo getTransportInfo() {
        TransportInfo transportInfo = this.transportInfo_;
        return transportInfo == null ? TransportInfo.getDefaultInstance() : transportInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        this.transportInfo_ = transportInfo;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        TransportInfo transportInfo2 = this.transportInfo_;
        if (transportInfo2 != null && transportInfo2 != TransportInfo.getDefaultInstance()) {
            this.transportInfo_ = TransportInfo.newBuilder(this.transportInfo_).mergeFrom((TransportInfo.Builder) transportInfo).buildPartial();
        } else {
            this.transportInfo_ = transportInfo;
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PerfMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PerfMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PerfMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PerfMetric parseFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PerfMetric) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PerfMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PerfMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PerfMetric perfMetric) {
        return DEFAULT_INSTANCE.createBuilder(perfMetric);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<PerfMetric, Builder> implements PerfMetricOrBuilder {
        /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        private Builder() {
            super(PerfMetric.DEFAULT_INSTANCE);
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasApplicationInfo() {
            return ((PerfMetric) this.instance).hasApplicationInfo();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public ApplicationInfo getApplicationInfo() {
            return ((PerfMetric) this.instance).getApplicationInfo();
        }

        public Builder setApplicationInfo(ApplicationInfo applicationInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).setApplicationInfo(applicationInfo);
            return this;
        }

        public Builder setApplicationInfo(ApplicationInfo.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setApplicationInfo(builder.build());
            return this;
        }

        public Builder mergeApplicationInfo(ApplicationInfo applicationInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeApplicationInfo(applicationInfo);
            return this;
        }

        public Builder clearApplicationInfo() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearApplicationInfo();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasTraceMetric() {
            return ((PerfMetric) this.instance).hasTraceMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public TraceMetric getTraceMetric() {
            return ((PerfMetric) this.instance).getTraceMetric();
        }

        public Builder setTraceMetric(TraceMetric traceMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTraceMetric(traceMetric);
            return this;
        }

        public Builder setTraceMetric(TraceMetric.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTraceMetric(builder.build());
            return this;
        }

        public Builder mergeTraceMetric(TraceMetric traceMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeTraceMetric(traceMetric);
            return this;
        }

        public Builder clearTraceMetric() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearTraceMetric();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasNetworkRequestMetric() {
            return ((PerfMetric) this.instance).hasNetworkRequestMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public NetworkRequestMetric getNetworkRequestMetric() {
            return ((PerfMetric) this.instance).getNetworkRequestMetric();
        }

        public Builder setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        public Builder setNetworkRequestMetric(NetworkRequestMetric.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setNetworkRequestMetric(builder.build());
            return this;
        }

        public Builder mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        public Builder clearNetworkRequestMetric() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearNetworkRequestMetric();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasGaugeMetric() {
            return ((PerfMetric) this.instance).hasGaugeMetric();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public GaugeMetric getGaugeMetric() {
            return ((PerfMetric) this.instance).getGaugeMetric();
        }

        public Builder setGaugeMetric(GaugeMetric gaugeMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setGaugeMetric(gaugeMetric);
            return this;
        }

        public Builder setGaugeMetric(GaugeMetric.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setGaugeMetric(builder.build());
            return this;
        }

        public Builder mergeGaugeMetric(GaugeMetric gaugeMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeGaugeMetric(gaugeMetric);
            return this;
        }

        public Builder clearGaugeMetric() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearGaugeMetric();
            return this;
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public boolean hasTransportInfo() {
            return ((PerfMetric) this.instance).hasTransportInfo();
        }

        @Override // com.google.firebase.perf.v1.PerfMetricOrBuilder
        public TransportInfo getTransportInfo() {
            return ((PerfMetric) this.instance).getTransportInfo();
        }

        public Builder setTransportInfo(TransportInfo transportInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTransportInfo(transportInfo);
            return this;
        }

        public Builder setTransportInfo(TransportInfo.Builder builder) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTransportInfo(builder.build());
            return this;
        }

        public Builder mergeTransportInfo(TransportInfo transportInfo) {
            copyOnWrite();
            ((PerfMetric) this.instance).mergeTransportInfo(transportInfo);
            return this;
        }

        public Builder clearTransportInfo() {
            copyOnWrite();
            ((PerfMetric) this.instance).clearTransportInfo();
            return this;
        }
    }

    /* renamed from: com.google.firebase.perf.v1.PerfMetric$1  reason: invalid class name */
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
                return new PerfMetric();
            case 2:
                return new Builder(null);
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PerfMetric> parser = PARSER;
                if (parser == null) {
                    synchronized (PerfMetric.class) {
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
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        GeneratedMessageLite.registerDefaultInstance(PerfMetric.class, perfMetric);
    }

    public static PerfMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PerfMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
