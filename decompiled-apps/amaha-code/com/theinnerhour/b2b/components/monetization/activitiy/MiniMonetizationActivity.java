package com.theinnerhour.b2b.components.monetization.activitiy;

import a3.t;
import android.animation.Animator;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import androidx.work.k;
import c4.f;
import c4.o;
import com.airbnb.lottie.LottieAnimationView;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AppsFlyerLib;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import nn.m1;
import nn.q;
import nn.s;
import ss.l;
import tr.r;
/* compiled from: MiniMonetizationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/monetization/activitiy/MiniMonetizationActivity;", "Landroidx/appcompat/app/c;", "Lc4/o;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MiniMonetizationActivity extends androidx.appcompat.app.c implements o {

    /* renamed from: b0  reason: collision with root package name */
    public static final /* synthetic */ int f11396b0 = 0;
    public SubscriptionModel A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public MonetizationViewModel G;
    public List<c4.h> H;
    public boolean P;
    public y Q;
    public Fragment R;
    public String S;
    public String T;
    public String V;
    public boolean X;
    public c4.h Y;
    public boolean Z;

    /* renamed from: x  reason: collision with root package name */
    public k f11400x;

    /* renamed from: y  reason: collision with root package name */
    public Dialog f11401y;

    /* renamed from: z  reason: collision with root package name */
    public b f11402z;

    /* renamed from: a0  reason: collision with root package name */
    public final LinkedHashMap f11397a0 = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11398v = LogHelper.INSTANCE.makeLogTag("MiniMonetizationActivity");

    /* renamed from: w  reason: collision with root package name */
    public final int f11399w = 1248;
    public String B = "";
    public ArrayList<String> I = new ArrayList<>();
    public String J = "";
    public String K = "";
    public String L = "";
    public String M = "";
    public String N = "";
    public String O = "";
    public String U = "";
    public String W = "";

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements SubscriptionPersistence.SubscriptionInitialiseListener {
        public b() {
        }

        @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
        public final void initialiseComplete(boolean z10) {
            MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
            if (z10) {
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                    miniMonetizationActivity.r0();
                    miniMonetizationActivity.t0();
                    return;
                } else if (!miniMonetizationActivity.P) {
                    miniMonetizationActivity.w0();
                    return;
                } else {
                    return;
                }
            }
            miniMonetizationActivity.finish();
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ MonetizationViewModel f11407v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MonetizationViewModel monetizationViewModel) {
            super(1);
            this.f11407v = monetizationViewModel;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                MonetizationViewModel monetizationViewModel = this.f11407v;
                String str = monetizationViewModel.F;
                MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
                miniMonetizationActivity.getClass();
                kotlin.jvm.internal.i.g(str, "<set-?>");
                miniMonetizationActivity.W = str;
                miniMonetizationActivity.X = monetizationViewModel.E;
                CampaignModel campaignModel = monetizationViewModel.B;
                miniMonetizationActivity.T = (campaignModel == null || (r4 = campaignModel.getTemplateColor()) == null) ? "" : "";
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements l<List<? extends c4.h>, hs.k> {
        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(List<? extends c4.h> list) {
            List<? extends c4.h> list2 = list;
            if (list2 != null) {
                MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
                miniMonetizationActivity.getClass();
                miniMonetizationActivity.H = list2;
                miniMonetizationActivity.D = true;
                miniMonetizationActivity.p0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements l<ArrayList<String>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<String> arrayList) {
            ArrayList<String> arrayList2 = arrayList;
            if (arrayList2 != null) {
                MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
                miniMonetizationActivity.getClass();
                miniMonetizationActivity.I = arrayList2;
                miniMonetizationActivity.E = true;
                miniMonetizationActivity.p0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements l<String, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String str2 = str;
            if (str2 != null) {
                Utils.INSTANCE.showCustomToast(MiniMonetizationActivity.this, str2);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements l<Boolean, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
                if (booleanValue) {
                    miniMonetizationActivity.getClass();
                    try {
                        if (miniMonetizationActivity.C) {
                            Dialog dialog = miniMonetizationActivity.f11401y;
                            if (dialog != null) {
                                dialog.show();
                            } else {
                                kotlin.jvm.internal.i.q("loadingDialog");
                                throw null;
                            }
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(miniMonetizationActivity.f11398v, e10);
                    }
                } else {
                    miniMonetizationActivity.r0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements l<Boolean, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
                if (booleanValue) {
                    miniMonetizationActivity.P = true;
                    miniMonetizationActivity.x0(false);
                } else {
                    b.a title = new b.a(miniMonetizationActivity).setTitle(miniMonetizationActivity.getString(R.string.subscription_notice));
                    title.f1046a.f1031g = miniMonetizationActivity.getString(R.string.payment_failure);
                    title.b(miniMonetizationActivity.getString(R.string.notify_innerhour), new mn.b(miniMonetizationActivity, 1));
                    AlertController.b bVar = title.f1046a;
                    bVar.f1036l = false;
                    bVar.f1028c = R.mipmap.ic_launcher_round;
                    title.c();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i implements Animator.AnimatorListener {
        public i() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ((LottieAnimationView) MiniMonetizationActivity.this.n0(R.id.purchaseSuccessAnimation)).h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j implements Animator.AnimatorListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f11415b = false;

        public j() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
            miniMonetizationActivity.startActivityForResult(new Intent(miniMonetizationActivity, MonetizationSuccessActivity.class).putExtra("pro", this.f11415b), miniMonetizationActivity.f11399w);
            miniMonetizationActivity.n0(R.id.bgOverlay).setVisibility(8);
            ((ConstraintLayout) miniMonetizationActivity.n0(R.id.purchaseSuccessView)).setTranslationY(0.0f);
            ((ConstraintLayout) miniMonetizationActivity.n0(R.id.purchaseSuccessView)).setVisibility(8);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    @Override // c4.o
    public final void i(c4.g p02, List<Purchase> list) {
        Purchase purchase;
        kotlin.jvm.internal.i.g(p02, "p0");
        try {
            if (p02.f4918a == 0) {
                if (list != null) {
                    purchase = list.get(0);
                } else {
                    purchase = null;
                }
                if (purchase != null && !this.Z) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.APP_RESTART_ACKNOWLEDGE_PURCHASE, false);
                    String b10 = purchase.b();
                    kotlin.jvm.internal.i.f(b10, "purchase.purchaseToken");
                    this.O = b10;
                    Bundle bundle = new Bundle();
                    bundle.putString("plan", this.K);
                    bundle.putString("source", this.B);
                    bundle.putBoolean("isOnboarding", this.F);
                    bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    bundle.putString("screen", this.U);
                    if (this.F) {
                        bundle.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
                    }
                    MonetizationViewModel q02 = q0();
                    String b11 = purchase.b();
                    kotlin.jvm.internal.i.f(b11, "purchase.purchaseToken");
                    Object obj = purchase.a().get(0);
                    kotlin.jvm.internal.i.f(obj, "purchase.products[0]");
                    q02.r(b11, (String) obj, bundle);
                    i5.i iVar = new i5.i(this, (String) null);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("fb_currency", this.M);
                    if (!n.B0(this.L)) {
                        bundle2.putString("_valueToSum", this.L);
                    } else {
                        bundle2.putString("_valueToSum", "0");
                    }
                    bundle2.putString("fb_content_type", (String) purchase.a().get(0));
                    iVar.d(bundle2, "Subscribe");
                    k kVar = this.f11400x;
                    if (kVar != null) {
                        kVar.l();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("billingClient");
                        throw null;
                    }
                }
                return;
            }
            r0();
            if (!kotlin.jvm.internal.i.b(this.J, "")) {
                b.a title = new b.a(this).setTitle(getString(R.string.purchase_request_failed));
                title.f1046a.f1031g = getString(R.string.play_store_payment_fail);
                title.b(getString(R.string.retry_now), new mn.b(this, 0));
                b.a negativeButton = title.setNegativeButton(R.string.cancel, null);
                negativeButton.f1046a.f1028c = R.mipmap.ic_launcher_round;
                negativeButton.c();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11398v, e10);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11397a0;
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

    public final void o0(String sku, String offerToken, String price, String currency) {
        String str = this.f11398v;
        kotlin.jvm.internal.i.g(sku, "sku");
        kotlin.jvm.internal.i.g(offerToken, "offerToken");
        kotlin.jvm.internal.i.g(price, "price");
        kotlin.jvm.internal.i.g(currency, "currency");
        try {
            try {
                if (this.C) {
                    Dialog dialog = this.f11401y;
                    if (dialog != null) {
                        dialog.show();
                    } else {
                        kotlin.jvm.internal.i.q("loadingDialog");
                        throw null;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            List<c4.h> list = this.H;
            if (list != null) {
                for (c4.h hVar : list) {
                    if (kotlin.jvm.internal.i.b(hVar.f4924c, sku)) {
                        this.Y = hVar;
                    }
                }
                this.J = sku;
                this.L = price;
                this.M = currency;
                this.N = offerToken;
                int hashCode = sku.hashCode();
                if (hashCode != -974739188) {
                    if (hashCode != 1557926636) {
                        if (hashCode == 1936572032 && sku.equals(Constants.SUBSCRIPTION_BASIC_1)) {
                            sku = "plus_monthly";
                        }
                    } else if (sku.equals(Constants.SUBSCRIPTION_BASIC_2)) {
                        sku = "plus_quarterly";
                    }
                } else if (sku.equals(Constants.SUBSCRIPTION_BASIC_3)) {
                    sku = "plus_annual";
                }
                this.K = sku;
                k kVar = this.f11400x;
                if (kVar != null) {
                    kVar.C(new a(offerToken));
                    return;
                } else {
                    kotlin.jvm.internal.i.q("billingClient");
                    throw null;
                }
            }
            kotlin.jvm.internal.i.q("productDetailsList");
            throw null;
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        if (i6 == this.f11399w) {
            this.Z = true;
            ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.TRUE);
            Intent intent2 = new Intent();
            intent2.putExtra("purchase_successful", true);
            setResult(-1, intent2);
            finish();
        }
        super.onActivityResult(i6, i10, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: Exception -> 0x0117, TryCatch #0 {Exception -> 0x0117, blocks: (B:3:0x0013, B:5:0x0023, B:6:0x0030, B:8:0x003b, B:10:0x0046, B:11:0x0048, B:13:0x0085, B:15:0x0089, B:17:0x0099, B:26:0x00cc, B:28:0x00e9, B:31:0x00ff, B:18:0x00a4, B:19:0x00a9, B:20:0x00aa, B:22:0x00b0, B:24:0x00c2, B:25:0x00c9), top: B:36:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_mini_monetization);
        try {
            gk.a.b(null, "premium_open");
            if (getIntent().hasExtra("source")) {
                String stringExtra = getIntent().getStringExtra("source");
                kotlin.jvm.internal.i.d(stringExtra);
                this.B = stringExtra;
            }
            if (getIntent().hasExtra("tutorial") && getIntent().getBooleanExtra("tutorial", false)) {
                this.F = true;
            }
            this.V = getIntent().getStringExtra(Constants.CAMPAIGN_ID);
            LocationPersistence.INSTANCE.isIndianUser();
            y supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.i.f(supportFragmentManager, "supportFragmentManager");
            this.Q = supportFragmentManager;
            s0();
            this.f11400x = new c4.a(true, this, this);
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            SubscriptionModel currentSubscriptionModel = subscriptionPersistence.getCurrentSubscriptionModel();
            kotlin.jvm.internal.i.g(currentSubscriptionModel, "<set-?>");
            this.A = currentSubscriptionModel;
            if (currentSubscriptionModel.getExpiryTime() != 0) {
                SubscriptionModel subscriptionModel = this.A;
                if (subscriptionModel != null) {
                    if (subscriptionModel.getExpiryTime() < Calendar.getInstance().getTimeInMillis()) {
                        b bVar = new b();
                        subscriptionPersistence.fetchData(bVar);
                        this.f11402z = bVar;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("variant", "0");
                        bundle2.putString("source", this.B);
                        hs.k kVar = hs.k.f19476a;
                        gk.a.b(bundle2, "selling_screen_load");
                        if (!new gk.e().a()) {
                            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                            Context applicationContext = getApplicationContext();
                            HashMap hashMap = new HashMap();
                            hashMap.put("variant", "0");
                            String str = this.B;
                            if (str == null) {
                                str = "";
                            }
                            hashMap.put("source", str);
                            hashMap.put("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            appsFlyerLib.logEvent(applicationContext, "selling_screen_load", hashMap);
                            return;
                        }
                        return;
                    }
                } else {
                    kotlin.jvm.internal.i.q("subscriptionModel");
                    throw null;
                }
            }
            if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                r0();
                t0();
            } else {
                w0();
            }
            Bundle bundle22 = new Bundle();
            bundle22.putString("variant", "0");
            bundle22.putString("source", this.B);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle22, "selling_screen_load");
            if (!new gk.e().a()) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11398v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MyApplication.V.a().E = false;
        k kVar = this.f11400x;
        if (kVar != null) {
            if (kVar != null) {
                kVar.l();
            } else {
                kotlin.jvm.internal.i.q("billingClient");
                throw null;
            }
        }
        b bVar = this.f11402z;
        if (bVar != null) {
            SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(bVar);
        }
        if (this.G != null) {
            q0().C.k(this);
            q0().D.k(this);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.C = true;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.C = false;
    }

    public final void p0() {
        if (this.D && this.E && this.C) {
            r0();
            try {
                y yVar = this.Q;
                if (yVar != null) {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
                    if (this.F) {
                        this.R = new s();
                        v0(false);
                    } else if (this.X) {
                        ((ImageView) n0(R.id.header_arrow_back)).setVisibility(8);
                        v0(true);
                        this.R = new m1();
                    } else if (ca.a.k(Constants.HOLD_PLUS_SELLING_SCREEN, Constants.HOLD_PRO_SELLING_SCREEN).contains(this.W)) {
                        startActivity(r.s(this, false).putExtra("source", "mini_course_activity"));
                        finish();
                        return;
                    } else {
                        this.R = new q();
                    }
                    Fragment fragment = this.R;
                    if (fragment != null) {
                        aVar.f(R.id.container, fragment, null);
                        aVar.j();
                        return;
                    }
                    kotlin.jvm.internal.i.q("customFragment");
                    throw null;
                }
                kotlin.jvm.internal.i.q("fragmentManager");
                throw null;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f11398v, "exception", e10);
            }
        }
    }

    public final MonetizationViewModel q0() {
        MonetizationViewModel monetizationViewModel = this.G;
        if (monetizationViewModel != null) {
            return monetizationViewModel;
        }
        kotlin.jvm.internal.i.q("monetizationViewModel");
        throw null;
    }

    public final void r0() {
        try {
            if (this.C) {
                Dialog dialog = this.f11401y;
                if (dialog != null) {
                    dialog.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("loadingDialog");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11398v, e10);
        }
    }

    public final void s0() {
        WindowManager.LayoutParams layoutParams;
        String str = this.f11398v;
        Dialog dialog = null;
        try {
            try {
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_loading, this, R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                if (window != null) {
                    layoutParams = window.getAttributes();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                }
                styledDialog.setCancelable(false);
                dialog = styledDialog;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, e10);
            }
            if (dialog != null) {
                this.f11401y = dialog;
            }
            MyApplication.V.a().E = true;
            ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new ol.k(28, this));
            if (Build.VERSION.SDK_INT < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) n0(R.id.purchaseSuccessAnimation);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                    return;
                }
                return;
            }
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) n0(R.id.purchaseSuccessAnimation);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setRenderMode(t.HARDWARE);
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final void t0() {
        if (getIntent().hasExtra("user")) {
            Intent intent = new Intent(this, ProInitialAssessmentActivity.class);
            Bundle extras = getIntent().getExtras();
            kotlin.jvm.internal.i.d(extras);
            startActivity(intent.putExtras(extras));
        } else {
            startActivity(new Intent(this, ProInitialAssessmentActivity.class));
        }
        b bVar = this.f11402z;
        if (bVar != null) {
            SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(bVar);
        }
        finish();
    }

    public final void u0(ConstraintLayout constraintLayout) {
        try {
            if (((RobertoTextView) constraintLayout.findViewById(R.id.faqText)).getVisibility() == 0) {
                ((AppCompatImageView) constraintLayout.findViewById(R.id.faqChevron)).startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
            } else {
                ((AppCompatImageView) constraintLayout.findViewById(R.id.faqChevron)).startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11398v, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:8:0x0010, B:14:0x001c, B:16:0x002a, B:15:0x0023, B:17:0x002e), top: B:22:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(boolean z10) {
        int b10;
        boolean z11;
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                if (z10) {
                    String str = this.T;
                    if (str != null && !n.B0(str)) {
                        z11 = false;
                        if (!z11) {
                            b10 = Color.parseColor(this.T);
                            window.setStatusBarColor(b10);
                            return;
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                }
                b10 = g0.a.b(this, R.color.onboardingRewardBlue);
                window.setStatusBarColor(b10);
                return;
            }
            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11398v, "Error in setting custom status bar", e10);
        }
    }

    public final void w0() {
        qn.c cVar = new qn.c();
        Application application = getApplication();
        kotlin.jvm.internal.i.f(application, "application");
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new o0(this, new jl.q(application, this.V, cVar)).a(MonetizationViewModel.class);
        monetizationViewModel.f();
        monetizationViewModel.C.e(this, new gn.l(12, new c(monetizationViewModel)));
        monetizationViewModel.i().e(this, new gn.l(13, new d()));
        monetizationViewModel.j().e(this, new gn.l(14, new e()));
        monetizationViewModel.D.e(this, new bl.c(3, this));
        monetizationViewModel.l().e(this, new gn.l(15, new f()));
        monetizationViewModel.k().e(this, new gn.l(16, new g()));
        ((w) monetizationViewModel.c0.getValue()).e(this, new gn.l(17, new h()));
        this.G = monetizationViewModel;
    }

    public final void x0(boolean z10) {
        n0(R.id.bgOverlay).setVisibility(0);
        n0(R.id.bgOverlay).setOnClickListener(new il.g(12));
        ((ConstraintLayout) n0(R.id.purchaseSuccessView)).setVisibility(0);
        ((ConstraintLayout) n0(R.id.purchaseSuccessView)).animate().translationY(((ConstraintLayout) n0(R.id.purchaseSuccessView)).getHeight()).alpha(1.0f).setDuration(700L).setListener(new i());
        ((LottieAnimationView) n0(R.id.purchaseSuccessAnimation)).c(new j());
    }

    /* compiled from: MiniMonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c4.e {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f11404b;

        public a(String str) {
            this.f11404b = str;
        }

        @Override // c4.e
        public final void a(c4.g p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            int i6 = p02.f4918a;
            MiniMonetizationActivity miniMonetizationActivity = MiniMonetizationActivity.this;
            if (i6 == 0) {
                f.b.a aVar = new f.b.a();
                c4.h hVar = miniMonetizationActivity.Y;
                if (hVar != null) {
                    aVar.f4913a = hVar;
                    if (hVar.a() != null) {
                        hVar.a().getClass();
                        aVar.f4914b = hVar.a().f4928a;
                    }
                    String str = this.f11404b;
                    aVar.f4914b = str;
                    if (aVar.f4913a != null) {
                        if (str != null) {
                            List O0 = ca.a.O0(new f.b(aVar));
                            f.a aVar2 = new f.a();
                            aVar2.f4909a = new ArrayList(O0);
                            c4.f a10 = aVar2.a();
                            k kVar = miniMonetizationActivity.f11400x;
                            if (kVar != null) {
                                kVar.v(miniMonetizationActivity, a10);
                                Bundle bundle = new Bundle();
                                bundle.putString("plan", miniMonetizationActivity.K);
                                bundle.putString("source", miniMonetizationActivity.B);
                                bundle.putBoolean("isOnboarding", miniMonetizationActivity.F);
                                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                                bundle.putString("screen", miniMonetizationActivity.U);
                                if (miniMonetizationActivity.F) {
                                    bundle.putString("variant", (String) ri.e.d(Constants.ONBOARDING_EXPERIMENT));
                                }
                                gk.a.b(bundle, "premium_buy_click");
                                return;
                            }
                            kotlin.jvm.internal.i.q("billingClient");
                            throw null;
                        }
                        throw new NullPointerException("offerToken is required for constructing ProductDetailsParams.");
                    }
                    throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
                }
                kotlin.jvm.internal.i.q("productDetails");
                throw null;
            }
            LogHelper.INSTANCE.e(miniMonetizationActivity.f11398v, "Billing Client not ready");
        }

        @Override // c4.e
        public final void b() {
        }
    }
}
