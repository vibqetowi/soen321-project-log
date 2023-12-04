package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.chat.presentation.ui.BotProfileScreen;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectGeneratedAvatarViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$avatarChosen$2", f = "SelectGeneratedAvatarViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SelectGeneratedAvatarViewModel$avatarChosen$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ SelectGeneratedAvatarViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGeneratedAvatarViewModel$avatarChosen$2(SelectGeneratedAvatarViewModel selectGeneratedAvatarViewModel, int i, Continuation<? super SelectGeneratedAvatarViewModel$avatarChosen$2> continuation) {
        super(2, continuation);
        this.this$0 = selectGeneratedAvatarViewModel;
        this.$position = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectGeneratedAvatarViewModel$avatarChosen$2(this.this$0, this.$position, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectGeneratedAvatarViewModel$avatarChosen$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GenerateBotAvatarRepository generateBotAvatarRepository;
        AppRouter appRouter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
            this.label = 1;
            if (generateBotAvatarRepository.applyAvatar(this.this$0.currentState().getGeneratedAvatars().get(this.$position).getId(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        appRouter = this.this$0.router;
        appRouter.transformCurrentChain(BotProfileScreen.INSTANCE);
        this.this$0.changeState(AnonymousClass1.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectGeneratedAvatarViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/SelectGeneratedAvatarState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.avatarGeneration.SelectGeneratedAvatarViewModel$avatarChosen$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<SelectGeneratedAvatarState, SelectGeneratedAvatarState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SelectGeneratedAvatarState invoke(SelectGeneratedAvatarState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SelectGeneratedAvatarState.copy$default(it, null, null, null, false, 7, null);
        }
    }
}
