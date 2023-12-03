package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2160b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2161c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t0.b f2162d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m.a f2163e;

    public e(ViewGroup viewGroup, View view, boolean z10, t0.b bVar, m.a aVar) {
        this.f2159a = viewGroup;
        this.f2160b = view;
        this.f2161c = z10;
        this.f2162d = bVar;
        this.f2163e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f2159a;
        View view = this.f2160b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f2161c;
        t0.b bVar = this.f2162d;
        if (z10) {
            defpackage.c.a(bVar.f2285a, view);
        }
        this.f2163e.a();
        if (y.P(2)) {
            Log.v("FragmentManager", "Animator from operation " + bVar + " has ended.");
        }
    }
}
