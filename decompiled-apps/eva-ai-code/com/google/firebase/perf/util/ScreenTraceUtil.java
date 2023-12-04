package com.google.firebase.perf.util;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.FrameMetricsCalculator;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants;
/* loaded from: classes7.dex */
public class ScreenTraceUtil {
    private static final AndroidLogger logger = AndroidLogger.getInstance();

    public static Trace addFrameCounters(Trace trace, FrameMetricsCalculator.PerfFrameMetrics perfFrameMetrics) {
        if (perfFrameMetrics.getTotalFrames() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_TOTAL.toString(), perfFrameMetrics.getTotalFrames());
        }
        if (perfFrameMetrics.getSlowFrames() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_SLOW.toString(), perfFrameMetrics.getSlowFrames());
        }
        if (perfFrameMetrics.getFrozenFrames() > 0) {
            trace.putMetric(Constants.CounterNames.FRAMES_FROZEN.toString(), perfFrameMetrics.getFrozenFrames());
        }
        AndroidLogger androidLogger = logger;
        androidLogger.debug("Screen trace: " + trace.getName() + " _fr_tot:" + perfFrameMetrics.getTotalFrames() + " _fr_slo:" + perfFrameMetrics.getSlowFrames() + " _fr_fzn:" + perfFrameMetrics.getFrozenFrames());
        return trace;
    }
}
