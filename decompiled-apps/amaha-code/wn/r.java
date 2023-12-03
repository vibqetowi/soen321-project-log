package wn;

import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.components.multiTracker.model.UserTrackFirestoreParentModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ta.v;
/* compiled from: MultiTrackerViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerViewModel$checkAndUpdateTrackerStats$2$1", f = "MultiTrackerViewModel.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public ls.d f36834u;

    /* renamed from: v  reason: collision with root package name */
    public int f36835v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f36836w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ t f36837x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f36838y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MultiTrackerModel f36839z;

    /* compiled from: MultiTrackerViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f36840a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ t f36841b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f36842c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ MultiTrackerModel f36843d;

        /* compiled from: MultiTrackerViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerViewModel$checkAndUpdateTrackerStats$2$1$1$1", f = "MultiTrackerViewModel.kt", l = {R.styleable.AppCompatTheme_editTextStyle}, m = "invokeSuspend")
        /* renamed from: wn.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0618a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {
            public final /* synthetic */ MultiTrackerModel A;

            /* renamed from: u  reason: collision with root package name */
            public ls.d f36844u;

            /* renamed from: v  reason: collision with root package name */
            public int f36845v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ls.d<Boolean> f36846w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ t f36847x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f36848y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ MultiTrackerFirestoreStatsModel f36849z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0618a(ls.d<? super Boolean> dVar, t tVar, String str, MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel, MultiTrackerModel multiTrackerModel, ls.d<? super C0618a> dVar2) {
                super(2, dVar2);
                this.f36846w = dVar;
                this.f36847x = tVar;
                this.f36848y = str;
                this.f36849z = multiTrackerFirestoreStatsModel;
                this.A = multiTrackerModel;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0618a(this.f36846w, this.f36847x, this.f36848y, this.f36849z, this.A, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0618a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ls.d<Boolean> dVar;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f36845v;
                if (i6 != 0) {
                    if (i6 == 1) {
                        dVar = this.f36844u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    ls.d<Boolean> dVar2 = this.f36846w;
                    this.f36844u = dVar2;
                    this.f36845v = 1;
                    Object e10 = t.e(this.f36847x, this.f36848y, this.f36849z, this.A, this);
                    if (e10 == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                    obj = e10;
                }
                dVar.resumeWith(obj);
                return hs.k.f19476a;
            }
        }

        /* compiled from: MultiTrackerViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerViewModel$checkAndUpdateTrackerStats$2$1$1$2", f = "MultiTrackerViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public ls.d f36850u;

            /* renamed from: v  reason: collision with root package name */
            public int f36851v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ls.d<Boolean> f36852w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ t f36853x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f36854y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ MultiTrackerModel f36855z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ls.d<? super Boolean> dVar, t tVar, String str, MultiTrackerModel multiTrackerModel, ls.d<? super b> dVar2) {
                super(2, dVar2);
                this.f36852w = dVar;
                this.f36853x = tVar;
                this.f36854y = str;
                this.f36855z = multiTrackerModel;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f36852w, this.f36853x, this.f36854y, this.f36855z, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Object e10;
                ls.d<Boolean> dVar;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f36851v;
                if (i6 != 0) {
                    if (i6 == 1) {
                        dVar = this.f36850u;
                        sp.b.d0(obj);
                        e10 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = new MultiTrackerFirestoreStatsModel(0, 0, 0, 0, 0, 0, 0L, 0L, 0, 511, null);
                    ls.d<Boolean> dVar2 = this.f36852w;
                    this.f36850u = dVar2;
                    this.f36851v = 1;
                    e10 = t.e(this.f36853x, this.f36854y, multiTrackerFirestoreStatsModel, this.f36855z, this);
                    if (e10 == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                }
                dVar.resumeWith(e10);
                return hs.k.f19476a;
            }
        }

        public a(MultiTrackerModel multiTrackerModel, t tVar, String str, ls.d dVar) {
            this.f36840a = dVar;
            this.f36841b = tVar;
            this.f36842c = str;
            this.f36843d = multiTrackerModel;
        }

        @Override // ya.d
        public final void a(ya.h<fe.g> it) {
            MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel;
            UserTrackFirestoreParentModel userTrackFirestoreParentModel;
            kotlin.jvm.internal.i.g(it, "it");
            if (it.isSuccessful()) {
                fe.g result = it.getResult();
                if (result != null && (userTrackFirestoreParentModel = (UserTrackFirestoreParentModel) result.d(UserTrackFirestoreParentModel.class)) != null) {
                    multiTrackerFirestoreStatsModel = userTrackFirestoreParentModel.getMultiTrackerStats();
                } else {
                    multiTrackerFirestoreStatsModel = null;
                }
                if (multiTrackerFirestoreStatsModel != null) {
                    v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new C0618a(this.f36840a, this.f36841b, this.f36842c, multiTrackerFirestoreStatsModel, this.f36843d, null), 3);
                    return;
                } else {
                    v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new b(this.f36840a, this.f36841b, this.f36842c, this.f36843d, null), 3);
                    return;
                }
            }
            this.f36840a.resumeWith(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(ls.d<? super Boolean> dVar, t tVar, String str, MultiTrackerModel multiTrackerModel, ls.d<? super r> dVar2) {
        super(2, dVar2);
        this.f36836w = dVar;
        this.f36837x = tVar;
        this.f36838y = str;
        this.f36839z = multiTrackerModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r(this.f36836w, this.f36837x, this.f36838y, this.f36839z, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((r) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ls.d<Boolean> dVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36835v;
        t tVar = this.f36837x;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(tVar.f36859x, e10);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                dVar = this.f36834u;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            b.f36765a.getClass();
            MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = b.f36767c;
            MultiTrackerModel multiTrackerModel = this.f36839z;
            ls.d<Boolean> dVar2 = this.f36836w;
            String str = this.f36838y;
            if (multiTrackerFirestoreStatsModel != null) {
                this.f36834u = dVar2;
                this.f36835v = 1;
                obj = t.e(tVar, str, multiTrackerFirestoreStatsModel, multiTrackerModel, this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            } else {
                b.c(str);
                FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).d().addOnCompleteListener(new a(multiTrackerModel, tVar, str, dVar2));
                return hs.k.f19476a;
            }
        }
        dVar.resumeWith(obj);
        return hs.k.f19476a;
    }
}
