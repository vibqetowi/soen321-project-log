package io.opencensus.trace.config;
/* loaded from: classes4.dex */
public abstract class TraceConfig {
    private static final NoopTraceConfig NOOP_TRACE_CONFIG = new NoopTraceConfig();

    public abstract TraceParams getActiveTraceParams();

    public abstract void updateActiveTraceParams(TraceParams traceParams);

    public static TraceConfig getNoopTraceConfig() {
        return NOOP_TRACE_CONFIG;
    }

    /* loaded from: classes4.dex */
    private static final class NoopTraceConfig extends TraceConfig {
        @Override // io.opencensus.trace.config.TraceConfig
        public void updateActiveTraceParams(TraceParams traceParams) {
        }

        private NoopTraceConfig() {
        }

        @Override // io.opencensus.trace.config.TraceConfig
        public TraceParams getActiveTraceParams() {
            return TraceParams.DEFAULT;
        }
    }
}
