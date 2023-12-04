package com.ifriend.domain.logic.topics;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.common_utils.extensions.ommonKt;
import com.ifriend.domain.logic.topics.models.ChatTopic;
import com.ifriend.domain.models.levels.LevelInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"Lcom/ifriend/common_utils/data/Resource;", "Lcom/ifriend/domain/models/levels/LevelInfo;", "levelInfo", "", "Lcom/ifriend/domain/logic/topics/models/ChatTopic;", "topics", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.topics.ChatPanelActionsInteractor$getChatTopicFlow$2", f = "ChatPanelActionsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsInteractor$getChatTopicFlow$2 extends SuspendLambda implements Function3<Resource<LevelInfo>, List<? extends ChatTopic>, Continuation<? super List<? extends ChatTopic>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatPanelActionsInteractor$getChatTopicFlow$2(Continuation<? super ChatPanelActionsInteractor$getChatTopicFlow$2> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Resource<LevelInfo> resource, List<ChatTopic> list, Continuation<? super List<ChatTopic>> continuation) {
        ChatPanelActionsInteractor$getChatTopicFlow$2 chatPanelActionsInteractor$getChatTopicFlow$2 = new ChatPanelActionsInteractor$getChatTopicFlow$2(continuation);
        chatPanelActionsInteractor$getChatTopicFlow$2.L$0 = resource;
        chatPanelActionsInteractor$getChatTopicFlow$2.L$1 = list;
        return chatPanelActionsInteractor$getChatTopicFlow$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Resource<LevelInfo> resource, List<? extends ChatTopic> list, Continuation<? super List<? extends ChatTopic>> continuation) {
        return invoke2(resource, (List<ChatTopic>) list, (Continuation<? super List<ChatTopic>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$1;
        LevelInfo levelInfo = (LevelInfo) ((Resource) this.L$0).getData();
        return ommonKt.orZero(levelInfo != null ? Boxing.boxInt(levelInfo.getLevel()) : null) >= 2 ? list : CollectionsKt.emptyList();
    }
}
