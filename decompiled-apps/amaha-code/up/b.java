package up;

import ak.d;
import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: TopicalCoursesAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<RecyclerView.c0> {

    /* renamed from: x  reason: collision with root package name */
    public final Activity f34438x;

    /* renamed from: y  reason: collision with root package name */
    public List<MiniCourse> f34439y;

    /* renamed from: z  reason: collision with root package name */
    public final String f34440z = LogHelper.INSTANCE.makeLogTag(b.class);

    /* compiled from: TopicalCoursesAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public b(AllTopicalCoursesActivity allTopicalCoursesActivity, List list) {
        this.f34438x = allTopicalCoursesActivity;
        this.f34439y = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f34439y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        Activity activity = this.f34438x;
        View view = c0Var.f2751a;
        try {
            view.getLayoutParams().width = -1;
            int i10 = 0;
            ((RobertoTextView) view.findViewById(R.id.topicalCourseDaysText)).setText(activity.getString(R.string.xDays, Integer.valueOf(this.f34439y.get(i6).getPlan().size())));
            ((RobertoTextView) view.findViewById(R.id.topicalCourseNameText)).setText(MiniCourseUtilsKt.getMiniCourseTitle(this.f34439y.get(i6).getDomain(), activity));
            view.setOnClickListener(new d(i6, 19, this));
            String domain = this.f34439y.get(i6).getDomain();
            i.d(domain);
            Integer[] miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain);
            if (miniCourseImage != null) {
                ((AppCompatImageView) view.findViewById(R.id.topicalCardImg)).setImageResource(miniCourseImage[0].intValue());
            }
            if ((!this.f34439y.isEmpty()) && this.f34439y.size() > i6 && (!this.f34439y.get(i6).getPlan().isEmpty())) {
                if (this.f34439y.get(i6).getPlan().get(0).getStart_date() == 0) {
                    ((ProgressBar) view.findViewById(R.id.topicalCourseProgressBar)).setVisibility(8);
                } else if (this.f34439y.get(i6).getPlan().get(this.f34439y.get(i6).getPlan().size() - 1).getStart_date() != 0) {
                    ((RobertoTextView) view.findViewById(R.id.topicalCourseDaysText)).setVisibility(8);
                    ((ProgressBar) view.findViewById(R.id.topicalCourseProgressBar)).setVisibility(0);
                    ((ProgressBar) view.findViewById(R.id.topicalCourseProgressBar)).setMax(1);
                    ((ProgressBar) view.findViewById(R.id.topicalCourseProgressBar)).setProgress(1);
                } else {
                    ((RobertoTextView) view.findViewById(R.id.topicalCourseDaysText)).setVisibility(8);
                    ((ProgressBar) view.findViewById(R.id.topicalCourseProgressBar)).setVisibility(0);
                    ((ProgressBar) view.findViewById(R.id.topicalCourseProgressBar)).setMax(this.f34439y.get(i6).getPlan().size());
                    ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.topicalCourseProgressBar);
                    Iterator<CourseDayModelV1> it = this.f34439y.get(i6).getPlan().iterator();
                    while (it.hasNext()) {
                        CourseDayModelV1 next = it.next();
                        if (next.getStart_date() != 0 || next.isCompleted()) {
                            i10++;
                        }
                    }
                    progressBar.setProgress(i10);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f34440z, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(e.h(parent, R.layout.row_topical_course, parent, false, "from(parent.context).inf…al_course, parent, false)"));
    }
}
