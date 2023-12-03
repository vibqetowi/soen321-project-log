package androidx.lifecycle;

import androidx.lifecycle.j;
import kotlin.Metadata;
/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/n;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements n {

    /* renamed from: u  reason: collision with root package name */
    public final f0 f2374u;

    public SavedStateHandleAttacher(f0 f0Var) {
        this.f2374u = f0Var;
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        boolean z10;
        if (bVar == j.b.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pVar.getLifecycle().c(this);
            f0 f0Var = this.f2374u;
            if (!f0Var.f2405b) {
                f0Var.f2406c = f0Var.f2404a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                f0Var.f2405b = true;
                g0 g0Var = (g0) f0Var.f2407d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + bVar).toString());
    }
}
