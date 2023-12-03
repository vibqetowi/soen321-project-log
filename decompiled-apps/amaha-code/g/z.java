package g;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o1;
import com.appsflyer.R;
import g.a;
import g.k;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public final class z extends g.a {

    /* renamed from: a  reason: collision with root package name */
    public final o1 f16151a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f16152b;

    /* renamed from: c  reason: collision with root package name */
    public final e f16153c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16154d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16155e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<a.b> f16156g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final a f16157h = new a();

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.view.menu.f fVar;
            z zVar = z.this;
            Window.Callback callback = zVar.f16152b;
            Menu r = zVar.r();
            if (r instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) r;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.z();
            }
            try {
                r.clear();
                if (!callback.onCreatePanelMenu(0, r) || !callback.onPreparePanel(0, null, r)) {
                    r.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.y();
                }
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class b implements Toolbar.h {
        public b() {
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements j.a {

        /* renamed from: u  reason: collision with root package name */
        public boolean f16160u;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (this.f16160u) {
                return;
            }
            this.f16160u = true;
            z zVar = z.this;
            zVar.f16151a.h();
            zVar.f16152b.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            this.f16160u = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            z.this.f16152b.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            return true;
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            z zVar = z.this;
            boolean a10 = zVar.f16151a.a();
            Window.Callback callback = zVar.f16152b;
            if (a10) {
                callback.onPanelClosed(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, fVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public class e implements k.b {
        public e() {
        }
    }

    public z(Toolbar toolbar, CharSequence charSequence, k.i iVar) {
        b bVar = new b();
        toolbar.getClass();
        o1 o1Var = new o1(toolbar, false);
        this.f16151a = o1Var;
        iVar.getClass();
        this.f16152b = iVar;
        o1Var.f1503l = iVar;
        toolbar.setOnMenuItemClickListener(bVar);
        o1Var.setWindowTitle(charSequence);
        this.f16153c = new e();
    }

    @Override // g.a
    public final boolean a() {
        return this.f16151a.f();
    }

    @Override // g.a
    public final boolean b() {
        o1 o1Var = this.f16151a;
        if (o1Var.j()) {
            o1Var.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // g.a
    public final void c(boolean z10) {
        if (z10 == this.f) {
            return;
        }
        this.f = z10;
        ArrayList<a.b> arrayList = this.f16156g;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a();
        }
    }

    @Override // g.a
    public final int d() {
        return this.f16151a.f1494b;
    }

    @Override // g.a
    public final Context e() {
        return this.f16151a.getContext();
    }

    @Override // g.a
    public final boolean f() {
        o1 o1Var = this.f16151a;
        Toolbar toolbar = o1Var.f1493a;
        a aVar = this.f16157h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = o1Var.f1493a;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.m(toolbar2, aVar);
        return true;
    }

    @Override // g.a
    public final void h() {
        this.f16151a.f1493a.removeCallbacks(this.f16157h);
    }

    @Override // g.a
    public final boolean i(int i6, KeyEvent keyEvent) {
        int i10;
        Menu r = r();
        if (r == null) {
            return false;
        }
        if (keyEvent != null) {
            i10 = keyEvent.getDeviceId();
        } else {
            i10 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i10).getKeyboardType() == 1) {
            z10 = false;
        }
        r.setQwertyMode(z10);
        return r.performShortcut(i6, keyEvent, 0);
    }

    @Override // g.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // g.a
    public final boolean k() {
        return this.f16151a.g();
    }

    @Override // g.a
    public final void m(boolean z10) {
        o1 o1Var = this.f16151a;
        o1Var.k((o1Var.f1494b & (-5)) | 4);
    }

    @Override // g.a
    public final void n() {
        o1 o1Var = this.f16151a;
        o1Var.k((o1Var.f1494b & (-9)) | 0);
    }

    @Override // g.a
    public final void p(CharSequence charSequence) {
        this.f16151a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        boolean z10 = this.f16155e;
        o1 o1Var = this.f16151a;
        if (!z10) {
            c cVar = new c();
            d dVar = new d();
            Toolbar toolbar = o1Var.f1493a;
            toolbar.f1307k0 = cVar;
            toolbar.f1308l0 = dVar;
            ActionMenuView actionMenuView = toolbar.f1314u;
            if (actionMenuView != null) {
                actionMenuView.O = cVar;
                actionMenuView.P = dVar;
            }
            this.f16155e = true;
        }
        return o1Var.f1493a.getMenu();
    }

    @Override // g.a
    public final void g() {
    }

    @Override // g.a
    public final void l(boolean z10) {
    }

    @Override // g.a
    public final void o(boolean z10) {
    }
}
