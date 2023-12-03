package a1;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import t0.d0;
/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f145x = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f146a;

    /* renamed from: b  reason: collision with root package name */
    public int f147b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f149d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f150e;
    public float[] f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f151g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f152h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f153i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f154j;

    /* renamed from: k  reason: collision with root package name */
    public int f155k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f156l;

    /* renamed from: m  reason: collision with root package name */
    public final float f157m;

    /* renamed from: n  reason: collision with root package name */
    public float f158n;

    /* renamed from: o  reason: collision with root package name */
    public int f159o;

    /* renamed from: p  reason: collision with root package name */
    public final int f160p;

    /* renamed from: q  reason: collision with root package name */
    public int f161q;
    public final OverScroller r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0004c f162s;

    /* renamed from: t  reason: collision with root package name */
    public View f163t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f164u;

    /* renamed from: v  reason: collision with root package name */
    public final ViewGroup f165v;

    /* renamed from: c  reason: collision with root package name */
    public int f148c = -1;

    /* renamed from: w  reason: collision with root package name */
    public final b f166w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.p(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0004c abstractC0004c) {
        if (viewGroup != null) {
            if (abstractC0004c != null) {
                this.f165v = viewGroup;
                this.f162s = abstractC0004c;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i6 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f160p = i6;
                this.f159o = i6;
                this.f147b = viewConfiguration.getScaledTouchSlop();
                this.f157m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f158n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.r = new OverScroller(context, f145x);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f148c = -1;
        float[] fArr = this.f149d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f150e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.f151g, 0.0f);
            Arrays.fill(this.f152h, 0);
            Arrays.fill(this.f153i, 0);
            Arrays.fill(this.f154j, 0);
            this.f155k = 0;
        }
        VelocityTracker velocityTracker = this.f156l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f156l = null;
        }
    }

    public final void b(int i6, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f165v;
        if (parent == viewGroup) {
            this.f163t = view;
            this.f148c = i6;
            this.f162s.g(i6, view);
            p(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean c(float f, float f2, int i6, int i10) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f152h[i6] & i10) != i10 || (this.f161q & i10) == 0 || (this.f154j[i6] & i10) == i10 || (this.f153i[i6] & i10) == i10) {
            return false;
        }
        int i11 = this.f147b;
        if (abs <= i11 && abs2 <= i11) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f162s.getClass();
        }
        if ((this.f153i[i6] & i10) != 0 || abs <= this.f147b) {
            return false;
        }
        return true;
    }

    public final boolean d(View view, float f, float f2) {
        boolean z10;
        boolean z11;
        if (view == null) {
            return false;
        }
        AbstractC0004c abstractC0004c = this.f162s;
        if (abstractC0004c.c(view) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (abstractC0004c.d() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            float f10 = f2 * f2;
            int i6 = this.f147b;
            if (f10 + (f * f) <= i6 * i6) {
                return false;
            }
            return true;
        } else if (z10) {
            if (Math.abs(f) <= this.f147b) {
                return false;
            }
            return true;
        } else if (!z11 || Math.abs(f2) <= this.f147b) {
            return false;
        } else {
            return true;
        }
    }

    public final void e(int i6) {
        float[] fArr = this.f149d;
        if (fArr != null) {
            int i10 = this.f155k;
            boolean z10 = true;
            int i11 = 1 << i6;
            if ((i11 & i10) == 0) {
                z10 = false;
            }
            if (z10) {
                fArr[i6] = 0.0f;
                this.f150e[i6] = 0.0f;
                this.f[i6] = 0.0f;
                this.f151g[i6] = 0.0f;
                this.f152h[i6] = 0;
                this.f153i[i6] = 0;
                this.f154j[i6] = 0;
                this.f155k = (~i11) & i10;
            }
        }
    }

    public final int f(int i6, int i10, int i11) {
        int width;
        int abs;
        if (i6 == 0) {
            return 0;
        }
        float width2 = this.f165v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i6) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i6) / i11) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.f146a == 2) {
            OverScroller overScroller = this.r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f163t.getLeft();
            int top = currY - this.f163t.getTop();
            if (left != 0) {
                d0.j(left, this.f163t);
            }
            if (top != 0) {
                d0.k(top, this.f163t);
            }
            if (left != 0 || top != 0) {
                this.f162s.i(this.f163t, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f165v.post(this.f166w);
            }
        }
        if (this.f146a != 2) {
            return false;
        }
        return true;
    }

    public final View h(int i6, int i10) {
        ViewGroup viewGroup = this.f165v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f162s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i6, int i10, int i11, int i12) {
        float f;
        float f2;
        float f10;
        float f11;
        int left = this.f163t.getLeft();
        int top = this.f163t.getTop();
        int i13 = i6 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.r;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            p(0);
            return false;
        }
        View view = this.f163t;
        int i15 = (int) this.f158n;
        int i16 = (int) this.f157m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            if (i11 > 0) {
                i11 = i16;
            } else {
                i11 = -i16;
            }
        }
        int i17 = (int) this.f158n;
        int abs2 = Math.abs(i12);
        if (abs2 < i17) {
            i12 = 0;
        } else if (abs2 > i16) {
            if (i12 > 0) {
                i12 = i16;
            } else {
                i12 = -i16;
            }
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i18 = abs5 + abs6;
        int i19 = abs3 + abs4;
        if (i11 != 0) {
            f = abs5;
            f2 = i18;
        } else {
            f = abs3;
            f2 = i19;
        }
        float f12 = f / f2;
        if (i12 != 0) {
            f10 = abs6;
            f11 = i18;
        } else {
            f10 = abs4;
            f11 = i19;
        }
        float f13 = f10 / f11;
        AbstractC0004c abstractC0004c = this.f162s;
        overScroller.startScroll(left, top, i13, i14, (int) ((f(i14, i12, abstractC0004c.d()) * f13) + (f(i13, i11, abstractC0004c.c(view)) * f12)));
        p(2);
        return true;
    }

    public final boolean j(int i6) {
        boolean z10;
        if ((this.f155k & (1 << i6)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f156l == null) {
            this.f156l = VelocityTracker.obtain();
        }
        this.f156l.addMovement(motionEvent);
        int i10 = 0;
        AbstractC0004c abstractC0004c = this.f162s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f146a == 1 && pointerId == this.f148c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i10 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i10);
                                            if (pointerId2 != this.f148c) {
                                                View h10 = h((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                                                View view = this.f163t;
                                                if (h10 == view && t(pointerId2, view)) {
                                                    i6 = this.f148c;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            i6 = -1;
                                            break;
                                        }
                                    }
                                    if (i6 == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x10 = motionEvent.getX(actionIndex);
                        float y10 = motionEvent.getY(actionIndex);
                        n(x10, y10, pointerId3);
                        if (this.f146a == 0) {
                            t(pointerId3, h((int) x10, (int) y10));
                            if ((this.f152h[pointerId3] & this.f161q) != 0) {
                                abstractC0004c.f();
                                return;
                            }
                            return;
                        }
                        int i11 = (int) x10;
                        int i12 = (int) y10;
                        View view2 = this.f163t;
                        if (view2 != null && i11 >= view2.getLeft() && i11 < view2.getRight() && i12 >= view2.getTop() && i12 < view2.getBottom()) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            t(pointerId3, this.f163t);
                            return;
                        }
                        return;
                    }
                    if (this.f146a == 1) {
                        this.f164u = true;
                        abstractC0004c.j(this.f163t, 0.0f, 0.0f);
                        this.f164u = false;
                        if (this.f146a == 1) {
                            p(0);
                        }
                    }
                    a();
                    return;
                } else if (this.f146a == 1) {
                    if (j(this.f148c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f148c);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f;
                        int i13 = this.f148c;
                        int i14 = (int) (x11 - fArr[i13]);
                        int i15 = (int) (y11 - this.f151g[i13]);
                        int left = this.f163t.getLeft() + i14;
                        int top = this.f163t.getTop() + i15;
                        int left2 = this.f163t.getLeft();
                        int top2 = this.f163t.getTop();
                        if (i14 != 0) {
                            left = abstractC0004c.a(this.f163t, left);
                            d0.j(left - left2, this.f163t);
                        }
                        if (i15 != 0) {
                            top = abstractC0004c.b(this.f163t, top);
                            d0.k(top - top2, this.f163t);
                        }
                        if (i14 != 0 || i15 != 0) {
                            abstractC0004c.i(this.f163t, left, top);
                        }
                        o(motionEvent);
                        return;
                    }
                    return;
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i10 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i10);
                        if (j(pointerId4)) {
                            float x12 = motionEvent.getX(i10);
                            float y12 = motionEvent.getY(i10);
                            float f = x12 - this.f149d[pointerId4];
                            float f2 = y12 - this.f150e[pointerId4];
                            m(f, f2, pointerId4);
                            if (this.f146a != 1) {
                                View h11 = h((int) x12, (int) y12);
                                if (d(h11, f, f2) && t(pointerId4, h11)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i10++;
                    }
                    o(motionEvent);
                    return;
                }
            }
            if (this.f146a == 1) {
                l();
            }
            a();
            return;
        }
        float x13 = motionEvent.getX();
        float y13 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h12 = h((int) x13, (int) y13);
        n(x13, y13, pointerId5);
        t(pointerId5, h12);
        if ((this.f152h[pointerId5] & this.f161q) != 0) {
            abstractC0004c.f();
        }
    }

    public final void l() {
        VelocityTracker velocityTracker = this.f156l;
        float f = this.f157m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.f156l.getXVelocity(this.f148c);
        float f2 = this.f158n;
        float abs = Math.abs(xVelocity);
        float f10 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.f156l.getYVelocity(this.f148c);
        float f11 = this.f158n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f11) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f10 = f;
            } else {
                f10 = yVelocity;
            }
        }
        this.f164u = true;
        this.f162s.j(this.f163t, xVelocity, f10);
        this.f164u = false;
        if (this.f146a == 1) {
            p(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a1.c$c] */
    public final void m(float f, float f2, int i6) {
        boolean c10 = c(f, f2, i6, 1);
        boolean z10 = c10;
        if (c(f2, f, i6, 4)) {
            z10 = c10 | true;
        }
        boolean z11 = z10;
        if (c(f, f2, i6, 2)) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if (c(f2, f, i6, 8)) {
            r02 = (z11 ? 1 : 0) | true;
        }
        if (r02 != 0) {
            int[] iArr = this.f153i;
            iArr[i6] = iArr[i6] | r02;
            this.f162s.e(r02, i6);
        }
    }

    public final void n(float f, float f2, int i6) {
        float[] fArr = this.f149d;
        int i10 = 0;
        if (fArr == null || fArr.length <= i6) {
            int i11 = i6 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f150e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f151g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f152h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f153i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f154j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f149d = fArr2;
            this.f150e = fArr3;
            this.f = fArr4;
            this.f151g = fArr5;
            this.f152h = iArr;
            this.f153i = iArr2;
            this.f154j = iArr3;
        }
        float[] fArr9 = this.f149d;
        this.f[i6] = f;
        fArr9[i6] = f;
        float[] fArr10 = this.f150e;
        this.f151g[i6] = f2;
        fArr10[i6] = f2;
        int[] iArr7 = this.f152h;
        int i12 = (int) f;
        int i13 = (int) f2;
        ViewGroup viewGroup = this.f165v;
        if (i12 < viewGroup.getLeft() + this.f159o) {
            i10 = 1;
        }
        if (i13 < viewGroup.getTop() + this.f159o) {
            i10 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f159o) {
            i10 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f159o) {
            i10 |= 8;
        }
        iArr7[i6] = i10;
        this.f155k |= 1 << i6;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (j(pointerId)) {
                float x10 = motionEvent.getX(i6);
                float y10 = motionEvent.getY(i6);
                this.f[pointerId] = x10;
                this.f151g[pointerId] = y10;
            }
        }
    }

    public final void p(int i6) {
        this.f165v.removeCallbacks(this.f166w);
        if (this.f146a != i6) {
            this.f146a = i6;
            this.f162s.h(i6);
            if (this.f146a == 0) {
                this.f163t = null;
            }
        }
    }

    public final boolean q(int i6, int i10) {
        if (this.f164u) {
            return i(i6, i10, (int) this.f156l.getXVelocity(this.f148c), (int) this.f156l.getYVelocity(this.f148c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if (r13 != r12) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent) {
        boolean z10;
        View h10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f156l == null) {
            this.f156l = VelocityTracker.obtain();
        }
        this.f156l.addMovement(motionEvent);
        AbstractC0004c abstractC0004c = this.f162s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                e(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x10 = motionEvent.getX(actionIndex);
                            float y10 = motionEvent.getY(actionIndex);
                            n(x10, y10, pointerId);
                            int i6 = this.f146a;
                            if (i6 == 0) {
                                if ((this.f152h[pointerId] & this.f161q) != 0) {
                                    abstractC0004c.f();
                                }
                            } else if (i6 == 2 && (h10 = h((int) x10, (int) y10)) == this.f163t) {
                                t(pointerId, h10);
                            }
                        }
                    }
                } else if (this.f149d != null && this.f150e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i10 = 0; i10 < pointerCount; i10++) {
                        int pointerId2 = motionEvent.getPointerId(i10);
                        if (j(pointerId2)) {
                            float x11 = motionEvent.getX(i10);
                            float y11 = motionEvent.getY(i10);
                            float f = x11 - this.f149d[pointerId2];
                            float f2 = y11 - this.f150e[pointerId2];
                            View h11 = h((int) x11, (int) y11);
                            if (h11 != null && d(h11, f, f2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int left = h11.getLeft();
                                int a10 = abstractC0004c.a(h11, ((int) f) + left);
                                int top = h11.getTop();
                                int b10 = abstractC0004c.b(h11, ((int) f2) + top);
                                int c10 = abstractC0004c.c(h11);
                                int d10 = abstractC0004c.d();
                                if (c10 != 0) {
                                    if (c10 > 0) {
                                    }
                                }
                                if (d10 == 0) {
                                    break;
                                } else if (d10 > 0 && b10 == top) {
                                    break;
                                }
                            }
                            m(f, f2, pointerId2);
                            if (this.f146a != 1) {
                                if (z10 && t(pointerId2, h11)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(x12, y12, pointerId3);
            View h12 = h((int) x12, (int) y12);
            if (h12 == this.f163t && this.f146a == 2) {
                t(pointerId3, h12);
            }
            if ((this.f152h[pointerId3] & this.f161q) != 0) {
                abstractC0004c.f();
            }
        }
        if (this.f146a != 1) {
            return false;
        }
        return true;
    }

    public final boolean s(View view, int i6, int i10) {
        this.f163t = view;
        this.f148c = -1;
        boolean i11 = i(i6, i10, 0, 0);
        if (!i11 && this.f146a == 0 && this.f163t != null) {
            this.f163t = null;
        }
        return i11;
    }

    public final boolean t(int i6, View view) {
        if (view == this.f163t && this.f148c == i6) {
            return true;
        }
        if (view != null && this.f162s.k(i6, view)) {
            this.f148c = i6;
            b(i6, view);
            return true;
        }
        return false;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: a1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0004c {
        public abstract int a(View view, int i6);

        public abstract int b(View view, int i6);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public abstract void h(int i6);

        public abstract void i(View view, int i6, int i10);

        public abstract void j(View view, float f, float f2);

        public abstract boolean k(int i6, View view);

        public void f() {
        }

        public void e(int i6, int i10) {
        }

        public void g(int i6, View view) {
        }
    }
}
