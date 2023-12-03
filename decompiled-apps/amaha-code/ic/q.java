package ic;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class q implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19941u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f19942v;

    public /* synthetic */ q(Object obj, int i6) {
        this.f19941u = i6;
        this.f19942v = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i6 = this.f19941u;
        Object obj = this.f19942v;
        switch (i6) {
            case 0:
                r rVar = (r) obj;
                rVar.f19945b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                rVar.a().post(new n(this, iBinder));
                return;
            default:
                mc.l lVar = (mc.l) obj;
                lVar.f25024b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                lVar.a().post(new mc.i(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i6 = this.f19941u;
        Object obj = this.f19942v;
        switch (i6) {
            case 0:
                r rVar = (r) obj;
                rVar.f19945b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                rVar.a().post(new o(1, this));
                return;
            default:
                mc.l lVar = (mc.l) obj;
                lVar.f25024b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                lVar.a().post(new mc.j(1, this));
                return;
        }
    }
}
