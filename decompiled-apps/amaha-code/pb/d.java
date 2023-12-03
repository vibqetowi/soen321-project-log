package pb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import yb.f;
import yb.i;
/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes.dex */
public final class d extends com.google.android.material.floatingactionbutton.d {
    public StateListAnimator N;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* loaded from: classes.dex */
    public static class a extends f {
        public a(i iVar) {
            super(iVar);
        }

        @Override // yb.f, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final float e() {
        return this.f9059v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void f(Rect rect) {
        boolean z10;
        if (FloatingActionButton.this.E) {
            super.f(rect);
            return;
        }
        boolean z11 = this.f;
        FloatingActionButton floatingActionButton = this.f9059v;
        if (z11 && floatingActionButton.getSizeDimension() < this.f9049k) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int sizeDimension = (this.f9049k - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i6) {
        Drawable drawable;
        f s10 = s();
        this.f9041b = s10;
        s10.setTintList(colorStateList);
        if (mode != null) {
            this.f9041b.setTintMode(mode);
        }
        f fVar = this.f9041b;
        FloatingActionButton floatingActionButton = this.f9059v;
        fVar.i(floatingActionButton.getContext());
        if (i6 > 0) {
            Context context = floatingActionButton.getContext();
            i iVar = this.f9040a;
            iVar.getClass();
            pb.a aVar = new pb.a(iVar);
            int b10 = g0.a.b(context, R.color.design_fab_stroke_top_outer_color);
            int b11 = g0.a.b(context, R.color.design_fab_stroke_top_inner_color);
            int b12 = g0.a.b(context, R.color.design_fab_stroke_end_inner_color);
            int b13 = g0.a.b(context, R.color.design_fab_stroke_end_outer_color);
            aVar.f28089i = b10;
            aVar.f28090j = b11;
            aVar.f28091k = b12;
            aVar.f28092l = b13;
            float f = i6;
            if (aVar.f28088h != f) {
                aVar.f28088h = f;
                aVar.f28083b.setStrokeWidth(f * 1.3333f);
                aVar.f28094n = true;
                aVar.invalidateSelf();
            }
            if (colorStateList != null) {
                aVar.f28093m = colorStateList.getColorForState(aVar.getState(), aVar.f28093m);
            }
            aVar.f28096p = colorStateList;
            aVar.f28094n = true;
            aVar.invalidateSelf();
            this.f9043d = aVar;
            pb.a aVar2 = this.f9043d;
            aVar2.getClass();
            f fVar2 = this.f9041b;
            fVar2.getClass();
            drawable = new LayerDrawable(new Drawable[]{aVar2, fVar2});
        } else {
            this.f9043d = null;
            drawable = this.f9041b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(vb.b.c(colorStateList2), drawable, null);
        this.f9042c = rippleDrawable;
        this.f9044e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void i() {
        q();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void j(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            FloatingActionButton floatingActionButton = this.f9059v;
            if (floatingActionButton.isEnabled()) {
                floatingActionButton.setElevation(this.f9046h);
                if (floatingActionButton.isPressed()) {
                    floatingActionButton.setTranslationZ(this.f9048j);
                    return;
                } else if (!floatingActionButton.isFocused() && !floatingActionButton.isHovered()) {
                    floatingActionButton.setTranslationZ(0.0f);
                    return;
                } else {
                    floatingActionButton.setTranslationZ(this.f9047i);
                    return;
                }
            }
            floatingActionButton.setElevation(0.0f);
            floatingActionButton.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void k(float f, float f2, float f10) {
        int i6 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f9059v;
        if (i6 == 21) {
            floatingActionButton.refreshDrawableState();
        } else if (floatingActionButton.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.H, r(f, f10));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.I, r(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.J, r(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.K, r(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i6 >= 22 && i6 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.d.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f9042c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(vb.b.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final boolean o() {
        boolean z10;
        if (FloatingActionButton.this.E) {
            return true;
        }
        if (this.f && this.f9059v.getSizeDimension() < this.f9049k) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    public final AnimatorSet r(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f9059v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.d.C);
        return animatorSet;
    }

    public final f s() {
        i iVar = this.f9040a;
        iVar.getClass();
        return new a(iVar);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void p() {
    }
}
