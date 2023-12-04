package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Switch.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwitchKt$Switch$valueToOffset$1$1 extends Lambda implements Function1<Boolean, Float> {
    final /* synthetic */ float $maxBound;
    final /* synthetic */ float $minBound;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$valueToOffset$1$1(float f, float f2) {
        super(1);
        this.$maxBound = f;
        this.$minBound = f2;
    }

    public final Float invoke(boolean z) {
        return Float.valueOf(z ? this.$maxBound : this.$minBound);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
