package so;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/* compiled from: ExperimentProfileActivity.kt */
/* loaded from: classes2.dex */
public final class h0 extends kotlin.jvm.internal.k implements ss.l<CourseDayDomainModelV1, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentProfileActivity f31817u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CourseDayDomainModelV1 f31818v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ExperimentProfileActivity experimentProfileActivity, CourseDayDomainModelV1 courseDayDomainModelV1) {
        super(1);
        this.f31817u = experimentProfileActivity;
        this.f31818v = courseDayDomainModelV1;
    }

    @Override // ss.l
    public final hs.k invoke(CourseDayDomainModelV1 courseDayDomainModelV1) {
        CourseDayDomainModelV1 it = courseDayDomainModelV1;
        kotlin.jvm.internal.i.g(it, "it");
        CourseDayDomainModelV1 courseDayDomainModelV12 = this.f31818v;
        Course course = CourseUtilKt.getCourse(courseDayDomainModelV12.getCourseName());
        ExperimentProfileActivity experimentProfileActivity = this.f31817u;
        experimentProfileActivity.getClass();
        kotlin.jvm.internal.i.g(course, "<set-?>");
        experimentProfileActivity.F = course;
        CourseDayModelV1 dayModel = courseDayDomainModelV12.getDayModelV1();
        kotlin.jvm.internal.i.g(dayModel, "dayModel");
        try {
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString("source", Constants.SCREEN_PROFILE);
            bundle.putString("activity_name", dayModel.getContent_label());
            bundle.putString("activity_course", experimentProfileActivity.y0().getCourseName());
            if (dayModel.getLast_accessed_date() != 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(dayModel.getLast_accessed_date() * 1000);
                bundle.putString("last_accessed_on", new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()).toString());
            }
            gk.a.b(bundle, "bookmarked_activity_card_click");
            Intent intent = new Intent(experimentProfileActivity, TemplateActivity.class);
            intent.putExtra("day_plan", dayModel);
            intent.putExtra("type", "daily");
            intent.putExtra("goalSource", "daily_plan");
            intent.putExtra(Constants.COURSE_TITLE, dayModel.getContent_label());
            intent.putExtra(Constants.API_COURSE_LINK, dayModel.getContent_id());
            intent.putExtra(Constants.DAYMODEL_POSITION, dayModel.getPosition());
            intent.putExtra("showPlanFirstScreen", false);
            intent.putExtra("activity_course", experimentProfileActivity.y0().getCourseName());
            experimentProfileActivity.M.a(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(experimentProfileActivity.f11575w, "exception", e10);
        }
        return hs.k.f19476a;
    }
}
