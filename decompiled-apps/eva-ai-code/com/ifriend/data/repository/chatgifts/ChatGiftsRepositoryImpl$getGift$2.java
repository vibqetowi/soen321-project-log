package com.ifriend.data.repository.chatgifts;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl;
import com.ifriend.domain.logic.chat.gifts.ChatGift;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatGiftsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chatgifts.ChatGiftsRepositoryImpl$getGift$2", f = "ChatGiftsRepositoryImpl.kt", i = {}, l = {73, 79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatGiftsRepositoryImpl$getGift$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChatGift>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $giftId;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ ChatGiftsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsRepositoryImpl$getGift$2(ChatGiftsRepositoryImpl chatGiftsRepositoryImpl, String str, String str2, String str3, Continuation<? super ChatGiftsRepositoryImpl$getGift$2> continuation) {
        super(2, continuation);
        this.this$0 = chatGiftsRepositoryImpl;
        this.$userId = str;
        this.$chatId = str2;
        this.$giftId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatGiftsRepositoryImpl$getGift$2(this.this$0, this.$userId, this.$chatId, this.$giftId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChatGift> continuation) {
        return ((ChatGiftsRepositoryImpl$getGift$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            this.label = 1;
            obj = cachedSource.get(new ChatGiftsRepositoryImpl.ChatGiftsKey(this.$userId, this.$chatId), InMemoryCachedSource.Strategy.CACHE_ONLY, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                Object obj2 = null;
                if (list == null) {
                    String str = this.$giftId;
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((ChatGift) next).getGiftId(), str)) {
                            obj2 = next;
                            break;
                        }
                    }
                    return (ChatGift) obj2;
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = FlowKt.firstOrNull((Flow) obj, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = (List) obj;
        Object obj22 = null;
        if (list == null) {
        }
    }
}
