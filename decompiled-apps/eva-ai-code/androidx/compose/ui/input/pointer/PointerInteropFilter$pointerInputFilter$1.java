package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\tH\u0016J-\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "shareWithSiblings", "", "getShareWithSiblings", "()Z", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "dispatchToView", "", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onCancel", "onPointerEvent", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "reset", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4447onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        boolean z3 = false;
        if (!this.this$0.getDisallowIntercept$ui_release()) {
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z2 = false;
                    break;
                }
                PointerInputChange pointerInputChange = changes.get(i);
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    z2 = true;
                    break;
                }
                i++;
            }
            if (!z2) {
                z = false;
                if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
                    if (pass == PointerEventPass.Initial && z) {
                        dispatchToView(pointerEvent);
                    }
                    if (pass == PointerEventPass.Final && !z) {
                        dispatchToView(pointerEvent);
                    }
                }
                if (pass != PointerEventPass.Final) {
                    int size2 = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            z3 = true;
                            break;
                        } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z3) {
                        reset();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = true;
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
        }
        if (pass != PointerEventPass.Final) {
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.this$0));
            reset();
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        boolean z;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (changes.get(i).isConsumed()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                if (layoutCoordinates$ui_release != null) {
                    PointerInteropUtils_androidKt.m4485toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release.mo4554localToRootMKHz9U(Offset.Companion.m3034getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.this$0));
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 != null) {
            PointerInteropUtils_androidKt.m4486toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release2.mo4554localToRootMKHz9U(Offset.Companion.m3034getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.this$0));
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
                InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
                if (internalPointerEvent$ui_release == null) {
                    return;
                }
                internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }
}
