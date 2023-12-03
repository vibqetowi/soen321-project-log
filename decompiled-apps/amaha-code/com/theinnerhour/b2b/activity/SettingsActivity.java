package com.theinnerhour.b2b.activity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.android.material.bottomsheet.f;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.FAQActivity;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.activity.WebviewActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.ManageSubscriptionActivity;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import q.d;
import ss.l;
/* compiled from: SettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/SettingsActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SettingsActivity extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f10478z = 0;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f10480w;

    /* renamed from: x  reason: collision with root package name */
    public final yn.a f10481x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f10482y = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f10479v = LogHelper.INSTANCE.makeLogTag(SettingsActivity.class);

    /* compiled from: SettingsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ x<f> f10484v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x<f> xVar) {
            super(1);
            this.f10484v = xVar;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                SettingsActivity settingsActivity = SettingsActivity.this;
                ((RobertoTextView) settingsActivity.o0(R.id.enableNotifications)).setVisibility(8);
                settingsActivity.o0(R.id.settingsSeparator2).setVisibility(8);
            }
            f fVar = this.f10484v.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    public SettingsActivity() {
        boolean z10;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && user.getAppConfig().containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT) && !i.b(user.getAppConfig().get(Constants.DASHBOARD_LIBRARY_EXPERIMENT), "default")) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10480w = z10;
        this.f10481x = new yn.a();
    }

    public static void n0(SettingsActivity this$0) {
        i.g(this$0, "this$0");
        super.onBackPressed();
    }

    public final View o0(int i6) {
        LinkedHashMap linkedHashMap = this.f10482y;
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings);
        try {
            Window window = getWindow();
            if (Build.VERSION.SDK_INT >= 23) {
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 8192);
                window.setStatusBarColor(g0.a.b(this, R.color.white));
            } else {
                window.setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10479v, "Error in setting custom status bar", e10);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            this.f10481x.getClass();
            if (!yn.a.b()) {
                ((RobertoTextView) o0(R.id.enableNotifications)).setVisibility(0);
                o0(R.id.settingsSeparator2).setVisibility(0);
                ((RobertoTextView) o0(R.id.enableNotifications)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ SettingsActivity f12945v;

                    {
                        this.f12945v = this;
                    }

                    /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i6 = r2;
                        String str = null;
                        WindowManager.LayoutParams layoutParams = null;
                        SettingsActivity this$0 = this.f12945v;
                        switch (i6) {
                            case 0:
                                int i10 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                                ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                                xVar.f23469u = notificationPermissionBottomSheet;
                                notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                                return;
                            case 1:
                                int i11 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("variant", "new");
                                    User user = FirebasePersistence.getInstance().getUser();
                                    if (user != null) {
                                        str = user.getVersion();
                                    }
                                    bundle2.putString("version", str);
                                    gk.a.b(bundle2, "account_delete_click");
                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                                    Window window2 = styledDialog.getWindow();
                                    if (window2 != null) {
                                        window2.setLayout(-1, -1);
                                    }
                                    ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                                    ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                                    styledDialog.show();
                                    return;
                                } catch (Exception e11) {
                                    LogHelper.INSTANCE.e(this$0.f10479v, e11);
                                    return;
                                }
                            case 2:
                                int i12 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    if (new s5(15).b(this$0)) {
                                        d.b bVar = new d.b();
                                        Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                        Bundle bundle3 = new Bundle();
                                        if (valueOf != null) {
                                            bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                        }
                                        bVar.f29100c = bundle3;
                                        bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                        return;
                                    }
                                    Intent intent = new Intent(this$0, WebviewActivity.class);
                                    intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                                    this$0.startActivity(intent);
                                    return;
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e(this$0.f10479v, e12);
                                    return;
                                }
                            case 3:
                                int i13 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                try {
                                    if (new s5(15).b(this$0)) {
                                        d.b bVar2 = new d.b();
                                        Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                        Bundle bundle4 = new Bundle();
                                        if (valueOf2 != null) {
                                            bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                        }
                                        bVar2.f29100c = bundle4;
                                        bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                        return;
                                    }
                                    Intent intent2 = new Intent(this$0, WebviewActivity.class);
                                    intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                                    this$0.startActivity(intent2);
                                    return;
                                } catch (Exception e13) {
                                    LogHelper.INSTANCE.e(this$0.f10479v, e13);
                                    return;
                                }
                            case 4:
                                int i14 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                                try {
                                    kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                                    Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                                    Window window3 = styledDialog2.getWindow();
                                    if (window3 != null) {
                                        layoutParams = window3.getAttributes();
                                    }
                                    if (layoutParams != null) {
                                        layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                    }
                                    ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                                    ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                                    ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                                    styledDialog2.show();
                                    return;
                                } catch (Exception e14) {
                                    LogHelper.INSTANCE.e(this$0.f10479v, e14);
                                    return;
                                }
                            case 5:
                                int i15 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.startActivity(new Intent(this$0, FAQActivity.class));
                                return;
                            case 6:
                                SettingsActivity.n0(this$0);
                                return;
                            case 7:
                                int i16 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                boolean isConnected = ConnectionStatusReceiver.isConnected();
                                if (!isConnected) {
                                    Toast.makeText(this$0, "Connect to Internet", 0).show();
                                }
                                if (isConnected) {
                                    Intent r = tr.r.r(this$0);
                                    r.putExtra("switch_programme", true);
                                    r.putExtra("source", "setting");
                                    this$0.startActivity(r);
                                    return;
                                }
                                return;
                            case 8:
                                int i17 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                gk.a.b(null, "reset_programme_settings");
                                this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                                return;
                            case 9:
                                int i18 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                                Window window4 = styledDialog3.getWindow();
                                kotlin.jvm.internal.i.d(window4);
                                window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                                ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                                styledDialog3.show();
                                return;
                            default:
                                int i19 = SettingsActivity.f10478z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                    this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                                    return;
                                } else {
                                    this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                                    return;
                                }
                        }
                    }
                });
            }
        }
        ((RobertoTextView) o0(R.id.privacyPolicy)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        ((RobertoTextView) o0(R.id.termsOfUse)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        ((RobertoTextView) o0(R.id.settingsLogoutButton)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        ((RobertoTextView) o0(R.id.faq)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        ((AppCompatImageView) o0(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        ((RobertoTextView) o0(R.id.switchProgramme)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        if (this.f10480w) {
            RobertoTextView robertoTextView = (RobertoTextView) o0(R.id.resetProgramme);
            if (robertoTextView != null) {
                robertoTextView.setVisibility(8);
            }
            View o02 = o0(R.id.settingsSeparator5);
            if (o02 != null) {
                o02.setVisibility(8);
            }
        } else {
            ((RobertoTextView) o0(R.id.resetProgramme)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ SettingsActivity f12945v;

                {
                    this.f12945v = this;
                }

                /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    String str = null;
                    WindowManager.LayoutParams layoutParams = null;
                    SettingsActivity this$0 = this.f12945v;
                    switch (i6) {
                        case 0:
                            int i10 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                            ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                            xVar.f23469u = notificationPermissionBottomSheet;
                            notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                            return;
                        case 1:
                            int i11 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("variant", "new");
                                User user = FirebasePersistence.getInstance().getUser();
                                if (user != null) {
                                    str = user.getVersion();
                                }
                                bundle2.putString("version", str);
                                gk.a.b(bundle2, "account_delete_click");
                                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                                Window window2 = styledDialog.getWindow();
                                if (window2 != null) {
                                    window2.setLayout(-1, -1);
                                }
                                ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                                ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                                styledDialog.show();
                                return;
                            } catch (Exception e11) {
                                LogHelper.INSTANCE.e(this$0.f10479v, e11);
                                return;
                            }
                        case 2:
                            int i12 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (new s5(15).b(this$0)) {
                                    d.b bVar = new d.b();
                                    Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                    Bundle bundle3 = new Bundle();
                                    if (valueOf != null) {
                                        bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                    }
                                    bVar.f29100c = bundle3;
                                    bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                    return;
                                }
                                Intent intent = new Intent(this$0, WebviewActivity.class);
                                intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                                this$0.startActivity(intent);
                                return;
                            } catch (Exception e12) {
                                LogHelper.INSTANCE.e(this$0.f10479v, e12);
                                return;
                            }
                        case 3:
                            int i13 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            try {
                                if (new s5(15).b(this$0)) {
                                    d.b bVar2 = new d.b();
                                    Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                    Bundle bundle4 = new Bundle();
                                    if (valueOf2 != null) {
                                        bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                    }
                                    bVar2.f29100c = bundle4;
                                    bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                    return;
                                }
                                Intent intent2 = new Intent(this$0, WebviewActivity.class);
                                intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                                this$0.startActivity(intent2);
                                return;
                            } catch (Exception e13) {
                                LogHelper.INSTANCE.e(this$0.f10479v, e13);
                                return;
                            }
                        case 4:
                            int i14 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                            try {
                                kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                                Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                                Window window3 = styledDialog2.getWindow();
                                if (window3 != null) {
                                    layoutParams = window3.getAttributes();
                                }
                                if (layoutParams != null) {
                                    layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                                }
                                ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                                ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                                ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                                styledDialog2.show();
                                return;
                            } catch (Exception e14) {
                                LogHelper.INSTANCE.e(this$0.f10479v, e14);
                                return;
                            }
                        case 5:
                            int i15 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.startActivity(new Intent(this$0, FAQActivity.class));
                            return;
                        case 6:
                            SettingsActivity.n0(this$0);
                            return;
                        case 7:
                            int i16 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            boolean isConnected = ConnectionStatusReceiver.isConnected();
                            if (!isConnected) {
                                Toast.makeText(this$0, "Connect to Internet", 0).show();
                            }
                            if (isConnected) {
                                Intent r = tr.r.r(this$0);
                                r.putExtra("switch_programme", true);
                                r.putExtra("source", "setting");
                                this$0.startActivity(r);
                                return;
                            }
                            return;
                        case 8:
                            int i17 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            gk.a.b(null, "reset_programme_settings");
                            this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                            return;
                        case 9:
                            int i18 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                            Window window4 = styledDialog3.getWindow();
                            kotlin.jvm.internal.i.d(window4);
                            window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                            ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                            styledDialog3.show();
                            return;
                        default:
                            int i19 = SettingsActivity.f10478z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                                return;
                            } else {
                                this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                                return;
                            }
                    }
                }
            });
        }
        ((RobertoTextView) o0(R.id.resetBot)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        if (ca.a.k("v2.3", "v2.2", "v2.21", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
            if (!b.u(SessionManager.KEY_USERTYPE, "patient") && i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                ((RobertoTextView) o0(R.id.premium)).setVisibility(8);
                o0(R.id.settingsSeparator7).setVisibility(8);
            } else {
                ((RobertoTextView) o0(R.id.premium)).setVisibility(0);
                o0(R.id.settingsSeparator7).setVisibility(0);
            }
        }
        ((RobertoTextView) o0(R.id.premium)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        ((RobertoTextView) o0(R.id.settingsDeleteButton)).setVisibility(0);
        ((RobertoTextView) o0(R.id.settingsDeleteButton)).setOnClickListener(new View.OnClickListener(this) { // from class: dk.q

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ SettingsActivity f12945v;

            {
                this.f12945v = this;
            }

            /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                String str = null;
                WindowManager.LayoutParams layoutParams = null;
                SettingsActivity this$0 = this.f12945v;
                switch (i6) {
                    case 0:
                        int i10 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("settings", this$0.f10481x.a(true), "post_assessment", this$0.f10481x, new SettingsActivity.a(xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.getSupportFragmentManager(), "permission");
                        return;
                    case 1:
                        int i11 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("variant", "new");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getVersion();
                            }
                            bundle2.putString("version", str);
                            gk.a.b(bundle2, "account_delete_click");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_delete_account, this$0, R.style.Theme_Dialog_Fullscreen);
                            Window window2 = styledDialog.getWindow();
                            if (window2 != null) {
                                window2.setLayout(-1, -1);
                            }
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogNegative)).setOnClickListener(new s(bundle2, styledDialog));
                            ((RobertoButton) styledDialog.findViewById(R.id.btnDeleteDialogPositive)).setOnClickListener(new t(0, bundle2, this$0, styledDialog));
                            styledDialog.show();
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e11);
                            return;
                        }
                    case 2:
                        int i12 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar = new d.b();
                                Integer valueOf = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle3 = new Bundle();
                                if (valueOf != null) {
                                    bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
                                }
                                bVar.f29100c = bundle3;
                                bVar.a().a(this$0, Uri.parse("https://www.amahahealth.com/privacy-policy"));
                                return;
                            }
                            Intent intent = new Intent(this$0, WebviewActivity.class);
                            intent.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/privacy-policy");
                            this$0.startActivity(intent);
                            return;
                        } catch (Exception e12) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e12);
                            return;
                        }
                    case 3:
                        int i13 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (new s5(15).b(this$0)) {
                                d.b bVar2 = new d.b();
                                Integer valueOf2 = Integer.valueOf(g0.a.b(this$0, R.color.dashboard_grey) | (-16777216));
                                Bundle bundle4 = new Bundle();
                                if (valueOf2 != null) {
                                    bundle4.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf2.intValue());
                                }
                                bVar2.f29100c = bundle4;
                                bVar2.a().a(this$0, Uri.parse("https://www.amahahealth.com/terms-and-conditions"));
                                return;
                            }
                            Intent intent2 = new Intent(this$0, WebviewActivity.class);
                            intent2.putExtra(Constants.NOTIFICATION_URL, "https://www.amahahealth.com/terms-and-conditions");
                            this$0.startActivity(intent2);
                            return;
                        } catch (Exception e13) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e13);
                            return;
                        }
                    case 4:
                        int i14 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        UtilsKt.fireAnalytics("dashboard_logout", UtilsKt.getAnalyticsBundle());
                        try {
                            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
                            Dialog styledDialog2 = UiUtils.Companion.getStyledDialog(R.layout.dialog_logout, this$0, R.style.Theme_Dialog);
                            Window window3 = styledDialog2.getWindow();
                            if (window3 != null) {
                                layoutParams = window3.getAttributes();
                            }
                            if (layoutParams != null) {
                                layoutParams.windowAnimations = R.style.DialogGrowInAndShrinkOut;
                            }
                            ((AppCompatImageView) styledDialog2.findViewById(R.id.ivLogoutCheckbox)).setOnClickListener(new r(uVar, styledDialog2, this$0));
                            ((TextView) styledDialog2.findViewById(R.id.tvLogoutDialogCancel)).setOnClickListener(new defpackage.a(styledDialog2, 8, uVar));
                            ((ConstraintLayout) styledDialog2.findViewById(R.id.clLogoutDialogYes)).setOnClickListener(new r(this$0, uVar, styledDialog2));
                            styledDialog2.show();
                            return;
                        } catch (Exception e14) {
                            LogHelper.INSTANCE.e(this$0.f10479v, e14);
                            return;
                        }
                    case 5:
                        int i15 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0, FAQActivity.class));
                        return;
                    case 6:
                        SettingsActivity.n0(this$0);
                        return;
                    case 7:
                        int i16 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                        if (!isConnected) {
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                        }
                        if (isConnected) {
                            Intent r = tr.r.r(this$0);
                            r.putExtra("switch_programme", true);
                            r.putExtra("source", "setting");
                            this$0.startActivity(r);
                            return;
                        }
                        return;
                    case 8:
                        int i17 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        gk.a.b(null, "reset_programme_settings");
                        this$0.startActivity(new Intent(this$0, ResetProgrammeActivity.class));
                        return;
                    case 9:
                        int i18 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Dialog styledDialog3 = UiUtils.Companion.getStyledDialog(R.layout.dialog_reset_bot, this$0, R.style.Theme_Dialog);
                        Window window4 = styledDialog3.getWindow();
                        kotlin.jvm.internal.i.d(window4);
                        window4.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                        ((RobertoTextView) styledDialog3.findViewById(R.id.yes)).setOnClickListener(new defpackage.a(this$0, 9, styledDialog3));
                        ((RobertoTextView) styledDialog3.findViewById(R.id.f39931no)).setOnClickListener(new n(styledDialog3, 1));
                        styledDialog3.show();
                        return;
                    default:
                        int i19 = SettingsActivity.f10478z;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this$0.startActivity(new Intent(this$0, ManageSubscriptionActivity.class));
                            return;
                        } else {
                            this$0.startActivity(tr.r.s(this$0, false).putExtra("tab", 0).putExtra("source", "settings"));
                            return;
                        }
                }
            }
        });
        Bundle bundle2 = new Bundle();
        if (FirebasePersistence.getInstance().getUser() != null) {
            d.m(bundle2, "course");
        }
        gk.a.b(bundle2, "settings_view");
    }
}
