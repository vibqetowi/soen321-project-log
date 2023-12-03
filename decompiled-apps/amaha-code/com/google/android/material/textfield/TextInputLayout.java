package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.l1;
import androidx.appcompat.widget.q0;
import androidx.core.widget.k;
import com.google.android.material.internal.CheckableImageButton;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import d9.p;
import dc.g;
import dc.m;
import dc.n;
import dc.o;
import dc.q;
import dc.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.a;
import qb.w;
import r0.g;
import t0.d0;
import t0.o0;
import ug.l;
import yb.f;
import yb.i;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] S0 = {new int[]{16842919}, new int[0]};
    public int A;
    public ColorStateList A0;
    public int B;
    public ColorStateList B0;
    public int C;
    public int C0;
    public final n D;
    public int D0;
    public boolean E;
    public int E0;
    public int F;
    public ColorStateList F0;
    public boolean G;
    public int G0;
    public f H;
    public int H0;
    public i0 I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public CharSequence L;
    public boolean L0;
    public boolean M;
    public final qb.d M0;
    public i0 N;
    public boolean N0;
    public ColorStateList O;
    public boolean O0;
    public int P;
    public ValueAnimator P0;
    public h2.d Q;
    public boolean Q0;
    public h2.d R;
    public boolean R0;
    public ColorStateList S;
    public ColorStateList T;
    public boolean U;
    public CharSequence V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public yb.f f9250a0;

    /* renamed from: b0  reason: collision with root package name */
    public yb.f f9251b0;
    public StateListDrawable c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f9252d0;
    public yb.f e0;

    /* renamed from: f0  reason: collision with root package name */
    public yb.f f9253f0;

    /* renamed from: g0  reason: collision with root package name */
    public yb.i f9254g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f9255h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f9256i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f9257j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f9258k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f9259l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f9260m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f9261n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f9262o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f9263p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f9264q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Rect f9265r0;

    /* renamed from: s0  reason: collision with root package name */
    public final RectF f9266s0;

    /* renamed from: t0  reason: collision with root package name */
    public Typeface f9267t0;

    /* renamed from: u  reason: collision with root package name */
    public final FrameLayout f9268u;

    /* renamed from: u0  reason: collision with root package name */
    public ColorDrawable f9269u0;

    /* renamed from: v  reason: collision with root package name */
    public final t f9270v;

    /* renamed from: v0  reason: collision with root package name */
    public int f9271v0;

    /* renamed from: w  reason: collision with root package name */
    public final com.google.android.material.textfield.a f9272w;

    /* renamed from: w0  reason: collision with root package name */
    public final LinkedHashSet<g> f9273w0;

    /* renamed from: x  reason: collision with root package name */
    public EditText f9274x;

    /* renamed from: x0  reason: collision with root package name */
    public ColorDrawable f9275x0;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f9276y;

    /* renamed from: y0  reason: collision with root package name */
    public int f9277y0;

    /* renamed from: z  reason: collision with root package name */
    public int f9278z;

    /* renamed from: z0  reason: collision with root package name */
    public Drawable f9279z0;

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f9272w.A;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f9274x.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.M0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends t0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f9284d;

        public e(TextInputLayout textInputLayout) {
            this.f9284d = textInputLayout;
        }

        @Override // t0.a
        public final void d(View view, u0.h hVar) {
            CharSequence charSequence;
            boolean z10;
            String str;
            View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f9284d;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(charSequence);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !textInputLayout.L0;
            boolean z14 = !TextUtils.isEmpty(error);
            if (!z14 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z12) {
                str = hint.toString();
            } else {
                str = "";
            }
            t tVar = textInputLayout.f9270v;
            i0 i0Var = tVar.f12807v;
            if (i0Var.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(i0Var);
                if (Build.VERSION.SDK_INT >= 22) {
                    accessibilityNodeInfo.setTraversalAfter(i0Var);
                }
            } else if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(tVar.f12809x);
            }
            if (z11) {
                hVar.l(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                hVar.l(str);
                if (z13 && placeholderText != null) {
                    hVar.l(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                hVar.l(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 26) {
                    hVar.j(str);
                } else {
                    if (z11) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    hVar.l(str);
                }
                boolean z15 = true ^ z11;
                if (i6 >= 26) {
                    accessibilityNodeInfo.setShowingHintText(z15);
                } else {
                    hVar.f(4, z15);
                }
            }
            accessibilityNodeInfo.setMaxTextLength((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z10) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            i0 i0Var2 = textInputLayout.D.f12790y;
            if (i0Var2 != null) {
                accessibilityNodeInfo.setLabelFor(i0Var2);
            }
            textInputLayout.f9272w.b().n(hVar);
        }

        @Override // t0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f9284d.f9272w.b().o(accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* loaded from: classes.dex */
    public static class i extends z0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public CharSequence f9285w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f9286x;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new i[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f9285w) + "}";
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            TextUtils.writeToParcel(this.f9285w, parcel, i6);
            parcel.writeInt(this.f9286x ? 1 : 0);
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9285w = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f9286x = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.textInputStyle, 2132083626), attributeSet, R.attr.textInputStyle);
        this.f9278z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = new n(this);
        this.H = new p(1);
        this.f9264q0 = new Rect();
        this.f9265r0 = new Rect();
        this.f9266s0 = new RectF();
        this.f9273w0 = new LinkedHashSet<>();
        qb.d dVar = new qb.d(this);
        this.M0 = dVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f9268u = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = ab.a.f449a;
        dVar.W = linearInterpolator;
        dVar.i(false);
        dVar.V = linearInterpolator;
        dVar.i(false);
        dVar.l(8388659);
        l1 e10 = qb.t.e(context2, attributeSet, l.P, R.attr.textInputStyle, 2132083626, 22, 20, 38, 43, 47);
        t tVar = new t(this, e10);
        this.f9270v = tVar;
        this.U = e10.a(46, true);
        setHint(e10.k(4));
        this.O0 = e10.a(45, true);
        this.N0 = e10.a(40, true);
        if (e10.l(6)) {
            setMinEms(e10.h(6, -1));
        } else if (e10.l(3)) {
            setMinWidth(e10.d(3, -1));
        }
        if (e10.l(5)) {
            setMaxEms(e10.h(5, -1));
        } else if (e10.l(2)) {
            setMaxWidth(e10.d(2, -1));
        }
        this.f9254g0 = new yb.i(yb.i.b(context2, attributeSet, R.attr.textInputStyle, 2132083626));
        this.f9256i0 = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f9258k0 = e10.c(9, 0);
        this.f9260m0 = e10.d(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f9261n0 = e10.d(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f9259l0 = this.f9260m0;
        TypedArray typedArray = e10.f1474b;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        yb.i iVar = this.f9254g0;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        if (dimension >= 0.0f) {
            aVar.e(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar.f(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar.d(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar.c(dimension4);
        }
        this.f9254g0 = new yb.i(aVar);
        ColorStateList b10 = ub.d.b(context2, e10, 7);
        if (b10 != null) {
            int defaultColor = b10.getDefaultColor();
            this.G0 = defaultColor;
            this.f9263p0 = defaultColor;
            if (b10.isStateful()) {
                this.H0 = b10.getColorForState(new int[]{-16842910}, -1);
                this.I0 = b10.getColorForState(new int[]{16842908, 16842910}, -1);
                this.J0 = b10.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.I0 = this.G0;
                ColorStateList c10 = g0.a.c(R.color.mtrl_filled_background_color, context2);
                this.H0 = c10.getColorForState(new int[]{-16842910}, -1);
                this.J0 = c10.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.f9263p0 = 0;
            this.G0 = 0;
            this.H0 = 0;
            this.I0 = 0;
            this.J0 = 0;
        }
        if (e10.l(1)) {
            ColorStateList b11 = e10.b(1);
            this.B0 = b11;
            this.A0 = b11;
        }
        ColorStateList b12 = ub.d.b(context2, e10, 14);
        this.E0 = typedArray.getColor(14, 0);
        this.C0 = g0.a.b(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.K0 = g0.a.b(context2, R.color.mtrl_textinput_disabled_color);
        this.D0 = g0.a.b(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b12 != null) {
            setBoxStrokeColorStateList(b12);
        }
        if (e10.l(15)) {
            setBoxStrokeErrorColor(ub.d.b(context2, e10, 15));
        }
        if (e10.i(47, -1) != -1) {
            setHintTextAppearance(e10.i(47, 0));
        }
        int i6 = e10.i(38, 0);
        CharSequence k10 = e10.k(33);
        int h10 = e10.h(32, 1);
        boolean a10 = e10.a(34, false);
        int i10 = e10.i(43, 0);
        boolean a11 = e10.a(42, false);
        CharSequence k11 = e10.k(41);
        int i11 = e10.i(55, 0);
        CharSequence k12 = e10.k(54);
        boolean a12 = e10.a(18, false);
        setCounterMaxLength(e10.h(19, -1));
        this.K = e10.i(22, 0);
        this.J = e10.i(20, 0);
        setBoxBackgroundMode(e10.h(8, 0));
        setErrorContentDescription(k10);
        setErrorAccessibilityLiveRegion(h10);
        setCounterOverflowTextAppearance(this.J);
        setHelperTextTextAppearance(i10);
        setErrorTextAppearance(i6);
        setCounterTextAppearance(this.K);
        setPlaceholderText(k12);
        setPlaceholderTextAppearance(i11);
        if (e10.l(39)) {
            setErrorTextColor(e10.b(39));
        }
        if (e10.l(44)) {
            setHelperTextColor(e10.b(44));
        }
        if (e10.l(48)) {
            setHintTextColor(e10.b(48));
        }
        if (e10.l(23)) {
            setCounterTextColor(e10.b(23));
        }
        if (e10.l(21)) {
            setCounterOverflowTextColor(e10.b(21));
        }
        if (e10.l(56)) {
            setPlaceholderTextColor(e10.b(56));
        }
        com.google.android.material.textfield.a aVar2 = new com.google.android.material.textfield.a(this, e10);
        this.f9272w = aVar2;
        boolean a13 = e10.a(0, true);
        e10.n();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(this, 2);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26 && i12 >= 26) {
            d0.l.l(this, 1);
        }
        frameLayout.addView(tVar);
        frameLayout.addView(aVar2);
        addView(frameLayout);
        setEnabled(a13);
        setHelperTextEnabled(a11);
        setErrorEnabled(a10);
        setCounterEnabled(a12);
        setHelperText(k11);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z10;
        int i6;
        EditText editText = this.f9274x;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int C0 = f6.b.C0(R.attr.colorControlHighlight, this.f9274x);
                int i10 = this.f9257j0;
                int[][] iArr = S0;
                if (i10 == 2) {
                    Context context = getContext();
                    yb.f fVar = this.f9250a0;
                    TypedValue c10 = ub.b.c(context, "TextInputLayout", R.attr.colorSurface);
                    int i11 = c10.resourceId;
                    if (i11 != 0) {
                        i6 = g0.a.b(context, i11);
                    } else {
                        i6 = c10.data;
                    }
                    yb.f fVar2 = new yb.f(fVar.f38424u.f38431a);
                    int L0 = f6.b.L0(0.1f, C0, i6);
                    fVar2.k(new ColorStateList(iArr, new int[]{L0, 0}));
                    fVar2.setTint(i6);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{L0, i6});
                    yb.f fVar3 = new yb.f(fVar.f38424u.f38431a);
                    fVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar2, fVar3), fVar});
                } else if (i10 == 1) {
                    yb.f fVar4 = this.f9250a0;
                    int i12 = this.f9263p0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{f6.b.L0(0.1f, C0, i12), i12}), fVar4, fVar4);
                } else {
                    return null;
                }
            }
        }
        return this.f9250a0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.c0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.c0 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.c0.addState(new int[0], f(false));
        }
        return this.c0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f9251b0 == null) {
            this.f9251b0 = f(true);
        }
        return this.f9251b0;
    }

    public static void k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f9274x == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f9274x = editText;
            int i6 = this.f9278z;
            if (i6 != -1) {
                setMinEms(i6);
            } else {
                setMinWidth(this.B);
            }
            int i10 = this.A;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.C);
            }
            this.f9252d0 = false;
            i();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f9274x.getTypeface();
            qb.d dVar = this.M0;
            boolean m10 = dVar.m(typeface);
            boolean o10 = dVar.o(typeface);
            if (m10 || o10) {
                dVar.i(false);
            }
            float textSize = this.f9274x.getTextSize();
            if (dVar.f29432l != textSize) {
                dVar.f29432l = textSize;
                dVar.i(false);
            }
            float letterSpacing = this.f9274x.getLetterSpacing();
            if (dVar.f29423g0 != letterSpacing) {
                dVar.f29423g0 = letterSpacing;
                dVar.i(false);
            }
            int gravity = this.f9274x.getGravity();
            dVar.l((gravity & (-113)) | 48);
            if (dVar.f29428j != gravity) {
                dVar.f29428j = gravity;
                dVar.i(false);
            }
            this.f9274x.addTextChangedListener(new a());
            if (this.A0 == null) {
                this.A0 = this.f9274x.getHintTextColors();
            }
            if (this.U) {
                if (TextUtils.isEmpty(this.V)) {
                    CharSequence hint = this.f9274x.getHint();
                    this.f9276y = hint;
                    setHint(hint);
                    this.f9274x.setHint((CharSequence) null);
                }
                this.W = true;
            }
            if (this.I != null) {
                n(this.f9274x.getText());
            }
            q();
            this.D.b();
            this.f9270v.bringToFront();
            com.google.android.material.textfield.a aVar = this.f9272w;
            aVar.bringToFront();
            Iterator<g> it = this.f9273w0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            aVar.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.V)) {
            this.V = charSequence;
            qb.d dVar = this.M0;
            if (charSequence == null || !TextUtils.equals(dVar.G, charSequence)) {
                dVar.G = charSequence;
                dVar.H = null;
                Bitmap bitmap = dVar.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    dVar.K = null;
                }
                dVar.i(false);
            }
            if (!this.L0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.M == z10) {
            return;
        }
        if (z10) {
            i0 i0Var = this.N;
            if (i0Var != null) {
                this.f9268u.addView(i0Var);
                this.N.setVisibility(0);
            }
        } else {
            i0 i0Var2 = this.N;
            if (i0Var2 != null) {
                i0Var2.setVisibility(8);
            }
            this.N = null;
        }
        this.M = z10;
    }

    public final void a(float f2) {
        qb.d dVar = this.M0;
        if (dVar.f29415b == f2) {
            return;
        }
        if (this.P0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.P0 = valueAnimator;
            valueAnimator.setInterpolator(rb.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, ab.a.f450b));
            this.P0.setDuration(rb.a.c(getContext(), R.attr.motionDurationMedium4, 167));
            this.P0.addUpdateListener(new d());
        }
        this.P0.setFloatValues(dVar.f29415b, f2);
        this.P0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f9268u;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i6, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        yb.f fVar;
        ColorStateList valueOf;
        boolean z11;
        yb.f fVar2 = this.f9250a0;
        if (fVar2 == null) {
            return;
        }
        yb.i iVar = fVar2.f38424u.f38431a;
        yb.i iVar2 = this.f9254g0;
        if (iVar != iVar2) {
            fVar2.setShapeAppearanceModel(iVar2);
        }
        boolean z12 = false;
        if (this.f9257j0 == 2) {
            if (this.f9259l0 > -1 && this.f9262o0 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                z10 = true;
                if (z10) {
                    yb.f fVar3 = this.f9250a0;
                    int i6 = this.f9262o0;
                    fVar3.f38424u.f38440k = this.f9259l0;
                    fVar3.invalidateSelf();
                    ColorStateList valueOf2 = ColorStateList.valueOf(i6);
                    f.b bVar = fVar3.f38424u;
                    if (bVar.f38434d != valueOf2) {
                        bVar.f38434d = valueOf2;
                        fVar3.onStateChange(fVar3.getState());
                    }
                }
                int i10 = this.f9263p0;
                if (this.f9257j0 == 1) {
                    i10 = j0.d.f(this.f9263p0, f6.b.D0(getContext(), R.attr.colorSurface, 0));
                }
                this.f9263p0 = i10;
                this.f9250a0.k(ColorStateList.valueOf(i10));
                fVar = this.e0;
                if (fVar != null && this.f9253f0 != null) {
                    if (this.f9259l0 > -1 && this.f9262o0 != 0) {
                        z12 = true;
                    }
                    if (z12) {
                        if (this.f9274x.isFocused()) {
                            valueOf = ColorStateList.valueOf(this.C0);
                        } else {
                            valueOf = ColorStateList.valueOf(this.f9262o0);
                        }
                        fVar.k(valueOf);
                        this.f9253f0.k(ColorStateList.valueOf(this.f9262o0));
                    }
                    invalidate();
                }
                r();
            }
        }
        z10 = false;
        if (z10) {
        }
        int i102 = this.f9263p0;
        if (this.f9257j0 == 1) {
        }
        this.f9263p0 = i102;
        this.f9250a0.k(ColorStateList.valueOf(i102));
        fVar = this.e0;
        if (fVar != null) {
            if (this.f9259l0 > -1) {
                z12 = true;
            }
            if (z12) {
            }
            invalidate();
        }
        r();
    }

    public final int c() {
        float e10;
        if (!this.U) {
            return 0;
        }
        int i6 = this.f9257j0;
        qb.d dVar = this.M0;
        if (i6 != 0) {
            if (i6 != 2) {
                return 0;
            }
            e10 = dVar.e() / 2.0f;
        } else {
            e10 = dVar.e();
        }
        return (int) e10;
    }

    public final h2.d d() {
        h2.d dVar = new h2.d();
        dVar.f17044w = rb.a.c(getContext(), R.attr.motionDurationShort2, 87);
        dVar.f17045x = rb.a.d(getContext(), R.attr.motionEasingLinearInterpolator, ab.a.f449a);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i6) {
        EditText editText = this.f9274x;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.f9276y != null) {
            boolean z10 = this.W;
            this.W = false;
            CharSequence hint = editText.getHint();
            this.f9274x.setHint(this.f9276y);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.f9274x.setHint(hint);
                this.W = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        FrameLayout frameLayout = this.f9268u;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure newChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(newChild, i6);
            if (childAt == this.f9274x) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.R0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.R0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        yb.f fVar;
        super.draw(canvas);
        boolean z10 = this.U;
        qb.d dVar = this.M0;
        if (z10) {
            dVar.d(canvas);
        }
        if (this.f9253f0 != null && (fVar = this.e0) != null) {
            fVar.draw(canvas);
            if (this.f9274x.isFocused()) {
                Rect bounds = this.f9253f0.getBounds();
                Rect bounds2 = this.e0.getBounds();
                float f2 = dVar.f29415b;
                int centerX = bounds2.centerX();
                bounds.left = ab.a.b(f2, centerX, bounds2.left);
                bounds.right = ab.a.b(f2, centerX, bounds2.right);
                this.f9253f0.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        if (this.Q0) {
            return;
        }
        boolean z11 = true;
        this.Q0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        qb.d dVar = this.M0;
        if (dVar != null) {
            z10 = dVar.r(drawableState) | false;
        } else {
            z10 = false;
        }
        if (this.f9274x != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            t((d0.g.c(this) && isEnabled()) ? false : false, false);
        }
        q();
        w();
        if (z10) {
            invalidate();
        }
        this.Q0 = false;
    }

    public final boolean e() {
        if (this.U && !TextUtils.isEmpty(this.V) && (this.f9250a0 instanceof dc.g)) {
            return true;
        }
        return false;
    }

    public final yb.f f(boolean z10) {
        float f2;
        float dimensionPixelOffset;
        int i6;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z10) {
            f2 = dimensionPixelOffset2;
        } else {
            f2 = 0.0f;
        }
        EditText editText = this.f9274x;
        if (editText instanceof q) {
            dimensionPixelOffset = ((q) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i.a aVar = new i.a();
        aVar.e(f2);
        aVar.f(f2);
        aVar.c(dimensionPixelOffset2);
        aVar.d(dimensionPixelOffset2);
        yb.i iVar = new yb.i(aVar);
        Context context = getContext();
        Paint paint = yb.f.Q;
        TypedValue c10 = ub.b.c(context, yb.f.class.getSimpleName(), R.attr.colorSurface);
        int i10 = c10.resourceId;
        if (i10 != 0) {
            i6 = g0.a.b(context, i10);
        } else {
            i6 = c10.data;
        }
        yb.f fVar = new yb.f();
        fVar.i(context);
        fVar.k(ColorStateList.valueOf(i6));
        fVar.j(dimensionPixelOffset);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f38424u;
        if (bVar.f38437h == null) {
            bVar.f38437h = new Rect();
        }
        fVar.f38424u.f38437h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        fVar.invalidateSelf();
        return fVar;
    }

    public final int g(int i6, boolean z10) {
        int compoundPaddingLeft = this.f9274x.getCompoundPaddingLeft() + i6;
        if (getPrefixText() != null && !z10) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f9274x;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public yb.f getBoxBackground() {
        int i6 = this.f9257j0;
        if (i6 != 1 && i6 != 2) {
            throw new IllegalStateException();
        }
        return this.f9250a0;
    }

    public int getBoxBackgroundColor() {
        return this.f9263p0;
    }

    public int getBoxBackgroundMode() {
        return this.f9257j0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f9258k0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean c10 = w.c(this);
        RectF rectF = this.f9266s0;
        if (c10) {
            return this.f9254g0.f38458h.a(rectF);
        }
        return this.f9254g0.f38457g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean c10 = w.c(this);
        RectF rectF = this.f9266s0;
        if (c10) {
            return this.f9254g0.f38457g.a(rectF);
        }
        return this.f9254g0.f38458h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean c10 = w.c(this);
        RectF rectF = this.f9266s0;
        if (c10) {
            return this.f9254g0.f38456e.a(rectF);
        }
        return this.f9254g0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean c10 = w.c(this);
        RectF rectF = this.f9266s0;
        if (c10) {
            return this.f9254g0.f.a(rectF);
        }
        return this.f9254g0.f38456e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.E0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.F0;
    }

    public int getBoxStrokeWidth() {
        return this.f9260m0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f9261n0;
    }

    public int getCounterMaxLength() {
        return this.F;
    }

    public CharSequence getCounterOverflowDescription() {
        i0 i0Var;
        if (this.E && this.G && (i0Var = this.I) != null) {
            return i0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.T;
    }

    public ColorStateList getCounterTextColor() {
        return this.S;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.A0;
    }

    public EditText getEditText() {
        return this.f9274x;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f9272w.A.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f9272w.A.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f9272w.G;
    }

    public int getEndIconMode() {
        return this.f9272w.C;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f9272w.H;
    }

    public CheckableImageButton getEndIconView() {
        return this.f9272w.A;
    }

    public CharSequence getError() {
        n nVar = this.D;
        if (nVar.f12783q) {
            return nVar.f12782p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.D.f12785t;
    }

    public CharSequence getErrorContentDescription() {
        return this.D.f12784s;
    }

    public int getErrorCurrentTextColors() {
        i0 i0Var = this.D.r;
        if (i0Var != null) {
            return i0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f9272w.f9289w.getDrawable();
    }

    public CharSequence getHelperText() {
        n nVar = this.D;
        if (nVar.f12789x) {
            return nVar.f12788w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        i0 i0Var = this.D.f12790y;
        if (i0Var != null) {
            return i0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.U) {
            return this.V;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.M0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        qb.d dVar = this.M0;
        return dVar.f(dVar.f29438o);
    }

    public ColorStateList getHintTextColor() {
        return this.B0;
    }

    public f getLengthCounter() {
        return this.H;
    }

    public int getMaxEms() {
        return this.A;
    }

    public int getMaxWidth() {
        return this.C;
    }

    public int getMinEms() {
        return this.f9278z;
    }

    public int getMinWidth() {
        return this.B;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f9272w.A.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f9272w.A.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.M) {
            return this.L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.P;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.O;
    }

    public CharSequence getPrefixText() {
        return this.f9270v.f12808w;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f9270v.f12807v.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f9270v.f12807v;
    }

    public yb.i getShapeAppearanceModel() {
        return this.f9254g0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f9270v.f12809x.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f9270v.f12809x.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f9270v.A;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f9270v.B;
    }

    public CharSequence getSuffixText() {
        return this.f9272w.J;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f9272w.K.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f9272w.K;
    }

    public Typeface getTypeface() {
        return this.f9267t0;
    }

    public final int h(int i6, boolean z10) {
        int compoundPaddingRight = i6 - this.f9274x.getCompoundPaddingRight();
        if (getPrefixText() != null && z10) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    public final void i() {
        boolean z10;
        int i6 = this.f9257j0;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    if (this.U && !(this.f9250a0 instanceof dc.g)) {
                        yb.i iVar = this.f9254g0;
                        int i10 = dc.g.S;
                        this.f9250a0 = new g.a(iVar);
                    } else {
                        this.f9250a0 = new yb.f(this.f9254g0);
                    }
                    this.e0 = null;
                    this.f9253f0 = null;
                } else {
                    throw new IllegalArgumentException(pl.a.g(new StringBuilder(), this.f9257j0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f9250a0 = new yb.f(this.f9254g0);
                this.e0 = new yb.f();
                this.f9253f0 = new yb.f();
            }
        } else {
            this.f9250a0 = null;
            this.e0 = null;
            this.f9253f0 = null;
        }
        r();
        w();
        boolean z11 = false;
        if (this.f9257j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f9258k0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ub.d.d(getContext())) {
                this.f9258k0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f9274x != null && this.f9257j0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z11 = true;
            }
            if (z11) {
                EditText editText = this.f9274x;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.e.k(editText, d0.e.f(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), d0.e.e(this.f9274x), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ub.d.d(getContext())) {
                EditText editText2 = this.f9274x;
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                d0.e.k(editText2, d0.e.f(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), d0.e.e(this.f9274x), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f9257j0 != 0) {
            s();
        }
        EditText editText3 = this.f9274x;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f9257j0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int i6;
        int i10;
        if (!e()) {
            return;
        }
        int width = this.f9274x.getWidth();
        int gravity = this.f9274x.getGravity();
        qb.d dVar = this.M0;
        boolean b10 = dVar.b(dVar.G);
        dVar.I = b10;
        Rect rect = dVar.f29424h;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b10) {
                    f2 = rect.right;
                    f10 = dVar.f29429j0;
                } else {
                    i10 = rect.left;
                    f11 = i10;
                }
            } else if (b10) {
                i10 = rect.left;
                f11 = i10;
            } else {
                f2 = rect.right;
                f10 = dVar.f29429j0;
            }
            float max = Math.max(f11, rect.left);
            rectF = this.f9266s0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (dVar.I) {
                        i6 = rect.right;
                        f12 = i6;
                    } else {
                        f12 = dVar.f29429j0 + max;
                    }
                } else if (dVar.I) {
                    f12 = dVar.f29429j0 + max;
                } else {
                    i6 = rect.right;
                    f12 = i6;
                }
            } else {
                f12 = (width / 2.0f) + (dVar.f29429j0 / 2.0f);
            }
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = dVar.e() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f13 = rectF.left;
                float f14 = this.f9256i0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f9259l0);
                dc.g gVar = (dc.g) this.f9250a0;
                gVar.getClass();
                gVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f2 = width / 2.0f;
        f10 = dVar.f29429j0 / 2.0f;
        f11 = f2 - f10;
        float max2 = Math.max(f11, rect.left);
        rectF = this.f9266s0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f12 = (width / 2.0f) + (dVar.f29429j0 / 2.0f);
        rectF.right = Math.min(f12, rect.right);
        rectF.bottom = dVar.e() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(TextView textView, int i6) {
        boolean z10 = true;
        try {
            k.e(textView, i6);
            if (Build.VERSION.SDK_INT >= 23) {
            }
            z10 = false;
        } catch (Exception unused) {
        }
        if (z10) {
            k.e(textView, com.appsflyer.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(g0.a.b(getContext(), R.color.design_error));
        }
    }

    public final boolean m() {
        n nVar = this.D;
        if (nVar.f12781o == 1 && nVar.r != null && !TextUtils.isEmpty(nVar.f12782p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i6;
        boolean z10;
        int i10;
        boolean z11;
        r0.a aVar;
        ((p) this.H).getClass();
        if (editable != null) {
            i6 = editable.length();
        } else {
            i6 = 0;
        }
        boolean z12 = this.G;
        int i11 = this.F;
        String str = null;
        if (i11 == -1) {
            this.I.setText(String.valueOf(i6));
            this.I.setContentDescription(null);
            this.G = false;
        } else {
            if (i6 > i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.G = z10;
            Context context = getContext();
            i0 i0Var = this.I;
            int i12 = this.F;
            if (this.G) {
                i10 = R.string.character_counter_overflowed_content_description;
            } else {
                i10 = R.string.character_counter_content_description;
            }
            i0Var.setContentDescription(context.getString(i10, Integer.valueOf(i6), Integer.valueOf(i12)));
            if (z12 != this.G) {
                o();
            }
            String str2 = r0.a.f30161d;
            Locale locale = Locale.getDefault();
            int i13 = r0.g.f30184a;
            if (g.a.a(locale) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar = r0.a.f30163g;
            } else {
                aVar = r0.a.f;
            }
            i0 i0Var2 = this.I;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i6), Integer.valueOf(this.F));
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.f30166c).toString();
            }
            i0Var2.setText(str);
        }
        if (this.f9274x != null && z12 != this.G) {
            t(false, false);
            w();
            q();
        }
    }

    public final void o() {
        int i6;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i0 i0Var = this.I;
        if (i0Var != null) {
            if (this.G) {
                i6 = this.J;
            } else {
                i6 = this.K;
            }
            l(i0Var, i6);
            if (!this.G && (colorStateList2 = this.S) != null) {
                this.I.setTextColor(colorStateList2);
            }
            if (this.G && (colorStateList = this.T) != null) {
                this.I.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.M0.h(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        int compoundPaddingTop;
        boolean z13;
        int compoundPaddingBottom;
        boolean z14;
        super.onLayout(z10, i6, i10, i11, i12);
        EditText editText = this.f9274x;
        if (editText != null) {
            Rect rect = this.f9264q0;
            qb.e.a(this, editText, rect);
            yb.f fVar = this.e0;
            if (fVar != null) {
                int i13 = rect.bottom;
                fVar.setBounds(rect.left, i13 - this.f9260m0, rect.right, i13);
            }
            yb.f fVar2 = this.f9253f0;
            if (fVar2 != null) {
                int i14 = rect.bottom;
                fVar2.setBounds(rect.left, i14 - this.f9261n0, rect.right, i14);
            }
            if (this.U) {
                float textSize = this.f9274x.getTextSize();
                qb.d dVar = this.M0;
                if (dVar.f29432l != textSize) {
                    dVar.f29432l = textSize;
                    dVar.i(false);
                }
                int gravity = this.f9274x.getGravity();
                dVar.l((gravity & (-113)) | 48);
                if (dVar.f29428j != gravity) {
                    dVar.f29428j = gravity;
                    dVar.i(false);
                }
                if (this.f9274x != null) {
                    boolean c10 = w.c(this);
                    int i15 = rect.bottom;
                    Rect rect2 = this.f9265r0;
                    rect2.bottom = i15;
                    int i16 = this.f9257j0;
                    if (i16 != 1) {
                        if (i16 != 2) {
                            rect2.left = g(rect.left, c10);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, c10);
                        } else {
                            rect2.left = this.f9274x.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f9274x.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, c10);
                        rect2.top = rect.top + this.f9258k0;
                        rect2.right = h(rect.right, c10);
                    }
                    int i17 = rect2.left;
                    int i18 = rect2.top;
                    int i19 = rect2.right;
                    int i20 = rect2.bottom;
                    Rect rect3 = dVar.f29424h;
                    if (rect3.left == i17 && rect3.top == i18 && rect3.right == i19 && rect3.bottom == i20) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        rect3.set(i17, i18, i19, i20);
                        dVar.S = true;
                    }
                    if (this.f9274x != null) {
                        TextPaint textPaint = dVar.U;
                        textPaint.setTextSize(dVar.f29432l);
                        textPaint.setTypeface(dVar.f29451z);
                        textPaint.setLetterSpacing(dVar.f29423g0);
                        float f2 = -textPaint.ascent();
                        rect2.left = this.f9274x.getCompoundPaddingLeft() + rect.left;
                        if (this.f9257j0 == 1 && this.f9274x.getMinLines() <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            compoundPaddingTop = (int) (rect.centerY() - (f2 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f9274x.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f9274x.getCompoundPaddingRight();
                        if (this.f9257j0 == 1 && this.f9274x.getMinLines() <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            compoundPaddingBottom = (int) (rect2.top + f2);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f9274x.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i21 = rect2.left;
                        int i22 = rect2.top;
                        int i23 = rect2.right;
                        Rect rect4 = dVar.f29422g;
                        if (rect4.left == i21 && rect4.top == i22 && rect4.right == i23 && rect4.bottom == compoundPaddingBottom) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z14) {
                            rect4.set(i21, i22, i23, compoundPaddingBottom);
                            dVar.S = true;
                        }
                        dVar.i(false);
                        if (e() && !this.L0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        EditText editText;
        int max;
        super.onMeasure(i6, i10);
        EditText editText2 = this.f9274x;
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (editText2 != null && this.f9274x.getMeasuredHeight() < (max = Math.max(aVar.getMeasuredHeight(), this.f9270v.getMeasuredHeight()))) {
            this.f9274x.setMinimumHeight(max);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean p10 = p();
        if (z10 || p10) {
            this.f9274x.post(new c());
        }
        if (this.N != null && (editText = this.f9274x) != null) {
            this.N.setGravity(editText.getGravity());
            this.N.setPadding(this.f9274x.getCompoundPaddingLeft(), this.f9274x.getCompoundPaddingTop(), this.f9274x.getCompoundPaddingRight(), this.f9274x.getCompoundPaddingBottom());
        }
        aVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f39113u);
        setError(iVar.f9285w);
        if (iVar.f9286x) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z10 = true;
        if (i6 != 1) {
            z10 = false;
        }
        if (z10 != this.f9255h0) {
            yb.c cVar = this.f9254g0.f38456e;
            RectF rectF = this.f9266s0;
            float a10 = cVar.a(rectF);
            float a11 = this.f9254g0.f.a(rectF);
            float a12 = this.f9254g0.f38458h.a(rectF);
            float a13 = this.f9254g0.f38457g.a(rectF);
            yb.i iVar = this.f9254g0;
            df.b bVar = iVar.f38452a;
            i.a aVar = new i.a();
            df.b bVar2 = iVar.f38453b;
            aVar.f38463a = bVar2;
            float b10 = i.a.b(bVar2);
            if (b10 != -1.0f) {
                aVar.e(b10);
            }
            aVar.f38464b = bVar;
            float b11 = i.a.b(bVar);
            if (b11 != -1.0f) {
                aVar.f(b11);
            }
            df.b bVar3 = iVar.f38454c;
            aVar.f38466d = bVar3;
            float b12 = i.a.b(bVar3);
            if (b12 != -1.0f) {
                aVar.c(b12);
            }
            df.b bVar4 = iVar.f38455d;
            aVar.f38465c = bVar4;
            float b13 = i.a.b(bVar4);
            if (b13 != -1.0f) {
                aVar.d(b13);
            }
            aVar.e(a11);
            aVar.f(a10);
            aVar.c(a13);
            aVar.d(a12);
            yb.i iVar2 = new yb.i(aVar);
            this.f9255h0 = z10;
            setShapeAppearanceModel(iVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        i iVar = new i(super.onSaveInstanceState());
        if (m()) {
            iVar.f9285w = getError();
        }
        com.google.android.material.textfield.a aVar = this.f9272w;
        boolean z11 = true;
        if (aVar.C != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        iVar.f9286x = (z10 && aVar.A.isChecked()) ? false : false;
        return iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r3.c() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r3.J != null) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this.f9274x == null) {
            return false;
        }
        Drawable startIconDrawable = getStartIconDrawable();
        boolean z15 = true;
        t tVar = this.f9270v;
        if ((startIconDrawable != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && tVar.getMeasuredWidth() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        CheckableImageButton checkableImageButton = null;
        if (z10) {
            int measuredWidth = tVar.getMeasuredWidth() - this.f9274x.getPaddingLeft();
            if (this.f9269u0 == null || this.f9271v0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f9269u0 = colorDrawable;
                this.f9271v0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a10 = k.b.a(this.f9274x);
            Drawable drawable = a10[0];
            ColorDrawable colorDrawable2 = this.f9269u0;
            if (drawable != colorDrawable2) {
                k.b.e(this.f9274x, colorDrawable2, a10[1], a10[2], a10[3]);
                z11 = true;
            }
            z11 = false;
        } else {
            if (this.f9269u0 != null) {
                Drawable[] a11 = k.b.a(this.f9274x);
                k.b.e(this.f9274x, null, a11[1], a11[2], a11[3]);
                this.f9269u0 = null;
                z11 = true;
            }
            z11 = false;
        }
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (!aVar.d()) {
            if (aVar.C != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
            }
        }
        if (aVar.getMeasuredWidth() > 0) {
            z12 = true;
            if (!z12) {
                int measuredWidth2 = aVar.K.getMeasuredWidth() - this.f9274x.getPaddingRight();
                if (aVar.d()) {
                    checkableImageButton = aVar.f9289w;
                } else {
                    if (aVar.C != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 && aVar.c()) {
                        checkableImageButton = aVar.A;
                    }
                }
                if (checkableImageButton != null) {
                    measuredWidth2 = t0.h.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                }
                Drawable[] a12 = k.b.a(this.f9274x);
                ColorDrawable colorDrawable3 = this.f9275x0;
                if (colorDrawable3 != null && this.f9277y0 != measuredWidth2) {
                    this.f9277y0 = measuredWidth2;
                    colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                    k.b.e(this.f9274x, a12[0], a12[1], this.f9275x0, a12[3]);
                } else {
                    if (colorDrawable3 == null) {
                        ColorDrawable colorDrawable4 = new ColorDrawable();
                        this.f9275x0 = colorDrawable4;
                        this.f9277y0 = measuredWidth2;
                        colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
                    }
                    Drawable drawable2 = a12[2];
                    ColorDrawable colorDrawable5 = this.f9275x0;
                    if (drawable2 != colorDrawable5) {
                        this.f9279z0 = drawable2;
                        k.b.e(this.f9274x, a12[0], a12[1], colorDrawable5, a12[3]);
                    } else {
                        z15 = z11;
                    }
                }
            } else if (this.f9275x0 != null) {
                Drawable[] a13 = k.b.a(this.f9274x);
                if (a13[2] == this.f9275x0) {
                    k.b.e(this.f9274x, a13[0], a13[1], this.f9279z0, a13[3]);
                } else {
                    z15 = z11;
                }
                this.f9275x0 = null;
            } else {
                return z11;
            }
            return z15;
        }
        z12 = false;
        if (!z12) {
        }
        return z15;
    }

    public final void q() {
        Drawable background;
        i0 i0Var;
        EditText editText = this.f9274x;
        if (editText == null || this.f9257j0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = q0.f1510a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(j.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.G && (i0Var = this.I) != null) {
            mutate.setColorFilter(j.c(i0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            k0.a.a(mutate);
            this.f9274x.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f9274x;
        if (editText != null && this.f9250a0 != null) {
            if ((this.f9252d0 || editText.getBackground() == null) && this.f9257j0 != 0) {
                EditText editText2 = this.f9274x;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.q(editText2, editTextBoxBackground);
                this.f9252d0 = true;
            }
        }
    }

    public final void s() {
        if (this.f9257j0 != 1) {
            FrameLayout frameLayout = this.f9268u;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c10 = c();
            if (c10 != layoutParams.topMargin) {
                layoutParams.topMargin = c10;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.f9263p0 != i6) {
            this.f9263p0 = i6;
            this.G0 = i6;
            this.I0 = i6;
            this.J0 = i6;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        setBoxBackgroundColor(g0.a.b(getContext(), i6));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.G0 = defaultColor;
        this.f9263p0 = defaultColor;
        this.H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.I0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.J0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 == this.f9257j0) {
            return;
        }
        this.f9257j0 = i6;
        if (this.f9274x != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.f9258k0 = i6;
    }

    public void setBoxCornerFamily(int i6) {
        yb.i iVar = this.f9254g0;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        yb.c cVar = this.f9254g0.f38456e;
        df.b t02 = f6.b.t0(i6);
        aVar.f38463a = t02;
        float b10 = i.a.b(t02);
        if (b10 != -1.0f) {
            aVar.e(b10);
        }
        aVar.f38467e = cVar;
        yb.c cVar2 = this.f9254g0.f;
        df.b t03 = f6.b.t0(i6);
        aVar.f38464b = t03;
        float b11 = i.a.b(t03);
        if (b11 != -1.0f) {
            aVar.f(b11);
        }
        aVar.f = cVar2;
        yb.c cVar3 = this.f9254g0.f38458h;
        df.b t04 = f6.b.t0(i6);
        aVar.f38466d = t04;
        float b12 = i.a.b(t04);
        if (b12 != -1.0f) {
            aVar.c(b12);
        }
        aVar.f38469h = cVar3;
        yb.c cVar4 = this.f9254g0.f38457g;
        df.b t05 = f6.b.t0(i6);
        aVar.f38465c = t05;
        float b13 = i.a.b(t05);
        if (b13 != -1.0f) {
            aVar.d(b13);
        }
        aVar.f38468g = cVar4;
        this.f9254g0 = new yb.i(aVar);
        b();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.E0 != i6) {
            this.E0 = i6;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.C0 = colorStateList.getDefaultColor();
            this.K0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.D0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.E0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.E0 != colorStateList.getDefaultColor()) {
            this.E0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.F0 != colorStateList) {
            this.F0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.f9260m0 = i6;
        w();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.f9261n0 = i6;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.E != z10) {
            Editable editable = null;
            n nVar = this.D;
            if (z10) {
                i0 i0Var = new i0(getContext(), null);
                this.I = i0Var;
                i0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f9267t0;
                if (typeface != null) {
                    this.I.setTypeface(typeface);
                }
                this.I.setMaxLines(1);
                nVar.a(this.I, 2);
                t0.h.h((ViewGroup.MarginLayoutParams) this.I.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.I != null) {
                    EditText editText = this.f9274x;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                nVar.g(this.I, 2);
                this.I = null;
            }
            this.E = z10;
        }
    }

    public void setCounterMaxLength(int i6) {
        Editable text;
        if (this.F != i6) {
            if (i6 > 0) {
                this.F = i6;
            } else {
                this.F = -1;
            }
            if (this.E && this.I != null) {
                EditText editText = this.f9274x;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.J != i6) {
            this.J = i6;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.K != i6) {
            this.K = i6;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.B0 = colorStateList;
        if (this.f9274x != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f9272w.A.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f9272w.A.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i6) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        CharSequence text = i6 != 0 ? aVar.getResources().getText(i6) : null;
        CheckableImageButton checkableImageButton = aVar.A;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        Drawable H = i6 != 0 ? hc.d.H(aVar.getContext(), i6) : null;
        CheckableImageButton checkableImageButton = aVar.A;
        checkableImageButton.setImageDrawable(H);
        if (H != null) {
            ColorStateList colorStateList = aVar.E;
            PorterDuff.Mode mode = aVar.F;
            TextInputLayout textInputLayout = aVar.f9287u;
            m.a(textInputLayout, checkableImageButton, colorStateList, mode);
            m.c(textInputLayout, checkableImageButton, aVar.E);
        }
    }

    public void setEndIconMinSize(int i6) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (i6 >= 0) {
            if (i6 != aVar.G) {
                aVar.G = i6;
                CheckableImageButton checkableImageButton = aVar.A;
                checkableImageButton.setMinimumWidth(i6);
                checkableImageButton.setMinimumHeight(i6);
                CheckableImageButton checkableImageButton2 = aVar.f9289w;
                checkableImageButton2.setMinimumWidth(i6);
                checkableImageButton2.setMinimumHeight(i6);
                return;
            }
            return;
        }
        aVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i6) {
        this.f9272w.f(i6);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        View.OnLongClickListener onLongClickListener = aVar.I;
        CheckableImageButton checkableImageButton = aVar.A;
        checkableImageButton.setOnClickListener(onClickListener);
        m.e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.I = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.A;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m.e(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.H = scaleType;
        aVar.A.setScaleType(scaleType);
        aVar.f9289w.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (aVar.E != colorStateList) {
            aVar.E = colorStateList;
            m.a(aVar.f9287u, aVar.A, colorStateList, aVar.F);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (aVar.F != mode) {
            aVar.F = mode;
            m.a(aVar.f9287u, aVar.A, aVar.E, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f9272w.g(z10);
    }

    public void setError(CharSequence charSequence) {
        n nVar = this.D;
        if (!nVar.f12783q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            nVar.c();
            nVar.f12782p = charSequence;
            nVar.r.setText(charSequence);
            int i6 = nVar.f12780n;
            if (i6 != 1) {
                nVar.f12781o = 1;
            }
            nVar.i(i6, nVar.f12781o, nVar.h(nVar.r, charSequence));
            return;
        }
        nVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        n nVar = this.D;
        nVar.f12785t = i6;
        i0 i0Var = nVar.r;
        if (i0Var != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.g.f(i0Var, i6);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.D;
        nVar.f12784s = charSequence;
        i0 i0Var = nVar.r;
        if (i0Var != null) {
            i0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        n nVar = this.D;
        if (nVar.f12783q != z10) {
            nVar.c();
            TextInputLayout textInputLayout = nVar.f12774h;
            if (z10) {
                i0 i0Var = new i0(nVar.f12773g, null);
                nVar.r = i0Var;
                i0Var.setId(R.id.textinput_error);
                nVar.r.setTextAlignment(5);
                Typeface typeface = nVar.B;
                if (typeface != null) {
                    nVar.r.setTypeface(typeface);
                }
                int i6 = nVar.f12786u;
                nVar.f12786u = i6;
                i0 i0Var2 = nVar.r;
                if (i0Var2 != null) {
                    textInputLayout.l(i0Var2, i6);
                }
                ColorStateList colorStateList = nVar.f12787v;
                nVar.f12787v = colorStateList;
                i0 i0Var3 = nVar.r;
                if (i0Var3 != null && colorStateList != null) {
                    i0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = nVar.f12784s;
                nVar.f12784s = charSequence;
                i0 i0Var4 = nVar.r;
                if (i0Var4 != null) {
                    i0Var4.setContentDescription(charSequence);
                }
                int i10 = nVar.f12785t;
                nVar.f12785t = i10;
                i0 i0Var5 = nVar.r;
                if (i0Var5 != null) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.g.f(i0Var5, i10);
                }
                nVar.r.setVisibility(4);
                nVar.a(nVar.r, 0);
            } else {
                nVar.f();
                nVar.g(nVar.r, 0);
                nVar.r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            nVar.f12783q = z10;
        }
    }

    public void setErrorIconDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.h(i6 != 0 ? hc.d.H(aVar.getContext(), i6) : null);
        m.c(aVar.f9287u, aVar.f9289w, aVar.f9290x);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        CheckableImageButton checkableImageButton = aVar.f9289w;
        View.OnLongClickListener onLongClickListener = aVar.f9292z;
        checkableImageButton.setOnClickListener(onClickListener);
        m.e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.f9292z = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f9289w;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m.e(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (aVar.f9290x != colorStateList) {
            aVar.f9290x = colorStateList;
            m.a(aVar.f9287u, aVar.f9289w, colorStateList, aVar.f9291y);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (aVar.f9291y != mode) {
            aVar.f9291y = mode;
            m.a(aVar.f9287u, aVar.f9289w, aVar.f9290x, mode);
        }
    }

    public void setErrorTextAppearance(int i6) {
        n nVar = this.D;
        nVar.f12786u = i6;
        i0 i0Var = nVar.r;
        if (i0Var != null) {
            nVar.f12774h.l(i0Var, i6);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.D;
        nVar.f12787v = colorStateList;
        i0 i0Var = nVar.r;
        if (i0Var != null && colorStateList != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.N0 != z10) {
            this.N0 = z10;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        n nVar = this.D;
        if (isEmpty) {
            if (nVar.f12789x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!nVar.f12789x) {
            setHelperTextEnabled(true);
        }
        nVar.c();
        nVar.f12788w = charSequence;
        nVar.f12790y.setText(charSequence);
        int i6 = nVar.f12780n;
        if (i6 != 2) {
            nVar.f12781o = 2;
        }
        nVar.i(i6, nVar.f12781o, nVar.h(nVar.f12790y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.D;
        nVar.A = colorStateList;
        i0 i0Var = nVar.f12790y;
        if (i0Var != null && colorStateList != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        n nVar = this.D;
        if (nVar.f12789x != z10) {
            nVar.c();
            if (z10) {
                i0 i0Var = new i0(nVar.f12773g, null);
                nVar.f12790y = i0Var;
                i0Var.setId(R.id.textinput_helper_text);
                nVar.f12790y.setTextAlignment(5);
                Typeface typeface = nVar.B;
                if (typeface != null) {
                    nVar.f12790y.setTypeface(typeface);
                }
                nVar.f12790y.setVisibility(4);
                i0 i0Var2 = nVar.f12790y;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.g.f(i0Var2, 1);
                int i6 = nVar.f12791z;
                nVar.f12791z = i6;
                i0 i0Var3 = nVar.f12790y;
                if (i0Var3 != null) {
                    k.e(i0Var3, i6);
                }
                ColorStateList colorStateList = nVar.A;
                nVar.A = colorStateList;
                i0 i0Var4 = nVar.f12790y;
                if (i0Var4 != null && colorStateList != null) {
                    i0Var4.setTextColor(colorStateList);
                }
                nVar.a(nVar.f12790y, 1);
                nVar.f12790y.setAccessibilityDelegate(new o(nVar));
            } else {
                nVar.c();
                int i10 = nVar.f12780n;
                if (i10 == 2) {
                    nVar.f12781o = 0;
                }
                nVar.i(i10, nVar.f12781o, nVar.h(nVar.f12790y, ""));
                nVar.g(nVar.f12790y, 1);
                nVar.f12790y = null;
                TextInputLayout textInputLayout = nVar.f12774h;
                textInputLayout.q();
                textInputLayout.w();
            }
            nVar.f12789x = z10;
        }
    }

    public void setHelperTextTextAppearance(int i6) {
        n nVar = this.D;
        nVar.f12791z = i6;
        i0 i0Var = nVar.f12790y;
        if (i0Var != null) {
            k.e(i0Var, i6);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.U) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.O0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.U) {
            this.U = z10;
            if (!z10) {
                this.W = false;
                if (!TextUtils.isEmpty(this.V) && TextUtils.isEmpty(this.f9274x.getHint())) {
                    this.f9274x.setHint(this.V);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f9274x.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.V)) {
                        setHint(hint);
                    }
                    this.f9274x.setHint((CharSequence) null);
                }
                this.W = true;
            }
            if (this.f9274x != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i6) {
        qb.d dVar = this.M0;
        dVar.k(i6);
        this.B0 = dVar.f29438o;
        if (this.f9274x != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            if (this.A0 == null) {
                qb.d dVar = this.M0;
                if (dVar.f29438o != colorStateList) {
                    dVar.f29438o = colorStateList;
                    dVar.i(false);
                }
            }
            this.B0 = colorStateList;
            if (this.f9274x != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.H = fVar;
    }

    public void setMaxEms(int i6) {
        this.A = i6;
        EditText editText = this.f9274x;
        if (editText != null && i6 != -1) {
            editText.setMaxEms(i6);
        }
    }

    public void setMaxWidth(int i6) {
        this.C = i6;
        EditText editText = this.f9274x;
        if (editText != null && i6 != -1) {
            editText.setMaxWidth(i6);
        }
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.f9278z = i6;
        EditText editText = this.f9274x;
        if (editText != null && i6 != -1) {
            editText.setMinEms(i6);
        }
    }

    public void setMinWidth(int i6) {
        this.B = i6;
        EditText editText = this.f9274x;
        if (editText != null && i6 != -1) {
            editText.setMinWidth(i6);
        }
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.A.setContentDescription(i6 != 0 ? aVar.getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.A.setImageDrawable(i6 != 0 ? hc.d.H(aVar.getContext(), i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        if (z10 && aVar.C != 1) {
            aVar.f(1);
        } else if (!z10) {
            aVar.f(0);
        } else {
            aVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.E = colorStateList;
        m.a(aVar.f9287u, aVar.A, colorStateList, aVar.F);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.F = mode;
        m.a(aVar.f9287u, aVar.A, aVar.E, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.N == null) {
            i0 i0Var = new i0(getContext(), null);
            this.N = i0Var;
            i0Var.setId(R.id.textinput_placeholder);
            i0 i0Var2 = this.N;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.s(i0Var2, 2);
            h2.d d10 = d();
            this.Q = d10;
            d10.f17043v = 67L;
            this.R = d();
            setPlaceholderTextAppearance(this.P);
            setPlaceholderTextColor(this.O);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M) {
                setPlaceholderTextEnabled(true);
            }
            this.L = charSequence;
        }
        EditText editText = this.f9274x;
        if (editText != null) {
            editable = editText.getText();
        }
        u(editable);
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.P = i6;
        i0 i0Var = this.N;
        if (i0Var != null) {
            k.e(i0Var, i6);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            i0 i0Var = this.N;
            if (i0Var != null && colorStateList != null) {
                i0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        t tVar = this.f9270v;
        tVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        tVar.f12808w = charSequence2;
        tVar.f12807v.setText(charSequence);
        tVar.d();
    }

    public void setPrefixTextAppearance(int i6) {
        k.e(this.f9270v.f12807v, i6);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f9270v.f12807v.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(yb.i iVar) {
        yb.f fVar = this.f9250a0;
        if (fVar != null && fVar.f38424u.f38431a != iVar) {
            this.f9254g0 = iVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f9270v.f12809x.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f9270v.f12809x;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? hc.d.H(getContext(), i6) : null);
    }

    public void setStartIconMinSize(int i6) {
        t tVar = this.f9270v;
        if (i6 >= 0) {
            if (i6 != tVar.A) {
                tVar.A = i6;
                CheckableImageButton checkableImageButton = tVar.f12809x;
                checkableImageButton.setMinimumWidth(i6);
                checkableImageButton.setMinimumHeight(i6);
                return;
            }
            return;
        }
        tVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f9270v;
        View.OnLongClickListener onLongClickListener = tVar.C;
        CheckableImageButton checkableImageButton = tVar.f12809x;
        checkableImageButton.setOnClickListener(onClickListener);
        m.e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f9270v;
        tVar.C = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.f12809x;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m.e(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.f9270v;
        tVar.B = scaleType;
        tVar.f12809x.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f9270v;
        if (tVar.f12810y != colorStateList) {
            tVar.f12810y = colorStateList;
            m.a(tVar.f12806u, tVar.f12809x, colorStateList, tVar.f12811z);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f9270v;
        if (tVar.f12811z != mode) {
            tVar.f12811z = mode;
            m.a(tVar.f12806u, tVar.f12809x, tVar.f12810y, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f9270v.b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        com.google.android.material.textfield.a aVar = this.f9272w;
        aVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        aVar.J = charSequence2;
        aVar.K.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i6) {
        k.e(this.f9272w.K, i6);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f9272w.K.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f9274x;
        if (editText != null) {
            d0.q(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f9267t0) {
            this.f9267t0 = typeface;
            qb.d dVar = this.M0;
            boolean m10 = dVar.m(typeface);
            boolean o10 = dVar.o(typeface);
            if (m10 || o10) {
                dVar.i(false);
            }
            n nVar = this.D;
            if (typeface != nVar.B) {
                nVar.B = typeface;
                i0 i0Var = nVar.r;
                if (i0Var != null) {
                    i0Var.setTypeface(typeface);
                }
                i0 i0Var2 = nVar.f12790y;
                if (i0Var2 != null) {
                    i0Var2.setTypeface(typeface);
                }
            }
            i0 i0Var3 = this.I;
            if (i0Var3 != null) {
                i0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ColorStateList colorStateList;
        i0 i0Var;
        ColorStateList colorStateList2;
        int i6;
        boolean isEnabled = isEnabled();
        EditText editText = this.f9274x;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f9274x;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        ColorStateList colorStateList3 = this.A0;
        qb.d dVar = this.M0;
        if (colorStateList3 != null) {
            dVar.j(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.A0;
            if (colorStateList4 != null) {
                i6 = colorStateList4.getColorForState(new int[]{-16842910}, this.K0);
            } else {
                i6 = this.K0;
            }
            dVar.j(ColorStateList.valueOf(i6));
        } else if (m()) {
            i0 i0Var2 = this.D.r;
            if (i0Var2 != null) {
                colorStateList2 = i0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            dVar.j(colorStateList2);
        } else if (this.G && (i0Var = this.I) != null) {
            dVar.j(i0Var.getTextColors());
        } else if (z13 && (colorStateList = this.B0) != null && dVar.f29438o != colorStateList) {
            dVar.f29438o = colorStateList;
            dVar.i(false);
        }
        com.google.android.material.textfield.a aVar = this.f9272w;
        t tVar = this.f9270v;
        if (!z12 && this.N0 && (!isEnabled() || !z13)) {
            if (z11 || !this.L0) {
                ValueAnimator valueAnimator = this.P0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.P0.cancel();
                }
                if (z10 && this.O0) {
                    a(0.0f);
                } else {
                    dVar.p(0.0f);
                }
                if (e() && (!((dc.g) this.f9250a0).R.isEmpty()) && e()) {
                    ((dc.g) this.f9250a0).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.L0 = true;
                i0 i0Var3 = this.N;
                if (i0Var3 != null && this.M) {
                    i0Var3.setText((CharSequence) null);
                    h2.o.a(this.f9268u, this.R);
                    this.N.setVisibility(4);
                }
                tVar.D = true;
                tVar.d();
                aVar.L = true;
                aVar.m();
            }
        } else if (z11 || this.L0) {
            ValueAnimator valueAnimator2 = this.P0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.P0.cancel();
            }
            if (z10 && this.O0) {
                a(1.0f);
            } else {
                dVar.p(1.0f);
            }
            this.L0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f9274x;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            u(editable);
            tVar.D = false;
            tVar.d();
            aVar.L = false;
            aVar.m();
        }
    }

    public final void u(Editable editable) {
        int i6;
        ((p) this.H).getClass();
        if (editable != null) {
            i6 = editable.length();
        } else {
            i6 = 0;
        }
        FrameLayout frameLayout = this.f9268u;
        if (i6 == 0 && !this.L0) {
            if (this.N != null && this.M && !TextUtils.isEmpty(this.L)) {
                this.N.setText(this.L);
                h2.o.a(frameLayout, this.Q);
                this.N.setVisibility(0);
                this.N.bringToFront();
                announceForAccessibility(this.L);
                return;
            }
            return;
        }
        i0 i0Var = this.N;
        if (i0Var != null && this.M) {
            i0Var.setText((CharSequence) null);
            h2.o.a(frameLayout, this.R);
            this.N.setVisibility(4);
        }
    }

    public final void v(boolean z10, boolean z11) {
        int defaultColor = this.F0.getDefaultColor();
        int colorForState = this.F0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.F0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f9262o0 = colorForState2;
        } else if (z11) {
            this.f9262o0 = colorForState;
        } else {
            this.f9262o0 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        boolean z10;
        boolean z11;
        i0 i0Var;
        ColorStateList colorStateList;
        EditText editText;
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        EditText editText2;
        EditText editText3;
        if (this.f9250a0 != null && this.f9257j0 != 0) {
            boolean z12 = false;
            if (!isFocused() && ((editText3 = this.f9274x) == null || !editText3.hasFocus())) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!isHovered() && ((editText2 = this.f9274x) == null || !editText2.isHovered())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (m() || (this.I != null && this.G)) {
                z12 = true;
            }
            if (!isEnabled()) {
                this.f9262o0 = this.K0;
            } else if (m()) {
                if (this.F0 != null) {
                    v(z10, z11);
                } else {
                    this.f9262o0 = getErrorCurrentTextColors();
                }
            } else if (this.G && (i0Var = this.I) != null) {
                if (this.F0 != null) {
                    v(z10, z11);
                } else {
                    this.f9262o0 = i0Var.getCurrentTextColor();
                }
            } else if (z10) {
                this.f9262o0 = this.E0;
            } else if (z11) {
                this.f9262o0 = this.D0;
            } else {
                this.f9262o0 = this.C0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Context context = getContext();
                TypedValue a10 = ub.b.a(R.attr.colorControlActivated, context);
                if (a10 != null) {
                    int i6 = a10.resourceId;
                    if (i6 != 0) {
                        colorStateList = g0.a.c(i6, context);
                    } else {
                        int i10 = a10.data;
                        if (i10 != 0) {
                            colorStateList = ColorStateList.valueOf(i10);
                        }
                    }
                    editText = this.f9274x;
                    if (editText != null) {
                        textCursorDrawable = editText.getTextCursorDrawable();
                        if (textCursorDrawable != null && colorStateList != null) {
                            textCursorDrawable2 = this.f9274x.getTextCursorDrawable();
                            if (z12) {
                                ColorStateList colorStateList2 = this.F0;
                                if (colorStateList2 == null) {
                                    colorStateList2 = ColorStateList.valueOf(this.f9262o0);
                                }
                                colorStateList = colorStateList2;
                            }
                            a.b.h(textCursorDrawable2, colorStateList);
                        }
                    }
                }
                colorStateList = null;
                editText = this.f9274x;
                if (editText != null) {
                }
            }
            com.google.android.material.textfield.a aVar = this.f9272w;
            aVar.k();
            CheckableImageButton checkableImageButton = aVar.f9289w;
            ColorStateList colorStateList3 = aVar.f9290x;
            TextInputLayout textInputLayout = aVar.f9287u;
            m.c(textInputLayout, checkableImageButton, colorStateList3);
            ColorStateList colorStateList4 = aVar.E;
            CheckableImageButton checkableImageButton2 = aVar.A;
            m.c(textInputLayout, checkableImageButton2, colorStateList4);
            if (aVar.b() instanceof dc.k) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = k0.a.g(checkableImageButton2.getDrawable()).mutate();
                    a.b.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    m.a(textInputLayout, checkableImageButton2, aVar.E, aVar.F);
                }
            }
            t tVar = this.f9270v;
            m.c(tVar.f12806u, tVar.f12809x, tVar.f12810y);
            if (this.f9257j0 == 2) {
                int i11 = this.f9259l0;
                if (z10 && isEnabled()) {
                    this.f9259l0 = this.f9261n0;
                } else {
                    this.f9259l0 = this.f9260m0;
                }
                if (this.f9259l0 != i11 && e() && !this.L0) {
                    if (e()) {
                        ((dc.g) this.f9250a0).o(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f9257j0 == 1) {
                if (!isEnabled()) {
                    this.f9263p0 = this.H0;
                } else if (z11 && !z10) {
                    this.f9263p0 = this.J0;
                } else if (z10) {
                    this.f9263p0 = this.I0;
                } else {
                    this.f9263p0 = this.G0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f9270v.a(drawable);
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f9272w.A.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f9272w.A.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f9272w.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f9272w.A;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.f9272w;
        CheckableImageButton checkableImageButton = aVar.A;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.E;
            PorterDuff.Mode mode = aVar.F;
            TextInputLayout textInputLayout = aVar.f9287u;
            m.a(textInputLayout, checkableImageButton, colorStateList, mode);
            m.c(textInputLayout, checkableImageButton, aVar.E);
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.t(!textInputLayout.R0, false);
            if (textInputLayout.E) {
                textInputLayout.n(editable);
            }
            if (textInputLayout.M) {
                textInputLayout.u(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
