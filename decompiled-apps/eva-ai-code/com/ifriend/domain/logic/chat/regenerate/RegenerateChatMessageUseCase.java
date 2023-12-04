package com.ifriend.domain.logic.chat.regenerate;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.systems.events.regeneration.MessageRegeneratingEvent;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.ChatMessagesRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: RegenerateChatMessageUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/ifriend/domain/logic/chat/regenerate/RegenerateChatMessageUseCase;", "", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "chatMessagesRepository", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "(Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/ChatMessagesRepository;Lcom/ifriend/core/tools/api/DispatcherProvider;)V", "execute", "", "chatId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegenerateChatMessageUseCase {
    private final ChatClientInteractor chatClientInteractor;
    private final ChatMessagesRepository chatMessagesRepository;
    private final DispatcherProvider dispatcherProvider;

    @Inject
    public RegenerateChatMessageUseCase(ChatClientInteractor chatClientInteractor, ChatMessagesRepository chatMessagesRepository, DispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(chatMessagesRepository, "chatMessagesRepository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.chatClientInteractor = chatClientInteractor;
        this.chatMessagesRepository = chatMessagesRepository;
        this.dispatcherProvider = dispatcherProvider;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(1:(1:(3:11|12|(2:14|(2:16|17)(1:19))(2:20|21))(2:22|23))(8:24|25|26|27|28|(2:30|(1:32))|12|(0)(0)))(1:36))(2:45|(1:47)(1:48))|37|38|(1:40)(6:41|27|28|(0)|12|(0)(0))))|49|6|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        r7 = r10;
        r10 = r9;
        r9 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(String str, String str2, Continuation<? super Unit> continuation) {
        RegenerateChatMessageUseCase$execute$1 regenerateChatMessageUseCase$execute$1;
        Object coroutine_suspended;
        int i;
        RegenerateChatMessageUseCase regenerateChatMessageUseCase;
        String str3;
        String str4;
        ChatMessagesRepository chatMessagesRepository;
        Object m7271constructorimpl;
        Object obj;
        if (continuation instanceof RegenerateChatMessageUseCase$execute$1) {
            regenerateChatMessageUseCase$execute$1 = (RegenerateChatMessageUseCase$execute$1) continuation;
            if ((regenerateChatMessageUseCase$execute$1.label & Integer.MIN_VALUE) != 0) {
                regenerateChatMessageUseCase$execute$1.label -= Integer.MIN_VALUE;
                Object obj2 = regenerateChatMessageUseCase$execute$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = regenerateChatMessageUseCase$execute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    regenerateChatMessageUseCase$execute$1.L$0 = this;
                    regenerateChatMessageUseCase$execute$1.L$1 = str;
                    regenerateChatMessageUseCase$execute$1.L$2 = str2;
                    regenerateChatMessageUseCase$execute$1.label = 1;
                    if (this.chatClientInteractor.handleEvent(str, new MessageRegeneratingEvent(str2, true), regenerateChatMessageUseCase$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    regenerateChatMessageUseCase = this;
                } else if (i == 1) {
                    str2 = (String) regenerateChatMessageUseCase$execute$1.L$2;
                    str = (String) regenerateChatMessageUseCase$execute$1.L$1;
                    regenerateChatMessageUseCase = (RegenerateChatMessageUseCase) regenerateChatMessageUseCase$execute$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                } else if (i != 2) {
                    if (i == 3) {
                        obj = regenerateChatMessageUseCase$execute$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        if (Result.m7277isFailureimpl(obj)) {
                            Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(obj);
                            if (m7274exceptionOrNullimpl == null) {
                                throw new IllegalArgumentException("Required value was null.".toString());
                            }
                            throw m7274exceptionOrNullimpl;
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str4 = (String) regenerateChatMessageUseCase$execute$1.L$2;
                    str3 = (String) regenerateChatMessageUseCase$execute$1.L$1;
                    regenerateChatMessageUseCase = (RegenerateChatMessageUseCase) regenerateChatMessageUseCase$execute$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion = Result.Companion;
                        m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
                        String str5 = str3;
                        String str6 = str4;
                        obj = m7271constructorimpl;
                        if (Result.m7274exceptionOrNullimpl(obj) != null) {
                        }
                        if (Result.m7277isFailureimpl(obj)) {
                        }
                    }
                    String str52 = str3;
                    String str62 = str4;
                    obj = m7271constructorimpl;
                    if (Result.m7274exceptionOrNullimpl(obj) != null) {
                        regenerateChatMessageUseCase$execute$1.L$0 = obj;
                        regenerateChatMessageUseCase$execute$1.L$1 = null;
                        regenerateChatMessageUseCase$execute$1.L$2 = null;
                        regenerateChatMessageUseCase$execute$1.label = 3;
                        if (BuildersKt.withContext(regenerateChatMessageUseCase.dispatcherProvider.nonCancellable(), new RegenerateChatMessageUseCase$execute$result$2$1(regenerateChatMessageUseCase, str52, str62, null), regenerateChatMessageUseCase$execute$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (Result.m7277isFailureimpl(obj)) {
                    }
                }
                Result.Companion companion2 = Result.Companion;
                RegenerateChatMessageUseCase regenerateChatMessageUseCase2 = regenerateChatMessageUseCase;
                chatMessagesRepository = regenerateChatMessageUseCase.chatMessagesRepository;
                regenerateChatMessageUseCase$execute$1.L$0 = regenerateChatMessageUseCase;
                regenerateChatMessageUseCase$execute$1.L$1 = str;
                regenerateChatMessageUseCase$execute$1.L$2 = str2;
                regenerateChatMessageUseCase$execute$1.label = 2;
                if (chatMessagesRepository.regenerateNewAnswer(str, str2, regenerateChatMessageUseCase$execute$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str7 = str2;
                str3 = str;
                str4 = str7;
                m7271constructorimpl = Result.m7271constructorimpl(Unit.INSTANCE);
                String str522 = str3;
                String str622 = str4;
                obj = m7271constructorimpl;
                if (Result.m7274exceptionOrNullimpl(obj) != null) {
                }
                if (Result.m7277isFailureimpl(obj)) {
                }
            }
        }
        regenerateChatMessageUseCase$execute$1 = new RegenerateChatMessageUseCase$execute$1(this, continuation);
        Object obj22 = regenerateChatMessageUseCase$execute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = regenerateChatMessageUseCase$execute$1.label;
        if (i != 0) {
        }
        Result.Companion companion22 = Result.Companion;
        RegenerateChatMessageUseCase regenerateChatMessageUseCase22 = regenerateChatMessageUseCase;
        chatMessagesRepository = regenerateChatMessageUseCase.chatMessagesRepository;
        regenerateChatMessageUseCase$execute$1.L$0 = regenerateChatMessageUseCase;
        regenerateChatMessageUseCase$execute$1.L$1 = str;
        regenerateChatMessageUseCase$execute$1.L$2 = str2;
        regenerateChatMessageUseCase$execute$1.label = 2;
        if (chatMessagesRepository.regenerateNewAnswer(str, str2, regenerateChatMessageUseCase$execute$1) != coroutine_suspended) {
        }
    }
}
