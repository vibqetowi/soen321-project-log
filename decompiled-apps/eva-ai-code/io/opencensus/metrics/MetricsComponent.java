package io.opencensus.metrics;

import io.opencensus.metrics.export.ExportComponent;
/* loaded from: classes4.dex */
public abstract class MetricsComponent {
    public abstract ExportComponent getExportComponent();

    public abstract MetricRegistry getMetricRegistry();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MetricsComponent newNoopMetricsComponent() {
        return new NoopMetricsComponent();
    }

    /* loaded from: classes4.dex */
    private static final class NoopMetricsComponent extends MetricsComponent {
        private static final ExportComponent EXPORT_COMPONENT = ExportComponent.newNoopExportComponent();
        private static final MetricRegistry METRIC_REGISTRY = MetricRegistry.newNoopMetricRegistry();

        private NoopMetricsComponent() {
        }

        @Override // io.opencensus.metrics.MetricsComponent
        public ExportComponent getExportComponent() {
            return EXPORT_COMPONENT;
        }

        @Override // io.opencensus.metrics.MetricsComponent
        public MetricRegistry getMetricRegistry() {
            return METRIC_REGISTRY;
        }
    }
}
