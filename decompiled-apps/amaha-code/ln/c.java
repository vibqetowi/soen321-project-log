package ln;

import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.ScreenModel;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.d0;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: MiniCoursesViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$checkForOtherAssets$1", f = "MiniCoursesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f24456u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MiniCoursesViewModel f24457v;

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ u f24458u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ MiniCoursesViewModel f24459v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, MiniCoursesViewModel miniCoursesViewModel) {
            super(2);
            this.f24458u = uVar;
            this.f24459v = miniCoursesViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            r2.f24458u.f23466u = true;
            com.theinnerhour.b2b.persistence.ApplicationPersistence.getInstance().getCourseAssets().add(new com.theinnerhour.b2b.model.OfflineAsset(com.theinnerhour.b2b.utils.UtilFunKt.paramsMapToString(r4.getParams().get("s15_gif_link"))));
         */
        @Override // ss.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final k invoke(Boolean bool, TemplateModel templateModel) {
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
                    LogHelper.INSTANCE.e(this.f24459v.f11378y, e10);
                }
            }
            return k.f19476a;
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements p<Boolean, TemplateModel, k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ u f24460u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ MiniCoursesViewModel f24461v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u uVar, MiniCoursesViewModel miniCoursesViewModel) {
            super(2);
            this.f24460u = uVar;
            this.f24461v = miniCoursesViewModel;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
            r2.f24460u.f23466u = true;
            com.theinnerhour.b2b.persistence.ApplicationPersistence.getInstance().getCourseAssets().add(new com.theinnerhour.b2b.model.OfflineAsset(com.theinnerhour.b2b.utils.UtilFunKt.paramsMapToString(r4.getParams().get("s15_gif_link"))));
         */
        @Override // ss.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final k invoke(Boolean bool, TemplateModel templateModel) {
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
                    LogHelper.INSTANCE.e(this.f24461v.f11378y, e10);
                }
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(MiniCoursesViewModel miniCoursesViewModel, String str, ls.d dVar) {
        super(2, dVar);
        this.f24456u = str;
        this.f24457v = miniCoursesViewModel;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f24457v, this.f24456u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        MiniCourse miniCourse;
        MiniCoursesViewModel miniCoursesViewModel = this.f24457v;
        sp.b.d0(obj);
        String str = this.f24456u;
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
                u uVar = new u();
                if (miniCourse != null) {
                    Iterator<CourseDayModelV1> it2 = miniCourse.getPlan().iterator();
                    while (it2.hasNext()) {
                        String content_id = it2.next().getContent_id();
                        kotlin.jvm.internal.i.d(content_id);
                        FireStoreUtilsKt.fetchCourseContent("en", content_id, new a(uVar, miniCoursesViewModel));
                    }
                    if (uVar.f23466u) {
                        MyApplication.V.a().g();
                    }
                }
            } else {
                u uVar2 = new u();
                Iterator<MiniCourse> it3 = FirebasePersistence.getInstance().getUser().getMiniCourses().iterator();
                while (it3.hasNext()) {
                    Iterator<CourseDayModelV1> it4 = it3.next().getPlan().iterator();
                    while (it4.hasNext()) {
                        String content_id2 = it4.next().getContent_id();
                        kotlin.jvm.internal.i.d(content_id2);
                        FireStoreUtilsKt.fetchCourseContent("en", content_id2, new b(uVar2, miniCoursesViewModel));
                    }
                }
                if (uVar2.f23466u) {
                    MyApplication.V.a().g();
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(miniCoursesViewModel.f11378y, e10);
        }
        return k.f19476a;
    }
}
