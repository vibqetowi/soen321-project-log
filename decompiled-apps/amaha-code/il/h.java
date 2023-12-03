package il;

import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: NotV4DashboardCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class h implements xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f20361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f20362b;

    public h(j jVar, View view) {
        this.f20361a = jVar;
        this.f20362b = view;
    }

    @Override // xj.a
    public final void b() {
        j jVar = this.f20361a;
        try {
            View findViewById = jVar.f20365b.findViewById(R.id.clNotV4DashboardCoachMarkLibrary);
            if (findViewById != null) {
                View view = this.f20362b;
                findViewById.setVisibility(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                findViewById.setTranslationX((iArr[0] + (view.getWidth() / 2)) - (findViewById.getWidth() / 2));
                jVar.f20367d.invoke(null);
                UtilsKt.fireAnalytics("ch_mark_lib_nav_tooltipshow", UtilsKt.getAnalyticsBundle());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(jVar.f20368e, e10);
        }
    }

    @Override // xj.a
    public final void a() {
    }
}
