package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzy implements Runnable {
    final /* synthetic */ SplitInstallRequest zza;
    final /* synthetic */ zzaa zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzaa zzaaVar, SplitInstallRequest splitInstallRequest) {
        this.zzb = zzaaVar;
        this.zza = splitInstallRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar;
        List zze;
        zzxVar = this.zzb.zzb;
        List<String> moduleNames = this.zza.getModuleNames();
        zze = zzaa.zze(this.zza.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt(NativeProtocol.BRIDGE_ARG_ERROR_CODE, 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(moduleNames));
        }
        if (!zze.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(zze));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        zzxVar.zzk(SplitInstallSessionState.zzd(bundle));
    }
}
