package kotlinx.coroutines.future;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0018\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00018\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/future/ContinuationHandler;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/function/BiFunction;", "", "", "cont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "apply", "result", "exception", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ContinuationHandler<T> implements BiFunction<T, Throwable, Unit> {
    public volatile Continuation<? super T> cont;

    public ContinuationHandler(Continuation<? super T> continuation) {
        this.cont = continuation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.BiFunction
    public /* bridge */ /* synthetic */ Unit apply(Object obj, Throwable th) {
        apply2((ContinuationHandler<T>) obj, th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
        r2 = r2.getCause();
     */
    /* renamed from: apply  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void apply2(T t, Throwable th) {
        Throwable cause;
        Continuation<? super T> continuation = this.cont;
        if (continuation == null) {
            return;
        }
        if (th == null) {
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m7271constructorimpl(t));
            return;
        }
        CompletionException m9076m = Platform$$ExternalSyntheticApiModelOutline0.m9083m((Object) th) ? Platform$$ExternalSyntheticApiModelOutline0.m9076m((Object) th) : null;
        if (m9076m != null && cause != null) {
            th = cause;
        }
        Result.Companion companion2 = Result.Companion;
        continuation.resumeWith(Result.m7271constructorimpl(ResultKt.createFailure(th)));
    }
}
