package p002if;

import kf.i;
import lf.b;
/* compiled from: R8$$SyntheticClass */
/* renamed from: if.e  reason: invalid package */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20021u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ f f20022v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f20023w;

    public /* synthetic */ e(f fVar, i iVar, int i6) {
        this.f20021u = i6;
        this.f20022v = fVar;
        this.f20023w = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f20021u;
        i iVar = this.f20023w;
        f fVar = this.f20022v;
        switch (i6) {
            case 0:
                b c10 = fVar.c(iVar);
                if (c10 != null) {
                    fVar.f20025b.add(c10);
                    return;
                }
                return;
            default:
                b c11 = fVar.c(iVar);
                if (c11 != null) {
                    fVar.f20025b.add(c11);
                    return;
                }
                return;
        }
    }
}
