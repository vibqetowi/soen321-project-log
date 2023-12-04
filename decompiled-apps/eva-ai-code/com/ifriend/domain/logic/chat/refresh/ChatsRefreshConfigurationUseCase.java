package com.ifriend.domain.logic.chat.refresh;

import com.facebook.internal.NativeProtocol;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.data.chat.subscription.ChatSubscriptionRepository;
import com.ifriend.domain.data.memorycached.ChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.common.RunCatchingUseCase;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.ClientId;
import com.ifriend.domain.models.profile.user.User;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatsRefreshConfigurationUseCase.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/chat/refresh/ChatsRefreshConfigurationUseCase;", "Lcom/ifriend/domain/logic/common/RunCatchingUseCase;", "", "chatConfigsMemoryCachedSource", "Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;", "chatsInfoRepository", "Lcom/ifriend/domain/data/chat/ChatsInfoRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatSubscriptionRepository", "Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;", "(Lcom/ifriend/domain/data/memorycached/ChatConfigsMemoryCachedSource;Lcom/ifriend/domain/data/chat/ChatsInfoRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/chat/subscription/ChatSubscriptionRepository;)V", "execute", NativeProtocol.WEB_DIALOG_PARAMS, "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsRefreshConfigurationUseCase implements RunCatchingUseCase<Unit, Unit> {
    private final ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource;
    private final ChatSubscriptionRepository chatSubscriptionRepository;
    private final ChatsInfoRepository chatsInfoRepository;
    private final UserRepository userRepository;

    @Inject
    public ChatsRefreshConfigurationUseCase(ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource, ChatsInfoRepository chatsInfoRepository, UserRepository userRepository, ChatSubscriptionRepository chatSubscriptionRepository) {
        Intrinsics.checkNotNullParameter(chatConfigsMemoryCachedSource, "chatConfigsMemoryCachedSource");
        Intrinsics.checkNotNullParameter(chatsInfoRepository, "chatsInfoRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatSubscriptionRepository, "chatSubscriptionRepository");
        this.chatConfigsMemoryCachedSource = chatConfigsMemoryCachedSource;
        this.chatsInfoRepository = chatsInfoRepository;
        this.userRepository = userRepository;
        this.chatSubscriptionRepository = chatSubscriptionRepository;
    }

    @Override // com.ifriend.domain.logic.common.RunCatchingUseCase
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    public /* bridge */ /* synthetic */ Object mo6875invokegIAlus(Unit unit, Continuation<? super Result<? extends Unit>> continuation) {
        return m6876invokegIAlus(unit, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke-gIAlu-s  reason: avoid collision after fix types in other method and not valid java name */
    public Object m6876invokegIAlus(Unit unit, Continuation<? super Result<Unit>> continuation) {
        return RunCatchingUseCase.DefaultImpls.m6879invokegIAlus(this, unit, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2 A[RETURN] */
    @Override // com.ifriend.domain.logic.common.RunCatchingUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(Unit unit, Continuation<? super Unit> continuation) {
        ChatsRefreshConfigurationUseCase$execute$1 chatsRefreshConfigurationUseCase$execute$1;
        Object coroutine_suspended;
        int i;
        ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase;
        ChatSubscriptionRepository chatSubscriptionRepository;
        String value;
        ChatsInfoRepository chatsInfoRepository;
        AuthData auth;
        ClientId clientId;
        if (continuation instanceof ChatsRefreshConfigurationUseCase$execute$1) {
            chatsRefreshConfigurationUseCase$execute$1 = (ChatsRefreshConfigurationUseCase$execute$1) continuation;
            if ((chatsRefreshConfigurationUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                chatsRefreshConfigurationUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj = chatsRefreshConfigurationUseCase$execute$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatsRefreshConfigurationUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.userRepository.getCurrentUser() == null) {
                        return Unit.INSTANCE;
                    }
                    try {
                        Result.Companion companion = Result.Companion;
                        ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase2 = this;
                        ChatConfigsMemoryCachedSource chatConfigsMemoryCachedSource = this.chatConfigsMemoryCachedSource;
                        chatsRefreshConfigurationUseCase$execute$1.L$0 = this;
                        chatsRefreshConfigurationUseCase$execute$1.label = 1;
                        if (chatConfigsMemoryCachedSource.refresh(chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatsRefreshConfigurationUseCase = this;
                    } catch (Throwable th) {
                        th = th;
                        chatsRefreshConfigurationUseCase = this;
                        Result.Companion companion2 = Result.Companion;
                        Result.m7271constructorimpl(ResultKt.createFailure(th));
                        chatSubscriptionRepository = chatsRefreshConfigurationUseCase.chatSubscriptionRepository;
                        chatsRefreshConfigurationUseCase$execute$1.L$0 = chatsRefreshConfigurationUseCase;
                        chatsRefreshConfigurationUseCase$execute$1.label = 2;
                        if (chatSubscriptionRepository.clear(chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                        }
                        User currentUser = chatsRefreshConfigurationUseCase.userRepository.getCurrentUser();
                        if (currentUser != null) {
                        }
                        if (value == null) {
                        }
                        chatsInfoRepository = chatsRefreshConfigurationUseCase.chatsInfoRepository;
                        chatsRefreshConfigurationUseCase$execute$1.L$0 = null;
                        chatsRefreshConfigurationUseCase$execute$1.label = 3;
                        if (chatsInfoRepository.refreshChats(value, chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    chatsRefreshConfigurationUseCase = (ChatsRefreshConfigurationUseCase) chatsRefreshConfigurationUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    User currentUser2 = chatsRefreshConfigurationUseCase.userRepository.getCurrentUser();
                    value = (currentUser2 != null || (auth = currentUser2.getAuth()) == null || (clientId = auth.getClientId()) == null) ? null : clientId.getValue();
                    if (value == null) {
                        value = "";
                    }
                    chatsInfoRepository = chatsRefreshConfigurationUseCase.chatsInfoRepository;
                    chatsRefreshConfigurationUseCase$execute$1.L$0 = null;
                    chatsRefreshConfigurationUseCase$execute$1.label = 3;
                    if (chatsInfoRepository.refreshChats(value, chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                } else {
                    chatsRefreshConfigurationUseCase = (ChatsRefreshConfigurationUseCase) chatsRefreshConfigurationUseCase$execute$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.Companion;
                        Result.m7271constructorimpl(ResultKt.createFailure(th));
                        chatSubscriptionRepository = chatsRefreshConfigurationUseCase.chatSubscriptionRepository;
                        chatsRefreshConfigurationUseCase$execute$1.L$0 = chatsRefreshConfigurationUseCase;
                        chatsRefreshConfigurationUseCase$execute$1.label = 2;
                        if (chatSubscriptionRepository.clear(chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                        }
                        User currentUser22 = chatsRefreshConfigurationUseCase.userRepository.getCurrentUser();
                        if (currentUser22 != null) {
                        }
                        if (value == null) {
                        }
                        chatsInfoRepository = chatsRefreshConfigurationUseCase.chatsInfoRepository;
                        chatsRefreshConfigurationUseCase$execute$1.L$0 = null;
                        chatsRefreshConfigurationUseCase$execute$1.label = 3;
                        if (chatsInfoRepository.refreshChats(value, chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                Result.m7271constructorimpl(Unit.INSTANCE);
                chatSubscriptionRepository = chatsRefreshConfigurationUseCase.chatSubscriptionRepository;
                chatsRefreshConfigurationUseCase$execute$1.L$0 = chatsRefreshConfigurationUseCase;
                chatsRefreshConfigurationUseCase$execute$1.label = 2;
                if (chatSubscriptionRepository.clear(chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                User currentUser222 = chatsRefreshConfigurationUseCase.userRepository.getCurrentUser();
                if (currentUser222 != null) {
                }
                if (value == null) {
                }
                chatsInfoRepository = chatsRefreshConfigurationUseCase.chatsInfoRepository;
                chatsRefreshConfigurationUseCase$execute$1.L$0 = null;
                chatsRefreshConfigurationUseCase$execute$1.label = 3;
                if (chatsInfoRepository.refreshChats(value, chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        chatsRefreshConfigurationUseCase$execute$1 = new ChatsRefreshConfigurationUseCase$execute$1(this, continuation);
        Object obj2 = chatsRefreshConfigurationUseCase$execute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatsRefreshConfigurationUseCase$execute$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        chatSubscriptionRepository = chatsRefreshConfigurationUseCase.chatSubscriptionRepository;
        chatsRefreshConfigurationUseCase$execute$1.L$0 = chatsRefreshConfigurationUseCase;
        chatsRefreshConfigurationUseCase$execute$1.label = 2;
        if (chatSubscriptionRepository.clear(chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
        }
        User currentUser2222 = chatsRefreshConfigurationUseCase.userRepository.getCurrentUser();
        if (currentUser2222 != null) {
        }
        if (value == null) {
        }
        chatsInfoRepository = chatsRefreshConfigurationUseCase.chatsInfoRepository;
        chatsRefreshConfigurationUseCase$execute$1.L$0 = null;
        chatsRefreshConfigurationUseCase$execute$1.label = 3;
        if (chatsInfoRepository.refreshChats(value, chatsRefreshConfigurationUseCase$execute$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
