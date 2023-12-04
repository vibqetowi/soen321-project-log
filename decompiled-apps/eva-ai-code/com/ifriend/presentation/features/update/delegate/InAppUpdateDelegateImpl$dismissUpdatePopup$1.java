package com.ifriend.presentation.features.update.delegate;

import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$dismissUpdatePopup$1", f = "InAppUpdateDelegate.kt", i = {}, l = {207, 214}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl$dismissUpdatePopup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromUser;
    int label;
    final /* synthetic */ InAppUpdateDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateDelegateImpl$dismissUpdatePopup$1(InAppUpdateDelegateImpl inAppUpdateDelegateImpl, boolean z, Continuation<? super InAppUpdateDelegateImpl$dismissUpdatePopup$1> continuation) {
        super(2, continuation);
        this.this$0 = inAppUpdateDelegateImpl;
        this.$fromUser = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppUpdateDelegateImpl$dismissUpdatePopup$1(this.this$0, this.$fromUser, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppUpdateDelegateImpl$dismissUpdatePopup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        UpdatePromptInteractor updatePromptInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.state;
            mutableStateFlow.setValue(null);
            UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
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
        if (this.$fromUser) {
            updatePromptInteractor = this.this$0.updatePromptInteractor;
            this.label = 2;
            if (updatePromptInteractor.onPromptDismissed(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppUpdateDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/update/model/InAppUpdateState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$dismissUpdatePopup$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<InAppUpdateState, InAppUpdateState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InAppUpdateState invoke(InAppUpdateState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return InAppUpdateState.copy$default(it, false, false, false, 4, null);
        }
    }
}
