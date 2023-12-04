package com.ifriend.ui.base;

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
/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.base.BaseActivity$subscribeToNoInternetDialog$1$1$emit$2", f = "BaseActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class BaseActivity$subscribeToNoInternetDialog$1$1$emit$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isNeedToShowNoInternetConnectionDialog;
    int label;
    final /* synthetic */ BaseActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivity$subscribeToNoInternetDialog$1$1$emit$2(boolean z, BaseActivity baseActivity, Continuation<? super BaseActivity$subscribeToNoInternetDialog$1$1$emit$2> continuation) {
        super(2, continuation);
        this.$isNeedToShowNoInternetConnectionDialog = z;
        this.this$0 = baseActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseActivity$subscribeToNoInternetDialog$1$1$emit$2(this.$isNeedToShowNoInternetConnectionDialog, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseActivity$subscribeToNoInternetDialog$1$1$emit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$isNeedToShowNoInternetConnectionDialog) {
            BaseActivity.subscribeToNoInternetDialog$showNoInternet(this.this$0);
        } else {
            BaseActivity.subscribeToNoInternetDialog$onInternetConnectionAvailable(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
