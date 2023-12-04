package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropStack$1$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $backLayer;
    final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ Function4<Constraints, Float, Composer, Integer, Unit> $frontLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$BackdropStack$1$1(Function2<? super Composer, ? super Integer, Unit> function2, Function1<? super Constraints, Constraints> function1, Function4<? super Constraints, ? super Float, ? super Composer, ? super Integer, Unit> function4, int i) {
        super(2);
        this.$backLayer = function2;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = function4;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        return m1252invoke0kLqBqw(subcomposeMeasureScope, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m1252invoke0kLqBqw(SubcomposeMeasureScope SubcomposeLayout, long j) {
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        Placeable mo4545measureBRTryo0 = ((Measurable) CollectionsKt.first((List<? extends Object>) SubcomposeLayout.subcompose(BackdropLayers.Back, this.$backLayer))).mo4545measureBRTryo0(this.$calculateBackLayerConstraints.invoke(Constraints.m5539boximpl(j)).m5557unboximpl());
        List<Measurable> subcompose = SubcomposeLayout.subcompose(BackdropLayers.Front, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new BackdropScaffoldKt$BackdropStack$1$1$placeables$1(this.$frontLayer, j, mo4545measureBRTryo0.getHeight(), this.$$dirty)));
        ArrayList arrayList = new ArrayList(subcompose.size());
        int size = subcompose.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(subcompose.get(i).mo4545measureBRTryo0(j));
        }
        ArrayList arrayList2 = arrayList;
        int max = Math.max(Constraints.m5553getMinWidthimpl(j), mo4545measureBRTryo0.getWidth());
        int max2 = Math.max(Constraints.m5552getMinHeightimpl(j), mo4545measureBRTryo0.getHeight());
        int size2 = arrayList2.size();
        int i2 = max2;
        int i3 = max;
        for (int i4 = 0; i4 < size2; i4++) {
            Placeable placeable = (Placeable) arrayList2.get(i4);
            i3 = Math.max(i3, placeable.getWidth());
            i2 = Math.max(i2, placeable.getHeight());
        }
        return MeasureScope.CC.layout$default(SubcomposeLayout, i3, i2, null, new AnonymousClass2(mo4545measureBRTryo0, arrayList2), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
        final /* synthetic */ Placeable $backLayerPlaceable;
        final /* synthetic */ List<Placeable> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Placeable placeable, List<? extends Placeable> list) {
            super(1);
            this.$backLayerPlaceable = placeable;
            this.$placeables = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Placeable.PlacementScope layout) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.$backLayerPlaceable, 0, 0, 0.0f, 4, null);
            List<Placeable> list = this.$placeables;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Placeable.PlacementScope.placeRelative$default(layout, list.get(i), 0, 0, 0.0f, 4, null);
            }
        }
    }
}
