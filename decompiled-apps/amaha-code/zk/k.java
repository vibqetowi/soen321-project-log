package zk;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult16Model;
import com.theinnerhour.b2b.model.ScreenResult17Model;
import com.theinnerhour.b2b.model.ScreenResult18Model;
import com.theinnerhour.b2b.model.ScreenResult19Model;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.ScreenResult30Model;
import com.theinnerhour.b2b.model.ScreenResult6Model;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.SuggestedBooking;
import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotification;
import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotificationTool;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import fm.z;
import gv.r;
import hr.a1;
import hr.a2;
import hr.b1;
import hr.b4;
import hr.d1;
import hr.e1;
import hr.l2;
import hr.m1;
import hr.m3;
import hr.m4;
import hr.n1;
import hr.n3;
import hr.p6;
import hr.r3;
import hr.s0;
import hr.s3;
import hr.t0;
import hr.t3;
import hr.u0;
import hr.u3;
import hr.v2;
import hr.w0;
import hr.w1;
import hr.w2;
import hr.x0;
import hr.x1;
import hr.x2;
import hr.y1;
import hr.z3;
import is.u;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.x;
import r1.b0;
import ta.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39454u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f39455v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f39456w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f39457x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f39458y;

    public /* synthetic */ k(V3DashboardActivity v3DashboardActivity, boolean z10, SuggestedBooking suggestedBooking, String str) {
        this.f39454u = 2;
        this.f39458y = v3DashboardActivity;
        this.f39455v = z10;
        this.f39456w = suggestedBooking;
        this.f39457x = str;
    }

    private final void a() {
        l2 this$0 = (l2) this.f39458y;
        String goalId = (String) this.f39457x;
        ScreenResult28Model model = (ScreenResult28Model) this.f39456w;
        int i6 = l2.f18725y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(goalId, "$goalId");
        kotlin.jvm.internal.i.g(model, "$model");
        try {
            if (this.f39455v) {
                TemplateActivity templateActivity = this$0.f18728w;
                if (templateActivity != null) {
                    templateActivity.K0(true);
                    TemplateActivity templateActivity2 = this$0.f18728w;
                    if (templateActivity2 != null) {
                        boolean z10 = templateActivity2.K;
                        m0 m0Var = this$0.f18727v;
                        if (z10) {
                            fm.a aVar = (fm.a) m0Var.getValue();
                            aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new a2(6, new l2.b()));
                            aVar.j(model, goalId);
                            return;
                        }
                        templateActivity2.K = true;
                        fm.a aVar2 = (fm.a) m0Var.getValue();
                        aVar2.f15177k0.e(this$0.getViewLifecycleOwner(), new a2(7, new l2.c()));
                        aVar2.h(model, goalId);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            p activity = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity).t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18726u, "exception on click listener", e10);
        }
    }

    private final void b() {
        v2 this$0 = (v2) this.f39458y;
        String goalId = (String) this.f39457x;
        ScreenResult30Model model = (ScreenResult30Model) this.f39456w;
        int i6 = v2.f19274y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(goalId, "$goalId");
        kotlin.jvm.internal.i.g(model, "$model");
        try {
            if (this.f39455v) {
                TemplateActivity templateActivity = this$0.f19276v;
                if (templateActivity != null) {
                    templateActivity.K0(true);
                    TemplateActivity templateActivity2 = this$0.f19276v;
                    if (templateActivity2 != null) {
                        if (!kotlin.jvm.internal.i.b(templateActivity2.B0(), "s145")) {
                            TemplateActivity templateActivity3 = this$0.f19276v;
                            if (templateActivity3 != null) {
                                if (!kotlin.jvm.internal.i.b(templateActivity3.B0(), "s148")) {
                                    return;
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        TemplateActivity templateActivity4 = this$0.f19276v;
                        if (templateActivity4 != null) {
                            boolean z10 = templateActivity4.K;
                            m0 m0Var = this$0.f19277w;
                            if (z10) {
                                fm.a aVar = (fm.a) m0Var.getValue();
                                aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new a2(12, new w2(this$0)));
                                aVar.j(model, goalId);
                                return;
                            }
                            templateActivity4.K = true;
                            fm.a aVar2 = (fm.a) m0Var.getValue();
                            aVar2.f15177k0.e(this$0.getViewLifecycleOwner(), new a2(13, new x2(this$0)));
                            aVar2.h(model, goalId);
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
            TemplateActivity templateActivity5 = this$0.f19276v;
            if (templateActivity5 != null) {
                if (templateActivity5.getIntent().hasExtra("source")) {
                    TemplateActivity templateActivity6 = this$0.f19276v;
                    if (templateActivity6 != null) {
                        if (kotlin.jvm.internal.i.b(templateActivity6.getIntent().getStringExtra("source"), "goals")) {
                            TemplateActivity templateActivity7 = this$0.f19276v;
                            if (templateActivity7 != null) {
                                templateActivity7.n0();
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                TemplateActivity templateActivity8 = this$0.f19276v;
                if (templateActivity8 != null) {
                    templateActivity8.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f19275u, "exception", e10);
        }
    }

    private final void c() {
        s3 this$0 = (s3) this.f39458y;
        String goalId = (String) this.f39457x;
        ScreenResult6Model model = (ScreenResult6Model) this.f39456w;
        int i6 = s3.f19129z;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(goalId, "$goalId");
        kotlin.jvm.internal.i.g(model, "$model");
        try {
            if (this.f39455v) {
                TemplateActivity templateActivity = this$0.f19131v;
                if (templateActivity != null) {
                    templateActivity.K0(true);
                    TemplateActivity templateActivity2 = this$0.f19131v;
                    if (templateActivity2 != null) {
                        boolean z10 = templateActivity2.K;
                        m0 m0Var = this$0.f19132w;
                        if (z10) {
                            templateActivity2.K0(true);
                            fm.a aVar = (fm.a) m0Var.getValue();
                            aVar.f15174h0.e(this$0.getViewLifecycleOwner(), new a2(29, new t3(this$0)));
                            aVar.j(model, goalId);
                            return;
                        }
                        templateActivity2.K = true;
                        fm.a aVar2 = (fm.a) m0Var.getValue();
                        aVar2.f15177k0.e(this$0.getViewLifecycleOwner(), new r3(0, new u3(this$0)));
                        aVar2.h(model, goalId);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            this$0.K();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f19130u, "exception", e10);
        }
    }

    private final void d() {
        String goalId;
        x finalOptions = (x) this.f39457x;
        m4 this$0 = (m4) this.f39458y;
        HashMap params = (HashMap) this.f39456w;
        int i6 = m4.f18820z;
        kotlin.jvm.internal.i.g(finalOptions, "$finalOptions");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(params, "$params");
        boolean z10 = this.f39455v;
        if (!z10) {
            if (((HashSet) finalOptions.f23469u).size() == 0) {
                Utils.INSTANCE.showCustomToast(this$0.requireActivity(), UtilFunKt.paramsMapToString(params.get("s109_error_1")));
                return;
            } else if (((HashSet) finalOptions.f23469u).size() > 2) {
                Utils.INSTANCE.showCustomToast(this$0.requireActivity(), UtilFunKt.paramsMapToString(params.get("s109_error_2")));
                return;
            }
        }
        if (this$0.J().W) {
            FirestoreGoal firestoreGoal = this$0.f18824x;
            if (firestoreGoal != null) {
                goalId = firestoreGoal.getGoalId();
            }
            goalId = null;
        } else {
            Goal y02 = this$0.J().y0();
            if (y02 != null) {
                goalId = y02.getGoalId();
            }
            goalId = null;
        }
        if (!u.Z1(ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4"), goalId)) {
            this$0.J().F.put("list", new ArrayList((Collection) finalOptions.f23469u));
        } else {
            this$0.J().F.put("s109_t13_list", new ArrayList((Collection) finalOptions.f23469u));
        }
        this$0.J().F.put("s109_user_list", finalOptions.f23469u);
        if (this$0.J().W) {
            if (z10 && goalId != null) {
                fm.a aVar = (fm.a) this$0.f18822v.getValue();
                aVar.f15175i0.e(this$0.getViewLifecycleOwner(), new r3(11, new m4.b(this$0)));
                v.H(kc.f.H(aVar), null, 0, new fm.f(aVar, goalId, null), 3);
                return;
            }
            this$0.J().s0(new b4());
        } else if (z10) {
            Goal y03 = this$0.J().y0();
            if (y03 != null) {
                y03.getData().clear();
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
            this$0.J().s0(new p6());
        } else {
            this$0.J().s0(new z3());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        Intent intent;
        boolean z11;
        Intent intent2;
        w<TherapistPackagesModel> wVar;
        TherapistPackagesModel d10;
        String uuid;
        String str;
        w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar2;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d11;
        TherapistPackagesModel therapistPackagesModel;
        String str2;
        String str3;
        String str4;
        w<TherapistPackagesModel> wVar3;
        TherapistPackagesModel d12;
        TherapistPackagesModel therapistPackagesModel2;
        String str5;
        String str6;
        w<TherapistPackagesModel> wVar4;
        TherapistPackagesModel d13;
        String str7;
        w<TherapistPackagesModel> wVar5;
        TherapistPackagesModel d14;
        String str8;
        w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar6;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d15;
        TherapistPackagesModel therapistPackagesModel3;
        w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar7;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d16;
        w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar8;
        hs.f<TherapistPackagesModel, TherapistPackagesModel> d17;
        int i6 = this.f39454u;
        boolean z12 = this.f39455v;
        Object obj = this.f39456w;
        Object obj2 = this.f39458y;
        Object obj3 = this.f39457x;
        String str9 = null;
        TemplateActivity templateActivity = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        String str10 = null;
        Integer num = null;
        String str11 = null;
        switch (i6) {
            case 0:
                String course = (String) obj3;
                l this$0 = (l) obj2;
                View v10 = (View) obj;
                int i10 = l.A;
                kotlin.jvm.internal.i.g(course, "$course");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                boolean z13 = this$0.f39463y;
                if (z12) {
                    if (is.k.Q1(course, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                        User user = firebasePersistence.getUser();
                        if (user != null) {
                            user.setCurrentCourseName(course);
                        }
                        User user2 = firebasePersistence.getUser();
                        if (user2 != null) {
                            user2.setCurrentCourse(UtilsKt.getCourseId(course));
                        }
                        firebasePersistence.updateUserOnFirebase();
                        this$0.J(false);
                    } else {
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast toast = new Toast(this$0.requireContext());
                            Object systemService = this$0.requireActivity().getSystemService("layout_inflater");
                            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                            toast.setView(((LayoutInflater) systemService).inflate(R.layout.toast_textview, (ViewGroup) null));
                            toast.show();
                        }
                        if (isConnected) {
                            ProgressDialog progressDialog = this$0.f39460v;
                            if (progressDialog != null) {
                                progressDialog.show();
                                String str12 = this$0.f39459u;
                                try {
                                    LogHelper.INSTANCE.i(str12, "assign programme ".concat(course));
                                    CourseApiUtil courseApiUtil = this$0.f39461w;
                                    if (courseApiUtil != null) {
                                        CourseApiUtil.sendCourseApiRequest$default(courseApiUtil, course, null, 2, null);
                                    } else {
                                        kotlin.jvm.internal.i.q("courseApiUtil");
                                        throw null;
                                    }
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(str12, "condition selection", e10);
                                }
                            } else {
                                kotlin.jvm.internal.i.q("progressDialog");
                                throw null;
                            }
                        }
                    }
                    bundle.putString("course", course);
                    bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                    p activity = this$0.getActivity();
                    if (activity != null && (intent2 = activity.getIntent()) != null) {
                        z11 = intent2.getBooleanExtra("reset_flag", false);
                    } else {
                        z11 = false;
                    }
                    bundle.putBoolean("reset_flow", z11);
                    if (z13) {
                        bundle.putString("source", "settings");
                    } else {
                        Bundle arguments = this$0.getArguments();
                        if (arguments != null) {
                            str11 = arguments.getString("source");
                        }
                        bundle.putString("source", str11);
                    }
                    gk.a.b(bundle, "pre_domain_selection_existing");
                    return;
                }
                p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                rr.a aVar = (rr.a) activity2;
                al.a aVar2 = this$0.f39462x;
                if (aVar2 != null) {
                    kotlin.jvm.internal.i.f(v10, "v");
                    aVar2.Z(v10, course);
                }
                aVar.t0();
                bundle.putString("course", course);
                p activity3 = this$0.getActivity();
                if (activity3 != null && (intent = activity3.getIntent()) != null) {
                    z10 = intent.getBooleanExtra("reset_flag", false);
                } else {
                    z10 = false;
                }
                bundle.putBoolean("reset_flow", z10);
                Bundle arguments2 = this$0.getArguments();
                if (arguments2 != null) {
                    Boolean valueOf = Boolean.valueOf(arguments2.getBoolean("isOnBoardingFunnelExperimentOn"));
                    if (!valueOf.booleanValue()) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        valueOf.booleanValue();
                        bundle.putString("variant", "post_domain");
                    }
                }
                if (z13) {
                    bundle.putString("source", "settings");
                } else {
                    Bundle arguments3 = this$0.getArguments();
                    if (arguments3 != null) {
                        str9 = arguments3.getString("source");
                    }
                    bundle.putString("source", str9);
                }
                gk.a.b(bundle, "pre_domain_selection_new");
                return;
            case 1:
                V3DashboardActivity this$02 = (V3DashboardActivity) obj3;
                TelecommunicationHomeworkNotification it = (TelecommunicationHomeworkNotification) obj2;
                View view2 = (View) obj;
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                if (z12) {
                    ml.p pVar = this$02.f10739o0;
                    if (pVar != null && (wVar2 = pVar.A) != null && (d11 = wVar2.d()) != null && (therapistPackagesModel = d11.f19464u) != null) {
                        uuid = therapistPackagesModel.getUuid();
                    }
                    uuid = null;
                } else {
                    ml.p pVar2 = this$02.f10739o0;
                    if (pVar2 != null && (wVar = pVar2.B) != null && (d10 = wVar.d()) != null) {
                        uuid = d10.getUuid();
                    }
                    uuid = null;
                }
                if (it.getToolType() == null && it.getAssignedAssessment() != null) {
                    String str13 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    if (z12) {
                        str = "therapy";
                    } else {
                        str = "psychiatry";
                    }
                    bundle2.putString("flow", str);
                    bundle2.putString("state", "pending");
                    bundle2.putString("source", "home_screen");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle2, "assigned_assessment_click");
                    Intent intent3 = new Intent(this$02, TelecommunicationsPWAActivity.class);
                    intent3.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.ASSIGNED_ASSESSMENT);
                    intent3.putExtra("isTherapy", z12);
                    intent3.putExtra("slug", it.getAssignedAssessment().getSlug());
                    intent3.putExtra("assessmentId", it.getAssignedAssessment().getAssessmentId());
                    intent3.putExtra("id", it.getAssignedAssessment().getId());
                    intent3.putExtra("providerUUID", uuid);
                    this$02.startActivity(intent3);
                } else {
                    Intent intent4 = new Intent(this$02, TelecommunicationsPWAActivity.class);
                    intent4.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.TOOL);
                    TelecommunicationHomeworkNotificationTool assignedTool = it.getAssignedTool();
                    if (assignedTool != null) {
                        num = assignedTool.getId();
                    }
                    intent4.putExtra("id", num);
                    intent4.putExtra("isTherapy", z12);
                    this$02.startActivity(intent4);
                }
                Set<String> stringSetValue = ApplicationPersistence.getInstance().getStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET);
                stringSetValue.add(new sf.i().g(new kl.a(it, z12)));
                ApplicationPersistence.getInstance().setStringSetValue(Constants.INTEGRATED_DB_HOMEWORK_SET, stringSetValue);
                ((LinearLayout) this$02.n0(R.id.llDashboardProviderAssignedNotifications)).removeView(view2);
                return;
            case 2:
                V3DashboardActivity this$03 = (V3DashboardActivity) obj2;
                SuggestedBooking suggestedBooking = (SuggestedBooking) obj;
                String str14 = (String) obj3;
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(suggestedBooking, "$suggestedBooking");
                Intent intent5 = new Intent(this$03, TelecommunicationsPWAActivity.class);
                intent5.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.NEXT_SESSION);
                intent5.putExtra("isTherapy", z12);
                if (z12) {
                    str2 = "therapist";
                } else {
                    str2 = "psychiatrist";
                }
                intent5.putExtra("providerType", str2);
                intent5.putExtra("providerUUID", str14);
                intent5.putExtra("suggestedBooking", suggestedBooking.getSuggestedPackage().getId());
                this$03.startActivity(intent5);
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                if (z12) {
                    str3 = "therapy";
                } else {
                    str3 = "psychiatry";
                }
                applicationPersistence.setStringValue("db_integrated_next_".concat(str3), suggestedBooking.getSessionDateTime());
                String str15 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                if (z12) {
                    str4 = "therapy";
                } else {
                    str4 = "psychiatry";
                }
                bundle3.putString("flow", str4);
                bundle3.putString("source", "home_screen");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle3, "next_session_prompt_click");
                return;
            case 3:
                V3DashboardActivity this$04 = (V3DashboardActivity) obj2;
                String url = (String) obj3;
                String str16 = (String) obj;
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(url, "$url");
                ml.p pVar3 = this$04.f10739o0;
                if (z12) {
                    if (pVar3 != null && (wVar8 = pVar3.A) != null && (d17 = wVar8.d()) != null) {
                        d12 = d17.f19464u;
                        therapistPackagesModel2 = d12;
                    }
                    therapistPackagesModel2 = null;
                } else {
                    if (pVar3 != null && (wVar3 = pVar3.B) != null) {
                        d12 = wVar3.d();
                        therapistPackagesModel2 = d12;
                    }
                    therapistPackagesModel2 = null;
                }
                String str17 = "";
                StringBuilder sb2 = new StringBuilder("");
                if (therapistPackagesModel2 != null) {
                    str5 = therapistPackagesModel2.getFirstname();
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = "";
                }
                sb2.append(str5);
                sb2.append(' ');
                if (therapistPackagesModel2 != null) {
                    str6 = therapistPackagesModel2.getLastname();
                } else {
                    str6 = null;
                }
                if (str6 == null) {
                    str6 = "";
                }
                sb2.append(str6);
                String obj4 = r.i1(sb2.toString()).toString();
                Charset UTF_8 = StandardCharsets.UTF_8;
                kotlin.jvm.internal.i.f(UTF_8, "UTF_8");
                byte[] bytes = obj4.getBytes(UTF_8);
                kotlin.jvm.internal.i.f(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                Intent intent6 = new Intent(this$04, TelecommunicationsPWAActivity.class);
                intent6.putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.FEEDBACK);
                intent6.putExtra(Constants.LINK_ID, url);
                ml.p pVar4 = this$04.f10739o0;
                if (!z12 ? !(pVar4 == null || (wVar4 = pVar4.B) == null || (d13 = wVar4.d()) == null) : !(pVar4 == null || (wVar7 = pVar4.A) == null || (d16 = wVar7.d()) == null || (d13 = d16.f19464u) == null)) {
                    str10 = d13.getUuid();
                }
                intent6.putExtra("providerUUID", str10);
                intent6.putExtra("providerNameBase64", encodeToString);
                intent6.putExtra("isTherapy", z12);
                this$04.startActivity(intent6);
                ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                if (z12) {
                    str7 = "therapy_idb";
                } else {
                    str7 = "psychiatry_idb";
                }
                applicationPersistence2.setStringValue("tc_feedback_latest_".concat(str7), url);
                String str18 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                if (z12) {
                    ml.p pVar5 = this$04.f10739o0;
                    if (pVar5 != null && (wVar6 = pVar5.A) != null && (d15 = wVar6.d()) != null && (therapistPackagesModel3 = d15.f19464u) != null) {
                        StringBuilder sb3 = new StringBuilder("");
                        String firstname = therapistPackagesModel3.getFirstname();
                        if (firstname == null) {
                            firstname = "";
                        }
                        sb3.append(firstname);
                        sb3.append(' ');
                        String lastname = therapistPackagesModel3.getLastname();
                        if (lastname != null) {
                            str17 = lastname;
                        }
                        sb3.append(str17);
                        bundle4.putString("therapist_name", sb3.toString());
                        bundle4.putString("therapist_uuid", therapistPackagesModel3.getUuid());
                    }
                } else {
                    ml.p pVar6 = this$04.f10739o0;
                    if (pVar6 != null && (wVar5 = pVar6.B) != null && (d14 = wVar5.d()) != null) {
                        StringBuilder sb4 = new StringBuilder("");
                        String firstname2 = d14.getFirstname();
                        if (firstname2 == null) {
                            firstname2 = "";
                        }
                        sb4.append(firstname2);
                        sb4.append(' ');
                        String lastname2 = d14.getLastname();
                        if (lastname2 != null) {
                            str17 = lastname2;
                        }
                        sb4.append(str17);
                        bundle4.putString("psychiatrist_name", sb4.toString());
                        bundle4.putString("psychiatrist_uuid", d14.getUuid());
                    }
                }
                if (z12) {
                    str8 = "therapy";
                } else {
                    str8 = "psychiatry";
                }
                bundle4.putString("flow", str8);
                bundle4.putBoolean("isFirstSession", kotlin.jvm.internal.i.b(str16, "1"));
                bundle4.putString("source", "home_screen");
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle4, "feedback_prompt_click");
                return;
            case 4:
                String key = (String) obj3;
                Goal goal = (Goal) obj2;
                jn.e this$05 = (jn.e) obj;
                int i14 = jn.e.B;
                kotlin.jvm.internal.i.g(key, "$key");
                kotlin.jvm.internal.i.g(goal, "$goal");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                jn.b bVar = new jn.b();
                Bundle a10 = b0.a("key", key);
                a10.putString("goalName", goal.getGoalName());
                a10.putString("goalId", goal.getGoalId());
                a10.putBoolean("isV3Log", z12);
                bVar.setArguments(a10);
                p activity4 = this$05.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                ((ScreenLogsActivity) activity4).s0(bVar);
                return;
            case 5:
                String key2 = (String) obj3;
                FirestoreGoal goal2 = (FirestoreGoal) obj2;
                jn.e this$06 = (jn.e) obj;
                int i15 = jn.e.B;
                kotlin.jvm.internal.i.g(key2, "$key");
                kotlin.jvm.internal.i.g(goal2, "$goal");
                kotlin.jvm.internal.i.g(this$06, "this$0");
                jn.b bVar2 = new jn.b();
                Bundle a11 = b0.a("key", key2);
                a11.putString("goalName", goal2.getGoalName());
                a11.putString("goalId", goal2.getGoalId());
                a11.putBoolean("isV3Log", z12);
                bVar2.setArguments(a11);
                p activity5 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
                ((ScreenLogsActivity) activity5).s0(bVar2);
                return;
            case 6:
                s0 this$07 = (s0) obj2;
                String goalId = (String) obj3;
                ScreenResult16Model model = (ScreenResult16Model) obj;
                int i16 = s0.f19111y;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(goalId, "$goalId");
                kotlin.jvm.internal.i.g(model, "$model");
                try {
                    if (z12) {
                        TemplateActivity templateActivity2 = this$07.f19113v;
                        if (templateActivity2 != null) {
                            templateActivity2.K0(true);
                            TemplateActivity templateActivity3 = this$07.f19113v;
                            if (templateActivity3 != null) {
                                boolean z14 = templateActivity3.K;
                                m0 m0Var = this$07.f19114w;
                                if (z14) {
                                    fm.a aVar3 = (fm.a) m0Var.getValue();
                                    aVar3.f15174h0.e(this$07.getViewLifecycleOwner(), new hr.m0(5, new t0(this$07)));
                                    aVar3.j(model, goalId);
                                    return;
                                }
                                templateActivity3.K = true;
                                fm.a aVar4 = (fm.a) m0Var.getValue();
                                aVar4.f15177k0.e(this$07.getViewLifecycleOwner(), new hr.m0(6, new u0(this$07)));
                                aVar4.h(model, goalId);
                                return;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    TemplateActivity templateActivity4 = this$07.f19113v;
                    if (templateActivity4 != null) {
                        if (templateActivity4.getIntent().hasExtra("source")) {
                            TemplateActivity templateActivity5 = this$07.f19113v;
                            if (templateActivity5 != null) {
                                if (kotlin.jvm.internal.i.b(templateActivity5.getIntent().getStringExtra("source"), "goals")) {
                                    TemplateActivity templateActivity6 = this$07.f19113v;
                                    if (templateActivity6 != null) {
                                        templateActivity6.n0();
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("act");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                        }
                        TemplateActivity templateActivity7 = this$07.f19113v;
                        if (templateActivity7 != null) {
                            templateActivity7.t0();
                            return;
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$07.f19112u, "exception", e11);
                    return;
                }
            case 7:
                w0 this$08 = (w0) obj2;
                ArrayList list = (ArrayList) obj;
                String goalId2 = (String) obj3;
                int i17 = w0.f19314y;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(list, "$list");
                kotlin.jvm.internal.i.g(goalId2, "$goalId");
                try {
                    if (z12) {
                        TemplateActivity templateActivity8 = this$08.f19317w;
                        if (templateActivity8 != null) {
                            templateActivity8.K0(true);
                            long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                            Object obj5 = list.get(0);
                            kotlin.jvm.internal.i.f(obj5, "list[0]");
                            String str19 = (String) obj5;
                            Object obj6 = list.get(1);
                            kotlin.jvm.internal.i.f(obj6, "list[1]");
                            String str20 = (String) obj6;
                            Object obj7 = list.get(2);
                            kotlin.jvm.internal.i.f(obj7, "list[2]");
                            ScreenResult17Model screenResult17Model = new ScreenResult17Model(timeInSeconds, str19, str20, (String) obj7);
                            fm.a aVar5 = (fm.a) this$08.f19316v.getValue();
                            aVar5.h(screenResult17Model, goalId2);
                            aVar5.f15177k0.e(this$08.getViewLifecycleOwner(), new hr.m0(9, new x0(this$08)));
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    p activity6 = this$08.getActivity();
                    kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity6).x0();
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$08.f19315u, "exception in on click listener", e12);
                    return;
                }
            case 8:
                a1 this$09 = (a1) obj2;
                ArrayList list2 = (ArrayList) obj;
                String goalId3 = (String) obj3;
                int i18 = a1.f18121z;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(list2, "$list");
                kotlin.jvm.internal.i.g(goalId3, "$goalId");
                try {
                    if (z12) {
                        TemplateActivity templateActivity9 = this$09.f18124w;
                        if (templateActivity9 != null) {
                            templateActivity9.K0(true);
                            long timeInSeconds2 = Utils.INSTANCE.getTimeInSeconds();
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.i.f(obj8, "list[0]");
                            String str21 = (String) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.i.f(obj9, "list[1]");
                            String str22 = (String) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.i.f(obj10, "list[2]");
                            String str23 = (String) obj10;
                            Object obj11 = list2.get(3);
                            kotlin.jvm.internal.i.f(obj11, "list[3]");
                            ScreenResult18Model screenResult18Model = new ScreenResult18Model(timeInSeconds2, str21, str22, str23, (String) obj11);
                            fm.a aVar6 = (fm.a) this$09.f18123v.getValue();
                            aVar6.h(screenResult18Model, goalId3);
                            aVar6.f15177k0.e(this$09.getViewLifecycleOwner(), new hr.m0(12, new b1(this$09)));
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    TemplateActivity templateActivity10 = this$09.f18124w;
                    if (templateActivity10 != null) {
                        templateActivity10.t0();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$09.f18122u, "exception in on click listener", e13);
                    return;
                }
            case 9:
                d1 this$010 = (d1) obj2;
                ArrayList list3 = (ArrayList) obj;
                String goalId4 = (String) obj3;
                int i19 = d1.f18278y;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(list3, "$list");
                kotlin.jvm.internal.i.g(goalId4, "$goalId");
                try {
                    if (z12) {
                        p requireActivity = this$010.requireActivity();
                        if (requireActivity instanceof TemplateActivity) {
                            templateActivity = (TemplateActivity) requireActivity;
                        }
                        if (templateActivity != null) {
                            templateActivity.K0(true);
                        }
                        long timeInSeconds3 = Utils.INSTANCE.getTimeInSeconds();
                        Object obj12 = list3.get(0);
                        kotlin.jvm.internal.i.f(obj12, "list[0]");
                        String str24 = (String) obj12;
                        Object obj13 = list3.get(1);
                        kotlin.jvm.internal.i.f(obj13, "list[1]");
                        String str25 = (String) obj13;
                        Object obj14 = list3.get(2);
                        kotlin.jvm.internal.i.f(obj14, "list[2]");
                        String str26 = (String) obj14;
                        Object obj15 = list3.get(3);
                        kotlin.jvm.internal.i.f(obj15, "list[3]");
                        Object obj16 = list3.get(4);
                        kotlin.jvm.internal.i.f(obj16, "list[4]");
                        String str27 = (String) obj16;
                        Object obj17 = list3.get(5);
                        kotlin.jvm.internal.i.f(obj17, "list[5]");
                        String str28 = (String) obj17;
                        Object obj18 = list3.get(6);
                        kotlin.jvm.internal.i.f(obj18, "list[6]");
                        ScreenResult19Model screenResult19Model = new ScreenResult19Model(timeInSeconds3, str24, str25, str26, (String) obj15, str27, str28, (String) obj18);
                        fm.a aVar7 = (fm.a) this$010.f18280v.getValue();
                        aVar7.h(screenResult19Model, goalId4);
                        aVar7.f15177k0.e(this$010.getViewLifecycleOwner(), new hr.m0(15, new e1(this$010)));
                        return;
                    }
                    p activity7 = this$010.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity7).t0();
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(this$010.f18279u, "exception in on click listener", e14);
                    return;
                }
            case 10:
                m1 this$011 = (m1) obj2;
                List list4 = (List) obj;
                String goalId5 = (String) obj3;
                int i20 = m1.f18785z;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(list4, "$list");
                kotlin.jvm.internal.i.g(goalId5, "$goalId");
                if (z12) {
                    TemplateActivity templateActivity11 = this$011.f18788w;
                    if (templateActivity11 != null) {
                        templateActivity11.K0(true);
                        fm.a aVar8 = (fm.a) this$011.f18787v.getValue();
                        aVar8.f15182p0.e(this$011.getViewLifecycleOwner(), new hr.m0(22, new n1(this$011)));
                        v.H(kc.f.H(aVar8), null, 0, new z(aVar8, list4, goalId5, null), 3);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                TemplateActivity templateActivity12 = this$011.f18788w;
                if (templateActivity12 != null) {
                    templateActivity12.x0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 11:
                w1 this$012 = (w1) obj2;
                String goalId6 = (String) obj3;
                ScreenResult22Model model2 = (ScreenResult22Model) obj;
                int i21 = w1.f19329z;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(goalId6, "$goalId");
                kotlin.jvm.internal.i.g(model2, "$model");
                TemplateActivity templateActivity13 = this$012.f19333x;
                if (templateActivity13 != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity13.B0(), "r22-b")) {
                        if (z12) {
                            TemplateActivity templateActivity14 = this$012.f19333x;
                            if (templateActivity14 != null) {
                                templateActivity14.K0(true);
                                TemplateActivity templateActivity15 = this$012.f19333x;
                                if (templateActivity15 != null) {
                                    boolean z15 = templateActivity15.K;
                                    m0 m0Var2 = this$012.f19332w;
                                    if (z15) {
                                        fm.a aVar9 = (fm.a) m0Var2.getValue();
                                        aVar9.j(model2, goalId6);
                                        aVar9.f15174h0.e(this$012.getViewLifecycleOwner(), new hr.m0(27, new x1(this$012)));
                                        return;
                                    }
                                    templateActivity15.K = true;
                                    fm.a aVar10 = (fm.a) m0Var2.getValue();
                                    aVar10.h(model2, goalId6);
                                    aVar10.f15177k0.e(this$012.getViewLifecycleOwner(), new hr.m0(28, new y1(this$012)));
                                    return;
                                }
                                kotlin.jvm.internal.i.q("act");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        p activity8 = this$012.getActivity();
                        kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity8).t0();
                        return;
                    }
                    TemplateActivity templateActivity16 = this$012.f19333x;
                    if (templateActivity16 != null) {
                        templateActivity16.t0();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 12:
                a();
                return;
            case 13:
                b();
                return;
            case 14:
                m3 this$013 = (m3) obj2;
                List list5 = (List) obj;
                String goalId7 = (String) obj3;
                int i22 = m3.f18806z;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(list5, "$list");
                kotlin.jvm.internal.i.g(goalId7, "$goalId");
                if (z12) {
                    TemplateActivity templateActivity17 = this$013.f18809w;
                    if (templateActivity17 != null) {
                        templateActivity17.K0(true);
                        fm.a aVar11 = (fm.a) this$013.f18808v.getValue();
                        aVar11.f15182p0.e(this$013.getViewLifecycleOwner(), new a2(26, new n3(this$013)));
                        v.H(kc.f.H(aVar11), null, 0, new z(aVar11, list5, goalId7, null), 3);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                TemplateActivity templateActivity18 = this$013.f18809w;
                if (templateActivity18 != null) {
                    templateActivity18.t0();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 15:
                c();
                return;
            default:
                d();
                return;
        }
    }

    public /* synthetic */ k(w1 w1Var, ScreenResult22Model screenResult22Model, String str, boolean z10) {
        this.f39454u = 11;
        this.f39458y = w1Var;
        this.f39455v = z10;
        this.f39457x = str;
        this.f39456w = screenResult22Model;
    }

    public /* synthetic */ k(String str, Object obj, boolean z10, jn.e eVar, int i6) {
        this.f39454u = i6;
        this.f39457x = str;
        this.f39458y = obj;
        this.f39455v = z10;
        this.f39456w = eVar;
    }

    public /* synthetic */ k(boolean z10, Object obj, Object obj2, Object obj3, int i6) {
        this.f39454u = i6;
        this.f39455v = z10;
        this.f39457x = obj;
        this.f39458y = obj2;
        this.f39456w = obj3;
    }

    public /* synthetic */ k(boolean z10, Object obj, String str, Serializable serializable, int i6) {
        this.f39454u = i6;
        this.f39455v = z10;
        this.f39458y = obj;
        this.f39457x = str;
        this.f39456w = serializable;
    }

    public /* synthetic */ k(boolean z10, rr.b bVar, List list, String str, int i6) {
        this.f39454u = i6;
        this.f39455v = z10;
        this.f39458y = bVar;
        this.f39456w = list;
        this.f39457x = str;
    }
}
