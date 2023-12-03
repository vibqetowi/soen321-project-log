package com.google.android.material.floatingactionbutton;

import ab.g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.cast.i;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.theinnerhour.b2b.R;
import db.b;
import db.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import qb.t;
import qb.w;
import qb.y;
import t.h;
import t0.d0;
import t0.o0;
import ug.l;
import yb.f;
import yb.m;
/* loaded from: classes.dex */
public class FloatingActionButton extends y implements ob.a, m, CoordinatorLayout.b {
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final Rect F;
    public final Rect G;
    public final n H;
    public final i I;
    public pb.d J;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f9023v;

    /* renamed from: w  reason: collision with root package name */
    public PorterDuff.Mode f9024w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f9025x;

    /* renamed from: y  reason: collision with root package name */
    public PorterDuff.Mode f9026y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f9027z;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public class b implements xb.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements d.f {
        public c(FloatingActionButton floatingActionButton) {
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, 2132083620), attributeSet, R.attr.floatingActionButtonStyle);
        this.F = new Rect();
        this.G = new Rect();
        Context context2 = getContext();
        TypedArray d10 = t.d(context2, attributeSet, l.f34131n, R.attr.floatingActionButtonStyle, 2132083620, new int[0]);
        this.f9023v = ub.d.a(context2, d10, 1);
        this.f9024w = w.d(d10.getInt(2, -1), null);
        this.f9027z = ub.d.a(context2, d10, 12);
        this.A = d10.getInt(7, -1);
        this.B = d10.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = d10.getDimensionPixelSize(3, 0);
        float dimension = d10.getDimension(4, 0.0f);
        float dimension2 = d10.getDimension(9, 0.0f);
        float dimension3 = d10.getDimension(11, 0.0f);
        this.E = d10.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d10.getDimensionPixelSize(10, 0));
        g a10 = g.a(context2, d10, 15);
        g a11 = g.a(context2, d10, 8);
        yb.g gVar = yb.i.f38451m;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.f34141y, R.attr.floatingActionButtonStyle, 2132083620);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        yb.i iVar = new yb.i(yb.i.a(context2, resourceId, resourceId2, gVar));
        boolean z10 = d10.getBoolean(5, false);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        n nVar = new n(this);
        this.H = nVar;
        nVar.b(attributeSet, R.attr.floatingActionButtonStyle);
        this.I = new i(this);
        getImpl().n(iVar);
        getImpl().g(this.f9023v, this.f9024w, this.f9027z, dimensionPixelSize);
        getImpl().f9049k = dimensionPixelSize2;
        d impl = getImpl();
        if (impl.f9046h != dimension) {
            impl.f9046h = dimension;
            impl.k(dimension, impl.f9047i, impl.f9048j);
        }
        d impl2 = getImpl();
        if (impl2.f9047i != dimension2) {
            impl2.f9047i = dimension2;
            impl2.k(impl2.f9046h, dimension2, impl2.f9048j);
        }
        d impl3 = getImpl();
        if (impl3.f9048j != dimension3) {
            impl3.f9048j = dimension3;
            impl3.k(impl3.f9046h, impl3.f9047i, dimension3);
        }
        getImpl().f9051m = a10;
        getImpl().f9052n = a11;
        getImpl().f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private d getImpl() {
        if (this.J == null) {
            this.J = new pb.d(this, new b());
        }
        return this.J;
    }

    @Override // ob.a
    public final boolean a() {
        return this.I.f7551a;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.f9057t == null) {
            impl.f9057t = new ArrayList<>();
        }
        impl.f9057t.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(e eVar) {
        d impl = getImpl();
        if (impl.f9056s == null) {
            impl.f9056s = new ArrayList<>();
        }
        impl.f9056s.add(eVar);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c(this);
        if (impl.f9058u == null) {
            impl.f9058u = new ArrayList<>();
        }
        impl.f9058u.add(cVar);
    }

    public final int g(int i6) {
        int i10 = this.B;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        if (i6 != -1) {
            if (i6 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return g(1);
        } else {
            return g(0);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f9023v;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f9024w;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f9047i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f9048j;
    }

    public Drawable getContentBackground() {
        return getImpl().f9044e;
    }

    public int getCustomSize() {
        return this.B;
    }

    public int getExpandedComponentIdHint() {
        return this.I.f7552b;
    }

    public g getHideMotionSpec() {
        return getImpl().f9052n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f9027z;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f9027z;
    }

    public yb.i getShapeAppearanceModel() {
        yb.i iVar = getImpl().f9040a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f9051m;
    }

    public int getSize() {
        return this.A;
    }

    public int getSizeDimension() {
        return g(this.A);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f9025x;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f9026y;
    }

    public boolean getUseCompatPadding() {
        return this.E;
    }

    public final void h(db.b bVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar;
        boolean z11;
        int i6;
        AnimatorSet c10;
        d impl = getImpl();
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = new com.google.android.material.floatingactionbutton.a(this, bVar);
        }
        boolean z12 = false;
        if (impl.f9059v.getVisibility() != 0 ? impl.r != 2 : impl.r == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f9050l;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            FloatingActionButton floatingActionButton = impl.f9059v;
            if (d0.g.c(floatingActionButton) && !floatingActionButton.isInEditMode()) {
                z12 = true;
            }
            if (z12) {
                g gVar = impl.f9052n;
                if (gVar != null) {
                    c10 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    c10 = impl.c(0.0f, 0.4f, 0.4f, d.F, d.G);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.b(impl, z10, aVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f9057t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            if (z10) {
                i6 = 8;
            } else {
                i6 = 4;
            }
            floatingActionButton.b(i6, z10);
            if (aVar != null) {
                aVar.f9031a.a(aVar.f9032b);
            }
        }
    }

    public final boolean i() {
        d impl = getImpl();
        if (impl.f9059v.getVisibility() == 0) {
            if (impl.r == 1) {
                return true;
            }
        } else if (impl.r != 2) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        d impl = getImpl();
        if (impl.f9059v.getVisibility() != 0) {
            if (impl.r == 2) {
                return true;
            }
        } else if (impl.r != 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(Rect rect) {
        int i6 = rect.left;
        Rect rect2 = this.F;
        rect.left = i6 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f9025x;
        if (colorStateList == null) {
            k0.a.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f9026y;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(j.c(colorForState, mode));
    }

    public final void m(b.a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z11;
        boolean z12;
        AnimatorSet c10;
        float f;
        float f2;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z13 = true;
        if (impl.f9059v.getVisibility() == 0 ? impl.r != 1 : impl.r == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f9050l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f9051m == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            FloatingActionButton floatingActionButton = impl.f9059v;
            z13 = (!d0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) ? false : false;
            Matrix matrix = impl.A;
            if (z13) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f10 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    if (z12) {
                        f = 0.4f;
                    } else {
                        f = 0.0f;
                    }
                    floatingActionButton.setScaleY(f);
                    if (z12) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f2);
                    if (z12) {
                        f10 = 0.4f;
                    }
                    impl.f9054p = f10;
                    impl.a(f10, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                g gVar = impl.f9051m;
                if (gVar != null) {
                    c10 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    c10 = impl.c(1.0f, 1.0f, 1.0f, d.D, d.E);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f9056s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f9054p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (aVar2 != null) {
                aVar2.f9031a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        f fVar = impl.f9041b;
        FloatingActionButton floatingActionButton = impl.f9059v;
        if (fVar != null) {
            f6.b.R0(floatingActionButton, fVar);
        }
        if (!(impl instanceof pb.d)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new pb.c(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f9059v.getViewTreeObserver();
        pb.c cVar = impl.B;
        if (cVar != null) {
            viewTreeObserver.removeOnPreDrawListener(cVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i6, int i10) {
        int sizeDimension = getSizeDimension();
        this.C = (sizeDimension - this.D) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i6), View.resolveSize(sizeDimension, i10));
        Rect rect = this.F;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bc.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bc.a aVar = (bc.a) parcelable;
        super.onRestoreInstanceState(aVar.f39113u);
        i iVar = this.I;
        Bundle orDefault = aVar.f4249w.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        iVar.getClass();
        iVar.f7551a = orDefault.getBoolean("expanded", false);
        iVar.f7552b = orDefault.getInt("expandedComponentIdHint", 0);
        if (iVar.f7551a) {
            ViewParent parent = ((View) iVar.f7553c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c((View) iVar.f7553c);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        bc.a aVar = new bc.a(onSaveInstanceState);
        h<String, Bundle> hVar = aVar.f4249w;
        i iVar = this.I;
        iVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", iVar.f7551a);
        bundle.putInt("expandedComponentIdHint", iVar.f7552b);
        hVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            boolean c10 = d0.g.c(this);
            Rect rect = this.G;
            if (c10) {
                rect.set(0, 0, getWidth(), getHeight());
                k(rect);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f9023v != colorStateList) {
            this.f9023v = colorStateList;
            d impl = getImpl();
            f fVar = impl.f9041b;
            if (fVar != null) {
                fVar.setTintList(colorStateList);
            }
            pb.a aVar = impl.f9043d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f28093m = colorStateList.getColorForState(aVar.getState(), aVar.f28093m);
                }
                aVar.f28096p = colorStateList;
                aVar.f28094n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f9024w != mode) {
            this.f9024w = mode;
            f fVar = getImpl().f9041b;
            if (fVar != null) {
                fVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        d impl = getImpl();
        if (impl.f9046h != f) {
            impl.f9046h = f;
            impl.k(f, impl.f9047i, impl.f9048j);
        }
    }

    public void setCompatElevationResource(int i6) {
        setCompatElevation(getResources().getDimension(i6));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.f9047i != f) {
            impl.f9047i = f;
            impl.k(impl.f9046h, f, impl.f9048j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i6) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i6));
    }

    public void setCompatPressedTranslationZ(float f) {
        d impl = getImpl();
        if (impl.f9048j != f) {
            impl.f9048j = f;
            impl.k(impl.f9046h, impl.f9047i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i6) {
        setCompatPressedTranslationZ(getResources().getDimension(i6));
    }

    public void setCustomSize(int i6) {
        if (i6 >= 0) {
            if (i6 != this.B) {
                this.B = i6;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f fVar = getImpl().f9041b;
        if (fVar != null) {
            fVar.j(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f) {
            getImpl().f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i6) {
        this.I.f7552b = i6;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f9052n = gVar;
    }

    public void setHideMotionSpecResource(int i6) {
        setHideMotionSpec(g.b(i6, getContext()));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f = impl.f9054p;
            impl.f9054p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.f9059v.setImageMatrix(matrix);
            if (this.f9025x != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        this.H.c(i6);
        l();
    }

    public void setMaxImageSize(int i6) {
        this.D = i6;
        d impl = getImpl();
        if (impl.f9055q != i6) {
            impl.f9055q = i6;
            float f = impl.f9054p;
            impl.f9054p = f;
            Matrix matrix = impl.A;
            impl.a(f, matrix);
            impl.f9059v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i6) {
        setRippleColor(ColorStateList.valueOf(i6));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        ArrayList<d.f> arrayList = getImpl().f9058u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        ArrayList<d.f> arrayList = getImpl().f9058u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f9045g = z10;
        impl.q();
    }

    @Override // yb.m
    public void setShapeAppearanceModel(yb.i iVar) {
        getImpl().n(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f9051m = gVar;
    }

    public void setShowMotionSpecResource(int i6) {
        setShowMotionSpec(g.b(i6, getContext()));
    }

    public void setSize(int i6) {
        this.B = 0;
        if (i6 != this.A) {
            this.A = i6;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f9025x != colorStateList) {
            this.f9025x = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f9026y != mode) {
            this.f9026y = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            getImpl().i();
        }
    }

    @Override // qb.y, android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
    }

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f9028a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9029b;

        public BaseBehavior() {
            this.f9029b = true;
        }

        public final boolean a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f9029b || fVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f9028a == null) {
                this.f9028a = new Rect();
            }
            Rect rect = this.f9028a;
            qb.e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean c(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.F;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
            if (fVar.f1935h == 0) {
                fVar.f1935h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f1929a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    c(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i6) {
            int i10;
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList e10 = coordinatorLayout.e(floatingActionButton);
            int size = e10.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) e10.get(i12);
                if (view2 instanceof AppBarLayout) {
                    if (b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f1929a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && c(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.l(i6, floatingActionButton);
            Rect rect = floatingActionButton.F;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i10 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i10 = -rect.left;
                } else {
                    i10 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    d0.k(i11, floatingActionButton);
                }
                if (i10 != 0) {
                    d0.j(i10, floatingActionButton);
                    return true;
                }
                return true;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f34132o);
            this.f9029b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f9027z != colorStateList) {
            this.f9027z = colorStateList;
            getImpl().m(this.f9027z);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }
}
