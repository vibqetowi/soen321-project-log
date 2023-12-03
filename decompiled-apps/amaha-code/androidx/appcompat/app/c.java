package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.t1;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import f0.a;
import f0.f0;
import f0.n;
import g.f;
import g.g;
import g.h;
import g.j;
import g.k;
import g.w;
import kotlin.jvm.internal.i;
/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class c extends p implements h {

    /* renamed from: u  reason: collision with root package name */
    public k f1048u;

    public c() {
        getSavedStateRegistry().c("androidx:appcompat", new f(this));
        addOnContextAvailableListener(new g(this));
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        i.g(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        kc.f.V(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        k0().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(k0().d(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        g.a l02 = l0();
        if (getWindow().hasFeature(0)) {
            if (l02 == null || !l02.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // f0.k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        g.a l02 = l0();
        if (keyCode == 82 && l02 != null && l02.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i6) {
        return (T) k0().e(i6);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return k0().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i6 = t1.f1560a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k0().k();
    }

    public final j k0() {
        if (this.f1048u == null) {
            w.a aVar = j.f16054u;
            this.f1048u = new k(this, null, this, this);
        }
        return this.f1048u;
    }

    public final g.a l0() {
        return k0().i();
    }

    public boolean m0() {
        Intent a10 = n.a(this);
        if (a10 != null) {
            if (n.a.c(this, a10)) {
                f0 f0Var = new f0(this);
                Intent a11 = n.a(this);
                if (a11 == null) {
                    a11 = n.a(this);
                }
                if (a11 != null) {
                    ComponentName component = a11.getComponent();
                    if (component == null) {
                        component = a11.resolveActivity(f0Var.f14623v.getPackageManager());
                    }
                    f0Var.g(component);
                    f0Var.f14622u.add(a11);
                }
                f0Var.m();
                try {
                    int i6 = f0.a.f14598c;
                    a.b.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            n.a.b(this, a10);
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k0().m(configuration);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k0().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z10;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        g.a l02 = l0();
        if (menuItem.getItemId() == 16908332 && l02 != null && (l02.d() & 4) != 0) {
            return m0();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i6, Menu menu) {
        return super.onMenuOpened(i6, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i6, Menu menu) {
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((k) k0()).J();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        k0().p();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStart() {
        super.onStart();
        k0().q();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public void onStop() {
        super.onStop();
        k0().r();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i6) {
        super.onTitleChanged(charSequence, i6);
        k0().z(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        g.a l02 = l0();
        if (getWindow().hasFeature(0)) {
            if (l02 == null || !l02.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i6) {
        initViewTreeOwners();
        k0().u(i6);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        super.setTheme(i6);
        k0().y(i6);
    }

    @Override // androidx.fragment.app.p
    public final void supportInvalidateOptionsMenu() {
        k0().k();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        k0().v(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        k0().w(view, layoutParams);
    }

    @Override // g.h
    public final void J() {
    }

    @Override // g.h
    public final void X() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // g.h
    public final void r() {
    }
}
