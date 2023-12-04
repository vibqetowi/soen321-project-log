package com.ifriend.domain.logic.chat.info;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ActivateNewChatUseCase.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/logic/chat/info/ActivateNewChatUseCase;", "", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "refreshConfigurationUseCase", "Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;", "(Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;)V", "execute", "", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivateNewChatUseCase {
    private final ChatsInfoRepository chatsInfoRepository;
    private final ChatsRefreshConfigurationUseCase refreshConfigurationUseCase;

    @Inject
    public ActivateNewChatUseCase(ChatsInfoRepository chatsInfoRepository, ChatsRefreshConfigurationUseCase refreshConfigurationUseCase) {
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(refreshConfigurationUseCase, "refreshConfigurationUseCase");
        this.chatsInfoRepository = chatsInfoRepository;
        this.refreshConfigurationUseCase = refreshConfigurationUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, Continuation<? super Unit> continuation) {
        ActivateNewChatUseCase$execute$1 activateNewChatUseCase$execute$1;
        int i;
        Object mo6875invokegIAlus;
        ActivateNewChatUseCase activateNewChatUseCase;
        if (continuation instanceof ActivateNewChatUseCase$execute$1) {
            activateNewChatUseCase$execute$1 = (ActivateNewChatUseCase$execute$1) continuation;
            if ((activateNewChatUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                activateNewChatUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = activateNewChatUseCase$execute$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activateNewChatUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase = this.refreshConfigurationUseCase;
                    Unit unit = Unit.INSTANCE;
                    activateNewChatUseCase$execute$1.L$0 = this;
                    activateNewChatUseCase$execute$1.L$1 = str;
                    activateNewChatUseCase$execute$1.label = 1;
                    mo6875invokegIAlus = chatsRefreshConfigurationUseCase.mo6875invokegIAlus(unit, (Continuation<? super Result<? extends Unit>>) activateNewChatUseCase$execute$1);
                    if (mo6875invokegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    activateNewChatUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        Object obj2 = activateNewChatUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) activateNewChatUseCase$execute$1.L$1;
                    activateNewChatUseCase = (ActivateNewChatUseCase) activateNewChatUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mo6875invokegIAlus = ((Result) obj).m7280unboximpl();
                }
                if (Result.m7274exceptionOrNullimpl(mo6875invokegIAlus) != null) {
                    ChatsInfoRepository chatsInfoRepository = activateNewChatUseCase.chatsInfoRepository;
                    activateNewChatUseCase$execute$1.L$0 = mo6875invokegIAlus;
                    activateNewChatUseCase$execute$1.L$1 = null;
                    activateNewChatUseCase$execute$1.label = 2;
                    if (chatsInfoRepository.activateNewChat(str, activateNewChatUseCase$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        activateNewChatUseCase$execute$1 = new ActivateNewChatUseCase$execute$1(this, continuation);
        Object obj3 = activateNewChatUseCase$execute$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activateNewChatUseCase$execute$1.label;
        if (i != 0) {
        }
        if (Result.m7274exceptionOrNullimpl(mo6875invokegIAlus) != null) {
        }
        return Unit.INSTANCE;
    }
}
