package kotlinx.coroutines.tasks;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.tasks.CancellationTokenSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TasksKt$awaitImpl$2$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CancellationTokenSource $cancellationTokenSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksKt$awaitImpl$2$2(CancellationTokenSource cancellationTokenSource) {
        super(1);
        this.$cancellationTokenSource = cancellationTokenSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$cancellationTokenSource.cancel();
    }
}
