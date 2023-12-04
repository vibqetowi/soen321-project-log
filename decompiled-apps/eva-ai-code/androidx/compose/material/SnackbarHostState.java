package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "()V", "<set-?>", "Landroidx/compose/material/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "showSnackbar", "Landroidx/compose/material/SnackbarResult;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "actionLabel", "duration", "Landroidx/compose/material/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final MutableState currentSnackbarData$delegate;
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    public SnackbarHostState() {
        MutableState mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentSnackbarData$delegate = mutableStateOf$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #2 {all -> 0x00cd, blocks: (B:24:0x008c, B:26:0x00bd), top: B:43:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showSnackbar(String str, String str2, SnackbarDuration snackbarDuration, Continuation<? super SnackbarResult> continuation) {
        SnackbarHostState$showSnackbar$1 snackbarHostState$showSnackbar$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        SnackbarDuration snackbarDuration2;
        String str3;
        SnackbarHostState snackbarHostState;
        String str4;
        Object result;
        Mutex mutex2;
        try {
            try {
                if (continuation instanceof SnackbarHostState$showSnackbar$1) {
                    snackbarHostState$showSnackbar$1 = (SnackbarHostState$showSnackbar$1) continuation;
                    if ((snackbarHostState$showSnackbar$1.label & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$1.label -= Integer.MIN_VALUE;
                        Object obj = snackbarHostState$showSnackbar$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = snackbarHostState$showSnackbar$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            mutex = this.mutex;
                            snackbarHostState$showSnackbar$1.L$0 = this;
                            snackbarHostState$showSnackbar$1.L$1 = str;
                            snackbarHostState$showSnackbar$1.L$2 = str2;
                            snackbarHostState$showSnackbar$1.L$3 = snackbarDuration;
                            snackbarHostState$showSnackbar$1.L$4 = mutex;
                            snackbarHostState$showSnackbar$1.label = 1;
                            if (mutex.lock(null, snackbarHostState$showSnackbar$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            snackbarDuration2 = snackbarDuration;
                            str3 = str2;
                            snackbarHostState = this;
                            str4 = str;
                        } else if (i != 1) {
                            if (i == 2) {
                                SnackbarHostState$showSnackbar$1 snackbarHostState$showSnackbar$12 = (SnackbarHostState$showSnackbar$1) snackbarHostState$showSnackbar$1.L$5;
                                mutex2 = (Mutex) snackbarHostState$showSnackbar$1.L$4;
                                SnackbarDuration snackbarDuration3 = (SnackbarDuration) snackbarHostState$showSnackbar$1.L$3;
                                String str5 = (String) snackbarHostState$showSnackbar$1.L$2;
                                String str6 = (String) snackbarHostState$showSnackbar$1.L$1;
                                snackbarHostState = (SnackbarHostState) snackbarHostState$showSnackbar$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    snackbarHostState.setCurrentSnackbarData(null);
                                    mutex2.unlock(null);
                                    return obj;
                                } catch (Throwable th) {
                                    th = th;
                                    snackbarHostState.setCurrentSnackbarData(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            SnackbarDuration snackbarDuration4 = (SnackbarDuration) snackbarHostState$showSnackbar$1.L$3;
                            ResultKt.throwOnFailure(obj);
                            mutex = (Mutex) snackbarHostState$showSnackbar$1.L$4;
                            str4 = (String) snackbarHostState$showSnackbar$1.L$1;
                            snackbarDuration2 = snackbarDuration4;
                            str3 = (String) snackbarHostState$showSnackbar$1.L$2;
                            snackbarHostState = (SnackbarHostState) snackbarHostState$showSnackbar$1.L$0;
                        }
                        snackbarHostState$showSnackbar$1.L$0 = snackbarHostState;
                        snackbarHostState$showSnackbar$1.L$1 = str4;
                        snackbarHostState$showSnackbar$1.L$2 = str3;
                        snackbarHostState$showSnackbar$1.L$3 = snackbarDuration2;
                        snackbarHostState$showSnackbar$1.L$4 = mutex;
                        snackbarHostState$showSnackbar$1.L$5 = snackbarHostState$showSnackbar$1;
                        snackbarHostState$showSnackbar$1.label = 2;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        snackbarHostState.setCurrentSnackbarData(new SnackbarDataImpl(str4, str3, snackbarDuration2, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$1);
                        }
                        if (result != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Mutex mutex3 = mutex;
                        obj = result;
                        mutex2 = mutex3;
                        snackbarHostState.setCurrentSnackbarData(null);
                        mutex2.unlock(null);
                        return obj;
                    }
                }
                snackbarHostState$showSnackbar$1.L$0 = snackbarHostState;
                snackbarHostState$showSnackbar$1.L$1 = str4;
                snackbarHostState$showSnackbar$1.L$2 = str3;
                snackbarHostState$showSnackbar$1.L$3 = snackbarDuration2;
                snackbarHostState$showSnackbar$1.L$4 = mutex;
                snackbarHostState$showSnackbar$1.L$5 = snackbarHostState$showSnackbar$1;
                snackbarHostState$showSnackbar$1.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$1), 1);
                cancellableContinuationImpl2.initCancellability();
                snackbarHostState.setCurrentSnackbarData(new SnackbarDataImpl(str4, str3, snackbarDuration2, cancellableContinuationImpl2));
                result = cancellableContinuationImpl2.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (result != coroutine_suspended) {
                }
            } catch (Throwable th2) {
                th = th2;
                snackbarHostState.setCurrentSnackbarData(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            str.unlock(null);
            throw th3;
        }
        snackbarHostState$showSnackbar$1 = new SnackbarHostState$showSnackbar$1(this, continuation);
        Object obj2 = snackbarHostState$showSnackbar$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snackbarHostState$showSnackbar$1.label;
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "actionLabel", "duration", "Landroidx/compose/material/SnackbarDuration;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material/SnackbarResult;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/CancellableContinuation;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material/SnackbarDuration;", "getMessage", "dismiss", "", "performAction", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {
        private final String actionLabel;
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarDuration duration;
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(String message, String str, SnackbarDuration duration, CancellableContinuation<? super SnackbarResult> continuation) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.message = message;
            this.actionLabel = str;
            this.duration = duration;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                Result.Companion companion = Result.Companion;
                this.continuation.resumeWith(Result.m7271constructorimpl(SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                Result.Companion companion = Result.Companion;
                this.continuation.resumeWith(Result.m7271constructorimpl(SnackbarResult.Dismissed));
            }
        }
    }
}
