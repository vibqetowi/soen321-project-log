package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
final class zzah extends com.google.android.gms.internal.play_billing.zzf {
    final WeakReference zza;
    final ResultReceiver zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzah(WeakReference weakReference, ResultReceiver resultReceiver, zzag zzagVar) {
        this.zza = weakReference;
        this.zzb = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzg
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.zzb;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            resultReceiver.send(0, null);
        } else {
            Activity activity = (Activity) this.zza.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                this.zzb.send(0, null);
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unable to launch intent for in-app messaging");
                return;
            }
            try {
                Intent intent = new Intent(activity, ProxyBillingActivity.class);
                intent.putExtra("in_app_message_result_receiver", this.zzb);
                intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                activity.startActivity(intent);
            } catch (CancellationException e) {
                this.zzb.send(0, null);
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
            }
        }
    }
}
