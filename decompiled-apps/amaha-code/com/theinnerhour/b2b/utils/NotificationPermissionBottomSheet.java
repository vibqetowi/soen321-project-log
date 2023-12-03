package com.theinnerhour.b2b.utils;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.imageview.ShapeableImageView;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import pl.a0;
/* compiled from: NotificationPermissionBottomSheet.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020!¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010&\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010+\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00160\u00160(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,¨\u00065"}, d2 = {"Lcom/theinnerhour/b2b/utils/NotificationPermissionBottomSheet;", "Lcom/google/android/material/bottomsheet/f;", "Lhs/k;", "setupFallbackSettings", "recordPrePermissionLaunchNotificationStatus", "launchPermissionDialog", "processPermissionDialogRejectionResult", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "view", "onViewCreated", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "source", "Ljava/lang/String;", "Lhs/f;", "", "notificationPromptStatus", "Lhs/f;", "contextSpecificCase", "Lyn/a;", "notificationCheckerUtil", "Lyn/a;", "Lkotlin/Function1;", "permissionCallback", "Lss/l;", "TAG", "postDenialVariant", "logDismissal", "Z", "Landroidx/activity/result/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "settingsPageLauncher", "Landroidx/activity/result/c;", "", "prePermissionLaunchNotificationDialogShownStatus", "Ljava/lang/Integer;", "prePermissionLaunchRationalStatus", "Ljava/lang/Boolean;", "requestPermissionLauncher", "<init>", "(Ljava/lang/String;Lhs/f;Ljava/lang/String;Lyn/a;Lss/l;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationPermissionBottomSheet extends com.google.android.material.bottomsheet.f {
    private final String TAG;
    public Map<Integer, View> _$_findViewCache;
    private final String contextSpecificCase;
    private boolean logDismissal;
    private final yn.a notificationCheckerUtil;
    private final hs.f<Boolean, Boolean> notificationPromptStatus;
    private final ss.l<Boolean, hs.k> permissionCallback;
    private final String postDenialVariant;
    private Integer prePermissionLaunchNotificationDialogShownStatus;
    private Boolean prePermissionLaunchRationalStatus;
    private final androidx.activity.result.c<String> requestPermissionLauncher;
    private final androidx.activity.result.c<Intent> settingsPageLauncher;
    private final String source;

    /* compiled from: NotificationPermissionBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lhs/k;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet$1 */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        public final void invoke(boolean z10) {
        }

        @Override // ss.l
        public /* bridge */ /* synthetic */ hs.k invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return hs.k.f19476a;
        }
    }

    public NotificationPermissionBottomSheet() {
        this(null, null, null, null, null, 31, null);
    }

    private final void launchPermissionDialog() {
        recordPrePermissionLaunchNotificationStatus();
        if (Build.VERSION.SDK_INT >= 33) {
            this.requestPermissionLauncher.a("android.permission.POST_NOTIFICATIONS");
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("screen", this.source);
            bundle.putInt("dismiss_count", this.notificationCheckerUtil.f38700h);
            bundle.putInt("not_allowed_count", this.notificationCheckerUtil.f38699g);
            bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this.source, "settings"));
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "notif_permit_system_modal_shown");
        }
    }

    public static final void onCreateDialog$lambda$1(NotificationPermissionBottomSheet this$0, DialogInterface dialogInterface) {
        com.google.android.material.bottomsheet.e eVar;
        KeyEvent.Callback callback;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            if (this$0.isAdded()) {
                FrameLayout frameLayout = null;
                if (dialogInterface instanceof com.google.android.material.bottomsheet.e) {
                    eVar = (com.google.android.material.bottomsheet.e) dialogInterface;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    callback = eVar.findViewById(R.id.design_bottom_sheet);
                } else {
                    callback = null;
                }
                if (callback instanceof FrameLayout) {
                    frameLayout = (FrameLayout) callback;
                }
                if (frameLayout != null) {
                    BottomSheetBehavior.from(frameLayout).setState(3);
                    BottomSheetBehavior.from(frameLayout).setMaxHeight((int) (this$0.requireActivity().getWindow().getDecorView().getHeight() * 0.75d));
                    BottomSheetBehavior.from(frameLayout).setSkipCollapsed(true);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.TAG, e10);
        }
    }

    public static final void onViewCreated$lambda$3(NotificationPermissionBottomSheet this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.launchPermissionDialog();
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("screen", this$0.source);
        bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this$0.source, "settings"));
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "notif_permit_in_app_sheet_accept");
    }

    public static final void onViewCreated$lambda$7(NotificationPermissionBottomSheet this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        try {
            androidx.activity.result.c<Intent> cVar = this$0.settingsPageLauncher;
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this$0.requireContext().getPackageName(), null));
            cVar.a(intent);
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("screen", this$0.source);
            bundle.putInt("dismiss_count", this$0.notificationCheckerUtil.f38700h);
            bundle.putInt("not_allowed_count", this$0.notificationCheckerUtil.f38699g);
            bundle.putString("variant", this$0.postDenialVariant);
            bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this$0.source, "settings"));
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "notif_var_setting");
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.TAG, e10);
            this$0.setupFallbackSettings();
        }
    }

    public static final void onViewCreated$lambda$9(NotificationPermissionBottomSheet this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.dismiss();
    }

    private final void processPermissionDialogRejectionResult() {
        if (Build.VERSION.SDK_INT >= 33 && this.prePermissionLaunchNotificationDialogShownStatus != null && this.prePermissionLaunchRationalStatus != null) {
            boolean f = f0.a.f(requireActivity(), "android.permission.POST_NOTIFICATIONS");
            Integer num = this.prePermissionLaunchNotificationDialogShownStatus;
            kotlin.jvm.internal.i.d(num);
            if (num.intValue() == 0) {
                if (!f) {
                    this.notificationCheckerUtil.c();
                    return;
                } else {
                    this.notificationCheckerUtil.e();
                    return;
                }
            }
            Integer num2 = this.prePermissionLaunchNotificationDialogShownStatus;
            kotlin.jvm.internal.i.d(num2);
            if (num2.intValue() >= 1) {
                Boolean bool = this.prePermissionLaunchRationalStatus;
                kotlin.jvm.internal.i.d(bool);
                if (bool.booleanValue()) {
                    if (f) {
                        this.notificationCheckerUtil.c();
                    } else {
                        this.notificationCheckerUtil.e();
                    }
                } else if (f) {
                    this.notificationCheckerUtil.e();
                } else {
                    this.notificationCheckerUtil.c();
                }
            }
        }
    }

    private final void recordPrePermissionLaunchNotificationStatus() {
        Boolean bool;
        this.prePermissionLaunchNotificationDialogShownStatus = Integer.valueOf(this.notificationCheckerUtil.f);
        if (Build.VERSION.SDK_INT >= 33) {
            bool = Boolean.valueOf(f0.a.f(requireActivity(), "android.permission.POST_NOTIFICATIONS"));
        } else {
            bool = null;
        }
        this.prePermissionLaunchRationalStatus = bool;
    }

    public static final void requestPermissionLauncher$lambda$19(NotificationPermissionBottomSheet this$0, boolean z10) {
        ej.b bVar;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.logDismissal = false;
        yn.a aVar = this$0.notificationCheckerUtil;
        aVar.f++;
        ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_DIALOG_SHOW_COUNT, aVar.f);
        if (!z10) {
            this$0.processPermissionDialogRejectionResult();
            this$0.notificationCheckerUtil.getClass();
            yn.a.d();
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("screen", this$0.source);
            bundle.putInt("dismiss_count", this$0.notificationCheckerUtil.f38700h);
            bundle.putInt("not_allowed_count", this$0.notificationCheckerUtil.f38699g);
            bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this$0.source, "settings"));
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "notif_permit_system_modal_decline");
        } else {
            yn.a aVar2 = this$0.notificationCheckerUtil;
            aVar2.f38699g = 1;
            aVar2.f = 1;
            aVar2.f38700h = 0;
            ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_DIALOG_SHOW_COUNT, aVar2.f);
            ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_DIALOG_DENY_COUNT, aVar2.f38699g);
            ApplicationPersistence.getInstance().setIntValue(Constants.NOTIFICATION_DIALOG_DISMISS_COUNT, aVar2.f38700h);
            ej.b bVar2 = ej.b.f14047b;
            if (bVar2 == null) {
                synchronized (ej.b.class) {
                    bVar = ej.b.f14047b;
                    if (bVar == null) {
                        bVar = new ej.b();
                    }
                    ej.b.f14047b = bVar;
                }
                bVar2 = bVar;
            }
            MyApplication.a aVar3 = MyApplication.V;
            bVar2.c(true, aVar3.a());
            if (ej.b.f14047b == null) {
                synchronized (ej.b.class) {
                    ej.b bVar3 = ej.b.f14047b;
                    if (bVar3 == null) {
                        bVar3 = new ej.b();
                    }
                    ej.b.f14047b = bVar3;
                }
            }
            ej.b.d(aVar3.a());
            String str2 = gk.a.f16573a;
            Bundle bundle2 = new Bundle();
            bundle2.putString("screen", this$0.source);
            bundle2.putInt("dismiss_count", this$0.notificationCheckerUtil.f38700h);
            bundle2.putInt("not_allowed_count", this$0.notificationCheckerUtil.f38699g);
            bundle2.putBoolean("settings", kotlin.jvm.internal.i.b(this$0.source, "settings"));
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle2, "notif_permit_system_modal_accept");
        }
        this$0.permissionCallback.invoke(Boolean.valueOf(z10));
    }

    public static final void settingsPageLauncher$lambda$15(NotificationPermissionBottomSheet this$0, androidx.activity.result.a aVar) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.notificationCheckerUtil.getClass();
        boolean b10 = yn.a.b();
        if (b10) {
            this$0.logDismissal = false;
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("screen", this$0.source);
            bundle.putInt("dismiss_count", this$0.notificationCheckerUtil.f38700h);
            bundle.putInt("not_allowed_count", this$0.notificationCheckerUtil.f38699g);
            bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this$0.source, "settings"));
            if (!this$0.notificationPromptStatus.f19464u.booleanValue()) {
                bundle.putString("variant", this$0.postDenialVariant);
            }
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "notif_permit_workaround_var_accept");
        }
        this$0.permissionCallback.invoke(Boolean.valueOf(b10));
    }

    private final void setupFallbackSettings() {
        try {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep1);
            if (robertoTextView != null) {
                robertoTextView.setText(getString(R.string.notification_permission_settings_fallback_step_1));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep2);
            if (robertoTextView2 != null) {
                robertoTextView2.setText(getString(R.string.notification_permission_settings_fallback_step_2));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep3);
            if (robertoTextView3 != null) {
                robertoTextView3.setText(getString(R.string.notification_permission_settings_fallback_step_3));
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep4);
            if (robertoTextView4 != null) {
                robertoTextView4.setText(getString(R.string.notification_permission_settings_fallback_step_4));
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep5);
            if (robertoTextView5 != null) {
                robertoTextView5.setText(getString(R.string.notification_permission_settings_fallback_step_5));
            }
            RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialYesCta);
            if (robertoTextView6 != null) {
                robertoTextView6.setText(getString(R.string.depressionPleasurableCompletionCTA));
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewPostDenialStep2Connector);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep2);
            if (robertoTextView7 != null) {
                robertoTextView7.setVisibility(0);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivPostDenialStep2);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.viewPostDenialStep1Connector);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(0);
            }
            RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep1);
            if (robertoTextView8 != null) {
                robertoTextView8.setVisibility(0);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.ivPostDenialStep1);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("screen", this.source);
            bundle.putInt("dismiss_count", this.notificationCheckerUtil.f38700h);
            bundle.putInt("not_allowed_count", this.notificationCheckerUtil.f38699g);
            bundle.putString("variant", this.postDenialVariant);
            bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this.source, "settings"));
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "notif_permit_fallback_var_shown");
            RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialYesCta);
            if (robertoTextView9 != null) {
                robertoTextView9.setOnClickListener(new k(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public static final void setupFallbackSettings$lambda$12(NotificationPermissionBottomSheet this$0, View view) {
        kotlin.jvm.internal.i.g(this$0, "this$0");
        this$0.logDismissal = false;
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        bundle.putString("screen", this$0.source);
        bundle.putInt("dismiss_count", this$0.notificationCheckerUtil.f38700h);
        bundle.putInt("not_allowed_count", this$0.notificationCheckerUtil.f38699g);
        bundle.putString("variant", this$0.postDenialVariant);
        bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this$0.source, "settings"));
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "notif_permit_fallback_var_cta_click");
        this$0.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i6) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                map.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // com.google.android.material.bottomsheet.f, g.s, androidx.fragment.app.n
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.i.e(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.e eVar = (com.google.android.material.bottomsheet.e) onCreateDialog;
        eVar.setOnShowListener(new a0(this, 1));
        return eVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.bottom_sheet_notification_permission_post_denial, viewGroup, false);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        String str;
        kotlin.jvm.internal.i.g(dialog, "dialog");
        if (this.logDismissal) {
            this.notificationCheckerUtil.c();
            String str2 = gk.a.f16573a;
            if (this.notificationPromptStatus.f19464u.booleanValue()) {
                str = "notif_permit_in_app_sheet_decline";
            } else {
                str = "notif_permit_workaround_var_dismiss";
            }
            Bundle bundle = new Bundle();
            bundle.putString("screen", this.source);
            bundle.putInt("dismiss_count", this.notificationCheckerUtil.f38700h);
            bundle.putInt("not_allowed_count", this.notificationCheckerUtil.f38699g);
            bundle.putBoolean("settings", kotlin.jvm.internal.i.b(this.source, "settings"));
            if (!this.notificationPromptStatus.f19464u.booleanValue()) {
                bundle.putString("variant", this.postDenialVariant);
            }
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, str);
            super.onDismiss(dialog);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0035, code lost:
        if (r1.equals("post_allie") == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x01c4, code lost:
        if (r1.equals("post_assessment") == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x01c7, code lost:
        r1 = (androidx.constraintlayout.widget.ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.clPostDenialAssessmentContainer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x01cd, code lost:
        if (r1 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01d0, code lost:
        r1.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x01d3, code lost:
        r1 = (com.google.android.material.imageview.ShapeableImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivPostDenialTopImage);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x01d9, code lost:
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x01dc, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x01df, code lost:
        r1 = (androidx.appcompat.widget.AppCompatImageView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.ivPostDenialTopImageNotificationBell);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x01e5, code lost:
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x01e8, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x01eb, code lost:
        r1 = (com.theinnerhour.b2b.widgets.RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tvPostDenialHeader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x01f1, code lost:
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x01f4, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01f7, code lost:
        r1 = (com.theinnerhour.b2b.widgets.RobertoTextView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.tvPostDenialSubHeader);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01fd, code lost:
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0200, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0203, code lost:
        r1 = (com.airbnb.lottie.LottieAnimationView) _$_findCachedViewById(com.theinnerhour.b2b.R.id.lavPostDenialGif);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0209, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x020c, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x020f, code lost:
        r1 = (androidx.constraintlayout.widget.ConstraintLayout) _$_findCachedViewById(com.theinnerhour.b2b.R.id.clPostDenialInfoContainer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0215, code lost:
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0218, code lost:
        r1.setVisibility(8);
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        String str = this.contextSpecificCase;
        switch (str.hashCode()) {
            case -1615507519:
                break;
            case -1480249367:
                if (str.equals(Constants.SCREEN_COMMUNITY)) {
                    ShapeableImageView shapeableImageView = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
                    if (shapeableImageView != null) {
                        shapeableImageView.setImageResource(R.drawable.ic_notification_dialog_context_community);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
                    if (robertoTextView != null) {
                        robertoTextView.setText(getString(R.string.permission_dialog_header_community));
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(getString(R.string.permission_dialog_sub_header_community));
                        break;
                    }
                }
                break;
            case -1419464905:
                if (str.equals("journal")) {
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
                    if (shapeableImageView2 != null) {
                        shapeableImageView2.setImageResource(R.drawable.ic_notification_dialog_context_journal);
                    }
                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText(getString(R.string.permission_dialog_header_journal));
                    }
                    RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText(getString(R.string.permission_dialog_sub_header_journal));
                        break;
                    }
                }
                break;
            case -1096882381:
                if (str.equals("teleconsultation")) {
                    ShapeableImageView shapeableImageView3 = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
                    if (shapeableImageView3 != null) {
                        shapeableImageView3.setImageResource(R.drawable.ic_notification_dialog_context_tele);
                    }
                    RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
                    if (robertoTextView5 != null) {
                        robertoTextView5.setText(getString(R.string.permission_dialog_header_telecommunications));
                    }
                    RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
                    if (robertoTextView6 != null) {
                        robertoTextView6.setText(getString(R.string.permission_dialog_sub_header_telecommunications));
                        break;
                    }
                }
                break;
            case -112143888:
                if (str.equals("mood_tracker")) {
                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
                    if (shapeableImageView4 != null) {
                        shapeableImageView4.setImageResource(R.drawable.ic_notification_dialog_context_mood);
                    }
                    RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
                    if (robertoTextView7 != null) {
                        robertoTextView7.setText(getString(R.string.permission_dialog_header_mood_tracker));
                    }
                    RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
                    if (robertoTextView8 != null) {
                        robertoTextView8.setText(getString(R.string.permission_dialog_sub_header_mood_tracker));
                        break;
                    }
                }
                break;
            case 3443497:
                if (str.equals("plan")) {
                    ShapeableImageView shapeableImageView5 = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
                    if (shapeableImageView5 != null) {
                        shapeableImageView5.setImageResource(R.drawable.ic_notification_dialog_context_allie);
                    }
                    RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
                    if (robertoTextView9 != null) {
                        robertoTextView9.setText(getString(R.string.permission_dialog_header_post_assessment));
                    }
                    RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
                    if (robertoTextView10 != null) {
                        robertoTextView10.setText(getString(R.string.permission_dialog_sub_header_post_assessment));
                        break;
                    }
                }
                break;
            case 98526144:
                if (str.equals("goals")) {
                    ShapeableImageView shapeableImageView6 = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
                    if (shapeableImageView6 != null) {
                        shapeableImageView6.setImageResource(R.drawable.ic_notification_dialog_context_goals);
                    }
                    RobertoTextView robertoTextView11 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
                    if (robertoTextView11 != null) {
                        robertoTextView11.setText(getString(R.string.permission_dialog_header_goals));
                    }
                    RobertoTextView robertoTextView12 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
                    if (robertoTextView12 != null) {
                        robertoTextView12.setText(getString(R.string.permission_dialog_sub_header_goals));
                        break;
                    }
                }
                break;
            case 1944954398:
                break;
        }
        if (this.notificationPromptStatus.f19464u.booleanValue()) {
            RobertoTextView robertoTextView13 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSkipCta);
            if (robertoTextView13 != null) {
                robertoTextView13.setVisibility(0);
            }
            RobertoTextView robertoTextView14 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialYesCta);
            if (robertoTextView14 != null) {
                robertoTextView14.setOnClickListener(new k(this, 1));
            }
            String str2 = gk.a.f16573a;
            Bundle bundle2 = new Bundle();
            bundle2.putString("screen", this.source);
            bundle2.putInt("dismiss_count", this.notificationCheckerUtil.f38700h);
            bundle2.putInt("not_allowed_count", this.notificationCheckerUtil.f38699g);
            bundle2.putBoolean("settings", kotlin.jvm.internal.i.b(this.source, "settings"));
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle2, "notif_permit_in_app_sheet_shown");
        } else {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clPostDenialAssessmentContainer);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            ShapeableImageView shapeableImageView7 = (ShapeableImageView) _$_findCachedViewById(R.id.ivPostDenialTopImage);
            if (shapeableImageView7 != null) {
                shapeableImageView7.setVisibility(0);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivPostDenialTopImageNotificationBell);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            RobertoTextView robertoTextView15 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialHeader);
            if (robertoTextView15 != null) {
                robertoTextView15.setVisibility(0);
            }
            RobertoTextView robertoTextView16 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSubHeader);
            if (robertoTextView16 != null) {
                robertoTextView16.setVisibility(0);
            }
            RobertoTextView robertoTextView17 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep3);
            if (robertoTextView17 != null) {
                robertoTextView17.setText(getString(R.string.notification_permission_settings_step_1));
            }
            RobertoTextView robertoTextView18 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep4);
            if (robertoTextView18 != null) {
                robertoTextView18.setText(getString(R.string.notification_permission_settings_step_2));
            }
            RobertoTextView robertoTextView19 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialStep5);
            if (robertoTextView19 != null) {
                robertoTextView19.setText(getString(R.string.notification_permission_settings_step_3));
            }
            RobertoTextView robertoTextView20 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialYesCta);
            if (robertoTextView20 != null) {
                robertoTextView20.setText(getString(R.string.notification_permission_settings_cta));
            }
            RobertoTextView robertoTextView21 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSkipCta);
            if (robertoTextView21 != null) {
                robertoTextView21.setVisibility(8);
            }
            if (kotlin.jvm.internal.i.b(this.postDenialVariant, "variant_a")) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.lavPostDenialGif);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                }
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.lavPostDenialGif);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.c(new NotificationPermissionBottomSheet$onViewCreated$3(this));
                }
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clPostDenialInfoContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
            }
            RobertoTextView robertoTextView22 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialYesCta);
            if (robertoTextView22 != null) {
                robertoTextView22.setOnClickListener(new k(this, 2));
            }
            String str3 = gk.a.f16573a;
            Bundle bundle3 = new Bundle();
            bundle3.putString("screen", this.source);
            bundle3.putInt("dismiss_count", this.notificationCheckerUtil.f38700h);
            bundle3.putInt("not_allowed_count", this.notificationCheckerUtil.f38699g);
            bundle3.putString("variant", this.postDenialVariant);
            bundle3.putBoolean("settings", kotlin.jvm.internal.i.b(this.source, "settings"));
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(bundle3, "notif_permit_workaround_var_shown");
        }
        RobertoTextView robertoTextView23 = (RobertoTextView) _$_findCachedViewById(R.id.tvPostDenialSkipCta);
        if (robertoTextView23 != null) {
            robertoTextView23.setOnClickListener(new k(this, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationPermissionBottomSheet(String source, hs.f<Boolean, Boolean> notificationPromptStatus, String contextSpecificCase, yn.a notificationCheckerUtil, ss.l<? super Boolean, hs.k> permissionCallback) {
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        HashMap<String, Object> appConfig3;
        kotlin.jvm.internal.i.g(source, "source");
        kotlin.jvm.internal.i.g(notificationPromptStatus, "notificationPromptStatus");
        kotlin.jvm.internal.i.g(contextSpecificCase, "contextSpecificCase");
        kotlin.jvm.internal.i.g(notificationCheckerUtil, "notificationCheckerUtil");
        kotlin.jvm.internal.i.g(permissionCallback, "permissionCallback");
        this._$_findViewCache = new LinkedHashMap();
        this.source = source;
        this.notificationPromptStatus = notificationPromptStatus;
        this.contextSpecificCase = contextSpecificCase;
        this.notificationCheckerUtil = notificationCheckerUtil;
        this.permissionCallback = permissionCallback;
        this.TAG = LogHelper.INSTANCE.makeLogTag("NotifPermissionPostDenialBS");
        notificationCheckerUtil.f38694a.getClass();
        User user = FirebasePersistence.getInstance().getUser();
        if ((user == null || (appConfig3 = user.getAppConfig()) == null || appConfig3.containsKey(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT)) ? false : true) {
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (appConfig2 = user2.getAppConfig()) != null) {
                appConfig2.put(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT, "variant_a");
            }
            FirebasePersistence.getInstance().updateUserOnFirebase();
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle.putString("variant", "variant_a");
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT);
        }
        User user3 = FirebasePersistence.getInstance().getUser();
        Object obj = (user3 == null || (appConfig = user3.getAppConfig()) == null) ? null : appConfig.get(Constants.NOTIF_PERMIT_DESCRIPTION_EXPERIMENT);
        String str2 = obj instanceof String ? obj : null;
        this.postDenialVariant = str2 != null ? str2 : "variant_a";
        this.logDismissal = true;
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.b(this) { // from class: com.theinnerhour.b2b.utils.l

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ NotificationPermissionBottomSheet f11816v;

            {
                this.f11816v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj2) {
                int i6 = r2;
                NotificationPermissionBottomSheet notificationPermissionBottomSheet = this.f11816v;
                switch (i6) {
                    case 0:
                        NotificationPermissionBottomSheet.settingsPageLauncher$lambda$15(notificationPermissionBottomSheet, (androidx.activity.result.a) obj2);
                        return;
                    default:
                        NotificationPermissionBottomSheet.requestPermissionLauncher$lambda$19(notificationPermissionBottomSheet, ((Boolean) obj2).booleanValue());
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…sPermissionGranted)\n    }");
        this.settingsPageLauncher = registerForActivityResult;
        androidx.activity.result.c<String> registerForActivityResult2 = registerForActivityResult(new e.c(), new androidx.activity.result.b(this) { // from class: com.theinnerhour.b2b.utils.l

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ NotificationPermissionBottomSheet f11816v;

            {
                this.f11816v = this;
            }

            @Override // androidx.activity.result.b
            public final void b(Object obj2) {
                int i6 = r2;
                NotificationPermissionBottomSheet notificationPermissionBottomSheet = this.f11816v;
                switch (i6) {
                    case 0:
                        NotificationPermissionBottomSheet.settingsPageLauncher$lambda$15(notificationPermissionBottomSheet, (androidx.activity.result.a) obj2);
                        return;
                    default:
                        NotificationPermissionBottomSheet.requestPermissionLauncher$lambda$19(notificationPermissionBottomSheet, ((Boolean) obj2).booleanValue());
                        return;
                }
            }
        });
        kotlin.jvm.internal.i.f(registerForActivityResult2, "registerForActivityResul…Callback(isGranted)\n    }");
        this.requestPermissionLauncher = registerForActivityResult2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NotificationPermissionBottomSheet(String str, hs.f fVar, String str2, yn.a aVar, ss.l lVar, int i6, kotlin.jvm.internal.d dVar) {
        this(str, fVar, (i6 & 4) != 0 ? "plan" : str2, (i6 & 8) != 0 ? new yn.a() : aVar, (i6 & 16) != 0 ? AnonymousClass1.INSTANCE : lVar);
        str = (i6 & 1) != 0 ? Constants.SCREEN_DASHBOARD : str;
        if ((i6 & 2) != 0) {
            Boolean bool = Boolean.FALSE;
            fVar = new hs.f(bool, bool);
        }
    }
}
