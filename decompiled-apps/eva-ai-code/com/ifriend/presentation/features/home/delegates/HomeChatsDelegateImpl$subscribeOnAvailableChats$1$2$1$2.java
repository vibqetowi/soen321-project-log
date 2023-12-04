package com.ifriend.presentation.features.home.delegates;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.features.home.mappers.HomeUnavailableChatMapper;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: HomeChatsDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2", f = "HomeChatsDelegate.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2 extends SuspendLambda implements Function2<FlowCollector<? super HomeChatUi>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatInfo $chat;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeChatsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2(HomeChatsDelegateImpl homeChatsDelegateImpl, ChatInfo chatInfo, Continuation<? super HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2> continuation) {
        super(2, continuation);
        this.this$0 = homeChatsDelegateImpl;
        this.$chat = chatInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2 homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2 = new HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2(this.this$0, this.$chat, continuation);
        homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2.L$0 = obj;
        return homeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super HomeChatUi> flowCollector, Continuation<? super Unit> continuation) {
        return ((HomeChatsDelegateImpl$subscribeOnAvailableChats$1$2$1$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeUnavailableChatMapper homeUnavailableChatMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            homeUnavailableChatMapper = this.this$0.unavailableChatMapper;
            this.label = 1;
            if (((FlowCollector) this.L$0).emit(homeUnavailableChatMapper.map(this.$chat), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
