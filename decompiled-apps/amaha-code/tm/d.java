package tm;

import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import hs.k;
import java.util.HashMap;
import kotlinx.coroutines.d0;
import ss.p;
import ya.v;
/* compiled from: JournalParentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$fetchEntryForId$1", f = "JournalParentViewModel.kt", l = {R.styleable.AppCompatTheme_selectableItemBackgroundBorderless}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f33297u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f33298v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f33299w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f33300x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f33299w = eVar;
        this.f33300x = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        d dVar2 = new d(this.f33299w, this.f33300x, dVar);
        dVar2.f33298v = obj;
        return dVar2;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f33297u;
        k kVar = null;
        e eVar = this.f33299w;
        if (i6 != 0) {
            if (i6 == 1) {
                d0 d0Var = (d0) this.f33298v;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            pm.a aVar2 = eVar.f33301y;
            this.f33298v = (d0) this.f33298v;
            this.f33297u = 1;
            aVar2.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str = fVar.j0();
            } else {
                str = null;
            }
            String str2 = this.f33300x;
            if (!n.B0(str2) && str != null) {
                v a10 = FirebaseFirestore.d().b("user_journal_list").m(str, SessionManager.KEY_UID).m(str2, "id").a();
                a10.addOnCompleteListener(new pm.b(aVar2, hVar));
                a10.addOnCanceledListener(new pm.c(hVar));
            } else {
                hVar.resumeWith(null);
            }
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        JournalModel journalModel = (JournalModel) obj;
        b bVar = b.FAILURE;
        if (journalModel != null) {
            eVar.J = journalModel;
            HashMap<String, Object> data = journalModel.getData();
            w<b> wVar = eVar.I;
            if (data != null) {
                eVar.A.g(data);
                wVar.i(b.SUCCESS);
                kVar = k.f19476a;
            }
            if (kVar == null) {
                wVar.i(bVar);
            }
        } else {
            eVar.I.i(bVar);
        }
        return k.f19476a;
    }
}
