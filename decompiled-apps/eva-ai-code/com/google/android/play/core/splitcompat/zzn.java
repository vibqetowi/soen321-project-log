package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzn {
    private static final Pattern zza = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    private final zze zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zze zzeVar) throws IOException {
        this.zzb = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Set zza(zzn zznVar, Set set, zzt zztVar, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        zznVar.zzf(zztVar, set, new zzj(zznVar, hashSet, zztVar, zipFile));
        return hashSet;
    }

    private static void zze(zzt zztVar, zzk zzkVar) throws IOException {
        ZipFile zipFile;
        String[] strArr;
        try {
            zipFile = new ZipFile(zztVar.zza());
        } catch (IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            String zzb = zztVar.zzb();
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = zza.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", zzb, group2, group));
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new zzm(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str)) {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str));
                    for (zzm zzmVar : (Set) hashMap.get(str)) {
                        if (hashMap2.containsKey(zzmVar.zza)) {
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", zzmVar.zza, str));
                        } else {
                            hashMap2.put(zzmVar.zza, zzmVar);
                            Log.d("SplitCompat", String.format("NativeLibraryExtractor: using library %s for ABI %s", zzmVar.zza, str));
                        }
                    }
                } else {
                    Log.d("SplitCompat", String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str));
                }
            }
            zzkVar.zza(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf(zzt zztVar, Set set, zzl zzlVar) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzm zzmVar = (zzm) it.next();
            File zzc = this.zzb.zzc(zztVar.zzb(), zzmVar.zza);
            boolean z = false;
            if (zzc.exists() && zzc.length() == zzmVar.zzb.getSize() && zze.zzp(zzc)) {
                z = true;
            }
            zzlVar.zza(zzmVar, zzc, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzb(zzt zztVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        zze(zztVar, new zzh(this, zztVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzc() throws IOException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        Set<zzt> zzj = this.zzb.zzj();
        for (String str : this.zzb.zzh()) {
            Iterator it = zzj.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((zzt) it.next()).zzb().equals(str)) {
                        break;
                    }
                } else {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str));
                    this.zzb.zzn(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (zzt zztVar : zzj) {
            HashSet hashSet2 = new HashSet();
            zze(zztVar, new zzi(this, hashSet2, zztVar));
            for (File file : this.zzb.zzi(zztVar.zzb())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file.getAbsolutePath(), zztVar.zzb(), zztVar.zza().getAbsolutePath()));
                    this.zzb.zzo(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
