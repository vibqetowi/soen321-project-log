package com.ifriend.data.repository.chat.info;

import com.ifriend.data.common.InMemoryCachedSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatBackgroundRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.info.ChatBackgroundRepositoryImpl$isPreloadVideos$2", f = "ChatBackgroundRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatBackgroundRepositoryImpl$isPreloadVideos$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatBackgroundRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBackgroundRepositoryImpl$isPreloadVideos$2(ChatBackgroundRepositoryImpl chatBackgroundRepositoryImpl, String str, Continuation<? super ChatBackgroundRepositoryImpl$isPreloadVideos$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundRepositoryImpl;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundRepositoryImpl$isPreloadVideos$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ChatBackgroundRepositoryImpl$isPreloadVideos$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InMemoryCachedSource preloadVideosCachedSource;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            preloadVideosCachedSource = this.this$0.getPreloadVideosCachedSource();
            Boolean bool = (Boolean) preloadVideosCachedSource.getFromCache(this.$chatId);
            return Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
