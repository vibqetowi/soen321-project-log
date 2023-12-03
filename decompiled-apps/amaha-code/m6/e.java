package m6;

import android.view.View;
/* compiled from: TapTargetView.java */
/* loaded from: classes.dex */
public final class e implements View.OnLongClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f24869u;

    public e(f fVar) {
        this.f24869u = fVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        f fVar = this.f24869u;
        if (fVar.f24893w0 == null || !fVar.I.contains((int) fVar.f24885r0, (int) fVar.f24886s0)) {
            return false;
        }
        fVar.f24893w0.a(fVar);
        return true;
    }
}
