package bl;

import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
/* compiled from: DailyPlanDetailFragment.kt */
/* loaded from: classes2.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ImageView f4354u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Animation f4355v;

    public h(AppCompatImageView appCompatImageView, Animation animation) {
        this.f4354u = appCompatImageView;
        this.f4355v = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ImageView imageView = this.f4354u;
        imageView.setImageResource(R.drawable.ic_round_check);
        imageView.startAnimation(this.f4355v);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
