package tp;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
import com.theinnerhour.b2b.model.MiniCourse;
/* compiled from: TopicalCourseActivity.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TopicalCourseActivity f33405u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TopicalCourseActivity topicalCourseActivity) {
        super(0);
        this.f33405u = topicalCourseActivity;
    }

    @Override // ss.a
    public final hs.k invoke() {
        TopicalCourseActivity topicalCourseActivity = this.f33405u;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(topicalCourseActivity, 1, false);
        MiniCourse miniCourse = topicalCourseActivity.f11670z;
        kotlin.jvm.internal.i.d(miniCourse);
        ((RecyclerView) topicalCourseActivity.u0(R.id.basicCourseRecyclerView)).setAdapter(new ek.h(topicalCourseActivity, miniCourse.getPlan(), new hs.f(Integer.valueOf((int) R.color.topicalNewYearGreen), Integer.valueOf((int) R.color.topicalNewYearGreen)), new d(topicalCourseActivity)));
        ((RecyclerView) topicalCourseActivity.u0(R.id.basicCourseRecyclerView)).setFocusable(false);
        ((RecyclerView) topicalCourseActivity.u0(R.id.basicCourseRecyclerView)).setLayoutManager(linearLayoutManager);
        return hs.k.f19476a;
    }
}
