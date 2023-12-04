package com.ifriend.ui.base;

import androidx.lifecycle.LifecycleOwnerKt;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.base.BaseActivity$subscribeToNoInternetDialog$1", f = "BaseActivity.kt", i = {}, l = {57, 58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class BaseActivity$subscribeToNoInternetDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<Job> $job;
    int label;
    final /* synthetic */ BaseActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseActivity$subscribeToNoInternetDialog$1(BaseActivity baseActivity, Ref.ObjectRef<Job> objectRef, Continuation<? super BaseActivity$subscribeToNoInternetDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = baseActivity;
        this.$job = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseActivity$subscribeToNoInternetDialog$1(this.this$0, this.$job, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseActivity$subscribeToNoInternetDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getInternetConnectionDialogsManager().isNeedToShowNotInternetConnectionDialog(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            throw new KotlinNothingValueException();
        } else {
            ResultKt.throwOnFailure(obj);
        }
        final Ref.ObjectRef<Job> objectRef = this.$job;
        final BaseActivity baseActivity = this.this$0;
        this.label = 2;
        if (((StateFlow) obj).collect(new FlowCollector<Boolean>() { // from class: com.ifriend.ui.base.BaseActivity$subscribeToNoInternetDialog$1.1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return emit(bool.booleanValue(), continuation);
            }

            /* JADX WARN: Type inference failed for: r5v1, types: [T, kotlinx.coroutines.Job] */
            public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                Job job = objectRef.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                objectRef.element = LifecycleOwnerKt.getLifecycleScope(baseActivity).launchWhenResumed(new BaseActivity$subscribeToNoInternetDialog$1$1$emit$2(z, baseActivity, null));
                return Unit.INSTANCE;
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        throw new KotlinNothingValueException();
    }
}
