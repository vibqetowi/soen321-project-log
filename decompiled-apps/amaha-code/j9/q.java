package j9;

import android.content.Context;
import android.os.Binder;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class q extends n {

    /* renamed from: b  reason: collision with root package name */
    public final Context f21767b;

    public q(Context context) {
        this.f21767b = context;
    }

    public final void X1() {
        if (aa.j.a(Binder.getCallingUid(), this.f21767b)) {
            return;
        }
        throw new SecurityException(defpackage.c.q("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
    }
}
