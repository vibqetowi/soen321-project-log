package com.google.api.gax.tracing;

import com.google.api.core.InternalApi;
import com.google.api.core.InternalExtensionOnly;
@InternalExtensionOnly
@InternalApi("For internal use by google-cloud-java clients only")
/* loaded from: classes7.dex */
public interface ApiTracerFactory {

    /* loaded from: classes7.dex */
    public enum OperationType {
        Unary,
        Batching,
        LongRunning,
        ServerStreaming,
        ClientStreaming,
        BidiStreaming
    }

    ApiTracer newTracer(ApiTracer apiTracer, SpanName spanName, OperationType operationType);
}
