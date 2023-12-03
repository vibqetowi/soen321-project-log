package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.theinnerhour.b2b.R;
import g0.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.q;
import t0.r;
import t0.s;
import t0.s0;
import t0.t;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    public static final String O;
    public static final Class<?>[] P;
    public static final ThreadLocal<Map<String, Constructor<c>>> Q;
    public static final i R;
    public static final s0.e S;
    public final int[] A;
    public boolean B;
    public boolean C;
    public final int[] D;
    public View E;
    public View F;
    public g G;
    public boolean H;
    public s0 I;
    public boolean J;
    public Drawable K;
    public ViewGroup.OnHierarchyChangeListener L;
    public a M;
    public final s N;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f1921u;

    /* renamed from: v  reason: collision with root package name */
    public final v.c f1922v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f1923w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f1924x;

    /* renamed from: y  reason: collision with root package name */
    public Paint f1925y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f1926z;

    /* loaded from: classes.dex */
    public class a implements t {
        public a() {
        }

        @Override // t0.t
        public final s0 i(View view, s0 s0Var) {
            boolean z10;
            c cVar;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!s0.b.a(coordinatorLayout.I, s0Var)) {
                coordinatorLayout.I = s0Var;
                boolean z11 = true;
                if (s0Var.d() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coordinatorLayout.J = z10;
                coordinatorLayout.setWillNotDraw((z10 || coordinatorLayout.getBackground() != null) ? false : false);
                if (!s0Var.f32351a.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = coordinatorLayout.getChildAt(i6);
                        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        if (d0.d.b(childAt) && (cVar = ((f) childAt.getLayoutParams()).f1929a) != null) {
                            s0Var = cVar.onApplyWindowInsets(coordinatorLayout, childAt, s0Var);
                            if (s0Var.f32351a.m()) {
                                break;
                            }
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return s0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public static Object getTag(View view) {
            return ((f) view.getLayoutParams()).r;
        }

        public static void setTag(View view, Object obj) {
            ((f) view.getLayoutParams()).r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v10) {
            if (getScrimOpacity(coordinatorLayout, v10) > 0.0f) {
                return true;
            }
            return false;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v10, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v10) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v10) {
            return 0.0f;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i6) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i6, int i10, int i11, int i12) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v10, View view, float f, float f2, boolean z10) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v10, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int[] iArr) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int i11, int i12) {
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i6) {
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i6) {
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int[] iArr, int i11) {
            if (i11 == 0) {
                onNestedPreScroll(coordinatorLayout, v10, view, i6, i10, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int i11, int i12, int i13) {
            if (i13 == 0) {
                onNestedScroll(coordinatorLayout, v10, view, i6, i10, i11, i12);
            }
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i6, int i10) {
            if (i10 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v10, view, view2, i6);
            }
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i6, int i10) {
            if (i10 == 0) {
                return onStartNestedScroll(coordinatorLayout, v10, view, view2, i6);
            }
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6) {
            if (i6 == 0) {
                onStopNestedScroll(coordinatorLayout, v10, view);
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
            onNestedScroll(coordinatorLayout, v10, view, i6, i10, i11, i12, i13);
        }

        public void onDetachedFromLayoutParams() {
        }

        public void onAttachedToLayoutParams(f fVar) {
        }

        public s0 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v10, s0 s0Var) {
            return s0Var;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v10, View view) {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.L;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.k(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.L;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.k(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            float m10 = d0.i.m(view);
            float m11 = d0.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        O = str;
        R = new i();
        P = new Class[]{Context.class, AttributeSet.class};
        Q = new ThreadLocal<>();
        S = new s0.e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1921u = new ArrayList();
        this.f1922v = new v.c(1);
        this.f1923w = new ArrayList();
        this.f1924x = new ArrayList();
        this.f1926z = new int[2];
        this.A = new int[2];
        this.N = new s();
        int[] iArr = sp.b.f31854a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.D = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i6 = 0; i6 < length; i6++) {
                int[] iArr2 = this.D;
                iArr2[i6] = (int) (iArr2[i6] * f2);
            }
        }
        this.K = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        s();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.c(this) == 0) {
            d0.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) S.b();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void g(int i6, Rect rect, Rect rect2, f fVar, int i10, int i11) {
        int width;
        int height;
        int i12 = fVar.f1931c;
        if (i12 == 0) {
            i12 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i12, i6);
        int i13 = fVar.f1932d;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i13, i6);
        int i14 = absoluteGravity & 7;
        int i15 = absoluteGravity & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i16 = absoluteGravity2 & 7;
        int i17 = absoluteGravity2 & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i16 != 1) {
            if (i16 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i17 != 16) {
            if (i17 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i14 != 1) {
            if (i14 != 5) {
                width -= i10;
            }
        } else {
            width -= i10 / 2;
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height -= i11;
            }
        } else {
            height -= i11 / 2;
        }
        rect2.set(width, height, i10 + width, i11 + height);
    }

    public static f i(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1930b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
                fVar.f1930b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                    }
                }
                fVar.f1930b = true;
            }
        }
        return fVar;
    }

    public static void q(int i6, View view) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f1936i;
        if (i10 != i6) {
            d0.j(i6 - i10, view);
            fVar.f1936i = i6;
        }
    }

    public static void r(int i6, View view) {
        f fVar = (f) view.getLayoutParams();
        int i10 = fVar.f1937j;
        if (i10 != i6) {
            d0.k(i6 - i10, view);
            fVar.f1937j = i6;
        }
    }

    public final void b(f fVar, Rect rect, int i6, int i10) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i6 + max, i10 + max2);
    }

    public final void c(View view) {
        List list = (List) ((t.h) this.f1922v.f34632w).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i6 = 0; i6 < list.size(); i6++) {
                View view2 = (View) list.get(i6);
                c cVar = ((f) view2.getLayoutParams()).f1929a;
                if (cVar != null) {
                    cVar.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public final void d(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                f(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f1929a;
        if (cVar != null) {
            float scrimOpacity = cVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                if (this.f1925y == null) {
                    this.f1925y = new Paint();
                }
                this.f1925y.setColor(fVar.f1929a.getScrimColor(this, view));
                Paint paint = this.f1925y;
                int round = Math.round(scrimOpacity * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f1925y);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.K;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final ArrayList e(View view) {
        v.c cVar = this.f1922v;
        int i6 = ((t.h) cVar.f34632w).f32260w;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < i6; i10++) {
            ArrayList arrayList2 = (ArrayList) ((t.h) cVar.f34632w).m(i10);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((t.h) cVar.f34632w).i(i10));
            }
        }
        ArrayList arrayList3 = this.f1924x;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = d0.a.f12127a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = d0.a.f12127a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        d0.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = d0.a.f12128b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        o();
        return Collections.unmodifiableList(this.f1921u);
    }

    public final s0 getLastWindowInsets() {
        return this.I;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.N;
        return sVar.f32349b | sVar.f32348a;
    }

    public Drawable getStatusBarBackground() {
        return this.K;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i6) {
        int[] iArr = this.D;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i6);
            return 0;
        } else if (i6 >= 0 && i6 < iArr.length) {
            return iArr[i6];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i6 + " out of range for " + this);
            return 0;
        }
    }

    public final boolean j(View view, int i6, int i10) {
        s0.e eVar = S;
        Rect a10 = a();
        f(view, a10);
        try {
            return a10.contains(i6, i10);
        } finally {
            a10.setEmpty();
            eVar.a(a10);
        }
    }

    public final void k(int i6) {
        int i10;
        Rect rect;
        int i11;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        int i18;
        f fVar;
        ArrayList arrayList2;
        int i19;
        Rect rect2;
        int i20;
        View view;
        s0.e eVar;
        f fVar2;
        int i21;
        boolean z14;
        c cVar;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int d10 = d0.e.d(this);
        ArrayList arrayList3 = this.f1921u;
        int size = arrayList3.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i22 = i6;
        int i23 = 0;
        while (true) {
            s0.e eVar2 = S;
            if (i23 < size) {
                View view2 = (View) arrayList3.get(i23);
                f fVar3 = (f) view2.getLayoutParams();
                if (i22 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i11 = size;
                    rect = a12;
                    i10 = i23;
                } else {
                    int i24 = 0;
                    while (i24 < i23) {
                        if (fVar3.f1939l == ((View) arrayList3.get(i24))) {
                            f fVar4 = (f) view2.getLayoutParams();
                            if (fVar4.f1938k != null) {
                                Rect a13 = a();
                                Rect a14 = a();
                                arrayList2 = arrayList3;
                                Rect a15 = a();
                                i18 = i24;
                                f(fVar4.f1938k, a13);
                                d(view2, false, a14);
                                int measuredWidth = view2.getMeasuredWidth();
                                i19 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i20 = i23;
                                fVar = fVar3;
                                view = view2;
                                rect2 = a12;
                                eVar = eVar2;
                                g(d10, a13, a15, fVar4, measuredWidth, measuredHeight);
                                if (a15.left == a14.left && a15.top == a14.top) {
                                    fVar2 = fVar4;
                                    i21 = measuredWidth;
                                    z14 = false;
                                } else {
                                    fVar2 = fVar4;
                                    i21 = measuredWidth;
                                    z14 = true;
                                }
                                b(fVar2, a15, i21, measuredHeight);
                                int i25 = a15.left - a14.left;
                                int i26 = a15.top - a14.top;
                                if (i25 != 0) {
                                    d0.j(i25, view);
                                }
                                if (i26 != 0) {
                                    d0.k(i26, view);
                                }
                                if (z14 && (cVar = fVar2.f1929a) != null) {
                                    cVar.onDependentViewChanged(this, view, fVar2.f1938k);
                                }
                                a13.setEmpty();
                                eVar.a(a13);
                                a14.setEmpty();
                                eVar.a(a14);
                                a15.setEmpty();
                                eVar.a(a15);
                                i24 = i18 + 1;
                                eVar2 = eVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i19;
                                i23 = i20;
                                fVar3 = fVar;
                                a12 = rect2;
                            }
                        }
                        i18 = i24;
                        fVar = fVar3;
                        arrayList2 = arrayList3;
                        i19 = size;
                        rect2 = a12;
                        i20 = i23;
                        view = view2;
                        eVar = eVar2;
                        i24 = i18 + 1;
                        eVar2 = eVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i19;
                        i23 = i20;
                        fVar3 = fVar;
                        a12 = rect2;
                    }
                    f fVar5 = fVar3;
                    ArrayList arrayList4 = arrayList3;
                    int i27 = size;
                    Rect rect3 = a12;
                    i10 = i23;
                    View view3 = view2;
                    s0.e eVar3 = eVar2;
                    d(view3, true, a11);
                    if (fVar5.f1934g != 0 && !a11.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f1934g, d10);
                        int i28 = absoluteGravity & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                        if (i28 != 48) {
                            if (i28 == 80) {
                                a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                            }
                        } else {
                            a10.top = Math.max(a10.top, a11.bottom);
                        }
                        int i29 = absoluteGravity & 7;
                        if (i29 != 3) {
                            if (i29 == 5) {
                                a10.right = Math.max(a10.right, getWidth() - a11.left);
                            }
                        } else {
                            a10.left = Math.max(a10.left, a11.right);
                        }
                    }
                    if (fVar5.f1935h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                        if (d0.g.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            f fVar6 = (f) view3.getLayoutParams();
                            c cVar2 = fVar6.f1929a;
                            Rect a16 = a();
                            Rect a17 = a();
                            a17.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (cVar2 != null && cVar2.getInsetDodgeRect(this, view3, a16)) {
                                if (!a17.contains(a16)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a16.toShortString() + " | Bounds:" + a17.toShortString());
                                }
                            } else {
                                a16.set(a17);
                            }
                            a17.setEmpty();
                            eVar3.a(a17);
                            if (a16.isEmpty()) {
                                a16.setEmpty();
                                eVar3.a(a16);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.f1935h, d10);
                                if ((absoluteGravity2 & 48) == 48 && (i16 = (a16.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.f1937j) < (i17 = a10.top)) {
                                    r(i17 - i16, view3);
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.f1937j) < (i15 = a10.bottom)) {
                                    r(height - i15, view3);
                                    z11 = true;
                                }
                                if (!z11) {
                                    r(0, view3);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i13 = (a16.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.f1936i) < (i14 = a10.left)) {
                                    q(i14 - i13, view3);
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.f1936i) < (i12 = a10.right)) {
                                    q(width - i12, view3);
                                    z13 = true;
                                } else {
                                    z13 = z12;
                                }
                                if (!z13) {
                                    q(0, view3);
                                }
                                a16.setEmpty();
                                eVar3.a(a16);
                            }
                        }
                    }
                    if (i6 != 2) {
                        rect = rect3;
                        rect.set(((f) view3.getLayoutParams()).f1944q);
                        if (rect.equals(a11)) {
                            arrayList = arrayList4;
                            i11 = i27;
                            i22 = i6;
                        } else {
                            ((f) view3.getLayoutParams()).f1944q.set(a11);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i30 = i10 + 1;
                    i11 = i27;
                    while (true) {
                        arrayList = arrayList4;
                        if (i30 >= i11) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i30);
                        f fVar7 = (f) view4.getLayoutParams();
                        c cVar3 = fVar7.f1929a;
                        if (cVar3 != null && cVar3.layoutDependsOn(this, view4, view3)) {
                            if (i6 == 0 && fVar7.f1943p) {
                                fVar7.f1943p = false;
                            } else {
                                if (i6 != 2) {
                                    z10 = cVar3.onDependentViewChanged(this, view4, view3);
                                } else {
                                    cVar3.onDependentViewRemoved(this, view4, view3);
                                    z10 = true;
                                }
                                if (i6 == 1) {
                                    fVar7.f1943p = z10;
                                }
                            }
                        }
                        i30++;
                        arrayList4 = arrayList;
                    }
                    i22 = i6;
                }
                i23 = i10 + 1;
                a12 = rect;
                size = i11;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a12;
                a10.setEmpty();
                eVar2.a(a10);
                a11.setEmpty();
                eVar2.a(a11);
                rect4.setEmpty();
                eVar2.a(rect4);
                return;
            }
        }
    }

    public final void l(int i6, View view) {
        boolean z10;
        Rect a10;
        Rect a11;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1938k;
        int i10 = 0;
        if (view2 == null && fVar.f != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            s0.e eVar = S;
            if (view2 != null) {
                a10 = a();
                a11 = a();
                try {
                    f(view2, a10);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    g(i6, a10, a11, fVar2, measuredWidth, measuredHeight);
                    b(fVar2, a11, measuredWidth, measuredHeight);
                    view.layout(a11.left, a11.top, a11.right, a11.bottom);
                    return;
                } finally {
                    a10.setEmpty();
                    eVar.a(a10);
                    a11.setEmpty();
                    eVar.a(a11);
                }
            }
            int i11 = fVar.f1933e;
            if (i11 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i12 = fVar3.f1931c;
                if (i12 == 0) {
                    i12 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, i6);
                int i13 = absoluteGravity & 7;
                int i14 = absoluteGravity & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i6 == 1) {
                    i11 = width - i11;
                }
                int h10 = h(i11) - measuredWidth2;
                if (i13 != 1) {
                    if (i13 == 5) {
                        h10 += measuredWidth2;
                    }
                } else {
                    h10 += measuredWidth2 / 2;
                }
                if (i14 != 16) {
                    if (i14 == 80) {
                        i10 = measuredHeight2 + 0;
                    }
                } else {
                    i10 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(h10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            a10 = a();
            a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.I != null) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.d.b(this) && !d0.d.b(view)) {
                    a10.left = this.I.b() + a10.left;
                    a10.top = this.I.d() + a10.top;
                    a10.right -= this.I.c();
                    a10.bottom -= this.I.a();
                }
            }
            a11 = a();
            int i15 = fVar4.f1931c;
            if ((i15 & 7) == 0) {
                i15 |= 8388611;
            }
            if ((i15 & com.appsflyer.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i15 |= 48;
            }
            t0.f.b(i15, view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i6);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final void m(View view, int i6, int i10, int i11, int i12) {
        measureChildWithMargins(view, i6, i10, i11, i12);
    }

    public final boolean n(MotionEvent motionEvent, int i6) {
        boolean z10;
        boolean z11;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1923w;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            if (isChildrenDrawingOrderEnabled) {
                i10 = getChildDrawingOrder(childCount, i11);
            } else {
                i10 = i11;
            }
            arrayList.add(getChildAt(i10));
        }
        i iVar = R;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1929a;
            boolean z14 = true;
            if ((z12 || z13) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i6 != 0) {
                        if (i6 == 1) {
                            cVar.onTouchEvent(this, view, motionEvent2);
                        }
                    } else {
                        cVar.onInterceptTouchEvent(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z12 && cVar != null) {
                    if (i6 != 0) {
                        if (i6 == 1) {
                            z12 = cVar.onTouchEvent(this, view, motionEvent);
                        }
                    } else {
                        z12 = cVar.onInterceptTouchEvent(this, view, motionEvent);
                    }
                    if (z12) {
                        this.E = view;
                    }
                }
                c cVar2 = fVar.f1929a;
                if (cVar2 == null) {
                    fVar.f1940m = false;
                }
                boolean z15 = fVar.f1940m;
                if (z15) {
                    z11 = true;
                } else {
                    if (cVar2 != null) {
                        z10 = cVar2.blocksInteractionBelow(this, view);
                    } else {
                        z10 = false;
                    }
                    z11 = z10 | z15;
                    fVar.f1940m = z11;
                }
                z14 = (!z11 || z15) ? false : false;
                if (z11 && !z14) {
                    break;
                }
                z13 = z14;
            }
        }
        arrayList.clear();
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r9 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar;
        ArrayList arrayList = this.f1921u;
        arrayList.clear();
        v.c cVar2 = this.f1922v;
        int i6 = ((t.h) cVar2.f34632w).f32260w;
        for (int i10 = 0; i10 < i6; i10++) {
            ArrayList arrayList2 = (ArrayList) ((t.h) cVar2.f34632w).m(i10);
            if (arrayList2 != null) {
                arrayList2.clear();
                ((s0.d) cVar2.f34631v).a(arrayList2);
            }
        }
        ((t.h) cVar2.f34632w).clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f i12 = i(childAt);
            int i13 = i12.f;
            if (i13 == -1) {
                i12.f1939l = null;
                i12.f1938k = null;
            } else {
                View view = i12.f1938k;
                if (view != null) {
                    if (view.getId() == i13) {
                        View view2 = i12.f1938k;
                        for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                            if (parent != null && parent != childAt) {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                            } else {
                                i12.f1939l = null;
                                i12.f1938k = null;
                            }
                        }
                        i12.f1939l = view2;
                        z10 = true;
                    }
                    z10 = false;
                    break;
                }
                View findViewById = findViewById(i13);
                i12.f1938k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            i12.f1939l = null;
                            i12.f1938k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    i12.f1939l = null;
                                    i12.f1938k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            }
                        }
                        i12.f1939l = findViewById;
                    }
                } else if (isInEditMode()) {
                    i12.f1939l = null;
                    i12.f1938k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i13) + " to anchor view " + childAt);
                }
            }
            if (!((t.h) cVar2.f34632w).containsKey(childAt)) {
                ((t.h) cVar2.f34632w).put(childAt, null);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                if (i14 != i11) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2 != i12.f1939l) {
                        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                        int d10 = d0.e.d(this);
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f1934g, d10);
                        if (absoluteGravity != 0 && (Gravity.getAbsoluteGravity(i12.f1935h, d10) & absoluteGravity) == absoluteGravity) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12 && ((cVar = i12.f1929a) == null || !cVar.layoutDependsOn(this, childAt, childAt2))) {
                            z11 = false;
                            if (z11) {
                                if (!((t.h) cVar2.f34632w).containsKey(childAt2) && !((t.h) cVar2.f34632w).containsKey(childAt2)) {
                                    ((t.h) cVar2.f34632w).put(childAt2, null);
                                }
                                if (((t.h) cVar2.f34632w).containsKey(childAt2) && ((t.h) cVar2.f34632w).containsKey(childAt)) {
                                    ArrayList arrayList3 = (ArrayList) ((t.h) cVar2.f34632w).getOrDefault(childAt2, null);
                                    if (arrayList3 == null) {
                                        arrayList3 = (ArrayList) ((s0.d) cVar2.f34631v).b();
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        ((t.h) cVar2.f34632w).put(childAt2, arrayList3);
                                    }
                                    arrayList3.add(childAt);
                                } else {
                                    throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                }
            }
        }
        ((ArrayList) cVar2.f34633x).clear();
        ((HashSet) cVar2.f34634y).clear();
        int i15 = ((t.h) cVar2.f34632w).f32260w;
        for (int i16 = 0; i16 < i15; i16++) {
            cVar2.c(((t.h) cVar2.f34632w).i(i16), (ArrayList) cVar2.f34633x, (HashSet) cVar2.f34634y);
        }
        arrayList.addAll((ArrayList) cVar2.f34633x);
        Collections.reverse(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p(false);
        if (this.H) {
            if (this.G == null) {
                this.G = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.G);
        }
        if (this.I == null) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.d.b(this)) {
                d0.h.c(this);
            }
        }
        this.C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p(false);
        if (this.H && this.G != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.G);
        }
        View view = this.F;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.C = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i6;
        super.onDraw(canvas);
        if (this.J && this.K != null) {
            s0 s0Var = this.I;
            if (s0Var != null) {
                i6 = s0Var.d();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                this.K.setBounds(0, 0, getWidth(), i6);
                this.K.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            p(true);
        }
        boolean n10 = n(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            p(true);
        }
        return n10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        c cVar;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int d10 = d0.e.d(this);
        ArrayList arrayList = this.f1921u;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1929a) == null || !cVar.onLayoutChild(this, view, d10))) {
                l(d10, view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x018d, code lost:
        if (r0.onMeasureChild(r32, r20, r25, r21, r26, 0) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0190  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c cVar;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList;
        int i19;
        int i20;
        boolean z13;
        o();
        int childCount = getChildCount();
        int i21 = 0;
        while (true) {
            if (i21 < childCount) {
                View childAt = getChildAt(i21);
                v.c cVar2 = this.f1922v;
                int i22 = ((t.h) cVar2.f34632w).f32260w;
                int i23 = 0;
                while (true) {
                    if (i23 < i22) {
                        ArrayList arrayList2 = (ArrayList) ((t.h) cVar2.f34632w).m(i23);
                        if (arrayList2 != null && arrayList2.contains(childAt)) {
                            z13 = true;
                            break;
                        }
                        i23++;
                    } else {
                        z13 = false;
                        break;
                    }
                }
                if (z13) {
                    z10 = true;
                    break;
                }
                i21++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10 != this.H) {
            if (z10) {
                if (this.C) {
                    if (this.G == null) {
                        this.G = new g();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.G);
                }
                this.H = true;
            } else {
                if (this.C && this.G != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.G);
                }
                this.H = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        int d10 = d0.e.d(this);
        if (d10 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (this.I != null && d0.d.b(this)) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList3 = this.f1921u;
        int size3 = arrayList3.size();
        int i26 = suggestedMinimumWidth;
        int i27 = suggestedMinimumHeight;
        int i28 = 0;
        int i29 = 0;
        while (i29 < size3) {
            View view = (View) arrayList3.get(i29);
            if (view.getVisibility() == 8) {
                i20 = i29;
                i18 = size3;
                arrayList = arrayList3;
            } else {
                f fVar = (f) view.getLayoutParams();
                int i30 = fVar.f1933e;
                if (i30 >= 0 && mode != 0) {
                    int h10 = h(i30);
                    i11 = i28;
                    int i31 = fVar.f1931c;
                    if (i31 == 0) {
                        i31 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i31, d10) & 7;
                    i12 = i29;
                    if ((absoluteGravity == 3 && !z11) || (absoluteGravity == 5 && z11)) {
                        i13 = Math.max(0, (size - paddingRight) - h10);
                    } else if ((absoluteGravity == 5 && !z11) || (absoluteGravity == 3 && z11)) {
                        i13 = Math.max(0, h10 - paddingLeft);
                    }
                    if (!z12 && !d0.d.b(view)) {
                        int c10 = this.I.c() + this.I.b();
                        int a10 = this.I.a() + this.I.d();
                        i14 = View.MeasureSpec.makeMeasureSpec(size - c10, mode);
                        i15 = View.MeasureSpec.makeMeasureSpec(size2 - a10, mode2);
                    } else {
                        i14 = i6;
                        i15 = i10;
                    }
                    cVar = fVar.f1929a;
                    if (cVar == null) {
                        i19 = i11;
                        i20 = i12;
                        i16 = i27;
                        i17 = i26;
                        i18 = size3;
                        arrayList = arrayList3;
                    } else {
                        i16 = i27;
                        i17 = i26;
                        i18 = size3;
                        arrayList = arrayList3;
                        i19 = i11;
                        i20 = i12;
                    }
                    measureChildWithMargins(view, i14, i13, i15, 0);
                    int max = Math.max(i17, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    i26 = max;
                    i27 = Math.max(i16, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i28 = View.combineMeasuredStates(i19, view.getMeasuredState());
                } else {
                    i11 = i28;
                    i12 = i29;
                }
                i13 = 0;
                if (!z12) {
                }
                i14 = i6;
                i15 = i10;
                cVar = fVar.f1929a;
                if (cVar == null) {
                }
                measureChildWithMargins(view, i14, i13, i15, 0);
                int max2 = Math.max(i17, view.getMeasuredWidth() + i24 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                i26 = max2;
                i27 = Math.max(i16, view.getMeasuredHeight() + i25 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i28 = View.combineMeasuredStates(i19, view.getMeasuredState());
            }
            i29 = i20 + 1;
            size3 = i18;
            arrayList3 = arrayList;
        }
        int i32 = i28;
        setMeasuredDimension(View.resolveSizeAndState(i26, i6, (-16777216) & i32), View.resolveSizeAndState(i27, i10, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f10, boolean z10) {
        c cVar;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1929a) != null) {
                    z11 |= cVar.onNestedFling(this, childAt, view, f2, f10, z10);
                }
            }
        }
        if (z11) {
            k(1);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f10) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1929a) != null) {
                    z10 |= cVar.onNestedPreFling(this, childAt, view, f2, f10);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr) {
        onNestedPreScroll(view, i6, i10, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12) {
        onNestedScroll(view, i6, i10, i11, i12, 0);
    }

    @Override // t0.q
    public final void onNestedScrollAccepted(View view, View view2, int i6, int i10) {
        c cVar;
        s sVar = this.N;
        if (i10 == 1) {
            sVar.f32349b = i6;
        } else {
            sVar.f32348a = i6;
        }
        this.F = view2;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10) && (cVar = fVar.f1929a) != null) {
                cVar.onNestedScrollAccepted(this, childAt, view, view2, i6, i10);
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f39113u);
        SparseArray<Parcelable> sparseArray = hVar.f1946w;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id2 = childAt.getId();
            c cVar = i(childAt).f1929a;
            if (id2 != -1 && cVar != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1929a;
            if (id2 != -1 && cVar != null && (onSaveInstanceState = cVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id2, onSaveInstanceState);
            }
        }
        hVar.f1946w = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return onStartNestedScroll(view, view2, i6, 0);
    }

    @Override // t0.q
    public final void onStopNestedScroll(View view, int i6) {
        s sVar = this.N;
        if (i6 == 1) {
            sVar.f32349b = 0;
        } else {
            sVar.f32348a = 0;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i6)) {
                c cVar = fVar.f1929a;
                if (cVar != null) {
                    cVar.onStopNestedScroll(this, childAt, view, i6);
                }
                if (i6 == 0) {
                    fVar.f1941n = false;
                } else if (i6 == 1) {
                    fVar.f1942o = false;
                }
                fVar.f1943p = false;
            }
        }
        this.F = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean onTouchEvent;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.E == null) {
            z10 = n(motionEvent, 1);
        } else {
            z10 = false;
        }
        c cVar = ((f) this.E.getLayoutParams()).f1929a;
        if (cVar != null) {
            onTouchEvent = cVar.onTouchEvent(this, this.E, motionEvent);
            motionEvent2 = null;
            if (this.E != null) {
                onTouchEvent |= super.onTouchEvent(motionEvent);
            } else if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                p(false);
            }
            return onTouchEvent;
        }
        onTouchEvent = false;
        motionEvent2 = null;
        if (this.E != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        p(false);
        return onTouchEvent;
    }

    public final void p(boolean z10) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            c cVar = ((f) childAt.getLayoutParams()).f1929a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    cVar.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).f1940m = false;
        }
        this.E = null;
        this.B = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f1929a;
        if (cVar != null && cVar.onRequestChildRectangleOnScreen(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.B) {
            p(false);
            this.B = true;
        }
    }

    public final void s() {
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.b(this)) {
            if (this.M == null) {
                this.M = new a();
            }
            d0.i.u(this, this.M);
            setSystemUiVisibility(1280);
            return;
        }
        d0.i.u(this, null);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        s();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.L = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.K;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.K = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.K.setState(getDrawableState());
                }
                Drawable drawable4 = this.K;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                k0.a.c(drawable4, d0.e.d(this));
                Drawable drawable5 = this.K;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.K.setCallback(this);
            }
            WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
            d0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            Context context = getContext();
            Object obj = g0.a.f16164a;
            drawable = a.c.b(context, i6);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
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
        Drawable drawable = this.K;
        if (drawable != null && drawable.isVisible() != z10) {
            this.K.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.K) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    @Override // t0.q
    public final void onNestedPreScroll(View view, int i6, int i10, int[] iArr, int i11) {
        c cVar;
        int min;
        int childCount = getChildCount();
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i11) && (cVar = fVar.f1929a) != null) {
                    int[] iArr2 = this.f1926z;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedPreScroll(this, childAt, view, i6, i10, iArr2, i11);
                    int[] iArr3 = this.f1926z;
                    i12 = i6 > 0 ? Math.max(i12, iArr3[0]) : Math.min(i12, iArr3[0]);
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[1]);
                    } else {
                        min = Math.min(i13, iArr3[1]);
                    }
                    i13 = min;
                    z10 = true;
                }
            }
        }
        iArr[0] = i12;
        iArr[1] = i13;
        if (z10) {
            k(1);
        }
    }

    @Override // t0.q
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i6, i10, i11, i12, 0, this.A);
    }

    @Override // t0.q
    public final boolean onStartNestedScroll(View view, View view2, int i6, int i10) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1929a;
                if (cVar != null) {
                    boolean onStartNestedScroll = cVar.onStartNestedScroll(this, childAt, view, view2, i6, i10);
                    z10 |= onStartNestedScroll;
                    if (i10 == 0) {
                        fVar.f1941n = onStartNestedScroll;
                    } else if (i10 == 1) {
                        fVar.f1942o = onStartNestedScroll;
                    }
                } else if (i10 == 0) {
                    fVar.f1941n = false;
                } else if (i10 == 1) {
                    fVar.f1942o = false;
                }
            }
        }
        return z10;
    }

    @Override // t0.r
    public final void onNestedScroll(View view, int i6, int i10, int i11, int i12, int i13, int[] iArr) {
        c cVar;
        int min;
        int childCount = getChildCount();
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i13) && (cVar = fVar.f1929a) != null) {
                    int[] iArr2 = this.f1926z;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.onNestedScroll(this, childAt, view, i6, i10, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f1926z;
                    i14 = i11 > 0 ? Math.max(i14, iArr3[0]) : Math.min(i14, iArr3[0]);
                    if (i12 > 0) {
                        min = Math.max(i15, iArr3[1]);
                    } else {
                        min = Math.min(i15, iArr3[1]);
                    }
                    i15 = min;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i14;
        iArr[1] = iArr[1] + i15;
        if (z10) {
            k(1);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends z0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public SparseArray<Parcelable> f1946w;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new h[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1946w = new SparseArray<>(readInt);
            for (int i6 = 0; i6 < readInt; i6++) {
                this.f1946w.append(iArr[i6], readParcelableArray[i6]);
            }
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            int i10;
            parcel.writeParcelable(this.f39113u, i6);
            SparseArray<Parcelable> sparseArray = this.f1946w;
            if (sparseArray != null) {
                i10 = sparseArray.size();
            } else {
                i10 = 0;
            }
            parcel.writeInt(i10);
            int[] iArr = new int[i10];
            Parcelable[] parcelableArr = new Parcelable[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = this.f1946w.keyAt(i11);
                parcelableArr[i11] = this.f1946w.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i6);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1929a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1930b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1931c;

        /* renamed from: d  reason: collision with root package name */
        public int f1932d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1933e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public int f1934g;

        /* renamed from: h  reason: collision with root package name */
        public int f1935h;

        /* renamed from: i  reason: collision with root package name */
        public int f1936i;

        /* renamed from: j  reason: collision with root package name */
        public int f1937j;

        /* renamed from: k  reason: collision with root package name */
        public View f1938k;

        /* renamed from: l  reason: collision with root package name */
        public View f1939l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1940m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1941n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1942o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1943p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1944q;
        public Object r;

        public f() {
            super(-2, -2);
            this.f1930b = false;
            this.f1931c = 0;
            this.f1932d = 0;
            this.f1933e = -1;
            this.f = -1;
            this.f1934g = 0;
            this.f1935h = 0;
            this.f1944q = new Rect();
        }

        public final boolean a(int i6) {
            if (i6 != 0) {
                if (i6 != 1) {
                    return false;
                }
                return this.f1942o;
            }
            return this.f1941n;
        }

        public final void b(c cVar) {
            c cVar2 = this.f1929a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.onDetachedFromLayoutParams();
                }
                this.f1929a = cVar;
                this.r = null;
                this.f1930b = true;
                if (cVar != null) {
                    cVar.onAttachedToLayoutParams(this);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f1930b = false;
            this.f1931c = 0;
            this.f1932d = 0;
            this.f1933e = -1;
            this.f = -1;
            this.f1934g = 0;
            this.f1935h = 0;
            this.f1944q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sp.b.f31855b);
            this.f1931c = obtainStyledAttributes.getInteger(0, 0);
            this.f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1932d = obtainStyledAttributes.getInteger(2, 0);
            this.f1933e = obtainStyledAttributes.getInteger(6, -1);
            this.f1934g = obtainStyledAttributes.getInt(5, 0);
            this.f1935h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1930b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.O;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.O;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.Q;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.P);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(defpackage.c.r("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1929a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f1929a;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1930b = false;
            this.f1931c = 0;
            this.f1932d = 0;
            this.f1933e = -1;
            this.f = -1;
            this.f1934g = 0;
            this.f1935h = 0;
            this.f1944q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1930b = false;
            this.f1931c = 0;
            this.f1932d = 0;
            this.f1933e = -1;
            this.f = -1;
            this.f1934g = 0;
            this.f1935h = 0;
            this.f1944q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1930b = false;
            this.f1931c = 0;
            this.f1932d = 0;
            this.f1933e = -1;
            this.f = -1;
            this.f1934g = 0;
            this.f1935h = 0;
            this.f1944q = new Rect();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        onNestedScrollAccepted(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }
}
