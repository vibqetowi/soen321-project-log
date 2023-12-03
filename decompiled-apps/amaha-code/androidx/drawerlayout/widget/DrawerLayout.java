package androidx.drawerlayout.widget;

import a1.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.theinnerhour.b2b.R;
import g0.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
import u0.h;
import u0.l;
/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f2000a0 = {16843828};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f2001b0 = {16842931};
    public static final boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final boolean f2002d0;
    public static final boolean e0;
    public final a1.c A;
    public final a1.c B;
    public final g C;
    public final g D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public d M;
    public ArrayList N;
    public float O;
    public float P;
    public Drawable Q;
    public Object R;
    public boolean S;
    public final ArrayList<View> T;
    public Rect U;
    public Matrix V;
    public final a W;

    /* renamed from: u  reason: collision with root package name */
    public final c f2003u;

    /* renamed from: v  reason: collision with root package name */
    public float f2004v;

    /* renamed from: w  reason: collision with root package name */
    public final int f2005w;

    /* renamed from: x  reason: collision with root package name */
    public int f2006x;

    /* renamed from: y  reason: collision with root package name */
    public float f2007y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f2008z;

    /* loaded from: classes.dex */
    public class a implements l {
        public a() {
        }

        @Override // u0.l
        public final boolean a(View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (DrawerLayout.m(view) && drawerLayout.h(view) != 2) {
                drawerLayout.b(view);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b extends t0.a {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f2010d = new Rect();

        public b() {
        }

        @Override // t0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.getText();
                DrawerLayout drawerLayout = DrawerLayout.this;
                View g5 = drawerLayout.g();
                if (g5 != null) {
                    int i6 = drawerLayout.i(g5);
                    drawerLayout.getClass();
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    Gravity.getAbsoluteGravity(i6, d0.e.d(drawerLayout));
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // t0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // t0.a
        public final void d(View view, h hVar) {
            boolean z10 = DrawerLayout.c0;
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
            if (z10) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                hVar.f33733c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                ViewParent f = d0.d.f(view);
                if (f instanceof View) {
                    hVar.f33732b = -1;
                    accessibilityNodeInfo.setParent((View) f);
                }
                Rect rect = this.f2010d;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfo.setBoundsInScreen(rect);
                accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                hVar.g(obtain.getClassName());
                hVar.i(obtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo.setFocused(obtain.isFocused());
                accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(obtain.isSelected());
                hVar.a(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (DrawerLayout.k(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            hVar.g("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) h.a.f33734e.f33743a);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) h.a.f.f33743a);
        }

        @Override // t0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.c0 && !DrawerLayout.k(view)) {
                return false;
            }
            return super.f(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends t0.a {
        @Override // t0.a
        public final void d(View view, h hVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f32269a;
            AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (!DrawerLayout.k(view)) {
                hVar.f33732b = -1;
                accessibilityNodeInfo.setParent(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();

        void c();

        void d();
    }

    /* loaded from: classes.dex */
    public class g extends c.AbstractC0004c {

        /* renamed from: a  reason: collision with root package name */
        public final int f2020a;

        /* renamed from: b  reason: collision with root package name */
        public a1.c f2021b;

        /* renamed from: c  reason: collision with root package name */
        public final a f2022c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                View e10;
                int width;
                int i6;
                g gVar = g.this;
                int i10 = gVar.f2021b.f159o;
                int i11 = gVar.f2020a;
                int i12 = 3;
                if (i11 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (z10) {
                    e10 = drawerLayout.e(3);
                    if (e10 != null) {
                        i6 = -e10.getWidth();
                    } else {
                        i6 = 0;
                    }
                    width = i6 + i10;
                } else {
                    e10 = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i10;
                }
                if (e10 != null) {
                    if (((z10 && e10.getLeft() < width) || (!z10 && e10.getLeft() > width)) && drawerLayout.h(e10) == 0) {
                        gVar.f2021b.s(e10, width, e10.getTop());
                        ((e) e10.getLayoutParams()).f2014c = true;
                        drawerLayout.invalidate();
                        if (i11 == 3) {
                            i12 = 5;
                        }
                        View e11 = drawerLayout.e(i12);
                        if (e11 != null) {
                            drawerLayout.b(e11);
                        }
                        if (!drawerLayout.L) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            int childCount = drawerLayout.getChildCount();
                            for (int i13 = 0; i13 < childCount; i13++) {
                                drawerLayout.getChildAt(i13).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                            drawerLayout.L = true;
                        }
                    }
                }
            }
        }

        public g(int i6) {
            this.f2020a = i6;
        }

        @Override // a1.c.AbstractC0004c
        public final int a(View view, int i6) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i6, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i6, width));
        }

        @Override // a1.c.AbstractC0004c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // a1.c.AbstractC0004c
        public final int c(View view) {
            DrawerLayout.this.getClass();
            if (DrawerLayout.n(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // a1.c.AbstractC0004c
        public final void e(int i6, int i10) {
            View e10;
            int i11 = i6 & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (i11 == 1) {
                e10 = drawerLayout.e(3);
            } else {
                e10 = drawerLayout.e(5);
            }
            if (e10 != null && drawerLayout.h(e10) == 0) {
                this.f2021b.b(i10, e10);
            }
        }

        @Override // a1.c.AbstractC0004c
        public final void f() {
            DrawerLayout.this.postDelayed(this.f2022c, 160L);
        }

        @Override // a1.c.AbstractC0004c
        public final void g(int i6, View view) {
            ((e) view.getLayoutParams()).f2014c = false;
            int i10 = 3;
            if (this.f2020a == 3) {
                i10 = 5;
            }
            DrawerLayout drawerLayout = DrawerLayout.this;
            View e10 = drawerLayout.e(i10);
            if (e10 != null) {
                drawerLayout.b(e10);
            }
        }

        @Override // a1.c.AbstractC0004c
        public final void h(int i6) {
            DrawerLayout.this.u(i6, this.f2021b.f163t);
        }

        @Override // a1.c.AbstractC0004c
        public final void i(View view, int i6, int i10) {
            float width;
            int i11;
            int width2 = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.a(3, view)) {
                width = i6 + width2;
            } else {
                width = drawerLayout.getWidth() - i6;
            }
            float f = width / width2;
            drawerLayout.r(view, f);
            if (f == 0.0f) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
            drawerLayout.invalidate();
        }

        @Override // a1.c.AbstractC0004c
        public final void j(View view, float f, float f2) {
            int i6;
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            float f10 = ((e) view.getLayoutParams()).f2013b;
            int width = view.getWidth();
            if (drawerLayout.a(3, view)) {
                int i10 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i10 <= 0 && (i10 != 0 || f10 <= 0.5f)) {
                    i6 = -width;
                } else {
                    i6 = 0;
                }
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < 0.0f || (f == 0.0f && f10 > 0.5f)) {
                    width2 -= width;
                }
                i6 = width2;
            }
            this.f2021b.q(i6, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // a1.c.AbstractC0004c
        public final boolean k(int i6, View view) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            drawerLayout.getClass();
            if (DrawerLayout.n(view) && drawerLayout.a(this.f2020a, view) && drawerLayout.h(view) == 0) {
                return true;
            }
            return false;
        }
    }

    static {
        boolean z10 = true;
        int i6 = Build.VERSION.SDK_INT;
        c0 = true;
        f2002d0 = true;
        if (i6 < 29) {
            z10 = false;
        }
        e0 = z10;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.drawerLayoutStyle);
        this.f2003u = new c();
        this.f2006x = -1728053248;
        this.f2008z = new Paint();
        this.G = true;
        this.H = 3;
        this.I = 3;
        this.J = 3;
        this.K = 3;
        this.W = new a();
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.f2005w = (int) ((64.0f * f2) + 0.5f);
        float f10 = f2 * 400.0f;
        g gVar = new g(3);
        this.C = gVar;
        g gVar2 = new g(5);
        this.D = gVar2;
        a1.c cVar = new a1.c(getContext(), this, gVar);
        cVar.f147b = (int) (cVar.f147b * 1.0f);
        this.A = cVar;
        cVar.f161q = 1;
        cVar.f158n = f10;
        gVar.f2021b = cVar;
        a1.c cVar2 = new a1.c(getContext(), this, gVar2);
        cVar2.f147b = (int) (cVar2.f147b * 1.0f);
        this.B = cVar2;
        cVar2.f161q = 2;
        cVar2.f158n = f10;
        gVar2.f2021b = cVar2;
        setFocusableInTouchMode(true);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.s(this, 1);
        d0.q(this, new b());
        setMotionEventSplittingEnabled(false);
        if (d0.d.b(this)) {
            setOnApplyWindowInsetsListener(new c1.a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2000a0);
            try {
                this.Q = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ca.a.f5219x, R.attr.drawerLayoutStyle, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f2004v = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f2004v = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.T = new ArrayList<>();
        } catch (Throwable th2) {
            obtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String j(int i6) {
        if ((i6 & 3) == 3) {
            return "LEFT";
        }
        if ((i6 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i6);
    }

    public static boolean k(View view) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.c(view) != 4 && d0.d.c(view) != 2) {
            return true;
        }
        return false;
    }

    public static boolean l(View view) {
        if (((e) view.getLayoutParams()).f2012a == 0) {
            return true;
        }
        return false;
    }

    public static boolean m(View view) {
        if (n(view)) {
            if ((((e) view.getLayoutParams()).f2015d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean n(View view) {
        int i6 = ((e) view.getLayoutParams()).f2012a;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, d0.e.d(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(int i6, View view) {
        if ((i(view) & i6) == i6) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i6, int i10) {
        ArrayList<View> arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            arrayList2 = this.T;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (n(childAt)) {
                if (m(childAt)) {
                    childAt.addFocusables(arrayList, i6, i10);
                    z10 = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i11++;
        }
        if (!z10) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = arrayList2.get(i12);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i6, i10);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (f() == null && !n(view)) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.s(view, 1);
        } else {
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            d0.d.s(view, 4);
        }
        if (!c0) {
            d0.q(view, this.f2003u);
        }
    }

    public final void b(View view) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.G) {
                eVar.f2013b = 0.0f;
                eVar.f2015d = 0;
            } else {
                eVar.f2015d |= 4;
                if (a(3, view)) {
                    this.A.s(view, -view.getWidth(), view.getTop());
                } else {
                    this.B.s(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void c() {
        View e10 = e(8388611);
        if (e10 != null) {
            b(e10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + j(8388611));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof e) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i6 = 0; i6 < childCount; i6++) {
            f2 = Math.max(f2, ((e) getChildAt(i6).getLayoutParams()).f2013b);
        }
        this.f2007y = f2;
        boolean g5 = this.A.g();
        boolean g10 = this.B.g();
        if (g5 || g10) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
        }
    }

    public final void d(boolean z10) {
        boolean s10;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            if (n(childAt) && (!z10 || eVar.f2014c)) {
                int width = childAt.getWidth();
                if (a(3, childAt)) {
                    int top = childAt.getTop();
                    s10 = this.A.s(childAt, -width, top);
                } else {
                    s10 = this.B.s(childAt, getWidth(), childAt.getTop());
                }
                z11 |= s10;
                eVar.f2014c = false;
            }
        }
        g gVar = this.C;
        DrawerLayout.this.removeCallbacks(gVar.f2022c);
        g gVar2 = this.D;
        DrawerLayout.this.removeCallbacks(gVar2.f2022c);
        if (z11) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f2007y > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i6 = childCount - 1; i6 >= 0; i6--) {
                    View childAt = getChildAt(i6);
                    if (this.U == null) {
                        this.U = new Rect();
                    }
                    childAt.getHitRect(this.U);
                    if (this.U.contains((int) x10, (int) y10) && !l(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.V == null) {
                                    this.V = new Matrix();
                                }
                                matrix.invert(this.V);
                                obtain.transform(this.V);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX, scrollY);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX, -scrollY);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        int height = getHeight();
        boolean l2 = l(view);
        int width = getWidth();
        int save = canvas.save();
        int i6 = 0;
        if (l2) {
            int childCount = getChildCount();
            int i10 = 0;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background != null && background.getOpacity() == -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && n(childAt) && childAt.getHeight() >= height) {
                        if (a(3, childAt)) {
                            int right = childAt.getRight();
                            if (right > i10) {
                                i10 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i10, 0, width, getHeight());
            i6 = i10;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f2 = this.f2007y;
        if (f2 > 0.0f && l2) {
            int i12 = this.f2006x;
            Paint paint = this.f2008z;
            paint.setColor((((int) ((((-16777216) & i12) >>> 24) * f2)) << 24) | (i12 & 16777215));
            canvas.drawRect(i6, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e(int i6) {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, d0.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if ((((e) childAt.getLayoutParams()).f2015d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        boolean z10;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (n(childAt)) {
                if (n(childAt)) {
                    if (((e) childAt.getLayoutParams()).f2013b > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f2002d0) {
            return this.f2004v;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.Q;
    }

    public final int h(View view) {
        int i6;
        int i10;
        int i11;
        int i12;
        if (n(view)) {
            int i13 = ((e) view.getLayoutParams()).f2012a;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            int d10 = d0.e.d(this);
            if (i13 != 3) {
                if (i13 != 5) {
                    if (i13 != 8388611) {
                        if (i13 == 8388613) {
                            int i14 = this.K;
                            if (i14 == 3) {
                                if (d10 == 0) {
                                    i12 = this.I;
                                } else {
                                    i12 = this.H;
                                }
                                if (i12 != 3) {
                                    return i12;
                                }
                            } else {
                                return i14;
                            }
                        }
                    } else {
                        int i15 = this.J;
                        if (i15 == 3) {
                            if (d10 == 0) {
                                i11 = this.H;
                            } else {
                                i11 = this.I;
                            }
                            if (i11 != 3) {
                                return i11;
                            }
                        } else {
                            return i15;
                        }
                    }
                } else {
                    int i16 = this.I;
                    if (i16 == 3) {
                        if (d10 == 0) {
                            i10 = this.K;
                        } else {
                            i10 = this.J;
                        }
                        if (i10 != 3) {
                            return i10;
                        }
                    } else {
                        return i16;
                    }
                }
            } else {
                int i17 = this.H;
                if (i17 == 3) {
                    if (d10 == 0) {
                        i6 = this.J;
                    } else {
                        i6 = this.K;
                    }
                    if (i6 != 3) {
                        return i6;
                    }
                } else {
                    return i17;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int i(View view) {
        int i6 = ((e) view.getLayoutParams()).f2012a;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        return Gravity.getAbsoluteGravity(i6, d0.e.d(this));
    }

    public final void o(View view) {
        if (n(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.G) {
                eVar.f2013b = 1.0f;
                eVar.f2015d = 1;
                t(view, true);
                s(view);
            } else {
                eVar.f2015d |= 2;
                if (a(3, view)) {
                    this.A.s(view, 0, view.getTop());
                } else {
                    this.B.s(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i6;
        super.onDraw(canvas);
        if (this.S && this.Q != null) {
            Object obj = this.R;
            if (obj != null) {
                i6 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                this.Q.setBounds(0, 0, getWidth(), i6);
                this.Q.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[LOOP:1: B:11:0x0022->B:24:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View h10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        a1.c cVar = this.A;
        boolean r = cVar.r(motionEvent) | this.B.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int length = cVar.f149d.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            if ((cVar.f155k & (1 << i6)) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                float f2 = cVar.f[i6] - cVar.f149d[i6];
                                float f10 = cVar.f151g[i6] - cVar.f150e[i6];
                                float f11 = (f10 * f10) + (f2 * f2);
                                int i10 = cVar.f147b;
                                if (f11 > i10 * i10) {
                                    z14 = true;
                                    if (!z14) {
                                        z12 = true;
                                        break;
                                    }
                                    i6++;
                                }
                            }
                            z14 = false;
                            if (!z14) {
                            }
                        } else {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        g gVar = this.C;
                        DrawerLayout.this.removeCallbacks(gVar.f2022c);
                        g gVar2 = this.D;
                        DrawerLayout.this.removeCallbacks(gVar2.f2022c);
                    }
                }
                z10 = false;
            }
            d(true);
            this.L = false;
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.O = x10;
            this.P = y10;
            if (this.f2007y > 0.0f && (h10 = cVar.h((int) x10, (int) y10)) != null && l(h10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.L = false;
        }
        if (r || z10) {
            return true;
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 < childCount) {
                if (((e) getChildAt(i11).getLayoutParams()).f2014c) {
                    z11 = true;
                    break;
                }
                i11++;
            } else {
                z11 = false;
                break;
            }
        }
        if (z11 || this.L) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z10;
        if (i6 == 4) {
            if (g() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        if (i6 == 4) {
            View g5 = g();
            if (g5 != null && h(g5) == 0) {
                d(false);
            }
            if (g5 == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i6, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        WindowInsets rootWindowInsets;
        int i13;
        float f2;
        int i14;
        boolean z11;
        int i15;
        this.F = true;
        int i16 = i11 - i6;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(3, childAt)) {
                        float f10 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (eVar.f2013b * f10));
                        f2 = (measuredWidth + i14) / f10;
                    } else {
                        float f11 = measuredWidth;
                        f2 = (i16 - i13) / f11;
                        i14 = i16 - ((int) (eVar.f2013b * f11));
                    }
                    if (f2 != eVar.f2013b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i19 = eVar.f2012a & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i19 != 16) {
                        if (i19 != 80) {
                            int i20 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                            childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                        } else {
                            int i21 = i12 - i10;
                            childAt.layout(i14, (i21 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i21 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                        }
                    } else {
                        int i22 = i12 - i10;
                        int i23 = (i22 - measuredHeight) / 2;
                        int i24 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i23 < i24) {
                            i23 = i24;
                        } else {
                            int i25 = i23 + measuredHeight;
                            int i26 = i22 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i25 > i26) {
                                i23 = i26 - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i23, measuredWidth + i14, measuredHeight + i23);
                    }
                    if (z11) {
                        r(childAt, f2);
                    }
                    if (eVar.f2013b > 0.0f) {
                        i15 = 0;
                    } else {
                        i15 = 4;
                    }
                    if (childAt.getVisibility() != i15) {
                        childAt.setVisibility(i15);
                    }
                }
            }
        }
        if (e0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            j0.e i27 = s0.h(rootWindowInsets, null).f32351a.i();
            a1.c cVar = this.A;
            cVar.f159o = Math.max(cVar.f160p, i27.f21623a);
            a1.c cVar2 = this.B;
            cVar2.f159o = Math.max(cVar2.f160p, i27.f21625c);
        }
        this.F = false;
        this.G = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int childCount;
        int i11;
        boolean z11;
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i6);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.R != null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.d.b(this)) {
                z10 = true;
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                int d10 = d0.e.d(this);
                childCount = getChildCount();
                boolean z12 = false;
                boolean z13 = false;
                for (i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8) {
                        e eVar = (e) childAt.getLayoutParams();
                        if (z10) {
                            int absoluteGravity = Gravity.getAbsoluteGravity(eVar.f2012a, d10);
                            if (d0.d.b(childAt)) {
                                WindowInsets windowInsets = (WindowInsets) this.R;
                                if (absoluteGravity == 3) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                                childAt.dispatchApplyWindowInsets(windowInsets);
                            } else {
                                WindowInsets windowInsets2 = (WindowInsets) this.R;
                                if (absoluteGravity == 3) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                                } else if (absoluteGravity == 5) {
                                    windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                                }
                                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                                ((ViewGroup.MarginLayoutParams) eVar).topMargin = windowInsets2.getSystemWindowInsetTop();
                                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = windowInsets2.getSystemWindowInsetRight();
                                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                            }
                        }
                        if (l(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                        } else if (n(childAt)) {
                            if (f2002d0) {
                                float i12 = d0.i.i(childAt);
                                float f2 = this.f2004v;
                                if (i12 != f2) {
                                    d0.i.s(childAt, f2);
                                }
                            }
                            int i13 = i(childAt) & 7;
                            if (i13 == 3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((z11 && z12) || (!z11 && z13)) {
                                throw new IllegalStateException("Child drawer has absolute gravity " + j(i13) + " but this DrawerLayout already has a drawer view along that edge");
                            }
                            if (z11) {
                                z12 = true;
                            } else {
                                z13 = true;
                            }
                            childAt.measure(ViewGroup.getChildMeasureSpec(i6, this.f2005w + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i10, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                        } else {
                            throw new IllegalStateException("Child " + childAt + " at index " + i11 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                        }
                    }
                }
            }
        }
        z10 = false;
        WeakHashMap<View, o0> weakHashMap22 = d0.f32288a;
        int d102 = d0.e.d(this);
        childCount = getChildCount();
        boolean z122 = false;
        boolean z132 = false;
        while (i11 < childCount) {
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View e10;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f39113u);
        int i6 = fVar.f2016w;
        if (i6 != 0 && (e10 = e(i6)) != null) {
            o(e10);
        }
        int i10 = fVar.f2017x;
        if (i10 != 3) {
            q(i10, 3);
        }
        int i11 = fVar.f2018y;
        if (i11 != 3) {
            q(i11, 5);
        }
        int i12 = fVar.f2019z;
        if (i12 != 3) {
            q(i12, 8388611);
        }
        int i13 = fVar.A;
        if (i13 != 3) {
            q(i13, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        if (!f2002d0) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.e.d(this);
            d0.e.d(this);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            e eVar = (e) getChildAt(i6).getLayoutParams();
            int i10 = eVar.f2015d;
            boolean z11 = true;
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                fVar.f2016w = eVar.f2012a;
                break;
            }
        }
        fVar.f2017x = this.H;
        fVar.f2018y = this.I;
        fVar.f2019z = this.J;
        fVar.A = this.K;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (h(r7) != 2) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a1.c cVar = this.A;
        cVar.k(motionEvent);
        this.B.k(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z10 = false;
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    d(true);
                    this.L = false;
                }
            } else {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                View h10 = cVar.h((int) x10, (int) y10);
                if (h10 != null && l(h10)) {
                    float f2 = x10 - this.O;
                    float f10 = y10 - this.P;
                    int i6 = cVar.f147b;
                    if ((f10 * f10) + (f2 * f2) < i6 * i6) {
                        View f11 = f();
                        if (f11 != null) {
                        }
                    }
                }
                z10 = true;
                d(z10);
            }
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.O = x11;
            this.P = y11;
            this.L = false;
        }
        return true;
    }

    public final void p() {
        View e10 = e(8388611);
        if (e10 != null) {
            o(e10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + j(8388611));
    }

    public final void q(int i6, int i10) {
        View e10;
        a1.c cVar;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d0.e.d(this));
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 8388611) {
                    if (i10 == 8388613) {
                        this.K = i6;
                    }
                } else {
                    this.J = i6;
                }
            } else {
                this.I = i6;
            }
        } else {
            this.H = i6;
        }
        if (i6 != 0) {
            if (absoluteGravity == 3) {
                cVar = this.A;
            } else {
                cVar = this.B;
            }
            cVar.a();
        }
        if (i6 != 1) {
            if (i6 == 2 && (e10 = e(absoluteGravity)) != null) {
                o(e10);
                return;
            }
            return;
        }
        View e11 = e(absoluteGravity);
        if (e11 != null) {
            b(e11);
        }
    }

    public final void r(View view, float f2) {
        e eVar = (e) view.getLayoutParams();
        if (f2 == eVar.f2013b) {
            return;
        }
        eVar.f2013b = f2;
        ArrayList arrayList = this.N;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((d) this.N.get(size)).c();
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.F) {
            super.requestLayout();
        }
    }

    public final void s(View view) {
        h.a aVar = h.a.f33740l;
        d0.n(aVar.a(), view);
        d0.i(0, view);
        if (m(view) && h(view) != 2) {
            d0.o(view, aVar, this.W);
        }
    }

    public void setDrawerElevation(float f2) {
        this.f2004v = f2;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (n(childAt)) {
                float f10 = this.f2004v;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.i.s(childAt, f10);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        ArrayList arrayList;
        d dVar2 = this.M;
        if (dVar2 != null && (arrayList = this.N) != null) {
            arrayList.remove(dVar2);
        }
        if (dVar != null) {
            if (this.N == null) {
                this.N = new ArrayList();
            }
            this.N.add(dVar);
        }
        this.M = dVar;
    }

    public void setDrawerLockMode(int i6) {
        q(i6, 3);
        q(i6, 5);
    }

    public void setScrimColor(int i6) {
        this.f2006x = i6;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.Q = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i6) {
        this.Q = new ColorDrawable(i6);
        invalidate();
    }

    public final void t(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if ((!z10 && !n(childAt)) || (z10 && childAt == view)) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.s(childAt, 1);
            } else {
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                d0.d.s(childAt, 4);
            }
        }
    }

    public final void u(int i6, View view) {
        int i10;
        View rootView;
        int i11 = this.A.f146a;
        int i12 = this.B.f146a;
        if (i11 != 1 && i12 != 1) {
            i10 = 2;
            if (i11 != 2 && i12 != 2) {
                i10 = 0;
            }
        } else {
            i10 = 1;
        }
        if (view != null && i6 == 0) {
            float f2 = ((e) view.getLayoutParams()).f2013b;
            if (f2 == 0.0f) {
                e eVar = (e) view.getLayoutParams();
                if ((eVar.f2015d & 1) == 1) {
                    eVar.f2015d = 0;
                    ArrayList arrayList = this.N;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((d) this.N.get(size)).d();
                        }
                    }
                    t(view, false);
                    s(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                e eVar2 = (e) view.getLayoutParams();
                if ((eVar2.f2015d & 1) == 0) {
                    eVar2.f2015d = 1;
                    ArrayList arrayList2 = this.N;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((d) this.N.get(size2)).a();
                        }
                    }
                    t(view, true);
                    s(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i10 != this.E) {
            this.E = i10;
            ArrayList arrayList3 = this.N;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((d) this.N.get(size3)).b();
                }
            }
        }
    }

    public void setStatusBarBackground(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            Context context = getContext();
            Object obj = g0.a.f16164a;
            drawable = a.c.b(context, i6);
        } else {
            drawable = null;
        }
        this.Q = drawable;
        invalidate();
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f2012a;

        /* renamed from: b  reason: collision with root package name */
        public float f2013b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2014c;

        /* renamed from: d  reason: collision with root package name */
        public int f2015d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2012a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2001b0);
            this.f2012a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public e() {
            super(-1, -1);
            this.f2012a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f2012a = 0;
            this.f2012a = eVar.f2012a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2012a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2012a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public static class f extends z0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public int f2016w;

        /* renamed from: x  reason: collision with root package name */
        public int f2017x;

        /* renamed from: y  reason: collision with root package name */
        public int f2018y;

        /* renamed from: z  reason: collision with root package name */
        public int f2019z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new f[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2016w = 0;
            this.f2016w = parcel.readInt();
            this.f2017x = parcel.readInt();
            this.f2018y = parcel.readInt();
            this.f2019z = parcel.readInt();
            this.A = parcel.readInt();
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f2016w);
            parcel.writeInt(this.f2017x);
            parcel.writeInt(this.f2018y);
            parcel.writeInt(this.f2019z);
            parcel.writeInt(this.A);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f2016w = 0;
        }
    }
}
