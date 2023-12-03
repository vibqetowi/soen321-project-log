package am;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.a1;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.remoteconfig.internal.a;
import com.moengage.pushbase.internal.activity.PermissionActivity;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.activity.T8Activity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CommunityOnBoardingWelcomeActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NewDashboardSavedItemsActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4RecentActivity;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertCareInfoActivity;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.login.fragment.SSOFragment;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.SocialSignupModel;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProTakeAssessmentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.network.model.RequestStatus;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import e4.l;
import fm.t1;
import fq.e1;
import hh.g;
import hn.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import je.g0;
import je.q0;
import jl.k0;
import ke.l;
import lj.j;
import ne.s;
import org.json.JSONObject;
import q7.k;
import re.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements l.b, ya.b, a.InterfaceC0519a, oe.l, oe.i, s.a, ya.g, androidx.activity.result.b, a1.a, d.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f670u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f671v;

    public /* synthetic */ w(int i6, Object obj) {
        this.f670u = i6;
        this.f671v = obj;
    }

    private final void d(re.b bVar) {
        ge.d dVar = (ge.d) this.f671v;
        synchronized (dVar) {
            dVar.f16463w = (gd.b) bVar.get();
            dVar.K();
            dVar.f16463w.b(dVar.f16462v);
        }
    }

    @Override // e4.l.b
    public void a(Object obj) {
        int i6 = this.f670u;
        Object obj2 = this.f671v;
        switch (i6) {
            case 0:
                V2GoalsActivity this$0 = (V2GoalsActivity) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                int i10 = V2GoalsActivity.Q;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String str = this$0.f11173v;
                    logHelper.i(str, "response from cloud functions " + jSONObject);
                    Toast.makeText(this$0, this$0.getString(R.string.feedback_submit_toast), 0).show();
                    ProgressDialog progressDialog = this$0.H;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                } catch (Exception unused) {
                    LogHelper.INSTANCE.e("dashboardactivity", "exception in success sendfeedback");
                    return;
                }
            case 1:
                V3GoalsActivity this$02 = (V3GoalsActivity) obj2;
                JSONObject jSONObject2 = (JSONObject) obj;
                int i11 = V3GoalsActivity.X;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                try {
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    String str2 = this$02.f11187v;
                    logHelper2.i(str2, "response from cloud functions " + jSONObject2);
                    Toast.makeText(this$02, this$02.getString(R.string.feedback_submit_toast), 0).show();
                    ProgressDialog progressDialog2 = this$02.D;
                    if (progressDialog2 != null) {
                        progressDialog2.dismiss();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                } catch (Exception unused2) {
                    LogHelper.INSTANCE.e("dashboardactivity", "exception in success sendfeedback");
                    return;
                }
            case 2:
                ProInitialAssessmentActivity this$03 = (ProInitialAssessmentActivity) obj2;
                JSONObject response = (JSONObject) obj;
                int i12 = ProInitialAssessmentActivity.G;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                try {
                    RequestStatus requestStatus = RequestStatus.REQUEST_SUCCESS;
                    kotlin.jvm.internal.i.g(requestStatus, "<set-?>");
                    this$03.C = requestStatus;
                    kotlin.jvm.internal.i.f(response, "response");
                    this$03.D = response;
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    firebasePersistence.getUser().getCoachModelInfo().setAssessmentDone(true);
                    firebasePersistence.updateUserOnFirebase();
                    this$03.E = true;
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$03.f11516w, "exception in my therapist response", e10);
                    return;
                }
            case 3:
                ho.v this$04 = (ho.v) obj2;
                JSONObject response2 = (JSONObject) obj;
                int i13 = ho.v.f18061x;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                try {
                    kotlin.jvm.internal.i.f(response2, "response");
                    this$04.J(response2);
                    return;
                } catch (Exception e11) {
                    ProTakeAssessmentActivity proTakeAssessmentActivity = this$04.f18063v;
                    if (proTakeAssessmentActivity != null) {
                        proTakeAssessmentActivity.finish();
                        LogHelper.INSTANCE.e(this$04.f18062u, e11);
                        return;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                CourseApiUtil.getAssets$lambda$6((CourseApiUtil) obj2, (JSONObject) obj);
                return;
        }
    }

    @Override // oe.i
    public Object apply(Object obj) {
        int i6 = this.f670u;
        Object obj2 = this.f671v;
        switch (i6) {
            case 4:
                g0 g0Var = (g0) obj2;
                Cursor cursor = (Cursor) obj;
                g0Var.getClass();
                return g0Var.g(cursor.getBlob(0), cursor.getInt(1));
            default:
                q0 q0Var = (q0) obj2;
                Cursor cursor2 = (Cursor) obj;
                q0Var.getClass();
                return q0Var.k(cursor2.getBlob(1), cursor2.getInt(0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // androidx.activity.result.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Object obj) {
        il.b bVar;
        Bundle extras;
        kotlinx.coroutines.flow.x xVar;
        FirestoreGoal firestoreGoal;
        hn.q qVar;
        i9.b bVar2;
        ya.v d10;
        LoginSignupFlow loginSignupFlow;
        GoogleSignInAccount googleSignInAccount;
        boolean z10;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        Intent intent;
        String str;
        AppCompatImageView appCompatImageView;
        ShimmerFrameLayout shimmerFrameLayout;
        AppCompatImageView appCompatImageView2;
        int i6;
        boolean z11;
        Bundle extras2;
        Intent intent2;
        String stringExtra;
        int i10 = this.f670u;
        RobertoTextView robertoTextView4 = null;
        Bundle bundle = null;
        String str2 = null;
        boolean z12 = true;
        boolean z13 = false;
        Object obj2 = this.f671v;
        switch (i10) {
            case 10:
                PermissionActivity this$0 = (PermissionActivity) obj2;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = PermissionActivity.f10225x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    bh.b.a().execute(new Runnable() { // from class: kj.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z14 = booleanValue;
                            try {
                                Iterator it = j.f24393a.iterator();
                                while (it.hasNext()) {
                                    bh.b.f4298b.post(new k(1, (oj.a) it.next(), z14));
                                }
                            } catch (Throwable th2) {
                                hh.a aVar = hh.g.f17610d;
                                g.a.a(1, th2, c.f23365u);
                            }
                        }
                    });
                    if (booleanValue) {
                        hh.a aVar = hh.g.f17610d;
                        g.a.b(0, new hj.c(this$0), 3);
                        Context applicationContext = this$0.getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext, "applicationContext");
                        kj.f.b(applicationContext, this$0.getIntent().getExtras());
                    } else {
                        hh.a aVar2 = hh.g.f17610d;
                        g.a.b(0, new hj.d(this$0), 3);
                        Context applicationContext2 = this$0.getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext2, "applicationContext");
                        kj.f.a(applicationContext2, this$0.getIntent().getExtras());
                    }
                    g.a.b(0, new hj.e(this$0), 3);
                    this$0.finish();
                    return;
                } catch (Throwable th2) {
                    hh.a aVar3 = hh.g.f17610d;
                    g.a.a(1, th2, new hj.f(this$0));
                    return;
                }
            case 11:
            case 16:
            case 24:
            default:
                op.a this$02 = (op.a) obj2;
                androidx.activity.result.a aVar4 = (androidx.activity.result.a) obj;
                int i12 = op.a.D;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                yn.a aVar5 = this$02.f27696w;
                aVar5.getClass();
                if (!yn.a.b()) {
                    hs.f<Boolean, Boolean> a10 = aVar5.a(false);
                    if (a10.f19464u.booleanValue() || a10.f19465v.booleanValue()) {
                        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                        xVar2.f23469u = new NotificationPermissionBottomSheet("bookings", a10, "teleconsultation", this$02.f27696w, new op.f(xVar2));
                        androidx.fragment.app.y childFragmentManager = this$02.getChildFragmentManager();
                        androidx.fragment.app.a l2 = defpackage.e.l(childFragmentManager, childFragmentManager);
                        l2.f2205p = true;
                        l2.e(0, (Fragment) xVar2.f23469u, "permission", 1);
                        l2.k();
                    }
                }
                if (aVar4.f976u == -1) {
                    Intent intent3 = aVar4.f977v;
                    if (((intent3 == null || !intent3.getBooleanExtra("expert_payment_done", false)) ? false : false) && (bVar = this$02.A) != null) {
                        bVar.e();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                CommunityOnBoardingWelcomeActivity this$03 = (CommunityOnBoardingWelcomeActivity) obj2;
                androidx.activity.result.a result = (androidx.activity.result.a) obj;
                int i13 = CommunityOnBoardingWelcomeActivity.f10800z;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.f(result, "result");
                try {
                    if (result.f976u == -1) {
                        Intent intent4 = result.f977v;
                        if (intent4 != null && (extras = intent4.getExtras()) != null && extras.getBoolean("ACTIVITY_SUCCESS")) {
                            z13 = true;
                        }
                        if (z13) {
                            Intent intent5 = new Intent();
                            intent5.putExtra("ACTIVITY_SUCCESS", true);
                            this$03.setResult(-1, intent5);
                        }
                    }
                    this$03.finish();
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$03.f10801v, e10);
                    return;
                }
            case 13:
                NewDashboardSavedItemsActivity this$04 = (NewDashboardSavedItemsActivity) obj2;
                androidx.activity.result.a aVar6 = (androidx.activity.result.a) obj;
                int i14 = NewDashboardSavedItemsActivity.D;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                try {
                    CardView cardView = (CardView) this$04.u0(R.id.cvSiLoader);
                    if (cardView != null) {
                        cardView.setVisibility(0);
                    }
                    RecyclerView recyclerView = (RecyclerView) this$04.u0(R.id.rvSiItemsRecycler);
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                    this$04.f10819y.clear();
                    this$04.f10820z.clear();
                    k0 k0Var = this$04.f10818x;
                    if (k0Var != null) {
                        xVar = k0Var.A;
                    } else {
                        xVar = null;
                    }
                    if (xVar != null) {
                        xVar.setValue(0L);
                    }
                    k0 k0Var2 = this$04.f10818x;
                    if (k0Var2 != null) {
                        ta.v.H(kc.f.H(k0Var2), null, 0, new jl.e0(k0Var2, null), 3);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$04.f10817w, e11);
                    return;
                }
            case 14:
                NotV4RecentActivity this$05 = (NotV4RecentActivity) obj2;
                androidx.activity.result.a aVar7 = (androidx.activity.result.a) obj;
                int i15 = NotV4RecentActivity.A;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (this$05.f10837w != null) {
                    this$05.n0(false);
                    return;
                }
                return;
            case 15:
                hl.l this$06 = (hl.l) obj2;
                androidx.activity.result.a aVar8 = (androidx.activity.result.a) obj;
                int i16 = hl.l.f17706x;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                CardView cardView2 = (CardView) this$06._$_findCachedViewById(R.id.dynamicCardContainer);
                if (cardView2 != null) {
                    cardView2.setVisibility(8);
                    return;
                }
                return;
            case 17:
                tl.q this$07 = (tl.q) obj2;
                androidx.activity.result.a aVar9 = (androidx.activity.result.a) obj;
                int i17 = tl.q.K;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                if (aVar9.f976u == -1) {
                    Intent intent6 = aVar9.f977v;
                    if ((intent6 == null || !intent6.getBooleanExtra("expert_payment_done", false)) ? false : false) {
                        this$07.requireActivity().finish();
                        return;
                    }
                    return;
                }
                return;
            case 18:
                cm.l this$08 = (cm.l) obj2;
                androidx.activity.result.a aVar10 = (androidx.activity.result.a) obj;
                int i18 = cm.l.B;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (!ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                    ApplicationPersistence.getInstance().setBooleanValue("clickable_goal_info", true);
                }
                if (aVar10.f976u == -1 && (firestoreGoal = this$08.f5359y) != null) {
                    fm.a aVar11 = this$08.f5357w;
                    if (aVar11 != null) {
                        aVar11.y(true);
                    }
                    long j10 = -1;
                    Intent intent7 = aVar10.f977v;
                    if (intent7 != null) {
                        j10 = intent7.getLongExtra("task_completion_seconds", -1L);
                    }
                    fm.a aVar12 = this$08.f5357w;
                    if (aVar12 != null) {
                        aVar12.B(firestoreGoal, true, Long.valueOf(j10));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                cm.c0 this$09 = (cm.c0) obj2;
                androidx.activity.result.a aVar13 = (androidx.activity.result.a) obj;
                int i19 = cm.c0.J;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                t1 t1Var = this$09.f5317v;
                if (t1Var != null) {
                    V3GoalsActivity v3GoalsActivity = this$09.f5318w;
                    if (v3GoalsActivity != null) {
                        t1Var.e(v3GoalsActivity.s0());
                        return;
                    } else {
                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                        throw null;
                    }
                }
                return;
            case 20:
                nm.a this$010 = (nm.a) obj2;
                androidx.activity.result.a aVar14 = (androidx.activity.result.a) obj;
                int i20 = nm.a.f26387z;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                this$010.F();
                return;
            case 21:
                LoginSignupReworkActivity this$011 = (LoginSignupReworkActivity) obj2;
                androidx.activity.result.a aVar15 = (androidx.activity.result.a) obj;
                int i21 = LoginSignupReworkActivity.C;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                if (aVar15.f976u == -1 && (qVar = this$011.f11310w) != null) {
                    y9.a aVar16 = j9.l.f21764a;
                    Intent intent8 = aVar15.f977v;
                    if (intent8 == null) {
                        bVar2 = new i9.b(null, Status.B);
                    } else {
                        Status status = (Status) intent8.getParcelableExtra("googleSignInStatus");
                        GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent8.getParcelableExtra("googleSignInAccount");
                        if (googleSignInAccount2 == null) {
                            if (status == null) {
                                status = Status.B;
                            }
                            bVar2 = new i9.b(null, status);
                        } else {
                            bVar2 = new i9.b(googleSignInAccount2, Status.f7296z);
                        }
                    }
                    Status status2 = bVar2.f19917u;
                    if (status2.f0() && (googleSignInAccount = bVar2.f19918v) != null) {
                        d10 = ya.k.e(googleSignInAccount);
                    } else {
                        d10 = ya.k.d(f6.b.x0(status2));
                    }
                    GoogleSignInAccount googleSignInAccount3 = (GoogleSignInAccount) d10.getResult(ApiException.class);
                    String str3 = googleSignInAccount3.f7218w;
                    String str4 = googleSignInAccount3.A;
                    String str5 = googleSignInAccount3.f7219x;
                    kotlin.jvm.internal.i.d(str5);
                    if (qVar.l()) {
                        loginSignupFlow = LoginSignupFlow.SIGN_UP_GOOGLE;
                    } else {
                        loginSignupFlow = LoginSignupFlow.SIGN_IN_GOOGLE;
                    }
                    qVar.v(new SocialSignupModel("https://api.theinnerhour.com/omniauth/google_oauth2/callback", null, str3, str4, str5, loginSignupFlow));
                    return;
                }
                return;
            case 22:
                SSOFragment this$012 = (SSOFragment) obj2;
                androidx.activity.result.a aVar17 = (androidx.activity.result.a) obj;
                int i22 = SSOFragment.A;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                if (aVar17 != null && aVar17.f976u == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hn.q F = this$012.F();
                    Intent intent9 = aVar17.f977v;
                    if (intent9 != null) {
                        str = intent9.getStringExtra(Constants.NOTIFICATION_URL);
                    } else {
                        str = null;
                    }
                    F.getClass();
                    F.Z = LoginSignupFlow.SSO;
                    ta.v.H(kc.f.H(F), null, 0, new h0(F, str, null), 3);
                    return;
                }
                if ((aVar17 == null || (intent = aVar17.f977v) == null || !intent.hasExtra("error")) ? false : false) {
                    yp.h hVar = this$012.f11362w;
                    if (hVar != null) {
                        robertoTextView2 = hVar.f38805e;
                    } else {
                        robertoTextView2 = null;
                    }
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(0);
                    }
                    yp.h hVar2 = this$012.f11362w;
                    if (hVar2 != null) {
                        robertoTextView3 = hVar2.f38805e;
                    } else {
                        robertoTextView3 = null;
                    }
                    if (robertoTextView3 != null) {
                        Intent intent10 = aVar17.f977v;
                        if (intent10 != null) {
                            str2 = intent10.getStringExtra("error");
                        }
                        robertoTextView3.setText(str2);
                    }
                    this$012.F().F.l(LoginLoading.HIDE_LOADING);
                    return;
                }
                yp.h hVar3 = this$012.f11362w;
                if (hVar3 != null) {
                    robertoTextView = hVar3.f38805e;
                } else {
                    robertoTextView = null;
                }
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(0);
                }
                yp.h hVar4 = this$012.f11362w;
                if (hVar4 != null) {
                    robertoTextView4 = hVar4.f38805e;
                }
                if (robertoTextView4 != null) {
                    robertoTextView4.setText(this$012.getString(R.string.invalid_email));
                }
                this$012.F().F.l(LoginLoading.HIDE_LOADING);
                return;
            case 23:
                tn.b this$013 = (tn.b) obj2;
                androidx.activity.result.a aVar18 = (androidx.activity.result.a) obj;
                int i23 = tn.b.f33329z;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                Intent intent11 = aVar18.f977v;
                if (intent11 != null) {
                    bundle = intent11.getExtras();
                }
                if (bundle != null) {
                    int intValue = Integer.valueOf(bundle.getInt("mood")).intValue();
                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_tracker_check, this$013.getActivity(), R.style.Theme_Dialog_Fullscreen);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(R.id.trackerCheckAnimation);
                    CardView cardView3 = (CardView) styledDialog.findViewById(R.id.trackerCardCheck);
                    if (Build.VERSION.SDK_INT < 25) {
                        if (lottieAnimationView != null) {
                            lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                        }
                    } else if (lottieAnimationView != null) {
                        lottieAnimationView.setRenderMode(a3.t.HARDWARE);
                    }
                    androidx.fragment.app.p requireActivity = this$013.requireActivity();
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue != 4) {
                                    if (intValue == 5) {
                                        i6 = R.color.trackerYellow;
                                    }
                                } else {
                                    i6 = R.color.trackerBlue;
                                }
                            } else {
                                i6 = R.color.trackerPink;
                            }
                        } else {
                            i6 = R.color.trackerPurple;
                        }
                        cardView3.setCardBackgroundColor(g0.a.b(requireActivity, i6));
                        lottieAnimationView.c(new tn.d(styledDialog, lottieAnimationView));
                        styledDialog.setCancelable(false);
                        styledDialog.show();
                        lottieAnimationView.h();
                        this$013.f33330u.getClass();
                        if (!yn.a.b()) {
                            new Handler(Looper.getMainLooper()).postDelayed(new tl.o(10, this$013), 2000L);
                        }
                    }
                    i6 = R.color.trackerGrey;
                    cardView3.setCardBackgroundColor(g0.a.b(requireActivity, i6));
                    lottieAnimationView.c(new tn.d(styledDialog, lottieAnimationView));
                    styledDialog.setCancelable(false);
                    styledDialog.show();
                    lottieAnimationView.h();
                    this$013.f33330u.getClass();
                    if (!yn.a.b()) {
                    }
                }
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_TRACKER, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_TRACKER, true);
                    this$013.F();
                    return;
                } else if (aVar18.f976u == -1 && SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    yp.e eVar = this$013.f33332w;
                    if ((eVar == null || (appCompatImageView2 = eVar.f38762b) == null || Extensions.INSTANCE.isVisible(appCompatImageView2)) ? false : false) {
                        yp.e eVar2 = this$013.f33332w;
                        if (eVar2 != null && (shimmerFrameLayout = eVar2.f38761a) != null) {
                            Extensions.INSTANCE.gone(shimmerFrameLayout);
                        }
                        yp.e eVar3 = this$013.f33332w;
                        if (eVar3 != null && (appCompatImageView = eVar3.f38762b) != null) {
                            Extensions.INSTANCE.visible(appCompatImageView);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 25:
                bo.e this$014 = (bo.e) obj2;
                androidx.activity.result.a aVar19 = (androidx.activity.result.a) obj;
                int i24 = bo.e.C;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                String str6 = this$014.f4566u;
                try {
                    if (aVar19.f976u == -1) {
                        Intent intent12 = aVar19.f977v;
                        if (intent12 != null && intent12.getBooleanExtra("expert_payment_done", false)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            ll.b bVar3 = new ll.b();
                            androidx.fragment.app.p requireActivity2 = this$014.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                            Intent a11 = bVar3.a(requireActivity2, true);
                            Intent intent13 = this$014.requireActivity().getIntent();
                            if (intent13 != null && (extras2 = intent13.getExtras()) != null) {
                                a11.putExtras(extras2);
                            }
                            this$014.startActivity(a11);
                            return;
                        }
                    }
                    try {
                        if (!this$014.f4570y) {
                            this$014.f4570y = true;
                            ConstraintLayout constraintLayout = (ConstraintLayout) this$014._$_findCachedViewById(R.id.clMatchingResultGoToDashboardContainer);
                            if (constraintLayout != null) {
                                constraintLayout.setVisibility(0);
                            }
                            ((RobertoButton) this$014._$_findCachedViewById(R.id.rbMatchingResultGoToDashboard)).setOnClickListener(new bo.b(this$014, 3));
                            return;
                        }
                        return;
                    } catch (Exception e12) {
                        LogHelper.INSTANCE.e(str6, e12);
                        return;
                    }
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(str6, e13);
                    return;
                }
            case 26:
                RecommendedActivitiesExperimentActivity this$015 = (RecommendedActivitiesExperimentActivity) obj2;
                androidx.activity.result.a aVar20 = (androidx.activity.result.a) obj;
                int i25 = RecommendedActivitiesExperimentActivity.f11603z;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                if (aVar20 != null && (intent2 = aVar20.f977v) != null && (stringExtra = intent2.getStringExtra("trackedGoalId")) != null) {
                    this$015.f11605w.add(stringExtra);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.material.tabs.d.b
    public void c(TabLayout.g gVar, int i6) {
        ExpertCareInfoActivity this$0 = (ExpertCareInfoActivity) this.f671v;
        int i10 = ExpertCareInfoActivity.f11131x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        if (i6 == 0) {
            View inflate = LayoutInflater.from(this$0).inflate(R.layout.row_textview, (ViewGroup) null);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) inflate;
            robertoTextView.setText("Therapy");
            robertoTextView.setFont("Quicksand-Bold.ttf");
            robertoTextView.setTextSize(2, 16.0f);
            robertoTextView.setTextColor(g0.a.b(this$0, R.color.templateCtaDisabledGrey));
            gVar.b(robertoTextView);
            return;
        }
        View inflate2 = LayoutInflater.from(this$0).inflate(R.layout.row_textview, (ViewGroup) null);
        kotlin.jvm.internal.i.e(inflate2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView2 = (RobertoTextView) inflate2;
        robertoTextView2.setText("Psychiatry");
        robertoTextView2.setFont("Quicksand-Bold.ttf");
        robertoTextView2.setTextSize(2, 16.0f);
        robertoTextView2.setTextColor(g0.a.b(this$0, R.color.templateCtaDisabledGrey));
        gVar.b(robertoTextView2);
    }

    @Override // oe.l
    public Object get() {
        Map<ke.i, le.j> emptyMap;
        je.e eVar;
        nc.m<je.f> mVar;
        ke.n m10;
        je.e eVar2 = (je.e) this.f671v;
        nc.m<je.f> mVar2 = eVar2.f21811c;
        je.f fVar = mVar2.get();
        HashSet hashSet = new HashSet();
        int i6 = eVar2.f21813e;
        int i10 = i6;
        while (i10 > 0) {
            String e10 = fVar.e();
            if (e10 == null || hashSet.contains(e10)) {
                break;
            }
            kc.f.A(1, "IndexBackfiller", "Processing collection: %s", e10);
            je.f fVar2 = mVar2.get();
            je.h hVar = eVar2.f21812d.get();
            ke.b i11 = fVar2.i(e10);
            Map<ke.i, ke.n> g5 = hVar.f21830a.g(e10, i11, i10);
            if (i10 - g5.size() > 0) {
                emptyMap = hVar.f21832c.c(i11.f23263y, i10 - g5.size(), e10);
            } else {
                emptyMap = Collections.emptyMap();
            }
            int i12 = -1;
            for (le.j jVar : emptyMap.values()) {
                if (!g5.containsKey(jVar.a())) {
                    ke.i a10 = jVar.a();
                    eVar = eVar2;
                    ke.i a11 = jVar.a();
                    mVar = mVar2;
                    if (jVar.c() instanceof le.k) {
                        m10 = hVar.f21830a.b(a11);
                    } else {
                        m10 = ke.n.m(a11);
                    }
                    g5.put(a10, m10);
                } else {
                    eVar = eVar2;
                    mVar = mVar2;
                }
                i12 = Math.max(i12, jVar.b());
                eVar2 = eVar;
                mVar2 = mVar;
            }
            je.e eVar3 = eVar2;
            nc.m<je.f> mVar3 = mVar2;
            hVar.f(emptyMap, g5.keySet());
            je.g a12 = je.g.a(i12, hVar.a(g5, emptyMap, Collections.emptySet()));
            ImmutableSortedMap<ke.i, ke.g> immutableSortedMap = a12.f21826b;
            fVar2.a(immutableSortedMap);
            Iterator<Map.Entry<ke.i, ke.g>> it = immutableSortedMap.iterator();
            ke.b bVar = i11;
            while (it.hasNext()) {
                ke.b f = l.a.f(it.next().getValue());
                if (f.compareTo(bVar) > 0) {
                    bVar = f;
                }
            }
            ke.b bVar2 = new ke.b(bVar.f23261w, bVar.f23262x, Math.max(a12.f21825a, i11.f23263y));
            kc.f.A(1, "IndexBackfiller", "Updating offset: %s", bVar2);
            fVar2.d(e10, bVar2);
            i10 -= immutableSortedMap.size();
            hashSet.add(e10);
            eVar2 = eVar3;
            mVar2 = mVar3;
        }
        return Integer.valueOf(i6 - i10);
    }

    @Override // ya.g
    public ya.h h(Object obj) {
        of.c cVar = (of.c) obj;
        int[] iArr = com.google.firebase.remoteconfig.internal.a.f9815j;
        return ya.k.e((a.C0162a) this.f671v);
    }

    @Override // re.a.InterfaceC0519a
    public void i(re.b bVar) {
        switch (this.f670u) {
            case 1:
                ge.b bVar2 = (ge.b) this.f671v;
                synchronized (bVar2) {
                    cd.b bVar3 = (cd.b) bVar.get();
                    bVar2.f16458w = bVar3;
                    if (bVar3 != null) {
                        bVar3.a(bVar2.f16460y);
                    }
                }
                return;
            default:
                d(bVar);
                return;
        }
    }

    @Override // androidx.appcompat.widget.a1.a
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i6 = this.f670u;
        Object obj = this.f671v;
        switch (i6) {
            case 11:
                MiniCourseActivity this$0 = (MiniCourseActivity) obj;
                int i10 = MiniCourseActivity.O;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_remove_card) {
                    try {
                        MiniCourse miniCourse = this$0.f10447x;
                        if (miniCourse != null) {
                            if (MiniCourseUtilsKt.getMiniCourseProgress(miniCourse) == 0) {
                                Toast.makeText(this$0, "There is no data to reset here.", 0).show();
                            } else {
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_course, this$0, R.style.Theme_Dialog);
                                Window window = styledDialog.getWindow();
                                kotlin.jvm.internal.i.d(window);
                                window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(this$0.getString(R.string.resetMinicourseHeader));
                                ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(this$0.getString(R.string.resetMinicourseBody));
                                ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new dk.i(styledDialog, this$0, 2));
                                ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setOnClickListener(new dk.n(styledDialog, 0));
                                styledDialog.show();
                            }
                        } else {
                            kotlin.jvm.internal.i.q("miniCourse");
                            throw null;
                        }
                    } catch (Exception unused) {
                        ProgressDialog progressDialog = this$0.f10449z;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                            Utils.INSTANCE.showCustomToast(this$0, "Something went wrong. Please try again!");
                        } else {
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                    }
                }
                return true;
            case 24:
                tn.j this$02 = (tn.j) obj;
                int i11 = tn.j.E;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                switch (menuItem.getItemId()) {
                    case R.id.actionFriday /* 2131362037 */:
                        this$02.J("Fri");
                        return true;
                    case R.id.actionMonday /* 2131362038 */:
                        this$02.J("Mon");
                        return true;
                    case R.id.actionSaturday /* 2131362039 */:
                        this$02.J("Sat");
                        return true;
                    case R.id.actionSunday /* 2131362040 */:
                        this$02.J("Sun");
                        return true;
                    case R.id.actionThursday /* 2131362041 */:
                        this$02.J("Thu");
                        return true;
                    case R.id.actionTuesday /* 2131362042 */:
                        this$02.J("Tue");
                        return true;
                    case R.id.actionUp /* 2131362043 */:
                    default:
                        return false;
                    case R.id.actionWednesday /* 2131362044 */:
                        this$02.J("Wed");
                        return true;
                }
            case 28:
                TopicalGoalsActivity this$03 = (TopicalGoalsActivity) obj;
                int i12 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_remove_card) {
                    if (this$03.D.isEmpty()) {
                        Toast.makeText(this$03, "No goals added yet", 0).show();
                    } else {
                        this$03.p0();
                    }
                }
                return true;
            default:
                fq.m this$04 = (fq.m) obj;
                int i13 = fq.m.f15758w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity = this$04.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T8Activity");
                    ((T8Activity) activity).x0(new e1(), "result_static_three_good_things");
                    return true;
                }
                return false;
        }
    }

    @Override // ya.b
    public Object then(ya.h hVar) {
        int i6 = this.f670u;
        Object obj = this.f671v;
        switch (i6) {
            case 0:
                com.google.firebase.firestore.d dVar = (com.google.firebase.firestore.d) obj;
                he.y yVar = dVar.f9634a;
                FirebaseFirestore firebaseFirestore = dVar.f9635b;
                return new fe.r(new com.google.firebase.firestore.d(yVar, firebaseFirestore), (he.h0) hVar.getResult(), firebaseFirestore);
            default:
                ((com.google.firebase.messaging.r) obj).getClass();
                Bundle bundle = (Bundle) hVar.getResult(IOException.class);
                if (bundle != null) {
                    String string = bundle.getString("registration_id");
                    if (string != null || (string = bundle.getString("unregistered")) != null) {
                        return string;
                    }
                    String string2 = bundle.getString("error");
                    if (!"RST".equals(string2)) {
                        if (string2 != null) {
                            throw new IOException(string2);
                        }
                        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                        throw new IOException("SERVICE_NOT_AVAILABLE");
                    }
                    throw new IOException("INSTANCE_ID_RESET");
                }
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
