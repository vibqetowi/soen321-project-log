package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.internal.zzcb;
import java.io.File;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzae implements zzcb {
    private final zzcb zza;

    public zzae(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.zza.zza();
        if (file == null) {
            return null;
        }
        return com.google.android.play.core.splitinstall.testing.zzaa.zza(file);
    }
}
