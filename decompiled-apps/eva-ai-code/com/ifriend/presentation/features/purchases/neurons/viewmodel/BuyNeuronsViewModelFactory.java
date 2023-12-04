package com.ifriend.presentation.features.purchases.neurons.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.analytics.usecase.screen.AnalyticsOpenSubscriptionScreenUseCase;
import com.ifriend.billing.api.models.BillingPurchaseProductType;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegate;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiMapper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyNeuronsViewModelFactory.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001&B~\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0015\u0010\u0014\u001a\u0011\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u00170\u0015j\u0002`\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ-\u0010\u001e\u001a\u0002H\u001f\"\b\b\u0000\u0010\u001f*\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001f0\"2\u0006\u0010#\u001a\u00020$H\u0016¢\u0006\u0002\u0010%R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0011\u0012\t\u0012\u00070\u0016¢\u0006\u0002\b\u00170\u0015j\u0002`\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "requestId", "Ljava/util/UUID;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "goToUpgrade", "", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "paymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "chatsInfoConfigurationRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;", "analyticsOpenSubscriptionScreenUseCase", "Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;", "buyNeuronsProductUiMapper", "Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiMapper;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "billingPurchaseDelegate", "Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Ljava/util/UUID;Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;ZLcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;Lcom/ifriend/domain/data/chat/ChatsInfoConfigurationRepository;Lcom/ifriend/analytics/usecase/screen/AnalyticsOpenSubscriptionScreenUseCase;Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiMapper;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/features/purchases/billing/delegate/BillingPurchaseDelegate$Factory;Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase;
    private final AppEventsEmitter appEventsEmitter;
    private final BillingPurchaseDelegate.Factory billingPurchaseDelegate;
    private final BuyNeuronsProductUiMapper buyNeuronsProductUiMapper;
    private final ChatsInfoConfigurationRepository chatsInfoConfigurationRepository;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final boolean goToUpgrade;
    private final PaymentResultEmitter paymentResultEmitter;
    private final PurchaseReason purchaseReason;
    private final PurchaseSource purchaseSource;
    private final UUID requestId;
    private final ResourceProvider resourceProvider;

    /* compiled from: BuyNeuronsViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/purchases/neurons/viewmodel/BuyNeuronsViewModelFactory;", "requestId", "Ljava/util/UUID;", "purchaseSource", "Lcom/ifriend/analytics/usecase/purchase/PurchaseSource;", "goToUpgrade", "", "purchaseReason", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        BuyNeuronsViewModelFactory create(UUID uuid, PurchaseSource purchaseSource, boolean z, PurchaseReason purchaseReason);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public BuyNeuronsViewModelFactory(@Assisted UUID requestId, @Assisted PurchaseSource purchaseSource, @Assisted boolean z, @Assisted PurchaseReason purchaseReason, PaymentResultEmitter paymentResultEmitter, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase, BuyNeuronsProductUiMapper buyNeuronsProductUiMapper, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> exceptionsEmitter, BillingPurchaseDelegate.Factory billingPurchaseDelegate, ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(purchaseSource, "purchaseSource");
        Intrinsics.checkNotNullParameter(purchaseReason, "purchaseReason");
        Intrinsics.checkNotNullParameter(paymentResultEmitter, "paymentResultEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoConfigurationRepository, "chatsInfoConfigurationRepository");
        Intrinsics.checkNotNullParameter(analyticsOpenSubscriptionScreenUseCase, "analyticsOpenSubscriptionScreenUseCase");
        Intrinsics.checkNotNullParameter(buyNeuronsProductUiMapper, "buyNeuronsProductUiMapper");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(billingPurchaseDelegate, "billingPurchaseDelegate");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.requestId = requestId;
        this.purchaseSource = purchaseSource;
        this.goToUpgrade = z;
        this.purchaseReason = purchaseReason;
        this.paymentResultEmitter = paymentResultEmitter;
        this.chatsInfoConfigurationRepository = chatsInfoConfigurationRepository;
        this.analyticsOpenSubscriptionScreenUseCase = analyticsOpenSubscriptionScreenUseCase;
        this.buyNeuronsProductUiMapper = buyNeuronsProductUiMapper;
        this.appEventsEmitter = appEventsEmitter;
        this.exceptionsEmitter = exceptionsEmitter;
        this.billingPurchaseDelegate = billingPurchaseDelegate;
        this.resourceProvider = resourceProvider;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (Intrinsics.areEqual(modelClass, BuyNeuronsViewModel.class)) {
            UUID uuid = this.requestId;
            PaymentResultEmitter paymentResultEmitter = this.paymentResultEmitter;
            PurchaseSource purchaseSource = this.purchaseSource;
            PurchaseReason purchaseReason = this.purchaseReason;
            ChatsInfoConfigurationRepository chatsInfoConfigurationRepository = this.chatsInfoConfigurationRepository;
            AnalyticsOpenSubscriptionScreenUseCase analyticsOpenSubscriptionScreenUseCase = this.analyticsOpenSubscriptionScreenUseCase;
            BuyNeuronsProductUiMapper buyNeuronsProductUiMapper = this.buyNeuronsProductUiMapper;
            return new BuyNeuronsViewModel(uuid, paymentResultEmitter, purchaseReason, this.goToUpgrade, chatsInfoConfigurationRepository, analyticsOpenSubscriptionScreenUseCase, buyNeuronsProductUiMapper, purchaseSource, this.appEventsEmitter, this.exceptionsEmitter, this.billingPurchaseDelegate.create(BillingPurchaseProductType.PURCHASE, this.purchaseReason, this.purchaseSource, ""), this.resourceProvider);
        }
        String simpleName = modelClass.getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
