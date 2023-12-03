package rm;

import android.app.Dialog;
/* compiled from: JournalTodayQuestionSummaryFragment.kt */
/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.k implements ss.l<tm.b, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l f30829u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f30830v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Dialog dialog) {
        super(1);
        this.f30829u = lVar;
        this.f30830v = dialog;
    }

    @Override // ss.l
    public final hs.k invoke(tm.b bVar) {
        tm.b bVar2 = bVar;
        tm.b bVar3 = tm.b.SUCCESS;
        Dialog dialog = this.f30830v;
        l lVar = this.f30829u;
        if (bVar2 == bVar3) {
            int i6 = l.f30819y;
            lVar.K(true);
            dialog.dismiss();
        } else if (bVar2 == tm.b.FAILURE) {
            int i10 = l.f30819y;
            lVar.K(false);
            dialog.dismiss();
        }
        return hs.k.f19476a;
    }
}
