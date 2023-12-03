package dc;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.l1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import qb.w;
import t0.d0;
import t0.o0;
/* compiled from: StartCompoundLayout.java */
/* loaded from: classes.dex */
public final class t extends LinearLayout {
    public int A;
    public ImageView.ScaleType B;
    public View.OnLongClickListener C;
    public boolean D;

    /* renamed from: u  reason: collision with root package name */
    public final TextInputLayout f12806u;

    /* renamed from: v  reason: collision with root package name */
    public final i0 f12807v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f12808w;

    /* renamed from: x  reason: collision with root package name */
    public final CheckableImageButton f12809x;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f12810y;

    /* renamed from: z  reason: collision with root package name */
    public PorterDuff.Mode f12811z;

    public t(TextInputLayout textInputLayout, l1 l1Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f12806u = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f12809x = checkableImageButton;
        m.d(checkableImageButton);
        i0 i0Var = new i0(getContext(), null);
        this.f12807v = i0Var;
        if (ub.d.d(getContext())) {
            t0.h.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.C;
        checkableImageButton.setOnClickListener(null);
        m.e(checkableImageButton, onLongClickListener);
        this.C = null;
        checkableImageButton.setOnLongClickListener(null);
        m.e(checkableImageButton, null);
        if (l1Var.l(67)) {
            this.f12810y = ub.d.b(getContext(), l1Var, 67);
        }
        if (l1Var.l(68)) {
            this.f12811z = w.d(l1Var.h(68, -1), null);
        }
        if (l1Var.l(64)) {
            a(l1Var.e(64));
            if (l1Var.l(63) && checkableImageButton.getContentDescription() != (k10 = l1Var.k(63))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(l1Var.a(62, true));
        }
        int d10 = l1Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.A) {
                this.A = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (l1Var.l(66)) {
                ImageView.ScaleType b10 = m.b(l1Var.h(66, -1));
                this.B = b10;
                checkableImageButton.setScaleType(b10);
            }
            i0Var.setVisibility(8);
            i0Var.setId(R.id.textinput_prefix_text);
            i0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.g.f(i0Var, 1);
            androidx.core.widget.k.e(i0Var, l1Var.i(58, 0));
            if (l1Var.l(59)) {
                i0Var.setTextColor(l1Var.b(59));
            }
            CharSequence k11 = l1Var.k(57);
            this.f12808w = TextUtils.isEmpty(k11) ? null : k11;
            i0Var.setText(k11);
            d();
            addView(checkableImageButton);
            addView(i0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12809x;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f12810y;
            PorterDuff.Mode mode = this.f12811z;
            TextInputLayout textInputLayout = this.f12806u;
            m.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            m.c(textInputLayout, checkableImageButton, this.f12810y);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.C;
        checkableImageButton.setOnClickListener(null);
        m.e(checkableImageButton, onLongClickListener);
        this.C = null;
        checkableImageButton.setOnLongClickListener(null);
        m.e(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f12809x;
        int i6 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i6 = 8;
            }
            checkableImageButton.setVisibility(i6);
            c();
            d();
        }
    }

    public final void c() {
        boolean z10;
        EditText editText = this.f12806u.f9274x;
        if (editText == null) {
            return;
        }
        int i6 = 0;
        if (this.f12809x.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            i6 = d0.e.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
        d0.e.k(this.f12807v, i6, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i6;
        boolean z10;
        int i10 = 0;
        if (this.f12808w != null && !this.D) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        if (this.f12809x.getVisibility() != 0 && i6 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            i10 = 8;
        }
        setVisibility(i10);
        this.f12807v.setVisibility(i6);
        this.f12806u.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        c();
    }
}
