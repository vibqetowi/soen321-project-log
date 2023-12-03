package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchItems$1", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22151u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f22152v;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchItems$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22153u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22154v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k0 f22155w;

        /* compiled from: NewDashboardSavedItemsViewModel.kt */
        /* renamed from: jl.e0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0330a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ k0 f22156u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.d0 f22157v;

            public C0330a(k0 k0Var, kotlinx.coroutines.d0 d0Var) {
                this.f22156u = k0Var;
                this.f22157v = d0Var;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                List<UserLibraryItemAccessModel> list = (List) obj;
                this.f22156u.f22261z.i(list);
                if (list.isEmpty()) {
                    kotlinx.coroutines.d0 d0Var = this.f22157v;
                    if (kotlin.jvm.internal.h.E(d0Var)) {
                        kotlin.jvm.internal.h.l(d0Var, null);
                    }
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22155w = k0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f22155w, dVar);
            aVar.f22154v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22153u;
            k0 k0Var = this.f22155w;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22154v;
                    cn.e1 e1Var = k0Var.f22259x;
                    kotlinx.coroutines.flow.x xVar = k0Var.A;
                    e1Var.getClass();
                    kotlinx.coroutines.flow.r j10 = cn.e1.j(xVar);
                    C0330a c0330a = new C0330a(k0Var, d0Var);
                    this.f22153u = 1;
                    if (j10.a(c0330a, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(k0Var.f22260y, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k0 k0Var, ls.d<? super e0> dVar) {
        super(2, dVar);
        this.f22152v = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e0(this.f22152v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22151u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22152v, null);
            this.f22151u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
