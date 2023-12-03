package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ca.a;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.l1;
import ek.m1;
import gv.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SevenDayProgressActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/SevenDayProgressActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SevenDayProgressActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f10485y = 0;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f10488x = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public int f10486v = 1;

    /* renamed from: w  reason: collision with root package name */
    public final String f10487w = LogHelper.INSTANCE.makeLogTag(SevenDayProgressActivity.class);

    /* JADX WARN: Removed duplicated region for block: B:29:0x0035 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int o0(int i6, boolean z10) {
        if (z10) {
            if (i6 >= 7) {
                if (i6 >= 14) {
                    if (i6 < 21) {
                        return 3;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        } else if (d.q(Constants.USER_VERSION)) {
            if (i6 >= 8) {
                if (i6 >= 16) {
                    if (i6 < 23) {
                    }
                }
                return 2;
            }
            return 1;
        } else {
            if (i6 >= 8) {
                if (i6 >= 15) {
                    if (i6 < 22) {
                    }
                }
                return 2;
            }
            return 1;
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f10488x;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int position;
        int o02;
        RecyclerView.e l1Var;
        super.onCreate(bundle);
        setContentView(R.layout.activity_seven_day_progress);
        try {
            Course course = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                CourseDayModelV1 dayPlanForDateV3 = CourseUtilKt.getDayPlanForDateV3(course.getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                i.d(dayPlanForDateV3);
                position = dayPlanForDateV3.getPosition();
            } else {
                ArrayList<CourseDayModel> plan = course.getPlan();
                long todayTimeInSeconds = Utils.INSTANCE.getTodayTimeInSeconds();
                CourseDayModel courseDayModel = null;
                try {
                    int size = plan.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        if (plan.get(i6).getPosition() != 1 && (plan.get(i6).getStart_date() == 0 || plan.get(i6).getStart_date() > todayTimeInSeconds)) {
                            if (i6 > 0 && plan.get(i6).getStart_date() == 0) {
                                int i10 = i6 - 1;
                                if (plan.get(i10).getStart_date() != 0) {
                                    if (plan.get(i10).getStart_date() >= todayTimeInSeconds) {
                                    }
                                }
                            }
                        }
                        courseDayModel = plan.get(i6);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(CourseUtilKt.getTAG_COURSEUTIL(), "exception", e10);
                }
                i.d(courseDayModel);
                position = courseDayModel.getPosition();
            }
            if (a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                o02 = o0(position, true);
            } else {
                o02 = o0(position, false);
            }
            this.f10486v = o02;
            ((RobertoTextView) n0(R.id.sevenDayTitle)).setText(n.F0(getResources().getString(R.string.week_x_complete).toString(), "x", String.valueOf(this.f10486v)));
            int i11 = this.f10486v;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            ((RobertoTextView) n0(R.id.sevenDayText)).setText(getResources().getString(R.string.week_4_subtext));
                            ((RobertoTextView) n0(R.id.sevenDayFooterText)).setText(getResources().getString(R.string.week_4_footer));
                        }
                    } else {
                        ((RobertoTextView) n0(R.id.sevenDayText)).setText(getResources().getString(R.string.week_3_subtext));
                        ((RobertoTextView) n0(R.id.sevenDayFooterText)).setText(getResources().getString(R.string.week_3_footer));
                    }
                } else {
                    ((RobertoTextView) n0(R.id.sevenDayText)).setText(getResources().getString(R.string.week_2_subtext));
                    ((RobertoTextView) n0(R.id.sevenDayFooterText)).setText(getResources().getString(R.string.week_2_footer));
                }
            } else {
                ((RobertoTextView) n0(R.id.sevenDayText)).setText(getResources().getString(R.string.week_1_subtext));
                ((RobertoTextView) n0(R.id.sevenDayFooterText)).setText(getResources().getString(R.string.week_1_footer));
            }
            if (i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                i.f(course, "course");
                l1Var = new m1(this, course, this.f10486v);
            } else {
                i.f(course, "course");
                l1Var = new l1(this, course, this.f10486v);
            }
            ((RecyclerView) n0(R.id.sevenDayRecyclerView)).setLayoutManager(new LinearLayoutManager(this, 1, false));
            ((RecyclerView) n0(R.id.sevenDayRecyclerView)).setAdapter(l1Var);
            ((RobertoButton) n0(R.id.sevenDayDoneButton)).setOnClickListener(new a(course, 10, this));
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f10487w, e11);
        }
    }
}
