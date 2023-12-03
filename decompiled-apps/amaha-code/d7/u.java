package d7;

import d7.h;
import java.util.HashMap;
/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
public final class u<T> implements a7.f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f12262a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12263b;

    /* renamed from: c  reason: collision with root package name */
    public final a7.b f12264c;

    /* renamed from: d  reason: collision with root package name */
    public final a7.e<T, byte[]> f12265d;

    /* renamed from: e  reason: collision with root package name */
    public final v f12266e;

    public u(s sVar, String str, a7.b bVar, a7.e<T, byte[]> eVar, v vVar) {
        this.f12262a = sVar;
        this.f12263b = str;
        this.f12264c = bVar;
        this.f12265d = eVar;
        this.f12266e = vVar;
    }

    public final void a(a7.a aVar, a7.h hVar) {
        s sVar = this.f12262a;
        if (sVar != null) {
            String str = this.f12263b;
            if (str != null) {
                a7.e<T, byte[]> eVar = this.f12265d;
                if (eVar != null) {
                    a7.b bVar = this.f12264c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, aVar, eVar, bVar);
                        w wVar = (w) this.f12266e;
                        wVar.getClass();
                        a7.c<?> cVar = iVar.f12238c;
                        j e10 = iVar.f12236a.e(cVar.c());
                        h.a aVar2 = new h.a();
                        aVar2.f = new HashMap();
                        aVar2.f12234d = Long.valueOf(wVar.f12268a.a());
                        aVar2.f12235e = Long.valueOf(wVar.f12269b.a());
                        aVar2.d(iVar.f12237b);
                        Object b10 = cVar.b();
                        aVar2.c(new m(iVar.f12240e, iVar.f12239d.apply(b10)));
                        aVar2.f12232b = cVar.a();
                        wVar.f12270c.a(hVar, aVar2.b(), e10);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
