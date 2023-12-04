package com.ifriend.ui.base;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/ifriend/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "layoutId", "", "(I)V", "internetConnectionDialogsManager", "Lcom/ifriend/domain/infrastucture/InternetConnectionDialogsManager;", "getInternetConnectionDialogsManager", "()Lcom/ifriend/domain/infrastucture/InternetConnectionDialogsManager;", "setInternetConnectionDialogsManager", "(Lcom/ifriend/domain/infrastucture/InternetConnectionDialogsManager;)V", "isNeedToShowNoInternetConnectionDialog", "", "()Z", "noInternetPopupDelegate", "Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;", "getNoInternetPopupDelegate", "()Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;", "setNoInternetPopupDelegate", "(Lcom/ifriend/ui/base/modalMessage/NoInternetPopupDelegate;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupWindowInsets", "subscribeToNoInternetDialog", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseActivity extends AppCompatActivity {
    public static final int $stable = 8;
    @Inject
    public InternetConnectionDialogsManager internetConnectionDialogsManager;
    private final boolean isNeedToShowNoInternetConnectionDialog;
    @Inject
    public NoInternetPopupDelegate noInternetPopupDelegate;

    public BaseActivity(int i) {
        super(i);
        this.isNeedToShowNoInternetConnectionDialog = true;
    }

    public final NoInternetPopupDelegate getNoInternetPopupDelegate() {
        NoInternetPopupDelegate noInternetPopupDelegate = this.noInternetPopupDelegate;
        if (noInternetPopupDelegate != null) {
            return noInternetPopupDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("noInternetPopupDelegate");
        return null;
    }

    public final void setNoInternetPopupDelegate(NoInternetPopupDelegate noInternetPopupDelegate) {
        Intrinsics.checkNotNullParameter(noInternetPopupDelegate, "<set-?>");
        this.noInternetPopupDelegate = noInternetPopupDelegate;
    }

    public final InternetConnectionDialogsManager getInternetConnectionDialogsManager() {
        InternetConnectionDialogsManager internetConnectionDialogsManager = this.internetConnectionDialogsManager;
        if (internetConnectionDialogsManager != null) {
            return internetConnectionDialogsManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internetConnectionDialogsManager");
        return null;
    }

    public final void setInternetConnectionDialogsManager(InternetConnectionDialogsManager internetConnectionDialogsManager) {
        Intrinsics.checkNotNullParameter(internetConnectionDialogsManager, "<set-?>");
        this.internetConnectionDialogsManager = internetConnectionDialogsManager;
    }

    public boolean isNeedToShowNoInternetConnectionDialog() {
        return this.isNeedToShowNoInternetConnectionDialog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupWindowInsets();
        if (isNeedToShowNoInternetConnectionDialog()) {
            getNoInternetPopupDelegate().init(this);
            subscribeToNoInternetDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToNoInternetDialog$showNoInternet(BaseActivity baseActivity) {
        baseActivity.getNoInternetPopupDelegate().showNoInternet(baseActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToNoInternetDialog$onInternetConnectionAvailable(BaseActivity baseActivity) {
        baseActivity.getNoInternetPopupDelegate().scheduleCloseAppDialogForOnResume();
    }

    private final void subscribeToNoInternetDialog() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BaseActivity$subscribeToNoInternetDialog$1(this, new Ref.ObjectRef(), null));
    }

    protected void setupWindowInsets() {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        WindowInsetsControllerCompat windowInsetsController = ViewCompat.getWindowInsetsController(getWindow().getDecorView());
        if (windowInsetsController != null) {
            windowInsetsController.setAppearanceLightNavigationBars(false);
        }
        if (windowInsetsController != null) {
            windowInsetsController.setAppearanceLightStatusBars(false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
    }
}
