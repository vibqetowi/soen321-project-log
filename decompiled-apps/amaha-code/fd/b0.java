package fd;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.jf;
import com.google.firebase.auth.FirebaseAuth;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* loaded from: classes.dex */
public final class b0 implements gd.a0, gd.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14945a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f14946b;

    public /* synthetic */ b0(FirebaseAuth firebaseAuth, int i6) {
        this.f14945a = i6;
        this.f14946b = firebaseAuth;
    }

    @Override // gd.a0
    public final void a(jf jfVar, f fVar) {
        int i6 = this.f14945a;
        FirebaseAuth firebaseAuth = this.f14946b;
        switch (i6) {
            case 0:
                FirebaseAuth.i(firebaseAuth, fVar, jfVar, true, true);
                return;
            default:
                v9.o.h(jfVar);
                v9.o.h(fVar);
                fVar.t0(jfVar);
                FirebaseAuth.i(firebaseAuth, fVar, jfVar, true, true);
                return;
        }
    }

    @Override // gd.m
    public final void b(Status status) {
        int i6 = this.f14945a;
        FirebaseAuth firebaseAuth = this.f14946b;
        switch (i6) {
            case 0:
                int i10 = status.f7298v;
                if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
                    firebaseAuth.f();
                    return;
                }
                return;
            default:
                int i11 = status.f7298v;
                if (i11 == 17011 || i11 == 17021 || i11 == 17005 || i11 == 17091) {
                    firebaseAuth.f();
                    return;
                }
                return;
        }
    }
}
