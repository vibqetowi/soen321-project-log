package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzdd implements zzcl {
    private static final Map zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdd zza(Context context, String str, Runnable runnable) {
        zzdd zzddVar;
        if (!zzcc.zzb()) {
            synchronized (zzdd.class) {
                zzddVar = (zzdd) zza.get(null);
                if (zzddVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return zzddVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzc() {
        synchronized (zzdd.class) {
            Map map = zza;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                zzdd zzddVar = (zzdd) it.next();
                SharedPreferences sharedPreferences = zzddVar.zzb;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = zzddVar.zzc;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final Object zzb(String str) {
        throw null;
    }
}
