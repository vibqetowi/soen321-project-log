package il;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import hl.d0;
import hl.e0;
import xj.b;
import xj.j;
/* compiled from: NotV4DashboardCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f20364a;

    /* renamed from: b  reason: collision with root package name */
    public final View f20365b;

    /* renamed from: c  reason: collision with root package name */
    public final ss.a<hs.k> f20366c;

    /* renamed from: d  reason: collision with root package name */
    public final ss.l<xj.b, hs.k> f20367d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20368e;

    public j(androidx.fragment.app.p pVar, View view, d0 d0Var, e0 e0Var) {
        this.f20364a = pVar;
        this.f20365b = view;
        this.f20366c = d0Var;
        this.f20367d = e0Var;
        String makeLogTag = LogHelper.INSTANCE.makeLogTag("NotV4DashboardCoachMarkUtil");
        this.f20368e = makeLogTag;
        try {
            String it = ApplicationPersistence.getInstance().getStringValue("notV4HomeCoachMarkStep");
            kotlin.jvm.internal.i.f(it, "it");
            it = gv.n.B0(it) ? null : it;
            if (it == null) {
                if (view != null) {
                    try {
                        View findViewById = view.findViewById(R.id.cvNewDbSuggestedActivity);
                        if (findViewById != null) {
                            findViewById.post(new Runnable(this) { // from class: il.e

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ j f20357v;

                                {
                                    this.f20357v = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    j jVar;
                                    View inflate;
                                    String str;
                                    int[] iArr;
                                    View inflate2;
                                    int[] iArr2;
                                    View inflate3;
                                    int[] iArr3;
                                    View inflate4;
                                    int[] iArr4;
                                    View inflate5;
                                    int[] iArr5;
                                    b.a aVar;
                                    View view2;
                                    int i6 = r2;
                                    j this$0 = this.f20357v;
                                    switch (i6) {
                                        case 0:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            View view3 = this$0.f20365b;
                                            Activity activity = this$0.f20364a;
                                            try {
                                                View findViewById2 = view3.findViewById(R.id.clNotV4DashboardCoachMarkLibrary);
                                                if (findViewById2 != null) {
                                                    findViewById2.setVisibility(4);
                                                }
                                                BottomNavigationView bottomNavigationView = (BottomNavigationView) view3.findViewById(R.id.bnvNotV4DbNavigation);
                                                if (bottomNavigationView != null) {
                                                    view2 = bottomNavigationView.findViewById(R.id.navigation_item_2);
                                                } else {
                                                    view2 = null;
                                                }
                                                if (view2 != null) {
                                                    View highlightViewOverlay = activity.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_library_overlay, new FrameLayout(activity));
                                                    j.a aVar2 = new j.a();
                                                    aVar2.b(view2);
                                                    aVar2.f37843b = new zj.a(view2.getHeight() / 2);
                                                    kotlin.jvm.internal.i.f(highlightViewOverlay, "highlightViewOverlay");
                                                    aVar2.f37845d = highlightViewOverlay;
                                                    xj.j a10 = aVar2.a();
                                                    b.a aVar3 = new b.a(activity);
                                                    aVar3.b(a10);
                                                    aVar3.f37817d = g0.a.b(aVar3.f, R.color.black_transparent_85);
                                                    aVar3.f37815b = 1000L;
                                                    aVar3.f37816c = new DecelerateInterpolator(2.0f);
                                                    aVar3.f37818e = new h(this$0, view2);
                                                    xj.b a11 = aVar3.a();
                                                    a11.d();
                                                    this$0.f20367d.invoke(a11);
                                                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                                                    analyticsBundle.putInt("step", 1);
                                                    UtilsKt.fireAnalytics("ch_mark_lib_nav_show", analyticsBundle);
                                                    highlightViewOverlay.setOnClickListener(new g(5));
                                                    highlightViewOverlay.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a11, 11));
                                                    ApplicationPersistence.getInstance().setStringValue("notV4HomeCoachMarkStep", "two");
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e10) {
                                                LogHelper.INSTANCE.e(this$0.f20368e, e10);
                                                return;
                                            }
                                        default:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            View view4 = this$0.f20365b;
                                            Activity activity2 = this$0.f20364a;
                                            try {
                                                View findViewById3 = view4.findViewById(R.id.layoutNotV4DbSuggestedActivity);
                                                View findViewById4 = view4.findViewById(R.id.ivNewDbAssessmentDetails);
                                                View findViewById5 = view4.findViewById(R.id.viewSuggestedActivityCoachMarkPlanView);
                                                View findViewById6 = view4.findViewById(R.id.clSuggestedActivityCardBottomFooter);
                                                View findViewById7 = view4.findViewById(R.id.clSaProgressDetails);
                                                FrameLayout frameLayout = new FrameLayout(activity2);
                                                FrameLayout frameLayout2 = new FrameLayout(activity2);
                                                FrameLayout frameLayout3 = new FrameLayout(activity2);
                                                FrameLayout frameLayout4 = new FrameLayout(activity2);
                                                FrameLayout frameLayout5 = new FrameLayout(activity2);
                                                inflate = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout);
                                                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView == null) {
                                                    str = "notV4HomeCoachMarkStep";
                                                } else {
                                                    str = "notV4HomeCoachMarkStep";
                                                    robertoTextView.setText(activity2.getString(R.string.coachMarkStep, "1"));
                                                }
                                                View findViewById8 = inflate.findViewById(R.id.tvNotV4DashboardCoachMarkPrev);
                                                if (findViewById8 != null) {
                                                    findViewById8.setVisibility(8);
                                                }
                                                RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView2 != null) {
                                                    robertoTextView2.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep1Desc));
                                                }
                                                findViewById3.getLocationInWindow(new int[2]);
                                                robertoTextView2.setTranslationY(iArr[1] + findViewById3.getHeight() + 32.0f);
                                                inflate2 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout2);
                                                RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView3 != null) {
                                                    robertoTextView3.setText(activity2.getString(R.string.coachMarkStep, "2"));
                                                }
                                                RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView4 != null) {
                                                    robertoTextView4.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep2Desc));
                                                }
                                                findViewById4.getLocationInWindow(new int[2]);
                                                robertoTextView4.setTranslationY(iArr2[1] + findViewById4.getHeight() + 32.0f);
                                                inflate3 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout3);
                                                RobertoTextView robertoTextView5 = (RobertoTextView) inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView5 != null) {
                                                    robertoTextView5.setText(activity2.getString(R.string.coachMarkStep, "3"));
                                                }
                                                RobertoTextView robertoTextView6 = (RobertoTextView) inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView6 != null) {
                                                    robertoTextView6.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep3Desc));
                                                }
                                                findViewById5.getLocationInWindow(new int[2]);
                                                robertoTextView6.setTranslationY(iArr3[1] + findViewById5.getHeight() + 32.0f);
                                                inflate4 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout4);
                                                RobertoTextView robertoTextView7 = (RobertoTextView) inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView7 != null) {
                                                    robertoTextView7.setText(activity2.getString(R.string.coachMarkStep, "4"));
                                                }
                                                RobertoTextView robertoTextView8 = (RobertoTextView) inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView8 != null) {
                                                    robertoTextView8.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep4Desc));
                                                }
                                                findViewById6.getLocationInWindow(new int[2]);
                                                robertoTextView8.setTranslationY(iArr4[1] + findViewById6.getHeight() + 32.0f);
                                                inflate5 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout5);
                                                RobertoTextView robertoTextView9 = (RobertoTextView) inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkNext);
                                                if (robertoTextView9 != null) {
                                                    robertoTextView9.setText(activity2.getString(R.string.done_label));
                                                }
                                                RobertoTextView robertoTextView10 = (RobertoTextView) inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView10 != null) {
                                                    robertoTextView10.setText(activity2.getString(R.string.coachMarkStep, "5"));
                                                }
                                                RobertoTextView robertoTextView11 = (RobertoTextView) inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView11 != null) {
                                                    robertoTextView11.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep5Desc));
                                                }
                                                findViewById7.getLocationInWindow(new int[2]);
                                                robertoTextView11.setTranslationY(iArr5[1] + findViewById7.getHeight() + 32.0f);
                                                j.a aVar4 = new j.a();
                                                aVar4.b(findViewById3);
                                                float f = 25;
                                                try {
                                                    aVar4.f37843b = new zj.b(findViewById3.getHeight() + f, findViewById3.getWidth() - f, 12.0f);
                                                    aVar4.f37845d = inflate;
                                                    xj.j a12 = aVar4.a();
                                                    j.a aVar5 = new j.a();
                                                    aVar5.b(findViewById4);
                                                    aVar5.f37843b = new zj.b(findViewById4.getHeight() + f, findViewById4.getWidth() + f, 12.0f);
                                                    aVar5.f37845d = inflate2;
                                                    xj.j a13 = aVar5.a();
                                                    j.a aVar6 = new j.a();
                                                    aVar6.b(findViewById5);
                                                    aVar6.f37843b = new zj.b(findViewById5.getHeight(), findViewById5.getWidth(), 12.0f);
                                                    aVar6.f37845d = inflate3;
                                                    xj.j a14 = aVar6.a();
                                                    j.a aVar7 = new j.a();
                                                    aVar7.b(findViewById6);
                                                    aVar7.f37843b = new zj.b(findViewById6.getHeight(), findViewById6.getWidth(), activity2.getResources().getDimension(R.dimen.margin_12));
                                                    aVar7.f37845d = inflate4;
                                                    xj.j a15 = aVar7.a();
                                                    j.a aVar8 = new j.a();
                                                    aVar8.b(findViewById7);
                                                    aVar8.f37843b = new zj.b(findViewById7.getHeight() + f, findViewById7.getWidth() + f, 12.0f);
                                                    aVar8.f37845d = inflate5;
                                                    xj.j a16 = aVar8.a();
                                                    aVar = new b.a(activity2);
                                                    aVar.b(a12, a13, a14, a15, a16);
                                                    aVar.f37817d = g0.a.b(aVar.f, R.color.black_transparent_85);
                                                    aVar.f37815b = 1000L;
                                                    aVar.f37816c = new DecelerateInterpolator(2.0f);
                                                    jVar = this$0;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    jVar = this$0;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                jVar = this$0;
                                            }
                                            try {
                                                aVar.f37818e = new i(jVar);
                                                xj.b a17 = aVar.a();
                                                a17.d();
                                                jVar.f20367d.invoke(a17);
                                                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                                                analyticsBundle2.putInt("step", 1);
                                                UtilsKt.fireAnalytics("ch_mark_plan_show", analyticsBundle2);
                                                f fVar = new f(a17, 0);
                                                inflate.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 2));
                                                inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 3));
                                                inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 4));
                                                inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 5));
                                                inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 6));
                                                inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 7));
                                                inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 8));
                                                inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 9));
                                                inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 10));
                                                inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 1));
                                                inflate.setOnClickListener(new g(0));
                                                inflate2.setOnClickListener(new g(1));
                                                inflate3.setOnClickListener(new g(2));
                                                inflate4.setOnClickListener(new g(3));
                                                inflate5.setOnClickListener(new g(4));
                                                ApplicationPersistence.getInstance().setStringValue(str, "one");
                                                return;
                                            } catch (Exception e13) {
                                                e = e13;
                                                LogHelper.INSTANCE.e(jVar.f20368e, e);
                                                return;
                                            }
                                    }
                                }
                            });
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(makeLogTag, e10);
                    }
                }
                return;
            }
            if (kotlin.jvm.internal.i.b(it, "one")) {
                if (ApplicationPersistence.getInstance().getBooleanValue("notV4HomeCoachMarkSkipLibraryStep", false)) {
                    ApplicationPersistence.getInstance().setStringValue("notV4HomeCoachMarkStep", "two");
                } else if (view != null) {
                    try {
                        View findViewById2 = view.findViewById(R.id.bnvNotV4DbNavigation);
                        if (findViewById2 != null) {
                            findViewById2.post(new Runnable(this) { // from class: il.e

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ j f20357v;

                                {
                                    this.f20357v = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    j jVar;
                                    View inflate;
                                    String str;
                                    int[] iArr;
                                    View inflate2;
                                    int[] iArr2;
                                    View inflate3;
                                    int[] iArr3;
                                    View inflate4;
                                    int[] iArr4;
                                    View inflate5;
                                    int[] iArr5;
                                    b.a aVar;
                                    View view2;
                                    int i6 = r2;
                                    j this$0 = this.f20357v;
                                    switch (i6) {
                                        case 0:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            View view3 = this$0.f20365b;
                                            Activity activity = this$0.f20364a;
                                            try {
                                                View findViewById22 = view3.findViewById(R.id.clNotV4DashboardCoachMarkLibrary);
                                                if (findViewById22 != null) {
                                                    findViewById22.setVisibility(4);
                                                }
                                                BottomNavigationView bottomNavigationView = (BottomNavigationView) view3.findViewById(R.id.bnvNotV4DbNavigation);
                                                if (bottomNavigationView != null) {
                                                    view2 = bottomNavigationView.findViewById(R.id.navigation_item_2);
                                                } else {
                                                    view2 = null;
                                                }
                                                if (view2 != null) {
                                                    View highlightViewOverlay = activity.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_library_overlay, new FrameLayout(activity));
                                                    j.a aVar2 = new j.a();
                                                    aVar2.b(view2);
                                                    aVar2.f37843b = new zj.a(view2.getHeight() / 2);
                                                    kotlin.jvm.internal.i.f(highlightViewOverlay, "highlightViewOverlay");
                                                    aVar2.f37845d = highlightViewOverlay;
                                                    xj.j a10 = aVar2.a();
                                                    b.a aVar3 = new b.a(activity);
                                                    aVar3.b(a10);
                                                    aVar3.f37817d = g0.a.b(aVar3.f, R.color.black_transparent_85);
                                                    aVar3.f37815b = 1000L;
                                                    aVar3.f37816c = new DecelerateInterpolator(2.0f);
                                                    aVar3.f37818e = new h(this$0, view2);
                                                    xj.b a11 = aVar3.a();
                                                    a11.d();
                                                    this$0.f20367d.invoke(a11);
                                                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                                                    analyticsBundle.putInt("step", 1);
                                                    UtilsKt.fireAnalytics("ch_mark_lib_nav_show", analyticsBundle);
                                                    highlightViewOverlay.setOnClickListener(new g(5));
                                                    highlightViewOverlay.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a11, 11));
                                                    ApplicationPersistence.getInstance().setStringValue("notV4HomeCoachMarkStep", "two");
                                                    return;
                                                }
                                                return;
                                            } catch (Exception e102) {
                                                LogHelper.INSTANCE.e(this$0.f20368e, e102);
                                                return;
                                            }
                                        default:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            View view4 = this$0.f20365b;
                                            Activity activity2 = this$0.f20364a;
                                            try {
                                                View findViewById3 = view4.findViewById(R.id.layoutNotV4DbSuggestedActivity);
                                                View findViewById4 = view4.findViewById(R.id.ivNewDbAssessmentDetails);
                                                View findViewById5 = view4.findViewById(R.id.viewSuggestedActivityCoachMarkPlanView);
                                                View findViewById6 = view4.findViewById(R.id.clSuggestedActivityCardBottomFooter);
                                                View findViewById7 = view4.findViewById(R.id.clSaProgressDetails);
                                                FrameLayout frameLayout = new FrameLayout(activity2);
                                                FrameLayout frameLayout2 = new FrameLayout(activity2);
                                                FrameLayout frameLayout3 = new FrameLayout(activity2);
                                                FrameLayout frameLayout4 = new FrameLayout(activity2);
                                                FrameLayout frameLayout5 = new FrameLayout(activity2);
                                                inflate = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout);
                                                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView == null) {
                                                    str = "notV4HomeCoachMarkStep";
                                                } else {
                                                    str = "notV4HomeCoachMarkStep";
                                                    robertoTextView.setText(activity2.getString(R.string.coachMarkStep, "1"));
                                                }
                                                View findViewById8 = inflate.findViewById(R.id.tvNotV4DashboardCoachMarkPrev);
                                                if (findViewById8 != null) {
                                                    findViewById8.setVisibility(8);
                                                }
                                                RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView2 != null) {
                                                    robertoTextView2.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep1Desc));
                                                }
                                                findViewById3.getLocationInWindow(new int[2]);
                                                robertoTextView2.setTranslationY(iArr[1] + findViewById3.getHeight() + 32.0f);
                                                inflate2 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout2);
                                                RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView3 != null) {
                                                    robertoTextView3.setText(activity2.getString(R.string.coachMarkStep, "2"));
                                                }
                                                RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView4 != null) {
                                                    robertoTextView4.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep2Desc));
                                                }
                                                findViewById4.getLocationInWindow(new int[2]);
                                                robertoTextView4.setTranslationY(iArr2[1] + findViewById4.getHeight() + 32.0f);
                                                inflate3 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout3);
                                                RobertoTextView robertoTextView5 = (RobertoTextView) inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView5 != null) {
                                                    robertoTextView5.setText(activity2.getString(R.string.coachMarkStep, "3"));
                                                }
                                                RobertoTextView robertoTextView6 = (RobertoTextView) inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView6 != null) {
                                                    robertoTextView6.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep3Desc));
                                                }
                                                findViewById5.getLocationInWindow(new int[2]);
                                                robertoTextView6.setTranslationY(iArr3[1] + findViewById5.getHeight() + 32.0f);
                                                inflate4 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout4);
                                                RobertoTextView robertoTextView7 = (RobertoTextView) inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView7 != null) {
                                                    robertoTextView7.setText(activity2.getString(R.string.coachMarkStep, "4"));
                                                }
                                                RobertoTextView robertoTextView8 = (RobertoTextView) inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView8 != null) {
                                                    robertoTextView8.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep4Desc));
                                                }
                                                findViewById6.getLocationInWindow(new int[2]);
                                                robertoTextView8.setTranslationY(iArr4[1] + findViewById6.getHeight() + 32.0f);
                                                inflate5 = activity2.getLayoutInflater().inflate(R.layout.layout_notv4db_coachmark_overlay, frameLayout5);
                                                RobertoTextView robertoTextView9 = (RobertoTextView) inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkNext);
                                                if (robertoTextView9 != null) {
                                                    robertoTextView9.setText(activity2.getString(R.string.done_label));
                                                }
                                                RobertoTextView robertoTextView10 = (RobertoTextView) inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkStep);
                                                if (robertoTextView10 != null) {
                                                    robertoTextView10.setText(activity2.getString(R.string.coachMarkStep, "5"));
                                                }
                                                RobertoTextView robertoTextView11 = (RobertoTextView) inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkDesc);
                                                if (robertoTextView11 != null) {
                                                    robertoTextView11.setText(activity2.getString(R.string.notV4DashboardCoachMarkStep5Desc));
                                                }
                                                findViewById7.getLocationInWindow(new int[2]);
                                                robertoTextView11.setTranslationY(iArr5[1] + findViewById7.getHeight() + 32.0f);
                                                j.a aVar4 = new j.a();
                                                aVar4.b(findViewById3);
                                                float f = 25;
                                                try {
                                                    aVar4.f37843b = new zj.b(findViewById3.getHeight() + f, findViewById3.getWidth() - f, 12.0f);
                                                    aVar4.f37845d = inflate;
                                                    xj.j a12 = aVar4.a();
                                                    j.a aVar5 = new j.a();
                                                    aVar5.b(findViewById4);
                                                    aVar5.f37843b = new zj.b(findViewById4.getHeight() + f, findViewById4.getWidth() + f, 12.0f);
                                                    aVar5.f37845d = inflate2;
                                                    xj.j a13 = aVar5.a();
                                                    j.a aVar6 = new j.a();
                                                    aVar6.b(findViewById5);
                                                    aVar6.f37843b = new zj.b(findViewById5.getHeight(), findViewById5.getWidth(), 12.0f);
                                                    aVar6.f37845d = inflate3;
                                                    xj.j a14 = aVar6.a();
                                                    j.a aVar7 = new j.a();
                                                    aVar7.b(findViewById6);
                                                    aVar7.f37843b = new zj.b(findViewById6.getHeight(), findViewById6.getWidth(), activity2.getResources().getDimension(R.dimen.margin_12));
                                                    aVar7.f37845d = inflate4;
                                                    xj.j a15 = aVar7.a();
                                                    j.a aVar8 = new j.a();
                                                    aVar8.b(findViewById7);
                                                    aVar8.f37843b = new zj.b(findViewById7.getHeight() + f, findViewById7.getWidth() + f, 12.0f);
                                                    aVar8.f37845d = inflate5;
                                                    xj.j a16 = aVar8.a();
                                                    aVar = new b.a(activity2);
                                                    aVar.b(a12, a13, a14, a15, a16);
                                                    aVar.f37817d = g0.a.b(aVar.f, R.color.black_transparent_85);
                                                    aVar.f37815b = 1000L;
                                                    aVar.f37816c = new DecelerateInterpolator(2.0f);
                                                    jVar = this$0;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    jVar = this$0;
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                jVar = this$0;
                                            }
                                            try {
                                                aVar.f37818e = new i(jVar);
                                                xj.b a17 = aVar.a();
                                                a17.d();
                                                jVar.f20367d.invoke(a17);
                                                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                                                analyticsBundle2.putInt("step", 1);
                                                UtilsKt.fireAnalytics("ch_mark_plan_show", analyticsBundle2);
                                                f fVar = new f(a17, 0);
                                                inflate.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 2));
                                                inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 3));
                                                inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 4));
                                                inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 5));
                                                inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkNext).setOnClickListener(new f(a17, 6));
                                                inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkPrev).setOnClickListener(fVar);
                                                inflate.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 7));
                                                inflate2.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 8));
                                                inflate3.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 9));
                                                inflate4.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 10));
                                                inflate5.findViewById(R.id.tvNotV4DashboardCoachMarkSkip).setOnClickListener(new f(a17, 1));
                                                inflate.setOnClickListener(new g(0));
                                                inflate2.setOnClickListener(new g(1));
                                                inflate3.setOnClickListener(new g(2));
                                                inflate4.setOnClickListener(new g(3));
                                                inflate5.setOnClickListener(new g(4));
                                                ApplicationPersistence.getInstance().setStringValue(str, "one");
                                                return;
                                            } catch (Exception e13) {
                                                e = e13;
                                                LogHelper.INSTANCE.e(jVar.f20368e, e);
                                                return;
                                            }
                                    }
                                }
                            });
                        }
                    } catch (Exception e11) {
                        LogHelper.INSTANCE.e(makeLogTag, e11);
                    }
                }
            }
            return;
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(makeLogTag, e12);
        }
        LogHelper.INSTANCE.e(makeLogTag, e12);
    }
}
