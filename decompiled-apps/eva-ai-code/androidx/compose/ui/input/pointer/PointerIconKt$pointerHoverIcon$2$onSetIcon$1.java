package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PointerIconKt$pointerHoverIcon$2$onSetIcon$1 extends Lambda implements Function1<PointerIcon, Unit> {
    final /* synthetic */ PointerIconService $pointerIconService;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$2$onSetIcon$1(PointerIconService pointerIconService) {
        super(1);
        this.$pointerIconService = pointerIconService;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointerIcon pointerIcon) {
        invoke2(pointerIcon);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PointerIcon pointerIcon) {
        this.$pointerIconService.setIcon(pointerIcon);
    }
}
