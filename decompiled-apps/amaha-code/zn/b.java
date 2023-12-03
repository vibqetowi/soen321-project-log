package zn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.onboarding.activity.NewOnBoardingInfoScreenActivity;
import kotlin.jvm.internal.i;
/* compiled from: NewOnBoardingInfoScreenActivity.kt */
/* loaded from: classes2.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NewOnBoardingInfoScreenActivity f39675a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f39676b;

    public b(NewOnBoardingInfoScreenActivity newOnBoardingInfoScreenActivity, ObjectAnimator objectAnimator) {
        this.f39675a = newOnBoardingInfoScreenActivity;
        this.f39676b = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        RecyclerView.e eVar;
        i.g(animation, "animation");
        NewOnBoardingInfoScreenActivity newOnBoardingInfoScreenActivity = this.f39675a;
        ViewPager2 viewPager2 = (ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager);
        NewOnBoardingInfoScreenActivity.a aVar = null;
        if (viewPager2 != null) {
            eVar = viewPager2.getAdapter();
        } else {
            eVar = null;
        }
        if (eVar instanceof NewOnBoardingInfoScreenActivity.a) {
            aVar = (NewOnBoardingInfoScreenActivity.a) eVar;
        }
        if (aVar != null) {
            aVar.C();
        }
        FrameLayout frameLayout = (FrameLayout) newOnBoardingInfoScreenActivity.n0(R.id.flInfoScreenWelcomeContainer);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Fragment E = newOnBoardingInfoScreenActivity.getSupportFragmentManager().E(R.id.flInfoScreenWelcomeContainer);
        if (E != null) {
            y supportFragmentManager = newOnBoardingInfoScreenActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.o(E);
            aVar2.j();
        }
        this.f39676b.removeAllListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        RecyclerView.e eVar;
        i.g(animation, "animation");
        NewOnBoardingInfoScreenActivity newOnBoardingInfoScreenActivity = this.f39675a;
        ViewPager2 viewPager2 = (ViewPager2) newOnBoardingInfoScreenActivity.n0(R.id.vpInfoScreenViewPager);
        NewOnBoardingInfoScreenActivity.a aVar = null;
        if (viewPager2 != null) {
            eVar = viewPager2.getAdapter();
        } else {
            eVar = null;
        }
        if (eVar instanceof NewOnBoardingInfoScreenActivity.a) {
            aVar = (NewOnBoardingInfoScreenActivity.a) eVar;
        }
        if (aVar != null) {
            aVar.C();
        }
        FrameLayout frameLayout = (FrameLayout) newOnBoardingInfoScreenActivity.n0(R.id.flInfoScreenWelcomeContainer);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Fragment E = newOnBoardingInfoScreenActivity.getSupportFragmentManager().E(R.id.flInfoScreenWelcomeContainer);
        if (E != null) {
            y supportFragmentManager = newOnBoardingInfoScreenActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.o(E);
            aVar2.j();
        }
        this.f39676b.removeAllListeners();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        i.g(animation, "animation");
    }
}
