package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class AFa1cSDK {
    private static volatile AFa1cSDK afDebugLog;
    private static final BitSet afInfoLog;
    final Runnable AFInAppEventParameterName;
    final Handler AFInAppEventType;
    final Object AFKeystoreWrapper = new Object();
    private final Map<AFa1bSDK, AFa1bSDK> AFLogger;
    private final Runnable AFLogger$LogLevel;
    private boolean AFVersionDeclaration;
    final Runnable afErrorLog;
    private final Map<AFa1bSDK, Map<String, Object>> afRDLog;
    private int afWarnLog;
    private final SensorManager getLevel;
    boolean valueOf;
    final Runnable values;

    /* renamed from: com.appsflyer.internal.AFa1cSDK$10  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFa1cSDK.this.AFLogger.isEmpty()) {
                    for (AFa1bSDK aFa1bSDK : AFa1cSDK.this.AFLogger.values()) {
                        AFa1cSDK.this.getLevel.unregisterListener(aFa1bSDK);
                        aFa1bSDK.AFInAppEventParameterName(AFa1cSDK.this.afRDLog, true);
                    }
                }
            } catch (Throwable unused) {
            }
            AFa1cSDK.this.afWarnLog = 0;
            AFa1cSDK.this.AFVersionDeclaration = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        afInfoLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFa1cSDK(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = afInfoLog;
        this.AFLogger = new HashMap(bitSet.size());
        this.afRDLog = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventParameterName = new Runnable() { // from class: com.appsflyer.internal.AFa1cSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1cSDK.this.AFKeystoreWrapper) {
                    final AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    aFa1cSDK.AFInAppEventType.post(new Runnable() { // from class: com.appsflyer.internal.AFa1cSDK.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFa1cSDK.this.getLevel.getSensorList(-1)) {
                                    if (AFa1cSDK.AFKeystoreWrapper(sensor.getType())) {
                                        AFa1bSDK aFa1bSDK = new AFa1bSDK(sensor);
                                        if (!AFa1cSDK.this.AFLogger.containsKey(aFa1bSDK)) {
                                            AFa1cSDK.this.AFLogger.put(aFa1bSDK, aFa1bSDK);
                                        }
                                        AFa1cSDK.this.getLevel.registerListener((SensorEventListener) AFa1cSDK.this.AFLogger.get(aFa1bSDK), sensor, 0, AFa1cSDK.this.AFInAppEventType);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            AFa1cSDK.this.AFVersionDeclaration = true;
                        }
                    });
                    AFa1cSDK aFa1cSDK2 = AFa1cSDK.this;
                    aFa1cSDK2.AFInAppEventType.postDelayed(aFa1cSDK2.AFLogger$LogLevel, 100L);
                    AFa1cSDK.this.valueOf = true;
                }
            }
        };
        this.values = new Runnable() { // from class: com.appsflyer.internal.AFa1cSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1cSDK.this.AFKeystoreWrapper) {
                    AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    aFa1cSDK.AFInAppEventType.post(new AnonymousClass10());
                }
            }
        };
        this.afErrorLog = new Runnable() { // from class: com.appsflyer.internal.AFa1cSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1cSDK.this.AFKeystoreWrapper) {
                    AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    if (aFa1cSDK.valueOf) {
                        aFa1cSDK.AFInAppEventType.removeCallbacks(aFa1cSDK.AFInAppEventParameterName);
                        AFa1cSDK aFa1cSDK2 = AFa1cSDK.this;
                        aFa1cSDK2.AFInAppEventType.removeCallbacks(aFa1cSDK2.values);
                        AFa1cSDK aFa1cSDK3 = AFa1cSDK.this;
                        aFa1cSDK3.AFInAppEventType.post(new AnonymousClass10());
                        AFa1cSDK.this.valueOf = false;
                    }
                }
            }
        };
        this.afWarnLog = 1;
        this.AFLogger$LogLevel = new Runnable() { // from class: com.appsflyer.internal.AFa1cSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFa1cSDK.this.AFKeystoreWrapper) {
                    if (AFa1cSDK.this.afWarnLog == 0) {
                        AFa1cSDK.this.afWarnLog = 1;
                    }
                    AFa1cSDK aFa1cSDK = AFa1cSDK.this;
                    aFa1cSDK.AFInAppEventType.postDelayed(aFa1cSDK.values, aFa1cSDK.afWarnLog * 500);
                }
            }
        };
        this.getLevel = sensorManager;
        this.AFInAppEventType = handler;
    }

    private static AFa1cSDK AFKeystoreWrapper(SensorManager sensorManager, Handler handler) {
        if (afDebugLog == null) {
            synchronized (AFa1cSDK.class) {
                if (afDebugLog == null) {
                    afDebugLog = new AFa1cSDK(sensorManager, handler);
                }
            }
        }
        return afDebugLog;
    }

    public static AFa1cSDK valueOf(Context context) {
        if (afDebugLog != null) {
            return afDebugLog;
        }
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        return AFKeystoreWrapper((SensorManager) context.getApplicationContext().getSystemService("sensor"), new Handler(handlerThread.getLooper()));
    }

    public final List<Map<String, Object>> AFInAppEventParameterName() {
        for (AFa1bSDK aFa1bSDK : this.AFLogger.values()) {
            aFa1bSDK.AFInAppEventParameterName(this.afRDLog, true);
        }
        Map<AFa1bSDK, Map<String, Object>> map = this.afRDLog;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.afRDLog.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    private List<Map<String, Object>> values() {
        synchronized (this.AFKeystoreWrapper) {
            if (!this.AFLogger.isEmpty() && this.AFVersionDeclaration) {
                for (AFa1bSDK aFa1bSDK : this.AFLogger.values()) {
                    aFa1bSDK.AFInAppEventParameterName(this.afRDLog, false);
                }
            }
            if (this.afRDLog.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.afRDLog.values());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFKeystoreWrapper(int i6) {
        return i6 >= 0 && afInfoLog.get(i6);
    }

    public final synchronized void AFKeystoreWrapper() {
        this.AFInAppEventType.post(this.afErrorLog);
    }

    public final Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> values = values();
        if (!values.isEmpty()) {
            concurrentHashMap.put("sensors", values);
        } else {
            List<Map<String, Object>> AFInAppEventParameterName = AFInAppEventParameterName();
            if (!AFInAppEventParameterName.isEmpty()) {
                concurrentHashMap.put("sensors", AFInAppEventParameterName);
            }
        }
        return concurrentHashMap;
    }
}
