package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.bz;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class ca {
    public final be AFInAppEventType;
    private boolean valueOf = false;
    Map<String, Object> values;

    public ca(be beVar) {
        this.AFInAppEventType = beVar;
    }

    public final Map<String, Object> AFInAppEventParameterName() {
        HashMap hashMap = new HashMap();
        if (valueOf()) {
            hashMap.put("lvl", this.values);
        } else if (this.valueOf) {
            HashMap hashMap2 = new HashMap();
            this.values = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.values);
        }
        return hashMap;
    }

    private boolean valueOf() {
        Map<String, Object> map = this.values;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public final boolean AFInAppEventType() {
        return this.valueOf && !valueOf();
    }

    public final boolean values() {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.values = new ConcurrentHashMap();
            Context context = this.AFInAppEventType.values;
            final bz.c cVar = new bz.c() { // from class: com.appsflyer.internal.ca.2
                @Override // com.appsflyer.internal.bz.c
                public final void values(String str, String str2) {
                    ca.this.values.put("signedData", str);
                    ca.this.values.put("signature", str2);
                    ca.this.values.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.values("Successfully retrieved Google LVL data.");
                }

                @Override // com.appsflyer.internal.bz.c
                public final void AFKeystoreWrapper(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    ca.this.values.put("error", message);
                    AFLogger.AFInAppEventParameterName(str, exc);
                }
            };
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                        Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                        cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2).invoke(null, Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.bz.2
                            @Override // java.lang.reflect.InvocationHandler
                            public final Object invoke(Object obj, Method method, Object[] objArr) {
                                if (method.getName().equals("onLvlResult")) {
                                    Object obj2 = objArr[0];
                                    String str = obj2 != null ? (String) obj2 : null;
                                    Object obj3 = objArr[1];
                                    String str2 = obj3 != null ? (String) obj3 : null;
                                    c cVar2 = cVar;
                                    if (cVar2 == null) {
                                        AFLogger.AFInAppEventParameterName("onLvlResult invocation succeeded, but listener is null");
                                    } else if (str != null && str2 != null) {
                                        cVar2.values(str, str2);
                                    } else if (str2 == null) {
                                        cVar2.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                    } else {
                                        cVar2.AFKeystoreWrapper("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                    }
                                } else if (method.getName().equals("onLvlFailure")) {
                                    c cVar3 = cVar;
                                    if (cVar3 != null) {
                                        Object obj4 = objArr[0];
                                        if (obj4 != null) {
                                            cVar3.AFKeystoreWrapper("onLvlFailure with exception", (Exception) obj4);
                                        } else {
                                            cVar3.AFKeystoreWrapper("onLvlFailure", new Exception("unknown"));
                                        }
                                    } else {
                                        AFLogger.AFInAppEventParameterName("onLvlFailure: listener is null");
                                    }
                                } else {
                                    c cVar4 = cVar;
                                    if (cVar4 != null) {
                                        cVar4.AFKeystoreWrapper("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                    }
                                }
                                return null;
                            }
                        }));
                    } catch (NoSuchMethodException e) {
                        cVar.AFKeystoreWrapper(e.getClass().getSimpleName(), e);
                    }
                } catch (IllegalAccessException e2) {
                    cVar.AFKeystoreWrapper(e2.getClass().getSimpleName(), e2);
                }
            } catch (ClassNotFoundException e3) {
                cVar.AFKeystoreWrapper(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                cVar.AFKeystoreWrapper(e4.getClass().getSimpleName(), e4);
            }
            this.valueOf = true;
        } catch (ClassNotFoundException unused) {
            this.valueOf = false;
        }
        return this.valueOf;
    }
}
