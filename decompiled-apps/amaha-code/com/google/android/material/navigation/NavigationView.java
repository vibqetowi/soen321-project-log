package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.l1;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.theinnerhour.b2b.R;
import g0.a;
import java.util.WeakHashMap;
import k.f;
import qb.i;
import qb.j;
import qb.n;
import qb.t;
import sb.h;
import t0.d0;
import t0.o0;
import t0.s0;
import ub.d;
import ug.l;
import yb.f;
import yb.i;
import yb.j;
/* loaded from: classes.dex */
public class NavigationView extends n {
    public static final int[] O = {16842912};
    public static final int[] P = {-16842910};
    public final i B;
    public final j C;
    public a D;
    public final int E;
    public final int[] F;
    public f G;
    public h H;
    public boolean I;
    public boolean J;
    public final int K;
    public final int L;
    public Path M;
    public final RectF N;

    /* loaded from: classes.dex */
    public interface a {
        void c(MenuItem menuItem);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.navigationViewStyle, 2132083621), attributeSet, R.attr.navigationViewStyle);
        ColorStateList colorStateList;
        int i6;
        ColorStateList b10;
        int i10;
        ColorStateList colorStateList2;
        boolean z10;
        j jVar = new j();
        this.C = jVar;
        this.F = new int[2];
        this.I = true;
        this.J = true;
        this.K = 0;
        this.L = 0;
        this.N = new RectF();
        Context context2 = getContext();
        i iVar = new i(context2);
        this.B = iVar;
        l1 e10 = t.e(context2, attributeSet, l.E, R.attr.navigationViewStyle, 2132083621, new int[0]);
        if (e10.l(1)) {
            Drawable e11 = e10.e(1);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(this, e11);
        }
        this.L = e10.d(7, 0);
        this.K = e10.h(0, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            yb.i iVar2 = new yb.i(yb.i.b(context2, attributeSet, R.attr.navigationViewStyle, 2132083621));
            Drawable background = getBackground();
            yb.f fVar = new yb.f(iVar2);
            if (background instanceof ColorDrawable) {
                fVar.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fVar.i(context2);
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            d0.d.q(this, fVar);
        }
        if (e10.l(8)) {
            setElevation(e10.d(8, 0));
        }
        setFitsSystemWindows(e10.a(2, false));
        this.E = e10.d(3, 0);
        if (e10.l(30)) {
            colorStateList = e10.b(30);
        } else {
            colorStateList = null;
        }
        if (e10.l(33)) {
            i6 = e10.i(33, 0);
        } else {
            i6 = 0;
        }
        if (i6 == 0 && colorStateList == null) {
            colorStateList = b(16842808);
        }
        if (e10.l(14)) {
            b10 = e10.b(14);
        } else {
            b10 = b(16842808);
        }
        if (e10.l(24)) {
            i10 = e10.i(24, 0);
        } else {
            i10 = 0;
        }
        if (e10.l(13)) {
            setItemIconSize(e10.d(13, 0));
        }
        if (e10.l(25)) {
            colorStateList2 = e10.b(25);
        } else {
            colorStateList2 = null;
        }
        if (i10 == 0 && colorStateList2 == null) {
            colorStateList2 = b(16842806);
        }
        Drawable e12 = e10.e(10);
        if (e12 == null) {
            if (!e10.l(17) && !e10.l(18)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                e12 = c(e10, d.b(getContext(), e10, 19));
                ColorStateList b11 = d.b(context2, e10, 16);
                if (b11 != null) {
                    jVar.G = new RippleDrawable(vb.b.c(b11), null, c(e10, null));
                    jVar.d(false);
                }
            }
        }
        if (e10.l(11)) {
            setItemHorizontalPadding(e10.d(11, 0));
        }
        if (e10.l(26)) {
            setItemVerticalPadding(e10.d(26, 0));
        }
        setDividerInsetStart(e10.d(6, 0));
        setDividerInsetEnd(e10.d(5, 0));
        setSubheaderInsetStart(e10.d(32, 0));
        setSubheaderInsetEnd(e10.d(31, 0));
        setTopInsetScrimEnabled(e10.a(34, this.I));
        setBottomInsetScrimEnabled(e10.a(4, this.J));
        int d10 = e10.d(12, 0);
        setItemMaxLines(e10.h(15, 1));
        iVar.f1097e = new com.google.android.material.navigation.a(this);
        jVar.f29463x = 1;
        jVar.h(context2, iVar);
        if (i6 != 0) {
            jVar.A = i6;
            jVar.d(false);
        }
        jVar.B = colorStateList;
        jVar.d(false);
        jVar.E = b10;
        jVar.d(false);
        int overScrollMode = getOverScrollMode();
        jVar.U = overScrollMode;
        NavigationMenuView navigationMenuView = jVar.f29460u;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(overScrollMode);
        }
        if (i10 != 0) {
            jVar.C = i10;
            jVar.d(false);
        }
        jVar.D = colorStateList2;
        jVar.d(false);
        jVar.F = e12;
        jVar.d(false);
        jVar.J = d10;
        jVar.d(false);
        iVar.b(jVar, iVar.f1093a);
        if (jVar.f29460u == null) {
            NavigationMenuView navigationMenuView2 = (NavigationMenuView) jVar.f29465z.inflate(R.layout.design_navigation_menu, (ViewGroup) this, false);
            jVar.f29460u = navigationMenuView2;
            navigationMenuView2.setAccessibilityDelegateCompat(new j.h(jVar.f29460u));
            if (jVar.f29464y == null) {
                jVar.f29464y = new j.c();
            }
            int i11 = jVar.U;
            if (i11 != -1) {
                jVar.f29460u.setOverScrollMode(i11);
            }
            jVar.f29461v = (LinearLayout) jVar.f29465z.inflate(R.layout.design_navigation_item_header, (ViewGroup) jVar.f29460u, false);
            jVar.f29460u.setAdapter(jVar.f29464y);
        }
        addView(jVar.f29460u);
        if (e10.l(27)) {
            int i12 = e10.i(27, 0);
            j.c cVar = jVar.f29464y;
            if (cVar != null) {
                cVar.f29469z = true;
            }
            getMenuInflater().inflate(i12, iVar);
            j.c cVar2 = jVar.f29464y;
            if (cVar2 != null) {
                cVar2.f29469z = false;
            }
            jVar.d(false);
        }
        if (e10.l(9)) {
            jVar.f29461v.addView(jVar.f29465z.inflate(e10.i(9, 0), (ViewGroup) jVar.f29461v, false));
            NavigationMenuView navigationMenuView3 = jVar.f29460u;
            navigationMenuView3.setPadding(0, 0, 0, navigationMenuView3.getPaddingBottom());
        }
        e10.n();
        this.H = new h(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.H);
    }

    private MenuInflater getMenuInflater() {
        if (this.G == null) {
            this.G = new f(getContext());
        }
        return this.G;
    }

    @Override // qb.n
    public final void a(s0 s0Var) {
        int i6;
        j jVar = this.C;
        jVar.getClass();
        int d10 = s0Var.d();
        if (jVar.S != d10) {
            jVar.S = d10;
            if (jVar.f29461v.getChildCount() == 0 && jVar.Q) {
                i6 = jVar.S;
            } else {
                i6 = 0;
            }
            NavigationMenuView navigationMenuView = jVar.f29460u;
            navigationMenuView.setPadding(0, i6, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = jVar.f29460u;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, s0Var.a());
        d0.b(jVar.f29461v, s0Var);
    }

    public final ColorStateList b(int i6) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i6, typedValue, true)) {
            return null;
        }
        ColorStateList c10 = g0.a.c(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i10 = typedValue.data;
        int defaultColor = c10.getDefaultColor();
        int[] iArr = P;
        return new ColorStateList(new int[][]{iArr, O, FrameLayout.EMPTY_STATE_SET}, new int[]{c10.getColorForState(iArr, defaultColor), i10, defaultColor});
    }

    public final InsetDrawable c(l1 l1Var, ColorStateList colorStateList) {
        yb.f fVar = new yb.f(new yb.i(yb.i.a(getContext(), l1Var.i(17, 0), l1Var.i(18, 0), new yb.a(0))));
        fVar.k(colorStateList);
        return new InsetDrawable((Drawable) fVar, l1Var.d(22, 0), l1Var.d(23, 0), l1Var.d(21, 0), l1Var.d(20, 0));
    }

    public final View d() {
        return this.C.f29461v.getChildAt(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.M == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.M);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public MenuItem getCheckedItem() {
        return this.C.f29464y.f29468y;
    }

    public int getDividerInsetEnd() {
        return this.C.M;
    }

    public int getDividerInsetStart() {
        return this.C.L;
    }

    public int getHeaderCount() {
        return this.C.f29461v.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.C.F;
    }

    public int getItemHorizontalPadding() {
        return this.C.H;
    }

    public int getItemIconPadding() {
        return this.C.J;
    }

    public ColorStateList getItemIconTintList() {
        return this.C.E;
    }

    public int getItemMaxLines() {
        return this.C.R;
    }

    public ColorStateList getItemTextColor() {
        return this.C.D;
    }

    public int getItemVerticalPadding() {
        return this.C.I;
    }

    public Menu getMenu() {
        return this.B;
    }

    public int getSubheaderInsetEnd() {
        return this.C.O;
    }

    public int getSubheaderInsetStart() {
        return this.C.N;
    }

    @Override // qb.n, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.Q0(this);
    }

    @Override // qb.n, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.H);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int mode = View.MeasureSpec.getMode(i6);
        int i11 = this.E;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            }
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i6), i11), 1073741824);
        }
        super.onMeasure(i6, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f39113u);
        this.B.t(bVar.f9094w);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f9094w = bundle;
        this.B.v(bundle);
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        int i13;
        super.onSizeChanged(i6, i10, i11, i12);
        boolean z10 = getParent() instanceof DrawerLayout;
        RectF rectF = this.N;
        if (z10 && (i13 = this.L) > 0 && (getBackground() instanceof yb.f)) {
            yb.f fVar = (yb.f) getBackground();
            yb.i iVar = fVar.f38424u.f38431a;
            iVar.getClass();
            i.a aVar = new i.a(iVar);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (Gravity.getAbsoluteGravity(this.K, d0.e.d(this)) == 3) {
                float f = i13;
                aVar.f(f);
                aVar.d(f);
            } else {
                float f2 = i13;
                aVar.e(f2);
                aVar.c(f2);
            }
            fVar.setShapeAppearanceModel(new yb.i(aVar));
            if (this.M == null) {
                this.M = new Path();
            }
            this.M.reset();
            rectF.set(0.0f, 0.0f, i6, i10);
            yb.j jVar = j.a.f38485a;
            f.b bVar = fVar.f38424u;
            jVar.a(bVar.f38431a, bVar.f38439j, rectF, null, this.M);
            invalidate();
            return;
        }
        this.M = null;
        rectF.setEmpty();
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.J = z10;
    }

    public void setCheckedItem(int i6) {
        MenuItem findItem = this.B.findItem(i6);
        if (findItem != null) {
            this.C.f29464y.w((androidx.appcompat.view.menu.h) findItem);
        }
    }

    public void setDividerInsetEnd(int i6) {
        qb.j jVar = this.C;
        jVar.M = i6;
        jVar.d(false);
    }

    public void setDividerInsetStart(int i6) {
        qb.j jVar = this.C;
        jVar.L = i6;
        jVar.d(false);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        f6.b.O0(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        qb.j jVar = this.C;
        jVar.F = drawable;
        jVar.d(false);
    }

    public void setItemBackgroundResource(int i6) {
        Context context = getContext();
        Object obj = g0.a.f16164a;
        setItemBackground(a.c.b(context, i6));
    }

    public void setItemHorizontalPadding(int i6) {
        qb.j jVar = this.C;
        jVar.H = i6;
        jVar.d(false);
    }

    public void setItemHorizontalPaddingResource(int i6) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i6);
        qb.j jVar = this.C;
        jVar.H = dimensionPixelSize;
        jVar.d(false);
    }

    public void setItemIconPadding(int i6) {
        qb.j jVar = this.C;
        jVar.J = i6;
        jVar.d(false);
    }

    public void setItemIconPaddingResource(int i6) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i6);
        qb.j jVar = this.C;
        jVar.J = dimensionPixelSize;
        jVar.d(false);
    }

    public void setItemIconSize(int i6) {
        qb.j jVar = this.C;
        if (jVar.K != i6) {
            jVar.K = i6;
            jVar.P = true;
            jVar.d(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        qb.j jVar = this.C;
        jVar.E = colorStateList;
        jVar.d(false);
    }

    public void setItemMaxLines(int i6) {
        qb.j jVar = this.C;
        jVar.R = i6;
        jVar.d(false);
    }

    public void setItemTextAppearance(int i6) {
        qb.j jVar = this.C;
        jVar.C = i6;
        jVar.d(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        qb.j jVar = this.C;
        jVar.D = colorStateList;
        jVar.d(false);
    }

    public void setItemVerticalPadding(int i6) {
        qb.j jVar = this.C;
        jVar.I = i6;
        jVar.d(false);
    }

    public void setItemVerticalPaddingResource(int i6) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i6);
        qb.j jVar = this.C;
        jVar.I = dimensionPixelSize;
        jVar.d(false);
    }

    public void setNavigationItemSelectedListener(a aVar) {
        this.D = aVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i6) {
        super.setOverScrollMode(i6);
        qb.j jVar = this.C;
        if (jVar != null) {
            jVar.U = i6;
            NavigationMenuView navigationMenuView = jVar.f29460u;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i6);
            }
        }
    }

    public void setSubheaderInsetEnd(int i6) {
        qb.j jVar = this.C;
        jVar.O = i6;
        jVar.d(false);
    }

    public void setSubheaderInsetStart(int i6) {
        qb.j jVar = this.C;
        jVar.N = i6;
        jVar.d(false);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.I = z10;
    }

    /* loaded from: classes.dex */
    public static class b extends z0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public Bundle f9094w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new b[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9094w = parcel.readBundle(classLoader);
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeBundle(this.f9094w);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.B.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.C.f29464y.w((androidx.appcompat.view.menu.h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
