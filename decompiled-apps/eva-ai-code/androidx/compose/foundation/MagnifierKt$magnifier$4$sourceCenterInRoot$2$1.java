package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Magnifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends Lambda implements Function0<Offset> {
    final /* synthetic */ MutableState<Offset> $anchorPositionInRoot$delegate;
    final /* synthetic */ Density $density;
    final /* synthetic */ State<Function1<Density, Offset>> $updatedSourceCenter$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(Density density, State<? extends Function1<? super Density, Offset>> state, MutableState<Offset> mutableState) {
        super(0);
        this.$density = density;
        this.$updatedSourceCenter$delegate = state;
        this.$anchorPositionInRoot$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Offset invoke() {
        return Offset.m3007boximpl(m480invokeF1C5BW0());
    }

    /* renamed from: invoke-F1C5BW0  reason: not valid java name */
    public final long m480invokeF1C5BW0() {
        Function1 invoke$lambda$3;
        invoke$lambda$3 = MagnifierKt$magnifier$4.invoke$lambda$3(this.$updatedSourceCenter$delegate);
        long m3028unboximpl = ((Offset) invoke$lambda$3.invoke(this.$density)).m3028unboximpl();
        if (OffsetKt.m3037isSpecifiedk4lQ0M(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate)) && OffsetKt.m3037isSpecifiedk4lQ0M(m3028unboximpl)) {
            return Offset.m3023plusMKHz9U(MagnifierKt$magnifier$4.invoke$lambda$1(this.$anchorPositionInRoot$delegate), m3028unboximpl);
        }
        return Offset.Companion.m3033getUnspecifiedF1C5BW0();
    }
}
