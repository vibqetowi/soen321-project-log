package ft;

import dt.n;
import gt.a0;
import java.util.Collection;
import kotlin.jvm.internal.y;
import kt.g0;
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes2.dex */
public final class e implements jt.b {

    /* renamed from: g  reason: collision with root package name */
    public static final fu.e f15870g;

    /* renamed from: h  reason: collision with root package name */
    public static final fu.b f15871h;

    /* renamed from: a  reason: collision with root package name */
    public final a0 f15872a;

    /* renamed from: b  reason: collision with root package name */
    public final ss.l<a0, gt.j> f15873b;

    /* renamed from: c  reason: collision with root package name */
    public final vu.i f15874c;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f15869e = {y.c(new kotlin.jvm.internal.s(y.a(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final a f15868d = new a();
    public static final fu.c f = dt.n.f13390j;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    static {
        fu.d dVar = n.a.f13399c;
        fu.e g5 = dVar.g();
        kotlin.jvm.internal.i.f(g5, "cloneable.shortName()");
        f15870g = g5;
        f15871h = fu.b.l(dVar.h());
    }

    public e() {
        throw null;
    }

    public e(vu.l lVar, g0 g0Var) {
        d computeContainingDeclaration = d.f15867u;
        kotlin.jvm.internal.i.g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f15872a = g0Var;
        this.f15873b = computeContainingDeclaration;
        this.f15874c = lVar.e(new f(this, lVar));
    }

    @Override // jt.b
    public final gt.e a(fu.b classId) {
        kotlin.jvm.internal.i.g(classId, "classId");
        if (kotlin.jvm.internal.i.b(classId, f15871h)) {
            return (kt.n) kotlin.jvm.internal.h.C(this.f15874c, f15869e[0]);
        }
        return null;
    }

    @Override // jt.b
    public final Collection<gt.e> b(fu.c packageFqName) {
        kotlin.jvm.internal.i.g(packageFqName, "packageFqName");
        if (kotlin.jvm.internal.i.b(packageFqName, f)) {
            return ca.a.l1((kt.n) kotlin.jvm.internal.h.C(this.f15874c, f15869e[0]));
        }
        return is.y.f20678u;
    }

    @Override // jt.b
    public final boolean c(fu.c packageFqName, fu.e name) {
        kotlin.jvm.internal.i.g(packageFqName, "packageFqName");
        kotlin.jvm.internal.i.g(name, "name");
        if (kotlin.jvm.internal.i.b(name, f15870g) && kotlin.jvm.internal.i.b(packageFqName, f)) {
            return true;
        }
        return false;
    }
}
