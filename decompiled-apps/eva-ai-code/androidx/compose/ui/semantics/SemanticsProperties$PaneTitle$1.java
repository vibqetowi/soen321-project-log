package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SemanticsProperties$PaneTitle$1 extends Lambda implements Function2<String, String, String> {
    public static final SemanticsProperties$PaneTitle$1 INSTANCE = new SemanticsProperties$PaneTitle$1();

    SemanticsProperties$PaneTitle$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
    }
}
