package il;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20358u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ xj.b f20359v;

    public /* synthetic */ f(xj.b bVar, int i6) {
        this.f20358u = i6;
        this.f20359v = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f20358u;
        xj.b spotlight = this.f20359v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                spotlight.c(spotlight.f37805a - 1);
                return;
            case 1:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putInt("step", 5);
                UtilsKt.fireAnalytics("ch_mark_plan_skip", analyticsBundle);
                spotlight.a();
                return;
            case 2:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                analyticsBundle2.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_plan_cta", analyticsBundle2);
                Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                analyticsBundle3.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_plan_show", analyticsBundle3);
                spotlight.b();
                return;
            case 3:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle4 = UtilsKt.getAnalyticsBundle();
                analyticsBundle4.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_plan_cta", analyticsBundle4);
                Bundle analyticsBundle5 = UtilsKt.getAnalyticsBundle();
                analyticsBundle5.putInt("step", 3);
                UtilsKt.fireAnalytics("ch_mark_plan_show", analyticsBundle5);
                spotlight.b();
                return;
            case 4:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle6 = UtilsKt.getAnalyticsBundle();
                analyticsBundle6.putInt("step", 3);
                UtilsKt.fireAnalytics("ch_mark_plan_cta", analyticsBundle6);
                Bundle analyticsBundle7 = UtilsKt.getAnalyticsBundle();
                analyticsBundle7.putInt("step", 4);
                UtilsKt.fireAnalytics("ch_mark_plan_show", analyticsBundle7);
                spotlight.b();
                return;
            case 5:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle8 = UtilsKt.getAnalyticsBundle();
                analyticsBundle8.putInt("step", 4);
                UtilsKt.fireAnalytics("ch_mark_plan_cta", analyticsBundle8);
                Bundle analyticsBundle9 = UtilsKt.getAnalyticsBundle();
                analyticsBundle9.putInt("step", 5);
                UtilsKt.fireAnalytics("ch_mark_plan_show", analyticsBundle9);
                spotlight.b();
                return;
            case 6:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle10 = UtilsKt.getAnalyticsBundle();
                analyticsBundle10.putInt("step", 5);
                UtilsKt.fireAnalytics("ch_mark_plan_cta", analyticsBundle10);
                spotlight.b();
                return;
            case 7:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle11 = UtilsKt.getAnalyticsBundle();
                analyticsBundle11.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_plan_skip", analyticsBundle11);
                spotlight.a();
                return;
            case 8:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle12 = UtilsKt.getAnalyticsBundle();
                analyticsBundle12.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_plan_skip", analyticsBundle12);
                spotlight.a();
                return;
            case 9:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle13 = UtilsKt.getAnalyticsBundle();
                analyticsBundle13.putInt("step", 3);
                UtilsKt.fireAnalytics("ch_mark_plan_skip", analyticsBundle13);
                spotlight.a();
                return;
            case 10:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle14 = UtilsKt.getAnalyticsBundle();
                analyticsBundle14.putInt("step", 4);
                UtilsKt.fireAnalytics("ch_mark_plan_skip", analyticsBundle14);
                spotlight.a();
                return;
            case 11:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle15 = UtilsKt.getAnalyticsBundle();
                analyticsBundle15.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_lib_nav_cta_click", analyticsBundle15);
                spotlight.b();
                return;
            case 12:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle16 = UtilsKt.getAnalyticsBundle();
                analyticsBundle16.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_lib_toppick_cta", analyticsBundle16);
                Bundle analyticsBundle17 = UtilsKt.getAnalyticsBundle();
                analyticsBundle17.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_lib_toppick_show", analyticsBundle17);
                spotlight.b();
                return;
            case 13:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle18 = UtilsKt.getAnalyticsBundle();
                analyticsBundle18.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_lib_toppick_cta", analyticsBundle18);
                spotlight.b();
                return;
            case 14:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle19 = UtilsKt.getAnalyticsBundle();
                analyticsBundle19.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_lib_toppick_skip", analyticsBundle19);
                spotlight.a();
                return;
            case 15:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle20 = UtilsKt.getAnalyticsBundle();
                analyticsBundle20.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_lib_shortcourse_cta", analyticsBundle20);
                Bundle analyticsBundle21 = UtilsKt.getAnalyticsBundle();
                analyticsBundle21.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_lib_shortcourse_show", analyticsBundle21);
                spotlight.b();
                return;
            case 16:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle22 = UtilsKt.getAnalyticsBundle();
                analyticsBundle22.putInt("step", 2);
                UtilsKt.fireAnalytics("ch_mark_lib_shortcourse_cta", analyticsBundle22);
                spotlight.b();
                return;
            case 17:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle23 = UtilsKt.getAnalyticsBundle();
                analyticsBundle23.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_lib_shortcourse_skip", analyticsBundle23);
                spotlight.a();
                return;
            default:
                kotlin.jvm.internal.i.g(spotlight, "$spotlight");
                Bundle analyticsBundle24 = UtilsKt.getAnalyticsBundle();
                analyticsBundle24.putInt("step", 1);
                UtilsKt.fireAnalytics("ch_mark_lib_collection_cta", analyticsBundle24);
                spotlight.b();
                return;
        }
    }
}
