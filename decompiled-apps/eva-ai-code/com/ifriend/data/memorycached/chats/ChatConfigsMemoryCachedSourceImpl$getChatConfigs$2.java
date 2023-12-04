package com.ifriend.data.memorycached.chats;

import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.domain.logic.chat.configuration.ChatConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/logic/chat/configuration/ChatConfig;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.memorycached.chats.ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2", f = "ChatConfigsMemoryCachedSourceImpl.kt", i = {}, l = {38, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ChatConfig>>, Object> {
    int label;
    final /* synthetic */ ChatConfigsMemoryCachedSourceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2(ChatConfigsMemoryCachedSourceImpl chatConfigsMemoryCachedSourceImpl, Continuation<? super ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2> continuation) {
        super(2, continuation);
        this.this$0 = chatConfigsMemoryCachedSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ChatConfig>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ChatConfig>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ChatConfig>> continuation) {
        return ((ChatConfigsMemoryCachedSourceImpl$getChatConfigs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource cachedSource;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedSource = this.this$0.getCachedSource();
            str = this.this$0.CACHED_KEY;
            Intrinsics.checkNotNullExpressionValue(str, "access$getCACHED_KEY$p(...)");
            this.label = 1;
            obj = cachedSource.get(str, InMemoryCachedSource.Strategy.LOAD_IF_NO_CACHE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                List list = (List) obj;
                return list != null ? CollectionsKt.emptyList() : list;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = FlowKt.firstOrNull((Flow) obj, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        List list2 = (List) obj;
        if (list2 != null) {
        }
    }
}
