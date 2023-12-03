package androidx.lifecycle;

import androidx.lifecycle.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements n {

    /* renamed from: u  reason: collision with root package name */
    public final String f2375u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2376v = false;

    /* renamed from: w  reason: collision with root package name */
    public final d0 f2377w;

    public SavedStateHandleController(String str, d0 d0Var) {
        this.f2375u = str;
        this.f2377w = d0Var;
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        if (bVar == j.b.ON_DESTROY) {
            this.f2376v = false;
            pVar.getLifecycle().c(this);
        }
    }
}
