package com.ifriend.domain.logic.chat.gifts;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendMessageEvent;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatGiftsUseCase.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatGiftsRepository", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;)V", "userId", "", "getUserId", "()Ljava/lang/String;", "refresh", "", "botId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeRefresh", "chatId", "sendGift", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;", "giftId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/ifriend/domain/logic/chat/gifts/ChatGift;", "SendGiftResult", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsUseCase {
    private final ChatClientInteractor chatClientInteractor;
    private final ChatGiftsRepository chatGiftsRepository;
    private final UserBalanceRepository userBalanceRepository;
    private final UserRepository userRepository;

    @Inject
    public ChatGiftsUseCase(UserRepository userRepository, ChatGiftsRepository chatGiftsRepository, UserBalanceRepository userBalanceRepository, ChatClientInteractor chatClientInteractor) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatGiftsRepository, "chatGiftsRepository");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        this.userRepository = userRepository;
        this.chatGiftsRepository = chatGiftsRepository;
        this.userBalanceRepository = userBalanceRepository;
        this.chatClientInteractor = chatClientInteractor;
    }

    /* compiled from: ChatGiftsUseCase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;", "", "NotEnoughNeurons", "NotInCache", "Successful", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult$NotEnoughNeurons;", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult$NotInCache;", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult$Successful;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface SendGiftResult {

        /* compiled from: ChatGiftsUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult$Successful;", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Successful implements SendGiftResult {
            public static final Successful INSTANCE = new Successful();

            private Successful() {
            }
        }

        /* compiled from: ChatGiftsUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult$NotEnoughNeurons;", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NotEnoughNeurons implements SendGiftResult {
            public static final NotEnoughNeurons INSTANCE = new NotEnoughNeurons();

            private NotEnoughNeurons() {
            }
        }

        /* compiled from: ChatGiftsUseCase.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult$NotInCache;", "Lcom/ifriend/domain/logic/chat/gifts/ChatGiftsUseCase$SendGiftResult;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class NotInCache implements SendGiftResult {
            public static final NotInCache INSTANCE = new NotInCache();

            private NotInCache() {
            }
        }
    }

    private final String getUserId() {
        User currentUser = this.userRepository.getCurrentUser();
        String userIdValue = currentUser != null ? currentUser.getUserIdValue() : null;
        return userIdValue == null ? "" : userIdValue;
    }

    public final Flow<List<ChatGift>> subscribe(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        return this.chatGiftsRepository.subscribe(botId, getUserId());
    }

    public final Object refresh(String str, Continuation<? super Unit> continuation) {
        Object refresh = this.chatGiftsRepository.refresh(str, getUserId(), continuation);
        return refresh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? refresh : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendGift(String str, String str2, Continuation<? super SendGiftResult> continuation) {
        ChatGiftsUseCase$sendGift$1 chatGiftsUseCase$sendGift$1;
        int i;
        ChatGiftsUseCase chatGiftsUseCase;
        ChatGift chatGift;
        ChatGiftsUseCase chatGiftsUseCase2;
        String str3;
        ChatGift chatGift2;
        String str4;
        int i2;
        String str5;
        String str6;
        ChatGiftsUseCase chatGiftsUseCase3;
        if (continuation instanceof ChatGiftsUseCase$sendGift$1) {
            chatGiftsUseCase$sendGift$1 = (ChatGiftsUseCase$sendGift$1) continuation;
            if ((chatGiftsUseCase$sendGift$1.label & Integer.MIN_VALUE) != 0) {
                chatGiftsUseCase$sendGift$1.label -= Integer.MIN_VALUE;
                Object obj = chatGiftsUseCase$sendGift$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatGiftsUseCase$sendGift$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatGiftsRepository chatGiftsRepository = this.chatGiftsRepository;
                    String userId = getUserId();
                    chatGiftsUseCase$sendGift$1.L$0 = this;
                    chatGiftsUseCase$sendGift$1.L$1 = str;
                    chatGiftsUseCase$sendGift$1.L$2 = str2;
                    chatGiftsUseCase$sendGift$1.label = 1;
                    obj = chatGiftsRepository.getGift(str, userId, str2, chatGiftsUseCase$sendGift$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatGiftsUseCase = this;
                } else if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                ResultKt.throwOnFailure(obj);
                                return SendGiftResult.Successful.INSTANCE;
                            } else if (i == 5) {
                                ResultKt.throwOnFailure(obj);
                                return SendGiftResult.NotInCache.INSTANCE;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        i2 = chatGiftsUseCase$sendGift$1.I$0;
                        str5 = (String) chatGiftsUseCase$sendGift$1.L$2;
                        str6 = (String) chatGiftsUseCase$sendGift$1.L$1;
                        chatGiftsUseCase3 = (ChatGiftsUseCase) chatGiftsUseCase$sendGift$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (i2 != 0) {
                            ChatGiftsRepository chatGiftsRepository2 = chatGiftsUseCase3.chatGiftsRepository;
                            String userId2 = chatGiftsUseCase3.getUserId();
                            chatGiftsUseCase$sendGift$1.L$0 = null;
                            chatGiftsUseCase$sendGift$1.L$1 = null;
                            chatGiftsUseCase$sendGift$1.L$2 = null;
                            chatGiftsUseCase$sendGift$1.label = 4;
                            if (chatGiftsRepository2.removeGiftFromLocal(str6, userId2, str5, chatGiftsUseCase$sendGift$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return SendGiftResult.Successful.INSTANCE;
                    }
                    i2 = chatGiftsUseCase$sendGift$1.I$0;
                    chatGift2 = (ChatGift) chatGiftsUseCase$sendGift$1.L$3;
                    str3 = (String) chatGiftsUseCase$sendGift$1.L$2;
                    str4 = (String) chatGiftsUseCase$sendGift$1.L$1;
                    chatGiftsUseCase2 = (ChatGiftsUseCase) chatGiftsUseCase$sendGift$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    int neurons = ((UserBalance) obj).getNeurons();
                    if (i2 != 0 && chatGift2.getPrice() > neurons) {
                        return SendGiftResult.NotEnoughNeurons.INSTANCE;
                    }
                    chatGiftsUseCase$sendGift$1.L$0 = chatGiftsUseCase2;
                    chatGiftsUseCase$sendGift$1.L$1 = str4;
                    chatGiftsUseCase$sendGift$1.L$2 = str3;
                    chatGiftsUseCase$sendGift$1.L$3 = null;
                    chatGiftsUseCase$sendGift$1.I$0 = i2;
                    chatGiftsUseCase$sendGift$1.label = 3;
                    if (chatGiftsUseCase2.chatClientInteractor.handleEvent(str4, new SendMessageEvent(new MessageToSend.Gift(str3, chatGift2.getImageUrl(), str4, chatGiftsUseCase2.getUserId())), chatGiftsUseCase$sendGift$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str5 = str3;
                    str6 = str4;
                    chatGiftsUseCase3 = chatGiftsUseCase2;
                    if (i2 != 0) {
                    }
                    return SendGiftResult.Successful.INSTANCE;
                } else {
                    str2 = (String) chatGiftsUseCase$sendGift$1.L$2;
                    str = (String) chatGiftsUseCase$sendGift$1.L$1;
                    chatGiftsUseCase = (ChatGiftsUseCase) chatGiftsUseCase$sendGift$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatGift = (ChatGift) obj;
                if (chatGift == null) {
                    int i3 = chatGift.getPrice() != 0 ? 0 : 1;
                    UserBalanceRepository userBalanceRepository = chatGiftsUseCase.userBalanceRepository;
                    chatGiftsUseCase$sendGift$1.L$0 = chatGiftsUseCase;
                    chatGiftsUseCase$sendGift$1.L$1 = str;
                    chatGiftsUseCase$sendGift$1.L$2 = str2;
                    chatGiftsUseCase$sendGift$1.L$3 = chatGift;
                    chatGiftsUseCase$sendGift$1.I$0 = i3;
                    chatGiftsUseCase$sendGift$1.label = 2;
                    Object balance = userBalanceRepository.getBalance(chatGiftsUseCase$sendGift$1);
                    if (balance == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatGiftsUseCase2 = chatGiftsUseCase;
                    str3 = str2;
                    chatGift2 = chatGift;
                    obj = balance;
                    str4 = str;
                    i2 = i3;
                    int neurons2 = ((UserBalance) obj).getNeurons();
                    if (i2 != 0) {
                    }
                    chatGiftsUseCase$sendGift$1.L$0 = chatGiftsUseCase2;
                    chatGiftsUseCase$sendGift$1.L$1 = str4;
                    chatGiftsUseCase$sendGift$1.L$2 = str3;
                    chatGiftsUseCase$sendGift$1.L$3 = null;
                    chatGiftsUseCase$sendGift$1.I$0 = i2;
                    chatGiftsUseCase$sendGift$1.label = 3;
                    if (chatGiftsUseCase2.chatClientInteractor.handleEvent(str4, new SendMessageEvent(new MessageToSend.Gift(str3, chatGift2.getImageUrl(), str4, chatGiftsUseCase2.getUserId())), chatGiftsUseCase$sendGift$1) != coroutine_suspended) {
                    }
                } else {
                    chatGiftsUseCase$sendGift$1.L$0 = null;
                    chatGiftsUseCase$sendGift$1.L$1 = null;
                    chatGiftsUseCase$sendGift$1.L$2 = null;
                    chatGiftsUseCase$sendGift$1.label = 5;
                    if (chatGiftsUseCase.safeRefresh(str, chatGiftsUseCase$sendGift$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return SendGiftResult.NotInCache.INSTANCE;
                }
            }
        }
        chatGiftsUseCase$sendGift$1 = new ChatGiftsUseCase$sendGift$1(this, continuation);
        Object obj2 = chatGiftsUseCase$sendGift$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatGiftsUseCase$sendGift$1.label;
        if (i != 0) {
        }
        chatGift = (ChatGift) obj2;
        if (chatGift == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        r6 = kotlin.Result.Companion;
        kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object safeRefresh(String str, Continuation<? super Unit> continuation) {
        ChatGiftsUseCase$safeRefresh$1 chatGiftsUseCase$safeRefresh$1;
        int i;
        if (continuation instanceof ChatGiftsUseCase$safeRefresh$1) {
            chatGiftsUseCase$safeRefresh$1 = (ChatGiftsUseCase$safeRefresh$1) continuation;
            if ((chatGiftsUseCase$safeRefresh$1.label & Integer.MIN_VALUE) != 0) {
                chatGiftsUseCase$safeRefresh$1.label -= Integer.MIN_VALUE;
                Object obj = chatGiftsUseCase$safeRefresh$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatGiftsUseCase$safeRefresh$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    ChatGiftsUseCase chatGiftsUseCase = this;
                    ChatGiftsRepository chatGiftsRepository = this.chatGiftsRepository;
                    String userId = getUserId();
                    chatGiftsUseCase$safeRefresh$1.label = 1;
                    if (chatGiftsRepository.refresh(str, userId, chatGiftsUseCase$safeRefresh$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Result.m7271constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        chatGiftsUseCase$safeRefresh$1 = new ChatGiftsUseCase$safeRefresh$1(this, continuation);
        Object obj2 = chatGiftsUseCase$safeRefresh$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatGiftsUseCase$safeRefresh$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
