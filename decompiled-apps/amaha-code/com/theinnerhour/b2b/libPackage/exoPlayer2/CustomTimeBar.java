package com.theinnerhour.b2b.libPackage.exoPlayer2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c9.w;
import com.google.android.exoplayer2.ui.c;
import com.google.android.exoplayer2.ui.e;
import hc.d;
import hr.e8;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import sc.b;
/* loaded from: classes2.dex */
public class CustomTimeBar extends View implements e {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f11740f0 = 0;
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
    public final StringBuilder M;
    public final Formatter N;
    public final e8 O;
    public final CopyOnWriteArraySet<e.a> P;
    public final float Q;
    public int R;
    public long S;
    public Rect T;
    public boolean U;
    public long V;
    public long W;

    /* renamed from: a0  reason: collision with root package name */
    public long f11741a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f11742b0;
    public int c0;

    /* renamed from: d0  reason: collision with root package name */
    public long[] f11743d0;
    public boolean[] e0;

    /* renamed from: u  reason: collision with root package name */
    public final Rect f11744u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f11745v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f11746w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f11747x;

    /* renamed from: y  reason: collision with root package name */
    public final Paint f11748y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f11749z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public CustomTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ?? r22;
        Paint paint;
        this.f11744u = new Rect();
        this.f11745v = new Rect();
        this.f11746w = new Rect();
        this.f11747x = new Rect();
        Paint paint2 = new Paint();
        this.f11748y = paint2;
        Paint paint3 = new Paint();
        this.f11749z = paint3;
        Paint paint4 = new Paint();
        this.A = paint4;
        Paint paint5 = new Paint();
        this.B = paint5;
        Paint paint6 = new Paint();
        this.C = paint6;
        Paint paint7 = new Paint();
        this.D = paint7;
        paint7.setAntiAlias(true);
        this.P = new CopyOnWriteArraySet<>();
        new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.Q = f;
        int c10 = c(f, 4);
        int c11 = c(f, 26);
        int c12 = c(f, 4);
        int c13 = c(f, 12);
        int c14 = c(f, 0);
        int c15 = c(f, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, d.I, 0, 0);
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
                this.H = obtainStyledAttributes.getDimensionPixelSize(1, c12);
                this.I = obtainStyledAttributes.getDimensionPixelSize(11, c13);
                this.J = obtainStyledAttributes.getDimensionPixelSize(8, c14);
                this.K = obtainStyledAttributes.getDimensionPixelSize(9, c15);
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
            this.H = c12;
            this.I = c13;
            this.J = c14;
            this.K = c15;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            paint6.setColor(872414976);
            this.E = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.M = sb2;
        this.N = new Formatter(sb2, Locale.getDefault());
        this.O = new e8(4, this);
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            r22 = 1;
            this.L = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            r22 = 1;
            this.L = (Math.max(this.J, Math.max(this.I, this.K)) + 1) / 2;
        }
        this.W = -9223372036854775807L;
        this.S = -9223372036854775807L;
        this.R = 20;
        setFocusable((boolean) r22);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(r22);
        }
    }

    public static int c(float f, int i6) {
        return (int) ((i6 * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.S;
        if (j10 == -9223372036854775807L) {
            long j11 = this.W;
            if (j11 == -9223372036854775807L) {
                return 0L;
            }
            return j11 / this.R;
        }
        return j10;
    }

    private String getProgressText() {
        return w.s(this.M, this.N, this.f11741a0);
    }

    private long getScrubberPosition() {
        Rect rect = this.f11745v;
        if (rect.width() > 0 && this.W != -9223372036854775807L) {
            return (this.f11747x.width() * this.W) / rect.width();
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
        b.q(z10);
        this.c0 = i6;
        this.f11743d0 = jArr;
        this.e0 = zArr;
        f();
    }

    @Override // com.google.android.exoplayer2.ui.e
    public final void b(c.b bVar) {
        this.P.add(bVar);
    }

    public final boolean d(long j10) {
        long j11;
        long j12 = this.W;
        if (j12 <= 0) {
            return false;
        }
        if (this.U) {
            j11 = this.V;
        } else {
            j11 = this.f11741a0;
        }
        long j13 = j11;
        long i6 = w.i(j13 + j10, 0L, j12);
        if (i6 == j13) {
            return false;
        }
        boolean z10 = this.U;
        CopyOnWriteArraySet<e.a> copyOnWriteArraySet = this.P;
        if (!z10) {
            this.V = i6;
            this.U = true;
            setPressed(true);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            Iterator<e.a> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().j(i6);
            }
        } else if (this.V != i6) {
            this.V = i6;
            Iterator<e.a> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().d(i6);
            }
        }
        f();
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

    public final void e(boolean z10) {
        removeCallbacks(this.O);
        this.U = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e.a> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().k(this.V, z10);
        }
    }

    public final void f() {
        long j10;
        Rect rect = this.f11746w;
        Rect rect2 = this.f11745v;
        rect.set(rect2);
        Rect rect3 = this.f11747x;
        rect3.set(rect2);
        if (this.U) {
            j10 = this.V;
        } else {
            j10 = this.f11741a0;
        }
        if (this.W > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f11742b0) / this.W)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j10) / this.W)), rect2.right);
        } else {
            int i6 = rect2.left;
            rect.right = i6;
            rect3.right = i6;
        }
        invalidate(this.f11744u);
    }

    @Override // com.google.android.exoplayer2.ui.e
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f11745v.width() / this.Q);
        if (width != 0) {
            long j10 = this.W;
            if (j10 != 0 && j10 != -9223372036854775807L) {
                return j10 / width;
            }
        }
        return Long.MAX_VALUE;
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
        Rect rect = this.f11745v;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i10 = height + centerY;
        long j10 = this.W;
        Paint paint2 = this.A;
        Rect rect2 = this.f11747x;
        if (j10 <= 0) {
            canvas.drawRoundRect(new RectF(rect.left, centerY, rect.right, i10), 20.0f, 20.0f, paint2);
        } else {
            Rect rect3 = this.f11746w;
            int i11 = rect3.left;
            int i12 = rect3.right;
            if (Math.max(Math.max(rect.left, i12), rect2.right) < rect.right) {
                canvas.drawRoundRect(new RectF(rect.left, centerY, rect.right, i10), 20.0f, 20.0f, paint2);
            }
            if (i12 > Math.max(i11, rect2.right)) {
                canvas.drawRoundRect(new RectF(rect.left, centerY, i12, i10), 20.0f, 20.0f, this.f11749z);
            }
            if (rect2.width() > 0) {
                canvas.drawRoundRect(new RectF(rect2.left, centerY, rect2.right, i10), 20.0f, 20.0f, this.f11748y);
            }
            if (this.c0 != 0) {
                long[] jArr = this.f11743d0;
                jArr.getClass();
                boolean[] zArr = this.e0;
                zArr.getClass();
                int i13 = this.H;
                int i14 = i13 / 2;
                int i15 = 0;
                int i16 = 0;
                while (i16 < this.c0) {
                    long i17 = w.i(jArr[i16], 0L, this.W);
                    int min = Math.min(rect.width() - i13, Math.max(i15, ((int) ((rect.width() * i17) / this.W)) - i14)) + rect.left;
                    if (zArr[i16]) {
                        paint = this.C;
                    } else {
                        paint = this.B;
                    }
                    canvas.drawRoundRect(new RectF(min, centerY, min + i13, i10), 10.0f, 10.0f, paint);
                    i16++;
                    centerY = centerY;
                    i15 = 0;
                }
            }
        }
        if (this.W > 0) {
            int h10 = w.h(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.E;
            if (drawable == null) {
                if (!this.U && !isFocused()) {
                    if (isEnabled()) {
                        i6 = this.I;
                    } else {
                        i6 = this.J;
                    }
                } else {
                    i6 = this.K;
                }
                canvas.drawCircle(h10, centerY2, i6 / 2, this.D);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                drawable.setBounds(h10 - intrinsicWidth, centerY2 - intrinsicHeight, h10 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i6, Rect rect) {
        super.onFocusChanged(z10, i6, rect);
        if (this.U && !z10) {
            e(false);
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
        if (this.W <= 0) {
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
                            e8 e8Var = this.O;
                            removeCallbacks(e8Var);
                            postDelayed(e8Var, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (d(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.U) {
                e(false);
                return true;
            }
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        Rect rect;
        int i13 = i11 - i6;
        int i14 = i12 - i10;
        int i15 = this.G;
        int i16 = (i14 - i15) / 2;
        int i17 = this.F;
        int i18 = ((i15 - i17) / 2) + i16;
        Rect rect2 = this.f11744u;
        rect2.set(getPaddingLeft(), i16, i13 - getPaddingRight(), i15 + i16);
        int i19 = rect2.left;
        int i20 = this.L;
        this.f11745v.set(i19 + i20, i18, rect2.right - i20, i17 + i18);
        if (w.f5205a >= 29 && ((rect = this.T) == null || rect.width() != i13 || this.T.height() != i14)) {
            Rect rect3 = new Rect(0, 0, i13, i14);
            this.T = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        f();
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

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i6, Bundle bundle) {
        if (super.performAccessibilityAction(i6, bundle)) {
            return true;
        }
        if (this.W <= 0) {
            return false;
        }
        if (i6 == 8192) {
            if (d(-getPositionIncrement())) {
                e(false);
            }
        } else if (i6 != 4096) {
            return false;
        } else {
            if (d(getPositionIncrement())) {
                e(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i6) {
        this.B.setColor(i6);
        invalidate(this.f11744u);
    }

    public void setBufferedColor(int i6) {
        this.f11749z.setColor(i6);
        invalidate(this.f11744u);
    }

    @Override // com.google.android.exoplayer2.ui.e
    public void setBufferedPosition(long j10) {
        this.f11742b0 = j10;
        f();
    }

    @Override // com.google.android.exoplayer2.ui.e
    public void setDuration(long j10) {
        this.W = j10;
        if (this.U && j10 == -9223372036854775807L) {
            e(true);
        }
        f();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.e
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.U && !z10) {
            e(true);
        }
    }

    public void setKeyCountIncrement(int i6) {
        boolean z10;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b.q(z10);
        this.R = i6;
        this.S = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        boolean z10;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b.q(z10);
        this.R = -1;
        this.S = j10;
    }

    public void setPlayedAdMarkerColor(int i6) {
        this.C.setColor(i6);
        invalidate(this.f11744u);
    }

    public void setPlayedColor(int i6) {
        this.f11748y.setColor(i6);
        invalidate(this.f11744u);
    }

    @Override // com.google.android.exoplayer2.ui.e
    public void setPosition(long j10) {
        this.f11741a0 = j10;
        setContentDescription(getProgressText());
        f();
    }

    public void setScrubberColor(int i6) {
        this.D.setColor(i6);
        invalidate(this.f11744u);
    }

    public void setUnplayedColor(int i6) {
        this.A.setColor(i6);
        invalidate(this.f11744u);
    }
}
