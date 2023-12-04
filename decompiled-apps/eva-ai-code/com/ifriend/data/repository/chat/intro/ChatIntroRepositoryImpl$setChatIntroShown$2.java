package com.ifriend.data.repository.chat.intro;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.data.storages.chat.intro.ChatIntroLocalDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatIntroRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.chat.intro.ChatIntroRepositoryImpl$setChatIntroShown$2", f = "ChatIntroRepositoryImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatIntroRepositoryImpl$setChatIntroShown$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ boolean $isShown;
    int label;
    final /* synthetic */ ChatIntroRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroRepositoryImpl$setChatIntroShown$2(ChatIntroRepositoryImpl chatIntroRepositoryImpl, String str, boolean z, Continuation<? super ChatIntroRepositoryImpl$setChatIntroShown$2> continuation) {
        super(2, continuation);
        this.this$0 = chatIntroRepositoryImpl;
        this.$botId = str;
        this.$isShown = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatIntroRepositoryImpl$setChatIntroShown$2(this.this$0, this.$botId, this.$isShown, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatIntroRepositoryImpl$setChatIntroShown$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatIntroLocalDataSource chatIntroLocalDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatIntroLocalDataSource = this.this$0.localDataSource;
            this.label = 1;
            if (chatIntroLocalDataSource.setChatIntroShown(this.$botId, this.$isShown, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
