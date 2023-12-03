package cm;

import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreCustomGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l f5353u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ fm.a f5354v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, fm.a aVar) {
        super(1);
        this.f5353u = lVar;
        this.f5354v = aVar;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        bm.b bVar;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue() && (bVar = this.f5353u.f5358x) != null) {
            boolean z10 = !bVar.A;
            bVar.A = z10;
            bVar.i();
            this.f5354v.A(z10);
        }
        return hs.k.f19476a;
    }
}
