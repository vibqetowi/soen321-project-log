package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SelectionMagnifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1 extends Lambda implements Function0<Offset> {
    final /* synthetic */ State<Offset> $animatedCenter$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionMagnifierKt$animatedSelectionMagnifier$1$1$1(State<Offset> state) {
        super(0);
        this.$animatedCenter$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Offset invoke() {
        return Offset.m3007boximpl(m1173invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
    public final long m1173invokeF1C5BW0() {
        long invoke$lambda$0;
        invoke$lambda$0 = SelectionMagnifierKt$animatedSelectionMagnifier$1.invoke$lambda$0(this.$animatedCenter$delegate);
        return invoke$lambda$0;
    }
}
