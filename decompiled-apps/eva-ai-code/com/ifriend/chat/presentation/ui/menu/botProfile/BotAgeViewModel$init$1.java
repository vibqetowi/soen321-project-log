package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotAgeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel$init$1", f = "BotAgeViewModel.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BotAgeViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BotAgeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAgeViewModel$init$1(BotAgeViewModel botAgeViewModel, Continuation<? super BotAgeViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = botAgeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotAgeViewModel$init$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotAgeViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BotAgeViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel$init$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
        final /* synthetic */ BotAgeViewModel $tmp0;

        AnonymousClass1(BotAgeViewModel botAgeViewModel) {
            this.$tmp0 = botAgeViewModel;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.$tmp0, BotAgeViewModel.class, "onBotChanged", "onBotChanged(Lcom/ifriend/domain/models/profile/bot/Bot;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final Object emit(Bot bot, Continuation<? super Unit> continuation) {
            Object invokeSuspend$onBotChanged = BotAgeViewModel$init$1.invokeSuspend$onBotChanged(this.$tmp0, bot, continuation);
            return invokeSuspend$onBotChanged == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invokeSuspend$onBotChanged : Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((Bot) obj, (Continuation<? super Unit>) continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetBotUseCase getBotUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getBotUseCase = this.this$0.getBotUseCase;
            this.label = 1;
            obj = getBotUseCase.flow(this);
            if (obj == coroutine_suspended) {
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
        this.label = 2;
        if (((Flow) obj).collect(new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$onBotChanged(BotAgeViewModel botAgeViewModel, Bot bot, Continuation continuation) {
        botAgeViewModel.onBotChanged(bot);
        return Unit.INSTANCE;
    }
}
