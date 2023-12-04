package com.google.android.play.core.splitinstall.testing;

import java.util.Collections;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public abstract class zzu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract zzu zza(int i);

    abstract zzu zzb(Map map);

    abstract zzv zzc();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map zzd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzv zze() {
        zzb(Collections.unmodifiableMap(zzd()));
        return zzc();
    }
}
