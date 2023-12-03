package sb;

import android.content.Context;
import android.view.SubMenu;
import r1.b0;
/* compiled from: NavigationBarMenu.java */
/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.f {
    public final int A;

    /* renamed from: z  reason: collision with root package name */
    public final Class<?> f31394z;

    public c(Context context, Class<?> cls, int i6) {
        super(context);
        this.f31394z = cls;
        this.A = i6;
    }

    @Override // androidx.appcompat.view.menu.f
    public final androidx.appcompat.view.menu.h a(int i6, int i10, int i11, CharSequence charSequence) {
        int size = size() + 1;
        int i12 = this.A;
        if (size <= i12) {
            z();
            androidx.appcompat.view.menu.h a10 = super.a(i6, i10, i11, charSequence);
            a10.f(true);
            y();
            return a10;
        }
        String simpleName = this.f31394z.getSimpleName();
        StringBuilder sb2 = new StringBuilder("Maximum number of items supported by ");
        sb2.append(simpleName);
        sb2.append(" is ");
        sb2.append(i12);
        sb2.append(". Limit can be checked with ");
        throw new IllegalArgumentException(b0.b(sb2, simpleName, "#getMaxItemCount()"));
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i6, int i10, int i11, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f31394z.getSimpleName().concat(" does not support submenus"));
    }
}
