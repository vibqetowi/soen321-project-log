package pv;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.k;
import lv.r;
/* compiled from: RealConnection.kt */
/* loaded from: classes2.dex */
public final class f extends k implements ss.a<List<? extends Certificate>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ lv.g f29075u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ r f29076v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ lv.a f29077w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lv.g gVar, r rVar, lv.a aVar) {
        super(0);
        this.f29075u = gVar;
        this.f29076v = rVar;
        this.f29077w = aVar;
    }

    @Override // ss.a
    public final List<? extends Certificate> invoke() {
        androidx.work.k kVar = this.f29075u.f24611b;
        kotlin.jvm.internal.i.d(kVar);
        return kVar.j(this.f29077w.f24535i.f24689d, this.f29076v.a());
    }
}
