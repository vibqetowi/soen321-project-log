package um;

import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: JournalEntryPointViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalEntryPointViewModel$fetchLatestJournalEntry$1", f = "JournalEntryPointViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34228u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pm.a f34229v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f34230w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ b f34231x;

    /* compiled from: JournalEntryPointViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalEntryPointViewModel$fetchLatestJournalEntry$1$1", f = "JournalEntryPointViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m = "invokeSuspend")
    /* renamed from: um.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0573a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34232u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pm.a f34233v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f34234w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b f34235x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0573a(pm.a aVar, String str, b bVar, ls.d<? super C0573a> dVar) {
            super(2, dVar);
            this.f34233v = aVar;
            this.f34234w = str;
            this.f34235x = bVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new C0573a(this.f34233v, this.f34234w, this.f34235x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((C0573a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34232u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f34232u = 1;
                obj = this.f34233v.b(this.f34234w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            JournalModel journalModel = (JournalModel) obj;
            if (journalModel != null) {
                ((w) this.f34235x.A.getValue()).i(journalModel);
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pm.a aVar, String str, b bVar, ls.d<? super a> dVar) {
        super(2, dVar);
        this.f34229v = aVar;
        this.f34230w = str;
        this.f34231x = bVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new a(this.f34229v, this.f34230w, this.f34231x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34228u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            C0573a c0573a = new C0573a(this.f34229v, this.f34230w, this.f34231x, null);
            this.f34228u = 1;
            if (v.S(bVar, c0573a, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
