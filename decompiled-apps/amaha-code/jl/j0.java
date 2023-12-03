package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: NewDashboardSavedItemsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchSuggestedPlanItems$2$1", f = "NewDashboardSavedItemsViewModel.kt", l = {184}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22245u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22246v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ HashSet<String>[] f22247w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k0 f22248x;

    /* compiled from: NewDashboardSavedItemsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NewDashboardSavedItemsViewModel$fetchSuggestedPlanItems$2$1$1", f = "NewDashboardSavedItemsViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f22249u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ HashSet<String>[] f22250v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k0 f22251w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ls.d<? super Boolean> dVar, HashSet<String>[] hashSetArr, k0 k0Var, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f22249u = dVar;
            this.f22250v = hashSetArr;
            this.f22251w = k0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22249u, this.f22250v, this.f22251w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<SuggestedActivityModel> planSuggested;
            ArrayList<SuggestedActivityModel> planSuggested2;
            ArrayList<SuggestedActivityModel> planSuggested3;
            ArrayList<SuggestedActivityModel> planSuggested4;
            ArrayList<SuggestedActivityModel> planSuggested5;
            ArrayList<SuggestedActivityModel> planSuggested6;
            sp.b.d0(obj);
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            HashSet<String>[] hashSetArr = this.f22250v;
            boolean z10 = !hashSetArr[0].isEmpty();
            k0 k0Var = this.f22251w;
            if (z10) {
                HashSet<String> hashSet = hashSetArr[0];
                Course courseByName = firebasePersistence.getCourseByName(Constants.COURSE_SLEEP);
                if (courseByName != null && (planSuggested6 = courseByName.getPlanSuggested()) != null) {
                    for (SuggestedActivityModel suggestedActivityModel : planSuggested6) {
                        if (suggestedActivityModel.getContent_id() != null && is.u.Z1(hashSet, suggestedActivityModel.getContent_id())) {
                            HashMap<String, SuggestedActivityModel> hashMap = k0Var.F;
                            String content_id = suggestedActivityModel.getContent_id();
                            kotlin.jvm.internal.i.d(content_id);
                            hashMap.put("suggested_".concat(content_id), suggestedActivityModel);
                        }
                    }
                }
            }
            if (!hashSetArr[1].isEmpty()) {
                HashSet<String> hashSet2 = hashSetArr[1];
                Course courseByName2 = firebasePersistence.getCourseByName(Constants.COURSE_STRESS);
                if (courseByName2 != null && (planSuggested5 = courseByName2.getPlanSuggested()) != null) {
                    for (SuggestedActivityModel suggestedActivityModel2 : planSuggested5) {
                        if (suggestedActivityModel2.getContent_id() != null && is.u.Z1(hashSet2, suggestedActivityModel2.getContent_id())) {
                            HashMap<String, SuggestedActivityModel> hashMap2 = k0Var.F;
                            String content_id2 = suggestedActivityModel2.getContent_id();
                            kotlin.jvm.internal.i.d(content_id2);
                            hashMap2.put("suggested_".concat(content_id2), suggestedActivityModel2);
                        }
                    }
                }
            }
            if (!hashSetArr[2].isEmpty()) {
                HashSet<String> hashSet3 = hashSetArr[2];
                Course courseByName3 = firebasePersistence.getCourseByName(Constants.COURSE_WORRY);
                if (courseByName3 != null && (planSuggested4 = courseByName3.getPlanSuggested()) != null) {
                    for (SuggestedActivityModel suggestedActivityModel3 : planSuggested4) {
                        if (suggestedActivityModel3.getContent_id() != null && is.u.Z1(hashSet3, suggestedActivityModel3.getContent_id())) {
                            HashMap<String, SuggestedActivityModel> hashMap3 = k0Var.F;
                            String content_id3 = suggestedActivityModel3.getContent_id();
                            kotlin.jvm.internal.i.d(content_id3);
                            hashMap3.put("suggested_".concat(content_id3), suggestedActivityModel3);
                        }
                    }
                }
            }
            if (!hashSetArr[3].isEmpty()) {
                HashSet<String> hashSet4 = hashSetArr[3];
                Course courseByName4 = firebasePersistence.getCourseByName(Constants.COURSE_DEPRESSION);
                if (courseByName4 != null && (planSuggested3 = courseByName4.getPlanSuggested()) != null) {
                    for (SuggestedActivityModel suggestedActivityModel4 : planSuggested3) {
                        if (suggestedActivityModel4.getContent_id() != null && is.u.Z1(hashSet4, suggestedActivityModel4.getContent_id())) {
                            HashMap<String, SuggestedActivityModel> hashMap4 = k0Var.F;
                            String content_id4 = suggestedActivityModel4.getContent_id();
                            kotlin.jvm.internal.i.d(content_id4);
                            hashMap4.put("suggested_".concat(content_id4), suggestedActivityModel4);
                        }
                    }
                }
            }
            if (!hashSetArr[4].isEmpty()) {
                HashSet<String> hashSet5 = hashSetArr[4];
                Course courseByName5 = firebasePersistence.getCourseByName(Constants.COURSE_ANGER);
                if (courseByName5 != null && (planSuggested2 = courseByName5.getPlanSuggested()) != null) {
                    for (SuggestedActivityModel suggestedActivityModel5 : planSuggested2) {
                        if (suggestedActivityModel5.getContent_id() != null && is.u.Z1(hashSet5, suggestedActivityModel5.getContent_id())) {
                            HashMap<String, SuggestedActivityModel> hashMap5 = k0Var.F;
                            String content_id5 = suggestedActivityModel5.getContent_id();
                            kotlin.jvm.internal.i.d(content_id5);
                            hashMap5.put("suggested_".concat(content_id5), suggestedActivityModel5);
                        }
                    }
                }
            }
            if (!hashSetArr[5].isEmpty()) {
                HashSet<String> hashSet6 = hashSetArr[5];
                Course courseByName6 = firebasePersistence.getCourseByName(Constants.COURSE_HAPPINESS);
                if (courseByName6 != null && (planSuggested = courseByName6.getPlanSuggested()) != null) {
                    for (SuggestedActivityModel suggestedActivityModel6 : planSuggested) {
                        if (suggestedActivityModel6.getContent_id() != null && is.u.Z1(hashSet6, suggestedActivityModel6.getContent_id())) {
                            HashMap<String, SuggestedActivityModel> hashMap6 = k0Var.F;
                            String content_id6 = suggestedActivityModel6.getContent_id();
                            kotlin.jvm.internal.i.d(content_id6);
                            hashMap6.put("suggested_".concat(content_id6), suggestedActivityModel6);
                        }
                    }
                }
            }
            this.f22249u.resumeWith(Boolean.TRUE);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(ls.d<? super Boolean> dVar, HashSet<String>[] hashSetArr, k0 k0Var, ls.d<? super j0> dVar2) {
        super(2, dVar2);
        this.f22246v = dVar;
        this.f22247w = hashSetArr;
        this.f22248x = k0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new j0(this.f22246v, this.f22247w, this.f22248x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22245u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22246v, this.f22247w, this.f22248x, null);
            this.f22245u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
