package l6;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.theinnerhour.b2b.R;
/* compiled from: VisibilityAnimationManager.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f24098a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimatorSet f24099b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimatorSet f24100c;

    /* renamed from: d  reason: collision with root package name */
    public final float f24101d;

    /* renamed from: e  reason: collision with root package name */
    public final float f24102e;

    public d(View view, float f, float f2) {
        this.f24098a = view;
        this.f24101d = f;
        this.f24102e = f2;
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_hide);
        this.f24099b = animatorSet;
        animatorSet.setStartDelay(1000);
        animatorSet.setTarget(view);
        AnimatorSet animatorSet2 = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), R.animator.fastscroll__default_show);
        this.f24100c = animatorSet2;
        animatorSet2.setTarget(view);
        animatorSet.addListener(new c(view));
        a();
    }

    public final void a() {
        View view = this.f24098a;
        view.setPivotX(this.f24101d * view.getMeasuredWidth());
        view.setPivotY(this.f24102e * view.getMeasuredHeight());
    }
}
