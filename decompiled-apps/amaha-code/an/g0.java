package an;

import android.animation.Animator;
import android.view.View;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: LibraryShortCourseDetailFragment.kt */
/* loaded from: classes2.dex */
public final class g0 implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f711a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f712b;

    public g0(View view, d0 d0Var) {
        this.f711a = view;
        this.f712b = d0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        try {
            this.f711a.setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f712b.f688u, e10);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
        try {
            this.f711a.setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f712b.f688u, e10);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p02) {
        kotlin.jvm.internal.i.g(p02, "p0");
    }
}
