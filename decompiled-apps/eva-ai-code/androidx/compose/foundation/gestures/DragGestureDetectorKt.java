package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\u0015H\u0082Hø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012\u001ag\u0010\u001b\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d26\u0010\u001e\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0\u001fH\u0080@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a_\u0010'\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001026\u0010(\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a'\u0010+\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0012\u001a]\u0010-\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010/\u001a\u00020\u00162\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u001fH\u0080Hø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a_\u00103\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001026\u0010(\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u001100¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b4\u0010*\u001a'\u00105\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b6\u0010\u0012\u001ag\u00107\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d26\u0010(\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0\u001fH\u0080@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b8\u0010&\u001a_\u00109\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001026\u0010(\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b:\u0010*\u001a\u0086\u0001\u0010;\u001a\u00020$*\u00020<2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u00152\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020$0?2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020$0?26\u0010A\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u001100¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010C\u001a\u0086\u0001\u0010D\u001a\u00020$*\u00020<2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u00152\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020$0?2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020$0?26\u0010A\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u001100¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010C\u001a\u0086\u0001\u0010E\u001a\u00020$*\u00020<2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u00152\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020$0?2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020$0?26\u0010F\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010C\u001a\u0086\u0001\u0010G\u001a\u00020$*\u00020<2\u0014\b\u0002\u0010=\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020$0\u00152\u000e\b\u0002\u0010>\u001a\b\u0012\u0004\u0012\u00020$0?2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020$0?26\u0010H\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020$0\u001fH\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u0010C\u001a9\u0010I\u001a\u00020\u0016*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\u0015H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bJ\u0010\u0018\u001ac\u0010I\u001a\u0004\u0018\u00010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\u00152\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\u00152\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\u0015H\u0080Hø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a9\u0010O\u001a\u00020\u0016*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\u0015H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0018\u001a!\u0010Q\u001a\u00020\u0016*\u00020R2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bS\u0010T\u001a!\u0010U\u001a\u00020\u000b*\u00020V2\u0006\u0010\u001c\u001a\u00020\u001dH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\f\u0010Y\u001a\u00020\u0001*\u00020ZH\u0000\u001a9\u0010[\u001a\u00020\u0016*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0\u0015H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\\\u0010\u0018\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\b\"\u0013\u0010\t\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\b\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006]"}, d2 = {"HorizontalPointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getHorizontalPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "VerticalPointerDirectionConfig", "getVerticalPointerDirectionConfig", "defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitDragOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "awaitDragOrCancellation-rnUCldI", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDragOrUp", "hasDragged", "Lkotlin/Function1;", "", "awaitDragOrUp-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalDragOrCancellation", "awaitHorizontalDragOrCancellation-rnUCldI", "awaitHorizontalPointerSlopOrCancellation", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalTouchSlopOrCancellation", "onTouchSlopReached", "awaitHorizontalTouchSlopOrCancellation-jO51t88", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitLongPressOrCancellation", "awaitLongPressOrCancellation-rnUCldI", "awaitPointerSlopOrCancellation", "pointerDirectionConfig", "triggerOnMainAxisSlop", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-wtdNQyU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILandroidx/compose/foundation/gestures/PointerDirectionConfig;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitTouchSlopOrCancellation", "awaitTouchSlopOrCancellation-jO51t88", "awaitVerticalDragOrCancellation", "awaitVerticalDragOrCancellation-rnUCldI", "awaitVerticalPointerSlopOrCancellation", "awaitVerticalPointerSlopOrCancellation-gDDlDlE", "awaitVerticalTouchSlopOrCancellation", "awaitVerticalTouchSlopOrCancellation-jO51t88", "detectDragGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDragStart", "onDragEnd", "Lkotlin/Function0;", "onDragCancel", "onDrag", "dragAmount", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPress", "detectHorizontalDragGestures", "onHorizontalDrag", "detectVerticalDragGestures", "onVerticalDrag", "drag", "drag-jO51t88", "motionFromChange", "motionConsumed", "drag-VnAYq1g", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "horizontalDrag", "horizontalDrag-jO51t88", "isPointerUp", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "toPointerDirectionConfig", "Landroidx/compose/foundation/gestures/Orientation;", "verticalDrag", "verticalDrag-jO51t88", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: mainAxisDelta-k-4lQ0M  reason: not valid java name */
        public float mo540mainAxisDeltak4lQ0M(long j) {
            return Offset.m3018getXimpl(j);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: crossAxisDelta-k-4lQ0M  reason: not valid java name */
        public float mo539crossAxisDeltak4lQ0M(long j) {
            return Offset.m3019getYimpl(j);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: offsetFromChanges-dBAh8RU  reason: not valid java name */
        public long mo541offsetFromChangesdBAh8RU(float f, float f2) {
            return OffsetKt.Offset(f, f2);
        }
    };
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: mainAxisDelta-k-4lQ0M */
        public float mo540mainAxisDeltak4lQ0M(long j) {
            return Offset.m3019getYimpl(j);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: crossAxisDelta-k-4lQ0M */
        public float mo539crossAxisDeltak4lQ0M(long j) {
            return Offset.m3018getXimpl(j);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: offsetFromChanges-dBAh8RU */
        public long mo541offsetFromChangesdBAh8RU(float f, float f2) {
            return OffsetKt.Offset(f2, f);
        }
    };
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0152 -> B:100:0x00be). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x01b7 -> B:140:0x01c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x0202 -> B:144:0x01cd). Please submit an issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m528awaitTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        PointerDirectionConfig pointerDirectionConfig;
        Ref.LongRef longRef;
        int i2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
        Object obj;
        float f;
        float f2;
        float f3;
        int i3;
        PointerDirectionConfig pointerDirectionConfig2;
        Object obj2;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
        float f4;
        float f5;
        float f6;
        int size;
        int i4;
        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$14;
        Object obj3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f7 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$2;
                        float f8 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$1;
                        f4 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                        int i6 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.I$0;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                        ResultKt.throwOnFailure(obj4);
                        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$15 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                        f6 = f7;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                        obj2 = coroutine_suspended;
                        f5 = f8;
                        function22 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                        i3 = i6;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$15;
                        PointerEvent pointerEvent = (PointerEvent) obj4;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                            }
                            i4++;
                            obj2 = obj3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$14;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    } else if (i == 2) {
                        float f9 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$2;
                        float f10 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$1;
                        float f11 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.F$0;
                        int i7 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.I$0;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$4;
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$3;
                        ResultKt.throwOnFailure(obj4);
                        f3 = f9;
                        char c = 2;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$2;
                        i3 = i7;
                        pointerDirectionConfig = (PointerDirectionConfig) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$1;
                        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$16 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                        f = f10;
                        function22 = (Function2) dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.L$0;
                        obj = coroutine_suspended;
                        f2 = f11;
                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$16;
                        if (!pointerInputChange4.isConsumed()) {
                            longRef = longRef2;
                            i2 = i3;
                            i5 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.I$0 = i2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f2;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$1 = f;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                                return obj;
                            }
                            float f12 = f;
                            f6 = f3;
                            obj4 = awaitPointerEvent$default;
                            i3 = i2;
                            pointerDirectionConfig2 = pointerDirectionConfig;
                            obj2 = obj;
                            dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$12;
                            f4 = f2;
                            f5 = f12;
                            PointerEvent pointerEvent2 = (PointerEvent) obj4;
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            size = changes2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    dragGestureDetectorKt$awaitTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                    obj3 = obj2;
                                    pointerInputChange = null;
                                    break;
                                }
                                pointerInputChange = changes2.get(i4);
                                obj3 = obj2;
                                dragGestureDetectorKt$awaitTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$13;
                                if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                                    break;
                                }
                                i4++;
                                obj2 = obj3;
                                dragGestureDetectorKt$awaitTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$14;
                            }
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                                if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                    int size2 = changes3.size();
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= size2) {
                                            pointerInputChange3 = null;
                                            break;
                                        }
                                        pointerInputChange3 = changes3.get(i8);
                                        if (pointerInputChange3.getPressed()) {
                                            break;
                                        }
                                        i8++;
                                    }
                                    PointerInputChange pointerInputChange5 = pointerInputChange3;
                                    if (pointerInputChange5 != null) {
                                        longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                        obj = obj3;
                                        f3 = f6;
                                        f = f5;
                                        f2 = f4;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i2 = i3;
                                        i5 = 1;
                                        pointerEventPass = null;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$14;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.I$0 = i2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$1 = f;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$2 = f3;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                                        if (awaitPointerEvent$default != obj) {
                                        }
                                    }
                                } else {
                                    long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                                    long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                                    float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f5;
                                    float mo539crossAxisDeltak4lQ0M = f6 + (pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                                    if (i3 != 0) {
                                        m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                                    } else {
                                        m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                                    }
                                    if (m3016getDistanceimpl < f4) {
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$17 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$14;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.L$0 = function22;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.L$1 = pointerDirectionConfig2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.L$3 = longRef;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.L$4 = pointerInputChange2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.I$0 = i3;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.F$0 = f4;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.F$1 = mo540mainAxisDeltak4lQ0M;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.F$2 = mo539crossAxisDeltak4lQ0M;
                                        c = 2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$17.label = 2;
                                        Object obj5 = obj3;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitTouchSlopOrCancellation$17) == obj5) {
                                            return obj5;
                                        }
                                        f2 = f4;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$17;
                                        obj = obj5;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        longRef2 = longRef;
                                        pointerInputChange4 = pointerInputChange2;
                                        f = mo540mainAxisDeltak4lQ0M;
                                        f3 = mo539crossAxisDeltak4lQ0M;
                                        if (!pointerInputChange4.isConsumed()) {
                                        }
                                    } else {
                                        Object obj6 = obj3;
                                        DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitTouchSlopOrCancellation$18 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$14;
                                        if (i3 != 0) {
                                            m3022minusMKHz9U = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f4), mo539crossAxisDeltak4lQ0M);
                                        } else {
                                            long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                            m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f4));
                                        }
                                        function22.invoke(pointerInputChange2, Offset.m3007boximpl(m3022minusMKHz9U));
                                        if (pointerInputChange2.isConsumed()) {
                                            return pointerInputChange2;
                                        }
                                        f2 = f4;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$18;
                                        obj = obj6;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i2 = i3;
                                        f3 = 0.0f;
                                        f = 0.0f;
                                        i5 = 1;
                                        pointerEventPass = null;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.I$0 = i2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f2;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$1 = f;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$2 = f3;
                                        dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                                        if (awaitPointerEvent$default != obj) {
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj4);
                int m4505getTouchT8wyACA = PointerType.Companion.m4505getTouchT8wyACA();
                PointerDirectionConfig pointerDirectionConfig3 = HorizontalPointerDirectionConfig;
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m4505getTouchT8wyACA);
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                pointerDirectionConfig = pointerDirectionConfig3;
                longRef = longRef3;
                i2 = 0;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1;
                obj = coroutine_suspended;
                f = 0.0f;
                f2 = m537pointerSlopE8SPZFQ;
                f3 = 0.0f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.I$0 = i2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$0 = f2;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$1 = f;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.F$2 = f3;
                dragGestureDetectorKt$awaitTouchSlopOrCancellation$12.label = i5;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitTouchSlopOrCancellation$12, i5, pointerEventPass);
                if (awaitPointerEvent$default != obj) {
                }
            }
        }
        dragGestureDetectorKt$awaitTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(continuation);
        Object obj42 = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitTouchSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x004a -> B:45:0x004d). Please submit an issue!!! */
    /* renamed from: drag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m534dragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$drag$1 dragGestureDetectorKt$drag$1;
        int i;
        PointerInputChange pointerInputChange;
        if (continuation instanceof DragGestureDetectorKt$drag$1) {
            dragGestureDetectorKt$drag$1 = (DragGestureDetectorKt$drag$1) continuation;
            if ((dragGestureDetectorKt$drag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$drag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                    dragGestureDetectorKt$drag$1.L$1 = function1;
                    dragGestureDetectorKt$drag$1.label = 1;
                    obj = m519awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                    if (obj == coroutine_suspended) {
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    function1 = (Function1) dragGestureDetectorKt$drag$1.L$1;
                    awaitPointerEventScope = (AwaitPointerEventScope) dragGestureDetectorKt$drag$1.L$0;
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            return Boxing.boxBoolean(true);
                        }
                        function1.invoke(pointerInputChange);
                        j = pointerInputChange.m4425getIdJ3iCeTQ();
                        dragGestureDetectorKt$drag$1.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$drag$1.L$1 = function1;
                        dragGestureDetectorKt$drag$1.label = 1;
                        obj = m519awaitDragOrCancellationrnUCldI(awaitPointerEventScope, j, dragGestureDetectorKt$drag$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        if (pointerInputChange == null) {
                            return Boxing.boxBoolean(false);
                        }
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$1 = new DragGestureDetectorKt$drag$1(continuation);
        Object obj2 = dragGestureDetectorKt$drag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00cd, code lost:
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0069 -> B:83:0x006e). Please submit an issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m519awaitDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitDragOrCancellation$1 dragGestureDetectorKt$awaitDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitDragOrCancellation$1) {
            dragGestureDetectorKt$awaitDragOrCancellation$1 = (DragGestureDetectorKt$awaitDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitDragOrCancellation$1.L$1;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size2) {
                                        pointerInputChange2 = null;
                                        break;
                                    }
                                    pointerInputChange2 = changes2.get(i3);
                                    if (pointerInputChange2.getPressed()) {
                                        break;
                                    }
                                    i3++;
                                }
                                PointerInputChange pointerInputChange4 = pointerInputChange2;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.m4425getIdJ3iCeTQ();
                                    longRef = longRef2;
                                }
                            }
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                            dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef3 = longRef;
                            obj = awaitPointerEvent$default;
                            longRef2 = longRef3;
                            PointerEvent pointerEvent2 = (PointerEvent) obj;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 < size3) {
                                }
                                i22++;
                            }
                            PointerInputChange pointerInputChange32 = pointerInputChange;
                            if (pointerInputChange32 == null) {
                                pointerInputChange32 = null;
                            }
                        }
                        if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                            z = false;
                        }
                        if (z) {
                            return pointerInputChange32;
                        }
                        return null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitDragOrCancellation$1 = new DragGestureDetectorKt$awaitDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitDragOrCancellation$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = DragGestureDetectorKt$detectDragGestures$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = DragGestureDetectorKt$detectDragGestures$4.INSTANCE;
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1, function2, function02, function0, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$4.INSTANCE;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, function2, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0151 -> B:100:0x00bb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x01b3 -> B:140:0x01bc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x01fe -> B:144:0x01c7). Please submit an issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m531awaitVerticalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        PointerDirectionConfig pointerDirectionConfig;
        int i2;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
        Object obj;
        float f;
        float f2;
        float f3;
        int i3;
        PointerDirectionConfig pointerDirectionConfig2;
        Object obj2;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
        float f4;
        float f5;
        float f6;
        int size;
        int i4;
        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange3;
        int i5;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
                int i6 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f7 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$2;
                        float f8 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                        f4 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                        int i7 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.I$0;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$15 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                        f6 = f7;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                        obj2 = coroutine_suspended;
                        f5 = f8;
                        function22 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                        i3 = i7;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$15;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                            }
                            i4++;
                            size = i5;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    } else if (i == 2) {
                        float f9 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$2;
                        float f10 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$1;
                        float f11 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.F$0;
                        int i8 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.I$0;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$4;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$3;
                        ResultKt.throwOnFailure(obj3);
                        f3 = f9;
                        char c = 2;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$2;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$1;
                        i3 = i8;
                        obj = coroutine_suspended;
                        f2 = f11;
                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                        f = f10;
                        function22 = (Function2) dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.L$0;
                        if (!pointerInputChange4.isConsumed()) {
                            pointerDirectionConfig = pointerDirectionConfig2;
                            i2 = i3;
                            i6 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.I$0 = i2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f2;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i6;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i6, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                                return obj;
                            }
                            float f12 = f;
                            f6 = f3;
                            obj3 = awaitPointerEvent$default;
                            i3 = i2;
                            pointerDirectionConfig2 = pointerDirectionConfig;
                            obj2 = obj;
                            dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12;
                            f4 = f2;
                            f5 = f12;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            size = changes2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                    pointerInputChange = null;
                                    break;
                                }
                                pointerInputChange = changes2.get(i4);
                                i5 = size;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13;
                                if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                                    break;
                                }
                                i4++;
                                size = i5;
                                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                            }
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                                if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                    int size2 = changes3.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size2) {
                                            pointerInputChange3 = null;
                                            break;
                                        }
                                        pointerInputChange3 = changes3.get(i9);
                                        if (pointerInputChange3.getPressed()) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    PointerInputChange pointerInputChange5 = pointerInputChange3;
                                    if (pointerInputChange5 != null) {
                                        longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                        f3 = f6;
                                        f = f5;
                                        f2 = f4;
                                        obj = obj2;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i2 = i3;
                                        i6 = 1;
                                        pointerEventPass = null;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.I$0 = i2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$2 = f3;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i6;
                                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i6, pointerEventPass);
                                        if (awaitPointerEvent$default != obj) {
                                        }
                                    }
                                } else {
                                    long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                                    long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                                    float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f5;
                                    float mo539crossAxisDeltak4lQ0M = f6 + (pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                                    if (i3 != 0) {
                                        m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                                    } else {
                                        m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                                    }
                                    if (m3016getDistanceimpl >= f4) {
                                        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$16 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                                        if (i3 != 0) {
                                            m3022minusMKHz9U = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f4), mo539crossAxisDeltak4lQ0M);
                                        } else {
                                            long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                            m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f4));
                                        }
                                        function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3019getYimpl(m3022minusMKHz9U)));
                                        if (pointerInputChange2.isConsumed()) {
                                            return pointerInputChange2;
                                        }
                                        f2 = f4;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$16;
                                        obj = obj2;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i2 = i3;
                                        f3 = 0.0f;
                                        f = 0.0f;
                                        i6 = 1;
                                        pointerEventPass = null;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.I$0 = i2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$2 = f3;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i6;
                                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i6, pointerEventPass);
                                        if (awaitPointerEvent$default != obj) {
                                        }
                                    } else {
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                        DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$14;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.L$0 = function22;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.L$1 = pointerDirectionConfig2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.L$3 = longRef;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.L$4 = pointerInputChange2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.I$0 = i3;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.F$0 = f4;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.F$1 = mo540mainAxisDeltak4lQ0M;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.F$2 = mo539crossAxisDeltak4lQ0M;
                                        c = 2;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17.label = 2;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17) == obj2) {
                                            return obj2;
                                        }
                                        f2 = f4;
                                        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$17;
                                        obj = obj2;
                                        pointerInputChange4 = pointerInputChange2;
                                        f = mo540mainAxisDeltak4lQ0M;
                                        f3 = mo539crossAxisDeltak4lQ0M;
                                        if (!pointerInputChange4.isConsumed()) {
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj3);
                int m4505getTouchT8wyACA = PointerType.Companion.m4505getTouchT8wyACA();
                PointerDirectionConfig pointerDirectionConfig3 = VerticalPointerDirectionConfig;
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m4505getTouchT8wyACA);
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                pointerDirectionConfig = pointerDirectionConfig3;
                i2 = 1;
                longRef = longRef2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1;
                obj = coroutine_suspended;
                f = 0.0f;
                f2 = m537pointerSlopE8SPZFQ;
                f3 = 0.0f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.I$0 = i2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$0 = f2;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$1 = f;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.F$2 = f3;
                dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12.label = i6;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$12, i6, pointerEventPass);
                if (awaitPointerEvent$default != obj) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalTouchSlopOrCancellation$1.label;
        int i62 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x014e -> B:144:0x01c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x01ac -> B:140:0x01b8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x01f9 -> B:144:0x01c2). Please submit an issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m530awaitVerticalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        float f;
        int i3;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12;
        Object obj;
        float f2;
        PointerDirectionConfig pointerDirectionConfig;
        float f3;
        int i4;
        PointerDirectionConfig pointerDirectionConfig2;
        float f4;
        float f5;
        int size;
        int i5;
        Object obj2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange3;
        int i6;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
                int i7 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f6 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$2;
                        float f7 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                        float f8 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                        int i8 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.I$0;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                        f5 = f6;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                        f = f8;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$13;
                        f4 = f7;
                        function22 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                        i4 = i8;
                        obj = coroutine_suspended;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size) {
                            }
                            i5++;
                            size = i6;
                            obj = obj2;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i7 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.I$0 = i3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i7;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i7, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                            }
                        }
                        return null;
                    } else if (i2 == 2) {
                        float f9 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$2;
                        float f10 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$1;
                        float f11 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.F$0;
                        int i9 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.I$0;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$4;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$3;
                        ResultKt.throwOnFailure(obj3);
                        f3 = f9;
                        char c = 2;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$2;
                        float f12 = f11;
                        i3 = i9;
                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                        obj = coroutine_suspended;
                        pointerDirectionConfig = (PointerDirectionConfig) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$1;
                        f2 = f10;
                        function22 = (Function2) dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.L$0;
                        if (!pointerInputChange4.isConsumed()) {
                            f = f12;
                            i7 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.I$0 = i3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i7;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i7, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                                return obj;
                            }
                            float f13 = f2;
                            f5 = f3;
                            obj3 = awaitPointerEvent$default;
                            i4 = i3;
                            pointerDirectionConfig2 = pointerDirectionConfig;
                            f4 = f13;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            size = changes2.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size) {
                                    obj2 = obj;
                                    pointerInputChange = null;
                                    break;
                                }
                                pointerInputChange = changes2.get(i5);
                                obj2 = obj;
                                i6 = size;
                                if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                                    break;
                                }
                                i5++;
                                size = i6;
                                obj = obj2;
                            }
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                                if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                    int size2 = changes3.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= size2) {
                                            pointerInputChange3 = null;
                                            break;
                                        }
                                        pointerInputChange3 = changes3.get(i10);
                                        if (pointerInputChange3.getPressed()) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    PointerInputChange pointerInputChange5 = pointerInputChange3;
                                    if (pointerInputChange5 != null) {
                                        longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                        obj = obj2;
                                        f3 = f5;
                                        f2 = f4;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i3 = i4;
                                    }
                                } else {
                                    long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                                    long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                                    float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f4;
                                    float mo539crossAxisDeltak4lQ0M = f5 + (pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                                    if (i4 != 0) {
                                        m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                                    } else {
                                        m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                                    }
                                    if (m3016getDistanceimpl >= f) {
                                        obj = obj2;
                                        if (i4 != 0) {
                                            m3022minusMKHz9U = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f), mo539crossAxisDeltak4lQ0M);
                                        } else {
                                            long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                            m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f));
                                        }
                                        function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3019getYimpl(m3022minusMKHz9U)));
                                        if (pointerInputChange2.isConsumed()) {
                                            return pointerInputChange2;
                                        }
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i3 = i4;
                                        f3 = 0.0f;
                                        f2 = 0.0f;
                                    } else {
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerInputChange2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.I$0 = i4;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = mo540mainAxisDeltak4lQ0M;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$2 = mo539crossAxisDeltak4lQ0M;
                                        c = 2;
                                        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = 2;
                                        obj = obj2;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12) == obj) {
                                            return obj;
                                        }
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i3 = i4;
                                        f2 = mo540mainAxisDeltak4lQ0M;
                                        f3 = mo539crossAxisDeltak4lQ0M;
                                        float f14 = f;
                                        pointerInputChange4 = pointerInputChange2;
                                        f12 = f14;
                                        if (!pointerInputChange4.isConsumed()) {
                                        }
                                    }
                                }
                                i7 = 1;
                                pointerEventPass = null;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.I$0 = i3;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$2 = f3;
                                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i7;
                                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i7, pointerEventPass);
                                if (awaitPointerEvent$default != obj) {
                                }
                            }
                        }
                        return null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj3);
                PointerDirectionConfig pointerDirectionConfig3 = VerticalPointerDirectionConfig;
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                f = m537pointerSlopE8SPZFQ;
                i3 = 1;
                longRef = longRef2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1;
                obj = coroutine_suspended;
                f2 = 0.0f;
                pointerDirectionConfig = pointerDirectionConfig3;
                f3 = 0.0f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.I$0 = i3;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.F$2 = f3;
                dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12.label = i7;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$12, i7, pointerEventPass);
                if (awaitPointerEvent$default != obj) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1.label;
        int i72 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f1, code lost:
        if ((!r0) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x007f -> B:94:0x0085). Please submit an issue!!! */
    /* renamed from: verticalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m538verticalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object obj;
        DragGestureDetectorKt$verticalDrag$1 dragGestureDetectorKt$verticalDrag$12;
        Function1<? super PointerInputChange, Unit> function12;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object obj2;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DragGestureDetectorKt$verticalDrag$1) {
            dragGestureDetectorKt$verticalDrag$1 = (DragGestureDetectorKt$verticalDrag$1) continuation;
            if ((dragGestureDetectorKt$verticalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$verticalDrag$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$verticalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$verticalDrag$1.label;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    j2 = j;
                    if (!m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        obj = coroutine_suspended;
                        dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                        function12 = function1;
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        obj2 = obj;
                        longRef = longRef2;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$verticalDrag$12.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                        if (awaitPointerEvent$default == obj2) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                } else if (i == 1) {
                    longRef = (Ref.LongRef) dragGestureDetectorKt$verticalDrag$1.L$3;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$1;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$verticalDrag$12 = dragGestureDetectorKt$verticalDrag$1;
                    function12 = (Function1) dragGestureDetectorKt$verticalDrag$1.L$0;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$verticalDrag$1.L$2;
                    obj2 = coroutine_suspended;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange;
                    if (pointerInputChange4 == null) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            boolean z = Offset.m3019getYimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4)) == 0.0f;
                            pointerInputChange3 = pointerInputChange4;
                        } else {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i3);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i3++;
                            }
                            PointerInputChange pointerInputChange5 = pointerInputChange2;
                            pointerInputChange3 = pointerInputChange4;
                            if (pointerInputChange5 != null) {
                                longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                awaitPointerEventScope3 = awaitPointerEventScope5;
                                pointerEventPass = null;
                                dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                                dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                                dragGestureDetectorKt$verticalDrag$12.label = 1;
                                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                                if (awaitPointerEvent$default == obj2) {
                                    return obj2;
                                }
                                AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope3;
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                                awaitPointerEventScope5 = awaitPointerEventScope6;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        PointerInputChange pointerInputChange42 = pointerInputChange;
                        if (pointerInputChange42 == null) {
                            pointerInputChange3 = null;
                        }
                    }
                    if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                        pointerEventPass = null;
                    } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        pointerEventPass = pointerInputChange3;
                    } else {
                        function12.invoke(pointerInputChange3);
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        pointerEventPass = null;
                        obj = obj2;
                        j2 = pointerInputChange3.m4425getIdJ3iCeTQ();
                        Ref.LongRef longRef22 = new Ref.LongRef();
                        longRef22.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        obj2 = obj;
                        longRef = longRef22;
                        dragGestureDetectorKt$verticalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$verticalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$verticalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$verticalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$verticalDrag$12.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$verticalDrag$12, 1, pointerEventPass);
                        if (awaitPointerEvent$default == obj2) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$verticalDrag$1 = new DragGestureDetectorKt$verticalDrag$1(continuation);
        Object obj32 = dragGestureDetectorKt$verticalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$verticalDrag$1.label;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00da, code lost:
        if ((!(androidx.compose.ui.geometry.Offset.m3019getYimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0069 -> B:87:0x006e). Please submit an issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m529awaitVerticalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitVerticalDragOrCancellation$1 dragGestureDetectorKt$awaitVerticalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = (DragGestureDetectorKt$awaitVerticalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size2) {
                                        pointerInputChange2 = null;
                                        break;
                                    }
                                    pointerInputChange2 = changes2.get(i3);
                                    if (pointerInputChange2.getPressed()) {
                                        break;
                                    }
                                    i3++;
                                }
                                PointerInputChange pointerInputChange4 = pointerInputChange2;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.m4425getIdJ3iCeTQ();
                                    longRef = longRef2;
                                }
                            }
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                            dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef3 = longRef;
                            obj = awaitPointerEvent$default;
                            longRef2 = longRef3;
                            PointerEvent pointerEvent2 = (PointerEvent) obj;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 < size3) {
                                }
                                i22++;
                            }
                            PointerInputChange pointerInputChange32 = pointerInputChange;
                            if (pointerInputChange32 == null) {
                                pointerInputChange32 = null;
                            }
                        }
                        if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                            z = false;
                        }
                        if (z) {
                            return pointerInputChange32;
                        }
                        return null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitVerticalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitVerticalDragOrCancellation$1 = new DragGestureDetectorKt$awaitVerticalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitVerticalDragOrCancellation$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectVerticalDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = DragGestureDetectorKt$detectVerticalDragGestures$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = DragGestureDetectorKt$detectVerticalDragGestures$4.INSTANCE;
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0151 -> B:100:0x00bb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x01b3 -> B:140:0x01bc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x01fe -> B:144:0x01c7). Please submit an issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m523awaitHorizontalTouchSlopOrCancellationjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
        int i;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        PointerDirectionConfig pointerDirectionConfig;
        int i2;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
        Object obj;
        float f;
        float f2;
        float f3;
        int i3;
        PointerDirectionConfig pointerDirectionConfig2;
        Object obj2;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
        float f4;
        float f5;
        float f6;
        int size;
        int i4;
        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange3;
        int i5;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
                int i6 = 1;
                PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i == 1) {
                        float f7 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$2;
                        float f8 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                        f4 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                        int i7 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.I$0;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$15 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                        f6 = f7;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                        obj2 = coroutine_suspended;
                        f5 = f8;
                        function22 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                        i3 = i7;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$15;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                            }
                            i4++;
                            size = i5;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                        }
                        return null;
                    } else if (i == 2) {
                        float f9 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$2;
                        float f10 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$1;
                        float f11 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.F$0;
                        int i8 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.I$0;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$4;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$3;
                        ResultKt.throwOnFailure(obj3);
                        f3 = f9;
                        char c = 2;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$2;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$1;
                        i3 = i8;
                        obj = coroutine_suspended;
                        f2 = f11;
                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                        f = f10;
                        function22 = (Function2) dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.L$0;
                        if (!pointerInputChange4.isConsumed()) {
                            pointerDirectionConfig = pointerDirectionConfig2;
                            i2 = i3;
                            i6 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.I$0 = i2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f2;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i6;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i6, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                                return obj;
                            }
                            float f12 = f;
                            f6 = f3;
                            obj3 = awaitPointerEvent$default;
                            i3 = i2;
                            pointerDirectionConfig2 = pointerDirectionConfig;
                            obj2 = obj;
                            dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12;
                            f4 = f2;
                            f5 = f12;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            size = changes2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                    pointerInputChange = null;
                                    break;
                                }
                                pointerInputChange = changes2.get(i4);
                                i5 = size;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13;
                                if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                                    break;
                                }
                                i4++;
                                size = i5;
                                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                            }
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                                if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                    int size2 = changes3.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size2) {
                                            pointerInputChange3 = null;
                                            break;
                                        }
                                        pointerInputChange3 = changes3.get(i9);
                                        if (pointerInputChange3.getPressed()) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    PointerInputChange pointerInputChange5 = pointerInputChange3;
                                    if (pointerInputChange5 != null) {
                                        longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                        f3 = f6;
                                        f = f5;
                                        f2 = f4;
                                        obj = obj2;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i2 = i3;
                                        i6 = 1;
                                        pointerEventPass = null;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.I$0 = i2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$2 = f3;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i6;
                                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i6, pointerEventPass);
                                        if (awaitPointerEvent$default != obj) {
                                        }
                                    }
                                } else {
                                    long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                                    long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                                    float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f5;
                                    float mo539crossAxisDeltak4lQ0M = f6 + (pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                                    if (i3 != 0) {
                                        m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                                    } else {
                                        m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                                    }
                                    if (m3016getDistanceimpl >= f4) {
                                        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$16 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                                        if (i3 != 0) {
                                            m3022minusMKHz9U = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f4), mo539crossAxisDeltak4lQ0M);
                                        } else {
                                            long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                            m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f4));
                                        }
                                        function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3018getXimpl(m3022minusMKHz9U)));
                                        if (pointerInputChange2.isConsumed()) {
                                            return pointerInputChange2;
                                        }
                                        f2 = f4;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$16;
                                        obj = obj2;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i2 = i3;
                                        f3 = 0.0f;
                                        f = 0.0f;
                                        i6 = 1;
                                        pointerEventPass = null;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.I$0 = i2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$2 = f3;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i6;
                                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i6, pointerEventPass);
                                        if (awaitPointerEvent$default != obj) {
                                        }
                                    } else {
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                        DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$14;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.L$0 = function22;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.L$1 = pointerDirectionConfig2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.L$3 = longRef;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.L$4 = pointerInputChange2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.I$0 = i3;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.F$0 = f4;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.F$1 = mo540mainAxisDeltak4lQ0M;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.F$2 = mo539crossAxisDeltak4lQ0M;
                                        c = 2;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17.label = 2;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17) == obj2) {
                                            return obj2;
                                        }
                                        f2 = f4;
                                        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$17;
                                        obj = obj2;
                                        pointerInputChange4 = pointerInputChange2;
                                        f = mo540mainAxisDeltak4lQ0M;
                                        f3 = mo539crossAxisDeltak4lQ0M;
                                        if (!pointerInputChange4.isConsumed()) {
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj3);
                int m4505getTouchT8wyACA = PointerType.Companion.m4505getTouchT8wyACA();
                PointerDirectionConfig pointerDirectionConfig3 = HorizontalPointerDirectionConfig;
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), m4505getTouchT8wyACA);
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                pointerDirectionConfig = pointerDirectionConfig3;
                i2 = 1;
                longRef = longRef2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1;
                obj = coroutine_suspended;
                f = 0.0f;
                f2 = m537pointerSlopE8SPZFQ;
                f3 = 0.0f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.I$0 = i2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$0 = f2;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$1 = f;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.F$2 = f3;
                dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12.label = i6;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$12, i6, pointerEventPass);
                if (awaitPointerEvent$default != obj) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalTouchSlopOrCancellation$1.label;
        int i62 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x014e -> B:144:0x01c2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x01ac -> B:140:0x01b8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x01f9 -> B:144:0x01c2). Please submit an issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m522awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        float f;
        int i3;
        Ref.LongRef longRef;
        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12;
        Object obj;
        float f2;
        PointerDirectionConfig pointerDirectionConfig;
        float f3;
        int i4;
        PointerDirectionConfig pointerDirectionConfig2;
        float f4;
        float f5;
        int size;
        int i5;
        Object obj2;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange3;
        int i6;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i7 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f6 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$2;
                        float f7 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f8 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        int i8 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.I$0;
                        pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f5 = f6;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                        f = f8;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$13;
                        f4 = f7;
                        function22 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        i4 = i8;
                        obj = coroutine_suspended;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        i5 = 0;
                        while (true) {
                            if (i5 < size) {
                            }
                            i5++;
                            size = i6;
                            obj = obj2;
                        }
                        pointerInputChange2 = pointerInputChange;
                        if (pointerInputChange2 != null) {
                            if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                            }
                            i7 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.I$0 = i3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i7;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i7, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                            }
                        }
                        return null;
                    } else if (i2 == 2) {
                        float f9 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$2;
                        float f10 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f11 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        int i9 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.I$0;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$4;
                        longRef = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                        ResultKt.throwOnFailure(obj3);
                        f3 = f9;
                        char c = 2;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        float f12 = f11;
                        i3 = i9;
                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                        obj = coroutine_suspended;
                        pointerDirectionConfig = (PointerDirectionConfig) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        f2 = f10;
                        function22 = (Function2) dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        if (!pointerInputChange4.isConsumed()) {
                            f = f12;
                            i7 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.I$0 = i3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$2 = f3;
                            dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i7;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i7, pointerEventPass);
                            if (awaitPointerEvent$default != obj) {
                                return obj;
                            }
                            float f13 = f2;
                            f5 = f3;
                            obj3 = awaitPointerEvent$default;
                            i4 = i3;
                            pointerDirectionConfig2 = pointerDirectionConfig;
                            f4 = f13;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            size = changes2.size();
                            i5 = 0;
                            while (true) {
                                if (i5 < size) {
                                    obj2 = obj;
                                    pointerInputChange = null;
                                    break;
                                }
                                pointerInputChange = changes2.get(i5);
                                obj2 = obj;
                                i6 = size;
                                if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                                    break;
                                }
                                i5++;
                                size = i6;
                                obj = obj2;
                            }
                            pointerInputChange2 = pointerInputChange;
                            if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                                if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                    int size2 = changes3.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= size2) {
                                            pointerInputChange3 = null;
                                            break;
                                        }
                                        pointerInputChange3 = changes3.get(i10);
                                        if (pointerInputChange3.getPressed()) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    PointerInputChange pointerInputChange5 = pointerInputChange3;
                                    if (pointerInputChange5 != null) {
                                        longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                        obj = obj2;
                                        f3 = f5;
                                        f2 = f4;
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i3 = i4;
                                    }
                                } else {
                                    long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                                    long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                                    float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f4;
                                    float mo539crossAxisDeltak4lQ0M = f5 + (pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                                    if (i4 != 0) {
                                        m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                                    } else {
                                        m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M));
                                    }
                                    if (m3016getDistanceimpl >= f) {
                                        obj = obj2;
                                        if (i4 != 0) {
                                            m3022minusMKHz9U = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f), mo539crossAxisDeltak4lQ0M);
                                        } else {
                                            long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, mo539crossAxisDeltak4lQ0M);
                                            m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f));
                                        }
                                        function22.invoke(pointerInputChange2, Boxing.boxFloat(Offset.m3018getXimpl(m3022minusMKHz9U)));
                                        if (pointerInputChange2.isConsumed()) {
                                            return pointerInputChange2;
                                        }
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i3 = i4;
                                        f3 = 0.0f;
                                        f2 = 0.0f;
                                    } else {
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerInputChange2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.I$0 = i4;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = mo540mainAxisDeltak4lQ0M;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$2 = mo539crossAxisDeltak4lQ0M;
                                        c = 2;
                                        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = 2;
                                        obj = obj2;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12) == obj) {
                                            return obj;
                                        }
                                        pointerDirectionConfig = pointerDirectionConfig2;
                                        i3 = i4;
                                        f2 = mo540mainAxisDeltak4lQ0M;
                                        f3 = mo539crossAxisDeltak4lQ0M;
                                        float f14 = f;
                                        pointerInputChange4 = pointerInputChange2;
                                        f12 = f14;
                                        if (!pointerInputChange4.isConsumed()) {
                                        }
                                    }
                                }
                                i7 = 1;
                                pointerEventPass = null;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.I$0 = i3;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$2 = f3;
                                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i7;
                                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i7, pointerEventPass);
                                if (awaitPointerEvent$default != obj) {
                                }
                            }
                        }
                        return null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj3);
                PointerDirectionConfig pointerDirectionConfig3 = HorizontalPointerDirectionConfig;
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref.LongRef longRef2 = new Ref.LongRef();
                longRef2.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                f = m537pointerSlopE8SPZFQ;
                i3 = 1;
                longRef = longRef2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1;
                obj = coroutine_suspended;
                f2 = 0.0f;
                pointerDirectionConfig = pointerDirectionConfig3;
                f3 = 0.0f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = longRef;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.I$0 = i3;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.F$2 = f3;
                dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12.label = i7;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$12, i7, pointerEventPass);
                if (awaitPointerEvent$default != obj) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i72 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f1, code lost:
        if ((!r0) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x007f -> B:94:0x0085). Please submit an issue!!! */
    /* renamed from: horizontalDrag-jO51t88 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m535horizontalDragjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Continuation<? super Boolean> continuation) {
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$1;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object obj;
        DragGestureDetectorKt$horizontalDrag$1 dragGestureDetectorKt$horizontalDrag$12;
        Function1<? super PointerInputChange, Unit> function12;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object obj2;
        Ref.LongRef longRef;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        if (continuation instanceof DragGestureDetectorKt$horizontalDrag$1) {
            dragGestureDetectorKt$horizontalDrag$1 = (DragGestureDetectorKt$horizontalDrag$1) continuation;
            if ((dragGestureDetectorKt$horizontalDrag$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$horizontalDrag$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$horizontalDrag$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$horizontalDrag$1.label;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    j2 = j;
                    if (!m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        obj = coroutine_suspended;
                        dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                        function12 = function1;
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        obj2 = obj;
                        longRef = longRef2;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                        if (awaitPointerEvent$default == obj2) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                } else if (i == 1) {
                    longRef = (Ref.LongRef) dragGestureDetectorKt$horizontalDrag$1.L$3;
                    AwaitPointerEventScope awaitPointerEventScope4 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$1;
                    ResultKt.throwOnFailure(obj3);
                    dragGestureDetectorKt$horizontalDrag$12 = dragGestureDetectorKt$horizontalDrag$1;
                    function12 = (Function1) dragGestureDetectorKt$horizontalDrag$1.L$0;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$horizontalDrag$1.L$2;
                    obj2 = coroutine_suspended;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)) {
                            break;
                        }
                        i2++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange;
                    if (pointerInputChange4 == null) {
                        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            boolean z = Offset.m3018getXimpl(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange4)) == 0.0f;
                            pointerInputChange3 = pointerInputChange4;
                        } else {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i3);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i3++;
                            }
                            PointerInputChange pointerInputChange5 = pointerInputChange2;
                            pointerInputChange3 = pointerInputChange4;
                            if (pointerInputChange5 != null) {
                                longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                awaitPointerEventScope2 = awaitPointerEventScope4;
                                awaitPointerEventScope3 = awaitPointerEventScope5;
                                pointerEventPass = null;
                                dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                                dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                                dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                                dragGestureDetectorKt$horizontalDrag$12.label = 1;
                                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                                if (awaitPointerEvent$default == obj2) {
                                    return obj2;
                                }
                                AwaitPointerEventScope awaitPointerEventScope6 = awaitPointerEventScope3;
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                obj3 = awaitPointerEvent$default;
                                awaitPointerEventScope5 = awaitPointerEventScope6;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj3;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size3) {
                            }
                            i22++;
                        }
                        PointerInputChange pointerInputChange42 = pointerInputChange;
                        if (pointerInputChange42 == null) {
                            pointerInputChange3 = null;
                        }
                    }
                    if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                        pointerEventPass = null;
                    } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                        pointerEventPass = pointerInputChange3;
                    } else {
                        function12.invoke(pointerInputChange3);
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        pointerEventPass = null;
                        obj = obj2;
                        j2 = pointerInputChange3.m4425getIdJ3iCeTQ();
                        Ref.LongRef longRef22 = new Ref.LongRef();
                        longRef22.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        obj2 = obj;
                        longRef = longRef22;
                        dragGestureDetectorKt$horizontalDrag$12.L$0 = function12;
                        dragGestureDetectorKt$horizontalDrag$12.L$1 = awaitPointerEventScope2;
                        dragGestureDetectorKt$horizontalDrag$12.L$2 = awaitPointerEventScope3;
                        dragGestureDetectorKt$horizontalDrag$12.L$3 = longRef;
                        dragGestureDetectorKt$horizontalDrag$12.label = 1;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$horizontalDrag$12, 1, pointerEventPass);
                        if (awaitPointerEvent$default == obj2) {
                        }
                    }
                    return Boxing.boxBoolean(pointerEventPass == null);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        dragGestureDetectorKt$horizontalDrag$1 = new DragGestureDetectorKt$horizontalDrag$1(continuation);
        Object obj32 = dragGestureDetectorKt$horizontalDrag$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$horizontalDrag$1.label;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00da, code lost:
        if ((!(androidx.compose.ui.geometry.Offset.m3018getXimpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11)) == 0.0f)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0069 -> B:87:0x006e). Please submit an issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m521awaitHorizontalDragOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1;
        int i;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object awaitPointerEvent$default;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (continuation instanceof DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) {
            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = (DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        int size = changes.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                pointerInputChange = null;
                                break;
                            }
                            pointerInputChange = changes.get(i2);
                            if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef2.element)) {
                                break;
                            }
                            i2++;
                        }
                        PointerInputChange pointerInputChange3 = pointerInputChange;
                        if (pointerInputChange3 == null) {
                            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                                int size2 = changes2.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size2) {
                                        pointerInputChange2 = null;
                                        break;
                                    }
                                    pointerInputChange2 = changes2.get(i3);
                                    if (pointerInputChange2.getPressed()) {
                                        break;
                                    }
                                    i3++;
                                }
                                PointerInputChange pointerInputChange4 = pointerInputChange2;
                                if (pointerInputChange4 != null) {
                                    longRef2.element = pointerInputChange4.m4425getIdJ3iCeTQ();
                                    longRef = longRef2;
                                }
                            }
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                            dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Ref.LongRef longRef3 = longRef;
                            obj = awaitPointerEvent$default;
                            longRef2 = longRef3;
                            PointerEvent pointerEvent2 = (PointerEvent) obj;
                            List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                            int size3 = changes3.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 < size3) {
                                }
                                i22++;
                            }
                            PointerInputChange pointerInputChange32 = pointerInputChange;
                            if (pointerInputChange32 == null) {
                                pointerInputChange32 = null;
                            }
                        }
                        if (pointerInputChange32 == null || pointerInputChange32.isConsumed()) {
                            z = false;
                        }
                        if (z) {
                            return pointerInputChange32;
                        }
                        return null;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                longRef = new Ref.LongRef();
                longRef.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$0 = awaitPointerEventScope2;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.L$1 = longRef;
                dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label = 1;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1, 1, null);
                if (awaitPointerEvent$default != coroutine_suspended) {
                }
            }
        }
        dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1 = new DragGestureDetectorKt$awaitHorizontalDragOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitHorizontalDragOrCancellation$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = DragGestureDetectorKt$detectHorizontalDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i & 2) != 0) {
            function0 = DragGestureDetectorKt$detectHorizontalDragGestures$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i & 4) != 0) {
            function02 = DragGestureDetectorKt$detectHorizontalDragGestures$4.INSTANCE;
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, function2, continuation);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, function2, function0, function02, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x010f, code lost:
        if ((!(r2.invoke(r15).floatValue() == 0.0f)) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0091 -> B:90:0x0097). Please submit an issue!!! */
    /* renamed from: drag-VnAYq1g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m532dragVnAYq1g(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Function1<? super PointerInputChange, Float> function12, Function1<? super PointerInputChange, Boolean> function13, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$2;
        int i;
        long j2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function1<? super PointerInputChange, Boolean> function14;
        DragGestureDetectorKt$drag$2 dragGestureDetectorKt$drag$22;
        Object obj;
        Function1<? super PointerInputChange, Unit> function15;
        Function1<? super PointerInputChange, Float> function16;
        Ref.LongRef longRef;
        AwaitPointerEventScope awaitPointerEventScope3;
        Object awaitPointerEvent$default;
        AwaitPointerEventScope awaitPointerEventScope4;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        int i2;
        if (continuation instanceof DragGestureDetectorKt$drag$2) {
            dragGestureDetectorKt$drag$2 = (DragGestureDetectorKt$drag$2) continuation;
            if ((dragGestureDetectorKt$drag$2.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$drag$2.label -= Integer.MIN_VALUE;
                Object obj2 = dragGestureDetectorKt$drag$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$drag$2.label;
                PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    j2 = j;
                    if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                        return null;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function14 = function13;
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    obj = coroutine_suspended;
                    function15 = function1;
                    function16 = function12;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function15;
                    dragGestureDetectorKt$drag$22.L$2 = function16;
                    dragGestureDetectorKt$drag$22.L$3 = function14;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = 1;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, 1, pointerEventPass);
                    if (awaitPointerEvent$default == obj) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    awaitPointerEventScope3 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$4;
                    Function1<? super PointerInputChange, Boolean> function17 = (Function1) dragGestureDetectorKt$drag$2.L$3;
                    Function1<? super PointerInputChange, Float> function18 = (Function1) dragGestureDetectorKt$drag$2.L$2;
                    AwaitPointerEventScope awaitPointerEventScope5 = (AwaitPointerEventScope) dragGestureDetectorKt$drag$2.L$0;
                    ResultKt.throwOnFailure(obj2);
                    dragGestureDetectorKt$drag$22 = dragGestureDetectorKt$drag$2;
                    function15 = (Function1) dragGestureDetectorKt$drag$2.L$1;
                    obj = coroutine_suspended;
                    function16 = function18;
                    Ref.LongRef longRef2 = (Ref.LongRef) dragGestureDetectorKt$drag$2.L$5;
                    function14 = function17;
                    PointerEvent pointerEvent = (PointerEvent) obj2;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i3);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        i2 = i3;
                        if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef2.element)) {
                            break;
                        }
                        i3 = i2 + 1;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    PointerInputChange pointerInputChange3 = pointerInputChange;
                    if (pointerInputChange3 == null) {
                        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            List<PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    pointerInputChange2 = null;
                                    break;
                                }
                                pointerInputChange2 = changes2.get(i4);
                                if (pointerInputChange2.getPressed()) {
                                    break;
                                }
                                i4++;
                            }
                            PointerInputChange pointerInputChange4 = pointerInputChange2;
                            if (pointerInputChange4 != null) {
                                longRef2.element = pointerInputChange4.m4425getIdJ3iCeTQ();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                pointerEventPass = null;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                longRef = longRef2;
                                dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                                dragGestureDetectorKt$drag$22.L$1 = function15;
                                dragGestureDetectorKt$drag$22.L$2 = function16;
                                dragGestureDetectorKt$drag$22.L$3 = function14;
                                dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                                dragGestureDetectorKt$drag$22.L$5 = longRef;
                                dragGestureDetectorKt$drag$22.label = 1;
                                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, 1, pointerEventPass);
                                if (awaitPointerEvent$default == obj) {
                                    return obj;
                                }
                                Ref.LongRef longRef3 = longRef;
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj2 = awaitPointerEvent$default;
                                longRef2 = longRef3;
                            }
                        }
                        PointerEvent pointerEvent2 = (PointerEvent) obj2;
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32 = i2 + 1;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        PointerInputChange pointerInputChange32 = pointerInputChange;
                        if (pointerInputChange32 == null) {
                            pointerInputChange32 = null;
                        }
                    }
                    if (pointerInputChange32 == null || function14.invoke(pointerInputChange32).booleanValue()) {
                        return null;
                    }
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange32)) {
                        return pointerInputChange32;
                    }
                    function15.invoke(pointerInputChange32);
                    j2 = pointerInputChange32.m4425getIdJ3iCeTQ();
                    pointerEventPass = null;
                    awaitPointerEventScope2 = awaitPointerEventScope5;
                    longRef = new Ref.LongRef();
                    longRef.element = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$drag$22.L$1 = function15;
                    dragGestureDetectorKt$drag$22.L$2 = function16;
                    dragGestureDetectorKt$drag$22.L$3 = function14;
                    dragGestureDetectorKt$drag$22.L$4 = awaitPointerEventScope3;
                    dragGestureDetectorKt$drag$22.L$5 = longRef;
                    dragGestureDetectorKt$drag$22.label = 1;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, dragGestureDetectorKt$drag$22, 1, pointerEventPass);
                    if (awaitPointerEvent$default == obj) {
                    }
                }
            }
        }
        dragGestureDetectorKt$drag$2 = new DragGestureDetectorKt$drag$2(continuation);
        Object obj22 = dragGestureDetectorKt$drag$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$drag$2.label;
        PointerEventPass pointerEventPass2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline */
    private static final Object m533dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Unit> function1, Function1<? super PointerInputChange, Float> function12, Function1<? super PointerInputChange, Boolean> function13, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j2 = j;
        if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = j2;
            while (true) {
                InlineMarker.mark(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
                InlineMarker.mark(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i);
                    if (Boolean.valueOf(PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                } else if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (r1 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(r1);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        r1++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.m4425getIdJ3iCeTQ();
                } else {
                    if (Boolean.valueOf((function12.invoke(pointerInputChange2).floatValue() == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || function13.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j2 = pointerInputChange2.m4425getIdJ3iCeTQ();
        }
    }

    /* renamed from: awaitDragOrUp-jO51t88 */
    private static final Object m520awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j, Function1<? super PointerInputChange, Boolean> function1, Continuation<? super PointerInputChange> continuation) {
        PointerInputChange pointerInputChange;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        while (true) {
            int i = 0;
            InlineMarker.mark(0);
            PointerInputChange pointerInputChange2 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                if (Boolean.valueOf(PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                longRef.element = pointerInputChange5.m4425getIdJ3iCeTQ();
            } else if (function1.invoke(pointerInputChange3).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x015b -> B:149:0x01bc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x01ac -> B:144:0x01b0). Please submit an issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m525awaitPointerSlopOrCancellationwtdNQyU(AwaitPointerEventScope awaitPointerEventScope, long j, int i, PointerDirectionConfig pointerDirectionConfig, boolean z, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        PointerDirectionConfig pointerDirectionConfig2;
        float f;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
        Object obj;
        Ref.LongRef longRef;
        float f2;
        float f3;
        boolean z2;
        Function2<? super PointerInputChange, ? super Offset, Unit> function22;
        Ref.LongRef longRef2;
        Object obj2;
        DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
        float f4;
        boolean z3;
        int size;
        int i3;
        boolean z4;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange3;
        int i4;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) {
            dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = (DragGestureDetectorKt$awaitPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
                int i5 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj3);
                    if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    Ref.LongRef longRef3 = new Ref.LongRef();
                    longRef3.element = j;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerDirectionConfig2 = pointerDirectionConfig;
                    f = m537pointerSlopE8SPZFQ;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    obj = coroutine_suspended;
                    longRef = longRef3;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    z2 = z;
                    function22 = function2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Z$0 = z2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$1 = f3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$2 = f2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i5, pointerEventPass);
                    if (awaitPointerEvent$default != obj) {
                    }
                } else if (i2 == 1) {
                    float f5 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$2;
                    float f6 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$1;
                    float f7 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    z3 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.Z$0;
                    Function2<? super PointerInputChange, ? super Offset, Unit> function23 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    ResultKt.throwOnFailure(obj3);
                    f2 = f5;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    f4 = f7;
                    f3 = f6;
                    pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    obj2 = coroutine_suspended;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    function22 = function23;
                    PointerEvent pointerEvent = (PointerEvent) obj3;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                        }
                        i3++;
                        size = i4;
                        z3 = z4;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    }
                    i5 = 1;
                    pointerEventPass = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Z$0 = z2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$1 = f3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$2 = f2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i5, pointerEventPass);
                    if (awaitPointerEvent$default != obj) {
                    }
                } else if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    float f8 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$2;
                    float f9 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$1;
                    float f10 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.F$0;
                    boolean z5 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.Z$0;
                    PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$4;
                    ResultKt.throwOnFailure(obj3);
                    char c = 2;
                    z2 = z5;
                    f = f10;
                    f3 = f9;
                    pointerDirectionConfig2 = (PointerDirectionConfig) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$1;
                    longRef2 = (Ref.LongRef) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1;
                    function22 = (Function2) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$2;
                    obj2 = coroutine_suspended;
                    f2 = f8;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.L$0;
                    if (!pointerInputChange4.isConsumed()) {
                        return null;
                    }
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
                    obj = obj2;
                    longRef = longRef2;
                    i5 = 1;
                    pointerEventPass = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Z$0 = z2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$1 = f3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$2 = f2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i5, pointerEventPass);
                    if (awaitPointerEvent$default != obj) {
                        return obj;
                    }
                    float f11 = f;
                    z3 = z2;
                    obj3 = awaitPointerEvent$default;
                    longRef2 = longRef;
                    obj2 = obj;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$13 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$12;
                    f4 = f11;
                    PointerEvent pointerEvent2 = (PointerEvent) obj3;
                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                    size = changes2.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            z4 = z3;
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes2.get(i3);
                        i4 = size;
                        z4 = z3;
                        if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef2.element)) {
                            break;
                        }
                        i3++;
                        size = i4;
                        z3 = z4;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 != null || pointerInputChange2.isConsumed()) {
                        return null;
                    }
                    if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size2 = changes3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes3.get(i6);
                            if (pointerInputChange3.getPressed()) {
                                break;
                            }
                            i6++;
                        }
                        PointerInputChange pointerInputChange5 = pointerInputChange3;
                        if (pointerInputChange5 == null) {
                            return null;
                        }
                        longRef2.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                        z2 = z4;
                        f = f4;
                        dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
                        obj = obj2;
                        longRef = longRef2;
                    } else {
                        long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                        long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                        float mo540mainAxisDeltak4lQ0M = (pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0)) + f3;
                        f2 += pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig2.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0);
                        if (z4) {
                            m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                        } else {
                            m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, f2));
                        }
                        if (m3016getDistanceimpl < f4) {
                            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.L$0 = awaitPointerEventScope2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.L$1 = pointerDirectionConfig2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.L$2 = function22;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.L$3 = longRef2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.L$4 = pointerInputChange2;
                            boolean z6 = z4;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.Z$0 = z6;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.F$0 = f4;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.F$1 = mo540mainAxisDeltak4lQ0M;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.F$2 = f2;
                            c = 2;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$13.label = 2;
                            if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorKt$awaitPointerSlopOrCancellation$13) == obj2) {
                                return obj2;
                            }
                            f3 = mo540mainAxisDeltak4lQ0M;
                            z2 = z6;
                            f = f4;
                            pointerInputChange4 = pointerInputChange2;
                            if (!pointerInputChange4.isConsumed()) {
                            }
                        } else {
                            boolean z7 = z4;
                            if (z7) {
                                m3022minusMKHz9U = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * f4), f2);
                            } else {
                                long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig2.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, f2);
                                m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), f4));
                            }
                            function22.invoke(pointerInputChange2, Offset.m3007boximpl(m3022minusMKHz9U));
                            if (pointerInputChange2.isConsumed()) {
                                return pointerInputChange2;
                            }
                            z2 = z7;
                            f = f4;
                            dragGestureDetectorKt$awaitPointerSlopOrCancellation$12 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$13;
                            obj = obj2;
                            longRef = longRef2;
                            f2 = 0.0f;
                            f3 = 0.0f;
                        }
                    }
                    i5 = 1;
                    pointerEventPass = null;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$0 = awaitPointerEventScope2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$1 = pointerDirectionConfig2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$2 = function22;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$3 = longRef;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.L$4 = pointerEventPass;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.Z$0 = z2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$0 = f;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$1 = f3;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.F$2 = f2;
                    dragGestureDetectorKt$awaitPointerSlopOrCancellation$12.label = i5;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorKt$awaitPointerSlopOrCancellation$12, i5, pointerEventPass);
                    if (awaitPointerEvent$default != obj) {
                    }
                }
            }
        }
        dragGestureDetectorKt$awaitPointerSlopOrCancellation$1 = new DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorKt$awaitPointerSlopOrCancellation$1.label;
        int i52 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ef, code lost:
        if (r3 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f1, code lost:
        r9 = r2.mo541offsetFromChangesdBAh8RU(r10 - (java.lang.Math.signum(r10) * r23), r11);
        r5 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00ff, code lost:
        r9 = r2.mo541offsetFromChangesdBAh8RU(r10, r11);
        r11 = androidx.compose.ui.geometry.Offset.m3013divtuRUvjQ(r9, r5);
        r5 = r23;
        r9 = androidx.compose.ui.geometry.Offset.m3022minusMKHz9U(r9, androidx.compose.ui.geometry.Offset.m3025timestuRUvjQ(r11, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0111, code lost:
        r24.invoke(r4, androidx.compose.ui.geometry.Offset.m3007boximpl(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x011e, code lost:
        if (r4.isConsumed() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0120, code lost:
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU$default */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m527awaitPointerSlopOrCancellationwtdNQyU$default(AwaitPointerEventScope awaitPointerEventScope, long j, int i, PointerDirectionConfig pointerDirectionConfig, boolean z, Function2 function2, Continuation continuation, int i2, Object obj) {
        float f;
        PointerInputChange pointerInputChange;
        Object obj2;
        float m3016getDistanceimpl;
        PointerDirectionConfig horizontalPointerDirectionConfig = (i2 & 4) != 0 ? getHorizontalPointerDirectionConfig() : pointerDirectionConfig;
        int i3 = 1;
        boolean z2 = (i2 & 8) != 0 ? true : z;
        long j2 = j;
        PointerEventPass pointerEventPass = null;
        if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
            return null;
        }
        float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        while (true) {
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (true) {
                int i4 = 0;
                InlineMarker.mark(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, continuation, i3, pointerEventPass);
                InlineMarker.mark(i3);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        f = m537pointerSlopE8SPZFQ;
                        pointerInputChange = pointerEventPass;
                        break;
                    }
                    pointerInputChange = changes.get(i5);
                    f = m537pointerSlopE8SPZFQ;
                    if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), j2)) {
                        break;
                    }
                    i5++;
                    m537pointerSlopE8SPZFQ = f;
                }
                PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i4 >= size2) {
                                obj2 = pointerEventPass;
                                break;
                            }
                            obj2 = changes2.get(i4);
                            if (((PointerInputChange) obj2).getPressed()) {
                                break;
                            }
                            i4++;
                        }
                        PointerInputChange pointerInputChange3 = (PointerInputChange) obj2;
                        if (pointerInputChange3 == null) {
                            return pointerEventPass;
                        }
                        j2 = pointerInputChange3.m4425getIdJ3iCeTQ();
                        m537pointerSlopE8SPZFQ = f;
                        i3 = 1;
                    } else {
                        long m4426getPositionF1C5BW0 = pointerInputChange2.m4426getPositionF1C5BW0();
                        long m4427getPreviousPositionF1C5BW0 = pointerInputChange2.m4427getPreviousPositionF1C5BW0();
                        f2 += horizontalPointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - horizontalPointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0);
                        f3 += horizontalPointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - horizontalPointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0);
                        if (z2) {
                            m3016getDistanceimpl = Math.abs(f2);
                        } else {
                            m3016getDistanceimpl = Offset.m3016getDistanceimpl(horizontalPointerDirectionConfig.mo541offsetFromChangesdBAh8RU(f2, f3));
                        }
                        if (m3016getDistanceimpl >= f) {
                            break;
                        }
                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                        InlineMarker.mark(0);
                        awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, continuation);
                        InlineMarker.mark(1);
                        if (pointerInputChange2.isConsumed()) {
                            return null;
                        }
                        m537pointerSlopE8SPZFQ = f;
                        i3 = 1;
                        pointerEventPass = null;
                    }
                } else {
                    return pointerEventPass;
                }
            }
            i3 = 1;
            pointerEventPass = null;
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU$$forInline */
    private static final Object m526awaitPointerSlopOrCancellationwtdNQyU$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j, int i, PointerDirectionConfig pointerDirectionConfig, boolean z, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        float f;
        PointerInputChange pointerInputChange;
        float m3016getDistanceimpl;
        long m3022minusMKHz9U;
        PointerInputChange pointerInputChange2;
        if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m537pointerSlopE8SPZFQ = m537pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (true) {
            InlineMarker.mark(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    f = f2;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                f = f2;
                if (Boolean.valueOf(PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                f2 = f;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.m4425getIdJ3iCeTQ();
            } else {
                long m4426getPositionF1C5BW0 = pointerInputChange3.m4426getPositionF1C5BW0();
                long m4427getPreviousPositionF1C5BW0 = pointerInputChange3.m4427getPreviousPositionF1C5BW0();
                float mo539crossAxisDeltak4lQ0M = pointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig.mo539crossAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0);
                float mo540mainAxisDeltak4lQ0M = f + (pointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4426getPositionF1C5BW0) - pointerDirectionConfig.mo540mainAxisDeltak4lQ0M(m4427getPreviousPositionF1C5BW0));
                f3 += mo539crossAxisDeltak4lQ0M;
                if (z) {
                    m3016getDistanceimpl = Math.abs(mo540mainAxisDeltak4lQ0M);
                } else {
                    m3016getDistanceimpl = Offset.m3016getDistanceimpl(pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, f3));
                }
                if (m3016getDistanceimpl < m537pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f = mo540mainAxisDeltak4lQ0M;
                } else {
                    if (z) {
                        m3022minusMKHz9U = pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M - (Math.signum(mo540mainAxisDeltak4lQ0M) * m537pointerSlopE8SPZFQ), f3);
                    } else {
                        long mo541offsetFromChangesdBAh8RU = pointerDirectionConfig.mo541offsetFromChangesdBAh8RU(mo540mainAxisDeltak4lQ0M, f3);
                        m3022minusMKHz9U = Offset.m3022minusMKHz9U(mo541offsetFromChangesdBAh8RU, Offset.m3025timestuRUvjQ(Offset.m3013divtuRUvjQ(mo541offsetFromChangesdBAh8RU, m3016getDistanceimpl), m537pointerSlopE8SPZFQ));
                    }
                    function2.invoke(pointerInputChange3, Offset.m3007boximpl(m3022minusMKHz9U));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f3 = 0.0f;
                    f = 0.0f;
                    f2 = f;
                }
            }
            f2 = f;
        }
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl((float) 0.125d);
        mouseSlop = m5607constructorimpl;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(18);
        defaultTouchSlop = m5607constructorimpl2;
        mouseToTouchSlopRatio = m5607constructorimpl / m5607constructorimpl2;
    }

    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    public static final PointerDirectionConfig toPointerDirectionConfig(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        return orientation == Orientation.Vertical ? VerticalPointerDirectionConfig : HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a7  */
    /* JADX WARN: Type inference failed for: r10v2, types: [androidx.compose.ui.input.pointer.PointerInputChange, T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.input.pointer.PointerInputChange] */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m524awaitLongPressOrCancellationrnUCldI(AwaitPointerEventScope awaitPointerEventScope, long j, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$1 dragGestureDetectorKt$awaitLongPressOrCancellation$1;
        int i;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof DragGestureDetectorKt$awaitLongPressOrCancellation$1) {
            dragGestureDetectorKt$awaitLongPressOrCancellation$1 = (DragGestureDetectorKt$awaitLongPressOrCancellation$1) continuation;
            if ((dragGestureDetectorKt$awaitLongPressOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorKt$awaitLongPressOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (m536isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                        return null;
                    }
                    List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                    int size = changes.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i2);
                        if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), j)) {
                            break;
                        }
                        i2++;
                    }
                    pointerInputChange2 = pointerInputChange;
                    if (pointerInputChange2 == 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = pointerInputChange2;
                    long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                    try {
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0 = pointerInputChange2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1 = objectRef2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$1.label = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, new DragGestureDetectorKt$awaitLongPressOrCancellation$2(objectRef3, objectRef2, null), dragGestureDetectorKt$awaitLongPressOrCancellation$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (PointerEventTimeoutCancellationException unused) {
                        objectRef = objectRef2;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    objectRef = (Ref.ObjectRef) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$1;
                    pointerInputChange2 = (PointerInputChange) dragGestureDetectorKt$awaitLongPressOrCancellation$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return null;
                    } catch (PointerEventTimeoutCancellationException unused2) {
                    }
                }
                PointerInputChange pointerInputChange3 = (PointerInputChange) objectRef.element;
                return pointerInputChange3 != null ? pointerInputChange2 : pointerInputChange3;
            }
        }
        dragGestureDetectorKt$awaitLongPressOrCancellation$1 = new DragGestureDetectorKt$awaitLongPressOrCancellation$1(continuation);
        Object obj2 = dragGestureDetectorKt$awaitLongPressOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dragGestureDetectorKt$awaitLongPressOrCancellation$1.label;
        if (i != 0) {
        }
        PointerInputChange pointerInputChange32 = (PointerInputChange) objectRef.element;
        if (pointerInputChange32 != null) {
        }
    }

    /* renamed from: isPointerUp-DmW0f2w */
    public static final boolean m536isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ */
    public static final float m537pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m4498equalsimpl0(i, PointerType.Companion.m4503getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }
}
