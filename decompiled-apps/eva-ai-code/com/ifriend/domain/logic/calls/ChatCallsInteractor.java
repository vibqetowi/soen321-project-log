package com.ifriend.domain.logic.calls;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.data.calls.ChatCallsRepository;
import com.ifriend.domain.logic.calls.models.ChatStartCall;
import com.ifriend.domain.logic.experiments.FeatureToggleKey;
import com.ifriend.domain.logic.experiments.IsChatFeatureAvailableUseCase;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatCallsInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0011\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/ifriend/domain/logic/calls/ChatCallsInteractor;", "", "callsRepository", "Lcom/ifriend/domain/data/calls/ChatCallsRepository;", "isChatFeatureAvailableUseCase", "Lcom/ifriend/domain/logic/experiments/IsChatFeatureAvailableUseCase;", "(Lcom/ifriend/domain/data/calls/ChatCallsRepository;Lcom/ifriend/domain/logic/experiments/IsChatFeatureAvailableUseCase;)V", "finishCall", "", "callId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinishPhrase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAvailableCall", "", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCallFeatureAvailable", "Lkotlinx/coroutines/flow/Flow;", "sendMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "startCall", "Lcom/ifriend/domain/logic/calls/models/ChatStartCall;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatCallsInteractor {
    private final ChatCallsRepository callsRepository;
    private final IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase;

    @Inject
    public ChatCallsInteractor(ChatCallsRepository callsRepository, IsChatFeatureAvailableUseCase isChatFeatureAvailableUseCase) {
        Intrinsics.checkNotNullParameter(callsRepository, "callsRepository");
        Intrinsics.checkNotNullParameter(isChatFeatureAvailableUseCase, "isChatFeatureAvailableUseCase");
        this.callsRepository = callsRepository;
        this.isChatFeatureAvailableUseCase = isChatFeatureAvailableUseCase;
    }

    public final Object isCallFeatureAvailable(String str, Continuation<? super Flow<Boolean>> continuation) {
        return this.isChatFeatureAvailableUseCase.execute(str, FeatureToggleKey.CHAT_CALL_FEATURE, continuation);
    }

    public final Object isAvailableCall(String str, Continuation<? super Boolean> continuation) {
        return this.callsRepository.isAvailableCall(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[PHI: r7 
      PHI: (r7v14 java.lang.Object) = (r7v12 java.lang.Object), (r7v1 java.lang.Object) binds: [B:31:0x0079, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startCall(String str, Continuation<? super ChatStartCall> continuation) {
        ChatCallsInteractor$startCall$1 chatCallsInteractor$startCall$1;
        int i;
        ChatCallsInteractor chatCallsInteractor;
        if (continuation instanceof ChatCallsInteractor$startCall$1) {
            chatCallsInteractor$startCall$1 = (ChatCallsInteractor$startCall$1) continuation;
            if ((chatCallsInteractor$startCall$1.label & Integer.MIN_VALUE) != 0) {
                chatCallsInteractor$startCall$1.label -= Integer.MIN_VALUE;
                Object obj = chatCallsInteractor$startCall$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatCallsInteractor$startCall$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        ChatCallsInteractor chatCallsInteractor2 = this;
                        ChatCallsRepository chatCallsRepository = this.callsRepository;
                        chatCallsInteractor$startCall$1.L$0 = this;
                        chatCallsInteractor$startCall$1.L$1 = str;
                        chatCallsInteractor$startCall$1.label = 1;
                        if (chatCallsRepository.refreshFinishCallPhrases(chatCallsInteractor$startCall$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        chatCallsInteractor = this;
                    } catch (Throwable th) {
                        th = th;
                        chatCallsInteractor = this;
                        Result.Companion companion2 = Result.Companion;
                        Result.m7271constructorimpl(ResultKt.createFailure(th));
                        ChatCallsRepository chatCallsRepository2 = chatCallsInteractor.callsRepository;
                        chatCallsInteractor$startCall$1.L$0 = null;
                        chatCallsInteractor$startCall$1.L$1 = null;
                        chatCallsInteractor$startCall$1.label = 2;
                        obj = chatCallsRepository2.startCall(str, chatCallsInteractor$startCall$1);
                        if (obj != coroutine_suspended) {
                        }
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    str = (String) chatCallsInteractor$startCall$1.L$1;
                    chatCallsInteractor = (ChatCallsInteractor) chatCallsInteractor$startCall$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.Companion;
                        Result.m7271constructorimpl(ResultKt.createFailure(th));
                        ChatCallsRepository chatCallsRepository22 = chatCallsInteractor.callsRepository;
                        chatCallsInteractor$startCall$1.L$0 = null;
                        chatCallsInteractor$startCall$1.L$1 = null;
                        chatCallsInteractor$startCall$1.label = 2;
                        obj = chatCallsRepository22.startCall(str, chatCallsInteractor$startCall$1);
                        if (obj != coroutine_suspended) {
                        }
                    }
                }
                Result.m7271constructorimpl(Unit.INSTANCE);
                ChatCallsRepository chatCallsRepository222 = chatCallsInteractor.callsRepository;
                chatCallsInteractor$startCall$1.L$0 = null;
                chatCallsInteractor$startCall$1.L$1 = null;
                chatCallsInteractor$startCall$1.label = 2;
                obj = chatCallsRepository222.startCall(str, chatCallsInteractor$startCall$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        chatCallsInteractor$startCall$1 = new ChatCallsInteractor$startCall$1(this, continuation);
        Object obj2 = chatCallsInteractor$startCall$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatCallsInteractor$startCall$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        ChatCallsRepository chatCallsRepository2222 = chatCallsInteractor.callsRepository;
        chatCallsInteractor$startCall$1.L$0 = null;
        chatCallsInteractor$startCall$1.L$1 = null;
        chatCallsInteractor$startCall$1.label = 2;
        obj2 = chatCallsRepository2222.startCall(str, chatCallsInteractor$startCall$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        r6 = kotlin.Result.Companion;
        kotlin.Result.m7271constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finishCall(String str, String str2, Continuation<? super Unit> continuation) {
        ChatCallsInteractor$finishCall$1 chatCallsInteractor$finishCall$1;
        int i;
        if (continuation instanceof ChatCallsInteractor$finishCall$1) {
            chatCallsInteractor$finishCall$1 = (ChatCallsInteractor$finishCall$1) continuation;
            if ((chatCallsInteractor$finishCall$1.label & Integer.MIN_VALUE) != 0) {
                chatCallsInteractor$finishCall$1.label -= Integer.MIN_VALUE;
                Object obj = chatCallsInteractor$finishCall$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatCallsInteractor$finishCall$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    ChatCallsInteractor chatCallsInteractor = this;
                    ChatCallsRepository chatCallsRepository = this.callsRepository;
                    chatCallsInteractor$finishCall$1.label = 1;
                    if (chatCallsRepository.finishCall(str, str2, chatCallsInteractor$finishCall$1) == coroutine_suspended) {
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
        chatCallsInteractor$finishCall$1 = new ChatCallsInteractor$finishCall$1(this, continuation);
        Object obj2 = chatCallsInteractor$finishCall$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatCallsInteractor$finishCall$1.label;
        if (i != 0) {
        }
        Result.m7271constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    public final Object sendMessage(String str, String str2, Continuation<? super Unit> continuation) {
        Object sendMessage = this.callsRepository.sendMessage(str, str2, continuation);
        return sendMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendMessage : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFinishPhrase(Continuation<? super String> continuation) {
        ChatCallsInteractor$getFinishPhrase$1 chatCallsInteractor$getFinishPhrase$1;
        int i;
        if (continuation instanceof ChatCallsInteractor$getFinishPhrase$1) {
            chatCallsInteractor$getFinishPhrase$1 = (ChatCallsInteractor$getFinishPhrase$1) continuation;
            if ((chatCallsInteractor$getFinishPhrase$1.label & Integer.MIN_VALUE) != 0) {
                chatCallsInteractor$getFinishPhrase$1.label -= Integer.MIN_VALUE;
                Object obj = chatCallsInteractor$getFinishPhrase$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatCallsInteractor$getFinishPhrase$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatCallsRepository chatCallsRepository = this.callsRepository;
                    chatCallsInteractor$getFinishPhrase$1.label = 1;
                    obj = chatCallsRepository.getFinishPhrases(chatCallsInteractor$getFinishPhrase$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                List list = (List) obj;
                return !list.isEmpty() ? "" : list.get(Random.Default.nextInt(0, CollectionsKt.getLastIndex(list)));
            }
        }
        chatCallsInteractor$getFinishPhrase$1 = new ChatCallsInteractor$getFinishPhrase$1(this, continuation);
        Object obj2 = chatCallsInteractor$getFinishPhrase$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatCallsInteractor$getFinishPhrase$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        if (!list2.isEmpty()) {
        }
    }
}
