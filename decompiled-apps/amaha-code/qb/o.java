package qb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* compiled from: StateListAnimator.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f29483a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f29484b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f29485c = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            if (oVar.f29484b == animator) {
                oVar.f29484b = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes.dex */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f29485c);
        this.f29483a.add(bVar);
    }
}
