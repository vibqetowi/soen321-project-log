package w5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
/* compiled from: PlatformServiceClient.kt */
/* loaded from: classes.dex */
public final class x extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f36556a;

    public x(y yVar) {
        this.f36556a = yVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.i.g(message, "message");
            y yVar = this.f36556a;
            yVar.getClass();
            if (message.what == yVar.A) {
                Bundle data = message.getData();
                if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                    yVar.a(null);
                } else {
                    yVar.a(data);
                }
                try {
                    yVar.f36557u.unbindService(yVar);
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
