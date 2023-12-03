package s7;

import an.d0;
import an.g0;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import c9.j;
import com.google.android.exoplayer2.drm.c;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.AnimUtils;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import hs.k;
import ik.l1;
import ik.q1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31296u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f31297v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f31298w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f31299x;

    public /* synthetic */ b(Object obj, int i6, Object obj2, int i10) {
        this.f31296u = i10;
        this.f31298w = obj;
        this.f31297v = i6;
        this.f31299x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View childAt;
        View findViewById;
        int i6 = this.f31296u;
        boolean z10 = false;
        int i10 = this.f31297v;
        Object obj = this.f31299x;
        Object obj2 = this.f31298w;
        switch (i6) {
            case 0:
                c.a aVar = (c.a) obj2;
                com.google.android.exoplayer2.drm.c cVar = (com.google.android.exoplayer2.drm.c) obj;
                int i11 = aVar.f6438a;
                cVar.k();
                cVar.g0(i11, aVar.f6439b, i10);
                return;
            case 1:
                j.a aVar2 = (j.a) obj;
                Iterator it = ((CopyOnWriteArraySet) obj2).iterator();
                while (it.hasNext()) {
                    j.c cVar2 = (j.c) it.next();
                    if (!cVar2.f5150d) {
                        if (i10 != -1) {
                            cVar2.f5148b.a(i10);
                        }
                        cVar2.f5149c = true;
                        aVar2.invoke(cVar2.f5147a);
                    }
                }
                return;
            case 2:
                q1 this$0 = (q1) obj2;
                Bundle analyticsBundle = (Bundle) obj;
                int i12 = q1.f20277x;
                i.g(this$0, "this$0");
                i.g(analyticsBundle, "$analyticsBundle");
                if (this$0.isAdded()) {
                    ((RobertoButton) this$0._$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new l1(i10, this$0, analyticsBundle, 1));
                    return;
                }
                return;
            case 3:
                V3DashboardActivity this$02 = (V3DashboardActivity) obj2;
                hs.f latestActiveIndex = (hs.f) obj;
                int i13 = V3DashboardActivity.f10714r1;
                i.g(this$02, "this$0");
                i.g(latestActiveIndex, "$latestActiveIndex");
                try {
                    RecyclerView recyclerView = (RecyclerView) this$02.n0(R.id.rvPlanMultiCardRecycler);
                    if (recyclerView != null) {
                        recyclerView.l0(i10);
                    }
                    if (((Boolean) latestActiveIndex.f19465v).booleanValue()) {
                        String str = gk.a.f16573a;
                        Bundle bundle = new Bundle();
                        Object obj3 = latestActiveIndex.f19464u;
                        if (((Number) obj3).intValue() == -1) {
                            z10 = true;
                        }
                        String str2 = null;
                        if (z10) {
                            obj3 = null;
                        }
                        Integer num = (Integer) obj3;
                        if (num != null) {
                            bundle.putInt(Constants.DAYMODEL_POSITION, num.intValue());
                        }
                        bundle.putString("plan_card_variant", "multi");
                        bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle.putBoolean("subscription_enabled", SubscriptionPersistence.INSTANCE.getSubscriptionEnabled());
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str2 = user.getVersion();
                        }
                        bundle.putString("version", str2);
                        k kVar = k.f19476a;
                        gk.a.b(bundle, "sneak_peak_show");
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$02.f10748v, e10);
                    return;
                }
            default:
                d0 this$03 = (d0) obj2;
                Float f = (Float) obj;
                int i14 = d0.N;
                i.g(this$03, "this$0");
                try {
                    NestedScrollView nestedScrollView = (NestedScrollView) this$03._$_findCachedViewById(R.id.nsvShorCoursesScrollContainer);
                    if (nestedScrollView != null) {
                        nestedScrollView.fling(0);
                    }
                    NestedScrollView nestedScrollView2 = (NestedScrollView) this$03._$_findCachedViewById(R.id.nsvShorCoursesScrollContainer);
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.smoothScrollTo(0, (int) f.floatValue());
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this$03._$_findCachedViewById(R.id.rvShortCoursesDayPlan);
                    if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(i10)) != null && (findViewById = childAt.findViewById(R.id.viewRowShortCoursePulseBg)) != null) {
                        findViewById.setVisibility(0);
                        AnimatorSet showPulseEffect$default = AnimUtils.showPulseEffect$default(AnimUtils.INSTANCE, findViewById, 1500L, 1.3f, 0.0f, 0, 24, null);
                        showPulseEffect$default.addListener(new g0(findViewById, this$03));
                        this$03.H = showPulseEffect$default;
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$03.f688u, e11);
                    return;
                }
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i6, int i10) {
        this.f31296u = i10;
        this.f31298w = obj;
        this.f31299x = obj2;
        this.f31297v = i6;
    }
}
