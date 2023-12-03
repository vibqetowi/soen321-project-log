package ev;

import java.util.NoSuchElementException;
/* compiled from: HashPMap.java */
/* loaded from: classes2.dex */
public final class b<K, V> {

    /* renamed from: c  reason: collision with root package name */
    public static final b<Object, Object> f14574c = new b<>(d.f14582b, 0);

    /* renamed from: a  reason: collision with root package name */
    public final d<a<e<K, V>>> f14575a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14576b;

    public b(d<a<e<K, V>>> dVar, int i6) {
        this.f14575a = dVar;
        this.f14576b = i6;
    }

    public final b a(String str, Object obj) {
        int hashCode = str.hashCode();
        d<a<e<K, V>>> dVar = this.f14575a;
        a<e<K, V>> a10 = dVar.f14583a.a(hashCode);
        if (a10 == null) {
            a10 = a.f14569x;
        }
        int i6 = a10.f14572w;
        int i10 = 0;
        for (a aVar = a10; aVar != null && aVar.f14572w > 0; aVar = aVar.f14571v) {
            if (((e) aVar.f14570u).f14584u.equals(str)) {
                break;
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            if (i10 >= 0 && i10 <= a10.f14572w) {
                try {
                    a10 = a10.e(a10.g(i10).f14570u);
                } catch (NoSuchElementException unused) {
                    throw new IndexOutOfBoundsException(defpackage.c.p("Index: ", i10));
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        e eVar = new e(str, obj);
        a10.getClass();
        a aVar2 = new a(eVar, a10);
        long hashCode2 = str.hashCode();
        c<a<e<K, V>>> cVar = dVar.f14583a;
        c<a<e<K, V>>> b10 = cVar.b(hashCode2, aVar2);
        if (b10 != cVar) {
            dVar = new d<>(b10);
        }
        return new b(dVar, (this.f14576b - i6) + aVar2.f14572w);
    }
}
