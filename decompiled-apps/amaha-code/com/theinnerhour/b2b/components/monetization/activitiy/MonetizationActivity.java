package com.theinnerhour.b2b.components.monetization.activitiy;

import a3.t;
import android.animation.Animator;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
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
import androidx.lifecycle.w;
import c4.f;
import c4.o;
import com.airbnb.lottie.LottieAnimationView;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
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
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.o0;
import nn.a1;
import pl.w0;
import q.d;
import qn.q;
import ta.v;
/* compiled from: MonetizationActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/monetization/activitiy/MonetizationActivity;", "Landroidx/appcompat/app/c;", "Lc4/o;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MonetizationActivity extends androidx.appcompat.app.c implements o {
    public static final /* synthetic */ int c0 = 0;
    public SubscriptionModel A;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public MonetizationViewModel H;
    public List<c4.h> I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public boolean P;
    public final nn.h Q;
    public final a1 R;
    public Fragment S;
    public String T;
    public String U;
    public boolean V;
    public String W;
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f11416a0;

    /* renamed from: x  reason: collision with root package name */
    public androidx.work.k f11420x;

    /* renamed from: y  reason: collision with root package name */
    public Dialog f11421y;

    /* renamed from: z  reason: collision with root package name */
    public b f11422z;

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashMap f11417b0 = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f11418v = LogHelper.INSTANCE.makeLogTag("MonetizationActivity");

    /* renamed from: w  reason: collision with root package name */
    public final int f11419w = 1248;
    public String B = "";

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements SubscriptionPersistence.SubscriptionInitialiseListener {
        public b() {
        }

        @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
        public final void initialiseComplete(boolean z10) {
            MonetizationActivity monetizationActivity = MonetizationActivity.this;
            if (z10) {
                SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
                if (subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(subscriptionPersistence.getSubscriptionType()), "pro")) {
                    int i6 = MonetizationActivity.c0;
                    monetizationActivity.r0();
                    monetizationActivity.t0();
                } else {
                    int i10 = MonetizationActivity.c0;
                    monetizationActivity.u0();
                }
                b bVar = monetizationActivity.f11422z;
                if (bVar != null) {
                    subscriptionPersistence.removeSubscriptionInitialiseListener(bVar);
                    return;
                }
                return;
            }
            monetizationActivity.finish();
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ MonetizationViewModel f11428v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MonetizationViewModel monetizationViewModel) {
            super(1);
            this.f11428v = monetizationViewModel;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            String str;
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                MonetizationViewModel monetizationViewModel = this.f11428v;
                String str2 = monetizationViewModel.F;
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                monetizationActivity.getClass();
                kotlin.jvm.internal.i.g(str2, "<set-?>");
                monetizationActivity.Z = str2;
                CampaignModel campaignModel = monetizationViewModel.B;
                if (campaignModel != null) {
                    str = campaignModel.getTemplateColor();
                } else {
                    str = null;
                }
                monetizationActivity.W = str;
                if (monetizationViewModel.E) {
                    a1 a1Var = monetizationActivity.R;
                    kotlin.jvm.internal.i.g(a1Var, "<set-?>");
                    monetizationActivity.S = a1Var;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<List<? extends c4.h>, hs.k> {
        public d() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(List<? extends c4.h> list) {
            List<? extends c4.h> list2 = list;
            if (list2 != null) {
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                monetizationActivity.getClass();
                monetizationActivity.I = list2;
                monetizationActivity.D = true;
                monetizationActivity.p0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.l<ArrayList<String>, hs.k> {
        public e() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<String> arrayList) {
            if (arrayList != null) {
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                monetizationActivity.getClass();
                monetizationActivity.E = true;
                monetizationActivity.p0();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public f() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                Utils utils = Utils.INSTANCE;
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                String string = monetizationActivity.getString(R.string.monetization_data_fetch_error);
                kotlin.jvm.internal.i.f(string, "getString(R.string.monetization_data_fetch_error)");
                utils.showCustomToast(monetizationActivity, string);
                monetizationActivity.finish();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {
        public g() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(String str) {
            String str2 = str;
            if (str2 != null) {
                Utils.INSTANCE.showCustomToast(MonetizationActivity.this, str2);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public h() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                MonetizationActivity.this.V = bool2.booleanValue();
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public i() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                if (booleanValue) {
                    int i6 = MonetizationActivity.c0;
                    monetizationActivity.getClass();
                    try {
                        if (monetizationActivity.C) {
                            Dialog dialog = monetizationActivity.f11421y;
                            if (dialog != null) {
                                dialog.show();
                            } else {
                                kotlin.jvm.internal.i.q("loadingDialog");
                                throw null;
                            }
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(monetizationActivity.f11418v, e10);
                    }
                } else {
                    int i10 = MonetizationActivity.c0;
                    monetizationActivity.r0();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public j() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                monetizationActivity.P = true;
                monetizationActivity.x0(true);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public k() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                MonetizationActivity monetizationActivity = MonetizationActivity.this;
                if (booleanValue) {
                    monetizationActivity.P = true;
                    monetizationActivity.x0(false);
                } else {
                    b.a title = new b.a(monetizationActivity).setTitle(monetizationActivity.getString(R.string.subscription_notice));
                    title.f1046a.f1031g = monetizationActivity.getString(R.string.payment_failure);
                    title.b(monetizationActivity.getString(R.string.notify_innerhour), new mn.c(monetizationActivity, 1));
                    AlertController.b bVar = title.f1046a;
                    bVar.f1036l = false;
                    bVar.f1028c = R.mipmap.ic_launcher_round;
                    title.c();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class l implements Animator.AnimatorListener {
        public l() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            ((LottieAnimationView) MonetizationActivity.this.n0(R.id.purchaseSuccessAnimation)).h();
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

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class m implements Animator.AnimatorListener {
        public m() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            MonetizationActivity monetizationActivity = MonetizationActivity.this;
            monetizationActivity.startActivityForResult(new Intent(monetizationActivity, MonetizationSuccessActivity.class).putExtra("pro", false), monetizationActivity.f11419w);
            monetizationActivity.n0(R.id.bgOverlay).setVisibility(8);
            ((ConstraintLayout) monetizationActivity.n0(R.id.purchaseSuccessView)).setTranslationY(0.0f);
            ((ConstraintLayout) monetizationActivity.n0(R.id.purchaseSuccessView)).setVisibility(8);
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

    public MonetizationActivity() {
        new ArrayList();
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = "";
        this.O = "";
        nn.h hVar = new nn.h();
        this.Q = hVar;
        this.R = new a1();
        this.S = hVar;
        this.X = "";
        this.Z = "";
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
                if (purchase != null && !this.f11416a0) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.APP_RESTART_ACKNOWLEDGE_PURCHASE, false);
                    String b10 = purchase.b();
                    kotlin.jvm.internal.i.f(b10, "purchase.purchaseToken");
                    this.O = b10;
                    Bundle bundle = new Bundle();
                    bundle.putString("plan", this.K);
                    bundle.putString("source", this.B);
                    bundle.putBoolean("isOnboarding", this.F);
                    bundle.putBoolean("signup_flow", this.G);
                    bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                    bundle.putString("screen", this.X);
                    bundle.putString("variant", "0");
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
                    if (this.T != null && this.U != null && kotlin.jvm.internal.i.b(purchase.a().get(0), this.U)) {
                        MonetizationViewModel q03 = q0();
                        String str = this.T;
                        kotlin.jvm.internal.i.d(str);
                        v.H(kc.f.H(q03), o0.f23642c, 0, new q(q03, str, null), 2);
                    }
                    androidx.work.k kVar = this.f11420x;
                    if (kVar != null) {
                        kVar.l();
                    } else {
                        kotlin.jvm.internal.i.q("billingClient");
                        throw null;
                    }
                }
            } else if (!kotlin.jvm.internal.i.b(this.J, "")) {
                r0();
                b.a title = new b.a(this).setTitle(getString(R.string.purchase_request_failed));
                title.f1046a.f1031g = getString(R.string.play_store_payment_fail);
                title.b(getString(R.string.retry_now), new mn.c(this, 0));
                b.a negativeButton = title.setNegativeButton(R.string.cancel, null);
                negativeButton.f1046a.f1028c = R.mipmap.ic_launcher_round;
                negativeButton.c();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11418v, e10);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11417b0;
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

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:12:0x002f, B:30:0x0066, B:32:0x0079, B:33:0x007d, B:35:0x0083, B:37:0x0091, B:38:0x0094, B:40:0x0098, B:41:0x00a1, B:42:0x00a6, B:43:0x00a7, B:44:0x00ac, B:19:0x0043, B:22:0x004e, B:26:0x005a, B:11:0x002a, B:3:0x0017, B:5:0x001b, B:7:0x001f, B:8:0x0023, B:9:0x0028), top: B:48:0x0017, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:12:0x002f, B:30:0x0066, B:32:0x0079, B:33:0x007d, B:35:0x0083, B:37:0x0091, B:38:0x0094, B:40:0x0098, B:41:0x00a1, B:42:0x00a6, B:43:0x00a7, B:44:0x00ac, B:19:0x0043, B:22:0x004e, B:26:0x005a, B:11:0x002a, B:3:0x0017, B:5:0x001b, B:7:0x001f, B:8:0x0023, B:9:0x0028), top: B:48:0x0017, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, c4.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(String sku, String offerToken, String price, String currency) {
        String str;
        List<c4.h> list;
        String str2 = this.f11418v;
        kotlin.jvm.internal.i.g(sku, "sku");
        kotlin.jvm.internal.i.g(offerToken, "offerToken");
        kotlin.jvm.internal.i.g(price, "price");
        kotlin.jvm.internal.i.g(currency, "currency");
        try {
            try {
                if (this.C) {
                    Dialog dialog = this.f11421y;
                    if (dialog != null) {
                        dialog.show();
                    } else {
                        kotlin.jvm.internal.i.q("loadingDialog");
                        throw null;
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, e10);
            }
            int hashCode = sku.hashCode();
            if (hashCode != -974739188) {
                if (hashCode != 1557926636) {
                    if (hashCode == 1936572032 && sku.equals(Constants.SUBSCRIPTION_BASIC_1)) {
                        str = "plus_monthly";
                        this.K = str;
                        this.J = sku;
                        this.L = price;
                        this.M = currency;
                        this.N = offerToken;
                        x xVar = new x();
                        list = this.I;
                        if (list == null) {
                            for (c4.h hVar : list) {
                                if (kotlin.jvm.internal.i.b(hVar.f4924c, sku)) {
                                    xVar.f23469u = hVar;
                                }
                            }
                            androidx.work.k kVar = this.f11420x;
                            if (kVar != null) {
                                kVar.C(new a(xVar, offerToken, this));
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("billingClient");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.i.q("productDetailsList");
                        throw null;
                    }
                    str = sku;
                    this.K = str;
                    this.J = sku;
                    this.L = price;
                    this.M = currency;
                    this.N = offerToken;
                    x xVar2 = new x();
                    list = this.I;
                    if (list == null) {
                    }
                } else if (sku.equals(Constants.SUBSCRIPTION_BASIC_2)) {
                    str = "plus_quarterly";
                    this.K = str;
                    this.J = sku;
                    this.L = price;
                    this.M = currency;
                    this.N = offerToken;
                    x xVar22 = new x();
                    list = this.I;
                    if (list == null) {
                    }
                } else {
                    str = sku;
                    this.K = str;
                    this.J = sku;
                    this.L = price;
                    this.M = currency;
                    this.N = offerToken;
                    x xVar222 = new x();
                    list = this.I;
                    if (list == null) {
                    }
                }
            } else {
                if (sku.equals(Constants.SUBSCRIPTION_BASIC_3)) {
                    str = "plus_annual";
                    this.K = str;
                    this.J = sku;
                    this.L = price;
                    this.M = currency;
                    this.N = offerToken;
                    x xVar2222 = new x();
                    list = this.I;
                    if (list == null) {
                    }
                }
                str = sku;
                this.K = str;
                this.J = sku;
                this.L = price;
                this.M = currency;
                this.N = offerToken;
                x xVar22222 = new x();
                list = this.I;
                if (list == null) {
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        if (i6 == this.f11419w) {
            this.f11416a0 = true;
            ApplicationPersistence.getInstance().resetSubscriptionPrefs(Boolean.TRUE);
            Intent intent2 = new Intent();
            intent2.putExtra("purchase_successful", true);
            setResult(-1, intent2);
            finish();
        }
        super.onActivityResult(i6, i10, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea A[Catch: Exception -> 0x0118, TryCatch #0 {Exception -> 0x0118, blocks: (B:3:0x0011, B:5:0x001c, B:7:0x0022, B:9:0x0028, B:10:0x002a, B:12:0x0032, B:17:0x003f, B:18:0x0041, B:20:0x0047, B:23:0x0050, B:25:0x0084, B:27:0x0088, B:29:0x0098, B:38:0x00cb, B:40:0x00ea, B:43:0x0100, B:30:0x00a3, B:31:0x00a8, B:32:0x00a9, B:34:0x00af, B:36:0x00c1, B:37:0x00c8), top: B:48:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_monetization);
        try {
            if (getIntent().hasExtra("source")) {
                Intent intent = getIntent();
                if (intent != null) {
                    str = intent.getStringExtra("source");
                } else {
                    str = null;
                }
                this.B = str;
            }
            Intent intent2 = getIntent();
            boolean z11 = false;
            if (intent2 != null && intent2.getBooleanExtra("tutorial", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.F = true;
            }
            Intent intent3 = getIntent();
            if (intent3 != null && intent3.getBooleanExtra("onboarding_flow_new_user", false)) {
                z11 = true;
            }
            this.G = z11;
            LocationPersistence.INSTANCE.isIndianUser();
            this.Y = getIntent().getStringExtra(Constants.CAMPAIGN_ID);
            s0();
            this.f11420x = new c4.a(true, this, this);
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
                        this.f11422z = bVar;
                        String str2 = gk.a.f16573a;
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
                            String str3 = this.B;
                            if (str3 == null) {
                                str3 = "";
                            }
                            hashMap.put("source", str3);
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
                u0();
            }
            String str22 = gk.a.f16573a;
            Bundle bundle22 = new Bundle();
            bundle22.putString("variant", "0");
            bundle22.putString("source", this.B);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle22, "selling_screen_load");
            if (!new gk.e().a()) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11418v, e10);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MyApplication.V.a().E = false;
        androidx.work.k kVar = this.f11420x;
        if (kVar != null) {
            if (kVar != null) {
                kVar.l();
            } else {
                kotlin.jvm.internal.i.q("billingClient");
                throw null;
            }
        }
        if (this.H != null) {
            q0().C.k(this);
            q0().D.k(this);
            q0().j().k(this);
            q0().i().k(this);
            q0().l().k(this);
            ((w) q0().f11452b0.getValue()).k(this);
            q0().h().k(this);
            q0().k().k(this);
            ((w) q0().c0.getValue()).k(this);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: Exception -> 0x008d, TryCatch #0 {Exception -> 0x008d, blocks: (B:10:0x0013, B:12:0x0017, B:14:0x0021, B:16:0x0026, B:18:0x0057, B:24:0x0063, B:26:0x0071, B:25:0x006a, B:15:0x0024), top: B:31:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x008d, TryCatch #0 {Exception -> 0x008d, blocks: (B:10:0x0013, B:12:0x0017, B:14:0x0021, B:16:0x0026, B:18:0x0057, B:24:0x0063, B:26:0x0071, B:25:0x006a, B:15:0x0024), top: B:31:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        Fragment fragment;
        boolean z10;
        int b10;
        if (this.D && this.E && this.C) {
            r0();
            if (!this.V) {
                try {
                    if (!this.P) {
                        if (kotlin.jvm.internal.i.b(this.Z, Constants.LINK_DYNAMIC_CAMPAIGN)) {
                            fragment = this.R;
                        } else {
                            fragment = this.Q;
                        }
                        this.S = fragment;
                        ((RobertoTextView) n0(R.id.tvMonetizationPlusTab)).setText("Plus");
                        ((RobertoTextView) n0(R.id.tvMonetizationPlusTab)).setFont("Lato-Bold.ttf");
                        ((RobertoTextView) n0(R.id.tvMonetizationPlusTab)).setTextSize(2, 28.0f);
                        RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.tvMonetizationPlusTab);
                        String str = this.W;
                        if (str != null && str.length() != 0) {
                            z10 = false;
                            if (z10) {
                                b10 = Color.parseColor(this.W);
                            } else {
                                b10 = g0.a.b(this, R.color.basic_selling_screen_purple);
                            }
                            robertoTextView.setTextColor(b10);
                            y supportFragmentManager = getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                            aVar.f(R.id.flMonetizationFrame, this.S, null);
                            aVar.k();
                        }
                        z10 = true;
                        if (z10) {
                        }
                        robertoTextView.setTextColor(b10);
                        y supportFragmentManager2 = getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                        aVar2.f(R.id.flMonetizationFrame, this.S, null);
                        aVar2.k();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f11418v, "exception", e10);
                }
            }
        }
    }

    public final MonetizationViewModel q0() {
        MonetizationViewModel monetizationViewModel = this.H;
        if (monetizationViewModel != null) {
            return monetizationViewModel;
        }
        kotlin.jvm.internal.i.q("monetizationViewModel");
        throw null;
    }

    public final void r0() {
        try {
            if (this.C) {
                Dialog dialog = this.f11421y;
                if (dialog != null) {
                    dialog.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("loadingDialog");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11418v, e10);
        }
    }

    public final void s0() {
        WindowManager.LayoutParams layoutParams;
        String str = this.f11418v;
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
                this.f11421y = dialog;
            }
            MyApplication.V.a().E = true;
            ((AppCompatImageView) n0(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ MonetizationActivity f25646v;

                {
                    this.f25646v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    MonetizationActivity this$0 = this.f25646v;
                    switch (i6) {
                        case 0:
                            int i10 = MonetizationActivity.c0;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        default:
                            int i11 = MonetizationActivity.c0;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                    }
                }
            });
            AppCompatImageView appCompatImageView = (AppCompatImageView) n0(R.id.header_cross);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: mn.d

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ MonetizationActivity f25646v;

                    {
                        this.f25646v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = r2;
                        MonetizationActivity this$0 = this.f25646v;
                        switch (i6) {
                            case 0:
                                int i10 = MonetizationActivity.c0;
                                i.g(this$0, "this$0");
                                this$0.finish();
                                return;
                            default:
                                int i11 = MonetizationActivity.c0;
                                i.g(this$0, "this$0");
                                this$0.finish();
                                return;
                        }
                    }
                });
            }
            Window window2 = getWindow();
            window2.setStatusBarColor(g0.a.b(this, R.color.white));
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 23) {
                window2.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility() | 8192);
            }
            if (u.Z1(ca.a.k("assessment", "locked_card"), this.B)) {
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) n0(R.id.header_arrow_back);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(8);
                }
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) n0(R.id.header_cross);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(0);
                }
            }
            if (i6 < 25) {
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
        finish();
    }

    public final void u0() {
        qn.c cVar = new qn.c();
        Application application = getApplication();
        kotlin.jvm.internal.i.f(application, "application");
        MonetizationViewModel monetizationViewModel = (MonetizationViewModel) new androidx.lifecycle.o0(this, new jl.q(application, this.Y, cVar)).a(MonetizationViewModel.class);
        kotlin.jvm.internal.i.g(monetizationViewModel, "<set-?>");
        this.H = monetizationViewModel;
        MonetizationViewModel q02 = q0();
        q02.f();
        q02.C.e(this, new gn.l(18, new c(q02)));
        q02.i().e(this, new gn.l(19, new d()));
        q02.j().e(this, new gn.l(20, new e()));
        q02.D.e(this, new gn.l(21, new f()));
        q02.l().e(this, new gn.l(22, new g()));
        q02.h().e(this, new gn.l(23, new h()));
        q02.k().e(this, new gn.l(24, new i()));
        ((w) q02.f11452b0.getValue()).e(this, new gn.l(25, new j()));
        ((w) q02.c0.getValue()).e(this, new gn.l(26, new k()));
    }

    public final void v0() {
        try {
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_feedback_fullscreen, this, R.style.Theme_Dialog_Fullscreen);
            View findViewById = styledDialog.findViewById(R.id.robertoTextView);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(getString(R.string.monetization_feedback));
            View findViewById2 = styledDialog.findViewById(R.id.btnSubmit);
            kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
            ((RobertoButton) findViewById2).setOnClickListener(new w0(styledDialog, 28, this));
            View findViewById3 = styledDialog.findViewById(R.id.btnSkip);
            kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoButton");
            ((RobertoButton) findViewById3).setOnClickListener(new lm.f(styledDialog, 7));
            View findViewById4 = styledDialog.findViewById(R.id.close);
            kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) findViewById4).setOnClickListener(new lm.f(styledDialog, 8));
            Window window = styledDialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            styledDialog.show();
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("variant", "0");
            bundle.putString("screen", this.X);
            bundle.putString("package", "plus");
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "monetization_feedback_click");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11418v, "exception", e10);
        }
    }

    public final void w0() {
        try {
            if (new s5(15).b(this)) {
                d.b bVar = new d.b();
                Integer valueOf = Integer.valueOf(g0.a.b(this, R.color.dashboard_grey) | (-16777216));
                Bundle bundle = new Bundle();
                if (valueOf != null) {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                }
                bVar.f29100c = bundle;
                bVar.a().a(this, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                return;
            }
            Intent intent = new Intent(this, WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
            startActivity(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11418v, e10);
        }
    }

    public final void x0(boolean z10) {
        n0(R.id.bgOverlay).setVisibility(0);
        n0(R.id.bgOverlay).setOnClickListener(new il.g(13));
        if (z10) {
            ((RobertoTextView) n0(R.id.purchaseSuccessText)).setText(getString(R.string.plusUnlocked));
        }
        ((ConstraintLayout) n0(R.id.purchaseSuccessView)).setVisibility(0);
        ((ConstraintLayout) n0(R.id.purchaseSuccessView)).animate().translationY(((ConstraintLayout) n0(R.id.purchaseSuccessView)).getHeight()).alpha(1.0f).setDuration(700L).setListener(new l());
        ((LottieAnimationView) n0(R.id.purchaseSuccessAnimation)).c(new m());
    }

    public final void y0() {
        try {
            if (new s5(15).b(this)) {
                d.b bVar = new d.b();
                Integer valueOf = Integer.valueOf(g0.a.b(this, R.color.dashboard_grey) | (-16777216));
                Bundle bundle = new Bundle();
                if (valueOf != null) {
                    bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                }
                bVar.f29100c = bundle;
                bVar.a().a(this, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                return;
            }
            Intent intent = new Intent(this, WebviewActivity.class);
            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
            startActivity(intent);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11418v, e10);
        }
    }

    /* compiled from: MonetizationActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c4.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x<c4.h> f11423a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f11424b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ MonetizationActivity f11425c;

        public a(x<c4.h> xVar, String str, MonetizationActivity monetizationActivity) {
            this.f11423a = xVar;
            this.f11424b = str;
            this.f11425c = monetizationActivity;
        }

        @Override // c4.e
        public final void a(c4.g p02) {
            kotlin.jvm.internal.i.g(p02, "p0");
            int i6 = p02.f4918a;
            MonetizationActivity monetizationActivity = this.f11425c;
            if (i6 == 0) {
                f.b.a aVar = new f.b.a();
                c4.h hVar = this.f11423a.f23469u;
                kotlin.jvm.internal.i.d(hVar);
                c4.h hVar2 = hVar;
                aVar.f4913a = hVar2;
                if (hVar2.a() != null) {
                    hVar2.a().getClass();
                    aVar.f4914b = hVar2.a().f4928a;
                }
                String str = this.f11424b;
                aVar.f4914b = str;
                if (aVar.f4913a != null) {
                    if (str != null) {
                        List O0 = ca.a.O0(new f.b(aVar));
                        f.a aVar2 = new f.a();
                        aVar2.f4909a = new ArrayList(O0);
                        c4.f a10 = aVar2.a();
                        androidx.work.k kVar = monetizationActivity.f11420x;
                        if (kVar != null) {
                            kVar.v(monetizationActivity, a10);
                            Bundle bundle = new Bundle();
                            bundle.putString("plan", monetizationActivity.K);
                            bundle.putString("source", monetizationActivity.B);
                            bundle.putBoolean("isOnboarding", monetizationActivity.F);
                            bundle.putBoolean("signup_flow", monetizationActivity.G);
                            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                            bundle.putString("screen", monetizationActivity.X);
                            bundle.putString("variant", "0");
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
            LogHelper.INSTANCE.e(monetizationActivity.f11418v, "Billing Client not ready");
        }

        @Override // c4.e
        public final void b() {
        }
    }
}
