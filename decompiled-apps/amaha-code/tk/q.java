package tk;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N19ScreenFragment;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.model.ScreenResult18Model;
import com.theinnerhour.b2b.model.ScreenResult1Model;
import com.theinnerhour.b2b.model.ScreenResult23Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.OfflineClinicDetail;
import com.theinnerhour.b2b.network.model.OfflineClinicLocationDetail;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.d1;
import g0.a;
import hr.a3;
import hr.ba;
import hr.ca;
import hr.f9;
import hr.g1;
import hr.j4;
import hr.k0;
import hr.k4;
import hr.l0;
import hr.q5;
import hr.r4;
import hr.v3;
import hr.y0;
import hr.y2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import nn.r1;
import nn.s1;
import nn.t1;
import r1.b0;
import t0.j0;
import zm.m;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33206u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f33207v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f33208w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f33209x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f33210y;

    public /* synthetic */ q(f9 f9Var, String str, ConstraintLayout constraintLayout, Dialog dialog) {
        this.f33206u = 22;
        this.f33208w = f9Var;
        this.f33209x = str;
        this.f33207v = constraintLayout;
        this.f33210y = dialog;
    }

    private final void a() {
        Goal goal;
        fq.m this$0 = (fq.m) this.f33207v;
        kotlin.jvm.internal.x list = (kotlin.jvm.internal.x) this.f33209x;
        kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) this.f33208w;
        T8Activity act = (T8Activity) this.f33210y;
        int i6 = fq.m.f15758w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(list, "$list");
        kotlin.jvm.internal.i.g(setGoal, "$setGoal");
        kotlin.jvm.internal.i.g(act, "$act");
        try {
            Iterator<Goal> it = FirebasePersistence.getInstance().getUserGoals().iterator();
            while (true) {
                if (it.hasNext()) {
                    goal = it.next();
                    if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS, goal.getGoalId()) && kotlin.jvm.internal.i.b(Constants.COURSE_DEPRESSION, goal.getCourseName())) {
                        break;
                    }
                } else {
                    goal = null;
                    break;
                }
            }
            ScreenResult1Model screenResult1Model = new ScreenResult1Model(Utils.INSTANCE.getTimeInSeconds());
            screenResult1Model.setTitle(((RobertoTextView) this$0._$_findCachedViewById(R.id.textView9)).getText().toString());
            screenResult1Model.setList((ArrayList) list.f23469u);
            if (goal != null && setGoal.f23466u) {
                goal.setSource("daily_plan");
                Date time = Calendar.getInstance().getTime();
                kotlin.jvm.internal.i.f(time, "getInstance().time");
                goal.setmLastAdded(time);
                if (kotlin.jvm.internal.i.b(act.C, "s9")) {
                    goal.getData().put("result_static_three_good_things", screenResult1Model);
                } else if (act.D) {
                    if (goal.getData().containsKey("result_static_three_good_things")) {
                        Object obj = goal.getData().get("result_static_three_good_things");
                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                        ArrayList arrayList = (ArrayList) obj;
                        arrayList.remove(arrayList.size() - 1);
                        arrayList.add(screenResult1Model);
                        goal.getData().put("result_static_three_good_things", arrayList);
                    } else {
                        goal.getData().put("result_static_three_good_things", new ArrayList());
                        Object obj2 = goal.getData().get("result_static_three_good_things");
                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                        ((ArrayList) obj2).add(screenResult1Model);
                    }
                } else {
                    act.D = true;
                    if (!goal.getData().containsKey("result_static_three_good_things")) {
                        goal.getData().put("result_static_three_good_things", new ArrayList());
                    }
                    Object obj3 = goal.getData().get("result_static_three_good_things");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                    ((ArrayList) obj3).add(screenResult1Model);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
            } else {
                Goal goal2 = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS);
                goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_THREE_GOOD_THINGS).getType());
                goal2.setVisible(true);
                goal2.setNotificationScheduled(false);
                goal2.setSource("daily_plan");
                goal2.getData().put("result_static_three_good_things", new ArrayList());
                Object obj4 = goal2.getData().get("result_static_three_good_things");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                ((ArrayList) obj4).add(screenResult1Model);
                FirebasePersistence.getInstance().getUserGoals().add(goal2);
            }
            act.t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f15759u, "exception", e10);
        }
    }

    private final void b() {
        String str;
        TemplateActivity act = (TemplateActivity) this.f33208w;
        k0 this$0 = (k0) this.f33207v;
        String resultKey = (String) this.f33209x;
        ScreenResult14Model model = (ScreenResult14Model) this.f33210y;
        int i6 = k0.B;
        kotlin.jvm.internal.i.g(act, "$act");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        kotlin.jvm.internal.i.g(model, "$model");
        try {
            TemplateModel templateModel = act.f10547y;
            if (templateModel != null) {
                str = templateModel.getLabel();
            } else {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                act.K0(true);
                fm.a aVar = (fm.a) this$0.f18655v.getValue();
                aVar.f15178l0.e(this$0.getViewLifecycleOwner(), new pp.b(27, new k0.a(act, resultKey, aVar, str2, model, this$0)));
                aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new pp.b(28, new k0.b(act)));
                aVar.f15177k0.e(this$0.getViewLifecycleOwner(), new pp.b(29, new k0.c(act)));
                aVar.m(str2, resultKey);
                return;
            }
            androidx.fragment.app.p activity = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity).t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18654u, "Exception in set on click listener", e10);
        }
    }

    private final void c() {
        Goal goal = (Goal) this.f33208w;
        kotlin.jvm.internal.x list = (kotlin.jvm.internal.x) this.f33207v;
        String resultKey = (String) this.f33209x;
        y0 this$0 = (y0) this.f33210y;
        int i6 = y0.f19404w;
        kotlin.jvm.internal.i.g(list, "$list");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (goal != null) {
            try {
                long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                Object obj = ((ArrayList) list.f23469u).get(0);
                kotlin.jvm.internal.i.f(obj, "list[0]");
                String str = (String) obj;
                Object obj2 = ((ArrayList) list.f23469u).get(1);
                kotlin.jvm.internal.i.f(obj2, "list[1]");
                String str2 = (String) obj2;
                Object obj3 = ((ArrayList) list.f23469u).get(2);
                kotlin.jvm.internal.i.f(obj3, "list[2]");
                Object obj4 = ((ArrayList) list.f23469u).get(3);
                kotlin.jvm.internal.i.f(obj4, "list[3]");
                ScreenResult18Model screenResult18Model = new ScreenResult18Model(timeInSeconds, str, str2, (String) obj3, (String) obj4);
                if (!goal.getData().containsKey(resultKey)) {
                    goal.getData().put(resultKey, new ArrayList());
                }
                Object obj5 = goal.getData().get(resultKey);
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult18Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult18Model> }");
                ((ArrayList) obj5).add(screenResult18Model);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this$0.f19405u, "exception in on click listener", e10);
                return;
            }
        }
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        ((rr.a) activity).t0();
    }

    private final void d() {
        g1 this$0 = (g1) this.f33207v;
        kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) this.f33208w;
        kotlin.jvm.internal.x model = (kotlin.jvm.internal.x) this.f33209x;
        String resultKey = (String) this.f33210y;
        int i6 = g1.f18430x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(setGoal, "$setGoal");
        kotlin.jvm.internal.i.g(model, "$model");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        try {
            TemplateActivity templateActivity = this$0.f18432v;
            if (templateActivity != null) {
                Goal y02 = templateActivity.y0();
                if (y02 != null && setGoal.f23466u) {
                    ((ScreenResult1Model) model.f23469u).setTitle(((RobertoTextView) this$0._$_findCachedViewById(R.id.textView9)).getText().toString());
                    TemplateActivity templateActivity2 = this$0.f18432v;
                    if (templateActivity2 != null) {
                        if (templateActivity2.K) {
                            if (y02.getData().containsKey(resultKey)) {
                                Object obj = y02.getData().get(resultKey);
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                                ArrayList arrayList = (ArrayList) obj;
                                arrayList.remove(arrayList.size() - 1);
                                arrayList.add(model.f23469u);
                                y02.getData().put(resultKey, arrayList);
                            } else {
                                y02.getData().put(resultKey, new ArrayList());
                                Object obj2 = y02.getData().get(resultKey);
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                                ((ArrayList) obj2).add(model.f23469u);
                            }
                        } else {
                            templateActivity2.K = true;
                            if (!y02.getData().containsKey(resultKey)) {
                                y02.getData().put(resultKey, new ArrayList());
                            }
                            Object obj3 = y02.getData().get(resultKey);
                            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult1Model> }");
                            ((ArrayList) obj3).add(model.f23469u);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity3 = this$0.f18432v;
                    if (templateActivity3 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity3.getIntent().getStringExtra("source"), "goals")) {
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity2).n0();
                            return;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                TemplateActivity templateActivity4 = this$0.f18432v;
                if (templateActivity4 != null) {
                    templateActivity4.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18431u, "exception", e10);
        }
    }

    private final void e() {
        v3 this$0 = (v3) this.f33207v;
        kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) this.f33208w;
        String resultKey = (String) this.f33209x;
        kotlin.jvm.internal.x model = (kotlin.jvm.internal.x) this.f33210y;
        int i6 = v3.f19285w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(setGoal, "$setGoal");
        kotlin.jvm.internal.i.g(resultKey, "$resultKey");
        kotlin.jvm.internal.i.g(model, "$model");
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        Goal y02 = ((TemplateActivity) activity).y0();
        if (y02 != null && setGoal.f23466u) {
            y02.getData().put(resultKey, model.f23469u);
            FirebasePersistence.getInstance().updateUserOnFirebase();
        }
        androidx.fragment.app.p activity2 = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        ((rr.a) activity2).t0();
    }

    private final void f() {
        FrameLayout noneOfThese = (FrameLayout) this.f33208w;
        k4 this$0 = (k4) this.f33207v;
        kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) this.f33209x;
        ArrayList list = (ArrayList) this.f33210y;
        int i6 = k4.f18677x;
        kotlin.jvm.internal.i.g(noneOfThese, "$noneOfThese");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
        kotlin.jvm.internal.i.g(list, "$list");
        try {
            Object tag = noneOfThese.getTag();
            kotlin.jvm.internal.i.e(tag, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) tag).booleanValue()) {
                noneOfThese.setTag(Boolean.FALSE);
                this$0.O(noneOfThese);
                return;
            }
            noneOfThese.setTag(Boolean.TRUE);
            this$0.J(noneOfThese);
            Iterator it = ((HashSet) selectedOptions.f23469u).iterator();
            while (it.hasNext()) {
                this$0.M(list.indexOf((String) it.next()));
            }
            ((HashSet) selectedOptions.f23469u).clear();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18678u, "exception", e10);
        }
    }

    private final void g() {
        kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) this.f33208w;
        HashMap params = (HashMap) this.f33207v;
        r4 this$0 = (r4) this.f33209x;
        TemplateActivity act = (TemplateActivity) this.f33210y;
        int i6 = r4.f19081w;
        kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
        kotlin.jvm.internal.i.g(params, "$params");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(act, "$act");
        try {
            if (((HashSet) selectedOptions.f23469u).size() == 0) {
                if (params.containsKey("s113_error_1") && (!gv.n.B0(UtilFunKt.paramsMapToString(params.get("s113_error_1"))))) {
                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), UtilFunKt.paramsMapToString(params.get("s113_error_1")));
                } else {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity = this$0.getActivity();
                    String string = this$0.getString(R.string.select_any_2);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.select_any_2)");
                    utils.showCustomToast(activity, string);
                }
            } else if (((HashSet) selectedOptions.f23469u).size() > 2) {
                if (params.containsKey("s113_error_2") && (!gv.n.B0(UtilFunKt.paramsMapToString(params.get("s113_error_2"))))) {
                    Utils utils2 = Utils.INSTANCE;
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    utils2.showCustomToast(activity2, UtilFunKt.paramsMapToString(params.get("s113_error_2")));
                } else {
                    Utils utils3 = Utils.INSTANCE;
                    androidx.fragment.app.p activity3 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity3);
                    String string2 = this$0.getString(R.string.max_2_options_to_select);
                    kotlin.jvm.internal.i.f(string2, "getString(R.string.max_2_options_to_select)");
                    utils3.showCustomToast(activity3, string2);
                }
            } else {
                ArrayList arrayList = new ArrayList((Collection) selectedOptions.f23469u);
                androidx.fragment.app.p activity4 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity4).F.put("list", arrayList);
                androidx.fragment.app.p activity5 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity5).t0();
            }
            act.F.put("s113_user_list", selectedOptions.f23469u);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f19082u, "exception", e10);
        }
    }

    private final void h() {
        rr.b y2Var;
        String slug = (String) this.f33208w;
        TemplateActivity act = (TemplateActivity) this.f33207v;
        kotlin.jvm.internal.x list = (kotlin.jvm.internal.x) this.f33209x;
        q5 this$0 = (q5) this.f33210y;
        int i6 = q5.f19017w;
        kotlin.jvm.internal.i.g(slug, "$slug");
        kotlin.jvm.internal.i.g(act, "$act");
        kotlin.jvm.internal.i.g(list, "$list");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (kotlin.jvm.internal.i.b(slug, "s142")) {
            act.F.put("list", list.f23469u);
        }
        if (kotlin.jvm.internal.i.b(slug, "s143-c")) {
            act.t0();
            return;
        }
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).W) {
            y2Var = new a3();
        } else {
            y2Var = new y2();
        }
        act.s0(y2Var);
    }

    private final void i() {
        f9 this$0 = (f9) this.f33208w;
        String prevText = (String) this.f33209x;
        View row = (View) this.f33207v;
        Dialog dialog = (Dialog) this.f33210y;
        int i6 = f9.C;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(prevText, "$prevText");
        kotlin.jvm.internal.i.g(row, "$row");
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        if (this$0.isAdded()) {
            this$0.f18398v.remove(prevText);
            ((LinearLayout) this$0._$_findCachedViewById(R.id.llS84List)).removeView(row);
            if (this$0.P().Q) {
                ScreenResult23Model screenResult23Model = null;
                for (ScreenResult23Model screenResult23Model2 : this$0.f18401y) {
                    if (kotlin.jvm.internal.i.b(screenResult23Model2.getTask(), prevText)) {
                        screenResult23Model = screenResult23Model2;
                    }
                }
                if (screenResult23Model != null) {
                    this$0.f18401y.remove(screenResult23Model);
                }
            }
            dialog.dismiss();
        }
    }

    private final void j() {
        boolean z10;
        String string;
        ba this$0 = (ba) this.f33208w;
        String slug = (String) this.f33207v;
        HashMap params = (HashMap) this.f33209x;
        TemplateActivity act = (TemplateActivity) this.f33210y;
        int i6 = ba.f18212w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(slug, "$slug");
        kotlin.jvm.internal.i.g(params, "$params");
        kotlin.jvm.internal.i.g(act, "$act");
        Editable text = ((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).getText();
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Utils utils = Utils.INSTANCE;
            androidx.fragment.app.p activity = this$0.getActivity();
            kotlin.jvm.internal.i.d(activity);
            if (kotlin.jvm.internal.i.b(slug, "s96")) {
                string = UtilFunKt.paramsMapToString(params.get("s96_error"));
            } else {
                string = this$0.getString(R.string.enter_age);
                kotlin.jvm.internal.i.f(string, "getString(R.string.enter_age)");
            }
            utils.showCustomToast(activity, string);
            return;
        }
        HashMap<String, Object> hashMap = act.F;
        hashMap.put("s96_user_data", String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).getText()));
        int hashCode = slug.hashCode();
        if (hashCode != 112336) {
            if (hashCode != 3482390) {
                if (hashCode != 107952545 || !slug.equals("s92-b")) {
                    return;
                }
            } else if (!slug.equals("s92b")) {
                return;
            }
            hashMap.put("age", String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).getText()));
            act.s0(new j4());
        } else if (slug.equals("s96")) {
            hashMap.put("sleep_duration", String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editText)).getText()));
            act.s0(new ca());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v78, types: [T, java.lang.Boolean, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6;
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        OfflineClinicLocationDetail locationDetail;
        String str6;
        String str7;
        String str8;
        hs.k kVar;
        String content_id;
        boolean z10;
        String str9;
        String str10;
        String str11;
        hs.k kVar2;
        String content_id2;
        boolean z11;
        String str12;
        String str13;
        String str14;
        int i11 = this.f33206u;
        Object obj = this.f33210y;
        Object obj2 = this.f33209x;
        Object obj3 = this.f33207v;
        Object obj4 = this.f33208w;
        switch (i11) {
            case 0:
                String str15 = null;
                kotlin.jvm.internal.u isAnonymousSelected = (kotlin.jvm.internal.u) obj4;
                View v10 = (View) obj3;
                Context this_labelContext = (Context) obj2;
                c this$0 = (c) obj;
                kotlin.jvm.internal.i.g(isAnonymousSelected, "$isAnonymousSelected");
                kotlin.jvm.internal.i.g(v10, "$v");
                kotlin.jvm.internal.i.g(this_labelContext, "$this_labelContext");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                isAnonymousSelected.f23466u = !isAnonymousSelected.f23466u;
                AppCompatImageView appCompatImageView = (AppCompatImageView) v10.findViewById(R.id.ivCardV4SendAnonymouslyCheckBox);
                if (isAnonymousSelected.f23466u) {
                    i6 = R.drawable.ic_check_box_sea_curved;
                } else {
                    i6 = R.drawable.ic_check_box_outline_blank_blue_24dp;
                }
                Object obj5 = g0.a.f16164a;
                appCompatImageView.setBackground(a.c.b(this_labelContext, i6));
                ((AppCompatImageView) v10.findViewById(R.id.ivCardV4SendAnonymouslyCheckBox)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this_labelContext, R.color.teleCardTerracota)));
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) v10.findViewById(R.id.ivCardV4SendAnonymouslyCheckBox);
                if (isAnonymousSelected.f23466u) {
                    i10 = R.drawable.ic_round_check;
                } else {
                    i10 = 0;
                }
                appCompatImageView2.setImageResource(i10);
                String str16 = gk.a.f16573a;
                Bundle f = defpackage.e.f("variant", "variant_d", "experiment", "comm_acquisition");
                User f2 = defpackage.b.f(f, "platform", "android_app");
                if (f2 != null) {
                    str = f2.getCurrentCourseName();
                } else {
                    str = null;
                }
                User f10 = defpackage.b.f(f, "domain", str);
                if (f10 != null) {
                    str15 = f10.getCurrentCourseName();
                }
                f.putString("course", str15);
                f.putString("source", "app_homescreen");
                f.putBoolean("group_joined", !this$0.D.isEmpty());
                f.putString("channel_name", this$0.f33176z);
                f.putBoolean("post_anonymous", isAnonymousSelected.f23466u);
                Boolean bool = this$0.C;
                if (bool != null) {
                    f.putBoolean("onboarding_completed", bool.booleanValue());
                }
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(f, "comm_anonymous_checkmark");
                return;
            case 1:
                ol.b this$02 = (ol.b) obj4;
                String str17 = (String) obj2;
                ConstraintLayout row = (ConstraintLayout) obj;
                View this_apply = (View) obj3;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(row, "$row");
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                ArrayList<String> arrayList = this$02.D;
                if (arrayList.contains(str17)) {
                    arrayList.remove(str17);
                    row.setBackgroundTintList(null);
                    return;
                }
                arrayList.add(str17);
                row.setBackgroundTintList(g0.a.c(R.color.amahaLightGreen, this_apply.getContext()));
                return;
            case 2:
                View this_apply2 = (View) obj3;
                ConstraintLayout row2 = (ConstraintLayout) obj4;
                ol.b this$03 = (ol.b) obj2;
                HashMap tt2 = (HashMap) obj;
                kotlin.jvm.internal.i.g(this_apply2, "$this_apply");
                kotlin.jvm.internal.i.g(row2, "$row");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                LinearLayout linearLayout = (LinearLayout) this_apply2.findViewById(R.id.llN12CAdditionalImageScroller);
                if (linearLayout != null) {
                    Iterator<View> it = f6.b.B0(linearLayout).iterator();
                    while (true) {
                        j0 j0Var = (j0) it;
                        if (j0Var.hasNext()) {
                            ((View) j0Var.next()).findViewById(R.id.ivRowN12CItemImageBlanket).setVisibility(8);
                        }
                    }
                }
                row2.findViewById(R.id.ivRowN12CItemImageBlanket).setVisibility(0);
                Object obj6 = tt2.get("image");
                if (obj6 instanceof String) {
                    str2 = (String) obj6;
                } else {
                    str2 = null;
                }
                Object obj7 = tt2.get("text_color");
                if (obj7 instanceof String) {
                    str3 = (String) obj7;
                } else {
                    str3 = null;
                }
                this$03.I = new hs.f<>(str2, str3);
                return;
            case 3:
                N19ScreenFragment this$04 = (N19ScreenFragment) obj4;
                TimePickerDialog dailyGoalTimePicker = (TimePickerDialog) obj3;
                TimePickerDialog weeklyGoalTimePicker = (TimePickerDialog) obj2;
                DatePickerDialog onetimeGoalDayPicker = (DatePickerDialog) obj;
                int i12 = N19ScreenFragment.K;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(dailyGoalTimePicker, "$dailyGoalTimePicker");
                kotlin.jvm.internal.i.g(weeklyGoalTimePicker, "$weeklyGoalTimePicker");
                kotlin.jvm.internal.i.g(onetimeGoalDayPicker, "$onetimeGoalDayPicker");
                String str18 = this$04.f11011y;
                if (kotlin.jvm.internal.i.b(str18, Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                    dailyGoalTimePicker.show();
                    return;
                } else if (kotlin.jvm.internal.i.b(str18, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                    weeklyGoalTimePicker.show();
                    return;
                } else {
                    onetimeGoalDayPicker.show();
                    return;
                }
            case 4:
                Dialog dialog = (Dialog) obj4;
                tl.d this$05 = (tl.d) obj3;
                zl.b sessionInfo = (zl.b) obj2;
                UpcomingBooking upcomingBooking = (UpcomingBooking) obj;
                int i13 = tl.d.R;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(sessionInfo, "$sessionInfo");
                dialog.dismiss();
                String str19 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("source", this$05.U());
                hs.f Y = tl.d.Y(this$05, sessionInfo, null, 2);
                hs.f fVar = (hs.f) Y.f19464u;
                bundle.putString((String) fVar.f19464u, (String) fVar.f19465v);
                hs.f fVar2 = (hs.f) Y.f19465v;
                bundle.putString((String) fVar2.f19464u, (String) fVar2.f19465v);
                bundle.putString("flow", tl.d.X(this$05, sessionInfo, null, 2));
                OfflineClinicDetail clinicDetails = upcomingBooking.getClinicDetails();
                if (clinicDetails != null) {
                    str4 = clinicDetails.getName();
                } else {
                    str4 = null;
                }
                bundle.putString("center_name", str4);
                OfflineClinicDetail clinicDetails2 = upcomingBooking.getClinicDetails();
                if (clinicDetails2 != null && (locationDetail = clinicDetails2.getLocationDetail()) != null) {
                    str5 = locationDetail.getCity();
                } else {
                    str5 = null;
                }
                bundle.putString("center_location", str5);
                OfflineClinicDetail clinicDetails3 = upcomingBooking.getClinicDetails();
                if (clinicDetails3 != null) {
                    bundle.putInt("clinic_id", clinicDetails3.getId());
                }
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle, "therapy_psychiatry_locate_session_cross");
                return;
            case 5:
                FirestoreGoal goal = (FirestoreGoal) obj4;
                cm.l this$06 = (cm.l) obj2;
                Dialog dialog2 = (Dialog) obj;
                int i14 = cm.l.B;
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(dialog2, "$dialog");
                goal.getScheduledDate().setTime(((Calendar) obj3).getTimeInMillis() / 1000);
                fm.a aVar = this$06.f5357w;
                if (aVar != null) {
                    aVar.g(goal, true);
                }
                dialog2.dismiss();
                Utils.INSTANCE.showCustomToast(this$06.getContext(), "Updated!");
                String str20 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule");
                return;
            case 6:
                FirestoreGoal goal2 = (FirestoreGoal) obj4;
                cm.p this$07 = (cm.p) obj2;
                Dialog dialog3 = (Dialog) obj;
                int i15 = cm.p.G;
                kotlin.jvm.internal.i.g(goal2, "$goal");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(dialog3, "$dialog");
                goal2.getScheduledDate().setTime(((Calendar) obj3).getTimeInMillis() / 1000);
                fm.a aVar2 = this$07.f5373y;
                if (aVar2 != null) {
                    aVar2.g(goal2, true);
                }
                dialog3.dismiss();
                Utils.INSTANCE.showCustomToast(this$07.getContext(), "Updated!");
                String str21 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_reschedule");
                return;
            case 7:
                kotlin.jvm.internal.u added = (kotlin.jvm.internal.u) obj4;
                LearningHubModel it2 = (LearningHubModel) obj3;
                ArrayList<PostsRead> arrayList2 = (ArrayList) obj2;
                wm.c this$08 = (wm.c) obj;
                kotlin.jvm.internal.i.g(added, "$added");
                kotlin.jvm.internal.i.g(it2, "$it");
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (!added.f23466u) {
                    PostsRead postsRead = new PostsRead();
                    postsRead.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    postsRead.setPostId(it2.getId());
                    arrayList2.add(postsRead);
                    FirebasePersistence.getInstance().getUser().setPostsRead(arrayList2);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("post_id", it2.getId());
                bundle2.putString("post_type", it2.getPost_type());
                Iterator<LearningHubFieldModel> it3 = it2.getFields().iterator();
                while (it3.hasNext()) {
                    LearningHubFieldModel next = it3.next();
                    if (kotlin.jvm.internal.i.b(next.getData_title(), "title")) {
                        Object value = next.getValue();
                        if (value instanceof String) {
                            str7 = (String) value;
                        } else {
                            str7 = null;
                        }
                        if (str7 == null) {
                            str7 = "";
                        }
                        bundle2.putString("post_name", str7);
                    } else if (kotlin.jvm.internal.i.b(next.getData_title(), "short_desc")) {
                        Object value2 = next.getValue();
                        if (value2 instanceof String) {
                            str8 = (String) value2;
                        } else {
                            str8 = null;
                        }
                        if (str8 == null) {
                            str8 = "";
                        }
                        bundle2.putString("post_name", str8);
                    }
                }
                bundle2.putString("post_course", it2.getProgramme());
                if (added.f23466u) {
                    str6 = "read";
                } else {
                    str6 = "unread";
                }
                bundle2.putString("status", str6);
                bundle2.putString("source", "page_view");
                bundle2.putString("section", "search");
                gk.a.b(bundle2, "cm_post_detail");
                this$08.f36757y.invoke(it2, Boolean.valueOf(!added.f23466u));
                return;
            case 8:
                kotlin.jvm.internal.x isFavourite = (kotlin.jvm.internal.x) obj4;
                m.a holder = (m.a) obj3;
                zm.m this$09 = (zm.m) obj2;
                CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) obj;
                kotlin.jvm.internal.i.g(isFavourite, "$isFavourite");
                kotlin.jvm.internal.i.g(holder, "$holder");
                kotlin.jvm.internal.i.g(this$09, "this$0");
                T t3 = isFavourite.f23469u;
                ?? r32 = Boolean.TRUE;
                boolean b10 = kotlin.jvm.internal.i.b(t3, r32);
                View view2 = holder.f2751a;
                Context context = this$09.B;
                ArrayList<hs.f<String, Boolean>> arrayList3 = this$09.f39671y;
                if (b10) {
                    isFavourite.f23469u = Boolean.FALSE;
                    Object obj8 = g0.a.f16164a;
                    ((AppCompatImageView) view2.findViewById(R.id.ivRowShortCoursesBookmark)).setImageDrawable(a.c.b(context, R.drawable.ic_unsaved));
                    if (arrayList3 != null) {
                        Iterator<hs.f<String, Boolean>> it4 = arrayList3.iterator();
                        int i16 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                hs.f<String, Boolean> next2 = it4.next();
                                if (next2 != null) {
                                    str13 = next2.f19464u;
                                } else {
                                    str13 = null;
                                }
                                if (courseDayModelV1 != null) {
                                    str14 = courseDayModelV1.getContent_id();
                                } else {
                                    str14 = null;
                                }
                                if (!kotlin.jvm.internal.i.b(str13, str14)) {
                                    i16++;
                                }
                            } else {
                                i16 = -1;
                            }
                        }
                        Integer valueOf = Integer.valueOf(i16);
                        if (valueOf.intValue() == -1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            hs.f<String, Boolean> fVar3 = arrayList3.get(intValue);
                            if (fVar3 != null && (str12 = fVar3.f19464u) != null) {
                                arrayList3.set(intValue, new hs.f<>(str12, Boolean.FALSE));
                            }
                            kVar2 = hs.k.f19476a;
                            if (kVar2 == null && arrayList3 != null && courseDayModelV1 != null && (content_id2 = courseDayModelV1.getContent_id()) != null) {
                                arrayList3.add(new hs.f<>(content_id2, Boolean.FALSE));
                            }
                        }
                    }
                    kVar2 = null;
                    if (kVar2 == null) {
                        arrayList3.add(new hs.f<>(content_id2, Boolean.FALSE));
                    }
                } else {
                    isFavourite.f23469u = r32;
                    Object obj9 = g0.a.f16164a;
                    ((AppCompatImageView) view2.findViewById(R.id.ivRowShortCoursesBookmark)).setImageDrawable(a.c.b(context, R.drawable.ic_saved));
                    if (arrayList3 != null) {
                        Iterator<hs.f<String, Boolean>> it5 = arrayList3.iterator();
                        int i17 = 0;
                        while (true) {
                            if (it5.hasNext()) {
                                hs.f<String, Boolean> next3 = it5.next();
                                if (next3 != null) {
                                    str10 = next3.f19464u;
                                } else {
                                    str10 = null;
                                }
                                if (courseDayModelV1 != null) {
                                    str11 = courseDayModelV1.getContent_id();
                                } else {
                                    str11 = null;
                                }
                                if (!kotlin.jvm.internal.i.b(str10, str11)) {
                                    i17++;
                                }
                            } else {
                                i17 = -1;
                            }
                        }
                        Integer valueOf2 = Integer.valueOf(i17);
                        if (valueOf2.intValue() == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            int intValue2 = valueOf2.intValue();
                            hs.f<String, Boolean> fVar4 = arrayList3.get(intValue2);
                            if (fVar4 != null && (str9 = fVar4.f19464u) != null) {
                                arrayList3.set(intValue2, new hs.f<>(str9, Boolean.TRUE));
                            }
                            kVar = hs.k.f19476a;
                            if (kVar == null && arrayList3 != null && courseDayModelV1 != null && (content_id = courseDayModelV1.getContent_id()) != null) {
                                arrayList3.add(new hs.f<>(content_id, Boolean.TRUE));
                            }
                        }
                    }
                    kVar = null;
                    if (kVar == null) {
                        arrayList3.add(new hs.f<>(content_id, Boolean.TRUE));
                    }
                }
                if (courseDayModelV1 != null) {
                    this$09.D.invoke(courseDayModelV1, isFavourite.f23469u);
                    return;
                }
                return;
            case 9:
                r1 this$010 = (r1) obj4;
                View skuBlock = (View) obj3;
                c4.h productDetails = (c4.h) obj2;
                kotlin.jvm.internal.x selectedOffer = (kotlin.jvm.internal.x) obj;
                int i18 = r1.F;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(productDetails, "$productDetails");
                kotlin.jvm.internal.i.g(selectedOffer, "$selectedOffer");
                kotlin.jvm.internal.i.f(skuBlock, "skuBlock");
                String str22 = productDetails.f4924c;
                kotlin.jvm.internal.i.f(str22, "productDetails.productId");
                String str23 = ((h.d) selectedOffer.f23469u).f4933a;
                kotlin.jvm.internal.i.f(str23, "selectedOffer.offerToken");
                String valueOf3 = String.valueOf(((h.b) ((h.d) selectedOffer.f23469u).f4934b.f4932a.get(0)).f4930b / 1000000);
                String str24 = ((h.b) ((h.d) selectedOffer.f23469u).f4934b.f4932a.get(0)).f4931c;
                kotlin.jvm.internal.i.f(str24, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                try {
                    this$010.F().M(str22, str23, valueOf3, str24);
                    int childCount = ((LinearLayout) this$010._$_findCachedViewById(R.id.monetizationSKUContainer)).getChildCount();
                    for (int i19 = 0; i19 < childCount; i19++) {
                        if (!kotlin.jvm.internal.i.b(this$010.C, "")) {
                            ((ConstraintLayout) ((LinearLayout) this$010._$_findCachedViewById(R.id.monetizationSKUContainer)).getChildAt(i19).findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$010.A)));
                        }
                        if (!kotlin.jvm.internal.i.b(this$010.B, "")) {
                            ((ConstraintLayout) ((LinearLayout) this$010._$_findCachedViewById(R.id.monetizationSKUContainer)).getChildAt(i19).findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(g0.a.c(R.color.transparent, this$010.requireContext()));
                        }
                    }
                    if (!kotlin.jvm.internal.i.b(this$010.C, "")) {
                        ((ConstraintLayout) skuBlock.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$010.C)));
                    }
                    if (!kotlin.jvm.internal.i.b(this$010.B, "")) {
                        ((ConstraintLayout) skuBlock.findViewById(R.id.monetizationSchemeButton)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$010.B)));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$010.f26587x, e10);
                    return;
                }
            case 10:
                s1 this$011 = (s1) obj4;
                View skuBlock2 = (View) obj3;
                c4.h productDetails2 = (c4.h) obj2;
                kotlin.jvm.internal.x selectedOffer2 = (kotlin.jvm.internal.x) obj;
                int i20 = s1.F;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(productDetails2, "$productDetails");
                kotlin.jvm.internal.i.g(selectedOffer2, "$selectedOffer");
                kotlin.jvm.internal.i.f(skuBlock2, "skuBlock");
                String str25 = productDetails2.f4924c;
                kotlin.jvm.internal.i.f(str25, "productDetails.productId");
                String str26 = ((h.d) selectedOffer2.f23469u).f4933a;
                kotlin.jvm.internal.i.f(str26, "selectedOffer.offerToken");
                String valueOf4 = String.valueOf(((h.b) ((h.d) selectedOffer2.f23469u).f4934b.f4932a.get(0)).f4930b / 1000000);
                String str27 = ((h.b) ((h.d) selectedOffer2.f23469u).f4934b.f4932a.get(0)).f4931c;
                kotlin.jvm.internal.i.f(str27, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                try {
                    this$011.F().M(str25, str26, valueOf4, str27);
                    int i21 = R.id.sku2Container;
                    int childCount2 = ((LinearLayout) this$011._$_findCachedViewById(R.id.sku2Container)).getChildCount();
                    for (int i22 = 0; i22 < childCount2; i22++) {
                        ((ConstraintLayout) ((LinearLayout) this$011._$_findCachedViewById(i21)).getChildAt(i22).findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, this$011.requireContext()));
                        if (!kotlin.jvm.internal.i.b(this$011.A, "")) {
                            i21 = R.id.sku2Container;
                            ((ConstraintLayout) ((LinearLayout) this$011._$_findCachedViewById(R.id.sku2Container)).getChildAt(i22).findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$011.A)));
                        } else {
                            i21 = R.id.sku2Container;
                        }
                    }
                    if (!kotlin.jvm.internal.i.b(this$011.C, "")) {
                        ((ConstraintLayout) skuBlock2.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$011.C)));
                    }
                    ((ConstraintLayout) skuBlock2.findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(null);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$011.f26598x, e11);
                    return;
                }
            case 11:
                t1 this$012 = (t1) obj4;
                View skuBlock3 = (View) obj3;
                c4.h productDetails3 = (c4.h) obj2;
                kotlin.jvm.internal.x selectedOffer3 = (kotlin.jvm.internal.x) obj;
                int i23 = t1.F;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(productDetails3, "$productDetails");
                kotlin.jvm.internal.i.g(selectedOffer3, "$selectedOffer");
                kotlin.jvm.internal.i.f(skuBlock3, "skuBlock");
                String str28 = productDetails3.f4924c;
                kotlin.jvm.internal.i.f(str28, "productDetails.productId");
                String str29 = ((h.d) selectedOffer3.f23469u).f4933a;
                kotlin.jvm.internal.i.f(str29, "selectedOffer.offerToken");
                String valueOf5 = String.valueOf(((h.b) ((h.d) selectedOffer3.f23469u).f4934b.f4932a.get(0)).f4930b / 1000000);
                String str30 = ((h.b) ((h.d) selectedOffer3.f23469u).f4934b.f4932a.get(0)).f4931c;
                kotlin.jvm.internal.i.f(str30, "selectedOffer.pricingPha…List[0].priceCurrencyCode");
                try {
                    this$012.F().M(str28, str29, valueOf5, str30);
                    int i24 = R.id.sku2Container;
                    int childCount3 = ((LinearLayout) this$012._$_findCachedViewById(R.id.sku2Container)).getChildCount();
                    int i25 = 0;
                    while (i25 < childCount3) {
                        ((ConstraintLayout) ((LinearLayout) this$012._$_findCachedViewById(i24)).getChildAt(i25).findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(g0.a.c(R.color.transparent, this$012.requireContext()));
                        if (!kotlin.jvm.internal.i.b(this$012.C, "") && !kotlin.jvm.internal.i.b(skuBlock3.getTag(), str28)) {
                            ((ConstraintLayout) ((LinearLayout) this$012._$_findCachedViewById(R.id.sku2Container)).getChildAt(i25).findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$012.C)));
                        } else {
                            ((ConstraintLayout) ((LinearLayout) this$012._$_findCachedViewById(R.id.sku2Container)).getChildAt(i25).findViewById(R.id.monetizationSchemeBackground)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$012.requireContext(), R.color.white)));
                        }
                        i25++;
                        i24 = R.id.sku2Container;
                    }
                    if (!kotlin.jvm.internal.i.b(this$012.B, "")) {
                        ((ConstraintLayout) skuBlock3.findViewById(R.id.monetizationSchemeParent)).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(this$012.B)));
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$012.f26605x, e12);
                    return;
                }
            case 12:
                a();
                return;
            case 13:
                String slug = (String) obj4;
                kotlin.jvm.internal.x selectedOptions = (kotlin.jvm.internal.x) obj3;
                d1 this$013 = (d1) obj2;
                T1Activity act = (T1Activity) obj;
                int i26 = d1.f15692w;
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(selectedOptions, "$selectedOptions");
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                try {
                    if (kotlin.jvm.internal.i.b(slug, "s8-b")) {
                        if (((HashSet) selectedOptions.f23469u).size() == 0) {
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity = this$013.getActivity();
                            kotlin.jvm.internal.i.d(activity);
                            String string = this$013.getString(R.string.please_select_atleast_1);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.please_select_atleast_1)");
                            utils.showCustomToast(activity, string);
                        } else if (((HashSet) selectedOptions.f23469u).size() > 2) {
                            Utils utils2 = Utils.INSTANCE;
                            androidx.fragment.app.p activity2 = this$013.getActivity();
                            kotlin.jvm.internal.i.d(activity2);
                            String string2 = this$013.getString(R.string.no_more_selections);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.no_more_selections)");
                            utils2.showCustomToast(activity2, string2);
                        } else {
                            androidx.fragment.app.p activity3 = this$013.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
                            ((T1Activity) activity3).B.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                            act.t0();
                        }
                    } else {
                        androidx.fragment.app.p activity4 = this$013.getActivity();
                        kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
                        ((T1Activity) activity4).B.put("list", new ArrayList((Collection) selectedOptions.f23469u));
                        act.t0();
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$013.f15693u, "exception", e13);
                    return;
                }
            case 14:
                b();
                return;
            case 15:
                l0 this$014 = (l0) obj3;
                TemplateActivity act2 = (TemplateActivity) obj2;
                kotlin.jvm.internal.u setGoal = (kotlin.jvm.internal.u) obj4;
                kotlin.jvm.internal.x model = (kotlin.jvm.internal.x) obj;
                int i27 = l0.A;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(act2, "$act");
                kotlin.jvm.internal.i.g(setGoal, "$setGoal");
                kotlin.jvm.internal.i.g(model, "$model");
                int i28 = this$014.f18717v + 1;
                this$014.f18717v = i28;
                if (i28 < this$014.f18719x.size()) {
                    this$014.J();
                    return;
                }
                Goal y02 = act2.y0();
                if (y02 != null && setGoal.f23466u) {
                    y02.getData().put(this$014.f18718w, model.f23469u);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                if (act2.getIntent().hasExtra("source") && b0.c(act2, "source", "goals")) {
                    act2.n0();
                    return;
                } else {
                    act2.t0();
                    return;
                }
            case 16:
                c();
                return;
            case 17:
                d();
                return;
            case 18:
                e();
                return;
            case 19:
                f();
                return;
            case 20:
                g();
                return;
            case 21:
                h();
                return;
            case 22:
                i();
                return;
            default:
                j();
                return;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Serializable serializable, int i6) {
        this.f33206u = i6;
        this.f33207v = obj;
        this.f33208w = obj2;
        this.f33209x = obj3;
        this.f33210y = serializable;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f33206u = i6;
        this.f33208w = obj;
        this.f33207v = obj2;
        this.f33209x = obj3;
        this.f33210y = obj4;
    }

    public /* synthetic */ q(ol.b bVar, String str, ConstraintLayout constraintLayout, View view) {
        this.f33206u = 1;
        this.f33208w = bVar;
        this.f33209x = str;
        this.f33210y = constraintLayout;
        this.f33207v = view;
    }

    public /* synthetic */ q(rr.b bVar, Object obj, kotlin.jvm.internal.u uVar, Object obj2, int i6) {
        this.f33206u = i6;
        this.f33207v = bVar;
        this.f33209x = obj;
        this.f33208w = uVar;
        this.f33210y = obj2;
    }
}
