package tp;

import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: TopicalGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TopicalGoalsActivity f33415u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TopicalGoalsActivity topicalGoalsActivity) {
        super(1);
        this.f33415u = topicalGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        Integer it = num;
        TopicalGoalsActivity topicalGoalsActivity = this.f33415u;
        up.c cVar = topicalGoalsActivity.F;
        if (cVar != null) {
            kotlin.jvm.internal.i.f(it, "it");
            it.intValue();
            Constants.GOAL_TYPE_HABIT.equals(Constants.GOAL_TYPE_HABIT);
            cVar.i();
        }
        kotlin.jvm.internal.i.f(it, "it");
        topicalGoalsActivity.A = it.intValue();
        RobertoTextView robertoTextView = (RobertoTextView) topicalGoalsActivity.n0(R.id.trackText);
        if (robertoTextView != null) {
            robertoTextView.setText(topicalGoalsActivity.f11678z + '/' + topicalGoalsActivity.A + " Goals Completed");
        }
        CircularProgressBar circularProgressBar = (CircularProgressBar) topicalGoalsActivity.n0(R.id.habitCircularProgress);
        if (circularProgressBar != null) {
            circularProgressBar.setProgressMax(it.intValue());
        }
        CircularProgressBar circularProgressBar2 = (CircularProgressBar) topicalGoalsActivity.n0(R.id.habitCircularProgress);
        if (circularProgressBar2 != null) {
            int i6 = CircularProgressBar.L;
            circularProgressBar2.c(topicalGoalsActivity.f11678z, 1500);
        }
        if (topicalGoalsActivity.f11678z == topicalGoalsActivity.A) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) topicalGoalsActivity.n0(R.id.completionAnimation);
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) topicalGoalsActivity.n0(R.id.completionAnimation);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.h();
            }
        } else {
            LottieAnimationView lottieAnimationView3 = (LottieAnimationView) topicalGoalsActivity.n0(R.id.completionAnimation);
            if (lottieAnimationView3 != null) {
                lottieAnimationView3.setVisibility(8);
            }
        }
        return hs.k.f19476a;
    }
}
