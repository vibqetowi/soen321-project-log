package uf;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import j$.util.concurrent.ConcurrentHashMap;
import pt.v;
import wu.i0;
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class c implements l, v4.b, hd.e, v {

    /* renamed from: u  reason: collision with root package name */
    public static final c f34052u = new c();

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ c f34053v = new c();

    public static boolean b(zu.n nVar, zu.i iVar, zu.i iVar2) {
        boolean z10;
        boolean z11;
        if (nVar.I(iVar) == nVar.I(iVar2) && nVar.D(iVar) == nVar.D(iVar2)) {
            if (nVar.v(iVar) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (nVar.v(iVar2) == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11 && nVar.G(nVar.b(iVar), nVar.b(iVar2))) {
                if (nVar.t(iVar, iVar2)) {
                    return true;
                }
                int I = nVar.I(iVar);
                for (int i6 = 0; i6 < I; i6++) {
                    zu.k T = nVar.T(iVar, i6);
                    zu.k T2 = nVar.T(iVar2, i6);
                    if (nVar.A(T) != nVar.A(T2)) {
                        return false;
                    }
                    if (!nVar.A(T) && (nVar.s(T) != nVar.s(T2) || !c(nVar, nVar.w(T), nVar.w(T2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean c(zu.n nVar, zu.h hVar, zu.h hVar2) {
        if (hVar == hVar2) {
            return true;
        }
        i0 e10 = nVar.e(hVar);
        i0 e11 = nVar.e(hVar2);
        if (e10 != null && e11 != null) {
            return b(nVar, e10, e11);
        }
        wu.v y10 = nVar.y(hVar);
        wu.v y11 = nVar.y(hVar2);
        if (y10 != null && y11 != null && b(nVar, nVar.c(y10), nVar.c(y11)) && b(nVar, nVar.d(y10), nVar.d(y11))) {
            return true;
        }
        return false;
    }

    @Override // hd.e
    public Object e(hd.p pVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(pVar);
    }

    @Override // uf.l
    public Object i() {
        return new ConcurrentHashMap();
    }

    @Override // pt.v
    public void a(fu.b bVar) {
    }

    @Override // v4.b
    public k4.v n(k4.v vVar, h4.g gVar) {
        return vVar;
    }
}
