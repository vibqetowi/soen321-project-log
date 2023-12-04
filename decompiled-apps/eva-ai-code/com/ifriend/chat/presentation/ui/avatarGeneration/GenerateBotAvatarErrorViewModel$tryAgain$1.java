package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
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
/* compiled from: GenerateBotAvatarErrorViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.avatarGeneration.GenerateBotAvatarErrorViewModel$tryAgain$1", f = "GenerateBotAvatarErrorViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GenerateBotAvatarErrorViewModel$tryAgain$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GenerateBotAvatarErrorViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateBotAvatarErrorViewModel$tryAgain$1(GenerateBotAvatarErrorViewModel generateBotAvatarErrorViewModel, Continuation<? super GenerateBotAvatarErrorViewModel$tryAgain$1> continuation) {
        super(2, continuation);
        this.this$0 = generateBotAvatarErrorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateBotAvatarErrorViewModel$tryAgain$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenerateBotAvatarErrorViewModel$tryAgain$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GenerateBotAvatarRepository generateBotAvatarRepository;
        RouterProvider routerProvider;
        GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
            this.label = 1;
            obj = generateBotAvatarRepository.getLastGenerationDescription(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        routerProvider = this.this$0.router;
        AppRouter route = routerProvider.getRoute();
        generateBotAvatarScreenFactory = this.this$0.generateBotAvatarScreenFactory;
        route.replaceScreen(generateBotAvatarScreenFactory.getGenerateBotAvatarScreen((String) obj));
        return Unit.INSTANCE;
    }
}
