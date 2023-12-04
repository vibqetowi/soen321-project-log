package com.ifriend.app.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.app.ui.splash.SplashViewModel;
import com.ifriend.ui.base.di.ViewModelFactory;
import com.ifriend.ui.base.di.ViewModelKey;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kotlin.Metadata;
/* compiled from: AppViewModelModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lcom/ifriend/app/di/AppViewModelModule;", "", "()V", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "splashViewModelViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/ifriend/app/ui/splash/SplashViewModel;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class AppViewModelModule {
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);

    @ViewModelKey(SplashViewModel.class)
    @Binds
    @IntoMap
    public abstract ViewModel splashViewModelViewModel(SplashViewModel splashViewModel);
}
