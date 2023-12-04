package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ModalBottomSheet.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ Function0<Unit> $animateToDismiss;
    final /* synthetic */ String $collapseActionLabel;
    final /* synthetic */ String $dismissActionLabel;
    final /* synthetic */ String $expandActionLabel;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SheetState $sheetState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1(SheetState sheetState, String str, String str2, String str3, Function0<Unit> function0, CoroutineScope coroutineScope) {
        super(1);
        this.$sheetState = sheetState;
        this.$dismissActionLabel = str;
        this.$expandActionLabel = str2;
        this.$collapseActionLabel = str3;
        this.$animateToDismiss = function0;
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
        SheetState sheetState = this.$sheetState;
        String str = this.$dismissActionLabel;
        String str2 = this.$expandActionLabel;
        String str3 = this.$collapseActionLabel;
        Function0<Unit> function0 = this.$animateToDismiss;
        CoroutineScope coroutineScope = this.$scope;
        SemanticsPropertiesKt.dismiss(semantics, str, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1$1$1(function0));
        if (sheetState.getCurrentValue() == SheetValue.PartiallyExpanded) {
            SemanticsPropertiesKt.expand(semantics, str2, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1$1$2(sheetState, coroutineScope, sheetState));
        } else if (sheetState.getHasPartiallyExpandedState()) {
            SemanticsPropertiesKt.collapse(semantics, str3, new ModalBottomSheet_androidKt$ModalBottomSheet$2$1$5$1$1$1$3(sheetState, coroutineScope));
        }
    }
}
