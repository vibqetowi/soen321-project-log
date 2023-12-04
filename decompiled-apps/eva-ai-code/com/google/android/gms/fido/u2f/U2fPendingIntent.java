package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
@Deprecated
/* loaded from: classes2.dex */
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i) throws IntentSender.SendIntentException;
}
