package km;

import com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel;
import com.theinnerhour.b2b.model.DashboardNpsDayTrack;
import com.theinnerhour.b2b.model.UserNpsCheckModel;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.j;
import ss.l;
/* compiled from: InAppPromptsViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends k implements l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ x<PopupItemModel.NpsDayFive> f23387u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j<PopupItemModel.NpsDayFive> f23388v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x xVar, kotlinx.coroutines.k kVar) {
        super(1);
        this.f23387u = xVar;
        this.f23388v = kVar;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [T, com.theinnerhour.b2b.components.inAppFunneling.model.PopupItemModel$NpsDayFive] */
    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        int i6;
        DashboardNpsDayTrack dashboardNps;
        boolean booleanValue = bool.booleanValue();
        x<PopupItemModel.NpsDayFive> xVar = this.f23387u;
        if (booleanValue) {
            NpsPersistence npsPersistence = NpsPersistence.INSTANCE;
            npsPersistence.checkAndUpdateAppOpenDay();
            if (npsPersistence.isDashboardNpsPendingForDay(5)) {
                UserNpsCheckModel npsCheckModel = npsPersistence.getNpsCheckModel();
                if (npsCheckModel != null && (dashboardNps = npsCheckModel.getDashboardNps()) != null) {
                    i6 = dashboardNps.getAppOpenDayCount();
                } else {
                    i6 = -1;
                }
                if (i6 >= 5) {
                    xVar.f23469u = new PopupItemModel.NpsDayFive();
                }
            }
        }
        j<PopupItemModel.NpsDayFive> jVar = this.f23388v;
        if (jVar.a()) {
            jVar.resumeWith(xVar.f23469u);
        }
        return hs.k.f19476a;
    }
}
