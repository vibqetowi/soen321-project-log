package s9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class k extends ka.d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f31351a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f31352b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(e eVar, Context context) {
        super(r1);
        Looper myLooper;
        this.f31352b = eVar;
        if (Looper.myLooper() == null) {
            myLooper = Looper.getMainLooper();
        } else {
            myLooper = Looper.myLooper();
        }
        this.f31351a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i6 = message.what;
        boolean z10 = true;
        if (i6 != 1) {
            defpackage.d.k(50, "Don't know how to handle this message: ", i6, "GoogleApiAvailability");
            return;
        }
        e eVar = this.f31352b;
        Context context = this.f31351a;
        int c10 = eVar.c(context);
        AtomicBoolean atomicBoolean = h.f31341a;
        if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 9) {
            z10 = false;
        }
        if (z10) {
            Intent a10 = eVar.a(context, "n", c10);
            if (a10 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, a10, ma.b.f25011a | 134217728);
            }
            eVar.g(context, c10, activity);
        }
    }
}
