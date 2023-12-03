package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.k;
import com.theinnerhour.b2b.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.a;
import qb.t;
import qb.w;
import t0.d0;
import t0.o0;
import ub.d;
import ug.l;
import yb.i;
import yb.m;
/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, m {
    public static final int[] K = {16842911};
    public static final int[] L = {16842912};
    public PorterDuff.Mode A;
    public ColorStateList B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;

    /* renamed from: x  reason: collision with root package name */
    public final fb.a f8868x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashSet<a> f8869y;

    /* renamed from: z  reason: collision with root package name */
    public b f8870z;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends z0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public boolean f8871w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new c[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f8871w ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f8871w = parcel.readInt() == 1;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.materialButtonStyle, 2132083807), attributeSet, R.attr.materialButtonStyle);
        this.f8869y = new LinkedHashSet<>();
        this.H = false;
        this.I = false;
        Context context2 = getContext();
        TypedArray d10 = t.d(context2, attributeSet, l.f34135s, R.attr.materialButtonStyle, 2132083807, new int[0]);
        this.G = d10.getDimensionPixelSize(12, 0);
        this.A = w.d(d10.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.B = d.a(getContext(), d10, 14);
        this.C = d.c(getContext(), d10, 10);
        this.J = d10.getInteger(11, 1);
        this.D = d10.getDimensionPixelSize(13, 0);
        fb.a aVar = new fb.a(this, new i(i.b(context2, attributeSet, R.attr.materialButtonStyle, 2132083807)));
        this.f8868x = aVar;
        aVar.f14924c = d10.getDimensionPixelOffset(1, 0);
        aVar.f14925d = d10.getDimensionPixelOffset(2, 0);
        aVar.f14926e = d10.getDimensionPixelOffset(3, 0);
        aVar.f = d10.getDimensionPixelOffset(4, 0);
        if (d10.hasValue(8)) {
            int dimensionPixelSize = d10.getDimensionPixelSize(8, -1);
            aVar.f14927g = dimensionPixelSize;
            aVar.c(aVar.f14923b.e(dimensionPixelSize));
            aVar.f14936p = true;
        }
        aVar.f14928h = d10.getDimensionPixelSize(20, 0);
        aVar.f14929i = w.d(d10.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f14930j = d.a(getContext(), d10, 6);
        aVar.f14931k = d.a(getContext(), d10, 19);
        aVar.f14932l = d.a(getContext(), d10, 16);
        aVar.f14937q = d10.getBoolean(5, false);
        aVar.f14939t = d10.getDimensionPixelSize(9, 0);
        aVar.r = d10.getBoolean(21, true);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int f = d0.e.f(this);
        int paddingTop = getPaddingTop();
        int e10 = d0.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d10.hasValue(0)) {
            aVar.f14935o = true;
            setSupportBackgroundTintList(aVar.f14930j);
            setSupportBackgroundTintMode(aVar.f14929i);
        } else {
            aVar.e();
        }
        d0.e.k(this, f + aVar.f14924c, paddingTop + aVar.f14926e, e10 + aVar.f14925d, paddingBottom + aVar.f);
        d10.recycle();
        setCompoundDrawablePadding(this.G);
        c(this.C != null);
    }

    private String getA11yClassName() {
        boolean z10;
        Class cls;
        fb.a aVar = this.f8868x;
        if (aVar != null && aVar.f14937q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i6 = 0; i6 < lineCount; i6++) {
            f = Math.max(f, getLayout().getLineWidth(i6));
        }
        return (int) Math.ceil(f);
    }

    public final boolean a() {
        fb.a aVar = this.f8868x;
        if (aVar != null && !aVar.f14935o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i6 = this.J;
        boolean z12 = false;
        if (i6 != 1 && i6 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            k.b.e(this, this.C, null, null, null);
            return;
        }
        if (i6 != 3 && i6 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            k.b.e(this, null, null, this.C, null);
            return;
        }
        if ((i6 == 16 || i6 == 32) ? true : true) {
            k.b.e(this, null, this.C, null, null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.C;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = k0.a.g(drawable).mutate();
            this.C = mutate;
            a.b.h(mutate, this.B);
            PorterDuff.Mode mode = this.A;
            if (mode != null) {
                a.b.i(this.C, mode);
            }
            int i6 = this.D;
            if (i6 == 0) {
                i6 = this.C.getIntrinsicWidth();
            }
            int i10 = this.D;
            if (i10 == 0) {
                i10 = this.C.getIntrinsicHeight();
            }
            Drawable drawable2 = this.C;
            int i11 = this.E;
            int i12 = this.F;
            drawable2.setBounds(i11, i12, i6 + i11, i10 + i12);
            this.C.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = k.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i13 = this.J;
        if (i13 != 1 && i13 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 || drawable3 == this.C) {
            if (i13 != 3 && i13 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || drawable5 == this.C) {
                if (i13 != 16 && i13 != 32) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13 || drawable4 == this.C) {
                    z14 = false;
                }
            }
        }
        if (z14) {
            b();
        }
    }

    public final void d(int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.C != null && getLayout() != null) {
            int i11 = this.J;
            boolean z13 = true;
            if (i11 != 1 && i11 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (i11 != 3 && i11 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (i11 != 16 && i11 != 32) {
                        z13 = false;
                    }
                    if (z13) {
                        this.E = 0;
                        if (i11 == 16) {
                            this.F = 0;
                            c(false);
                            return;
                        }
                        int i12 = this.D;
                        if (i12 == 0) {
                            i12 = this.C.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.G) - getPaddingBottom()) / 2);
                        if (this.F != max) {
                            this.F = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.F = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.J;
            if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i14 = this.D;
                if (i14 == 0) {
                    i14 = this.C.getIntrinsicWidth();
                }
                int textLayoutWidth = i6 - getTextLayoutWidth();
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                int e10 = (((textLayoutWidth - d0.e.e(this)) - i14) - this.G) - d0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (d0.e.d(this) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.J != 4) {
                    z13 = false;
                }
                if (z11 != z13) {
                    e10 = -e10;
                }
                if (this.E != e10) {
                    this.E = e10;
                    c(false);
                    return;
                }
                return;
            }
            this.E = 0;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f8868x.f14927g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.C;
    }

    public int getIconGravity() {
        return this.J;
    }

    public int getIconPadding() {
        return this.G;
    }

    public int getIconSize() {
        return this.D;
    }

    public ColorStateList getIconTint() {
        return this.B;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A;
    }

    public int getInsetBottom() {
        return this.f8868x.f;
    }

    public int getInsetTop() {
        return this.f8868x.f14926e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f8868x.f14932l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f8868x.f14923b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f8868x.f14931k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f8868x.f14928h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f8868x.f14930j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f8868x.f14929i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.H;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            f6.b.R0(this, this.f8868x.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        fb.a aVar = this.f8868x;
        if (aVar != null && aVar.f14937q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, K);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        fb.a aVar = this.f8868x;
        if (aVar != null && aVar.f14937q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        fb.a aVar;
        super.onLayout(z10, i6, i10, i11, i12);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f8868x) != null) {
            int i13 = i12 - i10;
            int i14 = i11 - i6;
            Drawable drawable = aVar.f14933m;
            if (drawable != null) {
                drawable.setBounds(aVar.f14924c, aVar.f14926e, i14 - aVar.f14925d, i13 - aVar.f);
            }
        }
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f39113u);
        setChecked(cVar.f8871w);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f8871w = this.H;
        return cVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        super.onTextChanged(charSequence, i6, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f8868x.r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.C != null) {
            if (this.C.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i6);
                return;
            }
            return;
        }
        super.setBackgroundColor(i6);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                fb.a aVar = this.f8868x;
                aVar.f14935o = true;
                ColorStateList colorStateList = aVar.f14930j;
                MaterialButton materialButton = aVar.f14922a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(aVar.f14929i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = hc.d.H(getContext(), i6);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f8868x.f14937q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        boolean z11;
        fb.a aVar = this.f8868x;
        if (aVar != null && aVar.f14937q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && isEnabled() && this.H != z10) {
            this.H = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.H;
                if (!materialButtonToggleGroup.f8877z) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (this.I) {
                return;
            }
            this.I = true;
            Iterator<a> it = this.f8869y.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.I = false;
        }
    }

    public void setCornerRadius(int i6) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (!aVar.f14936p || aVar.f14927g != i6) {
                aVar.f14927g = i6;
                aVar.f14936p = true;
                aVar.c(aVar.f14923b.e(i6));
            }
        }
    }

    public void setCornerRadiusResource(int i6) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.f8868x.b(false).j(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.C != drawable) {
            this.C = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i6) {
        if (this.J != i6) {
            this.J = i6;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i6) {
        if (this.G != i6) {
            this.G = i6;
            setCompoundDrawablePadding(i6);
        }
    }

    public void setIconResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            drawable = hc.d.H(getContext(), i6);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i6) {
        if (i6 >= 0) {
            if (this.D != i6) {
                this.D = i6;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A != mode) {
            this.A = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i6) {
        setIconTint(g0.a.c(i6, getContext()));
    }

    public void setInsetBottom(int i6) {
        fb.a aVar = this.f8868x;
        aVar.d(aVar.f14926e, i6);
    }

    public void setInsetTop(int i6) {
        fb.a aVar = this.f8868x;
        aVar.d(i6, aVar.f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f8870z = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f8870z;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (aVar.f14932l != colorStateList) {
                aVar.f14932l = colorStateList;
                boolean z10 = fb.a.f14920u;
                MaterialButton materialButton = aVar.f14922a;
                if (z10 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(vb.b.c(colorStateList));
                } else if (!z10 && (materialButton.getBackground() instanceof vb.a)) {
                    ((vb.a) materialButton.getBackground()).setTintList(vb.b.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i6) {
        if (a()) {
            setRippleColor(g0.a.c(i6, getContext()));
        }
    }

    @Override // yb.m
    public void setShapeAppearanceModel(i iVar) {
        if (a()) {
            this.f8868x.c(iVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            fb.a aVar = this.f8868x;
            aVar.f14934n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (aVar.f14931k != colorStateList) {
                aVar.f14931k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i6) {
        if (a()) {
            setStrokeColor(g0.a.c(i6, getContext()));
        }
    }

    public void setStrokeWidth(int i6) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (aVar.f14928h != i6) {
                aVar.f14928h = i6;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i6) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i6));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (aVar.f14930j != colorStateList) {
                aVar.f14930j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f14930j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            fb.a aVar = this.f8868x;
            if (aVar.f14929i != mode) {
                aVar.f14929i = mode;
                if (aVar.b(false) != null && aVar.f14929i != null) {
                    a.b.i(aVar.b(false), aVar.f14929i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i6) {
        super.setTextAlignment(i6);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f8868x.r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.H);
    }
}
