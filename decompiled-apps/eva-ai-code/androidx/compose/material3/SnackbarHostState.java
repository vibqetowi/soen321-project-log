package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J9\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "()V", "<set-?>", "Landroidx/compose/material3/SnackbarData;", "currentSnackbarData", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "showSnackbar", "Landroidx/compose/material3/SnackbarResult;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SnackbarDataImpl", "SnackbarVisualsImpl", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, continuation);
    }

    public final Object showSnackbar(String str, String str2, boolean z, SnackbarDuration snackbarDuration, Continuation<? super SnackbarResult> continuation) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z, snackbarDuration), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:24:0x0072, B:26:0x009f), top: B:40:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showSnackbar(SnackbarVisuals snackbarVisuals, Continuation<? super SnackbarResult> continuation) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        SnackbarHostState snackbarHostState;
        SnackbarVisuals snackbarVisuals2;
        SnackbarHostState snackbarHostState2;
        Throwable th;
        Object result;
        Mutex mutex2;
        try {
            try {
                if (continuation instanceof SnackbarHostState$showSnackbar$2) {
                    snackbarHostState$showSnackbar$2 = (SnackbarHostState$showSnackbar$2) continuation;
                    if ((snackbarHostState$showSnackbar$2.label & Integer.MIN_VALUE) != 0) {
                        snackbarHostState$showSnackbar$2.label -= Integer.MIN_VALUE;
                        Object obj = snackbarHostState$showSnackbar$2.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = snackbarHostState$showSnackbar$2.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            mutex = this.mutex;
                            snackbarHostState$showSnackbar$2.L$0 = this;
                            snackbarHostState$showSnackbar$2.L$1 = snackbarVisuals;
                            snackbarHostState$showSnackbar$2.L$2 = mutex;
                            snackbarHostState$showSnackbar$2.label = 1;
                            if (mutex.lock(null, snackbarHostState$showSnackbar$2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            snackbarHostState = this;
                            snackbarVisuals2 = snackbarVisuals;
                        } else if (i != 1) {
                            if (i == 2) {
                                SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$22 = (SnackbarHostState$showSnackbar$2) snackbarHostState$showSnackbar$2.L$3;
                                mutex2 = (Mutex) snackbarHostState$showSnackbar$2.L$2;
                                SnackbarVisuals snackbarVisuals3 = (SnackbarVisuals) snackbarHostState$showSnackbar$2.L$1;
                                snackbarHostState2 = (SnackbarHostState) snackbarHostState$showSnackbar$2.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    snackbarHostState2.setCurrentSnackbarData(null);
                                    mutex2.unlock(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    snackbarHostState2.setCurrentSnackbarData(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            snackbarHostState = (SnackbarHostState) snackbarHostState$showSnackbar$2.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutex = (Mutex) snackbarHostState$showSnackbar$2.L$2;
                            snackbarVisuals2 = (SnackbarVisuals) snackbarHostState$showSnackbar$2.L$1;
                        }
                        snackbarHostState$showSnackbar$2.L$0 = snackbarHostState;
                        snackbarHostState$showSnackbar$2.L$1 = snackbarVisuals2;
                        snackbarHostState$showSnackbar$2.L$2 = mutex;
                        snackbarHostState$showSnackbar$2.L$3 = snackbarHostState$showSnackbar$2;
                        snackbarHostState$showSnackbar$2.label = 2;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$2), 1);
                        cancellableContinuationImpl.initCancellability();
                        snackbarHostState.setCurrentSnackbarData(new SnackbarDataImpl(snackbarVisuals2, cancellableContinuationImpl));
                        result = cancellableContinuationImpl.getResult();
                        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(snackbarHostState$showSnackbar$2);
                        }
                        if (result != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        snackbarHostState2 = snackbarHostState;
                        Mutex mutex3 = mutex;
                        obj = result;
                        mutex2 = mutex3;
                        snackbarHostState2.setCurrentSnackbarData(null);
                        mutex2.unlock(null);
                        return obj;
                    }
                }
                snackbarHostState$showSnackbar$2.L$0 = snackbarHostState;
                snackbarHostState$showSnackbar$2.L$1 = snackbarVisuals2;
                snackbarHostState$showSnackbar$2.L$2 = mutex;
                snackbarHostState$showSnackbar$2.L$3 = snackbarHostState$showSnackbar$2;
                snackbarHostState$showSnackbar$2.label = 2;
                CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(snackbarHostState$showSnackbar$2), 1);
                cancellableContinuationImpl2.initCancellability();
                snackbarHostState.setCurrentSnackbarData(new SnackbarDataImpl(snackbarVisuals2, cancellableContinuationImpl2));
                result = cancellableContinuationImpl2.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (result != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                snackbarHostState2 = snackbarHostState;
                th = th3;
                snackbarHostState2.setCurrentSnackbarData(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th4) {
            snackbarVisuals.unlock(null);
            throw th4;
        }
        snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(this, continuation);
        Object obj2 = snackbarHostState$showSnackbar$2.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = snackbarHostState$showSnackbar$2.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "actionLabel", "withDismissAction", "", "duration", "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getMessage", "getWithDismissAction", "()Z", "equals", "other", "", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String message, String str, boolean z, SnackbarDuration duration) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.message = message;
            this.actionLabel = str;
            this.withDismissAction = z;
            this.duration = duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return Intrinsics.areEqual(getMessage(), snackbarVisualsImpl.getMessage()) && Intrinsics.areEqual(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        public int hashCode() {
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return ((((hashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + UByte$$ExternalSyntheticBackport0.m(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "visuals", "Landroidx/compose/material3/SnackbarVisuals;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/material3/SnackbarResult;", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlinx/coroutines/CancellableContinuation;)V", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", "dismiss", "", "equals", "", "other", "", "hashCode", "", "performAction", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SnackbarDataImpl implements SnackbarData {
        private final CancellableContinuation<SnackbarResult> continuation;
        private final SnackbarVisuals visuals;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(SnackbarVisuals visuals, CancellableContinuation<? super SnackbarResult> continuation) {
            Intrinsics.checkNotNullParameter(visuals, "visuals");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.visuals = visuals;
            this.continuation = continuation;
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                Result.Companion companion = Result.Companion;
                this.continuation.resumeWith(Result.m7271constructorimpl(SnackbarResult.ActionPerformed));
            }
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                Result.Companion companion = Result.Companion;
                this.continuation.resumeWith(Result.m7271constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return Intrinsics.areEqual(getVisuals(), snackbarDataImpl.getVisuals()) && Intrinsics.areEqual(this.continuation, snackbarDataImpl.continuation);
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }
    }
}
