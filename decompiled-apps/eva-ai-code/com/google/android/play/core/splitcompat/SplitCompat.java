package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.play.core.splitinstall.internal.zzah;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzao;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.zzbe;
import com.google.android.play.core.splitinstall.zzx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public class SplitCompat {
    public static final /* synthetic */ int zza = 0;
    private static final AtomicReference zzb = new AtomicReference(null);
    private final zze zzc;
    private final zzbe zzd;
    private final Set zze = new HashSet();
    private final zza zzf;

    private SplitCompat(Context context) {
        try {
            zze zzeVar = new zze(context);
            this.zzc = zzeVar;
            this.zzf = new zza(zzeVar);
            this.zzd = new zzbe(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbh("Failed to initialize FileStorage", e);
        }
    }

    public static boolean install(Context context) {
        return zzi(context, false);
    }

    public static boolean installActivity(Context context) {
        if (zzj()) {
            return false;
        }
        SplitCompat splitCompat = (SplitCompat) zzb.get();
        if (splitCompat == null) {
            if (context.getApplicationContext() != null) {
                install(context.getApplicationContext());
            }
            return install(context);
        }
        return splitCompat.zzf.zzb(context, splitCompat.zzf());
    }

    public static boolean zzd(Context context) {
        return zzi(context, true);
    }

    public static boolean zze() {
        return zzb.get() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set zzf() {
        HashSet hashSet;
        synchronized (this.zze) {
            hashSet = new HashSet(this.zze);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zze.zzl(this.zzc.zzg((String) it.next()));
        }
        this.zzd.zzb();
    }

    private final synchronized void zzh(Context context, boolean z) throws IOException {
        List<String> asList;
        ZipFile zipFile;
        if (z) {
            this.zzc.zzk();
        } else {
            zzd.zza().execute(new zzq(this));
        }
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo.splitNames == null) {
                asList = new ArrayList();
            } else {
                asList = Arrays.asList(packageInfo.splitNames);
            }
            Set<zzt> zzj = this.zzc.zzj();
            Set zza2 = this.zzd.zza();
            HashSet hashSet = new HashSet();
            Iterator it = zzj.iterator();
            while (it.hasNext()) {
                String zzb2 = ((zzt) it.next()).zzb();
                if (asList.contains(zzb2) || zza2.contains(com.google.android.play.core.splitinstall.zzs.zzb(zzb2))) {
                    hashSet.add(zzb2);
                    it.remove();
                }
            }
            if (!z) {
                if (!hashSet.isEmpty()) {
                    zzd.zza().execute(new zzr(this, hashSet));
                }
            } else {
                zzg(hashSet);
            }
            HashSet hashSet2 = new HashSet();
            for (zzt zztVar : zzj) {
                String zzb3 = zztVar.zzb();
                if (!com.google.android.play.core.splitinstall.zzs.zzf(zzb3)) {
                    hashSet2.add(zzb3);
                }
            }
            for (String str : asList) {
                if (!com.google.android.play.core.splitinstall.zzs.zzf(str)) {
                    hashSet2.add(str);
                }
            }
            HashSet<zzt> hashSet3 = new HashSet(zzj.size());
            for (zzt zztVar2 : zzj) {
                if (com.google.android.play.core.splitinstall.zzs.zze(zztVar2.zzb()) || hashSet2.contains(com.google.android.play.core.splitinstall.zzs.zzb(zztVar2.zzb()))) {
                    hashSet3.add(zztVar2);
                }
            }
            zzn zznVar = new zzn(this.zzc);
            zzan zza3 = zzao.zza();
            ClassLoader classLoader = context.getClassLoader();
            if (z) {
                zza3.zza(classLoader, zznVar.zzc());
            } else {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    Set zzb4 = zznVar.zzb((zzt) it2.next());
                    if (zzb4 == null) {
                        it2.remove();
                    } else {
                        zza3.zza(classLoader, zzb4);
                    }
                }
            }
            HashSet hashSet4 = new HashSet();
            for (zzt zztVar3 : hashSet3) {
                try {
                    zipFile = new ZipFile(zztVar3.zza());
                } catch (IOException e) {
                    e = e;
                    zipFile = null;
                }
                try {
                    ZipEntry entry = zipFile.getEntry("classes.dex");
                    zipFile.close();
                    if (entry != null && !zza3.zzb(classLoader, this.zzc.zza(zztVar3.zzb()), zztVar3.zza(), z)) {
                        Log.w("SplitCompat", "split was not installed ".concat(zztVar3.zza().toString()));
                    }
                    hashSet4.add(zztVar3.zza());
                } catch (IOException e2) {
                    e = e2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    throw e;
                }
            }
            this.zzf.zza(context, hashSet4);
            HashSet hashSet5 = new HashSet();
            for (zzt zztVar4 : hashSet3) {
                if (hashSet4.contains(zztVar4.zza())) {
                    String zzb5 = zztVar4.zzb();
                    Log.d("SplitCompat", "Split '" + zzb5 + "' installation emulated");
                    hashSet5.add(zztVar4.zzb());
                } else {
                    String zzb6 = zztVar4.zzb();
                    Log.d("SplitCompat", "Split '" + zzb6 + "' installation not emulated.");
                }
            }
            synchronized (this.zze) {
                this.zze.addAll(hashSet5);
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IOException(String.format("Cannot load data for application '%s'", packageName), e4);
        }
    }

    private static boolean zzi(final Context context, boolean z) {
        boolean z2;
        if (zzj()) {
            return false;
        }
        AtomicReference atomicReference = zzb;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, splitCompat)) {
                if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) zzb.get();
        if (z2) {
            com.google.android.play.core.splitinstall.zzo.INSTANCE.zzb(new zzak(context, zzd.zza(), new zzam(context, splitCompat2.zzc, new zzah()), splitCompat2.zzc, new zzs(), null));
            com.google.android.play.core.splitinstall.zzr.zzb(new zzp(splitCompat2));
            zzd.zza().execute(new Runnable() { // from class: com.google.android.play.core.splitcompat.zzo
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    int i = SplitCompat.zza;
                    try {
                        zzx.zzg(context2).zzc(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        }
        try {
            splitCompat2.zzh(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    private static boolean zzj() {
        return false;
    }
}
