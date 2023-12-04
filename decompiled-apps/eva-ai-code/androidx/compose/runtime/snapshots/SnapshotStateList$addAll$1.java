package androidx.compose.runtime.snapshots;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SnapshotStateList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SnapshotStateList$addAll$1 extends Lambda implements Function1<List<T>, Boolean> {
    final /* synthetic */ Collection<T> $elements;
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateList$addAll$1(int i, Collection<? extends T> collection) {
        super(1);
        this.$index = i;
        this.$elements = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<T> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.addAll(this.$index, this.$elements));
    }
}
