package com.ifriend.domain.newChat.chat.systems.events.processing;

import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.domain.newChat.chat.ChatClientKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BotProcessingSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.newChat.chat.systems.events.processing.BotProcessingSystem$scheduleAddingProcessing$1", f = "BotProcessingSystem.kt", i = {0}, l = {70}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class BotProcessingSystem$scheduleAddingProcessing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BotProcessingSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProcessingSystem$scheduleAddingProcessing$1(BotProcessingSystem botProcessingSystem, Continuation<? super BotProcessingSystem$scheduleAddingProcessing$1> continuation) {
        super(2, continuation);
        this.this$0 = botProcessingSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotProcessingSystem$scheduleAddingProcessing$1 botProcessingSystem$scheduleAddingProcessing$1 = new BotProcessingSystem$scheduleAddingProcessing$1(this.this$0, continuation);
        botProcessingSystem$scheduleAddingProcessing$1.L$0 = obj;
        return botProcessingSystem$scheduleAddingProcessing$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotProcessingSystem$scheduleAddingProcessing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        ChatMessage lastMessage;
        AtomicReference atomicReference;
        AtomicBoolean atomicBoolean;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        EntitiesState access$currentState = BotProcessingSystem.access$currentState(this.this$0);
        if (access$currentState != null && (lastMessage = ChatClientKt.lastMessage(access$currentState)) != null) {
            MessageTag tag = lastMessage.getInfo().getTag();
            atomicReference = this.this$0.lastSentUserMessageTag;
            if (Intrinsics.areEqual(tag, atomicReference.get()) && CoroutineScopeKt.isActive(coroutineScope)) {
                atomicBoolean = this.this$0.isNeedToAddProcessing;
                atomicBoolean.set(true);
                this.this$0.reportUpdateState();
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
