package wm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubArticleExperimentActivity;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.e0;
import fq.t;
import hr.f2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ Object A;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36747u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f36748v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Serializable f36749w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u f36750x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Serializable f36751y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f36752z;

    public /* synthetic */ a(Goal goal, u uVar, x xVar, f2 f2Var, TemplateActivity templateActivity) {
        this.f36747u = 3;
        this.f36748v = goal;
        this.f36750x = uVar;
        this.f36749w = "result_26";
        this.f36751y = xVar;
        this.f36752z = f2Var;
        this.A = templateActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        Goal J;
        int i6 = this.f36747u;
        u added = this.f36750x;
        Object obj2 = "short_desc";
        Object obj3 = this.A;
        String str8 = "post_name";
        Object obj4 = this.f36752z;
        Object obj5 = "title";
        Serializable serializable = this.f36751y;
        Serializable serializable2 = this.f36749w;
        Object obj6 = this.f36748v;
        switch (i6) {
            case 0:
                LearningHubModel model = (LearningHubModel) obj6;
                ArrayList values = (ArrayList) serializable2;
                ArrayList<PostsRead> arrayList = (ArrayList) serializable;
                View row = (View) obj4;
                b this$0 = (b) obj3;
                i.g(model, "$model");
                i.g(values, "$values");
                i.g(added, "$added");
                i.g(row, "$row");
                i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("post_id", model.getId());
                bundle.putString("post_type", model.getPost_type());
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    LearningHubFieldModel learningHubFieldModel = (LearningHubFieldModel) it.next();
                    if (i.b(learningHubFieldModel.getData_title(), obj5)) {
                        Object value = learningHubFieldModel.getValue();
                        if (value instanceof String) {
                            str2 = (String) value;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        bundle.putString(str8, str2);
                    } else {
                        Object obj7 = obj2;
                        if (i.b(learningHubFieldModel.getData_title(), obj7)) {
                            Object value2 = learningHubFieldModel.getValue();
                            if (value2 instanceof String) {
                                str3 = (String) value2;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            bundle.putString(str8, str3);
                        }
                        obj2 = obj7;
                    }
                }
                bundle.putString("post_course", model.getProgramme());
                if (added.f23466u) {
                    str = "read";
                } else {
                    str = "unread";
                }
                bundle.putString("status", str);
                bundle.putString("source", "page_view");
                bundle.putString("section", "history");
                gk.a.b(bundle, "cm_post_detail");
                if (!added.f23466u) {
                    PostsRead postsRead = new PostsRead();
                    postsRead.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    postsRead.setPostId(model.getId());
                    arrayList.add(postsRead);
                    FirebasePersistence.getInstance().getUser().setPostsRead(arrayList);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    View findViewById = row.findViewById(R.id.titleCardNewBg);
                    if (findViewById != null) {
                        findViewById.setVisibility(8);
                    }
                }
                Context context = this$0.f36754y;
                if ((context instanceof LearningHubExperimentActivity) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    i.e(context, "null cannot be cast to non-null type com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity");
                    LearningHubExperimentActivity learningHubExperimentActivity = (LearningHubExperimentActivity) context;
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_LEARNING_HUB, true);
                }
                context.startActivity(new Intent(context, LearningHubArticleExperimentActivity.class).putExtra("model", model));
                return;
            case 1:
                d this$02 = (d) obj3;
                LearningHubModel model2 = (LearningHubModel) obj6;
                ArrayList values2 = (ArrayList) serializable2;
                ArrayList<PostsRead> arrayList2 = (ArrayList) serializable;
                View row2 = (View) obj4;
                i.g(this$02, "this$0");
                i.g(model2, "$model");
                i.g(values2, "$values");
                i.g(added, "$added");
                i.g(row2, "$row");
                if (this$02.f36763z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle2.putString("post_id", model2.getId());
                    bundle2.putString("post_type", model2.getPost_type());
                    Iterator it2 = values2.iterator();
                    while (it2.hasNext()) {
                        LearningHubFieldModel learningHubFieldModel2 = (LearningHubFieldModel) it2.next();
                        Object obj8 = obj5;
                        if (i.b(learningHubFieldModel2.getData_title(), obj8)) {
                            Object value3 = learningHubFieldModel2.getValue();
                            if (value3 instanceof String) {
                                str7 = (String) value3;
                            } else {
                                str7 = null;
                            }
                            if (str7 == null) {
                                str7 = "";
                            }
                            str5 = str8;
                            bundle2.putString(str5, str7);
                            obj = obj2;
                        } else {
                            str5 = str8;
                            obj = obj2;
                            if (i.b(learningHubFieldModel2.getData_title(), obj)) {
                                Object value4 = learningHubFieldModel2.getValue();
                                if (value4 instanceof String) {
                                    str6 = (String) value4;
                                } else {
                                    str6 = null;
                                }
                                if (str6 == null) {
                                    str6 = "";
                                }
                                bundle2.putString(str5, str6);
                            }
                        }
                        str8 = str5;
                        obj5 = obj8;
                        obj2 = obj;
                    }
                    bundle2.putString("post_course", model2.getProgramme());
                    if (added.f23466u) {
                        str4 = "read";
                    } else {
                        str4 = "unread";
                    }
                    bundle2.putString("status", str4);
                    bundle2.putString("source", "page_view");
                    bundle2.putString("section", "today");
                    gk.a.b(bundle2, "cm_post_detail");
                    if (!added.f23466u) {
                        PostsRead postsRead2 = new PostsRead();
                        postsRead2.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        postsRead2.setPostId(model2.getId());
                        arrayList2.add(postsRead2);
                        FirebasePersistence.getInstance().getUser().setPostsRead(arrayList2);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ((RobertoTextView) row2.findViewById(R.id.tvNew)).setVisibility(8);
                        this$02.f36762y.invoke();
                    }
                    if ((row2.getContext() instanceof LearningHubExperimentActivity) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_LEARNING_HUB, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        Context context2 = row2.getContext();
                        i.e(context2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity");
                        LearningHubExperimentActivity learningHubExperimentActivity2 = (LearningHubExperimentActivity) context2;
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_LEARNING_HUB, true);
                    }
                    row2.getContext().startActivity(new Intent(row2.getContext(), LearningHubArticleExperimentActivity.class).putExtra("model", model2));
                    return;
                }
                return;
            case 2:
                t this$03 = (t) obj6;
                x model3 = (x) serializable2;
                x list = (x) serializable;
                String str9 = (String) obj4;
                T8Activity act = (T8Activity) obj3;
                int i10 = t.f15798x;
                i.g(this$03, "this$0");
                i.g(model3, "$model");
                i.g(list, "$list");
                i.g(added, "$setGoal");
                i.g(act, "$act");
                try {
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$03.f15799u, "exception", e10);
                    return;
                }
                if (!i.b(this$03.f15800v, "")) {
                    ((ScreenResult6Model) model3.f23469u).setList((ArrayList) list.f23469u);
                    if (i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_DEPRESSION)) {
                        J = this$03.J(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_DOUBLE_STANDARD_DISPUTE);
                    } else {
                        if (i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_STRESS)) {
                            if (str9 != null) {
                                int hashCode = str9.hashCode();
                                if (hashCode != -485307266) {
                                    if (hashCode != 715839472) {
                                        if (hashCode == 764633100 && str9.equals(Constants.SCREEN_T8A)) {
                                            J = this$03.J(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_ABC_OF_ASSERTIVENESS);
                                        }
                                    } else if (str9.equals(Constants.SCREEN_T8B)) {
                                        J = this$03.J(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_DOUBLE_STANDARD_DISPUTE);
                                    }
                                } else if (str9.equals(Constants.SCREEN_T8I)) {
                                    J = this$03.J(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_STAGES_OF_PROBLEM_SOLVING);
                                }
                            }
                            J = null;
                        } else {
                            if (i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), Constants.COURSE_ANGER)) {
                                J = this$03.J(Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_HELICOPTER_VIEW);
                            }
                            J = null;
                        }
                        LogHelper.INSTANCE.e(this$03.f15799u, "exception", e10);
                        return;
                    }
                    if (J != null && added.f23466u) {
                        J.setSource("daily_plan");
                        Date time = Calendar.getInstance().getTime();
                        i.f(time, "getInstance().time");
                        J.setmLastAdded(time);
                        if (act.D) {
                            if (J.getData().containsKey(this$03.f15800v)) {
                                Object obj9 = J.getData().get(this$03.f15800v);
                                i.e(obj9, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                                ArrayList arrayList3 = (ArrayList) obj9;
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList3.add(model3.f23469u);
                                J.getData().put(this$03.f15800v, arrayList3);
                            } else {
                                J.getData().put(this$03.f15800v, new ArrayList());
                                Object obj10 = J.getData().get(this$03.f15800v);
                                i.e(obj10, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                                ((ArrayList) obj10).add(model3.f23469u);
                            }
                        } else {
                            act.D = true;
                            if (!J.getData().containsKey(this$03.f15800v)) {
                                J.getData().put(this$03.f15800v, new ArrayList());
                            }
                            Object obj11 = J.getData().get(this$03.f15800v);
                            i.e(obj11, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                            ((ArrayList) obj11).add(model3.f23469u);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    } else {
                        String str10 = this$03.f15800v;
                        switch (str10.hashCode()) {
                            case -2017702793:
                                if (!str10.equals("result_stages_of_problem_solving_stress")) {
                                    break;
                                } else {
                                    J = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_STAGES_OF_PROBLEM_SOLVING);
                                    J.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_STAGES_OF_PROBLEM_SOLVING).getType());
                                    break;
                                }
                            case -1774858377:
                                if (!str10.equals("result_double_standard_dispute_depression")) {
                                    break;
                                } else {
                                    J = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_DOUBLE_STANDARD_DISPUTE);
                                    J.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_DOUBLE_STANDARD_DISPUTE).getType());
                                    break;
                                }
                            case -1756480269:
                                if (!str10.equals("result_abc_of_assertiveness_stress")) {
                                    break;
                                } else {
                                    J = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_ABC_OF_ASSERTIVENESS);
                                    J.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_ABC_OF_ASSERTIVENESS).getType());
                                    break;
                                }
                            case -1644729019:
                                if (!str10.equals("result_double_standard_dispute_stress")) {
                                    break;
                                } else {
                                    J = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_DOUBLE_STANDARD_DISPUTE);
                                    J.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_STRESS_DOUBLE_STANDARD_DISPUTE).getType());
                                    break;
                                }
                            case -322770765:
                                if (!str10.equals("result_helicopter_view_anger")) {
                                    break;
                                } else {
                                    J = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_HELICOPTER_VIEW);
                                    J.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_ANGER_HELICOPTER_VIEW).getType());
                                    break;
                                }
                        }
                        i.d(J);
                        J.setVisible(false);
                        J.setNotificationScheduled(false);
                        J.setSource("daily_plan");
                        J.getData().put(this$03.f15800v, new ArrayList());
                        Object obj12 = J.getData().get(this$03.f15800v);
                        i.e(obj12, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult6Model> }");
                        ((ArrayList) obj12).add(model3.f23469u);
                        FirebasePersistence.getInstance().getUserGoals().add(J);
                    }
                }
                act.s0(new e0());
                return;
            default:
                Goal goal = (Goal) obj6;
                String resultKey = (String) serializable2;
                x model4 = (x) serializable;
                f2 this$04 = (f2) obj4;
                TemplateActivity act2 = (TemplateActivity) obj3;
                int i11 = f2.f18362w;
                i.g(added, "$saveResult");
                i.g(resultKey, "$resultKey");
                i.g(model4, "$model");
                i.g(this$04, "this$0");
                i.g(act2, "$act");
                if (goal != null && added.f23466u) {
                    goal.getData().put(resultKey, model4.f23469u);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                p activity = this$04.getActivity();
                i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).getIntent().hasExtra("source") && b0.c(act2, "source", "goals")) {
                    p activity2 = this$04.getActivity();
                    i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity2).n0();
                    return;
                }
                act2.t0();
                return;
        }
    }

    public /* synthetic */ a(LearningHubModel learningHubModel, ArrayList arrayList, u uVar, ArrayList arrayList2, View view, b bVar) {
        this.f36747u = 0;
        this.f36748v = learningHubModel;
        this.f36749w = arrayList;
        this.f36750x = uVar;
        this.f36751y = arrayList2;
        this.f36752z = view;
        this.A = bVar;
    }

    public /* synthetic */ a(t tVar, x xVar, x xVar2, String str, u uVar, T8Activity t8Activity) {
        this.f36747u = 2;
        this.f36748v = tVar;
        this.f36749w = xVar;
        this.f36751y = xVar2;
        this.f36752z = str;
        this.f36750x = uVar;
        this.A = t8Activity;
    }

    public /* synthetic */ a(d dVar, LearningHubModel learningHubModel, ArrayList arrayList, u uVar, ArrayList arrayList2, View view) {
        this.f36747u = 1;
        this.A = dVar;
        this.f36748v = learningHubModel;
        this.f36749w = arrayList;
        this.f36750x = uVar;
        this.f36751y = arrayList2;
        this.f36752z = view;
    }
}
