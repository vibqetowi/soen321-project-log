package ja;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.api.c;
import h9.a;
import v9.f;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class d extends f {
    public final a.C0275a W;

    public d(Context context, Looper looper, v9.c cVar, a.C0275a c0275a, c.a aVar, c.b bVar) {
        super(context, looper, 68, cVar, aVar, bVar);
        a.C0275a.C0276a c0276a = new a.C0275a.C0276a(c0275a == null ? a.C0275a.f17346w : c0275a);
        byte[] bArr = new byte[16];
        b.f21770a.nextBytes(bArr);
        c0276a.f17350b = Base64.encodeToString(bArr, 11);
        this.W = new a.C0275a(c0276a);
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12800000;
    }

    @Override // v9.b
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new e(iBinder);
    }

    @Override // v9.b
    public final Bundle w() {
        a.C0275a c0275a = this.W;
        c0275a.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c0275a.f17347u);
        bundle.putString("log_session_id", c0275a.f17348v);
        return bundle;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
}
