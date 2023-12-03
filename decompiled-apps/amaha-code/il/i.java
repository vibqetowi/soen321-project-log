package il;

import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: NotV4DashboardCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class i implements xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f20363a;

    public i(j jVar) {
        this.f20363a = jVar;
    }

    @Override // xj.a
    public final void b() {
        j jVar = this.f20363a;
        try {
            View findViewById = jVar.f20365b.findViewById(R.id.clNotV4DashboardCoachMarkPlanCard);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                int[] iArr = new int[2];
                View findViewById2 = jVar.f20365b.findViewById(R.id.tvSaTitle);
                if (findViewById2 != null) {
                    findViewById2.getLocationInWindow(iArr);
                }
                findViewById.setTranslationY(iArr[1]);
                jVar.f20366c.invoke();
                jVar.f20367d.invoke(null);
                UtilsKt.fireAnalytics("ch_mark_plan_db_tooltipshow", UtilsKt.getAnalyticsBundle());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(jVar.f20368e, e10);
        }
    }

    @Override // xj.a
    public final void a() {
    }
}
