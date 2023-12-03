package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b.d f1074u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MenuItem f1075v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f1076w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b.c f1077x;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f1077x = cVar;
        this.f1074u = dVar;
        this.f1075v = hVar;
        this.f1076w = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f1074u;
        if (dVar != null) {
            b.c cVar = this.f1077x;
            b.this.U = true;
            dVar.f1072b.c(false);
            b.this.U = false;
        }
        MenuItem menuItem = this.f1075v;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f1076w.q(menuItem, null, 4);
        }
    }
}
