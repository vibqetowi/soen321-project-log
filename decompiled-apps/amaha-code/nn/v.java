package nn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: CB11Fragment.kt */
/* loaded from: classes2.dex */
public final class v implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f26626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f26627b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f26628c;

    public v(u uVar, ObjectAnimator objectAnimator, int i6) {
        this.f26626a = uVar;
        this.f26627b = objectAnimator;
        this.f26628c = i6;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        u uVar = this.f26626a;
        if (uVar.isAdded()) {
            RobertoTextView robertoTextView = (RobertoTextView) uVar._$_findCachedViewById(R.id.cb11DescTitle);
            if (robertoTextView != null) {
                String str = (String) is.u.j2(this.f26628c, uVar.f26610y);
                if (str != null) {
                    robertoTextView.setText(str);
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(robertoTextView, "alpha", 0.0f, 1.0f);
                ofFloat.setDuration(350L);
                ofFloat.start();
            }
            this.f26627b.removeListener(this);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }
}
