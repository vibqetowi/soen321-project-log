package fm;

import android.app.Application;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Date;
/* compiled from: V3GoalViewModel.kt */
/* loaded from: classes2.dex */
public final class t1 extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<ArrayList<hs.f<String, ?>>> A;
    public final androidx.lifecycle.w<ArrayList<RecommendedActivityModel>> B;
    public final androidx.lifecycle.w<Boolean> C;
    public final String[] D;
    public final androidx.lifecycle.w<Integer> E;
    public final androidx.lifecycle.w<Integer> F;
    public final androidx.lifecycle.w<Integer> G;
    public final androidx.lifecycle.w<Integer> H;
    public final androidx.lifecycle.w<Integer> I;
    public final androidx.lifecycle.w<Integer> J;
    public final androidx.lifecycle.w<Integer> K;
    public final androidx.lifecycle.w<Integer> L;
    public final androidx.lifecycle.w<Integer> M;

    /* renamed from: y  reason: collision with root package name */
    public final dm.f f15560y;

    /* renamed from: z  reason: collision with root package name */
    public final String f15561z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(Application application, dm.f repository) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f15560y = repository;
        this.f15561z = LogHelper.INSTANCE.makeLogTag(t1.class);
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        this.D = new String[]{Constants.COURSE_DEPRESSION, Constants.COURSE_WORRY, Constants.COURSE_STRESS, Constants.COURSE_SLEEP, Constants.COURSE_HAPPINESS, Constants.COURSE_ANGER};
        this.E = new androidx.lifecycle.w<>(-1);
        this.F = new androidx.lifecycle.w<>(-1);
        this.G = new androidx.lifecycle.w<>(-1);
        this.H = new androidx.lifecycle.w<>(0);
        this.I = new androidx.lifecycle.w<>(0);
        this.J = new androidx.lifecycle.w<>(0);
        this.K = new androidx.lifecycle.w<>(-1);
        this.L = new androidx.lifecycle.w<>(-1);
        this.M = new androidx.lifecycle.w<>(-1);
    }

    public final void e(Date date) {
        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23640a), null, 0, new s1(this, date, null), 3);
    }
}
