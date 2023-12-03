package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: FastScroller.java */
/* loaded from: classes.dex */
public final class i extends RecyclerView.l implements RecyclerView.q {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a  reason: collision with root package name */
    public final int f2952a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2953b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f2954c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f2955d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2956e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f2957g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f2958h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2959i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2960j;

    /* renamed from: k  reason: collision with root package name */
    public int f2961k;

    /* renamed from: l  reason: collision with root package name */
    public int f2962l;

    /* renamed from: m  reason: collision with root package name */
    public float f2963m;

    /* renamed from: n  reason: collision with root package name */
    public int f2964n;

    /* renamed from: o  reason: collision with root package name */
    public int f2965o;

    /* renamed from: p  reason: collision with root package name */
    public float f2966p;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f2968s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f2975z;

    /* renamed from: q  reason: collision with root package name */
    public int f2967q = 0;
    public int r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2969t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2970u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f2971v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f2972w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f2973x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f2974y = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            int i6 = iVar.A;
            ValueAnimator valueAnimator = iVar.f2975z;
            if (i6 != 1) {
                if (i6 != 2) {
                    return;
                }
            } else {
                valueAnimator.cancel();
            }
            iVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.r {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            boolean z10;
            boolean z11;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            i iVar = i.this;
            int computeVerticalScrollRange = iVar.f2968s.computeVerticalScrollRange();
            int i11 = iVar.r;
            int i12 = computeVerticalScrollRange - i11;
            int i13 = iVar.f2952a;
            if (i12 > 0 && i11 >= i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            iVar.f2969t = z10;
            int computeHorizontalScrollRange = iVar.f2968s.computeHorizontalScrollRange();
            int i14 = iVar.f2967q;
            if (computeHorizontalScrollRange - i14 > 0 && i14 >= i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            iVar.f2970u = z11;
            boolean z12 = iVar.f2969t;
            if (!z12 && !z11) {
                if (iVar.f2971v != 0) {
                    iVar.k(0);
                    return;
                }
                return;
            }
            if (z12) {
                float f = i11;
                iVar.f2962l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                iVar.f2961k = Math.min(i11, (i11 * i11) / computeVerticalScrollRange);
            }
            if (iVar.f2970u) {
                float f2 = computeHorizontalScrollOffset;
                float f10 = i14;
                iVar.f2965o = (int) ((((f10 / 2.0f) + f2) * f10) / computeHorizontalScrollRange);
                iVar.f2964n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
            }
            int i15 = iVar.f2971v;
            if (i15 == 0 || i15 == 1) {
                iVar.k(1);
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2978a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2978a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2978a) {
                this.f2978a = false;
                return;
            }
            i iVar = i.this;
            if (((Float) iVar.f2975z.getAnimatedValue()).floatValue() == 0.0f) {
                iVar.A = 0;
                iVar.k(0);
                return;
            }
            iVar.A = 2;
            iVar.f2968s.invalidate();
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i iVar = i.this;
            iVar.f2954c.setAlpha(floatValue);
            iVar.f2955d.setAlpha(floatValue);
            iVar.f2968s.invalidate();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2975z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f2954c = stateListDrawable;
        this.f2955d = drawable;
        this.f2957g = stateListDrawable2;
        this.f2958h = drawable2;
        this.f2956e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f2959i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f2960j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f2952a = i10;
        this.f2953b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f2968s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.a0(this);
                this.f2968s.b0(this);
                this.f2968s.c0(bVar);
                this.f2968s.removeCallbacks(aVar);
            }
            this.f2968s = recyclerView;
            if (recyclerView != null) {
                recyclerView.g(this);
                this.f2968s.h(this);
                this.f2968s.i(bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r8 >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r4 >= 0) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i6;
        int i10;
        if (this.f2971v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean j10 = j(motionEvent.getX(), motionEvent.getY());
            boolean i11 = i(motionEvent.getX(), motionEvent.getY());
            if (j10 || i11) {
                if (i11) {
                    this.f2972w = 1;
                    this.f2966p = (int) motionEvent.getX();
                } else if (j10) {
                    this.f2972w = 2;
                    this.f2963m = (int) motionEvent.getY();
                }
                k(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f2971v == 2) {
            this.f2963m = 0.0f;
            this.f2966p = 0.0f;
            k(1);
            this.f2972w = 0;
        } else if (motionEvent.getAction() == 2 && this.f2971v == 2) {
            l();
            int i12 = this.f2972w;
            int i13 = this.f2953b;
            if (i12 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f2974y;
                iArr[0] = i13;
                int i14 = this.f2967q - i13;
                iArr[1] = i14;
                float max = Math.max(i13, Math.min(i14, x10));
                if (Math.abs(this.f2965o - max) >= 2.0f) {
                    float f = this.f2966p;
                    int computeHorizontalScrollRange = this.f2968s.computeHorizontalScrollRange();
                    int computeHorizontalScrollOffset = this.f2968s.computeHorizontalScrollOffset();
                    int i15 = this.f2967q;
                    int i16 = iArr[1] - iArr[0];
                    if (i16 != 0) {
                        int i17 = computeHorizontalScrollRange - i15;
                        i10 = (int) (((max - f) / i16) * i17);
                        int i18 = computeHorizontalScrollOffset + i10;
                        if (i18 < i17) {
                        }
                    }
                    i10 = 0;
                    if (i10 != 0) {
                        this.f2968s.scrollBy(i10, 0);
                    }
                    this.f2966p = max;
                }
            }
            if (this.f2972w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f2973x;
                iArr2[0] = i13;
                int i19 = this.r - i13;
                iArr2[1] = i19;
                float max2 = Math.max(i13, Math.min(i19, y10));
                if (Math.abs(this.f2962l - max2) >= 2.0f) {
                    float f2 = this.f2963m;
                    int computeVerticalScrollRange = this.f2968s.computeVerticalScrollRange();
                    int computeVerticalScrollOffset = this.f2968s.computeVerticalScrollOffset();
                    int i20 = this.r;
                    int i21 = iArr2[1] - iArr2[0];
                    if (i21 != 0) {
                        int i22 = computeVerticalScrollRange - i20;
                        i6 = (int) (((max2 - f2) / i21) * i22);
                        int i23 = computeVerticalScrollOffset + i6;
                        if (i23 < i22) {
                        }
                    }
                    i6 = 0;
                    if (i6 != 0) {
                        this.f2968s.scrollBy(0, i6);
                    }
                    this.f2963m = max2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i6 = this.f2971v;
        if (i6 == 1) {
            boolean j10 = j(motionEvent.getX(), motionEvent.getY());
            boolean i10 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (j10 || i10)) {
                if (i10) {
                    this.f2972w = 1;
                    this.f2966p = (int) motionEvent.getX();
                } else if (j10) {
                    this.f2972w = 2;
                    this.f2963m = (int) motionEvent.getY();
                }
                k(2);
                return true;
            }
        } else if (i6 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2967q == this.f2968s.getWidth() && this.r == this.f2968s.getHeight()) {
            if (this.A != 0) {
                if (this.f2969t) {
                    int i6 = this.f2967q;
                    int i10 = this.f2956e;
                    int i11 = i6 - i10;
                    int i12 = this.f2962l;
                    int i13 = this.f2961k;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = this.f2954c;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = this.r;
                    int i16 = this.f;
                    Drawable drawable = this.f2955d;
                    drawable.setBounds(0, 0, i16, i15);
                    RecyclerView recyclerView2 = this.f2968s;
                    WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                    boolean z10 = true;
                    if (d0.e.d(recyclerView2) != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i10, -i14);
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i11, -i14);
                    }
                }
                if (this.f2970u) {
                    int i17 = this.r;
                    int i18 = this.f2959i;
                    int i19 = i17 - i18;
                    int i20 = this.f2965o;
                    int i21 = this.f2964n;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = this.f2957g;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    int i23 = this.f2967q;
                    int i24 = this.f2960j;
                    Drawable drawable2 = this.f2958h;
                    drawable2.setBounds(0, 0, i23, i24);
                    canvas.translate(0.0f, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                    return;
                }
                return;
            }
            return;
        }
        this.f2967q = this.f2968s.getWidth();
        this.r = this.f2968s.getHeight();
        k(0);
    }

    public final boolean i(float f, float f2) {
        if (f2 >= this.r - this.f2959i) {
            int i6 = this.f2965o;
            int i10 = this.f2964n;
            if (f >= i6 - (i10 / 2) && f <= (i10 / 2) + i6) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(float f, float f2) {
        boolean z10;
        RecyclerView recyclerView = this.f2968s;
        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
        if (d0.e.d(recyclerView) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i6 = this.f2956e;
        if (z10) {
            if (f > i6) {
                return false;
            }
        } else if (f < this.f2967q - i6) {
            return false;
        }
        int i10 = this.f2962l;
        int i11 = this.f2961k / 2;
        if (f2 < i10 - i11 || f2 > i11 + i10) {
            return false;
        }
        return true;
    }

    public final void k(int i6) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f2954c;
        if (i6 == 2 && this.f2971v != 2) {
            stateListDrawable.setState(C);
            this.f2968s.removeCallbacks(aVar);
        }
        if (i6 == 0) {
            this.f2968s.invalidate();
        } else {
            l();
        }
        if (this.f2971v == 2 && i6 != 2) {
            stateListDrawable.setState(D);
            this.f2968s.removeCallbacks(aVar);
            this.f2968s.postDelayed(aVar, 1200);
        } else if (i6 == 1) {
            this.f2968s.removeCallbacks(aVar);
            this.f2968s.postDelayed(aVar, 1500);
        }
        this.f2971v = i6;
    }

    public final void l() {
        int i6 = this.A;
        ValueAnimator valueAnimator = this.f2975z;
        if (i6 != 0) {
            if (i6 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void e(boolean z10) {
    }
}
