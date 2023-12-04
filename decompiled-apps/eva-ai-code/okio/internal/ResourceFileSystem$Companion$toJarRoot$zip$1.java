package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResourceFileSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "entry", "Lokio/internal/ZipEntry;", "invoke", "(Lokio/internal/ZipEntry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ResourceFileSystem$Companion$toJarRoot$zip$1 extends Lambda implements Function1<ZipEntry, Boolean> {
    public static final ResourceFileSystem$Companion$toJarRoot$zip$1 INSTANCE = new ResourceFileSystem$Companion$toJarRoot$zip$1();

    ResourceFileSystem$Companion$toJarRoot$zip$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ZipEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
    }
}
