package an;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: LibraryAllTopPicksFragment.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.u<String, String, String, Boolean, String, Integer, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f741u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar) {
        super(7);
        this.f741u = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x010f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v35 */
    @Override // ss.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String id2, String type, String str, Boolean bool, String currChip, Integer num, String str2) {
        boolean z10;
        String str3;
        Object obj;
        int i6;
        cn.i iVar;
        MiniCourse miniCourse;
        boolean z11;
        LibraryActivity libraryActivity;
        MiniCourseMetadata miniCourseMetadata;
        LibraryActivity libraryActivity2;
        MiniCourse miniCourse2;
        MiniCourse miniCourse3;
        zm.c cVar;
        LibraryActivity libraryActivity3;
        HashSet<MiniCourse> hashSet;
        MiniCourse miniCourse4;
        String str4;
        boolean z12;
        String str5;
        HashSet<MiniCourseMetadata> hashSet2;
        MiniCourseMetadata miniCourseMetadata2;
        String str6;
        boolean z13;
        cn.i iVar2;
        String str7;
        Object obj2;
        Object obj3;
        String str8;
        j jVar;
        String str9;
        int i10;
        Bundle f;
        String str10;
        j jVar2;
        boolean z14;
        Object obj4;
        RecyclerView.e eVar;
        cn.i iVar3;
        ArrayList<MiniCourse> miniCourses;
        Object obj5;
        ArrayList<CourseDayModelV1> plan;
        ArrayList<MiniCourse> topicalCourseList;
        Object obj6;
        ArrayList<CourseDayModelV1> plan2;
        RecyclerView.e eVar2;
        zm.c cVar2;
        boolean z15;
        String str11;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap;
        RecyclerView.e eVar3;
        zm.c cVar3;
        boolean z16;
        RecyclerView.e eVar4;
        zm.c cVar4;
        boolean z17;
        String str12;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap2;
        hs.f<Boolean, Boolean> fVar;
        boolean z18;
        HashMap<String, hs.f<Boolean, Boolean>> hashMap3;
        cn.i iVar4;
        MiniCourse miniCourse5;
        boolean booleanValue = bool.booleanValue();
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(type, "type");
        kotlin.jvm.internal.i.g(currChip, "currChip");
        j jVar3 = this.f741u;
        if (!booleanValue && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !kotlin.jvm.internal.i.b(type, "mini_course")) {
            androidx.fragment.app.p requireActivity = jVar3.requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            jVar3.startActivity(tr.r.s(requireActivity, false).putExtra("source", id2));
        } else {
            if (!booleanValue && !kotlin.jvm.internal.i.b(type, "mini_course")) {
                z10 = false;
            } else {
                z10 = true;
            }
            jVar3.f734z = z10;
            int hashCode = type.hashCode();
            String[] strArr = jVar3.f733y;
            switch (hashCode) {
                case -341064690:
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    if (type.equals("resource") && (iVar = jVar3.A) != null) {
                        try {
                            miniCourse = null;
                            miniCourse5 = null;
                        } catch (Exception e10) {
                            e = e10;
                            miniCourse = null;
                        }
                        try {
                            ta.v.H(kc.f.H(iVar), null, 0, new cn.g(iVar, id2, null), 3);
                        } catch (Exception e11) {
                            e = e11;
                            LogHelper.INSTANCE.e(iVar.f5567y, e);
                            miniCourse5 = miniCourse;
                            miniCourse3 = miniCourse5;
                            cVar = miniCourse5;
                            iVar2 = jVar3.A;
                            if (iVar2 == null) {
                            }
                            String str13 = gk.a.f16573a;
                            f = defpackage.e.f("top_pick_chip", str9, "top_pick_item_type", type);
                            f.putString("top_pick_item_name", str);
                            f.putString("source_of_action", "lib_main_screen");
                            if (is.k.Q1(type, new String[]{str7, str8})) {
                            }
                            obj4 = obj3;
                            if (kotlin.jvm.internal.i.b(type, obj4)) {
                            }
                            if (kotlin.jvm.internal.i.b(type, obj2)) {
                                iVar3 = jVar2.A;
                                int i11 = -1;
                                if (iVar3 != null) {
                                }
                                f.putInt("mini_course_progress", i11);
                            }
                            f.putInt("top_pick_item_position_in_list", i10);
                            f.putBoolean("paid_top_pick_item", !booleanValue);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(f, "lib_top_pick_cta_click");
                            if (kotlin.jvm.internal.i.b(type, obj4)) {
                            }
                            return hs.k.f19476a;
                        }
                        miniCourse3 = miniCourse5;
                        cVar = miniCourse5;
                    }
                    miniCourse5 = null;
                    miniCourse3 = miniCourse5;
                    cVar = miniCourse5;
                    break;
                case -38716301:
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    if (type.equals("recommended_activity")) {
                        cn.i iVar5 = jVar3.A;
                        if (iVar5 != null) {
                            try {
                                ta.v.H(kc.f.H(iVar5), null, 0, new cn.f(iVar5, id2, null), 3);
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(iVar5.f5567y, e12);
                            }
                        }
                        strArr[0] = id2;
                        strArr[1] = type;
                        strArr[2] = str;
                    }
                    miniCourse5 = null;
                    miniCourse3 = miniCourse5;
                    cVar = miniCourse5;
                    break;
                case 606502613:
                    if (!type.equals("main_activity")) {
                        str3 = "main_activity";
                        obj = "mini_course";
                        i6 = intValue;
                    } else {
                        if (str2 != null && !gv.n.B0(str2)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        str3 = "main_activity";
                        if (z11) {
                            obj = "mini_course";
                            i6 = intValue;
                            Intent intent = new Intent(jVar3.getActivity(), TemplateActivity.class);
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
                            jVar3.C.a(intent);
                        } else {
                            obj = "mini_course";
                            i6 = intValue;
                            Intent intent2 = new Intent(jVar3.requireActivity(), NewDynamicParentActivity.class);
                            intent2.putExtra("activity_id", id2);
                            intent2.putExtra("goalSource", "library");
                            intent2.putExtra("activity_name", str);
                            intent2.putExtra(Constants.COURSE_NAME, Constants.LIBRARY_GOAL_COURSE);
                            intent2.putExtra("showAltFeedback", true);
                            jVar3.D.a(intent2);
                        }
                        strArr[0] = id2;
                        strArr[1] = type;
                        strArr[2] = str;
                    }
                    miniCourse5 = null;
                    miniCourse3 = miniCourse5;
                    cVar = miniCourse5;
                    break;
                case 955611395:
                    if (type.equals("mini_course")) {
                        androidx.fragment.app.p requireActivity2 = jVar3.requireActivity();
                        if (requireActivity2 instanceof LibraryActivity) {
                            libraryActivity = (LibraryActivity) requireActivity2;
                        } else {
                            libraryActivity = null;
                        }
                        if (libraryActivity != null && (hashSet2 = libraryActivity.f11292w) != null) {
                            Iterator<MiniCourseMetadata> it = hashSet2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    miniCourseMetadata2 = it.next();
                                    MiniCourseMetadata miniCourseMetadata3 = miniCourseMetadata2;
                                    if (miniCourseMetadata3 != null) {
                                        str6 = miniCourseMetadata3.getId();
                                    } else {
                                        str6 = null;
                                    }
                                    if (kotlin.jvm.internal.i.b(str6, id2) && kotlin.jvm.internal.i.b(miniCourseMetadata3.getPublished(), Boolean.TRUE)) {
                                        z13 = true;
                                        continue;
                                    } else {
                                        z13 = false;
                                        continue;
                                    }
                                    if (z13) {
                                    }
                                } else {
                                    miniCourseMetadata2 = null;
                                }
                            }
                            miniCourseMetadata = miniCourseMetadata2;
                        } else {
                            miniCourseMetadata = null;
                        }
                        androidx.fragment.app.p requireActivity3 = jVar3.requireActivity();
                        if (requireActivity3 instanceof LibraryActivity) {
                            libraryActivity2 = (LibraryActivity) requireActivity3;
                        } else {
                            libraryActivity2 = null;
                        }
                        if (libraryActivity2 != null && (hashSet = libraryActivity2.f11293x) != null) {
                            Iterator<MiniCourse> it2 = hashSet.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    miniCourse4 = it2.next();
                                    MiniCourse miniCourse6 = miniCourse4;
                                    if (miniCourse6 != null) {
                                        str4 = miniCourse6.getDomain();
                                    } else {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        String domain = miniCourse6.getDomain();
                                        if (miniCourseMetadata != null) {
                                            str5 = miniCourseMetadata.getSlug();
                                        } else {
                                            str5 = null;
                                        }
                                        if (kotlin.jvm.internal.i.b(domain, str5)) {
                                            z12 = true;
                                            continue;
                                            if (z12) {
                                            }
                                        }
                                    }
                                    z12 = false;
                                    continue;
                                    if (z12) {
                                    }
                                } else {
                                    miniCourse4 = null;
                                }
                            }
                            miniCourse2 = miniCourse4;
                        } else {
                            miniCourse2 = null;
                        }
                        if (miniCourse2 != null && miniCourseMetadata != null) {
                            androidx.fragment.app.p requireActivity4 = jVar3.requireActivity();
                            if (requireActivity4 instanceof LibraryActivity) {
                                libraryActivity3 = (LibraryActivity) requireActivity4;
                            } else {
                                libraryActivity3 = null;
                            }
                            if (libraryActivity3 != null) {
                                Bundle bundle = new Bundle();
                                bundle.putSerializable("mcMetaData", miniCourseMetadata);
                                bundle.putSerializable("miniCourse", miniCourse2);
                                bundle.putInt("miniCourse_position_in_list", intValue);
                                bundle.putString("miniCourse_chip", jVar3.f730v);
                                hs.k kVar3 = hs.k.f19476a;
                                libraryActivity3.n0(bundle, "short_courses");
                            }
                        }
                        String[] strArr2 = new String[3];
                        strArr2[0] = id2;
                        strArr2[1] = (miniCourse2 == null || (r1 = miniCourse2.getDomain()) == null) ? "" : "";
                        strArr2[2] = (miniCourse2 == null || (r1 = miniCourse2.getCourse()) == null) ? "" : "";
                        jVar3.B = strArr2;
                        miniCourse3 = miniCourse2;
                        str3 = "main_activity";
                        obj = "mini_course";
                        i6 = intValue;
                        cVar = null;
                        break;
                    }
                    break;
                default:
                    str3 = "main_activity";
                    obj = "mini_course";
                    i6 = intValue;
                    miniCourse5 = null;
                    miniCourse3 = miniCourse5;
                    cVar = miniCourse5;
                    break;
            }
            iVar2 = jVar3.A;
            if (iVar2 == null) {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                boolean b10 = kotlin.jvm.internal.i.b(type, "resource");
                String parentId = jVar3.f731w;
                boolean z19 = jVar3.f734z;
                kotlin.jvm.internal.i.g(parentId, "parentId");
                try {
                    obj3 = "resource";
                    str7 = str3;
                    str8 = "recommended_activity";
                    obj2 = obj;
                    jVar = jVar3;
                    iVar4 = iVar2;
                    i10 = i6;
                    str9 = currChip;
                    try {
                        cVar = null;
                    } catch (Exception e13) {
                        e = e13;
                        cVar = null;
                    }
                } catch (Exception e14) {
                    e = e14;
                    str7 = str3;
                    obj2 = obj;
                    obj3 = "resource";
                    str8 = "recommended_activity";
                    jVar = jVar3;
                    iVar4 = iVar2;
                    str9 = currChip;
                    i10 = i6;
                }
                try {
                    ta.v.H(kc.f.H(iVar2), null, 0, new cn.c(iVar2, id2, type, str, timeInMillis, b10, parentId, "top_picks", z19, null), 3);
                } catch (Exception e15) {
                    e = e15;
                    LogHelper.INSTANCE.e(iVar4.f5567y, e);
                    String str132 = gk.a.f16573a;
                    f = defpackage.e.f("top_pick_chip", str9, "top_pick_item_type", type);
                    f.putString("top_pick_item_name", str);
                    f.putString("source_of_action", "lib_main_screen");
                    if (is.k.Q1(type, new String[]{str7, str8})) {
                    }
                    obj4 = obj3;
                    if (kotlin.jvm.internal.i.b(type, obj4)) {
                    }
                    if (kotlin.jvm.internal.i.b(type, obj2)) {
                    }
                    f.putInt("top_pick_item_position_in_list", i10);
                    f.putBoolean("paid_top_pick_item", !booleanValue);
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(f, "lib_top_pick_cta_click");
                    if (kotlin.jvm.internal.i.b(type, obj4)) {
                    }
                    return hs.k.f19476a;
                }
            } else {
                str7 = str3;
                obj2 = obj;
                obj3 = "resource";
                str8 = "recommended_activity";
                jVar = jVar3;
                str9 = currChip;
                i10 = i6;
            }
            String str1322 = gk.a.f16573a;
            f = defpackage.e.f("top_pick_chip", str9, "top_pick_item_type", type);
            f.putString("top_pick_item_name", str);
            f.putString("source_of_action", "lib_main_screen");
            if (is.k.Q1(type, new String[]{str7, str8})) {
                jVar2 = jVar;
                RecyclerView recyclerView = (RecyclerView) jVar2._$_findCachedViewById(R.id.rvTpItemsRecycler);
                if (recyclerView != null) {
                    eVar3 = recyclerView.getAdapter();
                } else {
                    eVar3 = cVar;
                }
                if (eVar3 instanceof zm.c) {
                    cVar3 = (zm.c) eVar3;
                } else {
                    cVar3 = cVar;
                }
                if (cVar3 != null && (hashMap3 = cVar3.f39620y) != null) {
                    str10 = id2;
                    hs.f<Boolean, Boolean> fVar2 = hashMap3.get(str10);
                    if (fVar2 != null) {
                        z14 = true;
                        if (fVar2.f19465v.booleanValue()) {
                            z16 = true;
                            if (z16) {
                                str12 = "completed";
                            } else {
                                RecyclerView recyclerView2 = (RecyclerView) jVar2._$_findCachedViewById(R.id.rvTpItemsRecycler);
                                if (recyclerView2 != null) {
                                    eVar4 = recyclerView2.getAdapter();
                                } else {
                                    eVar4 = cVar;
                                }
                                if (eVar4 instanceof zm.c) {
                                    cVar4 = (zm.c) eVar4;
                                } else {
                                    cVar4 = cVar;
                                }
                                if (cVar4 != null && (hashMap2 = cVar4.f39620y) != null && (fVar = hashMap2.get(str10)) != null && fVar.f19464u.booleanValue() == z14) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    str12 = "incomplete";
                                } else {
                                    str12 = "not_started";
                                }
                            }
                            f.putString("status_of_activity_when_clicked", str12);
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
                        f.putString("status_of_activity_when_clicked", str12);
                        if (str2 == null) {
                        }
                        z18 = true;
                        f.putBoolean("dynamicV1", !z18);
                    }
                } else {
                    str10 = id2;
                }
                z14 = true;
                z16 = false;
                if (z16) {
                }
                f.putString("status_of_activity_when_clicked", str12);
                if (str2 == null) {
                }
                z18 = true;
                f.putBoolean("dynamicV1", !z18);
            } else {
                str10 = id2;
                jVar2 = jVar;
                z14 = true;
            }
            obj4 = obj3;
            if (kotlin.jvm.internal.i.b(type, obj4)) {
                RecyclerView recyclerView3 = (RecyclerView) jVar2._$_findCachedViewById(R.id.rvTpItemsRecycler);
                if (recyclerView3 != null) {
                    eVar2 = recyclerView3.getAdapter();
                } else {
                    eVar2 = cVar;
                }
                if (eVar2 instanceof zm.c) {
                    cVar2 = (zm.c) eVar2;
                } else {
                    cVar2 = cVar;
                }
                if (cVar2 != null && (hashMap = cVar2.f39620y) != null && hashMap.containsKey(str10) == z14) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    str11 = "read";
                } else {
                    str11 = "unread";
                }
                f.putString("resource_status", str11);
            }
            if (kotlin.jvm.internal.i.b(type, obj2) && miniCourse3 != null) {
                iVar3 = jVar2.A;
                int i112 = -1;
                if (iVar3 != null) {
                    String domain2 = miniCourse3.getDomain();
                    if (domain2 == null) {
                        domain2 = "";
                    }
                    try {
                        if (kotlin.jvm.internal.i.b(miniCourse3.getCourse(), Constants.COURSE_GENERIC)) {
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                                Iterator it3 = topicalCourseList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj6 = it3.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj6).getDomain(), domain2)) {
                                        }
                                    } else {
                                        obj6 = cVar;
                                    }
                                }
                                MiniCourse miniCourse7 = (MiniCourse) obj6;
                                if (miniCourse7 != null && (plan2 = miniCourse7.getPlan()) != null) {
                                    ListIterator<CourseDayModelV1> listIterator = plan2.listIterator(plan2.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            if (listIterator.previous().isCompleted()) {
                                                i112 = listIterator.nextIndex();
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null && (miniCourses = user2.getMiniCourses()) != null) {
                                Iterator it4 = miniCourses.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        obj5 = it4.next();
                                        if (kotlin.jvm.internal.i.b(((MiniCourse) obj5).getDomain(), domain2)) {
                                        }
                                    } else {
                                        obj5 = cVar;
                                    }
                                }
                                MiniCourse miniCourse8 = (MiniCourse) obj5;
                                if (miniCourse8 != null && (plan = miniCourse8.getPlan()) != null) {
                                    ListIterator<CourseDayModelV1> listIterator2 = plan.listIterator(plan.size());
                                    while (true) {
                                        if (listIterator2.hasPrevious()) {
                                            if (listIterator2.previous().isCompleted()) {
                                                i112 = listIterator2.nextIndex();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i112++;
                    } catch (Exception e16) {
                        LogHelper.INSTANCE.e(iVar3.f5567y, e16);
                        i112 = 0;
                    }
                }
                f.putInt("mini_course_progress", i112);
            }
            f.putInt("top_pick_item_position_in_list", i10);
            f.putBoolean("paid_top_pick_item", !booleanValue);
            hs.k kVar42 = hs.k.f19476a;
            gk.a.b(f, "lib_top_pick_cta_click");
            if (kotlin.jvm.internal.i.b(type, obj4)) {
                RecyclerView recyclerView4 = (RecyclerView) jVar2._$_findCachedViewById(R.id.rvTpItemsRecycler);
                if (recyclerView4 != null) {
                    eVar = recyclerView4.getAdapter();
                } else {
                    eVar = cVar;
                }
                if (eVar instanceof zm.c) {
                    cVar = (zm.c) eVar;
                }
                if (cVar != null) {
                    cVar.y(str10);
                }
            }
        }
        return hs.k.f19476a;
    }
}
