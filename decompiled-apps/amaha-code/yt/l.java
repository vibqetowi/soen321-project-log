package yt;

import gu.g;
import zt.a;
/* compiled from: JvmPackagePartSource.kt */
/* loaded from: classes2.dex */
public final class l implements uu.g {

    /* renamed from: b  reason: collision with root package name */
    public final nu.b f39040b;

    /* renamed from: c  reason: collision with root package name */
    public final nu.b f39041c;

    /* renamed from: d  reason: collision with root package name */
    public final o f39042d;

    public l() {
        throw null;
    }

    public l(o kotlinClass, au.k packageProto, eu.f nameResolver, int i6) {
        kotlin.jvm.internal.i.g(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.i.g(packageProto, "packageProto");
        kotlin.jvm.internal.i.g(nameResolver, "nameResolver");
        defpackage.d.j(i6, "abiStability");
        nu.b b10 = nu.b.b(kotlinClass.g());
        zt.a a10 = kotlinClass.a();
        a10.getClass();
        nu.b bVar = null;
        String str = a10.f39838a == a.EnumC0686a.MULTIFILE_CLASS_PART ? a10.f : null;
        if (str != null) {
            if (str.length() > 0) {
                bVar = nu.b.d(str);
            }
        }
        this.f39040b = b10;
        this.f39041c = bVar;
        this.f39042d = kotlinClass;
        g.e<au.k, Integer> packageModuleName = du.a.f13447m;
        kotlin.jvm.internal.i.f(packageModuleName, "packageModuleName");
        Integer num = (Integer) kotlin.jvm.internal.h.w(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.getString(num.intValue());
        }
    }

    @Override // uu.g
    public final String c() {
        return "Class '" + d().b().b() + '\'';
    }

    public final fu.b d() {
        fu.c cVar;
        nu.b bVar = this.f39040b;
        String str = bVar.f26836a;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            cVar = fu.c.f15921c;
            if (cVar == null) {
                nu.b.a(7);
                throw null;
            }
        } else {
            cVar = new fu.c(str.substring(0, lastIndexOf).replace('/', '.'));
        }
        String e10 = bVar.e();
        kotlin.jvm.internal.i.f(e10, "className.internalName");
        return new fu.b(cVar, fu.e.j(gv.r.e1(e10, '/')));
    }

    public final String toString() {
        return l.class.getSimpleName() + ": " + this.f39040b;
    }

    @Override // gt.q0
    public final void a() {
    }
}
