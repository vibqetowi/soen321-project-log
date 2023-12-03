package mk;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: BookmarkingActivity.kt */
/* loaded from: classes2.dex */
public final class d extends k implements l<CourseDayDomainModelV1, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25329u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BookmarkingActivity bookmarkingActivity) {
        super(1);
        this.f25329u = bookmarkingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(CourseDayDomainModelV1 courseDayDomainModelV1) {
        IBinder iBinder;
        boolean z10;
        ArrayList<CourseDayModelV1> planV3;
        CourseDayDomainModelV1 courseDayDomainModelV12 = courseDayDomainModelV1;
        i.g(courseDayDomainModelV12, "courseDayDomainModelV1");
        BookmarkingActivity bookmarkingActivity = this.f25329u;
        if (!bookmarkingActivity.D) {
            Object systemService = bookmarkingActivity.getSystemService("input_method");
            i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            RobertoEditText robertoEditText = (RobertoEditText) bookmarkingActivity.n0(R.id.tvBookmarkingSearchEditText);
            Object obj = null;
            if (robertoEditText != null) {
                iBinder = robertoEditText.getWindowToken();
            } else {
                iBinder = null;
            }
            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            Course course = CourseUtilKt.getCourse(courseDayDomainModelV12.getCourseName());
            i.g(course, "<set-?>");
            bookmarkingActivity.f10622y = course;
            bookmarkingActivity.E = courseDayDomainModelV12.getDayModelV1().getPosition();
            CourseDayModelV1 dayModel = courseDayDomainModelV12.getDayModelV1();
            String courseName = courseDayDomainModelV12.getCourseName();
            i.g(dayModel, "dayModel");
            i.g(courseName, "courseName");
            try {
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("source", bookmarkingActivity.f10623z);
                bundle.putString("activity_name", dayModel.getContent_label());
                bundle.putString("activity_course", bookmarkingActivity.o0().getCourseName());
                if (dayModel.getLast_accessed_date() != 0) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(dayModel.getLast_accessed_date() * 1000);
                    bundle.putString("last_accessed_on", new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(calendar.getTime()).toString());
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) bookmarkingActivity.n0(R.id.ivBookmarkingSearchClear);
                if (appCompatImageView != null && appCompatImageView.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bundle.putBoolean("search_flow", z10);
                gk.a.b(bundle, "bookmarked_activity_card_click");
                Intent intent = new Intent(bookmarkingActivity, TemplateActivity.class);
                intent.putExtra("day_plan", dayModel);
                intent.putExtra("type", "daily");
                intent.putExtra("goalSource", "daily_plan");
                intent.putExtra(Constants.COURSE_TITLE, dayModel.getContent_label());
                intent.putExtra(Constants.API_COURSE_LINK, dayModel.getContent_id());
                intent.putExtra(Constants.DAYMODEL_POSITION, dayModel.getPosition());
                intent.putExtra("showPlanFirstScreen", false);
                intent.putExtra("activity_course", bookmarkingActivity.o0().getCourseName());
                bookmarkingActivity.F.a(intent);
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                Course courseByName = firebasePersistence.getCourseByName(courseName);
                if (courseByName != null && (planV3 = courseByName.getPlanV3()) != null) {
                    Iterator<T> it = planV3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i.b(((CourseDayModelV1) next).getContent_id(), dayModel.getContent_id())) {
                            obj = next;
                            break;
                        }
                    }
                    CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) obj;
                    if (courseDayModelV1 != null) {
                        Utils utils = Utils.INSTANCE;
                        courseDayModelV1.setLast_accessed_date(utils.getTimeInSeconds());
                        if (courseDayModelV1.getStart_date() == 0) {
                            courseDayModelV1.setStart_date(utils.getTodayTimeInSeconds());
                        }
                    }
                }
                firebasePersistence.updateUserOnFirebase();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bookmarkingActivity.f10620w, "exception", e10);
            }
        }
        return hs.k.f19476a;
    }
}
