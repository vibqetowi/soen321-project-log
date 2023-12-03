package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import t.h;
/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23974a;

    /* renamed from: b  reason: collision with root package name */
    public h<m0.b, MenuItem> f23975b;

    /* renamed from: c  reason: collision with root package name */
    public h<m0.c, SubMenu> f23976c;

    public b(Context context) {
        this.f23974a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof m0.b) {
            m0.b bVar = (m0.b) menuItem;
            if (this.f23975b == null) {
                this.f23975b = new h<>();
            }
            MenuItem orDefault = this.f23975b.getOrDefault(bVar, null);
            if (orDefault == null) {
                c cVar = new c(this.f23974a, bVar);
                this.f23975b.put(bVar, cVar);
                return cVar;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof m0.c) {
            m0.c cVar = (m0.c) subMenu;
            if (this.f23976c == null) {
                this.f23976c = new h<>();
            }
            SubMenu orDefault = this.f23976c.getOrDefault(cVar, null);
            if (orDefault == null) {
                g gVar = new g(this.f23974a, cVar);
                this.f23976c.put(cVar, gVar);
                return gVar;
            }
            return orDefault;
        }
        return subMenu;
    }
}
