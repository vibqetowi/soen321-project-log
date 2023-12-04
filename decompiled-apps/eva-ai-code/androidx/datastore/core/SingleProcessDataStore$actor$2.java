package androidx.datastore.core;

import androidx.core.app.NotificationCompat;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/SingleProcessDataStore$Message;", NotificationCompat.CATEGORY_MESSAGE, "", "ex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class SingleProcessDataStore$actor$2 extends Lambda implements Function2<SingleProcessDataStore.Message<T>, Throwable, Unit> {
    public static final SingleProcessDataStore$actor$2 INSTANCE = new SingleProcessDataStore$actor$2();

    SingleProcessDataStore$actor$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
        invoke((SingleProcessDataStore.Message) obj, th);
        return Unit.INSTANCE;
    }

    public final void invoke(SingleProcessDataStore.Message<T> msg, Throwable th) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg instanceof SingleProcessDataStore.Message.Update) {
            CompletableDeferred ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            ack.completeExceptionally(th);
        }
    }
}
