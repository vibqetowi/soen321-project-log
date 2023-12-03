package xd;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;
import xd.g;
/* compiled from: DynamicLinksClient.java */
/* loaded from: classes.dex */
public final class d extends v9.f<g> {
    public d(Context context, Looper looper, v9.c cVar, c.a aVar, c.b bVar) {
        super(context, looper, 131, cVar, aVar, bVar);
    }

    @Override // v9.b
    public final String A() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // v9.b
    public final boolean E() {
        return true;
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12451000;
    }

    @Override // v9.b
    public final IInterface r(IBinder iBinder) {
        int i6 = g.a.f37744a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof g)) {
            return (g) queryLocalInterface;
        }
        return new g.a.C0633a(iBinder);
    }

    @Override // v9.b
    public final String z() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }
}
