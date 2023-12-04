package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ListItemKt$ListItem$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ Alignment.Vertical $boxAlignment;
    final /* synthetic */ Arrangement.Vertical $columnArrangement;
    final /* synthetic */ PaddingValues $contentPaddingValues;
    final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedHeadlineContent;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $decoratedLeadingContent;
    final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedOverlineContent;
    final /* synthetic */ Function2<Composer, Integer, Unit> $decoratedSupportingContent;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $decoratedTrailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, PaddingValues paddingValues, Alignment.Vertical vertical, Arrangement.Vertical vertical2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
        super(3);
        this.$decoratedLeadingContent = function3;
        this.$contentPaddingValues = paddingValues;
        this.$boxAlignment = vertical;
        this.$columnArrangement = vertical2;
        this.$decoratedTrailingContent = function32;
        this.$decoratedOverlineContent = function2;
        this.$decoratedHeadlineContent = function22;
        this.$decoratedSupportingContent = function23;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope ListItem, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ListItem, "$this$ListItem");
        ComposerKt.sourceInformation(composer, "C165@6917L487,181@7465L26:ListItem.kt#uh7d8r");
        if ((i & 14) == 0) {
            i |= composer.changed(ListItem) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1813277157, i, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:161)");
            }
            composer.startReplaceableGroup(1316674963);
            ComposerKt.sourceInformation(composer, "163@6873L25");
            Function3<RowScope, Composer, Integer, Unit> function3 = this.$decoratedLeadingContent;
            if (function3 != null) {
                function3.invoke(ListItem, composer, Integer.valueOf(i & 14));
            }
            composer.endReplaceableGroup();
            Modifier align = ListItem.align(PaddingKt.padding(RowScope.CC.weight$default(ListItem, Modifier.Companion, 1.0f, false, 2, null), this.$contentPaddingValues), this.$boxAlignment);
            Arrangement.Vertical vertical = this.$columnArrangement;
            Function2<Composer, Integer, Unit> function2 = this.$decoratedOverlineContent;
            Function2<Composer, Integer, Unit> function22 = this.$decoratedHeadlineContent;
            Function2<Composer, Integer, Unit> function23 = this.$decoratedSupportingContent;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3913L61,78@3979L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(align);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693704, "C79@4027L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 984343928, "C175@7255L26:ListItem.kt#uh7d8r");
            composer.startReplaceableGroup(984343928);
            ComposerKt.sourceInformation(composer, "173@7202L26");
            if (function2 != null) {
                function2.invoke(composer, 0);
            }
            composer.endReplaceableGroup();
            function22.invoke(composer, 6);
            composer.startReplaceableGroup(1316675435);
            ComposerKt.sourceInformation(composer, "177@7352L28");
            if (function23 != null) {
                function23.invoke(composer, 0);
            }
            composer.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            Function3<RowScope, Composer, Integer, Unit> function32 = this.$decoratedTrailingContent;
            if (function32 != null) {
                function32.invoke(ListItem, composer, Integer.valueOf(i & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
