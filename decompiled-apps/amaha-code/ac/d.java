package ac;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import t0.s0;
import t0.t;
/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f471u;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f471u = baseTransientBottomBar;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        int a10 = s0Var.a();
        BaseTransientBottomBar baseTransientBottomBar = this.f471u;
        baseTransientBottomBar.f9148m = a10;
        baseTransientBottomBar.f9149n = s0Var.b();
        baseTransientBottomBar.f9150o = s0Var.c();
        baseTransientBottomBar.f();
        return s0Var;
    }
}
