package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsBotData;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.common_utils.Format;
import com.ifriend.domain.useCases.bot.ChangeBotAgeUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotAgeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotAgeViewModel$save$1", f = "BotAgeViewModel.kt", i = {0}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend", n = {"it"}, s = {"I$0"})
/* loaded from: classes6.dex */
public final class BotAgeViewModel$save$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ BotAgeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotAgeViewModel$save$1(BotAgeViewModel botAgeViewModel, Continuation<? super BotAgeViewModel$save$1> continuation) {
        super(2, continuation);
        this.this$0 = botAgeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotAgeViewModel$save$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotAgeViewModel$save$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BotAgeViewModel botAgeViewModel;
        ChangeBotAgeUseCase changeBotAgeUseCase;
        int i;
        AnalyticsEditBotUseCase analyticsEditBotUseCase;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String value = this.this$0.getAge().getValue();
            if (value != null) {
                int parseInt = Integer.parseInt(value);
                botAgeViewModel = this.this$0;
                changeBotAgeUseCase = botAgeViewModel.changeBotAgeUseCase;
                this.L$0 = botAgeViewModel;
                this.I$0 = parseInt;
                this.label = 1;
                if (changeBotAgeUseCase.change(parseInt, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = parseInt;
            }
            return Unit.INSTANCE;
        } else if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            botAgeViewModel = (BotAgeViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        analyticsEditBotUseCase = botAgeViewModel.analyticsEditBotUseCase;
        analyticsEditBotUseCase.handle(new AnalyticsBotData(null, Format.INSTANCE.dateToString(Format.INSTANCE.ageToDate(i)), null, null, null, 29, null));
        routerProvider = botAgeViewModel.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
