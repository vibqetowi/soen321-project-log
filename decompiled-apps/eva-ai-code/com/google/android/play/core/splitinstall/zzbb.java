package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzbp;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
class zzbb extends zzbp {
    final TaskCompletionSource zza;
    final /* synthetic */ zzbc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzbcVar;
        this.zza = taskCompletionSource;
    }

    public void zzb(int i, Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onCancelInstall(%d)", Integer.valueOf(i));
    }

    public void zzc(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onDeferredInstall", new Object[0]);
    }

    public void zzd(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onDeferredLanguageInstall", new Object[0]);
    }

    public void zze(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onDeferredLanguageUninstall", new Object[0]);
    }

    public void zzf(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onDeferredUninstall", new Object[0]);
    }

    public void zzg(int i, Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onGetSession(%d)", Integer.valueOf(i));
    }

    public void zzh(List list) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onGetSessionStates", new Object[0]);
    }

    public void zzi(int i, Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onStartInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzj(int i, Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzk(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzl(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        int i = bundle.getInt(NativeProtocol.BRIDGE_ARG_ERROR_CODE);
        zzuVar = zzbc.zzb;
        zzuVar.zzb("onError(%d)", Integer.valueOf(i));
        this.zza.trySetException(new SplitInstallException(i));
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzm(Bundle bundle) throws RemoteException {
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        this.zzb.zza.zzr(this.zza);
        zzuVar = zzbc.zzb;
        zzuVar.zzd("onGetSplitsForAppUpdate", new Object[0]);
    }
}
