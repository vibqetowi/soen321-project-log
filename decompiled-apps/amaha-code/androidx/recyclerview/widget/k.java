package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.SimpleItemTouchVerticalDragHelperCallback;
import ek.k1;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class k extends RecyclerView.l implements RecyclerView.o {
    public Rect A;
    public long B;

    /* renamed from: d  reason: collision with root package name */
    public float f2999d;

    /* renamed from: e  reason: collision with root package name */
    public float f3000e;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f3001g;

    /* renamed from: h  reason: collision with root package name */
    public float f3002h;

    /* renamed from: i  reason: collision with root package name */
    public float f3003i;

    /* renamed from: j  reason: collision with root package name */
    public float f3004j;

    /* renamed from: k  reason: collision with root package name */
    public float f3005k;

    /* renamed from: m  reason: collision with root package name */
    public final d f3007m;

    /* renamed from: o  reason: collision with root package name */
    public int f3009o;

    /* renamed from: q  reason: collision with root package name */
    public int f3011q;
    public RecyclerView r;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f3013t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f3014u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f3015v;

    /* renamed from: x  reason: collision with root package name */
    public t0.e f3017x;

    /* renamed from: y  reason: collision with root package name */
    public e f3018y;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2996a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2997b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView.c0 f2998c = null;

    /* renamed from: l  reason: collision with root package name */
    public int f3006l = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f3008n = 0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f3010p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final a f3012s = new a();

    /* renamed from: w  reason: collision with root package name */
    public View f3016w = null;

    /* renamed from: z  reason: collision with root package name */
    public final b f3019z = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
            if (r11 < 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
            if (r11 > 0) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            long j10;
            int i6;
            int i10;
            int i11;
            int i12;
            boolean z10;
            k kVar = k.this;
            if (kVar.f2998c != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j11 = kVar.B;
                if (j11 == Long.MIN_VALUE) {
                    j10 = 0;
                } else {
                    j10 = currentTimeMillis - j11;
                }
                RecyclerView.m layoutManager = kVar.r.getLayoutManager();
                if (kVar.A == null) {
                    kVar.A = new Rect();
                }
                layoutManager.calculateItemDecorationsForChild(kVar.f2998c.f2751a, kVar.A);
                if (layoutManager.canScrollHorizontally()) {
                    int i13 = (int) (kVar.f3004j + kVar.f3002h);
                    i6 = (i13 - kVar.A.left) - kVar.r.getPaddingLeft();
                    float f = kVar.f3002h;
                    if (f < 0.0f) {
                    }
                    if (f > 0.0f) {
                        i6 = ((kVar.f2998c.f2751a.getWidth() + i13) + kVar.A.right) - (kVar.r.getWidth() - kVar.r.getPaddingRight());
                    }
                }
                i6 = 0;
                if (layoutManager.canScrollVertically()) {
                    int i14 = (int) (kVar.f3005k + kVar.f3003i);
                    int paddingTop = (i14 - kVar.A.top) - kVar.r.getPaddingTop();
                    float f2 = kVar.f3003i;
                    if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((kVar.f2998c.f2751a.getHeight() + i14) + kVar.A.bottom) - (kVar.r.getHeight() - kVar.r.getPaddingBottom())) > 0)) {
                        i10 = paddingTop;
                        if (i6 != 0) {
                            i6 = kVar.f3007m.interpolateOutOfBoundsScroll(kVar.r, kVar.f2998c.f2751a.getWidth(), i6, kVar.r.getWidth(), j10);
                        }
                        int i15 = i6;
                        if (i10 == 0) {
                            i11 = i15;
                            i10 = kVar.f3007m.interpolateOutOfBoundsScroll(kVar.r, kVar.f2998c.f2751a.getHeight(), i10, kVar.r.getHeight(), j10);
                        } else {
                            i11 = i15;
                        }
                        i12 = i10;
                        if (i11 != 0 && i12 == 0) {
                            kVar.B = Long.MIN_VALUE;
                            z10 = false;
                        } else {
                            if (kVar.B == Long.MIN_VALUE) {
                                kVar.B = currentTimeMillis;
                            }
                            kVar.r.scrollBy(i11, i12);
                            z10 = true;
                        }
                        if (!z10) {
                            RecyclerView.c0 c0Var = kVar.f2998c;
                            if (c0Var != null) {
                                kVar.q(c0Var);
                            }
                            kVar.r.removeCallbacks(kVar.f3012s);
                            RecyclerView recyclerView = kVar.r;
                            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                            d0.d.m(recyclerView, this);
                            return;
                        }
                        return;
                    }
                }
                i10 = 0;
                if (i6 != 0) {
                }
                int i152 = i6;
                if (i10 == 0) {
                }
                i12 = i10;
                if (i11 != 0) {
                }
                if (kVar.B == Long.MIN_VALUE) {
                }
                kVar.r.scrollBy(i11, i12);
                z10 = true;
                if (!z10) {
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            k kVar = k.this;
            kVar.f3017x.f32307a.f32308a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = kVar.f3013t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (kVar.f3006l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(kVar.f3006l);
            if (findPointerIndex >= 0) {
                kVar.k(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.c0 c0Var = kVar.f2998c;
            if (c0Var == null) {
                return;
            }
            int i6 = 1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == kVar.f3006l) {
                                if (actionIndex != 0) {
                                    i6 = 0;
                                }
                                kVar.f3006l = motionEvent.getPointerId(i6);
                                kVar.u(kVar.f3009o, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = kVar.f3013t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    kVar.u(kVar.f3009o, findPointerIndex, motionEvent);
                    kVar.q(c0Var);
                    RecyclerView recyclerView2 = kVar.r;
                    a aVar = kVar.f3012s;
                    recyclerView2.removeCallbacks(aVar);
                    aVar.run();
                    kVar.r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            kVar.s(null, 0);
            kVar.f3006l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            k kVar = k.this;
            kVar.f3017x.f32307a.f32308a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                kVar.f3006l = motionEvent.getPointerId(0);
                kVar.f2999d = motionEvent.getX();
                kVar.f3000e = motionEvent.getY();
                VelocityTracker velocityTracker = kVar.f3013t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                kVar.f3013t = VelocityTracker.obtain();
                if (kVar.f2998c == null) {
                    ArrayList arrayList = kVar.f3010p;
                    if (!arrayList.isEmpty()) {
                        View n10 = kVar.n(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.f3031e.f2751a == n10) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        kVar.f2999d -= fVar.f3034i;
                        kVar.f3000e -= fVar.f3035j;
                        RecyclerView.c0 c0Var = fVar.f3031e;
                        kVar.m(c0Var, true);
                        if (kVar.f2996a.remove(c0Var.f2751a)) {
                            kVar.f3007m.clearView(kVar.r, c0Var);
                        }
                        kVar.s(c0Var, fVar.f);
                        kVar.u(kVar.f3009o, 0, motionEvent);
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i6 = kVar.f3006l;
                if (i6 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i6)) >= 0) {
                    kVar.k(actionMasked, findPointerIndex, motionEvent);
                }
            } else {
                kVar.f3006l = -1;
                kVar.s(null, 0);
            }
            VelocityTracker velocityTracker2 = kVar.f3013t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (kVar.f2998c == null) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void e(boolean z10) {
            if (!z10) {
                return;
            }
            k.this.s(null, 0);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends f {

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ int f3022n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f3023o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.c0 c0Var, int i6, int i10, float f, float f2, float f10, float f11, int i11, RecyclerView.c0 c0Var2) {
            super(c0Var, i10, f, f2, f10, f11);
            this.f3022n = i11;
            this.f3023o = c0Var2;
        }

        @Override // androidx.recyclerview.widget.k.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f3036k) {
                return;
            }
            int i6 = this.f3022n;
            RecyclerView.c0 c0Var = this.f3023o;
            k kVar = k.this;
            if (i6 <= 0) {
                kVar.f3007m.clearView(kVar.r, c0Var);
            } else {
                kVar.f2996a.add(c0Var.f2751a);
                this.f3033h = true;
                if (i6 > 0) {
                    kVar.r.post(new l(kVar, this, i6));
                }
            }
            View view = kVar.f3016w;
            View view2 = c0Var.f2751a;
            if (view == view2) {
                kVar.r(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: u  reason: collision with root package name */
        public boolean f3025u = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            k kVar;
            View n10;
            RecyclerView.c0 K;
            if (!this.f3025u || (n10 = (kVar = k.this).n(motionEvent)) == null || (K = kVar.r.K(n10)) == null || !kVar.f3007m.hasDragFlag(kVar.r, K)) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            int i6 = kVar.f3006l;
            if (pointerId == i6) {
                int findPointerIndex = motionEvent.findPointerIndex(i6);
                float x10 = motionEvent.getX(findPointerIndex);
                float y10 = motionEvent.getY(findPointerIndex);
                kVar.f2999d = x10;
                kVar.f3000e = y10;
                kVar.f3003i = 0.0f;
                kVar.f3002h = 0.0f;
                if (kVar.f3007m.isLongPressDragEnabled()) {
                    kVar.s(K, 2);
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface g {
        void prepareForDrop(View view, View view2, int i6, int i10);
    }

    public k(SimpleItemTouchVerticalDragHelperCallback simpleItemTouchVerticalDragHelperCallback) {
        this.f3007m = simpleItemTouchVerticalDragHelperCallback;
    }

    public static boolean p(View view, float f2, float f10, float f11, float f12) {
        if (f2 >= f11 && f2 <= f11 + view.getWidth() && f10 >= f12 && f10 <= f12 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b(View view) {
        r(view);
        RecyclerView.c0 K = this.r.K(view);
        if (K == null) {
            return;
        }
        RecyclerView.c0 c0Var = this.f2998c;
        if (c0Var != null && K == c0Var) {
            s(null, 0);
            return;
        }
        m(K, false);
        if (this.f2996a.remove(K.f2751a)) {
            this.f3007m.clearView(this.r, K);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        float f2;
        float f10;
        if (this.f2998c != null) {
            float[] fArr = this.f2997b;
            o(fArr);
            float f11 = fArr[0];
            f10 = fArr[1];
            f2 = f11;
        } else {
            f2 = 0.0f;
            f10 = 0.0f;
        }
        this.f3007m.onDraw(canvas, recyclerView, this.f2998c, this.f3010p, this.f3008n, f2, f10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        float f2;
        float f10;
        if (this.f2998c != null) {
            float[] fArr = this.f2997b;
            o(fArr);
            float f11 = fArr[0];
            f10 = fArr[1];
            f2 = f11;
        } else {
            f2 = 0.0f;
            f10 = 0.0f;
        }
        this.f3007m.onDrawOver(canvas, recyclerView, this.f2998c, this.f3010p, this.f3008n, f2, f10);
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.f3019z;
        if (recyclerView2 != null) {
            recyclerView2.a0(this);
            this.r.b0(bVar);
            ArrayList arrayList = this.r.f2712a0;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.f3010p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList2.get(0);
                fVar.f3032g.cancel();
                this.f3007m.clearView(this.r, fVar.f3031e);
            }
            arrayList2.clear();
            this.f3016w = null;
            VelocityTracker velocityTracker = this.f3013t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3013t = null;
            }
            e eVar = this.f3018y;
            if (eVar != null) {
                eVar.f3025u = false;
                this.f3018y = null;
            }
            if (this.f3017x != null) {
                this.f3017x = null;
            }
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.f3001g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.f3011q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
            this.r.g(this);
            this.r.h(bVar);
            RecyclerView recyclerView3 = this.r;
            if (recyclerView3.f2712a0 == null) {
                recyclerView3.f2712a0 = new ArrayList();
            }
            recyclerView3.f2712a0.add(this);
            this.f3018y = new e();
            this.f3017x = new t0.e(this.r.getContext(), this.f3018y);
        }
    }

    public final int j(RecyclerView.c0 c0Var, int i6) {
        int i10;
        if ((i6 & 12) != 0) {
            int i11 = 4;
            if (this.f3002h > 0.0f) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            VelocityTracker velocityTracker = this.f3013t;
            d dVar = this.f3007m;
            if (velocityTracker != null && this.f3006l > -1) {
                velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.f3001g));
                float xVelocity = this.f3013t.getXVelocity(this.f3006l);
                float yVelocity = this.f3013t.getYVelocity(this.f3006l);
                if (xVelocity > 0.0f) {
                    i11 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i11 & i6) != 0 && i10 == i11 && abs >= dVar.getSwipeEscapeVelocity(this.f) && abs > Math.abs(yVelocity)) {
                    return i11;
                }
            }
            float swipeThreshold = dVar.getSwipeThreshold(c0Var) * this.r.getWidth();
            if ((i6 & i10) != 0 && Math.abs(this.f3002h) > swipeThreshold) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i6, int i10, MotionEvent motionEvent) {
        RecyclerView.c0 c0Var;
        int absoluteMovementFlags;
        float abs;
        float abs2;
        float f2;
        View n10;
        if (this.f2998c == null && i6 == 2 && this.f3008n != 2) {
            d dVar = this.f3007m;
            if (!dVar.isItemViewSwipeEnabled() || this.r.getScrollState() == 1) {
                return;
            }
            RecyclerView.m layoutManager = this.r.getLayoutManager();
            int i11 = this.f3006l;
            if (i11 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i11);
                float abs3 = Math.abs(motionEvent.getX(findPointerIndex) - this.f2999d);
                float abs4 = Math.abs(motionEvent.getY(findPointerIndex) - this.f3000e);
                float f10 = this.f3011q;
                if ((abs3 >= f10 || abs4 >= f10) && ((abs3 <= abs4 || !layoutManager.canScrollHorizontally()) && ((abs4 <= abs3 || !layoutManager.canScrollVertically()) && (n10 = n(motionEvent)) != null))) {
                    c0Var = this.r.K(n10);
                    if (c0Var != null || (absoluteMovementFlags = (dVar.getAbsoluteMovementFlags(this.r, c0Var) & 65280) >> 8) == 0) {
                        return;
                    }
                    float x10 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float f11 = x10 - this.f2999d;
                    float f12 = y10 - this.f3000e;
                    abs = Math.abs(f11);
                    abs2 = Math.abs(f12);
                    f2 = this.f3011q;
                    if (abs >= f2 && abs2 < f2) {
                        return;
                    }
                    if (abs <= abs2) {
                        if (f11 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else if (f12 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                        return;
                    } else {
                        if (f12 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.f3003i = 0.0f;
                    this.f3002h = 0.0f;
                    this.f3006l = motionEvent.getPointerId(0);
                    s(c0Var, 1);
                }
            }
            c0Var = null;
            if (c0Var != null) {
                return;
            }
            float x102 = motionEvent.getX(i10);
            float y102 = motionEvent.getY(i10);
            float f112 = x102 - this.f2999d;
            float f122 = y102 - this.f3000e;
            abs = Math.abs(f112);
            abs2 = Math.abs(f122);
            f2 = this.f3011q;
            if (abs >= f2) {
            }
            if (abs <= abs2) {
            }
            this.f3003i = 0.0f;
            this.f3002h = 0.0f;
            this.f3006l = motionEvent.getPointerId(0);
            s(c0Var, 1);
        }
    }

    public final int l(RecyclerView.c0 c0Var, int i6) {
        int i10;
        if ((i6 & 3) != 0) {
            int i11 = 1;
            if (this.f3003i > 0.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            VelocityTracker velocityTracker = this.f3013t;
            d dVar = this.f3007m;
            if (velocityTracker != null && this.f3006l > -1) {
                velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.f3001g));
                float xVelocity = this.f3013t.getXVelocity(this.f3006l);
                float yVelocity = this.f3013t.getYVelocity(this.f3006l);
                if (yVelocity > 0.0f) {
                    i11 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i11 & i6) != 0 && i11 == i10 && abs >= dVar.getSwipeEscapeVelocity(this.f) && abs > Math.abs(xVelocity)) {
                    return i11;
                }
            }
            float swipeThreshold = dVar.getSwipeThreshold(c0Var) * this.r.getHeight();
            if ((i6 & i10) != 0 && Math.abs(this.f3003i) > swipeThreshold) {
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public final void m(RecyclerView.c0 c0Var, boolean z10) {
        f fVar;
        ArrayList arrayList = this.f3010p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
            } else {
                return;
            }
        } while (fVar.f3031e != c0Var);
        fVar.f3036k |= z10;
        if (!fVar.f3037l) {
            fVar.f3032g.cancel();
        }
        arrayList.remove(size);
    }

    public final View n(MotionEvent motionEvent) {
        f fVar;
        View view;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.c0 c0Var = this.f2998c;
        if (c0Var != null) {
            View view2 = c0Var.f2751a;
            if (p(view2, x10, y10, this.f3004j + this.f3002h, this.f3005k + this.f3003i)) {
                return view2;
            }
        }
        ArrayList arrayList = this.f3010p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
                view = fVar.f3031e.f2751a;
            } else {
                RecyclerView recyclerView = this.r;
                int e10 = recyclerView.f2740z.e();
                while (true) {
                    e10--;
                    if (e10 >= 0) {
                        View d10 = recyclerView.f2740z.d(e10);
                        float translationX = d10.getTranslationX();
                        float translationY = d10.getTranslationY();
                        if (x10 >= d10.getLeft() + translationX && x10 <= d10.getRight() + translationX && y10 >= d10.getTop() + translationY && y10 <= d10.getBottom() + translationY) {
                            return d10;
                        }
                    } else {
                        return null;
                    }
                }
            }
        } while (!p(view, x10, y10, fVar.f3034i, fVar.f3035j));
        return view;
    }

    public final void o(float[] fArr) {
        if ((this.f3009o & 12) != 0) {
            fArr[0] = (this.f3004j + this.f3002h) - this.f2998c.f2751a.getLeft();
        } else {
            fArr[0] = this.f2998c.f2751a.getTranslationX();
        }
        if ((this.f3009o & 3) != 0) {
            fArr[1] = (this.f3005k + this.f3003i) - this.f2998c.f2751a.getTop();
        } else {
            fArr[1] = this.f2998c.f2751a.getTranslationY();
        }
    }

    public final void q(RecyclerView.c0 c0Var) {
        View view;
        int i6;
        int i10;
        int i11;
        if (this.r.isLayoutRequested() || this.f3008n != 2) {
            return;
        }
        d dVar = this.f3007m;
        float moveThreshold = dVar.getMoveThreshold(c0Var);
        int i12 = (int) (this.f3004j + this.f3002h);
        int i13 = (int) (this.f3005k + this.f3003i);
        View view2 = c0Var.f2751a;
        if (Math.abs(i13 - c0Var.f2751a.getTop()) < view2.getHeight() * moveThreshold && Math.abs(i12 - view2.getLeft()) < view2.getWidth() * moveThreshold) {
            return;
        }
        ArrayList arrayList = this.f3014u;
        if (arrayList == null) {
            this.f3014u = new ArrayList();
            this.f3015v = new ArrayList();
        } else {
            arrayList.clear();
            this.f3015v.clear();
        }
        int boundingBoxMargin = dVar.getBoundingBoxMargin();
        int round = Math.round(this.f3004j + this.f3002h) - boundingBoxMargin;
        int round2 = Math.round(this.f3005k + this.f3003i) - boundingBoxMargin;
        int i14 = boundingBoxMargin * 2;
        int width = view2.getWidth() + round + i14;
        int height = view2.getHeight() + round2 + i14;
        int i15 = (round + width) / 2;
        int i16 = (round2 + height) / 2;
        RecyclerView.m layoutManager = this.r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i17 = 0;
        while (i17 < childCount) {
            View childAt = layoutManager.getChildAt(i17);
            if (childAt == view2) {
                i6 = i15;
                i10 = round;
                view = view2;
            } else {
                view = view2;
                if (childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                    RecyclerView.c0 K = this.r.K(childAt);
                    i10 = round;
                    i11 = round2;
                    if (dVar.canDropOver(this.r, this.f2998c, K)) {
                        int abs = Math.abs(i15 - ((childAt.getRight() + childAt.getLeft()) / 2));
                        int abs2 = Math.abs(i16 - ((childAt.getBottom() + childAt.getTop()) / 2));
                        int i18 = (abs2 * abs2) + (abs * abs);
                        int size = this.f3014u.size();
                        i6 = i15;
                        int i19 = 0;
                        int i20 = 0;
                        while (i20 < size) {
                            int i21 = size;
                            if (i18 <= ((Integer) this.f3015v.get(i20)).intValue()) {
                                break;
                            }
                            i19++;
                            i20++;
                            size = i21;
                        }
                        this.f3014u.add(i19, K);
                        this.f3015v.add(i19, Integer.valueOf(i18));
                    } else {
                        i6 = i15;
                    }
                    i17++;
                    view2 = view;
                    round = i10;
                    round2 = i11;
                    i15 = i6;
                } else {
                    i6 = i15;
                    i10 = round;
                }
            }
            i11 = round2;
            i17++;
            view2 = view;
            round = i10;
            round2 = i11;
            i15 = i6;
        }
        ArrayList arrayList2 = this.f3014u;
        if (arrayList2.size() == 0) {
            return;
        }
        RecyclerView.c0 chooseDropTarget = dVar.chooseDropTarget(c0Var, arrayList2, i12, i13);
        if (chooseDropTarget == null) {
            this.f3014u.clear();
            this.f3015v.clear();
            return;
        }
        int e10 = chooseDropTarget.e();
        int e11 = c0Var.e();
        if (dVar.onMove(this.r, c0Var, chooseDropTarget)) {
            this.f3007m.onMoved(this.r, c0Var, e11, chooseDropTarget, e10, i12, i13);
        }
    }

    public final void r(View view) {
        if (view == this.f3016w) {
            this.f3016w = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r2 > 0) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(RecyclerView.c0 c0Var, int i6) {
        d dVar;
        boolean z10;
        boolean z11;
        RecyclerView.c0 c0Var2;
        int i10;
        int i11;
        float signum;
        float f2;
        int i12;
        float signum2;
        if (c0Var == this.f2998c && i6 == this.f3008n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i13 = this.f3008n;
        m(c0Var, true);
        this.f3008n = i6;
        if (i6 == 2) {
            if (c0Var != null) {
                this.f3016w = c0Var.f2751a;
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i14 = (1 << ((i6 * 8) + 8)) - 1;
        RecyclerView.c0 c0Var3 = this.f2998c;
        d dVar2 = this.f3007m;
        if (c0Var3 != null) {
            View view = c0Var3.f2751a;
            if (view.getParent() != null) {
                if (i13 == 2) {
                    i11 = 0;
                } else {
                    if (this.f3008n != 2) {
                        int movementFlags = dVar2.getMovementFlags(this.r, c0Var3);
                        RecyclerView recyclerView = this.r;
                        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                        int convertToAbsoluteDirection = (dVar2.convertToAbsoluteDirection(movementFlags, d0.e.d(recyclerView)) & 65280) >> 8;
                        if (convertToAbsoluteDirection != 0) {
                            int i15 = (movementFlags & 65280) >> 8;
                            if (Math.abs(this.f3002h) > Math.abs(this.f3003i)) {
                                i10 = j(c0Var3, convertToAbsoluteDirection);
                                if (i10 > 0) {
                                    if ((i15 & i10) == 0) {
                                        i10 = d.convertToRelativeDirection(i10, d0.e.d(this.r));
                                    }
                                } else {
                                    i10 = l(c0Var3, convertToAbsoluteDirection);
                                }
                                i11 = i10;
                            } else {
                                i10 = l(c0Var3, convertToAbsoluteDirection);
                                if (i10 <= 0) {
                                    i10 = j(c0Var3, convertToAbsoluteDirection);
                                    if (i10 > 0) {
                                        if ((i15 & i10) == 0) {
                                            i10 = d.convertToRelativeDirection(i10, d0.e.d(this.r));
                                        }
                                    }
                                }
                                i11 = i10;
                            }
                        }
                    }
                    i10 = 0;
                    i11 = i10;
                }
                VelocityTracker velocityTracker = this.f3013t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f3013t = null;
                }
                if (i11 != 1 && i11 != 2) {
                    if (i11 != 4 && i11 != 8 && i11 != 16 && i11 != 32) {
                        signum2 = 0.0f;
                    } else {
                        signum2 = Math.signum(this.f3002h) * this.r.getWidth();
                    }
                    f2 = signum2;
                    signum = 0.0f;
                } else {
                    signum = Math.signum(this.f3003i) * this.r.getHeight();
                    f2 = 0.0f;
                }
                if (i13 == 2) {
                    i12 = 8;
                } else if (i11 > 0) {
                    i12 = 2;
                } else {
                    i12 = 4;
                }
                float[] fArr = this.f2997b;
                o(fArr);
                float f10 = fArr[0];
                float f11 = fArr[1];
                int i16 = i12;
                dVar = dVar2;
                c cVar = new c(c0Var3, i16, i13, f10, f11, f2, signum, i11, c0Var3);
                long animationDuration = dVar.getAnimationDuration(this.r, i16, f2 - f10, signum - f11);
                ValueAnimator valueAnimator = cVar.f3032g;
                valueAnimator.setDuration(animationDuration);
                this.f3010p.add(cVar);
                c0Var3.s(false);
                valueAnimator.start();
                c0Var2 = null;
                z10 = true;
            } else {
                dVar = dVar2;
                r(view);
                dVar.clearView(this.r, c0Var3);
                c0Var2 = null;
                z10 = false;
            }
            this.f2998c = c0Var2;
        } else {
            dVar = dVar2;
            z10 = false;
        }
        if (c0Var != null) {
            this.f3009o = (dVar.getAbsoluteMovementFlags(this.r, c0Var) & i14) >> (this.f3008n * 8);
            View view2 = c0Var.f2751a;
            this.f3004j = view2.getLeft();
            this.f3005k = view2.getTop();
            this.f2998c = c0Var;
            if (i6 == 2) {
                view2.performHapticFeedback(0);
            }
        }
        ViewParent parent = this.r.getParent();
        if (parent != null) {
            if (this.f2998c != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
        if (!z10) {
            this.r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        dVar.onSelectedChanged(this.f2998c, this.f3008n);
        this.r.invalidate();
    }

    public final void t(k1.a aVar) {
        if (!this.f3007m.hasDragFlag(this.r, aVar)) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
        } else if (aVar.f2751a.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            VelocityTracker velocityTracker = this.f3013t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.f3013t = VelocityTracker.obtain();
            this.f3003i = 0.0f;
            this.f3002h = 0.0f;
            s(aVar, 2);
        }
    }

    public final void u(int i6, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y10 = motionEvent.getY(i10);
        float f2 = x10 - this.f2999d;
        this.f3002h = f2;
        this.f3003i = y10 - this.f3000e;
        if ((i6 & 4) == 0) {
            this.f3002h = Math.max(0.0f, f2);
        }
        if ((i6 & 8) == 0) {
            this.f3002h = Math.min(0.0f, this.f3002h);
        }
        if ((i6 & 1) == 0) {
            this.f3003i = Math.max(0.0f, this.f3003i);
        }
        if ((i6 & 2) == 0) {
            this.f3003i = Math.min(0.0f, this.f3003i);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i6, int i10) {
            int i11;
            int i12 = i6 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i12 == 0) {
                return i6;
            }
            int i13 = i6 & (~i12);
            if (i10 == 0) {
                i11 = i12 << 2;
            } else {
                int i14 = i12 << 1;
                i13 |= (-789517) & i14;
                i11 = (i14 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i13 | i11;
        }

        public static n getDefaultUIUtil() {
            return o.f3043a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i6, int i10) {
            return i10 << (i6 * 8);
        }

        public static int makeMovementFlags(int i6, int i10) {
            int makeFlag = makeFlag(0, i10 | i6);
            return makeFlag(2, i6) | makeFlag(1, i10) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            return true;
        }

        public RecyclerView.c0 chooseDropTarget(RecyclerView.c0 c0Var, List<RecyclerView.c0> list, int i6, int i10) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = c0Var.f2751a.getWidth() + i6;
            View view = c0Var.f2751a;
            int height = view.getHeight() + i10;
            int left2 = i6 - view.getLeft();
            int top2 = i10 - view.getTop();
            int size = list.size();
            RecyclerView.c0 c0Var2 = null;
            int i11 = -1;
            for (int i12 = 0; i12 < size; i12++) {
                RecyclerView.c0 c0Var3 = list.get(i12);
                if (left2 > 0 && (right = c0Var3.f2751a.getRight() - width) < 0 && c0Var3.f2751a.getRight() > view.getRight() && (abs4 = Math.abs(right)) > i11) {
                    c0Var2 = c0Var3;
                    i11 = abs4;
                }
                if (left2 < 0 && (left = c0Var3.f2751a.getLeft() - i6) > 0 && c0Var3.f2751a.getLeft() < view.getLeft() && (abs3 = Math.abs(left)) > i11) {
                    c0Var2 = c0Var3;
                    i11 = abs3;
                }
                if (top2 < 0 && (top = c0Var3.f2751a.getTop() - i10) > 0 && c0Var3.f2751a.getTop() < view.getTop() && (abs2 = Math.abs(top)) > i11) {
                    c0Var2 = c0Var3;
                    i11 = abs2;
                }
                if (top2 > 0 && (bottom = c0Var3.f2751a.getBottom() - height) < 0 && c0Var3.f2751a.getBottom() > view.getBottom() && (abs = Math.abs(bottom)) > i11) {
                    c0Var2 = c0Var3;
                    i11 = abs;
                }
            }
            return c0Var2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            View view = c0Var.f2751a;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                d0.i.s(view, floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i6, int i10) {
            int i11;
            int i12 = i6 & RELATIVE_DIR_FLAGS;
            if (i12 == 0) {
                return i6;
            }
            int i13 = i6 & (~i12);
            if (i10 == 0) {
                i11 = i12 >> 2;
            } else {
                int i14 = i12 >> 1;
                i13 |= (-3158065) & i14;
                i11 = (i14 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i13 | i11;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int movementFlags = getMovementFlags(recyclerView, c0Var);
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            return convertToAbsoluteDirection(movementFlags, d0.e.d(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i6, float f, float f2) {
            RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i6 == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i6 == 8) {
                return itemAnimator.f2776e;
            } else {
                return itemAnimator.f2775d;
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.c0 c0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.c0 c0Var);

        public float getSwipeThreshold(RecyclerView.c0 c0Var) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            if ((getAbsoluteMovementFlags(recyclerView, c0Var) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            if ((getAbsoluteMovementFlags(recyclerView, c0Var) & 65280) != 0) {
                return true;
            }
            return false;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i6, int i10, int i11, long j10) {
            int maxDragScroll = getMaxDragScroll(recyclerView);
            float f = 1.0f;
            int interpolation = (int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i10) * 1.0f) / i6)) * ((int) Math.signum(i10)) * maxDragScroll);
            if (j10 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j10) / 2000.0f;
            }
            int interpolation2 = (int) (sDragScrollInterpolator.getInterpolation(f) * interpolation);
            if (interpolation2 == 0) {
                if (i10 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation2;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f, float f2, int i6, boolean z10) {
            View view = c0Var.f2751a;
            if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                Float valueOf = Float.valueOf(d0.i.i(view));
                int childCount = recyclerView.getChildCount();
                float f10 = 0.0f;
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = recyclerView.getChildAt(i10);
                    if (childAt != view) {
                        WeakHashMap<View, o0> weakHashMap2 = t0.d0.f32288a;
                        float i11 = d0.i.i(childAt);
                        if (i11 > f10) {
                            f10 = i11;
                        }
                    }
                }
                d0.i.s(view, f10 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, float f, float f2, int i6, boolean z10) {
            View view = c0Var.f2751a;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, List<f> list, int i6, float f, float f2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = list.get(i10);
                RecyclerView.c0 c0Var2 = fVar.f3031e;
                float f10 = fVar.f3027a;
                float f11 = fVar.f3029c;
                if (f10 == f11) {
                    fVar.f3034i = c0Var2.f2751a.getTranslationX();
                } else {
                    fVar.f3034i = defpackage.e.e(f11, f10, fVar.f3038m, f10);
                }
                float f12 = fVar.f3028b;
                float f13 = fVar.f3030d;
                if (f12 == f13) {
                    fVar.f3035j = c0Var2.f2751a.getTranslationY();
                } else {
                    fVar.f3035j = defpackage.e.e(f13, f12, fVar.f3038m, f12);
                }
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.f3031e, fVar.f3034i, fVar.f3035j, fVar.f, false);
                canvas.restoreToCount(save);
            }
            if (c0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, c0Var, f, f2, i6, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var, List<f> list, int i6, float f, float f2) {
            int size = list.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = list.get(i10);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.f3031e, fVar.f3034i, fVar.f3035j, fVar.f, false);
                canvas.restoreToCount(save);
            }
            if (c0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, c0Var, f, f2, i6, true);
                canvas.restoreToCount(save2);
            }
            for (int i11 = size - 1; i11 >= 0; i11--) {
                f fVar2 = list.get(i11);
                boolean z11 = fVar2.f3037l;
                if (z11 && !fVar2.f3033h) {
                    list.remove(i11);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i6, RecyclerView.c0 c0Var2, int i10, int i11, int i12) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof g) {
                ((g) layoutManager).prepareForDrop(c0Var.f2751a, c0Var2.f2751a, i11, i12);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(c0Var2.f2751a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.h0(i10);
                }
                if (layoutManager.getDecoratedRight(c0Var2.f2751a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.h0(i10);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(c0Var2.f2751a) <= recyclerView.getPaddingTop()) {
                    recyclerView.h0(i10);
                }
                if (layoutManager.getDecoratedBottom(c0Var2.f2751a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.h0(i10);
                }
            }
        }

        public abstract void onSwiped(RecyclerView.c0 c0Var, int i6);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public void onSelectedChanged(RecyclerView.c0 c0Var, int i6) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f3027a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3028b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3029c;

        /* renamed from: d  reason: collision with root package name */
        public final float f3030d;

        /* renamed from: e  reason: collision with root package name */
        public final RecyclerView.c0 f3031e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final ValueAnimator f3032g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3033h;

        /* renamed from: i  reason: collision with root package name */
        public float f3034i;

        /* renamed from: j  reason: collision with root package name */
        public float f3035j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3036k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3037l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f3038m;

        public f(RecyclerView.c0 c0Var, int i6, float f, float f2, float f10, float f11) {
            this.f = i6;
            this.f3031e = c0Var;
            this.f3027a = f;
            this.f3028b = f2;
            this.f3029c = f10;
            this.f3030d = f11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f3032g = ofFloat;
            ofFloat.addUpdateListener(new m(this));
            ofFloat.setTarget(c0Var.f2751a);
            ofFloat.addListener(this);
            this.f3038m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3038m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3037l) {
                this.f3031e.s(true);
            }
            this.f3037l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(View view) {
    }
}
