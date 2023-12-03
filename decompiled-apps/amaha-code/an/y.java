package an;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import cn.k0;
import cn.r0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.activity.LibraryActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: LibraryHomeFragment.kt */
/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.k implements ss.u<String, String, String, Boolean, String, Integer, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ t f815u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar) {
        super(7);
        this.f815u = tVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6 A[LOOP:5: B:43:0x00bf->B:61:0x00f6, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    @Override // ss.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String id2, String type, String str, Boolean bool, String currChip, Integer num, String str2) {
        boolean z10;
        String str3;
        Object obj;
        int i6;
        boolean z11;
        RecyclerView.e eVar;
        k0 k0Var;
        RecyclerView.e eVar2;
        RecyclerView.e eVar3;
        boolean z12;
        Object obj2;
        ?? r22;
        zm.c cVar;
        MiniCourse miniCourse;
        LibraryActivity libraryActivity;
        String str4;
        Iterator it;
        boolean z13;
        String str5;
        String str6;
        boolean z14;
        k0 k0Var2;
        Object obj3;
        Object obj4;
        String str7;
        t tVar;
        zm.c cVar2;
        int i10;
        String str8;
        Bundle f;
        String str9;
        t tVar2;
        int i11;
        Object obj5;
        bn.c cVar3;
        RecyclerView.e eVar4;
        zm.c cVar4;
        k0 k0Var3;
        ArrayList<MiniCourse> miniCourses;
        Object obj6;
        ArrayList<CourseDayModelV1> plan;
        int nextIndex;
        ArrayList<MiniCourse> topicalCourseList;
        Object obj7;
        ArrayList<CourseDayModelV1> plan2;
        RecyclerView.e eVar5;
        zm.c cVar5;
        boolean z15;
        String str10;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap;
        RecyclerView.e eVar6;
        zm.c cVar6;
        boolean z16;
        RecyclerView.e eVar7;
        zm.c cVar7;
        boolean z17;
        String str11;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap2;
        hs.f<Boolean, Boolean> fVar;
        boolean z18;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap3;
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(type, "type");
        kotlin.jvm.internal.i.g(currChip, "currChip");
        t tVar3 = this.f815u;
        if (!booleanValue && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !kotlin.jvm.internal.i.b(type, "mini_course")) {
            androidx.fragment.app.p requireActivity = tVar3.requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            tVar3.startActivity(tr.r.s(requireActivity, false).putExtra("source", id2));
        } else {
            if (!booleanValue && !kotlin.jvm.internal.i.b(type, "mini_course")) {
                z10 = false;
            } else {
                z10 = true;
            }
            tVar3.A = z10;
            int hashCode = type.hashCode();
            String[] strArr = tVar3.f780z;
            switch (hashCode) {
                case -341064690:
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    z11 = booleanValue;
                    eVar = null;
                    if (type.equals("resource") && (k0Var = tVar3.B) != null) {
                        k0Var.m(id2);
                    }
                    eVar3 = eVar;
                    RecyclerView.e eVar8 = eVar3;
                    cVar = eVar8;
                    miniCourse = eVar8;
                    break;
                case -38716301:
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    z11 = booleanValue;
                    if (type.equals("recommended_activity")) {
                        k0 k0Var4 = tVar3.B;
                        if (k0Var4 != null) {
                            try {
                                eVar2 = null;
                            } catch (Exception e10) {
                                e = e10;
                                eVar2 = null;
                            }
                            try {
                                ta.v.H(kc.f.H(k0Var4), null, 0, new r0(k0Var4, id2, null), 3);
                            } catch (Exception e11) {
                                e = e11;
                                LogHelper.INSTANCE.e(k0Var4.f5596y, e);
                                strArr[0] = id2;
                                strArr[1] = type;
                                strArr[2] = str;
                                eVar3 = eVar2;
                                RecyclerView.e eVar82 = eVar3;
                                cVar = eVar82;
                                miniCourse = eVar82;
                                k0Var2 = tVar3.B;
                                if (k0Var2 == null) {
                                }
                                String str12 = gk.a.f16573a;
                                f = defpackage.e.f("top_pick_chip", currChip, "top_pick_item_type", type);
                                f.putString("top_pick_item_name", str);
                                f.putString("source_of_action", "lib_main_screen");
                                if (!is.k.Q1(type, new String[]{str8, str7})) {
                                }
                                obj5 = obj4;
                                if (kotlin.jvm.internal.i.b(type, obj5)) {
                                }
                                if (kotlin.jvm.internal.i.b(type, obj3)) {
                                    k0Var3 = tVar2.B;
                                    int i12 = -1;
                                    if (k0Var3 != null) {
                                    }
                                    f.putInt("mini_course_progress", i12);
                                }
                                f.putInt("top_pick_item_position_in_list", i10);
                                f.putBoolean("paid_top_pick_item", !z11);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(f, "lib_top_pick_cta_click");
                                if (kotlin.jvm.internal.i.b(type, obj5)) {
                                }
                                cVar3 = tVar2.c0;
                                if (cVar3 != null) {
                                }
                                return hs.k.f19476a;
                            }
                        } else {
                            eVar2 = null;
                        }
                        strArr[0] = id2;
                        strArr[1] = type;
                        strArr[2] = str;
                        eVar3 = eVar2;
                        RecyclerView.e eVar822 = eVar3;
                        cVar = eVar822;
                        miniCourse = eVar822;
                    }
                    eVar = null;
                    eVar3 = eVar;
                    RecyclerView.e eVar8222 = eVar3;
                    cVar = eVar8222;
                    miniCourse = eVar8222;
                    break;
                case 606502613:
                    if (type.equals("main_activity")) {
                        if (str2 != null && !gv.n.B0(str2)) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        str3 = "main_activity";
                        obj = "mini_course";
                        if (z12) {
                            i6 = intValue;
                            z11 = booleanValue;
                            Intent intent = new Intent(tVar3.getActivity(), TemplateActivity.class);
                            CourseDayModelV1 courseDayModelV1 = new CourseDayModelV1();
                            courseDayModelV1.setContent_label(str);
                            courseDayModelV1.setContent_id(id2);
                            courseDayModelV1.setAssessment(Boolean.FALSE);
                            hs.k kVar2 = hs.k.f19476a;
                            intent.putExtra("day_plan", courseDayModelV1);
                            intent.putExtra("type", "daily");
                            intent.putExtra("goalSource", "library");
                            intent.putExtra("showAltFeedback", true);
                            intent.putExtra("mcCourse", Constants.LIBRARY_GOAL_COURSE);
                            intent.putExtra("mcCourseId", Constants.LIBRARY_GOAL_COURSE_ID);
                            tVar3.Z.a(intent);
                        } else {
                            i6 = intValue;
                            z11 = booleanValue;
                            Intent intent2 = new Intent(tVar3.requireActivity(), NewDynamicParentActivity.class);
                            intent2.putExtra("activity_id", id2);
                            intent2.putExtra("goalSource", "library");
                            intent2.putExtra("activity_name", str);
                            intent2.putExtra(Constants.COURSE_NAME, Constants.LIBRARY_GOAL_COURSE);
                            intent2.putExtra("showAltFeedback", true);
                            tVar3.f771a0.a(intent2);
                        }
                        strArr[0] = id2;
                        strArr[1] = type;
                        strArr[2] = str;
                        eVar = null;
                        eVar3 = eVar;
                        RecyclerView.e eVar82222 = eVar3;
                        cVar = eVar82222;
                        miniCourse = eVar82222;
                        break;
                    }
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    z11 = booleanValue;
                    eVar = null;
                    eVar3 = eVar;
                    RecyclerView.e eVar822222 = eVar3;
                    cVar = eVar822222;
                    miniCourse = eVar822222;
                    break;
                case 955611395:
                    if (type.equals("mini_course")) {
                        ArrayList<MiniCourseMetadata> arrayList = tVar3.D;
                        if (arrayList != null) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) obj2;
                                    if (miniCourseMetadata != null) {
                                        str6 = miniCourseMetadata.getId();
                                    } else {
                                        str6 = null;
                                    }
                                    if (kotlin.jvm.internal.i.b(str6, id2) && kotlin.jvm.internal.i.b(miniCourseMetadata.getPublished(), Boolean.TRUE)) {
                                        z14 = true;
                                        continue;
                                    } else {
                                        z14 = false;
                                        continue;
                                    }
                                    if (z14) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            MiniCourseMetadata miniCourseMetadata2 = (MiniCourseMetadata) obj2;
                            ArrayList<MiniCourse> arrayList2 = tVar3.E;
                            if (arrayList2 != null) {
                                Iterator it3 = arrayList2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        r22 = it3.next();
                                        MiniCourse miniCourse2 = (MiniCourse) r22;
                                        if (miniCourse2 != null) {
                                            str4 = miniCourse2.getDomain();
                                        } else {
                                            str4 = null;
                                        }
                                        if (str4 != null) {
                                            String domain = miniCourse2.getDomain();
                                            if (miniCourseMetadata2 != null) {
                                                str5 = miniCourseMetadata2.getSlug();
                                            } else {
                                                str5 = null;
                                            }
                                            it = it3;
                                            if (kotlin.jvm.internal.i.b(domain, str5)) {
                                                z13 = true;
                                                if (z13) {
                                                    it3 = it;
                                                }
                                            }
                                        } else {
                                            it = it3;
                                        }
                                        z13 = false;
                                        if (z13) {
                                        }
                                    } else {
                                        r22 = null;
                                    }
                                }
                                if (r22 != null && miniCourseMetadata2 != null) {
                                    androidx.fragment.app.p requireActivity2 = tVar3.requireActivity();
                                    if (requireActivity2 instanceof LibraryActivity) {
                                        libraryActivity = (LibraryActivity) requireActivity2;
                                    } else {
                                        libraryActivity = null;
                                    }
                                    if (libraryActivity != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putSerializable("mcMetaData", miniCourseMetadata2);
                                        bundle.putSerializable("miniCourse", r22);
                                        bundle.putString("miniCourse_chip", tVar3.f776v);
                                        bundle.putInt("miniCourse_position_in_list", intValue);
                                        hs.k kVar3 = hs.k.f19476a;
                                        libraryActivity.n0(bundle, "short_courses");
                                    }
                                }
                                String[] strArr2 = new String[3];
                                strArr2[0] = id2;
                                MiniCourse miniCourse3 = r22;
                                strArr2[1] = (miniCourse3 == null || (r3 = miniCourse3.getDomain()) == null) ? "" : "";
                                strArr2[2] = (miniCourse3 == null || (r1 = miniCourse3.getCourse()) == null) ? "" : "";
                                tVar3.R = strArr2;
                                str3 = "main_activity";
                                obj = "mini_course";
                                i6 = intValue;
                                z11 = booleanValue;
                                cVar = null;
                                miniCourse = r22;
                                break;
                            } else {
                                kotlin.jvm.internal.i.q("miniCoursesList");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("mcMetaDataList");
                            throw null;
                        }
                    }
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    z11 = booleanValue;
                    eVar = null;
                    eVar3 = eVar;
                    RecyclerView.e eVar8222222 = eVar3;
                    cVar = eVar8222222;
                    miniCourse = eVar8222222;
                    break;
                default:
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    z11 = booleanValue;
                    eVar = null;
                    eVar3 = eVar;
                    RecyclerView.e eVar82222222 = eVar3;
                    cVar = eVar82222222;
                    miniCourse = eVar82222222;
                    break;
            }
            k0Var2 = tVar3.B;
            if (k0Var2 == null) {
                cVar2 = cVar;
                str7 = "recommended_activity";
                obj4 = "resource";
                str8 = str3;
                tVar = tVar3;
                obj3 = obj;
                i10 = i6;
                k0Var2.h(id2, type, str, Calendar.getInstance().getTimeInMillis(), kotlin.jvm.internal.i.b(type, "resource"), tVar3.f777w, "top_picks", tVar3.A);
            } else {
                obj3 = obj;
                obj4 = "resource";
                str7 = "recommended_activity";
                tVar = tVar3;
                cVar2 = cVar;
                i10 = i6;
                str8 = str3;
            }
            String str122 = gk.a.f16573a;
            f = defpackage.e.f("top_pick_chip", currChip, "top_pick_item_type", type);
            f.putString("top_pick_item_name", str);
            f.putString("source_of_action", "lib_main_screen");
            if (!is.k.Q1(type, new String[]{str8, str7})) {
                tVar2 = tVar;
                RecyclerView recyclerView = (RecyclerView) tVar2._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                if (recyclerView != null) {
                    eVar6 = recyclerView.getAdapter();
                } else {
                    eVar6 = cVar2;
                }
                if (eVar6 instanceof zm.c) {
                    cVar6 = (zm.c) eVar6;
                } else {
                    cVar6 = cVar2;
                }
                if (cVar6 != null && (hashMap3 = cVar6.f39620y) != null) {
                    str9 = id2;
                    hs.f<Boolean, Boolean> fVar2 = hashMap3.get(str9);
                    if (fVar2 != null) {
                        i11 = 1;
                        if (fVar2.f19465v.booleanValue()) {
                            z16 = true;
                            if (z16) {
                                str11 = "completed";
                            } else {
                                RecyclerView recyclerView2 = (RecyclerView) tVar2._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                                if (recyclerView2 != null) {
                                    eVar7 = recyclerView2.getAdapter();
                                } else {
                                    eVar7 = cVar2;
                                }
                                if (eVar7 instanceof zm.c) {
                                    cVar7 = (zm.c) eVar7;
                                } else {
                                    cVar7 = cVar2;
                                }
                                if (cVar7 != null && (hashMap2 = cVar7.f39620y) != null && (fVar = hashMap2.get(str9)) != null && fVar.f19464u.booleanValue() == i11) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    str11 = "incomplete";
                                } else {
                                    str11 = "not_started";
                                }
                            }
                            f.putString("status_of_activity_when_clicked", str11);
                            if (str2 == null && !gv.n.B0(str2)) {
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            f.putBoolean("dynamicV1", !z18);
                        }
                        z16 = false;
                        if (z16) {
                        }
                        f.putString("status_of_activity_when_clicked", str11);
                        if (str2 == null) {
                        }
                        z18 = true;
                        f.putBoolean("dynamicV1", !z18);
                    }
                } else {
                    str9 = id2;
                }
                i11 = 1;
                z16 = false;
                if (z16) {
                }
                f.putString("status_of_activity_when_clicked", str11);
                if (str2 == null) {
                }
                z18 = true;
                f.putBoolean("dynamicV1", !z18);
            } else {
                str9 = id2;
                tVar2 = tVar;
                i11 = 1;
            }
            obj5 = obj4;
            if (kotlin.jvm.internal.i.b(type, obj5)) {
                RecyclerView recyclerView3 = (RecyclerView) tVar2._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                if (recyclerView3 != null) {
                    eVar5 = recyclerView3.getAdapter();
                } else {
                    eVar5 = cVar2;
                }
                if (eVar5 instanceof zm.c) {
                    cVar5 = (zm.c) eVar5;
                } else {
                    cVar5 = cVar2;
                }
                if (cVar5 != null && (hashMap = cVar5.f39620y) != null && hashMap.containsKey(str9) == i11) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    str10 = "read";
                } else {
                    str10 = "unread";
                }
                f.putString("resource_status", str10);
            }
            if (kotlin.jvm.internal.i.b(type, obj3) && miniCourse != null) {
                k0Var3 = tVar2.B;
                int i122 = -1;
                if (k0Var3 != null) {
                    MiniCourse miniCourse4 = miniCourse;
                    String domain2 = miniCourse4.getDomain();
                    if (domain2 == null) {
                        domain2 = "";
                    }
                    try {
                        if (kotlin.jvm.internal.i.b(miniCourse4.getCourse(), Constants.COURSE_GENERIC)) {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                                Iterator it4 = topicalCourseList.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj7 = it4.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj7).getDomain(), domain2)) {
                                        }
                                    } else {
                                        obj7 = cVar2;
                                    }
                                }
                                MiniCourse miniCourse5 = (MiniCourse) obj7;
                                if (miniCourse5 != null && (plan2 = miniCourse5.getPlan()) != null) {
                                    ListIterator<CourseDayModelV1> listIterator = plan2.listIterator(plan2.size());
                                    while (listIterator.hasPrevious()) {
                                        if (listIterator.previous().isCompleted()) {
                                            nextIndex = listIterator.nextIndex();
                                            i122 = nextIndex;
                                        }
                                    }
                                }
                            }
                            i122 += i11;
                        } else {
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null && (miniCourses = user2.getMiniCourses()) != null) {
                                Iterator it5 = miniCourses.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj6 = it5.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj6).getDomain(), domain2)) {
                                        }
                                    } else {
                                        obj6 = cVar2;
                                    }
                                }
                                MiniCourse miniCourse6 = (MiniCourse) obj6;
                                if (miniCourse6 != null && (plan = miniCourse6.getPlan()) != null) {
                                    ListIterator<CourseDayModelV1> listIterator2 = plan.listIterator(plan.size());
                                    while (listIterator2.hasPrevious()) {
                                        if (listIterator2.previous().isCompleted()) {
                                            nextIndex = listIterator2.nextIndex();
                                            i122 = nextIndex;
                                        }
                                    }
                                }
                            }
                            i122 += i11;
                        }
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(k0Var3.f5596y, e12);
                        i122 = 0;
                    }
                }
                f.putInt("mini_course_progress", i122);
            }
            f.putInt("top_pick_item_position_in_list", i10);
            f.putBoolean("paid_top_pick_item", !z11);
            hs.k kVar4 = hs.k.f19476a;
            gk.a.b(f, "lib_top_pick_cta_click");
            if (kotlin.jvm.internal.i.b(type, obj5)) {
                RecyclerView recyclerView4 = (RecyclerView) tVar2._$_findCachedViewById(R.id.rvLibraryTopPicksRecycler);
                if (recyclerView4 != null) {
                    eVar4 = recyclerView4.getAdapter();
                } else {
                    eVar4 = cVar2;
                }
                if (eVar4 instanceof zm.c) {
                    cVar4 = (zm.c) eVar4;
                } else {
                    cVar4 = cVar2;
                }
                if (cVar4 != null) {
                    cVar4.y(str9);
                }
            }
            cVar3 = tVar2.c0;
            if (cVar3 != null) {
                cVar3.c("top_picks");
            }
        }
        return hs.k.f19476a;
    }
}
