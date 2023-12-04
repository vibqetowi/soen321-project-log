package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FirebasePerfTraceValidator extends PerfMetricValidator {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final TraceMetric traceMetric;

    private boolean isValidCounterValue(Long l) {
        return l != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebasePerfTraceValidator(TraceMetric traceMetric) {
        this.traceMetric = traceMetric;
    }

    @Override // com.google.firebase.perf.metrics.validator.PerfMetricValidator
    public boolean isValidPerfMetric() {
        if (!isValidTrace(this.traceMetric, 0)) {
            AndroidLogger androidLogger = logger;
            androidLogger.warn("Invalid Trace:" + this.traceMetric.getName());
            return false;
        } else if (!hasCounters(this.traceMetric) || areCountersValid(this.traceMetric)) {
            return true;
        } else {
            AndroidLogger androidLogger2 = logger;
            androidLogger2.warn("Invalid Counters for Trace:" + this.traceMetric.getName());
            return false;
        }
    }

    private boolean hasCounters(TraceMetric traceMetric) {
        boolean z;
        if (traceMetric.getCountersCount() > 0) {
            return true;
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (traceMetric2.getCountersCount() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    private boolean areCountersValid(TraceMetric traceMetric) {
        return areCountersValid(traceMetric, 0);
    }

    private boolean areCountersValid(TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            return false;
        }
        if (i > 1) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            if (!isValidCounterId(entry.getKey())) {
                AndroidLogger androidLogger = logger;
                androidLogger.warn("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!isValidCounterValue(entry.getValue())) {
                AndroidLogger androidLogger2 = logger;
                androidLogger2.warn("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
            if (!areCountersValid(traceMetric2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean isScreenTrace(TraceMetric traceMetric) {
        return traceMetric.getName().startsWith(Constants.SCREEN_TRACE_PREFIX);
    }

    private boolean isValidScreenTrace(TraceMetric traceMetric) {
        Long l = traceMetric.getCountersMap().get(Constants.CounterNames.FRAMES_TOTAL.toString());
        return l != null && l.compareTo((Long) 0L) > 0;
    }

    private boolean isValidTrace(TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            logger.warn("TraceMetric is null");
            return false;
        } else if (i > 1) {
            logger.warn("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!isValidTraceId(traceMetric.getName())) {
            AndroidLogger androidLogger = logger;
            androidLogger.warn("invalid TraceId:" + traceMetric.getName());
            return false;
        } else if (!isValidTraceDuration(traceMetric)) {
            AndroidLogger androidLogger2 = logger;
            androidLogger2.warn("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        } else if (!traceMetric.hasClientStartTimeUs()) {
            logger.warn("clientStartTimeUs is null.");
            return false;
        } else if (isScreenTrace(traceMetric) && !isValidScreenTrace(traceMetric)) {
            AndroidLogger androidLogger3 = logger;
            androidLogger3.warn("non-positive totalFrames in screen trace " + traceMetric.getName());
            return false;
        } else {
            for (TraceMetric traceMetric2 : traceMetric.getSubtracesList()) {
                if (!isValidTrace(traceMetric2, i + 1)) {
                    return false;
                }
            }
            return areAllAttributesValid(traceMetric.getCustomAttributesMap());
        }
    }

    private boolean isValidTraceId(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    private boolean isValidTraceDuration(TraceMetric traceMetric) {
        return traceMetric != null && traceMetric.getDurationUs() > 0;
    }

    private boolean isValidCounterId(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            logger.warn("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            logger.warn("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    private boolean areAllAttributesValid(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                validateAttribute(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e) {
                logger.warn(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }
}
