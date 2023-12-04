package com.google.firebase.perf.v1;

import com.google.protobuf.MessageLiteOrBuilder;
/* loaded from: classes7.dex */
public interface AndroidMemoryReadingOrBuilder extends MessageLiteOrBuilder {
    long getClientTimeUs();

    int getUsedAppJavaHeapMemoryKb();

    boolean hasClientTimeUs();

    boolean hasUsedAppJavaHeapMemoryKb();
}
