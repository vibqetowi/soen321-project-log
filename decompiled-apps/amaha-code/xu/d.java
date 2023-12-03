package xu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.y;
import wu.b0;
import wu.c0;
import wu.d1;
import wu.i0;
import wu.m1;
import wu.n1;
import wu.v;
import wu.x0;
import wu.z;
/* compiled from: KotlinTypePreparator.kt */
/* loaded from: classes2.dex */
public abstract class d extends com.android.volley.toolbox.a {

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes2.dex */
    public static final class a extends d {

        /* renamed from: v  reason: collision with root package name */
        public static final a f38096v = new a();
    }

    /* compiled from: KotlinTypePreparator.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.f implements ss.l<zu.h, m1> {
        public b(Object obj) {
            super(1, obj);
        }

        @Override // kotlin.jvm.internal.a, ys.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.a
        public final ys.f getOwner() {
            return y.a(d.class);
        }

        @Override // kotlin.jvm.internal.a
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }

        @Override // ss.l
        public final m1 invoke(zu.h hVar) {
            zu.h p02 = hVar;
            kotlin.jvm.internal.i.g(p02, "p0");
            return ((d) this.receiver).p(p02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [wu.z] */
    /* JADX WARN: Type inference failed for: r0v4, types: [wu.z] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [wu.z] */
    public static i0 K(i0 i0Var) {
        b0 a10;
        x0 O0 = i0Var.O0();
        boolean z10 = true;
        boolean z11 = false;
        m1 m1Var = null;
        if (O0 instanceof ju.c) {
            ju.c cVar = (ju.c) O0;
            d1 d1Var = cVar.f22632a;
            if (d1Var.b() != n1.IN_VARIANCE) {
                z10 = false;
            }
            if (!z10) {
                d1Var = null;
            }
            if (d1Var != null && (a10 = d1Var.a()) != null) {
                m1Var = a10.R0();
            }
            m1 m1Var2 = m1Var;
            if (cVar.f22633b == null) {
                Collection<b0> c10 = cVar.c();
                ArrayList arrayList = new ArrayList(is.i.H1(c10, 10));
                for (b0 b0Var : c10) {
                    arrayList.add(b0Var.R0());
                }
                d1 projection = cVar.f22632a;
                kotlin.jvm.internal.i.g(projection, "projection");
                cVar.f22633b = new i(projection, new h(arrayList), null, null, 8);
            }
            zu.b bVar = zu.b.FOR_SUBTYPING;
            i iVar = cVar.f22633b;
            kotlin.jvm.internal.i.d(iVar);
            return new g(bVar, iVar, m1Var2, i0Var.N0(), i0Var.P0(), 32);
        } else if (!(O0 instanceof ku.p)) {
            if ((O0 instanceof z) && i0Var.P0()) {
                ?? r02 = (z) O0;
                LinkedHashSet<b0> linkedHashSet = r02.f37321b;
                ArrayList arrayList2 = new ArrayList(is.i.H1(linkedHashSet, 10));
                for (b0 b0Var2 : linkedHashSet) {
                    arrayList2.add(hc.d.Y(b0Var2));
                    z11 = true;
                }
                if (z11) {
                    b0 b0Var3 = r02.f37320a;
                    if (b0Var3 != null) {
                        m1Var = hc.d.Y(b0Var3);
                    }
                    arrayList2.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
                    linkedHashSet2.hashCode();
                    m1Var = new z(linkedHashSet2, m1Var);
                }
                if (m1Var != null) {
                    r02 = m1Var;
                }
                return r02.f();
            }
            return i0Var;
        } else {
            ((ku.p) O0).getClass();
            is.i.H1(null, 10);
            throw null;
        }
    }

    @Override // com.android.volley.toolbox.a
    /* renamed from: J */
    public final m1 p(zu.h type) {
        m1 c10;
        b0 b0Var;
        kotlin.jvm.internal.i.g(type, "type");
        if (type instanceof b0) {
            m1 origin = ((b0) type).R0();
            if (origin instanceof i0) {
                c10 = K((i0) origin);
            } else if (origin instanceof v) {
                v vVar = (v) origin;
                i0 K = K(vVar.f37298v);
                i0 i0Var = vVar.f37299w;
                i0 K2 = K(i0Var);
                if (K == vVar.f37298v && K2 == i0Var) {
                    c10 = origin;
                } else {
                    c10 = c0.c(K, K2);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            b bVar = new b(this);
            kotlin.jvm.internal.i.g(c10, "<this>");
            kotlin.jvm.internal.i.g(origin, "origin");
            b0 h02 = ca.a.h0(origin);
            if (h02 != null) {
                b0Var = (b0) bVar.invoke(h02);
            } else {
                b0Var = null;
            }
            return ca.a.C1(c10, b0Var);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
