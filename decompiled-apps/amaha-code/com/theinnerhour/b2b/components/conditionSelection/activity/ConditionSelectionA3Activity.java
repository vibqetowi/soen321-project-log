package com.theinnerhour.b2b.components.conditionSelection.activity;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DeepLinkActivationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationInterface;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import gv.n;
import hs.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import jl.q;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import qn.c;
import r1.b0;
import tr.r;
import zk.d;
import zk.g;
import zk.h;
import zk.j;
import zk.l;
/* compiled from: ConditionSelectionA3Activity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/components/conditionSelection/activity/ConditionSelectionA3Activity;", "Lrr/a;", "Lcom/theinnerhour/b2b/utils/CourseApiUtil$CourseApiUtilInterface;", "Lal/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ConditionSelectionA3Activity extends rr.a implements CourseApiUtil.CourseApiUtilInterface, al.a {
    public String A;
    public Dialog B;
    public final i C;
    public final boolean D;
    public String E;

    /* renamed from: w  reason: collision with root package name */
    public final String f10641w;

    /* renamed from: x  reason: collision with root package name */
    public int f10642x;

    /* renamed from: y  reason: collision with root package name */
    public String f10643y;

    /* renamed from: z  reason: collision with root package name */
    public View f10644z;

    /* compiled from: ConditionSelectionA3Activity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f10645u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final Boolean invoke() {
            Object obj;
            HashMap<String, Object> appConfig;
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (appConfig = user.getAppConfig()) != null) {
                obj = appConfig.get(Constants.NEW_COURSES_EXPERIMENT);
            } else {
                obj = null;
            }
            return Boolean.valueOf(kotlin.jvm.internal.i.b(obj, "variant_a"));
        }
    }

    public ConditionSelectionA3Activity() {
        ArrayList<MiniCourse> arrayList;
        boolean z10;
        new LinkedHashMap();
        this.f10641w = LogHelper.INSTANCE.makeLogTag(ConditionSelectionA3Activity.class);
        this.f10643y = "";
        this.A = "";
        this.C = sp.b.O(a.f10645u);
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            arrayList = user.getMiniCourses();
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.D = z10;
    }

    @Override // al.a
    public final void Z(View view, String str) {
        this.f10643y = str;
        this.f10644z = view;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void courseApiComplete(boolean z10) {
        Bundle bundle;
        try {
            x0();
            Intent a10 = new ll.b().a(this, true);
            Intent intent = getIntent();
            if (intent == null || (bundle = intent.getExtras()) == null) {
                bundle = new Bundle();
            }
            bundle.putString(Constants.A3_OFFERING_FLOW_FLAG, this.A);
            a10.putExtras(bundle);
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                a10.putExtra(Constants.NEW_COURSE_FLAG, true);
            }
            startActivity(a10);
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, "exception", e10);
        }
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void errorLoadingData(Exception error) {
        d dVar;
        kotlin.jvm.internal.i.g(error, "error");
        try {
            Toast.makeText(this, "Oops! Please try again", 0).show();
            Fragment F = getSupportFragmentManager().F("currFrag");
            if (F instanceof d) {
                dVar = (d) F;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clA3OfferingSelectionSelfHelpLoader);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clA3OfferingSelectionProfessionalHelpLoader);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
                dVar.f39427u = false;
            }
            x0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, "exception in on error loading data", e10);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        x0();
        v0();
        super.finish();
    }

    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.D) {
            if (this.f10642x == 2) {
                ApplicationPersistence.getInstance().deleteKey("a3_onboarding_course");
                String str = gk.a.f16573a;
                Bundle a10 = b0.a("a3_variant", Constants.ONBOARDING_VARIANT);
                a10.putString("course", this.f10643y);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, "onboarding_offering_back");
                this.f10642x--;
                y0();
            }
        } else if (this.f10642x == 1) {
            this.f10642x = 0;
            z0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        try {
            super.onCreate(bundle);
            setContentView(R.layout.activity_condition_selection_a3);
            Dialog dialog = UiUtils.Companion.getDialog(R.layout.popup_loading_dots, this);
            int i6 = 0;
            dialog.setCanceledOnTouchOutside(false);
            dialog.setCancelable(false);
            this.B = dialog;
            this.E = getIntent().getStringExtra("source");
            v0();
            Utils.INSTANCE.updateFirebaseInstanceId();
            LocationPersistence.INSTANCE.fetchLocationInfo(new b());
            InsetsUtils.INSTANCE.setStatusBarColor(R.color.transparent, this, true, true);
            String str2 = "";
            if (this.D) {
                ApplicationPersistence.getInstance().setBooleanValue("add_a3_variant_on_assessment", true);
                if (ApplicationPersistence.getInstance().getBooleanValue("a3_intro_skip", false)) {
                    i6 = 1;
                }
                this.f10642x = i6;
                if (!kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue(Constants.DYNAMIC_SIGNUP_LINK), "")) {
                    startActivity(new Intent(this, DeepLinkActivationActivity.class));
                }
                y0();
                return;
            }
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getStringExtra("preSelectedCourse");
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            this.f10643y = str2;
            if (!n.B0(str2)) {
                this.f10642x++;
            }
            z0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, e10);
        }
    }

    @Override // rr.a
    public final void t0() {
        try {
            this.f10642x++;
            if (this.D) {
                y0();
            } else {
                z0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, e10);
        }
    }

    public final void u0() {
        Bundle bundle;
        try {
            Utils.INSTANCE.cancelNotifications();
            if (is.k.Q1(this.f10643y, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null) {
                    user.setCurrentCourseName(this.f10643y);
                }
                User user2 = firebasePersistence.getUser();
                if (user2 != null) {
                    user2.setCurrentCourse(UtilsKt.getCourseId(this.f10643y));
                }
                firebasePersistence.updateUserOnFirebase();
                if (kotlin.jvm.internal.i.b(this.f10643y, Constants.COURSE_ADHD)) {
                    firebasePersistence.setIsAdhdCourseActive();
                } else if (kotlin.jvm.internal.i.b(this.f10643y, Constants.COURSE_OCD)) {
                    firebasePersistence.setIsOcdCourseActive();
                }
                Intent a10 = new ll.b().a(this, true);
                Intent intent = getIntent();
                if (intent == null || (bundle = intent.getExtras()) == null) {
                    bundle = new Bundle();
                }
                bundle.putString(Constants.A3_OFFERING_FLOW_FLAG, this.A);
                a10.putExtras(bundle);
                User user3 = FirebasePersistence.getInstance().getUser();
                if (user3 != null && user3.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !kotlin.jvm.internal.i.b(user3.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
                    a10.putExtra(Constants.NEW_COURSE_FLAG, true);
                }
                startActivity(a10);
                finish();
                return;
            }
            CourseApiUtil courseApiUtil = new CourseApiUtil();
            courseApiUtil.setCourseApiListener(this);
            CourseApiUtil.sendCourseApiRequest$default(courseApiUtil, this.f10643y, null, 2, null);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0002, B:5:0x0010, B:11:0x001c), top: B:16:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0() {
        boolean z10;
        try {
            FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
            String version = firebasePersistence.getUser().getVersion();
            if (version != null && !n.B0(version)) {
                z10 = false;
                if (!z10) {
                    User user = firebasePersistence.getUser();
                    user.setVersion(Constants.USER_VERSION);
                    HashMap<String, Object> appConfig = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig, "appConfig");
                    appConfig.put(Constants.ONBOARDING_EXPERIMENT, Constants.ONBOARDING_VARIANT);
                    HashMap<String, Object> appConfig2 = user.getAppConfig();
                    kotlin.jvm.internal.i.f(appConfig2, "appConfig");
                    appConfig2.put(Constants.A3_ONBOARDING_REVAMP, "default");
                    firebasePersistence.updateUserOnFirebase();
                    startActivity(r.r(this));
                    finish();
                    return;
                }
                return;
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, e10);
        }
    }

    public final void w0(String course) {
        kotlin.jvm.internal.i.g(course, "course");
        if (!((Boolean) this.C.getValue()).booleanValue()) {
            String str = gk.a.f16573a;
            Bundle f = e.f("a3_variant", Constants.ONBOARDING_VARIANT, "course", course);
            Intent intent = getIntent();
            boolean z10 = false;
            if (intent != null) {
                z10 = intent.getBooleanExtra("reset_flag", false);
            }
            f.putBoolean("reset_flow", z10);
            f.putString("source", this.E);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(f, "pre_domain_selection_new");
        }
        this.f10643y = course;
        ApplicationPersistence.getInstance().setBooleanValue("a3_var_b_assessment", true);
        this.A = "self_help";
        u0();
    }

    public final void x0() {
        Dialog dialog = this.B;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void y0() {
        Fragment hVar;
        try {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            int i6 = this.f10642x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        hVar = null;
                    } else if (((Boolean) this.C.getValue()).booleanValue()) {
                        hVar = new g();
                        Bundle bundle = new Bundle();
                        bundle.putString("selectedCourse", this.f10643y);
                        hVar.setArguments(bundle);
                    } else {
                        hVar = new d();
                    }
                } else {
                    hVar = new zk.b();
                }
            } else {
                hVar = new h();
            }
            if (hVar != null) {
                aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
                aVar.f(R.id.fragmentContainer, hVar, "currFrag");
                aVar.j();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, e10);
        }
    }

    public final void z0() {
        Fragment jVar;
        try {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            int i6 = this.f10642x;
            int i10 = R.color.transparent;
            if (i6 == 0) {
                InsetsUtils.INSTANCE.setStatusBarColor(R.color.transparent, this, true, true);
                jVar = new l();
                Bundle bundle = new Bundle();
                bundle.putBoolean("existingUser", true);
                bundle.putString("source", this.E);
                jVar.setArguments(bundle);
            } else {
                InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
                String str = this.f10643y;
                switch (str.hashCode()) {
                    case -2114782937:
                        if (!str.equals(Constants.COURSE_HAPPINESS)) {
                            break;
                        } else {
                            i10 = R.color.csaHappinessBg;
                            break;
                        }
                    case -1617042330:
                        if (!str.equals(Constants.COURSE_DEPRESSION)) {
                            break;
                        } else {
                            i10 = R.color.csaDepressionBg;
                            break;
                        }
                    case -891989580:
                        if (!str.equals(Constants.COURSE_STRESS)) {
                            break;
                        } else {
                            i10 = R.color.csaStressBg;
                            break;
                        }
                    case 92960775:
                        if (!str.equals(Constants.COURSE_ANGER)) {
                            break;
                        } else {
                            i10 = R.color.csaAngerBg;
                            break;
                        }
                    case 109522647:
                        if (!str.equals(Constants.COURSE_SLEEP)) {
                            break;
                        } else {
                            i10 = R.color.csaSleepBg;
                            break;
                        }
                    case 113319009:
                        if (!str.equals(Constants.COURSE_WORRY)) {
                            break;
                        } else {
                            i10 = R.color.csaAnxietyBg;
                            break;
                        }
                }
                insetsUtils.setStatusBarColor(i10, this, true, true);
                jVar = new j();
                Bundle bundle2 = new Bundle();
                bundle2.putString("selectedCourse", this.f10643y);
                bundle2.putBoolean("existingUser", true);
                bundle2.putString("source", this.E);
                jVar.setArguments(bundle2);
            }
            aVar.h(R.anim.fade_in_activity, R.anim.fade_out_activity, 0, 0);
            View view = this.f10644z;
            if (view != null) {
                aVar.c(view, this.f10643y);
                this.f10644z = null;
            }
            aVar.f(R.id.fragmentContainer, jVar, "currFrag");
            aVar.j();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10641w, e10);
        }
    }

    /* compiled from: ConditionSelectionA3Activity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements LocationInterface {
        public b() {
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchSuccess() {
            c cVar = new c();
            ConditionSelectionA3Activity conditionSelectionA3Activity = ConditionSelectionA3Activity.this;
            Application application = conditionSelectionA3Activity.getApplication();
            kotlin.jvm.internal.i.f(application, "application");
            ((MonetizationViewModel) new o0(conditionSelectionA3Activity, new q(application, (String) null, cVar)).a(MonetizationViewModel.class)).f();
        }

        @Override // com.theinnerhour.b2b.persistence.LocationInterface
        public final void locationFetchFailure() {
        }
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void audioDownloadComplete() {
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void notificationFetchComplete(boolean z10) {
    }
}
