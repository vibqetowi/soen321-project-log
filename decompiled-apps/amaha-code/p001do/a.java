package p001do;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.components.onboarding.model.ExpertCareMatchingCourseModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingResponse;
import com.theinnerhour.b2b.components.onboarding.model.UserOnboardingModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import dw.z;
import fd.f;
import hs.k;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import ns.e;
import ss.p;
import ta.v;
/* compiled from: MatchingFlowRepository.kt */
/* renamed from: do.a  reason: invalid package */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f13174a = LogHelper.INSTANCE.makeLogTag("MatchingFlowRepository");

    /* compiled from: MatchingFlowRepository.kt */
    /* renamed from: do.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0188a implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<MatchingFlowUserResponseModel> f13175u;

        public C0188a(h hVar) {
            this.f13175u = hVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            i.g(error, "error");
            this.f13175u.resumeWith(null);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            ExpertCareMatchingCourseModel expertCareCourse;
            i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            MatchingFlowUserResponseModel matchingFlowUserResponseModel = null;
            ls.d<MatchingFlowUserResponseModel> dVar = this.f13175u;
            if (exists) {
                UserOnboardingModel userOnboardingModel = (UserOnboardingModel) snapshot.getValue(UserOnboardingModel.class);
                if (userOnboardingModel != null && (expertCareCourse = userOnboardingModel.getExpertCareCourse()) != null) {
                    matchingFlowUserResponseModel = expertCareCourse.getMatchingResponse();
                }
                dVar.resumeWith(matchingFlowUserResponseModel);
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: MatchingFlowRepository.kt */
    /* renamed from: do.a$b */
    /* loaded from: classes2.dex */
    public static final class b implements CustomRetrofitCallback<MatchingResponse> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ls.d<MatchingResponse> f13177v;

        public b(h hVar) {
            this.f13177v = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<MatchingResponse> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            LogHelper.INSTANCE.e(a.this.f13174a, t3);
            this.f13177v.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<MatchingResponse> call, z<MatchingResponse> response) {
            ls.d<MatchingResponse> dVar = this.f13177v;
            i.g(call, "call");
            i.g(response, "response");
            try {
                CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                if (response.a()) {
                    dVar.resumeWith(response.f13696b);
                } else {
                    dVar.resumeWith(null);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(a.this.f13174a, "getMatchingTherapists Exception", e10);
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: MatchingFlowRepository.kt */
    @e(c = "com.theinnerhour.b2b.components.onboarding.repositories.MatchingFlowRepository", f = "MatchingFlowRepository.kt", l = {163}, m = "storeUserOnBoardingResponse")
    /* renamed from: do.a$c */
    /* loaded from: classes2.dex */
    public static final class c extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public a f13178u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f13179v;

        /* renamed from: x  reason: collision with root package name */
        public int f13181x;

        public c(ls.d<? super c> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f13179v = obj;
            this.f13181x |= LinearLayoutManager.INVALID_OFFSET;
            return a.this.c(null, this);
        }
    }

    /* compiled from: MatchingFlowRepository.kt */
    @e(c = "com.theinnerhour.b2b.components.onboarding.repositories.MatchingFlowRepository$storeUserOnBoardingResponse$2", f = "MatchingFlowRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: do.a$d */
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ MatchingFlowUserResponseModel f13182u;

        /* compiled from: MatchingFlowRepository.kt */
        /* renamed from: do.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0189a implements ValueEventListener {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ DatabaseReference f13183u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ MatchingFlowUserResponseModel f13184v;

            public C0189a(DatabaseReference databaseReference, MatchingFlowUserResponseModel matchingFlowUserResponseModel) {
                this.f13183u = databaseReference;
                this.f13184v = matchingFlowUserResponseModel;
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError error) {
                i.g(error, "error");
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                i.g(snapshot, "snapshot");
                ExpertCareMatchingCourseModel expertCareMatchingCourseModel = new ExpertCareMatchingCourseModel(this.f13184v);
                expertCareMatchingCourseModel.set_id(UtilsKt.getCourseId(Constants.COURSE_GENERIC));
                expertCareMatchingCourseModel.setCourseName(Constants.COURSE_GENERIC);
                expertCareMatchingCourseModel.setCourseStarted(true);
                k kVar = k.f19476a;
                this.f13183u.setValue(new UserOnboardingModel(null, null, expertCareMatchingCourseModel));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MatchingFlowUserResponseModel matchingFlowUserResponseModel, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f13182u = matchingFlowUserResponseModel;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new d(this.f13182u, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_USER_COURSES_NODE.concat(j02));
                i.f(reference, "getInstance().getReferen…_USER_COURSES_NODE}$uid\")");
                reference.addListenerForSingleValueEvent(new C0189a(reference, this.f13182u));
                return k.f19476a;
            }
            return k.f19476a;
        }
    }

    public final Object a(ls.d<? super MatchingFlowUserResponseModel> dVar) {
        String str;
        h hVar = new h(ca.a.G0(dVar));
        try {
            f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str = fVar.j0();
            } else {
                str = null;
            }
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            firebaseDatabase.getReference(Constants.FIREBASE_USER_COURSES_NODE + str).addListenerForSingleValueEvent(new C0188a(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13174a, e10);
        }
        return hVar.b();
    }

    public final Object b(MatchingFlowModel matchingFlowModel, ls.d<? super MatchingResponse> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        try {
            ((co.b) nr.b.a(co.b.class)).a("https://api.theinnerhour.com/v1/search/v2/therapists", matchingFlowModel).I(new b(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f13174a, e10);
        }
        return hVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(MatchingFlowUserResponseModel matchingFlowUserResponseModel, ls.d<? super k> dVar) {
        c cVar;
        int i6;
        Exception e10;
        a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f13181x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f13181x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar.f13179v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = cVar.f13181x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        aVar = cVar.f13178u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            LogHelper.INSTANCE.e(aVar.f13174a, e10);
                            return k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                        d dVar2 = new d(matchingFlowUserResponseModel, null);
                        cVar.f13178u = this;
                        cVar.f13181x = 1;
                        if (v.S(bVar, dVar2, cVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        aVar = this;
                        LogHelper.INSTANCE.e(aVar.f13174a, e10);
                        return k.f19476a;
                    }
                }
                return k.f19476a;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f13179v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = cVar.f13181x;
        if (i6 == 0) {
        }
        return k.f19476a;
    }
}
