package androidx.compose.material3;

import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$decoratedOverlineContent$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$decoratedOverlineContent$1$1(ListItemColors listItemColors, int i, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(2);
        this.$colors = listItemColors;
        this.$$dirty = i;
        this.$it = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C103@4618L15,102@4568L154:ListItem.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764441232, i, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:101)");
            }
            ListItemKt.m1852ProvideTextStyleFromToken3JVO9M(this.$colors.overlineColor$material3_release(composer, (this.$$dirty >> 18) & 14).getValue().m3301unboximpl(), ListTokens.INSTANCE.getListItemOverlineFont(), this.$it, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
