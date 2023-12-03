package fl;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: NotV4Activity.kt */
/* loaded from: classes2.dex */
public final class u implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NotV4Activity f15161u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f15162v;

    public u(NotV4Activity notV4Activity, kotlin.jvm.internal.v vVar) {
        this.f15161u = notV4Activity;
        this.f15162v = vVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ConstraintLayout constraintLayout;
        yp.c cVar;
        RobertoButton robertoButton;
        yp.c cVar2;
        ConstraintLayout constraintLayout2;
        yp.c cVar3;
        NotV4Activity notV4Activity = this.f15161u;
        v.c cVar4 = notV4Activity.F;
        if (cVar4 != null && (cVar3 = (yp.c) cVar4.f34633x) != null) {
            constraintLayout = cVar3.f38735b;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
        }
        int i6 = this.f15162v.f23467u;
        notV4Activity.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(notV4Activity, R.anim.slide_fade_in_right);
        loadAnimation.setAnimationListener(new v(notV4Activity));
        v.c cVar5 = notV4Activity.F;
        if (cVar5 != null && (cVar2 = (yp.c) cVar5.f34633x) != null && (constraintLayout2 = cVar2.f38736c) != null) {
            constraintLayout2.startAnimation(loadAnimation);
        }
        v.c cVar6 = notV4Activity.F;
        if (cVar6 != null && (cVar = (yp.c) cVar6.f34633x) != null && (robertoButton = cVar.f38742j) != null) {
            robertoButton.setOnClickListener(new ak.d(i6, 4, notV4Activity));
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
