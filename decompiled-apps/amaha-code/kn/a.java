package kn;

import android.content.Context;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import gv.n;
import hs.k;
import is.p;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
/* compiled from: LogUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<LogModel> f23436a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<String> f23437b = Constants.getResultLogSlugs();

    /* compiled from: LogUtils.kt */
    /* renamed from: kn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0358a {
        MAIN_PLAN_LOGS,
        ADDITIONAL_LOGS
    }

    public static void a(Goal goal, String str, User user) {
        DepressionCourse depression = user.getDepression();
        if (depression != null) {
            for (CourseDayModelV1 courseDayModelV1 : depression.getPlanV3()) {
                if (i.b(courseDayModelV1.getContent_id(), goal.getGoalId())) {
                    String content_label = courseDayModelV1.getContent_label();
                    i.d(content_label);
                    b(str, goal, content_label);
                    return;
                }
            }
        }
        HappinessCourse happiness = user.getHappiness();
        if (happiness != null) {
            for (CourseDayModelV1 courseDayModelV12 : happiness.getPlanV3()) {
                if (i.b(courseDayModelV12.getContent_id(), goal.getGoalId())) {
                    String content_label2 = courseDayModelV12.getContent_label();
                    i.d(content_label2);
                    b(str, goal, content_label2);
                    return;
                }
            }
        }
        StressCourse stress = user.getStress();
        if (stress != null) {
            for (CourseDayModelV1 courseDayModelV13 : stress.getPlanV3()) {
                if (i.b(courseDayModelV13.getContent_id(), goal.getGoalId())) {
                    String content_label3 = courseDayModelV13.getContent_label();
                    i.d(content_label3);
                    b(str, goal, content_label3);
                    return;
                }
            }
        }
        AngerCourse anger = user.getAnger();
        if (anger != null) {
            for (CourseDayModelV1 courseDayModelV14 : anger.getPlanV3()) {
                if (i.b(courseDayModelV14.getContent_id(), goal.getGoalId())) {
                    String content_label4 = courseDayModelV14.getContent_label();
                    i.d(content_label4);
                    b(str, goal, content_label4);
                    return;
                }
            }
        }
        SleepCourse sleep = user.getSleep();
        if (sleep != null) {
            for (CourseDayModelV1 courseDayModelV15 : sleep.getPlanV3()) {
                if (i.b(courseDayModelV15.getContent_id(), goal.getGoalId())) {
                    String content_label5 = courseDayModelV15.getContent_label();
                    i.d(content_label5);
                    b(str, goal, content_label5);
                    return;
                }
            }
        }
        WorryCourse worry = user.getWorry();
        if (worry != null) {
            for (CourseDayModelV1 courseDayModelV16 : worry.getPlanV3()) {
                if (i.b(courseDayModelV16.getContent_id(), goal.getGoalId())) {
                    String content_label6 = courseDayModelV16.getContent_label();
                    i.d(content_label6);
                    b(str, goal, content_label6);
                    return;
                }
            }
        }
        String goalName = goal.getGoalName();
        if (goalName == null) {
            goalName = goal.getGoalId();
            i.d(goalName);
        }
        b(str, goal, goalName);
    }

    public static void b(String str, Goal goal, String str2) {
        boolean b10 = i.b(str, "result_3");
        ArrayList<LogModel> arrayList = f23436a;
        if (b10) {
            if (i.b(goal.getGoalId(), "x76394F9od4GtQkHp3Tu")) {
                String goalName = goal.getGoalName();
                String goalId = goal.getGoalId();
                i.d(goalId);
                arrayList.add(new LogModel(goalName, goalId, str, str2, true));
            }
        } else if (i.b(str, "result_28")) {
            if (i.b(goal.getGoalId(), "mFx5Szq1qTtgsz2KLz8L")) {
                String goalName2 = goal.getGoalName();
                String goalId2 = goal.getGoalId();
                i.d(goalId2);
                arrayList.add(new LogModel(goalName2, goalId2, str, str2, true));
            }
        } else {
            String goalName3 = goal.getGoalName();
            String goalId3 = goal.getGoalId();
            i.d(goalId3);
            arrayList.add(new LogModel(goalName3, goalId3, str, str2, true));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0022 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(String source, Context context, EnumC0358a logType, List list, ArrayList arrayList, User user, String str) {
        ArrayList arrayList2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String goalId;
        LogModel logModel;
        String goalName;
        LogModel logModel2;
        LogModel logModel3;
        LogModel logModel4;
        String dataTypeKey;
        LogModel logModel5;
        String dataTypeKey2;
        String dataTypeKey3;
        LogModel logModel6;
        String dataTypeKey4;
        String dataTypeKey5;
        String str8;
        String goalId2;
        LogModel logModel7;
        String content_label;
        String str9;
        String str10;
        boolean z10;
        String str11;
        i.g(source, "source");
        i.g(logType, "logType");
        if (logType == EnumC0358a.MAIN_PLAN_LOGS) {
            arrayList2 = new ArrayList();
            for (Object obj : list) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
                if (firestoreGoal != null) {
                    str9 = firestoreGoal.getSource();
                } else {
                    str9 = null;
                }
                if (str == null) {
                    str10 = "daily_plan";
                } else {
                    str10 = str;
                }
                if (n.A0(str9, str10, false)) {
                    if (firestoreGoal != null) {
                        str11 = firestoreGoal.getCourseName();
                    } else {
                        str11 = null;
                    }
                    if (n.A0(str11, source, false)) {
                        z10 = true;
                        if (!z10) {
                            arrayList2.add(obj);
                        }
                    }
                }
                z10 = false;
                if (!z10) {
                }
            }
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                FirestoreGoal firestoreGoal2 = (FirestoreGoal) obj2;
                if (firestoreGoal2 != null) {
                    str2 = firestoreGoal2.getSource();
                } else {
                    str2 = null;
                }
                if (n.A0(str2, source, false)) {
                    arrayList2.add(obj2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList<String> resultLogSlugs = Constants.getResultLogSlugs();
        ArrayList<LogModel> arrayList4 = f23436a;
        arrayList4.clear();
        if (arrayList3.size() > 1) {
            p.P1(arrayList3, new b());
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            FirestoreGoal firestoreGoal3 = (FirestoreGoal) it.next();
            if (firestoreGoal3 != null) {
                str3 = firestoreGoal3.getDataTypeKey();
            } else {
                str3 = null;
            }
            if (resultLogSlugs.contains(str3)) {
                ArrayList k10 = ca.a.k("result_1", "result_4", "result_6", "result_9", "result_10", "result_11", "result_14", "result_16", "result_21", "result_22", "result_30", "result_32");
                if (firestoreGoal3 != null) {
                    str4 = firestoreGoal3.getDataTypeKey();
                } else {
                    str4 = null;
                }
                if (u.Z1(k10, str4)) {
                    Iterator it2 = arrayList.iterator();
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV1 : ((MiniCourse) it2.next()).getPlan()) {
                            String content_id = courseDayModelV1.getContent_id();
                            if (firestoreGoal3 != null) {
                                str8 = firestoreGoal3.getGoalId();
                            } else {
                                str8 = null;
                            }
                            if (i.b(content_id, str8)) {
                                if (firestoreGoal3 != null && (goalId2 = firestoreGoal3.getGoalId()) != null) {
                                    String dataTypeKey6 = firestoreGoal3.getDataTypeKey();
                                    if (dataTypeKey6 != null && (content_label = courseDayModelV1.getContent_label()) != null) {
                                        logModel7 = new LogModel(firestoreGoal3.getGoalName(), goalId2, dataTypeKey6, content_label, false);
                                    } else {
                                        logModel7 = null;
                                    }
                                    if (logModel7 != null) {
                                        arrayList4.add(logModel7);
                                    }
                                }
                                z11 = true;
                            }
                        }
                    }
                    if (!z11 && firestoreGoal3 != null && (dataTypeKey5 = firestoreGoal3.getDataTypeKey()) != null) {
                        e(firestoreGoal3, dataTypeKey5, user);
                        k kVar = k.f19476a;
                    }
                } else {
                    if (firestoreGoal3 != null) {
                        str5 = firestoreGoal3.getDataTypeKey();
                    } else {
                        str5 = null;
                    }
                    if (i.b(str5, "result_3")) {
                        Iterator it3 = arrayList.iterator();
                        boolean z12 = false;
                        while (it3.hasNext()) {
                            for (CourseDayModelV1 courseDayModelV12 : ((MiniCourse) it3.next()).getPlan()) {
                                if (i.b(courseDayModelV12.getContent_id(), firestoreGoal3.getGoalId()) && i.b(courseDayModelV12.getContent_id(), "x76394F9od4GtQkHp3Tu")) {
                                    String goalId3 = firestoreGoal3.getGoalId();
                                    if (goalId3 != null) {
                                        String content_label2 = courseDayModelV12.getContent_label();
                                        if (content_label2 != null && (dataTypeKey4 = firestoreGoal3.getDataTypeKey()) != null) {
                                            logModel6 = new LogModel(firestoreGoal3.getGoalName(), goalId3, dataTypeKey4, content_label2, false);
                                        } else {
                                            logModel6 = null;
                                        }
                                        if (logModel6 != null) {
                                            arrayList4.add(logModel6);
                                        }
                                    }
                                    z12 = true;
                                }
                            }
                        }
                        if (!z12 && (dataTypeKey3 = firestoreGoal3.getDataTypeKey()) != null) {
                            e(firestoreGoal3, dataTypeKey3, user);
                            k kVar2 = k.f19476a;
                        }
                    } else {
                        if (firestoreGoal3 != null) {
                            str6 = firestoreGoal3.getDataTypeKey();
                        } else {
                            str6 = null;
                        }
                        if (i.b(str6, "result_28")) {
                            Iterator it4 = arrayList.iterator();
                            boolean z13 = false;
                            while (it4.hasNext()) {
                                for (CourseDayModelV1 courseDayModelV13 : ((MiniCourse) it4.next()).getPlan()) {
                                    if (i.b(courseDayModelV13.getContent_id(), firestoreGoal3.getGoalId()) && i.b(courseDayModelV13.getContent_id(), "mFx5Szq1qTtgsz2KLz8L")) {
                                        String goalId4 = firestoreGoal3.getGoalId();
                                        if (goalId4 != null) {
                                            String content_label3 = courseDayModelV13.getContent_label();
                                            if (content_label3 != null && (dataTypeKey2 = firestoreGoal3.getDataTypeKey()) != null) {
                                                logModel5 = new LogModel(firestoreGoal3.getGoalName(), goalId4, dataTypeKey2, content_label3, false);
                                            } else {
                                                logModel5 = null;
                                            }
                                            if (logModel5 != null) {
                                                arrayList4.add(logModel5);
                                            }
                                        }
                                        z13 = true;
                                    }
                                }
                            }
                            if (!z13 && (dataTypeKey = firestoreGoal3.getDataTypeKey()) != null) {
                                e(firestoreGoal3, dataTypeKey, user);
                                k kVar3 = k.f19476a;
                            }
                        } else {
                            if (firestoreGoal3 != null) {
                                str7 = firestoreGoal3.getGoalName();
                            } else {
                                str7 = null;
                            }
                            if (str7 != null) {
                                int hashCode = str7.hashCode();
                                if (hashCode != -1294987106) {
                                    if (hashCode != -728315683) {
                                        if (hashCode == 692978500 && str7.equals("Use the worry time technique")) {
                                            String goalId5 = firestoreGoal3.getGoalId();
                                            if (goalId5 != null) {
                                                String dataTypeKey7 = firestoreGoal3.getDataTypeKey();
                                                if (dataTypeKey7 != null) {
                                                    String goalName2 = firestoreGoal3.getGoalName();
                                                    String string = context.getString(R.string.logActivityTitleWorryTime);
                                                    i.f(string, "context.getString(R.stri…ogActivityTitleWorryTime)");
                                                    logModel4 = new LogModel(goalName2, goalId5, dataTypeKey7, string, false);
                                                } else {
                                                    logModel4 = null;
                                                }
                                                if (logModel4 != null) {
                                                    arrayList4.add(logModel4);
                                                }
                                            }
                                            k kVar4 = k.f19476a;
                                        }
                                    } else if (str7.equals("Stages of Problem Solving")) {
                                        String goalId6 = firestoreGoal3.getGoalId();
                                        if (goalId6 != null) {
                                            String dataTypeKey8 = firestoreGoal3.getDataTypeKey();
                                            if (dataTypeKey8 != null) {
                                                String goalName3 = firestoreGoal3.getGoalName();
                                                String string2 = context.getString(R.string.logActivityTitleProblemSolvingFormula);
                                                i.f(string2, "context.getString(R.stri…tleProblemSolvingFormula)");
                                                logModel3 = new LogModel(goalName3, goalId6, dataTypeKey8, string2, false);
                                            } else {
                                                logModel3 = null;
                                            }
                                            if (logModel3 != null) {
                                                arrayList4.add(logModel3);
                                            }
                                        }
                                        k kVar5 = k.f19476a;
                                    }
                                } else if (str7.equals("Write down 3 good things")) {
                                    String goalId7 = firestoreGoal3.getGoalId();
                                    if (goalId7 != null) {
                                        String dataTypeKey9 = firestoreGoal3.getDataTypeKey();
                                        if (dataTypeKey9 != null) {
                                            String goalName4 = firestoreGoal3.getGoalName();
                                            String string3 = context.getString(R.string.logActivityTitle3GoodThings);
                                            i.f(string3, "context.getString(R.stri…ActivityTitle3GoodThings)");
                                            new LogModel(goalName4, goalId7, dataTypeKey9, string3, false);
                                            String goalName5 = firestoreGoal3.getGoalName();
                                            String string4 = context.getString(R.string.logActivityTitle3GoodThings);
                                            i.f(string4, "context.getString(R.stri…ActivityTitle3GoodThings)");
                                            logModel2 = new LogModel(goalName5, goalId7, dataTypeKey9, string4, false);
                                        } else {
                                            logModel2 = null;
                                        }
                                        if (logModel2 != null) {
                                            arrayList4.add(logModel2);
                                        }
                                    }
                                    k kVar6 = k.f19476a;
                                }
                            }
                            if (firestoreGoal3 != null && (goalId = firestoreGoal3.getGoalId()) != null) {
                                String dataTypeKey10 = firestoreGoal3.getDataTypeKey();
                                if (dataTypeKey10 != null && (goalName = firestoreGoal3.getGoalName()) != null) {
                                    logModel = new LogModel(firestoreGoal3.getGoalName(), goalId, dataTypeKey10, goalName, false);
                                } else {
                                    logModel = null;
                                }
                                if (logModel != null) {
                                    arrayList4.add(logModel);
                                }
                            }
                            k kVar7 = k.f19476a;
                        }
                    }
                }
            }
        }
        return arrayList4;
    }

    public static ArrayList d(String source, Context context, EnumC0358a logType, List list, ArrayList arrayList, User user, String str) {
        ArrayList arrayList2;
        String str2;
        boolean z10;
        i.g(source, "source");
        i.g(logType, "logType");
        if (logType == EnumC0358a.MAIN_PLAN_LOGS) {
            arrayList2 = new ArrayList();
            for (Object obj : list) {
                Goal goal = (Goal) obj;
                String source2 = goal.getSource();
                if (str == null) {
                    str2 = "daily_plan";
                } else {
                    str2 = str;
                }
                if (n.A0(source2, str2, false) && n.A0(goal.getCourseName(), source, false)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList2.add(obj);
                }
            }
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (n.A0(((Goal) obj2).getSource(), source, false)) {
                    arrayList2.add(obj2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ArrayList<String> resultLogSlugs = Constants.getResultLogSlugs();
        ArrayList<LogModel> arrayList4 = f23436a;
        arrayList4.clear();
        if (arrayList3.size() > 1) {
            p.P1(arrayList3, new c());
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            Goal goal2 = (Goal) it.next();
            Set<String> keySet = goal2.getData().keySet();
            i.f(keySet, "goal.data.keys");
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : keySet) {
                if (resultLogSlugs.contains((String) obj3)) {
                    arrayList5.add(obj3);
                }
            }
            List I2 = u.I2(arrayList5);
            int size = I2.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (ca.a.k("result_1", "result_4", "result_6", "result_9", "result_10", "result_11", "result_14", "result_16", "result_21", "result_22", "result_30", "result_32").contains(I2.get(i6))) {
                    Iterator it2 = arrayList.iterator();
                    boolean z11 = false;
                    while (it2.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV1 : ((MiniCourse) it2.next()).getPlan()) {
                            if (i.b(courseDayModelV1.getContent_id(), goal2.getGoalId())) {
                                String goalName = goal2.getGoalName();
                                String goalId = goal2.getGoalId();
                                i.d(goalId);
                                Object obj4 = I2.get(i6);
                                i.f(obj4, "filteredList[pos]");
                                String content_label = courseDayModelV1.getContent_label();
                                i.d(content_label);
                                arrayList4.add(new LogModel(goalName, goalId, (String) obj4, content_label, false));
                                z11 = true;
                            }
                        }
                    }
                    if (!z11) {
                        Object obj5 = I2.get(i6);
                        i.f(obj5, "filteredList[pos]");
                        a(goal2, (String) obj5, user);
                    }
                } else if (i.b(I2.get(i6), "result_3")) {
                    Iterator it3 = arrayList.iterator();
                    boolean z12 = false;
                    while (it3.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV12 : ((MiniCourse) it3.next()).getPlan()) {
                            if (i.b(courseDayModelV12.getContent_id(), goal2.getGoalId()) && i.b(courseDayModelV12.getContent_id(), "x76394F9od4GtQkHp3Tu")) {
                                String goalName2 = goal2.getGoalName();
                                String goalId2 = goal2.getGoalId();
                                i.d(goalId2);
                                Object obj6 = I2.get(i6);
                                i.f(obj6, "filteredList[pos]");
                                String content_label2 = courseDayModelV12.getContent_label();
                                i.d(content_label2);
                                arrayList4.add(new LogModel(goalName2, goalId2, (String) obj6, content_label2, false));
                                z12 = true;
                            }
                        }
                    }
                    if (!z12) {
                        Object obj7 = I2.get(i6);
                        i.f(obj7, "filteredList[pos]");
                        a(goal2, (String) obj7, user);
                    }
                } else if (i.b(I2.get(i6), "result_28")) {
                    Iterator it4 = arrayList.iterator();
                    boolean z13 = false;
                    while (it4.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV13 : ((MiniCourse) it4.next()).getPlan()) {
                            if (i.b(courseDayModelV13.getContent_id(), goal2.getGoalId()) && i.b(courseDayModelV13.getContent_id(), "mFx5Szq1qTtgsz2KLz8L")) {
                                String goalName3 = goal2.getGoalName();
                                String goalId3 = goal2.getGoalId();
                                i.d(goalId3);
                                Object obj8 = I2.get(i6);
                                i.f(obj8, "filteredList[pos]");
                                String content_label3 = courseDayModelV13.getContent_label();
                                i.d(content_label3);
                                arrayList4.add(new LogModel(goalName3, goalId3, (String) obj8, content_label3, false));
                                z13 = true;
                            }
                        }
                    }
                    if (!z13) {
                        Object obj9 = I2.get(i6);
                        i.f(obj9, "filteredList[pos]");
                        a(goal2, (String) obj9, user);
                    }
                } else {
                    String goalName4 = goal2.getGoalName();
                    if (goalName4 != null) {
                        int hashCode = goalName4.hashCode();
                        if (hashCode != -1294987106) {
                            if (hashCode != -728315683) {
                                if (hashCode == 692978500 && goalName4.equals("Use the worry time technique")) {
                                    String goalName5 = goal2.getGoalName();
                                    String goalId4 = goal2.getGoalId();
                                    i.d(goalId4);
                                    Object obj10 = I2.get(i6);
                                    i.f(obj10, "filteredList[pos]");
                                    String str3 = (String) obj10;
                                    String string = context.getString(R.string.logActivityTitleWorryTime);
                                    i.f(string, "context.getString(R.stri…ogActivityTitleWorryTime)");
                                    arrayList4.add(new LogModel(goalName5, goalId4, str3, string, false));
                                }
                            } else if (goalName4.equals("Stages of Problem Solving")) {
                                String goalName6 = goal2.getGoalName();
                                String goalId5 = goal2.getGoalId();
                                i.d(goalId5);
                                Object obj11 = I2.get(i6);
                                i.f(obj11, "filteredList[pos]");
                                String str4 = (String) obj11;
                                String string2 = context.getString(R.string.logActivityTitleProblemSolvingFormula);
                                i.f(string2, "context.getString(R.stri…tleProblemSolvingFormula)");
                                arrayList4.add(new LogModel(goalName6, goalId5, str4, string2, false));
                            }
                        } else if (goalName4.equals("Write down 3 good things")) {
                            String goalName7 = goal2.getGoalName();
                            String goalId6 = goal2.getGoalId();
                            i.d(goalId6);
                            Object obj12 = I2.get(i6);
                            i.f(obj12, "filteredList[pos]");
                            String str5 = (String) obj12;
                            String string3 = context.getString(R.string.logActivityTitle3GoodThings);
                            i.f(string3, "context.getString(R.stri…ActivityTitle3GoodThings)");
                            arrayList4.add(new LogModel(goalName7, goalId6, str5, string3, false));
                        }
                    }
                    String goalName8 = goal2.getGoalName();
                    String goalId7 = goal2.getGoalId();
                    i.d(goalId7);
                    Object obj13 = I2.get(i6);
                    i.f(obj13, "filteredList[pos]");
                    String goalName9 = goal2.getGoalName();
                    i.d(goalName9);
                    arrayList4.add(new LogModel(goalName8, goalId7, (String) obj13, goalName9, false));
                }
            }
        }
        return arrayList4;
    }

    public static void e(FirestoreGoal firestoreGoal, String str, User user) {
        DepressionCourse depression = user.getDepression();
        if (depression != null) {
            for (CourseDayModelV1 courseDayModelV1 : depression.getPlanV3()) {
                if (i.b(courseDayModelV1.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label = courseDayModelV1.getContent_label();
                    i.d(content_label);
                    f(str, firestoreGoal, content_label);
                    return;
                }
            }
        }
        HappinessCourse happiness = user.getHappiness();
        if (happiness != null) {
            for (CourseDayModelV1 courseDayModelV12 : happiness.getPlanV3()) {
                if (i.b(courseDayModelV12.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label2 = courseDayModelV12.getContent_label();
                    i.d(content_label2);
                    f(str, firestoreGoal, content_label2);
                    return;
                }
            }
        }
        StressCourse stress = user.getStress();
        if (stress != null) {
            for (CourseDayModelV1 courseDayModelV13 : stress.getPlanV3()) {
                if (i.b(courseDayModelV13.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label3 = courseDayModelV13.getContent_label();
                    i.d(content_label3);
                    f(str, firestoreGoal, content_label3);
                    return;
                }
            }
        }
        AngerCourse anger = user.getAnger();
        if (anger != null) {
            for (CourseDayModelV1 courseDayModelV14 : anger.getPlanV3()) {
                if (i.b(courseDayModelV14.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label4 = courseDayModelV14.getContent_label();
                    i.d(content_label4);
                    f(str, firestoreGoal, content_label4);
                    return;
                }
            }
        }
        SleepCourse sleep = user.getSleep();
        if (sleep != null) {
            for (CourseDayModelV1 courseDayModelV15 : sleep.getPlanV3()) {
                if (i.b(courseDayModelV15.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label5 = courseDayModelV15.getContent_label();
                    i.d(content_label5);
                    f(str, firestoreGoal, content_label5);
                    return;
                }
            }
        }
        WorryCourse worry = user.getWorry();
        if (worry != null) {
            for (CourseDayModelV1 courseDayModelV16 : worry.getPlanV3()) {
                if (i.b(courseDayModelV16.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label6 = courseDayModelV16.getContent_label();
                    i.d(content_label6);
                    f(str, firestoreGoal, content_label6);
                    return;
                }
            }
        }
        String goalName = firestoreGoal.getGoalName();
        if (goalName == null) {
            goalName = firestoreGoal.getGoalId();
            i.d(goalName);
        }
        f(str, firestoreGoal, goalName);
    }

    public static void f(String str, FirestoreGoal firestoreGoal, String str2) {
        boolean b10 = i.b(str, "result_3");
        ArrayList<LogModel> arrayList = f23436a;
        if (b10) {
            String goalId = firestoreGoal.getGoalId();
            if (goalId != null && i.b(goalId, "x76394F9od4GtQkHp3Tu")) {
                arrayList.add(new LogModel(firestoreGoal.getGoalName(), goalId, str, str2, true));
            }
        } else if (i.b(str, "result_28")) {
            String goalId2 = firestoreGoal.getGoalId();
            if (goalId2 != null && i.b(goalId2, "mFx5Szq1qTtgsz2KLz8L")) {
                arrayList.add(new LogModel(firestoreGoal.getGoalName(), goalId2, str, str2, true));
            }
        } else {
            String goalId3 = firestoreGoal.getGoalId();
            if (goalId3 != null) {
                arrayList.add(new LogModel(firestoreGoal.getGoalName(), goalId3, str, str2, true));
            }
        }
    }

    public static ArrayList g(ArrayList courses) {
        i.g(courses, "courses");
        ArrayList arrayList = new ArrayList();
        Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), new TypeToken<ArrayList<MiniCourseInfoMeta>>() { // from class: com.theinnerhour.b2b.components.logs.utils.LogUtils$getAdditionalCourseDisplayNames$arrayListMetaType$1
        }.getType());
        i.f(c10, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
        ArrayList arrayList2 = (ArrayList) c10;
        Iterator it = courses.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (i.b(((MiniCourseInfoMeta) obj).getSlug(), str)) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(((MiniCourseInfoMeta) arrayList3.get(0)).getName());
            }
        }
        return arrayList;
    }

    public static ArrayList h(ArrayList arrayList, List list) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MiniCourse miniCourse = (MiniCourse) it.next();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (i.b(((Goal) obj).getSource(), miniCourse.getDomain())) {
                    arrayList3.add(obj);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Goal goal = (Goal) it2.next();
                Set<String> keySet = goal.getData().keySet();
                i.f(keySet, "it.data.keys");
                boolean z11 = false;
                if (!keySet.isEmpty()) {
                    for (String str : keySet) {
                        if (f23437b.contains(str)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    Set<String> keySet2 = goal.getData().keySet();
                    i.f(keySet2, "goal.data.keys");
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : keySet2) {
                        if (i.b((String) obj2, "result_3")) {
                            arrayList4.add(obj2);
                        }
                    }
                    if (!arrayList4.isEmpty() && (!(!arrayList4.isEmpty()) || !i.b(goal.getGoalId(), "x76394F9od4GtQkHp3Tu"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        String domain = miniCourse.getDomain();
                        i.d(domain);
                        if (!arrayList2.contains(domain)) {
                            String domain2 = miniCourse.getDomain();
                            i.d(domain2);
                            arrayList2.add(domain2);
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    public static int i(String course) {
        i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return R.drawable.ic_happiness_live;
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return R.drawable.ic_depression_overcome;
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return R.drawable.ic_stress_tackle;
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return R.drawable.ic_anger_let_go;
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return R.drawable.ic_sleep_better;
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return R.drawable.ic_anxiety_beat;
                }
                break;
        }
        return -1;
    }

    public static String j(String course) {
        i.g(course, "course");
        switch (course.hashCode()) {
            case -2114782937:
                if (course.equals(Constants.COURSE_HAPPINESS)) {
                    return "HAPPINESS";
                }
                break;
            case -1617042330:
                if (course.equals(Constants.COURSE_DEPRESSION)) {
                    return "DEPRESSION";
                }
                break;
            case -891989580:
                if (course.equals(Constants.COURSE_STRESS)) {
                    return "STRESS";
                }
                break;
            case 92960775:
                if (course.equals(Constants.COURSE_ANGER)) {
                    return "ANGER";
                }
                break;
            case 109522647:
                if (course.equals(Constants.COURSE_SLEEP)) {
                    return "SLEEP";
                }
                break;
            case 113319009:
                if (course.equals(Constants.COURSE_WORRY)) {
                    return "ANXIETY";
                }
                break;
        }
        return "";
    }

    public static ArrayList k(String str, ArrayList arrayList, List list, boolean z10) {
        ArrayList<Goal> arrayList2;
        boolean z11;
        boolean z12;
        String str2;
        boolean z13;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Course course = (Course) it.next();
            if (z10) {
                arrayList2 = new ArrayList();
                for (Object obj : list) {
                    Goal goal = (Goal) obj;
                    String source = goal.getSource();
                    if (str == null) {
                        str2 = "daily_plan";
                    } else {
                        str2 = str;
                    }
                    if (i.b(source, str2) && i.b(goal.getCourseName(), course.getCourseName())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    Goal goal2 = (Goal) obj2;
                    if (goal2.getSource() == null && i.b(goal2.getCourseName(), course.getCourseName())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList2.add(obj2);
                    }
                }
            }
            for (Goal goal3 : arrayList2) {
                Set<String> keySet = goal3.getData().keySet();
                i.f(keySet, "it.data.keys");
                if (!keySet.isEmpty()) {
                    for (String str3 : keySet) {
                        if (f23437b.contains(str3)) {
                            z12 = true;
                            break;
                        }
                    }
                }
                z12 = false;
                if (z12 && !u.Z1(arrayList3, course.getCourseName())) {
                    String courseName = course.getCourseName();
                    i.d(courseName);
                    arrayList3.add(courseName);
                }
            }
        }
        return arrayList3;
    }

    public static ArrayList l(ArrayList arrayList, List list) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MiniCourse miniCourse = (MiniCourse) it.next();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
                if (firestoreGoal != null) {
                    str = firestoreGoal.getSource();
                } else {
                    str = null;
                }
                if (i.b(str, miniCourse.getDomain())) {
                    arrayList3.add(obj);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                FirestoreGoal firestoreGoal2 = (FirestoreGoal) it2.next();
                if (firestoreGoal2 != null && f23437b.contains(firestoreGoal2.getDataTypeKey()) && !i.b(firestoreGoal2.getDataTypeKey(), "result_3")) {
                    String domain = miniCourse.getDomain();
                    i.d(domain);
                    if (!arrayList2.contains(domain)) {
                        String domain2 = miniCourse.getDomain();
                        i.d(domain2);
                        arrayList2.add(domain2);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0064 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(String str, ArrayList arrayList, List list, boolean z10) {
        ArrayList<FirestoreGoal> arrayList2;
        String str2;
        boolean z11;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z12;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Course course = (Course) it.next();
            if (z10) {
                arrayList2 = new ArrayList();
                for (Object obj : list) {
                    FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
                    if (firestoreGoal != null) {
                        str5 = firestoreGoal.getSource();
                    } else {
                        str5 = null;
                    }
                    if (str == null) {
                        str6 = "daily_plan";
                    } else {
                        str6 = str;
                    }
                    if (i.b(str5, str6) && i.b(firestoreGoal.getCourseName(), course.getCourseName())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    FirestoreGoal firestoreGoal2 = (FirestoreGoal) obj2;
                    if (firestoreGoal2 != null) {
                        str2 = firestoreGoal2.getSource();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        if (firestoreGoal2 != null) {
                            str3 = firestoreGoal2.getCourseName();
                        } else {
                            str3 = null;
                        }
                        if (i.b(str3, course.getCourseName())) {
                            z11 = true;
                            if (!z11) {
                                arrayList2.add(obj2);
                            }
                        }
                    }
                    z11 = false;
                    if (!z11) {
                    }
                }
            }
            for (FirestoreGoal firestoreGoal3 : arrayList2) {
                if (firestoreGoal3 != null) {
                    str4 = firestoreGoal3.getDataTypeKey();
                } else {
                    str4 = null;
                }
                if (f23437b.contains(str4) && !u.Z1(arrayList3, course.getCourseName())) {
                    String courseName = course.getCourseName();
                    i.d(courseName);
                    arrayList3.add(courseName);
                }
            }
        }
        return arrayList3;
    }

    public static String n(String course) {
        i.g(course, "course");
        switch (course.hashCode()) {
            case -1838660172:
                if (course.equals("STRESS")) {
                    return Constants.COURSE_STRESS;
                }
                break;
            case -1131949978:
                if (course.equals("DEPRESSION")) {
                    return Constants.COURSE_DEPRESSION;
                }
                break;
            case -125215508:
                if (course.equals("ANXIETY")) {
                    return Constants.COURSE_WORRY;
                }
                break;
            case 62423015:
                if (course.equals("ANGER")) {
                    return Constants.COURSE_ANGER;
                }
                break;
            case 78984887:
                if (course.equals("SLEEP")) {
                    return Constants.COURSE_SLEEP;
                }
                break;
            case 671811847:
                if (course.equals("HAPPINESS")) {
                    return Constants.COURSE_HAPPINESS;
                }
                break;
        }
        return "";
    }

    public static String o(String str) {
        if (str == null) {
            return Constants.COURSE_DEPRESSION;
        }
        if (is.k.Q1(str, new String[]{Constants.COURSE_DEPRESSION, Constants.COURSE_ANGER, Constants.COURSE_HAPPINESS, Constants.COURSE_STRESS, Constants.COURSE_WORRY, Constants.COURSE_SLEEP})) {
            return str;
        }
        int hashCode = str.hashCode();
        if (hashCode != -80148009) {
            if (hashCode != 109840) {
                if (hashCode != 2989151 || !str.equals(Constants.COURSE_ADHD)) {
                    return Constants.COURSE_DEPRESSION;
                }
            } else if (!str.equals(Constants.COURSE_OCD)) {
                return Constants.COURSE_DEPRESSION;
            }
            return Constants.COURSE_WORRY;
        }
        str.equals(Constants.COURSE_GENERIC);
        return Constants.COURSE_DEPRESSION;
    }
}
