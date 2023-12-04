package com.ifriend.ui.base.modalMessage;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.ui.utils.UIUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NoInternetPopupDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.base.modalMessage.NoInternetPopupDelegate$showMessage$1", f = "NoInternetPopupDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class NoInternetPopupDelegate$showMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ LifecycleOwner $lifecycle;
    int label;
    final /* synthetic */ NoInternetPopupDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoInternetPopupDelegate$showMessage$1(NoInternetPopupDelegate noInternetPopupDelegate, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager, Continuation<? super NoInternetPopupDelegate$showMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = noInternetPopupDelegate;
        this.$lifecycle = lifecycleOwner;
        this.$fragmentManager = fragmentManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoInternetPopupDelegate$showMessage$1(this.this$0, this.$lifecycle, this.$fragmentManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NoInternetPopupDelegate$showMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DialogFragment dialogFragment;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            dialogFragment = this.this$0.appDialog;
            if (dialogFragment != null) {
                UIUtils.INSTANCE.showWithBlur(dialogFragment, LifecycleOwnerKt.getLifecycleScope(this.$lifecycle), this.$fragmentManager, NoInternetPopupDelegate.NO_INTERNET_DIALOG_TAG);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
