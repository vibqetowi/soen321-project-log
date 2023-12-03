package q;

import a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: CustomTabsServiceConnection.java */
/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: u  reason: collision with root package name */
    public Context f29102u;

    /* compiled from: CustomTabsServiceConnection.java */
    /* loaded from: classes.dex */
    public class a extends c {
        public a(a.b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(ComponentName componentName, a aVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.b c0001a;
        if (this.f29102u != null) {
            int i6 = b.a.f5a;
            if (iBinder == null) {
                c0001a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof a.b)) {
                    c0001a = (a.b) queryLocalInterface;
                } else {
                    c0001a = new b.a.C0001a(iBinder);
                }
            }
            a(componentName, new a(c0001a, componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
