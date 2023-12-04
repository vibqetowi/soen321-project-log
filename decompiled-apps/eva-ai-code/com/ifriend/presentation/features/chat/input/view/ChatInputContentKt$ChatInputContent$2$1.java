package com.ifriend.presentation.features.chat.input.view;

import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$ChatInputContent$2$1", f = "ChatInputContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatInputContentKt$ChatInputContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PermissionState $audioPermissionState;
    final /* synthetic */ ChatInputCallbacks $callbacks;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$2$1(PermissionState permissionState, ChatInputCallbacks chatInputCallbacks, Continuation<? super ChatInputContentKt$ChatInputContent$2$1> continuation) {
        super(2, continuation);
        this.$audioPermissionState = permissionState;
        this.$callbacks = chatInputCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputContentKt$ChatInputContent$2$1(this.$audioPermissionState, this.$callbacks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputContentKt$ChatInputContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (PermissionsUtilKt.isGranted(this.$audioPermissionState.getStatus())) {
            this.$callbacks.getOnAudioPermissionGranted().invoke();
        }
        return Unit.INSTANCE;
    }
}
