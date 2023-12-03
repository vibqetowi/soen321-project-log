package se;
/* compiled from: GetIdListener.java */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final ya.i<String> f31484a;

    public f(ya.i<String> iVar) {
        this.f31484a = iVar;
    }

    @Override // se.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // se.i
    public final boolean b(ue.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (aVar.f() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (aVar.f() == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (aVar.f() == 5) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
            }
        }
        this.f31484a.d(aVar.f34026b);
        return true;
    }
}
