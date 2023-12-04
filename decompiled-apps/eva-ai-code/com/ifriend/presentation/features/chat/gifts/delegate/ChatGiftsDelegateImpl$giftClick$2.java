package com.ifriend.presentation.features.chat.gifts.delegate;

import com.ifriend.domain.logic.chat.gifts.ChatGiftsUseCase;
import com.ifriend.presentation.features.chat.gifts.analytics.ChatGiftAnalytics;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatGiftsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.gifts.delegate.ChatGiftsDelegateImpl$giftClick$2", f = "ChatGiftsDelegate.kt", i = {}, l = {133, 137}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatGiftsDelegateImpl$giftClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ ChatGiftUi $gift;
    int label;
    final /* synthetic */ ChatGiftsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsDelegateImpl$giftClick$2(ChatGiftsDelegateImpl chatGiftsDelegateImpl, String str, ChatGiftUi chatGiftUi, Continuation<? super ChatGiftsDelegateImpl$giftClick$2> continuation) {
        super(2, continuation);
        this.this$0 = chatGiftsDelegateImpl;
        this.$chatId = str;
        this.$gift = chatGiftUi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatGiftsDelegateImpl$giftClick$2(this.this$0, this.$chatId, this.$gift, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatGiftsDelegateImpl$giftClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatGiftAnalytics chatGiftAnalytics;
        ChatGiftsUseCase chatGiftsUseCase;
        Object handleSendGiftResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatGiftAnalytics = this.this$0.chatGiftAnalytics;
            chatGiftAnalytics.trackGiftButtonClick();
            chatGiftsUseCase = this.this$0.chatGiftsUseCase;
            this.label = 1;
            obj = chatGiftsUseCase.sendGift(this.$chatId, this.$gift.getId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        ChatGiftsDelegateImpl chatGiftsDelegateImpl = this.this$0;
        this.label = 2;
        handleSendGiftResult = chatGiftsDelegateImpl.handleSendGiftResult((ChatGiftsUseCase.SendGiftResult) obj, this);
        if (handleSendGiftResult == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
