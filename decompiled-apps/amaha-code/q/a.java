package q;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import q.e;
/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f29094v;

    public a(Context context) {
        this.f29094v = context;
    }

    @Override // q.e
    public final void a(ComponentName componentName, e.a aVar) {
        try {
            aVar.f29095a.K1();
        } catch (RemoteException unused) {
        }
        this.f29094v.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
