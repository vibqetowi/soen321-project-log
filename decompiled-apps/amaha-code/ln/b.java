package ln;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import gv.r;
import hs.k;
import java.util.ArrayList;
import java.util.Iterator;
import kc.f;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: MiniCoursesViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$checkForCourses$1", f = "MiniCoursesViewModel.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMinor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f24445u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ MiniCoursesViewModel f24446v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f24447w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f24448x;

    /* compiled from: MiniCoursesViewModel.kt */
    /* renamed from: ln.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0388b implements CourseApiUtil.MiniCourseApiInitUtilInterface {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniCoursesViewModel f24452a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f24453b;

        public C0388b(MiniCoursesViewModel miniCoursesViewModel, String str) {
            this.f24452a = miniCoursesViewModel;
            this.f24453b = str;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseApiInitUtilInterface
        public final void miniCourseApiInitComplete(boolean z10) {
            MiniCoursesViewModel miniCoursesViewModel = this.f24452a;
            miniCoursesViewModel.k(this.f24453b);
            v.H(f.H(miniCoursesViewModel), o0.f23642c, 0, new ln.c(miniCoursesViewModel, null, null), 2);
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$checkForCourses$1$4", f = "MiniCoursesViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ MiniCoursesViewModel f24454u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f24455v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MiniCoursesViewModel miniCoursesViewModel, String str, ls.d<? super c> dVar) {
            super(2, dVar);
            this.f24454u = miniCoursesViewModel;
            this.f24455v = str;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new c(this.f24454u, this.f24455v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            this.f24454u.k(this.f24455v);
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MiniCoursesViewModel miniCoursesViewModel, int i6, String str, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f24446v = miniCoursesViewModel;
        this.f24447w = i6;
        this.f24448x = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f24446v, this.f24447w, this.f24448x, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        String str = this.f24448x;
        int i6 = this.f24447w;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f24445u;
        MiniCoursesViewModel miniCoursesViewModel = this.f24446v;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                miniCoursesViewModel.B = true;
                Utils.INSTANCE.getTimeInSeconds();
                CourseApiUtil courseApiUtil = new CourseApiUtil();
                courseApiUtil.setMiniCourseApiListener(new a(miniCoursesViewModel, str, i6));
                if (FirebasePersistence.getInstance().getUser().getMiniCourses().isEmpty()) {
                    courseApiUtil.setMiniCourseInitApiListener(new C0388b(miniCoursesViewModel, str));
                    courseApiUtil.addAllMiniCourses(miniCoursesViewModel.E, miniCoursesViewModel.G);
                } else if (i6 < miniCoursesViewModel.E.size()) {
                    ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                    kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
                    if (!miniCourses.isEmpty()) {
                        for (MiniCourse miniCourse : miniCourses) {
                            if (kotlin.jvm.internal.i.b(miniCourse.getDomain(), miniCoursesViewModel.E.get(i6))) {
                                z10 = false;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        String str2 = miniCoursesViewModel.E.get(i6);
                        kotlin.jvm.internal.i.f(str2, "courseList[i]");
                        courseApiUtil.sendMiniCourseRequest(str2, miniCoursesViewModel.G);
                    } else {
                        ArrayList<MiniCourse> miniCourses2 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                        kotlin.jvm.internal.i.f(miniCourses2, "getInstance().user.miniCourses");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : miniCourses2) {
                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj2).getDomain(), miniCoursesViewModel.E.get(i6))) {
                                arrayList.add(obj2);
                            }
                        }
                        String domain = ((MiniCourse) arrayList.get(0)).getDomain();
                        kotlin.jvm.internal.i.d(domain);
                        if (!r.J0(domain, "basic") || ((MiniCourse) arrayList.get(0)).getPlan().size() != 0) {
                            String domain2 = ((MiniCourse) arrayList.get(0)).getDomain();
                            kotlin.jvm.internal.i.d(domain2);
                            if (r.J0(domain2, "basic") || ((MiniCourse) arrayList.get(0)).getPlan().size() != 0) {
                                miniCoursesViewModel.e(i6 + 1, str);
                            }
                        }
                        String str3 = miniCoursesViewModel.E.get(i6);
                        kotlin.jvm.internal.i.f(str3, "courseList[i]");
                        courseApiUtil.sendMiniCourseRequest(str3, miniCoursesViewModel.G);
                    }
                } else {
                    if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
                        Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getMiniCourses().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            MiniCourse next = it.next();
                            if (kotlin.jvm.internal.i.b(next.getCourse(), FirebasePersistence.getInstance().getUser().getCurrentCourseName()) && next.getDomain() != null) {
                                String domain3 = next.getDomain();
                                kotlin.jvm.internal.i.d(domain3);
                                if (r.J0(domain3, "basic")) {
                                    FirebasePersistence.getInstance().getUser().setCurrentMiniCourse(next.getDomain());
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    break;
                                }
                            }
                        }
                    }
                    kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                    k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    c cVar2 = new c(miniCoursesViewModel, str, null);
                    this.f24445u = 1;
                    if (v.S(k1Var, cVar2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            miniCoursesViewModel.B = false;
            LogHelper.INSTANCE.e(miniCoursesViewModel.f11378y, e10);
        }
        return k.f19476a;
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CourseApiUtil.MiniCourseApiUtilInterface {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniCoursesViewModel f24449a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f24450b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f24451c;

        public a(MiniCoursesViewModel miniCoursesViewModel, String str, int i6) {
            this.f24449a = miniCoursesViewModel;
            this.f24450b = str;
            this.f24451c = i6;
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseApiUtilInterface
        public final void miniCourseApiComplete(boolean z10, String slug) {
            kotlin.jvm.internal.i.g(slug, "slug");
            MiniCoursesViewModel miniCoursesViewModel = this.f24449a;
            if (!z10) {
                miniCoursesViewModel.C++;
            } else {
                miniCoursesViewModel.C = 0;
                v.H(f.H(miniCoursesViewModel), o0.f23642c, 0, new ln.c(miniCoursesViewModel, slug, null), 2);
            }
            if (miniCoursesViewModel.C < 3) {
                int i6 = this.f24451c;
                if (z10) {
                    i6++;
                }
                miniCoursesViewModel.e(i6, this.f24450b);
            }
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseApiUtilInterface
        public final void miniNotificationFetchComplete(boolean z10) {
        }
    }
}
