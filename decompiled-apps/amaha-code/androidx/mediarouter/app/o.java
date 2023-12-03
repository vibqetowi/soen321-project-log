package androidx.mediarouter.app;

import android.view.View;
import androidx.mediarouter.app.n;
import r1.l;
/* compiled from: MediaRouteDynamicChooserDialog.java */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l.g f2619u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n.d.c f2620v;

    public o(n.d.c cVar, l.g gVar) {
        this.f2620v = cVar;
        this.f2619u = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l.g gVar = this.f2619u;
        gVar.getClass();
        r1.l.b();
        r1.l.f30291d.j(gVar, 3);
        n.d.c cVar = this.f2620v;
        cVar.f2614v.setVisibility(4);
        cVar.f2615w.setVisibility(0);
    }
}
