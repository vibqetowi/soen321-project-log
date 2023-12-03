package ls;

import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import ls.f;
import ss.p;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class c implements f, Serializable {

    /* renamed from: u  reason: collision with root package name */
    public final f f24512u;

    /* renamed from: v  reason: collision with root package name */
    public final f.b f24513v;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final f[] f24514u;

        public a(f[] fVarArr) {
            this.f24514u = fVarArr;
        }

        private final Object readResolve() {
            f fVar = g.f24521u;
            for (f fVar2 : this.f24514u) {
                fVar = fVar.h(fVar2);
            }
            return fVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements p<String, f.b, String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f24515u = new b();

        public b() {
            super(2);
        }

        @Override // ss.p
        public final String invoke(String str, f.b bVar) {
            boolean z10;
            String acc = str;
            f.b element = bVar;
            i.g(acc, "acc");
            i.g(element, "element");
            if (acc.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    /* renamed from: ls.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0392c extends k implements p<hs.k, f.b, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ f[] f24516u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ v f24517v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0392c(f[] fVarArr, v vVar) {
            super(2);
            this.f24516u = fVarArr;
            this.f24517v = vVar;
        }

        @Override // ss.p
        public final hs.k invoke(hs.k kVar, f.b bVar) {
            f.b element = bVar;
            i.g(kVar, "<anonymous parameter 0>");
            i.g(element, "element");
            v vVar = this.f24517v;
            int i6 = vVar.f23467u;
            vVar.f23467u = i6 + 1;
            this.f24516u[i6] = element;
            return hs.k.f19476a;
        }
    }

    public c(f.b element, f left) {
        i.g(left, "left");
        i.g(element, "element");
        this.f24512u = left;
        this.f24513v = element;
    }

    private final Object writeReplace() {
        boolean z10;
        int b10 = b();
        f[] fVarArr = new f[b10];
        v vVar = new v();
        s(hs.k.f19476a, new C0392c(fVarArr, vVar));
        if (vVar.f23467u == b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new a(fVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int b() {
        int i6 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f24512u;
            if (fVar instanceof c) {
                cVar = (c) fVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i6;
            }
            i6++;
        }
    }

    @Override // ls.f
    public final <E extends f.b> E e(f.c<E> key) {
        i.g(key, "key");
        c cVar = this;
        while (true) {
            E e10 = (E) cVar.f24513v.e(key);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar.f24512u;
            if (fVar instanceof c) {
                cVar = (c) fVar;
            } else {
                return (E) fVar.e(key);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b() != b()) {
                return false;
            }
            c cVar2 = this;
            while (true) {
                f.b bVar = cVar2.f24513v;
                if (!i.b(cVar.e(bVar.getKey()), bVar)) {
                    z10 = false;
                    break;
                }
                f fVar = cVar2.f24512u;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    i.e(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.b bVar2 = (f.b) fVar;
                    z10 = i.b(cVar.e(bVar2.getKey()), bVar2);
                    break;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // ls.f
    public final f h(f fVar) {
        return f.a.a(this, fVar);
    }

    public final int hashCode() {
        return this.f24513v.hashCode() + this.f24512u.hashCode();
    }

    @Override // ls.f
    public final f o(f.c<?> key) {
        i.g(key, "key");
        f.b bVar = this.f24513v;
        f.b e10 = bVar.e(key);
        f fVar = this.f24512u;
        if (e10 != null) {
            return fVar;
        }
        f o10 = fVar.o(key);
        if (o10 == fVar) {
            return this;
        }
        if (o10 != g.f24521u) {
            return new c(bVar, o10);
        }
        return bVar;
    }

    @Override // ls.f
    public final <R> R s(R r, p<? super R, ? super f.b, ? extends R> operation) {
        i.g(operation, "operation");
        return operation.invoke((Object) this.f24512u.s(r, operation), this.f24513v);
    }

    public final String toString() {
        return v.g.c(new StringBuilder("["), (String) s("", b.f24515u), ']');
    }
}
