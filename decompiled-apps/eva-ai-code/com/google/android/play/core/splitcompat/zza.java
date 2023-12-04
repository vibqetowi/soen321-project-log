package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zza {
    private final zze zza;

    public zza(zze zzeVar) {
        this.zza = zzeVar;
    }

    public static final int zzc(AssetManager assetManager, File file) {
        int intValue = ((Integer) zzbk.zzd(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + intValue);
        return intValue;
    }

    public final synchronized void zza(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzc(assets, (File) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: all -> 0x0043, Exception -> 0x0045, LOOP:0: B:14:0x0022->B:16:0x0028, LOOP_END, TryCatch #3 {Exception -> 0x0045, blocks: (B:13:0x0019, B:14:0x0022, B:16:0x0028, B:17:0x0038), top: B:42:0x0019, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x000e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:4:0x0005, B:19:0x003d, B:28:0x004f, B:12:0x0012, B:13:0x0019, B:14:0x0022, B:16:0x0028, B:17:0x0038, B:26:0x0046), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(Context context, Set set) {
        StrictMode.ThreadPolicy threadPolicy;
        Iterator it;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
        } catch (Exception e) {
            e = e;
            threadPolicy = null;
        }
        try {
            StrictMode.allowThreadDiskReads();
            StrictMode.allowThreadDiskWrites();
        } catch (Exception e2) {
            e = e2;
            Log.i("SplitCompat", "Unable to set up strict mode.", e);
            HashSet hashSet = new HashSet();
            it = set.iterator();
            while (it.hasNext()) {
            }
            zza(context, hashSet);
            if (threadPolicy != null) {
            }
            return true;
        }
        try {
            HashSet hashSet2 = new HashSet();
            it = set.iterator();
            while (it.hasNext()) {
                hashSet2.add(this.zza.zzg((String) it.next()));
            }
            zza(context, hashSet2);
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Exception e3) {
            Log.e("SplitCompat", "Error installing additional splits", e3);
            if (threadPolicy != null) {
                StrictMode.setThreadPolicy(threadPolicy);
                return false;
            }
            return false;
        }
        return true;
    }
}
