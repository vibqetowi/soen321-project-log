package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J-\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/HoverableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "emitEnter", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitExit", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "tryEmitExit", "updateInteractionSource", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {
    private HoverInteraction.Enter hoverInteraction;
    private MutableInteractionSource interactionSource;

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return PointerInputModifierNode.CC.$default$interceptOutOfBoundsChildEvents(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return PointerInputModifierNode.CC.$default$sharePointerInputWithSiblings(this);
    }

    public HoverableNode(MutableInteractionSource interactionSource) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        this.interactionSource = interactionSource;
    }

    public final void updateInteractionSource(MutableInteractionSource interactionSource) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        if (Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            return;
        }
        tryEmitExit();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo404onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long j) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        if (pass == PointerEventPass.Main) {
            int m4369getType7fucELk = pointerEvent.m4369getType7fucELk();
            if (PointerEventType.m4376equalsimpl0(m4369getType7fucELk, PointerEventType.Companion.m4380getEnter7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3, null);
            } else if (PointerEventType.m4376equalsimpl0(m4369getType7fucELk, PointerEventType.Companion.m4381getExit7fucELk())) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3, null);
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        tryEmitExit();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitEnter(Continuation<? super Unit> continuation) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        int i;
        HoverableNode hoverableNode;
        HoverInteraction.Enter enter;
        if (continuation instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) continuation;
            if ((hoverableNode$emitEnter$1.label & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.label -= Integer.MIN_VALUE;
                Object obj = hoverableNode$emitEnter$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableNode$emitEnter$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.hoverInteraction == null) {
                        HoverInteraction.Enter enter2 = new HoverInteraction.Enter();
                        hoverableNode$emitEnter$1.L$0 = this;
                        hoverableNode$emitEnter$1.L$1 = enter2;
                        hoverableNode$emitEnter$1.label = 1;
                        if (this.interactionSource.emit(enter2, hoverableNode$emitEnter$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hoverableNode = this;
                        enter = enter2;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    enter = (HoverInteraction.Enter) hoverableNode$emitEnter$1.L$1;
                    hoverableNode = (HoverableNode) hoverableNode$emitEnter$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                hoverableNode.hoverInteraction = enter;
                return Unit.INSTANCE;
            }
        }
        hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(this, continuation);
        Object obj2 = hoverableNode$emitEnter$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableNode$emitEnter$1.label;
        if (i != 0) {
        }
        hoverableNode.hoverInteraction = enter;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitExit(Continuation<? super Unit> continuation) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        int i;
        HoverableNode hoverableNode;
        if (continuation instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) continuation;
            if ((hoverableNode$emitExit$1.label & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.label -= Integer.MIN_VALUE;
                Object obj = hoverableNode$emitExit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hoverableNode$emitExit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HoverInteraction.Enter enter = this.hoverInteraction;
                    if (enter != null) {
                        HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
                        hoverableNode$emitExit$1.L$0 = this;
                        hoverableNode$emitExit$1.label = 1;
                        if (this.interactionSource.emit(exit, hoverableNode$emitExit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        hoverableNode = this;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hoverableNode = (HoverableNode) hoverableNode$emitExit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                hoverableNode.hoverInteraction = null;
                return Unit.INSTANCE;
            }
        }
        hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(this, continuation);
        Object obj2 = hoverableNode$emitExit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hoverableNode$emitExit$1.label;
        if (i != 0) {
        }
        hoverableNode.hoverInteraction = null;
        return Unit.INSTANCE;
    }

    public final void tryEmitExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.hoverInteraction = null;
        }
    }
}
