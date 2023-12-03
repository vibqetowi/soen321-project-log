package xo;

import android.os.Build;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesPlaybackActivity;
import kotlin.jvm.internal.k;
/* compiled from: RecommendedActivitiesPlaybackActivity.kt */
/* loaded from: classes2.dex */
public final class c extends k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ RecommendedActivitiesPlaybackActivity f37874u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity) {
        super(0);
        this.f37874u = recommendedActivitiesPlaybackActivity;
    }

    @Override // ss.a
    public final hs.k invoke() {
        int i6 = Build.VERSION.SDK_INT;
        RecommendedActivitiesPlaybackActivity recommendedActivitiesPlaybackActivity = this.f37874u;
        if (i6 >= 23) {
            recommendedActivitiesPlaybackActivity.getWindow().getDecorView().setSystemUiVisibility(recommendedActivitiesPlaybackActivity.getWindow().getDecorView().getSystemUiVisibility() | 8192);
        } else {
            recommendedActivitiesPlaybackActivity.getWindow().setStatusBarColor(g0.a.b(recommendedActivitiesPlaybackActivity, R.color.status_bar_grey));
        }
        return hs.k.f19476a;
    }
}
