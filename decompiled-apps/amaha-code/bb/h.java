package bb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: HeaderBehavior.java */
/* loaded from: classes.dex */
public abstract class h<V extends View> extends j<V> {

    /* renamed from: c  reason: collision with root package name */
    public a f4230c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f4231d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4232e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f4233g;

    /* renamed from: h  reason: collision with root package name */
    public int f4234h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f4235i;

    /* compiled from: HeaderBehavior.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final CoordinatorLayout f4236u;

        /* renamed from: v  reason: collision with root package name */
        public final V f4237v;

        public a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f4236u = coordinatorLayout;
            this.f4237v = v10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar;
            OverScroller overScroller;
            V v10 = this.f4237v;
            if (v10 != null && (overScroller = (hVar = h.this).f4231d) != null) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                CoordinatorLayout coordinatorLayout = this.f4236u;
                if (computeScrollOffset) {
                    hVar.i(coordinatorLayout, v10, hVar.f4231d.getCurrY());
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    d0.d.m(v10, this);
                    return;
                }
                hVar.g(coordinatorLayout, v10);
            }
        }
    }

    public h() {
        this.f = -1;
        this.f4234h = -1;
    }

    public boolean c(V v10) {
        return false;
    }

    public int d(V v10) {
        return -v10.getHeight();
    }

    public int e(V v10) {
        return v10.getHeight();
    }

    public int f() {
        return a();
    }

    public int h(CoordinatorLayout coordinatorLayout, V v10, int i6, int i10, int i11) {
        int j10;
        int a10 = a();
        if (i10 != 0 && a10 >= i10 && a10 <= i11 && a10 != (j10 = hc.d.j(i6, i10, i11))) {
            k kVar = this.f4242a;
            if (kVar != null) {
                kVar.b(j10);
            } else {
                this.f4243b = j10;
            }
            return a10 - j10;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(CoordinatorLayout coordinatorLayout, View view, int i6) {
        h(coordinatorLayout, view, i6, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        int findPointerIndex;
        if (this.f4234h < 0) {
            this.f4234h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f4232e) {
            int i6 = this.f;
            if (i6 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f4233g) > this.f4234h) {
                this.f4233g = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            if (c(v10) && coordinatorLayout.j(v10, x10, y11)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4232e = z10;
            if (z10) {
                this.f4233g = y11;
                this.f = motionEvent.getPointerId(0);
                if (this.f4235i == null) {
                    this.f4235i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.f4231d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f4231d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f4235i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.f = motionEvent.getPointerId(i6);
                        this.f4233g = (int) (motionEvent.getY(i6) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y10 = (int) motionEvent.getY(findPointerIndex);
                int i10 = this.f4233g - y10;
                this.f4233g = y10;
                h(coordinatorLayout, v10, f() - i10, d(v10), 0);
            }
            z10 = false;
            velocityTracker2 = this.f4235i;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!this.f4232e && !z10) {
                return false;
            }
        }
        VelocityTracker velocityTracker3 = this.f4235i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f4235i.computeCurrentVelocity(1000);
            float yVelocity = this.f4235i.getYVelocity(this.f);
            int i11 = -e(v10);
            a aVar = this.f4230c;
            if (aVar != null) {
                v10.removeCallbacks(aVar);
                this.f4230c = null;
            }
            if (this.f4231d == null) {
                this.f4231d = new OverScroller(v10.getContext());
            }
            this.f4231d.fling(0, a(), 0, Math.round(yVelocity), 0, 0, i11, 0);
            if (this.f4231d.computeScrollOffset()) {
                a aVar2 = new a(coordinatorLayout, v10);
                this.f4230c = aVar2;
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.m(v10, aVar2);
            } else {
                g(coordinatorLayout, v10);
            }
            z10 = true;
            this.f4232e = false;
            this.f = -1;
            velocityTracker = this.f4235i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f4235i = null;
            }
            velocityTracker2 = this.f4235i;
            if (velocityTracker2 != null) {
            }
            return !this.f4232e ? true : true;
        }
        z10 = false;
        this.f4232e = false;
        this.f = -1;
        velocityTracker = this.f4235i;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f4235i;
        if (velocityTracker2 != null) {
        }
        if (!this.f4232e) {
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.f4234h = -1;
    }

    public void g(CoordinatorLayout coordinatorLayout, V v10) {
    }
}
