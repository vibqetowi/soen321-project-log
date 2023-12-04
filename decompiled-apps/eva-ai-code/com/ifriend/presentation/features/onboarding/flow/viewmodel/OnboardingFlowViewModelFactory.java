package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingFlowViewModelFactory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/flow/viewmodel/OnboardingFlowViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "interactor", "Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "(Lcom/ifriend/domain/onboarding/interactor/OnboardingInteractor;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final OnboardingInteractor interactor;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
    }

    @Inject
    public OnboardingFlowViewModelFactory(OnboardingInteractor interactor, AppEventsEmitter appEventsEmitter) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        this.interactor = interactor;
        this.appEventsEmitter = appEventsEmitter;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (Intrinsics.areEqual(modelClass, OnboardingFlowViewModel.class)) {
            return new OnboardingFlowViewModel(this.interactor, this.appEventsEmitter);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
