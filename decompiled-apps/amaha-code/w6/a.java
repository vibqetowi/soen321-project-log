package w6;

import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import r6.j;
import y6.g;
/* compiled from: BarLineChartTouchListener.java */
/* loaded from: classes.dex */
public final class a extends b<p6.a<? extends r6.d<? extends v6.b<? extends j>>>> {
    public final y6.c A;
    public final y6.c B;
    public float C;
    public float D;
    public float E;
    public v6.b F;
    public VelocityTracker G;
    public long H;
    public final y6.c I;
    public final y6.c J;
    public final float K;
    public final float L;

    /* renamed from: y  reason: collision with root package name */
    public Matrix f36564y;

    /* renamed from: z  reason: collision with root package name */
    public final Matrix f36565z;

    public a(p6.a aVar, Matrix matrix) {
        super(aVar);
        this.f36564y = new Matrix();
        this.f36565z = new Matrix();
        this.A = y6.c.b(0.0f, 0.0f);
        this.B = y6.c.b(0.0f, 0.0f);
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = 1.0f;
        this.H = 0L;
        this.I = y6.c.b(0.0f, 0.0f);
        this.J = y6.c.b(0.0f, 0.0f);
        this.f36564y = matrix;
        this.K = y6.f.c(3.0f);
        this.L = y6.f.c(3.5f);
    }

