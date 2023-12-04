package com.ifriend.data.repository.chat.info;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatsInfoRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$activateNewChat$2", f = "ChatsInfoRepositoryImpl.kt", i = {}, l = {154, 156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatsInfoRepositoryImpl$activateNewChat$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatsInfoRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsInfoRepositoryImpl$activateNewChat$2(ChatsInfoRepositoryImpl chatsInfoRepositoryImpl, String str, Continuation<? super ChatsInfoRepositoryImpl$activateNewChat$2> continuation) {
        super(2, continuation);
        this.this$0 = chatsInfoRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatsInfoRepositoryImpl$activateNewChat$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatsInfoRepositoryImpl$activateNewChat$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getChat(this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        ChatInfo chatInfo = (ChatInfo) obj;
        if (chatInfo != null) {
            cachedSource = this.this$0.getCachedSource();
            this.label = 2;
            if (cachedSource.update(this.$chatId, new AnonymousClass1(chatInfo), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsInfoRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/domain/logic/chat/models/ChatInfo;", "chatInfo", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.data.repository.chat.info.ChatsInfoRepositoryImpl$activateNewChat$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatInfo, ChatInfo> {
        final /* synthetic */ ChatInfo $chat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatInfo chatInfo) {
            super(1);
            this.$chat = chatInfo;
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
            r13 = r13.copy((r20 & 1) != 0 ? r13.uId : null, (r20 & 2) != 0 ? r13.chatId : null, (r20 & 4) != 0 ? r13.chatType : null, (r20 & 8) != 0 ? r13.name : null, (r20 & 16) != 0 ? r13.roundAvatarUrl : null, (r20 & 32) != 0 ? r13.paymentStatus : com.ifriend.domain.logic.chat.models.ChatPaymentStatus.Paid.INSTANCE, (r20 & 64) != 0 ? r13.paymentOptions : null, (r20 & 128) != 0 ? r13.tags : null, (r20 & 256) != 0 ? r13.promote : null);
         */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ChatInfo invoke(ChatInfo chatInfo) {
            ChatInfo copy;
            return (chatInfo == null || copy == null) ? this.$chat : copy;
        }
    }
}
