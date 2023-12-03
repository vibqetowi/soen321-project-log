package ml;

import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserLibraryModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$setupLibraryContent$1", f = "V3DashboardViewModel.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25586u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f25587v;

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$setupLibraryContent$1$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f25588u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c0 f25589v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25589v = c0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f25589v, dVar);
            aVar.f25588u = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            UserLibraryModel library;
            ArrayList<String> overAllRankedList;
            String substring;
            String str;
            hs.f fVar;
            ll.c cVar;
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25588u;
            User user = FirebasePersistence.getInstance().getUser();
            c0 c0Var = this.f25589v;
            hs.k kVar = null;
            if (user != null && (library = user.getLibrary()) != null && (overAllRankedList = library.getOverAllRankedList()) != null) {
                if (overAllRankedList.isEmpty()) {
                    overAllRankedList = null;
                }
                if (overAllRankedList != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : overAllRankedList) {
                        kotlin.jvm.internal.i.f(str2.substring(0, 3), "this as java.lang.String…ing(startIndex, endIndex)");
                        if (!(!is.k.Q1(substring, new String[]{"mc_", "au_", "rs_"}))) {
                            str = str2;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            String substring2 = str2.substring(3);
                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
                            String substring3 = str2.substring(0, 3);
                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                            if (kotlin.jvm.internal.i.b(substring3, "mc_")) {
                                cVar = ll.c.MINICOURSE;
                            } else if (kotlin.jvm.internal.i.b(substring3, "au_")) {
                                cVar = ll.c.AUDIO;
                            } else {
                                cVar = ll.c.RESOURCE;
                            }
                            fVar = new hs.f(substring2, cVar);
                        } else {
                            fVar = null;
                        }
                        if (fVar != null) {
                            arrayList.add(fVar);
                        }
                    }
                    c0Var.getClass();
                    kVar = hs.k.f19476a;
                }
            }
            if (kVar == null) {
                c0Var.getClass();
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(c0 c0Var, ls.d<? super t0> dVar) {
        super(2, dVar);
        this.f25587v = c0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new t0(this.f25587v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((t0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25586u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
            a aVar2 = new a(this.f25587v, null);
            this.f25586u = 1;
            if (ta.v.S(cVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
