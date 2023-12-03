package gl;

import android.animation.Animator;
import android.view.View;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.i;
/* compiled from: SuggestedActivityDayPlanAdapter.kt */
/* loaded from: classes2.dex */
public final class f implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f16609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f16610b;

    public f(View view, e eVar) {
        this.f16609a = view;
        this.f16610b = eVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator p02) {
        i.g(p02, "p0");
        try {
            this.f16609a.setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16610b.H, e10);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator p02) {
        i.g(p02, "p0");
        try {
            this.f16609a.setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f16610b.H, e10);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator p02) {
        i.g(p02, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator p02) {
        i.g(p02, "p0");
    }
}
