package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x implements SensorEventListener {
    double AFInAppEventParameterName;
    long AFKeystoreWrapper;
    private final String AFLogger$LogLevel;
    private final String AFVersionDeclaration;
    private final int AppsFlyer2dXConversionCallback;
    private final Executor getLevel;
    private final int values;
    final float[][] AFInAppEventType = new float[2];
    final long[] valueOf = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(Sensor sensor, Executor executor) {
        this.getLevel = executor;
        int type = sensor.getType();
        this.values = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFLogger$LogLevel = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFVersionDeclaration = str;
        this.AppsFlyer2dXConversionCallback = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private static List<Float> AFInAppEventType(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.getLevel.execute(new Runnable() { // from class: com.appsflyer.internal.x.5
            @Override // java.lang.Runnable
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                float[] fArr2 = x.this.AFInAppEventType[0];
                if (fArr2 != null) {
                    float[] fArr3 = x.this.AFInAppEventType[1];
                    if (fArr3 == null) {
                        float[] fArr4 = fArr;
                        float[] copyOf = Arrays.copyOf(fArr4, fArr4.length);
                        x.this.AFInAppEventType[1] = copyOf;
                        x.this.valueOf[1] = currentTimeMillis;
                        x.this.AFInAppEventParameterName = x.AFInAppEventParameterName(fArr2, copyOf);
                        return;
                    } else if (50000000 <= j - x.this.AFKeystoreWrapper) {
                        x.this.AFKeystoreWrapper = j;
                        if (Arrays.equals(fArr3, fArr)) {
                            x.this.valueOf[1] = currentTimeMillis;
                            return;
                        }
                        double AFInAppEventParameterName = x.AFInAppEventParameterName(fArr2, fArr);
                        if (AFInAppEventParameterName > x.this.AFInAppEventParameterName) {
                            float[][] fArr5 = x.this.AFInAppEventType;
                            float[] fArr6 = fArr;
                            fArr5[1] = Arrays.copyOf(fArr6, fArr6.length);
                            x.this.valueOf[1] = currentTimeMillis;
                            x.this.AFInAppEventParameterName = AFInAppEventParameterName;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                float[][] fArr7 = x.this.AFInAppEventType;
                float[] fArr8 = fArr;
                fArr7[0] = Arrays.copyOf(fArr8, fArr8.length);
                x.this.valueOf[0] = currentTimeMillis;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(Map<x, Map<String, Object>> map, boolean z) {
        if (AFKeystoreWrapper()) {
            map.put(this, AFInAppEventType());
            if (z) {
                int length = this.AFInAppEventType.length;
                for (int i = 0; i < length; i++) {
                    this.AFInAppEventType[i] = null;
                }
                int length2 = this.valueOf.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.valueOf[i2] = 0;
                }
                this.AFInAppEventParameterName = 0.0d;
                this.AFKeystoreWrapper = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFInAppEventType());
        }
    }

    private boolean AFInAppEventParameterName(int i, String str, String str2) {
        return this.values == i && this.AFLogger$LogLevel.equals(str) && this.AFVersionDeclaration.equals(str2);
    }

    private Map<String, Object> AFInAppEventType() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.values));
        concurrentHashMap.put("sN", this.AFLogger$LogLevel);
        concurrentHashMap.put("sV", this.AFVersionDeclaration);
        float[] fArr = this.AFInAppEventType[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(fArr));
        }
        float[] fArr2 = this.AFInAppEventType[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean AFKeystoreWrapper() {
        return this.AFInAppEventType[0] != null;
    }

    public final int hashCode() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return AFInAppEventParameterName(xVar.values, xVar.AFLogger$LogLevel, xVar.AFVersionDeclaration);
        }
        return false;
    }

    static /* synthetic */ double AFInAppEventParameterName(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }
}
