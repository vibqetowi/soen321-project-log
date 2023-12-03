package com.theinnerhour.b2b.components.splash.activity;

import a3.t;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import cn.z0;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DevFragmentTestActivity;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.splash.models.AppUpdateResponse;
import com.theinnerhour.b2b.components.splash.models.SplashScreenIntentParams;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import gv.r;
import is.u;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import lg.f;
import org.json.JSONObject;
import so.b0;
import ss.l;
import ya.j;
import ya.v;
/* compiled from: SplashScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/splash/activity/SplashScreenActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SplashScreenActivity extends rr.a {
    public static final /* synthetic */ int G = 0;
    public jp.d B;
    public hc.a C;
    public boolean D;

    /* renamed from: x  reason: collision with root package name */
    public Intent f11626x;

    /* renamed from: y  reason: collision with root package name */
    public hc.b f11627y;
    public final LinkedHashMap F = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11625w = LogHelper.INSTANCE.makeLogTag(SplashScreenActivity.class);

    /* renamed from: z  reason: collision with root package name */
    public final int f11628z = 10001;
    public final int A = 10002;
    public boolean E = true;

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<wd.b, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(wd.b bVar) {
            jp.d dVar;
            boolean z10;
            String str;
            boolean z11;
            List<String> pathSegments;
            List<String> pathSegments2;
            String str2;
            List<String> pathSegments3;
            List<String> pathSegments4;
            String str3;
            wd.b bVar2 = bVar;
            SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
            try {
                LogHelper.INSTANCE.i(splashScreenActivity.f11625w, "on success dynamic links");
                if (bVar2 != null) {
                    Uri a10 = bVar2.a();
                    i.d(a10);
                    String str4 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("new_install", ApplicationPersistence.getInstance().getBooleanValue(Constants.FIRST_APP_OPEN, true));
                    bundle.putString(Constants.NOTIFICATION_URL, a10.toString());
                    String string = bVar2.b().getString("utm_source");
                    String str5 = "";
                    if (string == null) {
                        string = "";
                    }
                    bundle.putString("utm_source", string);
                    String string2 = bVar2.b().getString("utm_medium");
                    if (string2 == null) {
                        string2 = "";
                    }
                    bundle.putString("utm_medium", string2);
                    String string3 = bVar2.b().getString("utm_campaign");
                    if (string3 == null) {
                        string3 = "";
                    }
                    bundle.putString("utm_campaign", string3);
                    Uri a11 = bVar2.a();
                    if (a11 != null && (pathSegments4 = a11.getPathSegments()) != null && (str3 = (String) u.j2(0, pathSegments4)) != null && r.J0(str3, "linktype=")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        str = "";
                    } else {
                        Uri a12 = bVar2.a();
                        if (a12 != null && (pathSegments3 = a12.getPathSegments()) != null) {
                            str = (String) u.j2(1, pathSegments3);
                        } else {
                            str = null;
                        }
                    }
                    bundle.putString("code", str);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "dynamic_link_app_open");
                    if (FirebaseAuth.getInstance().f == null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("dynamic_url", a10.toString());
                        String string4 = bVar2.b().getString("utm_source");
                        if (string4 == null) {
                            string4 = "";
                        }
                        jSONObject.put("dynamic_utm_source", string4);
                        String string5 = bVar2.b().getString("utm_medium");
                        if (string5 == null) {
                            string5 = "";
                        }
                        jSONObject.put("dynamic_utm_medium", string5);
                        String string6 = bVar2.b().getString("utm_campaign");
                        if (string6 == null) {
                            string6 = "";
                        }
                        jSONObject.put("dynamic_utm_campaign", string6);
                        Uri a13 = bVar2.a();
                        if (a13 != null && (pathSegments2 = a13.getPathSegments()) != null && (str2 = (String) u.j2(0, pathSegments2)) != null && r.J0(str2, "linktype=")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            Uri a14 = bVar2.a();
                            if (a14 != null && (pathSegments = a14.getPathSegments()) != null) {
                                str5 = (String) u.j2(1, pathSegments);
                            } else {
                                str5 = null;
                            }
                        }
                        jSONObject.put("dynamic_code", str5);
                        ApplicationPersistence.getInstance().setStringValue(Constants.SAVE_DYNAMIC_LINK_MIXPANEL, jSONObject.toString());
                    }
                    if (a10.getPathSegments().size() > 1 && r.J0(a10.getPathSegments().get(0).toString(), "linktype=")) {
                        jp.d dVar2 = splashScreenActivity.B;
                        if (dVar2 != null) {
                            dVar2.E = true;
                            ApplicationPersistence.getInstance().setStringValue(Constants.DYNAMIC_SIGNUP_LINK, a10.toString());
                            ApplicationPersistence.getInstance().setBooleanValue(Constants.USE_VARIANT_A, true);
                        } else {
                            i.q("splashScreenViewModel");
                            throw null;
                        }
                    } else if (a10.getPathSegments().size() > 0 && r.J0(a10.getPathSegments().get(0).toString(), "utm_link")) {
                        if (FirebasePersistence.getInstance().getUser() != null) {
                            MyApplication.a aVar = MyApplication.V;
                            f.b bVar3 = aVar.a().d().f;
                            Uri parse = Uri.parse(a10.toString());
                            List<String> campaignsList = parse.getQueryParameters("utm_campaign");
                            List<String> contentList = parse.getQueryParameters("utm_medium");
                            i.f(campaignsList, "campaignsList");
                            if (!campaignsList.isEmpty()) {
                                i.f(contentList, "contentList");
                                if (!contentList.isEmpty()) {
                                    bVar3.a(campaignsList.get(0), "UTM Campaigns");
                                    bVar3.a(contentList.get(0), "UTM Content");
                                    UtilsKt.logError$default(new fk.g().f15128a, null, new fk.f(aVar.a(), campaignsList, contentList), 2, null);
                                }
                            }
                            ApplicationPersistence.getInstance().deleteKey(Constants.DYNAMIC_UTM_LINK);
                        } else {
                            jp.d dVar3 = splashScreenActivity.B;
                            if (dVar3 != null) {
                                dVar3.E = true;
                                ApplicationPersistence.getInstance().setStringValue(Constants.DYNAMIC_UTM_LINK, a10.toString());
                            } else {
                                i.q("splashScreenViewModel");
                                throw null;
                            }
                        }
                    }
                }
                dVar = splashScreenActivity.B;
            } catch (Exception e10) {
                jp.d dVar4 = splashScreenActivity.B;
                if (dVar4 != null) {
                    dVar4.E = false;
                    dVar4.D = true;
                    dVar4.g();
                    LogHelper.INSTANCE.e(splashScreenActivity.f11625w, "exception", e10);
                } else {
                    i.q("splashScreenViewModel");
                    throw null;
                }
            }
            if (dVar != null) {
                dVar.D = true;
                dVar.g();
                return hs.k.f19476a;
            }
            i.q("splashScreenViewModel");
            throw null;
        }
    }

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<Boolean, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                Toast.makeText(splashScreenActivity, "Something went wrong, please try again", 0).show();
                splashScreenActivity.finish();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                splashScreenActivity.D = true;
                if (Build.VERSION.SDK_INT < 25) {
                    ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).setRenderMode(t.SOFTWARE);
                } else {
                    ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).setRenderMode(t.HARDWARE);
                }
                ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).setProgress(0.0f);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(2000L);
                alphaAnimation.setFillAfter(true);
                ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).j();
                ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).c(new ip.c(splashScreenActivity));
                ((LottieAnimationView) splashScreenActivity.u0(R.id.splashScreenLotteAnimation)).startAnimation(alphaAnimation);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends k implements l<Boolean, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                hc.b bVar = splashScreenActivity.f11627y;
                if (bVar != null) {
                    v b10 = bVar.b();
                    rk.b bVar2 = new rk.b(9, new ip.b(splashScreenActivity));
                    b10.getClass();
                    b10.addOnSuccessListener(j.f38393a, bVar2);
                    b10.addOnFailureListener(new ip.a(splashScreenActivity, 1));
                } else {
                    i.q("appUpdateManager");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements l<AppUpdateResponse, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(AppUpdateResponse appUpdateResponse) {
            SplashScreenActivity splashScreenActivity;
            hc.a aVar;
            AppUpdateResponse appUpdateResponse2 = appUpdateResponse;
            if (appUpdateResponse2 != null && (aVar = (splashScreenActivity = SplashScreenActivity.this).C) != null) {
                if (appUpdateResponse2 == AppUpdateResponse.IMMEDIATE_UPDATE) {
                    SplashScreenActivity.v0(splashScreenActivity, aVar, 1, splashScreenActivity.A);
                } else if (appUpdateResponse2 == AppUpdateResponse.FLEXIBLE_UPDATE) {
                    SplashScreenActivity.v0(splashScreenActivity, aVar, 0, splashScreenActivity.f11628z);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements l<Boolean, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                if (splashScreenActivity.f11626x != null) {
                    if (!booleanValue) {
                        if (splashScreenActivity.getIntent().getExtras() != null) {
                            Intent x02 = splashScreenActivity.x0();
                            Bundle extras = splashScreenActivity.getIntent().getExtras();
                            i.d(extras);
                            x02.putExtras(extras);
                        }
                        if (splashScreenActivity.getIntent().getData() != null) {
                            splashScreenActivity.x0().setData(splashScreenActivity.getIntent().getData());
                        }
                    }
                    splashScreenActivity.startActivity(splashScreenActivity.x0());
                    splashScreenActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    splashScreenActivity.finish();
                    MyApplication.V.a().H = true;
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.FIRST_APP_OPEN, false);
                } else {
                    splashScreenActivity.finish();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: SplashScreenActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends k implements l<SplashScreenIntentParams, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(SplashScreenIntentParams splashScreenIntentParams) {
            Intent intent;
            Intent intent2;
            Intent intent3;
            Intent intent4;
            SplashScreenIntentParams splashScreenIntentParams2 = splashScreenIntentParams;
            if (splashScreenIntentParams2 != null) {
                boolean isLoggedIn = splashScreenIntentParams2.isLoggedIn();
                boolean courseSelectionRequired = splashScreenIntentParams2.getCourseSelectionRequired();
                SplashScreenActivity splashScreenActivity = SplashScreenActivity.this;
                splashScreenActivity.getClass();
                try {
                    if (!Constants.OPEN_FRAGMENT_PLAYGROUND.booleanValue()) {
                        Uri data = splashScreenActivity.getIntent().getData();
                        if (data != null && data.getPathSegments().size() > 0 && i.b(data.getPathSegments().get(0), "appointment")) {
                            if (isLoggedIn && courseSelectionRequired) {
                                intent4 = tr.r.r(splashScreenActivity);
                            } else if (isLoggedIn && FirebasePersistence.getInstance().getUser() != null) {
                                intent4 = new ll.b().a(splashScreenActivity, false);
                                if (data.getPathSegments().size() >= 7) {
                                    intent4.putExtra(Constants.LINK_ID, data.toString());
                                }
                            } else {
                                intent4 = new Intent(splashScreenActivity, LoginSignupReworkActivity.class);
                            }
                            splashScreenActivity.f11626x = intent4;
                            if (data.getPathSegments().size() >= 7) {
                                splashScreenActivity.x0().putExtra(Constants.LINK_TYPE, Constants.APP_APPOINTMENT);
                            }
                        } else if (data != null && data.getPathSegments().size() > 0 && i.b(data.getPathSegments().get(0), "psychappointment")) {
                            if (isLoggedIn && courseSelectionRequired) {
                                intent3 = tr.r.r(splashScreenActivity);
                            } else if (isLoggedIn && FirebasePersistence.getInstance().getUser() != null) {
                                intent3 = new ll.b().a(splashScreenActivity, false);
                                if (data.getPathSegments().size() >= 7) {
                                    intent3.putExtra(Constants.LINK_ID, data.toString());
                                }
                            } else {
                                intent3 = new Intent(splashScreenActivity, LoginSignupReworkActivity.class);
                            }
                            splashScreenActivity.f11626x = intent3;
                            if (data.getPathSegments().size() >= 7) {
                                splashScreenActivity.x0().putExtra(Constants.LINK_TYPE, Constants.APP_PSYCH_APPOINTMENT);
                            }
                        } else if (data != null && data.getPathSegments().size() >= 2 && i.b(data.getPathSegments().get(0), "sellingscreen")) {
                            if (isLoggedIn && courseSelectionRequired) {
                                intent2 = tr.r.r(splashScreenActivity);
                            } else if (isLoggedIn && FirebasePersistence.getInstance().getUser() != null) {
                                intent2 = new ll.b().a(splashScreenActivity, false);
                                if (data.getPathSegments().size() >= 2) {
                                    intent2.putExtra(Constants.LINK_ID, data.getLastPathSegment());
                                }
                                if (data.getPathSegments().size() >= 2) {
                                    intent2.putExtra(Constants.LINK_TYPE, Constants.SELLING_SCREEN_TEST);
                                }
                            } else {
                                intent2 = new Intent(splashScreenActivity, LoginSignupReworkActivity.class);
                            }
                            splashScreenActivity.f11626x = intent2;
                        } else {
                            if (isLoggedIn && courseSelectionRequired) {
                                intent = tr.r.r(splashScreenActivity);
                            } else if (isLoggedIn && FirebasePersistence.getInstance().getUser() != null) {
                                intent = new ll.b().a(splashScreenActivity, false);
                            } else {
                                intent = new Intent(splashScreenActivity, LoginSignupReworkActivity.class);
                            }
                            splashScreenActivity.f11626x = intent;
                        }
                    } else {
                        splashScreenActivity.f11626x = new Intent(splashScreenActivity, DevFragmentTestActivity.class);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(splashScreenActivity.f11625w, e10);
                    splashScreenActivity.f11626x = new Intent(splashScreenActivity, LoginSignupReworkActivity.class);
                }
                jp.d dVar = splashScreenActivity.B;
                if (dVar != null) {
                    if (dVar.H) {
                        ta.v.H(kc.f.H(dVar), null, 0, new jp.g(dVar, null), 3);
                    } else {
                        dVar.N.i(Boolean.valueOf(dVar.E));
                    }
                } else {
                    i.q("splashScreenViewModel");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    public static final void v0(SplashScreenActivity splashScreenActivity, hc.a aVar, int i6, int i10) {
        splashScreenActivity.getClass();
        try {
            hc.b bVar = splashScreenActivity.f11627y;
            if (bVar != null) {
                bVar.a(aVar, i6, splashScreenActivity, i10);
                gk.a.b(null, "in_app_update_dialog_show");
                return;
            }
            i.q("appUpdateManager");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(splashScreenActivity.f11625w, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == this.f11628z) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        jp.d dVar = this.B;
                        if (dVar != null) {
                            dVar.f();
                            return;
                        } else {
                            i.q("splashScreenViewModel");
                            throw null;
                        }
                    }
                    gk.a.b(null, "in_app_update_dialog_failed");
                    jp.d dVar2 = this.B;
                    if (dVar2 != null) {
                        dVar2.f();
                        return;
                    } else {
                        i.q("splashScreenViewModel");
                        throw null;
                    }
                }
                gk.a.b(null, "in_app_update_dialog_cancelled");
                jp.d dVar3 = this.B;
                if (dVar3 != null) {
                    dVar3.f();
                    return;
                } else {
                    i.q("splashScreenViewModel");
                    throw null;
                }
            }
            gk.a.b(null, "in_app_update_dialog_accepted");
            jp.d dVar4 = this.B;
            if (dVar4 != null) {
                dVar4.f();
            } else {
                i.q("splashScreenViewModel");
                throw null;
            }
        } else if (i6 == this.A) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        finish();
                        return;
                    }
                    gk.a.b(null, "in_app_update_dialog_failed");
                    finish();
                    return;
                }
                gk.a.b(null, "in_app_update_dialog_cancelled");
                finish();
                return;
            }
            gk.a.b(null, "in_app_update_dialog_accepted");
            jp.d dVar5 = this.B;
            if (dVar5 != null) {
                dVar5.f();
            } else {
                i.q("splashScreenViewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        q0.b bVar;
        String str;
        Bundle bundleExtra;
        String string;
        super.onCreate(bundle);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            bVar = new q0.a(this);
        } else {
            bVar = new q0.b(this);
        }
        bVar.a();
        setContentView(R.layout.activity_splash_screen);
        Window window = getWindow();
        try {
            Intent intent = getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra(Constants.MEDIA_ANALYTICS_RECEIVER_EXTRA)) != null && (string = bundleExtra.getString("event_name")) != null) {
                bundleExtra.remove("event_name");
                gk.a.b(bundleExtra, string);
            }
            if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER")) {
                Intent intent2 = getIntent();
                if (intent2 != null) {
                    str = intent2.getAction();
                } else {
                    str = null;
                }
                if (i.b(str, "android.intent.action.MAIN") && MyApplication.V.a().H && getIntent().getData() == null) {
                    finish();
                    return;
                }
            }
            if (i6 >= 23) {
                window.getDecorView().setSystemUiVisibility(8192);
                window.setStatusBarColor(-1);
            } else {
                window.setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
            if (i6 < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) u0(R.id.splashScreenLotteAnimation);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) u0(R.id.splashScreenLotteAnimation);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(t.HARDWARE);
                }
            }
            hc.b m10 = hc.d.m(getApplicationContext());
            i.f(m10, "create(applicationContext)");
            this.f11627y = m10;
            y0();
            ApplicationPersistence.getInstance().setIntValue(Constants.APP_SESSION_COUNT, ApplicationPersistence.getInstance().getIntValue(Constants.APP_SESSION_COUNT, 0) + 1);
            Window window2 = getWindow();
            i.f(window2, "this@SplashScreenActivity.window");
            InsetsUtils.INSTANCE.setupInsets((ConstraintLayout) u0(R.id.splashScreenParentContainer), window2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11625w, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        jp.d dVar = this.B;
        if (dVar != null) {
            if (dVar != null) {
                dVar.I.k(this);
                jp.d dVar2 = this.B;
                if (dVar2 != null) {
                    dVar2.J.k(this);
                    jp.d dVar3 = this.B;
                    if (dVar3 != null) {
                        dVar3.K.k(this);
                        jp.d dVar4 = this.B;
                        if (dVar4 != null) {
                            dVar4.M.k(this);
                            jp.d dVar5 = this.B;
                            if (dVar5 != null) {
                                dVar5.N.k(this);
                                jp.d dVar6 = this.B;
                                if (dVar6 != null) {
                                    dVar6.L.k(this);
                                    return;
                                } else {
                                    i.q("splashScreenViewModel");
                                    throw null;
                                }
                            }
                            i.q("splashScreenViewModel");
                            throw null;
                        }
                        i.q("splashScreenViewModel");
                        throw null;
                    }
                    i.q("splashScreenViewModel");
                    throw null;
                }
                i.q("splashScreenViewModel");
                throw null;
            }
            i.q("splashScreenViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((LottieAnimationView) u0(R.id.splashScreenLotteAnimation)).g();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        w0();
        if (this.D) {
            ((LottieAnimationView) u0(R.id.splashScreenLotteAnimation)).j();
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.F;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void w0() {
        jp.d dVar = this.B;
        if (dVar == null) {
            this.E = true;
        } else if (dVar.D) {
        } else {
            v a10 = wd.a.b().a(getIntent());
            a10.addOnSuccessListener(this, new rk.b(8, new a()));
            a10.addOnFailureListener(this, new ip.a(this, 0));
            a10.addOnCanceledListener(this, new tm.i(2, this));
        }
    }

    public final Intent x0() {
        Intent intent = this.f11626x;
        if (intent != null) {
            return intent;
        }
        i.q("pendingIntent");
        throw null;
    }

    public final void y0() {
        Application application = getApplication();
        i.f(application, "application");
        jp.d dVar = (jp.d) new o0(this, new z0(application, 3)).a(jp.d.class);
        this.B = dVar;
        if (dVar != null) {
            dVar.I.e(this, new b0(20, new b()));
            dVar.J.e(this, new b0(21, new c()));
            dVar.K.e(this, new b0(22, new d()));
            dVar.M.e(this, new b0(23, new e()));
            dVar.N.e(this, new b0(24, new f()));
            dVar.L.e(this, new b0(25, new g()));
            if (this.E) {
                this.E = false;
                w0();
                return;
            }
            return;
        }
        i.q("splashScreenViewModel");
        throw null;
    }
}
