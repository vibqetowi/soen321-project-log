package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.util.Set;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzba implements zzan {
    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzay.zzc(classLoader, set, new zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzay.zzd(classLoader, file, file2, z, "zip");
    }
}
