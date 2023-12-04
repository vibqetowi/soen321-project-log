package androidx.compose.material3;

import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Badge.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BadgeKt$BadgedBox$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $anchorPlaceable;
    final /* synthetic */ Placeable $badgePlaceable;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeKt$BadgedBox$2$measure$1(Placeable placeable, MeasureScope measureScope, Placeable placeable2) {
        super(1);
        this.$badgePlaceable = placeable;
        this.$this_Layout = measureScope;
        this.$anchorPlaceable = placeable2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        boolean z = this.$badgePlaceable.getWidth() > this.$this_Layout.mo582roundToPx0680j_4(BadgeTokens.INSTANCE.m2286getSizeD9Ej5fM());
        float badgeWithContentHorizontalOffset = z ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeOffset();
        float badgeWithContentVerticalOffset = z ? BadgeKt.getBadgeWithContentVerticalOffset() : BadgeKt.getBadgeOffset();
        Placeable.PlacementScope.placeRelative$default(layout, this.$anchorPlaceable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(layout, this.$badgePlaceable, this.$anchorPlaceable.getWidth() + this.$this_Layout.mo582roundToPx0680j_4(badgeWithContentHorizontalOffset), ((-this.$badgePlaceable.getHeight()) / 2) + this.$this_Layout.mo582roundToPx0680j_4(badgeWithContentVerticalOffset), 0.0f, 4, null);
    }
}
