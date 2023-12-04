package com.ifriend.domain.logic.chat.avatart;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1", f = "GeneratedChatAvatarInteractor.kt", i = {}, l = {217, FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super GeneratedAvatar>, Boolean, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GeneratedChatAvatarInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1(Continuation continuation, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        super(3, continuation);
        this.this$0 = generatedChatAvatarInteractor;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super GeneratedAvatar> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1 generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1 = new GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1(continuation, this.this$0);
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1.L$0 = flowCollector;
        generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1.L$1 = bool;
        return generatedChatAvatarInteractor$getGeneratedChatAvatarFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Flow flowOf;
        GenerateBotAvatarRepository generateBotAvatarRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            if (((Boolean) this.L$1).booleanValue()) {
                generateBotAvatarRepository = this.this$0.generateBotAvatarRepository;
                this.L$0 = flowCollector;
                this.label = 1;
                obj = generateBotAvatarRepository.getCurrentAvatar(false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                flowOf = FlowKt.flowOf((Object) null);
                this.L$0 = null;
                this.label = 2;
                if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        flowOf = (Flow) obj;
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowOf, this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
