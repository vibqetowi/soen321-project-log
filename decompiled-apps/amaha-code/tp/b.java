package tp;

import android.content.Intent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.AllTopicalCoursesActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
/* compiled from: AllTopicalCoursesActivity.kt */
/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AllTopicalCoursesActivity f33401u;

    public b(AllTopicalCoursesActivity allTopicalCoursesActivity) {
        this.f33401u = allTopicalCoursesActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AllTopicalCoursesActivity allTopicalCoursesActivity = this.f33401u;
        ((RecyclerView) allTopicalCoursesActivity.u0(R.id.mcRecycler)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (allTopicalCoursesActivity.getIntent().hasExtra("topical_course")) {
            allTopicalCoursesActivity.startActivityForResult(new Intent(allTopicalCoursesActivity, TopicalCourseActivity.class).putExtra("mccourse", allTopicalCoursesActivity.getIntent().getStringExtra("topical_course")), allTopicalCoursesActivity.B);
        }
    }
}
