package ik;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.components.pro.goal.model.DaySpecificDailyGoal;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import po.a;
import zm.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l1 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20233u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f20234v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f20235w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f20236x;

    public /* synthetic */ l1(int i6, Object obj, Object obj2, int i10) {
        this.f20233u = i10;
        this.f20234v = i6;
        this.f20235w = obj;
        this.f20236x = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        RobertoButton robertoButton;
        View childAt;
        View childAt2;
        View childAt3;
        View childAt4;
        RobertoButton robertoButton2;
        View childAt5;
        ho.g this$0 = (ho.g) this.f20235w;
        ArrayList options = (ArrayList) this.f20236x;
        int i6 = ho.g.f18000x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(options, "$options");
        try {
            int size = options.size() - 1;
            ArrayList<String> arrayList = this$0.f18002v;
            int i10 = this.f20234v;
            float f = 1.0f;
            RobertoButton robertoButton3 = null;
            if (i10 == size) {
                int childCount = ((LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL)).getChildCount() - 1;
                for (int i11 = 0; i11 < childCount; i11++) {
                    LinearLayout linearLayout = (LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL);
                    if (linearLayout != null && (childAt5 = linearLayout.getChildAt(i11)) != null) {
                        robertoButton2 = (RobertoButton) childAt5.findViewById(R.id.optionButton);
                    } else {
                        robertoButton2 = null;
                    }
                    if (robertoButton2 != null) {
                        robertoButton2.setSelected(false);
                    }
                }
                arrayList.clear();
                arrayList.add(options.get(i10));
                LinearLayout linearLayout2 = (LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL);
                if (linearLayout2 != null && (childAt4 = linearLayout2.getChildAt(((LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL)).getChildCount() - 1)) != null) {
                    robertoButton3 = (RobertoButton) childAt4.findViewById(R.id.optionButton);
                }
                if (robertoButton3 != null) {
                    robertoButton3.setSelected(true);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.focusNext);
                if (appCompatImageView != null) {
                    appCompatImageView.setAlpha(1.0f);
                    return;
                }
                return;
            }
            arrayList.remove(options.get(options.size() - 1));
            LinearLayout linearLayout3 = (LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL);
            if (linearLayout3 != null && (childAt3 = linearLayout3.getChildAt(((LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL)).getChildCount() - 1)) != null) {
                robertoButton = (RobertoButton) childAt3.findViewById(R.id.optionButton);
            } else {
                robertoButton = null;
            }
            if (robertoButton != null) {
                robertoButton.setSelected(false);
            }
            String str = (String) options.get(i10);
            if (arrayList.contains(str)) {
                arrayList.remove(str);
                LinearLayout linearLayout4 = (LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL);
                if (linearLayout4 != null && (childAt2 = linearLayout4.getChildAt(i10)) != null) {
                    robertoButton3 = (RobertoButton) childAt2.findViewById(R.id.optionButton);
                }
                if (robertoButton3 != null) {
                    robertoButton3.setSelected(false);
                }
            } else {
                arrayList.add(str);
                LinearLayout linearLayout5 = (LinearLayout) this$0._$_findCachedViewById(R.id.focusOptionsLL);
                if (linearLayout5 != null && (childAt = linearLayout5.getChildAt(i10)) != null) {
                    robertoButton3 = (RobertoButton) childAt.findViewById(R.id.optionButton);
                }
                if (robertoButton3 != null) {
                    robertoButton3.setSelected(true);
                }
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.focusNext);
            if (appCompatImageView2 != null) {
                if (arrayList.isEmpty()) {
                    f = 0.34f;
                }
                appCompatImageView2.setAlpha(f);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18001u, e10);
        }
    }

    private final void b() {
        RobertoButton robertoButton;
        View childAt;
        boolean z10;
        View view;
        RobertoEditText robertoEditText;
        RobertoButton robertoButton2;
        View childAt2;
        ho.s this$0 = (ho.s) this.f20235w;
        int i6 = this.f20234v;
        ArrayList options = (ArrayList) this.f20236x;
        int i10 = ho.s.f18048y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(options, "$options");
        try {
            String str = (String) options.get(i6);
            ArrayList<String> arrayList = this$0.f18050v;
            boolean z11 = false;
            Editable editable = null;
            if (arrayList.contains(str)) {
                arrayList.remove(str);
                LinearLayout linearLayout = (LinearLayout) this$0._$_findCachedViewById(R.id.supportKindOptionsLL);
                if (linearLayout != null && (childAt2 = linearLayout.getChildAt(i6)) != null) {
                    robertoButton2 = (RobertoButton) childAt2.findViewById(R.id.optionButton);
                } else {
                    robertoButton2 = null;
                }
                if (robertoButton2 != null) {
                    robertoButton2.setSelected(false);
                }
            } else {
                arrayList.add(str);
                LinearLayout linearLayout2 = (LinearLayout) this$0._$_findCachedViewById(R.id.supportKindOptionsLL);
                if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(i6)) != null) {
                    robertoButton = (RobertoButton) childAt.findViewById(R.id.optionButton);
                } else {
                    robertoButton = null;
                }
                if (robertoButton != null) {
                    robertoButton.setSelected(true);
                }
            }
            if (!arrayList.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this$0.f18051w) {
                LinearLayout linearLayout3 = (LinearLayout) this$0._$_findCachedViewById(R.id.supportKindOptionsLL);
                if (linearLayout3 != null) {
                    view = linearLayout3.getChildAt(((LinearLayout) this$0._$_findCachedViewById(R.id.supportKindOptionsLL)).getChildCount() - 1);
                } else {
                    view = null;
                }
                if (view != null && (robertoEditText = (RobertoEditText) view.findViewById(R.id.optionEditText)) != null) {
                    editable = robertoEditText.getText();
                }
                z10 = !((editable == null || gv.n.B0(editable)) ? true : true);
            }
            this$0.J(z10);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18049u, e10);
        }
    }

    private final void c() {
        ho.t this$0 = (ho.t) this.f20235w;
        JSONArray jSONArray = (JSONArray) this.f20236x;
        int i6 = ho.t.f18054z;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("question_id", String.valueOf(this$0.f18057w.getInt("id")));
        int i10 = this.f20234v;
        jSONObject.put("option_id", String.valueOf(jSONArray.getJSONObject(i10).getInt("id")));
        jSONObject.put("score", String.valueOf(jSONArray.getJSONObject(i10).getInt("score")));
        ProTakeAssessmentActivity proTakeAssessmentActivity = this$0.f18056v;
        if (proTakeAssessmentActivity != null) {
            jSONObject.put("order", String.valueOf(proTakeAssessmentActivity.f11522x + 1));
            try {
                if (!this$0.f18058x) {
                    this$0.f18058x = true;
                    int childCount = ((LinearLayout) this$0._$_findCachedViewById(R.id.llProB2COptions)).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        ((RobertoButton) ((LinearLayout) this$0._$_findCachedViewById(R.id.llProB2COptions)).getChildAt(i11).findViewById(R.id.optionButton)).setSelected(false);
                    }
                    ((RobertoButton) ((LinearLayout) this$0._$_findCachedViewById(R.id.llProB2COptions)).getChildAt(i10).findViewById(R.id.optionButton)).setSelected(true);
                    new Handler().postDelayed(new nn.f(this$0, 1, jSONObject), 200L);
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this$0.f18055u, e10);
                return;
            }
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ba  */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r21v1, types: [int] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        Long l2;
        Long l10;
        Long l11;
        String str;
        String str2;
        ArrayList<JournalAttachImageModel> arrayList;
        mm.b bVar;
        boolean z11;
        int i6;
        String str3;
        String str4;
        ArrayList<JournalAttachImageModel> arrayList2;
        mm.b bVar2;
        boolean z12;
        int i10;
        String str5;
        String str6;
        ArrayList<JournalAttachImageModel> arrayList3;
        mm.b bVar3;
        boolean z13;
        int i11;
        boolean z14;
        String str7;
        boolean z15;
        String str8;
        RobertoButton robertoButton;
        View childAt;
        boolean z16;
        View view2;
        Editable editable;
        boolean z17;
        boolean z18;
        RobertoEditText robertoEditText;
        RobertoButton robertoButton2;
        View childAt2;
        RobertoButton robertoButton3;
        View childAt3;
        RobertoButton robertoButton4;
        View childAt4;
        RobertoEditText robertoEditText2;
        View childAt5;
        int i12 = this.f20233u;
        int i13 = this.f20234v;
        Object obj = this.f20236x;
        Object obj2 = this.f20235w;
        switch (i12) {
            case 0:
                m1 this$0 = (m1) obj2;
                Course course = (Course) obj;
                int i14 = m1.J;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Utils utils = Utils.INSTANCE;
                InitialAssessmentActivity initialAssessmentActivity = this$0.F;
                if (initialAssessmentActivity != null) {
                    if (utils.checkConnectivity(initialAssessmentActivity)) {
                        InitialAssessmentActivity initialAssessmentActivity2 = this$0.F;
                        if (initialAssessmentActivity2 != null) {
                            initialAssessmentActivity2.t0();
                            boolean contains = ca.a.k("v1", "v2").contains(FirebasePersistence.getInstance().getUser().getVersion());
                            if (defpackage.d.q(Constants.USER_VERSION)) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                                ?? r02 = ((InitialAssessmentActivity) activity).L;
                                z10 = r02;
                                if (r02 != 0) {
                                    if (r02 == 30) {
                                        course.setFinalAssessmentScore(this$0.f20247y);
                                        z10 = r02;
                                    }
                                } else {
                                    course.setInitialAssessmentScore(this$0.f20247y);
                                    z10 = r02;
                                }
                            } else {
                                course.setInitialAssessmentScore(this$0.f20247y);
                                z10 = contains;
                            }
                            ?? r21 = z10;
                            ArrayList<AssessmentResponseAll> assessments = course.getAssessments();
                            InitialAssessmentActivity initialAssessmentActivity3 = this$0.F;
                            if (initialAssessmentActivity3 != null) {
                                assessments.add(new AssessmentResponseAll(initialAssessmentActivity3.C, initialAssessmentActivity3.D, initialAssessmentActivity3.E, this$0.f20247y, r21));
                                if (i13 != -1) {
                                    course.getPlanV3().get(i13).setCompleted(true);
                                    course.setCoursePosition(i13);
                                }
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                Bundle bundle = new Bundle();
                                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                InitialAssessmentActivity initialAssessmentActivity4 = this$0.F;
                                if (initialAssessmentActivity4 != null) {
                                    int i15 = initialAssessmentActivity4.L;
                                    if (i15 != 0) {
                                        if (i15 != 15) {
                                            if (i15 != 30) {
                                                bundle.putInt("day", -1);
                                            } else {
                                                bundle.putInt("day", 28);
                                            }
                                        } else {
                                            bundle.putInt("day", 15);
                                        }
                                    } else {
                                        bundle.putInt("day", 0);
                                    }
                                    defpackage.d.m(bundle, "course");
                                    bundle.putInt("score", this$0.f20247y);
                                    bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                                    gk.a.b(bundle, "assessment_score_click");
                                    ApplicationPersistence.getInstance().setLongValue("asst_request_sent", Calendar.getInstance().getTimeInMillis());
                                    new Handler().postDelayed(new i5.b(19), 500L);
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 1:
                q1 this$02 = (q1) obj2;
                Bundle analyticsBundle = (Bundle) obj;
                int i16 = q1.f20277x;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                if (i13 == 0) {
                    if (Utils.INSTANCE.checkConnectivity(this$02.J())) {
                        gk.a.b(analyticsBundle, "progragmme_assessment_question");
                        this$02.J().x0();
                        this$02.J().t0();
                        return;
                    }
                    return;
                }
                this$02.J().x0();
                this$02.J().t0();
                return;
            case 2:
                gl.a this$03 = (gl.a) obj2;
                NotV4RecentModel model = (NotV4RecentModel) obj;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(model, "$model");
                ss.v<String, String, String, Boolean, String, String, Integer, Boolean, hs.k> vVar = this$03.f16588z;
                String id2 = model.getId();
                kotlin.jvm.internal.i.d(id2);
                String itemType = model.getItemType();
                kotlin.jvm.internal.i.d(itemType);
                String label = model.getLabel();
                kotlin.jvm.internal.i.d(label);
                Boolean valueOf = Boolean.valueOf(model.isFree());
                String parentId = model.getParentId();
                kotlin.jvm.internal.i.d(parentId);
                String parentType = model.getParentType();
                kotlin.jvm.internal.i.d(parentType);
                vVar.u(id2, itemType, label, valueOf, parentId, parentType, Integer.valueOf(i13), Boolean.valueOf(model.isCompleted()));
                return;
            case 3:
                gl.b this$04 = (gl.b) obj2;
                NotV4RecentModel model2 = (NotV4RecentModel) obj;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(model2, "$model");
                ss.v<String, String, String, Boolean, String, String, Integer, Boolean, hs.k> vVar2 = this$04.f16591z;
                String id3 = model2.getId();
                kotlin.jvm.internal.i.d(id3);
                String itemType2 = model2.getItemType();
                kotlin.jvm.internal.i.d(itemType2);
                String label2 = model2.getLabel();
                kotlin.jvm.internal.i.d(label2);
                Boolean valueOf2 = Boolean.valueOf(model2.isFree());
                String parentId2 = model2.getParentId();
                kotlin.jvm.internal.i.d(parentId2);
                String parentType2 = model2.getParentType();
                kotlin.jvm.internal.i.d(parentType2);
                vVar2.u(id3, itemType2, label2, valueOf2, parentId2, parentType2, Integer.valueOf(i13), Boolean.valueOf(model2.isCompleted()));
                return;
            case 4:
                Intent intent = (Intent) obj2;
                V3DashboardUtils this$05 = (V3DashboardUtils) obj;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (intent != null) {
                    this$05.f().startActivityForResult(intent, i13);
                    return;
                }
                return;
            case 5:
                ol.h this$06 = (ol.h) obj2;
                HashMap dataMap = (HashMap) obj;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(dataMap, "$dataMap");
                Integer valueOf3 = Integer.valueOf(i13);
                Object obj3 = dataMap.get("date");
                if (obj3 instanceof Long) {
                    l2 = (Long) obj3;
                } else {
                    l2 = null;
                }
                this$06.C.invoke(valueOf3, l2);
                return;
            case 6:
                ol.i this$07 = (ol.i) obj2;
                HashMap dataMap2 = (HashMap) obj;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(dataMap2, "$dataMap");
                Integer valueOf4 = Integer.valueOf(i13);
                Object obj4 = dataMap2.get("date");
                if (obj4 instanceof Long) {
                    l10 = (Long) obj4;
                } else {
                    l10 = null;
                }
                this$07.C.invoke(valueOf4, l10);
                return;
            case 7:
                ol.j this$08 = (ol.j) obj2;
                HashMap dataMap3 = (HashMap) obj;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(dataMap3, "$dataMap");
                Integer valueOf5 = Integer.valueOf(i13);
                Object obj5 = dataMap3.get("date");
                if (obj5 instanceof Long) {
                    l11 = (Long) obj5;
                } else {
                    l11 = null;
                }
                this$08.C.invoke(valueOf5, l11);
                return;
            case 8:
                kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) obj2;
                V3GoalsActivity v3GoalsActivity = (V3GoalsActivity) obj;
                int i17 = vVar3.f23467u;
                if (i17 != -1) {
                    fm.m1 m1Var = v3GoalsActivity.T;
                    if (m1Var != null) {
                        ta.v.H(kc.f.H(m1Var), null, 0, new fm.l1(m1Var, i17, i13, null), 3);
                    }
                    BottomSheetBehavior.from((ConstraintLayout) v3GoalsActivity.n0(R.id.clNPSBottomSheet)).setState(4);
                    String str9 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    defpackage.e.s(bundle2, "course", "type", "goals");
                    bundle2.putInt("rating", vVar3.f23467u);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle2, "self_care_nps_submit");
                    return;
                }
                return;
            case 9:
                bm.b this$09 = (bm.b) obj2;
                FirestoreGoal goal = (FirestoreGoal) obj;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(goal, "$goal");
                this$09.f4408z.d(goal);
                return;
            case 10:
                bm.d this$010 = (bm.d) obj2;
                FirestoreGoal goal2 = (FirestoreGoal) obj;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(goal2, "$goal");
                this$010.A.d(goal2);
                return;
            case 11:
                bm.i this$011 = (bm.i) obj2;
                Goal goal3 = (Goal) obj;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(goal3, "$goal");
                b.a aVar = new b.a(this$011.f4466x);
                aVar.setTitle("Are you sure you want to remove this goal?");
                aVar.b("Yes", new bm.h(goal3, this$011, i13, 0));
                aVar.a("Cancel", new yi.d(9));
                androidx.appcompat.app.b create = aVar.create();
                kotlin.jvm.internal.i.f(create, "builder.create()");
                create.show();
                Bundle bundle3 = new Bundle();
                bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle3.putString(Constants.GOAL_ID, goal3.getGoalId());
                bundle3.putString(Constants.GOAL_NAME, goal3.getGoalName());
                bundle3.putString(Constants.GOAL_TYPE, goal3.getType());
                bundle3.putString("screen", "v2Goals");
                bundle3.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle3, "activity_remove_click");
                return;
            case 12:
                bm.k this$012 = (bm.k) obj2;
                Calendar calendar = (Calendar) obj;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                int i18 = this$012.D;
                this$012.D = i13;
                if (i18 != i13) {
                    this$012.j(i18);
                }
                this$012.j(this$012.D);
                Date time = calendar.getTime();
                kotlin.jvm.internal.i.f(time, "temp.time");
                this$012.f4481y.invoke(time, Integer.valueOf(i13));
                return;
            case 13:
                bm.m this$013 = (bm.m) obj2;
                Goal goal4 = (Goal) obj;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(goal4, "$goal");
                b.a aVar2 = new b.a(this$013.f4489x);
                aVar2.setTitle("Are you sure you want to remove this goal?");
                aVar2.b("Yes", new bm.h(goal4, this$013, i13, 1));
                aVar2.a("Cancel", new yi.d(10));
                androidx.appcompat.app.b create2 = aVar2.create();
                kotlin.jvm.internal.i.f(create2, "builder.create()");
                create2.show();
                return;
            case 14:
                bm.o this$014 = (bm.o) obj2;
                Goal goal5 = (Goal) obj;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(goal5, "$goal");
                b.a aVar3 = new b.a(this$014.f4509x);
                aVar3.setTitle("Are you sure you want to remove this goal?");
                aVar3.b("Yes", new bm.h(goal5, this$014, i13, 2));
                aVar3.a("Cancel", new yi.d(11));
                androidx.appcompat.app.b create3 = aVar3.create();
                kotlin.jvm.internal.i.f(create3, "builder.create()");
                create3.show();
                Bundle bundle4 = new Bundle();
                bundle4.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle4.putString(Constants.GOAL_ID, goal5.getGoalId());
                bundle4.putString(Constants.GOAL_NAME, goal5.getGoalName());
                bundle4.putString(Constants.GOAL_TYPE, goal5.getType());
                bundle4.putString("screen", "v3Goals");
                bundle4.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle4, "activity_remove_click");
                return;
            case 15:
                bm.s this$015 = (bm.s) obj2;
                RecommendedActivityModel model3 = (RecommendedActivityModel) obj;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.g(model3, "$model");
                RecyclerView recyclerView = this$015.C;
                if (recyclerView != null) {
                    recyclerView.l0(i13);
                }
                this$015.f4533z.invoke(model3);
                return;
            case 16:
                qm.j this$016 = (qm.j) obj2;
                Dialog templateChangeDialog = (Dialog) obj;
                int i19 = qm.j.L;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(templateChangeDialog, "$templateChangeDialog");
                String str10 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                bundle5.putString("template", this$016.O().A.b());
                if (!this$016.O().H || this$016.O().J == null) {
                    str = "fresh_entry";
                } else {
                    JournalModel journalModel = this$016.O().J;
                    if (journalModel != null) {
                        str = journalModel.getId();
                    } else {
                        str2 = null;
                        bundle5.putString("entry_id", str2);
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle5, "journal_image_remove_confirm");
                        arrayList = this$016.E;
                        if (arrayList.size() > i13) {
                            arrayList.remove(i13);
                            AppCompatImageView appCompatImageView = (AppCompatImageView) this$016._$_findCachedViewById(R.id.ivJournalBasicFooterImageUpload);
                            if (arrayList.size() < 8) {
                                i6 = R.drawable.ic_gallery_icon_journal;
                            } else {
                                i6 = R.drawable.ic_gallery_journal_disable;
                            }
                            appCompatImageView.setImageResource(i6);
                        }
                        bVar = this$016.G;
                        if (bVar == null) {
                            bVar.x(i13);
                            Iterator<JournalAttachImageModel> it = arrayList.iterator();
                            int i20 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    JournalAttachImageModel next = it.next();
                                    if (!kotlin.jvm.internal.i.b(next.getImageUploadStatus(), ImageResponse.UploadingStarted.INSTANCE) && !(next.getImageUploadStatus() instanceof ImageResponse.Uploading)) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        i20++;
                                    }
                                } else {
                                    i20 = -1;
                                }
                            }
                            this$016.H = i20;
                            templateChangeDialog.dismiss();
                            return;
                        }
                        kotlin.jvm.internal.i.q("adapter");
                        throw null;
                    }
                }
                str2 = str;
                bundle5.putString("entry_id", str2);
                hs.k kVar22 = hs.k.f19476a;
                gk.a.b(bundle5, "journal_image_remove_confirm");
                arrayList = this$016.E;
                if (arrayList.size() > i13) {
                }
                bVar = this$016.G;
                if (bVar == null) {
                }
                break;
            case 17:
                rm.h this$017 = (rm.h) obj2;
                Dialog templateChangeDialog2 = (Dialog) obj;
                int i21 = rm.h.N;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.g(templateChangeDialog2, "$templateChangeDialog");
                String str11 = gk.a.f16573a;
                Bundle bundle6 = new Bundle();
                bundle6.putString("template", this$017.O().A.b());
                if (!this$017.O().H || this$017.O().J == null) {
                    str3 = "fresh_entry";
                } else {
                    JournalModel journalModel2 = this$017.O().J;
                    if (journalModel2 != null) {
                        str3 = journalModel2.getId();
                    } else {
                        str4 = null;
                        bundle6.putString("entry_id", str4);
                        hs.k kVar3 = hs.k.f19476a;
                        gk.a.b(bundle6, "journal_image_remove_confirm");
                        arrayList2 = this$017.K;
                        if (arrayList2.size() > i13) {
                            arrayList2.remove(i13);
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$017._$_findCachedViewById(R.id.ivJournalQuestionFooterImageUpload);
                            if (arrayList2.size() < 8) {
                                i10 = R.drawable.ic_gallery_icon_journal;
                            } else {
                                i10 = R.drawable.ic_gallery_journal_disable;
                            }
                            appCompatImageView2.setImageResource(i10);
                        }
                        bVar2 = this$017.H;
                        if (bVar2 == null) {
                            bVar2.x(i13);
                            templateChangeDialog2.dismiss();
                            Iterator<JournalAttachImageModel> it2 = arrayList2.iterator();
                            int i22 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    JournalAttachImageModel next2 = it2.next();
                                    if (!kotlin.jvm.internal.i.b(next2.getImageUploadStatus(), ImageResponse.UploadingStarted.INSTANCE) && !(next2.getImageUploadStatus() instanceof ImageResponse.Uploading)) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (!z12) {
                                        i22++;
                                    }
                                } else {
                                    i22 = -1;
                                }
                            }
                            this$017.I = i22;
                            return;
                        }
                        kotlin.jvm.internal.i.q("adapter");
                        throw null;
                    }
                }
                str4 = str3;
                bundle6.putString("entry_id", str4);
                hs.k kVar32 = hs.k.f19476a;
                gk.a.b(bundle6, "journal_image_remove_confirm");
                arrayList2 = this$017.K;
                if (arrayList2.size() > i13) {
                }
                bVar2 = this$017.H;
                if (bVar2 == null) {
                }
                break;
            case 18:
                sm.s this$018 = (sm.s) obj2;
                Dialog templateChangeDialog3 = (Dialog) obj;
                int i23 = sm.s.K;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(templateChangeDialog3, "$templateChangeDialog");
                String str12 = gk.a.f16573a;
                Bundle bundle7 = new Bundle();
                bundle7.putString("template", this$018.O().A.b());
                bundle7.putInt("step", this$018.f31737x + 1);
                if (!this$018.O().H || this$018.O().J == null) {
                    str5 = "fresh_entry";
                } else {
                    JournalModel journalModel3 = this$018.O().J;
                    if (journalModel3 != null) {
                        str5 = journalModel3.getId();
                    } else {
                        str6 = null;
                        bundle7.putString("entry_id", str6);
                        hs.k kVar4 = hs.k.f19476a;
                        gk.a.b(bundle7, "journal_image_remove_confirm");
                        arrayList3 = this$018.H;
                        if (arrayList3.size() > i13) {
                            arrayList3.remove(i13);
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) this$018._$_findCachedViewById(R.id.ivJournalThoughtDescriptionFooterImageUpload);
                            if (arrayList3.size() < 8) {
                                i11 = R.drawable.ic_gallery_icon_journal;
                            } else {
                                i11 = R.drawable.ic_gallery_journal_disable;
                            }
                            appCompatImageView3.setImageResource(i11);
                        }
                        bVar3 = this$018.E;
                        if (bVar3 == null) {
                            bVar3.x(i13);
                            templateChangeDialog3.dismiss();
                            Iterator<JournalAttachImageModel> it3 = arrayList3.iterator();
                            int i24 = 0;
                            while (true) {
                                if (it3.hasNext()) {
                                    JournalAttachImageModel next3 = it3.next();
                                    if (!kotlin.jvm.internal.i.b(next3.getImageUploadStatus(), ImageResponse.UploadingStarted.INSTANCE) && !(next3.getImageUploadStatus() instanceof ImageResponse.Uploading)) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (!z13) {
                                        i24++;
                                    }
                                } else {
                                    i24 = -1;
                                }
                            }
                            this$018.F = i24;
                            return;
                        }
                        kotlin.jvm.internal.i.q("adapter");
                        throw null;
                    }
                }
                str6 = str5;
                bundle7.putString("entry_id", str6);
                hs.k kVar42 = hs.k.f19476a;
                gk.a.b(bundle7, "journal_image_remove_confirm");
                arrayList3 = this$018.H;
                if (arrayList3.size() > i13) {
                }
                bVar3 = this$018.E;
                if (bVar3 == null) {
                }
                break;
            case 19:
                zm.l this$019 = (zm.l) obj2;
                l.a holder = (l.a) obj;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                ArrayList<String> arrayList4 = this$019.f39669z;
                ArrayList<String> arrayList5 = this$019.f39668y;
                kotlin.jvm.internal.i.g(holder, "$holder");
                try {
                    boolean contains2 = arrayList5.contains(arrayList4.get(i13));
                    Context context = this$019.A;
                    View view3 = holder.f2751a;
                    if (contains2) {
                        arrayList5.remove(arrayList4.get(i13));
                        Object obj6 = g0.a.f16164a;
                        ((AppCompatImageView) view3.findViewById(R.id.ivRowFilterCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_outline_blank_blue_24dp));
                        ((AppCompatImageView) view3.findViewById(R.id.ivRowFilterCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(context, R.color.title_high_contrast)));
                    } else {
                        arrayList5.add(arrayList4.get(i13));
                        Object obj7 = g0.a.f16164a;
                        ((AppCompatImageView) view3.findViewById(R.id.ivRowFilterCheckbox)).setImageDrawable(a.c.b(context, R.drawable.ic_check_box_sea_curved));
                        ((AppCompatImageView) view3.findViewById(R.id.ivRowFilterCheckbox)).setImageTintList(null);
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$019.f39667x, e10);
                    return;
                }
            case 20:
                ConstraintLayout cardView = (ConstraintLayout) obj2;
                nn.q this$020 = (nn.q) obj;
                int i25 = nn.q.C;
                kotlin.jvm.internal.i.g(cardView, "$cardView");
                kotlin.jvm.internal.i.g(this$020, "this$0");
                if (((RobertoTextView) cardView.findViewById(R.id.faqText)).getVisibility() == 0) {
                    ((RobertoTextView) cardView.findViewById(R.id.faqText)).setVisibility(8);
                    this$020.F().u0(cardView);
                    z14 = false;
                } else {
                    ((RobertoTextView) cardView.findViewById(R.id.faqText)).setVisibility(0);
                    this$020.F().u0(cardView);
                    z14 = true;
                }
                String str13 = gk.a.f16573a;
                Bundle f = defpackage.e.f("variant", "0", "package", "plus");
                f.putString("screen", "plus_mini");
                f.putInt("itemNo", i13);
                if (z14) {
                    str7 = "open";
                } else {
                    str7 = "close";
                }
                f.putString("status", str7);
                hs.k kVar5 = hs.k.f19476a;
                gk.a.b(f, "monetization_faq_item_click");
                return;
            case 21:
                ConstraintLayout cardView2 = (ConstraintLayout) obj2;
                s5 this$021 = (s5) obj;
                kotlin.jvm.internal.i.g(cardView2, "$cardView");
                kotlin.jvm.internal.i.g(this$021, "this$0");
                if (((RobertoTextView) cardView2.findViewById(R.id.faqText)).getVisibility() == 0) {
                    ((RobertoTextView) cardView2.findViewById(R.id.faqText)).setVisibility(8);
                    this$021.l(cardView2);
                    z15 = false;
                } else {
                    ((RobertoTextView) cardView2.findViewById(R.id.faqText)).setVisibility(0);
                    this$021.l(cardView2);
                    z15 = true;
                }
                String str14 = gk.a.f16573a;
                Bundle f2 = defpackage.e.f("variant", "0", "package", "plus");
                f2.putString("screen", "plus");
                f2.putInt("itemNo", i13);
                if (z15) {
                    str8 = "open";
                } else {
                    str8 = "close";
                }
                f2.putString("status", str8);
                hs.k kVar6 = hs.k.f19476a;
                gk.a.b(f2, "monetization_faq_item_click");
                return;
            case 22:
                JSONObject jSONObject = (JSONObject) obj2;
                go.b this$022 = (go.b) obj;
                kotlin.jvm.internal.i.g(this$022, "this$0");
                Bundle bundle8 = new Bundle();
                bundle8.putString(SessionManager.KEY_NAME, jSONObject.optString("assessment_name"));
                bundle8.putBoolean("completed", jSONObject.getBoolean("assessment_complete"));
                gk.a.b(bundle8, "assessment_list_b2c_click");
                JSONObject jSONObject2 = this$022.f16668y.getJSONObject(i13);
                kotlin.jvm.internal.i.f(jSONObject2, "assessmentList.getJSONObject(position)");
                this$022.f16669z.invoke(jSONObject2, Boolean.valueOf(jSONObject.getBoolean("assessment_complete")));
                return;
            case 23:
                ho.c this$023 = (ho.c) obj2;
                ArrayList options = (ArrayList) obj;
                int i26 = ho.c.f17972y;
                kotlin.jvm.internal.i.g(this$023, "this$0");
                kotlin.jvm.internal.i.g(options, "$options");
                try {
                    String str15 = (String) options.get(i13);
                    ArrayList<String> arrayList6 = this$023.f17974v;
                    if (arrayList6.contains(str15)) {
                        arrayList6.remove(str15);
                        LinearLayout linearLayout = (LinearLayout) this$023._$_findCachedViewById(R.id.addressConcernsOptionsLL);
                        if (linearLayout != null && (childAt2 = linearLayout.getChildAt(i13)) != null) {
                            robertoButton2 = (RobertoButton) childAt2.findViewById(R.id.optionButton);
                        } else {
                            robertoButton2 = null;
                        }
                        if (robertoButton2 != null) {
                            robertoButton2.setSelected(false);
                        }
                    } else {
                        arrayList6.add(str15);
                        LinearLayout linearLayout2 = (LinearLayout) this$023._$_findCachedViewById(R.id.addressConcernsOptionsLL);
                        if (linearLayout2 != null && (childAt = linearLayout2.getChildAt(i13)) != null) {
                            robertoButton = (RobertoButton) childAt.findViewById(R.id.optionButton);
                        } else {
                            robertoButton = null;
                        }
                        if (robertoButton != null) {
                            robertoButton.setSelected(true);
                        }
                    }
                    if (!arrayList6.isEmpty()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (this$023.f17975w) {
                        LinearLayout linearLayout3 = (LinearLayout) this$023._$_findCachedViewById(R.id.addressConcernsOptionsLL);
                        if (linearLayout3 != null) {
                            view2 = linearLayout3.getChildAt(((LinearLayout) this$023._$_findCachedViewById(R.id.addressConcernsOptionsLL)).getChildCount() - 1);
                        } else {
                            view2 = null;
                        }
                        if (view2 != null && (robertoEditText = (RobertoEditText) view2.findViewById(R.id.optionEditText)) != null) {
                            editable = robertoEditText.getText();
                        } else {
                            editable = null;
                        }
                        if (editable != null && !gv.n.B0(editable)) {
                            z17 = true;
                            z18 = false;
                            z16 = z17 ^ z18;
                        }
                        z17 = true;
                        z18 = true;
                        z16 = z17 ^ z18;
                    }
                    this$023.J(z16);
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$023.f17973u, e11);
                    return;
                }
            case 24:
                a();
                return;
            case 25:
                ho.p this$024 = (ho.p) obj2;
                ArrayList options2 = (ArrayList) obj;
                int i27 = ho.p.f18036y;
                kotlin.jvm.internal.i.g(this$024, "this$0");
                kotlin.jvm.internal.i.g(options2, "$options");
                try {
                    int childCount = ((LinearLayout) this$024._$_findCachedViewById(R.id.proactiveOptionsLL)).getChildCount();
                    for (int i28 = 0; i28 < childCount; i28++) {
                        LinearLayout linearLayout4 = (LinearLayout) this$024._$_findCachedViewById(R.id.proactiveOptionsLL);
                        if (linearLayout4 != null && (childAt5 = linearLayout4.getChildAt(i28)) != null) {
                            robertoButton4 = (RobertoButton) childAt5.findViewById(R.id.optionButton);
                        } else {
                            robertoButton4 = null;
                        }
                        if (robertoButton4 != null) {
                            robertoButton4.setSelected(false);
                        }
                        if (i28 == ((LinearLayout) this$024._$_findCachedViewById(R.id.proactiveOptionsLL)).getChildCount() - 1) {
                            LinearLayout linearLayout5 = (LinearLayout) this$024._$_findCachedViewById(R.id.proactiveOptionsLL);
                            if (linearLayout5 != null && (childAt4 = linearLayout5.getChildAt(i28)) != null && (robertoEditText2 = (RobertoEditText) childAt4.findViewById(R.id.optionEditText)) != null) {
                                robertoEditText2.setVisibility(8);
                                UiUtils.Companion companion = UiUtils.Companion;
                                Context requireContext = this$024.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                companion.hideKeyboardFrom(requireContext, robertoEditText2);
                            }
                            this$024.f18039w = false;
                        }
                    }
                    LinearLayout linearLayout6 = (LinearLayout) this$024._$_findCachedViewById(R.id.proactiveOptionsLL);
                    if (linearLayout6 != null && (childAt3 = linearLayout6.getChildAt(i13)) != null) {
                        robertoButton3 = (RobertoButton) childAt3.findViewById(R.id.optionButton);
                    } else {
                        robertoButton3 = null;
                    }
                    if (robertoButton3 != null) {
                        robertoButton3.setSelected(true);
                    }
                    this$024.f18038v = (String) options2.get(i13);
                    this$024.J(true);
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$024.f18037u, e12);
                    return;
                }
            case 26:
                b();
                return;
            case 27:
                c();
                return;
            case 28:
                po.a this$025 = (po.a) obj2;
                a.c viewholder = (a.c) obj;
                kotlin.jvm.internal.i.g(this$025, "this$0");
                kotlin.jvm.internal.i.g(viewholder, "$viewholder");
                if (i13 == 0) {
                    hs.f fVar = (hs.f) is.u.j2(viewholder.f(), this$025.f28724x);
                    if (fVar != null) {
                        Object obj8 = fVar.f19465v;
                        kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.goal.model.DaySpecificDailyGoal");
                        Goal goal6 = ((DaySpecificDailyGoal) obj8).getGoal();
                        viewholder.f();
                        this$025.f28726z.N(goal6);
                        return;
                    }
                    return;
                }
                Toast.makeText(this$025.f28725y, "Past goals cannot be tracked", 0).show();
                gk.a.b(null, "pro_goal_expired_click");
                return;
            default:
                ProfileAssetModel.ProfileAvatarAsset avatar = (ProfileAssetModel.ProfileAvatarAsset) obj2;
                to.a this$026 = (to.a) obj;
                kotlin.jvm.internal.i.g(avatar, "$avatar");
                kotlin.jvm.internal.i.g(this$026, "this$0");
                avatar.setSelected(true);
                this$026.j(i13);
                this$026.f33383z.a(avatar, i13);
                Iterator it4 = is.u.N2(this$026.f33382y).iterator();
                while (true) {
                    is.b0 b0Var = (is.b0) it4;
                    if (b0Var.hasNext()) {
                        is.z zVar = (is.z) b0Var.next();
                        if (zVar.f20679a != i13) {
                            ProfileAssetModel.ProfileAvatarAsset profileAvatarAsset = (ProfileAssetModel.ProfileAvatarAsset) zVar.f20680b;
                            if (profileAvatarAsset.getSelected()) {
                                profileAvatarAsset.setSelected(false);
                                this$026.j(zVar.f20679a);
                            }
                        }
                    } else {
                        return;
                    }
                }
        }
    }

    public /* synthetic */ l1(Object obj, int i6, Object obj2, int i10) {
        this.f20233u = i10;
        this.f20235w = obj;
        this.f20234v = i6;
        this.f20236x = obj2;
    }

    public /* synthetic */ l1(Object obj, Object obj2, int i6, int i10) {
        this.f20233u = i10;
        this.f20235w = obj;
        this.f20236x = obj2;
        this.f20234v = i6;
    }
}
