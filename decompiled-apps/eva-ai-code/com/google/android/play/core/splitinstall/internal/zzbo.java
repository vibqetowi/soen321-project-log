package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public interface zzbo extends IInterface {
    void zzc(String str, int i, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    void zzd(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    void zze(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    void zzf(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    void zzg(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;

    void zzh(String str, int i, zzbq zzbqVar) throws RemoteException;

    void zzi(String str, zzbq zzbqVar) throws RemoteException;

    void zzj(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException;
}
