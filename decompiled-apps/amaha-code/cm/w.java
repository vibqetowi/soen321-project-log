package cm;

import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: FirestoreGoalsFragment.kt */
/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f5385u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ fm.a f5386v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p pVar, fm.a aVar) {
        super(1);
        this.f5385u = pVar;
        this.f5386v = aVar;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        bm.d dVar;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue() && (dVar = this.f5385u.f5372x) != null) {
            boolean z10 = !dVar.C;
            dVar.C = z10;
            dVar.i();
            this.f5386v.A(z10);
        }
        return hs.k.f19476a;
    }
}
