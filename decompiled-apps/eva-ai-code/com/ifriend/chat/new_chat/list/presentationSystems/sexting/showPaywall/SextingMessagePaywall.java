package com.ifriend.chat.new_chat.list.presentationSystems.sexting.showPaywall;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.data.toggle.NeuronsToggleQualifier;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserKt;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.params.BuyNeuronsBillingUiParams;
import com.ifriend.presentation.common.observers.appevents.params.BuySubscriptionBillingUiParams;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.chat.common.models.MessageIdsParamsKt;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: SextingMessagePaywall.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ1\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sexting/showPaywall/SextingMessagePaywall;", "", "neuronsToggle", "Lcom/ifriend/domain/toggle/FeatureToggle;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "(Lcom/ifriend/domain/toggle/FeatureToggle;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;)V", "invoke", "", "messageIds", "Lcom/ifriend/domain/newChat/chat/models/MessageIds;", "onResult", "Lkotlin/Function1;", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageIds;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNeedToShowPaywall", "showSextingPaywall", "requestId", "Ljava/util/UUID;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SextingMessagePaywall {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final FeatureToggle neuronsToggle;
    private final PaymentResultFlow paymentResultFlow;
    private final UserRepository userRepository;

    @Inject
    public SextingMessagePaywall(@NeuronsToggleQualifier FeatureToggle neuronsToggle, UserRepository userRepository, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow) {
        Intrinsics.checkNotNullParameter(neuronsToggle, "neuronsToggle");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        this.neuronsToggle = neuronsToggle;
        this.userRepository = userRepository;
        this.appEventsEmitter = appEventsEmitter;
        this.paymentResultFlow = paymentResultFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(SextingMessagePaywall sextingMessagePaywall, MessageIds messageIds, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return sextingMessagePaywall.invoke(messageIds, function1, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MessageIds messageIds, final Function1<? super Boolean, Unit> function1, Continuation<? super Unit> continuation) {
        SextingMessagePaywall$invoke$1 sextingMessagePaywall$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        SextingMessagePaywall sextingMessagePaywall;
        MessageIds messageIds2;
        UUID uuid;
        if (continuation instanceof SextingMessagePaywall$invoke$1) {
            sextingMessagePaywall$invoke$1 = (SextingMessagePaywall$invoke$1) continuation;
            if ((sextingMessagePaywall$invoke$1.label & Integer.MIN_VALUE) != 0) {
                sextingMessagePaywall$invoke$1.label -= Integer.MIN_VALUE;
                obj = sextingMessagePaywall$invoke$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sextingMessagePaywall$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UUID randomUUID = UUID.randomUUID();
                    FeatureToggle featureToggle = this.neuronsToggle;
                    sextingMessagePaywall$invoke$1.L$0 = this;
                    sextingMessagePaywall$invoke$1.L$1 = messageIds;
                    sextingMessagePaywall$invoke$1.L$2 = function1;
                    sextingMessagePaywall$invoke$1.L$3 = randomUUID;
                    sextingMessagePaywall$invoke$1.label = 1;
                    Object isEnabled = featureToggle.isEnabled(sextingMessagePaywall$invoke$1);
                    if (isEnabled == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sextingMessagePaywall = this;
                    messageIds2 = messageIds;
                    uuid = randomUUID;
                    obj = isEnabled;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    uuid = (UUID) sextingMessagePaywall$invoke$1.L$3;
                    function1 = (Function1) sextingMessagePaywall$invoke$1.L$2;
                    messageIds2 = (MessageIds) sextingMessagePaywall$invoke$1.L$1;
                    sextingMessagePaywall = (SextingMessagePaywall) sextingMessagePaywall$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
                    User currentUser = sextingMessagePaywall.userRepository.getCurrentUser();
                    if (currentUser != null && UserKt.isPremium(currentUser)) {
                        PurchaseSource purchaseSource = PurchaseSource.CHAT;
                        Intrinsics.checkNotNull(uuid);
                        sextingMessagePaywall.appEventsEmitter.emit(new AppEvents.Billing.BuyNeurons(new BuyNeuronsBillingUiParams(false, new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(messageIds2)), purchaseSource, uuid)));
                    } else {
                        UpgradeType upgradeType = UpgradeType.ADULT_TEXTING;
                        PurchaseReason.BuyMessage buyMessage = new PurchaseReason.BuyMessage(MessageIdsParamsKt.toMessageIdsParams(messageIds2));
                        Intrinsics.checkNotNull(uuid);
                        sextingMessagePaywall.appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(uuid, true, upgradeType, buyMessage)));
                    }
                } else if (sextingMessagePaywall.isNeedToShowPaywall()) {
                    Intrinsics.checkNotNull(uuid);
                    sextingMessagePaywall.showSextingPaywall(uuid);
                } else {
                    return Unit.INSTANCE;
                }
                sextingMessagePaywall$invoke$1.L$0 = null;
                sextingMessagePaywall$invoke$1.L$1 = null;
                sextingMessagePaywall$invoke$1.L$2 = null;
                sextingMessagePaywall$invoke$1.L$3 = null;
                sextingMessagePaywall$invoke$1.label = 2;
                if (sextingMessagePaywall.paymentResultFlow.getPaymentResultFlow(uuid).collect(new FlowCollector<Boolean>() { // from class: com.ifriend.chat.new_chat.list.presentationSystems.sexting.showPaywall.SextingMessagePaywall$invoke$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation2) {
                        return emit(bool.booleanValue(), continuation2);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation2) {
                        Function1<Boolean, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Boxing.boxBoolean(z));
                        }
                        return Unit.INSTANCE;
                    }
                }, sextingMessagePaywall$invoke$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        sextingMessagePaywall$invoke$1 = new SextingMessagePaywall$invoke$1(this, continuation);
        obj = sextingMessagePaywall$invoke$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sextingMessagePaywall$invoke$1.label;
        if (i != 0) {
        }
        if (!((Boolean) ((StateFlow) obj).getValue()).booleanValue()) {
        }
        sextingMessagePaywall$invoke$1.L$0 = null;
        sextingMessagePaywall$invoke$1.L$1 = null;
        sextingMessagePaywall$invoke$1.L$2 = null;
        sextingMessagePaywall$invoke$1.L$3 = null;
        sextingMessagePaywall$invoke$1.label = 2;
        if (sextingMessagePaywall.paymentResultFlow.getPaymentResultFlow(uuid).collect(new FlowCollector<Boolean>() { // from class: com.ifriend.chat.new_chat.list.presentationSystems.sexting.showPaywall.SextingMessagePaywall$invoke$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation2) {
                return emit(bool.booleanValue(), continuation2);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation2) {
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boxing.boxBoolean(z));
                }
                return Unit.INSTANCE;
            }
        }, sextingMessagePaywall$invoke$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    private final void showSextingPaywall(UUID uuid) {
        this.appEventsEmitter.emit(new AppEvents.Billing.BuySubscription(new BuySubscriptionBillingUiParams(uuid, false, UpgradeType.ADULT_TEXTING, null, 10, null)));
    }

    private final boolean isNeedToShowPaywall() {
        User currentUser = this.userRepository.getCurrentUser();
        boolean z = false;
        if (currentUser != null && UserKt.isPremium(currentUser)) {
            z = true;
        }
        return !z;
    }
}
