package kotlinx.coroutines.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExceptionsConstructor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LONGITUDE_EAST, "e", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ExceptionsConstructorKt$createConstructor$1$4 extends Lambda implements Function1<Throwable, Throwable> {
    final /* synthetic */ Constructor<?> $constructor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$createConstructor$1$4(Constructor<?> constructor) {
        super(1);
        this.$constructor = constructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(Throwable th) {
        Object newInstance = this.$constructor.newInstance(new Object[0]);
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
        Throwable th2 = (Throwable) newInstance;
        th2.initCause(th);
        return th2;
    }
}
