package com.appsflyer.internal;

import android.os.Build;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.bl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class av implements Runnable {
    final bv AFInAppEventParameterName;
    public final bh AFInAppEventType;
    private bb AFKeystoreWrapper;
    private final bd getLevel;
    public final ExecutorService valueOf;
    BillingClient values;

    public av(bh bhVar, bb bbVar, bv bvVar, ExecutorService executorService, bd bdVar) {
        this.AFInAppEventType = bhVar;
        this.AFKeystoreWrapper = bbVar;
        this.AFInAppEventParameterName = bvVar;
        this.valueOf = executorService;
        this.getLevel = bdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9 A[LOOP:0: B:22:0x00f3->B:24:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void AFInAppEventType(av avVar, final boolean z, List list) {
        boolean z2;
        Map<String, String> map;
        String string;
        String str;
        bl blVar;
        final aj AFKeystoreWrapper = avVar.AFInAppEventType.AFKeystoreWrapper();
        if (AFKeystoreWrapper != null) {
            z2 = AFKeystoreWrapper.AFInAppEventType;
            if (AFKeystoreWrapper.values != null) {
                map = AFKeystoreWrapper.values.apply(list);
                as asVar = new as(z2, z, list, map);
                bd bdVar = avVar.getLevel;
                String format = String.format("https://%sars.%s/api/v1/android/validate_subscription", AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName());
                HashMap hashMap = new HashMap();
                hashMap.put("app_id", bdVar.valueOf.AFInAppEventParameterName.getPackageName());
                string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
                if (string != null) {
                    hashMap.put("cuid", string);
                }
                aa aaVar = bdVar.valueOf;
                hashMap.put("app_version_name", z.AFKeystoreWrapper(aaVar.AFInAppEventParameterName, aaVar.AFInAppEventParameterName.getPackageName()));
                HashMap hashMap2 = new HashMap();
                g AFKeystoreWrapper2 = ab.AFKeystoreWrapper(bdVar.valueOf.AFInAppEventParameterName, new HashMap());
                str = AFKeystoreWrapper2 != null ? AFKeystoreWrapper2.values : null;
                if (str != null) {
                    hashMap2.put("advertising_id", str);
                }
                hashMap2.put("appsflyer_id", af.valueOf(new WeakReference(bdVar.valueOf.AFInAppEventParameterName)));
                StringBuilder sb = new StringBuilder();
                sb.append(Build.VERSION.SDK_INT);
                hashMap2.put("os_version", sb.toString());
                hashMap2.put("sdk_version", ac.AFInAppEventType);
                hashMap.put("device_data", hashMap2);
                hashMap.put("is_cached", Boolean.valueOf(asVar.valueOf()));
                hashMap.put("environment", !asVar.AFInAppEventParameterName() ? "SANDBOX" : "PRODUCTION");
                hashMap.put("additional_parameters", asVar.AFInAppEventType);
                ArrayList arrayList = new ArrayList();
                for (Purchase purchase : asVar.values) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("token", purchase.getPurchaseToken());
                    hashMap3.put("subscription_id", purchase.getSku());
                    arrayList.add(hashMap3);
                }
                hashMap.put(BillingClient.FeatureType.SUBSCRIPTIONS, arrayList);
                z zVar = new z(format, new JSONObject((Map<?, ?>) hashMap).toString().getBytes(), "POST", Collections.emptyMap(), false);
                bj bjVar = new bj();
                zVar.AFInAppEventParameterName = bdVar.AFInAppEventType();
                ab abVar = bdVar.AFInAppEventType;
                blVar = new bl(zVar, abVar.AFKeystoreWrapper, abVar.valueOf, bjVar);
                bi<String> biVar = new bi<String>() { // from class: com.appsflyer.internal.av.3
                    @Override // com.appsflyer.internal.bi
                    public final void values(br<String> brVar) {
                        if (brVar.values()) {
                            if (z) {
                                av.this.AFInAppEventParameterName.AFInAppEventType("ars_history_sent", true);
                            }
                            aj ajVar = AFKeystoreWrapper;
                            if (ajVar == null || ajVar.AFKeystoreWrapper == null) {
                                return;
                            }
                            AFKeystoreWrapper.AFKeystoreWrapper.accept(brVar.valueOf);
                            return;
                        }
                        aj ajVar2 = AFKeystoreWrapper;
                        if (ajVar2 == null || ajVar2.AFInAppEventParameterName == null) {
                            return;
                        }
                        AFKeystoreWrapper.AFInAppEventParameterName.accept(brVar.valueOf);
                    }

                    @Override // com.appsflyer.internal.bi
                    public final void values(Throwable th) {
                        aj ajVar = AFKeystoreWrapper;
                        if (ajVar != null && ajVar.AFInAppEventParameterName != null) {
                            AFKeystoreWrapper.AFInAppEventParameterName.accept(th.getMessage());
                        }
                        AFLogger.values(th);
                    }
                };
                if (blVar.valueOf.getAndSet(true)) {
                    blVar.AFKeystoreWrapper.submit(new bl.AnonymousClass3(biVar));
                    return;
                }
                throw new IllegalStateException("Http call is already executed");
            }
        } else {
            z2 = false;
        }
        map = null;
        as asVar2 = new as(z2, z, list, map);
        bd bdVar2 = avVar.getLevel;
        String format2 = String.format("https://%sars.%s/api/v1/android/validate_subscription", AppsFlyerLib.getInstance().getHostPrefix(), ac.AFInAppEventParameterName().getHostName());
        HashMap hashMap4 = new HashMap();
        hashMap4.put("app_id", bdVar2.valueOf.AFInAppEventParameterName.getPackageName());
        string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
        }
        aa aaVar2 = bdVar2.valueOf;
        hashMap4.put("app_version_name", z.AFKeystoreWrapper(aaVar2.AFInAppEventParameterName, aaVar2.AFInAppEventParameterName.getPackageName()));
        HashMap hashMap22 = new HashMap();
        g AFKeystoreWrapper22 = ab.AFKeystoreWrapper(bdVar2.valueOf.AFInAppEventParameterName, new HashMap());
        if (AFKeystoreWrapper22 != null) {
        }
        if (str != null) {
        }
        hashMap22.put("appsflyer_id", af.valueOf(new WeakReference(bdVar2.valueOf.AFInAppEventParameterName)));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.VERSION.SDK_INT);
        hashMap22.put("os_version", sb2.toString());
        hashMap22.put("sdk_version", ac.AFInAppEventType);
        hashMap4.put("device_data", hashMap22);
        hashMap4.put("is_cached", Boolean.valueOf(asVar2.valueOf()));
        hashMap4.put("environment", !asVar2.AFInAppEventParameterName() ? "SANDBOX" : "PRODUCTION");
        hashMap4.put("additional_parameters", asVar2.AFInAppEventType);
        ArrayList arrayList2 = new ArrayList();
        while (r3.hasNext()) {
        }
        hashMap4.put(BillingClient.FeatureType.SUBSCRIPTIONS, arrayList2);
        z zVar2 = new z(format2, new JSONObject((Map<?, ?>) hashMap4).toString().getBytes(), "POST", Collections.emptyMap(), false);
        bj bjVar2 = new bj();
        zVar2.AFInAppEventParameterName = bdVar2.AFInAppEventType();
        ab abVar2 = bdVar2.AFInAppEventType;
        blVar = new bl(zVar2, abVar2.AFKeystoreWrapper, abVar2.valueOf, bjVar2);
        bi<String> biVar2 = new bi<String>() { // from class: com.appsflyer.internal.av.3
            @Override // com.appsflyer.internal.bi
            public final void values(br<String> brVar) {
                if (brVar.values()) {
                    if (z) {
                        av.this.AFInAppEventParameterName.AFInAppEventType("ars_history_sent", true);
                    }
                    aj ajVar = AFKeystoreWrapper;
                    if (ajVar == null || ajVar.AFKeystoreWrapper == null) {
                        return;
                    }
                    AFKeystoreWrapper.AFKeystoreWrapper.accept(brVar.valueOf);
                    return;
                }
                aj ajVar2 = AFKeystoreWrapper;
                if (ajVar2 == null || ajVar2.AFInAppEventParameterName == null) {
                    return;
                }
                AFKeystoreWrapper.AFInAppEventParameterName.accept(brVar.valueOf);
            }

            @Override // com.appsflyer.internal.bi
            public final void values(Throwable th) {
                aj ajVar = AFKeystoreWrapper;
                if (ajVar != null && ajVar.AFInAppEventParameterName != null) {
                    AFKeystoreWrapper.AFInAppEventParameterName.accept(th.getMessage());
                }
                AFLogger.values(th);
            }
        };
        if (blVar.valueOf.getAndSet(true)) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.values == null) {
                bb bbVar = this.AFKeystoreWrapper;
                BillingClient build = BillingClient.newBuilder(bbVar.AFInAppEventParameterName).setListener(new at(this)).enablePendingPurchases().build();
                this.values = build;
                build.startConnection(new au(this));
            }
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.AFInAppEventParameterName("Failed to setup Play billing", th);
        }
    }
}
