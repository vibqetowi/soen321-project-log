package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsBotData;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.domain.useCases.bot.ChangeBotVoiceUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotVoiceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceViewModel$save$1", f = "BotVoiceViewModel.kt", i = {0}, l = {114, 117}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
/* loaded from: classes6.dex */
public final class BotVoiceViewModel$save$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ BotVoiceViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotVoiceViewModel$save$1(BotVoiceViewModel botVoiceViewModel, Continuation<? super BotVoiceViewModel$save$1> continuation) {
        super(2, continuation);
        this.this$0 = botVoiceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotVoiceViewModel$save$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotVoiceViewModel$save$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String value;
        ChangeBotVoiceUseCase changeBotVoiceUseCase;
        BotVoiceViewModel botVoiceViewModel;
        AudioPlayer audioPlayer;
        AnalyticsEditBotUseCase analyticsEditBotUseCase;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            value = this.this$0.getCurrentVoiceId().getValue();
            if (value != null) {
                BotVoiceViewModel botVoiceViewModel2 = this.this$0;
                changeBotVoiceUseCase = botVoiceViewModel2.changeBotVoiceUseCase;
                this.L$0 = botVoiceViewModel2;
                this.L$1 = value;
                this.label = 1;
                if (changeBotVoiceUseCase.invoke(value, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                botVoiceViewModel = botVoiceViewModel2;
            }
            audioPlayer = this.this$0.audioPlayer;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (audioPlayer.clearCache(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            routerProvider = this.this$0.router;
            routerProvider.getRoute().exit();
            return Unit.INSTANCE;
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                routerProvider = this.this$0.router;
                routerProvider.getRoute().exit();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            value = (String) this.L$1;
            botVoiceViewModel = (BotVoiceViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = value;
        analyticsEditBotUseCase = botVoiceViewModel.analyticsEditBotUseCase;
        analyticsEditBotUseCase.handle(new AnalyticsBotData(null, null, null, null, str, 15, null));
        audioPlayer = this.this$0.audioPlayer;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (audioPlayer.clearCache(this) == coroutine_suspended) {
        }
        routerProvider = this.this$0.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
