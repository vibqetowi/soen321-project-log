package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintLayoutKt$ConstraintLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function3<ConstraintLayoutScope, Composer, Integer, Unit> $content;
    final /* synthetic */ Function0<Unit> $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, Function3<? super ConstraintLayoutScope, ? super Composer, ? super Integer, Unit> function3, int i, Function0<Unit> function0) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$content = function3;
        this.$$changed = i;
        this.$onHelpersChanged = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if (((i & 11) ^ 2) != 0 || !composer.getSkipping()) {
            int helpersHashCode = this.$scope.getHelpersHashCode();
            this.$scope.reset();
            this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 3) & 112) | 8));
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
