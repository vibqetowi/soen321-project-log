package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/material3/SheetState;", "savedValue", "Landroidx/compose/material3/SheetValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SheetState$Companion$Saver$2 extends Lambda implements Function1<SheetValue, SheetState> {
    final /* synthetic */ Function1<SheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ boolean $skipPartiallyExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SheetState$Companion$Saver$2(boolean z, Function1<? super SheetValue, Boolean> function1) {
        super(1);
        this.$skipPartiallyExpanded = z;
        this.$confirmValueChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SheetState invoke(SheetValue savedValue) {
        Intrinsics.checkNotNullParameter(savedValue, "savedValue");
        return new SheetState(this.$skipPartiallyExpanded, savedValue, this.$confirmValueChange, false, 8, null);
    }
}
