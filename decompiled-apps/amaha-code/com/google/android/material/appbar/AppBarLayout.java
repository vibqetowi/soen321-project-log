package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bb.h;
import bb.i;
import bb.k;
import com.google.android.material.appbar.AppBarLayout;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import qb.t;
import t0.d0;
import t0.o;
import t0.o0;
import t0.s0;
import u0.h;
import ug.l;
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final /* synthetic */ int S = 0;
    public s0 A;
    public ArrayList B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public WeakReference<View> H;
    public final ColorStateList I;
    public ValueAnimator J;
    public bb.a K;
    public final ArrayList L;
    public final long M;
    public final TimeInterpolator N;
    public int[] O;
    public Drawable P;
    public final float Q;
    public Behavior R;

    /* renamed from: u  reason: collision with root package name */
    public int f8745u;

    /* renamed from: v  reason: collision with root package name */
    public int f8746v;

    /* renamed from: w  reason: collision with root package name */
    public int f8747w;

    /* renamed from: x  reason: collision with root package name */
    public int f8748x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8749y;

    /* renamed from: z  reason: collision with root package name */
    public int f8750z;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends h<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f8751j;

        /* renamed from: k  reason: collision with root package name */
        public int f8752k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f8753l;

        /* renamed from: m  reason: collision with root package name */
        public b f8754m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f8755n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f8756o;

        /* loaded from: classes.dex */
        public class a extends t0.a {
            public a() {
            }

            @Override // t0.a
            public final void d(View view, u0.h hVar) {
                this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
                hVar.k(BaseBehavior.this.f8756o);
                hVar.g(ScrollView.class.getName());
            }
        }

        public BaseBehavior() {
        }

        public static void k(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                    }
                } else if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        public static View l(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if ((childAt instanceof o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6, int i10, boolean z10) {
            View view;
            boolean z11;
            int abs = Math.abs(i6);
            int childCount = appBarLayout.getChildCount();
            boolean z12 = false;
            int i11 = 0;
            while (true) {
                if (i11 < childCount) {
                    view = appBarLayout.getChildAt(i11);
                    if (abs >= view.getTop() && abs <= view.getBottom()) {
                        break;
                    }
                    i11++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view != null) {
                int i12 = ((d) view.getLayoutParams()).f8764a;
                if ((i12 & 1) != 0) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    int d10 = d0.d.d(view);
                    if (i10 <= 0 || (i12 & 12) == 0 ? !((i12 & 2) == 0 || (-i6) < (view.getBottom() - d10) - appBarLayout.getTopInset()) : (-i6) >= (view.getBottom() - d10) - appBarLayout.getTopInset()) {
                        z11 = true;
                        if (appBarLayout.F) {
                            z11 = appBarLayout.g(l(coordinatorLayout));
                        }
                        boolean f = appBarLayout.f(z11);
                        if (!z10) {
                            if (f) {
                                List list = (List) ((t.h) coordinatorLayout.f1922v.f34632w).getOrDefault(appBarLayout, null);
                                ArrayList arrayList = coordinatorLayout.f1924x;
                                arrayList.clear();
                                if (list != null) {
                                    arrayList.addAll(list);
                                }
                                int size = arrayList.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size) {
                                        break;
                                    }
                                    CoordinatorLayout.c cVar = ((CoordinatorLayout.f) ((View) arrayList.get(i13)).getLayoutParams()).f1929a;
                                    if (cVar instanceof ScrollingViewBehavior) {
                                        if (((ScrollingViewBehavior) cVar).f != 0) {
                                            z12 = true;
                                        }
                                    } else {
                                        i13++;
                                    }
                                }
                                if (!z12) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        appBarLayout.jumpDrawablesToCurrentState();
                    }
                }
            }
            z11 = false;
            if (appBarLayout.F) {
            }
            boolean f2 = appBarLayout.f(z11);
            if (!z10) {
            }
            appBarLayout.jumpDrawablesToCurrentState();
        }

        @Override // bb.h
        public final boolean c(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f8755n;
            if (weakReference != null && ((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                return false;
            }
            return true;
        }

        @Override // bb.h
        public final int d(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // bb.h
        public final int e(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // bb.h
        public final int f() {
            return a() + this.f8751j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bb.h
        public final void g(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            o(coordinatorLayout, appBarLayout);
            if (appBarLayout.F) {
                appBarLayout.f(appBarLayout.g(l(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bb.h
        public final int h(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11) {
            int i12;
            boolean z10;
            int i13;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int f = f();
            int i14 = 0;
            if (i10 != 0 && f >= i10 && f <= i11) {
                int j10 = hc.d.j(i6, i10, i11);
                if (f != j10) {
                    if (appBarLayout.f8749y) {
                        int abs = Math.abs(j10);
                        int childCount = appBarLayout.getChildCount();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i15);
                            d dVar = (d) childAt.getLayoutParams();
                            Interpolator interpolator = dVar.f8766c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i16 = dVar.f8764a;
                                    if ((i16 & 1) != 0) {
                                        i13 = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + 0;
                                        if ((i16 & 2) != 0) {
                                            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                                            i13 -= d0.d.d(childAt);
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                                    if (d0.d.b(childAt)) {
                                        i13 -= appBarLayout.getTopInset();
                                    }
                                    if (i13 > 0) {
                                        float f2 = i13;
                                        i12 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(j10);
                                    }
                                }
                            } else {
                                i15++;
                            }
                        }
                    }
                    i12 = j10;
                    k kVar = this.f4242a;
                    if (kVar != null) {
                        z10 = kVar.b(i12);
                    } else {
                        this.f4243b = i12;
                        z10 = false;
                    }
                    int i17 = f - j10;
                    this.f8751j = j10 - i12;
                    int i18 = 1;
                    if (z10) {
                        for (int i19 = 0; i19 < appBarLayout.getChildCount(); i19++) {
                            d dVar2 = (d) appBarLayout.getChildAt(i19).getLayoutParams();
                            c cVar = dVar2.f8765b;
                            if (cVar != null && (dVar2.f8764a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                Rect rect = cVar.f8762a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect.top - Math.abs(a());
                                float f10 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / rect.height());
                                    if (abs3 >= 0.0f) {
                                        if (abs3 > 1.0f) {
                                            f10 = 1.0f;
                                        } else {
                                            f10 = abs3;
                                        }
                                    }
                                    float f11 = 1.0f - f10;
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (f11 * f11)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = cVar.f8763b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    WeakHashMap<View, o0> weakHashMap3 = d0.f32288a;
                                    d0.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, o0> weakHashMap4 = d0.f32288a;
                                    d0.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!z10 && appBarLayout.f8749y) {
                        coordinatorLayout.c(appBarLayout);
                    }
                    appBarLayout.d(a());
                    if (j10 < f) {
                        i18 = -1;
                    }
                    q(coordinatorLayout, appBarLayout, j10, i18, false);
                    i14 = i17;
                }
            } else {
                this.f8751j = 0;
            }
            p(coordinatorLayout, appBarLayout);
            return i14;
        }

        public final void j(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i6) {
            int height;
            int abs = Math.abs(f() - i6);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int f = f();
            if (f == i6) {
                ValueAnimator valueAnimator = this.f8753l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f8753l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f8753l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f8753l = valueAnimator3;
                valueAnimator3.setInterpolator(ab.a.f453e);
                this.f8753l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f8753l.setDuration(Math.min(height, 600));
            this.f8753l.setIntValues(f, i6);
            this.f8753l.start();
        }

        public final void m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6, int[] iArr) {
            int i10;
            int i11;
            if (i6 != 0) {
                if (i6 < 0) {
                    int i12 = -appBarLayout.getTotalScrollRange();
                    i10 = i12;
                    i11 = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i10 = -appBarLayout.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                if (i10 != i11) {
                    iArr[1] = h(coordinatorLayout, appBarLayout, f() - i6, i10, i11);
                }
            }
            if (appBarLayout.F) {
                appBarLayout.f(appBarLayout.g(view));
            }
        }

        public final b n(Parcelable parcelable, T t3) {
            boolean z10;
            boolean z11;
            int a10 = a();
            int childCount = t3.getChildCount();
            boolean z12 = false;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = t3.getChildAt(i6);
                int bottom = childAt.getBottom() + a10;
                if (childAt.getTop() + a10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = z0.a.f39112v;
                    }
                    b bVar = new b(parcelable);
                    if (a10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f8759x = z10;
                    if (!z10 && (-a10) >= t3.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.f8758w = z11;
                    bVar.f8760y = i6;
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    if (bottom == t3.getTopInset() + d0.d.d(childAt)) {
                        z12 = true;
                    }
                    bVar.A = z12;
                    bVar.f8761z = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void o(CoordinatorLayout coordinatorLayout, T t3) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int paddingTop = t3.getPaddingTop() + t3.getTopInset();
            int f = f() - paddingTop;
            int childCount = t3.getChildCount();
            int i6 = 0;
            while (true) {
                z10 = true;
                if (i6 < childCount) {
                    View childAt = t3.getChildAt(i6);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    d dVar = (d) childAt.getLayoutParams();
                    if ((dVar.f8764a & 32) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    int i10 = -f;
                    if (top <= i10 && bottom >= i10) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            if (i6 >= 0) {
                View childAt2 = t3.getChildAt(i6);
                d dVar2 = (d) childAt2.getLayoutParams();
                int i11 = dVar2.f8764a;
                if ((i11 & 17) == 17) {
                    int i12 = -childAt2.getTop();
                    int i13 = -childAt2.getBottom();
                    if (i6 == 0) {
                        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        if (d0.d.b(t3) && d0.d.b(childAt2)) {
                            i12 -= t3.getTopInset();
                        }
                    }
                    if ((i11 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                        i13 += d0.d.d(childAt2);
                    } else {
                        if ((i11 & 5) == 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, o0> weakHashMap3 = d0.f32288a;
                            int d10 = d0.d.d(childAt2) + i13;
                            if (f < d10) {
                                i12 = d10;
                            } else {
                                i13 = d10;
                            }
                        }
                    }
                    if ((i11 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i12 += ((LinearLayout.LayoutParams) dVar2).topMargin;
                        i13 -= ((LinearLayout.LayoutParams) dVar2).bottomMargin;
                    }
                    if (f < (i13 + i12) / 2) {
                        i12 = i13;
                    }
                    j(coordinatorLayout, t3, hc.d.j(i12 + paddingTop, -t3.getTotalScrollRange(), 0));
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v12, types: [bb.c] */
        @Override // bb.j, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i6) {
            boolean z10;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i6);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f8754m;
            if (bVar != null && (pendingAction & 8) == 0) {
                if (bVar.f8758w) {
                    i(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (bVar.f8759x) {
                    i(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(bVar.f8760y);
                    int i10 = -childAt.getBottom();
                    if (this.f8754m.A) {
                        round = appBarLayout.getTopInset() + d0.d.d(childAt) + i10;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f8754m.f8761z) + i10;
                    }
                    i(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i11 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        j(coordinatorLayout, appBarLayout, i11);
                    } else {
                        i(coordinatorLayout, appBarLayout, i11);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        j(coordinatorLayout, appBarLayout, 0);
                    } else {
                        i(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f8750z = 0;
            this.f8754m = null;
            int j10 = hc.d.j(a(), -appBarLayout.getTotalScrollRange(), 0);
            k kVar = this.f4242a;
            if (kVar != null) {
                kVar.b(j10);
            } else {
                this.f4243b = j10;
            }
            q(coordinatorLayout, appBarLayout, a(), 0, true);
            appBarLayout.d(a());
            p(coordinatorLayout, appBarLayout);
            final View l2 = l(coordinatorLayout);
            if (l2 != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    l2.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: bb.c
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = l2;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.k(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    l2.setOnKeyListener(new View.OnKeyListener() { // from class: bb.d
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i12, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.k(keyEvent, l2, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i6, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.m(appBarLayout, i6, i10, View.MeasureSpec.makeMeasureSpec(0, 0), i12);
                return true;
            }
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i6, i10, i11, i12);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10, int[] iArr, int i11) {
            m(coordinatorLayout, (AppBarLayout) view, view2, i10, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = h(coordinatorLayout, appBarLayout, f() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                p(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                b bVar2 = this.f8754m;
                this.f8754m = bVar;
                super.onRestoreInstanceState(coordinatorLayout, appBarLayout, bVar.f39113u);
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
            this.f8754m = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            b n10 = n(onSaveInstanceState, appBarLayout);
            if (n10 != null) {
                return n10;
            }
            return onSaveInstanceState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i10) {
            ValueAnimator valueAnimator;
            boolean z10;
            boolean z11;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i11 = i6 & 2;
            boolean z12 = false;
            if (i11 != 0) {
                if (!appBarLayout.F) {
                    if (appBarLayout.getTotalScrollRange() != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                z12 = true;
            }
            if (z12 && (valueAnimator = this.f8753l) != null) {
                valueAnimator.cancel();
            }
            this.f8755n = null;
            this.f8752k = i10;
            return z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f8752k == 0 || i6 == 1) {
                o(coordinatorLayout, appBarLayout);
                if (appBarLayout.F) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.f8755n = new WeakReference<>(view2);
        }

        public final void p(CoordinatorLayout coordinatorLayout, T t3) {
            View view;
            boolean z10;
            boolean z11;
            boolean z12;
            d0.n(h.a.f33736h.a(), coordinatorLayout);
            boolean z13 = false;
            d0.i(0, coordinatorLayout);
            d0.n(h.a.f33737i.a(), coordinatorLayout);
            d0.i(0, coordinatorLayout);
            if (t3.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount) {
                    view = coordinatorLayout.getChildAt(i6);
                    if (((CoordinatorLayout.f) view.getLayoutParams()).f1929a instanceof ScrollingViewBehavior) {
                        break;
                    }
                    i6++;
                } else {
                    view = null;
                    break;
                }
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t3.getChildCount();
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 < childCount2) {
                    if (((d) t3.getChildAt(i10).getLayoutParams()).f8764a != 0) {
                        z11 = true;
                        break;
                    }
                    i10++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return;
            }
            if (d0.d(coordinatorLayout) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                d0.q(coordinatorLayout, new a());
            }
            if (f() != (-t3.getTotalScrollRange())) {
                d0.o(coordinatorLayout, h.a.f33736h, new com.google.android.material.appbar.c(t3, false));
                z13 = true;
            }
            if (f() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i11 = -t3.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        d0.o(coordinatorLayout, h.a.f33737i, new com.google.android.material.appbar.b(this, coordinatorLayout, t3, view2, i11));
                    }
                } else {
                    d0.o(coordinatorLayout, h.a.f33737i, new com.google.android.material.appbar.c(t3, true));
                }
                this.f8756o = z10;
            }
            z10 = z13;
            this.f8756o = z10;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* loaded from: classes.dex */
        public static class b extends z0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();
            public boolean A;

            /* renamed from: w  reason: collision with root package name */
            public boolean f8758w;

            /* renamed from: x  reason: collision with root package name */
            public boolean f8759x;

            /* renamed from: y  reason: collision with root package name */
            public int f8760y;

            /* renamed from: z  reason: collision with root package name */
            public float f8761z;

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
                this.f8758w = parcel.readByte() != 0;
                this.f8759x = parcel.readByte() != 0;
                this.f8760y = parcel.readInt();
                this.f8761z = parcel.readFloat();
                this.A = parcel.readByte() != 0;
            }

            @Override // z0.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i6) {
                parcel.writeParcelable(this.f39113u, i6);
                parcel.writeByte(this.f8758w ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f8759x ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f8760y);
                parcel.writeFloat(this.f8761z);
                parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends i {
        public ScrollingViewBehavior() {
        }

        @Override // bb.i
        public final AppBarLayout c(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = (View) arrayList.get(i6);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // bb.i
        public final float d(View view) {
            int i6;
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1929a;
                if (cVar instanceof BaseBehavior) {
                    i6 = ((BaseBehavior) cVar).f();
                } else {
                    i6 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i6 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i6 / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // bb.i
        public final int e(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int j10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1929a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f8751j + this.f4241e;
                if (this.f == 0) {
                    j10 = 0;
                } else {
                    float d10 = d(view2);
                    int i6 = this.f;
                    j10 = hc.d.j((int) (d10 * i6), 0, i6);
                }
                d0.k(bottom - j10, view);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.F) {
                    appBarLayout.f(appBarLayout.g(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                d0.n(h.a.f33736h.a(), coordinatorLayout);
                d0.i(0, coordinatorLayout);
                d0.n(h.a.f33737i.a(), coordinatorLayout);
                d0.i(0, coordinatorLayout);
                d0.q(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList e10 = coordinatorLayout.e(view);
            int size = e10.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    View view2 = (View) e10.get(i6);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i6++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f4239c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    appBarLayout.e(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.H);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public interface a<T extends AppBarLayout> {
        void a(T t3, int i6);
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    /* loaded from: classes.dex */
    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f8762a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f8763b = new Rect();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes.dex */
    public interface f extends a<AppBarLayout> {
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(fc.a.a(context, attributeSet, R.attr.appBarLayoutStyle, 2132083616), attributeSet, R.attr.appBarLayoutStyle);
        int i6;
        this.f8746v = -1;
        this.f8747w = -1;
        this.f8748x = -1;
        this.f8750z = 0;
        this.L = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i10 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d10 = t.d(context3, attributeSet, bb.l.f4248a, R.attr.appBarLayoutStyle, 2132083616, new int[0]);
        try {
            if (d10.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d10.getResourceId(0, 0)));
            }
            d10.recycle();
            TypedArray d11 = t.d(context2, attributeSet, l.f34120b, R.attr.appBarLayoutStyle, 2132083616, new int[0]);
            Drawable drawable = d11.getDrawable(0);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.q(this, drawable);
            ColorStateList a10 = ub.d.a(context2, d11, 6);
            this.I = a10;
            if (getBackground() instanceof ColorDrawable) {
                yb.f fVar = new yb.f();
                fVar.k(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                if (a10 != null) {
                    if (this.E) {
                        i6 = 255;
                    } else {
                        i6 = 0;
                    }
                    fVar.setAlpha(i6);
                    fVar.k(a10);
                    this.K = new bb.a(this, 0, fVar);
                } else {
                    fVar.i(context2);
                    this.K = new bb.a(this, 1, fVar);
                }
                d0.d.q(this, fVar);
            }
            this.M = rb.a.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.N = rb.a.d(context2, R.attr.motionEasingStandardInterpolator, ab.a.f449a);
            if (d11.hasValue(4)) {
                e(d11.getBoolean(4, false), false, false);
            }
            if (d11.hasValue(3)) {
                bb.l.a(this, d11.getDimensionPixelSize(3, 0));
            }
            if (i10 >= 26) {
                if (d11.hasValue(2)) {
                    setKeyboardNavigationCluster(d11.getBoolean(2, false));
                }
                if (d11.hasValue(1)) {
                    setTouchscreenBlocksFocus(d11.getBoolean(1, false));
                }
            }
            this.Q = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.F = d11.getBoolean(5, false);
            this.G = d11.getResourceId(7, -1);
            setStatusBarForeground(d11.getDrawable(8));
            d11.recycle();
            d0.i.u(this, new bb.b(this));
        } catch (Throwable th2) {
            d10.recycle();
            throw th2;
        }
    }

    public static d b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public final void a(f fVar) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        if (fVar != null && !this.B.contains(fVar)) {
            this.B.add(fVar);
        }
    }

    public final void c() {
        BaseBehavior.b bVar;
        Behavior behavior = this.R;
        if (behavior != null && this.f8746v != -1 && this.f8750z == 0) {
            bVar = behavior.n(z0.a.f39112v, this);
        } else {
            bVar = null;
        }
        this.f8746v = -1;
        this.f8747w = -1;
        this.f8748x = -1;
        if (bVar != null) {
            Behavior behavior2 = this.R;
            if (behavior2.f8754m == null) {
                behavior2.f8754m = bVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d(int i6) {
        this.f8745u = i6;
        if (!willNotDraw()) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
        }
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.B.get(i10);
                if (aVar != null) {
                    aVar.a(this, i6);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.P != null && getTopInset() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f8745u);
            this.P.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.P;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        int i6;
        int i10;
        if (z10) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        int i11 = 0;
        if (z11) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i12 = i6 | i10;
        if (z12) {
            i11 = 8;
        }
        this.f8750z = i12 | i11;
        requestLayout();
    }

    public final boolean f(boolean z10) {
        float f2;
        float f10;
        if ((!this.C) && this.E != z10) {
            this.E = z10;
            refreshDrawableState();
            if (!this.F || !(getBackground() instanceof yb.f)) {
                return true;
            }
            float f11 = 0.0f;
            if (this.I != null) {
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 255.0f;
                }
                if (z10) {
                    f11 = 255.0f;
                }
                i(f10, f11);
                return true;
            }
            float f12 = this.Q;
            if (z10) {
                f2 = 0.0f;
            } else {
                f2 = f12;
            }
            if (z10) {
                f11 = f12;
            }
            i(f2, f11);
            return true;
        }
        return false;
    }

    public final boolean g(View view) {
        int i6;
        View view2;
        View view3 = null;
        if (this.H == null && (i6 = this.G) != -1) {
            if (view != null) {
                view2 = view.findViewById(i6);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.G);
            }
            if (view2 != null) {
                this.H = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.H;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.R = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getDownNestedPreScrollRange() {
        int i6;
        int d10;
        int i10 = this.f8747w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f8764a;
                if ((i12 & 5) == 5) {
                    int i13 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        d10 = d0.d.d(childAt);
                    } else if ((i12 & 2) != 0) {
                        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                        d10 = measuredHeight - d0.d.d(childAt);
                    } else {
                        i6 = i13 + measuredHeight;
                        if (childCount == 0) {
                            WeakHashMap<View, o0> weakHashMap3 = d0.f32288a;
                            if (d0.d.b(childAt)) {
                                i6 = Math.min(i6, measuredHeight - getTopInset());
                            }
                        }
                        i11 += i6;
                    }
                    i6 = d10 + i13;
                    if (childCount == 0) {
                    }
                    i11 += i6;
                } else if (i11 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i11);
        this.f8747w = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i6 = this.f8748x;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + childAt.getMeasuredHeight();
                int i12 = dVar.f8764a;
                if ((i12 & 1) == 0) {
                    break;
                }
                i11 += measuredHeight;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    i11 -= d0.d.d(childAt);
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f8748x = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.G;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int d10 = d0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = d0.d.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f8750z;
    }

    public Drawable getStatusBarForeground() {
        return this.P;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        s0 s0Var = this.A;
        if (s0Var != null) {
            return s0Var.d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i6 = this.f8746v;
        if (i6 != -1) {
            return i6;
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f8764a;
                if ((i12 & 1) == 0) {
                    break;
                }
                int i13 = measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin + i11;
                if (i10 == 0) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    if (d0.d.b(childAt)) {
                        i13 -= getTopInset();
                    }
                }
                i11 = i13;
                if ((i12 & 2) != 0) {
                    WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                    i11 -= d0.d.d(childAt);
                    break;
                }
            }
            i10++;
        }
        int max = Math.max(0, i11);
        this.f8746v = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.b(childAt)) {
            return false;
        }
        return true;
    }

    public final void i(float f2, float f10) {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f10);
        this.J = ofFloat;
        ofFloat.setDuration(this.M);
        this.J.setInterpolator(this.N);
        bb.a aVar = this.K;
        if (aVar != null) {
            this.J.addUpdateListener(aVar);
        }
        this.J.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6.b.Q0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.O == null) {
            this.O = new int[4];
        }
        int[] iArr = this.O;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + iArr.length);
        boolean z10 = this.D;
        if (z10) {
            i10 = R.attr.state_liftable;
        } else {
            i10 = -2130969934;
        }
        iArr[0] = i10;
        if (z10 && this.E) {
            i11 = R.attr.state_lifted;
        } else {
            i11 = -2130969935;
        }
        iArr[1] = i11;
        if (z10) {
            i12 = R.attr.state_collapsible;
        } else {
            i12 = -2130969927;
        }
        iArr[2] = i12;
        if (z10 && this.E) {
            i13 = R.attr.state_collapsed;
        } else {
            i13 = -2130969926;
        }
        iArr[3] = i13;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.H;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i6, i10, i11, i12);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        boolean z13 = true;
        if (d0.d.b(this) && h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                d0.k(topInset, getChildAt(childCount));
            }
        }
        c();
        this.f8749y = false;
        int childCount2 = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount2) {
                break;
            } else if (((d) getChildAt(i13).getLayoutParams()).f8766c != null) {
                this.f8749y = true;
                break;
            } else {
                i13++;
            }
        }
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.C) {
            if (!this.F) {
                int childCount3 = getChildCount();
                int i14 = 0;
                while (true) {
                    if (i14 < childCount3) {
                        int i15 = ((d) getChildAt(i14).getLayoutParams()).f8764a;
                        if ((i15 & 1) == 1 && (i15 & 10) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i14++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    z13 = false;
                }
            }
            if (this.D != z13) {
                this.D = z13;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.d.b(this) && h()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = hc.d.j(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i10));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        f6.b.O0(this, f2);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        e(z10, d0.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.F = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.G = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.H;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.H = null;
            return;
        }
        this.H = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i6) {
        this.G = i6;
        WeakReference<View> weakReference = this.H;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.H = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.C = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i6) {
        if (i6 == 1) {
            super.setOrientation(i6);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.P;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.P = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.P.setState(getDrawableState());
                }
                Drawable drawable4 = this.P;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                k0.a.c(drawable4, d0.e.d(this));
                Drawable drawable5 = this.P;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.P.setCallback(this);
            }
            if (this.P != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            d0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i6) {
        setStatusBarForeground(new ColorDrawable(i6));
    }

    public void setStatusBarForegroundResource(int i6) {
        setStatusBarForeground(hc.d.H(getContext(), i6));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        bb.l.a(this, f2);
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
        Drawable drawable = this.P;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.P) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class d extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f8764a;

        /* renamed from: b  reason: collision with root package name */
        public c f8765b;

        /* renamed from: c  reason: collision with root package name */
        public final Interpolator f8766c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8764a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f34121c);
            this.f8764a = obtainStyledAttributes.getInt(1, 0);
            this.f8765b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new c();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f8766c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public d() {
            super(-1, -2);
            this.f8764a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8764a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8764a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8764a = 1;
        }
    }
}
