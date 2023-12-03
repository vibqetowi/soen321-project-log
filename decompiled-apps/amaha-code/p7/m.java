package p7;

import c9.j;
import com.google.firebase.FirebaseException;
import d9.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements j.a, ya.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27960u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f27961v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f27962w;

    public /* synthetic */ m(int i6, Object obj, boolean z10) {
        this.f27960u = i6;
        this.f27961v = obj;
        this.f27962w = z10;
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        switch (this.f27960u) {
            case 0:
                ((o) obj).t();
                return;
            case 1:
                o oVar = (o) obj;
                oVar.e();
                oVar.U();
                return;
            case 2:
                ((o) obj).H();
                return;
            default:
                ((o) obj).v();
                return;
        }
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        ad.d dVar = (ad.d) this.f27961v;
        if (!this.f27962w && dVar.d()) {
            return ya.k.e(ad.c.c(dVar.f494m));
        }
        zc.a aVar = dVar.f493l;
        if (aVar == null) {
            return ya.k.e(new ad.c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new FirebaseException("No AppCheckProvider installed.")));
        }
        return aVar.a().onSuccessTask(dVar.f488g, new f0.b(24, dVar)).continueWithTask(dVar.f489h, new p(6));
    }
}
