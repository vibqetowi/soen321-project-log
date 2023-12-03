package dc;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.theinnerhour.b2b.R;
import w5.i0;
/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: e  reason: collision with root package name */
    public final int f12740e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f12741g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f12742h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f12743i;

    /* renamed from: j  reason: collision with root package name */
    public final i0 f12744j;

    /* renamed from: k  reason: collision with root package name */
    public final b f12745k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f12746l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f12747m;

    public e(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f12744j = new i0(3, this);
        this.f12745k = new b(0, this);
        this.f12740e = rb.a.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = rb.a.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f12741g = rb.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, ab.a.f449a);
        this.f12742h = rb.a.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, ab.a.f452d);
    }

    @Override // dc.l
    public final void a() {
        if (this.f12765b.J != null) {
            return;
        }
        t(u());
    }

    @Override // dc.l
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // dc.l
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // dc.l
    public final View.OnFocusChangeListener e() {
        return this.f12745k;
    }

    @Override // dc.l
    public final View.OnClickListener f() {
        return this.f12744j;
    }

    @Override // dc.l
    public final View.OnFocusChangeListener g() {
        return this.f12745k;
    }

    @Override // dc.l
    public final void m(EditText editText) {
        this.f12743i = editText;
        this.f12764a.setEndIconVisible(u());
    }

    @Override // dc.l
    public final void p(boolean z10) {
        if (this.f12765b.J == null) {
            return;
        }
        t(z10);
    }

    @Override // dc.l
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f12742h);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dc.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e f12735b;

            {
                this.f12735b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i6 = r2;
                e eVar = this.f12735b;
                switch (i6) {
                    case 0:
                        eVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.f12767d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        eVar.getClass();
                        eVar.f12767d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f12741g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i6 = this.f12740e;
        ofFloat2.setDuration(i6);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dc.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e f12735b;

            {
                this.f12735b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i62 = r2;
                e eVar = this.f12735b;
                switch (i62) {
                    case 0:
                        eVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.f12767d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        eVar.getClass();
                        eVar.f12767d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f12746l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f12746l.addListener(new c(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i6);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dc.a

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e f12735b;

            {
                this.f12735b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i62 = r2;
                e eVar = this.f12735b;
                switch (i62) {
                    case 0:
                        eVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar.f12767d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        eVar.getClass();
                        eVar.f12767d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        this.f12747m = ofFloat3;
        ofFloat3.addListener(new d(this));
    }

    @Override // dc.l
    public final void s() {
        EditText editText = this.f12743i;
        if (editText != null) {
            editText.post(new androidx.activity.b(27, this));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f12765b.c() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f12746l.isRunning()) {
            this.f12747m.cancel();
            this.f12746l.start();
            if (z11) {
                this.f12746l.end();
            }
        } else if (!z10) {
            this.f12746l.cancel();
            this.f12747m.start();
            if (z11) {
                this.f12747m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f12743i;
        if (editText != null && ((editText.hasFocus() || this.f12767d.hasFocus()) && this.f12743i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
