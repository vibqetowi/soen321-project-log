package ap;

import android.app.Application;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ta.v;
/* compiled from: RecommendedActivityViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends androidx.lifecycle.b {
    public final String[] A;

    /* renamed from: y  reason: collision with root package name */
    public final f f3409y;

    /* renamed from: z  reason: collision with root package name */
    public final w<ArrayList<RecommendedActivityModel>> f3410z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Application application, f repository) {
        super(application);
        i.g(application, "application");
        i.g(repository, "repository");
        this.f3409y = repository;
        this.f3410z = new w<>();
        this.A = new String[]{Constants.COURSE_DEPRESSION, Constants.COURSE_WORRY, Constants.COURSE_STRESS, Constants.COURSE_HAPPINESS, Constants.COURSE_SLEEP, Constants.COURSE_ANGER};
    }

    public static void e(h hVar, String str, boolean z10) {
        hVar.getClass();
        v.H(kc.f.H(hVar), null, 0, new g(hVar, true, z10, str, null), 3);
    }
}
