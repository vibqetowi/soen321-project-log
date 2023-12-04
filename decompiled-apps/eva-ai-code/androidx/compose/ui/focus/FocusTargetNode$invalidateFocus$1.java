package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FocusTargetNode.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusTargetNode$invalidateFocus$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Ref.ObjectRef<FocusProperties> $focusProperties;
    final /* synthetic */ FocusTargetNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusTargetNode$invalidateFocus$1(Ref.ObjectRef<FocusProperties> objectRef, FocusTargetNode focusTargetNode) {
        super(0);
        this.$focusProperties = objectRef;
        this.this$0 = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.focus.FocusProperties, T] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$focusProperties.element = this.this$0.fetchFocusProperties$ui_release();
    }
}
