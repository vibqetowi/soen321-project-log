package com.ifriend.data.initialLoaders;

import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatGiftsLoader.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/initialLoaders/ChatGiftsLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "chatGiftsRepository", "Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatGiftsStoreToggle", "Lcom/ifriend/data/toggle/ChatGiftsStoreToggle;", "(Lcom/ifriend/domain/data/chatgifts/ChatGiftsRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/data/toggle/ChatGiftsStoreToggle;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsLoader implements InitialDataLoader {
    private final ChatGiftsRepository chatGiftsRepository;
    private final ChatGiftsStoreToggle chatGiftsStoreToggle;
    private final UserRepository userRepository;

    public ChatGiftsLoader(ChatGiftsRepository chatGiftsRepository, UserRepository userRepository, ChatGiftsStoreToggle chatGiftsStoreToggle) {
        Intrinsics.checkNotNullParameter(chatGiftsRepository, "chatGiftsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatGiftsStoreToggle, "chatGiftsStoreToggle");
        this.chatGiftsRepository = chatGiftsRepository;
        this.userRepository = userRepository;
        this.chatGiftsStoreToggle = chatGiftsStoreToggle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(2:22|(1:24))|12|13)|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        r0 = kotlin.Result.Companion;
        kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        ChatGiftsLoader$load$1 chatGiftsLoader$load$1;
        int i;
        if (continuation instanceof ChatGiftsLoader$load$1) {
            chatGiftsLoader$load$1 = (ChatGiftsLoader$load$1) continuation;
            if ((chatGiftsLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                chatGiftsLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = chatGiftsLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatGiftsLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    User currentUser = this.userRepository.getCurrentUser();
                    if (currentUser != null && Intrinsics.areEqual(this.chatGiftsStoreToggle.isEnabledValue(), Boxing.boxBoolean(true))) {
                        Result.Companion companion = Result.Companion;
                        ChatGiftsLoader chatGiftsLoader = this;
                        ChatGiftsRepository chatGiftsRepository = this.chatGiftsRepository;
                        String userIdValue = currentUser.getUserIdValue();
                        String value = currentUser.getAuth().getClientId().getValue();
                        chatGiftsLoader$load$1.label = 1;
                        if (chatGiftsRepository.refresh(value, userIdValue, chatGiftsLoader$load$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Boxing.boxBoolean(true);
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                Result.m7271constructorimpl(Unit.INSTANCE);
                return Boxing.boxBoolean(true);
            }
        }
        chatGiftsLoader$load$1 = new ChatGiftsLoader$load$1(this, continuation);
        Object obj2 = chatGiftsLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatGiftsLoader$load$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        return Boxing.boxBoolean(true);
    }
}
