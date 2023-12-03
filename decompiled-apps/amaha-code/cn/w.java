package cn;

import android.app.Application;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.List;
import jl.t1;
/* compiled from: LibraryResourcesViewModel.kt */
/* loaded from: classes2.dex */
public final class w extends androidx.lifecycle.b {
    public final kotlinx.coroutines.flow.x A;
    public final androidx.lifecycle.w<hs.f<String, UserLibraryItemAccessModel>> B;
    public final androidx.lifecycle.w<List<LearningHubModel>> C;
    public final androidx.lifecycle.w<Boolean> D;
    public kotlinx.coroutines.q1 E;
    public final hs.i F;
    public final hs.i G;

    /* renamed from: y  reason: collision with root package name */
    public final e1 f5804y;

    /* renamed from: z  reason: collision with root package name */
    public final String f5805z;

    /* compiled from: LibraryResourcesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<t1> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f5806u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final t1 invoke() {
            return new t1();
        }
    }

    /* compiled from: LibraryResourcesViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$fetchFavouriteStatusForResources$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5807u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ LearningHubModel f5808v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ w f5809w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5810x;

        /* compiled from: LibraryResourcesViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$fetchFavouriteStatusForResources$1$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f5811u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ LearningHubModel f5812v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ w f5813w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ String f5814x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LearningHubModel learningHubModel, w wVar, String str, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f5812v = learningHubModel;
                this.f5813w = wVar;
                this.f5814x = str;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f5812v, this.f5813w, this.f5814x, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                hs.f<String, UserLibraryItemAccessModel> fVar;
                String id2;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f5811u;
                w wVar = this.f5813w;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    LearningHubModel learningHubModel = this.f5812v;
                    if (learningHubModel != null && (id2 = learningHubModel.getId()) != null) {
                        e1 e1Var = wVar.f5804y;
                        this.f5811u = 1;
                        obj = e1Var.d(this.f5814x, id2, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        fVar = null;
                        wVar.B.i(fVar);
                        return hs.k.f19476a;
                    }
                }
                fVar = (hs.f) obj;
                wVar.B.i(fVar);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LearningHubModel learningHubModel, w wVar, String str, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f5808v = learningHubModel;
            this.f5809w = wVar;
            this.f5810x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f5808v, this.f5809w, this.f5810x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5807u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                a aVar2 = new a(this.f5808v, this.f5809w, this.f5810x, null);
                this.f5807u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryResourcesViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryResourcesViewModel$fetchLearningHubResources$1", f = "LibraryResourcesViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlActivated}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5815u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f5817w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List<String> f5818x;

        /* compiled from: LibraryResourcesViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a<T> implements kotlinx.coroutines.flow.e {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ w f5819u;

            public a(w wVar) {
                this.f5819u = wVar;
            }

            @Override // kotlinx.coroutines.flow.e
            public final Object b(Object obj, ls.d dVar) {
                w wVar = this.f5819u;
                wVar.C.l((List) obj);
                wVar.D.l(Boolean.FALSE);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f5817w = str;
            this.f5818x = list;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f5817w, this.f5818x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5815u;
            w wVar = w.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.flow.d g5 = wVar.f5804y.g(wVar.A, this.f5817w, this.f5818x);
                    a aVar2 = new a(wVar);
                    this.f5815u = 1;
                    if (g5.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.i(wVar.f5805z, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryResourcesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<SingleUseEvent<? extends String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f5820u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<SingleUseEvent<? extends String>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e1 repository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f5804y = repository;
        this.f5805z = LogHelper.INSTANCE.makeLogTag(w.class);
        this.A = tr.r.f(0);
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        this.D = new androidx.lifecycle.w<>();
        this.F = sp.b.O(a.f5806u);
        this.G = sp.b.O(d.f5820u);
    }

    public final void e(LearningHubModel learningHubModel) {
        String j02;
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                ta.v.H(kc.f.H(this), null, 0, new b(learningHubModel, this, j02, null), 3);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5805z, e10);
        }
    }

    public final void f(String programme, List<String> list) {
        kotlin.jvm.internal.i.g(programme, "programme");
        try {
            this.A.setValue(0);
            this.D.l(Boolean.TRUE);
            kotlinx.coroutines.q1 q1Var = this.E;
            if (q1Var != null) {
                q1Var.g(null);
            }
            this.E = ta.v.H(kc.f.H(this), null, 0, new c(programme, list, null), 3);
        } catch (Exception e10) {
            LogHelper.INSTANCE.i(this.f5805z, e10);
        }
    }

    public final androidx.lifecycle.w<hs.f<String, UserLibraryItemAccessModel>> g() {
        return this.B;
    }
}
