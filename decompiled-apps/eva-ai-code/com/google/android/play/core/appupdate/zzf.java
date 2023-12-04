package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.play.core.common.IntentSenderForResultStarter;
/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class zzf implements IntentSenderForResultStarter {
    final /* synthetic */ Activity zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzg zzgVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.play.core.common.IntentSenderForResultStarter
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.zza.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
