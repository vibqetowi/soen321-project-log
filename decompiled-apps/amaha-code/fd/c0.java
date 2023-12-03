package fd;

import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class c0 implements gd.a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f14947a;

    public c0(FirebaseAuth firebaseAuth) {
        this.f14947a = firebaseAuth;
    }

    @Override // gd.a0
    public final void a(jf jfVar, f fVar) {
        v9.o.h(jfVar);
        v9.o.h(fVar);
        fVar.t0(jfVar);
        FirebaseAuth firebaseAuth = this.f14947a;
        firebaseAuth.getClass();
        FirebaseAuth.i(firebaseAuth, fVar, jfVar, true, false);
    }
}
