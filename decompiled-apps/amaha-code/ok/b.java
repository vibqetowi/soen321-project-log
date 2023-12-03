package ok;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kc.f;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.d;
import ls.h;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: BookmarkingViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final s5 f27589x;

    /* renamed from: y  reason: collision with root package name */
    public final w<ArrayList<CourseDayDomainModelV1>> f27590y;

    /* compiled from: BookmarkingViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.bookmarking.viewmodel.BookmarkingViewModel$fetchBookmarkedActivities$1", f = "BookmarkingViewModel.kt", l = {24}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f27591u;

        /* compiled from: BookmarkingViewModel.kt */
        @e(c = "com.theinnerhour.b2b.components.bookmarking.viewmodel.BookmarkingViewModel$fetchBookmarkedActivities$1$1", f = "BookmarkingViewModel.kt", l = {25}, m = "invokeSuspend")
        /* renamed from: ok.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0457a extends i implements p<d0, d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f27593u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f27594v;

            /* compiled from: BookmarkingViewModel.kt */
            /* renamed from: ok.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0458a extends kotlin.jvm.internal.k implements p<Boolean, HashMap<String, String>, k> {

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ ArrayList<CourseDayDomainModelV1> f27595u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f27596v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0458a(ArrayList<CourseDayDomainModelV1> arrayList, b bVar) {
                    super(2);
                    this.f27595u = arrayList;
                    this.f27596v = bVar;
                }

                @Override // ss.p
                public final k invoke(Boolean bool, HashMap<String, String> hashMap) {
                    String str;
                    boolean booleanValue = bool.booleanValue();
                    HashMap<String, String> hashMap2 = hashMap;
                    b bVar = this.f27596v;
                    ArrayList<CourseDayDomainModelV1> arrayList = this.f27595u;
                    if (booleanValue) {
                        for (CourseDayDomainModelV1 courseDayDomainModelV1 : arrayList) {
                            if (hashMap2 == null || (str = hashMap2.get(courseDayDomainModelV1.getDayModelV1().getContent_id())) == null) {
                                str = "";
                            }
                            courseDayDomainModelV1.setDuration(str);
                        }
                        bVar.f27590y.i(arrayList);
                    } else {
                        bVar.f27590y.i(arrayList);
                    }
                    return k.f19476a;
                }
            }

            /* compiled from: BookmarkingViewModel.kt */
            /* renamed from: ok.b$a$a$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0459b extends kotlin.jvm.internal.k implements p<Boolean, HashMap<String, String>, k> {

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ v f27597u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ HashMap<String, String> f27598v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ List<List<String>> f27599w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ ArrayList<CourseDayDomainModelV1> f27600x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ b f27601y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0459b(v vVar, HashMap hashMap, ArrayList arrayList, ArrayList arrayList2, b bVar) {
                    super(2);
                    this.f27597u = vVar;
                    this.f27598v = hashMap;
                    this.f27599w = arrayList;
                    this.f27600x = arrayList2;
                    this.f27601y = bVar;
                }

                @Override // ss.p
                public final k invoke(Boolean bool, HashMap<String, String> hashMap) {
                    boolean booleanValue = bool.booleanValue();
                    HashMap<String, String> hashMap2 = hashMap;
                    b bVar = this.f27601y;
                    ArrayList<CourseDayDomainModelV1> arrayList = this.f27600x;
                    if (booleanValue && hashMap2 != null) {
                        v vVar = this.f27597u;
                        vVar.f23467u++;
                        HashMap<String, String> hashMap3 = this.f27598v;
                        hashMap3.putAll(hashMap2);
                        if (vVar.f23467u == this.f27599w.size()) {
                            for (CourseDayDomainModelV1 courseDayDomainModelV1 : arrayList) {
                                String str = hashMap3.get(courseDayDomainModelV1.getDayModelV1().getContent_id());
                                if (str == null) {
                                    str = "";
                                }
                                courseDayDomainModelV1.setDuration(str);
                            }
                            bVar.f27590y.i(arrayList);
                        }
                    } else {
                        bVar.f27590y.i(arrayList);
                    }
                    return k.f19476a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0457a(b bVar, d<? super C0457a> dVar) {
                super(2, dVar);
                this.f27594v = bVar;
            }

            @Override // ns.a
            public final d<k> create(Object obj, d<?> dVar) {
                return new C0457a(this.f27594v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, d<? super k> dVar) {
                return ((C0457a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f27593u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    s5 s5Var = this.f27594v.f27589x;
                    this.f27593u = 1;
                    s5Var.getClass();
                    h hVar = new h(ca.a.G0(this));
                    try {
                        User user = FirebasePersistence.getInstance().getUser();
                        ArrayList arrayList = new ArrayList();
                        AngerCourse anger = user.getAnger();
                        if (anger != null) {
                            ArrayList<CourseDayModelV1> planV3 = anger.getPlanV3();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : planV3) {
                                if (((CourseDayModelV1) obj2).isFavorite()) {
                                    arrayList2.add(obj2);
                                }
                            }
                            arrayList.addAll(s5.c(Constants.COURSE_ANGER, arrayList2));
                        }
                        DepressionCourse depression = user.getDepression();
                        if (depression != null) {
                            ArrayList<CourseDayModelV1> planV32 = depression.getPlanV3();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : planV32) {
                                if (((CourseDayModelV1) obj3).isFavorite()) {
                                    arrayList3.add(obj3);
                                }
                            }
                            arrayList.addAll(s5.c(Constants.COURSE_DEPRESSION, arrayList3));
                        }
                        StressCourse stress = user.getStress();
                        if (stress != null) {
                            ArrayList<CourseDayModelV1> planV33 = stress.getPlanV3();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : planV33) {
                                if (((CourseDayModelV1) obj4).isFavorite()) {
                                    arrayList4.add(obj4);
                                }
                            }
                            arrayList.addAll(s5.c(Constants.COURSE_STRESS, arrayList4));
                        }
                        HappinessCourse happiness = user.getHappiness();
                        if (happiness != null) {
                            ArrayList<CourseDayModelV1> planV34 = happiness.getPlanV3();
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj5 : planV34) {
                                if (((CourseDayModelV1) obj5).isFavorite()) {
                                    arrayList5.add(obj5);
                                }
                            }
                            arrayList.addAll(s5.c(Constants.COURSE_HAPPINESS, arrayList5));
                        }
                        SleepCourse sleep = user.getSleep();
                        if (sleep != null) {
                            ArrayList<CourseDayModelV1> planV35 = sleep.getPlanV3();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj6 : planV35) {
                                if (((CourseDayModelV1) obj6).isFavorite()) {
                                    arrayList6.add(obj6);
                                }
                            }
                            arrayList.addAll(s5.c(Constants.COURSE_SLEEP, arrayList6));
                        }
                        WorryCourse worry = user.getWorry();
                        if (worry != null) {
                            ArrayList<CourseDayModelV1> planV36 = worry.getPlanV3();
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj7 : planV36) {
                                if (((CourseDayModelV1) obj7).isFavorite()) {
                                    arrayList7.add(obj7);
                                }
                            }
                            arrayList.addAll(s5.c(Constants.COURSE_WORRY, arrayList7));
                        }
                        if (arrayList.size() > 1) {
                            is.p.P1(arrayList, new ok.a());
                        }
                        hVar.resumeWith(arrayList);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(s5Var.f8126v, e10);
                        hVar.resumeWith(null);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                b bVar = this.f27594v;
                ArrayList<CourseDayDomainModelV1> arrayList8 = (ArrayList) obj;
                if (arrayList8 != null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (CourseDayDomainModelV1 courseDayDomainModelV1 : arrayList8) {
                        String content_id = courseDayDomainModelV1.getDayModelV1().getContent_id();
                        if (content_id != null) {
                            arrayList9.add(content_id);
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        bVar.f27590y.i(arrayList8);
                    } else if (arrayList9.size() <= 10) {
                        FireStoreUtilsKt.fetchCourseContentDurationV3(arrayList9, new C0458a(arrayList8, bVar));
                    } else {
                        ArrayList<List> Y1 = u.Y1(arrayList9, 10);
                        v vVar = new v();
                        HashMap hashMap = new HashMap();
                        for (List list : Y1) {
                            FireStoreUtilsKt.fetchCourseContentDurationV3(list, new C0459b(vVar, hashMap, Y1, arrayList8, bVar));
                        }
                    }
                }
                return k.f19476a;
            }
        }

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f27591u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                C0457a c0457a = new C0457a(b.this, null);
                this.f27591u = 1;
                if (ta.v.S(bVar, c0457a, this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    public b(s5 bookmarkingRepository) {
        kotlin.jvm.internal.i.g(bookmarkingRepository, "bookmarkingRepository");
        this.f27589x = bookmarkingRepository;
        LogHelper.INSTANCE.makeLogTag("BookmarkingViewModel");
        this.f27590y = new w<>();
    }

    public final void e() {
        ta.v.H(f.H(this), null, 0, new a(null), 3);
    }
}
