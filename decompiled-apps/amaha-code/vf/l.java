package vf;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import sf.v;
/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes.dex */
public final class l extends v<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final k f35014c = new k(sf.s.f31515u);

    /* renamed from: a  reason: collision with root package name */
    public final sf.i f35015a;

    /* renamed from: b  reason: collision with root package name */
    public final sf.t f35016b;

    public l(sf.i iVar, sf.t tVar) {
        this.f35015a = iVar;
        this.f35016b = tVar;
    }

    @Override // sf.v
    public final Object a(yf.a aVar) {
        int d10 = v.h.d(aVar.y0());
        if (d10 != 0) {
            if (d10 != 2) {
                if (d10 != 5) {
                    if (d10 != 6) {
                        if (d10 != 7) {
                            if (d10 == 8) {
                                aVar.p0();
                                return null;
                            }
                            throw new IllegalStateException();
                        }
                        return Boolean.valueOf(aVar.c0());
                    }
                    return this.f35016b.d(aVar);
                }
                return aVar.v0();
            }
            uf.k kVar = new uf.k();
            aVar.e();
            while (aVar.J()) {
                kVar.put(aVar.k0(), a(aVar));
            }
            aVar.m();
            return kVar;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.J()) {
            arrayList.add(a(aVar));
        }
        aVar.j();
        return arrayList;
    }

    @Override // sf.v
    public final void b(yf.b bVar, Object obj) {
        if (obj == null) {
            bVar.G();
            return;
        }
        Class<?> cls = obj.getClass();
        sf.i iVar = this.f35015a;
        iVar.getClass();
        v d10 = iVar.d(TypeToken.get((Class) cls));
        if (d10 instanceof l) {
            bVar.g();
            bVar.m();
            return;
        }
        d10.b(bVar, obj);
    }
}
