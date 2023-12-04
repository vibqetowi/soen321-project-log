package io.opencensus.trace.export;
/* loaded from: classes4.dex */
public abstract class ExportComponent {
    public abstract RunningSpanStore getRunningSpanStore();

    public abstract SampledSpanStore getSampledSpanStore();

    public abstract SpanExporter getSpanExporter();

    public void shutdown() {
    }

    public static ExportComponent newNoopExportComponent() {
        return new NoopExportComponent();
    }

    /* loaded from: classes4.dex */
    private static final class NoopExportComponent extends ExportComponent {
        private final SampledSpanStore noopSampledSpanStore;

        private NoopExportComponent() {
            this.noopSampledSpanStore = SampledSpanStore.newNoopSampledSpanStore();
        }

        @Override // io.opencensus.trace.export.ExportComponent
        public SpanExporter getSpanExporter() {
            return SpanExporter.getNoopSpanExporter();
        }

        @Override // io.opencensus.trace.export.ExportComponent
        public RunningSpanStore getRunningSpanStore() {
            return RunningSpanStore.getNoopRunningSpanStore();
        }

        @Override // io.opencensus.trace.export.ExportComponent
        public SampledSpanStore getSampledSpanStore() {
            return this.noopSampledSpanStore;
        }
    }
}
