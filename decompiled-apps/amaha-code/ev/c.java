package ev;
/* compiled from: IntTree.java */
/* loaded from: classes2.dex */
public final class c<V> {
    public static final c<Object> f = new c<>();

    /* renamed from: a  reason: collision with root package name */
    public final long f14577a;

    /* renamed from: b  reason: collision with root package name */
    public final V f14578b;

    /* renamed from: c  reason: collision with root package name */
    public final c<V> f14579c;

    /* renamed from: d  reason: collision with root package name */
    public final c<V> f14580d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14581e;

    public c() {
        this.f14581e = 0;
        this.f14577a = 0L;
        this.f14578b = null;
        this.f14579c = null;
        this.f14580d = null;
    }

    public final V a(long j10) {
        if (this.f14581e == 0) {
            return null;
        }
        long j11 = this.f14577a;
        if (j10 < j11) {
            return this.f14579c.a(j10 - j11);
        }
        if (j10 > j11) {
            return this.f14580d.a(j10 - j11);
        }
        return this.f14578b;
    }

    public final c b(long j10, a aVar) {
        if (this.f14581e == 0) {
            return new c(j10, aVar, this, this);
        }
        c<V> cVar = this.f14580d;
        c<V> cVar2 = this.f14579c;
        long j11 = this.f14577a;
        int i6 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i6 < 0) {
            return c(cVar2.b(j10 - j11, aVar), cVar);
        }
        if (i6 > 0) {
            return c(cVar2, cVar.b(j10 - j11, aVar));
        }
        if (aVar == this.f14578b) {
            return this;
        }
        return new c(j10, aVar, cVar2, cVar);
    }

    public final c<V> c(c<V> cVar, c<V> cVar2) {
        c<V> cVar3;
        if (cVar == this.f14579c && cVar2 == this.f14580d) {
            return this;
        }
        long j10 = this.f14577a;
        V v10 = this.f14578b;
        int i6 = cVar.f14581e;
        int i10 = cVar2.f14581e;
        if (i6 + i10 > 1) {
            if (i6 >= i10 * 5) {
                c<V> cVar4 = cVar.f14580d;
                int i11 = cVar4.f14581e;
                c<V> cVar5 = cVar.f14579c;
                int i12 = cVar5.f14581e * 2;
                long j11 = cVar.f14577a;
                long j12 = cVar4.f14577a;
                if (i11 < i12) {
                    return new c<>(j11 + j10, cVar.f14578b, cVar5, new c(-j11, v10, cVar4.d(j12 + j11), cVar2));
                }
                long j13 = j12 + j11 + j10;
                V v11 = cVar4.f14578b;
                V v12 = cVar.f14578b;
                c<V> cVar6 = cVar4.f14579c;
                c cVar7 = new c(-j12, v12, cVar5, cVar6.d(cVar6.f14577a + j12));
                c<V> cVar8 = cVar4.f14580d;
                return new c<>(j13, v11, cVar7, new c((-j11) - j12, v10, cVar8.d(cVar8.f14577a + j12 + j11), cVar2));
            } else if (i10 >= i6 * 5) {
                c<V> cVar9 = cVar2.f14579c;
                int i13 = cVar9.f14581e;
                c<V> cVar10 = cVar2.f14580d;
                int i14 = cVar10.f14581e * 2;
                long j14 = cVar2.f14577a;
                long j15 = cVar9.f14577a;
                if (i13 < i14) {
                    cVar3 = new c<>(j14 + j10, cVar2.f14578b, new c(-j14, v10, cVar, cVar9.d(j15 + j14)), cVar10);
                } else {
                    long j16 = j15 + j14 + j10;
                    V v13 = cVar9.f14578b;
                    c<V> cVar11 = cVar9.f14579c;
                    c cVar12 = new c((-j14) - j15, v10, cVar, cVar11.d(cVar11.f14577a + j15 + j14));
                    V v14 = cVar2.f14578b;
                    c<V> cVar13 = cVar9.f14580d;
                    cVar3 = new c<>(j16, v13, cVar12, new c(-j15, v14, cVar13.d(cVar13.f14577a + j15), cVar10));
                }
                return cVar3;
            }
        }
        return new c<>(j10, v10, cVar, cVar2);
    }

    public final c<V> d(long j10) {
        if (this.f14581e != 0 && j10 != this.f14577a) {
            return new c<>(j10, this.f14578b, this.f14579c, this.f14580d);
        }
        return this;
    }

    public c(long j10, V v10, c<V> cVar, c<V> cVar2) {
        this.f14577a = j10;
        this.f14578b = v10;
        this.f14579c = cVar;
        this.f14580d = cVar2;
        this.f14581e = cVar.f14581e + 1 + cVar2.f14581e;
    }
}
