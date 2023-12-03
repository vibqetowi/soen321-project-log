package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.t0;
import o0.d;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f2170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0.b f2171b;

    public f(Animator animator, t0.b bVar) {
        this.f2170a = animator;
        this.f2171b = bVar;
    }

    @Override // o0.d.a
    public final void onCancel() {
        this.f2170a.end();
        if (y.P(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f2171b + " has been canceled.");
        }
    }
}
