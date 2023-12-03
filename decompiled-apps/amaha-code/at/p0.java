package at;

import gt.z0;
import java.util.List;
/* compiled from: ReflectionObjectRenderer.kt */
/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final hu.d f3592a = hu.c.f19528a;

    /* compiled from: ReflectionObjectRenderer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<z0, CharSequence> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f3593u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final CharSequence invoke(z0 z0Var) {
            hu.d dVar = p0.f3592a;
            wu.b0 a10 = z0Var.a();
            kotlin.jvm.internal.i.f(a10, "it.type");
            return p0.d(a10);
        }
    }

    public static void a(StringBuilder sb2, gt.a aVar) {
        boolean z10;
        gt.n0 g5 = t0.g(aVar);
        gt.n0 k02 = aVar.k0();
        if (g5 != null) {
            wu.b0 a10 = g5.a();
            kotlin.jvm.internal.i.f(a10, "receiver.type");
            sb2.append(d(a10));
            sb2.append(".");
        }
        if (g5 != null && k02 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append("(");
        }
        if (k02 != null) {
            wu.b0 a11 = k02.a();
            kotlin.jvm.internal.i.f(a11, "receiver.type");
            sb2.append(d(a11));
            sb2.append(".");
        }
        if (z10) {
            sb2.append(")");
        }
    }

    public static String b(gt.u descriptor) {
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        a(sb2, descriptor);
        fu.e name = descriptor.getName();
        kotlin.jvm.internal.i.f(name, "descriptor.name");
        sb2.append(f3592a.t(name, true));
        List<z0> i6 = descriptor.i();
        kotlin.jvm.internal.i.f(i6, "descriptor.valueParameters");
        is.u.l2(i6, sb2, ", ", "(", ")", a.f3593u, 48);
        sb2.append(": ");
        wu.b0 returnType = descriptor.getReturnType();
        kotlin.jvm.internal.i.d(returnType);
        sb2.append(d(returnType));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static String c(gt.k0 descriptor) {
        String str;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        if (descriptor.i0()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb2.append(str);
        a(sb2, descriptor);
        fu.e name = descriptor.getName();
        kotlin.jvm.internal.i.f(name, "descriptor.name");
        sb2.append(f3592a.t(name, true));
        sb2.append(": ");
        wu.b0 a10 = descriptor.a();
        kotlin.jvm.internal.i.f(a10, "descriptor.type");
        sb2.append(d(a10));
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static String d(wu.b0 type) {
        kotlin.jvm.internal.i.g(type, "type");
        return f3592a.u(type);
    }
}
