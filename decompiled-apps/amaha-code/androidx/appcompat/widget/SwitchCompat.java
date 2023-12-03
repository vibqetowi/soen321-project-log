package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k0.a;
import t0.d0;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: o0  reason: collision with root package name */
    public static final a f1278o0 = new a();

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f1279p0 = {16842912};
    public ColorStateList A;
    public PorterDuff.Mode B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public CharSequence I;
    public CharSequence J;
    public CharSequence K;
    public CharSequence L;
    public boolean M;
    public int N;
    public final int O;
    public float P;
    public float Q;
    public final VelocityTracker R;
    public final int S;
    public float T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f1280a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1281b0;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1282d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public final TextPaint f1283f0;

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f1284g0;

    /* renamed from: h0  reason: collision with root package name */
    public StaticLayout f1285h0;

    /* renamed from: i0  reason: collision with root package name */
    public StaticLayout f1286i0;

    /* renamed from: j0  reason: collision with root package name */
    public j.a f1287j0;

    /* renamed from: k0  reason: collision with root package name */
    public ObjectAnimator f1288k0;

    /* renamed from: l0  reason: collision with root package name */
    public m f1289l0;

    /* renamed from: m0  reason: collision with root package name */
    public c f1290m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Rect f1291n0;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f1292u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f1293v;

    /* renamed from: w  reason: collision with root package name */
    public PorterDuff.Mode f1294w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1295x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1296y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f1297z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.T);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference f1298a;

        public c(SwitchCompat switchCompat) {
            this.f1298a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.e
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1298a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1298a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i6;
        int resourceId;
        this.f1293v = null;
        this.f1294w = null;
        this.f1295x = false;
        this.f1296y = false;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        this.R = VelocityTracker.obtain();
        this.e0 = true;
        this.f1291n0 = new Rect();
        g1.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f1283f0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = kc.f.V;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        l1 l1Var = new l1(context, obtainStyledAttributes);
        t0.d0.p(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle);
        Drawable e10 = l1Var.e(2);
        this.f1292u = e10;
        if (e10 != null) {
            e10.setCallback(this);
        }
        Drawable e11 = l1Var.e(11);
        this.f1297z = e11;
        if (e11 != null) {
            e11.setCallback(this);
        }
        setTextOnInternal(l1Var.k(0));
        setTextOffInternal(l1Var.k(1));
        this.M = l1Var.a(3, true);
        this.E = l1Var.d(8, 0);
        this.F = l1Var.d(5, 0);
        this.G = l1Var.d(6, 0);
        this.H = l1Var.a(4, false);
        ColorStateList b10 = l1Var.b(9);
        if (b10 != null) {
            this.f1293v = b10;
            this.f1295x = true;
        }
        PorterDuff.Mode c10 = q0.c(l1Var.h(10, -1), null);
        if (this.f1294w != c10) {
            this.f1294w = c10;
            this.f1296y = true;
        }
        if (this.f1295x || this.f1296y) {
            a();
        }
        ColorStateList b11 = l1Var.b(12);
        if (b11 != null) {
            this.A = b11;
            this.C = true;
        }
        PorterDuff.Mode c11 = q0.c(l1Var.h(13, -1), null);
        if (this.B != c11) {
            this.B = c11;
            this.D = true;
        }
        if (this.C || this.D) {
            b();
        }
        int i10 = l1Var.i(7, 0);
        if (i10 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, kc.f.W);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = g0.a.c(resourceId, context)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1284g0 = colorStateList;
            } else {
                this.f1284g0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i11 = obtainStyledAttributes2.getInt(1, -1);
            int i12 = obtainStyledAttributes2.getInt(2, -1);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i12 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i12);
                } else {
                    create = Typeface.create(typeface, i12);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i6 = create.getStyle();
                } else {
                    i6 = 0;
                }
                int i13 = (~i6) & i12;
                textPaint.setFakeBoldText((i13 & 1) != 0);
                textPaint.setTextSkewX((i13 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.f1287j0 = new j.a(getContext());
            } else {
                this.f1287j0 = null;
            }
            setTextOnInternal(this.I);
            setTextOffInternal(this.K);
            obtainStyledAttributes2.recycle();
        }
        new c0(this).f(attributeSet, R.attr.switchStyle);
        l1Var.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.O = viewConfiguration.getScaledTouchSlop();
        this.S = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private m getEmojiTextViewHelper() {
        if (this.f1289l0 == null) {
            this.f1289l0 = new m(this);
        }
        return this.f1289l0;
    }

    private boolean getTargetCheckedState() {
        if (this.T > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (u1.a(this)) {
            f = 1.0f - this.T;
        } else {
            f = this.T;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1297z;
        if (drawable != null) {
            Rect rect2 = this.f1291n0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f1292u;
            if (drawable2 != null) {
                rect = q0.b(drawable2);
            } else {
                rect = q0.f1512c;
            }
            return ((((this.U - this.W) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.K = charSequence;
        m emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1477b.f13713a.e(this.f1287j0);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.L = charSequence;
        this.f1286i0 = null;
        if (this.M) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.I = charSequence;
        m emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1477b.f13713a.e(this.f1287j0);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.J = charSequence;
        this.f1285h0 = null;
        if (this.M) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f1292u;
        if (drawable != null) {
            if (this.f1295x || this.f1296y) {
                Drawable mutate = k0.a.g(drawable).mutate();
                this.f1292u = mutate;
                if (this.f1295x) {
                    a.b.h(mutate, this.f1293v);
                }
                if (this.f1296y) {
                    a.b.i(this.f1292u, this.f1294w);
                }
                if (this.f1292u.isStateful()) {
                    this.f1292u.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1297z;
        if (drawable != null) {
            if (this.C || this.D) {
                Drawable mutate = k0.a.g(drawable).mutate();
                this.f1297z = mutate;
                if (this.C) {
                    a.b.h(mutate, this.A);
                }
                if (this.D) {
                    a.b.i(this.f1297z, this.B);
                }
                if (this.f1297z.isStateful()) {
                    this.f1297z.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int i6;
        TextPaint textPaint = this.f1283f0;
        if (charSequence != null) {
            i6 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i6 = 0;
        }
        return new StaticLayout(charSequence, textPaint, i6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.I);
        setTextOffInternal(this.K);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i6;
        int i10;
        int i11 = this.f1280a0;
        int i12 = this.f1281b0;
        int i13 = this.c0;
        int i14 = this.f1282d0;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f1292u;
        if (drawable != null) {
            rect = q0.b(drawable);
        } else {
            rect = q0.f1512c;
        }
        Drawable drawable2 = this.f1297z;
        Rect rect2 = this.f1291n0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i15 = rect2.left;
            thumbOffset += i15;
            if (rect != null) {
                int i16 = rect.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if (i17 > i18) {
                    i6 = (i17 - i18) + i12;
                } else {
                    i6 = i12;
                }
                int i19 = rect.right;
                int i20 = rect2.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rect.bottom;
                int i22 = rect2.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f1297z.setBounds(i11, i6, i13, i10);
                }
            } else {
                i6 = i12;
            }
            i10 = i14;
            this.f1297z.setBounds(i11, i6, i13, i10);
        }
        Drawable drawable3 = this.f1292u;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i23 = thumbOffset - rect2.left;
            int i24 = thumbOffset + this.W + rect2.right;
            this.f1292u.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                a.b.f(background, i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1292u;
        if (drawable != null) {
            a.b.e(drawable, f, f2);
        }
        Drawable drawable2 = this.f1297z;
        if (drawable2 != null) {
            a.b.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1292u;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1297z;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (this.f1290m0 == null && this.f1289l0.f1477b.f13713a.b()) {
            if (androidx.emoji2.text.f.f2034j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                int b10 = a10.b();
                if (b10 == 3 || b10 == 0) {
                    c cVar = new c(this);
                    this.f1290m0 = cVar;
                    a10.g(cVar);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!u1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.U;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.G;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (u1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.U;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.G;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.M;
    }

    public boolean getSplitTrack() {
        return this.H;
    }

    public int getSwitchMinWidth() {
        return this.F;
    }

    public int getSwitchPadding() {
        return this.G;
    }

    public CharSequence getTextOff() {
        return this.K;
    }

    public CharSequence getTextOn() {
        return this.I;
    }

    public Drawable getThumbDrawable() {
        return this.f1292u;
    }

    public final float getThumbPosition() {
        return this.T;
    }

    public int getThumbTextPadding() {
        return this.E;
    }

    public ColorStateList getThumbTintList() {
        return this.f1293v;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1294w;
    }

    public Drawable getTrackDrawable() {
        return this.f1297z;
    }

    public ColorStateList getTrackTintList() {
        return this.A;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.B;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1292u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1297z;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1288k0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1288k0.end();
            this.f1288k0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1279p0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1297z;
        Rect rect = this.f1291n0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i6 = this.f1281b0;
        int i10 = this.f1282d0;
        int i11 = i6 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f1292u;
        if (drawable != null) {
            if (this.H && drawable2 != null) {
                Rect b10 = q0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b10.left;
                rect.right -= b10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f1285h0;
        } else {
            staticLayout = this.f1286i0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1284g0;
            TextPaint textPaint = this.f1283f0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.I;
            } else {
                charSequence = this.K;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z10, i6, i10, i11, i12);
        int i17 = 0;
        if (this.f1292u != null) {
            Drawable drawable = this.f1297z;
            Rect rect = this.f1291n0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b10 = q0.b(this.f1292u);
            i13 = Math.max(0, b10.left - rect.left);
            i17 = Math.max(0, b10.right - rect.right);
        } else {
            i13 = 0;
        }
        if (u1.a(this)) {
            i14 = getPaddingLeft() + i13;
            width = ((this.U + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.U) + i13 + i17;
        }
        int gravity = getGravity() & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (gravity != 16) {
            if (gravity != 80) {
                i16 = getPaddingTop();
                i15 = this.V + i16;
            } else {
                i15 = getHeight() - getPaddingBottom();
                i16 = i15 - this.V;
            }
        } else {
            int paddingTop = getPaddingTop();
            int i18 = this.V;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i18 / 2);
            i15 = i18 + height;
            i16 = height;
        }
        this.f1280a0 = i14;
        this.f1281b0 = i16;
        this.f1282d0 = i15;
        this.c0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.M) {
            if (this.f1285h0 == null) {
                this.f1285h0 = c(this.J);
            }
            if (this.f1286i0 == null) {
                this.f1286i0 = c(this.L);
            }
        }
        Drawable drawable = this.f1292u;
        int i15 = 0;
        Rect rect = this.f1291n0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.f1292u.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f1292u.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (this.M) {
            i13 = (this.E * 2) + Math.max(this.f1285h0.getWidth(), this.f1286i0.getWidth());
        } else {
            i13 = 0;
        }
        this.W = Math.max(i13, i11);
        Drawable drawable2 = this.f1297z;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f1297z.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f1292u;
        if (drawable3 != null) {
            Rect b10 = q0.b(drawable3);
            i16 = Math.max(i16, b10.left);
            i17 = Math.max(i17, b10.right);
        }
        if (this.e0) {
            i14 = Math.max(this.F, (this.W * 2) + i16 + i17);
        } else {
            i14 = this.F;
        }
        int max = Math.max(i15, i12);
        this.U = i14;
        this.V = max;
        super.onMeasure(i6, i10);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.I;
        } else {
            charSequence = this.K;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        float f;
        VelocityTracker velocityTracker = this.R;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.O;
        boolean z12 = false;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.N;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            float x10 = motionEvent.getX();
                            int thumbScrollRange = getThumbScrollRange();
                            float f10 = x10 - this.P;
                            if (thumbScrollRange != 0) {
                                f = f10 / thumbScrollRange;
                            } else if (f10 > 0.0f) {
                                f = 1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (u1.a(this)) {
                                f = -f;
                            }
                            float f11 = this.T;
                            float f12 = f + f11;
                            if (f12 >= 0.0f) {
                                if (f12 > 1.0f) {
                                    f2 = 1.0f;
                                } else {
                                    f2 = f12;
                                }
                            }
                            if (f2 != f11) {
                                this.P = x10;
                                setThumbPosition(f2);
                            }
                            return true;
                        }
                    } else {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (Math.abs(x11 - this.P) > i6 || Math.abs(y10 - this.Q) > i6) {
                            this.N = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.P = x11;
                            this.Q = y10;
                            return true;
                        }
                    }
                }
            }
            if (this.N == 2) {
                this.N = 0;
                if (motionEvent.getAction() == 1 && isEnabled()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isChecked = isChecked();
                if (z10) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.S) {
                        if (!u1.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = getTargetCheckedState();
                    }
                } else {
                    z11 = isChecked;
                }
                if (z11 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z11);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.N = 0;
            velocityTracker.clear();
        } else {
            float x12 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled()) {
                if (this.f1292u != null) {
                    int thumbOffset = getThumbOffset();
                    Drawable drawable = this.f1292u;
                    Rect rect = this.f1291n0;
                    drawable.getPadding(rect);
                    int i11 = this.f1281b0 - i6;
                    int i12 = (this.f1280a0 + thumbOffset) - i6;
                    int i13 = this.W + i12 + rect.left + rect.right + i6;
                    int i14 = this.f1282d0 + i6;
                    if (x12 > i12 && x12 < i13 && y11 > i11 && y11 < i14) {
                        z12 = true;
                    }
                }
                if (z12) {
                    this.N = 1;
                    this.P = x12;
                    this.Q = y11;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.I;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                new t0.b0().e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.K;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, t0.o0> weakHashMap2 = t0.d0.f32288a;
            new t0.b0().e(this, obj2);
        }
        float f = 0.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, t0.o0> weakHashMap3 = t0.d0.f32288a;
            if (d0.g.c(this)) {
                if (isChecked) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1278o0, f);
                this.f1288k0 = ofFloat;
                ofFloat.setDuration(250L);
                b.a(this.f1288k0, true);
                this.f1288k0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1288k0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.I);
        setTextOffInternal(this.K);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.e0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            requestLayout();
            if (z10) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.H = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i6) {
        this.F = i6;
        requestLayout();
    }

    public void setSwitchPadding(int i6) {
        this.G = i6;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1283f0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.K;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            new t0.b0().e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.I;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            new t0.b0().e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1292u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1292u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.T = f;
        invalidate();
    }

    public void setThumbResource(int i6) {
        setThumbDrawable(hc.d.H(getContext(), i6));
    }

    public void setThumbTextPadding(int i6) {
        this.E = i6;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1293v = colorStateList;
        this.f1295x = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1294w = mode;
        this.f1296y = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1297z;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1297z = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i6) {
        setTrackDrawable(hc.d.H(getContext(), i6));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1292u && drawable != this.f1297z) {
            return false;
        }
        return true;
    }
}
