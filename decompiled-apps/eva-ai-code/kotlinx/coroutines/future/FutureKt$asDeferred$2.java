package kotlinx.coroutines.future;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CompletionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import retrofit2.Platform$$ExternalSyntheticApiModelOutline0;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, "value", "exception", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class FutureKt$asDeferred$2 extends Lambda implements Function2<T, Throwable, Object> {
    final /* synthetic */ CompletableDeferred<T> $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$asDeferred$2(CompletableDeferred<T> completableDeferred) {
        super(2);
        this.$result = completableDeferred;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th) {
        return invoke2((FutureKt$asDeferred$2) obj, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r0 = r0.getCause();
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(T t, Throwable th) {
        boolean completeExceptionally;
        Throwable cause;
        try {
            if (th == null) {
                completeExceptionally = this.$result.complete(t);
            } else {
                CompletableDeferred<T> completableDeferred = this.$result;
                CompletionException m9076m = Platform$$ExternalSyntheticApiModelOutline0.m9083m((Object) th) ? Platform$$ExternalSyntheticApiModelOutline0.m9076m((Object) th) : null;
                if (m9076m != null && cause != null) {
                    th = cause;
                }
                completeExceptionally = completableDeferred.completeExceptionally(th);
            }
            return Boolean.valueOf(completeExceptionally);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th2);
            return Unit.INSTANCE;
        }
    }
}
