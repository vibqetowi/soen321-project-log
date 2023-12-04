package com.ifriend.domain.useCases.bot;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.ClientId;
import com.ifriend.domain.models.profile.user.User;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChangeBotNameUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifriend/domain/useCases/bot/ChangeBotNameUseCase;", "", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "(Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/chat/ChatsInfoRepository;)V", "execute", "", "name", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeBotNameUseCase {
    private final BotRepository botRepository;
    private final ChatsInfoRepository chatsInfoRepository;
    private final UserRepository userRepository;

    @Inject
    public ChangeBotNameUseCase(BotRepository botRepository, UserRepository userRepository, ChatsInfoRepository chatsInfoRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        this.botRepository = botRepository;
        this.userRepository = userRepository;
        this.chatsInfoRepository = chatsInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, Continuation<? super Unit> continuation) {
        ChangeBotNameUseCase$execute$1 changeBotNameUseCase$execute$1;
        int i;
        ChangeBotNameUseCase changeBotNameUseCase;
        String value;
        AuthData auth;
        ClientId clientId;
        if (continuation instanceof ChangeBotNameUseCase$execute$1) {
            changeBotNameUseCase$execute$1 = (ChangeBotNameUseCase$execute$1) continuation;
            if ((changeBotNameUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                changeBotNameUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = changeBotNameUseCase$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changeBotNameUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BotRepository botRepository = this.botRepository;
                    changeBotNameUseCase$execute$1.L$0 = this;
                    changeBotNameUseCase$execute$1.L$1 = str;
                    changeBotNameUseCase$execute$1.label = 1;
                    if (botRepository.setName(str, changeBotNameUseCase$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    changeBotNameUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) changeBotNameUseCase$execute$1.L$1;
                    changeBotNameUseCase = (ChangeBotNameUseCase) changeBotNameUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                User currentUser = changeBotNameUseCase.userRepository.getCurrentUser();
                value = (currentUser != null || (auth = currentUser.getAuth()) == null || (clientId = auth.getClientId()) == null) ? null : clientId.getValue();
                if (value == null) {
                    ChatsInfoRepository chatsInfoRepository = changeBotNameUseCase.chatsInfoRepository;
                    changeBotNameUseCase$execute$1.L$0 = null;
                    changeBotNameUseCase$execute$1.L$1 = null;
                    changeBotNameUseCase$execute$1.label = 2;
                    if (chatsInfoRepository.updateChatName(value, str, changeBotNameUseCase$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        changeBotNameUseCase$execute$1 = new ChangeBotNameUseCase$execute$1(this, continuation);
        Object obj2 = changeBotNameUseCase$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changeBotNameUseCase$execute$1.label;
        if (i != 0) {
        }
        User currentUser2 = changeBotNameUseCase.userRepository.getCurrentUser();
        if (currentUser2 != null) {
        }
        if (value == null) {
        }
    }
}
