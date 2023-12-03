package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import j1.a;
import ta.n3;
import ta.o3;
import ta.w2;
import ta.y3;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements n3 {

    /* renamed from: w  reason: collision with root package name */
    public o3 f8740w;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f8740w == null) {
            this.f8740w = new o3(this);
        }
        o3 o3Var = this.f8740w;
        o3Var.getClass();
        w2 w2Var = y3.s(context, null, null).C;
        y3.k(w2Var);
        if (intent == null) {
            w2Var.C.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        w2Var.H.c(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            w2Var.H.b("Starting wakeful intent.");
            ((AppMeasurementReceiver) o3Var.f32781a).getClass();
            SparseArray<PowerManager.WakeLock> sparseArray = a.f21647u;
            synchronized (sparseArray) {
                int i6 = a.f21648v;
                int i10 = i6 + 1;
                a.f21648v = i10;
                if (i10 <= 0) {
                    a.f21648v = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i6);
                ComponentName startService = context.startService(className);
                if (startService != null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i6, newWakeLock);
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            w2Var.C.b("Install Referrer Broadcasts are deprecated");
        }
    }
}
