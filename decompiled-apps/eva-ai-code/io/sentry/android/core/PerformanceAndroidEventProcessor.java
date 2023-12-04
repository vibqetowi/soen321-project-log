package io.sentry.android.core;

import io.sentry.EventProcessor;
import io.sentry.SentryEvent;
import io.sentry.SpanContext;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.Objects;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class PerformanceAndroidEventProcessor implements EventProcessor {
    private final ActivityFramesTracker activityFramesTracker;
    private final SentryAndroidOptions options;
    private boolean sentStartMeasurement = false;

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Object obj) {
        return sentryEvent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PerformanceAndroidEventProcessor(SentryAndroidOptions sentryAndroidOptions, ActivityFramesTracker activityFramesTracker) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
    }

    @Override // io.sentry.EventProcessor
    public synchronized SentryTransaction process(SentryTransaction sentryTransaction, Object obj) {
        Map<String, MeasurementValue> takeMetrics;
        Long appStartInterval;
        if (this.options.isTracingEnabled()) {
            if (!this.sentStartMeasurement && hasAppStartSpan(sentryTransaction.getSpans()) && (appStartInterval = AppStartState.getInstance().getAppStartInterval()) != null) {
                sentryTransaction.getMeasurements().put(AppStartState.getInstance().isColdStart().booleanValue() ? "app_start_cold" : "app_start_warm", new MeasurementValue((float) appStartInterval.longValue()));
                this.sentStartMeasurement = true;
            }
            SentryId eventId = sentryTransaction.getEventId();
            SpanContext trace = sentryTransaction.getContexts().getTrace();
            if (eventId != null && trace != null && trace.getOperation().contentEquals("ui.load") && (takeMetrics = this.activityFramesTracker.takeMetrics(eventId)) != null) {
                sentryTransaction.getMeasurements().putAll(takeMetrics);
            }
            return sentryTransaction;
        }
        return sentryTransaction;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean hasAppStartSpan(List<SentrySpan> list) {
        for (SentrySpan sentrySpan : list) {
            if (sentrySpan.getOp().contentEquals("app.start.cold") || sentrySpan.getOp().contentEquals("app.start.warm")) {
                return true;
            }
            while (r4.hasNext()) {
            }
        }
        return false;
    }
}
