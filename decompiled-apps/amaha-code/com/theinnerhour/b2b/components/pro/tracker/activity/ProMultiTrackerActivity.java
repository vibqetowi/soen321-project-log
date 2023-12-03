package com.theinnerhour.b2b.components.pro.tracker.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerInsightsActivity;
import com.theinnerhour.b2b.components.pro.tracker.activity.ProMultiTrackerActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import oo.b;
import ro.c;
import ro.d;
import rr.a;
import ta.v;
/* compiled from: ProMultiTrackerActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/pro/tracker/activity/ProMultiTrackerActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProMultiTrackerActivity extends a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11558x;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f11560z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final int f11557w = 7536;

    /* renamed from: y  reason: collision with root package name */
    public final SimpleDateFormat f11559y = new SimpleDateFormat("dd/MM/yyyy");

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        Bundle bundle;
        int i11;
        super.onActivityResult(i6, i10, intent);
        if (i6 == this.f11557w) {
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                int intValue = Integer.valueOf(bundle.getInt("mood")).intValue();
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_tracker_check, this, R.style.Theme_Dialog_Fullscreen);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(R.id.trackerCheckAnimation);
                CardView cardView = (CardView) styledDialog.findViewById(R.id.trackerCardCheck);
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue == 5) {
                                    i11 = R.color.trackerYellow;
                                }
                            } else {
                                i11 = R.color.trackerBlue;
                            }
                        } else {
                            i11 = R.color.trackerPink;
                        }
                    } else {
                        i11 = R.color.trackerPurple;
                    }
                    cardView.setCardBackgroundColor(g0.a.b(this, i11));
                    lottieAnimationView.c(new c(styledDialog, lottieAnimationView));
                    styledDialog.setCancelable(false);
                    styledDialog.show();
                    lottieAnimationView.h();
                    ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setEnabled(true);
                    ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setAlpha(1.0f);
                    Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                    analyticsBundle.putString("source", "pro");
                    analyticsBundle.putInt("mood", intValue);
                    UtilsKt.fireAnalytics("new_tracker_tracking_complete", analyticsBundle);
                }
                i11 = R.color.trackerGrey;
                cardView.setCardBackgroundColor(g0.a.b(this, i11));
                lottieAnimationView.c(new c(styledDialog, lottieAnimationView));
                styledDialog.setCancelable(false);
                styledDialog.show();
                lottieAnimationView.h();
                ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setEnabled(true);
                ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setAlpha(1.0f);
                Bundle analyticsBundle2 = UtilsKt.getAnalyticsBundle();
                analyticsBundle2.putString("source", "pro");
                analyticsBundle2.putInt("mood", intValue);
                UtilsKt.fireAnalytics("new_tracker_tracking_complete", analyticsBundle2);
            }
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        setContentView(R.layout.activity_pro_multi_tracker);
        if (Build.VERSION.SDK_INT >= 23) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
            getWindow().setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
        } else {
            getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
        }
        Intent intent = getIntent();
        if (intent != null) {
            z10 = intent.getBooleanExtra("isMultiTrackerAssigned", false);
        } else {
            z10 = false;
        }
        this.f11558x = z10;
        ((AppCompatImageView) u0(R.id.proMultiTrackerLogs)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.proMultiTrackerBack)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        if (this.f11558x) {
            ((AppCompatImageView) u0(R.id.proMultiTrackerNullState)).setVisibility(8);
            ((RobertoTextView) u0(R.id.proMultiTrackerNullStateText)).setVisibility(8);
            u0(R.id.proMultiTrackerCard).setVisibility(0);
            ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setVisibility(0);
            v.H(h.c(o0.f23640a), null, 0, new d(this, null), 3);
        } else {
            ((AppCompatImageView) u0(R.id.proMultiTrackerNullState)).setVisibility(0);
            ((RobertoTextView) u0(R.id.proMultiTrackerNullStateText)).setVisibility(0);
            u0(R.id.proMultiTrackerCard).setVisibility(8);
            ((RobertoButton) u0(R.id.proMultiTrackerCTA)).setVisibility(8);
        }
        if (ApplicationPersistence.getInstance().getBooleanValue("pro_multi_tracker_alert_1", false)) {
            ((RelativeLayout) u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
        } else {
            ((RelativeLayout) u0(R.id.proMultiTrackerGotItCard)).setVisibility(0);
            ((RobertoButton) u0(R.id.proMultiTrackerInfoCTA)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ProMultiTrackerActivity f30839v;

                {
                    this.f30839v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    ProMultiTrackerActivity this$0 = this.f30839v;
                    switch (i6) {
                        case 0:
                            int i10 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                            intent2.putExtra("show_logs", true);
                            this$0.startActivity(intent2);
                            Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                            analyticsBundle.putString("source", "pro");
                            UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                            return;
                        case 1:
                            int i11 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 2:
                            int i12 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                            this$0.finish();
                            return;
                        case 3:
                            int i13 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.v0(1);
                            return;
                        case 4:
                            int i14 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.v0(2);
                            return;
                        case 5:
                            int i15 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.v0(3);
                            return;
                        case 6:
                            int i16 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.v0(4);
                            return;
                        case 7:
                            int i17 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            this$0.v0(5);
                            return;
                        default:
                            int i18 = ProMultiTrackerActivity.A;
                            i.g(this$0, "this$0");
                            ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                            ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                            bundle2.putBoolean("tracker_present", this$0.f11558x);
                            UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                            return;
                    }
                }
            });
        }
        ((AppCompatImageView) u0(R.id.proMultiTrackerCard).findViewById(R.id.trackerMoodOne)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.proMultiTrackerCard).findViewById(R.id.trackerMoodTwo)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.proMultiTrackerCard).findViewById(R.id.trackerMoodThree)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.proMultiTrackerCard).findViewById(R.id.trackerMoodFour)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.proMultiTrackerCard).findViewById(R.id.trackerMoodFive)).setOnClickListener(new View.OnClickListener(this) { // from class: ro.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ProMultiTrackerActivity f30839v;

            {
                this.f30839v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                ProMultiTrackerActivity this$0 = this.f30839v;
                switch (i6) {
                    case 0:
                        int i10 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        Intent intent2 = new Intent(this$0, MultiTrackerInsightsActivity.class);
                        intent2.putExtra("show_logs", true);
                        this$0.startActivity(intent2);
                        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
                        analyticsBundle.putString("source", "pro");
                        UtilsKt.fireAnalytics("new_tracker_logs_open", analyticsBundle);
                        return;
                    case 1:
                        int i11 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 2:
                        int i12 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("pro_new_tracker_done_click", new Bundle());
                        this$0.finish();
                        return;
                    case 3:
                        int i13 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(1);
                        return;
                    case 4:
                        int i14 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(2);
                        return;
                    case 5:
                        int i15 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(3);
                        return;
                    case 6:
                        int i16 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(4);
                        return;
                    case 7:
                        int i17 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        this$0.v0(5);
                        return;
                    default:
                        int i18 = ProMultiTrackerActivity.A;
                        i.g(this$0, "this$0");
                        ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_1", true);
                        ((RelativeLayout) this$0.u0(R.id.proMultiTrackerGotItCard)).setVisibility(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants.SCREEN_TRAKCER, "new");
                        bundle2.putBoolean("tracker_present", this$0.f11558x);
                        UtilsKt.fireAnalytics("pro_tracker_alert_click", bundle2);
                        return;
                }
            }
        });
        if (this.f11558x && !ApplicationPersistence.getInstance().getBooleanValue("pro_multi_tracker_alert_2", false)) {
            View inflate = getLayoutInflater().inflate(R.layout.fragment_pro_tracker_bottom_sheet, (ViewGroup) ((ConstraintLayout) u0(R.id.proMultiTrackerParent)), false);
            i.f(inflate, "layoutInflater.inflate(R…ultiTrackerParent, false)");
            e eVar = new e(this, R.style.TransparentBottomSheetDialog);
            eVar.setContentView(inflate);
            AppCompatImageView appCompatImageView = (AppCompatImageView) eVar.findViewById(R.id.proTrackerBottomSheetImg);
            if (appCompatImageView != null) {
                appCompatImageView.setImageDrawable(a.c.b(this, R.drawable.ir_pro_multi_tracker_bottom_sheet));
            }
            RobertoTextView robertoTextView = (RobertoTextView) eVar.findViewById(R.id.proTrackerBottomSheetText);
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.pmtBottomSheet));
            }
            RobertoButton robertoButton = (RobertoButton) eVar.findViewById(R.id.proTrackerBottomSheetCTA);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new b(eVar, 2));
            }
            eVar.setCancelable(false);
            eVar.show();
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.f11560z;
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

    public final void v0(int i6) {
        Intent intent = new Intent(this, MultiTrackerActivity.class);
        intent.putExtra("mood", i6);
        intent.putExtra("source", "pro");
        startActivityForResult(intent, this.f11557w);
        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
        analyticsBundle.putInt("mood", i6);
        analyticsBundle.putString("source", "pro");
        UtilsKt.fireAnalytics("new_tracker_mood_click", analyticsBundle);
    }
}
