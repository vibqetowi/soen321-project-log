package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationRail.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "progress", "", "invoke", "(FLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItem$2$1 extends Lambda implements Function3<Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $styledLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailItem$2$1(boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i) {
        super(3);
        this.$alwaysShowLabel = z;
        this.$icon = function2;
        this.$styledLabel = function22;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Composer composer, Integer num) {
        invoke(f.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "C194@8606L179:NavigationRail.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (composer.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(670576792, i, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:191)");
            }
            if (this.$alwaysShowLabel) {
                f = 1.0f;
            }
            NavigationRailKt.NavigationRailItemBaselineLayout(this.$icon, this.$styledLabel, f, composer, (this.$$dirty >> 6) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
