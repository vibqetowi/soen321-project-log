package com.google.android.material.sidesheet;

import a1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.theinnerhour.b2b.R;
import hc.d;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o7.k;
import t0.d0;
import t0.o0;
import u0.h;
import ug.l;
import yb.f;
import yb.i;
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public zb.a f9107a;

    /* renamed from: b  reason: collision with root package name */
    public f f9108b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f9109c;

    /* renamed from: d  reason: collision with root package name */
    public final i f9110d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f9111e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9112g;

    /* renamed from: h  reason: collision with root package name */
    public int f9113h;

    /* renamed from: i  reason: collision with root package name */
    public a1.c f9114i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9115j;

    /* renamed from: k  reason: collision with root package name */
    public final float f9116k;

    /* renamed from: l  reason: collision with root package name */
    public int f9117l;

    /* renamed from: m  reason: collision with root package name */
    public int f9118m;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference<V> f9119n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<View> f9120o;

    /* renamed from: p  reason: collision with root package name */
    public int f9121p;

    /* renamed from: q  reason: collision with root package name */
    public VelocityTracker f9122q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashSet f9123s;

    /* renamed from: t  reason: collision with root package name */
    public final a f9124t;

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0004c {
        public a() {
        }

        @Override // a1.c.AbstractC0004c
        public final int a(View view, int i6) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return d.j(i6, sideSheetBehavior.f9107a.a(), sideSheetBehavior.f9118m);
        }

        @Override // a1.c.AbstractC0004c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // a1.c.AbstractC0004c
        public final int c(View view) {
            return SideSheetBehavior.this.f9118m;
        }

        @Override // a1.c.AbstractC0004c
        public final void h(int i6) {
            if (i6 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f9112g) {
                    sideSheetBehavior.setStateInternal(1);
                }
            }
        }

        @Override // a1.c.AbstractC0004c
        public final void i(View view, int i6, int i10) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f9120o;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                zb.a aVar = sideSheetBehavior.f9107a;
                int left = view.getLeft();
                view.getRight();
                int i11 = aVar.f39358a.f9118m;
                if (left <= i11) {
                    marginLayoutParams.rightMargin = i11 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet<zb.b> linkedHashSet = sideSheetBehavior.f9123s;
            if (!linkedHashSet.isEmpty()) {
                zb.a aVar2 = sideSheetBehavior.f9107a;
                int i12 = aVar2.f39358a.f9118m;
                aVar2.a();
                for (zb.b bVar : linkedHashSet) {
                    bVar.b();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
            if (r7 != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
            if (r7 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            if (java.lang.Math.abs(r10 - r1.a()) < java.lang.Math.abs(r10 - r5.f9118m)) goto L34;
         */
        @Override // a1.c.AbstractC0004c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(View view, float f, float f2) {
            int i6;
            boolean z10;
            boolean z11;
            boolean z12;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            zb.a aVar = sideSheetBehavior.f9107a;
            aVar.getClass();
            if (f >= 0.0f) {
                SideSheetBehavior<? extends View> sideSheetBehavior2 = aVar.f39358a;
                boolean z13 = false;
                if (Math.abs((sideSheetBehavior2.f9116k * f) + view.getRight()) > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (Math.abs(f) > Math.abs(f2)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && f2 > 500) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (view.getLeft() > (sideSheetBehavior2.f9118m - aVar.a()) / 2) {
                            z13 = true;
                        }
                    }
                    i6 = 5;
                } else {
                    if (f != 0.0f) {
                        if (Math.abs(f) > Math.abs(f2)) {
                            z13 = true;
                        }
                    }
                    int left = view.getLeft();
                }
                sideSheetBehavior.startSettling(view, i6, true);
            }
            i6 = 3;
            sideSheetBehavior.startSettling(view, i6, true);
        }

        @Override // a1.c.AbstractC0004c
        public final boolean k(int i6, View view) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f9113h == 1 || (weakReference = sideSheetBehavior.f9119n) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f9127a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9128b;

        /* renamed from: c  reason: collision with root package name */
        public final androidx.activity.b f9129c = new androidx.activity.b(26, this);

        public c() {
        }

        public final void a(int i6) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f9119n;
            if (weakReference != null && weakReference.get() != null) {
                this.f9127a = i6;
                if (!this.f9128b) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.m(sideSheetBehavior.f9119n.get(), this.f9129c);
                    this.f9128b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f9111e = new c();
        this.f9112g = true;
        this.f9113h = 5;
        this.f9116k = 0.1f;
        this.f9121p = -1;
        this.f9123s = new LinkedHashSet();
        this.f9124t = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.f9119n = null;
        this.f9114i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f9119n = null;
        this.f9114i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        a1.c cVar;
        VelocityTracker velocityTracker;
        if ((v10.isShown() || d0.e(v10) != null) && this.f9112g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f9115j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f9122q) != null) {
            velocityTracker.recycle();
            this.f9122q = null;
        }
        if (this.f9122q == null) {
            this.f9122q = VelocityTracker.obtain();
        }
        this.f9122q.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f9115j) {
                this.f9115j = false;
                return false;
            }
        } else {
            this.r = (int) motionEvent.getX();
        }
        if (!this.f9115j && (cVar = this.f9114i) != null && cVar.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i6) {
        int i10;
        View findViewById;
        int i11;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.b(coordinatorLayout) && !d0.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.f9119n == null) {
            this.f9119n = new WeakReference<>(v10);
            f fVar = this.f9108b;
            if (fVar != null) {
                d0.d.q(v10, fVar);
                f fVar2 = this.f9108b;
                float f = this.f;
                if (f == -1.0f) {
                    f = d0.i.i(v10);
                }
                fVar2.j(f);
            } else {
                ColorStateList colorStateList = this.f9109c;
                if (colorStateList != null) {
                    d0.s(v10, colorStateList);
                }
            }
            if (this.f9113h == 5) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            if (v10.getVisibility() != i11) {
                v10.setVisibility(i11);
            }
            updateAccessibilityActions();
            if (d0.d.c(v10) == 0) {
                d0.d.s(v10, 1);
            }
            if (d0.e(v10) == null) {
                d0.r(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        if (this.f9114i == null) {
            this.f9114i = new a1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f9124t);
        }
        this.f9107a.getClass();
        int left = v10.getLeft();
        coordinatorLayout.l(i6, v10);
        this.f9118m = coordinatorLayout.getWidth();
        this.f9117l = v10.getWidth();
        int i13 = this.f9113h;
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                if (i13 == 5) {
                    i12 = this.f9107a.f39358a.f9118m;
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f9113h);
                }
            }
        } else {
            this.f9107a.getClass();
            i12 = left - v10.getLeft();
        }
        d0.j(i12, v10);
        if (this.f9120o == null && (i10 = this.f9121p) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f9120o = new WeakReference<>(findViewById);
        }
        for (zb.b bVar : this.f9123s) {
            if (bVar instanceof zb.d) {
                ((zb.d) bVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i6, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        b bVar = (b) parcelable;
        Parcelable parcelable2 = bVar.f39113u;
        if (parcelable2 != null) {
            super.onRestoreInstanceState(coordinatorLayout, v10, parcelable2);
        }
        int i6 = bVar.f9126w;
        this.f9113h = (i6 == 1 || i6 == 2) ? 5 : 5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new b(super.onSaveInstanceState(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        boolean z13 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i6 = this.f9113h;
        if (i6 == 1 && actionMasked == 0) {
            return true;
        }
        a1.c cVar = this.f9114i;
        if (cVar != null && (this.f9112g || i6 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f9122q) != null) {
            velocityTracker.recycle();
            this.f9122q = null;
        }
        if (this.f9122q == null) {
            this.f9122q = VelocityTracker.obtain();
        }
        this.f9122q.addMovement(motionEvent);
        a1.c cVar2 = this.f9114i;
        if (cVar2 != null && (this.f9112g || this.f9113h == 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && actionMasked == 2 && !this.f9115j) {
            if (cVar2 != null && (this.f9112g || this.f9113h == 1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && Math.abs(this.r - motionEvent.getX()) > this.f9114i.f147b) {
                z13 = true;
            }
            if (z13) {
                this.f9114i.b(motionEvent.getPointerId(motionEvent.getActionIndex()), v10);
            }
        }
        return !this.f9115j;
    }

    public final void setStateInternal(int i6) {
        V v10;
        int i10;
        if (this.f9113h == i6) {
            return;
        }
        this.f9113h = i6;
        WeakReference<V> weakReference = this.f9119n;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (this.f9113h == 5) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (v10.getVisibility() != i10) {
            v10.setVisibility(i10);
        }
        for (zb.b bVar : this.f9123s) {
            bVar.a();
        }
        updateAccessibilityActions();
    }

    public final void startSettling(View view, int i6, boolean z10) {
        int a10;
        boolean z11;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f9107a.f39358a;
        if (i6 != 3) {
            if (i6 == 5) {
                a10 = sideSheetBehavior.f9107a.f39358a.f9118m;
            } else {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(defpackage.c.p("Invalid state to get outward edge offset: ", i6));
            }
        } else {
            a10 = sideSheetBehavior.f9107a.a();
        }
        a1.c cVar = sideSheetBehavior.f9114i;
        if (cVar != null && (!z10 ? cVar.s(view, a10, view.getTop()) : cVar.q(a10, view.getTop()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setStateInternal(2);
            this.f9111e.a(i6);
            return;
        }
        setStateInternal(i6);
    }

    public final void updateAccessibilityActions() {
        V v10;
        WeakReference<V> weakReference = this.f9119n;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        d0.n(262144, v10);
        d0.i(0, v10);
        d0.n(1048576, v10);
        d0.i(0, v10);
        if (this.f9113h != 5) {
            d0.o(v10, h.a.f33740l, new k(5, this));
        }
        if (this.f9113h != 3) {
            d0.o(v10, h.a.f33738j, new k(3, this));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends z0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public final int f9126w;

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
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f9126w = parcel.readInt();
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f9126w);
        }

        public b(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f9126w = sideSheetBehavior.f9113h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9111e = new c();
        this.f9112g = true;
        this.f9113h = 5;
        this.f9116k = 0.1f;
        this.f9121p = -1;
        this.f9123s = new LinkedHashSet();
        this.f9124t = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.K);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f9109c = ub.d.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f9110d = new i(i.b(context, attributeSet, 0, 2132083760));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f9121p = resourceId;
            WeakReference<View> weakReference = this.f9120o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f9120o = null;
            WeakReference<V> weakReference2 = this.f9119n;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    if (d0.g.c(v10)) {
                        v10.requestLayout();
                    }
                }
            }
        }
        i iVar = this.f9110d;
        if (iVar != null) {
            f fVar = new f(iVar);
            this.f9108b = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f9109c;
            if (colorStateList != null) {
                this.f9108b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f9108b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f9112g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f9107a == null) {
            this.f9107a = new zb.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
