package kc;

import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.s;
import com.google.android.play.core.integrity.IntegrityServiceException;
import mc.l;
import ya.v;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final j f23237a;

    public g(j jVar) {
        this.f23237a = jVar;
    }

    @Override // kc.a
    public final v a(d dVar) {
        j jVar = this.f23237a;
        if (jVar.f23248c == null) {
            return ya.k.d(new IntegrityServiceException(null, -2));
        }
        try {
            byte[] decode = Base64.decode(dVar.f23210a, 10);
            Long l2 = dVar.f23211b;
            jVar.f23246a.a("requestIntegrityToken(%s)", dVar);
            ya.i iVar = new ya.i();
            l lVar = jVar.f23248c;
            h hVar = new h(jVar, iVar, decode, l2, iVar, dVar);
            synchronized (lVar.f) {
                lVar.f25027e.add(iVar);
                iVar.f38392a.addOnCompleteListener(new s(lVar, iVar, 2));
            }
            synchronized (lVar.f) {
                if (lVar.f25032k.getAndIncrement() > 0) {
                    mc.g gVar = lVar.f25024b;
                    Object[] objArr = new Object[0];
                    gVar.getClass();
                    if (Log.isLoggable("PlayCore", 3)) {
                        Log.d("PlayCore", mc.g.b(gVar.f25015a, "Already connected to the service.", objArr));
                    }
                }
            }
            lVar.a().post(new mc.i(lVar, iVar, hVar));
            return iVar.f38392a;
        } catch (IllegalArgumentException e10) {
            return ya.k.d(new IntegrityServiceException(e10, -13));
        }
    }
}
