package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public final class w {
    private static final BitSet AFLogger$LogLevel;
    private static final Handler AFVersionDeclaration;
    private static volatile w init;
    final Runnable AFInAppEventParameterName;
    final Object AFInAppEventType = new Object();
    final Handler AFKeystoreWrapper;
    final Executor AppsFlyer2dXConversionCallback;
    final Runnable getLevel;
    private final Runnable onAppOpenAttribution;
    private final Map<x, Map<String, Object>> onAppOpenAttributionNative;
    private int onAttributionFailureNative;
    private final SensorManager onDeepLinkingNative;
    private boolean onInstallConversionDataLoadedNative;
    private final Map<x, x> onInstallConversionFailureNative;
    private long onResponseNative;
    boolean valueOf;
    final Runnable values;

    static {
        BitSet bitSet = new BitSet(6);
        AFLogger$LogLevel = bitSet;
        AFVersionDeclaration = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private w(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = AFLogger$LogLevel;
        this.onInstallConversionFailureNative = new HashMap(bitSet.size());
        this.onAppOpenAttributionNative = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventParameterName = new Runnable() { // from class: com.appsflyer.internal.w.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this.AFInAppEventType) {
                    final w wVar = w.this;
                    wVar.AppsFlyer2dXConversionCallback.execute(new Runnable() { // from class: com.appsflyer.internal.w.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : w.this.onDeepLinkingNative.getSensorList(-1)) {
                                    if (w.AFKeystoreWrapper(sensor.getType())) {
                                        x xVar = new x(sensor, w.this.AppsFlyer2dXConversionCallback);
                                        if (!w.this.onInstallConversionFailureNative.containsKey(xVar)) {
                                            w.this.onInstallConversionFailureNative.put(xVar, xVar);
                                        }
                                        w.this.onDeepLinkingNative.registerListener((SensorEventListener) w.this.onInstallConversionFailureNative.get(xVar), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            w.this.onInstallConversionDataLoadedNative = true;
                        }
                    });
                    w.this.AFKeystoreWrapper.postDelayed(w.this.onAppOpenAttribution, 100L);
                    w.this.valueOf = true;
                }
            }
        };
        this.values = new Runnable() { // from class: com.appsflyer.internal.w.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this.AFInAppEventType) {
                    w wVar = w.this;
                    wVar.AppsFlyer2dXConversionCallback.execute(new AnonymousClass10());
                }
            }
        };
        this.getLevel = new Runnable() { // from class: com.appsflyer.internal.w.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this.AFInAppEventType) {
                    if (w.this.valueOf) {
                        w.this.AFKeystoreWrapper.removeCallbacks(w.this.AFInAppEventParameterName);
                        w.this.AFKeystoreWrapper.removeCallbacks(w.this.values);
                        w wVar = w.this;
                        wVar.AppsFlyer2dXConversionCallback.execute(new AnonymousClass10());
                        w.this.valueOf = false;
                    }
                }
            }
        };
        this.onAttributionFailureNative = 1;
        this.onResponseNative = 0L;
        this.onAppOpenAttribution = new Runnable() { // from class: com.appsflyer.internal.w.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (w.this.AFInAppEventType) {
                    if (w.this.onAttributionFailureNative == 0) {
                        w.this.onAttributionFailureNative = 1;
                    }
                    w.this.AFKeystoreWrapper.postDelayed(w.this.values, w.this.onAttributionFailureNative * 500);
                }
            }
        };
        this.AppsFlyer2dXConversionCallback = Executors.newSingleThreadExecutor();
        this.onDeepLinkingNative = sensorManager;
        this.AFKeystoreWrapper = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w AFKeystoreWrapper(Context context) {
        if (init != null) {
            return init;
        }
        return AFKeystoreWrapper((SensorManager) context.getApplicationContext().getSystemService("sensor"), AFVersionDeclaration);
    }

    private static w AFKeystoreWrapper(SensorManager sensorManager, Handler handler) {
        if (init == null) {
            synchronized (w.class) {
                if (init == null) {
                    init = new w(sensorManager, handler);
                }
            }
        }
        return init;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFKeystoreWrapper(int i) {
        return i >= 0 && AFLogger$LogLevel.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void AFInAppEventType() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.onResponseNative;
        if (j != 0) {
            this.onAttributionFailureNative++;
            if (j - currentTimeMillis < 500) {
                this.AFKeystoreWrapper.removeCallbacks(this.values);
                this.AFKeystoreWrapper.post(this.AFInAppEventParameterName);
            }
        } else {
            this.AFKeystoreWrapper.post(this.getLevel);
            this.AFKeystoreWrapper.post(this.AFInAppEventParameterName);
        }
        this.onResponseNative = currentTimeMillis;
    }

    /* renamed from: com.appsflyer.internal.w$10  reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass10 implements Runnable {
        AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!w.this.onInstallConversionFailureNative.isEmpty()) {
                    for (x xVar : w.this.onInstallConversionFailureNative.values()) {
                        w.this.onDeepLinkingNative.unregisterListener(xVar);
                        xVar.AFKeystoreWrapper(w.this.onAppOpenAttributionNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            w.this.onAttributionFailureNative = 0;
            w.this.onInstallConversionDataLoadedNative = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Map<String, Object>> AFInAppEventParameterName() {
        for (x xVar : this.onInstallConversionFailureNative.values()) {
            xVar.AFKeystoreWrapper(this.onAppOpenAttributionNative, true);
        }
        Map<x, Map<String, Object>> map = this.onAppOpenAttributionNative;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.onAppOpenAttributionNative.values());
    }

    private List<Map<String, Object>> values() {
        synchronized (this.AFInAppEventType) {
            if (!this.onInstallConversionFailureNative.isEmpty() && this.onInstallConversionDataLoadedNative) {
                for (x xVar : this.onInstallConversionFailureNative.values()) {
                    xVar.AFKeystoreWrapper(this.onAppOpenAttributionNative, false);
                }
            }
            if (this.onAppOpenAttributionNative.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.onAppOpenAttributionNative.values());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, Object> AFKeystoreWrapper() {
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
