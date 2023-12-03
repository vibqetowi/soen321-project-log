package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;
/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class l0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2229a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2230b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2231c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2232d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f2233e;
    public final /* synthetic */ ArrayList f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k0 f2234g;

    public l0(k0 k0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2234g = k0Var;
        this.f2229a = obj;
        this.f2230b = arrayList;
        this.f2233e = obj2;
        this.f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        k0 k0Var = this.f2234g;
        Object obj = this.f2229a;
        if (obj != null) {
            k0Var.t(obj, this.f2230b, null);
        }
        Object obj2 = this.f2231c;
        if (obj2 != null) {
            k0Var.t(obj2, this.f2232d, null);
        }
        Object obj3 = this.f2233e;
        if (obj3 != null) {
            k0Var.t(obj3, this.f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
