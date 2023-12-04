package coil.util;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;
/* compiled from: Lifecycles.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"awaitStarted", "", "Landroidx/lifecycle/Lifecycle;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAndAddObserver", "observer", "Landroidx/lifecycle/LifecycleObserver;", "coil-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Lifecycles {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitStarted(Lifecycle lifecycle, Continuation<? super Unit> continuation) {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        int i;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuation instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuation;
            if ((lifecycles$awaitStarted$1.label & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label -= Integer.MIN_VALUE;
                Object obj = lifecycles$awaitStarted$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lifecycles$awaitStarted$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        return Unit.INSTANCE;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        lifecycles$awaitStarted$1.L$0 = lifecycle;
                        lifecycles$awaitStarted$1.L$1 = objectRef2;
                        lifecycles$awaitStarted$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(lifecycles$awaitStarted$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                        objectRef2.element = new DefaultLifecycleObserver() { // from class: coil.util.-Lifecycles$awaitStarted$2$1
                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                                Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
                            }

                            @Override // androidx.lifecycle.DefaultLifecycleObserver
                            public void onStart(LifecycleOwner lifecycleOwner) {
                                Result.Companion companion = Result.Companion;
                                cancellableContinuationImpl2.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
                            }
                        };
                        T t = objectRef2.element;
                        Intrinsics.checkNotNull(t);
                        lifecycle.addObserver((LifecycleObserver) t);
                        Object result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(lifecycles$awaitStarted$1);
                        }
                        if (result == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        lifecycle2 = lifecycle;
                        objectRef = objectRef2;
                    } catch (Throwable th2) {
                        lifecycle2 = lifecycle;
                        objectRef = objectRef2;
                        th = th2;
                        lifecycleObserver = (LifecycleObserver) objectRef.element;
                        if (lifecycleObserver != null) {
                        }
                        throw th;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    objectRef = (Ref.ObjectRef) lifecycles$awaitStarted$1.L$1;
                    lifecycle2 = (Lifecycle) lifecycles$awaitStarted$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        lifecycleObserver = (LifecycleObserver) objectRef.element;
                        if (lifecycleObserver != null) {
                            lifecycle2.removeObserver(lifecycleObserver);
                        }
                        throw th;
                    }
                }
                lifecycleObserver2 = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            }
        }
        lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuation);
        Object obj2 = lifecycles$awaitStarted$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lifecycles$awaitStarted$1.label;
        if (i != 0) {
        }
        lifecycleObserver2 = (LifecycleObserver) objectRef.element;
        if (lifecycleObserver2 != null) {
        }
        return Unit.INSTANCE;
    }

    public static final void removeAndAddObserver(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
