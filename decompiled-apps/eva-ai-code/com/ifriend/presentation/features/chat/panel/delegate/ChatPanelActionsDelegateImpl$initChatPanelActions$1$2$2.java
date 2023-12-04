package com.ifriend.presentation.features.chat.panel.delegate;

import androidx.core.app.NotificationCompat;
import com.ifriend.presentation.features.chat.panel.models.ChatCallUi;
import com.ifriend.presentation.features.chat.panel.models.ChatDiaryUi;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u008a@"}, d2 = {"", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicUi;", "topics", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPremiumTopicUi;", "premiumTopics", "Lcom/ifriend/presentation/features/chat/panel/models/ChatDiaryUi;", "diary", "Lcom/ifriend/presentation/features/chat/panel/models/ChatCallUi;", NotificationCompat.CATEGORY_CALL, "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2 extends SuspendLambda implements Function5<List<? extends ChatTopicUi>, List<? extends ChatPremiumTopicUi>, ChatDiaryUi, ChatCallUi, Continuation<? super List<? extends ChatPanelActionMarker>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2(Continuation<? super ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2> continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ChatTopicUi> list, List<? extends ChatPremiumTopicUi> list2, ChatDiaryUi chatDiaryUi, ChatCallUi chatCallUi, Continuation<? super List<? extends ChatPanelActionMarker>> continuation) {
        return invoke2((List<ChatTopicUi>) list, (List<ChatPremiumTopicUi>) list2, chatDiaryUi, chatCallUi, continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ChatTopicUi> list, List<ChatPremiumTopicUi> list2, ChatDiaryUi chatDiaryUi, ChatCallUi chatCallUi, Continuation<? super List<? extends ChatPanelActionMarker>> continuation) {
        ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2 chatPanelActionsDelegateImpl$initChatPanelActions$1$2$2 = new ChatPanelActionsDelegateImpl$initChatPanelActions$1$2$2(continuation);
        chatPanelActionsDelegateImpl$initChatPanelActions$1$2$2.L$0 = list;
        chatPanelActionsDelegateImpl$initChatPanelActions$1$2$2.L$1 = list2;
        chatPanelActionsDelegateImpl$initChatPanelActions$1$2$2.L$2 = chatDiaryUi;
        chatPanelActionsDelegateImpl$initChatPanelActions$1$2$2.L$3 = chatCallUi;
        return chatPanelActionsDelegateImpl$initChatPanelActions$1$2$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        ChatDiaryUi chatDiaryUi = (ChatDiaryUi) this.L$2;
        ChatCallUi chatCallUi = (ChatCallUi) this.L$3;
        List createListBuilder = CollectionsKt.createListBuilder();
        if (chatCallUi != null) {
            createListBuilder.add(chatCallUi);
        }
        createListBuilder.addAll(list2);
        if (chatDiaryUi != null) {
            createListBuilder.add(chatDiaryUi);
        }
        createListBuilder.addAll(list);
        return CollectionsKt.build(createListBuilder);
    }
}
