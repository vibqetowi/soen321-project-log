package dl;

import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.CustomLeftSmoothScroller;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13004u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13005v;

    public /* synthetic */ e(V2DashboardActivity v2DashboardActivity, int i6) {
        this.f13004u = i6;
        this.f13005v = v2DashboardActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CourseDayModel courseDayModel;
        int i6;
        int i10 = this.f13004u;
        V2DashboardActivity this$0 = this.f13005v;
        switch (i10) {
            case 0:
                int i11 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ArrayList<CourseDayModel> plan = this$0.I0().getPlan();
                    long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                    try {
                        int size = plan.size();
                        courseDayModel = null;
                        for (int i12 = 0; i12 < size; i12++) {
                            try {
                                if (plan.get(i12).getPosition() != 1 && (plan.get(i12).getStart_date() == 0 || plan.get(i12).getStart_date() > todayTimeInSeconds)) {
                                    if (i12 > 0 && plan.get(i12).getStart_date() == 0) {
                                        int i13 = i12 - 1;
                                        if (plan.get(i13).getStart_date() != 0) {
                                            if (plan.get(i13).getStart_date() >= todayTimeInSeconds) {
                                            }
                                        }
                                    }
                                }
                                courseDayModel = plan.get(i12);
                            } catch (Exception e10) {
                                e = e10;
                                LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e);
                                kotlin.jvm.internal.i.d(courseDayModel);
                                int position = courseDayModel.getPosition();
                                CustomLeftSmoothScroller customLeftSmoothScroller = new CustomLeftSmoothScroller(this$0);
                                if (!ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        courseDayModel = null;
                    }
                    kotlin.jvm.internal.i.d(courseDayModel);
                    int position2 = courseDayModel.getPosition();
                    CustomLeftSmoothScroller customLeftSmoothScroller2 = new CustomLeftSmoothScroller(this$0);
                    if (!ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                        if (position2 > 0) {
                            if (this$0.Q == 1) {
                                i6 = position2 - 1;
                            } else {
                                i6 = (position2 - 8) % 7;
                            }
                            customLeftSmoothScroller2.setTargetPosition(i6);
                            LinearLayoutManager linearLayoutManager = this$0.C;
                            if (linearLayoutManager != null) {
                                linearLayoutManager.startSmoothScroll(customLeftSmoothScroller2);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("myPlanLayoutManager");
                                throw null;
                            }
                        }
                        return;
                    }
                    if (position2 == 1) {
                        if (this$0.I0().getInitialAssessmentScore() == -1) {
                            position2--;
                        }
                        customLeftSmoothScroller2.setTargetPosition(position2);
                    } else {
                        if (this$0.Q != 1) {
                            position2 = (position2 - 8) % 7;
                        }
                        customLeftSmoothScroller2.setTargetPosition(position2);
                    }
                    LinearLayoutManager linearLayoutManager2 = this$0.C;
                    if (linearLayoutManager2 != null) {
                        linearLayoutManager2.startSmoothScroll(customLeftSmoothScroller2);
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("myPlanLayoutManager");
                        throw null;
                    }
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f10673v, "exception", e12);
                    return;
                }
            case 1:
                int i14 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.i1();
                return;
            case 2:
                int i15 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    CustomLeftSmoothScroller customLeftSmoothScroller3 = new CustomLeftSmoothScroller(this$0);
                    customLeftSmoothScroller3.setTargetPosition(0);
                    LinearLayoutManager linearLayoutManager3 = this$0.C;
                    if (linearLayoutManager3 != null) {
                        linearLayoutManager3.startSmoothScroll(customLeftSmoothScroller3);
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("myPlanLayoutManager");
                        throw null;
                    }
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$0.f10673v, "exception", e13);
                    return;
                }
            case 3:
                int i16 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    ((ScrollView) this$0.n0(R.id.scrollView2)).smoothScrollTo(0, ((int) ((FrameLayout) this$0.n0(R.id.containerFrame)).getY()) - 500);
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(this$0.f10673v, e14);
                    return;
                }
            default:
                int i17 = V2DashboardActivity.F0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.A0();
                return;
        }
    }
}
