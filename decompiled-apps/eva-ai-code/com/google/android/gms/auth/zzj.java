package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzby;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public final class zzj implements zzk {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Logger logger;
        Bundle zzg = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzg(this.zza);
        zzl.zzj(zzg);
        String string = zzg.getString("Error");
        Intent intent = (Intent) zzg.getParcelable("userRecoveryIntent");
        zzby zza = zzby.zza(string);
        if (zzby.SUCCESS.equals(zza)) {
            return true;
        }
        if (zzby.zzb(zza)) {
            logger = zzl.zzd;
            logger.w("isUserRecoverableError status: ".concat(String.valueOf(String.valueOf(zza))), new Object[0]);
            throw new UserRecoverableAuthException(string, intent);
        }
        throw new GoogleAuthException(string);
    }
}
