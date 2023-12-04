package com.ifriend.domain.logic.chat.configuration;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsConfigurationInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatInfo", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "configs", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor$getChatConfigurationFlow$2", f = "ChatsConfigurationInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatsConfigurationInteractor$getChatConfigurationFlow$2 extends SuspendLambda implements Function3<ChatInfo, List<? extends ChatConfig>, Continuation<? super ChatsConfiguration>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatsConfigurationInteractor$getChatConfigurationFlow$2(Continuation<? super ChatsConfigurationInteractor$getChatConfigurationFlow$2> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(ChatInfo chatInfo, List<ChatConfig> list, Continuation<? super ChatsConfiguration> continuation) {
        ChatsConfigurationInteractor$getChatConfigurationFlow$2 chatsConfigurationInteractor$getChatConfigurationFlow$2 = new ChatsConfigurationInteractor$getChatConfigurationFlow$2(continuation);
        chatsConfigurationInteractor$getChatConfigurationFlow$2.L$0 = chatInfo;
        chatsConfigurationInteractor$getChatConfigurationFlow$2.L$1 = list;
        return chatsConfigurationInteractor$getChatConfigurationFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ChatInfo chatInfo, List<? extends ChatConfig> list, Continuation<? super ChatsConfiguration> continuation) {
        return invoke2(chatInfo, (List<ChatConfig>) list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChatInfo chatInfo = (ChatInfo) this.L$0;
        Iterator it = ((List) this.L$1).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((ChatConfig) obj2).getChatId(), chatInfo.getChatId())) {
                break;
            }
        }
        return new ChatsConfiguration(chatInfo, (ChatConfig) obj2);
    }
}
