package com.ifriend.platform.tools.impl.speech;

import com.ifriend.platform.tools.api.speech.TextToSpeechInitState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: TextToSpeechStreamImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.platform.tools.impl.speech.TextToSpeechStreamImpl$onInit$1", f = "TextToSpeechStreamImpl.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class TextToSpeechStreamImpl$onInit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $status;
    int label;
    final /* synthetic */ TextToSpeechStreamImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextToSpeechStreamImpl$onInit$1(TextToSpeechStreamImpl textToSpeechStreamImpl, int i, Continuation<? super TextToSpeechStreamImpl$onInit$1> continuation) {
        super(2, continuation);
        this.this$0 = textToSpeechStreamImpl;
        this.$status = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextToSpeechStreamImpl$onInit$1(this.this$0, this.$status, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextToSpeechStreamImpl$onInit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        TextToSpeechInitState textToSpeechInitState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.initState;
            if (this.$status == 0) {
                textToSpeechInitState = TextToSpeechInitState.SUCCESS;
            } else {
                textToSpeechInitState = TextToSpeechInitState.ERROR;
            }
            this.label = 1;
            if (mutableStateFlow.emit(textToSpeechInitState, this) == coroutine_suspended) {
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
