package le;

import java.util.Collections;
import java.util.List;
import ke.t;
import rf.a;
import rf.s;
/* compiled from: ArrayTransformOperation.java */
/* loaded from: classes.dex */
public abstract class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final List<s> f24208a;

    /* compiled from: ArrayTransformOperation.java */
    /* renamed from: le.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0379a extends a {
        public C0379a(List<s> list) {
            super(list);
        }

        @Override // le.a
        public final s d(s sVar) {
            a.C0520a S;
            if (t.h(sVar)) {
                S = sVar.X().a();
            } else {
                S = rf.a.S();
            }
            for (s sVar2 : this.f24208a) {
                int i6 = 0;
                while (i6 < ((rf.a) S.f10073v).R()) {
                    if (t.f(((rf.a) S.f10073v).Q(i6), sVar2)) {
                        S.u();
                        rf.a.O((rf.a) S.f10073v, i6);
                    } else {
                        i6++;
                    }
                }
            }
            s.a j02 = s.j0();
            j02.x(S);
            return j02.r();
        }
    }

    /* compiled from: ArrayTransformOperation.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(List<s> list) {
            super(list);
        }

        @Override // le.a
        public final s d(s sVar) {
            a.C0520a S;
            if (t.h(sVar)) {
                S = sVar.X().a();
            } else {
                S = rf.a.S();
            }
            for (s sVar2 : this.f24208a) {
                if (!t.e(S, sVar2)) {
                    S.u();
                    rf.a.M((rf.a) S.f10073v, sVar2);
                }
            }
            s.a j02 = s.j0();
            j02.x(S);
            return j02.r();
        }
    }

    public a(List<s> list) {
        this.f24208a = Collections.unmodifiableList(list);
    }

    @Override // le.o
    public final s a(sc.h hVar, s sVar) {
        return d(sVar);
    }

    @Override // le.o
    public final s b(s sVar, s sVar2) {
        return d(sVar);
    }

    @Override // le.o
    public final s c(s sVar) {
        return null;
    }

    public abstract s d(s sVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f24208a.equals(((a) obj).f24208a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24208a.hashCode() + (getClass().hashCode() * 31);
    }
}
