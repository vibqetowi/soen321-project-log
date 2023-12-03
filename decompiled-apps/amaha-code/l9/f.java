package l9;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final p9.b f24176c = new p9.b("SessionManager");

    /* renamed from: a  reason: collision with root package name */
    public final r f24177a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f24178b;

    public f(r rVar, Context context) {
        this.f24177a = rVar;
        this.f24178b = context;
    }

    public final void a(boolean z10) {
        p9.b bVar = f24176c;
        v9.o.d("Must be called from the main thread.");
        try {
            Log.i(bVar.f28035a, bVar.f("End session for %s", this.f24178b.getPackageName()));
            this.f24177a.j0(z10);
        } catch (RemoteException e10) {
            bVar.a("Unable to call %s on %s.", e10, "endCurrentSession", r.class.getSimpleName());
        }
    }
}
