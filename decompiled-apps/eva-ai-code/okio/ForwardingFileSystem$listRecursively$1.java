package okio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ForwardingFileSystem.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokio/Path;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ForwardingFileSystem$listRecursively$1 extends Lambda implements Function1<Path, Path> {
    final /* synthetic */ ForwardingFileSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardingFileSystem$listRecursively$1(ForwardingFileSystem forwardingFileSystem) {
        super(1);
        this.this$0 = forwardingFileSystem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Path invoke(Path it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.onPathResult(it, "listRecursively");
    }
}
