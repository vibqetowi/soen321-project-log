package mu;

import dv.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.x;
import ss.l;
/* compiled from: DescriptorUtils.kt */
/* loaded from: classes2.dex */
public final class c extends b.a<gt.b, gt.b> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x<gt.b> f25750a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l<gt.b, Boolean> f25751b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(x<gt.b> xVar, l<? super gt.b, Boolean> lVar) {
        this.f25750a = xVar;
        this.f25751b = lVar;
    }

    @Override // dv.b.c
    public final Object a() {
        return this.f25750a.f23469u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [gt.b, T, java.lang.Object] */
    @Override // dv.b.a, dv.b.c
    public final void b(Object obj) {
        ?? current = (gt.b) obj;
        i.g(current, "current");
        x<gt.b> xVar = this.f25750a;
        if (xVar.f23469u == null && ((Boolean) this.f25751b.invoke(current)).booleanValue()) {
            xVar.f23469u = current;
        }
    }

    @Override // dv.b.c
    public final boolean c(Object obj) {
        gt.b current = (gt.b) obj;
        i.g(current, "current");
        if (this.f25750a.f23469u == null) {
            return true;
        }
        return false;
    }
}
