package com.ifriend.domain.logic.chat.buy;

import com.ifriend.domain.data.chat.BuyChatMessagesRepository;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BuyChatMessagesInteractor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/chat/buy/BuyChatMessagesInteractor;", "", "buyChatMessagesRepository", "Lcom/ifriend/domain/data/chat/BuyChatMessagesRepository;", "(Lcom/ifriend/domain/data/chat/BuyChatMessagesRepository;)V", "buyMessage", "", "messageIds", "Lcom/ifriend/domain/newChat/chat/models/MessageIds;", "(Lcom/ifriend/domain/newChat/chat/models/MessageIds;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageId", "", "senderId", "recipientId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyChatMessagesInteractor {
    private final BuyChatMessagesRepository buyChatMessagesRepository;

    @Inject
    public BuyChatMessagesInteractor(BuyChatMessagesRepository buyChatMessagesRepository) {
        Intrinsics.checkNotNullParameter(buyChatMessagesRepository, "buyChatMessagesRepository");
        this.buyChatMessagesRepository = buyChatMessagesRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        r6 = kotlin.Result.Companion;
        r5 = kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyMessage(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        BuyChatMessagesInteractor$buyMessage$1 buyChatMessagesInteractor$buyMessage$1;
        int i;
        if (continuation instanceof BuyChatMessagesInteractor$buyMessage$1) {
            buyChatMessagesInteractor$buyMessage$1 = (BuyChatMessagesInteractor$buyMessage$1) continuation;
            if ((buyChatMessagesInteractor$buyMessage$1.label & Integer.MIN_VALUE) != 0) {
                buyChatMessagesInteractor$buyMessage$1.label -= Integer.MIN_VALUE;
                Object obj = buyChatMessagesInteractor$buyMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = buyChatMessagesInteractor$buyMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    BuyChatMessagesInteractor buyChatMessagesInteractor = this;
                    BuyChatMessagesRepository buyChatMessagesRepository = this.buyChatMessagesRepository;
                    buyChatMessagesInteractor$buyMessage$1.label = 1;
                    obj = buyChatMessagesRepository.buyMessage(str, str2, str3, buyChatMessagesInteractor$buyMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Object m7271constructorimpl = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                return !Result.m7277isFailureimpl(m7271constructorimpl) ? Boxing.boxBoolean(false) : m7271constructorimpl;
            }
        }
        buyChatMessagesInteractor$buyMessage$1 = new BuyChatMessagesInteractor$buyMessage$1(this, continuation);
        Object obj2 = buyChatMessagesInteractor$buyMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buyChatMessagesInteractor$buyMessage$1.label;
        if (i != 0) {
        }
        Object m7271constructorimpl2 = Result.m7271constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
        if (!Result.m7277isFailureimpl(m7271constructorimpl2)) {
        }
    }

    public final Object buyMessage(MessageIds messageIds, Continuation<? super Boolean> continuation) {
        return buyMessage(messageIds.getMessageId(), messageIds.getSenderId(), messageIds.getRecipientId(), continuation);
    }
}
