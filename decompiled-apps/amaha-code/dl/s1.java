package dl;

import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class s1 extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13108u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13108u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        boolean z10;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null) {
            z10 = kotlin.jvm.internal.i.b(singleUseEvent2.getContentIfNotHandled(), Boolean.TRUE);
        } else {
            z10 = false;
        }
        if (z10) {
            this.f13108u.recreate();
        }
        return hs.k.f19476a;
    }
}
