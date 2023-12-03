package xp;

import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import hs.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import ss.q;
/* compiled from: TopicalCoursesViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends k implements q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ HashMap<String, ArrayList<CourseDayModelV1>> f37878u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f37879v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b f37880w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u f37881x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ f<ArrayList<String>, Boolean> f37882y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(HashMap<String, ArrayList<CourseDayModelV1>> hashMap, String str, b bVar, u uVar, f<? extends ArrayList<String>, Boolean> fVar) {
        super(3);
        this.f37878u = hashMap;
        this.f37879v = str;
        this.f37880w = bVar;
        this.f37881x = uVar;
        this.f37882y = fVar;
    }

    @Override // ss.q
    public final hs.k invoke(Boolean bool, String str, ArrayList<MiniCourseMeta> arrayList) {
        boolean z10;
        boolean booleanValue = bool.booleanValue();
        ArrayList<MiniCourseMeta> metaData = arrayList;
        i.g(str, "<anonymous parameter 1>");
        i.g(metaData, "metaData");
        if (booleanValue && (!metaData.isEmpty())) {
            ArrayList<CourseDayModelV1> arrayList2 = new ArrayList<>();
            for (MiniCourseMeta miniCourseMeta : metaData) {
                arrayList2.add(MiniCourseUtilsKt.getDayModel(miniCourseMeta));
            }
            HashMap<String, ArrayList<CourseDayModelV1>> hashMap = this.f37878u;
            hashMap.put(this.f37879v, arrayList2);
            int size = hashMap.keySet().size();
            b bVar = this.f37880w;
            if (size == bVar.f37883x.size()) {
                u uVar = this.f37881x;
                if (!uVar.f23466u) {
                    uVar.f23466u = true;
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    if (firebasePersistence.getUser().getTopicalCourse() != null || this.f37882y.f19465v.booleanValue()) {
                        firebasePersistence.getUser().setTopicalCourse(null);
                        firebasePersistence.getUser().setTopicalCourseList(new ArrayList<>());
                        firebasePersistence.getUser().setTopicalGoals(new ArrayList<>());
                    }
                    Set<String> keySet = hashMap.keySet();
                    i.f(keySet, "planMap.keys");
                    for (String str2 : keySet) {
                        if (hashMap.get(str2) != null) {
                            ArrayList<MiniCourse> topicalCourseList = firebasePersistence.getUser().getTopicalCourseList();
                            i.f(topicalCourseList, "it.user.topicalCourseList");
                            if (!topicalCourseList.isEmpty()) {
                                for (MiniCourse miniCourse : topicalCourseList) {
                                    if (i.b(miniCourse.getDomain(), str2)) {
                                        z10 = true;
                                        break;
                                    }
                                }
                            }
                            z10 = false;
                            if (z10) {
                                ArrayList<MiniCourse> topicalCourseList2 = firebasePersistence.getUser().getTopicalCourseList();
                                i.f(topicalCourseList2, "it.user.topicalCourseList");
                                for (MiniCourse miniCourse2 : topicalCourseList2) {
                                    if (i.b(miniCourse2.getDomain(), str2)) {
                                        ArrayList<CourseDayModelV1> arrayList3 = hashMap.get(str2);
                                        i.d(arrayList3);
                                        miniCourse2.setPlan(arrayList3);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            ArrayList<MiniCourse> topicalCourseList3 = firebasePersistence.getUser().getTopicalCourseList();
                            MiniCourse miniCourse3 = new MiniCourse();
                            miniCourse3.setPosition(bVar.f37883x.indexOf(str2));
                            ArrayList<CourseDayModelV1> arrayList4 = hashMap.get(str2);
                            i.d(arrayList4);
                            miniCourse3.setPlan(arrayList4);
                            miniCourse3.setCourse(Constants.COURSE_GENERIC);
                            miniCourse3.setDomain(str2);
                            topicalCourseList3.add(miniCourse3);
                        }
                    }
                    firebasePersistence.updateUserOnFirebase();
                    bVar.g();
                }
            }
        }
        return hs.k.f19476a;
    }
}
