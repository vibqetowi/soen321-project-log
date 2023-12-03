package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AFa1bSDK implements SensorEventListener {
    private final String AFInAppEventParameterName;
    private final int AFInAppEventType;
    private Executor afDebugLog;
    private final int afErrorLog;
    private double afInfoLog;
    private long afRDLog;
    private final String values;
    private final float[][] valueOf = new float[2];
    private final long[] AFKeystoreWrapper = new long[2];

    public AFa1bSDK(Sensor sensor) {
        int type = sensor.getType();
        this.AFInAppEventType = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.values = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFInAppEventParameterName = str;
        this.afErrorLog = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    private synchronized Executor AFInAppEventParameterName() {
        if (this.afDebugLog == null) {
            this.afDebugLog = Executors.newSingleThreadExecutor();
        }
        return this.afDebugLog;
    }

    private static List<Float> AFInAppEventType(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    private boolean valueOf(int i6, String str, String str2) {
        return this.AFInAppEventType == i6 && this.values.equals(str) && this.AFInAppEventParameterName.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: values */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j10 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.valueOf;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFKeystoreWrapper[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.valueOf[1] = copyOf;
            this.AFKeystoreWrapper[1] = currentTimeMillis;
            this.afInfoLog = AFInAppEventParameterName(fArr3, copyOf);
        } else if (50000000 <= j10 - this.afRDLog) {
            this.afRDLog = j10;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFKeystoreWrapper[1] = currentTimeMillis;
                return;
            }
            double AFInAppEventParameterName = AFInAppEventParameterName(fArr3, fArr);
            if (AFInAppEventParameterName > this.afInfoLog) {
                this.valueOf[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFKeystoreWrapper[1] = currentTimeMillis;
                this.afInfoLog = AFInAppEventParameterName;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFa1bSDK) {
            AFa1bSDK aFa1bSDK = (AFa1bSDK) obj;
            return valueOf(aFa1bSDK.AFInAppEventType, aFa1bSDK.values, aFa1bSDK.AFInAppEventParameterName);
        }
        return false;
    }

    public final int hashCode() {
        return this.afErrorLog;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFInAppEventParameterName().execute(new Runnable() { // from class: com.appsflyer.internal.a
                @Override // java.lang.Runnable
                public final void run() {
                    AFa1bSDK.this.AFKeystoreWrapper(sensorEvent);
                }
            });
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    private static double AFInAppEventParameterName(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d10 = 0.0d;
        for (int i6 = 0; i6 < min; i6++) {
            d10 += StrictMath.pow(fArr[i6] - fArr2[i6], 2.0d);
        }
        return Math.sqrt(d10);
    }

    private boolean AFInAppEventType() {
        return this.valueOf[0] != null;
    }

    private Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFInAppEventType));
        concurrentHashMap.put("sN", this.values);
        concurrentHashMap.put("sV", this.AFInAppEventParameterName);
        float[] fArr = this.valueOf[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(fArr));
        }
        float[] fArr2 = this.valueOf[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(fArr2));
        }
        return concurrentHashMap;
    }

    public final void AFInAppEventParameterName(Map<AFa1bSDK, Map<String, Object>> map, boolean z10) {
        if (AFInAppEventType()) {
            map.put(this, valueOf());
            if (z10) {
                int length = this.valueOf.length;
                for (int i6 = 0; i6 < length; i6++) {
                    this.valueOf[i6] = null;
                }
                int length2 = this.AFKeystoreWrapper.length;
                for (int i10 = 0; i10 < length2; i10++) {
                    this.AFKeystoreWrapper[i10] = 0;
                }
                this.afInfoLog = 0.0d;
                this.afRDLog = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, valueOf());
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i6) {
    }
}
