package qb;

import android.content.Context;
import android.view.SubMenu;
/* compiled from: NavigationMenu.java */
/* loaded from: classes.dex */
public final class i extends androidx.appcompat.view.menu.f {
    public i(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, CharSequence charSequence) {
        androidx.appcompat.view.menu.h a10 = a(i6, i10, i11, charSequence);
        l lVar = new l(this.f1093a, this, a10);
        a10.f1131o = lVar;
        lVar.setHeaderTitle(a10.f1122e);
        return lVar;
    }
}
