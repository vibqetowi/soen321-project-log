package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarKt$SearchBar$animatedShape$1$1 extends Lambda implements Function3<Path, Size, LayoutDirection, Unit> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$animatedShape$1$1(Density density, State<Float> state) {
        super(3);
        this.$density = density;
        this.$animationProgress = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
        m1963invoke12SF9DM(path, size.m3092unboximpl(), layoutDirection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-12SF9DM  reason: not valid java name */
    public final void m1963invoke12SF9DM(Path $receiver, long j, LayoutDirection layoutDirection) {
        float f;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        Density density = this.$density;
        State<Float> state = this.$animationProgress;
        f = SearchBarKt.SearchBarCornerRadius;
        $receiver.addRoundRect(RoundRectKt.m3073RoundRectsniSvfs(SizeKt.m3108toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(density.mo588toPx0680j_4(Dp.m5607constructorimpl(f * (1 - state.getValue().floatValue()))), 0.0f, 2, null)));
    }
}
