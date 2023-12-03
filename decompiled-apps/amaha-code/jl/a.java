package jl;

import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: CustomDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.k implements ss.q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ HashMap<String, ArrayList<CourseDayModelV1>> f22074u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f22075v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f22076w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f22077x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ hs.f<ArrayList<String>, Boolean> f22078y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(HashMap<String, ArrayList<CourseDayModelV1>> hashMap, String str, e eVar, kotlin.jvm.internal.u uVar, hs.f<? extends ArrayList<String>, Boolean> fVar) {
        super(3);
        this.f22074u = hashMap;
        this.f22075v = str;
        this.f22076w = eVar;
        this.f22077x = uVar;
        this.f22078y = fVar;
    }

    @Override // ss.q
    public final hs.k invoke(Boolean bool, String str, ArrayList<MiniCourseMeta> arrayList) {
        boolean z10;
        boolean booleanValue = bool.booleanValue();
        ArrayList<MiniCourseMeta> metaData = arrayList;
        kotlin.jvm.internal.i.g(str, "<anonymous parameter 1>");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        if (booleanValue && (!metaData.isEmpty())) {
            ArrayList<CourseDayModelV1> arrayList2 = new ArrayList<>();
            for (MiniCourseMeta miniCourseMeta : metaData) {
                arrayList2.add(MiniCourseUtilsKt.getDayModel(miniCourseMeta));
            }
            HashMap<String, ArrayList<CourseDayModelV1>> hashMap = this.f22074u;
            hashMap.put(this.f22075v, arrayList2);
            int size = hashMap.keySet().size();
            e eVar = this.f22076w;
            if (size == eVar.L.size()) {
                kotlin.jvm.internal.u uVar = this.f22077x;
                if (!uVar.f23466u) {
                    uVar.f23466u = true;
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    if (firebasePersistence.getUser().getTopicalCourse() != null || this.f22078y.f19465v.booleanValue()) {
                        firebasePersistence.getUser().setTopicalCourse(null);
                        firebasePersistence.getUser().setTopicalCourseList(new ArrayList<>());
                        firebasePersistence.getUser().setTopicalGoals(new ArrayList<>());
                    }
                    Set<String> keySet = hashMap.keySet();
                    kotlin.jvm.internal.i.f(keySet, "planMap.keys");
                    for (String str2 : keySet) {
                        if (hashMap.get(str2) != null) {
                            ArrayList<MiniCourse> topicalCourseList = firebasePersistence.getUser().getTopicalCourseList();
                            kotlin.jvm.internal.i.f(topicalCourseList, "it.user.topicalCourseList");
                            if (!topicalCourseList.isEmpty()) {
                                for (MiniCourse miniCourse : topicalCourseList) {
                                    if (kotlin.jvm.internal.i.b(miniCourse.getDomain(), str2)) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                                ArrayList<MiniCourse> topicalCourseList2 = firebasePersistence.getUser().getTopicalCourseList();
                                kotlin.jvm.internal.i.f(topicalCourseList2, "it.user.topicalCourseList");
                                for (MiniCourse miniCourse2 : topicalCourseList2) {
                                    if (kotlin.jvm.internal.i.b(miniCourse2.getDomain(), str2)) {
                                        ArrayList<CourseDayModelV1> arrayList3 = hashMap.get(str2);
                                        kotlin.jvm.internal.i.d(arrayList3);
                                        miniCourse2.setPlan(arrayList3);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            ArrayList<MiniCourse> topicalCourseList3 = firebasePersistence.getUser().getTopicalCourseList();
                            MiniCourse miniCourse3 = new MiniCourse();
                            miniCourse3.setPosition(eVar.L.indexOf(str2));
                            ArrayList<CourseDayModelV1> arrayList4 = hashMap.get(str2);
                            kotlin.jvm.internal.i.d(arrayList4);
                            miniCourse3.setPlan(arrayList4);
                            miniCourse3.setCourse(Constants.COURSE_GENERIC);
                            miniCourse3.setDomain(str2);
                            topicalCourseList3.add(miniCourse3);
                        }
                    }
                    firebasePersistence.updateUserOnFirebase();
                }
            }
        }
        return hs.k.f19476a;
    }
}
