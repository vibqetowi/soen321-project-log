package ia;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k;
import v9.c;
import v9.f;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes.dex */
public final class a extends f {
    public final Bundle W;

    public a(Context context, Looper looper, c cVar, h9.c cVar2, e eVar, k kVar) {
        super(context, looper, 16, cVar, eVar, kVar);
        Bundle bundle;
        if (cVar2 == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle((Bundle) null);
        }
        this.W = bundle;
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // v9.b
    public final boolean E() {
        return true;
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12451000;
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final boolean o() {
        String str;
        c cVar = this.T;
        Account account = cVar.f34854a;
        if (account != null) {
            str = account.name;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (cVar.f34857d.get(h9.b.f17351a) == null) {
                if (!cVar.f34855b.isEmpty()) {
                    return true;
                }
                return false;
            }
            throw null;
        }
        return false;
    }

    @Override // v9.b
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof b) {
            return (b) queryLocalInterface;
        }
        return new b(iBinder);
    }

    @Override // v9.b
    public final Bundle w() {
        return this.W;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }
}
