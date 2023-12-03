package pb;

import android.view.ViewTreeObserver;
/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.d f28099u;

    public c(com.google.android.material.floatingactionbutton.d dVar) {
        this.f28099u = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.google.android.material.floatingactionbutton.d dVar = this.f28099u;
        float rotation = dVar.f9059v.getRotation();
        if (dVar.f9053o != rotation) {
            dVar.f9053o = rotation;
            dVar.p();
            return true;
        }
        return true;
    }
}
