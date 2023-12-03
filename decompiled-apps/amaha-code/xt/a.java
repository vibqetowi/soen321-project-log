package xt;

import java.util.ArrayList;
import java.util.List;
import pt.z;
import wu.b0;
import xu.a;
/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes2.dex */
public abstract class a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: xt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0642a {

        /* renamed from: a  reason: collision with root package name */
        public final zu.h f38004a;

        /* renamed from: b  reason: collision with root package name */
        public final z f38005b;

        /* renamed from: c  reason: collision with root package name */
        public final zu.m f38006c;

        public C0642a(zu.h hVar, z zVar, zu.m mVar) {
            this.f38004a = hVar;
            this.f38005b = zVar;
            this.f38006c = mVar;
        }
    }

    public static void a(Object obj, ArrayList arrayList, d dVar) {
        arrayList.add(obj);
        Iterable<? extends C0642a> invoke = dVar.invoke(obj);
        if (invoke != null) {
            for (C0642a c0642a : invoke) {
                a(c0642a, arrayList, dVar);
            }
        }
    }

    public static j c(zu.h hVar) {
        f6.b bVar = f6.b.M;
        if (a.C0645a.P(a.C0645a.Z(bVar, hVar))) {
            return j.NULLABLE;
        }
        if (!a.C0645a.P(a.C0645a.n0(bVar, hVar))) {
            return j.NOT_NULL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final k b(zu.m mVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        ?? arrayList;
        boolean z13;
        boolean z14;
        j jVar;
        boolean z15;
        if (!(mVar instanceof tt.z)) {
            return null;
        }
        List<zu.h> A = a.C0645a.A(mVar);
        boolean z16 = true;
        if (!A.isEmpty()) {
            for (zu.h hVar : A) {
                if (!a.C0645a.L(hVar)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return null;
        }
        if (!A.isEmpty()) {
            for (zu.h hVar2 : A) {
                if (c(hVar2) != null) {
                    z15 = true;
                    continue;
                } else {
                    z15 = false;
                    continue;
                }
                if (z15) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z11) {
            arrayList = A;
        } else {
            if (!A.isEmpty()) {
                for (zu.h hVar3 : A) {
                    kotlin.jvm.internal.i.g(hVar3, "<this>");
                    if (ca.a.h0((b0) hVar3) != null) {
                        z13 = true;
                        continue;
                    } else {
                        z13 = false;
                        continue;
                    }
                    if (z13) {
                        z12 = true;
                        break;
                    }
                }
            }
            z12 = false;
            if (!z12) {
                return null;
            }
            arrayList = new ArrayList();
            for (zu.h hVar4 : A) {
                kotlin.jvm.internal.i.g(hVar4, "<this>");
                b0 h02 = ca.a.h0((b0) hVar4);
                if (h02 != null) {
                    arrayList.add(h02);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (zu.h hVar5 : arrayList) {
                if (!a.C0645a.R(hVar5)) {
                    z14 = false;
                    break;
                }
            }
        }
        z14 = true;
        if (z14) {
            jVar = j.NULLABLE;
        } else {
            jVar = j.NOT_NULL;
        }
        if (arrayList == A) {
            z16 = false;
        }
        return new k(jVar, z16);
    }

    public final ArrayList d(zu.h hVar) {
        q.f fVar = ((u) this).f38086c;
        pt.e eVar = ((st.c) fVar.f29104v).f31949q;
        kotlin.jvm.internal.i.g(hVar, "<this>");
        C0642a c0642a = new C0642a(hVar, eVar.b((z) ((hs.d) fVar.f29107y).getValue(), ((b0) hVar).getAnnotations()), null);
        d dVar = new d(this);
        ArrayList arrayList = new ArrayList(1);
        a(c0642a, arrayList, dVar);
        return arrayList;
    }
}
