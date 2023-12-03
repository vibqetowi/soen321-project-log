package wu;

import java.util.ArrayList;
import java.util.List;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes2.dex */
public abstract class z0 extends g1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37326b = new a();

    /* compiled from: TypeSubstitution.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final g1 a(b0 b0Var) {
            return b(b0Var.O0(), b0Var.M0());
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
            if (r2.n0() == true) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final g1 b(x0 typeConstructor, List<? extends d1> arguments) {
            boolean z10;
            kotlin.jvm.internal.i.g(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.i.g(arguments, "arguments");
            List<gt.v0> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.i.f(parameters, "typeConstructor.parameters");
            gt.v0 v0Var = (gt.v0) is.u.p2(parameters);
            if (v0Var != null) {
                z10 = true;
            }
            z10 = false;
            if (z10) {
                List<gt.v0> parameters2 = typeConstructor.getParameters();
                kotlin.jvm.internal.i.f(parameters2, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(is.i.H1(parameters2, 10));
                for (gt.v0 v0Var2 : parameters2) {
                    arrayList.add(v0Var2.l());
                }
                return new y0(is.e0.w0(is.u.O2(arrayList, arguments)), false);
            }
            Object[] array = parameters.toArray(new gt.v0[0]);
            kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Object[] array2 = arguments.toArray(new d1[0]);
            kotlin.jvm.internal.i.e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new y((gt.v0[]) array, (d1[]) array2, false);
        }
    }

    @Override // wu.g1
    public final d1 d(b0 b0Var) {
        return g(b0Var.O0());
    }

    public abstract d1 g(x0 x0Var);
}
