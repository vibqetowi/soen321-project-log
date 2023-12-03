package jl;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.ScreenModel;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Iterator;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$checkForOtherAssets$1", f = "NotV4DashboardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f22418u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22419v;

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f22420u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22421v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.u uVar, NotV4DashboardViewModel notV4DashboardViewModel) {
            super(2);
            this.f22420u = uVar;
            this.f22421v = notV4DashboardViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            r2.f22420u.f23466u = true;
            com.theinnerhour.b2b.persistence.ApplicationPersistence.getInstance().getCourseAssets().add(new com.theinnerhour.b2b.model.OfflineAsset(com.theinnerhour.b2b.utils.UtilFunKt.paramsMapToString(r4.getParams().get("s15_gif_link"))));
         */
        @Override // ss.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            TemplateModel templateModel2 = templateModel;
            if (bool.booleanValue() && templateModel2 != null) {
                try {
                    Iterator<ScreenModel> it = templateModel2.getTemplate().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ScreenModel next = it.next();
                        if (kotlin.jvm.internal.i.b(next.getSlug(), "s15")) {
                            break;
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f22421v.A, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f22422u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22423v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.u uVar, NotV4DashboardViewModel notV4DashboardViewModel) {
            super(2);
            this.f22422u = uVar;
            this.f22423v = notV4DashboardViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            r2.f22422u.f23466u = true;
            com.theinnerhour.b2b.persistence.ApplicationPersistence.getInstance().getCourseAssets().add(new com.theinnerhour.b2b.model.OfflineAsset(com.theinnerhour.b2b.utils.UtilFunKt.paramsMapToString(r4.getParams().get("s15_gif_link"))));
         */
        @Override // ss.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
            TemplateModel templateModel2 = templateModel;
            if (bool.booleanValue() && templateModel2 != null) {
                try {
                    Iterator<ScreenModel> it = templateModel2.getTemplate().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ScreenModel next = it.next();
                        if (kotlin.jvm.internal.i.b(next.getSlug(), "s15")) {
                            break;
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f22423v.A, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(NotV4DashboardViewModel notV4DashboardViewModel, String str, ls.d dVar) {
        super(2, dVar);
        this.f22418u = str;
        this.f22419v = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new y0(this.f22419v, this.f22418u, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        MiniCourse miniCourse;
        NotV4DashboardViewModel notV4DashboardViewModel = this.f22419v;
        sp.b.d0(obj);
        String str = this.f22418u;
        try {
            if (str != null) {
                Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getMiniCourses().iterator();
                while (true) {
                    if (it.hasNext()) {
                        miniCourse = it.next();
                        if (kotlin.jvm.internal.i.b(miniCourse.getDomain(), str)) {
                            break;
                        }
                    } else {
                        miniCourse = null;
                        break;
                    }
                }
                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                if (miniCourse != null) {
                    Iterator<CourseDayModelV1> it2 = miniCourse.getPlan().iterator();
                    while (it2.hasNext()) {
                        String content_id = it2.next().getContent_id();
                        kotlin.jvm.internal.i.d(content_id);
                        FireStoreUtilsKt.fetchCourseContent("en", content_id, new a(uVar, notV4DashboardViewModel));
                    }
                    if (uVar.f23466u) {
                        MyApplication.V.a().g();
                    }
                }
            } else {
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                Iterator<MiniCourse> it3 = FirebasePersistence.getInstance().getUser().getMiniCourses().iterator();
                while (it3.hasNext()) {
                    Iterator<CourseDayModelV1> it4 = it3.next().getPlan().iterator();
                    while (it4.hasNext()) {
                        String content_id2 = it4.next().getContent_id();
                        kotlin.jvm.internal.i.d(content_id2);
                        FireStoreUtilsKt.fetchCourseContent("en", content_id2, new b(uVar2, notV4DashboardViewModel));
                    }
                }
                if (uVar2.f23466u) {
                    MyApplication.V.a().g();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
        }
        return hs.k.f19476a;
    }
}
