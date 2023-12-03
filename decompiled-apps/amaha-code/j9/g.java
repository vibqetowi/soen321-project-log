package j9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.c;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
/* loaded from: classes.dex */
public final class g extends v9.f {
    public final GoogleSignInOptions W;

    public g(Context context, Looper looper, v9.c cVar, GoogleSignInOptions googleSignInOptions, c.a aVar, c.b bVar) {
        super(context, looper, 91, cVar, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.a();
        }
        byte[] bArr = new byte[16];
        ja.b.f21770a.nextBytes(bArr);
        aVar2.f7235i = Base64.encodeToString(bArr, 11);
        Set<Scope> set = cVar.f34856c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar2.f7228a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.W = aVar2.a();
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12451000;
    }

    @Override // v9.b
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof p) {
            return (p) queryLocalInterface;
        }
        return new p(iBinder);
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }
}
