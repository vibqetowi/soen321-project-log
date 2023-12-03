package com.google.android.material.chip;

import ab.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.chip.a;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.c;
import qb.h;
import qb.q;
import qb.t;
import qb.w;
import r0.g;
import t0.d0;
import t0.o0;
import u0.h;
import ub.d;
import ub.e;
import ug.l;
import yb.i;
import yb.m;
/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0146a, m, h<Chip> {
    public static final Rect R = new Rect();
    public static final int[] S = {16842913};
    public static final int[] T = {16842911};
    public RippleDrawable A;
    public View.OnClickListener B;
    public CompoundButton.OnCheckedChangeListener C;
    public h.a<Chip> D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public CharSequence L;
    public final b M;
    public boolean N;
    public final Rect O;
    public final RectF P;
    public final a Q;

    /* renamed from: y  reason: collision with root package name */
    public com.google.android.material.chip.a f8886y;

    /* renamed from: z  reason: collision with root package name */
    public InsetDrawable f8887z;

    /* loaded from: classes.dex */
    public class b extends a1.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // a1.a
        public final void l(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Rect rect = Chip.R;
            Chip chip = Chip.this;
            if (chip.d()) {
                com.google.android.material.chip.a aVar = chip.f8886y;
                if (aVar != null && aVar.e0) {
                    z10 = true;
                }
                if (z10 && chip.B != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // a1.a
        public final void o(int i6, u0.h hVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            String str = "";
            if (i6 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    hVar.i(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    hVar.i(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                hVar.b(h.a.f33735g);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            hVar.i("");
            accessibilityNodeInfo.setBoundsInParent(Chip.R);
        }
    }

    public Chip() {
        throw null;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.chipStyle, 2132083821), attributeSet, R.attr.chipStyle);
        int resourceId;
        this.O = new Rect();
        this.P = new RectF();
        this.Q = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        com.google.android.material.chip.a aVar = new com.google.android.material.chip.a(context2, attributeSet);
        Context context3 = aVar.f8918y0;
        int[] iArr = l.f34124g;
        TypedArray d10 = t.d(context3, attributeSet, iArr, R.attr.chipStyle, 2132083821, new int[0]);
        aVar.Z0 = d10.hasValue(37);
        Context context4 = aVar.f8918y0;
        ColorStateList a10 = d.a(context4, d10, 24);
        if (aVar.R != a10) {
            aVar.R = a10;
            aVar.onStateChange(aVar.getState());
        }
        ColorStateList a11 = d.a(context4, d10, 11);
        if (aVar.S != a11) {
            aVar.S = a11;
            aVar.onStateChange(aVar.getState());
        }
        float dimension = d10.getDimension(19, 0.0f);
        if (aVar.T != dimension) {
            aVar.T = dimension;
            aVar.invalidateSelf();
            aVar.v();
        }
        if (d10.hasValue(12)) {
            aVar.B(d10.getDimension(12, 0.0f));
        }
        aVar.G(d.a(context4, d10, 22));
        aVar.H(d10.getDimension(23, 0.0f));
        aVar.Q(d.a(context4, d10, 36));
        String text = d10.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(aVar.Y, text);
        q qVar = aVar.E0;
        if (!equals) {
            aVar.Y = text;
            qVar.f29505d = true;
            aVar.invalidateSelf();
            aVar.v();
        }
        e eVar = (!d10.hasValue(0) || (resourceId = d10.getResourceId(0, 0)) == 0) ? null : new e(context4, resourceId);
        eVar.f33988k = d10.getDimension(1, eVar.f33988k);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 23) {
            eVar.f33987j = d.a(context4, d10, 2);
        }
        qVar.b(eVar, context4);
        int i10 = d10.getInt(3, 0);
        if (i10 == 1) {
            aVar.W0 = TextUtils.TruncateAt.START;
        } else if (i10 == 2) {
            aVar.W0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i10 == 3) {
            aVar.W0 = TextUtils.TruncateAt.END;
        }
        aVar.F(d10.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            aVar.F(d10.getBoolean(15, false));
        }
        aVar.C(d.c(context4, d10, 14));
        if (d10.hasValue(17)) {
            aVar.E(d.a(context4, d10, 17));
        }
        aVar.D(d10.getDimension(16, -1.0f));
        aVar.N(d10.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            aVar.N(d10.getBoolean(26, false));
        }
        aVar.I(d.c(context4, d10, 25));
        aVar.M(d.a(context4, d10, 30));
        aVar.K(d10.getDimension(28, 0.0f));
        aVar.x(d10.getBoolean(6, false));
        aVar.A(d10.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            aVar.A(d10.getBoolean(8, false));
        }
        aVar.y(d.c(context4, d10, 7));
        if (d10.hasValue(9)) {
            aVar.z(d.a(context4, d10, 9));
        }
        aVar.f8908o0 = g.a(context4, d10, 39);
        aVar.f8909p0 = g.a(context4, d10, 33);
        float dimension2 = d10.getDimension(21, 0.0f);
        if (aVar.f8910q0 != dimension2) {
            aVar.f8910q0 = dimension2;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.P(d10.getDimension(35, 0.0f));
        aVar.O(d10.getDimension(34, 0.0f));
        float dimension3 = d10.getDimension(41, 0.0f);
        if (aVar.f8913t0 != dimension3) {
            aVar.f8913t0 = dimension3;
            aVar.invalidateSelf();
            aVar.v();
        }
        float dimension4 = d10.getDimension(40, 0.0f);
        if (aVar.f8914u0 != dimension4) {
            aVar.f8914u0 = dimension4;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.L(d10.getDimension(29, 0.0f));
        aVar.J(d10.getDimension(27, 0.0f));
        float dimension5 = d10.getDimension(13, 0.0f);
        if (aVar.f8917x0 != dimension5) {
            aVar.f8917x0 = dimension5;
            aVar.invalidateSelf();
            aVar.v();
        }
        aVar.Y0 = d10.getDimensionPixelSize(4, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        d10.recycle();
        TypedArray d11 = t.d(context2, attributeSet, iArr, R.attr.chipStyle, 2132083821, new int[0]);
        this.I = d11.getBoolean(32, false);
        this.K = (int) Math.ceil(d11.getDimension(20, (float) Math.ceil(w.b(48, getContext()))));
        d11.recycle();
        setChipDrawable(aVar);
        aVar.j(d0.i.i(this));
        TypedArray d12 = t.d(context2, attributeSet, iArr, R.attr.chipStyle, 2132083821, new int[0]);
        if (i6 < 23) {
            setTextColor(d.a(context2, d12, 2));
        }
        boolean hasValue = d12.hasValue(37);
        d12.recycle();
        this.M = new b(this);
        e();
        if (!hasValue) {
            setOutlineProvider(new ib.b(this));
        }
        setChecked(this.E);
        setText(aVar.Y);
        setEllipsize(aVar.W0);
        h();
        if (!this.f8886y.X0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.I) {
            setMinHeight(this.K);
        }
        this.J = d0.e.d(this);
        super.setOnCheckedChangeListener(new ib.a(0, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.P;
        rectF.setEmpty();
        if (d() && this.B != null) {
            com.google.android.material.chip.a aVar = this.f8886y;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.T()) {
                float f = aVar.f8917x0 + aVar.f8916w0 + aVar.f8902i0 + aVar.f8915v0 + aVar.f8914u0;
                if (k0.a.b(aVar) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f10 = bounds.left;
                    rectF.left = f10;
                    rectF.right = f10 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.O;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private e getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.E0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0146a
    public final void a() {
        c(this.K);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i6) {
        int i10;
        int i11;
        this.K = i6;
        if (!this.I) {
            InsetDrawable insetDrawable = this.f8887z;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f8887z = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = vb.b.f34969a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = vb.b.f34969a;
            f();
            return;
        }
        int max = Math.max(0, i6 - ((int) this.f8886y.T));
        int max2 = Math.max(0, i6 - this.f8886y.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f8887z;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f8887z = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = vb.b.f34969a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = vb.b.f34969a;
            f();
            return;
        }
        if (max2 > 0) {
            i10 = max2 / 2;
        } else {
            i10 = 0;
        }
        if (max > 0) {
            i11 = max / 2;
        } else {
            i11 = 0;
        }
        if (this.f8887z != null) {
            Rect rect = new Rect();
            this.f8887z.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = vb.b.f34969a;
                f();
                return;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        this.f8887z = new InsetDrawable((Drawable) this.f8886y, i10, i11, i10, i11);
        int[] iArr6 = vb.b.f34969a;
        f();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            Drawable drawable = aVar.f8899f0;
            if (drawable != null) {
                if (drawable instanceof c) {
                    drawable = ((c) drawable).b();
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        int i6;
        int i10;
        if (!this.N) {
            return super.dispatchHoverEvent(motionEvent);
        }
        b bVar = this.M;
        AccessibilityManager accessibilityManager = bVar.f134h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i10 = bVar.f139m) != Integer.MIN_VALUE) {
                    if (i10 != Integer.MIN_VALUE) {
                        bVar.f139m = LinearLayoutManager.INVALID_OFFSET;
                        bVar.q(LinearLayoutManager.INVALID_OFFSET, 128);
                        bVar.q(i10, 256);
                    }
                    z10 = true;
                }
            } else {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Chip chip = Chip.this;
                if (chip.d() && chip.getCloseIconTouchBounds().contains(x10, y10)) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                int i11 = bVar.f139m;
                if (i11 != i6) {
                    bVar.f139m = i6;
                    bVar.q(i6, 128);
                    bVar.q(i11, 256);
                }
            }
            if (z10 && !super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        }
        z10 = false;
        return z10 ? true : true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.N) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.M;
        bVar.getClass();
        boolean z10 = false;
        int i6 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i10 = 130;
                                        }
                                    } else {
                                        i10 = 17;
                                    }
                                } else {
                                    i10 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i6 < repeatCount && bVar.m(i10, null)) {
                                    i6++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = bVar.f138l;
                    if (i11 != Integer.MIN_VALUE) {
                        Chip chip = Chip.this;
                        if (i11 == 0) {
                            chip.performClick();
                        } else if (i11 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.B;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.N) {
                                chip.M.q(1, 1);
                            }
                        }
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = bVar.m(1, null);
            }
        }
        if (z10 && bVar.f138l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i6;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f8886y;
        boolean z10 = false;
        if (aVar != null && com.google.android.material.chip.a.u(aVar.f8899f0)) {
            com.google.android.material.chip.a aVar2 = this.f8886y;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.H) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.G) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.F) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (this.H) {
                iArr[i6] = 16842908;
                i6++;
            }
            if (this.G) {
                iArr[i6] = 16843623;
                i6++;
            }
            if (this.F) {
                iArr[i6] = 16842919;
                i6++;
            }
            if (isChecked()) {
                iArr[i6] = 16842913;
            }
            if (!Arrays.equals(aVar2.S0, iArr)) {
                aVar2.S0 = iArr;
                if (aVar2.T()) {
                    z10 = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (d()) {
            com.google.android.material.chip.a aVar = this.f8886y;
            if (aVar != null && aVar.e0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.B != null) {
                d0.q(this, this.M);
                this.N = true;
                return;
            }
        }
        d0.q(this, null);
        this.N = false;
    }

    public final void f() {
        this.A = new RippleDrawable(vb.b.c(this.f8886y.X), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar.T0) {
            aVar.T0 = false;
            aVar.U0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.A;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f8886y) != null) {
            int r = (int) (aVar.r() + aVar.f8917x0 + aVar.f8914u0);
            com.google.android.material.chip.a aVar2 = this.f8886y;
            int q10 = (int) (aVar2.q() + aVar2.f8910q0 + aVar2.f8913t0);
            if (this.f8887z != null) {
                Rect rect = new Rect();
                this.f8887z.getPadding(rect);
                q10 += rect.left;
                r += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.e.k(this, q10, paddingTop, r, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.L)) {
            return this.L;
        }
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8904k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).B.f29410d) {
                return "android.widget.Button";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f8887z;
        if (insetDrawable == null) {
            return this.f8886y;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8906m0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8907n0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.S;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, aVar.s());
    }

    public Drawable getChipDrawable() {
        return this.f8886y;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8917x0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar == null || (drawable = aVar.f8896a0) == null) {
            return null;
        }
        if (drawable instanceof c) {
            drawable = ((c) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.c0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8897b0;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.T;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8910q0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.W;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar == null || (drawable = aVar.f8899f0) == null) {
            return null;
        }
        if (drawable instanceof c) {
            drawable = ((c) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8903j0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8916w0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8902i0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8915v0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8901h0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.W0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.N) {
            b bVar = this.M;
            if (bVar.f138l == 1 || bVar.f137k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8909p0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8912s0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8911r0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f8886y.f38424u.f38431a;
    }

    public g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8908o0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8914u0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            return aVar.f8913t0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.Q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.R0(this, this.f8886y);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8904k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        super.onFocusChanged(z10, i6, rect);
        if (this.N) {
            b bVar = this.M;
            int i10 = bVar.f138l;
            if (i10 != Integer.MIN_VALUE) {
                bVar.j(i10);
            }
            if (z10) {
                bVar.m(i6, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i6;
        int intValue;
        boolean z11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8904k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f29458w) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i10 < chipGroup.getChildCount()) {
                        View childAt = chipGroup.getChildAt(i10);
                        if (childAt instanceof Chip) {
                            if (chipGroup.getChildAt(i10).getVisibility() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                continue;
                            } else if (((Chip) childAt) == this) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        i10++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                i6 = i11;
            } else {
                i6 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (!(tag instanceof Integer)) {
                intValue = -1;
            } else {
                intValue = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) h.c.a(intValue, 1, i6, 1, false, isChecked()).f33748a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.J != i6) {
            this.J = i6;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.F) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z10 = true;
                    }
                }
                z10 = false;
            } else if (this.F) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.B;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.N) {
                    this.M.q(1, 1);
                }
                z10 = true;
                setCloseIconPressed(false);
            }
            z10 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z10 = true;
            }
            z10 = false;
        }
        if (z10 || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.L = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.A) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.A) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i6) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.x(z10);
        }
    }

    public void setCheckableResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.x(aVar.f8918y0.getResources().getBoolean(i6));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar == null) {
            this.E = z10;
        } else if (aVar.f8904k0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.y(hc.d.H(aVar.f8918y0, i6));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.z(g0.a.c(i6, aVar.f8918y0));
        }
    }

    public void setCheckedIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.A(aVar.f8918y0.getResources().getBoolean(i6));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.S != colorStateList) {
            aVar.S = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i6) {
        ColorStateList c10;
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.S != (c10 = g0.a.c(i6, aVar.f8918y0))) {
            aVar.S = c10;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.B(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.B(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f8886y;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.V0 = new WeakReference<>(null);
            }
            this.f8886y = aVar;
            aVar.X0 = false;
            aVar.V0 = new WeakReference<>(this);
            c(this.K);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8917x0 != f) {
            aVar.f8917x0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            float dimension = aVar.f8918y0.getResources().getDimension(i6);
            if (aVar.f8917x0 != dimension) {
                aVar.f8917x0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.C(hc.d.H(aVar.f8918y0, i6));
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.D(f);
        }
    }

    public void setChipIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.D(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.E(g0.a.c(i6, aVar.f8918y0));
        }
    }

    public void setChipIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.F(aVar.f8918y0.getResources().getBoolean(i6));
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.T != f) {
            aVar.T = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipMinHeightResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            float dimension = aVar.f8918y0.getResources().getDimension(i6);
            if (aVar.T != dimension) {
                aVar.T = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8910q0 != f) {
            aVar.f8910q0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            float dimension = aVar.f8918y0.getResources().getDimension(i6);
            if (aVar.f8910q0 != dimension) {
                aVar.f8910q0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.G(g0.a.c(i6, aVar.f8918y0));
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.H(f);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.H(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        r0.a aVar;
        com.google.android.material.chip.a aVar2 = this.f8886y;
        if (aVar2 != null && aVar2.f8903j0 != charSequence) {
            String str = r0.a.f30161d;
            Locale locale = Locale.getDefault();
            int i6 = r0.g.f30184a;
            boolean z10 = true;
            if (g.a.a(locale) != 1) {
                z10 = false;
            }
            if (z10) {
                aVar = r0.a.f30163g;
            } else {
                aVar = r0.a.f;
            }
            aVar2.f8903j0 = aVar.c(charSequence, aVar.f30166c);
            aVar2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.J(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.J(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.I(hc.d.H(aVar.f8918y0, i6));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.K(f);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.K(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.L(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.L(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.M(g0.a.c(i6, aVar.f8918y0));
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i10, int i11, int i12) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i6, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.j(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f8886y == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f8886y;
            if (aVar != null) {
                aVar.W0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.I = z10;
        c(this.K);
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i6);
        }
    }

    public void setHideMotionSpec(ab.g gVar) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.f8909p0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.f8909p0 = ab.g.b(i6, aVar.f8918y0);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.O(f);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.O(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.P(f);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.P(aVar.f8918y0.getResources().getDimension(i6));
        }
    }

    @Override // qb.h
    public void setInternalOnCheckedChangeListener(h.a<Chip> aVar) {
        this.D = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.f8886y == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 <= 1) {
            super.setLines(i6);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 <= 1) {
            super.setMaxLines(i6);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.Y0 = i6;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 <= 1) {
            super.setMinLines(i6);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.C = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.B = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        if (!this.f8886y.T0) {
            f();
        }
    }

    public void setRippleColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.Q(g0.a.c(i6, aVar.f8918y0));
            if (!this.f8886y.T0) {
                f();
            }
        }
    }

    @Override // yb.m
    public void setShapeAppearanceModel(i iVar) {
        this.f8886y.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(ab.g gVar) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.f8908o0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.f8908o0 = ab.g.b(i6, aVar.f8918y0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.X0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f8886y;
        if (aVar2 != null && !TextUtils.equals(aVar2.Y, charSequence)) {
            aVar2.Y = charSequence;
            aVar2.E0.f29505d = true;
            aVar2.invalidateSelf();
            aVar2.v();
        }
    }

    public void setTextAppearance(e eVar) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.E0.b(eVar, aVar.f8918y0);
        }
        h();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8914u0 != f) {
            aVar.f8914u0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            float dimension = aVar.f8918y0.getResources().getDimension(i6);
            if (aVar.f8914u0 != dimension) {
                aVar.f8914u0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f) {
        super.setTextSize(i6, f);
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i6, f, getResources().getDisplayMetrics());
            q qVar = aVar.E0;
            e eVar = qVar.f;
            if (eVar != null) {
                eVar.f33988k = applyDimension;
                qVar.f29502a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null && aVar.f8913t0 != f) {
            aVar.f8913t0 = f;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            float dimension = aVar.f8918y0.getResources().getDimension(i6);
            if (aVar.f8913t0 != dimension) {
                aVar.f8913t0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.N(z10);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.A(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            aVar.F(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            Context context2 = aVar.f8918y0;
            aVar.E0.b(new e(context2, i6), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        com.google.android.material.chip.a aVar = this.f8886y;
        if (aVar != null) {
            Context context = aVar.f8918y0;
            aVar.E0.b(new e(context, i6), context);
        }
        h();
    }

    /* loaded from: classes.dex */
    public class a extends com.android.volley.toolbox.a {
        public a() {
        }

        @Override // com.android.volley.toolbox.a
        public final void n(Typeface typeface, boolean z10) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f8886y;
            if (aVar.X0) {
                text = aVar.Y;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }

        @Override // com.android.volley.toolbox.a
        public final void m(int i6) {
        }
    }
}
