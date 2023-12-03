package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.theinnerhour.b2b.R;
/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1343a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f1344b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.appcompat.view.menu.i f1345c;

    /* renamed from: d  reason: collision with root package name */
    public a f1346d;

    /* compiled from: PopupMenu.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public a1(Context context, View view) {
        this.f1343a = context;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.f1344b = fVar;
        fVar.w(new y0(this));
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(R.attr.popupMenuStyle, 0, context, view, fVar, false);
        this.f1345c = iVar;
        iVar.f1148g = 0;
        iVar.f1152k = new z0(this);
    }

    public final k.f a() {
        return new k.f(this.f1343a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z10;
        androidx.appcompat.view.menu.i iVar = this.f1345c;
        if (!iVar.b()) {
            z10 = false;
            if (iVar.f != null) {
                iVar.d(0, 0, false, false);
            }
            if (!z10) {
                return;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        z10 = true;
        if (!z10) {
        }
    }
}
