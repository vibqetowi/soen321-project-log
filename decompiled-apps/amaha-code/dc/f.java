package dc;

import com.google.android.material.internal.CheckableImageButton;
/* compiled from: CustomEndIconDelegate.java */
/* loaded from: classes.dex */
public final class f extends l {
    public f(com.google.android.material.textfield.a aVar) {
        super(aVar);
    }

    @Override // dc.l
    public final void r() {
        com.google.android.material.textfield.a aVar = this.f12765b;
        aVar.I = null;
        CheckableImageButton checkableImageButton = aVar.A;
        checkableImageButton.setOnLongClickListener(null);
        m.e(checkableImageButton, null);
    }
}
