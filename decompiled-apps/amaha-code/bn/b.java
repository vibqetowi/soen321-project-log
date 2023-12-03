package bn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bn.c;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import kotlin.jvm.internal.i;
import xj.b;
import xj.j;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4535u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f4536v;

    public /* synthetic */ b(c cVar, int i6) {
        this.f4535u = i6;
        this.f4536v = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i6;
        int i10;
        int i11;
        float f;
        int[] iArr;
        int[] iArr2;
        View view2;
        int[] iArr3;
        int[] iArr4;
        int i12 = this.f4535u;
        c this$0 = this.f4536v;
        switch (i12) {
            case 0:
                i.g(this$0, "this$0");
                View view3 = this$0.f4538b;
                Activity activity = this$0.f4537a;
                try {
                    View findViewById = view3.findViewById(R.id.rvLibraryTopPicksRecycler);
                    View inflate = activity.getLayoutInflater().inflate(R.layout.layout_library_coachmark_overlay_top_pick_1, new FrameLayout(activity));
                    View findViewById2 = inflate.findViewById(R.id.clLibraryCoachMarkTopPick1Prompt);
                    findViewById.getLocationInWindow(new int[2]);
                    float f2 = 25;
                    findViewById2.setTranslationY(iArr[1] + findViewById.getHeight() + (findViewById2.getHeight() / 2) + f2);
                    j.a aVar = new j.a();
                    aVar.b(findViewById);
                    aVar.f37843b = new zj.b(findViewById.getHeight() + f2, findViewById.getWidth() - f2, 12.0f);
                    aVar.f37845d = inflate;
                    j a10 = aVar.a();
                    View findViewById3 = view3.findViewById(R.id.hsvLibraryTopPicksFilterContainer);
                    View inflate2 = activity.getLayoutInflater().inflate(R.layout.layout_library_coachmark_overlay_top_pick_2, new FrameLayout(activity));
                    View findViewById4 = inflate2.findViewById(R.id.tvLibraryCoachMarkTopPick2Skip);
                    if (findViewById4 != null) {
                        findViewById4.setVisibility(8);
                    }
                    View findViewById5 = inflate2.findViewById(R.id.tvLibraryCoachMarkTopPick2Desc);
                    findViewById3.getLocationInWindow(new int[2]);
                    findViewById5.setTranslationY(iArr2[1] + findViewById3.getHeight() + (findViewById5.getHeight() / 2) + f2);
                    j.a aVar2 = new j.a();
                    aVar2.b(findViewById3);
                    aVar2.f37843b = new zj.b(findViewById3.getHeight() + f2, findViewById3.getWidth() - f2, 12.0f);
                    aVar2.f37845d = inflate2;
                    j a11 = aVar2.a();
                    b.a aVar3 = new b.a(activity);
                    aVar3.b(a10, a11);
                    aVar3.f37817d = g0.a.b(aVar3.f, R.color.black_transparent_85);
                    aVar3.f37815b = 1000L;
                    aVar3.f37816c = new DecelerateInterpolator(2.0f);
                    aVar3.f37818e = new c.C0086c();
                    xj.b a12 = aVar3.a();
                    a12.d();
                    this$0.f4539c.invoke(a12);
                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                    analyticsBundle.putInt("step", 1);
                    UtilsKt.fireAnalytics("ch_mark_lib_toppick_show", analyticsBundle);
                    inflate.findViewById(R.id.tvLibraryCoachMarkTopPick1Next).setOnClickListener(new il.f(a12, 12));
                    inflate2.findViewById(R.id.tvLibraryCoachMarkTopPick2Next).setOnClickListener(new il.f(a12, 13));
                    inflate.findViewById(R.id.tvLibraryCoachMarkTopPick1Skip).setOnClickListener(new il.f(a12, 14));
                    inflate.setOnClickListener(new il.g(7));
                    inflate2.setOnClickListener(new il.g(8));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f4540d, e10);
                    return;
                }
            case 1:
                i.g(this$0, "this$0");
                View view4 = this$0.f4538b;
                Activity activity2 = this$0.f4537a;
                try {
                    RecyclerView recyclerView = (RecyclerView) view4.findViewById(R.id.rvLibraryDbShortCourses);
                    if (recyclerView != null) {
                        view2 = recyclerView.getChildAt(0);
                    } else {
                        view2 = null;
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) view4.findViewById(R.id.tvLibraryDbShortCoursesCoachMarkHeightDeterminer);
                    View findViewById6 = view4.findViewById(R.id.hsvShortCoursesDBFilterContainer);
                    if (view2 != null && findViewById6 != null) {
                        View inflate3 = activity2.getLayoutInflater().inflate(R.layout.layout_library_coachmark_overlay_top_pick_1, new FrameLayout(activity2));
                        View findViewById7 = inflate3.findViewById(R.id.ivLibraryCoachMarkTopPick1);
                        if (findViewById7 != null) {
                            findViewById7.setVisibility(8);
                        }
                        RobertoTextView robertoTextView2 = (RobertoTextView) inflate3.findViewById(R.id.tvLibraryCoachMarkTopPick1Desc);
                        if (robertoTextView2 != null) {
                            robertoTextView2.setText(activity2.getString(R.string.notV4LibraryShortCoursesCoachMarkHeader));
                        }
                        if (robertoTextView != null) {
                            robertoTextView.setText(activity2.getString(R.string.notV4LibraryShortCoursesCoachMarkHeader));
                        }
                        View findViewById8 = inflate3.findViewById(R.id.clLibraryCoachMarkTopPick1Prompt);
                        view2.getLocationInWindow(new int[2]);
                        findViewById8.setTranslationY((iArr3[1] - (robertoTextView.getHeight() * 2)) - 70);
                        j.a aVar4 = new j.a();
                        aVar4.b(view2);
                        aVar4.f37843b = new zj.b(view2.getHeight(), view2.getWidth(), activity2.getResources().getDimension(R.dimen.margin_12));
                        aVar4.f37845d = inflate3;
                        j a13 = aVar4.a();
                        View inflate4 = activity2.getLayoutInflater().inflate(R.layout.layout_library_coachmark_overlay_top_pick_2, new FrameLayout(activity2));
                        View findViewById9 = inflate4.findViewById(R.id.tvLibraryCoachMarkTopPick2Skip);
                        if (findViewById9 != null) {
                            findViewById9.setVisibility(8);
                        }
                        RobertoTextView robertoTextView3 = (RobertoTextView) inflate4.findViewById(R.id.tvLibraryCoachMarkTopPick2Desc);
                        if (robertoTextView3 != null) {
                            robertoTextView3.setText(activity2.getString(R.string.notV4LibraryShortCoursesCoachMarkDesc));
                        }
                        findViewById6.getLocationInWindow(new int[2]);
                        robertoTextView3.setTranslationY(iArr4[1] + 32.0f);
                        j.a aVar5 = new j.a();
                        aVar5.b(findViewById6);
                        aVar5.f37843b = new zj.b(findViewById6.getHeight(), findViewById6.getWidth(), 12.0f);
                        aVar5.f37845d = inflate4;
                        j a14 = aVar5.a();
                        b.a aVar6 = new b.a(activity2);
                        aVar6.b(a13, a14);
                        aVar6.f37817d = g0.a.b(aVar6.f, R.color.black_transparent_85);
                        aVar6.f37815b = 1000L;
                        aVar6.f37816c = new DecelerateInterpolator(2.0f);
                        aVar6.f37818e = new c.b();
                        xj.b a15 = aVar6.a();
                        a15.d();
                        this$0.f4539c.invoke(a15);
                        Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                        analyticsBundle2.putInt("step", 1);
                        UtilsKt.fireAnalytics("ch_mark_lib_shortcourse_show", analyticsBundle2);
                        inflate3.findViewById(R.id.tvLibraryCoachMarkTopPick1Next).setOnClickListener(new il.f(a15, 15));
                        inflate4.findViewById(R.id.tvLibraryCoachMarkTopPick2Next).setOnClickListener(new il.f(a15, 16));
                        inflate3.findViewById(R.id.tvLibraryCoachMarkTopPick1Skip).setOnClickListener(new il.f(a15, 17));
                        inflate3.setOnClickListener(new il.g(9));
                        inflate4.setOnClickListener(new il.g(10));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f4540d, e11);
                    return;
                }
            default:
                i.g(this$0, "this$0");
                View view5 = this$0.f4538b;
                Activity activity3 = this$0.f4537a;
                try {
                    boolean h10 = this$0.h();
                    RecyclerView recyclerView2 = (RecyclerView) view5.findViewById(R.id.rvLibraryCollectionsRecycler);
                    if (recyclerView2 != null) {
                        view = recyclerView2.getChildAt(0);
                    } else {
                        view = null;
                    }
                    View findViewById10 = view5.findViewById(R.id.tvLibraryCoachMarkTopPick2DescHeightHelper);
                    if (view != null) {
                        View inflate5 = activity3.getLayoutInflater().inflate(R.layout.layout_library_coachmark_overlay_top_pick_2, new FrameLayout(activity3));
                        View findViewById11 = inflate5.findViewById(R.id.tvLibraryCoachMarkTopPick2Step);
                        if (findViewById11 == null) {
                            i10 = R.id.tvLibraryCoachMarkTopPick2Skip;
                            i6 = 8;
                        } else {
                            i6 = 8;
                            findViewById11.setVisibility(8);
                            i10 = R.id.tvLibraryCoachMarkTopPick2Skip;
                        }
                        View findViewById12 = inflate5.findViewById(i10);
                        if (findViewById12 != null) {
                            findViewById12.setVisibility(i6);
                        }
                        RobertoTextView robertoTextView4 = (RobertoTextView) inflate5.findViewById(R.id.tvLibraryCoachMarkTopPick2Desc);
                        if (robertoTextView4 != null) {
                            robertoTextView4.setText(activity3.getString(R.string.notV4LibraryCollectionsCoachMarkHeader));
                        }
                        int[] iArr5 = new int[2];
                        view.getLocationInWindow(iArr5);
                        if (h10) {
                            f = iArr5[1] + view.getHeight() + 25;
                        } else {
                            float f10 = iArr5[1];
                            if (findViewById10 != null) {
                                i11 = findViewById10.getHeight();
                            } else {
                                i11 = 0;
                            }
                            f = (f10 - i11) - 75;
                        }
                        robertoTextView4.setTranslationY(f);
                        j.a aVar7 = new j.a();
                        aVar7.b(view);
                        aVar7.f37843b = new zj.b(view.getHeight(), view.getWidth(), activity3.getResources().getDimension(R.dimen.margin_12));
                        aVar7.f37845d = inflate5;
                        j a16 = aVar7.a();
                        b.a aVar8 = new b.a(activity3);
                        aVar8.b(a16);
                        aVar8.f37817d = g0.a.b(aVar8.f, R.color.black_transparent_85);
                        aVar8.f37815b = 1000L;
                        aVar8.f37816c = new DecelerateInterpolator(2.0f);
                        aVar8.f37818e = new c.a();
                        xj.b a17 = aVar8.a();
                        a17.d();
                        this$0.f4539c.invoke(a17);
                        Bundle analyticsBundle3 = UtilsKt.getAnalyticsBundle();
                        analyticsBundle3.putInt("step", 1);
                        UtilsKt.fireAnalytics("ch_mark_lib_collection_show", analyticsBundle3);
                        inflate5.findViewById(R.id.tvLibraryCoachMarkTopPick2Next).setOnClickListener(new il.f(a17, 18));
                        inflate5.setOnClickListener(new il.g(11));
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f4540d, e12);
                    return;
                }
        }
    }
}
