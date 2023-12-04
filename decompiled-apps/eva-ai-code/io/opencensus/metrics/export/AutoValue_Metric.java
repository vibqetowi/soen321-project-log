package io.opencensus.metrics.export;

import java.util.List;
/* loaded from: classes4.dex */
final class AutoValue_Metric extends Metric {
    private final MetricDescriptor metricDescriptor;
    private final List<TimeSeries> timeSeriesList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Metric(MetricDescriptor metricDescriptor, List<TimeSeries> list) {
        if (metricDescriptor == null) {
            throw new NullPointerException("Null metricDescriptor");
        }
        this.metricDescriptor = metricDescriptor;
        if (list == null) {
            throw new NullPointerException("Null timeSeriesList");
        }
        this.timeSeriesList = list;
    }

    @Override // io.opencensus.metrics.export.Metric
    public MetricDescriptor getMetricDescriptor() {
        return this.metricDescriptor;
    }

    @Override // io.opencensus.metrics.export.Metric
    public List<TimeSeries> getTimeSeriesList() {
        return this.timeSeriesList;
    }

    public String toString() {
        return "Metric{metricDescriptor=" + this.metricDescriptor + ", timeSeriesList=" + this.timeSeriesList + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Metric) {
            Metric metric = (Metric) obj;
            return this.metricDescriptor.equals(metric.getMetricDescriptor()) && this.timeSeriesList.equals(metric.getTimeSeriesList());
        }
        return false;
    }

    public int hashCode() {
        return ((this.metricDescriptor.hashCode() ^ 1000003) * 1000003) ^ this.timeSeriesList.hashCode();
    }
}
