package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import g0.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f3087t0 = {16842931};

    /* renamed from: u0  reason: collision with root package name */
    public static final a f3088u0 = new a();

    /* renamed from: v0  reason: collision with root package name */
    public static final b f3089v0 = new b();
    public int A;
    public Parcelable B;
    public ClassLoader C;
    public Scroller D;
    public boolean E;
    public j F;
    public int G;
    public Drawable H;
    public int I;
    public int J;
    public float K;
    public float L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public float f3090a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f3091b0;
    public float c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3092d0;
    public VelocityTracker e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f3093f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f3094g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f3095h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f3096i0;

    /* renamed from: j0  reason: collision with root package name */
    public EdgeEffect f3097j0;

    /* renamed from: k0  reason: collision with root package name */
    public EdgeEffect f3098k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f3099l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f3100m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3101n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f3102o0;

    /* renamed from: p0  reason: collision with root package name */
    public i f3103p0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f3104q0;

    /* renamed from: r0  reason: collision with root package name */
    public final c f3105r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f3106s0;

    /* renamed from: u  reason: collision with root package name */
    public int f3107u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<e> f3108v;

    /* renamed from: w  reason: collision with root package name */
    public final e f3109w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f3110x;

    /* renamed from: y  reason: collision with root package name */
    public k2.a f3111y;

    /* renamed from: z  reason: collision with root package name */
    public int f3112z;

    /* loaded from: classes.dex */
    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f3115b - eVar2.f3115b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.q();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f3114a;

        /* renamed from: b  reason: collision with root package name */
        public int f3115b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3116c;

        /* renamed from: d  reason: collision with root package name */
        public float f3117d;

        /* renamed from: e  reason: collision with root package name */
        public float f3118e;
    }

    /* loaded from: classes.dex */
    public class g extends t0.a {
        public g() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
            if (r0.g() > 1) goto L5;
         */
        @Override // t0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            k2.a aVar;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            k2.a aVar2 = viewPager.f3111y;
            if (aVar2 != null) {
                z10 = true;
            }
            z10 = false;
            accessibilityEvent.setScrollable(z10);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = viewPager.f3111y) != null) {
                accessibilityEvent.setItemCount(aVar.g());
                accessibilityEvent.setFromIndex(viewPager.f3112z);
                accessibilityEvent.setToIndex(viewPager.f3112z);
            }
        }

        @Override // t0.a
        public final void d(View view, u0.h hVar) {
            boolean z10;
            this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
            hVar.g(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            k2.a aVar = viewPager.f3111y;
            if (aVar != null && aVar.g() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.k(z10);
            if (viewPager.canScrollHorizontally(1)) {
                hVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                hVar.a(8192);
            }
        }

        @Override // t0.a
        public final boolean g(View view, int i6, Bundle bundle) {
            if (super.g(view, i6, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i6 != 4096) {
                if (i6 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.f3112z - 1);
                return true;
            } else if (!viewPager.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager.setCurrentItem(viewPager.f3112z + 1);
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(ViewPager viewPager, k2.a aVar);
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(float f, int i6);

        void b(int i6);

        void c(int i6);
    }

    /* loaded from: classes.dex */
    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.f();
        }
    }

    /* loaded from: classes.dex */
    public static class k extends z0.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public int f3125w;

        /* renamed from: x  reason: collision with root package name */
        public Parcelable f3126x;

        /* renamed from: y  reason: collision with root package name */
        public final ClassLoader f3127y;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<k> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new k[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return pl.a.g(sb2, this.f3125w, "}");
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeInt(this.f3125w);
            parcel.writeParcelable(this.f3126x, i6);
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f3125w = parcel.readInt();
            this.f3126x = parcel.readParcelable(classLoader);
            this.f3127y = classLoader;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3108v = new ArrayList<>();
        this.f3109w = new e();
        this.f3110x = new Rect();
        this.A = -1;
        this.B = null;
        this.C = null;
        this.K = -3.4028235E38f;
        this.L = Float.MAX_VALUE;
        this.Q = 1;
        this.f3092d0 = -1;
        this.f3099l0 = true;
        this.f3105r0 = new c();
        this.f3106s0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.D = new Scroller(context2, f3089v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f2 = context2.getResources().getDisplayMetrics().density;
        this.V = viewConfiguration.getScaledPagingTouchSlop();
        this.f3093f0 = (int) (400.0f * f2);
        this.f3094g0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3097j0 = new EdgeEffect(context2);
        this.f3098k0 = new EdgeEffect(context2);
        this.f3095h0 = (int) (25.0f * f2);
        this.f3096i0 = (int) (2.0f * f2);
        this.T = (int) (f2 * 16.0f);
        d0.q(this, new g());
        if (d0.d.c(this) == 0) {
            d0.d.s(this, 1);
        }
        d0.i.u(this, new k2.b(this));
    }

    public static boolean d(int i6, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i6, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        if (z10 && view.canScrollHorizontally(-i6)) {
            return true;
        }
        return false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
        }
    }

    public final e a(int i6, int i10) {
        e eVar = new e();
        eVar.f3115b = i6;
        eVar.f3114a = this.f3111y.i(i6, this);
        this.f3111y.getClass();
        eVar.f3117d = 1.0f;
        ArrayList<e> arrayList = this.f3108v;
        if (i10 >= 0 && i10 < arrayList.size()) {
            arrayList.add(i10, eVar);
        } else {
            arrayList.add(eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i6, int i10) {
        e i11;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (i11 = i(childAt)) != null && i11.f3115b == this.f3112z) {
                    childAt.addFocusables(arrayList, i6, i10);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e i6;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i6 = i(childAt)) != null && i6.f3115b == this.f3112z) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z11 = fVar.f3119a;
        if (view.getClass().getAnnotation(d.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        fVar.f3119a = z12;
        if (this.N) {
            if (!z12) {
                fVar.f3122d = true;
                addViewInLayout(view, i6, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i6, layoutParams);
    }

    public final void b(i iVar) {
        if (this.f3102o0 == null) {
            this.f3102o0 = new ArrayList();
        }
        this.f3102o0.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i6) {
        View findNextFocus;
        int i10;
        boolean requestFocus;
        boolean z10;
        View findFocus = findFocus();
        boolean z11 = true;
        boolean z12 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (parent instanceof ViewGroup) {
                        if (parent == this) {
                            z10 = true;
                            break;
                        }
                        parent = parent.getParent();
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i6);
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.f3110x;
                if (i6 == 17) {
                    int i11 = h(findNextFocus, rect).left;
                    int i12 = h(findFocus, rect).left;
                    if (findFocus != null && i11 >= i12) {
                        int i13 = this.f3112z;
                        if (i13 > 0) {
                            v(i13 - 1);
                            z12 = z11;
                        }
                        z11 = false;
                        z12 = z11;
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                } else if (i6 == 66) {
                    int i14 = h(findNextFocus, rect).left;
                    int i15 = h(findFocus, rect).left;
                    if (findFocus != null && i14 <= i15) {
                        requestFocus = n();
                    } else {
                        requestFocus = findNextFocus.requestFocus();
                    }
                }
                z12 = requestFocus;
            } else if (i6 == 17 && i6 != 1) {
                if (i6 == 66 || i6 == 2) {
                    z12 = n();
                }
            } else {
                i10 = this.f3112z;
                if (i10 > 0) {
                    v(i10 - 1);
                    z12 = z11;
                }
                z11 = false;
                z12 = z11;
            }
            if (z12) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i6));
            }
            return z12;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i6);
        if (findNextFocus == null) {
        }
        if (i6 == 17) {
        }
        i10 = this.f3112z;
        if (i10 > 0) {
        }
        z11 = false;
        z12 = z11;
        if (z12) {
        }
        return z12;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i6) {
        if (this.f3111y == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i6 < 0) {
            if (scrollX <= ((int) (clientWidth * this.K))) {
                return false;
            }
            return true;
        } else if (i6 <= 0 || scrollX >= ((int) (clientWidth * this.L))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.E = true;
        if (!this.D.isFinished() && this.D.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.D.getCurrX();
            int currY = this.D.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!o(currX)) {
                    this.D.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
            return;
        }
        e(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z10 = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z10 = c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    z10 = n();
                } else {
                    z10 = c(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i6 = this.f3112z;
                if (i6 > 0) {
                    v(i6 - 1);
                    z10 = true;
                }
            } else {
                z10 = c(17);
            }
            if (!z10) {
                return true;
            }
            return false;
        }
        z10 = false;
        if (!z10) {
        }
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e i6;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i6 = i(childAt)) != null && i6.f3115b == this.f3112z && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        k2.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.f3111y) == null || aVar.g() <= 1)) {
            this.f3097j0.finish();
            this.f3098k0.finish();
        } else {
            if (!this.f3097j0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.K * width);
                this.f3097j0.setSize(height, width);
                z10 = false | this.f3097j0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3098k0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.L + 1.0f)) * width2);
                this.f3098k0.setSize(height2, width2);
                z10 |= this.f3098k0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e(boolean z10) {
        boolean z11;
        if (this.f3106s0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.D.isFinished()) {
                this.D.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.D.getCurrX();
                int currY = this.D.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.P = false;
        int i6 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f3108v;
            if (i6 >= arrayList.size()) {
                break;
            }
            e eVar = arrayList.get(i6);
            if (eVar.f3116c) {
                eVar.f3116c = false;
                z11 = true;
            }
            i6++;
        }
        if (z11) {
            c cVar = this.f3105r0;
            if (z10) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.m(this, cVar);
                return;
            }
            cVar.run();
        }
    }

    public final void f() {
        boolean z10;
        int g5 = this.f3111y.g();
        this.f3107u = g5;
        ArrayList<e> arrayList = this.f3108v;
        if (arrayList.size() < (this.Q * 2) + 1 && arrayList.size() < g5) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i6 = this.f3112z;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k2.a aVar = this.f3111y;
            Object obj = arrayList.get(i10).f3114a;
            aVar.getClass();
        }
        Collections.sort(arrayList, f3088u0);
        if (z10) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                f fVar = (f) getChildAt(i11).getLayoutParams();
                if (!fVar.f3119a) {
                    fVar.f3121c = 0.0f;
                }
            }
            w(i6, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i6) {
        i iVar = this.f3103p0;
        if (iVar != null) {
            iVar.c(i6);
        }
        ArrayList arrayList = this.f3102o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar2 = (i) this.f3102o0.get(i10);
                if (iVar2 != null) {
                    iVar2.c(i6);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public k2.a getAdapter() {
        return this.f3111y;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f3112z;
    }

    public int getOffscreenPageLimit() {
        return this.Q;
    }

    public int getPageMargin() {
        return this.G;
    }

    public final Rect h(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final e i(View view) {
        int i6 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f3108v;
            if (i6 < arrayList.size()) {
                e eVar = arrayList.get(i6);
                if (this.f3111y.j(view, eVar.f3114a)) {
                    return eVar;
                }
                i6++;
            } else {
                return null;
            }
        }
    }

    public final e j() {
        float f2;
        float f10;
        e eVar;
        int i6;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        if (clientWidth > 0) {
            f2 = getScrollX() / clientWidth;
        } else {
            f2 = 0.0f;
        }
        if (clientWidth > 0) {
            f10 = this.G / clientWidth;
        } else {
            f10 = 0.0f;
        }
        e eVar2 = null;
        float f12 = 0.0f;
        int i10 = -1;
        int i11 = 0;
        boolean z10 = true;
        while (true) {
            ArrayList<e> arrayList = this.f3108v;
            if (i11 < arrayList.size()) {
                e eVar3 = arrayList.get(i11);
                if (!z10 && eVar3.f3115b != (i6 = i10 + 1)) {
                    e eVar4 = this.f3109w;
                    eVar4.f3118e = f11 + f12 + f10;
                    eVar4.f3115b = i6;
                    this.f3111y.getClass();
                    eVar4.f3117d = 1.0f;
                    i11--;
                    eVar = eVar4;
                } else {
                    eVar = eVar3;
                }
                f11 = eVar.f3118e;
                float f13 = eVar.f3117d + f11 + f10;
                if (!z10 && f2 < f11) {
                    return eVar2;
                }
                if (f2 < f13 || i11 == arrayList.size() - 1) {
                    break;
                }
                int i12 = eVar.f3115b;
                float f14 = eVar.f3117d;
                i11++;
                z10 = false;
                e eVar5 = eVar;
                i10 = i12;
                f12 = f14;
                eVar2 = eVar5;
            } else {
                return eVar2;
            }
        }
        return eVar;
    }

    public final e k(int i6) {
        int i10 = 0;
        while (true) {
            ArrayList<e> arrayList = this.f3108v;
            if (i10 < arrayList.size()) {
                e eVar = arrayList.get(i10);
                if (eVar.f3115b == i6) {
                    return eVar;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(float f2, int i6, int i10) {
        int max;
        int i11;
        int left;
        if (this.f3101n0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f3119a) {
                    int i13 = fVar.f3120b & 7;
                    if (i13 != 1) {
                        if (i13 != 3) {
                            if (i13 != 5) {
                                i11 = paddingLeft;
                            } else {
                                max = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i11 = childAt.getWidth() + paddingLeft;
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i11;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = max;
                    i11 = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i11;
                }
            }
        }
        i iVar = this.f3103p0;
        if (iVar != null) {
            iVar.a(f2, i6);
        }
        ArrayList arrayList = this.f3102o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                i iVar2 = (i) this.f3102o0.get(i15);
                if (iVar2 != null) {
                    iVar2.a(f2, i6);
                }
            }
        }
        this.f3100m0 = true;
    }

    public final void m(MotionEvent motionEvent) {
        int i6;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3092d0) {
            if (actionIndex == 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.W = motionEvent.getX(i6);
            this.f3092d0 = motionEvent.getPointerId(i6);
            VelocityTracker velocityTracker = this.e0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        k2.a aVar = this.f3111y;
        if (aVar != null && this.f3112z < aVar.g() - 1) {
            v(this.f3112z + 1);
            return true;
        }
        return false;
    }

    public final boolean o(int i6) {
        if (this.f3108v.size() == 0) {
            if (this.f3099l0) {
                return false;
            }
            this.f3100m0 = false;
            l(0.0f, 0, 0);
            if (this.f3100m0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e j10 = j();
        int clientWidth = getClientWidth();
        int i10 = this.G;
        int i11 = clientWidth + i10;
        float f2 = clientWidth;
        int i12 = j10.f3115b;
        float f10 = ((i6 / f2) - j10.f3118e) / (j10.f3117d + (i10 / f2));
        this.f3100m0 = false;
        l(f10, i12, (int) (i11 * f10));
        if (this.f3100m0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3099l0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3105r0);
        Scroller scroller = this.D;
        if (scroller != null && !scroller.isFinished()) {
            this.D.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i6;
        float f2;
        ArrayList<e> arrayList;
        float f10;
        super.onDraw(canvas);
        if (this.G > 0 && this.H != null) {
            ArrayList<e> arrayList2 = this.f3108v;
            if (arrayList2.size() > 0 && this.f3111y != null) {
                int scrollX = getScrollX();
                float width2 = getWidth();
                float f11 = this.G / width2;
                int i10 = 0;
                e eVar = arrayList2.get(0);
                float f12 = eVar.f3118e;
                int size = arrayList2.size();
                int i11 = eVar.f3115b;
                int i12 = arrayList2.get(size - 1).f3115b;
                while (i11 < i12) {
                    while (true) {
                        i6 = eVar.f3115b;
                        if (i11 <= i6 || i10 >= size) {
                            break;
                        }
                        i10++;
                        eVar = arrayList2.get(i10);
                    }
                    if (i11 == i6) {
                        float f13 = eVar.f3118e;
                        float f14 = eVar.f3117d;
                        f2 = (f13 + f14) * width2;
                        f12 = f13 + f14 + f11;
                    } else {
                        this.f3111y.getClass();
                        f2 = (f12 + 1.0f) * width2;
                        f12 = 1.0f + f11 + f12;
                    }
                    if (this.G + f2 > scrollX) {
                        arrayList = arrayList2;
                        f10 = f11;
                        this.H.setBounds(Math.round(f2), this.I, Math.round(this.G + f2), this.J);
                        this.H.draw(canvas);
                    } else {
                        arrayList = arrayList2;
                        f10 = f11;
                    }
                    if (f2 <= scrollX + width) {
                        i11++;
                        arrayList2 = arrayList;
                        f11 = f10;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        boolean z10;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.R) {
                    return true;
                }
                if (this.S) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m(motionEvent);
                    }
                } else {
                    int i6 = this.f3092d0;
                    if (i6 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i6);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f10 = x10 - this.W;
                        float abs = Math.abs(f10);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.c0);
                        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                        if (i10 != 0) {
                            float f11 = this.W;
                            if ((f11 < this.U && i10 > 0) || (f11 > getWidth() - this.U && f10 < 0.0f)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && d((int) f10, (int) x10, (int) y10, this, false)) {
                                this.W = x10;
                                this.f3090a0 = y10;
                                this.S = true;
                                return false;
                            }
                        }
                        float f12 = this.V;
                        if (abs > f12 && abs * 0.5f > abs2) {
                            this.R = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f13 = this.f3091b0;
                            float f14 = this.V;
                            if (i10 > 0) {
                                f2 = f13 + f14;
                            } else {
                                f2 = f13 - f14;
                            }
                            this.W = f2;
                            this.f3090a0 = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f12) {
                            this.S = true;
                        }
                        if (this.R && p(x10)) {
                            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                            d0.d.k(this);
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.f3091b0 = x11;
                this.W = x11;
                float y11 = motionEvent.getY();
                this.c0 = y11;
                this.f3090a0 = y11;
                this.f3092d0 = motionEvent.getPointerId(0);
                this.S = false;
                this.E = true;
                this.D.computeScrollOffset();
                if (this.f3106s0 == 2 && Math.abs(this.D.getFinalX() - this.D.getCurrX()) > this.f3096i0) {
                    this.D.abortAnimation();
                    this.P = false;
                    q();
                    this.R = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    e(false);
                    this.R = false;
                }
            }
            if (this.e0 == null) {
                this.e0 = VelocityTracker.obtain();
            }
            this.e0.addMovement(motionEvent);
            return this.R;
        }
        t();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        boolean z11;
        e i13;
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i11 - i6;
        int i17 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.f3119a) {
                    int i20 = fVar.f3120b;
                    int i21 = i20 & 7;
                    int i22 = i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    if (i21 != 1) {
                        if (i21 != 3) {
                            if (i21 != 5) {
                                i14 = paddingLeft;
                            } else {
                                max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i22 == 16) {
                            if (i22 != 48) {
                                if (i22 != 80) {
                                    i15 = paddingTop;
                                } else {
                                    max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                            i18++;
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = max2;
                        i15 = paddingTop;
                        paddingTop = i24;
                        int i232 = paddingLeft + scrollX;
                        childAt.layout(i232, paddingTop, childAt.getMeasuredWidth() + i232, childAt.getMeasuredHeight() + paddingTop);
                        i18++;
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i25 = max;
                    i14 = paddingLeft;
                    paddingLeft = i25;
                    if (i22 == 16) {
                    }
                    int i242 = max2;
                    i15 = paddingTop;
                    paddingTop = i242;
                    int i2322 = paddingLeft + scrollX;
                    childAt.layout(i2322, paddingTop, childAt.getMeasuredWidth() + i2322, childAt.getMeasuredHeight() + paddingTop);
                    i18++;
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        int i26 = (i16 - paddingLeft) - paddingRight;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8) {
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.f3119a && (i13 = i(childAt2)) != null) {
                    float f2 = i26;
                    int i28 = ((int) (i13.f3118e * f2)) + paddingLeft;
                    if (fVar2.f3122d) {
                        fVar2.f3122d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * fVar2.f3121c), 1073741824), View.MeasureSpec.makeMeasureSpec((i17 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i28, paddingTop, childAt2.getMeasuredWidth() + i28, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.I = paddingTop;
        this.J = i17 - paddingBottom;
        this.f3101n0 = i18;
        if (this.f3099l0) {
            z11 = false;
            u(this.f3112z, 0, false, false);
        } else {
            z11 = false;
        }
        this.f3099l0 = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        f fVar;
        f fVar2;
        boolean z10;
        int i11;
        int i12;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i6), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.U = Math.min(measuredWidth / 10, this.T);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f3119a) {
                int i16 = fVar2.f3120b;
                int i17 = i16 & 7;
                int i18 = i16 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                if (i18 != 48 && i18 != 80) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = LinearLayoutManager.INVALID_OFFSET;
                if (z10) {
                    i19 = 1073741824;
                } else if (z11) {
                    i11 = 1073741824;
                    i12 = ((ViewGroup.LayoutParams) fVar2).width;
                    if (i12 == -2) {
                        if (i12 == -1) {
                            i12 = paddingLeft;
                        }
                        i19 = 1073741824;
                    } else {
                        i12 = paddingLeft;
                    }
                    i13 = ((ViewGroup.LayoutParams) fVar2).height;
                    if (i13 == -2) {
                        if (i13 == -1) {
                            i13 = measuredHeight;
                        }
                    } else {
                        i13 = measuredHeight;
                        i15 = i11;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i19), View.MeasureSpec.makeMeasureSpec(i13, i15));
                    if (!z10) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z11) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i11 = LinearLayoutManager.INVALID_OFFSET;
                i12 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i12 == -2) {
                }
                i13 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i13 == -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i19), View.MeasureSpec.makeMeasureSpec(i13, i15));
                if (!z10) {
                }
            }
            i14++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.M = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.N = true;
        q();
        this.N = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f3119a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f3121c), 1073741824), this.M);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        int i10;
        int i11;
        int i12;
        e i13;
        int childCount = getChildCount();
        if ((i6 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (i13 = i(childAt)) != null && i13.f3115b == this.f3112z && childAt.requestFocus(i6, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f39113u);
        k2.a aVar = this.f3111y;
        ClassLoader classLoader = kVar.f3127y;
        if (aVar != null) {
            aVar.l(kVar.f3126x, classLoader);
            w(kVar.f3125w, 0, false, true);
            return;
        }
        this.A = kVar.f3125w;
        this.B = kVar.f3126x;
        this.C = classLoader;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3125w = this.f3112z;
        k2.a aVar = this.f3111y;
        if (aVar != null) {
            kVar.f3126x = aVar.m();
        }
        return kVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i6 != i11) {
            int i13 = this.G;
            s(i6, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k2.a aVar;
        float f2;
        float f10;
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f3111y) == null || aVar.g() == 0) {
            return false;
        }
        if (this.e0 == null) {
            this.e0 = VelocityTracker.obtain();
        }
        this.e0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m(motionEvent);
                                this.W = motionEvent.getX(motionEvent.findPointerIndex(this.f3092d0));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.W = motionEvent.getX(actionIndex);
                            this.f3092d0 = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.R) {
                        u(this.f3112z, 0, true, false);
                        z10 = t();
                    }
                } else {
                    if (!this.R) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3092d0);
                        if (findPointerIndex == -1) {
                            z10 = t();
                        } else {
                            float x10 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x10 - this.W);
                            float y10 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y10 - this.f3090a0);
                            if (abs > this.V && abs > abs2) {
                                this.R = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f11 = this.f3091b0;
                                if (x10 - f11 > 0.0f) {
                                    f10 = f11 + this.V;
                                } else {
                                    f10 = f11 - this.V;
                                }
                                this.W = f10;
                                this.f3090a0 = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.R) {
                        z10 = false | p(motionEvent.getX(motionEvent.findPointerIndex(this.f3092d0)));
                    }
                }
            } else if (this.R) {
                VelocityTracker velocityTracker = this.e0;
                velocityTracker.computeCurrentVelocity(1000, this.f3094g0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f3092d0);
                this.P = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                e j10 = j();
                float f12 = clientWidth;
                int i6 = j10.f3115b;
                float f13 = ((scrollX / f12) - j10.f3118e) / (j10.f3117d + (this.G / f12));
                if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3092d0)) - this.f3091b0)) > this.f3095h0 && Math.abs(xVelocity) > this.f3093f0) {
                    if (xVelocity <= 0) {
                        i6++;
                    }
                } else {
                    if (i6 >= this.f3112z) {
                        f2 = 0.4f;
                    } else {
                        f2 = 0.6f;
                    }
                    i6 += (int) (f13 + f2);
                }
                ArrayList<e> arrayList = this.f3108v;
                if (arrayList.size() > 0) {
                    i6 = Math.max(arrayList.get(0).f3115b, Math.min(i6, arrayList.get(arrayList.size() - 1).f3115b));
                }
                w(i6, xVelocity, true, true);
                z10 = t();
            }
        } else {
            this.D.abortAnimation();
            this.P = false;
            q();
            float x11 = motionEvent.getX();
            this.f3091b0 = x11;
            this.W = x11;
            float y11 = motionEvent.getY();
            this.c0 = y11;
            this.f3090a0 = y11;
            this.f3092d0 = motionEvent.getPointerId(0);
        }
        if (z10) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(this);
        }
        return true;
    }

    public final boolean p(float f2) {
        boolean z10;
        boolean z11;
        float f10 = this.W - f2;
        this.W = f2;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.K * clientWidth;
        float f12 = this.L * clientWidth;
        ArrayList<e> arrayList = this.f3108v;
        boolean z12 = false;
        e eVar = arrayList.get(0);
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f3115b != 0) {
            f11 = eVar.f3118e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f3115b != this.f3111y.g() - 1) {
            f12 = eVar2.f3118e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f11) {
            if (z10) {
                this.f3097j0.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z11) {
                this.f3098k0.onPull(Math.abs(scrollX - f12) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        }
        int i6 = (int) scrollX;
        this.W = (scrollX - i6) + this.W;
        scrollTo(i6, getScrollY());
        o(i6);
        return z12;
    }

    public final void q() {
        r(this.f3112z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r6 == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(int i6) {
        e eVar;
        String hexString;
        ArrayList<e> arrayList;
        e eVar2;
        e eVar3;
        e i10;
        e eVar4;
        float paddingLeft;
        float f2;
        float f10;
        float f11;
        int i11;
        int i12;
        e eVar5;
        e eVar6;
        e eVar7;
        float paddingRight;
        int i13 = this.f3112z;
        if (i13 != i6) {
            eVar = k(i13);
            this.f3112z = i6;
        } else {
            eVar = null;
        }
        if (this.f3111y == null || this.P || getWindowToken() == null) {
            return;
        }
        this.f3111y.p(this);
        int i14 = this.Q;
        int max = Math.max(0, this.f3112z - i14);
        int g5 = this.f3111y.g();
        int min = Math.min(g5 - 1, this.f3112z + i14);
        if (g5 == this.f3107u) {
            int i15 = 0;
            while (true) {
                arrayList = this.f3108v;
                if (i15 >= arrayList.size()) {
                    break;
                }
                eVar2 = arrayList.get(i15);
                int i16 = eVar2.f3115b;
                int i17 = this.f3112z;
                if (i16 < i17) {
                    i15++;
                }
            }
            eVar2 = null;
            if (eVar2 == null && g5 > 0) {
                eVar2 = a(this.f3112z, i15);
            }
            if (eVar2 != null) {
                int i18 = i15 - 1;
                if (i18 >= 0) {
                    eVar4 = arrayList.get(i18);
                } else {
                    eVar4 = null;
                }
                int clientWidth = getClientWidth();
                if (clientWidth <= 0) {
                    paddingLeft = 0.0f;
                } else {
                    paddingLeft = (2.0f - eVar2.f3117d) + (getPaddingLeft() / clientWidth);
                }
                float f12 = 0.0f;
                for (int i19 = this.f3112z - 1; i19 >= 0; i19--) {
                    if (f12 >= paddingLeft && i19 < max) {
                        if (eVar4 == null) {
                            break;
                        } else if (i19 == eVar4.f3115b && !eVar4.f3116c) {
                            arrayList.remove(i18);
                            this.f3111y.e(this, i19, eVar4.f3114a);
                            i18--;
                            i15--;
                            if (i18 >= 0) {
                                eVar4 = arrayList.get(i18);
                            }
                            eVar4 = null;
                        }
                    } else if (eVar4 != null && i19 == eVar4.f3115b) {
                        f12 += eVar4.f3117d;
                        i18--;
                        if (i18 >= 0) {
                            eVar4 = arrayList.get(i18);
                        }
                        eVar4 = null;
                    } else {
                        f12 += a(i19, i18 + 1).f3117d;
                        i15++;
                        if (i18 >= 0) {
                            eVar4 = arrayList.get(i18);
                        }
                        eVar4 = null;
                    }
                }
                float f13 = eVar2.f3117d;
                int i20 = i15 + 1;
                if (f13 < 2.0f) {
                    if (i20 < arrayList.size()) {
                        eVar7 = arrayList.get(i20);
                    } else {
                        eVar7 = null;
                    }
                    if (clientWidth <= 0) {
                        paddingRight = 0.0f;
                    } else {
                        paddingRight = (getPaddingRight() / clientWidth) + 2.0f;
                    }
                    int i21 = i20;
                    for (int i22 = this.f3112z + 1; i22 < g5; i22++) {
                        if (f13 >= paddingRight && i22 > min) {
                            if (eVar7 == null) {
                                break;
                            } else if (i22 == eVar7.f3115b && !eVar7.f3116c) {
                                arrayList.remove(i21);
                                this.f3111y.e(this, i22, eVar7.f3114a);
                                if (i21 < arrayList.size()) {
                                    eVar7 = arrayList.get(i21);
                                }
                                eVar7 = null;
                            }
                        } else if (eVar7 != null && i22 == eVar7.f3115b) {
                            f13 += eVar7.f3117d;
                            i21++;
                            if (i21 < arrayList.size()) {
                                eVar7 = arrayList.get(i21);
                            }
                            eVar7 = null;
                        } else {
                            e a10 = a(i22, i21);
                            i21++;
                            f13 += a10.f3117d;
                            if (i21 < arrayList.size()) {
                                eVar7 = arrayList.get(i21);
                            }
                            eVar7 = null;
                        }
                    }
                }
                int g10 = this.f3111y.g();
                int clientWidth2 = getClientWidth();
                if (clientWidth2 > 0) {
                    f2 = this.G / clientWidth2;
                } else {
                    f2 = 0.0f;
                }
                if (eVar != null) {
                    int i23 = eVar.f3115b;
                    int i24 = eVar2.f3115b;
                    if (i23 < i24) {
                        float f14 = eVar.f3118e + eVar.f3117d + f2;
                        int i25 = i23 + 1;
                        int i26 = 0;
                        while (i25 <= eVar2.f3115b && i26 < arrayList.size()) {
                            e eVar8 = arrayList.get(i26);
                            while (true) {
                                eVar6 = eVar8;
                                if (i25 <= eVar6.f3115b || i26 >= arrayList.size() - 1) {
                                    break;
                                }
                                i26++;
                                eVar8 = arrayList.get(i26);
                            }
                            while (i25 < eVar6.f3115b) {
                                this.f3111y.getClass();
                                f14 += 1.0f + f2;
                                i25++;
                            }
                            eVar6.f3118e = f14;
                            f14 += eVar6.f3117d + f2;
                            i25++;
                        }
                    } else if (i23 > i24) {
                        int size = arrayList.size() - 1;
                        float f15 = eVar.f3118e;
                        while (true) {
                            i23--;
                            if (i23 < eVar2.f3115b || size < 0) {
                                break;
                            }
                            e eVar9 = arrayList.get(size);
                            while (true) {
                                eVar5 = eVar9;
                                if (i23 >= eVar5.f3115b || size <= 0) {
                                    break;
                                }
                                size--;
                                eVar9 = arrayList.get(size);
                            }
                            while (i23 > eVar5.f3115b) {
                                this.f3111y.getClass();
                                f15 -= 1.0f + f2;
                                i23--;
                            }
                            f15 -= eVar5.f3117d + f2;
                            eVar5.f3118e = f15;
                        }
                    }
                }
                int size2 = arrayList.size();
                float f16 = eVar2.f3118e;
                int i27 = eVar2.f3115b;
                int i28 = i27 - 1;
                if (i27 == 0) {
                    f10 = f16;
                } else {
                    f10 = -3.4028235E38f;
                }
                this.K = f10;
                int i29 = g10 - 1;
                if (i27 == i29) {
                    f11 = (eVar2.f3117d + f16) - 1.0f;
                } else {
                    f11 = Float.MAX_VALUE;
                }
                this.L = f11;
                int i30 = i15 - 1;
                while (i30 >= 0) {
                    e eVar10 = arrayList.get(i30);
                    while (true) {
                        i12 = eVar10.f3115b;
                        if (i28 <= i12) {
                            break;
                        }
                        i28--;
                        this.f3111y.getClass();
                        f16 -= 1.0f + f2;
                    }
                    f16 -= eVar10.f3117d + f2;
                    eVar10.f3118e = f16;
                    if (i12 == 0) {
                        this.K = f16;
                    }
                    i30--;
                    i28--;
                }
                float f17 = eVar2.f3118e + eVar2.f3117d + f2;
                int i31 = eVar2.f3115b;
                while (true) {
                    i31++;
                    if (i20 >= size2) {
                        break;
                    }
                    e eVar11 = arrayList.get(i20);
                    while (true) {
                        i11 = eVar11.f3115b;
                        if (i31 >= i11) {
                            break;
                        }
                        i31++;
                        this.f3111y.getClass();
                        f17 += 1.0f + f2;
                    }
                    if (i11 == i29) {
                        this.L = (eVar11.f3117d + f17) - 1.0f;
                    }
                    eVar11.f3118e = f17;
                    f17 += eVar11.f3117d + f2;
                    i20++;
                }
                this.f3111y.n(eVar2.f3114a);
            }
            this.f3111y.f();
            int childCount = getChildCount();
            for (int i32 = 0; i32 < childCount; i32++) {
                View childAt = getChildAt(i32);
                f fVar = (f) childAt.getLayoutParams();
                fVar.getClass();
                if (!fVar.f3119a && fVar.f3121c == 0.0f && (i10 = i(childAt)) != null) {
                    fVar.f3121c = i10.f3117d;
                    int i33 = i10.f3115b;
                    fVar.getClass();
                }
            }
            if (hasFocus()) {
                View findFocus = findFocus();
                if (findFocus != null) {
                    while (true) {
                        ViewParent parent = findFocus.getParent();
                        if (parent != this) {
                            if (parent == null || !(parent instanceof View)) {
                                break;
                            }
                            findFocus = (View) parent;
                        } else {
                            eVar3 = i(findFocus);
                            break;
                        }
                    }
                }
                eVar3 = null;
                if (eVar3 == null || eVar3.f3115b != this.f3112z) {
                    for (int i34 = 0; i34 < getChildCount(); i34++) {
                        View childAt2 = getChildAt(i34);
                        e i35 = i(childAt2);
                        if (i35 != null && i35.f3115b == this.f3112z && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f3107u + ", found: " + g5 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f3111y.getClass());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.N) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i6, int i10, int i11, int i12) {
        float f2;
        if (i10 > 0 && !this.f3108v.isEmpty()) {
            if (!this.D.isFinished()) {
                this.D.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i6 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
            return;
        }
        e k10 = k(this.f3112z);
        if (k10 != null) {
            f2 = Math.min(k10.f3118e, this.L);
        } else {
            f2 = 0.0f;
        }
        int paddingLeft = (int) (f2 * ((i6 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            e(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    public void setAdapter(k2.a aVar) {
        ArrayList<e> arrayList;
        k2.a aVar2 = this.f3111y;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f22772b = null;
            }
            this.f3111y.p(this);
            int i6 = 0;
            while (true) {
                arrayList = this.f3108v;
                if (i6 >= arrayList.size()) {
                    break;
                }
                e eVar = arrayList.get(i6);
                this.f3111y.e(this, eVar.f3115b, eVar.f3114a);
                i6++;
            }
            this.f3111y.f();
            arrayList.clear();
            int i10 = 0;
            while (i10 < getChildCount()) {
                if (!((f) getChildAt(i10).getLayoutParams()).f3119a) {
                    removeViewAt(i10);
                    i10--;
                }
                i10++;
            }
            this.f3112z = 0;
            scrollTo(0, 0);
        }
        this.f3111y = aVar;
        this.f3107u = 0;
        if (aVar != null) {
            if (this.F == null) {
                this.F = new j();
            }
            this.f3111y.o(this.F);
            this.P = false;
            boolean z10 = this.f3099l0;
            this.f3099l0 = true;
            this.f3107u = this.f3111y.g();
            if (this.A >= 0) {
                this.f3111y.l(this.B, this.C);
                w(this.A, 0, false, true);
                this.A = -1;
                this.B = null;
                this.C = null;
            } else if (!z10) {
                q();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList2 = this.f3104q0;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = this.f3104q0.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((h) this.f3104q0.get(i11)).a(this, aVar);
            }
        }
    }

    public void setCurrentItem(int i6) {
        this.P = false;
        w(i6, 0, !this.f3099l0, false);
    }

    public void setOffscreenPageLimit(int i6) {
        if (i6 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i6 + " too small; defaulting to 1");
            i6 = 1;
        }
        if (i6 != this.Q) {
            this.Q = i6;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f3103p0 = iVar;
    }

    public void setPageMargin(int i6) {
        int i10 = this.G;
        this.G = i6;
        int width = getWidth();
        s(width, width, i6, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.H = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i6) {
        if (this.f3106s0 == i6) {
            return;
        }
        this.f3106s0 = i6;
        i iVar = this.f3103p0;
        if (iVar != null) {
            iVar.b(i6);
        }
        ArrayList arrayList = this.f3102o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar2 = (i) this.f3102o0.get(i10);
                if (iVar2 != null) {
                    iVar2.b(i6);
                }
            }
        }
    }

    public final boolean t() {
        this.f3092d0 = -1;
        this.R = false;
        this.S = false;
        VelocityTracker velocityTracker = this.e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.e0 = null;
        }
        this.f3097j0.onRelease();
        this.f3098k0.onRelease();
        if (!this.f3097j0.isFinished() && !this.f3098k0.isFinished()) {
            return false;
        }
        return true;
    }

    public final void u(int i6, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12;
        int scrollX;
        int abs;
        e k10 = k(i6);
        if (k10 != null) {
            i11 = (int) (Math.max(this.K, Math.min(k10.f3118e, this.L)) * getClientWidth());
        } else {
            i11 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.D;
                if (scroller != null && !scroller.isFinished()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.E) {
                        scrollX = this.D.getCurrX();
                    } else {
                        scrollX = this.D.getStartX();
                    }
                    this.D.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i12 = scrollX;
                int scrollY = getScrollY();
                int i13 = i11 - i12;
                int i14 = 0 - scrollY;
                if (i13 == 0 && i14 == 0) {
                    e(false);
                    q();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i15 = clientWidth / 2;
                    float f2 = clientWidth;
                    float f10 = i15;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f10) + f10;
                    int abs2 = Math.abs(i10);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.f3111y.getClass();
                        abs = (int) (((Math.abs(i13) / ((f2 * 1.0f) + this.G)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.E = false;
                    this.D.startScroll(i12, scrollY, i13, i14, min);
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.k(this);
                }
            }
            if (z11) {
                g(i6);
                return;
            }
            return;
        }
        if (z11) {
            g(i6);
        }
        e(false);
        scrollTo(i11, 0);
        o(i11);
    }

    public final void v(int i6) {
        this.P = false;
        w(i6, 0, true, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.H) {
            return false;
        }
        return true;
    }

    public final void w(int i6, int i10, boolean z10, boolean z11) {
        k2.a aVar = this.f3111y;
        boolean z12 = false;
        if (aVar != null && aVar.g() > 0) {
            ArrayList<e> arrayList = this.f3108v;
            if (!z11 && this.f3112z == i6 && arrayList.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i6 < 0) {
                i6 = 0;
            } else if (i6 >= this.f3111y.g()) {
                i6 = this.f3111y.g() - 1;
            }
            int i11 = this.Q;
            int i12 = this.f3112z;
            if (i6 > i12 + i11 || i6 < i12 - i11) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    arrayList.get(i13).f3116c = true;
                }
            }
            if (this.f3112z != i6) {
                z12 = true;
            }
            if (this.f3099l0) {
                this.f3112z = i6;
                if (z12) {
                    g(i6);
                }
                requestLayout();
                return;
            }
            r(i6);
            u(i6, i10, z10, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3119a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3120b;

        /* renamed from: c  reason: collision with root package name */
        public float f3121c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3122d;

        public f() {
            super(-1, -1);
            this.f3121c = 0.0f;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3121c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3087t0);
            this.f3120b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i6) {
        Context context = getContext();
        Object obj = g0.a.f16164a;
        setPageMarginDrawable(a.c.b(context, i6));
    }
}
