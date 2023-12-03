package g;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import g.w;
import t0.g;
/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class r extends androidx.activity.g implements h {

    /* renamed from: w  reason: collision with root package name */
    public k f16121w;

    /* renamed from: x  reason: collision with root package name */
    public final q f16122x;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [g.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Context context, int i6) {
        super(context, r2);
        int i10;
        if (i6 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i6;
        }
        this.f16122x = new g.a() { // from class: g.q
            @Override // t0.g.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return r.this.d(keyEvent);
            }
        };
        j c10 = c();
        if (i6 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i6 = typedValue2.resourceId;
        }
        ((k) c10).f16072o0 = i6;
        c10.n();
    }

    @Override // androidx.activity.g, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    public final j c() {
        if (this.f16121w == null) {
            w.a aVar = j.f16054u;
            this.f16121w = new k(getContext(), getWindow(), this, this);
        }
        return this.f16121w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return t0.g.b(this.f16122x, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i6) {
        return (T) c().e(i6);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().k();
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().j();
        super.onCreate(bundle);
        c().n();
    }

    @Override // androidx.activity.g, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().r();
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void setContentView(int i6) {
        c().u(i6);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().z(charSequence);
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void setContentView(View view) {
        c().v(view);
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i6) {
        super.setTitle(i6);
        c().z(getContext().getString(i6));
    }

    @Override // g.h
    public final void J() {
    }

    @Override // g.h
    public final void X() {
    }

    @Override // g.h
    public final void r() {
    }
}
