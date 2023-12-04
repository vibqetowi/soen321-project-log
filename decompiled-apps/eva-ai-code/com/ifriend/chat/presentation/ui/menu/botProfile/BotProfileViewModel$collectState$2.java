package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileState;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotProfileViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/BotProfileState;", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.chat.presentation.ui.menu.botProfile.BotProfileViewModel$collectState$2", f = "BotProfileViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BotProfileViewModel$collectState$2 extends SuspendLambda implements Function2<BotProfileState, Continuation<? super BotProfileState>, Object> {
    final /* synthetic */ Bot $bot;
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ BotProfileViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProfileViewModel$collectState$2(BotProfileViewModel botProfileViewModel, Bot bot, User user, Continuation<? super BotProfileViewModel$collectState$2> continuation) {
        super(2, continuation);
        this.this$0 = botProfileViewModel;
        this.$bot = bot;
        this.$user = user;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotProfileViewModel$collectState$2(this.this$0, this.$bot, this.$user, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BotProfileState botProfileState, Continuation<? super BotProfileState> continuation) {
        return ((BotProfileViewModel$collectState$2) create(botProfileState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BotProfileState copy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.createVoice(this.$bot, this.$user, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        BotProfileState.Voice voice = (BotProfileState.Voice) obj;
        BotProfileState currentState = this.this$0.currentState();
        String valueOf = String.valueOf(this.$bot.getName());
        Birthday birthday = this.$bot.getBirthday();
        copy = currentState.copy((r18 & 1) != 0 ? currentState.name : valueOf, (r18 & 2) != 0 ? currentState.age : birthday != null ? Boxing.boxInt(birthday.getAge()) : null, (r18 & 4) != 0 ? currentState.gender : this.$bot.getGender(), (r18 & 8) != 0 ? currentState.ethnicity : this.$bot.getEthnicity(), (r18 & 16) != 0 ? currentState.personality : this.$bot.getPersonality(), (r18 & 32) != 0 ? currentState.avatarState : null, (r18 & 64) != 0 ? currentState.voice : voice, (r18 & 128) != 0 ? currentState.levelInfo : null);
        return copy;
    }
}
