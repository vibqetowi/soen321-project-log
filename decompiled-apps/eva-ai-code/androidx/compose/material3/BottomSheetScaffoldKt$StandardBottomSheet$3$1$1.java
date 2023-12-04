package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ String $partialExpandActionLabel;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ boolean $sheetSwipeEnabled;
    final /* synthetic */ SheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(SheetState sheetState, boolean z, String str, String str2, String str3, CoroutineScope coroutineScope) {
        super(1);
        this.$state = sheetState;
        this.$sheetSwipeEnabled = z;
        this.$expandActionLabel = str;
        this.$partialExpandActionLabel = str2;
        this.$dismissActionLabel = str3;
        this.$scope = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SheetState sheetState = this.$state;
        boolean z = this.$sheetSwipeEnabled;
        String str = this.$expandActionLabel;
        String str2 = this.$partialExpandActionLabel;
        String str3 = this.$dismissActionLabel;
        CoroutineScope coroutineScope = this.$scope;
        if (sheetState.getSwipeableState$material3_release().getAnchors$material3_release().size() <= 1 || !z) {
            return;
        }
        if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
            if (sheetState.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                SemanticsPropertiesKt.expand(semantics, str, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1(coroutineScope, sheetState));
            }
        } else if (sheetState.getSwipeableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
            SemanticsPropertiesKt.collapse(semantics, str2, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$2(coroutineScope, sheetState));
        }
        if (sheetState.getSkipHiddenState$material3_release()) {
            return;
        }
        SemanticsPropertiesKt.dismiss(semantics, str3, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$3(coroutineScope, sheetState));
    }
}
