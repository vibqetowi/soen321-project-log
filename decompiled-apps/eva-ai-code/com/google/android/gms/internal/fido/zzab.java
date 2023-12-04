package com.google.android.gms.internal.fido;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import com.google.android.gms.fido.u2f.U2fPendingIntent;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
public final class zzab implements U2fPendingIntent {
    private final PendingIntent zza;

    public zzab(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final boolean hasPendingIntent() {
        return this.zza != null;
    }

    @Override // com.google.android.gms.fido.u2f.U2fPendingIntent
    public final void launchPendingIntent(Activity activity, int i) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent = this.zza;
        if (pendingIntent == null) {
            throw new IllegalStateException("No PendingIntent available");
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
    }
}
