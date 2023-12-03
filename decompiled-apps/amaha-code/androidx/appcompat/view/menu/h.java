package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import k0.a;
import t0.b;
/* compiled from: MenuItemImpl.java */
/* loaded from: classes.dex */
public final class h implements m0.b {
    public t0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a  reason: collision with root package name */
    public final int f1118a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1119b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1120c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1121d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1122e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f1123g;

    /* renamed from: h  reason: collision with root package name */
    public char f1124h;

    /* renamed from: j  reason: collision with root package name */
    public char f1126j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f1128l;

    /* renamed from: n  reason: collision with root package name */
    public final f f1130n;

    /* renamed from: o  reason: collision with root package name */
    public m f1131o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f1132p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f1133q;
    public CharSequence r;

    /* renamed from: y  reason: collision with root package name */
    public int f1140y;

    /* renamed from: z  reason: collision with root package name */
    public View f1141z;

    /* renamed from: i  reason: collision with root package name */
    public int f1125i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f1127k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f1129m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f1134s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f1135t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1136u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1137v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1138w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f1139x = 16;
    public boolean C = false;

    /* compiled from: MenuItemImpl.java */
    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i6, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f1130n = fVar;
        this.f1118a = i10;
        this.f1119b = i6;
        this.f1120c = i11;
        this.f1121d = i12;
        this.f1122e = charSequence;
        this.f1140y = i13;
    }

    public static void c(int i6, int i10, String str, StringBuilder sb2) {
        if ((i6 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // m0.b
    public final m0.b a(t0.b bVar) {
        t0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f32273b = null;
        }
        this.f1141z = null;
        this.A = bVar;
        this.f1130n.p(true);
        t0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // m0.b
    public final t0.b b() {
        return this.A;
    }

    @Override // m0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f1140y & 8) == 0) {
            return false;
        }
        if (this.f1141z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f1130n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f1138w && (this.f1136u || this.f1137v)) {
            drawable = k0.a.g(drawable).mutate();
            if (this.f1136u) {
                a.b.h(drawable, this.f1134s);
            }
            if (this.f1137v) {
                a.b.i(drawable, this.f1135t);
            }
            this.f1138w = false;
        }
        return drawable;
    }

    public final boolean e() {
        t0.b bVar;
        if ((this.f1140y & 8) == 0) {
            return false;
        }
        if (this.f1141z == null && (bVar = this.A) != null) {
            this.f1141z = bVar.d(this);
        }
        if (this.f1141z == null) {
            return false;
        }
        return true;
    }

    @Override // m0.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f1130n.f(this);
    }

    public final void f(boolean z10) {
        int i6;
        int i10 = this.f1139x & (-5);
        if (z10) {
            i6 = 4;
        } else {
            i6 = 0;
        }
        this.f1139x = i6 | i10;
    }

    public final void g(boolean z10) {
        if (z10) {
            this.f1139x |= 32;
        } else {
            this.f1139x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // m0.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f1141z;
        if (view != null) {
            return view;
        }
        t0.b bVar = this.A;
        if (bVar != null) {
            View d10 = bVar.d(this);
            this.f1141z = d10;
            return d10;
        }
        return null;
    }

    @Override // m0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f1127k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f1126j;
    }

    @Override // m0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f1133q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f1119b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f1128l;
        if (drawable != null) {
            return d(drawable);
        }
        int i6 = this.f1129m;
        if (i6 != 0) {
            Drawable H = hc.d.H(this.f1130n.f1093a, i6);
            this.f1129m = 0;
            this.f1128l = H;
            return d(H);
        }
        return null;
    }

    @Override // m0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f1134s;
    }

    @Override // m0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f1135t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f1123g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f1118a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f1125i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f1124h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f1120c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f1131o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f1122e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            return this.f1122e;
        }
        return charSequence;
    }

    @Override // m0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f1131o != null) {
            return true;
        }
        return false;
    }

    @Override // m0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f1139x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f1139x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f1139x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        t0.b bVar = this.A;
        if (bVar != null && bVar.g()) {
            if ((this.f1139x & 8) == 0 && this.A.b()) {
                return true;
            }
            return false;
        } else if ((this.f1139x & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i6;
        this.f1141z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i6 = this.f1118a) > 0) {
            view.setId(i6);
        }
        f fVar = this.f1130n;
        fVar.f1102k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1126j == c10) {
            return this;
        }
        this.f1126j = Character.toLowerCase(c10);
        this.f1130n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i6 = this.f1139x;
        int i10 = (z10 ? 1 : 0) | (i6 & (-2));
        this.f1139x = i10;
        if (i6 != i10) {
            this.f1130n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        boolean z11;
        int i6;
        int i10 = this.f1139x;
        int i11 = i10 & 4;
        f fVar = this.f1130n;
        int i12 = 2;
        if (i11 != 0) {
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f;
            int size = arrayList.size();
            fVar.z();
            for (int i13 = 0; i13 < size; i13++) {
                h hVar = arrayList.get(i13);
                if (hVar.f1119b == this.f1119b) {
                    boolean z12 = true;
                    if ((hVar.f1139x & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z12 = false;
                        }
                        int i14 = hVar.f1139x;
                        int i15 = i14 & (-3);
                        if (z12) {
                            i6 = 2;
                        } else {
                            i6 = 0;
                        }
                        int i16 = i6 | i15;
                        hVar.f1139x = i16;
                        if (i14 != i16) {
                            hVar.f1130n.p(false);
                        }
                    }
                }
            }
            fVar.y();
        } else {
            int i17 = i10 & (-3);
            if (!z10) {
                i12 = 0;
            }
            int i18 = i12 | i17;
            this.f1139x = i18;
            if (i10 != i18) {
                fVar.p(false);
            }
        }
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1139x |= 16;
        } else {
            this.f1139x &= -17;
        }
        this.f1130n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f1129m = 0;
        this.f1128l = drawable;
        this.f1138w = true;
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1134s = colorStateList;
        this.f1136u = true;
        this.f1138w = true;
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1135t = mode;
        this.f1137v = true;
        this.f1138w = true;
        this.f1130n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f1123g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f1124h == c10) {
            return this;
        }
        this.f1124h = c10;
        this.f1130n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1132p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f1124h = c10;
        this.f1126j = Character.toLowerCase(c11);
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final void setShowAsAction(int i6) {
        int i10 = i6 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1140y = i6;
        f fVar = this.f1130n;
        fVar.f1102k = true;
        fVar.p(true);
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1122e = charSequence;
        this.f1130n.p(false);
        m mVar = this.f1131o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i6;
        int i10 = this.f1139x;
        int i11 = i10 & (-9);
        boolean z11 = false;
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        int i12 = i6 | i11;
        this.f1139x = i12;
        if (i10 != i12) {
            z11 = true;
        }
        if (z11) {
            f fVar = this.f1130n;
            fVar.f1099h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f1122e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // m0.b, android.view.MenuItem
    public final m0.b setContentDescription(CharSequence charSequence) {
        this.f1133q = charSequence;
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final m0.b setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i6) {
        if (this.f1126j == c10 && this.f1127k == i6) {
            return this;
        }
        this.f1126j = Character.toLowerCase(c10);
        this.f1127k = KeyEvent.normalizeMetaState(i6);
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i6) {
        if (this.f1124h == c10 && this.f1125i == i6) {
            return this;
        }
        this.f1124h = c10;
        this.f1125i = KeyEvent.normalizeMetaState(i6);
        this.f1130n.p(false);
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i6, int i10) {
        this.f1124h = c10;
        this.f1125i = KeyEvent.normalizeMetaState(i6);
        this.f1126j = Character.toLowerCase(c11);
        this.f1127k = KeyEvent.normalizeMetaState(i10);
        this.f1130n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f1128l = null;
        this.f1129m = i6;
        this.f1138w = true;
        this.f1130n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        setTitle(this.f1130n.f1093a.getString(i6));
        return this;
    }

    @Override // m0.b, android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        int i10;
        f fVar = this.f1130n;
        Context context = fVar.f1093a;
        View inflate = LayoutInflater.from(context).inflate(i6, (ViewGroup) new LinearLayout(context), false);
        this.f1141z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f1118a) > 0) {
            inflate.setId(i10);
        }
        fVar.f1102k = true;
        fVar.p(true);
        return this;
    }
}
