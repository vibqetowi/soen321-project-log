package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.fragment.app.t0;
import o0.d;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class h implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2187a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2188b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m.a f2189c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t0.b f2190d;

    public h(View view, ViewGroup viewGroup, m.a aVar, t0.b bVar) {
        this.f2187a = view;
        this.f2188b = viewGroup;
        this.f2189c = aVar;
        this.f2190d = bVar;
    }

    @Override // o0.d.a
    public final void onCancel() {
        View view = this.f2187a;
        view.clearAnimation();
        this.f2188b.endViewTransition(view);
        this.f2189c.a();
        if (y.P(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2190d + " has been cancelled.");
        }
    }
}
