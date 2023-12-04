package io.opencensus.trace.samplers;

import io.opencensus.internal.Utils;
import io.opencensus.trace.Sampler;
import io.opencensus.trace.Span;
import io.opencensus.trace.SpanContext;
import io.opencensus.trace.SpanId;
import io.opencensus.trace.TraceId;
import java.util.List;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class ProbabilitySampler extends Sampler {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long getIdUpperBound();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract double getProbability();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ProbabilitySampler create(double d) {
        int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
        Utils.checkArgument(i >= 0 && d <= 1.0d, "probability must be in range [0.0, 1.0]");
        return new AutoValue_ProbabilitySampler(d, i == 0 ? Long.MIN_VALUE : d == 1.0d ? Long.MAX_VALUE : (long) (9.223372036854776E18d * d));
    }

    @Override // io.opencensus.trace.Sampler
    public final boolean shouldSample(@Nullable SpanContext spanContext, @Nullable Boolean bool, TraceId traceId, SpanId spanId, String str, @Nullable List<Span> list) {
        if (spanContext == null || !spanContext.getTraceOptions().isSampled()) {
            if (list != null) {
                for (Span span : list) {
                    if (span.getContext().getTraceOptions().isSampled()) {
                        return true;
                    }
                }
            }
            return Math.abs(traceId.getLowerLong()) < getIdUpperBound();
        }
        return true;
    }

    @Override // io.opencensus.trace.Sampler
    public final String getDescription() {
        return String.format("ProbabilitySampler{%.6f}", Double.valueOf(getProbability()));
    }
}
