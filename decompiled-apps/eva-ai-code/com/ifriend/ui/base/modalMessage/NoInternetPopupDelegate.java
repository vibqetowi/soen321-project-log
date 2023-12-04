package com.ifriend.ui.base.modalMessage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.popup.api.NoInternetPopupResultModel;
import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupResultModelKt;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NoInternetPopupDelegate.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0018\u001a\u00020\rJ\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;", "", "popupFragmentFactory", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "internetConnection", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "(Lcom/ifriend/popup/api/PopupFragmentFactory;Lcom/ifriend/domain/infrastucture/InternetConnection;)V", "appDialog", "Landroidx/fragment/app/DialogFragment;", "weakContext", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "init", "", "context", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/LifecycleOwner;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "registerResultListener", "scheduleCloseAppDialogForOnResume", "showMessage", "showNoInternet", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoInternetPopupDelegate {
    public static final String NO_INTERNET_DIALOG_TAG = "no_internet";
    private DialogFragment appDialog;
    private final InternetConnection internetConnection;
    private final PopupFragmentFactory popupFragmentFactory;
    private WeakReference<Context> weakContext;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NoInternetPopupDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NoInternetPopupResultModel.values().length];
            try {
                iArr[NoInternetPopupResultModel.TRY_AGAIN_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NoInternetPopupResultModel.OPEN_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public NoInternetPopupDelegate(PopupFragmentFactory popupFragmentFactory, InternetConnection internetConnection) {
        Intrinsics.checkNotNullParameter(popupFragmentFactory, "popupFragmentFactory");
        Intrinsics.checkNotNullParameter(internetConnection, "internetConnection");
        this.popupFragmentFactory = popupFragmentFactory;
        this.internetConnection = internetConnection;
        this.weakContext = new WeakReference<>(null);
    }

    /* compiled from: NoInternetPopupDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate$Companion;", "", "()V", "NO_INTERNET_DIALOG_TAG", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void init(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNull(supportFragmentManager);
        init(activity, supportFragmentManager, activity);
    }

    public final void init(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Context requireContext = fragment.requireContext();
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNull(requireContext);
        Intrinsics.checkNotNull(childFragmentManager);
        init(requireContext, childFragmentManager, fragment);
    }

    private final void init(Context context, FragmentManager fragmentManager, LifecycleOwner lifecycleOwner) {
        this.weakContext = new WeakReference<>(context);
        if (this.appDialog == null) {
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(NO_INTERNET_DIALOG_TAG);
            DialogFragment dialogFragment = findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null;
            this.appDialog = dialogFragment;
            if (dialogFragment != null) {
                registerResultListener(fragmentManager, lifecycleOwner);
            }
        }
    }

    private final void registerResultListener(FragmentManager fragmentManager, LifecycleOwner lifecycleOwner) {
        fragmentManager.setFragmentResultListener(NO_INTERNET_DIALOG_TAG, lifecycleOwner, new FragmentResultListener() { // from class: com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate$$ExternalSyntheticLambda0
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                NoInternetPopupDelegate.registerResultListener$lambda$1(NoInternetPopupDelegate.this, str, bundle);
            }
        });
    }

    public final void scheduleCloseAppDialogForOnResume() {
        DialogFragment dialogFragment = this.appDialog;
        boolean z = true;
        if ((dialogFragment == null || dialogFragment.isStateSaved()) ? false : true) {
            DialogFragment dialogFragment2 = this.appDialog;
            if (dialogFragment2 == null || !dialogFragment2.isAdded()) {
                z = false;
            }
            if (z) {
                DialogFragment dialogFragment3 = this.appDialog;
                if (dialogFragment3 != null) {
                    dialogFragment3.dismiss();
                }
                this.appDialog = null;
            }
        }
    }

    public final void showNoInternet(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        showNoInternet(childFragmentManager, fragment);
    }

    public final void showNoInternet(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        showNoInternet(supportFragmentManager, activity);
    }

    private final void showNoInternet(FragmentManager fragmentManager, LifecycleOwner lifecycleOwner) {
        registerResultListener(fragmentManager, lifecycleOwner);
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(NO_INTERNET_DIALOG_TAG);
        if ((findFragmentByTag instanceof DialogFragment ? (DialogFragment) findFragmentByTag : null) != null) {
            return;
        }
        showMessage(fragmentManager, lifecycleOwner);
    }

    private final void showMessage(FragmentManager fragmentManager, LifecycleOwner lifecycleOwner) {
        this.appDialog = this.popupFragmentFactory.getNoInternetConnectionFragment();
        LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).launchWhenResumed(new NoInternetPopupDelegate$showMessage$1(this, lifecycleOwner, fragmentManager, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerResultListener$lambda$1(NoInternetPopupDelegate this$0, String str, Bundle bundle) {
        Object obj;
        Context context;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = bundle.getSerializable(PopupResultModelKt.CommonPopupResultKey, NoInternetPopupResultModel.class);
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(obj, "requireNotNull(...)");
        } else {
            Object serializable = bundle.getSerializable(PopupResultModelKt.CommonPopupResultKey);
            if (serializable == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.ifriend.popup.api.NoInternetPopupResultModel");
            }
            obj = (Serializable) ((NoInternetPopupResultModel) serializable);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[((NoInternetPopupResultModel) obj).ordinal()];
        if (i == 1) {
            this$0.internetConnection.updateConnectivityState();
        } else if (i == 2 && (context = this$0.weakContext.get()) != null) {
            context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
        }
    }
}
