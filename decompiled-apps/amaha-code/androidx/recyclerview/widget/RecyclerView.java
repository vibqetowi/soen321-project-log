package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.z;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o0.k;
import t0.a;
import t0.d0;
import t0.f0;
import t0.j0;
import t0.l0;
import t0.o0;
import u0.h;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements t0.o {
    public static final int[] V0 = {16843830};
    public static final float W0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean X0;
    public static final boolean Y0;
    public static final boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    public static final Class<?>[] f2710a1;
    public static final c b1;

    /* renamed from: c1  reason: collision with root package name */
    public static final z f2711c1;
    public final f0 A;
    public androidx.recyclerview.widget.j A0;
    public boolean B;
    public final j.b B0;
    public final a C;
    public final y C0;
    public final Rect D;
    public r D0;
    public final Rect E;
    public ArrayList E0;
    public final RectF F;
    public boolean F0;
    public e G;
    public boolean G0;
    public m H;
    public final k H0;
    public u I;
    public boolean I0;
    public final ArrayList J;
    public androidx.recyclerview.widget.z J0;
    public final ArrayList<l> K;
    public final int[] K0;
    public final ArrayList<q> L;
    public t0.p L0;
    public q M;
    public final int[] M0;
    public boolean N;
    public final int[] N0;
    public boolean O;
    public final int[] O0;
    public boolean P;
    public final ArrayList P0;
    public int Q;
    public final b Q0;
    public boolean R;
    public boolean R0;
    public boolean S;
    public int S0;
    public boolean T;
    public int T0;
    public int U;
    public final d U0;
    public boolean V;
    public final AccessibilityManager W;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList f2712a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2713b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2714d0;
    public int e0;

    /* renamed from: f0  reason: collision with root package name */
    public i f2715f0;

    /* renamed from: g0  reason: collision with root package name */
    public EdgeEffect f2716g0;

    /* renamed from: h0  reason: collision with root package name */
    public EdgeEffect f2717h0;

    /* renamed from: i0  reason: collision with root package name */
    public EdgeEffect f2718i0;

    /* renamed from: j0  reason: collision with root package name */
    public EdgeEffect f2719j0;

    /* renamed from: k0  reason: collision with root package name */
    public j f2720k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2721l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f2722m0;

    /* renamed from: n0  reason: collision with root package name */
    public VelocityTracker f2723n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f2724o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f2725p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2726q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2727r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2728s0;

    /* renamed from: t0  reason: collision with root package name */
    public p f2729t0;

    /* renamed from: u  reason: collision with root package name */
    public final float f2730u;

    /* renamed from: u0  reason: collision with root package name */
    public final int f2731u0;

    /* renamed from: v  reason: collision with root package name */
    public final v f2732v;

    /* renamed from: v0  reason: collision with root package name */
    public final int f2733v0;

    /* renamed from: w  reason: collision with root package name */
    public final t f2734w;

    /* renamed from: w0  reason: collision with root package name */
    public final float f2735w0;

    /* renamed from: x  reason: collision with root package name */
    public w f2736x;

    /* renamed from: x0  reason: collision with root package name */
    public final float f2737x0;

    /* renamed from: y  reason: collision with root package name */
    public androidx.recyclerview.widget.a f2738y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2739y0;

    /* renamed from: z  reason: collision with root package name */
    public androidx.recyclerview.widget.b f2740z;

    /* renamed from: z0  reason: collision with root package name */
    public final b0 f2741z0;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.P && !recyclerView.isLayoutRequested()) {
                if (!recyclerView.N) {
                    recyclerView.requestLayout();
                } else if (recyclerView.S) {
                    recyclerView.R = true;
                } else {
                    recyclerView.o();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            j jVar = recyclerView.f2720k0;
            if (jVar != null) {
                jVar.k();
            }
            recyclerView.I0 = false;
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public int f2744u;

        /* renamed from: v  reason: collision with root package name */
        public int f2745v;

        /* renamed from: w  reason: collision with root package name */
        public OverScroller f2746w;

        /* renamed from: x  reason: collision with root package name */
        public Interpolator f2747x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f2748y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f2749z;

        public b0() {
            c cVar = RecyclerView.b1;
            this.f2747x = cVar;
            this.f2748y = false;
            this.f2749z = false;
            this.f2746w = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i6, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.setScrollState(2);
            this.f2745v = 0;
            this.f2744u = 0;
            Interpolator interpolator = this.f2747x;
            c cVar = RecyclerView.b1;
            if (interpolator != cVar) {
                this.f2747x = cVar;
                this.f2746w = new OverScroller(recyclerView.getContext(), cVar);
            }
            this.f2746w.fling(0, 0, i6, i10, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO, LinearLayoutManager.INVALID_OFFSET, SubsamplingScaleImageView.TILE_SIZE_AUTO);
            b();
        }

        public final void b() {
            if (this.f2748y) {
                this.f2749z = true;
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.removeCallbacks(this);
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            d0.d.m(recyclerView, this);
        }

        public final void c(int i6, int i10, int i11, Interpolator interpolator) {
            boolean z10;
            int height;
            RecyclerView recyclerView = RecyclerView.this;
            if (i11 == Integer.MIN_VALUE) {
                int abs = Math.abs(i6);
                int abs2 = Math.abs(i10);
                if (abs > abs2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                if (!z10) {
                    abs = abs2;
                }
                i11 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
            }
            int i12 = i11;
            if (interpolator == null) {
                interpolator = RecyclerView.b1;
            }
            if (this.f2747x != interpolator) {
                this.f2747x = interpolator;
                this.f2746w = new OverScroller(recyclerView.getContext(), interpolator);
            }
            this.f2745v = 0;
            this.f2744u = 0;
            recyclerView.setScrollState(2);
            this.f2746w.startScroll(0, 0, i6, i10, i12);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2746w.computeScrollOffset();
            }
            b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i6;
            int i10;
            int i11;
            int i12;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.H == null) {
                recyclerView.removeCallbacks(this);
                this.f2746w.abortAnimation();
                return;
            }
            this.f2749z = false;
            this.f2748y = true;
            recyclerView.o();
            OverScroller overScroller = this.f2746w;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currY - this.f2745v;
                this.f2744u = currX;
                this.f2745v = currY;
                int n10 = RecyclerView.n(currX - this.f2744u, recyclerView.f2716g0, recyclerView.f2718i0, recyclerView.getWidth());
                int n11 = RecyclerView.n(i14, recyclerView.f2717h0, recyclerView.f2719j0, recyclerView.getHeight());
                int[] iArr = recyclerView.O0;
                iArr[0] = 0;
                iArr[1] = 0;
                boolean u10 = recyclerView.u(n10, n11, iArr, null, 1);
                int[] iArr2 = recyclerView.O0;
                if (u10) {
                    n10 -= iArr2[0];
                    n11 -= iArr2[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.m(n10, n11);
                }
                if (recyclerView.G != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    recyclerView.g0(n10, n11, iArr2);
                    int i15 = iArr2[0];
                    int i16 = iArr2[1];
                    int i17 = n10 - i15;
                    int i18 = n11 - i16;
                    x xVar = recyclerView.H.mSmoothScroller;
                    if (xVar != null && !xVar.isPendingInitialRun() && xVar.isRunning()) {
                        int b10 = recyclerView.C0.b();
                        if (b10 == 0) {
                            xVar.stop();
                        } else if (xVar.getTargetPosition() >= b10) {
                            xVar.setTargetPosition(b10 - 1);
                            xVar.onAnimation(i15, i16);
                        } else {
                            xVar.onAnimation(i15, i16);
                        }
                    }
                    i12 = i15;
                    i6 = i17;
                    i10 = i18;
                    i11 = i16;
                } else {
                    i6 = n10;
                    i10 = n11;
                    i11 = 0;
                    i12 = 0;
                }
                if (!recyclerView.K.isEmpty()) {
                    recyclerView.invalidate();
                }
                int[] iArr3 = recyclerView.O0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int i19 = i11;
                recyclerView.v(i12, i11, i6, i10, null, 1, iArr3);
                int i20 = i6 - iArr2[0];
                int i21 = i10 - iArr2[1];
                if (i12 != 0 || i19 != 0) {
                    recyclerView.w(i12, i19);
                }
                if (!recyclerView.awakenScrollBars()) {
                    recyclerView.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!overScroller.isFinished() && ((!z10 && i20 == 0) || (!z11 && i21 == 0))) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                x xVar2 = recyclerView.H.mSmoothScroller;
                if (xVar2 != null && xVar2.isPendingInitialRun()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13 && z12) {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i20 < 0) {
                            i13 = -currVelocity;
                        } else if (i20 > 0) {
                            i13 = currVelocity;
                        } else {
                            i13 = 0;
                        }
                        if (i21 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i21 <= 0) {
                            currVelocity = 0;
                        }
                        if (i13 < 0) {
                            recyclerView.y();
                            if (recyclerView.f2716g0.isFinished()) {
                                recyclerView.f2716g0.onAbsorb(-i13);
                            }
                        } else if (i13 > 0) {
                            recyclerView.z();
                            if (recyclerView.f2718i0.isFinished()) {
                                recyclerView.f2718i0.onAbsorb(i13);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.A();
                            if (recyclerView.f2717h0.isFinished()) {
                                recyclerView.f2717h0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.x();
                            if (recyclerView.f2719j0.isFinished()) {
                                recyclerView.f2719j0.onAbsorb(currVelocity);
                            }
                        }
                        if (i13 != 0 || currVelocity != 0) {
                            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                            d0.d.k(recyclerView);
                        }
                    }
                    if (RecyclerView.Z0) {
                        j.b bVar = recyclerView.B0;
                        int[] iArr4 = bVar.f2989c;
                        if (iArr4 != null) {
                            Arrays.fill(iArr4, -1);
                        }
                        bVar.f2990d = 0;
                    }
                } else {
                    b();
                    androidx.recyclerview.widget.j jVar = recyclerView.A0;
                    if (jVar != null) {
                        jVar.a(recyclerView, i12, i19);
                    }
                }
            }
            x xVar3 = recyclerView.H.mSmoothScroller;
            if (xVar3 != null && xVar3.isPendingInitialRun()) {
                xVar3.onAnimation(0, 0);
            }
            this.f2748y = false;
            if (this.f2749z) {
                recyclerView.removeCallbacks(this);
                WeakHashMap<View, o0> weakHashMap2 = t0.d0.f32288a;
                d0.d.m(recyclerView, this);
                return;
            }
            recyclerView.setScrollState(0);
            recyclerView.o0(1);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f2750t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f2751a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f2752b;

        /* renamed from: j  reason: collision with root package name */
        public int f2759j;
        public RecyclerView r;

        /* renamed from: s  reason: collision with root package name */
        public e<? extends c0> f2767s;

        /* renamed from: c  reason: collision with root package name */
        public int f2753c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2754d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f2755e = -1;
        public int f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2756g = -1;

        /* renamed from: h  reason: collision with root package name */
        public c0 f2757h = null;

        /* renamed from: i  reason: collision with root package name */
        public c0 f2758i = null;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f2760k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f2761l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f2762m = 0;

        /* renamed from: n  reason: collision with root package name */
        public t f2763n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2764o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f2765p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f2766q = -1;

        public c0(View view) {
            if (view != null) {
                this.f2751a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final void c(Object obj) {
            if (obj == null) {
                d(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
            } else if ((1024 & this.f2759j) == 0) {
                if (this.f2760k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f2760k = arrayList;
                    this.f2761l = Collections.unmodifiableList(arrayList);
                }
                this.f2760k.add(obj);
            }
        }

        public final void d(int i6) {
            this.f2759j = i6 | this.f2759j;
        }

        public final int e() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.I(this);
        }

        @Deprecated
        public final int f() {
            RecyclerView recyclerView;
            e<? extends c0> adapter;
            int I;
            if (this.f2767s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (I = this.r.I(this)) == -1 || this.f2767s != adapter) {
                return -1;
            }
            return I;
        }

        public final int g() {
            return this.f;
        }

        public final int h() {
            int i6 = this.f2756g;
            if (i6 == -1) {
                return this.f2753c;
            }
            return i6;
        }

        public final List<Object> i() {
            ArrayList arrayList;
            if ((this.f2759j & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 0 && (arrayList = this.f2760k) != null && arrayList.size() != 0) {
                return this.f2761l;
            }
            return f2750t;
        }

        public final boolean j() {
            View view = this.f2751a;
            if (view.getParent() != null && view.getParent() != this.r) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            if ((this.f2759j & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if ((this.f2759j & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean m() {
            if ((this.f2759j & 16) == 0) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                if (!d0.d.i(this.f2751a)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean n() {
            if ((this.f2759j & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean o() {
            if (this.f2763n != null) {
                return true;
            }
            return false;
        }

        public final boolean p() {
            if ((this.f2759j & 256) != 0) {
                return true;
            }
            return false;
        }

        public final void q(int i6, boolean z10) {
            if (this.f2754d == -1) {
                this.f2754d = this.f2753c;
            }
            if (this.f2756g == -1) {
                this.f2756g = this.f2753c;
            }
            if (z10) {
                this.f2756g += i6;
            }
            this.f2753c += i6;
            View view = this.f2751a;
            if (view.getLayoutParams() != null) {
                ((n) view.getLayoutParams()).f2788c = true;
            }
        }

        public final void r() {
            this.f2759j = 0;
            this.f2753c = -1;
            this.f2754d = -1;
            this.f2755e = -1L;
            this.f2756g = -1;
            this.f2762m = 0;
            this.f2757h = null;
            this.f2758i = null;
            ArrayList arrayList = this.f2760k;
            if (arrayList != null) {
                arrayList.clear();
            }
            this.f2759j &= -1025;
            this.f2765p = 0;
            this.f2766q = -1;
            RecyclerView.k(this);
        }

        public final void s(boolean z10) {
            int i6;
            int i10 = this.f2762m;
            if (z10) {
                i6 = i10 - 1;
            } else {
                i6 = i10 + 1;
            }
            this.f2762m = i6;
            if (i6 < 0) {
                this.f2762m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i6 == 1) {
                this.f2759j |= 16;
            } else if (z10 && i6 == 0) {
                this.f2759j &= -17;
            }
        }

        public final boolean t() {
            if ((this.f2759j & 128) != 0) {
                return true;
            }
            return false;
        }

        public final String toString() {
            String simpleName;
            boolean z10;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder d10 = v.g.d(simpleName, "{");
            d10.append(Integer.toHexString(hashCode()));
            d10.append(" position=");
            d10.append(this.f2753c);
            d10.append(" id=");
            d10.append(this.f2755e);
            d10.append(", oldPos=");
            d10.append(this.f2754d);
            d10.append(", pLpos:");
            d10.append(this.f2756g);
            StringBuilder sb2 = new StringBuilder(d10.toString());
            if (o()) {
                sb2.append(" scrap ");
                if (this.f2764o) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (l()) {
                sb2.append(" invalid");
            }
            if (!k()) {
                sb2.append(" unbound");
            }
            boolean z11 = true;
            if ((this.f2759j & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append(" update");
            }
            if (n()) {
                sb2.append(" removed");
            }
            if (t()) {
                sb2.append(" ignored");
            }
            if (p()) {
                sb2.append(" tmpDetached");
            }
            if (!m()) {
                sb2.append(" not recyclable(" + this.f2762m + ")");
            }
            if ((this.f2759j & 512) == 0 && !l()) {
                z11 = false;
            }
            if (z11) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2751a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        public final boolean u() {
            if ((this.f2759j & 32) != 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i6, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).e(i6, i10);
            }
        }

        public final void d(int i6, int i10, Bundle bundle) {
            int size = ((Observable) this).mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((g) ((Observable) this).mObservers.get(size)).c(i6, i10, bundle);
                } else {
                    return;
                }
            }
        }

        public final void e(int i6, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i6, i10);
            }
        }

        public final void f(int i6, int i10) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).f(i6, i10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public b f2772a = null;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<a> f2773b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final long f2774c = 120;

        /* renamed from: d  reason: collision with root package name */
        public final long f2775d = 120;

        /* renamed from: e  reason: collision with root package name */
        public final long f2776e = 250;
        public final long f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f2777a;

            /* renamed from: b  reason: collision with root package name */
            public int f2778b;

            public final void a(c0 c0Var) {
                View view = c0Var.f2751a;
                this.f2777a = view.getLeft();
                this.f2778b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(c0 c0Var) {
            int i6 = c0Var.f2759j & 14;
            if (!c0Var.l() && (i6 & 4) == 0) {
                c0Var.e();
            }
        }

        public abstract boolean a(c0 c0Var, c cVar, c cVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, c cVar, c cVar2);

        public abstract boolean c(c0 c0Var, c cVar, c cVar2);

        public abstract boolean d(c0 c0Var, c cVar, c cVar2);

        public abstract boolean f(c0 c0Var, List<Object> list);

        public final void g(c0 c0Var) {
            boolean z10;
            b bVar = this.f2772a;
            if (bVar != null) {
                k kVar = (k) bVar;
                boolean z11 = true;
                c0Var.s(true);
                if (c0Var.f2757h != null && c0Var.f2758i == null) {
                    c0Var.f2757h = null;
                }
                c0Var.f2758i = null;
                if ((c0Var.f2759j & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.m0();
                    androidx.recyclerview.widget.b bVar2 = recyclerView.f2740z;
                    androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) bVar2.f2879a;
                    RecyclerView recyclerView2 = xVar.f3061a;
                    View view = c0Var.f2751a;
                    int indexOfChild = recyclerView2.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.m(view);
                    } else {
                        b.a aVar = bVar2.f2880b;
                        if (aVar.d(indexOfChild)) {
                            aVar.f(indexOfChild);
                            bVar2.m(view);
                            xVar.b(indexOfChild);
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        c0 L = RecyclerView.L(view);
                        t tVar = recyclerView.f2734w;
                        tVar.l(L);
                        tVar.i(L);
                    }
                    recyclerView.n0(!z11);
                    if (!z11 && c0Var.p()) {
                        recyclerView.removeDetachedView(view, false);
                    }
                }
            }
        }

        public abstract void h(c0 c0Var);

        public abstract void i();

        public abstract boolean j();

        public abstract void k();
    }

    /* loaded from: classes.dex */
    public class k implements j.b {
        public k() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.b mChildHelper;
        private int mHeight;
        private int mHeightMode;
        e0 mHorizontalBoundCheck;
        private final e0.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        x mSmoothScroller;
        e0 mVerticalBoundCheck;
        private final e0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* loaded from: classes.dex */
        public class a implements e0.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int a(View view) {
                return m.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int b() {
                return m.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int c() {
                m mVar = m.this;
                return mVar.getWidth() - mVar.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final View d(int i6) {
                return m.this.getChildAt(i6);
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int e(View view) {
                return m.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements e0.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int a(View view) {
                return m.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int b() {
                return m.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int c() {
                m mVar = m.this;
                return mVar.getHeight() - mVar.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final View d(int i6) {
                return m.this.getChildAt(i6);
            }

            @Override // androidx.recyclerview.widget.e0.b
            public final int e(View view) {
                return m.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f2782a;

            /* renamed from: b  reason: collision with root package name */
            public int f2783b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f2784c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f2785d;
        }

        public m() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new e0(aVar);
            this.mVerticalBoundCheck = new e0(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i6, boolean z10) {
            c0 L = RecyclerView.L(view);
            if (!z10 && !L.n()) {
                this.mRecyclerView.A.c(L);
            } else {
                t.h<c0, f0.a> hVar = this.mRecyclerView.A.f2938a;
                f0.a orDefault = hVar.getOrDefault(L, null);
                if (orDefault == null) {
                    orDefault = f0.a.a();
                    hVar.put(L, orDefault);
                }
                orDefault.f2941a |= 1;
            }
            n nVar = (n) view.getLayoutParams();
            if (!L.u() && !L.o()) {
                if (view.getParent() == this.mRecyclerView) {
                    int j10 = this.mChildHelper.j(view);
                    if (i6 == -1) {
                        i6 = this.mChildHelper.e();
                    }
                    if (j10 != -1) {
                        if (j10 != i6) {
                            this.mRecyclerView.H.moveView(j10, i6);
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb2.append(this.mRecyclerView.indexOfChild(view));
                        throw new IllegalStateException(defpackage.b.i(this.mRecyclerView, sb2));
                    }
                } else {
                    this.mChildHelper.a(view, i6, false);
                    nVar.f2788c = true;
                    x xVar = this.mSmoothScroller;
                    if (xVar != null && xVar.isRunning()) {
                        this.mSmoothScroller.onChildAttachedToWindow(view);
                    }
                }
            } else {
                if (L.o()) {
                    L.f2763n.l(L);
                } else {
                    L.f2759j &= -33;
                }
                this.mChildHelper.b(view, i6, view.getLayoutParams(), false);
            }
            if (nVar.f2789d) {
                L.f2751a.invalidate();
                nVar.f2789d = false;
            }
        }

        public static int chooseSize(int i6, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i10, i11);
                }
                return size;
            }
            return Math.min(size, Math.max(i10, i11));
        }

        private void detachViewInternal(int i6, View view) {
            this.mChildHelper.c(i6);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r3 >= 0) goto L8;
         */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i6, int i10, int i11, boolean z10) {
            int i12 = i6 - i10;
            int i13 = 0;
            int max = Math.max(0, i12);
            if (!z10) {
                if (i11 < 0) {
                    if (i11 == -1) {
                        i13 = 1073741824;
                    } else {
                        if (i11 == -2) {
                            i13 = LinearLayoutManager.INVALID_OFFSET;
                        }
                        i11 = 0;
                    }
                    i11 = max;
                }
                i13 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i11, i13);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i6 = left - paddingLeft;
            int min = Math.min(0, i6);
            int i10 = top - paddingTop;
            int min2 = Math.min(0, i10);
            int i11 = width2 - width;
            int max = Math.max(0, i11);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() == 1) {
                if (max == 0) {
                    max = Math.max(min, i11);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i6, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i10, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i6, int i10) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sc.b.Q, i6, i10);
            dVar.f2782a = obtainStyledAttributes.getInt(0, 1);
            dVar.f2783b = obtainStyledAttributes.getInt(10, 1);
            dVar.f2784c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f2785d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i6, int i10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.D;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i6 >= width || rect.right - i6 <= paddingLeft || rect.top - i10 >= height || rect.bottom - i10 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean isMeasurementUpToDate(int i6, int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (i11 > 0 && i6 != i11) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i6) {
                    return false;
                }
                return true;
            } else if (size < i6) {
                return false;
            } else {
                return true;
            }
        }

        private void scrapOrRecycleView(t tVar, int i6, View view) {
            c0 L = RecyclerView.L(view);
            if (L.t()) {
                return;
            }
            if (L.l() && !L.n() && !this.mRecyclerView.G.f2770v) {
                removeViewAt(i6);
                tVar.i(L);
                return;
            }
            detachViewAt(i6);
            tVar.j(view);
            this.mRecyclerView.A.c(L);
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && !recyclerView.N()) {
                if (str == null) {
                    throw new IllegalStateException(defpackage.b.i(recyclerView, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
                }
                throw new IllegalStateException(defpackage.b.i(recyclerView, v.h.c(str)));
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.j(str);
            }
        }

        public void attachView(View view, int i6, n nVar) {
            c0 L = RecyclerView.L(view);
            if (L.n()) {
                t.h<c0, f0.a> hVar = this.mRecyclerView.A.f2938a;
                f0.a orDefault = hVar.getOrDefault(L, null);
                if (orDefault == null) {
                    orDefault = f0.a.a();
                    hVar.put(L, orDefault);
                }
                orDefault.f2941a |= 1;
            } else {
                this.mRecyclerView.A.c(L);
            }
            this.mChildHelper.b(view, i6, nVar, L.n());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.M(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(n nVar) {
            if (nVar != null) {
                return true;
            }
            return false;
        }

        public int computeHorizontalScrollExtent(y yVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(y yVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(y yVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(y yVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(y yVar) {
            return 0;
        }

        public int computeVerticalScrollRange(y yVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(t tVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(tVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, t tVar) {
            scrapOrRecycleView(tVar, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i6, t tVar) {
            scrapOrRecycleView(tVar, i6, getChildAt(i6));
        }

        public void detachView(View view) {
            int j10 = this.mChildHelper.j(view);
            if (j10 >= 0) {
                detachViewInternal(j10, view);
            }
        }

        public void detachViewAt(int i6) {
            detachViewInternal(i6, getChildAt(i6));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, t tVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, tVar);
        }

        public void endAnimation(View view) {
            j jVar = this.mRecyclerView.f2720k0;
            if (jVar != null) {
                jVar.h(RecyclerView.L(view));
            }
        }

        public View findContainingItemView(View view) {
            View D;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (D = recyclerView.D(view)) == null || this.mChildHelper.k(D)) {
                return null;
            }
            return D;
        }

        public View findViewByPosition(int i6) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                c0 L = RecyclerView.L(childAt);
                if (L != null && L.h() == i6 && !L.t() && (this.mRecyclerView.C0.f2817g || !L.n())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract n generateDefaultLayoutParams();

        public n generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof n) {
                return new n((n) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new n((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new n(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((n) view.getLayoutParams()).f2787b.bottom;
        }

        public View getChildAt(int i6) {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.d(i6);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.B) {
                return true;
            }
            return false;
        }

        public int getColumnCountForAccessibility(t tVar, y yVar) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            int[] iArr = RecyclerView.V0;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f2787b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((n) view.getLayoutParams()).f2787b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((n) view.getLayoutParams()).f2787b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            e eVar;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.f();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.L(view).f;
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            return d0.e.d(recyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((n) view.getLayoutParams()).f2787b.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            return d0.d.d(recyclerView);
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            return d0.d.e(recyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                return d0.e.e(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                return d0.e.f(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((n) view.getLayoutParams()).f2787b.right;
        }

        public int getRowCountForAccessibility(t tVar, y yVar) {
            return -1;
        }

        public int getSelectionModeForAccessibility(t tVar, y yVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((n) view.getLayoutParams()).f2787b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((n) view.getLayoutParams()).f2787b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.F;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.hasFocus()) {
                return true;
            }
            return false;
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                c0 L = RecyclerView.L(view);
                L.d(128);
                this.mRecyclerView.A.d(L);
                return;
            }
            throw new IllegalArgumentException(defpackage.b.i(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && recyclerView.isFocused()) {
                return true;
            }
            return false;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(t tVar, y yVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            x xVar = this.mSmoothScroller;
            if (xVar != null && xVar.isRunning()) {
                return true;
            }
            return false;
        }

        public boolean isViewPartiallyVisible(View view, boolean z10, boolean z11) {
            boolean z12;
            if (this.mHorizontalBoundCheck.b(view) && this.mVerticalBoundCheck.b(view)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                return z12;
            }
            return !z12;
        }

        public void layoutDecorated(View view, int i6, int i10, int i11, int i12) {
            Rect rect = ((n) view.getLayoutParams()).f2787b;
            view.layout(i6 + rect.left, i10 + rect.top, i11 - rect.right, i12 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i6, int i10, int i11, int i12) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f2787b;
            view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public void measureChild(View view, int i6, int i10) {
            n nVar = (n) view.getLayoutParams();
            Rect M = this.mRecyclerView.M(view);
            int i11 = M.left + M.right + i6;
            int i12 = M.top + M.bottom + i10;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i11, ((ViewGroup.MarginLayoutParams) nVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i12, ((ViewGroup.MarginLayoutParams) nVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, nVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i6, int i10) {
            n nVar = (n) view.getLayoutParams();
            Rect M = this.mRecyclerView.M(view);
            int i11 = M.left + M.right + i6;
            int i12 = M.top + M.bottom + i10;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin + i11, ((ViewGroup.MarginLayoutParams) nVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) nVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, nVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i6, int i10) {
            View childAt = getChildAt(i6);
            if (childAt != null) {
                detachViewAt(i6);
                attachView(childAt, i10);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i6 + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(int i6) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e10 = recyclerView.f2740z.e();
                for (int i10 = 0; i10 < e10; i10++) {
                    recyclerView.f2740z.d(i10).offsetLeftAndRight(i6);
                }
            }
        }

        public void offsetChildrenVertical(int i6) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e10 = recyclerView.f2740z.e();
                for (int i10 = 0; i10 < e10; i10++) {
                    recyclerView.f2740z.d(i10).offsetTopAndBottom(i6);
                }
            }
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i6, int i10) {
            return false;
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i6, t tVar, y yVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f2734w, recyclerView.C0, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(u0.h hVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f2734w, recyclerView.C0, hVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(t tVar, y yVar, View view, u0.h hVar) {
        }

        public View onInterceptFocusSearch(View view, int i6) {
            return null;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i6, int i10) {
        }

        public void onLayoutChildren(t tVar, y yVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onMeasure(t tVar, y yVar, int i6, int i10) {
            this.mRecyclerView.p(i6, i10);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.N();
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onSmoothScrollerStopped(x xVar) {
            if (this.mSmoothScroller == xVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i6, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f2734w, recyclerView.C0, i6, bundle);
        }

        public boolean performAccessibilityActionForItem(t tVar, y yVar, View view, int i6, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                d0.d.m(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(t tVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.L(getChildAt(childCount)).t()) {
                    removeAndRecycleViewAt(childCount, tVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(t tVar) {
            ArrayList<c0> arrayList;
            int size = tVar.f2797a.size();
            int i6 = size - 1;
            while (true) {
                arrayList = tVar.f2797a;
                if (i6 < 0) {
                    break;
                }
                View view = arrayList.get(i6).f2751a;
                c0 L = RecyclerView.L(view);
                if (!L.t()) {
                    L.s(false);
                    if (L.p()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    j jVar = this.mRecyclerView.f2720k0;
                    if (jVar != null) {
                        jVar.h(L);
                    }
                    L.s(true);
                    c0 L2 = RecyclerView.L(view);
                    L2.f2763n = null;
                    L2.f2764o = false;
                    L2.f2759j &= -33;
                    tVar.i(L2);
                }
                i6--;
            }
            arrayList.clear();
            ArrayList<c0> arrayList2 = tVar.f2798b;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, t tVar) {
            removeView(view);
            tVar.h(view);
        }

        public void removeAndRecycleViewAt(int i6, t tVar) {
            View childAt = getChildAt(i6);
            removeViewAt(i6);
            tVar.h(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            androidx.recyclerview.widget.b bVar = this.mChildHelper;
            androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) bVar.f2879a;
            int indexOfChild = xVar.f3061a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f2880b.f(indexOfChild)) {
                    bVar.m(view);
                }
                xVar.b(indexOfChild);
            }
        }

        public void removeViewAt(int i6) {
            if (getChildAt(i6) != null) {
                this.mChildHelper.l(i6);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z10, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i6, t tVar, y yVar) {
            return 0;
        }

        public int scrollVerticallyBy(int i6, t tVar, y yVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z10) {
            this.mAutoMeasure = z10;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z10) {
            if (z10 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z10;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f2734w.m();
                }
            }
        }

        public void setMeasureSpecs(int i6, int i10) {
            this.mWidth = View.MeasureSpec.getSize(i6);
            int mode = View.MeasureSpec.getMode(i6);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.X0) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.X0) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i6, int i10) {
            setMeasuredDimension(chooseSize(i6, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i10, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i6, int i10) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.p(i6, i10);
                return;
            }
            int i11 = LinearLayoutManager.INVALID_OFFSET;
            int i12 = LinearLayoutManager.INVALID_OFFSET;
            int i13 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i14 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                Rect rect = this.mRecyclerView.D;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i16 = rect.left;
                if (i16 < i13) {
                    i13 = i16;
                }
                int i17 = rect.right;
                if (i17 > i11) {
                    i11 = i17;
                }
                int i18 = rect.top;
                if (i18 < i14) {
                    i14 = i18;
                }
                int i19 = rect.bottom;
                if (i19 > i12) {
                    i12 = i19;
                }
            }
            this.mRecyclerView.D.set(i13, i14, i11, i12);
            setMeasuredDimension(this.mRecyclerView.D, i6, i10);
        }

        public void setMeasurementCacheEnabled(boolean z10) {
            this.mMeasurementCacheEnabled = z10;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f2740z;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i6, int i10, n nVar) {
            if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) nVar).width) && isMeasurementUpToDate(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) nVar).height)) {
                return false;
            }
            return true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i6, int i10, n nVar) {
            if (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) nVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) nVar).height)) {
                return false;
            }
            return true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, y yVar, int i6) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(x xVar) {
            x xVar2 = this.mSmoothScroller;
            if (xVar2 != null && xVar != xVar2 && xVar2.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = xVar;
            xVar.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            c0 L = RecyclerView.L(view);
            L.f2759j &= -129;
            L.r();
            L.d(4);
        }

        public void stopSmoothScroller() {
            x xVar = this.mSmoothScroller;
            if (xVar != null) {
                xVar.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i6) {
            addViewInt(view, i6, true);
        }

        public void addView(View view, int i6) {
            addViewInt(view, i6, false);
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, t tVar) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityEvent(t tVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            e eVar = this.mRecyclerView.G;
            if (eVar != null) {
                accessibilityEvent.setItemCount(eVar.f());
            }
        }

        public void onInitializeAccessibilityNodeInfo(t tVar, y yVar, u0.h hVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                hVar.a(8192);
                hVar.k(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                hVar.a(4096);
                hVar.k(true);
            }
            h.b a10 = h.b.a(getRowCountForAccessibility(tVar, yVar), getColumnCountForAccessibility(tVar, yVar), getSelectionModeForAccessibility(tVar, yVar), isLayoutHierarchical(tVar, yVar));
            hVar.getClass();
            hVar.f33731a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a10.f33747a);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, u0.h hVar) {
            c0 L = RecyclerView.L(view);
            if (L == null || L.n() || this.mChildHelper.k(L.f2751a)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.f2734w, recyclerView.C0, view, hVar);
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i6, int i10, Object obj) {
            onItemsUpdated(recyclerView, i6, i10);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, y yVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008e A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean performAccessibilityAction(t tVar, y yVar, int i6, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            if (this.mRecyclerView == null) {
                return false;
            }
            int height = getHeight();
            int width = getWidth();
            Rect rect = new Rect();
            if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
                height = rect.height();
                width = rect.width();
            }
            if (i6 == 4096) {
                paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                    if (paddingTop == 0) {
                    }
                    this.mRecyclerView.k0(paddingLeft, paddingTop, true);
                    return true;
                }
                paddingLeft = 0;
                if (paddingTop == 0) {
                }
                this.mRecyclerView.k0(paddingLeft, paddingTop, true);
                return true;
            }
            if (i6 != 8192) {
                paddingTop = 0;
            } else {
                paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                    if (paddingTop == 0 || paddingLeft != 0) {
                        this.mRecyclerView.k0(paddingLeft, paddingTop, true);
                        return true;
                    }
                    return false;
                }
            }
            paddingLeft = 0;
            if (paddingTop == 0) {
            }
            this.mRecyclerView.k0(paddingLeft, paddingTop, true);
            return true;
        }

        public boolean performAccessibilityActionForItem(View view, int i6, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f2734w, recyclerView.C0, view, i6, bundle);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i6 = childRectangleOnScreenScrollAmount[0];
            int i10 = childRectangleOnScreenScrollAmount[1];
            if ((!z11 || isFocusedChildVisibleAfterScrolling(recyclerView, i6, i10)) && !(i6 == 0 && i10 == 0)) {
                if (z10) {
                    recyclerView.scrollBy(i6, i10);
                } else {
                    recyclerView.j0(i6, i10);
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i6, int i10, int i11, int i12, boolean z10) {
            int max = Math.max(0, i6 - i11);
            if (z10) {
                if (i12 < 0) {
                    if (i12 == -1) {
                        if (i10 != Integer.MIN_VALUE) {
                            if (i10 != 0) {
                            }
                        }
                        i12 = max;
                    }
                    i10 = 0;
                    i12 = 0;
                }
                i10 = 1073741824;
            } else {
                if (i12 < 0) {
                    if (i12 != -1) {
                        if (i12 == -2) {
                            i10 = (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? LinearLayoutManager.INVALID_OFFSET : 0;
                        }
                        i10 = 0;
                        i12 = 0;
                    }
                    i12 = max;
                }
                i10 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i10);
        }

        public n generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void setMeasuredDimension(int i6, int i10) {
            this.mRecyclerView.setMeasuredDimension(i6, i10);
        }

        public void attachView(View view, int i6) {
            attachView(view, i6, (n) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onLayoutCompleted(y yVar) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public void onScrollStateChanged(int i6) {
        }

        public void scrollToPosition(int i6) {
        }

        public void collectInitialPrefetchPositions(int i6, c cVar) {
        }

        public void onAdapterChanged(e eVar, e eVar2) {
        }

        public void onItemsAdded(RecyclerView recyclerView, int i6, int i10) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i6, int i10) {
        }

        public void collectAdjacentPrefetchPositions(int i6, int i10, y yVar, c cVar) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i6, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public interface o {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class p {
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f2790a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f2791b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final Set<e<?>> f2792c = Collections.newSetFromMap(new IdentityHashMap());

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<c0> f2793a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f2794b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f2795c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f2796d = 0;
        }

        public final a a(int i6) {
            SparseArray<a> sparseArray = this.f2790a;
            a aVar = sparseArray.get(i6);
            if (aVar == null) {
                a aVar2 = new a();
                sparseArray.put(i6, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class t {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<c0> f2797a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<c0> f2798b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<c0> f2799c;

        /* renamed from: d  reason: collision with root package name */
        public final List<c0> f2800d;

        /* renamed from: e  reason: collision with root package name */
        public int f2801e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public s f2802g;

        public t() {
            ArrayList<c0> arrayList = new ArrayList<>();
            this.f2797a = arrayList;
            this.f2798b = null;
            this.f2799c = new ArrayList<>();
            this.f2800d = Collections.unmodifiableList(arrayList);
            this.f2801e = 2;
            this.f = 2;
        }

        public final void a(c0 c0Var, boolean z10) {
            t0.a aVar;
            RecyclerView.k(c0Var);
            RecyclerView recyclerView = RecyclerView.this;
            androidx.recyclerview.widget.z zVar = recyclerView.J0;
            View view = c0Var.f2751a;
            if (zVar != null) {
                z.a aVar2 = zVar.f3064e;
                if (aVar2 instanceof z.a) {
                    aVar = (t0.a) aVar2.f3066e.remove(view);
                } else {
                    aVar = null;
                }
                t0.d0.q(view, aVar);
            }
            if (z10) {
                u uVar = recyclerView.I;
                if (uVar != null) {
                    uVar.a();
                }
                ArrayList arrayList = recyclerView.J;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((u) arrayList.get(i6)).a();
                }
                e eVar = recyclerView.G;
                if (eVar != null) {
                    eVar.t(c0Var);
                }
                if (recyclerView.C0 != null) {
                    recyclerView.A.d(c0Var);
                }
            }
            c0Var.f2767s = null;
            c0Var.r = null;
            s c10 = c();
            c10.getClass();
            int i10 = c0Var.f;
            ArrayList<c0> arrayList2 = c10.a(i10).f2793a;
            if (c10.f2790a.get(i10).f2794b <= arrayList2.size()) {
                l0.e(view);
                return;
            }
            c0Var.r();
            arrayList2.add(c0Var);
        }

        public final int b(int i6) {
            RecyclerView recyclerView = RecyclerView.this;
            if (i6 >= 0 && i6 < recyclerView.C0.b()) {
                if (!recyclerView.C0.f2817g) {
                    return i6;
                }
                return recyclerView.f2738y.f(i6, 0);
            }
            StringBuilder u10 = defpackage.c.u("invalid position ", i6, ". State item count is ");
            u10.append(recyclerView.C0.b());
            u10.append(recyclerView.B());
            throw new IndexOutOfBoundsException(u10.toString());
        }

        public final s c() {
            if (this.f2802g == null) {
                this.f2802g = new s();
                d();
            }
            return this.f2802g;
        }

        public final void d() {
            if (this.f2802g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.G != null && recyclerView.isAttachedToWindow()) {
                    s sVar = this.f2802g;
                    sVar.f2792c.add(recyclerView.G);
                }
            }
        }

        public final void e(e<?> eVar, boolean z10) {
            s sVar = this.f2802g;
            if (sVar != null) {
                Set<e<?>> set = sVar.f2792c;
                set.remove(eVar);
                if (set.size() == 0 && !z10) {
                    int i6 = 0;
                    while (true) {
                        SparseArray<s.a> sparseArray = sVar.f2790a;
                        if (i6 < sparseArray.size()) {
                            ArrayList<c0> arrayList = sparseArray.get(sparseArray.keyAt(i6)).f2793a;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                l0.e(arrayList.get(i10).f2751a);
                            }
                            i6++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final void f() {
            ArrayList<c0> arrayList = this.f2799c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                g(size);
            }
            arrayList.clear();
            if (RecyclerView.Z0) {
                j.b bVar = RecyclerView.this.B0;
                int[] iArr = bVar.f2989c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f2990d = 0;
            }
        }

        public final void g(int i6) {
            ArrayList<c0> arrayList = this.f2799c;
            a(arrayList.get(i6), true);
            arrayList.remove(i6);
        }

        public final void h(View view) {
            c0 L = RecyclerView.L(view);
            boolean p10 = L.p();
            RecyclerView recyclerView = RecyclerView.this;
            if (p10) {
                recyclerView.removeDetachedView(view, false);
            }
            if (L.o()) {
                L.f2763n.l(L);
            } else if (L.u()) {
                L.f2759j &= -33;
            }
            i(L);
            if (recyclerView.f2720k0 != null && !L.m()) {
                recyclerView.f2720k0.h(L);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i(c0 c0Var) {
            boolean z10;
            e eVar;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean o10 = c0Var.o();
            boolean z17 = false;
            RecyclerView recyclerView = RecyclerView.this;
            View view = c0Var.f2751a;
            if (!o10 && view.getParent() == null) {
                if (!c0Var.p()) {
                    if (!c0Var.t()) {
                        if ((c0Var.f2759j & 16) == 0) {
                            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                            if (d0.d.i(view)) {
                                z10 = true;
                                eVar = recyclerView.G;
                                if (eVar == null && z10 && eVar.r(c0Var)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11 && !c0Var.m()) {
                                    z13 = false;
                                } else {
                                    if (this.f > 0) {
                                        if ((c0Var.f2759j & 526) != 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (!z14) {
                                            ArrayList<c0> arrayList = this.f2799c;
                                            int size = arrayList.size();
                                            if (size >= this.f && size > 0) {
                                                g(0);
                                                size--;
                                            }
                                            if (RecyclerView.Z0 && size > 0) {
                                                int i6 = c0Var.f2753c;
                                                j.b bVar = recyclerView.B0;
                                                if (bVar.f2989c != null) {
                                                    int i10 = bVar.f2990d * 2;
                                                    for (int i11 = 0; i11 < i10; i11 += 2) {
                                                        if (bVar.f2989c[i11] == i6) {
                                                            z15 = true;
                                                            break;
                                                        }
                                                    }
                                                }
                                                z15 = false;
                                                if (!z15) {
                                                    do {
                                                        size--;
                                                        if (size < 0) {
                                                            break;
                                                        }
                                                        int i12 = arrayList.get(size).f2753c;
                                                        if (bVar.f2989c != null) {
                                                            int i13 = bVar.f2990d * 2;
                                                            for (int i14 = 0; i14 < i13; i14 += 2) {
                                                                if (bVar.f2989c[i14] == i12) {
                                                                    z16 = true;
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z16 = false;
                                                        continue;
                                                    } while (z16);
                                                    size++;
                                                }
                                            }
                                            arrayList.add(size, c0Var);
                                            z12 = true;
                                            if (!z12) {
                                                a(c0Var, true);
                                                z17 = true;
                                            }
                                            z13 = z12;
                                        }
                                    }
                                    z12 = false;
                                    if (!z12) {
                                    }
                                    z13 = z12;
                                }
                                recyclerView.A.d(c0Var);
                                if (z13 && !z17 && z10) {
                                    l0.e(view);
                                    c0Var.f2767s = null;
                                    c0Var.r = null;
                                    return;
                                }
                                return;
                            }
                        }
                        z10 = false;
                        eVar = recyclerView.G;
                        if (eVar == null) {
                        }
                        z11 = false;
                        if (z11) {
                        }
                        if (this.f > 0) {
                        }
                        z12 = false;
                        if (!z12) {
                        }
                        z13 = z12;
                        recyclerView.A.d(c0Var);
                        if (z13) {
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException(defpackage.b.i(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
                }
                StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(c0Var);
                throw new IllegalArgumentException(defpackage.b.i(recyclerView, sb2));
            }
            StringBuilder sb3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb3.append(c0Var.o());
            sb3.append(" isAttached:");
            if (view.getParent() != null) {
                z17 = true;
            }
            sb3.append(z17);
            sb3.append(recyclerView.B());
            throw new IllegalArgumentException(sb3.toString());
        }

        public final void j(View view) {
            boolean z10;
            boolean z11;
            boolean z12;
            c0 L = RecyclerView.L(view);
            int i6 = L.f2759j;
            if ((i6 & 12) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!z10) {
                if ((i6 & 2) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    j jVar = recyclerView.f2720k0;
                    if (jVar != null && !jVar.f(L, L.i())) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        if (this.f2798b == null) {
                            this.f2798b = new ArrayList<>();
                        }
                        L.f2763n = this;
                        L.f2764o = true;
                        this.f2798b.add(L);
                        return;
                    }
                }
            }
            if (L.l() && !L.n() && !recyclerView.G.f2770v) {
                throw new IllegalArgumentException(defpackage.b.i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
            L.f2763n = this;
            L.f2764o = false;
            this.f2797a.add(L);
        }

        /* JADX WARN: Code restructure failed: missing block: B:234:0x03f6, code lost:
            if (r8.l() == false) goto L233;
         */
        /* JADX WARN: Code restructure failed: missing block: B:244:0x042a, code lost:
            if (r7 == false) goto L233;
         */
        /* JADX WARN: Removed duplicated region for block: B:174:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:300:0x0500  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x050a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final c0 k(int i6, long j10) {
            boolean z10;
            c0 c0Var;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            ViewGroup.LayoutParams layoutParams;
            n nVar;
            boolean z16;
            boolean z17;
            RecyclerView G;
            boolean z18;
            c0 c0Var2;
            View view;
            c0 c0Var3;
            boolean z19;
            int size;
            int f;
            RecyclerView recyclerView = RecyclerView.this;
            if (i6 >= 0 && i6 < recyclerView.C0.b()) {
                y yVar = recyclerView.C0;
                if (yVar.f2817g) {
                    ArrayList<c0> arrayList = this.f2798b;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                c0Var = this.f2798b.get(i10);
                                if (!c0Var.u() && c0Var.h() == i6) {
                                    c0Var.d(32);
                                    break;
                                }
                                i10++;
                            } else if (recyclerView.G.f2770v && (f = recyclerView.f2738y.f(i6, 0)) > 0 && f < recyclerView.G.f()) {
                                long g5 = recyclerView.G.g(f);
                                for (int i11 = 0; i11 < size; i11++) {
                                    c0 c0Var4 = this.f2798b.get(i11);
                                    if (!c0Var4.u() && c0Var4.f2755e == g5) {
                                        c0Var4.d(32);
                                        c0Var = c0Var4;
                                        break;
                                    }
                                }
                            }
                        }
                        if (c0Var == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    c0Var = null;
                    if (c0Var == null) {
                    }
                } else {
                    z10 = false;
                    c0Var = null;
                }
                ArrayList<c0> arrayList2 = this.f2799c;
                ArrayList<c0> arrayList3 = this.f2797a;
                if (c0Var == null) {
                    int size2 = arrayList3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        c0 c0Var5 = arrayList3.get(i12);
                        if (!c0Var5.u() && c0Var5.h() == i6 && !c0Var5.l() && (yVar.f2817g || !c0Var5.n())) {
                            c0Var5.d(32);
                            c0Var = c0Var5;
                            break;
                        }
                    }
                    androidx.recyclerview.widget.b bVar = recyclerView.f2740z;
                    ArrayList arrayList4 = bVar.f2881c;
                    int size3 = arrayList4.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size3) {
                            view = (View) arrayList4.get(i13);
                            ((androidx.recyclerview.widget.x) bVar.f2879a).getClass();
                            c0 L = RecyclerView.L(view);
                            if (L.h() == i6 && !L.l() && !L.n()) {
                                break;
                            }
                            i13++;
                        } else {
                            view = null;
                            break;
                        }
                    }
                    if (view != null) {
                        c0Var3 = RecyclerView.L(view);
                        androidx.recyclerview.widget.b bVar2 = recyclerView.f2740z;
                        int indexOfChild = ((androidx.recyclerview.widget.x) bVar2.f2879a).f3061a.indexOfChild(view);
                        if (indexOfChild >= 0) {
                            b.a aVar = bVar2.f2880b;
                            if (aVar.d(indexOfChild)) {
                                aVar.a(indexOfChild);
                                bVar2.m(view);
                                int j11 = recyclerView.f2740z.j(view);
                                if (j11 != -1) {
                                    recyclerView.f2740z.c(j11);
                                    j(view);
                                    c0Var3.d(8224);
                                } else {
                                    StringBuilder sb2 = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                    sb2.append(c0Var3);
                                    throw new IllegalStateException(defpackage.b.i(recyclerView, sb2));
                                }
                            } else {
                                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                            }
                        } else {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                    } else {
                        int size4 = arrayList2.size();
                        for (int i14 = 0; i14 < size4; i14++) {
                            c0 c0Var6 = arrayList2.get(i14);
                            if (!c0Var6.l() && c0Var6.h() == i6 && !c0Var6.j()) {
                                arrayList2.remove(i14);
                                c0Var = c0Var6;
                                break;
                            }
                        }
                        c0Var3 = null;
                    }
                    c0Var = c0Var3;
                    if (c0Var != null) {
                        if (c0Var.n()) {
                            z19 = yVar.f2817g;
                        } else {
                            int i15 = c0Var.f2753c;
                            if (i15 >= 0 && i15 < recyclerView.G.f()) {
                                if (yVar.f2817g || recyclerView.G.h(c0Var.f2753c) == c0Var.f) {
                                    e eVar = recyclerView.G;
                                    if (!eVar.f2770v || c0Var.f2755e == eVar.g(c0Var.f2753c)) {
                                        z19 = true;
                                    }
                                }
                                z19 = false;
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                sb3.append(c0Var);
                                throw new IndexOutOfBoundsException(defpackage.b.i(recyclerView, sb3));
                            }
                        }
                        if (!z19) {
                            c0Var.d(4);
                            if (c0Var.o()) {
                                recyclerView.removeDetachedView(c0Var.f2751a, false);
                                c0Var.f2763n.l(c0Var);
                            } else if (c0Var.u()) {
                                c0Var.f2759j &= -33;
                            }
                            i(c0Var);
                            c0Var = null;
                        } else {
                            z10 = true;
                        }
                    }
                }
                if (c0Var == null) {
                    int f2 = recyclerView.f2738y.f(i6, 0);
                    if (f2 >= 0 && f2 < recyclerView.G.f()) {
                        int h10 = recyclerView.G.h(f2);
                        e eVar2 = recyclerView.G;
                        if (eVar2.f2770v) {
                            long g10 = eVar2.g(f2);
                            int size5 = arrayList3.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    c0 c0Var7 = arrayList3.get(size5);
                                    if (c0Var7.f2755e == g10 && !c0Var7.u()) {
                                        if (h10 == c0Var7.f) {
                                            c0Var7.d(32);
                                            if (c0Var7.n() && !yVar.f2817g) {
                                                c0Var7.f2759j = (c0Var7.f2759j & (-15)) | 2;
                                            }
                                            c0Var = c0Var7;
                                        } else {
                                            arrayList3.remove(size5);
                                            View view2 = c0Var7.f2751a;
                                            recyclerView.removeDetachedView(view2, false);
                                            c0 L2 = RecyclerView.L(view2);
                                            L2.f2763n = null;
                                            L2.f2764o = false;
                                            L2.f2759j &= -33;
                                            i(L2);
                                        }
                                    }
                                    size5--;
                                } else {
                                    int size6 = arrayList2.size();
                                    while (true) {
                                        size6--;
                                        if (size6 < 0) {
                                            break;
                                        }
                                        c0 c0Var8 = arrayList2.get(size6);
                                        if (c0Var8.f2755e == g10 && !c0Var8.j()) {
                                            if (h10 == c0Var8.f) {
                                                arrayList2.remove(size6);
                                                c0Var = c0Var8;
                                            } else {
                                                g(size6);
                                            }
                                        }
                                    }
                                    c0Var = null;
                                }
                            }
                            if (c0Var != null) {
                                c0Var.f2753c = f2;
                                z10 = true;
                            }
                        }
                        if (c0Var == null) {
                            s.a aVar2 = c().f2790a.get(h10);
                            if (aVar2 != null) {
                                ArrayList<c0> arrayList5 = aVar2.f2793a;
                                if (!arrayList5.isEmpty()) {
                                    int size7 = arrayList5.size();
                                    do {
                                        size7--;
                                        if (size7 >= 0) {
                                        }
                                    } while (arrayList5.get(size7).j());
                                    c0Var2 = arrayList5.remove(size7);
                                    if (c0Var2 != null) {
                                        c0Var2.r();
                                        int[] iArr = RecyclerView.V0;
                                    }
                                    c0Var = c0Var2;
                                }
                            }
                            c0Var2 = null;
                            if (c0Var2 != null) {
                            }
                            c0Var = c0Var2;
                        }
                        if (c0Var == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j10 != Long.MAX_VALUE) {
                                long j12 = this.f2802g.a(h10).f2795c;
                                if (j12 != 0 && j12 + nanoTime >= j10) {
                                    z18 = false;
                                } else {
                                    z18 = true;
                                }
                                if (!z18) {
                                    return null;
                                }
                            }
                            e eVar3 = recyclerView.G;
                            eVar3.getClass();
                            try {
                                int i16 = o0.k.f26897a;
                                k.a.a("RV CreateView");
                                c0 p10 = eVar3.p(h10, recyclerView);
                                if (p10.f2751a.getParent() == null) {
                                    p10.f = h10;
                                    k.a.b();
                                    if (RecyclerView.Z0 && (G = RecyclerView.G(p10.f2751a)) != null) {
                                        p10.f2752b = new WeakReference<>(G);
                                    }
                                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                    s.a a10 = this.f2802g.a(h10);
                                    long j13 = a10.f2795c;
                                    if (j13 != 0) {
                                        nanoTime2 = (nanoTime2 / 4) + ((j13 / 4) * 3);
                                    }
                                    a10.f2795c = nanoTime2;
                                    c0Var = p10;
                                } else {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                            } finally {
                                int i17 = o0.k.f26897a;
                                k.a.b();
                            }
                        }
                    } else {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i6 + "(offset:" + f2 + ").state:" + yVar.b() + recyclerView.B());
                    }
                }
                if (z10 && !yVar.f2817g) {
                    int i18 = c0Var.f2759j;
                    if ((i18 & 8192) != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        c0Var.f2759j = (i18 & (-8193)) | 0;
                        if (yVar.f2820j) {
                            j.e(c0Var);
                            j jVar = recyclerView.f2720k0;
                            c0Var.i();
                            jVar.getClass();
                            j.c cVar = new j.c();
                            cVar.a(c0Var);
                            recyclerView.X(c0Var, cVar);
                        }
                    }
                }
                if (yVar.f2817g && c0Var.k()) {
                    c0Var.f2756g = i6;
                } else {
                    if (c0Var.k()) {
                        if ((c0Var.f2759j & 2) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (!z15) {
                        }
                    }
                    int f10 = recyclerView.f2738y.f(i6, 0);
                    t0.a aVar3 = null;
                    c0Var.f2767s = null;
                    c0Var.r = recyclerView;
                    int i19 = c0Var.f;
                    long nanoTime3 = recyclerView.getNanoTime();
                    if (j10 != Long.MAX_VALUE) {
                        long j14 = this.f2802g.a(i19).f2796d;
                        if (j14 != 0 && j14 + nanoTime3 >= j10) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                    }
                    e<? extends c0> eVar4 = recyclerView.G;
                    eVar4.getClass();
                    if (c0Var.f2767s == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        c0Var.f2753c = f10;
                        if (eVar4.f2770v) {
                            c0Var.f2755e = eVar4.g(f10);
                        }
                        c0Var.f2759j = (c0Var.f2759j & (-520)) | 1;
                        int i20 = o0.k.f26897a;
                        k.a.a("RV OnBindView");
                    }
                    c0Var.f2767s = eVar4;
                    eVar4.o(c0Var, f10, c0Var.i());
                    View view3 = c0Var.f2751a;
                    if (z11) {
                        ArrayList arrayList6 = c0Var.f2760k;
                        if (arrayList6 != null) {
                            arrayList6.clear();
                        }
                        c0Var.f2759j &= -1025;
                        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                        if (layoutParams2 instanceof n) {
                            ((n) layoutParams2).f2788c = true;
                        }
                    }
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    s.a a11 = this.f2802g.a(c0Var.f);
                    long j15 = a11.f2796d;
                    if (j15 != 0) {
                        nanoTime4 = (nanoTime4 / 4) + ((j15 / 4) * 3);
                    }
                    a11.f2796d = nanoTime4;
                    AccessibilityManager accessibilityManager = recyclerView.W;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                        if (d0.d.c(view3) == 0) {
                            d0.d.s(view3, 1);
                        }
                        androidx.recyclerview.widget.z zVar = recyclerView.J0;
                        if (zVar != null) {
                            z.a aVar4 = zVar.f3064e;
                            if (aVar4 instanceof z.a) {
                                aVar4.getClass();
                                View.AccessibilityDelegate d10 = t0.d0.d(view3);
                                if (d10 != null) {
                                    if (d10 instanceof a.C0543a) {
                                        aVar3 = ((a.C0543a) d10).f32271a;
                                    } else {
                                        aVar3 = new t0.a(d10);
                                    }
                                }
                                if (aVar3 != null && aVar3 != aVar4) {
                                    aVar4.f3066e.put(view3, aVar3);
                                }
                            }
                            t0.d0.q(view3, aVar4);
                        }
                    }
                    if (yVar.f2817g) {
                        c0Var.f2756g = i6;
                    }
                    z13 = true;
                    layoutParams = c0Var.f2751a.getLayoutParams();
                    View view4 = c0Var.f2751a;
                    if (layoutParams != null) {
                        nVar = (n) recyclerView.generateDefaultLayoutParams();
                        view4.setLayoutParams(nVar);
                    } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                        nVar = (n) recyclerView.generateLayoutParams(layoutParams);
                        view4.setLayoutParams(nVar);
                    } else {
                        nVar = (n) layoutParams;
                    }
                    nVar.f2786a = c0Var;
                    if (!z10 && z13) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    nVar.f2789d = z16;
                    return c0Var;
                }
                z13 = false;
                layoutParams = c0Var.f2751a.getLayoutParams();
                View view42 = c0Var.f2751a;
                if (layoutParams != null) {
                }
                nVar.f2786a = c0Var;
                if (!z10) {
                }
                z16 = false;
                nVar.f2789d = z16;
                return c0Var;
            }
            throw new IndexOutOfBoundsException("Invalid item position " + i6 + "(" + i6 + "). Item count:" + recyclerView.C0.b() + recyclerView.B());
        }

        public final void l(c0 c0Var) {
            if (c0Var.f2764o) {
                this.f2798b.remove(c0Var);
            } else {
                this.f2797a.remove(c0Var);
            }
            c0Var.f2763n = null;
            c0Var.f2764o = false;
            c0Var.f2759j &= -33;
        }

        public final void m() {
            int i6;
            m mVar = RecyclerView.this.H;
            if (mVar != null) {
                i6 = mVar.mPrefetchMaxCountObserved;
            } else {
                i6 = 0;
            }
            this.f = this.f2801e + i6;
            ArrayList<c0> arrayList = this.f2799c;
            for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
                g(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        void a();
    }

    /* loaded from: classes.dex */
    public class v extends g {
        public v() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            recyclerView.C0.f = true;
            recyclerView.W(true);
            if (!recyclerView.f2738y.g()) {
                recyclerView.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i6, int i10, Bundle bundle) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f2738y;
            boolean z10 = true;
            boolean z11 = false;
            if (i10 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f2871b;
                arrayList.add(aVar.h(bundle, 4, i6, i10));
                aVar.f |= 4;
                if (arrayList.size() != 1) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i6, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f2738y;
            boolean z10 = true;
            boolean z11 = false;
            if (i10 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f2871b;
                arrayList.add(aVar.h(null, 1, i6, i10));
                aVar.f |= 1;
                if (arrayList.size() != 1) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                g();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r2.size() == 1) goto L5;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void e(int i6, int i10) {
            boolean z10;
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f2738y;
            aVar.getClass();
            if (i6 != i10) {
                ArrayList<a.b> arrayList = aVar.f2871b;
                arrayList.add(aVar.h(null, 8, i6, i10));
                aVar.f |= 8;
                z10 = true;
            }
            z10 = false;
            if (z10) {
                g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i6, int i10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j(null);
            androidx.recyclerview.widget.a aVar = recyclerView.f2738y;
            boolean z10 = true;
            boolean z11 = false;
            if (i10 < 1) {
                aVar.getClass();
            } else {
                ArrayList<a.b> arrayList = aVar.f2871b;
                arrayList.add(aVar.h(null, 2, i6, i10));
                aVar.f |= 2;
                if (arrayList.size() != 1) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (z11) {
                g();
            }
        }

        public final void g() {
            boolean z10 = RecyclerView.Y0;
            RecyclerView recyclerView = RecyclerView.this;
            if (z10 && recyclerView.O && recyclerView.N) {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                d0.d.m(recyclerView, recyclerView.C);
                return;
            }
            recyclerView.V = true;
            recyclerView.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class x {
        private m mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final a mRecyclingAction = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d  reason: collision with root package name */
            public int f2809d = -1;
            public boolean f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f2811g = 0;

            /* renamed from: a  reason: collision with root package name */
            public int f2806a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f2807b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f2808c = LinearLayoutManager.INVALID_OFFSET;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f2810e = null;

            public final void a(RecyclerView recyclerView) {
                int i6 = this.f2809d;
                if (i6 >= 0) {
                    this.f2809d = -1;
                    recyclerView.O(i6);
                    this.f = false;
                } else if (this.f) {
                    Interpolator interpolator = this.f2810e;
                    if (interpolator != null && this.f2808c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i10 = this.f2808c;
                    if (i10 >= 1) {
                        recyclerView.f2741z0.c(this.f2806a, this.f2807b, i10, interpolator);
                        int i11 = this.f2811g + 1;
                        this.f2811g = i11;
                        if (i11 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f2811g = 0;
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF computeScrollVectorForPosition(int i6);
        }

        public PointF computeScrollVectorForPosition(int i6) {
            m layoutManager = getLayoutManager();
            if (layoutManager instanceof b) {
                return ((b) layoutManager).computeScrollVectorForPosition(i6);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i6) {
            return this.mRecyclerView.H.findViewByPosition(i6);
        }

        public int getChildCount() {
            return this.mRecyclerView.H.getChildCount();
        }

        public int getChildPosition(View view) {
            this.mRecyclerView.getClass();
            c0 L = RecyclerView.L(view);
            if (L != null) {
                return L.h();
            }
            return -1;
        }

        public m getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i6) {
            this.mRecyclerView.h0(i6);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void onAnimation(int i6, int i10) {
            PointF computeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (computeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = computeScrollVectorForPosition.x;
                if (f != 0.0f || computeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.g0((int) Math.signum(f), (int) Math.signum(computeScrollVectorForPosition.y), null);
                }
            }
            boolean z10 = false;
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.C0, this.mRecyclingAction);
                    this.mRecyclingAction.a(recyclerView);
                    stop();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i6, i10, recyclerView.C0, this.mRecyclingAction);
                a aVar = this.mRecyclingAction;
                if (aVar.f2809d >= 0) {
                    z10 = true;
                }
                aVar.a(recyclerView);
                if (z10 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.f2741z0.b();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(int i6, int i10, y yVar, a aVar);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(View view, y yVar, a aVar);

        public void setTargetPosition(int i6) {
            this.mTargetPosition = i6;
        }

        public void start(RecyclerView recyclerView, m mVar) {
            b0 b0Var = recyclerView.f2741z0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f2746w.abortAnimation();
            if (this.mStarted) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = mVar;
            int i6 = this.mTargetPosition;
            if (i6 != -1) {
                recyclerView.C0.f2812a = i6;
                this.mRunning = true;
                this.mPendingInitialRun = true;
                this.mTargetView = findViewByPosition(getTargetPosition());
                onStart();
                this.mRecyclerView.f2741z0.b();
                this.mStarted = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void stop() {
            if (!this.mRunning) {
                return;
            }
            this.mRunning = false;
            onStop();
            this.mRecyclerView.C0.f2812a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    /* loaded from: classes.dex */
    public static class y {

        /* renamed from: a  reason: collision with root package name */
        public int f2812a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f2813b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2814c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2815d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f2816e = 0;
        public boolean f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2817g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2818h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2819i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2820j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2821k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f2822l;

        /* renamed from: m  reason: collision with root package name */
        public long f2823m;

        /* renamed from: n  reason: collision with root package name */
        public int f2824n;

        public final void a(int i6) {
            if ((this.f2815d & i6) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f2815d));
        }

        public final int b() {
            if (this.f2817g) {
                return this.f2813b - this.f2814c;
            }
            return this.f2816e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
            sb2.append(this.f2812a);
            sb2.append(", mData=null, mItemCount=");
            sb2.append(this.f2816e);
            sb2.append(", mIsMeasuring=");
            sb2.append(this.f2819i);
            sb2.append(", mPreviousLayoutItemCount=");
            sb2.append(this.f2813b);
            sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb2.append(this.f2814c);
            sb2.append(", mStructureChanged=");
            sb2.append(this.f);
            sb2.append(", mInPreLayout=");
            sb2.append(this.f2817g);
            sb2.append(", mRunSimpleAnimations=");
            sb2.append(this.f2820j);
            sb2.append(", mRunPredictiveAnimations=");
            return defpackage.c.t(sb2, this.f2821k, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class z extends i {
    }

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        X0 = z10;
        Y0 = true;
        Z0 = true;
        Class<?> cls = Integer.TYPE;
        f2710a1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        b1 = new c();
        f2711c1 = new z();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            RecyclerView G = G(viewGroup.getChildAt(i6));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static c0 L(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f2786a;
    }

    private t0.p getScrollingChildHelper() {
        if (this.L0 == null) {
            this.L0 = new t0.p(this);
        }
        return this.L0;
    }

    public static void k(c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.f2752b;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == c0Var.f2751a) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            c0Var.f2752b = null;
        }
    }

    public static int n(int i6, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i6 > 0 && edgeEffect != null && androidx.core.widget.d.a(edgeEffect) != 0.0f) {
            int round = Math.round(androidx.core.widget.d.b(edgeEffect, ((-i6) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (round != i6) {
                edgeEffect.finish();
            }
            return i6 - round;
        } else if (i6 < 0 && edgeEffect2 != null && androidx.core.widget.d.a(edgeEffect2) != 0.0f) {
            float f2 = i10;
            int round2 = Math.round(androidx.core.widget.d.b(edgeEffect2, (i6 * 4.0f) / f2, 0.5f) * (f2 / 4.0f));
            if (round2 != i6) {
                edgeEffect2.finish();
            }
            return i6 - round2;
        } else {
            return i6;
        }
    }

    public final void A() {
        if (this.f2717h0 != null) {
            return;
        }
        ((z) this.f2715f0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2717h0 = edgeEffect;
        if (this.B) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.G + ", layout:" + this.H + ", context:" + getContext();
    }

    public final void C(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2741z0.f2746w;
            overScroller.getFinalX();
            overScroller.getCurrX();
            yVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        yVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        return null;
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList<q> arrayList = this.L;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            q qVar = arrayList.get(i6);
            if (qVar.c(this, motionEvent) && action != 3) {
                this.M = qVar;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e10 = this.f2740z.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        int i10 = LinearLayoutManager.INVALID_OFFSET;
        for (int i11 = 0; i11 < e10; i11++) {
            c0 L = L(this.f2740z.d(i11));
            if (!L.t()) {
                int h10 = L.h();
                if (h10 < i6) {
                    i6 = h10;
                }
                if (h10 > i10) {
                    i10 = h10;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i10;
    }

    public final c0 H(int i6) {
        c0 c0Var = null;
        if (this.f2713b0) {
            return null;
        }
        int h10 = this.f2740z.h();
        for (int i10 = 0; i10 < h10; i10++) {
            c0 L = L(this.f2740z.g(i10));
            if (L != null && !L.n() && I(L) == i6) {
                if (this.f2740z.k(L.f2751a)) {
                    c0Var = L;
                } else {
                    return L;
                }
            }
        }
        return c0Var;
    }

    public final int I(c0 c0Var) {
        boolean z10;
        if ((c0Var.f2759j & 524) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && c0Var.k()) {
            androidx.recyclerview.widget.a aVar = this.f2738y;
            int i6 = c0Var.f2753c;
            ArrayList<a.b> arrayList = aVar.f2871b;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a.b bVar = arrayList.get(i10);
                int i11 = bVar.f2875a;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 8) {
                            int i12 = bVar.f2876b;
                            if (i12 == i6) {
                                i6 = bVar.f2878d;
                            } else {
                                if (i12 < i6) {
                                    i6--;
                                }
                                if (bVar.f2878d <= i6) {
                                    i6++;
                                }
                            }
                        }
                    } else {
                        int i13 = bVar.f2876b;
                        if (i13 <= i6) {
                            int i14 = bVar.f2878d;
                            if (i13 + i14 <= i6) {
                                i6 -= i14;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (bVar.f2876b <= i6) {
                    i6 += bVar.f2878d;
                }
            }
            return i6;
        }
        return -1;
    }

    public final long J(c0 c0Var) {
        if (this.G.f2770v) {
            return c0Var.f2755e;
        }
        return c0Var.f2753c;
    }

    public final c0 K(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return L(view);
    }

    public final Rect M(View view) {
        n nVar = (n) view.getLayoutParams();
        boolean z10 = nVar.f2788c;
        Rect rect = nVar.f2787b;
        if (!z10) {
            return rect;
        }
        y yVar = this.C0;
        if (yVar.f2817g && (nVar.b() || nVar.f2786a.l())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList<l> arrayList = this.K;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            Rect rect2 = this.D;
            rect2.set(0, 0, 0, 0);
            arrayList.get(i6).f(rect2, view, this, yVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f2788c = false;
        return rect;
    }

    public final boolean N() {
        if (this.f2714d0 > 0) {
            return true;
        }
        return false;
    }

    public final void O(int i6) {
        if (this.H == null) {
            return;
        }
        setScrollState(2);
        this.H.scrollToPosition(i6);
        awakenScrollBars();
    }

    public final void P() {
        int h10 = this.f2740z.h();
        for (int i6 = 0; i6 < h10; i6++) {
            ((n) this.f2740z.g(i6).getLayoutParams()).f2788c = true;
        }
        ArrayList<c0> arrayList = this.f2734w.f2799c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10).f2751a.getLayoutParams();
            if (nVar != null) {
                nVar.f2788c = true;
            }
        }
    }

    public final void Q(int i6, int i10, boolean z10) {
        int i11 = i6 + i10;
        int h10 = this.f2740z.h();
        for (int i12 = 0; i12 < h10; i12++) {
            c0 L = L(this.f2740z.g(i12));
            if (L != null && !L.t()) {
                int i13 = L.f2753c;
                y yVar = this.C0;
                if (i13 >= i11) {
                    L.q(-i10, z10);
                    yVar.f = true;
                } else if (i13 >= i6) {
                    L.d(8);
                    L.q(-i10, z10);
                    L.f2753c = i6 - 1;
                    yVar.f = true;
                }
            }
        }
        t tVar = this.f2734w;
        ArrayList<c0> arrayList = tVar.f2799c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                c0 c0Var = arrayList.get(size);
                if (c0Var != null) {
                    int i14 = c0Var.f2753c;
                    if (i14 >= i11) {
                        c0Var.q(-i10, z10);
                    } else if (i14 >= i6) {
                        c0Var.d(8);
                        tVar.g(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void R() {
        this.f2714d0++;
    }

    public final void S(boolean z10) {
        int i6;
        boolean z11 = true;
        int i10 = this.f2714d0 - 1;
        this.f2714d0 = i10;
        if (i10 < 1) {
            this.f2714d0 = 0;
            if (z10) {
                int i11 = this.U;
                this.U = 0;
                if (i11 != 0) {
                    AccessibilityManager accessibilityManager = this.W;
                    if ((accessibilityManager == null || !accessibilityManager.isEnabled()) ? false : false) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID);
                        u0.b.b(obtain, i11);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.P0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c0 c0Var = (c0) arrayList.get(size);
                    if (c0Var.f2751a.getParent() == this && !c0Var.t() && (i6 = c0Var.f2766q) != -1) {
                        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                        d0.d.s(c0Var.f2751a, i6);
                        c0Var.f2766q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void T(MotionEvent motionEvent) {
        int i6;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2722m0) {
            if (actionIndex == 0) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            this.f2722m0 = motionEvent.getPointerId(i6);
            int x10 = (int) (motionEvent.getX(i6) + 0.5f);
            this.f2726q0 = x10;
            this.f2724o0 = x10;
            int y10 = (int) (motionEvent.getY(i6) + 0.5f);
            this.f2727r0 = y10;
            this.f2725p0 = y10;
        }
    }

    public final void U() {
        if (!this.I0 && this.N) {
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            d0.d.m(this, this.Q0);
            this.I0 = true;
        }
    }

    public final void V() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (this.f2713b0) {
            androidx.recyclerview.widget.a aVar = this.f2738y;
            aVar.l(aVar.f2871b);
            aVar.l(aVar.f2872c);
            aVar.f = 0;
            if (this.c0) {
                this.H.onItemsChanged(this);
            }
        }
        if (this.f2720k0 != null && this.H.supportsPredictiveItemAnimations()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2738y.j();
        } else {
            this.f2738y.c();
        }
        if (!this.F0 && !this.G0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.P && this.f2720k0 != null && (((z14 = this.f2713b0) || z11 || this.H.mRequestedSimpleAnimations) && (!z14 || this.G.f2770v))) {
            z12 = true;
        } else {
            z12 = false;
        }
        y yVar = this.C0;
        yVar.f2820j = z12;
        if (z12 && z11 && !this.f2713b0) {
            if (this.f2720k0 != null && this.H.supportsPredictiveItemAnimations()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                z15 = true;
            }
        }
        yVar.f2821k = z15;
    }

    public final void W(boolean z10) {
        this.c0 = z10 | this.c0;
        this.f2713b0 = true;
        int h10 = this.f2740z.h();
        for (int i6 = 0; i6 < h10; i6++) {
            c0 L = L(this.f2740z.g(i6));
            if (L != null && !L.t()) {
                L.d(6);
            }
        }
        P();
        t tVar = this.f2734w;
        ArrayList<c0> arrayList = tVar.f2799c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = arrayList.get(i10);
            if (c0Var != null) {
                c0Var.d(6);
                c0Var.c(null);
            }
        }
        e eVar = RecyclerView.this.G;
        if (eVar == null || !eVar.f2770v) {
            tVar.f();
        }
    }

    public final void X(c0 c0Var, j.c cVar) {
        boolean z10 = false;
        int i6 = (c0Var.f2759j & (-8193)) | 0;
        c0Var.f2759j = i6;
        boolean z11 = this.C0.f2818h;
        f0 f0Var = this.A;
        if (z11) {
            if ((i6 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !c0Var.n() && !c0Var.t()) {
                f0Var.f2939b.h(J(c0Var), c0Var);
            }
        }
        t.h<c0, f0.a> hVar = f0Var.f2938a;
        f0.a orDefault = hVar.getOrDefault(c0Var, null);
        if (orDefault == null) {
            orDefault = f0.a.a();
            hVar.put(c0Var, orDefault);
        }
        orDefault.f2942b = cVar;
        orDefault.f2941a |= 4;
    }

    public final int Y(float f2, int i6) {
        float height = f2 / getHeight();
        float width = i6 / getWidth();
        EdgeEffect edgeEffect = this.f2716g0;
        float f10 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.d.a(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.f2716g0.onRelease();
            } else {
                float f11 = -androidx.core.widget.d.b(this.f2716g0, -width, 1.0f - height);
                if (androidx.core.widget.d.a(this.f2716g0) == 0.0f) {
                    this.f2716g0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f2718i0;
            if (edgeEffect2 != null && androidx.core.widget.d.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f2718i0.onRelease();
                } else {
                    float b10 = androidx.core.widget.d.b(this.f2718i0, width, height);
                    if (androidx.core.widget.d.a(this.f2718i0) == 0.0f) {
                        this.f2718i0.onRelease();
                    }
                    f10 = b10;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getWidth());
    }

    public final int Z(int i6, float f2) {
        float width = f2 / getWidth();
        float height = i6 / getHeight();
        EdgeEffect edgeEffect = this.f2717h0;
        float f10 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.d.a(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.f2717h0.onRelease();
            } else {
                float f11 = -androidx.core.widget.d.b(this.f2717h0, -height, width);
                if (androidx.core.widget.d.a(this.f2717h0) == 0.0f) {
                    this.f2717h0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f2719j0;
            if (edgeEffect2 != null && androidx.core.widget.d.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f2719j0.onRelease();
                } else {
                    float b10 = androidx.core.widget.d.b(this.f2719j0, height, 1.0f - width);
                    if (androidx.core.widget.d.a(this.f2719j0) == 0.0f) {
                        this.f2719j0.onRelease();
                    }
                    f10 = b10;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getHeight());
    }

    public final void a0(l lVar) {
        boolean z10;
        m mVar = this.H;
        if (mVar != null) {
            mVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.K;
        arrayList.remove(lVar);
        if (arrayList.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        P();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i6, int i10) {
        m mVar = this.H;
        if (mVar == null || !mVar.onAddFocusables(this, arrayList, i6, i10)) {
            super.addFocusables(arrayList, i6, i10);
        }
    }

    public final void b0(q qVar) {
        this.L.remove(qVar);
        if (this.M == qVar) {
            this.M = null;
        }
    }

    public final void c0(r rVar) {
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            arrayList.remove(rVar);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof n) && this.H.checkLayoutParams((n) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.H;
        if (mVar == null || !mVar.canScrollHorizontally()) {
            return 0;
        }
        return this.H.computeHorizontalScrollExtent(this.C0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.H;
        if (mVar == null || !mVar.canScrollHorizontally()) {
            return 0;
        }
        return this.H.computeHorizontalScrollOffset(this.C0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.H;
        if (mVar == null || !mVar.canScrollHorizontally()) {
            return 0;
        }
        return this.H.computeHorizontalScrollRange(this.C0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.H;
        if (mVar == null || !mVar.canScrollVertically()) {
            return 0;
        }
        return this.H.computeVerticalScrollExtent(this.C0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.H;
        if (mVar == null || !mVar.canScrollVertically()) {
            return 0;
        }
        return this.H.computeVerticalScrollOffset(this.C0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.H;
        if (mVar == null || !mVar.canScrollVertically()) {
            return 0;
        }
        return this.H.computeVerticalScrollRange(this.C0);
    }

    public final void d0(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.D;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f2788c) {
                int i6 = rect.left;
                Rect rect2 = nVar.f2787b;
                rect.left = i6 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        m mVar = this.H;
        Rect rect3 = this.D;
        boolean z11 = !this.P;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mVar.requestChildRectangleOnScreen(this, view, rect3, z11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f10, boolean z10) {
        return getScrollingChildHelper().a(f2, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f10) {
        return getScrollingChildHelper().b(f2, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i6, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i6, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i6, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        int i10;
        super.draw(canvas);
        ArrayList<l> arrayList = this.K;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.get(i11).h(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2716g0;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.B) {
                i10 = getPaddingBottom();
            } else {
                i10 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i10, 0.0f);
            EdgeEffect edgeEffect2 = this.f2716g0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.f2717h0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.B) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2717h0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2718i0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.B) {
                i6 = getPaddingTop();
            } else {
                i6 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i6, -width);
            EdgeEffect edgeEffect6 = this.f2718i0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2719j0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.B) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2719j0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f2720k0 == null || arrayList.size() <= 0 || !this.f2720k0.j()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            d0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e0() {
        VelocityTracker velocityTracker = this.f2723n0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        o0(0);
        EdgeEffect edgeEffect = this.f2716g0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f2716g0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2717h0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f2717h0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2718i0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f2718i0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2719j0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f2719j0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            d0.d.k(this);
        }
    }

    public final void f(c0 c0Var) {
        boolean z10;
        View view = c0Var.f2751a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2734w.l(K(view));
        if (c0Var.p()) {
            this.f2740z.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f2740z.a(view, -1, true);
        } else {
            androidx.recyclerview.widget.b bVar = this.f2740z;
            int indexOfChild = ((androidx.recyclerview.widget.x) bVar.f2879a).f3061a.indexOfChild(view);
            if (indexOfChild >= 0) {
                bVar.f2880b.h(indexOfChild);
                bVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(int i6, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        boolean z11;
        o();
        e eVar = this.G;
        int[] iArr = this.O0;
        if (eVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            g0(i6, i10, iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            i13 = i16;
            i12 = i17;
            i14 = i6 - i16;
            i15 = i10 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.K.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.O0;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int i18 = i12;
        v(i13, i12, i14, i15, this.M0, i11, iArr2);
        int i19 = iArr[0];
        int i20 = i14 - i19;
        int i21 = iArr[1];
        int i22 = i15 - i21;
        if (i19 == 0 && i21 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i23 = this.f2726q0;
        int[] iArr3 = this.M0;
        int i24 = iArr3[0];
        this.f2726q0 = i23 - i24;
        int i25 = this.f2727r0;
        int i26 = iArr3[1];
        this.f2727r0 = i25 - i26;
        int[] iArr4 = this.N0;
        iArr4[0] = iArr4[0] + i24;
        iArr4[1] = iArr4[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !hc.d.S(motionEvent, 8194)) {
                float x10 = motionEvent.getX();
                float f2 = i20;
                float y10 = motionEvent.getY();
                float f10 = i22;
                if (f2 < 0.0f) {
                    y();
                    androidx.core.widget.d.b(this.f2716g0, (-f2) / getWidth(), 1.0f - (y10 / getHeight()));
                } else if (f2 > 0.0f) {
                    z();
                    androidx.core.widget.d.b(this.f2718i0, f2 / getWidth(), y10 / getHeight());
                } else {
                    z11 = false;
                    if (f10 >= 0.0f) {
                        A();
                        androidx.core.widget.d.b(this.f2717h0, (-f10) / getHeight(), x10 / getWidth());
                    } else {
                        if (f10 > 0.0f) {
                            x();
                            androidx.core.widget.d.b(this.f2719j0, f10 / getHeight(), 1.0f - (x10 / getWidth()));
                        }
                        if (!z11 || f2 != 0.0f || f10 != 0.0f) {
                            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                            d0.d.k(this);
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    WeakHashMap<View, o0> weakHashMap2 = t0.d0.f32288a;
                    d0.d.k(this);
                }
                z11 = true;
                if (f10 >= 0.0f) {
                }
                z11 = true;
                if (!z11) {
                }
                WeakHashMap<View, o0> weakHashMap22 = t0.d0.f32288a;
                d0.d.k(this);
            }
            m(i6, i10);
        }
        if (i13 != 0 || i18 != 0) {
            w(i13, i18);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z10 || i13 != 0 || i18 != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x015f, code lost:
        if (r4 > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0176, code lost:
        if (r3 > 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0179, code lost:
        if (r4 < 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017c, code lost:
        if (r3 < 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0185, code lost:
        if ((r3 * r1) <= 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x018e, code lost:
        if ((r3 * r1) >= 0) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i6) {
        boolean z10;
        View view2;
        int i10;
        int i11;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        View onInterceptFocusSearch = this.H.onInterceptFocusSearch(view, i6);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z14 = false;
        if (this.G != null && this.H != null && !N() && !this.S) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        y yVar = this.C0;
        t tVar = this.f2734w;
        if (z10 && (i6 == 2 || i6 == 1)) {
            if (this.H.canScrollVertically()) {
                if (i6 == 2) {
                    i13 = 130;
                } else {
                    i13 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i13) == null) {
                    z11 = true;
                    if (!z11 && this.H.canScrollHorizontally()) {
                        if (this.H.getLayoutDirection() != 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i6 != 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!(z12 ^ z13)) {
                            i12 = 66;
                        } else {
                            i12 = 17;
                        }
                        if (focusFinder.findNextFocus(this, view, i12) != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        o();
                        if (D(view) == null) {
                            return null;
                        }
                        m0();
                        this.H.onFocusSearchFailed(view, i6, tVar, yVar);
                        n0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i6);
                }
            }
            z11 = false;
            if (!z11) {
                if (this.H.getLayoutDirection() != 1) {
                }
                if (i6 != 2) {
                }
                if (!(z12 ^ z13)) {
                }
                if (focusFinder.findNextFocus(this, view, i12) != null) {
                }
            }
            if (z11) {
            }
            view2 = focusFinder.findNextFocus(this, view, i6);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i6);
            if (findNextFocus == null && z10) {
                o();
                if (D(view) == null) {
                    return null;
                }
                m0();
                view2 = this.H.onFocusSearchFailed(view, i6, tVar, yVar);
                n0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i6);
            }
            d0(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && view2 != view) {
            if (D(view2) != null) {
                if (view != null && D(view) != null) {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    Rect rect = this.D;
                    rect.set(0, 0, width, height);
                    int width2 = view2.getWidth();
                    int height2 = view2.getHeight();
                    Rect rect2 = this.E;
                    rect2.set(0, 0, width2, height2);
                    offsetDescendantRectToMyCoords(view, rect);
                    offsetDescendantRectToMyCoords(view2, rect2);
                    if (this.H.getLayoutDirection() == 1) {
                        i10 = -1;
                    } else {
                        i10 = 1;
                    }
                    int i14 = rect.left;
                    int i15 = rect2.left;
                    if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
                        i11 = 1;
                    } else {
                        int i16 = rect.right;
                        int i17 = rect2.right;
                        if ((i16 > i17 || i14 >= i17) && i14 > i15) {
                            i11 = -1;
                        } else {
                            i11 = 0;
                        }
                    }
                    int i18 = rect.top;
                    int i19 = rect2.top;
                    if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
                        c10 = 1;
                    } else {
                        int i20 = rect.bottom;
                        int i21 = rect2.bottom;
                        if ((i20 > i21 || i18 >= i21) && i18 > i19) {
                            c10 = 65535;
                        } else {
                            c10 = 0;
                        }
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 17) {
                                if (i6 != 33) {
                                    if (i6 != 66) {
                                        if (i6 != 130) {
                                            StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                            sb2.append(i6);
                                            throw new IllegalArgumentException(defpackage.b.i(this, sb2));
                                        }
                                    }
                                }
                            }
                        } else if (c10 <= 0) {
                            if (c10 == 0) {
                            }
                        }
                    } else if (c10 >= 0) {
                        if (c10 == 0) {
                        }
                    }
                }
                z14 = true;
            }
            if (z14) {
                return super.focusSearch(view, i6);
            }
            return view2;
        }
        z14 = false;
        if (z14) {
        }
    }

    public final void g(l lVar) {
        m mVar = this.H;
        if (mVar != null) {
            mVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList<l> arrayList = this.K;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lVar);
        P();
        requestLayout();
    }

    public final void g0(int i6, int i10, int[] iArr) {
        int i11;
        int i12;
        c0 c0Var;
        m0();
        R();
        int i13 = o0.k.f26897a;
        k.a.a("RV Scroll");
        y yVar = this.C0;
        C(yVar);
        t tVar = this.f2734w;
        if (i6 != 0) {
            i11 = this.H.scrollHorizontallyBy(i6, tVar, yVar);
        } else {
            i11 = 0;
        }
        if (i10 != 0) {
            i12 = this.H.scrollVerticallyBy(i10, tVar, yVar);
        } else {
            i12 = 0;
        }
        k.a.b();
        int e10 = this.f2740z.e();
        for (int i14 = 0; i14 < e10; i14++) {
            View d10 = this.f2740z.d(i14);
            c0 K = K(d10);
            if (K != null && (c0Var = K.f2758i) != null) {
                int left = d10.getLeft();
                int top = d10.getTop();
                View view = c0Var.f2751a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i12;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.H;
        if (mVar != null) {
            return mVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(defpackage.b.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.H;
        if (mVar != null) {
            return mVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(defpackage.b.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.G;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.H;
        if (mVar != null) {
            return mVar.getBaseline();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i10) {
        return super.getChildDrawingOrder(i6, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.B;
    }

    public androidx.recyclerview.widget.z getCompatAccessibilityDelegate() {
        return this.J0;
    }

    public i getEdgeEffectFactory() {
        return this.f2715f0;
    }

    public j getItemAnimator() {
        return this.f2720k0;
    }

    public int getItemDecorationCount() {
        return this.K.size();
    }

    public m getLayoutManager() {
        return this.H;
    }

    public int getMaxFlingVelocity() {
        return this.f2733v0;
    }

    public int getMinFlingVelocity() {
        return this.f2731u0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (Z0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return this.f2729t0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2739y0;
    }

    public s getRecycledViewPool() {
        return this.f2734w.c();
    }

    public int getScrollState() {
        return this.f2721l0;
    }

    public final void h(q qVar) {
        this.L.add(qVar);
    }

    public final void h0(int i6) {
        if (this.S) {
            return;
        }
        setScrollState(0);
        b0 b0Var = this.f2741z0;
        RecyclerView.this.removeCallbacks(b0Var);
        b0Var.f2746w.abortAnimation();
        m mVar = this.H;
        if (mVar != null) {
            mVar.stopSmoothScroller();
        }
        m mVar2 = this.H;
        if (mVar2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        mVar2.scrollToPosition(i6);
        awakenScrollBars();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().e(0) == null) {
            return false;
        }
        return true;
    }

    public final void i(r rVar) {
        if (this.E0 == null) {
            this.E0 = new ArrayList();
        }
        this.E0.add(rVar);
    }

    public final boolean i0(EdgeEffect edgeEffect, int i6, int i10) {
        if (i6 > 0) {
            return true;
        }
        float a10 = androidx.core.widget.d.a(edgeEffect) * i10;
        float f2 = this.f2730u * 0.015f;
        double log = Math.log((Math.abs(-i6) * 0.35f) / f2);
        double d10 = W0;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f2)) < a10) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.N;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.S;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f32346d;
    }

    public final void j(String str) {
        if (N()) {
            if (str == null) {
                throw new IllegalStateException(defpackage.b.i(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.e0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(defpackage.b.i(this, new StringBuilder(""))));
        }
    }

    public final void j0(int i6, int i10) {
        k0(i6, i10, false);
    }

    public final void k0(int i6, int i10, boolean z10) {
        m mVar = this.H;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.S) {
        } else {
            int i11 = 0;
            if (!mVar.canScrollHorizontally()) {
                i6 = 0;
            }
            if (!this.H.canScrollVertically()) {
                i10 = 0;
            }
            if (i6 != 0 || i10 != 0) {
                if (z10) {
                    if (i6 != 0) {
                        i11 = 1;
                    }
                    if (i10 != 0) {
                        i11 |= 2;
                    }
                    getScrollingChildHelper().f(i11, 1);
                }
                this.f2741z0.c(i6, i10, LinearLayoutManager.INVALID_OFFSET, null);
            }
        }
    }

    public final void l() {
        int h10 = this.f2740z.h();
        for (int i6 = 0; i6 < h10; i6++) {
            c0 L = L(this.f2740z.g(i6));
            if (!L.t()) {
                L.f2754d = -1;
                L.f2756g = -1;
            }
        }
        t tVar = this.f2734w;
        ArrayList<c0> arrayList = tVar.f2799c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = arrayList.get(i10);
            c0Var.f2754d = -1;
            c0Var.f2756g = -1;
        }
        ArrayList<c0> arrayList2 = tVar.f2797a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c0 c0Var2 = arrayList2.get(i11);
            c0Var2.f2754d = -1;
            c0Var2.f2756g = -1;
        }
        ArrayList<c0> arrayList3 = tVar.f2798b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                c0 c0Var3 = tVar.f2798b.get(i12);
                c0Var3.f2754d = -1;
                c0Var3.f2756g = -1;
            }
        }
    }

    public final void l0(int i6) {
        if (this.S) {
            return;
        }
        m mVar = this.H;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mVar.smoothScrollToPosition(this, this.C0, i6);
        }
    }

    public final void m(int i6, int i10) {
        boolean z10;
        EdgeEffect edgeEffect = this.f2716g0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i6 > 0) {
            this.f2716g0.onRelease();
            z10 = this.f2716g0.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f2718i0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.f2718i0.onRelease();
            z10 |= this.f2718i0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2717h0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f2717h0.onRelease();
            z10 |= this.f2717h0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2719j0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f2719j0.onRelease();
            z10 |= this.f2719j0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            d0.d.k(this);
        }
    }

    public final void m0() {
        int i6 = this.Q + 1;
        this.Q = i6;
        if (i6 == 1 && !this.S) {
            this.R = false;
        }
    }

    public final void n0(boolean z10) {
        if (this.Q < 1) {
            this.Q = 1;
        }
        if (!z10 && !this.S) {
            this.R = false;
        }
        if (this.Q == 1) {
            if (z10 && this.R && !this.S && this.H != null && this.G != null) {
                r();
            }
            if (!this.S) {
                this.R = false;
            }
        }
        this.Q--;
    }

    public final void o() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.P && !this.f2713b0) {
            if (!this.f2738y.g()) {
                return;
            }
            androidx.recyclerview.widget.a aVar = this.f2738y;
            int i6 = aVar.f;
            boolean z13 = false;
            if ((4 & i6) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((i6 & 11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i10 = o0.k.f26897a;
                    k.a.a("RV PartialInvalidate");
                    m0();
                    R();
                    this.f2738y.j();
                    if (!this.R) {
                        int e10 = this.f2740z.e();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= e10) {
                                break;
                            }
                            c0 L = L(this.f2740z.d(i11));
                            if (L != null && !L.t()) {
                                if ((L.f2759j & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z13 = true;
                                    break;
                                }
                            }
                            i11++;
                        }
                        if (z13) {
                            r();
                        } else {
                            this.f2738y.b();
                        }
                    }
                    n0(true);
                    S(true);
                    k.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i12 = o0.k.f26897a;
                k.a.a("RV FullInvalidate");
                r();
                k.a.b();
                return;
            }
            return;
        }
        int i13 = o0.k.f26897a;
        k.a.a("RV FullInvalidate");
        r();
        k.a.b();
    }

    public final void o0(int i6) {
        getScrollingChildHelper().g(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.f2714d0 = 0;
        boolean z10 = true;
        this.N = true;
        this.P = (!this.P || isLayoutRequested()) ? false : false;
        this.f2734w.d();
        m mVar = this.H;
        if (mVar != null) {
            mVar.dispatchAttachedToWindow(this);
        }
        this.I0 = false;
        if (Z0) {
            ThreadLocal<androidx.recyclerview.widget.j> threadLocal = androidx.recyclerview.widget.j.f2981y;
            androidx.recyclerview.widget.j jVar = threadLocal.get();
            this.A0 = jVar;
            if (jVar == null) {
                this.A0 = new androidx.recyclerview.widget.j();
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                Display b10 = d0.e.b(this);
                if (!isInEditMode() && b10 != null) {
                    f2 = b10.getRefreshRate();
                }
                f2 = 60.0f;
                androidx.recyclerview.widget.j jVar2 = this.A0;
                jVar2.f2985w = 1.0E9f / f2;
                threadLocal.set(jVar2);
            }
            this.A0.f2983u.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        androidx.recyclerview.widget.j jVar;
        super.onDetachedFromWindow();
        j jVar2 = this.f2720k0;
        if (jVar2 != null) {
            jVar2.i();
        }
        setScrollState(0);
        b0 b0Var = this.f2741z0;
        RecyclerView.this.removeCallbacks(b0Var);
        b0Var.f2746w.abortAnimation();
        m mVar = this.H;
        if (mVar != null) {
            mVar.stopSmoothScroller();
        }
        this.N = false;
        m mVar2 = this.H;
        t tVar = this.f2734w;
        if (mVar2 != null) {
            mVar2.dispatchDetachedFromWindow(this, tVar);
        }
        this.P0.clear();
        removeCallbacks(this.Q0);
        this.A.getClass();
        do {
        } while (f0.a.f2940d.b() != null);
        int i6 = 0;
        while (true) {
            ArrayList<c0> arrayList = tVar.f2799c;
            if (i6 >= arrayList.size()) {
                break;
            }
            l0.e(arrayList.get(i6).f2751a);
            i6++;
        }
        tVar.e(RecyclerView.this.G, false);
        Iterator<View> it = f6.b.B0(this).iterator();
        while (true) {
            j0 j0Var = (j0) it;
            if (!j0Var.hasNext()) {
                break;
            }
            View view = (View) j0Var.next();
            y0.b bVar = (y0.b) view.getTag(R.id.pooling_container_listener_holder_tag);
            if (bVar == null) {
                bVar = new y0.b();
                view.setTag(R.id.pooling_container_listener_holder_tag, bVar);
            }
            ArrayList<y0.a> arrayList2 = bVar.f38185a;
            for (int l02 = ca.a.l0(arrayList2); -1 < l02; l02--) {
                arrayList2.get(l02).a();
            }
        }
        if (Z0 && (jVar = this.A0) != null) {
            jVar.f2983u.remove(this);
            this.A0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList<l> arrayList = this.K;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).g(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float axisValue;
        m mVar;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.H != null && !this.S && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.H.canScrollVertically()) {
                    f2 = -motionEvent.getAxisValue(9);
                } else {
                    f2 = 0.0f;
                }
                if (this.H.canScrollHorizontally()) {
                    axisValue = motionEvent.getAxisValue(10);
                    if (f2 == 0.0f || axisValue != 0.0f) {
                        int i14 = (int) (axisValue * this.f2735w0);
                        int i15 = (int) (f2 * this.f2737x0);
                        mVar = this.H;
                        if (mVar == null) {
                            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.S) {
                            int[] iArr = this.O0;
                            iArr[0] = 0;
                            iArr[1] = 0;
                            boolean canScrollHorizontally = mVar.canScrollHorizontally();
                            boolean canScrollVertically = this.H.canScrollVertically();
                            if (canScrollVertically) {
                                i6 = canScrollHorizontally | 2;
                            } else {
                                i6 = canScrollHorizontally;
                            }
                            float y10 = motionEvent.getY();
                            float x10 = motionEvent.getX();
                            int Y = i14 - Y(y10, i14);
                            int Z = i15 - Z(i15, x10);
                            getScrollingChildHelper().f(i6, 1);
                            if (canScrollHorizontally != 0) {
                                i10 = Y;
                            } else {
                                i10 = 0;
                            }
                            if (canScrollVertically) {
                                i11 = Z;
                            } else {
                                i11 = 0;
                            }
                            if (u(i10, i11, this.O0, this.M0, 1)) {
                                Y -= iArr[0];
                                Z -= iArr[1];
                            }
                            if (canScrollHorizontally != 0) {
                                i12 = Y;
                            } else {
                                i12 = 0;
                            }
                            if (canScrollVertically) {
                                i13 = Z;
                            } else {
                                i13 = 0;
                            }
                            f0(i12, i13, motionEvent, 1);
                            androidx.recyclerview.widget.j jVar = this.A0;
                            if (jVar != null && (Y != 0 || Z != 0)) {
                                jVar.a(this, Y, Z);
                            }
                            o0(1);
                        }
                    }
                }
                axisValue = 0.0f;
                if (f2 == 0.0f) {
                }
                int i142 = (int) (axisValue * this.f2735w0);
                int i152 = (int) (f2 * this.f2737x0);
                mVar = this.H;
                if (mVar == null) {
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    axisValue = motionEvent.getAxisValue(26);
                    if (this.H.canScrollVertically()) {
                        f2 = -axisValue;
                        axisValue = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        int i1422 = (int) (axisValue * this.f2735w0);
                        int i1522 = (int) (f2 * this.f2737x0);
                        mVar = this.H;
                        if (mVar == null) {
                        }
                    } else if (this.H.canScrollHorizontally()) {
                        f2 = 0.0f;
                        if (f2 == 0.0f) {
                        }
                        int i14222 = (int) (axisValue * this.f2735w0);
                        int i15222 = (int) (f2 * this.f2737x0);
                        mVar = this.H;
                        if (mVar == null) {
                        }
                    }
                }
                f2 = 0.0f;
                axisValue = 0.0f;
                if (f2 == 0.0f) {
                }
                int i142222 = (int) (axisValue * this.f2735w0);
                int i152222 = (int) (f2 * this.f2737x0);
                mVar = this.H;
                if (mVar == null) {
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.S) {
            return false;
        }
        this.M = null;
        if (E(motionEvent)) {
            e0();
            setScrollState(0);
            return true;
        }
        m mVar = this.H;
        if (mVar == null) {
            return false;
        }
        boolean canScrollHorizontally = mVar.canScrollHorizontally();
        boolean canScrollVertically = this.H.canScrollVertically();
        if (this.f2723n0 == null) {
            this.f2723n0 = VelocityTracker.obtain();
        }
        this.f2723n0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                T(motionEvent);
                            }
                        } else {
                            this.f2722m0 = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f2726q0 = x10;
                            this.f2724o0 = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f2727r0 = y10;
                            this.f2725p0 = y10;
                        }
                    } else {
                        e0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2722m0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2722m0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2721l0 != 1) {
                        int i6 = x11 - this.f2724o0;
                        int i10 = y11 - this.f2725p0;
                        if (canScrollHorizontally && Math.abs(i6) > this.f2728s0) {
                            this.f2726q0 = x11;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (canScrollVertically && Math.abs(i10) > this.f2728s0) {
                            this.f2727r0 = y11;
                            z11 = true;
                        }
                        if (z11) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f2723n0.clear();
                o0(0);
            }
        } else {
            if (this.T) {
                this.T = false;
            }
            this.f2722m0 = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.f2726q0 = x12;
            this.f2724o0 = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.f2727r0 = y12;
            this.f2725p0 = y12;
            EdgeEffect edgeEffect = this.f2716g0;
            if (edgeEffect != null && androidx.core.widget.d.a(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                androidx.core.widget.d.b(this.f2716g0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z10 = true;
            } else {
                z10 = false;
            }
            EdgeEffect edgeEffect2 = this.f2718i0;
            if (edgeEffect2 != null && androidx.core.widget.d.a(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                androidx.core.widget.d.b(this.f2718i0, 0.0f, motionEvent.getY() / getHeight());
                z10 = true;
            }
            EdgeEffect edgeEffect3 = this.f2717h0;
            if (edgeEffect3 != null && androidx.core.widget.d.a(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                androidx.core.widget.d.b(this.f2717h0, 0.0f, motionEvent.getX() / getWidth());
                z10 = true;
            }
            EdgeEffect edgeEffect4 = this.f2719j0;
            if (edgeEffect4 != null && androidx.core.widget.d.a(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                androidx.core.widget.d.b(this.f2719j0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z10 = true;
            }
            if (z10 || this.f2721l0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                o0(1);
            }
            int[] iArr = this.N0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = canScrollHorizontally;
            if (canScrollVertically) {
                i11 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            getScrollingChildHelper().f(i11, 0);
        }
        if (this.f2721l0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13 = o0.k.f26897a;
        k.a.a("RV OnLayout");
        r();
        k.a.b();
        this.P = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        m mVar = this.H;
        if (mVar == null) {
            p(i6, i10);
            return;
        }
        boolean isAutoMeasureEnabled = mVar.isAutoMeasureEnabled();
        t tVar = this.f2734w;
        boolean z10 = false;
        y yVar = this.C0;
        if (isAutoMeasureEnabled) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.H.onMeasure(tVar, yVar, i6, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.R0 = z10;
            if (!z10 && this.G != null) {
                if (yVar.f2815d == 1) {
                    s();
                }
                this.H.setMeasureSpecs(i6, i10);
                yVar.f2819i = true;
                t();
                this.H.setMeasuredDimensionFromChildren(i6, i10);
                if (this.H.shouldMeasureTwice()) {
                    this.H.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    yVar.f2819i = true;
                    t();
                    this.H.setMeasuredDimensionFromChildren(i6, i10);
                }
                this.S0 = getMeasuredWidth();
                this.T0 = getMeasuredHeight();
            }
        } else if (this.O) {
            this.H.onMeasure(tVar, yVar, i6, i10);
        } else {
            if (this.V) {
                m0();
                R();
                V();
                S(true);
                if (yVar.f2821k) {
                    yVar.f2817g = true;
                } else {
                    this.f2738y.c();
                    yVar.f2817g = false;
                }
                this.V = false;
                n0(false);
            } else if (yVar.f2821k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.G;
            if (eVar != null) {
                yVar.f2816e = eVar.f();
            } else {
                yVar.f2816e = 0;
            }
            m0();
            this.H.onMeasure(tVar, yVar, i6, i10);
            n0(false);
            yVar.f2817g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.f2736x = wVar;
        super.onRestoreInstanceState(wVar.f39113u);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.f2736x;
        if (wVar2 != null) {
            wVar.f2805w = wVar2.f2805w;
        } else {
            m mVar = this.H;
            if (mVar != null) {
                wVar.f2805w = mVar.onSaveInstanceState();
            } else {
                wVar.f2805w = null;
            }
        }
        return wVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        super.onSizeChanged(i6, i10, i11, i12);
        if (i6 != i11 || i10 != i12) {
            this.f2719j0 = null;
            this.f2717h0 = null;
            this.f2718i0 = null;
            this.f2716g0 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x02b4, code lost:
        if (r3 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0316, code lost:
        if (r2 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x033d, code lost:
        if (r0 != false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f2;
        float f10;
        int i6;
        int i10;
        b0 b0Var;
        float f11;
        float f12;
        boolean z11;
        boolean z12;
        int minFlingVelocity;
        boolean z13;
        x c10;
        int e10;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z15;
        boolean z16 = false;
        if (this.S || this.T) {
            return false;
        }
        q qVar = this.M;
        if (qVar == null) {
            if (motionEvent.getAction() == 0) {
                z10 = false;
            } else {
                z10 = E(motionEvent);
            }
        } else {
            qVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.M = null;
            }
            z10 = true;
        }
        if (z10) {
            e0();
            setScrollState(0);
            return true;
        }
        m mVar = this.H;
        if (mVar == null) {
            return false;
        }
        boolean canScrollHorizontally = mVar.canScrollHorizontally();
        boolean canScrollVertically = this.H.canScrollVertically();
        if (this.f2723n0 == null) {
            this.f2723n0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr = this.N0;
        if (actionMasked == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(iArr[0], iArr[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                T(motionEvent);
                            }
                        } else {
                            this.f2722m0 = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f2726q0 = x10;
                            this.f2724o0 = x10;
                            int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f2727r0 = y10;
                            this.f2725p0 = y10;
                        }
                    } else {
                        e0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2722m0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2722m0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i15 = this.f2726q0 - x11;
                    int i16 = this.f2727r0 - y11;
                    if (this.f2721l0 != 1) {
                        if (canScrollHorizontally) {
                            if (i15 > 0) {
                                i15 = Math.max(0, i15 - this.f2728s0);
                            } else {
                                i15 = Math.min(0, i15 + this.f2728s0);
                            }
                            if (i15 != 0) {
                                z15 = true;
                                if (canScrollVertically) {
                                    if (i16 > 0) {
                                        i16 = Math.max(0, i16 - this.f2728s0);
                                    } else {
                                        i16 = Math.min(0, i16 + this.f2728s0);
                                    }
                                    if (i16 != 0) {
                                        z15 = true;
                                    }
                                }
                                if (z15) {
                                    setScrollState(1);
                                }
                            }
                        }
                        z15 = false;
                        if (canScrollVertically) {
                        }
                        if (z15) {
                        }
                    }
                    if (this.f2721l0 == 1) {
                        int[] iArr2 = this.O0;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        int Y = i15 - Y(motionEvent.getY(), i15);
                        int Z = i16 - Z(i16, motionEvent.getX());
                        if (canScrollHorizontally) {
                            i11 = Y;
                        } else {
                            i11 = 0;
                        }
                        if (canScrollVertically) {
                            i12 = Z;
                        } else {
                            i12 = 0;
                        }
                        boolean u10 = u(i11, i12, this.O0, this.M0, 0);
                        int[] iArr3 = this.M0;
                        if (u10) {
                            Y -= iArr2[0];
                            Z -= iArr2[1];
                            iArr[0] = iArr[0] + iArr3[0];
                            iArr[1] = iArr[1] + iArr3[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i17 = Y;
                        int i18 = Z;
                        this.f2726q0 = x11 - iArr3[0];
                        this.f2727r0 = y11 - iArr3[1];
                        if (canScrollHorizontally) {
                            i13 = i17;
                        } else {
                            i13 = 0;
                        }
                        if (canScrollVertically) {
                            i14 = i18;
                        } else {
                            i14 = 0;
                        }
                        if (f0(i13, i14, motionEvent, 0)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        androidx.recyclerview.widget.j jVar = this.A0;
                        if (jVar != null && (i17 != 0 || i18 != 0)) {
                            jVar.a(this, i17, i18);
                        }
                    }
                }
            } else {
                this.f2723n0.addMovement(obtain);
                VelocityTracker velocityTracker = this.f2723n0;
                int i19 = this.f2733v0;
                velocityTracker.computeCurrentVelocity(1000, i19);
                if (canScrollHorizontally) {
                    f2 = -this.f2723n0.getXVelocity(this.f2722m0);
                } else {
                    f2 = 0.0f;
                }
                if (canScrollVertically) {
                    f10 = -this.f2723n0.getYVelocity(this.f2722m0);
                } else {
                    f10 = 0.0f;
                }
                if (f2 != 0.0f || f10 != 0.0f) {
                    int i20 = (int) f2;
                    int i21 = (int) f10;
                    m mVar2 = this.H;
                    if (mVar2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.S) {
                        int canScrollHorizontally2 = mVar2.canScrollHorizontally();
                        boolean canScrollVertically2 = this.H.canScrollVertically();
                        int i22 = this.f2731u0;
                        i20 = (canScrollHorizontally2 == 0 || Math.abs(i20) < i22) ? 0 : 0;
                        i21 = (!canScrollVertically2 || Math.abs(i21) < i22) ? 0 : 0;
                        if (i20 != 0 || i21 != 0) {
                            if (i20 != 0) {
                                EdgeEffect edgeEffect = this.f2716g0;
                                if (edgeEffect != null && androidx.core.widget.d.a(edgeEffect) != 0.0f) {
                                    int i23 = -i20;
                                    if (i0(this.f2716g0, i23, getWidth())) {
                                        this.f2716g0.onAbsorb(i23);
                                        i20 = 0;
                                    }
                                    i6 = 0;
                                } else {
                                    EdgeEffect edgeEffect2 = this.f2718i0;
                                    if (edgeEffect2 != null && androidx.core.widget.d.a(edgeEffect2) != 0.0f) {
                                        if (i0(this.f2718i0, i20, getWidth())) {
                                            this.f2718i0.onAbsorb(i20);
                                            i20 = 0;
                                        }
                                        i6 = 0;
                                    }
                                }
                                if (i21 != 0) {
                                    EdgeEffect edgeEffect3 = this.f2717h0;
                                    if (edgeEffect3 != null && androidx.core.widget.d.a(edgeEffect3) != 0.0f) {
                                        int i24 = -i21;
                                        if (i0(this.f2717h0, i24, getHeight())) {
                                            this.f2717h0.onAbsorb(i24);
                                            i21 = 0;
                                        }
                                        i10 = 0;
                                    } else {
                                        EdgeEffect edgeEffect4 = this.f2719j0;
                                        if (edgeEffect4 != null && androidx.core.widget.d.a(edgeEffect4) != 0.0f) {
                                            if (i0(this.f2719j0, i21, getHeight())) {
                                                this.f2719j0.onAbsorb(i21);
                                                i21 = 0;
                                            }
                                            i10 = 0;
                                        }
                                    }
                                    b0Var = this.f2741z0;
                                    if (i20 == 0 || i21 != 0) {
                                        int i25 = -i19;
                                        i20 = Math.max(i25, Math.min(i20, i19));
                                        i21 = Math.max(i25, Math.min(i21, i19));
                                        b0Var.a(i20, i21);
                                    }
                                    if (i6 != 0 && i10 == 0) {
                                        if (i20 == 0) {
                                        }
                                        z14 = true;
                                    } else {
                                        f11 = i6;
                                        f12 = i10;
                                        if (!dispatchNestedPreFling(f11, f12)) {
                                            if (canScrollHorizontally2 == 0 && !canScrollVertically2) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            dispatchNestedFling(f11, f12, z11);
                                            p pVar = this.f2729t0;
                                            if (pVar != null) {
                                                androidx.recyclerview.widget.c0 c0Var = (androidx.recyclerview.widget.c0) pVar;
                                                m layoutManager = c0Var.f2912a.getLayoutManager();
                                                if (layoutManager != null && c0Var.f2912a.getAdapter() != null && (Math.abs(i10) > (minFlingVelocity = c0Var.f2912a.getMinFlingVelocity()) || Math.abs(i6) > minFlingVelocity)) {
                                                    if (!(layoutManager instanceof x.b) || (c10 = c0Var.c(layoutManager)) == null || (e10 = c0Var.e(layoutManager, i6, i10)) == -1) {
                                                        z13 = false;
                                                    } else {
                                                        c10.setTargetPosition(e10);
                                                        layoutManager.startSmoothScroll(c10);
                                                        z13 = true;
                                                    }
                                                    if (z13) {
                                                        z12 = true;
                                                    }
                                                }
                                                z12 = false;
                                            }
                                            if (z11) {
                                                if (canScrollVertically2) {
                                                    canScrollHorizontally2 = (canScrollHorizontally2 == true ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().f(canScrollHorizontally2, 1);
                                                int i26 = -i19;
                                                b0Var.a(Math.max(i26, Math.min(i6, i19)), Math.max(i26, Math.min(i10, i19)));
                                                z14 = true;
                                            }
                                        }
                                    }
                                }
                                i10 = i21;
                                i21 = 0;
                                b0Var = this.f2741z0;
                                if (i20 == 0) {
                                }
                                int i252 = -i19;
                                i20 = Math.max(i252, Math.min(i20, i19));
                                i21 = Math.max(i252, Math.min(i21, i19));
                                b0Var.a(i20, i21);
                                if (i6 != 0) {
                                }
                                f11 = i6;
                                f12 = i10;
                                if (!dispatchNestedPreFling(f11, f12)) {
                                }
                            }
                            i6 = i20;
                            i20 = 0;
                            if (i21 != 0) {
                            }
                            i10 = i21;
                            i21 = 0;
                            b0Var = this.f2741z0;
                            if (i20 == 0) {
                            }
                            int i2522 = -i19;
                            i20 = Math.max(i2522, Math.min(i20, i19));
                            i21 = Math.max(i2522, Math.min(i21, i19));
                            b0Var.a(i20, i21);
                            if (i6 != 0) {
                            }
                            f11 = i6;
                            f12 = i10;
                            if (!dispatchNestedPreFling(f11, f12)) {
                            }
                        }
                    }
                    z14 = false;
                }
                setScrollState(0);
                e0();
                z16 = true;
            }
        } else {
            this.f2722m0 = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.f2726q0 = x12;
            this.f2724o0 = x12;
            int y12 = (int) (motionEvent.getY() + 0.5f);
            this.f2727r0 = y12;
            this.f2725p0 = y12;
            int i27 = canScrollHorizontally;
            if (canScrollVertically) {
                i27 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            getScrollingChildHelper().f(i27, 0);
        }
        if (!z16) {
            this.f2723n0.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i6, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
        setMeasuredDimension(m.chooseSize(i6, paddingRight, d0.d.e(this)), m.chooseSize(i10, getPaddingBottom() + getPaddingTop(), d0.d.d(this)));
    }

    public final void q(View view) {
        L(view);
        e eVar = this.G;
        ArrayList arrayList = this.f2712a0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((o) this.f2712a0.get(size)).b(view);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x034e, code lost:
        if (r18.f2740z.k(getFocusedChild()) == false) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        boolean z10;
        boolean z11;
        boolean z12;
        c0 c0Var;
        c0 H;
        View view;
        View findViewById;
        boolean z13;
        c0 c0Var2;
        boolean z14;
        boolean z15;
        if (this.G == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.H == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            y yVar = this.C0;
            yVar.f2819i = false;
            int i6 = 1;
            if (this.R0 && (this.S0 != getWidth() || this.T0 != getHeight())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.S0 = 0;
            this.T0 = 0;
            this.R0 = false;
            if (yVar.f2815d == 1) {
                s();
                this.H.setExactMeasureSpecsFrom(this);
                t();
            } else {
                androidx.recyclerview.widget.a aVar = this.f2738y;
                if (!aVar.f2872c.isEmpty() && !aVar.f2871b.isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11 && !z10 && this.H.getWidth() == getWidth() && this.H.getHeight() == getHeight()) {
                    this.H.setExactMeasureSpecsFrom(this);
                } else {
                    this.H.setExactMeasureSpecsFrom(this);
                    t();
                }
            }
            yVar.a(4);
            m0();
            R();
            yVar.f2815d = 1;
            boolean z16 = yVar.f2820j;
            View view2 = null;
            t tVar = this.f2734w;
            f0 f0Var = this.A;
            if (z16) {
                int e10 = this.f2740z.e() - 1;
                while (e10 >= 0) {
                    c0 L = L(this.f2740z.d(e10));
                    if (!L.t()) {
                        long J = J(L);
                        this.f2720k0.getClass();
                        j.c cVar = new j.c();
                        cVar.a(L);
                        c0 c0Var3 = (c0) f0Var.f2939b.e(J, null);
                        if (c0Var3 != null && !c0Var3.t()) {
                            t.h<c0, f0.a> hVar = f0Var.f2938a;
                            f0.a orDefault = hVar.getOrDefault(c0Var3, null);
                            if (orDefault != null && (orDefault.f2941a & i6) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            f0.a orDefault2 = hVar.getOrDefault(L, null);
                            if (orDefault2 != null && (i6 & orDefault2.f2941a) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14 && c0Var3 == L) {
                                f0Var.a(L, cVar);
                            } else {
                                j.c b10 = f0Var.b(c0Var3, 4);
                                f0Var.a(L, cVar);
                                j.c b11 = f0Var.b(L, 8);
                                if (b10 == null) {
                                    int e11 = this.f2740z.e();
                                    for (int i10 = 0; i10 < e11; i10++) {
                                        c0 L2 = L(this.f2740z.d(i10));
                                        if (L2 != L && J(L2) == J) {
                                            e eVar = this.G;
                                            if (eVar != null && eVar.f2770v) {
                                                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                                sb2.append(L2);
                                                sb2.append(" \n View Holder 2:");
                                                sb2.append(L);
                                                throw new IllegalStateException(defpackage.b.i(this, sb2));
                                            }
                                            StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb3.append(L2);
                                            sb3.append(" \n View Holder 2:");
                                            sb3.append(L);
                                            throw new IllegalStateException(defpackage.b.i(this, sb3));
                                        }
                                    }
                                    Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var3 + " cannot be found but it is necessary for " + L + B());
                                } else {
                                    c0Var3.s(false);
                                    if (z14) {
                                        f(c0Var3);
                                    }
                                    if (c0Var3 != L) {
                                        if (z15) {
                                            f(L);
                                        }
                                        c0Var3.f2757h = L;
                                        f(c0Var3);
                                        tVar.l(c0Var3);
                                        L.s(false);
                                        L.f2758i = c0Var3;
                                    }
                                    if (this.f2720k0.b(c0Var3, L, b10, b11)) {
                                        U();
                                    }
                                }
                            }
                        } else {
                            f0Var.a(L, cVar);
                        }
                    }
                    e10--;
                    i6 = 1;
                }
                t.h<c0, f0.a> hVar2 = f0Var.f2938a;
                int i11 = hVar2.f32260w;
                while (true) {
                    i11--;
                    if (i11 < 0) {
                        break;
                    }
                    c0 i12 = hVar2.i(i11);
                    f0.a k10 = hVar2.k(i11);
                    int i13 = k10.f2941a;
                    int i14 = i13 & 3;
                    d dVar = this.U0;
                    if (i14 == 3) {
                        RecyclerView recyclerView = RecyclerView.this;
                        recyclerView.H.removeAndRecycleView(i12.f2751a, recyclerView.f2734w);
                    } else if ((i13 & 1) != 0) {
                        j.c cVar2 = k10.f2942b;
                        if (cVar2 == null) {
                            RecyclerView recyclerView2 = RecyclerView.this;
                            recyclerView2.H.removeAndRecycleView(i12.f2751a, recyclerView2.f2734w);
                        } else {
                            j.c cVar3 = k10.f2943c;
                            RecyclerView recyclerView3 = RecyclerView.this;
                            recyclerView3.f2734w.l(i12);
                            recyclerView3.f(i12);
                            i12.s(false);
                            if (recyclerView3.f2720k0.c(i12, cVar2, cVar3)) {
                                recyclerView3.U();
                            }
                        }
                    } else if ((i13 & 14) == 14) {
                        j.c cVar4 = k10.f2942b;
                        j.c cVar5 = k10.f2943c;
                        RecyclerView recyclerView4 = RecyclerView.this;
                        recyclerView4.getClass();
                        i12.s(false);
                        if (recyclerView4.f2720k0.a(i12, cVar4, cVar5)) {
                            recyclerView4.U();
                        }
                    } else if ((i13 & 12) == 12) {
                        j.c cVar6 = k10.f2942b;
                        j.c cVar7 = k10.f2943c;
                        dVar.getClass();
                        i12.s(false);
                        RecyclerView recyclerView5 = RecyclerView.this;
                        if (recyclerView5.f2713b0) {
                            if (recyclerView5.f2720k0.b(i12, i12, cVar6, cVar7)) {
                                recyclerView5.U();
                            }
                        } else if (recyclerView5.f2720k0.d(i12, cVar6, cVar7)) {
                            recyclerView5.U();
                        }
                    } else if ((i13 & 4) != 0) {
                        j.c cVar8 = k10.f2942b;
                        RecyclerView recyclerView6 = RecyclerView.this;
                        recyclerView6.f2734w.l(i12);
                        recyclerView6.f(i12);
                        i12.s(false);
                        if (recyclerView6.f2720k0.c(i12, cVar8, null)) {
                            recyclerView6.U();
                        }
                    } else if ((i13 & 8) != 0) {
                        j.c cVar9 = k10.f2942b;
                        j.c cVar10 = k10.f2943c;
                        RecyclerView recyclerView7 = RecyclerView.this;
                        recyclerView7.getClass();
                        i12.s(false);
                        if (recyclerView7.f2720k0.a(i12, cVar9, cVar10)) {
                            recyclerView7.U();
                        }
                    }
                    k10.f2941a = 0;
                    k10.f2942b = null;
                    k10.f2943c = null;
                    f0.a.f2940d.a(k10);
                }
            }
            this.H.removeAndRecycleScrapInt(tVar);
            yVar.f2813b = yVar.f2816e;
            this.f2713b0 = false;
            this.c0 = false;
            yVar.f2820j = false;
            yVar.f2821k = false;
            this.H.mRequestedSimpleAnimations = false;
            ArrayList<c0> arrayList = tVar.f2798b;
            if (arrayList != null) {
                arrayList.clear();
            }
            m mVar = this.H;
            if (mVar.mPrefetchMaxObservedInInitialPrefetch) {
                mVar.mPrefetchMaxCountObserved = 0;
                mVar.mPrefetchMaxObservedInInitialPrefetch = false;
                tVar.m();
            }
            this.H.onLayoutCompleted(yVar);
            S(true);
            n0(false);
            f0Var.f2938a.clear();
            f0Var.f2939b.b();
            int[] iArr = this.K0;
            int i15 = iArr[0];
            int i16 = iArr[1];
            F(iArr);
            if (iArr[0] == i15 && iArr[1] == i16) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                w(0, 0);
            }
            if (this.f2739y0 && this.G != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
                if (!isFocused()) {
                }
                long j10 = yVar.f2823m;
                if (j10 != -1 && (z13 = this.G.f2770v)) {
                    if (!z13) {
                        c0Var2 = null;
                    } else {
                        int h10 = this.f2740z.h();
                        c0Var2 = null;
                        for (int i17 = 0; i17 < h10; i17++) {
                            c0Var = L(this.f2740z.g(i17));
                            if (c0Var != null && !c0Var.n() && c0Var.f2755e == j10) {
                                if (!this.f2740z.k(c0Var.f2751a)) {
                                    break;
                                }
                                c0Var2 = c0Var;
                            }
                        }
                    }
                    c0Var = c0Var2;
                } else {
                    c0Var = null;
                }
                if (c0Var != null) {
                    androidx.recyclerview.widget.b bVar = this.f2740z;
                    view = c0Var.f2751a;
                    if (!bVar.k(view) && view.hasFocusable()) {
                        view2 = view;
                        if (view2 != null) {
                            int i18 = yVar.f2824n;
                            if (i18 != -1 && (findViewById = view2.findViewById(i18)) != null && findViewById.isFocusable()) {
                                view2 = findViewById;
                            }
                            view2.requestFocus();
                        }
                    }
                }
                if (this.f2740z.e() > 0) {
                    int i19 = yVar.f2822l;
                    if (i19 == -1) {
                        i19 = 0;
                    }
                    int b12 = yVar.b();
                    for (int i20 = i19; i20 < b12; i20++) {
                        c0 H2 = H(i20);
                        if (H2 == null) {
                            break;
                        }
                        View view3 = H2.f2751a;
                        if (view3.hasFocusable()) {
                            view2 = view3;
                            break;
                        }
                    }
                    int min = Math.min(b12, i19);
                    do {
                        min--;
                        if (min < 0 || (H = H(min)) == null) {
                            break;
                        }
                        view = H.f2751a;
                    } while (!view.hasFocusable());
                    view2 = view;
                }
                if (view2 != null) {
                }
            }
            yVar.f2823m = -1L;
            yVar.f2822l = -1;
            yVar.f2824n = -1;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        c0 L = L(view);
        if (L != null) {
            if (L.p()) {
                L.f2759j &= -257;
            } else if (!L.t()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(L);
                throw new IllegalArgumentException(defpackage.b.i(this, sb2));
            }
        }
        view.clearAnimation();
        q(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.H.onRequestChildFocus(this, this.C0, view, view2) && view2 != null) {
            d0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.H.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ArrayList<q> arrayList = this.L;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Q == 0 && !this.S) {
            super.requestLayout();
        } else {
            this.R = true;
        }
    }

    public final void s() {
        View view;
        c0 c0Var;
        int e10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View D;
        y yVar = this.C0;
        yVar.a(1);
        C(yVar);
        yVar.f2819i = false;
        m0();
        f0 f0Var = this.A;
        f0Var.f2938a.clear();
        f0Var.f2939b.b();
        R();
        V();
        if (this.f2739y0 && hasFocus() && this.G != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (D = D(view)) == null) {
            c0Var = null;
        } else {
            c0Var = K(D);
        }
        long j10 = -1;
        if (c0Var == null) {
            yVar.f2823m = -1L;
            yVar.f2822l = -1;
            yVar.f2824n = -1;
        } else {
            if (this.G.f2770v) {
                j10 = c0Var.f2755e;
            }
            yVar.f2823m = j10;
            if (this.f2713b0) {
                e10 = -1;
            } else if (c0Var.n()) {
                e10 = c0Var.f2754d;
            } else {
                e10 = c0Var.e();
            }
            yVar.f2822l = e10;
            View view2 = c0Var.f2751a;
            int id2 = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id2 = view2.getId();
                }
            }
            yVar.f2824n = id2;
        }
        if (yVar.f2820j && this.G0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.f2818h = z10;
        this.G0 = false;
        this.F0 = false;
        yVar.f2817g = yVar.f2821k;
        yVar.f2816e = this.G.f();
        F(this.K0);
        boolean z14 = yVar.f2820j;
        t.h<c0, f0.a> hVar = f0Var.f2938a;
        if (z14) {
            int e11 = this.f2740z.e();
            for (int i6 = 0; i6 < e11; i6++) {
                c0 L = L(this.f2740z.d(i6));
                if (!L.t() && (!L.l() || this.G.f2770v)) {
                    j jVar = this.f2720k0;
                    j.e(L);
                    L.i();
                    jVar.getClass();
                    j.c cVar = new j.c();
                    cVar.a(L);
                    f0.a orDefault = hVar.getOrDefault(L, null);
                    if (orDefault == null) {
                        orDefault = f0.a.a();
                        hVar.put(L, orDefault);
                    }
                    orDefault.f2942b = cVar;
                    orDefault.f2941a |= 4;
                    if (yVar.f2818h) {
                        if ((L.f2759j & 2) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 && !L.n() && !L.t() && !L.l()) {
                            f0Var.f2939b.h(J(L), L);
                        }
                    }
                }
            }
        }
        if (yVar.f2821k) {
            int h10 = this.f2740z.h();
            for (int i10 = 0; i10 < h10; i10++) {
                c0 L2 = L(this.f2740z.g(i10));
                if (!L2.t() && L2.f2754d == -1) {
                    L2.f2754d = L2.f2753c;
                }
            }
            boolean z15 = yVar.f;
            yVar.f = false;
            this.H.onLayoutChildren(this.f2734w, yVar);
            yVar.f = z15;
            for (int i11 = 0; i11 < this.f2740z.e(); i11++) {
                c0 L3 = L(this.f2740z.d(i11));
                if (!L3.t()) {
                    f0.a orDefault2 = hVar.getOrDefault(L3, null);
                    if (orDefault2 != null && (orDefault2.f2941a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        j.e(L3);
                        if ((L3.f2759j & 8192) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j jVar2 = this.f2720k0;
                        L3.i();
                        jVar2.getClass();
                        j.c cVar2 = new j.c();
                        cVar2.a(L3);
                        if (z12) {
                            X(L3, cVar2);
                        } else {
                            f0.a orDefault3 = hVar.getOrDefault(L3, null);
                            if (orDefault3 == null) {
                                orDefault3 = f0.a.a();
                                hVar.put(L3, orDefault3);
                            }
                            orDefault3.f2941a |= 2;
                            orDefault3.f2942b = cVar2;
                        }
                    }
                }
            }
            l();
        } else {
            l();
        }
        S(true);
        n0(false);
        yVar.f2815d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i6, int i10) {
        m mVar = this.H;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.S) {
        } else {
            boolean canScrollHorizontally = mVar.canScrollHorizontally();
            boolean canScrollVertically = this.H.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i6 = 0;
                }
                if (!canScrollVertically) {
                    i10 = 0;
                }
                f0(i6, i10, null, 0);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i6, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i6;
        int i10 = 0;
        if (N()) {
            if (accessibilityEvent != null) {
                i6 = u0.b.a(accessibilityEvent);
            } else {
                i6 = 0;
            }
            if (i6 != 0) {
                i10 = i6;
            }
            this.U |= i10;
            i10 = 1;
        }
        if (i10 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.z zVar) {
        this.J0 = zVar;
        t0.d0.q(this, zVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.G;
        v vVar = this.f2732v;
        if (eVar2 != null) {
            eVar2.f2769u.unregisterObserver(vVar);
            this.G.q(this);
        }
        j jVar = this.f2720k0;
        if (jVar != null) {
            jVar.i();
        }
        m mVar = this.H;
        t tVar = this.f2734w;
        if (mVar != null) {
            mVar.removeAndRecycleAllViews(tVar);
            this.H.removeAndRecycleScrapInt(tVar);
        }
        tVar.f2797a.clear();
        tVar.f();
        androidx.recyclerview.widget.a aVar = this.f2738y;
        aVar.l(aVar.f2871b);
        aVar.l(aVar.f2872c);
        aVar.f = 0;
        e<?> eVar3 = this.G;
        this.G = eVar;
        if (eVar != null) {
            eVar.u(vVar);
            eVar.m(this);
        }
        m mVar2 = this.H;
        if (mVar2 != null) {
            mVar2.onAdapterChanged(eVar3, this.G);
        }
        e eVar4 = this.G;
        tVar.f2797a.clear();
        tVar.f();
        tVar.e(eVar3, true);
        s c10 = tVar.c();
        if (eVar3 != null) {
            c10.f2791b--;
        }
        if (c10.f2791b == 0) {
            int i6 = 0;
            while (true) {
                SparseArray<s.a> sparseArray = c10.f2790a;
                if (i6 >= sparseArray.size()) {
                    break;
                }
                s.a valueAt = sparseArray.valueAt(i6);
                Iterator<c0> it = valueAt.f2793a.iterator();
                while (it.hasNext()) {
                    l0.e(it.next().f2751a);
                }
                valueAt.f2793a.clear();
                i6++;
            }
        }
        if (eVar4 != null) {
            c10.f2791b++;
        }
        tVar.d();
        this.C0.f = true;
        W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        boolean z10;
        if (hVar == null) {
            return;
        }
        if (hVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setChildrenDrawingOrderEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.B) {
            this.f2719j0 = null;
            this.f2717h0 = null;
            this.f2718i0 = null;
            this.f2716g0 = null;
        }
        this.B = z10;
        super.setClipToPadding(z10);
        if (this.P) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.f2715f0 = iVar;
        this.f2719j0 = null;
        this.f2717h0 = null;
        this.f2718i0 = null;
        this.f2716g0 = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.O = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.f2720k0;
        if (jVar2 != null) {
            jVar2.i();
            this.f2720k0.f2772a = null;
        }
        this.f2720k0 = jVar;
        if (jVar != null) {
            jVar.f2772a = this.H0;
        }
    }

    public void setItemViewCacheSize(int i6) {
        t tVar = this.f2734w;
        tVar.f2801e = i6;
        tVar.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(m mVar) {
        b.InterfaceC0038b interfaceC0038b;
        RecyclerView recyclerView;
        if (mVar == this.H) {
            return;
        }
        int i6 = 0;
        setScrollState(0);
        b0 b0Var = this.f2741z0;
        RecyclerView.this.removeCallbacks(b0Var);
        b0Var.f2746w.abortAnimation();
        m mVar2 = this.H;
        if (mVar2 != null) {
            mVar2.stopSmoothScroller();
        }
        m mVar3 = this.H;
        t tVar = this.f2734w;
        if (mVar3 != null) {
            j jVar = this.f2720k0;
            if (jVar != null) {
                jVar.i();
            }
            this.H.removeAndRecycleAllViews(tVar);
            this.H.removeAndRecycleScrapInt(tVar);
            tVar.f2797a.clear();
            tVar.f();
            if (this.N) {
                this.H.dispatchDetachedFromWindow(this, tVar);
            }
            this.H.setRecyclerView(null);
            this.H = null;
        } else {
            tVar.f2797a.clear();
            tVar.f();
        }
        androidx.recyclerview.widget.b bVar = this.f2740z;
        bVar.f2880b.g();
        ArrayList arrayList = bVar.f2881c;
        int size = arrayList.size();
        while (true) {
            size--;
            interfaceC0038b = bVar.f2879a;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.x xVar = (androidx.recyclerview.widget.x) interfaceC0038b;
            xVar.getClass();
            c0 L = L((View) arrayList.get(size));
            if (L != null) {
                int i10 = L.f2765p;
                RecyclerView recyclerView2 = xVar.f3061a;
                if (recyclerView2.N()) {
                    L.f2766q = i10;
                    recyclerView2.P0.add(L);
                } else {
                    WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                    d0.d.s(L.f2751a, i10);
                }
                L.f2765p = 0;
            }
            arrayList.remove(size);
        }
        androidx.recyclerview.widget.x xVar2 = (androidx.recyclerview.widget.x) interfaceC0038b;
        int a10 = xVar2.a();
        while (true) {
            recyclerView = xVar2.f3061a;
            if (i6 >= a10) {
                break;
            }
            View childAt = recyclerView.getChildAt(i6);
            recyclerView.q(childAt);
            childAt.clearAnimation();
            i6++;
        }
        recyclerView.removeAllViews();
        this.H = mVar;
        if (mVar != null) {
            if (mVar.mRecyclerView == null) {
                mVar.setRecyclerView(this);
                if (this.N) {
                    this.H.dispatchAttachedToWindow(this);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(mVar);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(defpackage.b.i(mVar.mRecyclerView, sb2));
            }
        }
        tVar.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        t0.p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f32346d) {
            WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
            d0.i.z(scrollingChildHelper.f32345c);
        }
        scrollingChildHelper.f32346d = z10;
    }

    public void setOnFlingListener(p pVar) {
        this.f2729t0 = pVar;
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.D0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2739y0 = z10;
    }

    public void setRecycledViewPool(s sVar) {
        s sVar2;
        t tVar = this.f2734w;
        RecyclerView recyclerView = RecyclerView.this;
        tVar.e(recyclerView.G, false);
        if (tVar.f2802g != null) {
            sVar2.f2791b--;
        }
        tVar.f2802g = sVar;
        if (sVar != null && recyclerView.getAdapter() != null) {
            tVar.f2802g.f2791b++;
        }
        tVar.d();
    }

    @Deprecated
    public void setRecyclerListener(u uVar) {
        this.I = uVar;
    }

    void setScrollState(int i6) {
        if (i6 == this.f2721l0) {
            return;
        }
        this.f2721l0 = i6;
        if (i6 != 2) {
            b0 b0Var = this.f2741z0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f2746w.abortAnimation();
            m mVar = this.H;
            if (mVar != null) {
                mVar.stopSmoothScroller();
            }
        }
        m mVar2 = this.H;
        if (mVar2 != null) {
            mVar2.onScrollStateChanged(i6);
        }
        r rVar = this.D0;
        if (rVar != null) {
            rVar.a(i6, this);
        }
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((r) this.E0.get(size)).a(i6, this);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i6) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 != 0) {
            if (i6 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
            } else {
                this.f2728s0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2728s0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f2734w.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().f(i6, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().g(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.S) {
            j("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.S = false;
                if (this.R && this.H != null && this.G != null) {
                    requestLayout();
                }
                this.R = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.S = true;
            this.T = true;
            setScrollState(0);
            b0 b0Var = this.f2741z0;
            RecyclerView.this.removeCallbacks(b0Var);
            b0Var.f2746w.abortAnimation();
            m mVar = this.H;
            if (mVar != null) {
                mVar.stopSmoothScroller();
            }
        }
    }

    public final void t() {
        boolean z10;
        boolean z11;
        m0();
        R();
        y yVar = this.C0;
        yVar.a(6);
        this.f2738y.c();
        yVar.f2816e = this.G.f();
        yVar.f2814c = 0;
        if (this.f2736x != null) {
            e eVar = this.G;
            int d10 = v.h.d(eVar.f2771w);
            if (d10 == 1 ? eVar.f() > 0 : d10 != 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Parcelable parcelable = this.f2736x.f2805w;
                if (parcelable != null) {
                    this.H.onRestoreInstanceState(parcelable);
                }
                this.f2736x = null;
            }
        }
        yVar.f2817g = false;
        this.H.onLayoutChildren(this.f2734w, yVar);
        yVar.f = false;
        if (yVar.f2820j && this.f2720k0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yVar.f2820j = z10;
        yVar.f2815d = 4;
        S(true);
        n0(false);
    }

    public final boolean u(int i6, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i6, i10, iArr, iArr2, i11);
    }

    public final void v(int i6, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i6, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void w(int i6, int i10) {
        this.e0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i10);
        r rVar = this.D0;
        if (rVar != null) {
            rVar.b(this, i6, i10);
        }
        ArrayList arrayList = this.E0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((r) this.E0.get(size)).b(this, i6, i10);
            }
        }
        this.e0--;
    }

    public final void x() {
        if (this.f2719j0 != null) {
            return;
        }
        ((z) this.f2715f0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2719j0 = edgeEffect;
        if (this.B) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.f2716g0 != null) {
            return;
        }
        ((z) this.f2715f0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2716g0 = edgeEffect;
        if (this.B) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.f2718i0 != null) {
            return;
        }
        ((z) this.f2715f0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2718i0 = edgeEffect;
        if (this.B) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        float a10;
        float a11;
        int i10;
        char c10;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f2732v = new v();
        this.f2734w = new t();
        this.A = new f0();
        this.C = new a();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new RectF();
        this.J = new ArrayList();
        this.K = new ArrayList<>();
        this.L = new ArrayList<>();
        this.Q = 0;
        this.f2713b0 = false;
        this.c0 = false;
        this.f2714d0 = 0;
        this.e0 = 0;
        this.f2715f0 = f2711c1;
        this.f2720k0 = new androidx.recyclerview.widget.c();
        this.f2721l0 = 0;
        this.f2722m0 = -1;
        this.f2735w0 = Float.MIN_VALUE;
        this.f2737x0 = Float.MIN_VALUE;
        this.f2739y0 = true;
        this.f2741z0 = new b0();
        this.B0 = Z0 ? new j.b() : null;
        this.C0 = new y();
        this.F0 = false;
        this.G0 = false;
        k kVar = new k();
        this.H0 = kVar;
        this.I0 = false;
        this.K0 = new int[2];
        this.M0 = new int[2];
        this.N0 = new int[2];
        this.O0 = new int[2];
        this.P0 = new ArrayList();
        this.Q0 = new b();
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2728s0 = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = t0.f0.f32310a;
            a10 = f0.a.a(viewConfiguration);
        } else {
            a10 = t0.f0.a(viewConfiguration, context);
        }
        this.f2735w0 = a10;
        if (i11 >= 26) {
            a11 = f0.a.b(viewConfiguration);
        } else {
            a11 = t0.f0.a(viewConfiguration, context);
        }
        this.f2737x0 = a11;
        this.f2731u0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2733v0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2730u = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2720k0.f2772a = kVar;
        this.f2738y = new androidx.recyclerview.widget.a(new androidx.recyclerview.widget.y(this));
        this.f2740z = new androidx.recyclerview.widget.b(new androidx.recyclerview.widget.x(this));
        WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
        if ((i11 >= 26 ? d0.l.b(this) : 0) == 0 && i11 >= 26) {
            d0.l.l(this, 8);
        }
        if (d0.d.c(this) == 0) {
            d0.d.s(this, 1);
        }
        this.W = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.z(this));
        int[] iArr = sc.b.Q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        t0.d0.p(this, context, iArr, attributeSet, obtainStyledAttributes, i6);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.B = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range);
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.fastscroll_margin);
                i10 = 4;
                c10 = 2;
                new androidx.recyclerview.widget.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
            } else {
                throw new IllegalArgumentException(defpackage.b.i(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            i10 = 4;
            c10 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(f2710a1);
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[c10] = Integer.valueOf(i6);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e10) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e16);
                }
            }
        }
        int[] iArr2 = V0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i6, 0);
        t0.d0.p(this, context, iArr2, attributeSet, obtainStyledAttributes2, i6);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    /* loaded from: classes.dex */
    public static class w extends z0.a {
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public Parcelable f2805w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<w> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new w[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new w(parcel, null);
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2805w = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeParcelable(this.f2805w, 0);
        }

        public w(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c0 f2786a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2787b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2788c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2789d;

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2787b = new Rect();
            this.f2788c = true;
            this.f2789d = false;
        }

        public final int a() {
            return this.f2786a.h();
        }

        public final boolean b() {
            if ((this.f2786a.f2759j & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            return this.f2786a.n();
        }

        public n(int i6, int i10) {
            super(i6, i10);
            this.f2787b = new Rect();
            this.f2788c = true;
            this.f2789d = false;
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2787b = new Rect();
            this.f2788c = true;
            this.f2789d = false;
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2787b = new Rect();
            this.f2788c = true;
            this.f2789d = false;
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
            this.f2787b = new Rect();
            this.f2788c = true;
            this.f2789d = false;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.H;
        if (mVar != null) {
            return mVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(defpackage.b.i(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void c(int i6, int i10, Bundle bundle) {
            b();
        }

        public void a() {
        }

        public void b() {
        }

        public void d(int i6, int i10) {
        }

        public void e(int i6, int i10) {
        }

        public void f(int i6, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<VH extends c0> {

        /* renamed from: u  reason: collision with root package name */
        public final f f2769u = new f();

        /* renamed from: v  reason: collision with root package name */
        public boolean f2770v = false;

        /* renamed from: w  reason: collision with root package name */
        public final int f2771w = 1;

        public abstract int f();

        public long g(int i6) {
            return -1L;
        }

        public int h(int i6) {
            return 0;
        }

        public final void i() {
            this.f2769u.b();
        }

        public final void j(int i6) {
            this.f2769u.d(i6, 1, null);
        }

        public final void k(int i6, int i10) {
            this.f2769u.d(i6, i10, null);
        }

        public final void l(int i6) {
            this.f2769u.f(i6, 1);
        }

        public abstract void n(VH vh2, int i6);

        public void o(VH vh2, int i6, List<Object> list) {
            n(vh2, i6);
        }

        public abstract c0 p(int i6, RecyclerView recyclerView);

        public boolean r(VH vh2) {
            return false;
        }

        public final void u(g gVar) {
            this.f2769u.registerObserver(gVar);
        }

        public void m(RecyclerView recyclerView) {
        }

        public void q(RecyclerView recyclerView) {
        }

        public void s(VH vh2) {
        }

        public void t(VH vh2) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void f(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public void a(int i6, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i6, int i10) {
        }
    }
}
