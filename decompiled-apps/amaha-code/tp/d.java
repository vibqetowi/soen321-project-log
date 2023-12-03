package tp;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.Calendar;
import ss.p;
/* compiled from: TopicalCourseActivity.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements p<CourseDayModelV1, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TopicalCourseActivity f33404u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TopicalCourseActivity topicalCourseActivity) {
        super(2);
        this.f33404u = topicalCourseActivity;
    }

    @Override // ss.p
    public final hs.k invoke(CourseDayModelV1 courseDayModelV1, Integer num) {
        CourseDayModelV1 dayModel = courseDayModelV1;
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g(dayModel, "dayModel");
        TopicalCourseActivity topicalCourseActivity = this.f33404u;
        topicalCourseActivity.f11669y = intValue;
        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
        StringBuilder sb2 = new StringBuilder();
        MiniCourse miniCourse = topicalCourseActivity.f11670z;
        kotlin.jvm.internal.i.d(miniCourse);
        sb2.append(miniCourse.getDomain());
        sb2.append("_access_time");
        applicationPersistence.setLongValueAsync(sb2.toString(), Calendar.getInstance().getTimeInMillis());
        try {
            if (dayModel.getStart_date() == 0) {
                MiniCourse miniCourse2 = topicalCourseActivity.f11670z;
                kotlin.jvm.internal.i.d(miniCourse2);
                int size = miniCourse2.getPlan().size();
                for (int i6 = 0; i6 < size; i6++) {
                    MiniCourse miniCourse3 = topicalCourseActivity.f11670z;
                    kotlin.jvm.internal.i.d(miniCourse3);
                    if (kotlin.jvm.internal.i.b(miniCourse3.getPlan().get(i6).getContent_id(), dayModel.getContent_id())) {
                        topicalCourseActivity.v0();
                        MiniCourse miniCourse4 = topicalCourseActivity.f11670z;
                        kotlin.jvm.internal.i.d(miniCourse4);
                        miniCourse4.getPlan().get(i6).setStart_date(Utils.INSTANCE.getTodayTimeInSeconds());
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        MiniCourse miniCourse5 = topicalCourseActivity.f11670z;
                        kotlin.jvm.internal.i.d(miniCourse5);
                        String content_id = miniCourse5.getPlan().get(i6).getContent_id();
                        kotlin.jvm.internal.i.d(content_id);
                        topicalCourseActivity.C = content_id;
                    }
                }
            } else {
                String content_id2 = dayModel.getContent_id();
                kotlin.jvm.internal.i.d(content_id2);
                topicalCourseActivity.C = content_id2;
            }
            Intent intent = new Intent(topicalCourseActivity, TemplateActivity.class);
            intent.putExtra("source", "topical_course");
            intent.putExtra("day_plan", dayModel);
            MiniCourse miniCourse6 = topicalCourseActivity.f11670z;
            kotlin.jvm.internal.i.d(miniCourse6);
            intent.putExtra("miniCourse", miniCourse6.getDomain());
            MiniCourse miniCourse7 = topicalCourseActivity.f11670z;
            kotlin.jvm.internal.i.d(miniCourse7);
            intent.putExtra("mcCourse", miniCourse7.getCourse());
            MiniCourse miniCourse8 = topicalCourseActivity.f11670z;
            kotlin.jvm.internal.i.d(miniCourse8);
            intent.putExtra("goalSource", miniCourse8.getDomain());
            intent.putExtra("showAltFeedback", true);
            MiniCourse miniCourse9 = topicalCourseActivity.f11670z;
            kotlin.jvm.internal.i.d(miniCourse9);
            String course = miniCourse9.getCourse();
            kotlin.jvm.internal.i.d(course);
            if (!kotlin.jvm.internal.i.b(UtilsKt.getCourseId(course), "")) {
                MiniCourse miniCourse10 = topicalCourseActivity.f11670z;
                kotlin.jvm.internal.i.d(miniCourse10);
                String course2 = miniCourse10.getCourse();
                kotlin.jvm.internal.i.d(course2);
                intent.putExtra("mcCourseId", UtilsKt.getCourseId(course2));
            }
            topicalCourseActivity.startActivityForResult(intent, topicalCourseActivity.f11668x);
            Bundle bundle = new Bundle();
            bundle.putString("topicalCourse", topicalCourseActivity.A);
            bundle.putString("course", rr.a.q0());
            bundle.putString("activity_id", dayModel.getContent_id());
            bundle.putInt("activity_position", topicalCourseActivity.f11669y);
            gk.a.b(bundle, "topical_activity_start");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(topicalCourseActivity.f11667w, "exception", e10);
        }
        return hs.k.f19476a;
    }
}
