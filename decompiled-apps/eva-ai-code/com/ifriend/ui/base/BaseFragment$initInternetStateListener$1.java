package com.ifriend.ui.base;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.ifriend.domain.infrastucture.Connectivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.base.BaseFragment$initInternetStateListener$1", f = "BaseFragment.kt", i = {}, l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class BaseFragment$initInternetStateListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BaseFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFragment$initInternetStateListener$1(BaseFragment baseFragment, Continuation<? super BaseFragment$initInternetStateListener$1> continuation) {
        super(2, continuation);
        this.this$0 = baseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseFragment$initInternetStateListener$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseFragment$initInternetStateListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Connectivity> connectivityFlow = this.this$0.getInternetConnection().getConnectivityFlow();
            final BaseFragment baseFragment = this.this$0;
            this.label = 1;
            if (connectivityFlow.collect(new FlowCollector<Connectivity>() { // from class: com.ifriend.ui.base.BaseFragment$initInternetStateListener$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Connectivity connectivity, Continuation continuation) {
                    return emit2(connectivity, (Continuation<? super Unit>) continuation);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(Connectivity connectivity, Continuation<? super Unit> continuation) {
                    if (connectivity.isFullyConnected()) {
                        BaseFragment.initInternetStateListener$onInternetConnectionAvailable(BaseFragment.this);
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
