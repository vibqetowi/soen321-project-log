package com.ifriend.app.ui.splash;

import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.app.App;
import com.ifriend.app.R;
import com.ifriend.domain.models.ConfirmEmailData;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import com.ifriend.ui.base.BaseActivity;
import com.ifriend.ui.base.di.ViewModelFactory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SplashActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/ifriend/app/ui/splash/SplashActivity;", "Lcom/ifriend/ui/base/BaseActivity;", "()V", "isNeedToShowNoInternetConnectionDialog", "", "()Z", "premiumAppIconManager", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "getPremiumAppIconManager", "()Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "setPremiumAppIconManager", "(Lcom/ifriend/icon_switcher/PremiumAppIconManager;)V", "viewModelFactory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/ifriend/ui/base/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/ifriend/ui/base/di/ViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SplashActivity extends BaseActivity {
    private final boolean isNeedToShowNoInternetConnectionDialog;
    @Inject
    public PremiumAppIconManager premiumAppIconManager;
    @Inject
    public ViewModelFactory viewModelFactory;

    public SplashActivity() {
        super(R.layout.activity_splash);
    }

    public final ViewModelFactory getViewModelFactory() {
        ViewModelFactory viewModelFactory = this.viewModelFactory;
        if (viewModelFactory != null) {
            return viewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    public final void setViewModelFactory(ViewModelFactory viewModelFactory) {
        Intrinsics.checkNotNullParameter(viewModelFactory, "<set-?>");
        this.viewModelFactory = viewModelFactory;
    }

    public final PremiumAppIconManager getPremiumAppIconManager() {
        PremiumAppIconManager premiumAppIconManager = this.premiumAppIconManager;
        if (premiumAppIconManager != null) {
            return premiumAppIconManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("premiumAppIconManager");
        return null;
    }

    public final void setPremiumAppIconManager(PremiumAppIconManager premiumAppIconManager) {
        Intrinsics.checkNotNullParameter(premiumAppIconManager, "<set-?>");
        this.premiumAppIconManager = premiumAppIconManager;
    }

    @Override // com.ifriend.ui.base.BaseActivity
    public boolean isNeedToShowNoInternetConnectionDialog() {
        return this.isNeedToShowNoInternetConnectionDialog;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.ifriend.app.App");
        ((App) application).getAppComponent().inject(this);
        SplashViewModel splashViewModel = (SplashViewModel) new ViewModelProvider(this, getViewModelFactory()).get(SplashViewModel.class);
        Uri data = getIntent().getData();
        ConfirmEmailData confirmEmailData = null;
        String queryParameter = data != null ? data.getQueryParameter("auth") : null;
        Uri data2 = getIntent().getData();
        String queryParameter2 = data2 != null ? data2.getQueryParameter("token") : null;
        if (queryParameter != null && queryParameter2 != null) {
            confirmEmailData = new ConfirmEmailData(queryParameter, queryParameter2);
        }
        splashViewModel.init(this, confirmEmailData, queryParameter);
    }
}
