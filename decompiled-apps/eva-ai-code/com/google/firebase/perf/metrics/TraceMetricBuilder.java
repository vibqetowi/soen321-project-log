package com.google.firebase.perf.metrics;

import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class TraceMetricBuilder {
    private final Trace trace;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TraceMetricBuilder(Trace trace) {
        this.trace = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TraceMetric build() {
        TraceMetric.Builder durationUs = TraceMetric.newBuilder().setName(this.trace.getName()).setClientStartTimeUs(this.trace.getStartTime().getMicros()).setDurationUs(this.trace.getStartTime().getDurationMicros(this.trace.getEndTime()));
        for (Counter counter : this.trace.getCounters().values()) {
            durationUs.putCounters(counter.getName(), counter.getCount());
        }
        List<Trace> subtraces = this.trace.getSubtraces();
        if (!subtraces.isEmpty()) {
            for (Trace trace : subtraces) {
                durationUs.addSubtraces(new TraceMetricBuilder(trace).build());
            }
        }
        durationUs.putAllCustomAttributes(this.trace.getAttributes());
        PerfSession[] buildAndSort = com.google.firebase.perf.session.PerfSession.buildAndSort(this.trace.getSessions());
        if (buildAndSort != null) {
            durationUs.addAllPerfSessions(Arrays.asList(buildAndSort));
        }
        return durationUs.build();
    }
}
