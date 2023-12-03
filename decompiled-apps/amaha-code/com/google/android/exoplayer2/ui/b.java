package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c9.w;
import com.google.android.exoplayer2.ui.c;
import com.google.android.exoplayer2.ui.e;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: DefaultTimeBar.java */
/* loaded from: classes.dex */
public final class b extends View implements e {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f7083k0 = 0;
    public final Paint A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final StringBuilder O;
    public final Formatter P;
    public final androidx.activity.b Q;
    public final CopyOnWriteArraySet<e.a> R;
    public final Point S;
    public final float T;
    public int U;
    public long V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public Rect f7084a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f7085b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f7086d0;
    public long e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f7087f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f7088g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f7089h0;

    /* renamed from: i0  reason: collision with root package name */
    public long[] f7090i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean[] f7091j0;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f7092u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f7093v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f7094w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f7095x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f7096y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f7097z;

    public b(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        Paint paint;
        this.f7092u = new Rect();
        this.f7093v = new Rect();
        this.f7094w = new Rect();
        this.f7095x = new Rect();
        Paint paint2 = new Paint();
        this.f7096y = paint2;
        Paint paint3 = new Paint();
        this.f7097z = paint3;
        Paint paint4 = new Paint();
        this.A = paint4;
        Paint paint5 = new Paint();
        this.B = paint5;
        Paint paint6 = new Paint();
        this.C = paint6;
        Paint paint7 = new Paint();
        this.D = paint7;
        paint7.setAntiAlias(true);
        this.R = new CopyOnWriteArraySet<>();
        this.S = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.T = f;
        this.N = c(f, -50);
        int c10 = c(f, 4);
        int c11 = c(f, 26);
        int c12 = c(f, 4);
        int c13 = c(f, 12);
        int c14 = c(f, 0);
        int c15 = c(f, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hc.d.f17372x, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.E = drawable;
                if (drawable != null) {
                    int i6 = w.f5205a;
                    if (i6 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        paint = paint5;
                        if (i6 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    } else {
                        paint = paint5;
                    }
                    c11 = Math.max(drawable.getMinimumHeight(), c11);
                } else {
                    paint = paint5;
                }
                this.F = obtainStyledAttributes.getDimensionPixelSize(3, c10);
                this.G = obtainStyledAttributes.getDimensionPixelSize(12, c11);
                this.H = obtainStyledAttributes.getInt(2, 0);
                this.I = obtainStyledAttributes.getDimensionPixelSize(1, c12);
                this.J = obtainStyledAttributes.getDimensionPixelSize(11, c13);
                this.K = obtainStyledAttributes.getDimensionPixelSize(8, c14);
                this.L = obtainStyledAttributes.getDimensionPixelSize(9, c15);
                int i10 = obtainStyledAttributes.getInt(6, -1);
                int i11 = obtainStyledAttributes.getInt(7, -1);
                int i12 = obtainStyledAttributes.getInt(4, -855638017);
                int i13 = obtainStyledAttributes.getInt(13, 872415231);
                int i14 = obtainStyledAttributes.getInt(0, -1291845888);
                int i15 = obtainStyledAttributes.getInt(5, 872414976);
                paint2.setColor(i10);
                paint7.setColor(i11);
                paint3.setColor(i12);
                paint4.setColor(i13);
                paint.setColor(i14);
                paint6.setColor(i15);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.F = c10;
            this.G = c11;
            this.H = 0;
            this.I = c12;
            this.J = c13;
            this.K = c14;
            this.L = c15;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.E = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.O = sb2;
        this.P = new Formatter(sb2, Locale.getDefault());
        this.Q = new androidx.activity.b(23, this);
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            this.M = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.M = (Math.max(this.K, Math.max(this.J, this.L)) + 1) / 2;
        }
        this.f7085b0 = 1.0f;
        new ValueAnimator().addUpdateListener(new a9.c(0, this));
        this.e0 = -9223372036854775807L;
        this.V = -9223372036854775807L;
        this.U = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f, int i6) {
        return (int) ((i6 * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.V;
        if (j10 == -9223372036854775807L) {
            long j11 = this.e0;
            if (j11 == -9223372036854775807L) {
                return 0L;
            }
            return j11 / this.U;
        }
        return j10;
    }

    private String getProgressText() {
        return w.s(this.O, this.P, this.f7087f0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f7093v;
        if (rect.width() > 0 && this.e0 != -9223372036854775807L) {
            return (this.f7095x.width() * this.e0) / rect.width();
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.ui.e
    public final void a(long[] jArr, boolean[] zArr, int i6) {
        boolean z10;
        if (i6 != 0 && (jArr == null || zArr == null)) {
            z10 = false;
        } else {
            z10 = true;
        }
        sc.b.q(z10);
        this.f7089h0 = i6;
        this.f7090i0 = jArr;
        this.f7091j0 = zArr;
        g();
    }

    @Override // com.google.android.exoplayer2.ui.e
    public final void b(c.b bVar) {
        this.R.add(bVar);
    }

    public final boolean d(long j10) {
        long j11;
        long j12 = this.e0;
        if (j12 <= 0) {
            return false;
        }
        if (this.c0) {
            j11 = this.f7086d0;
        } else {
            j11 = this.f7087f0;
        }
        long j13 = j11;
        long i6 = w.i(j13 + j10, 0L, j12);
        if (i6 == j13) {
            return false;
        }
        if (!this.c0) {
            e(i6);
        } else {
            h(i6);
        }
        g();
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.E;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e(long j10) {
        this.f7086d0 = j10;
        this.c0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<e.a> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().j(j10);
        }
    }

    public final void f(boolean z10) {
        removeCallbacks(this.Q);
        this.c0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e.a> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().k(this.f7086d0, z10);
        }
    }

    public final void g() {
        long j10;
        Rect rect = this.f7094w;
        Rect rect2 = this.f7093v;
        rect.set(rect2);
        Rect rect3 = this.f7095x;
        rect3.set(rect2);
        if (this.c0) {
            j10 = this.f7086d0;
        } else {
            j10 = this.f7087f0;
        }
        if (this.e0 > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f7088g0) / this.e0)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j10) / this.e0)), rect2.right);
        } else {
            int i6 = rect2.left;
            rect.right = i6;
            rect3.right = i6;
        }
        invalidate(this.f7092u);
    }

    @Override // com.google.android.exoplayer2.ui.e
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f7093v.width() / this.T);
        if (width != 0) {
            long j10 = this.e0;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h(long j10) {
        if (this.f7086d0 == j10) {
            return;
        }
        this.f7086d0 = j10;
        Iterator<e.a> it = this.R.iterator();
        while (it.hasNext()) {
            it.next().d(j10);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i6;
        canvas.save();
        Rect rect = this.f7093v;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i10 = height + centerY;
        long j10 = this.e0;
        Paint paint2 = this.A;
        Rect rect2 = this.f7095x;
        if (j10 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i10, paint2);
        } else {
            Rect rect3 = this.f7094w;
            int i11 = rect3.left;
            int i12 = rect3.right;
            int max = Math.max(Math.max(rect.left, i12), rect2.right);
            int i13 = rect.right;
            if (max < i13) {
                canvas.drawRect(max, centerY, i13, i10, paint2);
            }
            int max2 = Math.max(i11, rect2.right);
            if (i12 > max2) {
                canvas.drawRect(max2, centerY, i12, i10, this.f7097z);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i10, this.f7096y);
            }
            if (this.f7089h0 != 0) {
                long[] jArr = this.f7090i0;
                jArr.getClass();
                boolean[] zArr = this.f7091j0;
                zArr.getClass();
                int i14 = this.I;
                int i15 = i14 / 2;
                int i16 = 0;
                int i17 = 0;
                while (i17 < this.f7089h0) {
                    long i18 = w.i(jArr[i17], 0L, this.e0);
                    int min = Math.min(rect.width() - i14, Math.max(i16, ((int) ((rect.width() * i18) / this.e0)) - i15)) + rect.left;
                    if (zArr[i17]) {
                        paint = this.C;
                    } else {
                        paint = this.B;
                    }
                    canvas.drawRect(min, centerY, min + i14, i10, paint);
                    i17++;
                    i14 = i14;
                    i16 = 0;
                }
            }
        }
        if (this.e0 > 0) {
            int h10 = w.h(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.E;
            if (drawable == null) {
                if (!this.c0 && !isFocused()) {
                    if (isEnabled()) {
                        i6 = this.J;
                    } else {
                        i6 = this.K;
                    }
                } else {
                    i6 = this.L;
                }
                canvas.drawCircle(h10, centerY2, (int) ((i6 * this.f7085b0) / 2.0f), this.D);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f7085b0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f7085b0)) / 2;
                drawable.setBounds(h10 - intrinsicWidth, centerY2 - intrinsicHeight, h10 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        super.onFocusChanged(z10, i6, rect);
        if (this.c0 && !z10) {
            f(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.e0 <= 0) {
            return;
        }
        if (w.f5205a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i6 != 66) {
                switch (i6) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (d(positionIncrement)) {
                            androidx.activity.b bVar = this.Q;
                            removeCallbacks(bVar);
                            postDelayed(bVar, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (d(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.c0) {
                f(false);
                return true;
            }
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int i13;
        int i14;
        Rect rect;
        int i15 = i11 - i6;
        int i16 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i15 - getPaddingRight();
        int i17 = this.H;
        int i18 = this.F;
        int i19 = this.G;
        int i20 = this.M;
        if (i17 == 1) {
            i13 = (i16 - getPaddingBottom()) - i19;
            i14 = ((i16 - getPaddingBottom()) - i18) - Math.max(i20 - (i18 / 2), 0);
        } else {
            i13 = (i16 - i19) / 2;
            i14 = (i16 - i18) / 2;
        }
        Rect rect2 = this.f7092u;
        rect2.set(paddingLeft, i13, paddingRight, i19 + i13);
        this.f7093v.set(rect2.left + i20, i14, rect2.right - i20, i18 + i14);
        if (w.f5205a >= 29 && ((rect = this.f7084a0) == null || rect.width() != i15 || this.f7084a0.height() != i16)) {
            Rect rect3 = new Rect(0, 0, i15, i16);
            this.f7084a0 = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        g();
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.G;
        if (mode == 0) {
            size = i11;
        } else if (mode != 1073741824) {
            size = Math.min(i11, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i6), size);
        Drawable drawable = this.E;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRtlPropertiesChanged(int i6) {
        boolean z10;
        boolean layoutDirection;
        Drawable drawable = this.E;
        if (drawable != null) {
            if (w.f5205a >= 23) {
                layoutDirection = drawable.setLayoutDirection(i6);
                if (layoutDirection) {
                    z10 = true;
                    if (!z10) {
                        invalidate();
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        if (isEnabled() && this.e0 > 0) {
            Point point = this.S;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i6 = point.x;
            int i10 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f7095x;
            Rect rect2 = this.f7093v;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.c0) {
                            if (i10 < this.N) {
                                int i11 = this.W;
                                rect.right = w.h(((i6 - i11) / 3) + i11, rect2.left, rect2.right);
                            } else {
                                this.W = i6;
                                rect.right = w.h(i6, rect2.left, rect2.right);
                            }
                            h(getScrubberPosition());
                            g();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.c0) {
                    if (motionEvent.getAction() == 3) {
                        z10 = true;
                    }
                    f(z10);
                    return true;
                }
            } else {
                int i12 = i6;
                if (this.f7092u.contains(i12, i10)) {
                    rect.right = w.h(i12, rect2.left, rect2.right);
                    e(getScrubberPosition());
                    g();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i6, Bundle bundle) {
        if (super.performAccessibilityAction(i6, bundle)) {
            return true;
        }
        if (this.e0 <= 0) {
            return false;
        }
        if (i6 == 8192) {
            if (d(-getPositionIncrement())) {
                f(false);
            }
        } else if (i6 != 4096) {
            return false;
        } else {
            if (d(getPositionIncrement())) {
                f(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i6) {
        this.B.setColor(i6);
        invalidate(this.f7092u);
    }

    public void setBufferedColor(int i6) {
        this.f7097z.setColor(i6);
        invalidate(this.f7092u);
    }

    @Override // com.google.android.exoplayer2.ui.e
    public void setBufferedPosition(long j10) {
        if (this.f7088g0 == j10) {
            return;
        }
        this.f7088g0 = j10;
        g();
    }

    @Override // com.google.android.exoplayer2.ui.e
    public void setDuration(long j10) {
        if (this.e0 == j10) {
            return;
        }
        this.e0 = j10;
        if (this.c0 && j10 == -9223372036854775807L) {
            f(true);
        }
        g();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.e
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.c0 && !z10) {
            f(true);
        }
    }

    public void setKeyCountIncrement(int i6) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.U = i6;
        this.V = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        this.U = -1;
        this.V = j10;
    }

    public void setPlayedAdMarkerColor(int i6) {
        this.C.setColor(i6);
        invalidate(this.f7092u);
    }

    public void setPlayedColor(int i6) {
        this.f7096y.setColor(i6);
        invalidate(this.f7092u);
    }

    @Override // com.google.android.exoplayer2.ui.e
    public void setPosition(long j10) {
        if (this.f7087f0 == j10) {
            return;
        }
        this.f7087f0 = j10;
        setContentDescription(getProgressText());
        g();
    }

    public void setScrubberColor(int i6) {
        this.D.setColor(i6);
        invalidate(this.f7092u);
    }

    public void setUnplayedColor(int i6) {
        this.A.setColor(i6);
        invalidate(this.f7092u);
    }
}
