package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.t;
import java.util.concurrent.ExecutionException;
import r9.a;
import r9.b;
import ya.k;
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends b {
    @Override // r9.b
    public final int a(Context context, a aVar) {
        try {
            return ((Integer) k.a(new com.google.firebase.messaging.k(context).c(aVar.f30605u))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // r9.b
    public final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (t.b(putExtras)) {
            t.a(putExtras.getExtras(), "_nd");
        }
    }
}
