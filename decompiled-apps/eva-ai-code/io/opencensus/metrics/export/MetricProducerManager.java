package io.opencensus.metrics.export;

import io.opencensus.internal.Utils;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes4.dex */
public abstract class MetricProducerManager {
    public abstract void add(MetricProducer metricProducer);

    public abstract Set<MetricProducer> getAllMetricProducer();

    public abstract void remove(MetricProducer metricProducer);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MetricProducerManager newNoopMetricProducerManager() {
        return new NoopMetricProducerManager();
    }

    /* loaded from: classes4.dex */
    private static final class NoopMetricProducerManager extends MetricProducerManager {
        private NoopMetricProducerManager() {
        }

        @Override // io.opencensus.metrics.export.MetricProducerManager
        public void add(MetricProducer metricProducer) {
            Utils.checkNotNull(metricProducer, "metricProducer");
        }

        @Override // io.opencensus.metrics.export.MetricProducerManager
        public void remove(MetricProducer metricProducer) {
            Utils.checkNotNull(metricProducer, "metricProducer");
        }

        @Override // io.opencensus.metrics.export.MetricProducerManager
        public Set<MetricProducer> getAllMetricProducer() {
            return Collections.emptySet();
        }
    }
}
