package com.ifriend.domain.logic.store;

import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import com.ifriend.domain.logic.chat.configuration.ChatsConfiguration;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetChatsStoreInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chats", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "configs", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfiguration;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.store.GetChatsStoreInteractor$execute$2", f = "GetChatsStoreInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GetChatsStoreInteractor$execute$2 extends SuspendLambda implements Function3<List<? extends ChatInfo>, List<? extends ChatConfig>, Continuation<? super List<? extends ChatsConfiguration>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GetChatsStoreInteractor$execute$2(Continuation<? super GetChatsStoreInteractor$execute$2> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatInfo> list, List<? extends ChatConfig> list2, Continuation<? super List<? extends ChatsConfiguration>> continuation) {
        return invoke2((List<ChatInfo>) list, (List<ChatConfig>) list2, (Continuation<? super List<ChatsConfiguration>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ChatInfo> list, List<ChatConfig> list2, Continuation<? super List<ChatsConfiguration>> continuation) {
        GetChatsStoreInteractor$execute$2 getChatsStoreInteractor$execute$2 = new GetChatsStoreInteractor$execute$2(continuation);
        getChatsStoreInteractor$execute$2.L$0 = list;
        getChatsStoreInteractor$execute$2.L$1 = list2;
        return getChatsStoreInteractor$execute$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$1;
        List<ChatInfo> list2 = (List) this.L$0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (ChatInfo chatInfo : list2) {
            Iterator it = list.iterator();
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
            arrayList.add(new ChatsConfiguration(chatInfo, (ChatConfig) obj2));
        }
        return arrayList;
    }
}
