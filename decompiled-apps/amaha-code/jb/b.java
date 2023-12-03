package jb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import jb.d;
/* compiled from: CircularRevealCompat.java */
/* loaded from: classes.dex */
public final class b {
    public static AnimatorSet a(d dVar, float f, float f2, float f10) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.b.f21775a, d.a.f21773b, new d.C0325d(f, f2, f10));
        d.C0325d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f21779c, f10);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
