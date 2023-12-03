package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchMiniCourseFromUserObject$2$1", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_toolbarStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22166u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f22167v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f22168w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22169x;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchMiniCourseFromUserObject$2$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipForegroundColor}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22170u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k0 f22171v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f22172w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22173x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(k0 k0Var, ArrayList<String> arrayList, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f22171v = k0Var;
            this.f22172w = arrayList;
            this.f22173x = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22171v, this.f22172w, this.f22173x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Set<String> keySet;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22170u;
            k0 k0Var = this.f22171v;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                cn.e1 e1Var = k0Var.f22259x;
                HashSet G2 = is.u.G2(this.f22172w);
                this.f22170u = 1;
                e1Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    HashMap hashMap = new HashMap();
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        ArrayList<MiniCourse> miniCourses = user.getMiniCourses();
                        if (miniCourses != null) {
                            for (MiniCourse miniCourse : miniCourses) {
                                if (is.u.Z1(G2, miniCourse.getDomain()) && miniCourse.getDomain() != null) {
                                    String domain = miniCourse.getDomain();
                                    kotlin.jvm.internal.i.d(domain);
                                    hashMap.put(domain, miniCourse);
                                }
                            }
                        }
                        ArrayList<MiniCourse> topicalCourseList = user.getTopicalCourseList();
                        if (topicalCourseList != null) {
                            for (MiniCourse miniCourse2 : topicalCourseList) {
                                if (is.u.Z1(G2, miniCourse2.getDomain()) && miniCourse2.getDomain() != null) {
                                    String domain2 = miniCourse2.getDomain();
                                    kotlin.jvm.internal.i.d(domain2);
                                    hashMap.put(domain2, miniCourse2);
                                }
                            }
                        }
                    }
                    hVar.resumeWith(hashMap);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e1Var.f5468b, e10);
                    hVar.resumeWith(null);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            HashMap hashMap2 = (HashMap) obj;
            if (hashMap2 != null && (keySet = hashMap2.keySet()) != null) {
                for (String key : keySet) {
                    HashMap<String, MiniCourse> hashMap3 = k0Var.D;
                    kotlin.jvm.internal.i.f(key, "key");
                    hashMap3.put(key, hashMap2.get(key));
                }
            }
            this.f22173x.resumeWith(Boolean.TRUE);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(k0 k0Var, ArrayList<String> arrayList, ls.d<? super Boolean> dVar, ls.d<? super f0> dVar2) {
        super(2, dVar2);
        this.f22167v = k0Var;
        this.f22168w = arrayList;
        this.f22169x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f0(this.f22167v, this.f22168w, this.f22169x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((f0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22166u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22167v, this.f22168w, this.f22169x, null);
            this.f22166u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
