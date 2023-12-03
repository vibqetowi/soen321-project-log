package tm;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalUploadResponseModel;
import hs.k;
import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: JournalParentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$saveDataToFirebase$1", f = "JournalParentViewModel.kt", l = {R.styleable.AppCompatTheme_viewInflaterClass}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f33314u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f33315v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ JournalModel f33316w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f33317x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Integer f33318y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, JournalModel journalModel, boolean z10, Integer num, ls.d<? super f> dVar) {
        super(2, dVar);
        this.f33315v = eVar;
        this.f33316w = journalModel;
        this.f33317x = z10;
        this.f33318y = num;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f33315v, this.f33316w, this.f33317x, this.f33318y, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f33314u;
        e eVar = this.f33315v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            pm.a aVar2 = eVar.f33301y;
            this.f33314u = 1;
            aVar2.getClass();
            obj = pm.a.c(this.f33316w, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        eVar.F.i(new JournalUploadResponseModel(((Boolean) obj).booleanValue(), this.f33317x, this.f33318y));
        return k.f19476a;
    }
}
