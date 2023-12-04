package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Recomposer$effectJob$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Job job;
        CancellableContinuation cancellableContinuation;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        boolean z;
        CancellableContinuation cancellableContinuation2;
        CancellableContinuation cancellableContinuation3;
        CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            job = recomposer.runnerJob;
            cancellableContinuation = null;
            if (job != null) {
                mutableStateFlow2 = recomposer._state;
                mutableStateFlow2.setValue(Recomposer.State.ShuttingDown);
                z = recomposer.isClosed;
                if (z) {
                    cancellableContinuation2 = recomposer.workContinuation;
                    if (cancellableContinuation2 != null) {
                        cancellableContinuation3 = recomposer.workContinuation;
                        recomposer.workContinuation = null;
                        job.invokeOnCompletion(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                        cancellableContinuation = cancellableContinuation3;
                    }
                } else {
                    job.cancel(CancellationException);
                }
                cancellableContinuation3 = null;
                recomposer.workContinuation = null;
                job.invokeOnCompletion(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                cancellableContinuation = cancellableContinuation3;
            } else {
                recomposer.closeCause = CancellationException;
                mutableStateFlow = recomposer._state;
                mutableStateFlow.setValue(Recomposer.State.ShutDown);
                Unit unit = Unit.INSTANCE;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7271constructorimpl(Unit.INSTANCE));
        }
    }
}
