package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class t0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public boolean A;
    public int B;
    public final int[] C = new int[2];

    /* renamed from: u  reason: collision with root package name */
    public final float f1552u;

    /* renamed from: v  reason: collision with root package name */
    public final int f1553v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1554w;

    /* renamed from: x  reason: collision with root package name */
    public final View f1555x;

    /* renamed from: y  reason: collision with root package name */
    public a f1556y;

    /* renamed from: z  reason: collision with root package name */
    public b f1557z;

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = t0.this.f1555x.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            t0 t0Var = t0.this;
            t0Var.a();
            View view = t0Var.f1555x;
            if (view.isEnabled() && !view.isLongClickable() && t0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                t0Var.A = true;
            }
        }
    }

    public t0(View view) {
        this.f1555x = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1552u = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1553v = tapTimeout;
        this.f1554w = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f1557z;
        View view = this.f1555x;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1556y;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract l.f b();

    public abstract boolean c();

    public boolean d() {
        l.f b10 = b();
        if (b10 != null && b10.a()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r4 != 3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r0 j10;
        boolean z14;
        boolean z15 = this.A;
        View view2 = this.f1555x;
        if (z15) {
            l.f b10 = b();
            if (b10 != null && b10.a() && (j10 = b10.j()) != null && j10.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.C;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                j10.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b11 = j10.b(obtainNoHistory, this.B);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (b11 && z14) {
                    z13 = true;
                    if (z13 && d()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                }
            }
            z13 = false;
            if (z13) {
            }
            z11 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.B);
                            if (findPointerIndex >= 0) {
                                float x10 = motionEvent.getX(findPointerIndex);
                                float y10 = motionEvent.getY(findPointerIndex);
                                float f = this.f1552u;
                                float f2 = -f;
                                if (x10 >= f2 && y10 >= f2 && x10 < (view2.getRight() - view2.getLeft()) + f && y10 < (view2.getBottom() - view2.getTop()) + f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    z10 = true;
                                    if (!z10 && c()) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                        view2.onTouchEvent(obtain);
                                        obtain.recycle();
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.B = motionEvent.getPointerId(0);
                    if (this.f1556y == null) {
                        this.f1556y = new a();
                    }
                    view2.postDelayed(this.f1556y, this.f1553v);
                    if (this.f1557z == null) {
                        this.f1557z = new b();
                    }
                    view2.postDelayed(this.f1557z, this.f1554w);
                }
            }
            z10 = false;
            if (!z10) {
            }
            z11 = false;
            if (z11) {
            }
        }
        this.A = z11;
        if (!z11 && !z15) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A = false;
        this.B = -1;
        a aVar = this.f1556y;
        if (aVar != null) {
            this.f1555x.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
