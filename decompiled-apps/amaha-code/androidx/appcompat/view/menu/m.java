package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.f;
/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public class m extends f implements SubMenu {
    public final h A;

    /* renamed from: z  reason: collision with root package name */
    public final f f1162z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f1162z = fVar;
        this.A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.f1162z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        if (!super.e(fVar, menuItem) && !this.f1162z.e(fVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(h hVar) {
        return this.f1162z.f(hVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final String j() {
        int i6;
        h hVar = this.A;
        if (hVar != null) {
            i6 = hVar.f1118a;
        } else {
            i6 = 0;
        }
        if (i6 == 0) {
            return null;
        }
        return defpackage.c.p("android:menu:actionviewstates:", i6);
    }

    @Override // androidx.appcompat.view.menu.f
    public final f k() {
        return this.f1162z.k();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
        return this.f1162z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
        return this.f1162z.n();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.f1162z.o();
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z10) {
        this.f1162z.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f1162z.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.f
    public final void w(f.a aVar) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i6) {
        x(0, null, i6, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i6) {
        x(i6, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i6) {
        this.A.setIcon(i6);
        return this;
    }
}
