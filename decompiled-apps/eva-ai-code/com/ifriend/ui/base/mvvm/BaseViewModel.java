package com.ifriend.ui.base.mvvm;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.ui.base.mvvm.BaseState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: BaseViewModel.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bJ+\u0010\u0018\u001a\u00020\u00192!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00028\u00000\u001aH\u0004J\u000b\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130 H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0014J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0014J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0013H\u0004J\u0015\u0010)\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0004¢\u0006\u0002\u0010*JD\u0010+\u001a\u00020\u001921\u0010\u0018\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-\u0012\u0006\u0012\u0004\u0018\u00010.0,H\u0084@ø\u0001\u0000¢\u0006\u0002\u0010/R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/ifriend/ui/base/mvvm/BaseViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/ui/base/mvvm/BaseState;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "initialState", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/ui/base/mvvm/BaseState;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getCoroutineErrorHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/ui/base/mvvm/BaseEvent;", "job", "Lkotlinx/coroutines/CompletableJob;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "changeState", "", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "currentState", "()Lcom/ifriend/ui/base/mvvm/BaseState;", "getEvents", "Lkotlinx/coroutines/flow/Flow;", "getState", "Lkotlinx/coroutines/flow/StateFlow;", "onCleared", "onCoroutineError", "throwable", "", "postEvent", NotificationCompat.CATEGORY_EVENT, "postState", "(Lcom/ifriend/ui/base/mvvm/BaseState;)V", "suspendChangeState", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseViewModel<T extends BaseState> extends ViewModel implements CoroutineScope {
    public static final int $stable = 8;
    private final CoroutineContext coroutineContext;
    private final CoroutineExceptionHandler coroutineErrorHandler;
    private final MutableSharedFlow<BaseEvent> events;
    private final CompletableJob job;
    private final MutableStateFlow<T> state;

    /* JADX INFO: Access modifiers changed from: protected */
    public void onCoroutineError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public BaseViewModel(CoroutineDispatchers dispatchers, T initialState) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.job = Job$default;
        this.coroutineContext = dispatchers.getIO().plus(Job$default);
        this.coroutineErrorHandler = new BaseViewModel$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        this.state = StateFlowKt.MutableStateFlow(initialState);
        this.events = SharedFlowKt.MutableSharedFlow(0, 10, BufferOverflow.DROP_OLDEST);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final CoroutineExceptionHandler getCoroutineErrorHandler() {
        return this.coroutineErrorHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Job.DefaultImpls.cancel$default((Job) this.job, (CancellationException) null, 1, (Object) null);
    }

    protected final void postState(T state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (IsUIThreadCheckerKt.isUIThread()) {
            this.state.setValue(state);
        } else {
            this.state.tryEmit(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void postEvent(BaseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.tryEmit(event);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void changeState(Function1<? super T, ? extends T> changeState) {
        Intrinsics.checkNotNullParameter(changeState, "changeState");
        postState(changeState.invoke(currentState()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ifriend.ui.base.mvvm.BaseViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendChangeState(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        BaseViewModel$suspendChangeState$1 baseViewModel$suspendChangeState$1;
        int i;
        BaseViewModel<T> baseViewModel;
        if (continuation instanceof BaseViewModel$suspendChangeState$1) {
            baseViewModel$suspendChangeState$1 = (BaseViewModel$suspendChangeState$1) continuation;
            if ((baseViewModel$suspendChangeState$1.label & Integer.MIN_VALUE) != 0) {
                baseViewModel$suspendChangeState$1.label -= Integer.MIN_VALUE;
                Object obj = baseViewModel$suspendChangeState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = baseViewModel$suspendChangeState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    T currentState = currentState();
                    baseViewModel$suspendChangeState$1.L$0 = this;
                    baseViewModel$suspendChangeState$1.label = 1;
                    obj = function2.invoke(currentState, baseViewModel$suspendChangeState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    baseViewModel = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    baseViewModel = (BaseViewModel) baseViewModel$suspendChangeState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                baseViewModel.postState((BaseState) obj);
                return Unit.INSTANCE;
            }
        }
        baseViewModel$suspendChangeState$1 = new BaseViewModel$suspendChangeState$1(this, continuation);
        Object obj2 = baseViewModel$suspendChangeState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = baseViewModel$suspendChangeState$1.label;
        if (i != 0) {
        }
        baseViewModel.postState((BaseState) obj2);
        return Unit.INSTANCE;
    }

    public Flow<BaseEvent> getEvents() {
        return this.events;
    }

    public StateFlow<T> getState() {
        return this.state;
    }

    public final T currentState() {
        return this.state.getValue();
    }
}
