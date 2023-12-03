package bl;

import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
/* compiled from: DailyPlanDetailFragmentV3.kt */
/* loaded from: classes2.dex */
public final class o implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ImageView f4379u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Animation f4380v;

    public o(AppCompatImageView appCompatImageView, Animation animation) {
        this.f4379u = appCompatImageView;
        this.f4380v = animation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ImageView imageView = this.f4379u;
        imageView.setImageResource(R.drawable.ic_round_check);
        imageView.startAnimation(this.f4380v);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
