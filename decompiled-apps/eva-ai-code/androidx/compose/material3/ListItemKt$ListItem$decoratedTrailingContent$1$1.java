package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$decoratedTrailingContent$1$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $it;
    final /* synthetic */ int $listItemType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$decoratedTrailingContent$1$1(ListItemColors listItemColors, int i, int i2, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(3);
        this.$colors = listItemColors;
        this.$$dirty = i;
        this.$listItemType = i2;
        this.$it = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope rowScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$null");
        ComposerKt.sourceInformation(composer, "C128@5421L33,127@5366L205:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i |= composer.changed(rowScope) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1392069445, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:126)");
            }
            ListItemKt.m1853TrailingContent3IgeMak(rowScope, this.$colors.trailingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m3301unboximpl(), ListItemType.m1862equalsimpl0(this.$listItemType, ListItemType.Companion.m1869getThreeLineAlXitO8()), this.$it, composer, i & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
