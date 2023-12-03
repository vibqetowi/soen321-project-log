package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import k.a;
/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22705a;

    /* renamed from: b  reason: collision with root package name */
    public final k.a f22706b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0348a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f22707a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f22708b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f22709c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final t.h<Menu, Menu> f22710d = new t.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f22708b = context;
            this.f22707a = callback;
        }

        @Override // k.a.InterfaceC0348a
        public final boolean a(k.a aVar, MenuItem menuItem) {
            return this.f22707a.onActionItemClicked(e(aVar), new l.c(this.f22708b, (m0.b) menuItem));
        }

        @Override // k.a.InterfaceC0348a
        public final boolean b(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(aVar);
            t.h<Menu, Menu> hVar = this.f22710d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new l.e(this.f22708b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.f22707a.onPrepareActionMode(e10, orDefault);
        }

        @Override // k.a.InterfaceC0348a
        public final boolean c(k.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e10 = e(aVar);
            t.h<Menu, Menu> hVar = this.f22710d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new l.e(this.f22708b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.f22707a.onCreateActionMode(e10, orDefault);
        }

        @Override // k.a.InterfaceC0348a
        public final void d(k.a aVar) {
            this.f22707a.onDestroyActionMode(e(aVar));
        }

        public final e e(k.a aVar) {
            ArrayList<e> arrayList = this.f22709c;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                e eVar = arrayList.get(i6);
                if (eVar != null && eVar.f22706b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f22708b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, k.a aVar) {
        this.f22705a = context;
        this.f22706b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f22706b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f22706b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new l.e(this.f22705a, this.f22706b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f22706b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f22706b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f22706b.f22694u;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f22706b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f22706b.f22695v;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f22706b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f22706b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f22706b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f22706b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f22706b.f22694u = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f22706b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f22706b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i6) {
        this.f22706b.l(i6);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i6) {
        this.f22706b.n(i6);
    }
}
