package com.ifriend.presentation.features.purchases.benefits.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActivePremiumBenefitsViewModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getBenefitsUseCase", "Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;", "mapper", "Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivePremiumBenefitsViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final DispatcherProvider dispatchers;
    private final GetAllPremiumBenefitsUseCase getBenefitsUseCase;
    private final SubscriptionBenefitsUiMapper mapper;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @Inject
    public ActivePremiumBenefitsViewModelFactory(GetAllPremiumBenefitsUseCase getBenefitsUseCase, SubscriptionBenefitsUiMapper mapper, DispatcherProvider dispatchers) {
        Intrinsics.checkNotNullParameter(getBenefitsUseCase, "getBenefitsUseCase");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.getBenefitsUseCase = getBenefitsUseCase;
        this.mapper = mapper;
        this.dispatchers = dispatchers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ActivePremiumBenefitsViewModel.class)) {
            return new ActivePremiumBenefitsViewModel(this.getBenefitsUseCase, this.mapper, this.dispatchers);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
