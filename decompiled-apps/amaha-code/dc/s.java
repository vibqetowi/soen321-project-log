package dc;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.theinnerhour.b2b.R;
import w5.i0;
/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: e  reason: collision with root package name */
    public final int f12804e;
    public EditText f;

    /* renamed from: g  reason: collision with root package name */
    public final i0 f12805g;

    public s(com.google.android.material.textfield.a aVar, int i6) {
        super(aVar);
        this.f12804e = R.drawable.design_password_eye;
        this.f12805g = new i0(5, this);
        if (i6 != 0) {
            this.f12804e = i6;
        }
    }

    @Override // dc.l
    public final void b() {
        q();
    }

    @Override // dc.l
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // dc.l
    public final int d() {
        return this.f12804e;
    }

    @Override // dc.l
    public final View.OnClickListener f() {
        return this.f12805g;
    }

    @Override // dc.l
    public final boolean k() {
        return true;
    }

    @Override // dc.l
    public final boolean l() {
        boolean z10;
        EditText editText = this.f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // dc.l
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // dc.l
    public final void r() {
        boolean z10;
        EditText editText = this.f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // dc.l
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
