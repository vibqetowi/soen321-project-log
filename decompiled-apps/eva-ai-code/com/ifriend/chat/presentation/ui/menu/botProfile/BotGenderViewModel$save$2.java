package com.ifriend.chat.presentation.ui.menu.botProfile;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import com.ifriend.analytics.usecase.botData.AnalyticsBotData;
import com.ifriend.analytics.usecase.botData.AnalyticsEditBotUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotGenderViewModel.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotGenderViewModel$save$2", f = "BotGenderViewModel.kt", i = {0}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {HintConstants.AUTOFILL_HINT_GENDER}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BotGenderViewModel$save$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BotGenderViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGenderViewModel$save$2(BotGenderViewModel botGenderViewModel, Continuation<? super BotGenderViewModel$save$2> continuation) {
        super(1, continuation);
        this.this$0 = botGenderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BotGenderViewModel$save$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BotGenderViewModel$save$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BotRepository botRepository;
        Gender gender;
        AnalyticsEditBotUseCase analyticsEditBotUseCase;
        AppEventsEmitter appEventsEmitter;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Gender gender2 = this.this$0.getCurrentGender().get();
            if (gender2 == null) {
                gender2 = Gender.MALE;
            }
            Intrinsics.checkNotNull(gender2);
            botRepository = this.this$0.botRepository;
            this.L$0 = gender2;
            this.label = 1;
            if (botRepository.updateGender(gender2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            gender = gender2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            gender = (Gender) this.L$0;
        }
        analyticsEditBotUseCase = this.this$0.analyticsEditBotUseCase;
        analyticsEditBotUseCase.handle(new AnalyticsBotData(gender, null, null, null, null, 30, null));
        appEventsEmitter = this.this$0.appEventsEmitter;
        appEventsEmitter.emit(AppEvents.Chat.RefreshConfiguration.INSTANCE);
        routerProvider = this.this$0.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
