package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MotionEventAdapter.android.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ(\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0010J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0014\u0010(\u001a\u00020\u001f*\u00020\u00152\u0006\u0010!\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "()V", "canHover", "Landroid/util/SparseBooleanArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "nextId", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "previousSource", "", "previousToolType", "addFreshIds", "", "motionEvent", "Landroid/view/MotionEvent;", "clearOnDeviceChange", "convertToPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "convertToPointerInputEvent$ui_release", "createPointerInputEventData", FirebaseAnalytics.Param.INDEX, "pressed", "", "endStream", "pointerId", "getComposePointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "motionEventPointerId", "getComposePointerId-_I2yYro", "(I)J", "removeStaleIds", "hasPointerId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MotionEventAdapter {
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray canHover = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int i;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i2, (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i2++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i) {
        this.canHover.delete(i);
        this.motionEventToComposePointerIdMap.delete(i);
    }

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(keyAt);
                }
            }
        }
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getComposePointerId-_I2yYro  reason: not valid java name */
    private final long m4357getComposePointerId_I2yYro(int i) {
        long j;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            j = this.nextId;
            this.nextId = 1 + j;
            this.motionEventToComposePointerIdMap.put(i, j);
        }
        return PointerId.m4407constructorimpl(j);
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.canHover.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int i, boolean z) {
        long j;
        long mo4507localToScreenMKHz9U;
        long m4358toRawOffsetdBAh8RU;
        long mo4508screenToLocalMKHz9U;
        int toolType;
        int m4506getUnknownT8wyACA;
        int historySize;
        int i2;
        long m3034getZeroF1C5BW0;
        long m4357getComposePointerId_I2yYro = m4357getComposePointerId_I2yYro(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long Offset = OffsetKt.Offset(motionEvent.getX(i), motionEvent.getY(i));
        if (i == 0) {
            m4358toRawOffsetdBAh8RU = OffsetKt.Offset(motionEvent.getRawX(), motionEvent.getRawY());
            mo4508screenToLocalMKHz9U = positionCalculator.mo4508screenToLocalMKHz9U(m4358toRawOffsetdBAh8RU);
        } else if (Build.VERSION.SDK_INT >= 29) {
            m4358toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m4358toRawOffsetdBAh8RU(motionEvent, i);
            mo4508screenToLocalMKHz9U = positionCalculator.mo4508screenToLocalMKHz9U(m4358toRawOffsetdBAh8RU);
        } else {
            j = Offset;
            mo4507localToScreenMKHz9U = positionCalculator.mo4507localToScreenMKHz9U(Offset);
            toolType = motionEvent.getToolType(i);
            if (toolType != 0) {
                m4506getUnknownT8wyACA = PointerType.Companion.m4506getUnknownT8wyACA();
            } else if (toolType == 1) {
                m4506getUnknownT8wyACA = PointerType.Companion.m4505getTouchT8wyACA();
            } else if (toolType == 2) {
                m4506getUnknownT8wyACA = PointerType.Companion.m4504getStylusT8wyACA();
            } else if (toolType == 3) {
                m4506getUnknownT8wyACA = PointerType.Companion.m4503getMouseT8wyACA();
            } else if (toolType == 4) {
                m4506getUnknownT8wyACA = PointerType.Companion.m4502getEraserT8wyACA();
            } else {
                m4506getUnknownT8wyACA = PointerType.Companion.m4506getUnknownT8wyACA();
            }
            int i3 = m4506getUnknownT8wyACA;
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            for (i2 = 0; i2 < historySize; i2++) {
                float historicalX = motionEvent.getHistoricalX(i, i2);
                float historicalY = motionEvent.getHistoricalY(i, i2);
                if ((Float.isInfinite(historicalX) || Float.isNaN(historicalX)) ? false : true) {
                    if ((Float.isInfinite(historicalY) || Float.isNaN(historicalY)) ? false : true) {
                        arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i2), OffsetKt.Offset(historicalX, historicalY), null));
                    }
                }
            }
            if (motionEvent.getActionMasked() != 8) {
                m3034getZeroF1C5BW0 = OffsetKt.Offset(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
            } else {
                m3034getZeroF1C5BW0 = Offset.Companion.m3034getZeroF1C5BW0();
            }
            return new PointerInputEventData(m4357getComposePointerId_I2yYro, motionEvent.getEventTime(), mo4507localToScreenMKHz9U, j, z, pressure, i3, this.canHover.get(motionEvent.getPointerId(i), false), arrayList, m3034getZeroF1C5BW0, null);
        }
        mo4507localToScreenMKHz9U = m4358toRawOffsetdBAh8RU;
        j = mo4508screenToLocalMKHz9U;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
        }
        int i32 = m4506getUnknownT8wyACA;
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        while (i2 < historySize) {
        }
        if (motionEvent.getActionMasked() != 8) {
        }
        return new PointerInputEventData(m4357getComposePointerId_I2yYro, motionEvent.getEventTime(), mo4507localToScreenMKHz9U, j, z, pressure, i32, this.canHover.get(motionEvent.getPointerId(i), false), arrayList2, m3034getZeroF1C5BW0, null);
    }
}
