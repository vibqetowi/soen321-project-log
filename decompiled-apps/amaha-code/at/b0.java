package at;

import at.n0;
import gt.z0;
/* compiled from: KParameterImpl.kt */
/* loaded from: classes2.dex */
public final class b0 implements ys.j {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ ys.m<Object>[] f3467y = {kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(b0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kotlin.jvm.internal.y.c(new kotlin.jvm.internal.s(kotlin.jvm.internal.y.a(b0.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: u  reason: collision with root package name */
    public final e<?> f3468u;

    /* renamed from: v  reason: collision with root package name */
    public final int f3469v;

    /* renamed from: w  reason: collision with root package name */
    public final int f3470w;

    /* renamed from: x  reason: collision with root package name */
    public final n0.a f3471x;

    /* JADX WARN: Incorrect types in method signature: (Lat/e<*>;ILjava/lang/Object;Lss/a<+Lgt/i0;>;)V */
    public b0(e callable, int i6, int i10, ss.a aVar) {
        kotlin.jvm.internal.i.g(callable, "callable");
        defpackage.d.j(i10, "kind");
        this.f3468u = callable;
        this.f3469v = i6;
        this.f3470w = i10;
        this.f3471x = n0.c(aVar);
        n0.c(new z(this));
    }

    @Override // ys.j
    public final j0 a() {
        wu.b0 a10 = e().a();
        kotlin.jvm.internal.i.f(a10, "descriptor.type");
        return new j0(a10, new a0(this));
    }

    @Override // ys.j
    public final boolean b() {
        gt.i0 e10 = e();
        if ((e10 instanceof z0) && ((z0) e10).j0() != null) {
            return true;
        }
        return false;
    }

    public final gt.i0 e() {
        ys.m<Object> mVar = f3467y[0];
        Object invoke = this.f3471x.invoke();
        kotlin.jvm.internal.i.f(invoke, "<get-descriptor>(...)");
        return (gt.i0) invoke;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (kotlin.jvm.internal.i.b(this.f3468u, b0Var.f3468u)) {
                if (this.f3469v == b0Var.f3469v) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ys.j
    public final String getName() {
        z0 z0Var;
        gt.i0 e10 = e();
        if (e10 instanceof z0) {
            z0Var = (z0) e10;
        } else {
            z0Var = null;
        }
        if (z0Var == null || z0Var.c().E()) {
            return null;
        }
        fu.e name = z0Var.getName();
        kotlin.jvm.internal.i.f(name, "valueParameter.name");
        if (name.f15931v) {
            return null;
        }
        return name.f();
    }

    public final int hashCode() {
        return Integer.valueOf(this.f3469v).hashCode() + (this.f3468u.hashCode() * 31);
    }

    @Override // ys.j
    public final int j() {
        return this.f3470w;
    }

    @Override // ys.j
    public final boolean l() {
        z0 z0Var;
        gt.i0 e10 = e();
        if (e10 instanceof z0) {
            z0Var = (z0) e10;
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            return mu.a.a(z0Var);
        }
        return false;
    }

    public final String toString() {
        String b10;
        hu.d dVar = p0.f3592a;
        StringBuilder sb2 = new StringBuilder();
        int d10 = v.h.d(this.f3470w);
        if (d10 != 0) {
            if (d10 != 1) {
                if (d10 == 2) {
                    sb2.append("parameter #" + this.f3469v + ' ' + getName());
                }
            } else {
                sb2.append("extension receiver parameter");
            }
        } else {
            sb2.append("instance parameter");
        }
        sb2.append(" of ");
        gt.b t3 = this.f3468u.t();
        if (t3 instanceof gt.k0) {
            b10 = p0.c((gt.k0) t3);
        } else if (t3 instanceof gt.u) {
            b10 = p0.b((gt.u) t3);
        } else {
            throw new IllegalStateException(("Illegal callable: " + t3).toString());
        }
        sb2.append(b10);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
