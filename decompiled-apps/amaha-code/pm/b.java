package pm;

import com.theinnerhour.b2b.components.journal.model.JournalModel;
import fe.q;
import fe.r;
import hs.k;
import is.u;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: JournalFirebaseRepository.kt */
/* loaded from: classes2.dex */
public final class b<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<JournalModel> f28683a;

    public b(a aVar, h hVar) {
        this.f28683a = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<r> it) {
        k kVar;
        q qVar;
        JournalModel journalModel;
        q qVar2;
        i.g(it, "it");
        boolean isSuccessful = it.isSuccessful();
        ls.d<JournalModel> dVar = this.f28683a;
        if (isSuccessful) {
            r result = it.getResult();
            if (result != null && (qVar = (q) u.h2(result)) != null) {
                r result2 = it.getResult();
                if (result2 != null && (qVar2 = (q) u.h2(result2)) != null && (journalModel = (JournalModel) qVar2.d(JournalModel.class)) != null) {
                    journalModel.setFirestoreDocumentId(qVar.b());
                } else {
                    journalModel = null;
                }
                dVar.resumeWith(journalModel);
                kVar = k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                dVar.resumeWith(null);
                return;
            }
            return;
        }
        dVar.resumeWith(null);
    }
}
