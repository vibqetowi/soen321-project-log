package dc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: IndicatorViewController.java */
/* loaded from: classes.dex */
public final class n {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f12768a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12769b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12770c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f12771d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f12772e;
    public final TimeInterpolator f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f12773g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f12774h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f12775i;

    /* renamed from: j  reason: collision with root package name */
    public int f12776j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f12777k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f12778l;

    /* renamed from: m  reason: collision with root package name */
    public final float f12779m;

    /* renamed from: n  reason: collision with root package name */
    public int f12780n;

    /* renamed from: o  reason: collision with root package name */
    public int f12781o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f12782p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12783q;
    public i0 r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f12784s;

    /* renamed from: t  reason: collision with root package name */
    public int f12785t;

    /* renamed from: u  reason: collision with root package name */
    public int f12786u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f12787v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f12788w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12789x;

    /* renamed from: y  reason: collision with root package name */
    public i0 f12790y;

    /* renamed from: z  reason: collision with root package name */
    public int f12791z;

    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12792a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f12793b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f12794c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f12795d;

        public a(int i6, TextView textView, int i10, TextView textView2) {
            this.f12792a = i6;
            this.f12793b = textView;
            this.f12794c = i10;
            this.f12795d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i0 i0Var;
            int i6 = this.f12792a;
            n nVar = n.this;
            nVar.f12780n = i6;
            nVar.f12778l = null;
            TextView textView = this.f12793b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f12794c == 1 && (i0Var = nVar.r) != null) {
                    i0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f12795d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f12795d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public n(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f12773g = context;
        this.f12774h = textInputLayout;
        this.f12779m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f12768a = rb.a.c(context, R.attr.motionDurationShort4, 217);
        this.f12769b = rb.a.c(context, R.attr.motionDurationMedium4, 167);
        this.f12770c = rb.a.c(context, R.attr.motionDurationShort4, 167);
        this.f12771d = rb.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, ab.a.f452d);
        LinearInterpolator linearInterpolator = ab.a.f449a;
        this.f12772e = rb.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = rb.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i6) {
        boolean z10;
        if (this.f12775i == null && this.f12777k == null) {
            Context context = this.f12773g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f12775i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f12775i;
            TextInputLayout textInputLayout = this.f12774h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f12777k = new FrameLayout(context);
            this.f12775i.addView(this.f12777k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i6 != 0 && i6 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f12777k.setVisibility(0);
            this.f12777k.addView(textView);
        } else {
            this.f12775i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f12775i.setVisibility(0);
        this.f12776j++;
    }

    public final void b() {
        boolean z10;
        LinearLayout linearLayout = this.f12775i;
        TextInputLayout textInputLayout = this.f12774h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f12773g;
            boolean d10 = ub.d.d(context);
            LinearLayout linearLayout2 = this.f12775i;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            int f = d0.e.f(editText);
            if (d10) {
                f = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (d10) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e10 = d0.e.e(editText);
            if (d10) {
                e10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            d0.e.k(linearLayout2, f, dimensionPixelSize, e10, 0);
        }
    }

    public final void c() {
        Animator animator = this.f12778l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i6, int i10, int i11) {
        boolean z11;
        boolean z12;
        float f;
        int i12;
        TimeInterpolator timeInterpolator;
        boolean z13;
        if (textView != null && z10) {
            if (i6 != i11 && i6 != i10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i11 == i6) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                int i13 = this.f12770c;
                if (z12) {
                    i12 = this.f12769b;
                } else {
                    i12 = i13;
                }
                ofFloat.setDuration(i12);
                if (z12) {
                    timeInterpolator = this.f12772e;
                } else {
                    timeInterpolator = this.f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i6 == i11 && i10 != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    ofFloat.setStartDelay(i13);
                }
                arrayList.add(ofFloat);
                if (i11 == i6 && i10 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f12779m, 0.0f);
                    ofFloat2.setDuration(this.f12768a);
                    ofFloat2.setInterpolator(this.f12771d);
                    ofFloat2.setStartDelay(i13);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return this.f12790y;
        }
        return this.r;
    }

    public final void f() {
        this.f12782p = null;
        c();
        if (this.f12780n == 1) {
            if (this.f12789x && !TextUtils.isEmpty(this.f12788w)) {
                this.f12781o = 2;
            } else {
                this.f12781o = 0;
            }
        }
        i(this.f12780n, this.f12781o, h(this.r, ""));
    }

    public final void g(TextView textView, int i6) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f12775i;
        if (linearLayout == null) {
            return;
        }
        boolean z10 = true;
        if (i6 != 0 && i6 != 1) {
            z10 = false;
        }
        if (z10 && (frameLayout = this.f12777k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i10 = this.f12776j - 1;
        this.f12776j = i10;
        LinearLayout linearLayout2 = this.f12775i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        TextInputLayout textInputLayout = this.f12774h;
        if (d0.g.c(textInputLayout) && textInputLayout.isEnabled() && (this.f12781o != this.f12780n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i6, int i10, boolean z10) {
        TextView e10;
        TextView e11;
        if (i6 == i10) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f12778l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f12789x, this.f12790y, 2, i6, i10);
            d(arrayList, this.f12783q, this.r, 1, i6, i10);
            kotlin.jvm.internal.h.V(animatorSet, arrayList);
            animatorSet.addListener(new a(i10, e(i6), i6, e(i10)));
            animatorSet.start();
        } else if (i6 != i10) {
            if (i10 != 0 && (e11 = e(i10)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i6 != 0 && (e10 = e(i6)) != null) {
                e10.setVisibility(4);
                if (i6 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f12780n = i10;
        }
        TextInputLayout textInputLayout = this.f12774h;
        textInputLayout.q();
        textInputLayout.t(z10, false);
        textInputLayout.w();
    }
}
