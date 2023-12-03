package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import t.h;
/* compiled from: MenuWrapperICS.java */
/* loaded from: classes.dex */
public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final m0.a f23988d;

    public e(Context context, m0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f23988d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f23988d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f23988d.addIntentOptions(i6, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = c(menuItemArr2[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f23988d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        h<m0.b, MenuItem> hVar = this.f23975b;
        if (hVar != null) {
            hVar.clear();
        }
        h<m0.c, SubMenu> hVar2 = this.f23976c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f23988d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f23988d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        return c(this.f23988d.findItem(i6));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return c(this.f23988d.getItem(i6));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f23988d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return this.f23988d.isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i10) {
        return this.f23988d.performIdentifierAction(i6, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i10) {
        return this.f23988d.performShortcut(i6, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        if (this.f23975b != null) {
            int i10 = 0;
            while (true) {
                h<m0.b, MenuItem> hVar = this.f23975b;
                if (i10 >= hVar.f32260w) {
                    break;
                }
                if (hVar.i(i10).getGroupId() == i6) {
                    this.f23975b.k(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f23988d.removeGroup(i6);
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        if (this.f23975b != null) {
            int i10 = 0;
            while (true) {
                h<m0.b, MenuItem> hVar = this.f23975b;
                if (i10 >= hVar.f32260w) {
                    break;
                } else if (hVar.i(i10).getItemId() == i6) {
                    this.f23975b.k(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f23988d.removeItem(i6);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z10, boolean z11) {
        this.f23988d.setGroupCheckable(i6, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z10) {
        this.f23988d.setGroupEnabled(i6, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z10) {
        this.f23988d.setGroupVisible(i6, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f23988d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f23988d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return c(this.f23988d.add(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return d(this.f23988d.addSubMenu(i6));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i10, int i11, CharSequence charSequence) {
        return c(this.f23988d.add(i6, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, CharSequence charSequence) {
        return d(this.f23988d.addSubMenu(i6, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i10, int i11, int i12) {
        return c(this.f23988d.add(i6, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, int i12) {
        return d(this.f23988d.addSubMenu(i6, i10, i11, i12));
    }
}
