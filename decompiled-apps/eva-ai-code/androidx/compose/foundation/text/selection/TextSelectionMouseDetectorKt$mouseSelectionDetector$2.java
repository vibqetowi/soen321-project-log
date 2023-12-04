package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextSelectionMouseDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2", f = "TextSelectionMouseDetector.kt", i = {0, 0, 1, 1, 2, 2}, l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 96, 111}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter", "$this$awaitEachGesture", "clicksCounter"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt$mouseSelectionDetector$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MouseSelectionObserver $observer;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSelectionMouseDetectorKt$mouseSelectionDetector$2(MouseSelectionObserver mouseSelectionObserver, Continuation<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2> continuation) {
        super(2, continuation);
        this.$observer = mouseSelectionObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2 = new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(this.$observer, continuation);
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = obj;
        return textSelectionMouseDetectorKt$mouseSelectionDetector$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((TextSelectionMouseDetectorKt$mouseSelectionDetector$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00e4 -> B:14:0x0046). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        ClicksCounter clicksCounter;
        SelectionAdjustment none;
        TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$2;
        Object awaitMouseEventDown;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            clicksCounter = new ClicksCounter(awaitPointerEventScope.getViewConfiguration());
        } else if (i == 1) {
            clicksCounter = (ClicksCounter) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$22 = this;
            PointerEvent pointerEvent = (PointerEvent) obj;
            clicksCounter.update(pointerEvent);
            PointerInputChange pointerInputChange = pointerEvent.getChanges().get(0);
            if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                if (textSelectionMouseDetectorKt$mouseSelectionDetector$22.$observer.mo1139onExtendk4lQ0M(pointerInputChange.m4426getPositionF1C5BW0())) {
                    pointerInputChange.consume();
                    textSelectionMouseDetectorKt$mouseSelectionDetector$22.L$0 = awaitPointerEventScope2;
                    textSelectionMouseDetectorKt$mouseSelectionDetector$22.L$1 = clicksCounter;
                    textSelectionMouseDetectorKt$mouseSelectionDetector$22.label = 2;
                    if (DragGestureDetectorKt.m534dragjO51t88(awaitPointerEventScope2, pointerInputChange.m4425getIdJ3iCeTQ(), new AnonymousClass1(textSelectionMouseDetectorKt$mouseSelectionDetector$22.$observer), textSelectionMouseDetectorKt$mouseSelectionDetector$22) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                int clicks = clicksCounter.getClicks();
                if (clicks == 1) {
                    none = SelectionAdjustment.Companion.getNone();
                } else if (clicks == 2) {
                    none = SelectionAdjustment.Companion.getWord();
                } else {
                    none = SelectionAdjustment.Companion.getParagraph();
                }
                if (textSelectionMouseDetectorKt$mouseSelectionDetector$22.$observer.mo1141onStart3MmeM6k(pointerInputChange.m4426getPositionF1C5BW0(), none)) {
                    pointerInputChange.consume();
                    textSelectionMouseDetectorKt$mouseSelectionDetector$22.L$0 = awaitPointerEventScope2;
                    textSelectionMouseDetectorKt$mouseSelectionDetector$22.L$1 = clicksCounter;
                    textSelectionMouseDetectorKt$mouseSelectionDetector$22.label = 3;
                    if (DragGestureDetectorKt.m534dragjO51t88(awaitPointerEventScope2, pointerInputChange.m4425getIdJ3iCeTQ(), new AnonymousClass2(textSelectionMouseDetectorKt$mouseSelectionDetector$22.$observer, none), textSelectionMouseDetectorKt$mouseSelectionDetector$22) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2 = textSelectionMouseDetectorKt$mouseSelectionDetector$22;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = awaitPointerEventScope;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$1 = clicksCounter;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2.label = 1;
            awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, textSelectionMouseDetectorKt$mouseSelectionDetector$2);
            if (awaitMouseEventDown == coroutine_suspended) {
                return coroutine_suspended;
            }
            TextSelectionMouseDetectorKt$mouseSelectionDetector$2 textSelectionMouseDetectorKt$mouseSelectionDetector$23 = textSelectionMouseDetectorKt$mouseSelectionDetector$2;
            awaitPointerEventScope2 = awaitPointerEventScope;
            obj = awaitMouseEventDown;
            textSelectionMouseDetectorKt$mouseSelectionDetector$22 = textSelectionMouseDetectorKt$mouseSelectionDetector$23;
            PointerEvent pointerEvent2 = (PointerEvent) obj;
            clicksCounter.update(pointerEvent2);
            PointerInputChange pointerInputChange2 = pointerEvent2.getChanges().get(0);
            if (TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent2)) {
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2 = textSelectionMouseDetectorKt$mouseSelectionDetector$22;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = awaitPointerEventScope;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$1 = clicksCounter;
            textSelectionMouseDetectorKt$mouseSelectionDetector$2.label = 1;
            awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, textSelectionMouseDetectorKt$mouseSelectionDetector$2);
            if (awaitMouseEventDown == coroutine_suspended) {
            }
        } else if (i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            clicksCounter = (ClicksCounter) this.L$1;
            ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
        }
        textSelectionMouseDetectorKt$mouseSelectionDetector$2 = this;
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$0 = awaitPointerEventScope;
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.L$1 = clicksCounter;
        textSelectionMouseDetectorKt$mouseSelectionDetector$2.label = 1;
        awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(awaitPointerEventScope, textSelectionMouseDetectorKt$mouseSelectionDetector$2);
        if (awaitMouseEventDown == coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSelectionMouseDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ MouseSelectionObserver $observer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseSelectionObserver mouseSelectionObserver) {
            super(1);
            this.$observer = mouseSelectionObserver;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PointerInputChange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.$observer.mo1140onExtendDragk4lQ0M(it.m4426getPositionF1C5BW0())) {
                it.consume();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextSelectionMouseDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$mouseSelectionDetector$2$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ MouseSelectionObserver $observer;
        final /* synthetic */ SelectionAdjustment $selectionMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MouseSelectionObserver mouseSelectionObserver, SelectionAdjustment selectionAdjustment) {
            super(1);
            this.$observer = mouseSelectionObserver;
            this.$selectionMode = selectionAdjustment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PointerInputChange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.$observer.mo1138onDrag3MmeM6k(it.m4426getPositionF1C5BW0(), this.$selectionMode)) {
                it.consume();
            }
        }
    }
}
