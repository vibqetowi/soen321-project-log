package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzik extends zzf {
    protected zzij zza;
    final zzs zzb;
    protected boolean zzc;
    private zzhf zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private zzhb zzi;
    private final AtomicLong zzj;
    private long zzk;
    private final zzlo zzl;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzl = new zzhz(this);
        this.zzg = new AtomicReference();
        this.zzi = zzhb.zza;
        this.zzk = -1L;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z) {
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzab() {
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzY(App.TYPE, "_npa", null, this.zzt.zzax().currentTimeMillis());
            } else {
                zzY(App.TYPE, "_npa", Long.valueOf(true != ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(zza) ? 0L : 1L), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (!this.zzt.zzJ() || !this.zzc) {
            this.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
            this.zzt.zzt().zzI();
            return;
        }
        this.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzt.zzaB().zzp(new zzhn(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzv(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        boolean z;
        zzha[] zzhaVarArr = {zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzha zzhaVar = zzhaVarArr[i];
            if (!zzhbVar2.zzj(zzhaVar) && zzhbVar.zzj(zzhaVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zzn = zzhbVar.zzn(zzhbVar2, zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE);
        if (z || zzn) {
            zzikVar.zzt.zzh().zzo();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzik zzikVar, zzhb zzhbVar, long j, boolean z, boolean z2) {
        zzikVar.zzg();
        zzikVar.zza();
        zzhb zzc = zzikVar.zzt.zzm().zzc();
        if (j > zzikVar.zzk || !zzhb.zzk(zzc.zza(), zzhbVar.zza())) {
            zzfi zzm = zzikVar.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            int zza = zzhbVar.zza();
            if (zzm.zzl(zza)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("consent_settings", zzhbVar.zzi());
                edit.putInt("consent_source", zza);
                edit.apply();
                zzikVar.zzk = j;
                zzikVar.zzt.zzt().zzF(z);
                if (z2) {
                    zzikVar.zzt.zzt().zzu(new AtomicReference());
                    return;
                }
                return;
            }
            zzikVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzhbVar.zza()));
            return;
        }
        zzikVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzhbVar);
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzhu(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null || (obj instanceof String) || (obj instanceof Long) || (obj instanceof Double)) {
                if (zzlp.zzaj(str)) {
                    this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    zza.remove(str);
                } else {
                    zzlp zzv = this.zzt.zzv();
                    this.zzt.zzf();
                    if (zzv.zzab("param", str, 100, obj)) {
                        this.zzt.zzv().zzP(zza, str, obj);
                    }
                }
            } else {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzl, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            int i = 0;
            for (String str2 : new TreeSet(zza.keySet())) {
                i++;
                if (i > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzl, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 != FirebaseAnalytics.Event.SCREEN_VIEW && (str2 == null || !str2.equals(FirebaseAnalytics.Event.SCREEN_VIEW))) {
            boolean z3 = true;
            if (z2 && this.zzd != null && !zzlp.zzaj(str2)) {
                z3 = false;
            }
            zzM(str == null ? App.TYPE : str, str2, j, bundle2, z2, z3, z, null);
            return;
        }
        this.zzt.zzs().zzx(bundle2, j);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM("auto", str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzH(String str, String str2, long j, Bundle bundle) {
        zzg();
        zzI(str, str2, j, bundle, true, this.zzd == null || zzlp.zzaj(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        boolean zzb;
        String str4;
        ArrayList arrayList;
        long j2;
        Bundle[] bundleArr;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (this.zzt.zzJ()) {
            List zzn = this.zzt.zzh().zzn();
            if (zzn == null || zzn.contains(str2)) {
                if (!this.zzf) {
                    this.zzf = true;
                    try {
                        if (this.zzt.zzN()) {
                            cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                        } else {
                            cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader());
                        }
                        try {
                            cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.zzt.zzaw());
                        } catch (Exception e) {
                            this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                        }
                    } catch (ClassNotFoundException unused) {
                        this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
                    }
                }
                if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(str2) && bundle.containsKey("gclid")) {
                    this.zzt.zzay();
                    zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
                }
                this.zzt.zzay();
                if (z && zzlp.zzan(str2)) {
                    this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
                }
                if (!z3) {
                    this.zzt.zzay();
                    if (!"_iap".equals(str2)) {
                        zzlp zzv = this.zzt.zzv();
                        int i = 2;
                        if (zzv.zzad(NotificationCompat.CATEGORY_EVENT, str2)) {
                            if (zzv.zzaa(NotificationCompat.CATEGORY_EVENT, zzhc.zza, zzhc.zzb, str2)) {
                                zzv.zzt.zzf();
                                if (zzv.zzZ(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                                    i = 0;
                                }
                            } else {
                                i = 13;
                            }
                        }
                        if (i != 0) {
                            this.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                            zzlp zzv2 = this.zzt.zzv();
                            this.zzt.zzf();
                            this.zzt.zzv().zzO(this.zzl, null, i, "_ev", zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                    }
                }
                this.zzt.zzay();
                zzir zzj = this.zzt.zzs().zzj(false);
                if (zzj != null && !bundle.containsKey("_sc")) {
                    zzj.zzd = true;
                }
                zzlp.zzK(zzj, bundle, z && !z3);
                boolean equals = "am".equals(str);
                boolean zzaj = zzlp.zzaj(str2);
                if (!z || this.zzd == null || zzaj) {
                    z4 = equals;
                } else if (!equals) {
                    this.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                    Preconditions.checkNotNull(this.zzd);
                    this.zzd.interceptEvent(str, str2, bundle, j);
                    return;
                } else {
                    z4 = true;
                }
                if (this.zzt.zzM()) {
                    int zzh = this.zzt.zzv().zzh(str2);
                    if (zzh != 0) {
                        this.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                        zzlp zzv3 = this.zzt.zzv();
                        this.zzt.zzf();
                        this.zzt.zzv().zzO(this.zzl, str3, zzh, "_ev", zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                    String str5 = "_o";
                    Bundle zzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
                    Preconditions.checkNotNull(zzu);
                    this.zzt.zzay();
                    if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                        zzkn zzknVar = this.zzt.zzu().zzb;
                        long elapsedRealtime = zzknVar.zzc.zzt.zzax().elapsedRealtime();
                        long j3 = elapsedRealtime - zzknVar.zzb;
                        zzknVar.zzb = elapsedRealtime;
                        if (j3 > 0) {
                            this.zzt.zzv().zzI(zzu, j3);
                        }
                    }
                    zzos.zzc();
                    if (this.zzt.zzf().zzs(null, zzeg.zzae)) {
                        if ("auto".equals(str) || !"_ssr".equals(str2)) {
                            if ("_ae".equals(str2)) {
                                String zza = this.zzt.zzv().zzt.zzm().zzp.zza();
                                if (!TextUtils.isEmpty(zza)) {
                                    zzu.putString("_ffr", zza);
                                }
                            }
                        } else {
                            zzlp zzv4 = this.zzt.zzv();
                            String string = zzu.getString("_ffr");
                            if (Strings.isEmptyOrWhitespace(string)) {
                                string = null;
                            } else if (string != null) {
                                string = string.trim();
                            }
                            if (!zzln.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                                zzv4.zzt.zzm().zzp.zzb(string);
                            } else {
                                zzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                                return;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(zzu);
                    if (!this.zzt.zzf().zzs(null, zzeg.zzaG)) {
                        zzb = this.zzt.zzm().zzm.zzb();
                    } else {
                        zzb = this.zzt.zzu().zzo();
                    }
                    if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j) && zzb) {
                        this.zzt.zzaA().zzj().zza("Current session is expired, remove the session number, ID, and engagement time");
                        arrayList = arrayList2;
                        j2 = 0;
                        str4 = "_ae";
                        zzY("auto", "_sid", null, this.zzt.zzax().currentTimeMillis());
                        zzY("auto", "_sno", null, this.zzt.zzax().currentTimeMillis());
                        zzY("auto", "_se", null, this.zzt.zzax().currentTimeMillis());
                        this.zzt.zzm().zzk.zzb(0L);
                    } else {
                        str4 = "_ae";
                        arrayList = arrayList2;
                        j2 = 0;
                    }
                    if (zzu.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                        this.zzt.zzaA().zzj().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                        this.zzt.zzu().zza.zzb(j, true);
                    }
                    ArrayList arrayList3 = new ArrayList(zzu.keySet());
                    Collections.sort(arrayList3);
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str6 = (String) arrayList3.get(i2);
                        if (str6 != null) {
                            this.zzt.zzv();
                            Object obj = zzu.get(str6);
                            if (obj instanceof Bundle) {
                                bundleArr = new Bundle[]{(Bundle) obj};
                            } else if (obj instanceof Parcelable[]) {
                                Parcelable[] parcelableArr = (Parcelable[]) obj;
                                bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                            } else if (obj instanceof ArrayList) {
                                ArrayList arrayList4 = (ArrayList) obj;
                                bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                            } else {
                                bundleArr = null;
                            }
                            if (bundleArr != null) {
                                zzu.putParcelableArray(str6, bundleArr);
                            }
                        }
                    }
                    int i3 = 0;
                    while (i3 < arrayList.size()) {
                        ArrayList arrayList5 = arrayList;
                        Bundle bundle2 = (Bundle) arrayList5.get(i3);
                        String str7 = i3 != 0 ? "_ep" : str2;
                        bundle2.putString(str5, str);
                        if (z2) {
                            bundle2 = this.zzt.zzv().zzt(bundle2);
                        }
                        Bundle bundle3 = bundle2;
                        String str8 = str5;
                        this.zzt.zzt().zzA(new zzau(str7, new zzas(bundle3), str, j), str3);
                        if (!z4) {
                            for (zzhg zzhgVar : this.zze) {
                                zzhgVar.onEvent(str, str2, new Bundle(bundle3), j);
                            }
                        }
                        i3++;
                        arrayList = arrayList5;
                        str5 = str8;
                    }
                    this.zzt.zzay();
                    if (this.zzt.zzs().zzj(false) == null || !str4.equals(str2)) {
                        return;
                    }
                    this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
                    return;
                }
                return;
            }
            this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.add(zzhgVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhs(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzL(long j, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkp zzu = this.zzt.zzu();
        zzu.zzg();
        zzko zzkoVar = zzu.zza;
        zzu.zzb.zza();
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfi zzm = this.zzt.zzm();
        zzm.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzph.zzc();
        if (zzm.zzt.zzf().zzs(null, zzeg.zzaf)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z) {
            this.zzt.zzt().zzC();
        }
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    final void zzN(String str, String str2, long j, Object obj) {
        this.zzt.zzaB().zzp(new zzhq(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzt.zzaA().zzk().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, "origin", String.class, null);
        zzgz.zza(bundle2, "name", String.class, null);
        zzgz.zza(bundle2, "value", Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzt.zzv().zzl(string) == 0) {
            if (this.zzt.zzv().zzd(string, obj) == 0) {
                Object zzB = this.zzt.zzv().zzB(string, obj);
                if (zzB == null) {
                    this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
                    return;
                }
                zzgz.zzb(bundle2, zzB);
                long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
                if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                    this.zzt.zzf();
                    if (j2 > 15552000000L || j2 < 1) {
                        this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j2));
                        return;
                    }
                }
                long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                this.zzt.zzf();
                if (j3 > 15552000000L || j3 < 1) {
                    this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j3));
                    return;
                } else {
                    this.zzt.zzaB().zzp(new zzht(this, bundle2));
                    return;
                }
            }
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
    }

    public final void zzR(zzhb zzhbVar, long j) {
        zzhb zzhbVar2;
        boolean z;
        zzhb zzhbVar3;
        boolean z2;
        boolean z3;
        zza();
        int zza = zzhbVar.zza();
        if (zza == -10 || zzhbVar.zzf() != null || zzhbVar.zzg() != null) {
            synchronized (this.zzh) {
                zzhbVar2 = this.zzi;
                z = false;
                if (zzhb.zzk(zza, zzhbVar2.zza())) {
                    z3 = zzhbVar.zzm(this.zzi);
                    if (zzhbVar.zzj(zzha.ANALYTICS_STORAGE) && !this.zzi.zzj(zzha.ANALYTICS_STORAGE)) {
                        z = true;
                    }
                    zzhb zze = zzhbVar.zze(this.zzi);
                    this.zzi = zze;
                    zzhbVar3 = zze;
                    z2 = z;
                    z = true;
                } else {
                    zzhbVar3 = zzhbVar;
                    z2 = false;
                    z3 = false;
                }
            }
            if (!z) {
                this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzhbVar3);
                return;
            }
            long andIncrement = this.zzj.getAndIncrement();
            if (z3) {
                this.zzg.set(null);
                this.zzt.zzaB().zzq(new zzif(this, zzhbVar3, j, andIncrement, z2, zzhbVar2));
                return;
            }
            zzig zzigVar = new zzig(this, zzhbVar3, andIncrement, z2, zzhbVar2);
            if (zza == 30 || zza == -10) {
                this.zzt.zzaB().zzq(zzigVar);
                return;
            } else {
                this.zzt.zzaB().zzp(zzigVar);
                return;
            }
        }
        this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
    }

    public final void zzS(Bundle bundle, int i, long j) {
        zza();
        String zzh = zzhb.zzh(bundle);
        if (zzh != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", zzh);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzR(zzhb.zzb(bundle, i), j);
    }

    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.zzd)) {
            Preconditions.checkState(zzhfVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzie(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzV(zzhb zzhbVar) {
        zzg();
        boolean z = (zzhbVar.zzj(zzha.ANALYTICS_STORAGE) && zzhbVar.zzj(zzha.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Long l;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (!TextUtils.isEmpty(str4)) {
                    Long valueOf = Long.valueOf(true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    this.zzt.zzm().zzh.zzb(valueOf.longValue() == 1 ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
                    l = valueOf;
                    obj2 = l;
                    str3 = "_npa";
                    if (!this.zzt.zzJ()) {
                        this.zzt.zzaA().zzj().zza("User property not set since app measurement is disabled");
                        return;
                    } else if (this.zzt.zzM()) {
                        this.zzt.zzt().zzK(new zzlk(str3, j, obj2, str));
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (obj == null) {
                this.zzt.zzm().zzh.zzb("unset");
                l = obj;
                obj2 = l;
                str3 = "_npa";
                if (!this.zzt.zzJ()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.zzt.zzJ()) {
        }
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.remove(zzhgVar)) {
            return;
        }
        this.zzt.zzaA().zzk().zza("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, "boolean test flag value", new zzhw(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, "double test flag value", new zzid(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, "int test flag value", new zzic(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, "long test flag value", new zzib(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, "String test flag value", new zzia(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (!this.zzt.zzaB().zzs()) {
            this.zzt.zzay();
            if (zzab.zza()) {
                this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
                return new ArrayList(0);
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzhv(this, atomicReference, null, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
                return new ArrayList();
            }
            return zzlp.zzH(list);
        }
        this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
        return new ArrayList(0);
    }

    public final List zzt(boolean z) {
        zza();
        this.zzt.zzaA().zzj().zza("Getting user properties (FE)");
        if (!this.zzt.zzaB().zzs()) {
            this.zzt.zzay();
            if (zzab.zza()) {
                this.zzt.zzaA().zzd().zza("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhr(this, atomicReference, z));
            List list = (List) atomicReference.get();
            if (list == null) {
                this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            return list;
        }
        this.zzt.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (!this.zzt.zzaB().zzs()) {
            this.zzt.zzay();
            if (zzab.zza()) {
                this.zzt.zzaA().zzd().zza("Cannot get user properties from main thread");
                return Collections.emptyMap();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhx(this, atomicReference, null, str, str2, z));
            List<zzlk> list = (List) atomicReference.get();
            if (list == null) {
                this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzlk zzlkVar : list) {
                Object zza = zzlkVar.zza();
                if (zza != null) {
                    arrayMap.put(zzlkVar.zzb, zza);
                }
            }
            return arrayMap;
        }
        this.zzt.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
        return Collections.emptyMap();
    }

    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = zzik.this;
                            zzikVar.zzg();
                            if (!zzikVar.zzt.zzm().zzn.zzb()) {
                                long zza = zzikVar.zzt.zzm().zzo.zza();
                                zzikVar.zzt.zzm().zzo.zzb(1 + zza);
                                zzikVar.zzt.zzf();
                                if (zza >= 5) {
                                    zzikVar.zzt.zzaA().zzk().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    zzikVar.zzt.zzm().zzn.zza(true);
                                    return;
                                }
                                zzikVar.zzt.zzE();
                                return;
                            }
                            zzikVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzm = this.zzt.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int i;
        int i2;
        if (!z) {
            zzlp zzv = this.zzt.zzv();
            if (zzv.zzad("user property", str2)) {
                if (zzv.zzaa("user property", zzhe.zza, null, str2)) {
                    zzv.zzt.zzf();
                    if (zzv.zzZ("user property", 24, str2)) {
                        i = 0;
                        if (i != 0) {
                            zzlp zzv2 = this.zzt.zzv();
                            this.zzt.zzf();
                            this.zzt.zzv().zzO(this.zzl, null, i, "_ev", zzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
                            return;
                        }
                        String str3 = str == null ? App.TYPE : str;
                        if (obj != null) {
                            int zzd = this.zzt.zzv().zzd(str2, obj);
                            if (zzd == 0) {
                                Object zzB = this.zzt.zzv().zzB(str2, obj);
                                if (zzB != null) {
                                    zzN(str3, str2, j, zzB);
                                    return;
                                }
                                return;
                            }
                            zzlp zzv3 = this.zzt.zzv();
                            this.zzt.zzf();
                            String zzD = zzv3.zzD(str2, 24, true);
                            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                                r1 = obj.toString().length();
                            }
                            this.zzt.zzv().zzO(this.zzl, null, zzd, "_ev", zzD, r1);
                            return;
                        }
                        zzN(str3, str2, j, null);
                        return;
                    }
                } else {
                    i2 = 15;
                }
            }
            i = 6;
            if (i != 0) {
            }
        } else {
            i2 = this.zzt.zzv().zzl(str2);
        }
        i = i2;
        if (i != 0) {
        }
    }
}
