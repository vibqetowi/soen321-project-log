package hl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.SuggestedActivityDetailsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17719u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s f17720v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Course f17721w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ hs.f f17722x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f17723y;

    public /* synthetic */ q(s sVar, long j10, Course course, hs.f fVar) {
        this.f17720v = sVar;
        this.f17723y = j10;
        this.f17721w = course;
        this.f17722x = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f17719u;
        long j10 = this.f17723y;
        String str2 = null;
        hs.f saProgression = this.f17722x;
        Course currCourse = this.f17721w;
        s this$0 = this.f17720v;
        switch (i6) {
            case 0:
                int i10 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(currCourse, "$currCourse");
                kotlin.jvm.internal.i.g(saProgression, "$saProgression");
                this$0.c0.a(new Intent(this$0.requireActivity(), SuggestedActivityDetailsActivity.class).putExtra("setPlanCardToolTipExtra", this$0.G));
                Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                analyticsBundle.putInt(Constants.SCREEN_PROGRESS, (int) j10);
                SuggestedActivityModel suggestedActivityModel = (SuggestedActivityModel) is.u.j2(((Number) saProgression.f19465v).intValue(), currCourse.getPlanSuggested());
                if (suggestedActivityModel != null) {
                    str2 = suggestedActivityModel.getContent_id();
                }
                analyticsBundle.putString("activity_up_next", str2);
                UtilsKt.fireAnalytics("suggested_activities_card_click", analyticsBundle);
                return;
            default:
                int i11 = s.f17728g0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(currCourse, "$currCourse");
                kotlin.jvm.internal.i.g(saProgression, "$saProgression");
                Intent putExtra = new Intent(this$0.requireActivity(), SuggestedActivityDetailsActivity.class).putExtra("highlightedActivityCourse", currCourse.getCourseName());
                ArrayList<SuggestedActivityModel> planSuggested = currCourse.getPlanSuggested();
                Number number = (Number) saProgression.f19465v;
                SuggestedActivityModel suggestedActivityModel2 = (SuggestedActivityModel) is.u.j2(number.intValue(), planSuggested);
                if (suggestedActivityModel2 != null) {
                    str = suggestedActivityModel2.getContent_id();
                } else {
                    str = null;
                }
                this$0.c0.a(putExtra.putExtra("highlightedActivityId", str).putExtra("setPlanCardToolTipExtra", this$0.G));
                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                analyticsBundle2.putInt("progress_rate_when_clicked", (int) j10);
                SuggestedActivityModel suggestedActivityModel3 = (SuggestedActivityModel) is.u.j2(number.intValue(), currCourse.getPlanSuggested());
                if (suggestedActivityModel3 != null) {
                    str2 = suggestedActivityModel3.getContent_id();
                }
                analyticsBundle2.putString("activity_up_next", str2);
                UtilsKt.fireAnalytics("suggested_activities_arrow_click", analyticsBundle2);
                return;
        }
    }

    public /* synthetic */ q(s sVar, Course course, hs.f fVar, long j10) {
        this.f17720v = sVar;
        this.f17721w = course;
        this.f17722x = fVar;
        this.f17723y = j10;
    }
}
