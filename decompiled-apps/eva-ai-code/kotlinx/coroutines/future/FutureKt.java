package kotlinx.coroutines.future;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.grpc.alts.CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a!\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a[\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u0018\u0010\u0016\u001a\u00020\u0004*\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"asCompletableFuture", "Ljava/util/concurrent/CompletableFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/Deferred;", "", "Lkotlinx/coroutines/Job;", "asDeferred", "Ljava/util/concurrent/CompletionStage;", "await", "(Ljava/util/concurrent/CompletionStage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "future", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", TtmlNode.START, "Lkotlinx/coroutines/CoroutineStart;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Ljava/util/concurrent/CompletableFuture;", "setupCancellation", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FutureKt {
    public static /* synthetic */ CompletableFuture future$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> CompletableFuture<T> future(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        if (!(!coroutineStart.isLazy())) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        CoroutineContext newCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        CompletableFuture<T> m9075m = Platform$$ExternalSyntheticApiModelOutline0.m9075m();
        CompletableFutureCoroutine completableFutureCoroutine = new CompletableFutureCoroutine(newCoroutineContext, m9075m);
        m9075m.handle(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7226m((Object) completableFutureCoroutine));
        completableFutureCoroutine.start(coroutineStart, completableFutureCoroutine, function2);
        return m9075m;
    }

    public static final <T> CompletableFuture<T> asCompletableFuture(Deferred<? extends T> deferred) {
        CompletableFuture<T> m9075m = Platform$$ExternalSyntheticApiModelOutline0.m9075m();
        setupCancellation(deferred, m9075m);
        deferred.invokeOnCompletion(new FutureKt$asCompletableFuture$1(m9075m, deferred));
        return m9075m;
    }

    public static final CompletableFuture<Unit> asCompletableFuture(Job job) {
        CompletableFuture<Unit> m9075m = Platform$$ExternalSyntheticApiModelOutline0.m9075m();
        setupCancellation(job, m9075m);
        job.invokeOnCompletion(new FutureKt$asCompletableFuture$2(m9075m));
        return m9075m;
    }

    private static final void setupCancellation(final Job job, CompletableFuture<?> completableFuture) {
        completableFuture.handle((BiFunction<? super Object, Throwable, ? extends U>) new BiFunction() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda7
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Unit unit;
                unit = FutureKt.setupCancellation$lambda$2(Job.this, obj, (Throwable) obj2);
                return unit;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupCancellation$lambda$2(Job job, Object obj, Throwable th) {
        if (th != null) {
            r2 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r2 == null) {
                r2 = ExceptionsKt.CancellationException("CompletableFuture was completed exceptionally", th);
            }
        }
        job.cancel(r2);
        return Unit.INSTANCE;
    }

    public static final <T> Deferred<T> asDeferred(CompletionStage<T> completionStage) {
        CompletableFuture completableFuture;
        boolean isDone;
        Throwable cause;
        Object obj;
        completableFuture = completionStage.toCompletableFuture();
        isDone = completableFuture.isDone();
        if (isDone) {
            try {
                obj = completableFuture.get();
                return CompletableDeferredKt.CompletableDeferred(obj);
            } catch (Throwable th) {
                th = th;
                ExecutionException executionException = th instanceof ExecutionException ? th : null;
                if (executionException != null && (cause = executionException.getCause()) != null) {
                    th = cause;
                }
                CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                CompletableDeferred$default.completeExceptionally(th);
                return CompletableDeferred$default;
            }
        }
        CompletableDeferred CompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final FutureKt$asDeferred$2 futureKt$asDeferred$2 = new FutureKt$asDeferred$2(CompletableDeferred$default2);
        completionStage.handle(new BiFunction() { // from class: kotlinx.coroutines.future.FutureKt$$ExternalSyntheticLambda6
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                Object invoke;
                invoke = Function2.this.invoke(obj2, (Throwable) obj3);
                return invoke;
            }
        });
        JobKt.cancelFutureOnCompletion(CompletableDeferred$default2, completableFuture);
        return CompletableDeferred$default2;
    }

    public static final <T> Object await(CompletionStage<T> completionStage, Continuation<? super T> continuation) {
        CompletableFuture completableFuture;
        boolean isDone;
        Object obj;
        completableFuture = completionStage.toCompletableFuture();
        isDone = completableFuture.isDone();
        if (isDone) {
            try {
                obj = completableFuture.get();
                return obj;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        ContinuationHandler continuationHandler = new ContinuationHandler(cancellableContinuationImpl2);
        completionStage.handle(CheckGcpEnvironment$$ExternalSyntheticApiModelOutline0.m7226m((Object) continuationHandler));
        cancellableContinuationImpl2.invokeOnCancellation(new FutureKt$await$2$1(completableFuture, continuationHandler));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