    public static float e(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    public final y6.c a(float f, float f2) {
        p6.a aVar = (p6.a) this.f36569x;
        g viewPortHandler = aVar.getViewPortHandler();
        b();
        return y6.c.b(f - viewPortHandler.f38300b.left, -((aVar.getMeasuredHeight() - f2) - viewPortHandler.i()));
    }

    public final void b() {
        v6.b bVar = this.F;
        T t3 = this.f36569x;
        if (bVar == null) {
            p6.a aVar = (p6.a) t3;
            aVar.f27918o0.getClass();
            aVar.f27919p0.getClass();
        }
        v6.b bVar2 = this.F;
        if (bVar2 != null) {
            ((p6.a) t3).d(bVar2.a0());
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.f36564y.set(this.f36565z);
        ((p6.a) this.f36569x).getOnChartGestureListener();
        b();
        float x10 = motionEvent.getX();
        y6.c cVar = this.A;
        float y10 = motionEvent.getY() - cVar.f38277c;
        this.f36564y.postTranslate(x10 - cVar.f38276b, y10);
    }

    public final void d(MotionEvent motionEvent) {
        v6.b bVar;
        this.f36565z.set(this.f36564y);
        float x10 = motionEvent.getX();
        y6.c cVar = this.A;
        cVar.f38276b = x10;
        cVar.f38277c = motionEvent.getY();
        p6.a aVar = (p6.a) this.f36569x;
        t6.c h10 = aVar.h(motionEvent.getX(), motionEvent.getY());
        if (h10 != null) {
            bVar = (v6.b) ((r6.d) aVar.f27931v).b(h10.f);
        } else {
            bVar = null;
        }
        this.F = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        p6.a aVar = (p6.a) this.f36569x;
        aVar.getOnChartGestureListener();
        if (aVar.c0 && ((r6.d) aVar.getData()).d() > 0) {
            y6.c a10 = a(motionEvent.getX(), motionEvent.getY());
            float f2 = 1.0f;
            if (aVar.f27909f0) {
                f = 1.4f;
            } else {
                f = 1.0f;
            }
            if (aVar.f27910g0) {
                f2 = 1.4f;
            }
            float f10 = a10.f38276b;
            float f11 = a10.f38277c;
            g gVar = aVar.L;
            Matrix matrix = aVar.f27928y0;
            gVar.getClass();
            matrix.reset();
            matrix.set(gVar.f38299a);
            matrix.postScale(f, f2, f10, -f11);
            aVar.L.j(matrix, aVar, false);
            aVar.f();
            aVar.postInvalidate();
            if (aVar.f27930u) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + a10.f38276b + ", y: " + a10.f38277c);
            }
            y6.c.d(a10);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ((p6.a) this.f36569x).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((p6.a) this.f36569x).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        T t3 = this.f36569x;
        p6.a aVar = (p6.a) t3;
        aVar.getOnChartGestureListener();
        if (!aVar.f27932w) {
            return false;
        }
        t6.c h10 = aVar.h(motionEvent.getX(), motionEvent.getY());
        if (h10 != null && !h10.a(this.f36567v)) {
            t3.i(h10);
            this.f36567v = h10;
        } else {
            t3.i(null);
            this.f36567v = null;
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f;
        boolean z14;
        t6.c h10;
        VelocityTracker velocityTracker;
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        int i6 = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.G) != null) {
            velocityTracker.recycle();
            this.G = null;
        }
        if (this.f36566u == 0) {
            this.f36568w.onTouchEvent(motionEvent);
        }
        T t3 = this.f36569x;
        p6.a aVar = (p6.a) t3;
        if (!aVar.e0 && !aVar.f27909f0 && !aVar.f27910g0) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        y6.c cVar = this.J;
        if (action != 0) {
            int i10 = 0;
            if (action != 1) {
                y6.c cVar2 = this.B;
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                VelocityTracker velocityTracker2 = this.G;
                                velocityTracker2.computeCurrentVelocity(1000, y6.f.f38292c);
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                                int pointerCount = motionEvent.getPointerCount();
                                while (true) {
                                    if (i10 >= pointerCount) {
                                        break;
                                    }
                                    if (i10 != actionIndex) {
                                        int pointerId2 = motionEvent.getPointerId(i10);
                                        if ((velocityTracker2.getYVelocity(pointerId2) * yVelocity) + (velocityTracker2.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                                            velocityTracker2.clear();
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                                this.f36566u = 5;
                            }
                        } else if (motionEvent.getPointerCount() >= 2) {
                            ViewParent parent = aVar.getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            d(motionEvent);
                            this.C = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                            this.D = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                            float e10 = e(motionEvent);
                            this.E = e10;
                            if (e10 > 10.0f) {
                                if (aVar.f27907b0) {
                                    this.f36566u = 4;
                                } else {
                                    boolean z15 = aVar.f27909f0;
                                    if (z15 != aVar.f27910g0) {
                                        if (z15) {
                                            i6 = 2;
                                        }
                                        this.f36566u = i6;
                                    } else {
                                        if (this.C > this.D) {
                                            i6 = 2;
                                        }
                                        this.f36566u = i6;
                                    }
                                }
                            }
                            float x10 = motionEvent.getX(1) + motionEvent.getX(0);
                            float y10 = motionEvent.getY(0);
                            cVar2.f38276b = x10 / 2.0f;
                            cVar2.f38277c = (motionEvent.getY(1) + y10) / 2.0f;
                        }
                    } else {
                        this.f36566u = 0;
                        t3.getOnChartGestureListener();
                    }
                } else {
                    int i11 = this.f36566u;
                    if (i11 == 1) {
                        ViewParent parent2 = aVar.getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        c(motionEvent);
                    } else if (i11 != 2 && i11 != 3 && i11 != 4) {
                        if (i11 == 0) {
                            float x11 = motionEvent.getX();
                            y6.c cVar3 = this.A;
                            float f2 = x11 - cVar3.f38276b;
                            float y11 = motionEvent.getY() - cVar3.f38277c;
                            if (Math.abs((float) Math.sqrt((y11 * y11) + (f2 * f2))) > this.K) {
                                g gVar = aVar.L;
                                if (gVar.f38309l <= 0.0f && gVar.f38310m <= 0.0f) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    if (gVar.b() && gVar.c()) {
                                        i10 = 1;
                                    }
                                    if (i10 == 0 && aVar.e0) {
                                        this.f36566u = 1;
                                    } else if (aVar.f27908d0 && (h10 = aVar.h(motionEvent.getX(), motionEvent.getY())) != null && !h10.a(this.f36567v)) {
                                        this.f36567v = h10;
                                        aVar.i(h10);
                                    }
                                } else if (aVar.e0) {
                                    this.f36566u = 1;
                                }
                            }
                        }
                    } else {
                        ViewParent parent3 = aVar.getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                        if ((aVar.f27909f0 || aVar.f27910g0) && motionEvent.getPointerCount() >= 2) {
                            aVar.getOnChartGestureListener();
                            float e11 = e(motionEvent);
                            if (e11 > this.L) {
                                y6.c a10 = a(cVar2.f38276b, cVar2.f38277c);
                                g viewPortHandler = aVar.getViewPortHandler();
                                int i12 = this.f36566u;
                                Matrix matrix = this.f36565z;
                                float f10 = 1.0f;
                                if (i12 == 4) {
                                    float f11 = e11 / this.E;
                                    if (f11 < 1.0f) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12 ? viewPortHandler.f38306i < viewPortHandler.f38305h : viewPortHandler.f38306i > viewPortHandler.f38304g) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z12 ? viewPortHandler.f38307j < viewPortHandler.f : viewPortHandler.f38307j > viewPortHandler.f38303e) {
                                        i10 = 1;
                                    }
                                    if (aVar.f27909f0) {
                                        f = f11;
                                    } else {
                                        f = 1.0f;
                                    }
                                    if (aVar.f27910g0) {
                                        f10 = f11;
                                    }
                                    if (i10 != 0 || z13) {
                                        this.f36564y.set(matrix);
                                        this.f36564y.postScale(f, f10, a10.f38276b, a10.f38277c);
                                    }
                                } else if (i12 == 2 && aVar.f27909f0) {
                                    float abs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.C;
                                    if (abs < 1.0f) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z11 ? viewPortHandler.f38306i < viewPortHandler.f38305h : viewPortHandler.f38306i > viewPortHandler.f38304g) {
                                        i10 = 1;
                                    }
                                    if (i10 != 0) {
                                        this.f36564y.set(matrix);
                                        this.f36564y.postScale(abs, 1.0f, a10.f38276b, a10.f38277c);
                                    }
                                } else if (i12 == 3 && aVar.f27910g0) {
                                    float abs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.D;
                                    if (abs2 < 1.0f) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10 ? viewPortHandler.f38307j < viewPortHandler.f : viewPortHandler.f38307j > viewPortHandler.f38303e) {
                                        i10 = 1;
                                    }
                                    if (i10 != 0) {
                                        this.f36564y.set(matrix);
                                        this.f36564y.postScale(1.0f, abs2, a10.f38276b, a10.f38277c);
                                    }
                                }
                                y6.c.d(a10);
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker3 = this.G;
                int pointerId3 = motionEvent.getPointerId(0);
                velocityTracker3.computeCurrentVelocity(1000, y6.f.f38292c);
                float yVelocity2 = velocityTracker3.getYVelocity(pointerId3);
                float xVelocity2 = velocityTracker3.getXVelocity(pointerId3);
                if ((Math.abs(xVelocity2) > y6.f.f38291b || Math.abs(yVelocity2) > y6.f.f38291b) && this.f36566u == 1 && aVar.f27933x) {
                    cVar.f38276b = 0.0f;
                    cVar.f38277c = 0.0f;
                    this.H = AnimationUtils.currentAnimationTimeMillis();
                    float x12 = motionEvent.getX();
                    y6.c cVar4 = this.I;
                    cVar4.f38276b = x12;
                    cVar4.f38277c = motionEvent.getY();
                    cVar.f38276b = xVelocity2;
                    cVar.f38277c = yVelocity2;
                    t3.postInvalidateOnAnimation();
                }
                int i13 = this.f36566u;
                if (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5) {
                    aVar.f();
                    aVar.postInvalidate();
                }
                this.f36566u = 0;
                ViewParent parent4 = aVar.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker4 = this.G;
                if (velocityTracker4 != null) {
                    velocityTracker4.recycle();
                    this.G = null;
                }
                t3.getOnChartGestureListener();
            }
        } else {
            t3.getOnChartGestureListener();
            cVar.f38276b = 0.0f;
            cVar.f38277c = 0.0f;
            d(motionEvent);
        }
        g viewPortHandler2 = aVar.getViewPortHandler();
        Matrix matrix2 = this.f36564y;
        viewPortHandler2.j(matrix2, t3, true);
        this.f36564y = matrix2;
        return true;
    }
}
