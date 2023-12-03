package um;

import androidx.lifecycle.w;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import hs.k;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: JournalViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalViewModel$fetchJournalList$1", f = "JournalViewModel.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f34254u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f34255v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f34256w;

    /* compiled from: JournalViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.journal.viewmodel.JournalViewModel$fetchJournalList$1$1", f = "JournalViewModel.kt", l = {R.styleable.AppCompatTheme_colorBackgroundFloating, R.styleable.AppCompatTheme_colorBackgroundFloating}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34257u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c f34258v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f34259w;

        /* compiled from: JournalViewModel.kt */
        /* renamed from: um.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0576a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ c f34260u;

            public C0576a(c cVar) {
                this.f34260u = cVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                this.f34260u.D.i(new SingleUseEvent<>((List) obj));
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f34258v = cVar;
            this.f34259w = str;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f34258v, this.f34259w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34257u;
            c cVar = this.f34258v;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f34241z, e10);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                pm.a aVar2 = cVar.f34240y;
                String str = this.f34259w;
                x xVar = cVar.A;
                w<List<String>> wVar = cVar.J;
                w<String> wVar2 = cVar.K;
                this.f34257u = 1;
                aVar2.getClass();
                r rVar = new r(new pm.d(aVar2, str, xVar, wVar, wVar2, 8L, null));
                if (rVar == aVar) {
                    return aVar;
                }
                obj = rVar;
            }
            C0576a c0576a = new C0576a(cVar);
            this.f34257u = 2;
            if (((kotlinx.coroutines.flow.d) obj).a(c0576a, this) == aVar) {
                return aVar;
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f34255v = cVar;
        this.f34256w = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f34255v, this.f34256w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f34254u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f34255v, this.f34256w, null);
            this.f34254u = 1;
            if (v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
