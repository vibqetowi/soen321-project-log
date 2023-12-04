package androidx.compose.ui.tooling;

import androidx.compose.ui.layout.LayoutInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ShadowViewInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/LayoutInfo;", "Landroidx/compose/ui/tooling/ShadowViewInfo;", "candidate", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ShadowViewInfoKt$stitchTrees$1$1 extends Lambda implements Function1<ShadowViewInfo, List<? extends Pair<? extends LayoutInfo, ? extends ShadowViewInfo>>> {
    final /* synthetic */ Map<LayoutInfo, List<Pair<LayoutInfo, ShadowViewInfo>>> $shadowNodesWithLayoutInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShadowViewInfoKt$stitchTrees$1$1(Map<LayoutInfo, ? extends List<? extends Pair<? extends LayoutInfo, ShadowViewInfo>>> map) {
        super(1);
        this.$shadowNodesWithLayoutInfo = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Pair<LayoutInfo, ShadowViewInfo>> invoke(ShadowViewInfo candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        Map<LayoutInfo, List<Pair<LayoutInfo, ShadowViewInfo>>> map = this.$shadowNodesWithLayoutInfo;
        LayoutInfo layoutInfo = candidate.getLayoutInfo();
        List<Pair<LayoutInfo, ShadowViewInfo>> list = map.get(layoutInfo != null ? layoutInfo.getParentInfo() : null);
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
