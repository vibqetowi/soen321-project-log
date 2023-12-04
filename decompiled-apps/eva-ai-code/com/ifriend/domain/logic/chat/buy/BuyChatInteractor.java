package com.ifriend.domain.logic.chat.buy;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.ChatsRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.chat.info.ActivateNewChatUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatInfoPaymentOption;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BuyChatInteractor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/logic/chat/buy/BuyChatInteractor;", "", "activateNewChatUseCase", "Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "chatsRepository", "Lcom/ifriend/domain/data/chat/ChatsRepository;", "(Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/domain/data/chat/ChatsRepository;)V", "buyChat", "", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCanBuyChat", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyChatInteractor {
    private final ActivateNewChatUseCase activateNewChatUseCase;
    private final ChatsInfoRepository chatsInfoRepository;
    private final ChatsRepository chatsRepository;
    private final UserBalanceRepository userBalanceRepository;

    @Inject
    public BuyChatInteractor(ActivateNewChatUseCase activateNewChatUseCase, ChatsInfoRepository chatsInfoRepository, UserBalanceRepository userBalanceRepository, ChatsRepository chatsRepository) {
        Intrinsics.checkNotNullParameter(activateNewChatUseCase, "activateNewChatUseCase");
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(chatsRepository, "chatsRepository");
        this.activateNewChatUseCase = activateNewChatUseCase;
        this.chatsInfoRepository = chatsInfoRepository;
        this.userBalanceRepository = userBalanceRepository;
        this.chatsRepository = chatsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyChat(String str, Continuation<? super Unit> continuation) {
        BuyChatInteractor$buyChat$1 buyChatInteractor$buyChat$1;
        Object coroutine_suspended;
        int i;
        BuyChatInteractor buyChatInteractor;
        ActivateNewChatUseCase activateNewChatUseCase;
        if (continuation instanceof BuyChatInteractor$buyChat$1) {
            buyChatInteractor$buyChat$1 = (BuyChatInteractor$buyChat$1) continuation;
            if ((buyChatInteractor$buyChat$1.label & Integer.MIN_VALUE) != 0) {
                buyChatInteractor$buyChat$1.label -= Integer.MIN_VALUE;
                Object obj = buyChatInteractor$buyChat$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = buyChatInteractor$buyChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsRepository chatsRepository = this.chatsRepository;
                    String type = ChatInfoPaymentOption.PaymentOptionType.NEURONS.getType();
                    buyChatInteractor$buyChat$1.L$0 = this;
                    buyChatInteractor$buyChat$1.L$1 = str;
                    buyChatInteractor$buyChat$1.label = 1;
                    if (chatsRepository.buyChat(str, type, buyChatInteractor$buyChat$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    buyChatInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) buyChatInteractor$buyChat$1.L$1;
                    buyChatInteractor = (BuyChatInteractor) buyChatInteractor$buyChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                activateNewChatUseCase = buyChatInteractor.activateNewChatUseCase;
                buyChatInteractor$buyChat$1.L$0 = null;
                buyChatInteractor$buyChat$1.L$1 = null;
                buyChatInteractor$buyChat$1.label = 2;
                if (activateNewChatUseCase.execute(str, buyChatInteractor$buyChat$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        buyChatInteractor$buyChat$1 = new BuyChatInteractor$buyChat$1(this, continuation);
        Object obj2 = buyChatInteractor$buyChat$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buyChatInteractor$buyChat$1.label;
        if (i != 0) {
        }
        activateNewChatUseCase = buyChatInteractor.activateNewChatUseCase;
        buyChatInteractor$buyChat$1.L$0 = null;
        buyChatInteractor$buyChat$1.L$1 = null;
        buyChatInteractor$buyChat$1.label = 2;
        if (activateNewChatUseCase.execute(str, buyChatInteractor$buyChat$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isCanBuyChat(String str, Continuation<? super Boolean> continuation) {
        BuyChatInteractor$isCanBuyChat$1 buyChatInteractor$isCanBuyChat$1;
        Object coroutine_suspended;
        int i;
        BuyChatInteractor buyChatInteractor;
        Object chat;
        int i2;
        if (continuation instanceof BuyChatInteractor$isCanBuyChat$1) {
            buyChatInteractor$isCanBuyChat$1 = (BuyChatInteractor$isCanBuyChat$1) continuation;
            if ((buyChatInteractor$isCanBuyChat$1.label & Integer.MIN_VALUE) != 0) {
                buyChatInteractor$isCanBuyChat$1.label -= Integer.MIN_VALUE;
                Object obj = buyChatInteractor$isCanBuyChat$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = buyChatInteractor$isCanBuyChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserBalanceRepository userBalanceRepository = this.userBalanceRepository;
                    buyChatInteractor$isCanBuyChat$1.L$0 = this;
                    buyChatInteractor$isCanBuyChat$1.L$1 = str;
                    buyChatInteractor$isCanBuyChat$1.label = 1;
                    obj = userBalanceRepository.getBalance(buyChatInteractor$isCanBuyChat$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    buyChatInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        i2 = buyChatInteractor$isCanBuyChat$1.I$0;
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            return Boxing.boxBoolean(i2 >= ChatoptionsKt.getNeuronsPrice((ChatInfo) obj));
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) buyChatInteractor$isCanBuyChat$1.L$1;
                    buyChatInteractor = (BuyChatInteractor) buyChatInteractor$isCanBuyChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                int neurons = ((UserBalance) obj).getNeurons();
                ChatsInfoRepository chatsInfoRepository = buyChatInteractor.chatsInfoRepository;
                buyChatInteractor$isCanBuyChat$1.L$0 = null;
                buyChatInteractor$isCanBuyChat$1.L$1 = null;
                buyChatInteractor$isCanBuyChat$1.I$0 = neurons;
                buyChatInteractor$isCanBuyChat$1.label = 2;
                chat = chatsInfoRepository.getChat(str, buyChatInteractor$isCanBuyChat$1);
                if (chat != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = chat;
                i2 = neurons;
                if (obj == null) {
                }
            }
        }
        buyChatInteractor$isCanBuyChat$1 = new BuyChatInteractor$isCanBuyChat$1(this, continuation);
        Object obj2 = buyChatInteractor$isCanBuyChat$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buyChatInteractor$isCanBuyChat$1.label;
        if (i != 0) {
        }
        int neurons2 = ((UserBalance) obj2).getNeurons();
        ChatsInfoRepository chatsInfoRepository2 = buyChatInteractor.chatsInfoRepository;
        buyChatInteractor$isCanBuyChat$1.L$0 = null;
        buyChatInteractor$isCanBuyChat$1.L$1 = null;
        buyChatInteractor$isCanBuyChat$1.I$0 = neurons2;
        buyChatInteractor$isCanBuyChat$1.label = 2;
        chat = chatsInfoRepository2.getChat(str, buyChatInteractor$isCanBuyChat$1);
        if (chat != coroutine_suspended) {
        }
    }
}
