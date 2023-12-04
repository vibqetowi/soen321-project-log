package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlp extends zzgx {
    private static final String[] zza = {"firebase_", "google_", "ga_"};
    private static final String[] zzb = {"_err"};
    private SecureRandom zzc;
    private final AtomicLong zzd;
    private int zze;
    private Integer zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlp(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzf = null;
        this.zzd = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest zzF() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList zzH(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzac zzacVar = (zzac) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzacVar.zza);
            bundle.putString("origin", zzacVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzacVar.zzd);
            bundle.putString("name", zzacVar.zzc.zzb);
            zzgz.zzb(bundle, Preconditions.checkNotNull(zzacVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzacVar.zze);
            String str = zzacVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzau zzauVar = zzacVar.zzg;
            if (zzauVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzauVar.zza);
                zzas zzasVar = zzauVar.zzb;
                if (zzasVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzasVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzacVar.zzh);
            zzau zzauVar2 = zzacVar.zzi;
            if (zzauVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzauVar2.zza);
                zzas zzasVar2 = zzauVar2.zzb;
                if (zzasVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzasVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzacVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzacVar.zzj);
            zzau zzauVar3 = zzacVar.zzk;
            if (zzauVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzauVar3.zza);
                zzas zzasVar3 = zzauVar3.zzb;
                if (zzasVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzasVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void zzK(zzir zzirVar, Bundle bundle, boolean z) {
        if (bundle != null && zzirVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzirVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzirVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzirVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzirVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzaj(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzak(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzal(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzam(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return zzav(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return zzav(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean zzan(String str) {
        return !zzb[0].equals(str);
    }

    static final boolean zzaq(Bundle bundle, int i) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    static final boolean zzar(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzas(String str) {
        if ("_ldl".equals(str)) {
            this.zzt.zzf();
            return 2048;
        } else if ("_id".equals(str)) {
            this.zzt.zzf();
            return 256;
        } else if (!"_lgclid".equals(str)) {
            this.zzt.zzf();
            return 36;
        } else {
            this.zzt.zzf();
            return 100;
        }
    }

    private final Object zzat(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zzD(obj.toString(), i, z);
            }
            if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle zzt = zzt((Bundle) parcelable);
                        if (!zzt.isEmpty()) {
                            arrayList.add(zzt);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
    }

    private static boolean zzau(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzln.zza(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzav(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i = 0;
        Preconditions.checkState(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzA(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.zzt.zzf();
            return zzat(256, obj, true, true);
        }
        if (!zzaj(str)) {
            this.zzt.zzf();
            i = 100;
        } else {
            this.zzt.zzf();
        }
        return zzat(i, obj, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object zzB(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return zzat(zzas(str), obj, true, false);
        }
        return zzat(zzas(str), obj, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzC() {
        byte[] bArr = new byte[16];
        zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzD(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
            return null;
        }
        return str;
    }

    public final URL zzE(long j, String str, String str2, long j2) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 79000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j2));
            if (str.equals(this.zzt.zzf().zzm())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.zzt.zzaA().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom zzG() {
        zzg();
        if (this.zzc == null) {
            this.zzc = new SecureRandom();
        }
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzI(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.zzt.zzaA().zzk().zzb("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    final void zzJ(Bundle bundle, int i, String str, String str2, Object obj) {
        if (zzaq(bundle, i)) {
            this.zzt.zzf();
            bundle.putString("_ev", zzD(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzL(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzt.zzv().zzP(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzM(Parcelable[] parcelableArr, int i, boolean z) {
        Preconditions.checkNotNull(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (zzak(str) && !zzau(str, zzhd.zzd) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        this.zzt.zzaA().zze().zzc("Param cannot contain item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 23);
                    } else {
                        this.zzt.zzaA().zze().zzc("Param can't contain more than " + i + " item-scoped custom parameters", this.zzt.zzj().zze(str), this.zzt.zzj().zzb(bundle));
                        zzaq(bundle, 28);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzN(zzeu zzeuVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(zzeuVar.zzd.keySet())) {
            if (zzak(str) && (i2 = i2 + 1) > i) {
                this.zzt.zzaA().zze().zzc("Event can't contain more than " + i + " params", this.zzt.zzj().zzd(zzeuVar.zza), this.zzt.zzj().zzb(zzeuVar.zzd));
                zzaq(zzeuVar.zzd, 5);
                zzeuVar.zzd.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzO(zzlo zzloVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        zzaq(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        zzloVar.zza(str, "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzP(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzt.zzaA().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzt.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning boolean value to wrapper", e);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle list to wrapper", e);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning byte array to wrapper", e);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning int value to wrapper", e);
        }
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning long value to wrapper", e);
        }
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.zzt.zzaA().zzk().zzb("Error returning string value to wrapper", e);
        }
    }

    final void zzX(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int i2;
        int zza2;
        int i3;
        String str5;
        if (bundle == null) {
            return;
        }
        zzag zzf = this.zzt.zzf();
        zzpq.zzc();
        String str6 = null;
        int i4 = (zzf.zzt.zzf().zzs(null, zzeg.zzaz) && zzf.zzt.zzv().zzai(231100000, true)) ? 35 : 0;
        int i5 = 0;
        for (String str7 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str7)) {
                int zzj = !z ? zzj(str7) : 0;
                if (zzj == 0) {
                    zzj = zzi(str7);
                }
                i = zzj;
            } else {
                i = 0;
            }
            if (i != 0) {
                zzJ(bundle, i, str7, str7, i == 3 ? str7 : str6);
                bundle.remove(str7);
                i3 = i4;
                str5 = str6;
            } else {
                if (zzag(bundle.get(str7))) {
                    this.zzt.zzaA().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str7);
                    zza2 = 22;
                    str4 = str7;
                    i2 = i4;
                } else {
                    str4 = str7;
                    i2 = i4;
                    zza2 = zza(str, str2, str7, bundle.get(str7), bundle, list, z, false);
                }
                if (zza2 == 0 || "_ev".equals(str4)) {
                    if (zzak(str4) && !zzau(str4, zzhd.zzd)) {
                        int i6 = i5 + 1;
                        if (zzai(231100000, true)) {
                            i3 = i2;
                            if (i6 > i3) {
                                zzpq.zzc();
                                str5 = null;
                                if (!this.zzt.zzf().zzs(null, zzeg.zzaz)) {
                                    this.zzt.zzaA().zze().zzc("Item cannot contain custom parameters", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                    zzaq(bundle, 23);
                                    bundle.remove(str4);
                                } else {
                                    this.zzt.zzaA().zze().zzc("Item can't contain more than " + i3 + " item-scoped custom params", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                    zzaq(bundle, 28);
                                    bundle.remove(str4);
                                }
                                i5 = i6;
                            }
                        } else {
                            this.zzt.zzaA().zze().zzc("Item array not supported on client's version of Google Play Services (Android Only)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                            zzaq(bundle, 23);
                            bundle.remove(str4);
                            i3 = i2;
                        }
                        str5 = null;
                        i5 = i6;
                    }
                } else {
                    zzJ(bundle, zza2, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
                i3 = i2;
                str5 = null;
            }
            i4 = i3;
            str6 = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzY(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (zzar(str)) {
                return true;
            }
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzet.zzn(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            if (zzar(str2)) {
                return true;
            }
            this.zzt.zzaA().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzet.zzn(str2));
            return false;
        } else {
            if (this.zzt.zzL()) {
                this.zzt.zzaA().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzZ(String str, int i, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            this.zzt.zzaA().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zza(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int i2;
        Parcelable[] parcelableArr;
        int size;
        zzg();
        if (zzag(obj)) {
            if (!z2) {
                return 21;
            }
            if (!zzau(str3, zzhd.zzc)) {
                return 20;
            }
            zzjz zzt = this.zzt.zzt();
            zzt.zzg();
            zzt.zza();
            if (zzt.zzN() && zzt.zzt.zzv().zzm() < 200900) {
                return 25;
            }
            this.zzt.zzf();
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            if (size > 200) {
                this.zzt.zzaA().zzl().zzd("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                this.zzt.zzf();
                if (z3) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                    if (parcelableArr2.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr2, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
                if (!zzaj(str2) || zzaj(str3)) {
                    this.zzt.zzf();
                    i2 = 256;
                } else {
                    this.zzt.zzf();
                    i2 = 100;
                }
                if (zzab("param", str3, i2, obj)) {
                    if (z2) {
                        if (obj instanceof Bundle) {
                            zzX(str, str2, str3, (Bundle) obj, list, z);
                        } else if (obj instanceof Parcelable[]) {
                            for (Parcelable parcelable : (Parcelable[]) obj) {
                                if (parcelable instanceof Bundle) {
                                    zzX(str, str2, str3, (Bundle) parcelable, list, z);
                                } else {
                                    this.zzt.zzaA().zzl().zzc("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                                    return 4;
                                }
                            }
                        } else if (!(obj instanceof ArrayList)) {
                            return 4;
                        } else {
                            ArrayList arrayList2 = (ArrayList) obj;
                            int size2 = arrayList2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                Object obj2 = arrayList2.get(i3);
                                if (obj2 instanceof Bundle) {
                                    zzX(str, str2, str3, (Bundle) obj2, list, z);
                                } else {
                                    this.zzt.zzaA().zzl().zzc("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : AbstractJsonLexerKt.NULL, str3);
                                    return 4;
                                }
                            }
                        }
                        return i;
                    }
                    return 4;
                }
                return i;
            }
        }
        i = 0;
        if (!zzaj(str2)) {
        }
        this.zzt.zzf();
        i2 = 256;
        if (zzab("param", str3, i2, obj)) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final void zzaC() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.zzt.zzaA().zzk().zza("Utils falling back to Random for random id");
            }
        }
        this.zzd.set(nextLong);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaa(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zza;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.zzt.zzaA().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzau(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !zzau(str2, strArr2)) {
            this.zzt.zzaA().zze().zzc("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzab(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.zzt.zzaA().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzac(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.zzt.zzaA().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzad(String str, String str2) {
        if (str2 == null) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzt.zzaA().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.zzt.zzaA().zze().zzc("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.zzt.zzaA().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzae(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzt.zzaw()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzt.zzaA().zzc().zzb("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzaf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzt.zzf().zzl();
        this.zzt.zzay();
        return zzl.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzag(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzah(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.zzt.zzaA().zzd().zzb("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.zzt.zzaA().zzd().zzb("Error obtaining certificate", e2);
            return true;
        }
    }

    public final boolean zzai(int i, boolean z) {
        Boolean zzj = this.zzt.zzt().zzj();
        if (zzm() < i / 1000) {
            return (zzj == null || zzj.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzao(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] zzap(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzd(String str, Object obj) {
        boolean zzab;
        if ("_ldl".equals(str)) {
            zzab = zzab("user property referrer", str, zzas(str), obj);
        } else {
            zzab = zzab("user property", str, zzas(str), obj);
        }
        return zzab ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzh(String str) {
        if (zzac(NotificationCompat.CATEGORY_EVENT, str)) {
            if (zzaa(NotificationCompat.CATEGORY_EVENT, zzhc.zza, zzhc.zzb, str)) {
                this.zzt.zzf();
                return !zzZ(NotificationCompat.CATEGORY_EVENT, 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    final int zzi(String str) {
        if (zzac("event param", str)) {
            if (zzaa("event param", null, null, str)) {
                this.zzt.zzf();
                return !zzZ("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    final int zzj(String str) {
        if (zzad("event param", str)) {
            if (zzaa("event param", null, null, str)) {
                this.zzt.zzf();
                return !zzZ("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzl(String str) {
        if (zzac("user property", str)) {
            if (zzaa("user property", zzhe.zza, null, str)) {
                this.zzt.zzf();
                return !zzZ("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzf == null) {
            this.zzf = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzt.zzaw()) / 1000);
        }
        return this.zzf.intValue();
    }

    public final int zzo(int i) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzt.zzaw(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzq() {
        long andIncrement;
        long j;
        if (this.zzd.get() == 0) {
            synchronized (this.zzd) {
                long nextLong = new Random(System.nanoTime() ^ this.zzt.zzax().currentTimeMillis()).nextLong();
                int i = this.zze + 1;
                this.zze = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.zzd) {
            this.zzd.compareAndSet(-1L, 1L);
            andIncrement = this.zzd.getAndIncrement();
        }
        return andIncrement;
    }

    public final long zzr(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzs(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                    str5 = uri.getQueryParameter("utm_id");
                    str6 = uri.getQueryParameter("dclid");
                    str7 = uri.getQueryParameter("srsltid");
                    str8 = z ? uri.getQueryParameter("sfmc_id") : null;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && (!z || TextUtils.isEmpty(str8))) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString(FirebaseAnalytics.Param.TERM, queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(FirebaseAnalytics.Param.CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter(FirebaseAnalytics.Param.ACLID);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString(FirebaseAnalytics.Param.ACLID, queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter(FirebaseAnalytics.Param.CP1);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString(FirebaseAnalytics.Param.CP1, queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle.putString(FirebaseAnalytics.Param.CAMPAIGN_ID, str5);
                }
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("dclid", str6);
                }
                String queryParameter6 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString(FirebaseAnalytics.Param.SOURCE_PLATFORM, queryParameter6);
                }
                String queryParameter7 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString(FirebaseAnalytics.Param.CREATIVE_FORMAT, queryParameter7);
                }
                String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString(FirebaseAnalytics.Param.MARKETING_TACTIC, queryParameter8);
                }
                if (!TextUtils.isEmpty(str7)) {
                    bundle.putString("srsltid", str7);
                }
                if (z && !TextUtils.isEmpty(str8)) {
                    bundle.putString("sfmc_id", str8);
                }
                return bundle;
            } catch (UnsupportedOperationException e) {
                this.zzt.zzaA().zzk().zzb("Install referrer url isn't a hierarchical URI", e);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzt.zzaA().zzl().zzb("Param value can't be null", this.zzt.zzj().zze(str));
                } else {
                    zzP(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzu(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str3;
        boolean zzau = zzau(str2, zzhc.zzd);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int zzc = this.zzt.zzf().zzc();
            int i3 = 0;
            for (String str4 : new TreeSet(bundle.keySet())) {
                if (list == null || !list.contains(str4)) {
                    int zzj = !z ? zzj(str4) : 0;
                    if (zzj == 0) {
                        zzj = zzi(str4);
                    }
                    i = zzj;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    zzJ(bundle2, i, str4, str4, i == 3 ? str4 : null);
                    bundle2.remove(str4);
                    i2 = zzc;
                } else {
                    i2 = zzc;
                    int zza2 = zza(str, str2, str4, bundle.get(str4), bundle2, list, z, zzau);
                    if (zza2 == 17) {
                        zzJ(bundle2, 17, str4, str4, false);
                    } else if (zza2 != 0) {
                        str3 = str4;
                        if (!"_ev".equals(str3)) {
                            zzJ(bundle2, zza2, zza2 == 21 ? str2 : str3, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                        if (zzak(str3)) {
                            int i4 = i3 + 1;
                            if (i4 > i2) {
                                this.zzt.zzaA().zze().zzc("Event can't contain more than " + i2 + " params", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                                zzaq(bundle2, 5);
                                bundle2.remove(str3);
                            }
                            i3 = i4;
                        }
                    }
                    str3 = str4;
                    if (zzak(str3)) {
                    }
                }
                zzc = i2;
            }
            return bundle2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzau zzz(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional property event name", this.zzt.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle zzu = zzu(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            zzu = zzt(zzu);
        }
        Preconditions.checkNotNull(zzu);
        return new zzau(str2, new zzas(zzu), str3, j);
    }
}
