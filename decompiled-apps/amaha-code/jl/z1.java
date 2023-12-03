package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: NotV4SuggestedActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$addOrUpdateSuggestedActivityBookmark$1", f = "NotV4SuggestedActivityViewModel.kt", l = {R.styleable.AppCompatTheme_windowFixedHeightMajor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class z1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22453u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SuggestedActivityModel f22454v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x1 f22455w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f22456x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f22457y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f22458z;

    /* compiled from: NotV4SuggestedActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$addOrUpdateSuggestedActivityBookmark$1$1", f = "NotV4SuggestedActivityViewModel.kt", l = {128}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22459u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ SuggestedActivityModel f22460v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x1 f22461w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f22462x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22463y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f22464z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SuggestedActivityModel suggestedActivityModel, x1 x1Var, boolean z10, String str, int i6, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22460v = suggestedActivityModel;
            this.f22461w = x1Var;
            this.f22462x = z10;
            this.f22463y = str;
            this.f22464z = i6;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22460v, this.f22461w, this.f22462x, this.f22463y, this.f22464z, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<SuggestedActivityModel> planSuggested;
            Object obj2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22459u;
            x1 x1Var = this.f22461w;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                Course courseByName = firebasePersistence.getCourseByName(this.f22463y);
                SuggestedActivityModel suggestedActivityModel = this.f22460v;
                if (courseByName != null && (planSuggested = courseByName.getPlanSuggested()) != null) {
                    Iterator<T> it = planSuggested.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.i.b(((SuggestedActivityModel) obj2).getContent_id(), suggestedActivityModel.getContent_id())) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    SuggestedActivityModel suggestedActivityModel2 = (SuggestedActivityModel) obj2;
                    if (suggestedActivityModel2 != null) {
                        suggestedActivityModel2.setFavorite(this.f22462x);
                        firebasePersistence.updateUserOnFirebase();
                    }
                }
                if (suggestedActivityModel.getContent_id() != null) {
                    cn.e1 e1Var = x1Var.f22387x;
                    String content_id = suggestedActivityModel.getContent_id();
                    kotlin.jvm.internal.i.d(content_id);
                    String concat = "suggested_".concat(content_id);
                    String content_label = suggestedActivityModel.getContent_label();
                    if (content_label == null) {
                        content_label = "";
                    }
                    boolean z10 = this.f22462x;
                    String str = this.f22463y;
                    boolean isFree = suggestedActivityModel.isFree();
                    this.f22459u = 1;
                    if (e1Var.m(concat, "main_activity", content_label, z10, str, "suggested_activity", isFree, this) == aVar) {
                        return aVar;
                    }
                }
            }
            x1Var.f22389z.i(new Integer(this.f22464z));
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(SuggestedActivityModel suggestedActivityModel, x1 x1Var, boolean z10, String str, int i6, ls.d<? super z1> dVar) {
        super(2, dVar);
        this.f22454v = suggestedActivityModel;
        this.f22455w = x1Var;
        this.f22456x = z10;
        this.f22457y = str;
        this.f22458z = i6;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new z1(this.f22454v, this.f22455w, this.f22456x, this.f22457y, this.f22458z, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((z1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22453u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22454v, this.f22455w, this.f22456x, this.f22457y, this.f22458z, null);
            this.f22453u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
