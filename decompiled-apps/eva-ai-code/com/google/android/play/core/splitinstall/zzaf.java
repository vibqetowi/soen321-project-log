package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.zzcb;
import java.io.File;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzaf implements zzcb {
    private final zzcb zza;

    public zzaf(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final /* bridge */ /* synthetic */ Object zza() {
        String string;
        Context zzb = ((zzad) this.zza).zzb();
        try {
            Bundle bundle = zzb.getPackageManager().getApplicationInfo(zzb.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(zzb.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
