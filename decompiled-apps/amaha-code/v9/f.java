package v9;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public abstract class f<T extends IInterface> extends b<T> implements a.e {
    public final c T;
    public final Set<Scope> U;
    public final Account V;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(Context context, Looper looper, int i6, c cVar, com.google.android.gms.common.api.internal.e eVar, com.google.android.gms.common.api.internal.k kVar) {
        super(context, looper, r3, r4, i6, new z(eVar), new a0(kVar), cVar.f);
        e1 a10 = g.a(context);
        s9.e eVar2 = s9.e.f31337d;
        o.h(eVar);
        o.h(kVar);
        this.T = cVar;
        this.V = cVar.f34854a;
        Set<Scope> set = cVar.f34856c;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.U = set;
    }

    @Override // com.google.android.gms.common.api.a.e
    public final Set<Scope> a() {
        if (o()) {
            return this.U;
        }
        return Collections.emptySet();
    }

    @Override // v9.b
    public final Account s() {
        return this.V;
    }

    @Override // v9.b
    public final Set<Scope> x() {
        return this.U;
    }

    @Override // v9.b
    public final void u() {
    }
}
