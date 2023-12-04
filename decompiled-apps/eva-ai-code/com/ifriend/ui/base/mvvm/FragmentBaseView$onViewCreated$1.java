package com.ifriend.ui.base.mvvm;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u00020\u0004H\u008a@"}, d2 = {"Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "VM", "Lcom/ifriend/ui/base/mvvm/BaseState;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.ui.base.mvvm.FragmentBaseView$onViewCreated$1", f = "BaseView.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class FragmentBaseView$onViewCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FragmentBaseView<VM, T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentBaseView$onViewCreated$1(FragmentBaseView<VM, T> fragmentBaseView, Continuation<? super FragmentBaseView$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = fragmentBaseView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FragmentBaseView$onViewCreated$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FragmentBaseView$onViewCreated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.base.mvvm.FragmentBaseView$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
        final /* synthetic */ FragmentBaseView<VM, T> $tmp0;

        AnonymousClass1(FragmentBaseView<VM, T> fragmentBaseView) {
            this.$tmp0 = fragmentBaseView;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new AdaptedFunctionReference(2, this.$tmp0, FragmentBaseView.class, "handleNewState", "handleNewState(Lcom/ifriend/ui/base/mvvm/BaseState;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX WARN: Incorrect types in method signature: (TT;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(BaseState baseState, Continuation continuation) {
            Object invokeSuspend$handleNewState = FragmentBaseView$onViewCreated$1.invokeSuspend$handleNewState(this.$tmp0, baseState, continuation);
            return invokeSuspend$handleNewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invokeSuspend$handleNewState : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$handleNewState(FragmentBaseView fragmentBaseView, BaseState baseState, Continuation continuation) {
        fragmentBaseView.handleNewState(baseState);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.getViewModel().getState().collect(new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
