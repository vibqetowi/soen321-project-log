package androidx.compose.ui.tooling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ViewInfoUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/tooling/ViewInfo;", "invoke", "(Landroidx/compose/ui/tooling/ViewInfo;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ViewInfoUtilKt$filterTree$1 extends Lambda implements Function1<ViewInfo, Boolean> {
    public static final ViewInfoUtilKt$filterTree$1 INSTANCE = new ViewInfoUtilKt$filterTree$1();

    ViewInfoUtilKt$filterTree$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ViewInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
