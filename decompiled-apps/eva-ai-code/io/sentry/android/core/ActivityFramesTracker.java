package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ILogger;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes4.dex */
public final class ActivityFramesTracker {
    private final Map<SentryId, Map<String, MeasurementValue>> activityMeasurements;
    private boolean androidXAvailable;
    private FrameMetricsAggregator frameMetricsAggregator;

    public ActivityFramesTracker(LoadClass loadClass, ILogger iLogger) {
        this.frameMetricsAggregator = null;
        this.androidXAvailable = true;
        this.activityMeasurements = new ConcurrentHashMap();
        boolean isClassAvailable = loadClass.isClassAvailable("androidx.core.app.FrameMetricsAggregator", iLogger);
        this.androidXAvailable = isClassAvailable;
        if (isClassAvailable) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
        }
    }

    public ActivityFramesTracker(LoadClass loadClass) {
        this(loadClass, null);
    }

    ActivityFramesTracker(FrameMetricsAggregator frameMetricsAggregator) {
        this.frameMetricsAggregator = null;
        this.androidXAvailable = true;
        this.activityMeasurements = new ConcurrentHashMap();
        this.frameMetricsAggregator = frameMetricsAggregator;
    }

    private boolean isFrameMetricsAggregatorAvailable() {
        return this.androidXAvailable && this.frameMetricsAggregator != null;
    }

    public synchronized void addActivity(Activity activity) {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.add(activity);
        }
    }

    public synchronized void setMetrics(Activity activity, SentryId sentryId) {
        SparseIntArray[] sparseIntArrayArr;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (isFrameMetricsAggregatorAvailable()) {
            try {
                sparseIntArrayArr = this.frameMetricsAggregator.remove(activity);
            } catch (Throwable unused) {
                sparseIntArrayArr = null;
            }
            int i3 = 0;
            if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
                i = 0;
                i2 = 0;
            } else {
                int i4 = 0;
                i = 0;
                i2 = 0;
                while (i3 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i3);
                    int valueAt = sparseIntArray.valueAt(i3);
                    i4 += valueAt;
                    if (keyAt > 700) {
                        i2 += valueAt;
                    } else if (keyAt > 16) {
                        i += valueAt;
                    }
                    i3++;
                }
                i3 = i4;
            }
            if (i3 == 0 && i == 0 && i2 == 0) {
                return;
            }
            MeasurementValue measurementValue = new MeasurementValue(i3);
            MeasurementValue measurementValue2 = new MeasurementValue(i);
            MeasurementValue measurementValue3 = new MeasurementValue(i2);
            HashMap hashMap = new HashMap();
            hashMap.put("frames_total", measurementValue);
            hashMap.put("frames_slow", measurementValue2);
            hashMap.put("frames_frozen", measurementValue3);
            this.activityMeasurements.put(sentryId, hashMap);
        }
    }

    public synchronized Map<String, MeasurementValue> takeMetrics(SentryId sentryId) {
        if (isFrameMetricsAggregatorAvailable()) {
            Map<String, MeasurementValue> map = this.activityMeasurements.get(sentryId);
            this.activityMeasurements.remove(sentryId);
            return map;
        }
        return null;
    }

    public synchronized void stop() {
        if (isFrameMetricsAggregatorAvailable()) {
            this.frameMetricsAggregator.stop();
        }
        this.activityMeasurements.clear();
    }
}
