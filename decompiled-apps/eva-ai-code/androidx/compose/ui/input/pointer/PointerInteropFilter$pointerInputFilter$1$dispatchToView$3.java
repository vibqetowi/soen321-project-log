package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "motionEvent", "Landroid/view/MotionEvent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerInteropFilter$pointerInputFilter$1$dispatchToView$3 extends Lambda implements Function1<MotionEvent, Unit> {
    final /* synthetic */ PointerInteropFilter$pointerInputFilter$1 this$0;
    final /* synthetic */ PointerInteropFilter this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1, PointerInteropFilter pointerInteropFilter) {
        super(1);
        this.this$0 = pointerInteropFilter$pointerInputFilter$1;
        this.this$1 = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
        invoke2(motionEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MotionEvent motionEvent) {
        PointerInteropFilter.DispatchToViewState dispatchToViewState;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (motionEvent.getActionMasked() == 0) {
            PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.this$0;
            if (this.this$1.getOnTouchEvent().invoke(motionEvent).booleanValue()) {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.Dispatching;
            } else {
                dispatchToViewState = PointerInteropFilter.DispatchToViewState.NotDispatching;
            }
            pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
            return;
        }
        this.this$1.getOnTouchEvent().invoke(motionEvent);
    }
}
