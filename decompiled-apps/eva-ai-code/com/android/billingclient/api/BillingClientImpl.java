package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.BundleCompat;
import com.android.billingclient.BuildConfig;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfh;
import com.google.android.gms.internal.play_billing.zzfj;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public class BillingClientImpl extends BillingClient {
    private volatile int zza;
    private final String zzb;
    private final Handler zzc;
    private volatile zzh zzd;
    private Context zze;
    private zzar zzf;
    private volatile com.google.android.gms.internal.play_billing.zze zzg;
    private volatile zzaf zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zzbe zzx;
    private boolean zzy;
    private ExecutorService zzz;

    private BillingClientImpl(Activity activity, zzbe zzbeVar, String str) {
        this(activity.getApplicationContext(), zzbeVar, new zzaj(), str, null, null, null);
    }

    private void initialize(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzbe zzbeVar, AlternativeBillingListener alternativeBillingListener, String str, zzar zzarVar) {
        this.zze = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(str);
        zzv.zzi(this.zze.getPackageName());
        if (zzarVar != null) {
            this.zzf = zzarVar;
        } else {
            this.zzf = new zzaw(this.zze, (zzfm) zzv.zzc());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new zzh(this.zze, purchasesUpdatedListener, alternativeBillingListener, this.zzf);
        this.zzx = zzbeVar;
        this.zzy = alternativeBillingListener != null;
    }

    private int launchBillingFlowCpp(Activity activity, BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        zzaj zzajVar = new zzaj(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzaq.zzb(6));
            zzajVar.onBillingSetupFinished(zzat.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            this.zzf.zza(zzaq.zza(37, 6, zzat.zzd));
            zzajVar.onBillingSetupFinished(zzat.zzd);
        } else if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            this.zzf.zza(zzaq.zza(38, 6, zzat.zzm));
            zzajVar.onBillingSetupFinished(zzat.zzm);
        } else {
            this.zza = 1;
            this.zzd.zze();
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzaf(this, zzajVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Billing service unavailable on device.");
            this.zzf.zza(zzaq.zza(i, 6, zzat.zzc));
            zzajVar.onBillingSetupFinished(zzat.zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbj zzN(BillingClientImpl billingClientImpl, String str, int i) {
        Bundle zzi;
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        int i2 = 0;
        Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, true, false, billingClientImpl.zzb);
        List list = null;
        String str2 = null;
        while (true) {
            try {
                if (billingClientImpl.zzn) {
                    zzi = billingClientImpl.zzg.zzj(z != billingClientImpl.zzv ? 9 : 19, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                } else {
                    zzi = billingClientImpl.zzg.zzi(3, billingClientImpl.zze.getPackageName(), str, str2);
                }
                zzbk zza = zzbl.zza(zzi, "BillingClient", "getPurchase()");
                BillingResult zza2 = zza.zza();
                if (zza2 == zzat.zzl) {
                    ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i3 = i2;
                    int i4 = i3;
                    while (i3 < stringArrayList2.size()) {
                        String str3 = stringArrayList2.get(i3);
                        String str4 = stringArrayList3.get(i3);
                        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i3))));
                        try {
                            Purchase purchase = new Purchase(str3, str4);
                            if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "BUG: empty/null token!");
                                i4 = 1;
                            }
                            arrayList.add(purchase);
                            i3++;
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e);
                            billingClientImpl.zzf.zza(zzaq.zza(51, 9, zzat.zzj));
                            return new zzbj(zzat.zzj, null);
                        }
                    }
                    if (i4 != 0) {
                        billingClientImpl.zzf.zza(zzaq.zza(26, 9, zzat.zzj));
                    }
                    str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        return new zzbj(zzat.zzl, arrayList);
                    }
                    list = null;
                    z = true;
                    i2 = 0;
                } else {
                    billingClientImpl.zzf.zza(zzaq.zza(zza.zzb(), 9, zza2));
                    return new zzbj(zza2, list);
                }
            } catch (Exception e2) {
                billingClientImpl.zzf.zza(zzaq.zza(52, 9, zzat.zzm));
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new zzbj(zzat.zzm, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler zzO() {
        return Looper.myLooper() == null ? this.zzc : new Handler(Looper.myLooper());
    }

    private final BillingResult zzP(final BillingResult billingResult) {
        if (Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new Runnable() { // from class: com.android.billingclient.api.zzx
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzH(billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BillingResult zzQ() {
        if (this.zza == 0 || this.zza == 3) {
            return zzat.zzm;
        }
        return zzat.zzj;
    }

    private static String zzR() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future zzS(Callable callable, long j, final Runnable runnable, Handler handler) {
        if (this.zzz == null) {
            this.zzz = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new zzab(this));
        }
        try {
            final Future submit = this.zzz.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.zzw
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void zzT(String str, final PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzaq.zza(2, 11, zzat.zzm));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzat.zzm, null);
        } else if (zzS(new zzz(this, str, purchaseHistoryResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzo
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzK(purchaseHistoryResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 11, zzQ));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzQ, null);
        }
    }

    private final void zzU(String str, final PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzaq.zza(2, 9, zzat.zzm));
            purchasesResponseListener.onQueryPurchasesResponse(zzat.zzm, com.google.android.gms.internal.play_billing.zzu.zzk());
        } else if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please provide a valid product type.");
            this.zzf.zza(zzaq.zza(50, 9, zzat.zzg));
            purchasesResponseListener.onQueryPurchasesResponse(zzat.zzg, com.google.android.gms.internal.play_billing.zzu.zzk());
        } else if (zzS(new zzy(this, str, purchasesResponseListener), 30000L, new Runnable() { // from class: com.android.billingclient.api.zzu
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzL(purchasesResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 9, zzQ));
            purchasesResponseListener.onQueryPurchasesResponse(zzQ, com.google.android.gms.internal.play_billing.zzu.zzk());
        }
    }

    private final void zzV(BillingResult billingResult, int i, int i2) {
        if (billingResult.getResponseCode() != 0) {
            zzar zzarVar = this.zzf;
            zzfa zzv = zzfb.zzv();
            zzfh zzv2 = zzfj.zzv();
            zzv2.zzj(billingResult.getResponseCode());
            zzv2.zzi(billingResult.getDebugMessage());
            zzv2.zzk(i);
            zzv.zzi(zzv2);
            zzv.zzk(5);
            zzfu zzv3 = zzfw.zzv();
            zzv3.zzi(i2);
            zzv.zzj((zzfw) zzv3.zzc());
            zzarVar.zza((zzfb) zzv.zzc());
            return;
        }
        zzar zzarVar2 = this.zzf;
        zzfe zzv4 = zzff.zzv();
        zzv4.zzj(5);
        zzfu zzv5 = zzfw.zzv();
        zzv5.zzi(i2);
        zzv4.zzi((zzfw) zzv5.zzc());
        zzarVar2.zzb((zzff) zzv4.zzc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzai zzf(BillingClientImpl billingClientImpl, String str) {
        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, true, false, billingClientImpl.zzb);
        String str2 = null;
        while (billingClientImpl.zzl) {
            try {
                Bundle zzh = billingClientImpl.zzg.zzh(6, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                zzbk zza = zzbl.zza(zzh, "BillingClient", "getPurchaseHistory()");
                BillingResult zza2 = zza.zza();
                if (zza2 == zzat.zzl) {
                    ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i2 = i;
                    int i3 = i2;
                    while (i2 < stringArrayList2.size()) {
                        String str3 = stringArrayList2.get(i2);
                        String str4 = stringArrayList3.get(i2);
                        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i2))));
                        try {
                            PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                            if (TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "BUG: empty/null token!");
                                i3 = 1;
                            }
                            arrayList.add(purchaseHistoryRecord);
                            i2++;
                        } catch (JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got an exception trying to decode the purchase!", e);
                            billingClientImpl.zzf.zza(zzaq.zza(51, 11, zzat.zzj));
                            return new zzai(zzat.zzj, null);
                        }
                    }
                    if (i3 != 0) {
                        billingClientImpl.zzf.zza(zzaq.zza(26, 11, zzat.zzj));
                    }
                    str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                    com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                    if (TextUtils.isEmpty(str2)) {
                        return new zzai(zzat.zzl, arrayList);
                    }
                    i = 0;
                } else {
                    billingClientImpl.zzf.zza(zzaq.zza(zza.zzb(), 11, zza2));
                    return new zzai(zza2, null);
                }
            } catch (RemoteException e2) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                billingClientImpl.zzf.zza(zzaq.zza(59, 11, zzat.zzm));
                return new zzai(zzat.zzm, null);
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getPurchaseHistory is not supported on current device");
        return new zzai(zzat.zzq, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final AcknowledgePurchaseParams acknowledgePurchaseParams, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzaq.zza(2, 3, zzat.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzm);
        } else if (TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please provide a valid purchase token.");
            this.zzf.zza(zzaq.zza(26, 3, zzat.zzi));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzi);
        } else if (!this.zzn) {
            this.zzf.zza(zzaq.zza(27, 3, zzat.zzb));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzb);
        } else if (zzS(new Callable() { // from class: com.android.billingclient.api.zzp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzj(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzG(acknowledgePurchaseResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 3, zzQ));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzQ);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final ConsumeParams consumeParams, final ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzaq.zza(2, 4, zzat.zzm));
            consumeResponseListener.onConsumeResponse(zzat.zzm, consumeParams.getPurchaseToken());
        } else if (zzS(new Callable() { // from class: com.android.billingclient.api.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzk(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzn
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzI(consumeResponseListener, consumeParams);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 4, zzQ));
            consumeResponseListener.onConsumeResponse(zzQ, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        this.zzf.zzb(zzaq.zzb(12));
        try {
            this.zzd.zzd();
            if (this.zzh != null) {
                this.zzh.zzc();
            }
            if (this.zzh != null && this.zzg != null) {
                com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Unbinding from service.");
                this.zze.unbindService(this.zzh);
                this.zzh = null;
            }
            this.zzg = null;
            ExecutorService executorService = this.zzz;
            if (executorService != null) {
                executorService.shutdownNow();
                this.zzz = null;
            }
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "There was an exception while ending connection!", e);
        } finally {
            this.zza = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult isFeatureSupported(String str) {
        char c;
        if (!isReady()) {
            BillingResult billingResult = zzat.zzm;
            if (billingResult.getResponseCode() != 0) {
                this.zzf.zza(zzaq.zza(2, 5, billingResult));
            } else {
                this.zzf.zzb(zzaq.zzb(5));
            }
            return zzat.zzm;
        }
        int i = zzat.zzD;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals(BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals(BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals("ggg")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals(BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals(BillingClient.FeatureType.SUBSCRIPTIONS)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                BillingResult billingResult2 = this.zzi ? zzat.zzl : zzat.zzo;
                zzV(billingResult2, 9, 2);
                return billingResult2;
            case 1:
                BillingResult billingResult3 = this.zzj ? zzat.zzl : zzat.zzp;
                zzV(billingResult3, 10, 3);
                return billingResult3;
            case 2:
                BillingResult billingResult4 = this.zzm ? zzat.zzl : zzat.zzr;
                zzV(billingResult4, 35, 4);
                return billingResult4;
            case 3:
                BillingResult billingResult5 = this.zzp ? zzat.zzl : zzat.zzw;
                zzV(billingResult5, 30, 5);
                return billingResult5;
            case 4:
                BillingResult billingResult6 = this.zzr ? zzat.zzl : zzat.zzs;
                zzV(billingResult6, 31, 6);
                return billingResult6;
            case 5:
                BillingResult billingResult7 = this.zzq ? zzat.zzl : zzat.zzu;
                zzV(billingResult7, 21, 7);
                return billingResult7;
            case 6:
                BillingResult billingResult8 = this.zzs ? zzat.zzl : zzat.zzt;
                zzV(billingResult8, 19, 8);
                return billingResult8;
            case 7:
                BillingResult billingResult9 = this.zzs ? zzat.zzl : zzat.zzt;
                zzV(billingResult9, 61, 9);
                return billingResult9;
            case '\b':
                BillingResult billingResult10 = this.zzt ? zzat.zzl : zzat.zzv;
                zzV(billingResult10, 20, 10);
                return billingResult10;
            case '\t':
                BillingResult billingResult11 = this.zzu ? zzat.zzl : zzat.zzz;
                zzV(billingResult11, 32, 11);
                return billingResult11;
            case '\n':
                BillingResult billingResult12 = this.zzu ? zzat.zzl : zzat.zzA;
                zzV(billingResult12, 33, 12);
                return billingResult12;
            case 11:
                BillingResult billingResult13 = this.zzw ? zzat.zzl : zzat.zzC;
                zzV(billingResult13, 60, 13);
                return billingResult13;
            default:
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unsupported feature: ".concat(String.valueOf(str)));
                zzV(zzat.zzy, 34, 1);
                return zzat.zzy;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x043c  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BillingResult launchBillingFlow(Activity activity, final BillingFlowParams billingFlowParams) {
        final String productId;
        final String productType;
        String str;
        String str2;
        Future zzS;
        boolean z;
        String str3;
        SkuDetails skuDetails;
        BillingFlowParams.ProductDetailsParams productDetailsParams;
        String str4;
        String str5;
        String str6;
        boolean z2;
        Intent intent;
        String str7;
        int i;
        final int i2;
        BillingFlowParams.ProductDetailsParams productDetailsParams2;
        final BillingClientImpl billingClientImpl = this;
        if (!isReady()) {
            billingClientImpl.zzf.zza(zzaq.zza(2, 2, zzat.zzm));
            BillingResult billingResult = zzat.zzm;
            billingClientImpl.zzP(billingResult);
            return billingResult;
        }
        ArrayList<SkuDetails> zzg = billingFlowParams.zzg();
        List zzh = billingFlowParams.zzh();
        SkuDetails skuDetails2 = (SkuDetails) com.google.android.gms.internal.play_billing.zzz.zza(zzg, null);
        BillingFlowParams.ProductDetailsParams productDetailsParams3 = (BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzz.zza(zzh, null);
        if (skuDetails2 != null) {
            productId = skuDetails2.getSku();
            productType = skuDetails2.getType();
        } else {
            productId = productDetailsParams3.zza().getProductId();
            productType = productDetailsParams3.zza().getProductType();
        }
        if (!productType.equals("subs") || billingClientImpl.zzi) {
            if (!billingFlowParams.zzq() || billingClientImpl.zzl) {
                if (zzg.size() <= 1 || billingClientImpl.zzs) {
                    if (zzh.isEmpty() || billingClientImpl.zzt) {
                        if (billingClientImpl.zzl) {
                            boolean z3 = billingClientImpl.zzn;
                            boolean z4 = billingClientImpl.zzy;
                            String str8 = billingClientImpl.zzb;
                            final Bundle bundle = new Bundle();
                            bundle.putString("playBillingLibraryVersion", str8);
                            if (billingFlowParams.zzb() != 0) {
                                bundle.putInt("prorationMode", billingFlowParams.zzb());
                            } else if (billingFlowParams.zza() != 0) {
                                bundle.putInt("prorationMode", billingFlowParams.zza());
                            }
                            if (!TextUtils.isEmpty(billingFlowParams.zzc())) {
                                bundle.putString(BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzc());
                            }
                            if (!TextUtils.isEmpty(billingFlowParams.zzd())) {
                                bundle.putString("obfuscatedProfileId", billingFlowParams.zzd());
                            }
                            if (billingFlowParams.zzp()) {
                                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                            }
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                            }
                            if (!TextUtils.isEmpty(billingFlowParams.zze())) {
                                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zze());
                            }
                            String str9 = null;
                            if (!TextUtils.isEmpty(null)) {
                                bundle.putString("oldSkuPurchaseId", null);
                            }
                            if (!TextUtils.isEmpty(billingFlowParams.zzf())) {
                                bundle.putString("originalExternalTransactionId", billingFlowParams.zzf());
                                str9 = null;
                            }
                            if (!TextUtils.isEmpty(str9)) {
                                bundle.putString("paymentsPurchaseParams", str9);
                            }
                            if (z3) {
                                z = true;
                                bundle.putBoolean("enablePendingPurchases", true);
                            } else {
                                z = true;
                            }
                            if (z4) {
                                bundle.putBoolean("enableAlternativeBilling", z);
                            }
                            str = "BUY_INTENT";
                            final String str10 = productType;
                            if (!zzg.isEmpty()) {
                                ArrayList<String> arrayList = new ArrayList<>();
                                ArrayList<String> arrayList2 = new ArrayList<>();
                                str4 = productId;
                                ArrayList<String> arrayList3 = new ArrayList<>();
                                str3 = "proxyPackageVersion";
                                ArrayList<Integer> arrayList4 = new ArrayList<>();
                                str5 = "BillingClient";
                                ArrayList<String> arrayList5 = new ArrayList<>();
                                boolean z5 = false;
                                boolean z6 = false;
                                boolean z7 = false;
                                boolean z8 = false;
                                for (SkuDetails skuDetails3 : zzg) {
                                    if (skuDetails3.zzf().isEmpty()) {
                                        productDetailsParams2 = productDetailsParams3;
                                    } else {
                                        productDetailsParams2 = productDetailsParams3;
                                        arrayList.add(skuDetails3.zzf());
                                    }
                                    String zzc = skuDetails3.zzc();
                                    SkuDetails skuDetails4 = skuDetails2;
                                    String zzb = skuDetails3.zzb();
                                    int zza = skuDetails3.zza();
                                    String zze = skuDetails3.zze();
                                    arrayList2.add(zzc);
                                    z5 |= !TextUtils.isEmpty(zzc);
                                    arrayList3.add(zzb);
                                    z6 |= !TextUtils.isEmpty(zzb);
                                    arrayList4.add(Integer.valueOf(zza));
                                    z7 |= zza != 0;
                                    z8 |= !TextUtils.isEmpty(zze);
                                    arrayList5.add(zze);
                                    productDetailsParams3 = productDetailsParams2;
                                    skuDetails2 = skuDetails4;
                                }
                                skuDetails = skuDetails2;
                                productDetailsParams = productDetailsParams3;
                                if (!arrayList.isEmpty()) {
                                    bundle.putStringArrayList("skuDetailsTokens", arrayList);
                                }
                                if (z5) {
                                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
                                }
                                if (z6) {
                                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
                                }
                                if (z7) {
                                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4);
                                }
                                if (z8) {
                                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                }
                                if (zzg.size() > 1) {
                                    ArrayList<String> arrayList6 = new ArrayList<>(zzg.size() - 1);
                                    ArrayList<String> arrayList7 = new ArrayList<>(zzg.size() - 1);
                                    for (int i3 = 1; i3 < zzg.size(); i3++) {
                                        arrayList6.add(((SkuDetails) zzg.get(i3)).getSku());
                                        arrayList7.add(((SkuDetails) zzg.get(i3)).getType());
                                    }
                                    bundle.putStringArrayList("additionalSkus", arrayList6);
                                    bundle.putStringArrayList("additionalSkuTypes", arrayList7);
                                }
                            } else {
                                str3 = "proxyPackageVersion";
                                skuDetails = skuDetails2;
                                productDetailsParams = productDetailsParams3;
                                str4 = productId;
                                str5 = "BillingClient";
                                ArrayList<String> arrayList8 = new ArrayList<>(zzh.size() - 1);
                                ArrayList<String> arrayList9 = new ArrayList<>(zzh.size() - 1);
                                ArrayList<String> arrayList10 = new ArrayList<>();
                                ArrayList<String> arrayList11 = new ArrayList<>();
                                ArrayList<String> arrayList12 = new ArrayList<>();
                                for (int i4 = 0; i4 < zzh.size(); i4++) {
                                    BillingFlowParams.ProductDetailsParams productDetailsParams4 = (BillingFlowParams.ProductDetailsParams) zzh.get(i4);
                                    ProductDetails zza2 = productDetailsParams4.zza();
                                    if (!zza2.zzb().isEmpty()) {
                                        arrayList10.add(zza2.zzb());
                                    }
                                    arrayList11.add(productDetailsParams4.zzb());
                                    if (!TextUtils.isEmpty(zza2.zzc())) {
                                        arrayList12.add(zza2.zzc());
                                    }
                                    if (i4 > 0) {
                                        arrayList8.add(((BillingFlowParams.ProductDetailsParams) zzh.get(i4)).zza().getProductId());
                                        arrayList9.add(((BillingFlowParams.ProductDetailsParams) zzh.get(i4)).zza().getProductType());
                                    }
                                }
                                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList11);
                                if (!arrayList10.isEmpty()) {
                                    bundle.putStringArrayList("skuDetailsTokens", arrayList10);
                                }
                                if (!arrayList12.isEmpty()) {
                                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList12);
                                }
                                if (!arrayList8.isEmpty()) {
                                    bundle.putStringArrayList("additionalSkus", arrayList8);
                                    bundle.putStringArrayList("additionalSkuTypes", arrayList9);
                                }
                            }
                            billingClientImpl = this;
                            if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") || billingClientImpl.zzq) {
                                if (skuDetails == null || TextUtils.isEmpty(skuDetails.zzd())) {
                                    if (productDetailsParams != null && !TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                                        bundle.putString("skuPackageName", productDetailsParams.zza().zza());
                                    } else {
                                        str6 = null;
                                        z2 = false;
                                        if (!TextUtils.isEmpty(str6)) {
                                            bundle.putString("accountName", str6);
                                        }
                                        intent = activity.getIntent();
                                        if (intent != null) {
                                            str2 = str5;
                                            com.google.android.gms.internal.play_billing.zzb.zzj(str2, "Activity's intent is null.");
                                        } else {
                                            str2 = str5;
                                            if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                                bundle.putString("proxyPackage", stringExtra);
                                                try {
                                                    str7 = str3;
                                                    try {
                                                        bundle.putString(str7, billingClientImpl.zze.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                                    } catch (PackageManager.NameNotFoundException unused) {
                                                        bundle.putString(str7, "package not found");
                                                        if (!billingClientImpl.zzt) {
                                                        }
                                                        if (!billingClientImpl.zzr) {
                                                        }
                                                        if (billingClientImpl.zzn) {
                                                        }
                                                    }
                                                } catch (PackageManager.NameNotFoundException unused2) {
                                                    str7 = str3;
                                                }
                                            }
                                        }
                                        if (!billingClientImpl.zzt && !zzh.isEmpty()) {
                                            i = 17;
                                        } else if (!billingClientImpl.zzr && z2) {
                                            i = 15;
                                        } else if (billingClientImpl.zzn) {
                                            i2 = 9;
                                            final String str11 = str4;
                                            zzS = zzS(new Callable() { // from class: com.android.billingclient.api.zzs
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    return BillingClientImpl.this.zzc(i2, str11, str10, billingFlowParams, bundle);
                                                }
                                            }, 5000L, null, billingClientImpl.zzc);
                                        } else {
                                            i = 6;
                                        }
                                        i2 = i;
                                        final String str112 = str4;
                                        zzS = zzS(new Callable() { // from class: com.android.billingclient.api.zzs
                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                return BillingClientImpl.this.zzc(i2, str112, str10, billingFlowParams, bundle);
                                            }
                                        }, 5000L, null, billingClientImpl.zzc);
                                    }
                                } else {
                                    bundle.putString("skuPackageName", skuDetails.zzd());
                                }
                                str6 = null;
                                z2 = true;
                                if (!TextUtils.isEmpty(str6)) {
                                }
                                intent = activity.getIntent();
                                if (intent != null) {
                                }
                                if (!billingClientImpl.zzt) {
                                }
                                if (!billingClientImpl.zzr) {
                                }
                                if (billingClientImpl.zzn) {
                                }
                            } else {
                                billingClientImpl.zzf.zza(zzaq.zza(21, 2, zzat.zzu));
                                BillingResult billingResult2 = zzat.zzu;
                                billingClientImpl.zzP(billingResult2);
                                return billingResult2;
                            }
                        } else {
                            str = "BUY_INTENT";
                            str2 = "BillingClient";
                            zzS = zzS(new Callable() { // from class: com.android.billingclient.api.zzt
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return BillingClientImpl.this.zzd(productId, productType);
                                }
                            }, 5000L, null, billingClientImpl.zzc);
                        }
                        try {
                            Bundle bundle2 = (Bundle) zzS.get(5000L, TimeUnit.MILLISECONDS);
                            int zzb2 = com.google.android.gms.internal.play_billing.zzb.zzb(bundle2, str2);
                            String zzf = com.google.android.gms.internal.play_billing.zzb.zzf(bundle2, str2);
                            if (zzb2 != 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzj(str2, "Unable to buy item, Error response code: " + zzb2);
                                BillingResult.Builder newBuilder = BillingResult.newBuilder();
                                newBuilder.setResponseCode(zzb2);
                                newBuilder.setDebugMessage(zzf);
                                BillingResult build = newBuilder.build();
                                billingClientImpl.zzf.zza(zzaq.zza(3, 2, build));
                                billingClientImpl.zzP(build);
                                return build;
                            }
                            Intent intent2 = new Intent(activity, ProxyBillingActivity.class);
                            String str12 = str;
                            intent2.putExtra(str12, (PendingIntent) bundle2.getParcelable(str12));
                            activity.startActivity(intent2);
                            return zzat.zzl;
                        } catch (CancellationException e) {
                            e = e;
                            com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Time out while launching billing flow. Try to reconnect", e);
                            billingClientImpl.zzf.zza(zzaq.zza(4, 2, zzat.zzn));
                            BillingResult billingResult3 = zzat.zzn;
                            billingClientImpl.zzP(billingResult3);
                            return billingResult3;
                        } catch (TimeoutException e2) {
                            e = e2;
                            com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Time out while launching billing flow. Try to reconnect", e);
                            billingClientImpl.zzf.zza(zzaq.zza(4, 2, zzat.zzn));
                            BillingResult billingResult32 = zzat.zzn;
                            billingClientImpl.zzP(billingResult32);
                            return billingResult32;
                        } catch (Exception e3) {
                            com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Exception while launching billing flow. Try to reconnect", e3);
                            billingClientImpl.zzf.zza(zzaq.zza(5, 2, zzat.zzm));
                            BillingResult billingResult4 = zzat.zzm;
                            billingClientImpl.zzP(billingResult4);
                            return billingResult4;
                        }
                    }
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                    billingClientImpl.zzf.zza(zzaq.zza(20, 2, zzat.zzv));
                    BillingResult billingResult5 = zzat.zzv;
                    billingClientImpl.zzP(billingResult5);
                    return billingResult5;
                }
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Current client doesn't support multi-item purchases.");
                billingClientImpl.zzf.zza(zzaq.zza(19, 2, zzat.zzt));
                BillingResult billingResult6 = zzat.zzt;
                billingClientImpl.zzP(billingResult6);
                return billingResult6;
            }
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Current client doesn't support extra params for buy intent.");
            billingClientImpl.zzf.zza(zzaq.zza(18, 2, zzat.zzh));
            BillingResult billingResult7 = zzat.zzh;
            billingClientImpl.zzP(billingResult7);
            return billingResult7;
        }
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Current client doesn't support subscriptions.");
        billingClientImpl.zzf.zza(zzaq.zza(9, 2, zzat.zzo));
        BillingResult billingResult8 = zzat.zzo;
        billingClientImpl.zzP(billingResult8);
        return billingResult8;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final QueryProductDetailsParams queryProductDetailsParams, final ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzaq.zza(2, 7, zzat.zzm));
            productDetailsResponseListener.onProductDetailsResponse(zzat.zzm, new ArrayList());
        } else if (!this.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying product details is not supported.");
            this.zzf.zza(zzaq.zza(20, 7, zzat.zzv));
            productDetailsResponseListener.onProductDetailsResponse(zzat.zzv, new ArrayList());
        } else if (zzS(new Callable() { // from class: com.android.billingclient.api.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzl(queryProductDetailsParams, productDetailsResponseListener);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzl
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzJ(productDetailsResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 7, zzQ));
            productDetailsResponseListener.onProductDetailsResponse(zzQ, new ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(QueryPurchaseHistoryParams queryPurchaseHistoryParams, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzT(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(QueryPurchasesParams queryPurchasesParams, PurchasesResponseListener purchasesResponseListener) {
        zzU(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(SkuDetailsParams skuDetailsParams, final SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            this.zzf.zza(zzaq.zza(2, 8, zzat.zzm));
            skuDetailsResponseListener.onSkuDetailsResponse(zzat.zzm, null);
            return;
        }
        final String skuType = skuDetailsParams.getSkuType();
        final List<String> skusList = skuDetailsParams.getSkusList();
        if (TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please fix the input params. SKU type can't be empty.");
            this.zzf.zza(zzaq.zza(49, 8, zzat.zzf));
            skuDetailsResponseListener.onSkuDetailsResponse(zzat.zzf, null);
        } else if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            this.zzf.zza(zzaq.zza(48, 8, zzat.zze));
            skuDetailsResponseListener.onSkuDetailsResponse(zzat.zze, null);
        } else if (zzS(new Callable(skuType, skusList, null, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzj
            public final /* synthetic */ String zzb;
            public final /* synthetic */ List zzc;
            public final /* synthetic */ SkuDetailsResponseListener zzd;

            {
                this.zzd = skuDetailsResponseListener;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                BillingClientImpl.this.zzm(this.zzb, this.zzc, null, this.zzd);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzr
            @Override // java.lang.Runnable
            public final void run() {
                BillingClientImpl.this.zzM(skuDetailsResponseListener);
            }
        }, zzO()) == null) {
            BillingResult zzQ = zzQ();
            this.zzf.zza(zzaq.zza(25, 8, zzQ));
            skuDetailsResponseListener.onSkuDetailsResponse(zzQ, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final BillingResult showInAppMessages(final Activity activity, InAppMessageParams inAppMessageParams, InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service disconnected.");
            return zzat.zzm;
        } else if (!this.zzp) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Current client doesn't support showing in-app messages.");
            return zzat.zzw;
        } else {
            View findViewById = activity.findViewById(16908290);
            IBinder windowToken = findViewById.getWindowToken();
            Rect rect = new Rect();
            findViewById.getGlobalVisibleRect(rect);
            final Bundle bundle = new Bundle();
            BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
            bundle.putInt("KEY_DIMEN_LEFT", rect.left);
            bundle.putInt("KEY_DIMEN_TOP", rect.top);
            bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
            bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
            final zzaa zzaaVar = new zzaa(this, this.zzc, inAppMessageResponseListener);
            zzS(new Callable() { // from class: com.android.billingclient.api.zzv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BillingClientImpl.this.zzn(bundle, activity, zzaaVar);
                    return null;
                }
            }, 5000L, null, this.zzc);
            return zzat.zzl;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this.zzf.zza(zzaq.zza(24, 3, zzat.zzn));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(BillingResult billingResult) {
        if (this.zzd.zzc() != null) {
            this.zzd.zzc().onPurchasesUpdated(billingResult, null);
            return;
        }
        this.zzd.zzb();
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "No valid listener is set in BroadcastManager");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(ConsumeResponseListener consumeResponseListener, ConsumeParams consumeParams) {
        this.zzf.zza(zzaq.zza(24, 4, zzat.zzn));
        consumeResponseListener.onConsumeResponse(zzat.zzn, consumeParams.getPurchaseToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(ProductDetailsResponseListener productDetailsResponseListener) {
        this.zzf.zza(zzaq.zza(24, 7, zzat.zzn));
        productDetailsResponseListener.onProductDetailsResponse(zzat.zzn, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzK(PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.zzf.zza(zzaq.zza(24, 11, zzat.zzn));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzat.zzn, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzL(PurchasesResponseListener purchasesResponseListener) {
        this.zzf.zza(zzaq.zza(24, 9, zzat.zzn));
        purchasesResponseListener.onQueryPurchasesResponse(zzat.zzn, com.google.android.gms.internal.play_billing.zzu.zzk());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzM(SkuDetailsResponseListener skuDetailsResponseListener) {
        this.zzf.zza(zzaq.zza(24, 8, zzat.zzn));
        skuDetailsResponseListener.onSkuDetailsResponse(zzat.zzn, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzc(int i, String str, String str2, BillingFlowParams billingFlowParams, Bundle bundle) throws Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, null, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Bundle zzd(String str, String str2) throws Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzj(AcknowledgePurchaseParams acknowledgePurchaseParams, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws Exception {
        try {
            com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
            String packageName = this.zze.getPackageName();
            String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            String str = this.zzb;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle zzd = zzeVar.zzd(9, packageName, purchaseToken, bundle);
            int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(zzd, "BillingClient");
            String zzf = com.google.android.gms.internal.play_billing.zzb.zzf(zzd, "BillingClient");
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb);
            newBuilder.setDebugMessage(zzf);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(newBuilder.build());
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error acknowledge purchase!", e);
            this.zzf.zza(zzaq.zza(28, 3, zzat.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzat.zzm);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzk(ConsumeParams consumeParams, ConsumeResponseListener consumeResponseListener) throws Exception {
        int zza;
        String str;
        String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
                String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                String str2 = this.zzb;
                Bundle bundle = new Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                Bundle zze = zzeVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzb.zzf(zze, "BillingClient");
            } else {
                zza = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                str = "";
            }
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zza);
            newBuilder.setDebugMessage(str);
            BillingResult build = newBuilder.build();
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(build, purchaseToken);
                return null;
            }
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Error consuming purchase with token. Response code: " + zza);
            this.zzf.zza(zzaq.zza(23, 4, build));
            consumeResponseListener.onConsumeResponse(build, purchaseToken);
            return null;
        } catch (Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase!", e);
            this.zzf.zza(zzaq.zza(29, 4, zzat.zzm));
            consumeResponseListener.onConsumeResponse(zzat.zzm, purchaseToken);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzl(QueryProductDetailsParams queryProductDetailsParams, ProductDetailsResponseListener productDetailsResponseListener) throws Exception {
        String str;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzu zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                str = "";
                i = 0;
                break;
            }
            int i5 = i4 + 20;
            ArrayList arrayList2 = new ArrayList(zza.subList(i4, i5 > size ? size : i5));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(((QueryProductDetailsParams.Product) arrayList2.get(i6)).zza());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
                int i7 = true != this.zzw ? 17 : 20;
                String packageName = this.zze.getPackageName();
                String str2 = this.zzb;
                if (TextUtils.isEmpty(null)) {
                    this.zze.getPackageName();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str2);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                int size3 = arrayList2.size();
                com.google.android.gms.internal.play_billing.zzu zzuVar = zza;
                int i8 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i8 < size3) {
                    ArrayList arrayList6 = arrayList2;
                    arrayList4.add(null);
                    z |= !TextUtils.isEmpty(null);
                    int i9 = size3;
                    if (((QueryProductDetailsParams.Product) arrayList2.get(i8)).zzb().equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzm.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z2 = true;
                    }
                    i8++;
                    size3 = i9;
                    arrayList2 = arrayList6;
                }
                if (z) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z2 && !TextUtils.isEmpty(null)) {
                    bundle2.putString("accountName", null);
                }
                i3 = 7;
                try {
                    Bundle zzl = zzeVar.zzl(i7, packageName, zzb, bundle, bundle2);
                    str = "Item is unavailable for purchase.";
                    if (zzl != null) {
                        if (zzl.containsKey("DETAILS_LIST")) {
                            ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null) {
                                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                                    try {
                                        ProductDetails productDetails = new ProductDetails(stringArrayList.get(i10));
                                        com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Got product details: ".concat(productDetails.toString()));
                                        arrayList.add(productDetails);
                                    } catch (JSONException e) {
                                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e);
                                        zzar zzarVar = this.zzf;
                                        BillingResult.Builder newBuilder = BillingResult.newBuilder();
                                        i2 = 6;
                                        newBuilder.setResponseCode(6);
                                        str = "Error trying to decode SkuDetails.";
                                        newBuilder.setDebugMessage("Error trying to decode SkuDetails.");
                                        zzarVar.zza(zzaq.zza(47, 7, newBuilder.build()));
                                        i = i2;
                                        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
                                        newBuilder2.setResponseCode(i);
                                        newBuilder2.setDebugMessage(str);
                                        productDetailsResponseListener.onProductDetailsResponse(newBuilder2.build(), arrayList);
                                        return null;
                                    }
                                }
                                i4 = i5;
                                zza = zzuVar;
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "queryProductDetailsAsync got null response list");
                                this.zzf.zza(zzaq.zza(46, 7, zzat.zzB));
                                break;
                            }
                        } else {
                            i = com.google.android.gms.internal.play_billing.zzb.zzb(zzl, "BillingClient");
                            str = com.google.android.gms.internal.play_billing.zzb.zzf(zzl, "BillingClient");
                            if (i != 0) {
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                                this.zzf.zza(zzaq.zza(23, 7, zzat.zza(i, str)));
                            } else {
                                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                                zzar zzarVar2 = this.zzf;
                                BillingResult.Builder newBuilder3 = BillingResult.newBuilder();
                                newBuilder3.setResponseCode(6);
                                newBuilder3.setDebugMessage(str);
                                zzarVar2.zza(zzaq.zza(45, 7, newBuilder3.build()));
                                i = 6;
                            }
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        zzar zzarVar3 = this.zzf;
                        BillingResult.Builder newBuilder4 = BillingResult.newBuilder();
                        newBuilder4.setResponseCode(4);
                        newBuilder4.setDebugMessage("Item is unavailable for purchase.");
                        zzarVar3.zza(zzaq.zza(44, 7, newBuilder4.build()));
                        break;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i2 = 6;
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    this.zzf.zza(zzaq.zza(43, i3, zzat.zzj));
                    str = "An internal error occurred.";
                    i = i2;
                    BillingResult.Builder newBuilder22 = BillingResult.newBuilder();
                    newBuilder22.setResponseCode(i);
                    newBuilder22.setDebugMessage(str);
                    productDetailsResponseListener.onProductDetailsResponse(newBuilder22.build(), arrayList);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                i2 = 6;
                i3 = 7;
            }
        }
        i = 4;
        BillingResult.Builder newBuilder222 = BillingResult.newBuilder();
        newBuilder222.setResponseCode(i);
        newBuilder222.setDebugMessage(str);
        productDetailsResponseListener.onProductDetailsResponse(newBuilder222.build(), arrayList);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzm(String str, List list, String str2, SkuDetailsResponseListener skuDetailsResponseListener) throws Exception {
        String str3;
        int i;
        Bundle zzk;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str3 = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    com.google.android.gms.internal.play_billing.zze zzeVar = this.zzg;
                    String packageName = this.zze.getPackageName();
                    int i4 = this.zzk;
                    String str4 = this.zzb;
                    Bundle bundle2 = new Bundle();
                    if (i4 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str4);
                    }
                    if (i4 >= 9) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    zzk = zzeVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    zzk = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle);
                }
                str3 = "Item is unavailable for purchase.";
                if (zzk != null) {
                    if (zzk.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = zzk.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null) {
                            for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                                try {
                                    SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i5));
                                    com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                    arrayList.add(skuDetails);
                                } catch (JSONException e) {
                                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                                    str3 = "Error trying to decode SkuDetails.";
                                    this.zzf.zza(zzaq.zza(47, 8, zzat.zza(6, "Error trying to decode SkuDetails.")));
                                    arrayList = null;
                                    i = 6;
                                    BillingResult.Builder newBuilder = BillingResult.newBuilder();
                                    newBuilder.setResponseCode(i);
                                    newBuilder.setDebugMessage(str3);
                                    skuDetailsResponseListener.onSkuDetailsResponse(newBuilder.build(), arrayList);
                                    return null;
                                }
                            }
                            i2 = i3;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "querySkuDetailsAsync got null response list");
                            this.zzf.zza(zzaq.zza(46, 8, zzat.zzB));
                            break;
                        }
                    } else {
                        int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(zzk, "BillingClient");
                        str3 = com.google.android.gms.internal.play_billing.zzb.zzf(zzk, "BillingClient");
                        if (zzb != 0) {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getSkuDetails() failed. Response code: " + zzb);
                            this.zzf.zza(zzaq.zza(23, 8, zzat.zza(zzb, str3)));
                            i = zzb;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                            this.zzf.zza(zzaq.zza(45, 8, zzat.zza(6, str3)));
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "querySkuDetailsAsync got null sku details list");
                    this.zzf.zza(zzaq.zza(44, 8, zzat.zzB));
                    break;
                }
            } catch (Exception e2) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                this.zzf.zza(zzaq.zza(43, 8, zzat.zzm));
                str3 = "Service connection is disconnected.";
                i = -1;
                arrayList = null;
            }
        }
        arrayList = null;
        i = 4;
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(i);
        newBuilder2.setDebugMessage(str3);
        skuDetailsResponseListener.onSkuDetailsResponse(newBuilder2.build(), arrayList);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzn(Bundle bundle, Activity activity, ResultReceiver resultReceiver) throws Exception {
        this.zzg.zzm(12, this.zze.getPackageName(), bundle, new zzah(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzT(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(String str, PurchasesResponseListener purchasesResponseListener) {
        zzU(str, purchasesResponseListener);
    }

    private BillingClientImpl(Context context, zzbe zzbeVar, PurchasesUpdatedListener purchasesUpdatedListener, String str, String str2, AlternativeBillingListener alternativeBillingListener, zzar zzarVar) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, zzbeVar, alternativeBillingListener, str, null);
    }

    private BillingClientImpl(String str) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BillingClientImpl(String str, zzbe zzbeVar, Context context, zzaz zzazVar, zzar zzarVar) {
        this.zza = 0;
        this.zzc = new Handler(Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzR();
        this.zze = context.getApplicationContext();
        zzfl zzv = zzfm.zzv();
        zzv.zzj(zzR());
        zzv.zzi(this.zze.getPackageName());
        this.zzf = new zzaw(this.zze, (zzfm) zzv.zzc());
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new zzh(this.zze, null, this.zzf);
        this.zzx = zzbeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BillingClientImpl(String str, zzbe zzbeVar, Context context, PurchasesUpdatedListener purchasesUpdatedListener, AlternativeBillingListener alternativeBillingListener, zzar zzarVar) {
        this(context, zzbeVar, purchasesUpdatedListener, zzR(), null, alternativeBillingListener, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.zzf.zzb(zzaq.zzb(6));
            billingClientStateListener.onBillingSetupFinished(zzat.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            this.zzf.zza(zzaq.zza(37, 6, zzat.zzd));
            billingClientStateListener.onBillingSetupFinished(zzat.zzd);
        } else if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            this.zzf.zza(zzaq.zza(38, 6, zzat.zzm));
            billingClientStateListener.onBillingSetupFinished(zzat.zzm);
        } else {
            this.zza = 1;
            this.zzd.zze();
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Starting in-app billing setup.");
            this.zzh = new zzaf(this, billingClientStateListener, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                i = 41;
            } else {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                        i = 40;
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("playBillingLibraryVersion", this.zzb);
                        if (this.zze.bindService(intent2, this.zzh, 1)) {
                            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Service was bonded successfully.");
                            return;
                        } else {
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                            i = 39;
                        }
                    }
                }
            }
            this.zza = 0;
            com.google.android.gms.internal.play_billing.zzb.zzi("BillingClient", "Billing service unavailable on device.");
            this.zzf.zza(zzaq.zza(i, 6, zzat.zzc));
            billingClientStateListener.onBillingSetupFinished(zzat.zzc);
        }
    }
}
