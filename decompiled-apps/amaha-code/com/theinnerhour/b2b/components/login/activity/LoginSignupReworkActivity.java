package com.theinnerhour.b2b.components.login.activity;

import am.w;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.activity.result.g;
import androidx.appcompat.app.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.NavigationScreenName;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import e.d;
import fn.b;
import fn.e;
import g6.a;
import g6.o;
import g6.p;
import g6.s;
import g6.x;
import gv.r;
import h5.a;
import h5.h;
import h5.l;
import h5.p;
import h5.z;
import hn.q;
import j7.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import s1.a0;
import s1.u;
import s1.y;
import ta.v;
import vs.c;
import w5.d;
import xs.f;
/* compiled from: LoginSignupReworkActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/login/activity/LoginSignupReworkActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class LoginSignupReworkActivity extends c {
    public static final /* synthetic */ int C = 0;
    public y A;
    public final androidx.activity.result.c<Intent> B;

    /* renamed from: v  reason: collision with root package name */
    public final String f11309v;

    /* renamed from: w  reason: collision with root package name */
    public q f11310w;

    /* renamed from: x  reason: collision with root package name */
    public Dialog f11311x;

    /* renamed from: y  reason: collision with root package name */
    public k f11312y;

    /* renamed from: z  reason: collision with root package name */
    public BottomSheetBehavior<FragmentContainerView> f11313z;

    public LoginSignupReworkActivity() {
        new LinkedHashMap();
        this.f11309v = LogHelper.INSTANCE.makeLogTag("LoginSignupReworkActivity");
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new d(), new w(21, this));
        i.f(registerForActivityResult, "registerForActivityResul…lt.data))\n        }\n    }");
        this.B = registerForActivityResult;
    }

    public static void p0(LoginSignupReworkActivity loginSignupReworkActivity, NavigationScreenName navigationScreenName, Bundle bundle, int i6) {
        boolean z10;
        Bundle bundle2;
        s1.d dVar;
        boolean z11;
        int i10;
        boolean z12;
        if ((i6 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a0 a0Var = null;
        if ((i6 & 4) != 0) {
            bundle2 = null;
        } else {
            bundle2 = bundle;
        }
        loginSignupReworkActivity.getClass();
        try {
            y yVar = loginSignupReworkActivity.A;
            if (yVar != null) {
                u f = yVar.f();
                if (f != null) {
                    dVar = f.q(navigationScreenName.getNavActionID());
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    y yVar2 = loginSignupReworkActivity.A;
                    if (yVar2 != null) {
                        int navActionID = navigationScreenName.getNavActionID();
                        if (z10) {
                            if (navigationScreenName != NavigationScreenName.LOGIN_TO_SIGNUP && navigationScreenName != NavigationScreenName.SIGNUP_TO_LOGIN) {
                                z11 = false;
                                i10 = -1;
                                z12 = false;
                                a0Var = new a0(z11, false, i10, z12, false, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
                            }
                            z11 = true;
                            i10 = R.id.login_signup_nav;
                            z12 = true;
                            a0Var = new a0(z11, false, i10, z12, false, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit);
                        }
                        yVar2.l(navActionID, bundle2, a0Var);
                        return;
                    }
                    i.q("navController");
                    throw null;
                }
                return;
            }
            i.q("navController");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(loginSignupReworkActivity.f11309v, e10);
        }
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        boolean z10;
        if (Build.VERSION.SDK_INT < 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
            int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
            if (intExtra != -1 || intExtra2 != -1) {
                if (intExtra == -1) {
                    intExtra = 0;
                }
                if (intExtra2 == -1) {
                    intExtra2 = 0;
                }
                overridePendingTransition(intExtra, intExtra2);
            }
        }
    }

    @Override // androidx.appcompat.app.c
    public final boolean m0() {
        y yVar = this.A;
        if (yVar != null) {
            if (!yVar.n() && !super.m0()) {
                return false;
            }
            return true;
        }
        i.q("navController");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(LoginSignupFlow flow) {
        l lVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        a aVar;
        String str;
        Activity activity;
        boolean z14;
        boolean z15;
        Activity activity2;
        String str2;
        i.g(flow, "flow");
        q qVar = this.f11310w;
        if (qVar != null) {
            qVar.Z = flow;
        }
        if (qVar != null && (lVar = (l) qVar.T.getValue()) != null) {
            final x a10 = x.f.a();
            List<String> P0 = ca.a.P0(SessionManager.KEY_EMAIL, "public_profile");
            for (String str3 : P0) {
                x.b bVar = x.f;
                if (x.b.b(str3)) {
                    throw new FacebookException(b.m("Cannot pass a publish or manage permission (", str3, ") to a request for read authorization"));
                }
            }
            String uuid = UUID.randomUUID().toString();
            i.f(uuid, "randomUUID().toString()");
            int W = h.W(vs.c.f36135u, new f(43, 128));
            ArrayList v22 = is.u.v2('~', is.u.v2('_', is.u.v2('.', is.u.v2('-', is.u.u2(new xs.c('0', '9'), is.u.s2(new xs.c('a', 'z'), new xs.c('A', 'Z')))))));
            ArrayList arrayList = new ArrayList(W);
            for (int i6 = 0; i6 < W; i6++) {
                c.a random = vs.c.f36135u;
                i.g(random, "random");
                if (!v22.isEmpty()) {
                    arrayList.add(Character.valueOf(((Character) v22.get(random.c(v22.size()))).charValue()));
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
            String m22 = is.u.m2(arrayList, "", null, null, null, 62);
            if (uuid.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z12 = false;
            } else {
                if (r.N0(uuid, ' ', 0, false, 6) >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = !z11;
            }
            if (z12 && hc.d.V(m22)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                HashSet hashSet = new HashSet(P0);
                hashSet.add("openid");
                Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
                i.f(unmodifiableSet, "unmodifiableSet(permissions)");
                try {
                    aVar = a.S256;
                    str = hc.d.z(m22);
                } catch (FacebookException unused) {
                    aVar = a.PLAIN;
                    str = m22;
                }
                o oVar = a10.f16338a;
                Set M2 = is.u.M2(unmodifiableSet);
                g6.d dVar = a10.f16339b;
                String str4 = a10.f16341d;
                String b10 = p.b();
                String uuid2 = UUID.randomUUID().toString();
                i.f(uuid2, "randomUUID().toString()");
                p.d dVar2 = new p.d(oVar, M2, dVar, str4, b10, uuid2, a10.f16342e, uuid, m22, str, aVar);
                Date date = h5.a.F;
                dVar2.f16307z = a.b.c();
                dVar2.D = null;
                dVar2.E = false;
                dVar2.G = false;
                dVar2.H = false;
                x.a aVar2 = new x.a(this, lVar);
                g gVar = aVar2.f16343a;
                if (gVar instanceof Activity) {
                    activity = (Activity) gVar;
                } else {
                    activity = null;
                }
                s a11 = x.c.f16345a.a(activity);
                if (a11 != null) {
                    if (dVar2.G) {
                        str2 = "foa_mobile_login_start";
                    } else {
                        str2 = "fb_mobile_login_start";
                    }
                    if (!b6.a.b(a11)) {
                        try {
                            ScheduledExecutorService scheduledExecutorService = s.f16328d;
                            Bundle a12 = s.a.a(dVar2.f16306y);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("login_behavior", dVar2.f16302u.toString());
                                jSONObject.put("request_code", d.c.Login.d());
                                jSONObject.put("permissions", TextUtils.join(",", dVar2.f16303v));
                                jSONObject.put("default_audience", dVar2.f16304w.toString());
                                jSONObject.put("isReauthorize", dVar2.f16307z);
                                String str5 = a11.f16331c;
                                if (str5 != null) {
                                    jSONObject.put("facebookVersion", str5);
                                }
                                g6.a0 a0Var = dVar2.F;
                                if (a0Var != null) {
                                    jSONObject.put("target_app", a0Var.f16230u);
                                }
                                a12.putString("6_extras", jSONObject.toString());
                            } catch (JSONException unused2) {
                            }
                            a11.f16330b.a(a12, str2);
                        } catch (Throwable th2) {
                            b6.a.a(a11, th2);
                        }
                    }
                }
                d.b bVar2 = w5.d.f36445b;
                d.c cVar = d.c.Login;
                int d10 = cVar.d();
                d.a aVar3 = new d.a() { // from class: g6.u
                    @Override // w5.d.a
                    public final void a(Intent intent, int i10) {
                        x this$0 = x.this;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.b(i10, intent, null);
                    }
                };
                synchronized (bVar2) {
                    HashMap hashMap = w5.d.f36446c;
                    if (!hashMap.containsKey(Integer.valueOf(d10))) {
                        hashMap.put(Integer.valueOf(d10), aVar3);
                    }
                }
                Intent intent = new Intent();
                intent.setClass(h5.p.a(), FacebookActivity.class);
                intent.setAction(dVar2.f16302u.toString());
                Bundle bundle = new Bundle();
                bundle.putParcelable("request", dVar2);
                intent.putExtra("com.facebook.LoginFragment:Request", bundle);
                if (h5.p.a().getPackageManager().resolveActivity(intent, 0) != null) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    try {
                        cVar.d();
                        aVar2.a(intent);
                        z15 = true;
                    } catch (ActivityNotFoundException unused3) {
                        z15 = false;
                    }
                    if (z15) {
                        FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
                        g gVar2 = aVar2.f16343a;
                        if (gVar2 instanceof Activity) {
                            activity2 = (Activity) gVar2;
                        } else {
                            activity2 = null;
                        }
                        x.a(activity2, p.e.a.ERROR, null, facebookException, false, dVar2);
                        throw facebookException;
                    }
                    return;
                }
                z15 = false;
                if (z15) {
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public final void o0() {
        i9.a aVar;
        q qVar = this.f11310w;
        Intent intent = null;
        if (qVar != null && (aVar = (i9.a) qVar.S.getValue()) != null) {
            int c10 = aVar.c();
            int i6 = c10 - 1;
            if (c10 != 0) {
                O o10 = aVar.f7309d;
                Context context = aVar.f7306a;
                if (i6 != 2) {
                    if (i6 != 3) {
                        j9.l.f21764a.a("getNoImplementationSignInIntent()", new Object[0]);
                        intent = j9.l.a(context, (GoogleSignInOptions) o10);
                        intent.setAction("com.google.android.gms.auth.NO_IMPL");
                    } else {
                        intent = j9.l.a(context, (GoogleSignInOptions) o10);
                    }
                } else {
                    j9.l.f21764a.a("getFallbackSignInIntent()", new Object[0]);
                    intent = j9.l.a(context, (GoogleSignInOptions) o10);
                    intent.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                }
            } else {
                throw null;
            }
        }
        this.B.a(intent);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InsetsUtils.INSTANCE.setStatusBarColor(R.color.loginBGNew, this, false, true);
        q qVar = (q) new o0(this).a(q.class);
        qVar.getClass();
        v.H(kc.f.H(qVar), kotlinx.coroutines.o0.f23640a, 0, new hn.s(qVar, null), 2);
        try {
            x.f.a().c((l) qVar.T.getValue(), new hn.v(qVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(qVar.f17891y, "Failure in initFacebook", e10);
        }
        x a10 = x.f.a();
        Date date = h5.a.F;
        h5.f.f.a().c(null, true);
        h.b.a(null);
        Parcelable.Creator<h5.x> creator = h5.x.CREATOR;
        z.f17336d.a().a(null, true);
        SharedPreferences.Editor edit = a10.f16340c.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
        SessionManager.getInstance().clearData();
        Utils.INSTANCE.clearNotificationChannel();
        qVar.F.e(this, new an.p(13, new b(this)));
        qVar.H.e(this, new an.p(14, new fn.c(this)));
        qVar.X.e(this, new an.p(15, new fn.d(this)));
        qVar.f17889a0.e(this, new an.p(16, new e(this)));
        qVar.W.e(this, new an.p(17, new fn.f(this)));
        qVar.L.e(this, new an.p(18, new fn.g(this)));
        qVar.f17892z.e(this, new an.p(19, new fn.h(this)));
        qVar.M.e(this, new an.p(20, new fn.i(this)));
        this.f11310w = qVar;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        Dialog dialog;
        this.f11312y = null;
        Dialog dialog2 = this.f11311x;
        if (dialog2 != null) {
            boolean z10 = false;
            if (dialog2 != null && dialog2.isShowing()) {
                z10 = true;
            }
            if (z10 && (dialog = this.f11311x) != null) {
                dialog.dismiss();
            }
        }
        super.onDestroy();
    }

    public final void q0(int i6) {
        ViewGroup.LayoutParams layoutParams;
        FragmentContainerView fragmentContainerView;
        FragmentContainerView fragmentContainerView2;
        Integer num;
        CoordinatorLayout coordinatorLayout;
        FragmentContainerView fragmentContainerView3;
        ViewGroup.LayoutParams layoutParams2;
        FragmentContainerView fragmentContainerView4;
        RobertoButton robertoButton;
        RobertoTextView robertoTextView;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        ConstraintLayout constraintLayout;
        LottieAnimationView lottieAnimationView;
        ConstraintLayout constraintLayout2;
        Integer num2;
        CoordinatorLayout coordinatorLayout2;
        FragmentContainerView fragmentContainerView5;
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 == 6) {
                    k kVar = this.f11312y;
                    if (kVar != null && (fragmentContainerView5 = (FragmentContainerView) kVar.f21737z) != null) {
                        layoutParams2 = fragmentContainerView5.getLayoutParams();
                    } else {
                        layoutParams2 = null;
                    }
                    if (layoutParams2 != null) {
                        k kVar2 = this.f11312y;
                        if (kVar2 != null && (coordinatorLayout2 = (CoordinatorLayout) kVar2.f21736y) != null) {
                            num2 = Integer.valueOf((int) (coordinatorLayout2.getHeight() * 0.75d));
                        } else {
                            num2 = null;
                        }
                        layoutParams2.height = num2.intValue();
                    }
                    k kVar3 = this.f11312y;
                    if (kVar3 != null) {
                        fragmentContainerView4 = (FragmentContainerView) kVar3.f21737z;
                    } else {
                        fragmentContainerView4 = null;
                    }
                    if (fragmentContainerView4 != null) {
                        fragmentContainerView4.setLayoutParams(layoutParams2);
                    }
                    k kVar4 = this.f11312y;
                    if (kVar4 != null) {
                        robertoButton = (RobertoButton) kVar4.f21733v;
                    } else {
                        robertoButton = null;
                    }
                    if (robertoButton != null) {
                        robertoButton.setVisibility(8);
                    }
                    k kVar5 = this.f11312y;
                    if (kVar5 != null) {
                        robertoTextView = (RobertoTextView) kVar5.f21734w;
                    } else {
                        robertoTextView = null;
                    }
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    k kVar6 = this.f11312y;
                    if (kVar6 != null) {
                        robertoTextView2 = (RobertoTextView) kVar6.B;
                    } else {
                        robertoTextView2 = null;
                    }
                    if (robertoTextView2 != null) {
                        robertoTextView2.setVisibility(8);
                    }
                    k kVar7 = this.f11312y;
                    if (kVar7 != null) {
                        robertoTextView3 = (RobertoTextView) kVar7.C;
                    } else {
                        robertoTextView3 = null;
                    }
                    if (robertoTextView3 != null) {
                        robertoTextView3.setVisibility(8);
                    }
                    androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                    k kVar8 = this.f11312y;
                    if (kVar8 != null && (constraintLayout2 = (ConstraintLayout) kVar8.f21735x) != null) {
                        bVar.f(constraintLayout2);
                    }
                    k kVar9 = this.f11312y;
                    if (kVar9 != null && (lottieAnimationView = (LottieAnimationView) kVar9.A) != null) {
                        bVar.k(lottieAnimationView.getId()).f1823e.f1874y = 0.0f;
                    }
                    k kVar10 = this.f11312y;
                    if (kVar10 != null && (constraintLayout = (ConstraintLayout) kVar10.f21735x) != null) {
                        bVar.b(constraintLayout);
                    }
                    BottomSheetBehavior<FragmentContainerView> bottomSheetBehavior = this.f11313z;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setState(6);
                        q qVar = this.f11310w;
                        if (qVar != null) {
                            qVar.N = 6;
                            return;
                        }
                        return;
                    }
                    i.q("bottomSheetBehavior");
                    throw null;
                }
                return;
            }
            BottomSheetBehavior<FragmentContainerView> bottomSheetBehavior2 = this.f11313z;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setState(5);
                return;
            } else {
                i.q("bottomSheetBehavior");
                throw null;
            }
        }
        k kVar11 = this.f11312y;
        if (kVar11 != null && (fragmentContainerView3 = (FragmentContainerView) kVar11.f21737z) != null) {
            layoutParams = fragmentContainerView3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            k kVar12 = this.f11312y;
            if (kVar12 != null && (coordinatorLayout = (CoordinatorLayout) kVar12.f21736y) != null) {
                num = Integer.valueOf(coordinatorLayout.getHeight());
            } else {
                num = null;
            }
            layoutParams.height = num.intValue();
        }
        k kVar13 = this.f11312y;
        if (kVar13 != null) {
            fragmentContainerView = (FragmentContainerView) kVar13.f21737z;
        } else {
            fragmentContainerView = null;
        }
        if (fragmentContainerView != null) {
            fragmentContainerView.setLayoutParams(layoutParams);
        }
        BottomSheetBehavior<FragmentContainerView> bottomSheetBehavior3 = this.f11313z;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.setState(3);
            q qVar2 = this.f11310w;
            if (qVar2 != null) {
                qVar2.N = 3;
            }
            InsetsUtils.INSTANCE.setStatusBarColor(R.color.white, this, false, true);
            k kVar14 = this.f11312y;
            if (kVar14 != null && (fragmentContainerView2 = (FragmentContainerView) kVar14.f21737z) != null) {
                fragmentContainerView2.setBackgroundResource(R.drawable.background_rectangle);
                return;
            }
            return;
        }
        i.q("bottomSheetBehavior");
        throw null;
    }
}
