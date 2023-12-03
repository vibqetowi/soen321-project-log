package jn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.p;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GratitudeJournalAnswerModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.j0;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jn.a;
import kn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: ScreenLogListFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljn/e;", "Lrr/b;", "Ljn/a$a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b implements a.InterfaceC0336a {
    public static final /* synthetic */ int B = 0;

    /* renamed from: w  reason: collision with root package name */
    public jn.a f22512w;

    /* renamed from: y  reason: collision with root package name */
    public fm.a f22514y;

    /* renamed from: z  reason: collision with root package name */
    public List<FirestoreGoal> f22515z;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f22510u = LogHelper.INSTANCE.makeLogTag(e.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f22511v = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<hs.f<String, String>> f22513x = new ArrayList<>();

    /* compiled from: ScreenLogListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends FirestoreGoal>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(List<? extends FirestoreGoal> list) {
            List<? extends FirestoreGoal> it = list;
            i.f(it, "it");
            e eVar = e.this;
            eVar.getClass();
            eVar.f22515z = it;
            eVar.Y();
            eVar.b0(false);
            return hs.k.f19476a;
        }
    }

    public final void J(Goal goal, String str, String str2, boolean z10) {
        View inflate = getLayoutInflater().inflate(R.layout.row_log_list_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)), false);
        ((RobertoTextView) inflate.findViewById(R.id.logListRowTitle)).setText(str2);
        inflate.setOnClickListener(new zk.k(str, goal, z10, this, 4));
        ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).addView(inflate);
    }

    public final void K(Goal goal, String str) {
        User user = FirebasePersistence.getInstance().getUser();
        if (user.getStress() != null && (!user.getStress().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it = user.getStress().getPlanV3().iterator();
            while (it.hasNext()) {
                CourseDayModelV1 next = it.next();
                if (i.b(next.getContent_id(), goal.getGoalId())) {
                    String content_label = next.getContent_label();
                    i.d(content_label);
                    M(str, goal, content_label);
                    return;
                }
            }
        }
        if (user.getSleep() != null && (!user.getSleep().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it2 = user.getSleep().getPlanV3().iterator();
            while (it2.hasNext()) {
                CourseDayModelV1 next2 = it2.next();
                if (i.b(next2.getContent_id(), goal.getGoalId())) {
                    String content_label2 = next2.getContent_label();
                    i.d(content_label2);
                    M(str, goal, content_label2);
                    return;
                }
            }
        }
        if (user.getDepression() != null && (!user.getDepression().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it3 = user.getDepression().getPlanV3().iterator();
            while (it3.hasNext()) {
                CourseDayModelV1 next3 = it3.next();
                if (i.b(next3.getContent_id(), goal.getGoalId())) {
                    String content_label3 = next3.getContent_label();
                    i.d(content_label3);
                    M(str, goal, content_label3);
                    return;
                }
            }
        }
        if (user.getAnger() != null && (!user.getAnger().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it4 = user.getAnger().getPlanV3().iterator();
            while (it4.hasNext()) {
                CourseDayModelV1 next4 = it4.next();
                if (i.b(next4.getContent_id(), goal.getGoalId())) {
                    String content_label4 = next4.getContent_label();
                    i.d(content_label4);
                    M(str, goal, content_label4);
                    return;
                }
            }
        }
        if (user.getWorry() != null && (!user.getWorry().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it5 = user.getWorry().getPlanV3().iterator();
            while (it5.hasNext()) {
                CourseDayModelV1 next5 = it5.next();
                if (i.b(next5.getContent_id(), goal.getGoalId())) {
                    String content_label5 = next5.getContent_label();
                    i.d(content_label5);
                    M(str, goal, content_label5);
                    return;
                }
            }
        }
        if (user.getHappiness() != null && (!user.getHappiness().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it6 = user.getHappiness().getPlanV3().iterator();
            while (it6.hasNext()) {
                CourseDayModelV1 next6 = it6.next();
                if (i.b(next6.getContent_id(), goal.getGoalId())) {
                    String content_label6 = next6.getContent_label();
                    i.d(content_label6);
                    M(str, goal, content_label6);
                    return;
                }
            }
        }
    }

    public final void M(String str, Goal goal, String str2) {
        if (i.b(str, "result_3")) {
            if (i.b(goal.getGoalId(), "x76394F9od4GtQkHp3Tu")) {
                J(goal, str, str2, true);
            }
        } else if (i.b(str, "result_28")) {
            if (i.b(goal.getGoalId(), "mFx5Szq1qTtgsz2KLz8L")) {
                J(goal, str, str2, true);
            }
        } else {
            J(goal, str, str2, true);
        }
    }

    public final void O() {
        if (((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).getChildCount() > 0) {
            ((ConstraintLayout) _$_findCachedViewById(R.id.logListNullState)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.logListSubTitle)).setVisibility(0);
            return;
        }
        ((ConstraintLayout) _$_findCachedViewById(R.id.logListNullState)).setVisibility(0);
        ((RobertoTextView) _$_findCachedViewById(R.id.logListSubTitle)).setVisibility(8);
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        String str2;
        String dataTypeKey;
        String str3;
        String dataTypeKey2;
        String str4;
        String dataTypeKey3;
        String str5;
        String dataTypeKey4;
        String dataTypeKey5;
        String goalName;
        ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FirestoreGoal firestoreGoal = (FirestoreGoal) it.next();
            ArrayList<String> arrayList3 = this.f22511v;
            String str6 = null;
            if (firestoreGoal != null) {
                str = firestoreGoal.getDataTypeKey();
            } else {
                str = null;
            }
            if (u.Z1(arrayList3, str)) {
                ArrayList k10 = ca.a.k("result_1", "result_4", "result_6", "result_9", "result_10", "result_11", "result_14", "result_16", "result_21", "result_22", "result_30", "result_32");
                if (firestoreGoal != null) {
                    str2 = firestoreGoal.getDataTypeKey();
                } else {
                    str2 = null;
                }
                if (u.Z1(k10, str2)) {
                    Iterator it2 = arrayList2.iterator();
                    boolean z10 = false;
                    while (it2.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV1 : ((MiniCourse) it2.next()).getPlan()) {
                            String content_id = courseDayModelV1.getContent_id();
                            if (firestoreGoal != null) {
                                str3 = firestoreGoal.getGoalId();
                            } else {
                                str3 = null;
                            }
                            if (i.b(content_id, str3)) {
                                if (firestoreGoal != null && (dataTypeKey2 = firestoreGoal.getDataTypeKey()) != null) {
                                    String content_label = courseDayModelV1.getContent_label();
                                    i.d(content_label);
                                    S(firestoreGoal, dataTypeKey2, content_label, false);
                                }
                                z10 = true;
                            }
                        }
                    }
                    if (!z10 && firestoreGoal != null && (dataTypeKey = firestoreGoal.getDataTypeKey()) != null) {
                        U(firestoreGoal, dataTypeKey);
                    }
                } else {
                    if (firestoreGoal != null) {
                        str4 = firestoreGoal.getDataTypeKey();
                    } else {
                        str4 = null;
                    }
                    if (i.b(str4, "result_3")) {
                        Iterator it3 = arrayList2.iterator();
                        boolean z11 = false;
                        while (it3.hasNext()) {
                            for (CourseDayModelV1 courseDayModelV12 : ((MiniCourse) it3.next()).getPlan()) {
                                if (i.b(courseDayModelV12.getContent_id(), firestoreGoal.getGoalId()) && i.b(courseDayModelV12.getContent_id(), "x76394F9od4GtQkHp3Tu")) {
                                    String dataTypeKey6 = firestoreGoal.getDataTypeKey();
                                    if (dataTypeKey6 != null) {
                                        String content_label2 = courseDayModelV12.getContent_label();
                                        i.d(content_label2);
                                        S(firestoreGoal, dataTypeKey6, content_label2, false);
                                    }
                                    z11 = true;
                                }
                            }
                        }
                        if (!z11 && (dataTypeKey3 = firestoreGoal.getDataTypeKey()) != null) {
                            U(firestoreGoal, dataTypeKey3);
                        }
                    } else {
                        if (firestoreGoal != null) {
                            str5 = firestoreGoal.getDataTypeKey();
                        } else {
                            str5 = null;
                        }
                        if (i.b(str5, "result_28")) {
                            Iterator it4 = arrayList2.iterator();
                            boolean z12 = false;
                            while (it4.hasNext()) {
                                for (CourseDayModelV1 courseDayModelV13 : ((MiniCourse) it4.next()).getPlan()) {
                                    if (i.b(courseDayModelV13.getContent_id(), firestoreGoal.getGoalId()) && i.b(courseDayModelV13.getContent_id(), "mFx5Szq1qTtgsz2KLz8L")) {
                                        String dataTypeKey7 = firestoreGoal.getDataTypeKey();
                                        if (dataTypeKey7 != null) {
                                            String content_label3 = courseDayModelV13.getContent_label();
                                            i.d(content_label3);
                                            S(firestoreGoal, dataTypeKey7, content_label3, false);
                                        }
                                        z12 = true;
                                    }
                                }
                            }
                            if (!z12 && (dataTypeKey4 = firestoreGoal.getDataTypeKey()) != null) {
                                U(firestoreGoal, dataTypeKey4);
                            }
                        } else {
                            if (firestoreGoal != null) {
                                str6 = firestoreGoal.getGoalName();
                            }
                            if (str6 != null) {
                                int hashCode = str6.hashCode();
                                if (hashCode != -1294987106) {
                                    if (hashCode != -728315683) {
                                        if (hashCode == 692978500 && str6.equals("Use the worry time technique")) {
                                            String dataTypeKey8 = firestoreGoal.getDataTypeKey();
                                            if (dataTypeKey8 != null) {
                                                String string = getString(R.string.logActivityTitleWorryTime);
                                                i.f(string, "getString(R.string.logActivityTitleWorryTime)");
                                                S(firestoreGoal, dataTypeKey8, string, false);
                                            }
                                        }
                                    } else if (str6.equals("Stages of Problem Solving")) {
                                        String dataTypeKey9 = firestoreGoal.getDataTypeKey();
                                        if (dataTypeKey9 != null) {
                                            String string2 = getString(R.string.logActivityTitleProblemSolvingFormula);
                                            i.f(string2, "getString(R.string.logAc…tleProblemSolvingFormula)");
                                            S(firestoreGoal, dataTypeKey9, string2, false);
                                        }
                                    }
                                } else if (str6.equals("Write down 3 good things")) {
                                    String dataTypeKey10 = firestoreGoal.getDataTypeKey();
                                    if (dataTypeKey10 != null) {
                                        String string3 = getString(R.string.logActivityTitle3GoodThings);
                                        i.f(string3, "getString(R.string.logActivityTitle3GoodThings)");
                                        S(firestoreGoal, dataTypeKey10, string3, false);
                                    }
                                }
                            }
                            if (firestoreGoal != null && (dataTypeKey5 = firestoreGoal.getDataTypeKey()) != null && (goalName = firestoreGoal.getGoalName()) != null) {
                                S(firestoreGoal, dataTypeKey5, goalName, false);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Goal goal = (Goal) it.next();
            Set<String> keySet = goal.getData().keySet();
            i.f(keySet, "goal.data.keys");
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : keySet) {
                if (this.f22511v.contains((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            List I2 = u.I2(arrayList3);
            int size = I2.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (ca.a.k("result_1", "result_4", "result_6", "result_9", "result_10", "result_11", "result_14", "result_16", "result_21", "result_22", "result_30", "result_32").contains(I2.get(i6))) {
                    Iterator it2 = arrayList2.iterator();
                    boolean z10 = false;
                    while (it2.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV1 : ((MiniCourse) it2.next()).getPlan()) {
                            if (i.b(courseDayModelV1.getContent_id(), goal.getGoalId())) {
                                Object obj2 = I2.get(i6);
                                i.f(obj2, "filteredList[pos]");
                                String content_label = courseDayModelV1.getContent_label();
                                i.d(content_label);
                                J(goal, (String) obj2, content_label, false);
                                z10 = true;
                            }
                        }
                    }
                    if (!z10) {
                        Object obj3 = I2.get(i6);
                        i.f(obj3, "filteredList[pos]");
                        K(goal, (String) obj3);
                    }
                } else if (i.b(I2.get(i6), "result_3")) {
                    Iterator it3 = arrayList2.iterator();
                    boolean z11 = false;
                    while (it3.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV12 : ((MiniCourse) it3.next()).getPlan()) {
                            if (i.b(courseDayModelV12.getContent_id(), goal.getGoalId()) && i.b(courseDayModelV12.getContent_id(), "x76394F9od4GtQkHp3Tu")) {
                                Object obj4 = I2.get(i6);
                                i.f(obj4, "filteredList[pos]");
                                String content_label2 = courseDayModelV12.getContent_label();
                                i.d(content_label2);
                                J(goal, (String) obj4, content_label2, false);
                                z11 = true;
                            }
                        }
                    }
                    if (!z11) {
                        Object obj5 = I2.get(i6);
                        i.f(obj5, "filteredList[pos]");
                        K(goal, (String) obj5);
                    }
                } else if (i.b(I2.get(i6), "result_28")) {
                    Iterator it4 = arrayList2.iterator();
                    boolean z12 = false;
                    while (it4.hasNext()) {
                        for (CourseDayModelV1 courseDayModelV13 : ((MiniCourse) it4.next()).getPlan()) {
                            if (i.b(courseDayModelV13.getContent_id(), goal.getGoalId()) && i.b(courseDayModelV13.getContent_id(), "mFx5Szq1qTtgsz2KLz8L")) {
                                Object obj6 = I2.get(i6);
                                i.f(obj6, "filteredList[pos]");
                                String content_label3 = courseDayModelV13.getContent_label();
                                i.d(content_label3);
                                J(goal, (String) obj6, content_label3, false);
                                z12 = true;
                            }
                        }
                    }
                    if (!z12) {
                        Object obj7 = I2.get(i6);
                        i.f(obj7, "filteredList[pos]");
                        K(goal, (String) obj7);
                    }
                } else {
                    String goalName = goal.getGoalName();
                    if (goalName != null) {
                        int hashCode = goalName.hashCode();
                        if (hashCode != -1294987106) {
                            if (hashCode != -728315683) {
                                if (hashCode == 692978500 && goalName.equals("Use the worry time technique")) {
                                    Object obj8 = I2.get(i6);
                                    i.f(obj8, "filteredList[pos]");
                                    String string = getString(R.string.logActivityTitleWorryTime);
                                    i.f(string, "getString(R.string.logActivityTitleWorryTime)");
                                    J(goal, (String) obj8, string, false);
                                }
                            } else if (goalName.equals("Stages of Problem Solving")) {
                                Object obj9 = I2.get(i6);
                                i.f(obj9, "filteredList[pos]");
                                String string2 = getString(R.string.logActivityTitleProblemSolvingFormula);
                                i.f(string2, "getString(R.string.logAc…tleProblemSolvingFormula)");
                                J(goal, (String) obj9, string2, false);
                            }
                        } else if (goalName.equals("Write down 3 good things")) {
                            Object obj10 = I2.get(i6);
                            i.f(obj10, "filteredList[pos]");
                            String string3 = getString(R.string.logActivityTitle3GoodThings);
                            i.f(string3, "getString(R.string.logActivityTitle3GoodThings)");
                            J(goal, (String) obj10, string3, false);
                        }
                    }
                    Object obj11 = I2.get(i6);
                    i.f(obj11, "filteredList[pos]");
                    String goalName2 = goal.getGoalName();
                    i.d(goalName2);
                    J(goal, (String) obj11, goalName2, false);
                }
            }
        }
    }

    public final void S(FirestoreGoal firestoreGoal, String str, String str2, boolean z10) {
        View inflate = getLayoutInflater().inflate(R.layout.row_log_list_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)), false);
        ((RobertoTextView) inflate.findViewById(R.id.logListRowTitle)).setText(str2);
        inflate.setOnClickListener(new zk.k(str, firestoreGoal, z10, this, 5));
        ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).addView(inflate);
    }

    public final void U(FirestoreGoal firestoreGoal, String str) {
        User user = FirebasePersistence.getInstance().getUser();
        if (user.getStress() != null && (!user.getStress().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it = user.getStress().getPlanV3().iterator();
            while (it.hasNext()) {
                CourseDayModelV1 next = it.next();
                if (i.b(next.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label = next.getContent_label();
                    i.d(content_label);
                    X(str, firestoreGoal, content_label);
                    return;
                }
            }
        }
        if (user.getSleep() != null && (!user.getSleep().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it2 = user.getSleep().getPlanV3().iterator();
            while (it2.hasNext()) {
                CourseDayModelV1 next2 = it2.next();
                if (i.b(next2.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label2 = next2.getContent_label();
                    i.d(content_label2);
                    X(str, firestoreGoal, content_label2);
                    return;
                }
            }
        }
        if (user.getDepression() != null && (!user.getDepression().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it3 = user.getDepression().getPlanV3().iterator();
            while (it3.hasNext()) {
                CourseDayModelV1 next3 = it3.next();
                if (i.b(next3.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label3 = next3.getContent_label();
                    i.d(content_label3);
                    X(str, firestoreGoal, content_label3);
                    return;
                }
            }
        }
        if (user.getAnger() != null && (!user.getAnger().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it4 = user.getAnger().getPlanV3().iterator();
            while (it4.hasNext()) {
                CourseDayModelV1 next4 = it4.next();
                if (i.b(next4.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label4 = next4.getContent_label();
                    i.d(content_label4);
                    X(str, firestoreGoal, content_label4);
                    return;
                }
            }
        }
        if (user.getWorry() != null && (!user.getWorry().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it5 = user.getWorry().getPlanV3().iterator();
            while (it5.hasNext()) {
                CourseDayModelV1 next5 = it5.next();
                if (i.b(next5.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label5 = next5.getContent_label();
                    i.d(content_label5);
                    X(str, firestoreGoal, content_label5);
                    return;
                }
            }
        }
        if (user.getHappiness() != null && (!user.getHappiness().getPlanV3().isEmpty())) {
            Iterator<CourseDayModelV1> it6 = user.getHappiness().getPlanV3().iterator();
            while (it6.hasNext()) {
                CourseDayModelV1 next6 = it6.next();
                if (i.b(next6.getContent_id(), firestoreGoal.getGoalId())) {
                    String content_label6 = next6.getContent_label();
                    i.d(content_label6);
                    X(str, firestoreGoal, content_label6);
                    return;
                }
            }
        }
    }

    public final void X(String str, FirestoreGoal firestoreGoal, String str2) {
        if (i.b(str, "result_3")) {
            if (i.b(firestoreGoal.getGoalId(), "x76394F9od4GtQkHp3Tu")) {
                S(firestoreGoal, str, str2, true);
            }
        } else if (i.b(str, "result_28")) {
            if (i.b(firestoreGoal.getGoalId(), "mFx5Szq1qTtgsz2KLz8L")) {
                S(firestoreGoal, str, str2, true);
            }
        } else {
            S(firestoreGoal, str, str2, true);
        }
    }

    public final void Y() {
        String str;
        boolean z10;
        ArrayList<GratitudeJournalAnswerModel> answers;
        String str2;
        boolean z11;
        HashMap<String, Course> hashMap;
        ArrayList<String> m10;
        Set<String> keySet;
        try {
            ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
            if (ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                ArrayList<hs.f<String, String>> arrayList = this.f22513x;
                arrayList.clear();
                ArrayList arrayList2 = new ArrayList();
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    hashMap = user.getCourseMap();
                } else {
                    hashMap = null;
                }
                if (hashMap != null && (keySet = hashMap.keySet()) != null) {
                    for (String str3 : keySet) {
                        Course course = hashMap.get(str3);
                        if (course != null) {
                            arrayList2.add(course);
                        }
                    }
                }
                if (sp.b.K()) {
                    ArrayList<LogModel> arrayList3 = kn.a.f23436a;
                    ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
                    i.f(userGoals, "getInstance().user.userGoals");
                    m10 = kn.a.k(null, arrayList2, userGoals, false);
                } else {
                    ArrayList<LogModel> arrayList4 = kn.a.f23436a;
                    List<FirestoreGoal> list = this.f22515z;
                    if (list != null) {
                        m10 = kn.a.m(null, arrayList2, list, false);
                    } else {
                        i.q("goals");
                        throw null;
                    }
                }
                for (String str4 : m10) {
                    arrayList.add(new hs.f<>(str4, Constants.getCourseDisplayName(str4)));
                }
                if (!m10.contains(FirebasePersistence.getInstance().getUser().getCurrentCourseName())) {
                    arrayList.add(new hs.f<>(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.getCourseDisplayName(FirebasePersistence.getInstance().getUser().getCurrentCourseName())));
                }
                if (arrayList.size() > 1) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_drop_down, 0);
                    jn.a aVar = new jn.a(arrayList, this);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("logType", a.EnumC0358a.MAIN_PLAN_LOGS);
                    aVar.setArguments(bundle);
                    this.f22512w = aVar;
                    ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setOnClickListener(new d(this, 1));
                }
                if (sp.b.K()) {
                    String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    i.f(currentCourseName, "getInstance().user.currentCourseName");
                    Z(currentCourseName);
                } else {
                    String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    i.f(currentCourseName2, "getInstance().user.currentCourseName");
                    a0(currentCourseName2);
                }
            } else {
                if (sp.b.K()) {
                    List<FirestoreGoal> list2 = this.f22515z;
                    if (list2 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj : list2) {
                            FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
                            if (firestoreGoal != null) {
                                str2 = firestoreGoal.getSource();
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                arrayList5.add(obj);
                            }
                        }
                        i.f(miniCourses, "miniCourses");
                        P(arrayList5, miniCourses);
                    } else {
                        i.q("goals");
                        throw null;
                    }
                } else {
                    List<Goal> userGoals2 = FirebasePersistence.getInstance().getUserGoals();
                    i.f(userGoals2, "getInstance().userGoals");
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : userGoals2) {
                        Goal goal = (Goal) obj2;
                        if (goal != null) {
                            str = goal.getSource();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList6.add(obj2);
                        }
                    }
                    i.f(miniCourses, "miniCourses");
                    Q(arrayList6, miniCourses);
                }
                if (FirebasePersistence.getInstance().getUser().getHappiness() != null && FirebasePersistence.getInstance().getUser().getHappiness().getAnswers() != null) {
                    i.f(FirebasePersistence.getInstance().getUser().getHappiness().getAnswers(), "getInstance().user.happiness.answers");
                    if (!answers.isEmpty()) {
                        p activity = getActivity();
                        i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                        ((ScreenLogsActivity) activity).B = FirebasePersistence.getInstance().getUser().getHappiness().getAnswers();
                        View inflate = getLayoutInflater().inflate(R.layout.row_log_list_item, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)), false);
                        ((RobertoTextView) inflate.findViewById(R.id.logListRowTitle)).setText(getString(R.string.logActivityTitleGratitudeJournal));
                        inflate.setOnClickListener(new d(this, 2));
                        ((LinearLayout) _$_findCachedViewById(R.id.goalsLinearLayout)).addView(inflate);
                    }
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.logListEmptyText)).setText(getString(R.string.logsListScreenUnifiedEmptyText));
            O();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22510u, e10);
        }
    }

    public final void Z(String str) {
        String str2;
        boolean z10;
        ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setText(Constants.getCourseDisplayName(str));
        List<FirestoreGoal> list = this.f22515z;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) obj;
                if (firestoreGoal != null) {
                    str2 = firestoreGoal.getCourseName();
                } else {
                    str2 = null;
                }
                if (i.b(str2, str) && firestoreGoal.getSource() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
            i.f(miniCourses, "getInstance().user.miniCourses");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : miniCourses) {
                if (i.b(((MiniCourse) obj2).getCourse(), str)) {
                    arrayList2.add(obj2);
                }
            }
            P(arrayList, arrayList2);
            O();
            return;
        }
        i.q("goals");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void a0(String str) {
        boolean z10;
        ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setText(Constants.getCourseDisplayName(str));
        ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
        i.f(userGoals, "getInstance().user.userGoals");
        ArrayList arrayList = new ArrayList();
        for (Object obj : userGoals) {
            Goal goal = (Goal) obj;
            if (i.b(goal.getCourseName(), str) && goal.getSource() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
        i.f(miniCourses, "getInstance().user.miniCourses");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : miniCourses) {
            if (i.b(((MiniCourse) obj2).getCourse(), str)) {
                arrayList2.add(obj2);
            }
        }
        Q(arrayList, arrayList2);
        O();
    }

    public final void b0(boolean z10) {
        if (isAdded()) {
            if (z10) {
                ((ProgressBar) _$_findCachedViewById(R.id.logsProgressBar)).setVisibility(0);
                ((ScrollView) _$_findCachedViewById(R.id.goalsLogListParent)).setVisibility(8);
                return;
            }
            ((ProgressBar) _$_findCachedViewById(R.id.logsProgressBar)).setVisibility(8);
            ((ScrollView) _$_findCachedViewById(R.id.goalsLogListParent)).setVisibility(0);
        }
    }

    @Override // jn.a.InterfaceC0336a
    public final void d(String domainSlug) {
        i.g(domainSlug, "domainSlug");
        jn.a aVar = this.f22512w;
        if (aVar != null) {
            if (aVar != null) {
                aVar.dismiss();
            } else {
                i.q("domainBottomSheet");
                throw null;
            }
        }
        if (sp.b.K()) {
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            i.f(currentCourseName, "getInstance().user.currentCourseName");
            Z(currentCourseName);
            return;
        }
        String currentCourseName2 = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        i.f(currentCourseName2, "getInstance().user.currentCourseName");
        a0(currentCourseName2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (sp.b.K()) {
            p requireActivity = requireActivity();
            i.f(requireActivity, "requireActivity()");
            fm.a aVar = (fm.a) new o0(requireActivity, new kk.c(MyApplication.V.a(), new j0())).a(fm.a.class);
            this.f22514y = aVar;
            if (aVar != null) {
                aVar.k();
            } else {
                i.q("fireStoreGoalsViewModel");
                throw null;
            }
        }
        this.f22511v.addAll(Constants.getResultLogSlugs());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_log_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            p activity = getActivity();
            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.logListTitle)).setText(((ScreenLogsActivity) activity).A);
            ((AppCompatImageView) _$_findCachedViewById(R.id.btnBackLogList)).setOnClickListener(new d(this, 0));
            if (sp.b.K()) {
                b0(true);
                fm.a aVar = this.f22514y;
                if (aVar != null) {
                    aVar.R.e(getViewLifecycleOwner(), new gn.l(10, new a()));
                    return;
                } else {
                    i.q("fireStoreGoalsViewModel");
                    throw null;
                }
            }
            Y();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f22510u, e10);
        }
    }
}
