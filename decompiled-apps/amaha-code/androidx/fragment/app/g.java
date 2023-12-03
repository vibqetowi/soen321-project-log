package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class g implements Animation.AnimationListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t0.b f2178u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2179v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f2180w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m.a f2181x;

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.f2179v.endViewTransition(gVar.f2180w);
            gVar.f2181x.a();
        }
    }

    public g(View view, ViewGroup viewGroup, m.a aVar, t0.b bVar) {
        this.f2178u = bVar;
        this.f2179v = viewGroup;
        this.f2180w = view;
        this.f2181x = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2179v.post(new a());
        if (y.P(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2178u + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (y.P(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2178u + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
