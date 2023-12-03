package fd;

import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.android.gms.internal.p000firebaseauthapi.rd;
import com.google.android.gms.internal.p000firebaseauthapi.xd;
import com.google.firebase.auth.FirebaseAuth;
import gd.k0;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public abstract class f extends w9.a implements q {
    public abstract String f0();

    public abstract gd.d g0();

    public abstract List<? extends q> h0();

    public abstract String i0();

    public abstract String j0();

    public abstract boolean k0();

    public final ya.v l0(String str) {
        v9.o.e(str);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m0());
        firebaseAuth.getClass();
        v9.o.e(str);
        b0 b0Var = new b0(firebaseAuth, 1);
        xd xdVar = firebaseAuth.f9540e;
        xdVar.getClass();
        rd rdVar = new rd(str, 4);
        rdVar.e(firebaseAuth.f9536a);
        rdVar.f(this);
        rdVar.d(b0Var);
        rdVar.f = b0Var;
        return xdVar.a(rdVar);
    }

    public abstract sc.e m0();

    public abstract k0 n0();

    public abstract k0 o0(List list);

    public abstract jf p0();

    public abstract String q0();

    public abstract String r0();

    public abstract List s0();

    public abstract void t0(jf jfVar);

    public abstract void u0(ArrayList arrayList);
}
