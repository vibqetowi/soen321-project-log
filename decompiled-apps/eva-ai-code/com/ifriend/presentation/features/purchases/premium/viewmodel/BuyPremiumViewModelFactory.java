package com.ifriend.presentation.features.purchases.premium.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiMapper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyPremiumViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00010B¦\u0001\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0015\u0010\u0018\u001a\u0011\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b0\u0019j\u0002`\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&¢\u0006\u0002\u0010'J-\u0010(\u001a\u0002H)\"\b\b\u0000\u0010)*\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H)0,2\u0006\u0010-\u001a\u00020.H\u0016¢\u0006\u0002\u0010/R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0018\u001a\u0011\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b0\u0019j\u0002`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "requestId", "Ljava/util/UUID;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "goToNeurons", "", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "getBenefitsUseCase", "Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "analyticsOpenSubscriptionScreenUseCase", "Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;", "mapper", "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiMapper;", "paymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "analyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "billingPurchaseDelegate", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;", "getUserUseCase", "Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "benefitsMapper", "Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Ljava/util/UUID;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;ZLcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/chat/domain/profile/user/benefits/GetAllPremiumBenefitsUseCase;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiMapper;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;Lcom/ifriend/domain/useCases/user/get/GetUserUseCase;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/presentation/features/purchases/common/mapper/SubscriptionBenefitsUiMapper;Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AnalyticsInteractor analyticsInteractor;
    private final AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final SubscriptionBenefitsUiMapper benefitsMapper;
    private final BillingPurchaseDelegate.Factory billingPurchaseDelegate;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final DispatcherProvider dispatchers;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetAllPremiumBenefitsUseCase getBenefitsUseCase;
    private final GetUserUseCase getUserUseCase;
    private final boolean goToNeurons;
    private final BuyPremiumPlanUiMapper mapper;
    private final PaymentResultEmitter paymentResultEmitter;
    private final PurchaseReason purchaseReason;
    private final PurchaseSource purchaseSource;
    private final UUID requestId;
    private final ResourceProvider resourceProvider;

    /* compiled from: BuyPremiumViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModelFactory;", "requestId", "Ljava/util/UUID;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "goToNeurons", "", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        BuyPremiumViewModelFactory create(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public BuyPremiumViewModelFactory(@Assisted UUID requestId, @Assisted PurchaseSource purchaseSource, @Assisted boolean z, @Assisted PurchaseReason purchaseReason, GetAllPremiumBenefitsUseCase getBenefitsUseCase, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase, BuyPremiumPlanUiMapper mapper, PaymentResultEmitter paymentResultEmitter, AppEventsEmitter appEventsEmitter, AnalyticsInteractor analyticsInteractor, FlowObserverEmitter<Throwable> exceptionsEmitter, BillingPurchaseDelegate.Factory billingPurchaseDelegate, GetUserUseCase getUserUseCase, DispatcherProvider dispatchers, SubscriptionBenefitsUiMapper benefitsMapper, ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(getBenefitsUseCase, "getBenefitsUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(analyticsOpenSubscriptionScreenUseCase, "analyticsOpenSubscriptionScreenUseCase");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(paymentResultEmitter, "paymentResultEmitter");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        Intrinsics.checkNotNullParameter(getUserUseCase, "getUserUseCase");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(benefitsMapper, "benefitsMapper");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.requestId = requestId;
        this.purchaseSource = purchaseSource;
        this.goToNeurons = z;
        this.purchaseReason = purchaseReason;
        this.getBenefitsUseCase = getBenefitsUseCase;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.analyticsOpenSubscriptionScreenUseCase = analyticsOpenSubscriptionScreenUseCase;
        this.mapper = mapper;
        this.paymentResultEmitter = paymentResultEmitter;
        this.appEventsEmitter = appEventsEmitter;
        this.analyticsInteractor = analyticsInteractor;
        this.exceptionsEmitter = exceptionsEmitter;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.getUserUseCase = getUserUseCase;
        this.dispatchers = dispatchers;
        this.benefitsMapper = benefitsMapper;
        this.resourceProvider = resourceProvider;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (Intrinsics.areEqual(modelClass, BuyPremiumViewModel.class)) {
            UUID uuid = this.requestId;
            PurchaseSource purchaseSource = this.purchaseSource;
            PurchaseReason purchaseReason = this.purchaseReason;
            boolean z = this.goToNeurons;
            GetAllPremiumBenefitsUseCase getAllPremiumBenefitsUseCase = this.getBenefitsUseCase;
            ChatsInfoConfigurationRepository chatsInfoConfigurationRepository = this.chatsInfoConfigurationRepository;
            AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase = this.analyticsOpenSubscriptionScreenUseCase;
            BuyPremiumPlanUiMapper buyPremiumPlanUiMapper = this.mapper;
            PaymentResultEmitter paymentResultEmitter = this.paymentResultEmitter;
            AppEventsEmitter appEventsEmitter = this.appEventsEmitter;
            AnalyticsInteractor analyticsInteractor = this.analyticsInteractor;
            FlowObserverEmitter<Throwable> flowObserverEmitter = this.exceptionsEmitter;
            BillingPurchaseDelegateImpl create = this.billingPurchaseDelegate.create(BillingPurchaseProductType.SUBSCRIPTION, this.purchaseReason, this.purchaseSource, "");
            return new BuyPremiumViewModel(uuid, purchaseReason, purchaseSource, z, getAllPremiumBenefitsUseCase, chatsInfoConfigurationRepository, analyticsOpenSubscriptionScreenUseCase, buyPremiumPlanUiMapper, paymentResultEmitter, appEventsEmitter, analyticsInteractor, flowObserverEmitter, create, this.getUserUseCase, this.resourceProvider, this.dispatchers, this.benefitsMapper);
        }
        String simpleName = modelClass.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
