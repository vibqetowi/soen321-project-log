package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* compiled from: SubMenuWrapperICS.java */
/* loaded from: classes.dex */
public final class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final m0.c f23989e;

    public g(Context context, m0.c cVar) {
        super(context, cVar);
        this.f23989e = cVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f23989e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return c(this.f23989e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i6) {
        this.f23989e.setHeaderIcon(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i6) {
        this.f23989e.setHeaderTitle(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f23989e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i6) {
        this.f23989e.setIcon(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f23989e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f23989e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f23989e.setIcon(drawable);
        return this;
    }
}
