package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import bb.f;
import bb.g;
import bb.k;
import com.google.android.material.appbar.AppBarLayout;
import com.theinnerhour.b2b.R;
import g0.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import qb.d;
import qb.e;
import qb.t;
import t0.d0;
import t0.o0;
import t0.s0;
import ug.l;
/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public int A;
    public int B;
    public int C;
    public final Rect D;
    public final d E;
    public final nb.a F;
    public boolean G;
    public boolean H;
    public Drawable I;
    public Drawable J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public long N;
    public final TimeInterpolator O;
    public final TimeInterpolator P;
    public int Q;
    public b R;
    public int S;
    public int T;
    public s0 U;
    public int V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f8767a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8768b0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8769u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8770v;

    /* renamed from: w  reason: collision with root package name */
    public ViewGroup f8771w;

    /* renamed from: x  reason: collision with root package name */
    public View f8772x;

    /* renamed from: y  reason: collision with root package name */
    public View f8773y;

    /* renamed from: z  reason: collision with root package name */
    public int f8774z;

    /* loaded from: classes.dex */
    public class b implements AppBarLayout.f {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(AppBarLayout appBarLayout, int i6) {
            int i10;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.S = i6;
            s0 s0Var = collapsingToolbarLayout.U;
            if (s0Var != null) {
                i10 = s0Var.d();
            } else {
                i10 = 0;
            }
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = collapsingToolbarLayout.getChildAt(i11);
                a aVar = (a) childAt.getLayoutParams();
                k b10 = CollapsingToolbarLayout.b(childAt);
                int i12 = aVar.f8775a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        b10.b(Math.round((-i6) * aVar.f8776b));
                    }
                } else {
                    b10.b(hc.d.j(-i6, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f4245b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.J != null && i10 > 0) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.k(collapsingToolbarLayout);
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            int d10 = (height - d0.d.d(collapsingToolbarLayout)) - i10;
            float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            float f = d10;
            float min = Math.min(1.0f, scrimVisibleHeightTrigger / f);
            d dVar = collapsingToolbarLayout.E;
            dVar.f29418d = min;
            dVar.f29420e = e.e(1.0f, min, 0.5f, min);
            dVar.f = collapsingToolbarLayout.S + d10;
            dVar.p(Math.abs(i6) / f);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.collapsingToolbarLayoutStyle, 2132083619), attributeSet, R.attr.collapsingToolbarLayoutStyle);
        int i6;
        ColorStateList a10;
        ColorStateList a11;
        TextUtils.TruncateAt truncateAt;
        this.f8769u = true;
        this.D = new Rect();
        this.Q = -1;
        this.V = 0;
        this.f8767a0 = 0;
        Context context2 = getContext();
        d dVar = new d(this);
        this.E = dVar;
        dVar.W = ab.a.f453e;
        dVar.i(false);
        dVar.J = false;
        this.F = new nb.a(context2);
        TypedArray d10 = t.d(context2, attributeSet, l.f34128k, R.attr.collapsingToolbarLayoutStyle, 2132083619, new int[0]);
        int i10 = d10.getInt(4, 8388691);
        if (dVar.f29428j != i10) {
            dVar.f29428j = i10;
            dVar.i(false);
        }
        dVar.l(d10.getInt(0, 8388627));
        int dimensionPixelSize = d10.getDimensionPixelSize(5, 0);
        this.C = dimensionPixelSize;
        this.B = dimensionPixelSize;
        this.A = dimensionPixelSize;
        this.f8774z = dimensionPixelSize;
        if (d10.hasValue(8)) {
            this.f8774z = d10.getDimensionPixelSize(8, 0);
        }
        if (d10.hasValue(7)) {
            this.B = d10.getDimensionPixelSize(7, 0);
        }
        if (d10.hasValue(9)) {
            this.A = d10.getDimensionPixelSize(9, 0);
        }
        if (d10.hasValue(6)) {
            this.C = d10.getDimensionPixelSize(6, 0);
        }
        this.G = d10.getBoolean(20, true);
        setTitle(d10.getText(18));
        dVar.n(2132083233);
        dVar.k(com.appsflyer.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (d10.hasValue(10)) {
            dVar.n(d10.getResourceId(10, 0));
        }
        if (d10.hasValue(1)) {
            dVar.k(d10.getResourceId(1, 0));
        }
        if (d10.hasValue(22)) {
            int i11 = d10.getInt(22, -1);
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 3) {
                        truncateAt = TextUtils.TruncateAt.END;
                    } else {
                        truncateAt = TextUtils.TruncateAt.MARQUEE;
                    }
                } else {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                }
            } else {
                truncateAt = TextUtils.TruncateAt.START;
            }
            setTitleEllipsize(truncateAt);
        }
        if (d10.hasValue(11) && dVar.f29436n != (a11 = ub.d.a(context2, d10, 11))) {
            dVar.f29436n = a11;
            dVar.i(false);
        }
        if (d10.hasValue(2) && dVar.f29438o != (a10 = ub.d.a(context2, d10, 2))) {
            dVar.f29438o = a10;
            dVar.i(false);
        }
        this.Q = d10.getDimensionPixelSize(16, -1);
        if (d10.hasValue(14) && (i6 = d10.getInt(14, 1)) != dVar.f29437n0) {
            dVar.f29437n0 = i6;
            Bitmap bitmap = dVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.K = null;
            }
            dVar.i(false);
        }
        if (d10.hasValue(21)) {
            dVar.V = AnimationUtils.loadInterpolator(context2, d10.getResourceId(21, 0));
            dVar.i(false);
        }
        this.N = d10.getInt(15, 600);
        this.O = rb.a.d(context2, R.attr.motionEasingStandardInterpolator, ab.a.f451c);
        this.P = rb.a.d(context2, R.attr.motionEasingStandardInterpolator, ab.a.f452d);
        setContentScrim(d10.getDrawable(3));
        setStatusBarScrim(d10.getDrawable(17));
        setTitleCollapseMode(d10.getInt(19, 0));
        this.f8770v = d10.getResourceId(23, -1);
        this.W = d10.getBoolean(13, false);
        this.f8768b0 = d10.getBoolean(12, false);
        d10.recycle();
        setWillNotDraw(false);
        f fVar = new f(this);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.i.u(this, fVar);
    }

    public static k b(View view) {
        k kVar = (k) view.getTag(R.id.view_offset_helper);
        if (kVar == null) {
            k kVar2 = new k(view);
            view.setTag(R.id.view_offset_helper, kVar2);
            return kVar2;
        }
        return kVar;
    }

    public final void a() {
        boolean z10;
        if (!this.f8769u) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f8771w = null;
        this.f8772x = null;
        int i6 = this.f8770v;
        if (i6 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i6);
            this.f8771w = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.f8772x = view;
            }
        }
        if (this.f8771w == null) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i10);
                if (!(childAt instanceof Toolbar) && !(childAt instanceof android.widget.Toolbar)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i10++;
            }
            this.f8771w = viewGroup;
        }
        c();
        this.f8769u = false;
    }

    public final void c() {
        View view;
        if (!this.G && (view = this.f8773y) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8773y);
            }
        }
        if (this.G && this.f8771w != null) {
            if (this.f8773y == null) {
                this.f8773y = new View(getContext());
            }
            if (this.f8773y.getParent() == null) {
                this.f8771w.addView(this.f8773y, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        boolean z10;
        if (this.I != null || this.J != null) {
            if (getHeight() + this.S < getScrimVisibleHeightTrigger()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrimsShown(z10);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i6;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f8771w == null && (drawable = this.I) != null && this.K > 0) {
            drawable.mutate().setAlpha(this.K);
            this.I.draw(canvas);
        }
        if (this.G && this.H) {
            ViewGroup viewGroup = this.f8771w;
            d dVar = this.E;
            if (viewGroup != null && this.I != null && this.K > 0) {
                boolean z10 = true;
                if (this.T != 1) {
                    z10 = false;
                }
                if (z10 && dVar.f29415b < dVar.f29420e) {
                    int save = canvas.save();
                    canvas.clipRect(this.I.getBounds(), Region.Op.DIFFERENCE);
                    dVar.d(canvas);
                    canvas.restoreToCount(save);
                }
            }
            dVar.d(canvas);
        }
        if (this.J != null && this.K > 0) {
            s0 s0Var = this.U;
            if (s0Var != null) {
                i6 = s0Var.d();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                this.J.setBounds(0, -this.S, getWidth(), i6 - this.S);
                this.J.mutate().setAlpha(this.K);
                this.J.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        boolean z11;
        Drawable drawable = this.I;
        if (drawable != null && this.K > 0) {
            if ((r3 = this.f8772x) != null) {
            }
            boolean z12 = false;
            if (z12) {
                int width = getWidth();
                int height = getHeight();
                if (this.T == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && view != null && this.G) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.I.mutate().setAlpha(this.K);
                this.I.draw(canvas);
                z10 = true;
                if (super.drawChild(canvas, view, j10) && !z10) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (super.drawChild(canvas, view, j10)) {
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.J;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.I;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        d dVar = this.E;
        if (dVar != null) {
            z10 |= dVar.r(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(int i6, int i10, int i11, int i12, boolean z10) {
        View view;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        int i18;
        int i19;
        if (this.G && (view = this.f8773y) != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            boolean z14 = false;
            if (d0.g.b(view) && this.f8773y.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.H = z11;
            if (z11 || z10) {
                if (d0.e.d(this) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view2 = this.f8772x;
                if (view2 == null) {
                    view2 = this.f8771w;
                }
                int height = ((getHeight() - b(view2).f4245b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((a) view2.getLayoutParams())).bottomMargin;
                View view3 = this.f8773y;
                Rect rect = this.D;
                e.a(this, view3, rect);
                ViewGroup viewGroup = this.f8771w;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i14 = toolbar.getTitleMarginStart();
                    i15 = toolbar.getTitleMarginEnd();
                    i16 = toolbar.getTitleMarginTop();
                    i13 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i14 = toolbar2.getTitleMarginStart();
                    i15 = toolbar2.getTitleMarginEnd();
                    i16 = toolbar2.getTitleMarginTop();
                    i13 = toolbar2.getTitleMarginBottom();
                } else {
                    i13 = 0;
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                }
                int i20 = rect.left;
                if (z12) {
                    i17 = i15;
                } else {
                    i17 = i14;
                }
                int i21 = i20 + i17;
                int i22 = rect.top + height + i16;
                int i23 = rect.right;
                if (!z12) {
                    i14 = i15;
                }
                int i24 = i23 - i14;
                int i25 = (rect.bottom + height) - i13;
                d dVar = this.E;
                Rect rect2 = dVar.f29424h;
                if (rect2.left == i21 && rect2.top == i22 && rect2.right == i24 && rect2.bottom == i25) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    rect2.set(i21, i22, i24, i25);
                    dVar.S = true;
                }
                if (z12) {
                    i18 = this.B;
                } else {
                    i18 = this.f8774z;
                }
                int i26 = rect.top + this.A;
                int i27 = i11 - i6;
                if (z12) {
                    i19 = this.f8774z;
                } else {
                    i19 = this.B;
                }
                int i28 = i27 - i19;
                int i29 = (i12 - i10) - this.C;
                Rect rect3 = dVar.f29422g;
                if (rect3.left == i18 && rect3.top == i26 && rect3.right == i28 && rect3.bottom == i29) {
                    z14 = true;
                }
                if (!z14) {
                    rect3.set(i18, i26, i28, i29);
                    dVar.S = true;
                }
                dVar.i(z10);
            }
        }
    }

    public final void f() {
        CharSequence charSequence;
        if (this.f8771w != null && this.G && TextUtils.isEmpty(this.E.G)) {
            ViewGroup viewGroup = this.f8771w;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public int getCollapsedTitleGravity() {
        return this.E.f29430k;
    }

    public float getCollapsedTitleTextSize() {
        return this.E.f29434m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.E.f29448w;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.I;
    }

    public int getExpandedTitleGravity() {
        return this.E.f29428j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.C;
    }

    public int getExpandedTitleMarginEnd() {
        return this.B;
    }

    public int getExpandedTitleMarginStart() {
        return this.f8774z;
    }

    public int getExpandedTitleMarginTop() {
        return this.A;
    }

    public float getExpandedTitleTextSize() {
        return this.E.f29432l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.E.f29451z;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.E.f29443q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.E.f29427i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.E.f29427i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.E.f29427i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.E.f29437n0;
    }

    public int getScrimAlpha() {
        return this.K;
    }

    public long getScrimAnimationDuration() {
        return this.N;
    }

    public int getScrimVisibleHeightTrigger() {
        int i6;
        int i10 = this.Q;
        if (i10 >= 0) {
            return i10 + this.V + this.f8767a0;
        }
        s0 s0Var = this.U;
        if (s0Var != null) {
            i6 = s0Var.d();
        } else {
            i6 = 0;
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int d10 = d0.d.d(this);
        if (d10 > 0) {
            return Math.min((d10 * 2) + i6, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.J;
    }

    public CharSequence getTitle() {
        if (this.G) {
            return this.E.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.T;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.E.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.E.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z10 = true;
            if (this.T != 1) {
                z10 = false;
            }
            if (z10) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            setFitsSystemWindows(d0.d.b(appBarLayout));
            if (this.R == null) {
                this.R = new b();
            }
            appBarLayout.a(this.R);
            d0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.E.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        b bVar = this.R;
        if (bVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).B) != null) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        s0 s0Var = this.U;
        if (s0Var != null) {
            int d10 = s0Var.d();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (!d0.d.b(childAt) && childAt.getTop() < d10) {
                    d0.k(d10, childAt);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            k b10 = b(getChildAt(i14));
            View view = b10.f4244a;
            b10.f4245b = view.getTop();
            b10.f4246c = view.getLeft();
        }
        e(i6, i10, i11, i12, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i15 = 0; i15 < childCount3; i15++) {
            b(getChildAt(i15)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i10);
        s0 s0Var = this.U;
        if (s0Var != null) {
            i11 = s0Var.d();
        } else {
            i11 = 0;
        }
        if ((mode == 0 || this.W) && i11 > 0) {
            this.V = i11;
            super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i11, 1073741824));
        }
        if (this.f8768b0) {
            d dVar = this.E;
            if (dVar.f29437n0 > 1) {
                f();
                e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i12 = dVar.f29440p;
                if (i12 > 1) {
                    TextPaint textPaint = dVar.U;
                    textPaint.setTextSize(dVar.f29432l);
                    textPaint.setTypeface(dVar.f29451z);
                    textPaint.setLetterSpacing(dVar.f29423g0);
                    int i13 = i12 - 1;
                    this.f8767a0 = i13 * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i6, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f8767a0, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.f8771w;
        if (viewGroup != null) {
            View view = this.f8772x;
            if (view != null && view != this) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight2);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight = viewGroup.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        Drawable drawable = this.I;
        if (drawable != null) {
            ViewGroup viewGroup = this.f8771w;
            boolean z10 = true;
            if (this.T != 1) {
                z10 = false;
            }
            if (z10 && viewGroup != null && this.G) {
                i10 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i6, i10);
        }
    }

    public void setCollapsedTitleGravity(int i6) {
        this.E.l(i6);
    }

    public void setCollapsedTitleTextAppearance(int i6) {
        this.E.k(i6);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        d dVar = this.E;
        if (dVar.f29438o != colorStateList) {
            dVar.f29438o = colorStateList;
            dVar.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        d dVar = this.E;
        if (dVar.f29434m != f) {
            dVar.f29434m = f;
            dVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        d dVar = this.E;
        if (dVar.m(typeface)) {
            dVar.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.I;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.I = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f8771w;
                boolean z10 = true;
                if (this.T != 1) {
                    z10 = false;
                }
                if (z10 && viewGroup != null && this.G) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.I.setCallback(this);
                this.I.setAlpha(this.K);
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
        }
    }

    public void setContentScrimColor(int i6) {
        setContentScrim(new ColorDrawable(i6));
    }

    public void setContentScrimResource(int i6) {
        Context context = getContext();
        Object obj = g0.a.f16164a;
        setContentScrim(a.c.b(context, i6));
    }

    public void setExpandedTitleColor(int i6) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setExpandedTitleGravity(int i6) {
        d dVar = this.E;
        if (dVar.f29428j != i6) {
            dVar.f29428j = i6;
            dVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i6) {
        this.C = i6;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i6) {
        this.B = i6;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i6) {
        this.f8774z = i6;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i6) {
        this.A = i6;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i6) {
        this.E.n(i6);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        d dVar = this.E;
        if (dVar.f29436n != colorStateList) {
            dVar.f29436n = colorStateList;
            dVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        d dVar = this.E;
        if (dVar.f29432l != f) {
            dVar.f29432l = f;
            dVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        d dVar = this.E;
        if (dVar.o(typeface)) {
            dVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.f8768b0 = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.W = z10;
    }

    public void setHyphenationFrequency(int i6) {
        this.E.f29443q0 = i6;
    }

    public void setLineSpacingAdd(float f) {
        this.E.f29439o0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.E.f29441p0 = f;
    }

    public void setMaxLines(int i6) {
        d dVar = this.E;
        if (i6 != dVar.f29437n0) {
            dVar.f29437n0 = i6;
            Bitmap bitmap = dVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.K = null;
            }
            dVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.E.J = z10;
    }

    public void setScrimAlpha(int i6) {
        ViewGroup viewGroup;
        if (i6 != this.K) {
            if (this.I != null && (viewGroup = this.f8771w) != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.k(viewGroup);
            }
            this.K = i6;
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            d0.d.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.N = j10;
    }

    public void setScrimVisibleHeightTrigger(int i6) {
        if (this.Q != i6) {
            this.Q = i6;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        TimeInterpolator timeInterpolator;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int i6 = 0;
        if (d0.g.c(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.L != z10) {
            int i10 = 255;
            if (z11) {
                if (!z10) {
                    i10 = 0;
                }
                a();
                ValueAnimator valueAnimator = this.M;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.M = valueAnimator2;
                    if (i10 > this.K) {
                        timeInterpolator = this.O;
                    } else {
                        timeInterpolator = this.P;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.M.addUpdateListener(new g(this));
                } else if (valueAnimator.isRunning()) {
                    this.M.cancel();
                }
                this.M.setDuration(this.N);
                this.M.setIntValues(this.K, i10);
                this.M.start();
            } else {
                if (z10) {
                    i6 = 255;
                }
                setScrimAlpha(i6);
            }
            this.L = z10;
        }
    }

    public void setStaticLayoutBuilderConfigurer(c cVar) {
        d dVar = this.E;
        if (cVar != null) {
            dVar.i(true);
        } else {
            dVar.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.J;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.J = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.J.setState(getDrawableState());
                }
                Drawable drawable4 = this.J;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                k0.a.c(drawable4, d0.e.d(this));
                Drawable drawable5 = this.J;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.J.setCallback(this);
                this.J.setAlpha(this.K);
            }
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            d0.d.k(this);
        }
    }

    public void setStatusBarScrimColor(int i6) {
        setStatusBarScrim(new ColorDrawable(i6));
    }

    public void setStatusBarScrimResource(int i6) {
        Context context = getContext();
        Object obj = g0.a.f16164a;
        setStatusBarScrim(a.c.b(context, i6));
    }

    public void setTitle(CharSequence charSequence) {
        d dVar = this.E;
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
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i6) {
        boolean z10;
        this.T = i6;
        boolean z11 = true;
        if (i6 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.E.f29417c = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.T != 1) {
                z11 = false;
            }
            if (z11) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.I == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            nb.a aVar = this.F;
            setContentScrimColor(aVar.a(dimension, aVar.f25977d));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        d dVar = this.E;
        dVar.F = truncateAt;
        dVar.i(false);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.G) {
            this.G = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        d dVar = this.E;
        dVar.V = timeInterpolator;
        dVar.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        boolean z10;
        super.setVisibility(i6);
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.J;
        if (drawable != null && drawable.isVisible() != z10) {
            this.J.setVisible(z10, false);
        }
        Drawable drawable2 = this.I;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.I.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.I && drawable != this.J) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void setCollapsedTitleTextColor(int i6) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i6));
    }

    /* loaded from: classes.dex */
    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f8775a;

        /* renamed from: b  reason: collision with root package name */
        public float f8776b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8775a = 0;
            this.f8776b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f34129l);
            this.f8775a = obtainStyledAttributes.getInt(0, 0);
            this.f8776b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public a() {
            super(-1, -1);
            this.f8775a = 0;
            this.f8776b = 0.5f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8775a = 0;
            this.f8776b = 0.5f;
        }
    }
}
