package com.theinnerhour.b2b.components.pro.assessment.activity;

import am.w;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.y;
import com.android.volley.VolleyError;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.dashboard.activity.ProDashboardActivity;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.network.model.RequestStatus;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import e4.d;
import fo.g;
import gv.n;
import ho.c;
import ho.c0;
import ho.d0;
import ho.f;
import ho.j;
import ho.k;
import ho.m;
import ho.p;
import ho.r;
import ho.s;
import ho.z;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import rr.b;
/* compiled from: ProInitialAssessmentActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/assessment/activity/ProInitialAssessmentActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProInitialAssessmentActivity extends rr.a {
    public static final /* synthetic */ int G = 0;
    public String A;
    public RequestStatus C;
    public JSONObject D;
    public boolean E;

    /* renamed from: x  reason: collision with root package name */
    public int f11517x;

    /* renamed from: y  reason: collision with root package name */
    public b f11518y;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11516w = LogHelper.INSTANCE.makeLogTag(ProInitialAssessmentActivity.class);

    /* renamed from: z  reason: collision with root package name */
    public final int f11519z = 12;
    public final JSONArray B = new JSONArray();

    /* compiled from: ProInitialAssessmentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CustomVolleyErrorListener {
        public a() {
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            boolean z10;
            ProInitialAssessmentActivity proInitialAssessmentActivity = ProInitialAssessmentActivity.this;
            i.g(error, "error");
            try {
                e4.i iVar = error.f5870u;
                if (iVar != null && iVar.f13768a == 422) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    RequestStatus requestStatus = RequestStatus.REQUEST_SUCCESS;
                    proInitialAssessmentActivity.getClass();
                    i.g(requestStatus, "<set-?>");
                    proInitialAssessmentActivity.C = requestStatus;
                    FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                    firebasePersistence.getUser().getCoachModelInfo().setAssessmentDone(true);
                    firebasePersistence.updateUserOnFirebase();
                    proInitialAssessmentActivity.E = true;
                    proInitialAssessmentActivity.t0();
                    return;
                }
                RequestStatus requestStatus2 = RequestStatus.REQUEST_FAILURE;
                proInitialAssessmentActivity.getClass();
                i.g(requestStatus2, "<set-?>");
                proInitialAssessmentActivity.C = requestStatus2;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(proInitialAssessmentActivity.f11516w, e10);
                RequestStatus requestStatus3 = RequestStatus.REQUEST_FAILURE;
                i.g(requestStatus3, "<set-?>");
                proInitialAssessmentActivity.C = requestStatus3;
            }
        }
    }

    @Override // rr.a
    public final void o0() {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_pro_assessment_quit, this, R.style.Theme_Dialog);
            ((RobertoTextView) styledDialog.findViewById(R.id.proAssessmentQuitCtaYes)).setOnClickListener(new g(this, styledDialog));
            ((RobertoTextView) styledDialog.findViewById(R.id.proAssessmentQuitCtaNo)).setOnClickListener(new g(styledDialog, this));
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:4:0x000c, B:10:0x0018, B:14:0x0021, B:15:0x0025, B:16:0x0029, B:19:0x002f, B:20:0x0033, B:21:0x0039), top: B:25:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:2:0x0000, B:4:0x000c, B:10:0x0018, B:14:0x0021, B:15:0x0025, B:16:0x0029, B:19:0x002f, B:20:0x0033, B:21:0x0039), top: B:25:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // rr.a, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBackPressed() {
        boolean z10;
        b bVar;
        int i6;
        try {
            String stringExtra = getIntent().getStringExtra("show_coach_video");
            if (stringExtra != null && !n.B0(stringExtra)) {
                z10 = false;
                if (z10 && (i6 = this.f11517x) != 16) {
                    if (i6 != 0) {
                        n0();
                        return;
                    } else {
                        o0();
                        return;
                    }
                }
                bVar = this.f11518y;
                if (bVar == null) {
                    if (bVar != null) {
                        bVar.I();
                        return;
                    } else {
                        i.q("customFragment");
                        throw null;
                    }
                }
                return;
            }
            z10 = true;
            if (z10) {
                if (i6 != 0) {
                }
            }
            bVar = this.f11518y;
            if (bVar == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:3:0x000e, B:5:0x0019, B:8:0x002c, B:9:0x0031, B:11:0x0043, B:13:0x0055, B:15:0x005f, B:21:0x006b, B:22:0x008b, B:23:0x008f, B:24:0x0093), top: B:29:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[Catch: Exception -> 0x0097, TryCatch #0 {Exception -> 0x0097, blocks: (B:3:0x000e, B:5:0x0019, B:8:0x002c, B:9:0x0031, B:11:0x0043, B:13:0x0055, B:15:0x005f, B:21:0x006b, B:22:0x008b, B:23:0x008f, B:24:0x0093), top: B:29:0x000e }] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_assessment);
        try {
            y0(R.color.proPinkStatusBar);
            if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
                finish();
                return;
            }
            if (FirebasePersistence.getInstance().getUser().getCoachModelInfo().getConsentGiven()) {
                if (FirebasePersistence.getInstance().getUser().getCoachModelInfo().getAssessmentDone()) {
                    String stringExtra = getIntent().getStringExtra("show_coach_video");
                    if (stringExtra != null && !n.B0(stringExtra)) {
                        z10 = false;
                        if (z10) {
                            this.A = getIntent().getStringExtra("show_coach_video");
                            this.f11517x = 16;
                            ((RobertoTextView) u0(R.id.proAssessmentCounter)).setVisibility(8);
                            z0();
                            return;
                        }
                        x0();
                        return;
                    }
                    z10 = true;
                    if (z10) {
                    }
                } else {
                    t0();
                }
            } else {
                z0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }

    @Override // rr.a
    public final void t0() {
        this.f11517x++;
        z0();
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.F;
        Integer valueOf = Integer.valueOf((int) R.id.proAssessmentCounter);
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View findViewById = findViewById(R.id.proAssessmentCounter);
            if (findViewById != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void v0(JSONObject jSONObject) {
        JSONArray jSONArray = this.B;
        try {
            if (jSONArray.length() < this.f11517x) {
                jSONArray.put(jSONObject);
                Log.d("Pro_Assessment_Response", jSONArray.toString());
                t0();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }

    public final void w0() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("assessment_type", "initial_assessment");
            jSONObject.put("response_data", this.B);
            RequestStatus requestStatus = RequestStatus.REQUEST_LOADING;
            i.g(requestStatus, "<set-?>");
            this.C = requestStatus;
            CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/submit_pro_assessment", jSONObject, new w(2, this), new a());
            customVolleyJsonObjectRequest.setRetryPolicy(new d(Constants.TIMEOUT_MS, 0));
            VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:2:0x0000, B:4:0x000d, B:10:0x0019, B:11:0x001d, B:13:0x0030, B:14:0x003e, B:16:0x0042, B:17:0x0047), top: B:22:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:2:0x0000, B:4:0x000d, B:10:0x0019, B:11:0x001d, B:13:0x0030, B:14:0x003e, B:16:0x0042, B:17:0x0047), top: B:22:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0() {
        boolean z10;
        try {
            String stringExtra = getIntent().getStringExtra("show_coach_video");
            if (stringExtra != null && !n.B0(stringExtra)) {
                z10 = false;
                if (z10) {
                    finish();
                    return;
                }
                Intent intent = new Intent(this, ProDashboardActivity.class);
                if (getIntent().hasExtra("user")) {
                    Bundle extras = getIntent().getExtras();
                    i.d(extras);
                    intent.putExtras(extras);
                }
                if (this.E) {
                    intent.putExtra("onboarding_flow", true);
                }
                startActivity(intent);
                finish();
                return;
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }

    public final void y0(int i6) {
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
            getWindow().setStatusBarColor(g0.a.b(this, i6));
            return;
        }
        getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        r2.putString("pro_video_url", r9.A);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        String str;
        try {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.proAssessmentCounter);
            boolean z10 = true;
            if (this.f11517x <= 1) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f11517x - 1);
                sb2.append('/');
                sb2.append(this.f11519z);
                str = sb2.toString();
            }
            robertoTextView.setText(str);
            switch (this.f11517x) {
                case 0:
                    this.f11518y = new z();
                    break;
                case 1:
                    this.f11518y = new j();
                    break;
                case 2:
                    this.f11518y = new k();
                    break;
                case 3:
                    this.f11518y = new ho.d();
                    break;
                case 4:
                    this.f11518y = new ho.i();
                    break;
                case 5:
                    this.f11518y = new f();
                    break;
                case 6:
                    this.f11518y = new m();
                    break;
                case 7:
                    this.f11518y = new r();
                    break;
                case 8:
                    this.f11518y = new ho.n();
                    break;
                case 9:
                    this.f11518y = new ho.g();
                    break;
                case 10:
                    this.f11518y = new c();
                    break;
                case 11:
                    this.f11518y = new s();
                    break;
                case 12:
                    this.f11518y = new p();
                    break;
                case 13:
                    this.f11518y = new ho.b();
                    break;
                case 14:
                    ((RobertoTextView) u0(R.id.proAssessmentCounter)).setVisibility(8);
                    this.f11518y = new c0();
                    break;
                case 15:
                    ((RobertoTextView) u0(R.id.proAssessmentCounter)).setVisibility(8);
                    y0(R.color.proBgPink);
                    this.f11518y = new d0();
                    break;
                case 16:
                    ((RobertoTextView) u0(R.id.proAssessmentCounter)).setVisibility(8);
                    lo.c cVar = new lo.c();
                    Bundle bundle = new Bundle();
                    JSONObject jSONObject = this.D;
                    if (jSONObject != null) {
                        if (jSONObject != null) {
                            bundle.putString("pro_video_url", jSONObject.optString("pro_intro", ""));
                        } else {
                            i.q("serverResponse");
                            throw null;
                        }
                    } else {
                        String str2 = this.A;
                        if (str2 != null && !n.B0(str2)) {
                            z10 = false;
                            break;
                        }
                    }
                    cVar.setArguments(bundle);
                    this.f11518y = cVar;
                    break;
                default:
                    x0();
                    break;
            }
            aVar.h(R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, 0, 0);
            b bVar = this.f11518y;
            if (bVar != null) {
                aVar.f(R.id.proAssessmentContainer, bVar, null);
                aVar.j();
                return;
            }
            i.q("customFragment");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11516w, e10);
        }
    }
}
