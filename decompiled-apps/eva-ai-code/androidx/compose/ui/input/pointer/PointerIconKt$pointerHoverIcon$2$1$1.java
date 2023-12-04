package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PointerIconKt$pointerHoverIcon$2$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PointerIcon $icon;
    final /* synthetic */ Function1<PointerIcon, Unit> $onSetIcon;
    final /* synthetic */ boolean $overrideDescendants;
    final /* synthetic */ PointerIconModifierLocal $pointerIconModifierLocal;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PointerIconKt$pointerHoverIcon$2$1$1(PointerIconModifierLocal pointerIconModifierLocal, PointerIcon pointerIcon, boolean z, Function1<? super PointerIcon, Unit> function1) {
        super(0);
        this.$pointerIconModifierLocal = pointerIconModifierLocal;
        this.$icon = pointerIcon;
        this.$overrideDescendants = z;
        this.$onSetIcon = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$pointerIconModifierLocal.updateValues(this.$icon, this.$overrideDescendants, this.$onSetIcon);
    }
}
