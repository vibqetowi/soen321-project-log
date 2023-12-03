package sm;

import android.app.Dialog;
/* compiled from: JTSFragment.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.l<tm.b, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f31707u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f31708v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Dialog dialog) {
        super(1);
        this.f31707u = jVar;
        this.f31708v = dialog;
    }

    @Override // ss.l
    public final hs.k invoke(tm.b bVar) {
        tm.b bVar2 = bVar;
        tm.b bVar3 = tm.b.SUCCESS;
        Dialog dialog = this.f31708v;
        j jVar = this.f31707u;
        if (bVar2 == bVar3) {
            int i6 = j.f31709y;
            jVar.I(true);
            dialog.dismiss();
        } else if (bVar2 == tm.b.FAILURE) {
            int i10 = j.f31709y;
            jVar.I(false);
            dialog.dismiss();
        }
        return hs.k.f19476a;
    }
}
