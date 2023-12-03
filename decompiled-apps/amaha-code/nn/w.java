package nn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: CB11Fragment.kt */
/* loaded from: classes2.dex */
public final class w implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f26633a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f26634b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ObjectAnimator f26635c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f26636d;

    public w(u uVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, int i6) {
        this.f26633a = uVar;
        this.f26634b = objectAnimator;
        this.f26635c = objectAnimator2;
        this.f26636d = i6;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        kotlin.jvm.internal.i.g(animation, "animation");
        u uVar = this.f26633a;
        if (uVar.isAdded()) {
            RobertoTextView robertoTextView = (RobertoTextView) uVar._$_findCachedViewById(R.id.cb11DescBody);
            if (robertoTextView != null) {
                String str = (String) is.u.j2(this.f26636d, uVar.f26611z);
                if (str != null) {
                    robertoTextView.setText(str);
                }
            }
            this.f26634b.start();
            this.f26635c.removeListener(this);
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
