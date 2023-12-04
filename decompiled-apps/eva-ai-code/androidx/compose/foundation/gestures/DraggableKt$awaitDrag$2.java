package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.input.pointer.util.VelocityTrackerKt;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.SendChannel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt$awaitDrag$2 extends Lambda implements Function1<PointerInputChange, Unit> {
    final /* synthetic */ SendChannel<DragEvent> $channel;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ VelocityTracker $velocityTracker;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraggableKt$awaitDrag$2(VelocityTracker velocityTracker, SendChannel<? super DragEvent> sendChannel, boolean z) {
        super(1);
        this.$velocityTracker = velocityTracker;
        this.$channel = sendChannel;
        this.$reverseDirection = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
        invoke2(pointerInputChange);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PointerInputChange event) {
        Intrinsics.checkNotNullParameter(event, "event");
        VelocityTrackerKt.addPointerInputChange(this.$velocityTracker, event);
        if (PointerEventKt.changedToUpIgnoreConsumed(event)) {
            return;
        }
        long positionChange = PointerEventKt.positionChange(event);
        event.consume();
        SendChannel<DragEvent> sendChannel = this.$channel;
        if (this.$reverseDirection) {
            positionChange = Offset.m3025timestuRUvjQ(positionChange, -1.0f);
        }
        sendChannel.mo8817trySendJP2dKIU(new DragEvent.DragDelta(positionChange, null));
    }
}
