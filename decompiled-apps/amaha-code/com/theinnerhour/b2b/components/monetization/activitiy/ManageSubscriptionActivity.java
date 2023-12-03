package com.theinnerhour.b2b.components.monetization.activitiy;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.monetization.activitiy.ManageSubscriptionActivity;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gk.a;
import gv.n;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import lm.f;
import pl.w0;
/* compiled from: ManageSubscriptionActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/monetization/activitiy/ManageSubscriptionActivity;", "Landroidx/appcompat/app/c;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ManageSubscriptionActivity extends c implements SubscriptionPersistence.SubscriptionInitialiseListener {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f11392y = 0;

    /* renamed from: v  reason: collision with root package name */
    public SubscriptionModel f11393v;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f11395x = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11394w = LogHelper.INSTANCE.makeLogTag(ManageSubscriptionActivity.class);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        String str;
        String F0;
        try {
            n0(R.id.manageSubscriptionBG).setVisibility(8);
            ((ProgressBar) n0(R.id.manageSubscriptionProgress)).setVisibility(8);
            SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
            i.g(currentSubscriptionModel, "<set-?>");
            this.f11393v = currentSubscriptionModel;
            RobertoTextView robertoTextView = (RobertoTextView) n0(R.id.subscriptionManagePlanName);
            if (i.b(PaymentUtils.INSTANCE.getSubscriptionType(o0().getPlan()), "plus")) {
                str = "Amaha Plus";
            } else {
                str = "Amaha Pro";
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) n0(R.id.subscriptionManagePlanStatus);
            String F02 = n.F0(o0().getStatus(), "￼", "");
            switch (F02.hashCode()) {
                case -1575950655:
                    if (F02.equals(Constants.STATE_PURCHASED)) {
                        F0 = "Active";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case -677165568:
                    if (F02.equals(Constants.STATE_GRACE_PERIOD)) {
                        F0 = "In Grace Period";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case -290017821:
                    if (F02.equals(Constants.STATE_SUBSCRIPTION_EXPIRED)) {
                        F0 = "Expired";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case -277386755:
                    if (F02.equals(Constants.STATE_ON_HOLD)) {
                        F0 = "On Hold";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case 1115766416:
                    if (F02.equals(Constants.STATE_PAUSED)) {
                        F0 = "Paused";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case 1212857409:
                    if (F02.equals(Constants.STATE_RECOVERED)) {
                        F0 = "Recovered";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case 1407800699:
                    if (F02.equals(Constants.STATE_CANCELLED)) {
                        F0 = "Cancelled";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case 2111680170:
                    if (F02.equals(Constants.STATE_SUBSCRIPTION_RENEWED)) {
                        F0 = "Renewed";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                case 2119354716:
                    if (F02.equals(Constants.STATE_SUBSCRIPTION_REVOKED)) {
                        F0 = "Revoked";
                        break;
                    } else {
                        F0 = n.F0(o0().getStatus(), "￼", "");
                        break;
                    }
                default:
                    F0 = n.F0(o0().getStatus(), "￼", "");
                    break;
            }
            robertoTextView2.setText(F0);
            if (i.b(n.F0(o0().getStatus(), "￼", ""), Constants.STATE_SUBSCRIPTION_EXPIRED)) {
                ((RobertoButton) n0(R.id.subscriptionManageButton)).setText(getString(R.string.renew_subscription));
            }
            ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ManageSubscriptionActivity f25640v;

                {
                    this.f25640v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    ManageSubscriptionActivity this$0 = this.f25640v;
                    switch (i6) {
                        case 0:
                            int i10 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 1:
                            int i11 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            gk.a.b(null, "manage_subscription_grace_update_now_click");
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                            return;
                        case 2:
                            int i12 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.p0();
                            return;
                        case 3:
                            int i13 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                            return;
                        case 4:
                            int i14 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.p0();
                            return;
                        default:
                            int i15 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                            return;
                    }
                }
            });
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(o0().getExpiryTime());
            ((RobertoTextView) n0(R.id.subscriptionManagePlanExpiry)).setText(DateFormat.format("dd-MM-yyyy", calendar).toString());
            if (!i.b(o0().getPlan(), Constants.SUBSCRIPTION_BASIC_FREE) && !i.b(o0().getPlan(), Constants.PR_COUPON_CODE_SKU)) {
                if (i.b(o0().getStatus(), Constants.STATE_GRACE_PERIOD)) {
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setVisibility(0);
                    ((RobertoButton) n0(R.id.subscriptionManageButton)).setVisibility(8);
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setVisibility(0);
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setText(R.string.manageSubscriptionGraceCTA1);
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setText(R.string.manageSubscriptionGraceCTA2);
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ManageSubscriptionActivity f25640v;

                        {
                            this.f25640v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r2;
                            ManageSubscriptionActivity this$0 = this.f25640v;
                            switch (i6) {
                                case 0:
                                    int i10 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.finish();
                                    return;
                                case 1:
                                    int i11 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    gk.a.b(null, "manage_subscription_grace_update_now_click");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 2:
                                    int i12 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                case 3:
                                    int i13 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 4:
                                    int i14 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                default:
                                    int i15 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                            }
                        }
                    });
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ManageSubscriptionActivity f25640v;

                        {
                            this.f25640v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r2;
                            ManageSubscriptionActivity this$0 = this.f25640v;
                            switch (i6) {
                                case 0:
                                    int i10 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.finish();
                                    return;
                                case 1:
                                    int i11 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    gk.a.b(null, "manage_subscription_grace_update_now_click");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 2:
                                    int i12 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                case 3:
                                    int i13 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 4:
                                    int i14 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                default:
                                    int i15 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                            }
                        }
                    });
                } else if (i.b(o0().getStatus(), Constants.STATE_ON_HOLD)) {
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setVisibility(0);
                    ((RobertoButton) n0(R.id.subscriptionManageButton)).setVisibility(8);
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setVisibility(0);
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setText(R.string.manageSubscriptionGraceCTA1);
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setText(R.string.manageSubscriptionGraceCTA2);
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ManageSubscriptionActivity f25640v;

                        {
                            this.f25640v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r2;
                            ManageSubscriptionActivity this$0 = this.f25640v;
                            switch (i6) {
                                case 0:
                                    int i10 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.finish();
                                    return;
                                case 1:
                                    int i11 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    gk.a.b(null, "manage_subscription_grace_update_now_click");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 2:
                                    int i12 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                case 3:
                                    int i13 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 4:
                                    int i14 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                default:
                                    int i15 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                            }
                        }
                    });
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ ManageSubscriptionActivity f25640v;

                        {
                            this.f25640v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = r2;
                            ManageSubscriptionActivity this$0 = this.f25640v;
                            switch (i6) {
                                case 0:
                                    int i10 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.finish();
                                    return;
                                case 1:
                                    int i11 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    gk.a.b(null, "manage_subscription_grace_update_now_click");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 2:
                                    int i12 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                case 3:
                                    int i13 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                                case 4:
                                    int i14 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.p0();
                                    return;
                                default:
                                    int i15 = ManageSubscriptionActivity.f11392y;
                                    i.g(this$0, "this$0");
                                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                    return;
                            }
                        }
                    });
                } else {
                    ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setVisibility(8);
                    ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setVisibility(8);
                }
                ((RobertoButton) n0(R.id.subscriptionManageButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ ManageSubscriptionActivity f25640v;

                    {
                        this.f25640v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = r2;
                        ManageSubscriptionActivity this$0 = this.f25640v;
                        switch (i6) {
                            case 0:
                                int i10 = ManageSubscriptionActivity.f11392y;
                                i.g(this$0, "this$0");
                                this$0.finish();
                                return;
                            case 1:
                                int i11 = ManageSubscriptionActivity.f11392y;
                                i.g(this$0, "this$0");
                                gk.a.b(null, "manage_subscription_grace_update_now_click");
                                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                return;
                            case 2:
                                int i12 = ManageSubscriptionActivity.f11392y;
                                i.g(this$0, "this$0");
                                this$0.p0();
                                return;
                            case 3:
                                int i13 = ManageSubscriptionActivity.f11392y;
                                i.g(this$0, "this$0");
                                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                return;
                            case 4:
                                int i14 = ManageSubscriptionActivity.f11392y;
                                i.g(this$0, "this$0");
                                this$0.p0();
                                return;
                            default:
                                int i15 = ManageSubscriptionActivity.f11392y;
                                i.g(this$0, "this$0");
                                this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                                return;
                        }
                    }
                });
            }
            ((RobertoButton) n0(R.id.subscriptionManageUpgradeButton)).setVisibility(8);
            ((RobertoButton) n0(R.id.subscriptionManageButton)).setVisibility(8);
            ((RobertoButton) n0(R.id.subscriptionManageKnowMoreButton)).setVisibility(8);
            ((RobertoButton) n0(R.id.subscriptionManageButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mn.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ManageSubscriptionActivity f25640v;

                {
                    this.f25640v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    ManageSubscriptionActivity this$0 = this.f25640v;
                    switch (i6) {
                        case 0:
                            int i10 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 1:
                            int i11 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            gk.a.b(null, "manage_subscription_grace_update_now_click");
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                            return;
                        case 2:
                            int i12 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.p0();
                            return;
                        case 3:
                            int i13 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                            return;
                        case 4:
                            int i14 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.p0();
                            return;
                        default:
                            int i15 = ManageSubscriptionActivity.f11392y;
                            i.g(this$0, "this$0");
                            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11394w, e10);
        }
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f11395x;
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

    public final SubscriptionModel o0() {
        SubscriptionModel subscriptionModel = this.f11393v;
        if (subscriptionModel != null) {
            return subscriptionModel;
        }
        i.q("subscriptionModel");
        throw null;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_manage_subscription);
        n0(R.id.manageSubscriptionBG).setVisibility(0);
        ((ProgressBar) n0(R.id.manageSubscriptionProgress)).setVisibility(0);
        SubscriptionPersistence.INSTANCE.fetchData(this);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        super.onDestroy();
    }

    public final void p0() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("source", "manage_subscriptions");
            a.b(null, "manage_subscription_grace_learn_more_click");
            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_grace_fullscreen, this, R.style.Theme_Dialog_Fullscreen);
            Window window = styledDialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            ((AppCompatImageView) styledDialog.findViewById(R.id.dialogGraceBack)).setOnClickListener(new f(styledDialog, 4));
            ((RobertoButton) styledDialog.findViewById(R.id.btnGraceDialogCTA)).setOnClickListener(new w0(this, 26, bundle));
            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint3Body)).setMovementMethod(LinkMovementMethod.getInstance());
            ((RobertoTextView) styledDialog.findViewById(R.id.tvGracePoint5Body)).setMovementMethod(LinkMovementMethod.getInstance());
            styledDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11394w, e10);
        }
    }
}
