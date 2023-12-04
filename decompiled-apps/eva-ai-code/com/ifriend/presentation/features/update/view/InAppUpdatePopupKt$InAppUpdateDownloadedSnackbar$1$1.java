package com.ifriend.presentation.features.update.view;

import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.SnackbarResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: InAppUpdatePopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.update.view.InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1", f = "InAppUpdatePopup.kt", i = {}, l = {215}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ String $snackbarAction;
    final /* synthetic */ String $snackbarText;
    final /* synthetic */ SnackbarHostState $state;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1(boolean z, SnackbarHostState snackbarHostState, String str, String str2, Function0<Unit> function0, Continuation<? super InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1> continuation) {
        super(2, continuation);
        this.$isVisible = z;
        this.$state = snackbarHostState;
        this.$snackbarText = str;
        this.$snackbarAction = str2;
        this.$onClick = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1(this.$isVisible, this.$state, this.$snackbarText, this.$snackbarAction, this.$onClick, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppUpdatePopupKt$InAppUpdateDownloadedSnackbar$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$isVisible) {
                this.label = 1;
                obj = SnackbarHostState.showSnackbar$default(this.$state, this.$snackbarText, this.$snackbarAction, false, SnackbarDuration.Indefinite, this, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        if (((SnackbarResult) obj) == SnackbarResult.ActionPerformed) {
            this.$onClick.invoke();
        }
        return Unit.INSTANCE;
    }
}
