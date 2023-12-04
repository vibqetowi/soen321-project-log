package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: MotionLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
final class MotionLayoutKt$MotionLayoutCore$3$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function3<MotionLayoutScope, Composer, Integer, Unit> $content;
    final /* synthetic */ MotionLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MotionLayoutKt$MotionLayoutCore$3$2(Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, MotionLayoutScope motionLayoutScope, int i) {
        super(2);
        this.$content = function3;
        this.$scope = motionLayoutScope;
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
            this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 21) & 112) | 8));
        }
    }
}
