package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.useCases.bot.ChangeBotNameUseCase;
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
/* compiled from: BotNameViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotNameViewModel$save$1", f = "BotNameViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BotNameViewModel$save$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BotNameViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotNameViewModel$save$1(BotNameViewModel botNameViewModel, Continuation<? super BotNameViewModel$save$1> continuation) {
        super(2, continuation);
        this.this$0 = botNameViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotNameViewModel$save$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotNameViewModel$save$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChangeBotNameUseCase changeBotNameUseCase;
        BotNameViewModel botNameViewModel;
        RouterProvider routerProvider;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String value = this.this$0.getName().getValue();
            if (value != null) {
                BotNameViewModel botNameViewModel2 = this.this$0;
                changeBotNameUseCase = botNameViewModel2.changeBotNameUseCase;
                this.L$0 = botNameViewModel2;
                this.label = 1;
                if (changeBotNameUseCase.execute(value, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                botNameViewModel = botNameViewModel2;
            }
            return Unit.INSTANCE;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            botNameViewModel = (BotNameViewModel) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        routerProvider = botNameViewModel.router;
        routerProvider.getRoute().exit();
        return Unit.INSTANCE;
    }
}
