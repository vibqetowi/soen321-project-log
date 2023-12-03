package wu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: TypeAliasExpansion.kt */
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f37289a;

    /* renamed from: b  reason: collision with root package name */
    public final gt.u0 f37290b;

    /* renamed from: c  reason: collision with root package name */
    public final List<d1> f37291c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<gt.v0, d1> f37292d;

    /* compiled from: TypeAliasExpansion.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static r0 a(r0 r0Var, gt.u0 typeAliasDescriptor, List arguments) {
            kotlin.jvm.internal.i.g(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.i.g(arguments, "arguments");
            List<gt.v0> parameters = typeAliasDescriptor.l().getParameters();
            kotlin.jvm.internal.i.f(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(is.i.H1(parameters, 10));
            for (gt.v0 v0Var : parameters) {
                arrayList.add(v0Var.b());
            }
            return new r0(r0Var, typeAliasDescriptor, arguments, is.e0.w0(is.u.O2(arrayList, arguments)));
        }
    }

    public r0(r0 r0Var, gt.u0 u0Var, List list, Map map) {
        this.f37289a = r0Var;
        this.f37290b = u0Var;
        this.f37291c = list;
        this.f37292d = map;
    }

    public final boolean a(gt.u0 descriptor) {
        boolean z10;
        kotlin.jvm.internal.i.g(descriptor, "descriptor");
        if (!kotlin.jvm.internal.i.b(this.f37290b, descriptor)) {
            r0 r0Var = this.f37289a;
            if (r0Var != null) {
                z10 = r0Var.a(descriptor);
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }
}
