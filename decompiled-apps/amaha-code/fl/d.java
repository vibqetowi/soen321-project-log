package fl;

import androidx.lifecycle.o0;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15135u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CustomDashboardActivity customDashboardActivity) {
        super(1);
        this.f15135u = customDashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        if (kotlin.jvm.internal.i.b(bool, Boolean.TRUE)) {
            ((MiniCoursesViewModel) new o0(this.f15135u).a(MiniCoursesViewModel.class)).f(null);
        }
        return hs.k.f19476a;
    }
}
