package com.ifriend.presentation.features.home.delegates;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatar;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.features.home.mappers.HomeActiveChatMapper;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* compiled from: HomeChatsDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", "avatarState", "Lcom/ifriend/common_entities_engine/EntitiesState;", "state", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1", f = "HomeChatsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1 extends SuspendLambda implements Function3<GeneratedChatAvatar, EntitiesState, Continuation<? super HomeChatUi>, Object> {
    final /* synthetic */ ChatInfo $chat;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ HomeChatsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1(HomeChatsDelegateImpl homeChatsDelegateImpl, ChatInfo chatInfo, Continuation<? super HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1> continuation) {
        super(3, continuation);
        this.this$0 = homeChatsDelegateImpl;
        this.$chat = chatInfo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(GeneratedChatAvatar generatedChatAvatar, EntitiesState entitiesState, Continuation<? super HomeChatUi> continuation) {
        HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1 homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1 = new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1(this.this$0, this.$chat, continuation);
        homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1.L$0 = generatedChatAvatar;
        homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1.L$1 = entitiesState;
        return homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeActiveChatMapper homeActiveChatMapper;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            EntitiesState entitiesState = (EntitiesState) this.L$1;
            homeActiveChatMapper = this.this$0.activeChatMapper;
            return homeActiveChatMapper.map(entitiesState, this.$chat, (GeneratedChatAvatar) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
