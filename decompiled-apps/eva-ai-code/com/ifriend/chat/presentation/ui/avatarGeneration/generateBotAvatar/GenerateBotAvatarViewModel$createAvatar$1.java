package com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.avatarGeneration.analytics.AvatarGenerationAnalytics;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.generateAvatar.NotEnoughNeuronsToGenerateAvatarException;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GenerateBotAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel$createAvatar$1", f = "GenerateBotAvatarViewModel.kt", i = {}, l = {124, 140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarViewModel$createAvatar$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GenerateBotAvatarViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarViewModel$createAvatar$1(GenerateBotAvatarViewModel generateBotAvatarViewModel, Continuation<? super GenerateBotAvatarViewModel$createAvatar$1> continuation) {
        super(2, continuation);
        this.this$0 = generateBotAvatarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateBotAvatarViewModel$createAvatar$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenerateBotAvatarViewModel$createAvatar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouterProvider routerProvider;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
        AppEventsEmitter appEventsEmitter;
        PaymentResultFlow paymentResultFlow;
        GenerateBotAvatarRepository generateBotAvatarRepository;
        RouterProvider routerProvider2;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (NotEnoughNeuronsToGenerateAvatarException unused) {
            UUID randomUUID = UUID.randomUUID();
            UpgradeType upgradeType = UpgradeType.GENERATE_AVATAR;
            PurchaseReason.GenerateAvatar generateAvatar = new PurchaseReason.GenerateAvatar(this.this$0.currentState().getDescription());
            Intrinsics.checkNotNull(randomUUID);
            BuySubscriptionBillingUiParams buySubscriptionBillingUiParams = new BuySubscriptionBillingUiParams(randomUUID, true, upgradeType, generateAvatar);
            appEventsEmitter = this.this$0.appEventsEmitter;
            appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(buySubscriptionBillingUiParams));
            paymentResultFlow = this.this$0.paymentResultFlow;
            Flow<Boolean> paymentResultFlow2 = paymentResultFlow.getPaymentResultFlow(randomUUID);
            final GenerateBotAvatarViewModel generateBotAvatarViewModel = this.this$0;
            this.label = 2;
            if (paymentResultFlow2.collect(new FlowCollector<Boolean>() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.generateBotAvatar.GenerateBotAvatarViewModel$createAvatar$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                    return emit(bool.booleanValue(), continuation);
                }

                public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                    if (z) {
                        GenerateBotAvatarViewModel.this.createAvatar();
                    }
                    GenerateBotAvatarViewModel.createAvatar$updateLoadingState(GenerateBotAvatarViewModel.this, false);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } catch (Exception unused2) {
            GenerateBotAvatarViewModel.createAvatar$updateLoadingState(this.this$0, false);
            routerProvider = this.this$0.router;
            AppRouter route = routerProvider.getRoute();
            generateBotAvatarScreenFactory = this.this$0.generateBotAvatarScreenFactory;
            route.replaceScreen(generateBotAvatarScreenFactory.getGenerateBotAvatarErrorScreen());
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
            this.label = 1;
            if (generateBotAvatarRepository.createAvatar(this.this$0.currentState().getDescription(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        AvatarGenerationAnalytics.INSTANCE.trackGenerateAvatarBtn();
        routerProvider2 = this.this$0.router;
        AppRouter route2 = routerProvider2.getRoute();
        generateBotAvatarScreenFactory2 = this.this$0.generateBotAvatarScreenFactory;
        route2.replaceScreen(generateBotAvatarScreenFactory2.getGeneratingBotAvatarPlaceholderScreen());
        GenerateBotAvatarViewModel.createAvatar$updateLoadingState(this.this$0, false);
        return Unit.INSTANCE;
    }
}
