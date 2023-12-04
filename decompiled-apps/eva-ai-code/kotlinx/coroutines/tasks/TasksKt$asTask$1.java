package kotlinx.coroutines.tasks;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;
/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TasksKt$asTask$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CancellationTokenSource $cancellation;
    final /* synthetic */ TaskCompletionSource<T> $source;
    final /* synthetic */ Deferred<T> $this_asTask;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TasksKt$asTask$1(CancellationTokenSource cancellationTokenSource, Deferred<? extends T> deferred, TaskCompletionSource<T> taskCompletionSource) {
        super(1);
        this.$cancellation = cancellationTokenSource;
        this.$this_asTask = deferred;
        this.$source = taskCompletionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (th instanceof CancellationException) {
            this.$cancellation.cancel();
            return;
        }
        Throwable completionExceptionOrNull = this.$this_asTask.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            this.$source.setResult(this.$this_asTask.getCompleted());
            return;
        }
        TaskCompletionSource<T> taskCompletionSource = this.$source;
        RuntimeExecutionException runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
        if (runtimeExecutionException == null) {
            runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
        }
        taskCompletionSource.setException(runtimeExecutionException);
    }
}
