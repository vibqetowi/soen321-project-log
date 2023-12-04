package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.analytics.usecase.botData.AnalyticsBotData;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.data.mappers.PersonalityToBackendValueMapper;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.domain.useCases.bot.ChangeBotPersonalityUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotPersonalityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotPersonalityViewModel$save$1", f = "BotPersonalityViewModel.kt", i = {0}, l = {95}, m = "invokeSuspend", n = {"personalityString"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BotPersonalityViewModel$save$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BotPersonalityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotPersonalityViewModel$save$1(BotPersonalityViewModel botPersonalityViewModel, Continuation<? super BotPersonalityViewModel$save$1> continuation) {
        super(2, continuation);
        this.this$0 = botPersonalityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotPersonalityViewModel$save$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotPersonalityViewModel$save$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChangeBotPersonalityUseCase changeBotPersonalityUseCase;
        String str;
        AnalyticsEditBotUseCase analyticsEditBotUseCase;
        AppEventsEmitter appEventsEmitter;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Personality personality = this.this$0.getCurrentPersonality().get();
            if (personality == null) {
                personality = Personality.FRIENDLY;
            }
            Intrinsics.checkNotNull(personality);
            String map = new PersonalityToBackendValueMapper().map(personality);
            changeBotPersonalityUseCase = this.this$0.changeBotPersonalityUseCase;
            this.L$0 = map;
            this.label = 1;
            if (changeBotPersonalityUseCase.change(personality, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = map;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            str = (String) this.L$0;
        }
        analyticsEditBotUseCase = this.this$0.analyticsEditBotUseCase;
        analyticsEditBotUseCase.handle(new AnalyticsBotData(null, null, null, str, null, 23, null));
        appEventsEmitter = this.this$0.appEventsEmitter;
        appEventsEmitter.emit(AppEvents.Chat.RefreshConfiguration.INSTANCE);
        routerProvider = this.this$0.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
