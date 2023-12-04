package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.chat.presentation.ui.avatarGeneration.analytics.AvatarGenerationAnalytics;
import com.ifriend.domain.data.generateAvatar.GenerateAvatarException;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.data.generateAvatar.NotEnoughNeuronsToGenerateAvatarException;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectGeneratedAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$generateAgain$2", f = "SelectGeneratedAvatarViewModel.kt", i = {}, l = {86, 99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarViewModel$generateAgain$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SelectGeneratedAvatarViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGeneratedAvatarViewModel$generateAgain$2(SelectGeneratedAvatarViewModel selectGeneratedAvatarViewModel, Continuation<? super SelectGeneratedAvatarViewModel$generateAgain$2> continuation) {
        super(2, continuation);
        this.this$0 = selectGeneratedAvatarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectGeneratedAvatarViewModel$generateAgain$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectGeneratedAvatarViewModel$generateAgain$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppRouter appRouter;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
        AppEventsEmitter appEventsEmitter;
        PaymentResultFlow paymentResultFlow;
        AppRouter appRouter2;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory2;
        GenerateBotAvatarRepository generateBotAvatarRepository;
        AppRouter appRouter3;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (GenerateAvatarException unused) {
                appRouter2 = this.this$0.router;
                generateBotAvatarScreenFactory2 = this.this$0.generateBotAvatarScreenFactory;
                appRouter2.replaceScreen(generateBotAvatarScreenFactory2.getGenerateBotAvatarErrorScreen());
            } catch (NotEnoughNeuronsToGenerateAvatarException unused2) {
                UUID randomUUID = UUID.randomUUID();
                PurchaseReason.GenerateAvatar generateAvatar = new PurchaseReason.GenerateAvatar("");
                PurchaseSource purchaseSource = PurchaseSource.GENERATE_AVATAR;
                Intrinsics.checkNotNull(randomUUID);
                BuyNeuronsBillingUiParams buyNeuronsBillingUiParams = new BuyNeuronsBillingUiParams(true, generateAvatar, purchaseSource, randomUUID);
                appEventsEmitter = this.this$0.appEventsEmitter;
                appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(buyNeuronsBillingUiParams));
                paymentResultFlow = this.this$0.paymentResultFlow;
                Flow<Boolean> paymentResultFlow2 = paymentResultFlow.getPaymentResultFlow(randomUUID);
                final SelectGeneratedAvatarViewModel selectGeneratedAvatarViewModel = this.this$0;
                this.label = 2;
                if (paymentResultFlow2.collect(new FlowCollector<Boolean>() { // from class: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$generateAgain$2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                        return emit(bool.booleanValue(), continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            SelectGeneratedAvatarViewModel.this.generateAgain();
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception unused3) {
                this.this$0.changeState(AnonymousClass2.INSTANCE);
                appRouter = this.this$0.router;
                generateBotAvatarScreenFactory = this.this$0.generateBotAvatarScreenFactory;
                appRouter.navigateTo(generateBotAvatarScreenFactory.getGenerateBotAvatarErrorScreen());
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
                this.label = 1;
                if (GenerateBotAvatarRepository.DefaultImpls.createAvatar$default(generateBotAvatarRepository, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.changeState(AnonymousClass3.INSTANCE);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            AvatarGenerationAnalytics.INSTANCE.trackGenerateAvatarAgain();
            appRouter3 = this.this$0.router;
            generateBotAvatarScreenFactory3 = this.this$0.generateBotAvatarScreenFactory;
            appRouter3.replaceScreen(generateBotAvatarScreenFactory3.getGeneratingBotAvatarPlaceholderScreen());
            this.this$0.changeState(AnonymousClass3.INSTANCE);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.changeState(AnonymousClass3.INSTANCE);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectGeneratedAvatarViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$generateAgain$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<SelectGeneratedAvatarState, SelectGeneratedAvatarState> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SelectGeneratedAvatarState invoke(SelectGeneratedAvatarState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SelectGeneratedAvatarState.copy$default(it, null, null, null, false, 7, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectGeneratedAvatarViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$generateAgain$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<SelectGeneratedAvatarState, SelectGeneratedAvatarState> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SelectGeneratedAvatarState invoke(SelectGeneratedAvatarState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SelectGeneratedAvatarState.copy$default(it, null, null, null, false, 7, null);
        }
    }
}
