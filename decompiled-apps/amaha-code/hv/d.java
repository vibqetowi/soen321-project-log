package hv;

import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<Throwable, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f19601u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Runnable f19602v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(1);
        this.f19601u = eVar;
        this.f19602v = cVar;
    }

    @Override // ss.l
    public final hs.k invoke(Throwable th2) {
        this.f19601u.f19603w.removeCallbacks(this.f19602v);
        return hs.k.f19476a;
    }
}
