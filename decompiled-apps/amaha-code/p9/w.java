package p9;

import com.google.android.gms.cast.CastDevice;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ y f28059u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f28060v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f28061w;

    public w(y yVar, String str, String str2) {
        this.f28059u = yVar;
        this.f28060v = str;
        this.f28061w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.d dVar;
        synchronized (this.f28059u.Z) {
            dVar = (e.d) this.f28059u.Z.get(this.f28060v);
        }
        if (dVar != null) {
            CastDevice castDevice = this.f28059u.X;
            dVar.a(this.f28061w);
            return;
        }
        y.f28064p0.b("Discarded message for unknown namespace '%s'", this.f28060v);
    }
}
