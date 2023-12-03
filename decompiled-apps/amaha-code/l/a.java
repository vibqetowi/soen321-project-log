package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g0.a;
import k0.a;
/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public final class a implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f23959a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f23960b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f23961c;

    /* renamed from: d  reason: collision with root package name */
    public char f23962d;
    public char f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f23965h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f23966i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f23967j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f23968k;

    /* renamed from: e  reason: collision with root package name */
    public int f23963e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f23964g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f23969l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f23970m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23971n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f23972o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f23973p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f23966i = context;
        this.f23959a = charSequence;
    }

    @Override // m0.b
    public final m0.b a(t0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // m0.b
    public final t0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f23965h;
        if (drawable != null) {
            if (this.f23971n || this.f23972o) {
                Drawable g5 = k0.a.g(drawable);
                this.f23965h = g5;
                Drawable mutate = g5.mutate();
                this.f23965h = mutate;
                if (this.f23971n) {
                    a.b.h(mutate, this.f23969l);
                }
                if (this.f23972o) {
                    a.b.i(this.f23965h, this.f23970m);
                }
            }
        }
    }

    @Override // m0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // m0.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // m0.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // m0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f23964g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f;
    }

    @Override // m0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f23967j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f23965h;
    }

    @Override // m0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f23969l;
    }

    @Override // m0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f23970m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f23961c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f23963e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f23962d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f23959a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f23960b;
        if (charSequence == null) {
            return this.f23959a;
        }
        return charSequence;
    }

    @Override // m0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f23968k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // m0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f23973p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f23973p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f23973p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f23973p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f23973p = (z10 ? 1 : 0) | (this.f23973p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i6;
        int i10 = this.f23973p & (-3);
        if (z10) {
            i6 = 2;
        } else {
            i6 = 0;
        }
        this.f23973p = i6 | i10;
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f23967j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        int i6;
        int i10 = this.f23973p & (-17);
        if (z10) {
            i6 = 16;
        } else {
            i6 = 0;
        }
        this.f23973p = i6 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f23965h = drawable;
        c();
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f23969l = colorStateList;
        this.f23971n = true;
        c();
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f23970m = mode;
        this.f23972o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f23961c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f23962d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f23962d = c10;
        this.f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f23959a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f23960b = charSequence;
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f23968k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i6 = 8;
        int i10 = this.f23973p & 8;
        if (z10) {
            i6 = 0;
        }
        this.f23973p = i10 | i6;
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i6) {
        this.f = Character.toLowerCase(c10);
        this.f23964g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final m0.b setContentDescription(CharSequence charSequence) {
        this.f23967j = charSequence;
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i6) {
        this.f23962d = c10;
        this.f23963e = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        this.f23959a = this.f23966i.getResources().getString(i6);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final m0.b setTooltipText(CharSequence charSequence) {
        this.f23968k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        Object obj = g0.a.f16164a;
        this.f23965h = a.c.b(this.f23966i, i6);
        c();
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i6, int i10) {
        this.f23962d = c10;
        this.f23963e = KeyEvent.normalizeMetaState(i6);
        this.f = Character.toLowerCase(c11);
        this.f23964g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final void setShowAsAction(int i6) {
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        return this;
    }
}
