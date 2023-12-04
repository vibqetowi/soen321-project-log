package com.ifriend.presentation.features.chat.notifications.view;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.MutableState;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatNotificationsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.notifications.view.ChatNotificationsContentKt$ChatNotificationsContent$2$1", f = "ChatNotificationsContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatNotificationsContentKt$ChatNotificationsContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> $internalItems$delegate;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ ChatNotificationUi $item;
    final /* synthetic */ MutableTransitionState<Boolean> $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatNotificationsContentKt$ChatNotificationsContent$2$1(MutableTransitionState<Boolean> mutableTransitionState, boolean z, ChatNotificationUi chatNotificationUi, MutableState<PersistentList<Pair<Boolean, ChatNotificationUi>>> mutableState, Continuation<? super ChatNotificationsContentKt$ChatNotificationsContent$2$1> continuation) {
        super(2, continuation);
        this.$state = mutableTransitionState;
        this.$isVisible = z;
        this.$item = chatNotificationUi;
        this.$internalItems$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatNotificationsContentKt$ChatNotificationsContent$2$1(this.$state, this.$isVisible, this.$item, this.$internalItems$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatNotificationsContentKt$ChatNotificationsContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$state.isIdle() && !this.$state.getCurrentState().booleanValue() && !this.$isVisible) {
            ChatNotificationsContentKt.ChatNotificationsContent$removeItem(this.$internalItems$delegate, this.$item.getId());
        }
        return Unit.INSTANCE;
    }
}
