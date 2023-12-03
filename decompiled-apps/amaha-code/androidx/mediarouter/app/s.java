package androidx.mediarouter.app;

import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.p;
import java.util.Collections;
import r1.g;
import r1.l;
/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes.dex */
public final class s implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p.h.a f2670u;

    public s(p.h.a aVar) {
        this.f2670u = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        p.h.a aVar = this.f2670u;
        r1.l lVar = p.this.f2631y;
        l.g gVar = aVar.f2655z;
        lVar.getClass();
        r1.l.b();
        l.d dVar = r1.l.f30291d;
        if (dVar.r instanceof g.b) {
            l.g.a a10 = dVar.f30313q.a(gVar);
            if (a10 != null) {
                g.b.a aVar2 = a10.f30361a;
                if (aVar2 != null && aVar2.f30273e) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((g.b) dVar.r).o(Collections.singletonList(gVar.f30342b));
                    aVar.f2651v.setVisibility(4);
                    aVar.f2652w.setVisibility(0);
                    return;
                }
            }
            Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
            aVar.f2651v.setVisibility(4);
            aVar.f2652w.setVisibility(0);
            return;
        }
        throw new IllegalStateException("There is no currently selected dynamic group route.");
    }
}
