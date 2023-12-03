package com.appsflyer.internal;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFd1jSDK;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFd1gSDK {
    public volatile String AFInAppEventType;
    Map<String, Object> AFKeystoreWrapper;
    private final AFd1jSDK afErrorLog;
    public final AFb1bSDK valueOf;
    public volatile String values;
    private boolean afInfoLog = false;
    public volatile boolean AFInAppEventParameterName = false;

    public AFd1gSDK(AFb1bSDK aFb1bSDK, AFd1jSDK aFd1jSDK) {
        this.valueOf = aFb1bSDK;
        this.afErrorLog = aFd1jSDK;
    }

    public final String AFInAppEventParameterName(AFd1qSDK aFd1qSDK) {
        String str;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String AFInAppEventType = aFd1qSDK.AFInAppEventType("imeiCached", (String) null);
        if (z10 && AFb1oSDK.valueOf(this.AFInAppEventType)) {
            Context context = this.valueOf.values;
            if (context != null && valueOf(context)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                } catch (InvocationTargetException e10) {
                    if (AFInAppEventType != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFInAppEventType));
                    } else {
                        AFInAppEventType = null;
                    }
                    StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                    sb2.append(e10.getMessage());
                    AFLogger.afErrorLog(sb2.toString(), e10);
                } catch (Exception e11) {
                    if (AFInAppEventType != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFInAppEventType));
                    } else {
                        AFInAppEventType = null;
                    }
                    StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11);
                }
                if (str == null) {
                    if (AFInAppEventType != null) {
                        AFLogger.afDebugLog("use cached IMEI: ".concat(AFInAppEventType));
                    } else {
                        AFInAppEventType = null;
                    }
                    str = AFInAppEventType;
                }
            }
            str = null;
        } else {
            if (this.AFInAppEventType != null) {
                str = this.AFInAppEventType;
            }
            str = null;
        }
        if (!AFb1oSDK.valueOf(str)) {
            aFd1qSDK.valueOf("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final Map<String, Object> AFInAppEventType() {
        HashMap hashMap = new HashMap();
        if (AFInAppEventParameterName()) {
            hashMap.put("lvl", this.AFKeystoreWrapper);
        } else if (this.afInfoLog) {
            HashMap hashMap2 = new HashMap();
            this.AFKeystoreWrapper = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.AFKeystoreWrapper);
        }
        return hashMap;
    }

    public final boolean AFKeystoreWrapper() {
        if (this.afInfoLog && !AFInAppEventParameterName()) {
            return true;
        }
        return false;
    }

    public final boolean valueOf() {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            Context context = this.valueOf.values;
            final AFd1jSDK.AFa1ySDK aFa1ySDK = new AFd1jSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFd1gSDK.1
                @Override // com.appsflyer.internal.AFd1jSDK.AFa1ySDK
                public final void AFKeystoreWrapper(String str, String str2) {
                    AFd1gSDK.this.AFKeystoreWrapper = new ConcurrentHashMap();
                    AFd1gSDK.this.AFKeystoreWrapper.put("signedData", str);
                    AFd1gSDK.this.AFKeystoreWrapper.put("signature", str2);
                    AFd1gSDK.this.AFKeystoreWrapper.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }

                @Override // com.appsflyer.internal.AFd1jSDK.AFa1ySDK
                public final void values(String str, Exception exc) {
                    AFd1gSDK.this.AFKeystoreWrapper = new ConcurrentHashMap();
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AFd1gSDK.this.AFKeystoreWrapper.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }
            };
            try {
                try {
                    Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                    Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                    cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2).invoke(null, Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFd1jSDK.2
                        @Override // java.lang.reflect.InvocationHandler
                        public final Object invoke(Object obj, Method method, Object[] objArr) {
                            String str;
                            String str2;
                            if (method.getName().equals("onLvlResult")) {
                                Object obj2 = objArr[0];
                                if (obj2 != null) {
                                    str = (String) obj2;
                                } else {
                                    str = null;
                                }
                                Object obj3 = objArr[1];
                                if (obj3 != null) {
                                    str2 = (String) obj3;
                                } else {
                                    str2 = null;
                                }
                                AFa1ySDK aFa1ySDK2 = aFa1ySDK;
                                if (aFa1ySDK2 != null) {
                                    if (str != null && str2 != null) {
                                        aFa1ySDK2.AFKeystoreWrapper(str, str2);
                                    } else if (str2 == null) {
                                        aFa1ySDK2.values("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                    } else {
                                        aFa1ySDK2.values("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                    }
                                } else {
                                    AFLogger.afDebugLog("onLvlResult invocation succeeded, but listener is null");
                                }
                            } else if (method.getName().equals("onLvlFailure")) {
                                AFa1ySDK aFa1ySDK3 = aFa1ySDK;
                                if (aFa1ySDK3 != null) {
                                    Object obj4 = objArr[0];
                                    if (obj4 != null) {
                                        aFa1ySDK3.values("onLvlFailure with exception", (Exception) obj4);
                                    } else {
                                        aFa1ySDK3.values("onLvlFailure", new Exception("unknown"));
                                    }
                                } else {
                                    AFLogger.afDebugLog("onLvlFailure: listener is null");
                                }
                            } else {
                                AFa1ySDK aFa1ySDK4 = aFa1ySDK;
                                if (aFa1ySDK4 != null) {
                                    aFa1ySDK4.values("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                }
                            }
                            return null;
                        }
                    }));
                } catch (NoSuchMethodException e10) {
                    aFa1ySDK.values(e10.getClass().getSimpleName(), e10);
                } catch (InvocationTargetException e11) {
                    aFa1ySDK.values(e11.getClass().getSimpleName(), e11);
                }
            } catch (ClassNotFoundException e12) {
                aFa1ySDK.values(e12.getClass().getSimpleName(), e12);
            } catch (IllegalAccessException e13) {
                aFa1ySDK.values(e13.getClass().getSimpleName(), e13);
            }
            this.afInfoLog = true;
        } catch (ClassNotFoundException unused) {
            this.afInfoLog = false;
        }
        return this.afInfoLog;
    }

    public final boolean values() {
        return this.AFInAppEventParameterName;
    }

    private static boolean valueOf(Context context) {
        if (!(AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false))) {
            AFb1xSDK.AFKeystoreWrapper();
            if (AFb1xSDK.values(context)) {
                return false;
            }
        }
        return true;
    }

    private boolean AFInAppEventParameterName() {
        Map<String, Object> map = this.AFKeystoreWrapper;
        return (map == null || map.isEmpty()) ? false : true;
    }
}
