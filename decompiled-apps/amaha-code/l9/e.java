package l9;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.internal.cast.e4;
import com.google.android.gms.internal.cast.k1;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: b  reason: collision with root package name */
    public static final p9.b f24174b = new p9.b("Session");

    /* renamed from: a  reason: collision with root package name */
    public final p f24175a;

    public e(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        p pVar;
        try {
            pVar = k1.a(context).X0(str, str2, new u(this));
        } catch (RemoteException | zzar e10) {
            k1.f7569a.a("Unable to call %s on %s.", e10, "newSessionImpl", e4.class.getSimpleName());
            pVar = null;
        }
        this.f24175a = pVar;
    }

    public abstract void a(boolean z10);

    public long b() {
        v9.o.d("Must be called from the main thread.");
        return 0L;
    }

    public final void c(int i6) {
        p pVar = this.f24175a;
        if (pVar != null) {
            try {
                pVar.G1(i6);
            } catch (RemoteException e10) {
                f24174b.a("Unable to call %s on %s.", e10, "notifySessionEnded", p.class.getSimpleName());
            }
        }
    }

    public abstract void f(@RecentlyNonNull Bundle bundle);

    public abstract void g(@RecentlyNonNull Bundle bundle);

    @RecentlyNullable
    public final da.a i() {
        p pVar = this.f24175a;
        if (pVar != null) {
            try {
                return pVar.d();
            } catch (RemoteException e10) {
                f24174b.a("Unable to call %s on %s.", e10, "getWrappedObject", p.class.getSimpleName());
                return null;
            }
        }
        return null;
    }

    public void d(@RecentlyNonNull Bundle bundle) {
    }

    public void e(@RecentlyNonNull Bundle bundle) {
    }

    public void h(@RecentlyNonNull Bundle bundle) {
    }
}
