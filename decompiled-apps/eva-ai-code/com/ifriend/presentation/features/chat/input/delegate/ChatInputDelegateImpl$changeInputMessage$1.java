package com.ifriend.presentation.features.chat.input.delegate;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatInputDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl$changeInputMessage$1", f = "ChatInputDelegate.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatInputDelegateImpl$changeInputMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $new;
    int label;
    final /* synthetic */ ChatInputDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputDelegateImpl$changeInputMessage$1(ChatInputDelegateImpl chatInputDelegateImpl, String str, Continuation<? super ChatInputDelegateImpl$changeInputMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = chatInputDelegateImpl;
        this.$new = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputDelegateImpl$changeInputMessage$1(this.this$0, this.$new, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputDelegateImpl$changeInputMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatInputState, Unit> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.reduce(uiStateDelegate, new AnonymousClass1(this.$new), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.input.delegate.ChatInputDelegateImpl$changeInputMessage$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatInputState, ChatInputState> {
        final /* synthetic */ String $new;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(1);
            this.$new = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatInputState invoke(ChatInputState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ChatInputState.copy$default(it, StringsKt.take(this.$new, 140), null, false, false, null, 0.0f, 62, null);
        }
    }
}
