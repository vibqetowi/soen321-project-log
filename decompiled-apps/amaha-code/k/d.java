package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.a;
/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public final class d extends a implements f.a {
    public boolean A;
    public final androidx.appcompat.view.menu.f B;

    /* renamed from: w  reason: collision with root package name */
    public final Context f22701w;

    /* renamed from: x  reason: collision with root package name */
    public final ActionBarContextView f22702x;

    /* renamed from: y  reason: collision with root package name */
    public final a.InterfaceC0348a f22703y;

    /* renamed from: z  reason: collision with root package name */
    public WeakReference<View> f22704z;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0348a interfaceC0348a) {
        this.f22701w = context;
        this.f22702x = actionBarContextView;
        this.f22703y = interfaceC0348a;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
        fVar.f1103l = 1;
        this.B = fVar;
        fVar.f1097e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f22703y.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.c cVar = this.f22702x.f1337x;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // k.a
    public final void c() {
        if (this.A) {
            return;
        }
        this.A = true;
        this.f22703y.d(this);
    }

    @Override // k.a
    public final View d() {
        WeakReference<View> weakReference = this.f22704z;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // k.a
    public final androidx.appcompat.view.menu.f e() {
        return this.B;
    }

    @Override // k.a
    public final MenuInflater f() {
        return new f(this.f22702x.getContext());
    }

    @Override // k.a
    public final CharSequence g() {
        return this.f22702x.getSubtitle();
    }

    @Override // k.a
    public final CharSequence h() {
        return this.f22702x.getTitle();
    }

    @Override // k.a
    public final void i() {
        this.f22703y.b(this, this.B);
    }

    @Override // k.a
    public final boolean j() {
        return this.f22702x.M;
    }

    @Override // k.a
    public final void k(View view) {
        WeakReference<View> weakReference;
        this.f22702x.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f22704z = weakReference;
    }

    @Override // k.a
    public final void l(int i6) {
        m(this.f22701w.getString(i6));
    }

    @Override // k.a
    public final void m(CharSequence charSequence) {
        this.f22702x.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void n(int i6) {
        o(this.f22701w.getString(i6));
    }

    @Override // k.a
    public final void o(CharSequence charSequence) {
        this.f22702x.setTitle(charSequence);
    }

    @Override // k.a
    public final void p(boolean z10) {
        this.f22695v = z10;
        this.f22702x.setTitleOptional(z10);
    }
}
