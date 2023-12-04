package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzos;
import com.google.firebase.messaging.Constants;
import com.ifriend.analytics.AnalyticsConstants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgd implements zzgy {
    private static volatile zzgd zzd;
    private zzek zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;
    protected Boolean zza;
    protected Boolean zzb;
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfi zzl;
    private final zzet zzm;
    private final zzga zzn;
    private final zzkp zzo;
    private final zzlp zzp;
    private final zzeo zzq;
    private final Clock zzr;
    private final zziz zzs;
    private final zzik zzt;
    private final zzd zzu;
    private final zzio zzv;
    private final String zzw;
    private zzem zzx;
    private zzjz zzy;
    private zzao zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    zzgd(zzhi zzhiVar) {
        long currentTimeMillis;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(zzhiVar);
        Context context = zzhiVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzed.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhiVar.zzb;
        this.zzg = zzhiVar.zzc;
        this.zzh = zzhiVar.zzd;
        this.zzi = zzhiVar.zzh;
        this.zzE = zzhiVar.zze;
        this.zzw = zzhiVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhiVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l = zzhiVar.zzi;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zzc = currentTimeMillis;
        this.zzk = new zzag(this);
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzw();
        this.zzl = zzfiVar;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.zzm = zzetVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzw();
        this.zzp = zzlpVar;
        this.zzq = new zzeo(new zzhh(zzhiVar, this));
        this.zzu = new zzd(this);
        zziz zzizVar = new zziz(this);
        zzizVar.zzb();
        this.zzs = zzizVar;
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.zzt = zzikVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzb();
        this.zzo = zzkpVar;
        zzio zzioVar = new zzio(this);
        zzioVar.zzw();
        this.zzv = zzioVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.zzn = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhiVar.zzg;
        z = (zzclVar2 == null || zzclVar2.zzb == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            zzik zzq = zzq();
            if (zzq.zzt.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzq.zzt.zze.getApplicationContext();
                if (zzq.zza == null) {
                    zzq.zza = new zzij(zzq);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzq.zza);
                    application.registerActivityLifecycleCallbacks(zzq.zza);
                    zzq.zzt.zzaA().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzaA().zzk().zza("Application context is not an Application");
        }
        zzgaVar.zzp(new zzgc(this, zzhiVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzA(zzgd zzgdVar, zzhi zzhiVar) {
        zzgdVar.zzaB().zzg();
        zzgdVar.zzk.zzn();
        zzao zzaoVar = new zzao(zzgdVar);
        zzaoVar.zzw();
        zzgdVar.zzz = zzaoVar;
        zzek zzekVar = new zzek(zzgdVar, zzhiVar.zzf);
        zzekVar.zzb();
        zzgdVar.zzA = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.zzx = zzemVar;
        zzjz zzjzVar = new zzjz(zzgdVar);
        zzjzVar.zzb();
        zzgdVar.zzy = zzjzVar;
        zzgdVar.zzp.zzx();
        zzgdVar.zzl.zzx();
        zzgdVar.zzA.zzc();
        zzer zzi = zzgdVar.zzaA().zzi();
        zzgdVar.zzk.zzh();
        zzi.zzb("App measurement initialized, version", 79000L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.zzf)) {
            if (zzgdVar.zzv().zzaf(zzl)) {
                zzgdVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgdVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(zzl)));
            }
        }
        zzgdVar.zzaA().zzc().zza("Debug-level message logging enabled");
        if (zzgdVar.zzG != zzgdVar.zzH.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.zzG), Integer.valueOf(zzgdVar.zzH.get()));
        }
        zzgdVar.zzB = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgw zzgwVar) {
        if (zzgwVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar != null) {
            if (!zzfVar.zze()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzfVar.getClass()))));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static final void zzR(zzgx zzgxVar) {
        if (zzgxVar != null) {
            if (!zzgxVar.zzy()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(String.valueOf(zzgxVar.getClass()))));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzgd zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzgd.class) {
                if (zzd == null) {
                    zzd = new zzgd(new zzhi(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzC(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            zzm().zzn.zza(true);
            if (bArr == null || bArr.length == 0) {
                zzaA().zzc().zza("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble(AnalyticsConstants.TIMESTAMP, 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    zzaA().zzc().zza("Deferred Deep Link is empty.");
                    return;
                }
                zzlp zzv = zzv();
                zzgd zzgdVar = zzv.zzt;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzv.zzt.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.zzt.zzG("auto", Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
                    zzlp zzv2 = zzv();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = zzv2.zzt.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong(AnalyticsConstants.TIMESTAMP, Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            zzv2.zzt.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        zzv2.zzt.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e);
                        return;
                    }
                }
                zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzD() {
        this.zzG++;
    }

    public final void zzE() {
        zzaB().zzg();
        zzR(zzr());
        String zzl = zzh().zzl();
        Pair zzb = zzm().zzb(zzl);
        if (!this.zzk.zzr() || ((Boolean) zzb.second).booleanValue() || TextUtils.isEmpty((CharSequence) zzb.first)) {
            zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzio zzr = zzr();
        zzr.zzv();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzr.zzt.zze.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            zzaA().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlp zzv = zzv();
        zzh().zzt.zzk.zzh();
        URL zzE = zzv.zzE(79000L, zzl, (String) zzb.first, zzm().zzo.zza() - 1);
        if (zzE != null) {
            zzio zzr2 = zzr();
            zzgb zzgbVar = new zzgb(this);
            zzr2.zzg();
            zzr2.zzv();
            Preconditions.checkNotNull(zzE);
            Preconditions.checkNotNull(zzgbVar);
            zzr2.zzt.zzaB().zzo(new zzin(zzr2, zzl, zzE, null, null, zzgbVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzF(boolean z) {
        this.zzE = Boolean.valueOf(z);
    }

    public final void zzG(boolean z) {
        zzaB().zzg();
        this.zzF = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
        if (r8.zzl() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzhb zzhbVar;
        zzaB().zzg();
        zzhb zzc = zzm().zzc();
        int zza = zzc.zza();
        zzag zzagVar = this.zzk;
        zzgd zzgdVar = zzagVar.zzt;
        Boolean zzk = zzagVar.zzk("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.zzk;
        zzgd zzgdVar2 = zzagVar2.zzt;
        Boolean zzk2 = zzagVar2.zzk("google_analytics_default_allow_analytics_storage");
        if ((zzk != null || zzk2 != null) && zzm().zzl(-10)) {
            zzhbVar = new zzhb(zzk, zzk2, -10);
        } else {
            if (TextUtils.isEmpty(zzh().zzm()) || (zza != 0 && zza != 30 && zza != 10 && zza != 30 && zza != 30 && zza != 40)) {
                if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                    zzhbVar = zzhb.zzb(zzclVar.zzg, 30);
                }
            } else {
                zzq().zzR(new zzhb(null, null, -10), this.zzc);
            }
            zzhbVar = null;
        }
        if (zzhbVar != null) {
            zzq().zzR(zzhbVar, this.zzc);
            zzc = zzhbVar;
        }
        zzq().zzV(zzc);
        if (zzm().zzc.zza() == 0) {
            zzaA().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (zzM()) {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzlp zzv = zzv();
                String zzm = zzh().zzm();
                zzfi zzm2 = zzm();
                zzm2.zzg();
                String string = zzm2.zza().getString("gmp_app_id", null);
                String zzk3 = zzh().zzk();
                zzfi zzm3 = zzm();
                zzm3.zzg();
                if (zzv.zzao(zzm, string, zzk3, zzm3.zza().getString("admob_app_id", null))) {
                    zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfi zzm4 = zzm();
                    zzm4.zzg();
                    Boolean zzd2 = zzm4.zzd();
                    SharedPreferences.Editor edit = zzm4.zza().edit();
                    edit.clear();
                    edit.apply();
                    if (zzd2 != null) {
                        zzm4.zzh(zzd2);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfi zzm5 = zzm();
                String zzm6 = zzh().zzm();
                zzm5.zzg();
                SharedPreferences.Editor edit2 = zzm5.zza().edit();
                edit2.putString("gmp_app_id", zzm6);
                edit2.apply();
                zzfi zzm7 = zzm();
                String zzk4 = zzh().zzk();
                zzm7.zzg();
                SharedPreferences.Editor edit3 = zzm7.zza().edit();
                edit3.putString("admob_app_id", zzk4);
                edit3.apply();
            }
            if (!zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzO(zzm().zze.zza());
            zzos.zzc();
            if (this.zzk.zzs(null, zzeg.zzae)) {
                try {
                    zzv().zzt.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzp.zza())) {
                        zzaA().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzp.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zzJ);
                }
                if (zzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzs.zza());
            }
        } else if (zzJ()) {
            if (!zzv().zzae("android.permission.INTERNET")) {
                zzaA().zzd().zza("App is missing INTERNET permission");
            }
            if (!zzv().zzae("android.permission.ACCESS_NETWORK_STATE")) {
                zzaA().zzd().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                if (!zzlp.zzal(this.zze)) {
                    zzaA().zzd().zza("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlp.zzam(this.zze, false)) {
                    zzaA().zzd().zza("AppMeasurementService not registered/enabled");
                }
            }
            zzaA().zzd().zza("Uploading is not possible. App measurement disabled");
        }
        zzm().zzi.zza(true);
    }

    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    public final boolean zzJ() {
        return zza() == 0;
    }

    public final boolean zzK() {
        zzaB().zzg();
        return this.zzF;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzM() {
        if (this.zzB) {
            zzaB().zzg();
            Boolean bool = this.zzC;
            if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
                this.zzD = this.zzr.elapsedRealtime();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(zzv().zzae("android.permission.INTERNET") && zzv().zzae("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlp.zzal(this.zze) && zzlp.zzam(this.zze, false))));
                this.zzC = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzv().zzY(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                        z = false;
                    }
                    this.zzC = Boolean.valueOf(z);
                }
            }
            return this.zzC.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    public final boolean zzN() {
        return this.zzi;
    }

    public final int zza() {
        zzaB().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            zzaB().zzg();
            if (this.zzF) {
                Boolean zzd2 = zzm().zzd();
                if (zzd2 != null) {
                    return zzd2.booleanValue() ? 0 : 3;
                }
                zzag zzagVar = this.zzk;
                zzab zzabVar = zzagVar.zzt.zzj;
                Boolean zzk = zzagVar.zzk("firebase_analytics_collection_enabled");
                if (zzk != null) {
                    return zzk.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.zza;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzet zzaA() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzga zzaB() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Context zzaw() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Clock zzax() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzab zzay() {
        return this.zzj;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.zzk;
    }

    @Pure
    public final zzao zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzek zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    @Pure
    public final zzem zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzeo zzj() {
        return this.zzq;
    }

    public final zzet zzl() {
        zzet zzetVar = this.zzm;
        if (zzetVar == null || !zzetVar.zzy()) {
            return null;
        }
        return zzetVar;
    }

    @Pure
    public final zzfi zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SideEffectFree
    public final zzga zzo() {
        return this.zzn;
    }

    @Pure
    public final zzik zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzio zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    @Pure
    public final zziz zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    @Pure
    public final zzjz zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzkp zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    @Pure
    public final zzlp zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzg;
    }

    @Pure
    public final String zzy() {
        return this.zzh;
    }

    @Pure
    public final String zzz() {
        return this.zzw;
    }
}
