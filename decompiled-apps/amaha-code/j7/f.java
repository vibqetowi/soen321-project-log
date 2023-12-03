package j7;

import c9.j;
import com.google.android.exoplayer2.w;
import d7.s;
import l7.a;
import p7.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements a.InterfaceC0377a, j.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f21709u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f21710v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f21711w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f21712x;

    public /* synthetic */ f(int i6, w.e eVar, w.e eVar2) {
        this.f21709u = 1;
        this.f21710v = i6;
        this.f21711w = eVar;
        this.f21712x = eVar2;
    }

    @Override // l7.a.InterfaceC0377a
    public final Object g() {
        ((j) this.f21711w).f21727d.a((s) this.f21712x, this.f21710v + 1);
        return null;
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        switch (this.f21709u) {
            case 1:
                w.b bVar = (w.b) obj;
                int i6 = com.google.android.exoplayer2.k.H;
                bVar.i();
                bVar.z(this.f21710v, (w.e) this.f21711w, (w.e) this.f21712x);
                return;
            default:
                ((o) obj).y();
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i6, int i10) {
        this.f21709u = i10;
        this.f21711w = obj;
        this.f21712x = obj2;
        this.f21710v = i6;
    }
}
