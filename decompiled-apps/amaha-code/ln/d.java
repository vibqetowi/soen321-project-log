package ln;

import com.google.android.gms.internal.cast.w;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.network.model.NpsSubmissionModel;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import ns.e;
import ns.i;
import or.g;
import ss.p;
import ta.v;
/* compiled from: MiniCoursesViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$submitNpsForMiniCourse$1", f = "MiniCoursesViewModel.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f24462u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MiniCoursesViewModel f24463v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f24464w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f24465x;

    /* compiled from: MiniCoursesViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$submitNpsForMiniCourse$1$1", f = "MiniCoursesViewModel.kt", l = {390}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f24466u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ MiniCoursesViewModel f24467v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f24468w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f24469x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MiniCoursesViewModel miniCoursesViewModel, int i6, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f24467v = miniCoursesViewModel;
            this.f24468w = i6;
            this.f24469x = str;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f24467v, this.f24468w, this.f24469x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f24466u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                w wVar = this.f24467v.H;
                int i10 = this.f24468w;
                String str = this.f24469x;
                this.f24466u = 1;
                wVar.getClass();
                h hVar = new h(ca.a.G0(this));
                ((g) nr.b.a(g.class)).a("https://api.theinnerhour.com/v1/save_nps", new NpsSubmissionModel(i10, 3, null, str, "minicourse")).I(new ln.a(hVar));
                if (hVar.b() == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MiniCoursesViewModel miniCoursesViewModel, int i6, String str, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f24463v = miniCoursesViewModel;
        this.f24464w = i6;
        this.f24465x = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f24463v, this.f24464w, this.f24465x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f24462u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f24463v, this.f24464w, this.f24465x, null);
            this.f24462u = 1;
            if (v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
