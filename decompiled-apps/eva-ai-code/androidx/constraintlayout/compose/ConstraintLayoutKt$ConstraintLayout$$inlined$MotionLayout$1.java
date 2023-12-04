package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed$inlined;
    final /* synthetic */ Function2 $content$inlined;
    final /* synthetic */ MotionLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout$1(MotionLayoutScope motionLayoutScope, int i, Function2 function2, int i2) {
        super(2);
        this.$scope = motionLayoutScope;
        this.$content$inlined = function2;
        this.$$changed$inlined = i2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$content$inlined.invoke(composer, Integer.valueOf((this.$$changed$inlined >> 18) & 14));
        }
    }
}
