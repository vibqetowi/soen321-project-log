package androidx.compose.material3.internal;

import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Placeable> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(List<? extends Placeable> list) {
        super(1);
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
        int lastIndex = CollectionsKt.getLastIndex(this.$placeables);
        if (lastIndex < 0) {
            return;
        }
        int i = 0;
        while (true) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$placeables.get(i), 0, 0, 0.0f, 4, null);
            if (i == lastIndex) {
                return;
            }
            i++;
        }
    }
}
