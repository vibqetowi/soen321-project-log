package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class x1 extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13129u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13129u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null && contentIfNotHandled.booleanValue()) {
            int i6 = V3DashboardActivity.f10714r1;
            this.f13129u.i1();
        }
        return hs.k.f19476a;
    }
}
