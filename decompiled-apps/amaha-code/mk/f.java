package mk;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.bookmarking.activities.BookmarkingActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import ik.j1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: BookmarkingActivity.kt */
/* loaded from: classes2.dex */
public final class f extends k implements l<CourseDayDomainModelV1, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BookmarkingActivity f25331u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BookmarkingActivity bookmarkingActivity) {
        super(1);
        this.f25331u = bookmarkingActivity;
    }

    @Override // ss.l
    public final hs.k invoke(CourseDayDomainModelV1 courseDayDomainModelV1) {
        CourseDayDomainModelV1 modelToBeUnsaved = courseDayDomainModelV1;
        i.g(modelToBeUnsaved, "modelToBeUnsaved");
        BookmarkingActivity bookmarkingActivity = this.f25331u;
        if (!bookmarkingActivity.D) {
            BottomSheetBehavior.from((ConstraintLayout) bookmarkingActivity.n0(R.id.clBookmarkBottomSheet)).setState(3);
            bookmarkingActivity.C = modelToBeUnsaved;
            Course course = CourseUtilKt.getCourse(modelToBeUnsaved.getCourseName());
            i.g(course, "<set-?>");
            bookmarkingActivity.f10622y = course;
            RobertoButton robertoButton = (RobertoButton) bookmarkingActivity.n0(R.id.rbBookmarkBottomSheetCta2);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new j1(bookmarkingActivity, 2, modelToBeUnsaved));
            }
            Bundle bundle = new Bundle();
            bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            bundle.putString("activity_name", modelToBeUnsaved.getDayModelV1().getContent_label());
            bundle.putString("activity_course", bookmarkingActivity.o0().getCourseName());
            if (modelToBeUnsaved.getDayModelV1().getLast_accessed_date() != 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(modelToBeUnsaved.getDayModelV1().getLast_accessed_date() * 1000);
                bundle.putString("last_accessed_on", new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(calendar.getTime()).toString());
            }
            gk.a.b(bundle, "bookmark_activity_unsave_click");
        }
        return hs.k.f19476a;
    }
}
