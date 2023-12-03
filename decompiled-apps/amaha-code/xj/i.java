package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.widget.FrameLayout;
import hs.k;
/* compiled from: SpotlightView.kt */
/* loaded from: classes.dex */
public final class i extends FrameLayout {
    public j A;

    /* renamed from: u  reason: collision with root package name */
    public final hs.i f37828u;

    /* renamed from: v  reason: collision with root package name */
    public final hs.i f37829v;

    /* renamed from: w  reason: collision with root package name */
    public final hs.i f37830w;

    /* renamed from: x  reason: collision with root package name */
    public final g f37831x;

    /* renamed from: y  reason: collision with root package name */
    public ValueAnimator f37832y;

    /* renamed from: z  reason: collision with root package name */
    public ValueAnimator f37833z;

    /* compiled from: SpotlightView.kt */
    /* loaded from: classes.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f37834a;

        public a(ValueAnimator valueAnimator) {
            this.f37834a = valueAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ValueAnimator valueAnimator = this.f37834a;
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ValueAnimator valueAnimator = this.f37834a;
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    /* compiled from: SpotlightView.kt */
    /* loaded from: classes.dex */
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f37835a;

        public b(ValueAnimator valueAnimator) {
            this.f37835a = valueAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ValueAnimator valueAnimator = this.f37835a;
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ValueAnimator valueAnimator = this.f37835a;
            valueAnimator.removeAllListeners();
            valueAnimator.removeAllUpdateListeners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Activity context, int i6) {
        super(context, null, 0);
        kotlin.jvm.internal.i.g(context, "context");
        this.f37828u = sp.b.O(new d(i6));
        this.f37829v = sp.b.O(h.f37827u);
        this.f37830w = sp.b.O(e.f37824u);
        this.f37831x = new g(this);
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.f37828u.getValue();
    }

    private final Paint getEffectPaint() {
        return (Paint) this.f37830w.getValue();
    }

    private final Paint getShapePaint() {
        return (Paint) this.f37829v.getValue();
    }

    public final void a(j target) {
        kotlin.jvm.internal.i.g(target, "target");
        removeAllViews();
        addView(target.f37839d, -1, -1);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        PointF pointF = new PointF(iArr[0], iArr[1]);
        target.f37836a.offset(-pointF.x, -pointF.y);
        k kVar = k.f19476a;
        this.A = target;
        ValueAnimator valueAnimator = this.f37832y;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f37832y;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.f37832y;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        zj.c cVar = target.f37837b;
        ofFloat.setDuration(cVar.getDuration());
        ofFloat.setInterpolator(cVar.a());
        g gVar = this.f37831x;
        ofFloat.addUpdateListener(gVar);
        ofFloat.addListener(new a(ofFloat));
        this.f37832y = ofFloat;
        ValueAnimator valueAnimator4 = this.f37833z;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator valueAnimator5 = this.f37833z;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator6 = this.f37833z;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setStartDelay(cVar.getDuration());
        yj.a aVar = target.f37838c;
        ofFloat2.setDuration(aVar.getDuration());
        ofFloat2.setInterpolator(aVar.a());
        ofFloat2.setRepeatMode(aVar.r());
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(gVar);
        ofFloat2.addListener(new b(ofFloat2));
        this.f37833z = ofFloat2;
        ValueAnimator valueAnimator7 = this.f37832y;
        if (valueAnimator7 != null) {
            valueAnimator7.start();
        }
        ValueAnimator valueAnimator8 = this.f37833z;
        if (valueAnimator8 != null) {
            valueAnimator8.start();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.i.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundPaint());
        j jVar = this.A;
        ValueAnimator valueAnimator = this.f37832y;
        ValueAnimator valueAnimator2 = this.f37833z;
        if (jVar != null && valueAnimator2 != null && valueAnimator != null && !valueAnimator.isRunning()) {
            Object animatedValue = valueAnimator2.getAnimatedValue();
            if (animatedValue != null) {
                ((Float) animatedValue).floatValue();
                jVar.f37838c.b(canvas, jVar.f37836a, getEffectPaint());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }
        }
        if (jVar != null && valueAnimator != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if (animatedValue2 != null) {
                jVar.f37837b.b(canvas, jVar.f37836a, ((Float) animatedValue2).floatValue(), getShapePaint());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
    }
}
