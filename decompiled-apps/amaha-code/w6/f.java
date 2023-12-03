package w6;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
/* compiled from: PieRadarChartTouchListener.java */
/* loaded from: classes.dex */
public final class f extends b<p6.d<?>> {
    public final ArrayList<a> A;
    public long B;
    public float C;

    /* renamed from: y  reason: collision with root package name */
    public final y6.c f36570y;

    /* renamed from: z  reason: collision with root package name */
    public float f36571z;

    /* compiled from: PieRadarChartTouchListener.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f36572a;

        /* renamed from: b  reason: collision with root package name */
        public float f36573b;

        public a(long j10, float f) {
            this.f36572a = j10;
            this.f36573b = f;
        }
    }

    public f(p6.d<?> dVar) {
        super(dVar);
        this.f36570y = y6.c.b(0.0f, 0.0f);
        this.f36571z = 0.0f;
        this.A = new ArrayList<>();
        this.B = 0L;
        this.C = 0.0f;
    }

    public final void a(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList<a> arrayList = this.A;
        arrayList.add(new a(currentAnimationTimeMillis, ((p6.d) this.f36569x).p(f, f2)));
        for (int size = arrayList.size(); size - 2 > 0 && currentAnimationTimeMillis - arrayList.get(0).f36572a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((p6.d) this.f36569x).getOnChartGestureListener();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        T t3 = this.f36569x;
        p6.d dVar = (p6.d) t3;
        dVar.getOnChartGestureListener();
        if (!dVar.f27932w) {
            return false;
        }
        t6.c h10 = dVar.h(motionEvent.getX(), motionEvent.getY());
        if (h10 != null && !h10.a(this.f36567v)) {
            t3.i(h10);
            this.f36567v = h10;
            return true;
        }
        t3.i(null);
        this.f36567v = null;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z10;
        float abs;
        if (this.f36568w.onTouchEvent(motionEvent)) {
            return true;
        }
        T t3 = this.f36569x;
        p6.d dVar = (p6.d) t3;
        if (dVar.f27949b0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            ArrayList<a> arrayList = this.A;
            y6.c cVar = this.f36570y;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (dVar.f27933x) {
                            a(x10, y10);
                        }
                        if (this.f36566u == 0) {
                            float f10 = x10 - cVar.f38276b;
                            float f11 = y10 - cVar.f38277c;
                            if (((float) Math.sqrt((f11 * f11) + (f10 * f10))) > y6.f.c(8.0f)) {
                                this.f36566u = 6;
                                ViewParent parent = dVar.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                t3.getOnChartGestureListener();
                            }
                        }
                        if (this.f36566u == 6) {
                            dVar.setRotationAngle(dVar.p(x10, y10) - this.f36571z);
                            dVar.invalidate();
                        }
                        t3.getOnChartGestureListener();
                    }
                } else {
                    if (dVar.f27933x) {
                        this.C = 0.0f;
                        a(x10, y10);
                        if (arrayList.isEmpty()) {
                            abs = 0.0f;
                        } else {
                            a aVar = arrayList.get(0);
                            a aVar2 = arrayList.get(arrayList.size() - 1);
                            a aVar3 = aVar;
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                aVar3 = arrayList.get(size);
                                if (aVar3.f36573b != aVar2.f36573b) {
                                    break;
                                }
                            }
                            float f12 = ((float) (aVar2.f36572a - aVar.f36572a)) / 1000.0f;
                            if (f12 == 0.0f) {
                                f12 = 0.1f;
                            }
                            if (aVar2.f36573b >= aVar3.f36573b) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (Math.abs(f - f2) > 270.0d) {
                                z10 = !z10;
                            }
                            float f13 = aVar2.f36573b;
                            float f14 = aVar.f36573b;
                            if (f13 - f14 > 180.0d) {
                                aVar.f36573b = (float) (f14 + 360.0d);
                            } else if (f14 - f13 > 180.0d) {
                                aVar2.f36573b = (float) (f13 + 360.0d);
                            }
                            abs = Math.abs((aVar2.f36573b - aVar.f36573b) / f12);
                            if (!z10) {
                                abs = -abs;
                            }
                        }
                        this.C = abs;
                        if (abs != 0.0f) {
                            this.B = AnimationUtils.currentAnimationTimeMillis();
                            DisplayMetrics displayMetrics = y6.f.f38290a;
                            t3.postInvalidateOnAnimation();
                        }
                    }
                    ViewParent parent2 = dVar.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(false);
                    }
                    this.f36566u = 0;
                    t3.getOnChartGestureListener();
                }
            } else {
                t3.getOnChartGestureListener();
                this.C = 0.0f;
                arrayList.clear();
                if (dVar.f27933x) {
                    a(x10, y10);
                }
                this.f36571z = dVar.p(x10, y10) - dVar.getRawRotationAngle();
                cVar.f38276b = x10;
                cVar.f38277c = y10;
            }
        }
        return true;
    }
}
