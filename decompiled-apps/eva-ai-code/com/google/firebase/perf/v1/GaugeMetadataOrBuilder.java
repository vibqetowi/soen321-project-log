package com.google.firebase.perf.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface GaugeMetadataOrBuilder extends MessageLiteOrBuilder {
    int getCpuClockRateKhz();

    int getCpuProcessorCount();

    int getDeviceRamSizeKb();

    int getMaxAppJavaHeapMemoryKb();

    int getMaxEncouragedAppJavaHeapMemoryKb();

    @Deprecated
    String getProcessName();

    @Deprecated
    ByteString getProcessNameBytes();

    boolean hasCpuClockRateKhz();

    boolean hasCpuProcessorCount();

    boolean hasDeviceRamSizeKb();

    boolean hasMaxAppJavaHeapMemoryKb();

    boolean hasMaxEncouragedAppJavaHeapMemoryKb();

    @Deprecated
    boolean hasProcessName();
}
