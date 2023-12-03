package sb;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import sb.g;
/* compiled from: NavigationBarView.java */
/* loaded from: classes.dex */
public final class f implements f.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f31409u;

    public f(BottomNavigationView bottomNavigationView) {
        this.f31409u = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        g gVar = this.f31409u;
        gVar.getClass();
        g.b bVar = gVar.f31414y;
        if (bVar != null && !bVar.c(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
    }
}
