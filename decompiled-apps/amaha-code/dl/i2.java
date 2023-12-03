package dl;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class i2 implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13044u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f13045v = 5;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f13046w;

    public i2(V3DashboardActivity v3DashboardActivity, kotlin.jvm.internal.v vVar) {
        this.f13044u = v3DashboardActivity;
        this.f13046w = vVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        V3DashboardActivity v3DashboardActivity = this.f13044u;
        ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheetView1);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        int i6 = this.f13046w.f23467u;
        v3DashboardActivity.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(v3DashboardActivity, R.anim.slide_fade_in_right);
        loadAnimation.setAnimationListener(new j2(v3DashboardActivity));
        ConstraintLayout constraintLayout2 = (ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheetView2);
        if (constraintLayout2 != null) {
            constraintLayout2.startAnimation(loadAnimation);
        }
        RobertoButton robertoButton = (RobertoButton) v3DashboardActivity.n0(R.id.rbNPSSubmit2);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new d0(v3DashboardActivity, this.f13045v, i6, 0));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
