package hp;

import android.app.Application;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.e1;
import com.appsflyer.R;
import com.theinnerhour.b2b.components.onboarding.model.ExpertCareMatchingCourseModel;
import com.theinnerhour.b2b.components.onboarding.model.MatchingFlowUserResponseModel;
import com.theinnerhour.b2b.components.onboarding.model.UserOnboardingModel;
import com.theinnerhour.b2b.components.resources.model.ResourceDetailResponse;
import com.theinnerhour.b2b.components.resources.model.ResourcesResponse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import gp.c;
import gv.n;
import hs.k;
import java.util.ArrayList;
import kc.f;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.r;
import kotlinx.coroutines.flow.x;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ResourceViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends androidx.lifecycle.b {
    public int A;
    public int B;
    public final c C;
    public final w<ResourcesResponse> D;
    public final w<ResourceDetailResponse> E;
    public final w<Boolean> F;

    /* renamed from: y  reason: collision with root package name */
    public final String f18073y;

    /* renamed from: z  reason: collision with root package name */
    public final x f18074z;

    /* compiled from: ResourceViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.resources.viewModel.ResourceViewModel$getDashboardResourceLists$1", f = "ResourceViewModel.kt", l = {R.styleable.AppCompatTheme_dividerVertical, R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend")
    /* renamed from: hp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0289a extends i implements p<d0, d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f18075u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f18077w;

        /* compiled from: ResourceViewModel.kt */
        /* renamed from: hp.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0290a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f18078u;

            public C0290a(a aVar) {
                this.f18078u = aVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, d dVar) {
                a aVar = this.f18078u;
                aVar.D.i((ResourcesResponse) obj);
                aVar.F.i(Boolean.FALSE);
                return k.f19476a;
            }
        }

        /* compiled from: Emitters.kt */
        @e(c = "com.theinnerhour.b2b.components.resources.viewModel.ResourceViewModel$getDashboardResourceLists$1$invokeSuspend$$inlined$transform$1", f = "ResourceViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
        /* renamed from: hp.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<kotlinx.coroutines.flow.e<? super ResourcesResponse>, d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f18079u;

            /* renamed from: v  reason: collision with root package name */
            public /* synthetic */ Object f18080v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.d f18081w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a f18082x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f18083y;

            /* compiled from: Emitters.kt */
            /* renamed from: hp.a$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0291a<T> implements kotlinx.coroutines.flow.e {

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.e<ResourcesResponse> f18084u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ a f18085v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ String f18086w;

                /* compiled from: Emitters.kt */
                @e(c = "com.theinnerhour.b2b.components.resources.viewModel.ResourceViewModel$getDashboardResourceLists$1$invokeSuspend$$inlined$transform$1$1", f = "ResourceViewModel.kt", l = {225, 228}, m = "emit")
                /* renamed from: hp.a$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0292a extends ns.c {

                    /* renamed from: u  reason: collision with root package name */
                    public /* synthetic */ Object f18087u;

                    /* renamed from: v  reason: collision with root package name */
                    public int f18088v;

                    /* renamed from: x  reason: collision with root package name */
                    public C0291a f18090x;

                    /* renamed from: y  reason: collision with root package name */
                    public kotlinx.coroutines.flow.e f18091y;

                    public C0292a(d dVar) {
                        super(dVar);
                    }

                    @Override // ns.a
                    public final Object invokeSuspend(Object obj) {
                        this.f18087u = obj;
                        this.f18088v |= LinearLayoutManager.INVALID_OFFSET;
                        return C0291a.this.b(null, this);
                    }
                }

                public C0291a(kotlinx.coroutines.flow.e eVar, a aVar, String str) {
                    this.f18085v = aVar;
                    this.f18086w = str;
                    this.f18084u = eVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
                @Override // kotlinx.coroutines.flow.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object b(T t3, d<? super k> dVar) {
                    C0292a c0292a;
                    int i6;
                    C0291a<T> c0291a;
                    kotlinx.coroutines.flow.e<ResourcesResponse> eVar;
                    ResourcesResponse resourcesResponse;
                    int i10;
                    int i11;
                    String page;
                    Integer totalPage;
                    if (dVar instanceof C0292a) {
                        c0292a = (C0292a) dVar;
                        int i12 = c0292a.f18088v;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c0292a.f18088v = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj = c0292a.f18087u;
                            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                            i6 = c0292a.f18088v;
                            if (i6 == 0) {
                                if (i6 != 1) {
                                    if (i6 == 2) {
                                        sp.b.d0(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    eVar = c0292a.f18091y;
                                    c0291a = c0292a.f18090x;
                                    sp.b.d0(obj);
                                    resourcesResponse = (ResourcesResponse) obj;
                                    a aVar2 = c0291a.f18085v;
                                    i10 = 0;
                                    if (resourcesResponse == null && (totalPage = resourcesResponse.getTotalPage()) != null) {
                                        i11 = totalPage.intValue();
                                    } else {
                                        i11 = 0;
                                    }
                                    aVar2.A = i11;
                                    if (resourcesResponse != null && (page = resourcesResponse.getPage()) != null) {
                                        i10 = Integer.parseInt(page);
                                    }
                                    c0291a.f18085v.B = i10;
                                    c0292a.f18090x = null;
                                    c0292a.f18091y = null;
                                    c0292a.f18088v = 2;
                                    if (eVar.b(resourcesResponse, c0292a) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                sp.b.d0(obj);
                                if (((Number) t3).intValue() > 0) {
                                    a aVar3 = this.f18085v;
                                    if (aVar3.B < aVar3.A) {
                                        aVar3.F.i(Boolean.TRUE);
                                        int i13 = aVar3.B + 1;
                                        aVar3.B = i13;
                                        String e10 = a.e(aVar3, this.f18086w);
                                        c0292a.f18090x = this;
                                        kotlinx.coroutines.flow.e<ResourcesResponse> eVar2 = this.f18084u;
                                        c0292a.f18091y = eVar2;
                                        c0292a.f18088v = 1;
                                        obj = aVar3.C.a(i13, e10, c0292a);
                                        if (obj == aVar) {
                                            return aVar;
                                        }
                                        c0291a = this;
                                        eVar = eVar2;
                                        resourcesResponse = (ResourcesResponse) obj;
                                        a aVar22 = c0291a.f18085v;
                                        i10 = 0;
                                        if (resourcesResponse == null) {
                                        }
                                        i11 = 0;
                                        aVar22.A = i11;
                                        if (resourcesResponse != null) {
                                            i10 = Integer.parseInt(page);
                                        }
                                        c0291a.f18085v.B = i10;
                                        c0292a.f18090x = null;
                                        c0292a.f18091y = null;
                                        c0292a.f18088v = 2;
                                        if (eVar.b(resourcesResponse, c0292a) == aVar) {
                                        }
                                    }
                                }
                            }
                            return k.f19476a;
                        }
                    }
                    c0292a = new C0292a(dVar);
                    Object obj2 = c0292a.f18087u;
                    ms.a aVar4 = ms.a.COROUTINE_SUSPENDED;
                    i6 = c0292a.f18088v;
                    if (i6 == 0) {
                    }
                    return k.f19476a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlinx.coroutines.flow.d dVar, d dVar2, a aVar, String str) {
                super(2, dVar2);
                this.f18081w = dVar;
                this.f18082x = aVar;
                this.f18083y = str;
            }

            @Override // ns.a
            public final d<k> create(Object obj, d<?> dVar) {
                b bVar = new b(this.f18081w, dVar, this.f18082x, this.f18083y);
                bVar.f18080v = obj;
                return bVar;
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.flow.e<? super ResourcesResponse> eVar, d<? super k> dVar) {
                return ((b) create(eVar, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f18079u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    C0291a c0291a = new C0291a((kotlinx.coroutines.flow.e) this.f18080v, this.f18082x, this.f18083y);
                    this.f18079u = 1;
                    if (this.f18081w.a(c0291a, this) == aVar) {
                        return aVar;
                    }
                }
                return k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0289a(String str, d<? super C0289a> dVar) {
            super(2, dVar);
            this.f18077w = str;
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new C0289a(this.f18077w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((C0289a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[RETURN] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r rVar;
            C0290a c0290a;
            int i6;
            String page;
            Integer totalPage;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i10 = this.f18075u;
            String str = this.f18077w;
            a aVar2 = a.this;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sp.b.d0(obj);
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                if (((Number) aVar2.f18074z.getValue()).intValue() == 0 && aVar2.A == 0) {
                    aVar2.F.i(Boolean.TRUE);
                    int i11 = aVar2.B;
                    String e10 = a.e(aVar2, str);
                    this.f18075u = 1;
                    obj = aVar2.C.a(i11, e10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                rVar = new r(new b(aVar2.f18074z, null, aVar2, str));
                c0290a = new C0290a(aVar2);
                this.f18075u = 2;
                if (rVar.a(c0290a, this) == aVar) {
                    return aVar;
                }
                return k.f19476a;
            }
            ResourcesResponse resourcesResponse = (ResourcesResponse) obj;
            int i12 = 0;
            if (resourcesResponse != null && (totalPage = resourcesResponse.getTotalPage()) != null) {
                i6 = totalPage.intValue();
            } else {
                i6 = 0;
            }
            aVar2.A = i6;
            if (resourcesResponse != null && (page = resourcesResponse.getPage()) != null) {
                i12 = Integer.parseInt(page);
            }
            aVar2.B = i12;
            aVar2.D.i(resourcesResponse);
            aVar2.F.i(Boolean.FALSE);
            rVar = new r(new b(aVar2.f18074z, null, aVar2, str));
            c0290a = new C0290a(aVar2);
            this.f18075u = 2;
            if (rVar.a(c0290a, this) == aVar) {
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f18073y = "ResourceViewModel";
        this.f18074z = tr.r.f(0);
        this.B = 1;
        new e1();
        this.C = new c();
        this.D = new w<>();
        this.E = new w<>();
        this.F = new w<>();
    }

    public static final String e(a aVar, String str) {
        k kVar;
        ExpertCareMatchingCourseModel expertCareCourse;
        MatchingFlowUserResponseModel matchingResponse;
        ArrayList<String> expertise;
        aVar.getClass();
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    return "general-well-being";
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    return Constants.COURSE_DEPRESSION;
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    return Constants.COURSE_STRESS;
                }
                break;
            case 109840:
                if (str.equals(Constants.COURSE_OCD)) {
                    return Constants.COURSE_OCD;
                }
                break;
            case 2989151:
                if (str.equals(Constants.COURSE_ADHD)) {
                    return Constants.COURSE_ADHD;
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    return Constants.COURSE_ANGER;
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    return "sleep-disturbances";
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    return "anxiety";
                }
                break;
        }
        UserOnboardingModel userOnboardingModel = FirebasePersistence.getInstance().getUserOnboardingModel();
        String str2 = "";
        if (userOnboardingModel != null && (expertCareCourse = userOnboardingModel.getExpertCareCourse()) != null && (matchingResponse = expertCareCourse.getMatchingResponse()) != null && (expertise = matchingResponse.getExpertise()) != null) {
            for (String str3 : expertise) {
                if (n.B0(str2)) {
                    str2 = str3;
                } else {
                    str2 = str2 + ',' + str3;
                }
            }
            kVar = k.f19476a;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return "depression,anxiety";
        }
        return str2;
    }

    public final void f(String str) {
        try {
            v.H(f.H(this), null, 0, new C0289a(str, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18073y, e10);
        }
    }
}
