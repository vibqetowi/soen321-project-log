package y3;

import java.util.List;
import s1.s;
/* compiled from: AnalyticsIdentityListener.kt */
/* loaded from: classes.dex */
public final class a implements a4.f {

    /* renamed from: a  reason: collision with root package name */
    public final s f38192a;

    public a(s state) {
        kotlin.jvm.internal.i.g(state, "state");
        this.f38192a = state;
    }

    @Override // a4.f
    public final void a(String str) {
        s sVar = this.f38192a;
        sVar.f31226x = str;
        for (w3.i iVar : (List) sVar.f31224v) {
            iVar.i();
        }
    }

    @Override // a4.f
    public final void b(String str) {
        s sVar = this.f38192a;
        sVar.f31225w = str;
        for (w3.i iVar : (List) sVar.f31224v) {
            iVar.j();
        }
    }

    @Override // a4.f
    public final void c(a4.c identity, a4.k updateType) {
        kotlin.jvm.internal.i.g(identity, "identity");
        kotlin.jvm.internal.i.g(updateType, "updateType");
        if (updateType == a4.k.Initialized) {
            s sVar = this.f38192a;
            sVar.f31225w = identity.f287a;
            for (w3.i iVar : (List) sVar.f31224v) {
                iVar.j();
            }
            sVar.f31226x = identity.f288b;
            for (w3.i iVar2 : (List) sVar.f31224v) {
                iVar2.i();
            }
        }
    }
}
