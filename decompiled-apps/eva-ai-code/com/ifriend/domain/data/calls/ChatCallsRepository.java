package com.ifriend.domain.data.calls;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.logic.calls.models.ChatStartCall;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatCallsRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\nJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/data/calls/ChatCallsRepository;", "", "finishCall", "", "callId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinishPhrases", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAvailableCall", "", "refreshFinishCallPhrases", "sendMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "startCall", "Lcom/ifriend/domain/logic/calls/models/ChatStartCall;", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatCallsRepository {
    Object finishCall(String str, String str2, Continuation<? super Unit> continuation);

    Object getFinishPhrases(Continuation<? super List<String>> continuation);

    Object isAvailableCall(Continuation<? super Boolean> continuation);

    Object refreshFinishCallPhrases(Continuation<? super Unit> continuation);

    Object sendMessage(String str, String str2, Continuation<? super Unit> continuation);

    Object startCall(String str, Continuation<? super ChatStartCall> continuation);
}
