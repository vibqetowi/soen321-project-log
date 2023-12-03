package cp;

import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.NpsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import fd.f;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import ls.h;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ResetProgrammeViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.resetprogram.viewmodel.ResetProgrammeViewModel$initReset$1", f = "ResetProgrammeViewModel.kt", l = {R.styleable.AppCompatTheme_actionOverflowMenuStyle, R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public String f11867u;

    /* renamed from: v  reason: collision with root package name */
    public int f11868v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f11869w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e f11870x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f11871y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f11872z;

    /* compiled from: ResetProgrammeViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.resetprogram.viewmodel.ResetProgrammeViewModel$initReset$1$resetCourseSuccess$1", f = "ResetProgrammeViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11873u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f11874v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f11875w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f11876x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, ArrayList<String> arrayList, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f11874v = eVar;
            this.f11875w = str;
            this.f11876x = arrayList;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f11874v, this.f11875w, this.f11876x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11873u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                c cVar = this.f11874v.f11880x;
                boolean K = sp.b.K();
                this.f11873u = 1;
                cVar.getClass();
                h hVar = new h(ca.a.G0(this));
                if (!K) {
                    hVar.resumeWith(Boolean.TRUE);
                } else {
                    FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(this.f11875w).b(Constants.USER_GOALS_DATA).o("courseName", this.f11876x).a().addOnCompleteListener(new cp.a(hVar, cVar));
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: ResetProgrammeViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.resetprogram.viewmodel.ResetProgrammeViewModel$initReset$1$resetCourseSuccess$2", f = "ResetProgrammeViewModel.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11877u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f11878v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f11879w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, ArrayList<String> arrayList, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f11878v = eVar;
            this.f11879w = arrayList;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f11878v, this.f11879w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11877u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                c cVar = this.f11878v.f11880x;
                this.f11877u = 1;
                cVar.getClass();
                h hVar = new h(ca.a.G0(this));
                try {
                    User user = FirebasePersistence.getInstance().getUser();
                    ArrayList<String> arrayList = this.f11879w;
                    if (user != null) {
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            applicationPersistence.setIntValue(next + "CourseSize", 0);
                            switch (next.hashCode()) {
                                case -2114782937:
                                    if (next.equals(Constants.COURSE_HAPPINESS)) {
                                        Utils.INSTANCE.cancelNotificationsReset();
                                        user.setHappiness(null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case -1617042330:
                                    if (next.equals(Constants.COURSE_DEPRESSION)) {
                                        Utils.INSTANCE.cancelNotificationsReset();
                                        user.setDepression(null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case -891989580:
                                    if (next.equals(Constants.COURSE_STRESS)) {
                                        Utils.INSTANCE.cancelNotificationsReset();
                                        user.setStress(null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 92960775:
                                    if (next.equals(Constants.COURSE_ANGER)) {
                                        Utils.INSTANCE.cancelNotificationsReset();
                                        user.setAnger(null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 109522647:
                                    if (next.equals(Constants.COURSE_SLEEP)) {
                                        Utils.INSTANCE.cancelNotificationsReset();
                                        user.setSleep(null);
                                        break;
                                    } else {
                                        break;
                                    }
                                case 113319009:
                                    if (next.equals(Constants.COURSE_WORRY)) {
                                        Utils.INSTANCE.cancelNotificationsReset();
                                        user.setWorry(null);
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<MiniCourse> it2 = user.getMiniCourses().iterator();
                        while (it2.hasNext()) {
                            MiniCourse next2 = it2.next();
                            if (u.Z1(arrayList, next2.getCourse())) {
                                Iterator<CourseDayModelV1> it3 = next2.getPlan().iterator();
                                while (it3.hasNext()) {
                                    CourseDayModelV1 next3 = it3.next();
                                    if (next3.getContent_id() != null) {
                                        String content_id = next3.getContent_id();
                                        kotlin.jvm.internal.i.d(content_id);
                                        arrayList2.add(content_id);
                                    }
                                }
                            }
                        }
                        ArrayList<Goal> arrayList3 = new ArrayList<>();
                        Iterator<Goal> it4 = user.getUserGoals().iterator();
                        while (it4.hasNext()) {
                            Goal next4 = it4.next();
                            if (!u.Z1(arrayList, next4.getCourseName()) || (u.Z1(arrayList, next4.getCourseName()) && u.Z1(arrayList2, next4.getGoalId()))) {
                                arrayList3.add(next4);
                            }
                        }
                        user.setUserGoals(arrayList3);
                        ArrayList<PostsRead> readPosts = user.getPostsRead();
                        kotlin.jvm.internal.i.f(readPosts, "readPosts");
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj2 : readPosts) {
                            if (!u.Z1(arrayList, ((PostsRead) obj2).getCourseName())) {
                                arrayList4.add(obj2);
                            }
                        }
                        user.setPostsRead(new ArrayList<>(arrayList4));
                        user.setCurrentCourseName(null);
                        user.setCurrentCourse(null);
                        user.setCurrentMiniCourse(null);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                    NpsPersistence.INSTANCE.resetNpsDataForMainPlan(arrayList);
                    hVar.resumeWith(Boolean.TRUE);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(cVar.f11865a, e10);
                    hVar.resumeWith(Boolean.FALSE);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, ArrayList<String> arrayList, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f11870x = eVar;
        this.f11871y = str;
        this.f11872z = arrayList;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        d dVar2 = new d(this.f11870x, this.f11871y, this.f11872z, dVar);
        dVar2.f11869w = obj;
        return dVar2;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0012, B:34:0x009f, B:36:0x00a5, B:47:0x00c9, B:48:0x00d1, B:39:0x00af, B:40:0x00b3, B:42:0x00b9, B:11:0x0025, B:26:0x0068, B:31:0x0075, B:49:0x00d9, B:14:0x0031, B:16:0x0039, B:19:0x0042, B:21:0x004c, B:23:0x0056), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0012, B:34:0x009f, B:36:0x00a5, B:47:0x00c9, B:48:0x00d1, B:39:0x00af, B:40:0x00b3, B:42:0x00b9, B:11:0x0025, B:26:0x0068, B:31:0x0075, B:49:0x00d9, B:14:0x0031, B:16:0x0039, B:19:0x0042, B:21:0x004c, B:23:0x0056), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0012, B:34:0x009f, B:36:0x00a5, B:47:0x00c9, B:48:0x00d1, B:39:0x00af, B:40:0x00b3, B:42:0x00b9, B:11:0x0025, B:26:0x0068, B:31:0x0075, B:49:0x00d9, B:14:0x0031, B:16:0x0039, B:19:0x0042, B:21:0x004c, B:23:0x0056), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0012, B:34:0x009f, B:36:0x00a5, B:47:0x00c9, B:48:0x00d1, B:39:0x00af, B:40:0x00b3, B:42:0x00b9, B:11:0x0025, B:26:0x0068, B:31:0x0075, B:49:0x00d9, B:14:0x0031, B:16:0x0039, B:19:0x0042, B:21:0x004c, B:23:0x0056), top: B:54:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9 A[Catch: Exception -> 0x006f, TRY_LEAVE, TryCatch #0 {Exception -> 0x006f, blocks: (B:6:0x0012, B:34:0x009f, B:36:0x00a5, B:47:0x00c9, B:48:0x00d1, B:39:0x00af, B:40:0x00b3, B:42:0x00b9, B:11:0x0025, B:26:0x0068, B:31:0x0075, B:49:0x00d9, B:14:0x0031, B:16:0x0039, B:19:0x0042, B:21:0x004c, B:23:0x0056), top: B:54:0x000c }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        String str;
        boolean z10;
        Iterable<Boolean> iterable;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f11868v;
        boolean z11 = false;
        ArrayList<String> arrayList = this.f11872z;
        e eVar = this.f11870x;
        try {
        } catch (Exception e10) {
            eVar.f11882z.i(Boolean.FALSE);
            LogHelper.INSTANCE.e(eVar.f11881y, e10);
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    iterable = (Iterable) obj;
                    if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (Boolean bool : iterable) {
                            if (!bool.booleanValue()) {
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (!z11) {
                        eVar.f11882z.i(Boolean.TRUE);
                    } else {
                        eVar.f11882z.i(Boolean.FALSE);
                    }
                    return k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f11867u;
            d0Var = (d0) this.f11869w;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            d0Var = (d0) this.f11869w;
            f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str = fVar.j0();
            } else {
                str = null;
            }
            if (str == null) {
                eVar.f11882z.i(Boolean.FALSE);
                return k.f19476a;
            } else if (kotlin.jvm.internal.i.b(this.f11871y, Constants.USER_VERSION)) {
                c cVar = eVar.f11880x;
                this.f11869w = d0Var;
                this.f11867u = str;
                this.f11868v = 1;
                cVar.getClass();
                obj = c.a(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                z10 = true;
                if (!z10) {
                    List P0 = ca.a.P0(v.g(d0Var, null, new a(eVar, str, arrayList, null), 3), v.g(d0Var, null, new b(eVar, arrayList, null), 3));
                    this.f11869w = null;
                    this.f11867u = null;
                    this.f11868v = 2;
                    obj = ca.a.n(P0, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    iterable = (Iterable) obj;
                    if (iterable instanceof Collection) {
                    }
                    while (r11.hasNext()) {
                    }
                    z11 = true;
                    if (!z11) {
                    }
                    return k.f19476a;
                }
                eVar.f11882z.i(Boolean.FALSE);
                return k.f19476a;
            }
        }
        z10 = ((Boolean) obj).booleanValue();
        if (!z10) {
        }
    }
}
