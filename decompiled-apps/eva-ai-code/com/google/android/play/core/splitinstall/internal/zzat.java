package com.google.android.play.core.splitinstall.internal;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzat implements zzan {
    zzat() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzc(ClassLoader classLoader) {
        return zzbk.zzb(classLoader, "pathList", Object.class).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzd(ClassLoader classLoader, Set set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Log.d("Splitcompat", "Adding native library parent directory: ".concat(String.valueOf(file.getParentFile().getAbsolutePath())));
            hashSet.add(file.getParentFile());
        }
        zzbi zza = zzbk.zza(zzc(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) zza.zzc()));
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            int size = hashSet.size();
            Log.d("Splitcompat", "Adding directories " + size);
            zza.zzb(hashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zze(ClassLoader classLoader, File file, File file2, boolean z, zzas zzasVar, String str, zzar zzarVar) {
        ArrayList arrayList = new ArrayList();
        Object zzc = zzc(classLoader);
        zzbi zza = zzbk.zza(zzc, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) zza.zzc());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add((File) zzbk.zzb(obj, str, File.class).zzc());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || zzarVar.zza(zzc, file2, file)) {
            zza.zza(Arrays.asList(zzasVar.zza(zzc, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                IOException iOException = (IOException) arrayList.get(i);
                Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
                } catch (Exception unused) {
                }
            }
            zzbk.zza(zzc, "dexElementsSuppressedExceptions", IOException.class).zza(arrayList);
            throw zzbhVar;
        }
        Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzd(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zze(classLoader, file, file2, z, new zzap(), "zip", new zzaq());
    }
}
