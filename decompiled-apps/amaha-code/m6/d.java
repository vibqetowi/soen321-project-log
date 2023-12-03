package m6;

import android.graphics.Rect;
import android.view.View;
import m6.f;
/* compiled from: TapTargetView.java */
/* loaded from: classes.dex */
public final class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f24868u;

    public d(f fVar) {
        this.f24868u = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        f fVar = this.f24868u;
        if (fVar.f24893w0 != null && fVar.f24877j0 != null && fVar.f24892w) {
            Rect rect = fVar.I;
            boolean z11 = true;
            if (f.c(rect.centerX(), rect.centerY(), (int) fVar.f24885r0, (int) fVar.f24886s0) <= fVar.f24881n0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int[] iArr = fVar.f24877j0;
            if (f.c(iArr[0], iArr[1], (int) fVar.f24885r0, (int) fVar.f24886s0) > fVar.f24875h0) {
                z11 = false;
            }
            f.i iVar = fVar.f24893w0;
            if (z10) {
                fVar.f24892w = false;
                iVar.a(fVar);
            } else if (z11) {
                iVar.getClass();
            } else if (fVar.V) {
                fVar.f24892w = false;
                iVar.getClass();
                fVar.b(false);
            }
        }
    }
}
