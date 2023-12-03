package ju;

import gt.v0;
import hs.f;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import vu.c;
import wu.b0;
import wu.d1;
import wu.f0;
import wu.f1;
import wu.g1;
import wu.n1;
import wu.y;
/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class d {

    /* compiled from: CapturedTypeConstructor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<b0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ d1 f22634u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d1 d1Var) {
            super(0);
            this.f22634u = d1Var;
        }

        @Override // ss.a
        public final b0 invoke() {
            b0 a10 = this.f22634u.a();
            i.f(a10, "this@createCapturedIfNeeded.type");
            return a10;
        }
    }

    public static final d1 a(d1 d1Var, v0 v0Var) {
        if (v0Var != null && d1Var.b() != n1.INVARIANT) {
            if (v0Var.O() == d1Var.b()) {
                if (d1Var.d()) {
                    c.a NO_LOCKS = vu.c.f36140e;
                    i.f(NO_LOCKS, "NO_LOCKS");
                    return new f1(new f0(NO_LOCKS, new a(d1Var)));
                }
                return new f1(d1Var.a());
            }
            c cVar = new c(d1Var);
            wu.v0.f37300v.getClass();
            return new f1(new ju.a(d1Var, cVar, false, wu.v0.f37301w));
        }
        return d1Var;
    }

    public static g1 b(g1 g1Var) {
        if (g1Var instanceof y) {
            y yVar = (y) g1Var;
            d1[] d1VarArr = yVar.f37316c;
            i.g(d1VarArr, "<this>");
            v0[] other = yVar.f37315b;
            i.g(other, "other");
            int min = Math.min(d1VarArr.length, other.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i6 = 0; i6 < min; i6++) {
                arrayList.add(new f(d1VarArr[i6], other[i6]));
            }
            ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                arrayList2.add(a((d1) fVar.f19464u, (v0) fVar.f19465v));
            }
            Object[] array = arrayList2.toArray(new d1[0]);
            i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new y(other, (d1[]) array, true);
        }
        return new e(g1Var, true);
    }
}
