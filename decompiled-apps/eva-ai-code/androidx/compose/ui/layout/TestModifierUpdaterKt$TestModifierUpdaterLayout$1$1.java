package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TestModifierUpdater.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/node/LayoutNode;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends Lambda implements Function1<LayoutNode, Unit> {
    final /* synthetic */ Function1<TestModifierUpdater, Unit> $onAttached;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(Function1<? super TestModifierUpdater, Unit> function1) {
        super(1);
        this.$onAttached = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutNode layoutNode) {
        invoke2(layoutNode);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutNode init) {
        Intrinsics.checkNotNullParameter(init, "$this$init");
        this.$onAttached.invoke(new TestModifierUpdater(init));
    }
}
