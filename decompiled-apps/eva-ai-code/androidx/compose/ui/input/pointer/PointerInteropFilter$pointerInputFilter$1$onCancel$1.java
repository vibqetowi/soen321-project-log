package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements Function1<MotionEvent, Unit> {
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.this$0.getOnTouchEvent().invoke(motionEvent);
    }
}
