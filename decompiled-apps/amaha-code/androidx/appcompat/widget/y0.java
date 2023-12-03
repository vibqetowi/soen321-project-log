package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.a1;
/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public final class y0 implements f.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a1 f1581u;

    public y0(a1 a1Var) {
        this.f1581u = a1Var;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        a1.a aVar = this.f1581u.f1346d;
        if (aVar != null) {
            return aVar.onMenuItemClick(menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
    }
}
