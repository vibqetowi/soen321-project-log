package com.ifriend.registration.presentation.ui;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.config.AppConfigRepository;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RegistrationViewModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ifriend/registration/presentation/ui/RegistrationViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "appUpdatesDelegate", "Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;", "appConfigRepository", "Lcom/ifriend/domain/data/config/AppConfigRepository;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/ifriend/presentation/features/update/delegate/InAppUpdateDelegateImpl;Lcom/ifriend/domain/data/config/AppConfigRepository;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AppConfigRepository appConfigRepository;
    private final InAppUpdateDelegateImpl appUpdatesDelegate;
    private final DispatcherProvider dispatcherProvider;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
    }

    @Inject
    public RegistrationViewModelFactory(InAppUpdateDelegateImpl appUpdatesDelegate, AppConfigRepository appConfigRepository, DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(appUpdatesDelegate, "appUpdatesDelegate");
        Intrinsics.checkNotNullParameter(appConfigRepository, "appConfigRepository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.appUpdatesDelegate = appUpdatesDelegate;
        this.appConfigRepository = appConfigRepository;
        this.dispatcherProvider = dispatcherProvider;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (!Intrinsics.areEqual(modelClass, RegistrationViewModel.class)) {
            throw new IllegalArgumentException("Invalid modelClass " + modelClass);
        }
        return new RegistrationViewModel(this.appConfigRepository, this.dispatcherProvider, this.appUpdatesDelegate);
    }
}
