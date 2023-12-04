package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingKt$absolutePadding$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ float $bottom;
    final /* synthetic */ float $left;
    final /* synthetic */ float $right;
    final /* synthetic */ float $top;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$absolutePadding$1(float f, float f2, float f3, float f4) {
        super(1);
        this.$left = f;
        this.$top = f2;
        this.$right = f3;
        this.$bottom = f4;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(InspectorInfo $receiver) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        $receiver.setName("absolutePadding");
        $receiver.getProperties().set("left", Dp.m5605boximpl(this.$left));
        $receiver.getProperties().set(ViewHierarchyConstants.DIMENSION_TOP_KEY, Dp.m5605boximpl(this.$top));
        $receiver.getProperties().set(TtmlNode.RIGHT, Dp.m5605boximpl(this.$right));
        $receiver.getProperties().set("bottom", Dp.m5605boximpl(this.$bottom));
    }
}
