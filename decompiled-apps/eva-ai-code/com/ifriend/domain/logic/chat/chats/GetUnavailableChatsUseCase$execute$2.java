package com.ifriend.domain.logic.chat.chats;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatoptionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* compiled from: GetUnavailableChatsUseCase.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chats", "", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase$execute$2", f = "GetUnavailableChatsUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class GetUnavailableChatsUseCase$execute$2 extends SuspendLambda implements Function3<List<? extends ChatInfo>, Boolean, Continuation<? super List<? extends ChatInfo>>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetUnavailableChatsUseCase$execute$2(Continuation<? super GetUnavailableChatsUseCase$execute$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatInfo> list, Boolean bool, Continuation<? super List<? extends ChatInfo>> continuation) {
        return invoke((List<ChatInfo>) list, bool.booleanValue(), (Continuation<? super List<ChatInfo>>) continuation);
    }

    public final Object invoke(List<ChatInfo> list, boolean z, Continuation<? super List<ChatInfo>> continuation) {
        GetUnavailableChatsUseCase$execute$2 getUnavailableChatsUseCase$execute$2 = new GetUnavailableChatsUseCase$execute$2(continuation);
        getUnavailableChatsUseCase$execute$2.L$0 = list;
        return getUnavailableChatsUseCase$execute$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) this.L$0) {
            if (!ChatoptionsKt.isCanChatting((ChatInfo) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
