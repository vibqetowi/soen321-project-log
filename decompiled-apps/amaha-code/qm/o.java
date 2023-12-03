package qm;

import android.app.Dialog;
/* compiled from: JournalBasicSummaryFragment.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<tm.b, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f29902u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f29903v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, Dialog dialog) {
        super(1);
        this.f29902u = nVar;
        this.f29903v = dialog;
    }

    @Override // ss.l
    public final hs.k invoke(tm.b bVar) {
        tm.b bVar2 = bVar;
        tm.b bVar3 = tm.b.SUCCESS;
        Dialog dialog = this.f29903v;
        n nVar = this.f29902u;
        if (bVar2 == bVar3) {
            int i6 = n.f29891z;
            nVar.K(true);
            dialog.dismiss();
        } else if (bVar2 == tm.b.FAILURE) {
            int i10 = n.f29891z;
            nVar.K(false);
            dialog.dismiss();
        }
        return hs.k.f19476a;
    }
}
