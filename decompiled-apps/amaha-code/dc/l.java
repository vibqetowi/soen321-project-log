package dc;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: EndIconDelegate.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12764a;

    /* renamed from: b  reason: collision with root package name */
    public final com.google.android.material.textfield.a f12765b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12766c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f12767d;

    public l(com.google.android.material.textfield.a aVar) {
        this.f12764a = aVar.f9287u;
        this.f12765b = aVar;
        this.f12766c = aVar.getContext();
        this.f12767d = aVar.A;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public u0.d h() {
        return null;
    }

    public boolean i(int i6) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f12765b.e(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(u0.h hVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
