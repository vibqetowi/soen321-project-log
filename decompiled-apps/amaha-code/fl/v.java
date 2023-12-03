package fl;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
/* compiled from: NotV4Activity.kt */
/* loaded from: classes2.dex */
public final class v implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ NotV4Activity f15163u;

    public v(NotV4Activity notV4Activity) {
        this.f15163u = notV4Activity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ConstraintLayout constraintLayout;
        yp.c cVar;
        yp.c cVar2;
        NotV4Activity notV4Activity = this.f15163u;
        v.c cVar3 = notV4Activity.F;
        ConstraintLayout constraintLayout2 = null;
        if (cVar3 != null && (cVar2 = (yp.c) cVar3.f34633x) != null) {
            constraintLayout = cVar2.f38735b;
        } else {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        v.c cVar4 = notV4Activity.F;
        if (cVar4 != null && (cVar = (yp.c) cVar4.f34633x) != null) {
            constraintLayout2 = cVar.f38736c;
        }
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
