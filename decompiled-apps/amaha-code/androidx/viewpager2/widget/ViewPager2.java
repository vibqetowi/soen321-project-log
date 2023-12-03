package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import androidx.viewpager2.widget.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s1.s;
import t0.d0;
import t0.o0;
import u0.h;
import u0.l;
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public d A;
    public int B;
    public Parcelable C;
    public i D;
    public h E;
    public androidx.viewpager2.widget.c F;
    public androidx.viewpager2.widget.a G;
    public s H;
    public androidx.viewpager2.widget.b I;
    public RecyclerView.j J;
    public boolean K;
    public boolean L;
    public int M;
    public f N;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f3151u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f3152v;

    /* renamed from: w  reason: collision with root package name */
    public final androidx.viewpager2.widget.a f3153w;

    /* renamed from: x  reason: collision with root package name */
    public int f3154x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3155y;

    /* renamed from: z  reason: collision with root package name */
    public final a f3156z;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super(0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3155y = true;
            viewPager2.F.f3182l = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.g {
        public c(int i6) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i6, int i10, Bundle bundle) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i6, int i10) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i6, int i10) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i6, int i10) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        public d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(yVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void onInitializeAccessibilityNodeInfo(RecyclerView.t tVar, RecyclerView.y yVar, u0.h hVar) {
            super.onInitializeAccessibilityNodeInfo(tVar, yVar, hVar);
            ViewPager2.this.N.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean performAccessibilityAction(RecyclerView.t tVar, RecyclerView.y yVar, int i6, Bundle bundle) {
            ViewPager2.this.N.getClass();
            return super.performAccessibilityAction(tVar, yVar, i6, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f3159a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f3160b = new b();

        /* renamed from: c  reason: collision with root package name */
        public androidx.viewpager2.widget.f f3161c;

        /* loaded from: classes.dex */
        public class a implements l {
            public a() {
            }

            @Override // u0.l
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.L) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements l {
            public b() {
            }

            @Override // u0.l
            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.L) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.s(recyclerView, 2);
            this.f3161c = new androidx.viewpager2.widget.f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (d0.d.c(viewPager2) == 0) {
                d0.d.s(viewPager2, 1);
            }
        }

        public final void b() {
            int f;
            int i6;
            int i10 = 16908360;
            ViewPager2 viewPager2 = ViewPager2.this;
            d0.n(16908360, viewPager2);
            boolean z10 = false;
            d0.i(0, viewPager2);
            d0.n(16908361, viewPager2);
            d0.i(0, viewPager2);
            d0.n(16908358, viewPager2);
            d0.i(0, viewPager2);
            d0.n(16908359, viewPager2);
            d0.i(0, viewPager2);
            if (viewPager2.getAdapter() == null || (f = viewPager2.getAdapter().f()) == 0 || !viewPager2.L) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            b bVar = this.f3160b;
            a aVar = this.f3159a;
            if (orientation == 0) {
                if (viewPager2.A.getLayoutDirection() == 1) {
                    z10 = true;
                }
                if (z10) {
                    i6 = 16908360;
                } else {
                    i6 = 16908361;
                }
                if (z10) {
                    i10 = 16908361;
                }
                if (viewPager2.f3154x < f - 1) {
                    d0.o(viewPager2, new h.a(i6), aVar);
                }
                if (viewPager2.f3154x > 0) {
                    d0.o(viewPager2, new h.a(i10), bVar);
                    return;
                }
                return;
            }
            if (viewPager2.f3154x < f - 1) {
                d0.o(viewPager2, new h.a(16908359), aVar);
            }
            if (viewPager2.f3154x > 0) {
                d0.o(viewPager2, new h.a(16908358), bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends w {
        public h() {
        }

        @Override // androidx.recyclerview.widget.w, androidx.recyclerview.widget.c0
        public final View d(RecyclerView.m mVar) {
            if (((androidx.viewpager2.widget.c) ViewPager2.this.H.f31225w).f3183m) {
                return null;
            }
            return super.d(mVar);
        }
    }

    /* loaded from: classes.dex */
    public class i extends RecyclerView {
        public i(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.N.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f3154x);
            accessibilityEvent.setToIndex(viewPager2.f3154x);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.L && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.L && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class k implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final int f3169u;

        /* renamed from: v  reason: collision with root package name */
        public final RecyclerView f3170v;

        public k(int i6, RecyclerView recyclerView) {
            this.f3169u = i6;
            this.f3170v = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3170v.l0(this.f3169u);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3151u = new Rect();
        this.f3152v = new Rect();
        androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
        this.f3153w = aVar;
        this.f3155y = false;
        this.f3156z = new a();
        this.B = -1;
        this.J = null;
        this.K = false;
        this.L = true;
        this.M = -1;
        this.N = new f();
        i iVar = new i(context);
        this.D = iVar;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        iVar.setId(d0.e.a());
        this.D.setDescendantFocusability(131072);
        d dVar = new d(context);
        this.A = dVar;
        this.D.setLayoutManager(dVar);
        this.D.setScrollingTouchSlop(1);
        int[] iArr = sc.b.L;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.D.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.D;
            m2.c cVar = new m2.c();
            if (iVar2.f2712a0 == null) {
                iVar2.f2712a0 = new ArrayList();
            }
            iVar2.f2712a0.add(cVar);
            androidx.viewpager2.widget.c cVar2 = new androidx.viewpager2.widget.c(this);
            this.F = cVar2;
            this.H = new s(1, this, cVar2, this.D);
            h hVar = new h();
            this.E = hVar;
            hVar.a(this.D);
            this.D.i(this.F);
            androidx.viewpager2.widget.a aVar2 = new androidx.viewpager2.widget.a();
            this.G = aVar2;
            this.F.f3172a = aVar2;
            androidx.viewpager2.widget.d dVar2 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.G.f3171a.add(dVar2);
            this.G.f3171a.add(eVar);
            this.N.a(this.D);
            this.G.f3171a.add(aVar);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(this.A);
            this.I = bVar;
            this.G.f3171a.add(bVar);
            i iVar3 = this.D;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        RecyclerView.e adapter;
        if (this.B == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.C;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
            }
            this.C = null;
        }
        int max = Math.max(0, Math.min(this.B, adapter.f() - 1));
        this.f3154x = max;
        this.B = -1;
        this.D.h0(max);
        this.N.b();
    }

    public final void b(int i6, boolean z10) {
        if (!((androidx.viewpager2.widget.c) this.H.f31225w).f3183m) {
            c(i6, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void c(int i6, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        RecyclerView.e adapter = getAdapter();
        boolean z13 = false;
        if (adapter == null) {
            if (this.B != -1) {
                this.B = Math.max(i6, 0);
            }
        } else if (adapter.f() <= 0) {
        } else {
            int min = Math.min(Math.max(i6, 0), adapter.f() - 1);
            int i12 = this.f3154x;
            if (min == i12) {
                if (this.F.f == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
            if (min == i12 && z10) {
                return;
            }
            double d10 = i12;
            this.f3154x = min;
            this.N.b();
            androidx.viewpager2.widget.c cVar = this.F;
            if (cVar.f == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                cVar.f();
                c.a aVar = cVar.f3177g;
                d10 = aVar.f3184a + aVar.f3185b;
            }
            androidx.viewpager2.widget.c cVar2 = this.F;
            cVar2.getClass();
            if (z10) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            cVar2.f3176e = i10;
            cVar2.f3183m = false;
            if (cVar2.f3179i != min) {
                z13 = true;
            }
            cVar2.f3179i = min;
            cVar2.d(2);
            if (z13) {
                cVar2.c(min);
            }
            if (!z10) {
                this.D.h0(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) > 3.0d) {
                i iVar = this.D;
                if (d11 > d10) {
                    i11 = min - 3;
                } else {
                    i11 = min + 3;
                }
                iVar.h0(i11);
                i iVar2 = this.D;
                iVar2.post(new k(min, iVar2));
                return;
            }
            this.D.l0(min);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i6) {
        return this.D.canScrollHorizontally(i6);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i6) {
        return this.D.canScrollVertically(i6);
    }

    public final void d() {
        h hVar = this.E;
        if (hVar != null) {
            View d10 = hVar.d(this.A);
            if (d10 == null) {
                return;
            }
            int position = this.A.getPosition(d10);
            if (position != this.f3154x && getScrollState() == 0) {
                this.G.c(position);
            }
            this.f3155y = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i6 = ((j) parcelable).f3166u;
            sparseArray.put(this.D.getId(), sparseArray.get(i6));
            sparseArray.remove(i6);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.N.getClass();
        this.N.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.D.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3154x;
    }

    public int getItemDecorationCount() {
        return this.D.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.M;
    }

    public int getOrientation() {
        return this.A.getOrientation();
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.D;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.F.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        int i10;
        RecyclerView.e adapter;
        int f2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i6 = viewPager2.getAdapter().f();
            } else {
                i10 = viewPager2.getAdapter().f();
                i6 = 0;
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(i6, i10, 0, false).f33747a);
                adapter = viewPager2.getAdapter();
                if (adapter != null && (f2 = adapter.f()) != 0 && viewPager2.L) {
                    if (viewPager2.f3154x > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (viewPager2.f3154x < f2 - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
                return;
            }
        } else {
            i6 = 0;
        }
        i10 = 0;
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) h.b.a(i6, i10, 0, false).f33747a);
        adapter = viewPager2.getAdapter();
        if (adapter != null) {
            if (viewPager2.f3154x > 0) {
            }
            if (viewPager2.f3154x < f2 - 1) {
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int measuredWidth = this.D.getMeasuredWidth();
        int measuredHeight = this.D.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f3151u;
        rect.left = paddingLeft;
        rect.right = (i11 - i6) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f3152v;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.D.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f3155y) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        measureChild(this.D, i6, i10);
        int measuredWidth = this.D.getMeasuredWidth();
        int measuredHeight = this.D.getMeasuredHeight();
        int measuredState = this.D.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i6, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.B = jVar.f3167v;
        this.C = jVar.f3168w;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f3166u = this.D.getId();
        int i6 = this.B;
        if (i6 == -1) {
            i6 = this.f3154x;
        }
        jVar.f3167v = i6;
        Parcelable parcelable = this.C;
        if (parcelable != null) {
            jVar.f3168w = parcelable;
        } else {
            RecyclerView.e adapter = this.D.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                jVar.f3168w = ((androidx.viewpager2.adapter.g) adapter).a();
            }
        }
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i6, Bundle bundle) {
        boolean z10;
        int currentItem;
        this.N.getClass();
        boolean z11 = false;
        if (i6 != 8192 && i6 != 4096) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f fVar = this.N;
            fVar.getClass();
            if ((i6 == 8192 || i6 == 4096) ? true : true) {
                ViewPager2 viewPager2 = ViewPager2.this;
                if (i6 == 8192) {
                    currentItem = viewPager2.getCurrentItem() - 1;
                } else {
                    currentItem = viewPager2.getCurrentItem() + 1;
                }
                if (viewPager2.L) {
                    viewPager2.c(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i6, bundle);
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e adapter = this.D.getAdapter();
        f fVar = this.N;
        if (adapter != null) {
            adapter.f2769u.unregisterObserver(fVar.f3161c);
        } else {
            fVar.getClass();
        }
        a aVar = this.f3156z;
        if (adapter != null) {
            adapter.f2769u.unregisterObserver(aVar);
        }
        this.D.setAdapter(eVar);
        this.f3154x = 0;
        a();
        f fVar2 = this.N;
        fVar2.b();
        if (eVar != null) {
            eVar.u(fVar2.f3161c);
        }
        if (eVar != null) {
            eVar.u(aVar);
        }
    }

    public void setCurrentItem(int i6) {
        b(i6, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        super.setLayoutDirection(i6);
        this.N.b();
    }

    public void setOffscreenPageLimit(int i6) {
        if (i6 < 1 && i6 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.M = i6;
        this.D.requestLayout();
    }

    public void setOrientation(int i6) {
        this.A.setOrientation(i6);
        this.N.b();
    }

    public void setPageTransformer(g gVar) {
        if (gVar != null) {
            if (!this.K) {
                this.J = this.D.getItemAnimator();
                this.K = true;
            }
            this.D.setItemAnimator(null);
        } else if (this.K) {
            this.D.setItemAnimator(this.J);
            this.J = null;
            this.K = false;
        }
        this.I.getClass();
        if (gVar == null) {
            return;
        }
        this.I.getClass();
        this.I.getClass();
    }

    public void setUserInputEnabled(boolean z10) {
        this.L = z10;
        this.N.b();
    }

    /* loaded from: classes.dex */
    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public int f3166u;

        /* renamed from: v  reason: collision with root package name */
        public int f3167v;

        /* renamed from: w  reason: collision with root package name */
        public Parcelable f3168w;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new j(parcel, null) : new j(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new j[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new j(parcel, classLoader) : new j(parcel);
            }
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3166u = parcel.readInt();
            this.f3167v = parcel.readInt();
            this.f3168w = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f3166u);
            parcel.writeInt(this.f3167v);
            parcel.writeParcelable(this.f3168w, i6);
        }

        public j(Parcel parcel) {
            super(parcel);
            this.f3166u = parcel.readInt();
            this.f3167v = parcel.readInt();
            this.f3168w = parcel.readParcelable(null);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(int i6) {
        }

        public void c(int i6) {
        }

        public void b(float f, int i6, int i10) {
        }
    }
}
