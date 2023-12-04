package com.ifriend.domain.logic.chat;

import com.google.firebase.perf.util.Constants;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBackgroundUseCase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/bot/Bot;", "bot", "", Constants.ENABLE_DISABLE, "isDownloaded", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chat", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.chat.ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2", f = "ChatBackgroundUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2 extends SuspendLambda implements Function5<Bot, Boolean, Boolean, ChatInfo, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2(Continuation<? super ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2> continuation) {
        super(5, continuation);
    }

    public final Object invoke(Bot bot, boolean z, boolean z2, ChatInfo chatInfo, Continuation<? super Boolean> continuation) {
        ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2 chatBackgroundUseCase$isAvailableVideoBackgroundFlow$2 = new ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2(continuation);
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$2.L$0 = bot;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$2.Z$0 = z;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$2.Z$1 = z2;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$2.L$1 = chatInfo;
        return chatBackgroundUseCase$isAvailableVideoBackgroundFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Bot bot, Boolean bool, Boolean bool2, ChatInfo chatInfo, Continuation<? super Boolean> continuation) {
        return invoke(bot, bool.booleanValue(), bool2.booleanValue(), chatInfo, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Bot bot = (Bot) this.L$0;
            boolean z2 = this.Z$0;
            boolean z3 = this.Z$1;
            ChatInfo chatInfo = (ChatInfo) this.L$1;
            if (z2 && z3) {
                if ((bot != null ? bot.getGender() : null) == Gender.FEMALE && bot.getEthnicity() != Ethnicity.BLACK && chatInfo.isMain()) {
                    z = true;
                    return Boxing.boxBoolean(z);
                }
            }
            z = false;
            return Boxing.boxBoolean(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
