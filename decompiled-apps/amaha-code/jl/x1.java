package jl;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: NotV4SuggestedActivityViewModel.kt */
/* loaded from: classes2.dex */
public final class x1 extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<Boolean> A;
    public final hs.i B;

    /* renamed from: x  reason: collision with root package name */
    public final cn.e1 f22387x;

    /* renamed from: y  reason: collision with root package name */
    public final String f22388y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<Integer> f22389z;

    /* compiled from: NotV4SuggestedActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<HashMap<String, String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f22390u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<HashMap<String, String>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* compiled from: NotV4SuggestedActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$addOrUpdateSuggestedActivityCompletion$1", f = "NotV4SuggestedActivityViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22391u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ SuggestedActivityModel f22392v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ x1 f22393w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f22394x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f22395y;

        /* compiled from: NotV4SuggestedActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$addOrUpdateSuggestedActivityCompletion$1$1", f = "NotV4SuggestedActivityViewModel.kt", l = {R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public kotlin.jvm.internal.x f22396u;

            /* renamed from: v  reason: collision with root package name */
            public int f22397v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ SuggestedActivityModel f22398w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ x1 f22399x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f22400y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ int f22401z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SuggestedActivityModel suggestedActivityModel, x1 x1Var, String str, int i6, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f22398w = suggestedActivityModel;
                this.f22399x = x1Var;
                this.f22400y = str;
                this.f22401z = i6;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f22398w, this.f22399x, this.f22400y, this.f22401z, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.Boolean] */
            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.x xVar;
                kotlin.jvm.internal.x xVar2;
                ArrayList<SuggestedActivityModel> planSuggested;
                Object obj2;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f22397v;
                x1 x1Var = this.f22399x;
                if (i6 != 0) {
                    if (i6 == 1) {
                        xVar2 = this.f22396u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    xVar = new kotlin.jvm.internal.x();
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    String str = this.f22400y;
                    Course courseByName = firebasePersistence.getCourseByName(str);
                    SuggestedActivityModel suggestedActivityModel = this.f22398w;
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
                            xVar.f23469u = Boolean.valueOf(!suggestedActivityModel2.isCompleted());
                            suggestedActivityModel2.setCompleted(true);
                            firebasePersistence.updateUserOnFirebase();
                            ApplicationPersistence.getInstance().setStringValue(defpackage.b.m("suggested_", str, "_recent"), suggestedActivityModel2.getContent_id());
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
                        String str2 = this.f22400y;
                        boolean isFree = suggestedActivityModel.isFree();
                        this.f22396u = xVar;
                        this.f22397v = 1;
                        if (e1Var.l(concat, "main_activity", content_label, true, str2, "suggested_activity", isFree, this) == aVar) {
                            return aVar;
                        }
                        xVar2 = xVar;
                    }
                    x1Var.f22389z.i(new Integer(this.f22401z));
                    x1Var.A.i(xVar.f23469u);
                    return hs.k.f19476a;
                }
                xVar = xVar2;
                x1Var.f22389z.i(new Integer(this.f22401z));
                x1Var.A.i(xVar.f23469u);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SuggestedActivityModel suggestedActivityModel, x1 x1Var, String str, int i6, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f22392v = suggestedActivityModel;
            this.f22393w = x1Var;
            this.f22394x = str;
            this.f22395y = i6;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f22392v, this.f22393w, this.f22394x, this.f22395y, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22391u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                a aVar2 = new a(this.f22392v, this.f22393w, this.f22394x, this.f22395y, null);
                this.f22391u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4SuggestedActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4SuggestedActivityViewModel$fetchSuggestedActivityDescription$1$1", f = "NotV4SuggestedActivityViewModel.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public final /* synthetic */ ArrayList<SuggestedActivityModel> A;
        public final /* synthetic */ HashMap<String, String> B;

        /* renamed from: u  reason: collision with root package name */
        public int f22402u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22403v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ SuggestedActivityModel f22404w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ x1 f22405x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f22406y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f22407z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SuggestedActivityModel suggestedActivityModel, x1 x1Var, String str, int i6, ArrayList<SuggestedActivityModel> arrayList, HashMap<String, String> hashMap, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f22404w = suggestedActivityModel;
            this.f22405x = x1Var;
            this.f22406y = str;
            this.f22407z = i6;
            this.A = arrayList;
            this.B = hashMap;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            c cVar = new c(this.f22404w, this.f22405x, this.f22406y, this.f22407z, this.A, this.B, dVar);
            cVar.f22403v = obj;
            return cVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0091 A[Catch: Exception -> 0x009d, TRY_LEAVE, TryCatch #0 {Exception -> 0x009d, blocks: (B:6:0x0017, B:16:0x0041, B:18:0x0045, B:21:0x0052, B:23:0x0088, B:25:0x0091, B:11:0x002a, B:13:0x0030, B:22:0x005f), top: B:31:0x000f }] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22402u;
            int i10 = this.f22407z;
            AbstractMap abstractMap = this.B;
            x1 x1Var = this.f22405x;
            SuggestedActivityModel suggestedActivityModel = this.f22404w;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(x1Var.f22388y, e10);
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f22403v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f22403v;
                if (suggestedActivityModel.getContent_id() != null) {
                    cn.e1 e1Var = x1Var.f22387x;
                    String content_id = suggestedActivityModel.getContent_id();
                    this.f22403v = d0Var2;
                    this.f22402u = 1;
                    obj = e1Var.i(content_id, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String str = x1Var.f22388y;
                    logHelper.e(str, "missing content_id: " + this.f22406y + ", pos " + i10 + ", label " + suggestedActivityModel.getContent_label());
                    if (i10 == this.A.size() - 1) {
                        ((androidx.lifecycle.w) x1Var.B.getValue()).i(abstractMap);
                    }
                    return hs.k.f19476a;
                }
            }
            hs.f fVar = (hs.f) obj;
            if (fVar != null) {
                abstractMap.put(fVar.f19464u, fVar.f19465v);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                String content_id2 = suggestedActivityModel.getContent_id();
                kotlin.jvm.internal.i.d(content_id2);
                abstractMap.put(content_id2, "");
            }
            if (i10 == this.A.size() - 1) {
            }
            return hs.k.f19476a;
        }
    }

    public x1(cn.e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f22387x = repository;
        this.f22388y = LogHelper.INSTANCE.makeLogTag("NotV4SAViewModel");
        this.f22389z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        this.B = sp.b.O(a.f22390u);
    }

    public static Integer g(String str, String slug, hc.d assessmentUtils) {
        kotlin.jvm.internal.i.g(slug, "slug");
        kotlin.jvm.internal.i.g(assessmentUtils, "assessmentUtils");
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    if (kotlin.jvm.internal.i.b(slug, "gratitude")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomGratitudeDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "mindfulness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomMindfulnessDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "social-skills")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomSocialDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "self-esteem")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomSelfEsteemDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "thought-work")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomThinkingDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "physical-activity")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomActivityDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomRelaxationDesc);
                    }
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    if (kotlin.jvm.internal.i.b(slug, "low-enjoyment")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomInterestDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "low-energy")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomFatigueDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "lack-of-concentration")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomFocusDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "low-self-esteem")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomSelfEsteemDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "negative-thoughts")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomNegativityDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "anxiety")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomAnxietyDesc);
                    }
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    if (kotlin.jvm.internal.i.b(slug, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomRelaxationDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "attention-training")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomFocusDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "problem-solving")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomProblemDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "assertiveness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomCommunicationDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "thought-balancing")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomNegativityDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "balancing-work-and-life")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomWorkLifeDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "health")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomHealthDesc);
                    }
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    if (kotlin.jvm.internal.i.b(slug, "understanding-anger")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomUnderstandingDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "self-calming")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomSelfCalmDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "mindfulness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomMindfulDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "overcoming-rumination")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomRuminationDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "communication")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomCommunicationDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "thought-work")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomNegativityDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomRelaxationDesc);
                    }
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    if (kotlin.jvm.internal.i.b(slug, "sleep-hygiene")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomHygieneDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, Constants.SCREEN_THOUGHTS)) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomNegativityDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "stimulus-control-and-sleep-restriction")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomRestrictDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomRelaxationDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "mindfulness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomMindfulDesc);
                    }
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    if (kotlin.jvm.internal.i.b(slug, "managing-worry")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomExcessDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "tolerating-uncertainty")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomToleranceDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomMuscleDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "focus-and-attention")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomFocusDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "thought-work")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomNegativityDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "problem-solving-and-overcoming-avoidance")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomProblemDesc);
                    }
                    if (kotlin.jvm.internal.i.b(slug, "sleeping-well")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomSleepDesc);
                    }
                }
                break;
        }
        return null;
    }

    public final void e(SuggestedActivityModel suggestedActivityModel, String str, int i6) {
        if (suggestedActivityModel != null && str != null) {
            try {
                ta.v.H(kc.f.H(this), null, 0, new b(suggestedActivityModel, this, str, i6, null), 3);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f22388y, e10);
            }
        }
    }

    public final void f(String str) {
        String str2;
        try {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            if (str == null) {
                str2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            } else {
                str2 = str;
            }
            ArrayList<SuggestedActivityModel> planSuggested = firebasePersistence.getCourseByName(str2).getPlanSuggested();
            HashMap hashMap = new HashMap();
            int i6 = 0;
            for (Object obj : planSuggested) {
                int i10 = i6 + 1;
                if (i6 >= 0) {
                    ta.v.H(kc.f.H(this), kotlinx.coroutines.o0.f23642c, 0, new c((SuggestedActivityModel) obj, this, str, i6, planSuggested, hashMap, null), 2);
                    i6 = i10;
                } else {
                    ca.a.t1();
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22388y, e10);
        }
    }

    public final Integer h(String str, String str2, hc.d assessmentUtils) {
        kotlin.jvm.internal.i.g(assessmentUtils, "assessmentUtils");
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    if (kotlin.jvm.internal.i.b(str2, "gratitude")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomGratitude);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "mindfulness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomMindfulness);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "social-skills")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomSocial);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "self-esteem")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomSelfEsteem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-work")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomThinking);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "physical-activity")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomActivity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedHappinessSymptomRelaxation);
                    }
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    if (kotlin.jvm.internal.i.b(str2, "low-enjoyment")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomInterest);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "low-energy")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomFatigue);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "lack-of-concentration")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "low-self-esteem")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomSelfEsteem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "negative-thoughts")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "anxiety")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedDepressionSymptomAnxiety);
                    }
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomRelaxation);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "attention-training")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "problem-solving")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomProblem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "assertiveness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomCommunication);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-balancing")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "balancing-work-and-life")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomWorkLife);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "health")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedStressSymptomHealth);
                    }
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    if (kotlin.jvm.internal.i.b(str2, "understanding-anger")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomUnderstanding);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "self-calming")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomSelfCalm);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "mindfulness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomMindful);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "overcoming-rumination")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomRumination);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "communication")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomCommunication);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-work")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedAngerSymptomRelaxation);
                    }
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    if (kotlin.jvm.internal.i.b(str2, "sleep-hygiene")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomHygiene);
                    }
                    if (kotlin.jvm.internal.i.b(str2, Constants.SCREEN_THOUGHTS)) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "stimulus-control-and-sleep-restriction")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomRestrict);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomRelaxation);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "mindfulness")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedSleepSymptomMindful);
                    }
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    if (kotlin.jvm.internal.i.b(str2, "managing-worry")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomExcess);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "tolerating-uncertainty")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomTolerance);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomMuscle);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "focus-and-attention")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-work")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "problem-solving-and-overcoming-avoidance")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomProblem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "sleeping-well")) {
                        return Integer.valueOf((int) com.theinnerhour.b2b.R.string.notV4SuggestedWorrySymptomSleep);
                    }
                }
                break;
        }
        return null;
    }
}
