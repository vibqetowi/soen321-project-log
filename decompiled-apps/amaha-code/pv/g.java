package pv;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import lv.r;
/* compiled from: RealConnection.kt */
/* loaded from: classes2.dex */
public final class g extends k implements ss.a<List<? extends X509Certificate>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f29078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar) {
        super(0);
        this.f29078u = eVar;
    }

    @Override // ss.a
    public final List<? extends X509Certificate> invoke() {
        r rVar = this.f29078u.f29062e;
        kotlin.jvm.internal.i.d(rVar);
        List<Certificate> a10 = rVar.a();
        ArrayList arrayList = new ArrayList(is.i.H1(a10, 10));
        for (Certificate certificate : a10) {
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
