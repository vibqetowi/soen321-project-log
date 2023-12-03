package pm;

import androidx.lifecycle.LiveData;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.SessionManager;
import fe.g;
import hs.k;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r;
import ns.i;
import ss.p;
/* compiled from: JournalFirebaseRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.journal.repository.JournalFirebaseRepository$fetchJournalListFromFirestore$2", f = "JournalFirebaseRepository.kt", l = {132}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<kotlinx.coroutines.flow.e<? super List<? extends JournalModel>>, ls.d<? super k>, Object> {
    public final /* synthetic */ LiveData<String> A;
    public final /* synthetic */ long B;

    /* renamed from: u  reason: collision with root package name */
    public int f28685u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f28686v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ pm.a f28687w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f28688x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d<Integer> f28689y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LiveData<List<String>> f28690z;

    /* compiled from: JournalFirebaseRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.e {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<List<JournalModel>> f28691u;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.flow.e<? super List<JournalModel>> eVar) {
            this.f28691u = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        public final Object b(Object obj, ls.d dVar) {
            ArrayList arrayList = new ArrayList();
            for (g gVar : (List) obj) {
                JournalModel journalModel = (JournalModel) gVar.d(JournalModel.class);
                if (journalModel != null) {
                    journalModel.setFirestoreDocumentId(gVar.b());
                } else {
                    journalModel = null;
                }
                if (journalModel != null) {
                    arrayList.add(journalModel);
                }
            }
            Object b10 = this.f28691u.b(arrayList, dVar);
            if (b10 != ms.a.COROUTINE_SUSPENDED) {
                return k.f19476a;
            }
            return b10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pm.a aVar, String str, kotlinx.coroutines.flow.d<Integer> dVar, LiveData<List<String>> liveData, LiveData<String> liveData2, long j10, ls.d<? super d> dVar2) {
        super(2, dVar2);
        this.f28687w = aVar;
        this.f28688x = str;
        this.f28689y = dVar;
        this.f28690z = liveData;
        this.A = liveData2;
        this.B = j10;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        d dVar2 = new d(this.f28687w, this.f28688x, this.f28689y, this.f28690z, this.A, this.B, dVar);
        dVar2.f28686v = obj;
        return dVar2;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends JournalModel>> eVar, ls.d<? super k> dVar) {
        return ((d) create(eVar, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f28685u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            com.google.firebase.firestore.d d10 = FirebaseFirestore.d().b("user_journal_list").m(this.f28688x, SessionManager.KEY_UID).d("userEnteredDate");
            kotlinx.coroutines.flow.d<Integer> dVar = this.f28689y;
            LiveData<List<String>> liveData = this.f28690z;
            LiveData<String> liveData2 = this.A;
            long j10 = this.B;
            this.f28687w.getClass();
            r rVar = new r(new e(dVar, d10, j10, liveData, liveData2, null));
            a aVar2 = new a((kotlinx.coroutines.flow.e) this.f28686v);
            this.f28685u = 1;
            if (rVar.a(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
