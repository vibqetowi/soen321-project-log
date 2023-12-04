package com.ifriend.domain.logic.chat.messages;

import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.exceptions.features.ChatMessageAccessFeatureException;
import com.ifriend.domain.exceptions.features.common.ChatSubscriptionAccessException;
import com.ifriend.domain.exceptions.features.common.FeatureException;
import com.ifriend.domain.exceptions.features.common.InsufficientBalanceException;
import com.ifriend.domain.exceptions.features.common.SubscriptionAccessException;
import com.ifriend.domain.logic.balance.UserBalance;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor;
import com.ifriend.domain.logic.chat.events.ChatPaidMessageUserEvent;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessReason;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAccessState;
import com.ifriend.domain.logic.chat.messages.models.ChatMessageAvailableState;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageAccessType;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageIds;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessageAccessInteractor.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0010H\u0002J!\u0010 \u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0002J\u0011\u0010'\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010,J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&J\u0019\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010/J1\u00100\u001a\u0002012\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u0002032\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J=\u00105\u001a\u0002012\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00102\u0006\u00106\u001a\u000207H\u0086@ø\u0001\u0000¢\u0006\u0002\u00108J5\u00109\u001a\u0002012\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J5\u0010:\u001a\u0002012\u0006\u0010%\u001a\u00020&2\u0006\u00102\u001a\u0002032\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/ifriend/domain/logic/chat/messages/ChatMessageAccessInteractor;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "appImageLoaderRepository", "Lcom/ifriend/domain/data/AppImageLoaderRepository;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "buyChatMessagesInteractor", "Lcom/ifriend/domain/logic/chat/buy/BuyChatMessagesInteractor;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/domain/data/AppImageLoaderRepository;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/logic/chat/buy/BuyChatMessagesInteractor;)V", "isPremiumUser", "", "()Z", "buyMessage", "", "messageIds", "Lcom/ifriend/domain/newChat/chat/models/MessageIds;", "chatId", "", "(Lcom/ifriend/domain/newChat/chat/models/MessageIds;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buyMessageIfNeed", "info", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", "ignoreBalanceCheck", "(Lcom/ifriend/domain/newChat/chat/models/MessageInfo;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAppSubscription", "ignoreSubscriptionCheck", "checkBalance", "cost", "", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkChatSubscription", "chatInfo", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "getBalance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessageAvailableState", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAvailableState;", "messageInfo", "(Lcom/ifriend/domain/newChat/chat/models/MessageInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPhoto", "imageUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAccess", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessState;", "chatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/logic/chat/models/ChatInfo;Lcom/ifriend/domain/newChat/chat/models/ChatMessage;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMessageAccess", "accessActionType", "Lcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;", "(Ljava/lang/String;Lcom/ifriend/domain/newChat/chat/models/ChatMessage;ZZLcom/ifriend/domain/logic/chat/messages/models/ChatMessageAccessReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPhotoAccess", "requestTextMessageAccess", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageAccessInteractor {
    private final AppImageLoaderRepository appImageLoaderRepository;
    private final BuyChatMessagesInteractor buyChatMessagesInteractor;
    private final ChatClientInteractor chatClientInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final UserBalanceRepository userBalanceRepository;
    private final UserRepository userRepository;

    /* compiled from: ChatMessageAccessInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatMessageAccessType.values().length];
            try {
                iArr[ChatMessageAccessType.FREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatMessageAccessType.PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatMessageAccessType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatMessageAccessType.SUBSCRIPTION_CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChatMessageAccessType.SUBSCRIPTION_THEN_PURCHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChatMessageAccessType.SUBSCRIPTION_CHAT_THEN_PURCHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChatMessageAccessType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public ChatMessageAccessInteractor(UserRepository userRepository, ChatsInfoInteractor chatsInfoInteractor, UserBalanceRepository userBalanceRepository, AppImageLoaderRepository appImageLoaderRepository, ChatClientInteractor chatClientInteractor, BuyChatMessagesInteractor buyChatMessagesInteractor) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(appImageLoaderRepository, "appImageLoaderRepository");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(buyChatMessagesInteractor, "buyChatMessagesInteractor");
        this.userRepository = userRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.userBalanceRepository = userBalanceRepository;
        this.appImageLoaderRepository = appImageLoaderRepository;
        this.chatClientInteractor = chatClientInteractor;
        this.buyChatMessagesInteractor = buyChatMessagesInteractor;
    }

    private final boolean isPremiumUser() {
        User currentUser = this.userRepository.getCurrentUser();
        return ommonKt.orFalse(currentUser != null ? Boolean.valueOf(UserKt.isPremium(currentUser)) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getBalance(Continuation<? super Integer> continuation) {
        ChatMessageAccessInteractor$getBalance$1 chatMessageAccessInteractor$getBalance$1;
        int i;
        if (continuation instanceof ChatMessageAccessInteractor$getBalance$1) {
            chatMessageAccessInteractor$getBalance$1 = (ChatMessageAccessInteractor$getBalance$1) continuation;
            if ((chatMessageAccessInteractor$getBalance$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$getBalance$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessInteractor$getBalance$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$getBalance$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UserBalanceRepository userBalanceRepository = this.userBalanceRepository;
                    chatMessageAccessInteractor$getBalance$1.label = 1;
                    obj = userBalanceRepository.getBalance(chatMessageAccessInteractor$getBalance$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxInt(((UserBalance) obj).getNeurons());
            }
        }
        chatMessageAccessInteractor$getBalance$1 = new ChatMessageAccessInteractor$getBalance$1(this, continuation);
        Object obj2 = chatMessageAccessInteractor$getBalance$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$getBalance$1.label;
        if (i != 0) {
        }
        return Boxing.boxInt(((UserBalance) obj2).getNeurons());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMessageAvailableState(MessageInfo messageInfo, Continuation<? super ChatMessageAvailableState> continuation) {
        ChatMessageAccessInteractor$getMessageAvailableState$1 chatMessageAccessInteractor$getMessageAvailableState$1;
        int i;
        ChatMessageAccessInteractor chatMessageAccessInteractor;
        if (continuation instanceof ChatMessageAccessInteractor$getMessageAvailableState$1) {
            chatMessageAccessInteractor$getMessageAvailableState$1 = (ChatMessageAccessInteractor$getMessageAvailableState$1) continuation;
            if ((chatMessageAccessInteractor$getMessageAvailableState$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$getMessageAvailableState$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessInteractor$getMessageAvailableState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$getMessageAvailableState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (messageInfo.isFromUser()) {
                        return ChatMessageAvailableState.Available.INSTANCE;
                    }
                    String senderId = messageInfo.getIds().getSenderId();
                    ChatsInfoInteractor chatsInfoInteractor = this.chatsInfoInteractor;
                    chatMessageAccessInteractor$getMessageAvailableState$1.L$0 = this;
                    chatMessageAccessInteractor$getMessageAvailableState$1.L$1 = messageInfo;
                    chatMessageAccessInteractor$getMessageAvailableState$1.label = 1;
                    obj = chatsInfoInteractor.getChatInfo(senderId, chatMessageAccessInteractor$getMessageAvailableState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageAccessInteractor = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    messageInfo = (MessageInfo) chatMessageAccessInteractor$getMessageAvailableState$1.L$1;
                    chatMessageAccessInteractor = (ChatMessageAccessInteractor) chatMessageAccessInteractor$getMessageAvailableState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ChatInfo chatInfo = (ChatInfo) obj;
                return chatInfo != null ? ChatMessageAvailableState.Available.INSTANCE : chatMessageAccessInteractor.getMessageAvailableState(messageInfo, chatInfo);
            }
        }
        chatMessageAccessInteractor$getMessageAvailableState$1 = new ChatMessageAccessInteractor$getMessageAvailableState$1(this, continuation);
        Object obj2 = chatMessageAccessInteractor$getMessageAvailableState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$getMessageAvailableState$1.label;
        if (i != 0) {
        }
        ChatInfo chatInfo2 = (ChatInfo) obj2;
        if (chatInfo2 != null) {
        }
    }

    public final ChatMessageAvailableState getMessageAvailableState(MessageInfo messageInfo, ChatInfo chatInfo) {
        Intrinsics.checkNotNullParameter(messageInfo, "messageInfo");
        Intrinsics.checkNotNullParameter(chatInfo, "chatInfo");
        if (messageInfo.isFromUser()) {
            return ChatMessageAvailableState.Available.INSTANCE;
        }
        ChatMessageAccessType messageAccess = messageInfo.getMessageAccess();
        MessageInfo.PaymentInfo paymentInfo = messageInfo.getPaymentInfo();
        boolean orFalse = ommonKt.orFalse(paymentInfo != null ? Boolean.valueOf(paymentInfo.isNeedPayForMessage()) : null);
        switch (WhenMappings.$EnumSwitchMapping$0[messageAccess.ordinal()]) {
            case 1:
                return ChatMessageAvailableState.Available.INSTANCE;
            case 2:
                if (orFalse) {
                    return ChatMessageAvailableState.Purchase.INSTANCE;
                }
                return ChatMessageAvailableState.Available.INSTANCE;
            case 3:
                if (isPremiumUser()) {
                    return ChatMessageAvailableState.Available.INSTANCE;
                }
                return new ChatMessageAvailableState.Subscription(false);
            case 4:
                if (chatInfo.isSubscriptionActivated()) {
                    return ChatMessageAvailableState.Available.INSTANCE;
                }
                return new ChatMessageAvailableState.Subscription(false);
            case 5:
                if (isPremiumUser()) {
                    if (orFalse) {
                        return ChatMessageAvailableState.Purchase.INSTANCE;
                    }
                    return ChatMessageAvailableState.Available.INSTANCE;
                }
                return new ChatMessageAvailableState.Subscription(orFalse);
            case 6:
                if (chatInfo.isSubscriptionActivated()) {
                    if (orFalse) {
                        return ChatMessageAvailableState.Purchase.INSTANCE;
                    }
                    return ChatMessageAvailableState.Available.INSTANCE;
                }
                return new ChatMessageAvailableState.Subscription(orFalse);
            case 7:
                boolean orFalse2 = ommonKt.orFalse(paymentInfo != null ? Boolean.valueOf(paymentInfo.isNeedPayForMessage()) : null);
                if (ommonKt.orFalse(paymentInfo != null ? paymentInfo.isPaid() : null)) {
                    return ChatMessageAvailableState.Available.INSTANCE;
                }
                if (orFalse2) {
                    return ChatMessageAvailableState.Purchase.INSTANCE;
                }
                if (ommonKt.orFalse(paymentInfo != null ? paymentInfo.isPaid() : null)) {
                    if (ommonKt.orZero(paymentInfo != null ? Integer.valueOf(paymentInfo.getCost()) : null) == 0) {
                        return new ChatMessageAvailableState.Subscription(false);
                    }
                }
                return ChatMessageAvailableState.Available.INSTANCE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestMessageAccess(String str, ChatMessage chatMessage, boolean z, boolean z2, ChatMessageAccessReason chatMessageAccessReason, Continuation<? super ChatMessageAccessState> continuation) throws FeatureException {
        ChatMessageAccessInteractor$requestMessageAccess$1 chatMessageAccessInteractor$requestMessageAccess$1;
        int i;
        ChatMessageAccessInteractor chatMessageAccessInteractor;
        Object obj;
        if (continuation instanceof ChatMessageAccessInteractor$requestMessageAccess$1) {
            chatMessageAccessInteractor$requestMessageAccess$1 = (ChatMessageAccessInteractor$requestMessageAccess$1) continuation;
            if ((chatMessageAccessInteractor$requestMessageAccess$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$requestMessageAccess$1.label -= Integer.MIN_VALUE;
                ChatMessageAccessInteractor$requestMessageAccess$1 chatMessageAccessInteractor$requestMessageAccess$12 = chatMessageAccessInteractor$requestMessageAccess$1;
                Object obj2 = chatMessageAccessInteractor$requestMessageAccess$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$requestMessageAccess$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    ChatsInfoInteractor chatsInfoInteractor = this.chatsInfoInteractor;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$0 = this;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$1 = chatMessage;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$2 = chatMessageAccessReason;
                    chatMessageAccessInteractor$requestMessageAccess$12.Z$0 = z;
                    chatMessageAccessInteractor$requestMessageAccess$12.Z$1 = z2;
                    chatMessageAccessInteractor$requestMessageAccess$12.label = 1;
                    obj2 = chatsInfoInteractor.getChatInfo(str, chatMessageAccessInteractor$requestMessageAccess$12);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageAccessInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj2);
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj2);
                    }
                } else {
                    z2 = chatMessageAccessInteractor$requestMessageAccess$12.Z$1;
                    z = chatMessageAccessInteractor$requestMessageAccess$12.Z$0;
                    chatMessageAccessReason = (ChatMessageAccessReason) chatMessageAccessInteractor$requestMessageAccess$12.L$2;
                    chatMessage = (ChatMessage) chatMessageAccessInteractor$requestMessageAccess$12.L$1;
                    chatMessageAccessInteractor = (ChatMessageAccessInteractor) chatMessageAccessInteractor$requestMessageAccess$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                }
                boolean z3 = z;
                ChatMessage chatMessage2 = chatMessage;
                obj = obj2;
                boolean z4 = z2;
                if (obj != null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                ChatInfo chatInfo = (ChatInfo) obj;
                if (Intrinsics.areEqual(chatMessageAccessReason, ChatMessageAccessReason.BuyPhoto.INSTANCE)) {
                    chatMessageAccessInteractor$requestMessageAccess$12.L$0 = null;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$1 = null;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$2 = null;
                    chatMessageAccessInteractor$requestMessageAccess$12.label = 2;
                    obj2 = chatMessageAccessInteractor.requestPhotoAccess(chatInfo, chatMessage2, z3, z4, chatMessageAccessInteractor$requestMessageAccess$12);
                    return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
                } else if (chatMessageAccessReason instanceof ChatMessageAccessReason.TextMessage) {
                    chatMessageAccessInteractor$requestMessageAccess$12.L$0 = null;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$1 = null;
                    chatMessageAccessInteractor$requestMessageAccess$12.L$2 = null;
                    chatMessageAccessInteractor$requestMessageAccess$12.label = 3;
                    obj2 = chatMessageAccessInteractor.requestTextMessageAccess(chatInfo, chatMessage2, z3, z4, chatMessageAccessInteractor$requestMessageAccess$12);
                    return obj2 == coroutine_suspended ? coroutine_suspended : obj2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        chatMessageAccessInteractor$requestMessageAccess$1 = new ChatMessageAccessInteractor$requestMessageAccess$1(this, continuation);
        ChatMessageAccessInteractor$requestMessageAccess$1 chatMessageAccessInteractor$requestMessageAccess$122 = chatMessageAccessInteractor$requestMessageAccess$1;
        Object obj22 = chatMessageAccessInteractor$requestMessageAccess$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$requestMessageAccess$122.label;
        if (i != 0) {
        }
        boolean z32 = z;
        ChatMessage chatMessage22 = chatMessage;
        obj = obj22;
        boolean z42 = z2;
        if (obj != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestTextMessageAccess(ChatInfo chatInfo, ChatMessage chatMessage, boolean z, boolean z2, Continuation<? super ChatMessageAccessState> continuation) {
        ChatMessageAccessInteractor$requestTextMessageAccess$1 chatMessageAccessInteractor$requestTextMessageAccess$1;
        int i;
        if (continuation instanceof ChatMessageAccessInteractor$requestTextMessageAccess$1) {
            chatMessageAccessInteractor$requestTextMessageAccess$1 = (ChatMessageAccessInteractor$requestTextMessageAccess$1) continuation;
            if ((chatMessageAccessInteractor$requestTextMessageAccess$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$requestTextMessageAccess$1.label -= Integer.MIN_VALUE;
                ChatMessageAccessInteractor$requestTextMessageAccess$1 chatMessageAccessInteractor$requestTextMessageAccess$12 = chatMessageAccessInteractor$requestTextMessageAccess$1;
                Object obj = chatMessageAccessInteractor$requestTextMessageAccess$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$requestTextMessageAccess$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatMessageAccessInteractor$requestTextMessageAccess$12.label = 1;
                    if (requestAccess(chatInfo, chatMessage, z, z2, chatMessageAccessInteractor$requestTextMessageAccess$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return ChatMessageAccessState.AccessGranted.INSTANCE;
            }
        }
        chatMessageAccessInteractor$requestTextMessageAccess$1 = new ChatMessageAccessInteractor$requestTextMessageAccess$1(this, continuation);
        ChatMessageAccessInteractor$requestTextMessageAccess$1 chatMessageAccessInteractor$requestTextMessageAccess$122 = chatMessageAccessInteractor$requestTextMessageAccess$1;
        Object obj2 = chatMessageAccessInteractor$requestTextMessageAccess$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$requestTextMessageAccess$122.label;
        if (i != 0) {
        }
        return ChatMessageAccessState.AccessGranted.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestPhotoAccess(ChatInfo chatInfo, ChatMessage chatMessage, boolean z, boolean z2, Continuation<? super ChatMessageAccessState> continuation) {
        ChatMessageAccessInteractor$requestPhotoAccess$1 chatMessageAccessInteractor$requestPhotoAccess$1;
        ChatMessageAccessInteractor chatMessageAccessInteractor;
        MessageContent messageContent;
        MessageContent messageContent2;
        MessageContent messageContent3;
        ChatMessageAccessInteractor chatMessageAccessInteractor2;
        MessageContent messageContent4;
        ChatMessageAccessState.PhotoAccessGranted photoAccessGranted;
        String imageUrl;
        ChatMessageAccessState.PhotoAccessGranted photoAccessGranted2;
        String image;
        if (continuation instanceof ChatMessageAccessInteractor$requestPhotoAccess$1) {
            chatMessageAccessInteractor$requestPhotoAccess$1 = (ChatMessageAccessInteractor$requestPhotoAccess$1) continuation;
            if ((chatMessageAccessInteractor$requestPhotoAccess$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$requestPhotoAccess$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessInteractor$requestPhotoAccess$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (chatMessageAccessInteractor$requestPhotoAccess$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        MessageInfo info = chatMessage.getInfo();
                        MessageContent content = chatMessage.getContent();
                        ChatMessageAccessType messageAccess = info.getMessageAccess();
                        if (content instanceof MessageContent.Gift) {
                            int i = WhenMappings.$EnumSwitchMapping$0[messageAccess.ordinal()];
                            if (i == 1 || i == 7) {
                                String imageUrl2 = ((MessageContent.Gift) content).getImageUrl();
                                chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = content;
                                chatMessageAccessInteractor$requestPhotoAccess$1.label = 1;
                                if (loadPhoto(imageUrl2, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                messageContent3 = content;
                                photoAccessGranted = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Gift) messageContent3).getImageUrl());
                                return photoAccessGranted;
                            }
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = this;
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$1 = content;
                            chatMessageAccessInteractor$requestPhotoAccess$1.label = 2;
                            if (requestAccess(chatInfo, chatMessage, z, z2, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            chatMessageAccessInteractor2 = this;
                            messageContent4 = content;
                            imageUrl = ((MessageContent.Gift) messageContent4).getImageUrl();
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = messageContent4;
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$1 = null;
                            chatMessageAccessInteractor$requestPhotoAccess$1.label = 3;
                            if (chatMessageAccessInteractor2.loadPhoto(imageUrl, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            photoAccessGranted = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Gift) messageContent4).getImageUrl());
                            return photoAccessGranted;
                        } else if (content instanceof MessageContent.Image) {
                            if (info.isFromUser()) {
                                String image2 = ((MessageContent.Image) content).getImage();
                                chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = content;
                                chatMessageAccessInteractor$requestPhotoAccess$1.label = 4;
                                if (loadPhoto(image2, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                messageContent2 = content;
                                photoAccessGranted2 = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Image) messageContent2).getImage());
                                return photoAccessGranted2;
                            }
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = this;
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$1 = content;
                            chatMessageAccessInteractor$requestPhotoAccess$1.label = 5;
                            if (requestAccess(chatInfo, chatMessage, z, z2, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            chatMessageAccessInteractor = this;
                            messageContent = content;
                            image = ((MessageContent.Image) messageContent).getImage();
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = messageContent;
                            chatMessageAccessInteractor$requestPhotoAccess$1.L$1 = null;
                            chatMessageAccessInteractor$requestPhotoAccess$1.label = 6;
                            if (chatMessageAccessInteractor.loadPhoto(image, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            photoAccessGranted2 = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Image) messageContent).getImage());
                            return photoAccessGranted2;
                        } else {
                            throw ChatMessageAccessFeatureException.UnknownMessageType.INSTANCE;
                        }
                    case 1:
                        messageContent3 = (MessageContent) chatMessageAccessInteractor$requestPhotoAccess$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        photoAccessGranted = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Gift) messageContent3).getImageUrl());
                        return photoAccessGranted;
                    case 2:
                        messageContent4 = (MessageContent) chatMessageAccessInteractor$requestPhotoAccess$1.L$1;
                        chatMessageAccessInteractor2 = (ChatMessageAccessInteractor) chatMessageAccessInteractor$requestPhotoAccess$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        imageUrl = ((MessageContent.Gift) messageContent4).getImageUrl();
                        chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = messageContent4;
                        chatMessageAccessInteractor$requestPhotoAccess$1.L$1 = null;
                        chatMessageAccessInteractor$requestPhotoAccess$1.label = 3;
                        if (chatMessageAccessInteractor2.loadPhoto(imageUrl, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                        }
                        photoAccessGranted = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Gift) messageContent4).getImageUrl());
                        return photoAccessGranted;
                    case 3:
                        messageContent4 = (MessageContent) chatMessageAccessInteractor$requestPhotoAccess$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        photoAccessGranted = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Gift) messageContent4).getImageUrl());
                        return photoAccessGranted;
                    case 4:
                        messageContent2 = (MessageContent) chatMessageAccessInteractor$requestPhotoAccess$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        photoAccessGranted2 = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Image) messageContent2).getImage());
                        return photoAccessGranted2;
                    case 5:
                        messageContent = (MessageContent) chatMessageAccessInteractor$requestPhotoAccess$1.L$1;
                        chatMessageAccessInteractor = (ChatMessageAccessInteractor) chatMessageAccessInteractor$requestPhotoAccess$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        image = ((MessageContent.Image) messageContent).getImage();
                        chatMessageAccessInteractor$requestPhotoAccess$1.L$0 = messageContent;
                        chatMessageAccessInteractor$requestPhotoAccess$1.L$1 = null;
                        chatMessageAccessInteractor$requestPhotoAccess$1.label = 6;
                        if (chatMessageAccessInteractor.loadPhoto(image, chatMessageAccessInteractor$requestPhotoAccess$1) == coroutine_suspended) {
                        }
                        photoAccessGranted2 = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Image) messageContent).getImage());
                        return photoAccessGranted2;
                    case 6:
                        messageContent = (MessageContent) chatMessageAccessInteractor$requestPhotoAccess$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        photoAccessGranted2 = new ChatMessageAccessState.PhotoAccessGranted(((MessageContent.Image) messageContent).getImage());
                        return photoAccessGranted2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        chatMessageAccessInteractor$requestPhotoAccess$1 = new ChatMessageAccessInteractor$requestPhotoAccess$1(this, continuation);
        Object obj2 = chatMessageAccessInteractor$requestPhotoAccess$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (chatMessageAccessInteractor$requestPhotoAccess$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestAccess(ChatInfo chatInfo, ChatMessage chatMessage, boolean z, boolean z2, Continuation<? super ChatMessageAccessState> continuation) {
        ChatMessageAccessInteractor$requestAccess$1 chatMessageAccessInteractor$requestAccess$1;
        int i;
        if (continuation instanceof ChatMessageAccessInteractor$requestAccess$1) {
            chatMessageAccessInteractor$requestAccess$1 = (ChatMessageAccessInteractor$requestAccess$1) continuation;
            if ((chatMessageAccessInteractor$requestAccess$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$requestAccess$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessInteractor$requestAccess$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$requestAccess$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    } else if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    } else if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    } else if (i == 4) {
                        ResultKt.throwOnFailure(obj);
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
                switch (WhenMappings.$EnumSwitchMapping$0[chatMessage.getInfo().getMessageAccess().ordinal()]) {
                    case 1:
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    case 2:
                        MessageInfo info = chatMessage.getInfo();
                        String chatId = chatInfo.getChatId();
                        chatMessageAccessInteractor$requestAccess$1.label = 1;
                        if (buyMessageIfNeed(info, z2, chatId, chatMessageAccessInteractor$requestAccess$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    case 3:
                        checkAppSubscription(z);
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    case 4:
                        checkChatSubscription(z, chatInfo);
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    case 5:
                        checkAppSubscription(z);
                        MessageInfo info2 = chatMessage.getInfo();
                        String chatId2 = chatInfo.getChatId();
                        chatMessageAccessInteractor$requestAccess$1.label = 2;
                        if (buyMessageIfNeed(info2, z2, chatId2, chatMessageAccessInteractor$requestAccess$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    case 6:
                        checkChatSubscription(z, chatInfo);
                        MessageInfo info3 = chatMessage.getInfo();
                        String chatId3 = chatInfo.getChatId();
                        chatMessageAccessInteractor$requestAccess$1.label = 3;
                        if (buyMessageIfNeed(info3, z2, chatId3, chatMessageAccessInteractor$requestAccess$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    case 7:
                        MessageInfo.PaymentInfo paymentInfo = chatMessage.getInfo().getPaymentInfo();
                        if (ommonKt.orFalse(paymentInfo != null ? Boxing.boxBoolean(paymentInfo.isNeedPayForMessage()) : null)) {
                            MessageInfo info4 = chatMessage.getInfo();
                            String chatId4 = chatInfo.getChatId();
                            chatMessageAccessInteractor$requestAccess$1.label = 4;
                            if (buyMessageIfNeed(info4, z2, chatId4, chatMessageAccessInteractor$requestAccess$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (ommonKt.orFalse(paymentInfo != null ? paymentInfo.isPaid() : null)) {
                                if (ommonKt.orZero(paymentInfo != null ? Boxing.boxInt(paymentInfo.getCost()) : null) == 0) {
                                    checkAppSubscription(z);
                                }
                            }
                        }
                        return ChatMessageAccessState.AccessGranted.INSTANCE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        chatMessageAccessInteractor$requestAccess$1 = new ChatMessageAccessInteractor$requestAccess$1(this, continuation);
        Object obj2 = chatMessageAccessInteractor$requestAccess$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$requestAccess$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyMessageIfNeed(MessageInfo messageInfo, boolean z, String str, Continuation<? super Unit> continuation) {
        ChatMessageAccessInteractor$buyMessageIfNeed$1 chatMessageAccessInteractor$buyMessageIfNeed$1;
        Object coroutine_suspended;
        int i;
        ChatMessageAccessInteractor chatMessageAccessInteractor;
        MessageIds ids;
        if (continuation instanceof ChatMessageAccessInteractor$buyMessageIfNeed$1) {
            chatMessageAccessInteractor$buyMessageIfNeed$1 = (ChatMessageAccessInteractor$buyMessageIfNeed$1) continuation;
            if ((chatMessageAccessInteractor$buyMessageIfNeed$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$buyMessageIfNeed$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessInteractor$buyMessageIfNeed$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$buyMessageIfNeed$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MessageInfo.PaymentInfo paymentInfo = messageInfo.getPaymentInfo();
                    if (!ommonKt.orFalse(paymentInfo != null ? Boxing.boxBoolean(paymentInfo.isNeedPayForMessage()) : null)) {
                        return Unit.INSTANCE;
                    }
                    MessageInfo.PaymentInfo paymentInfo2 = messageInfo.getPaymentInfo();
                    int orZero = ommonKt.orZero(paymentInfo2 != null ? Boxing.boxInt(paymentInfo2.getCost()) : null);
                    chatMessageAccessInteractor$buyMessageIfNeed$1.L$0 = this;
                    chatMessageAccessInteractor$buyMessageIfNeed$1.L$1 = messageInfo;
                    chatMessageAccessInteractor$buyMessageIfNeed$1.L$2 = str;
                    chatMessageAccessInteractor$buyMessageIfNeed$1.label = 1;
                    if (checkBalance(z, orZero, chatMessageAccessInteractor$buyMessageIfNeed$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageAccessInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatMessageAccessInteractor$buyMessageIfNeed$1.L$2;
                    messageInfo = (MessageInfo) chatMessageAccessInteractor$buyMessageIfNeed$1.L$1;
                    chatMessageAccessInteractor = (ChatMessageAccessInteractor) chatMessageAccessInteractor$buyMessageIfNeed$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ids = messageInfo.getIds();
                chatMessageAccessInteractor$buyMessageIfNeed$1.L$0 = null;
                chatMessageAccessInteractor$buyMessageIfNeed$1.L$1 = null;
                chatMessageAccessInteractor$buyMessageIfNeed$1.L$2 = null;
                chatMessageAccessInteractor$buyMessageIfNeed$1.label = 2;
                if (chatMessageAccessInteractor.buyMessage(ids, str, chatMessageAccessInteractor$buyMessageIfNeed$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatMessageAccessInteractor$buyMessageIfNeed$1 = new ChatMessageAccessInteractor$buyMessageIfNeed$1(this, continuation);
        Object obj2 = chatMessageAccessInteractor$buyMessageIfNeed$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$buyMessageIfNeed$1.label;
        if (i != 0) {
        }
        ids = messageInfo.getIds();
        chatMessageAccessInteractor$buyMessageIfNeed$1.L$0 = null;
        chatMessageAccessInteractor$buyMessageIfNeed$1.L$1 = null;
        chatMessageAccessInteractor$buyMessageIfNeed$1.L$2 = null;
        chatMessageAccessInteractor$buyMessageIfNeed$1.label = 2;
        if (chatMessageAccessInteractor.buyMessage(ids, str, chatMessageAccessInteractor$buyMessageIfNeed$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buyMessage(MessageIds messageIds, String str, Continuation<? super Unit> continuation) {
        ChatMessageAccessInteractor$buyMessage$1 chatMessageAccessInteractor$buyMessage$1;
        Object obj;
        int i;
        ChatMessageAccessInteractor chatMessageAccessInteractor;
        if (continuation instanceof ChatMessageAccessInteractor$buyMessage$1) {
            chatMessageAccessInteractor$buyMessage$1 = (ChatMessageAccessInteractor$buyMessage$1) continuation;
            if ((chatMessageAccessInteractor$buyMessage$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$buyMessage$1.label -= Integer.MIN_VALUE;
                obj = chatMessageAccessInteractor$buyMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatMessageAccessInteractor$buyMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BuyChatMessagesInteractor buyChatMessagesInteractor = this.buyChatMessagesInteractor;
                    String messageId = messageIds.getMessageId();
                    String senderId = messageIds.getSenderId();
                    String recipientId = messageIds.getRecipientId();
                    chatMessageAccessInteractor$buyMessage$1.L$0 = this;
                    chatMessageAccessInteractor$buyMessage$1.L$1 = messageIds;
                    chatMessageAccessInteractor$buyMessage$1.L$2 = str;
                    chatMessageAccessInteractor$buyMessage$1.label = 1;
                    obj = buyChatMessagesInteractor.buyMessage(messageId, senderId, recipientId, chatMessageAccessInteractor$buyMessage$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatMessageAccessInteractor = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatMessageAccessInteractor$buyMessage$1.L$2;
                    messageIds = (MessageIds) chatMessageAccessInteractor$buyMessage$1.L$1;
                    chatMessageAccessInteractor = (ChatMessageAccessInteractor) chatMessageAccessInteractor$buyMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw ChatMessageAccessFeatureException.BuyChatMessageFailure.INSTANCE;
                }
                chatMessageAccessInteractor$buyMessage$1.L$0 = null;
                chatMessageAccessInteractor$buyMessage$1.L$1 = null;
                chatMessageAccessInteractor$buyMessage$1.L$2 = null;
                chatMessageAccessInteractor$buyMessage$1.label = 2;
                if (chatMessageAccessInteractor.chatClientInteractor.handleEvent(str, new ChatPaidMessageUserEvent(messageIds.getMessageId()), chatMessageAccessInteractor$buyMessage$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatMessageAccessInteractor$buyMessage$1 = new ChatMessageAccessInteractor$buyMessage$1(this, continuation);
        obj = chatMessageAccessInteractor$buyMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatMessageAccessInteractor$buyMessage$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkBalance(boolean z, int i, Continuation<? super Unit> continuation) {
        ChatMessageAccessInteractor$checkBalance$1 chatMessageAccessInteractor$checkBalance$1;
        int i2;
        if (continuation instanceof ChatMessageAccessInteractor$checkBalance$1) {
            chatMessageAccessInteractor$checkBalance$1 = (ChatMessageAccessInteractor$checkBalance$1) continuation;
            if ((chatMessageAccessInteractor$checkBalance$1.label & Integer.MIN_VALUE) != 0) {
                chatMessageAccessInteractor$checkBalance$1.label -= Integer.MIN_VALUE;
                Object obj = chatMessageAccessInteractor$checkBalance$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = chatMessageAccessInteractor$checkBalance$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    chatMessageAccessInteractor$checkBalance$1.Z$0 = z;
                    chatMessageAccessInteractor$checkBalance$1.I$0 = i;
                    chatMessageAccessInteractor$checkBalance$1.label = 1;
                    obj = getBalance(chatMessageAccessInteractor$checkBalance$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i = chatMessageAccessInteractor$checkBalance$1.I$0;
                    z = chatMessageAccessInteractor$checkBalance$1.Z$0;
                    ResultKt.throwOnFailure(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (z && i > intValue) {
                    throw InsufficientBalanceException.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        chatMessageAccessInteractor$checkBalance$1 = new ChatMessageAccessInteractor$checkBalance$1(this, continuation);
        Object obj2 = chatMessageAccessInteractor$checkBalance$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = chatMessageAccessInteractor$checkBalance$1.label;
        if (i2 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        if (z) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadPhoto(String str, Continuation<? super Unit> continuation) {
        Object load = this.appImageLoaderRepository.load(str, continuation);
        return load == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? load : Unit.INSTANCE;
    }

    private final void checkAppSubscription(boolean z) {
        if (!z && !isPremiumUser()) {
            throw SubscriptionAccessException.INSTANCE;
        }
    }

    private final void checkChatSubscription(boolean z, ChatInfo chatInfo) {
        if (!z && !chatInfo.isSubscriptionActivated()) {
            throw ChatSubscriptionAccessException.INSTANCE;
        }
    }
}
