package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010)J#\u0010*\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\"2\u0006\u0010#\u001a\u00020$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "", "()V", "calculateNestedScrollScope", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineScope;", "getCalculateNestedScrollScope$ui_release", "()Lkotlin/jvm/functions/Function0;", "setCalculateNestedScrollScope$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "coroutineScope", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "modifierLocalNode", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getModifierLocalNode$ui_release", "()Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "setModifierLocalNode$ui_release", "(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)V", "parent", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getParent$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "scope", "getScope$ui_release", "setScope$ui_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "dispatchPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "dispatchPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchPostScroll-DzOQY0M", "(JJI)J", "dispatchPreFling", "dispatchPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchPreScroll", "dispatchPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private Function0<? extends CoroutineScope> calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    private ModifierLocalModifierNode modifierLocalNode;
    private CoroutineScope scope;

    public final ModifierLocalModifierNode getModifierLocalNode$ui_release() {
        return this.modifierLocalNode;
    }

    public final void setModifierLocalNode$ui_release(ModifierLocalModifierNode modifierLocalModifierNode) {
        this.modifierLocalNode = modifierLocalModifierNode;
    }

    public final Function0<CoroutineScope> getCalculateNestedScrollScope$ui_release() {
        return this.calculateNestedScrollScope;
    }

    public final void setCalculateNestedScrollScope$ui_release(Function0<? extends CoroutineScope> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.calculateNestedScrollScope = function0;
    }

    public final CoroutineScope getScope$ui_release() {
        return this.scope;
    }

    public final void setScope$ui_release(CoroutineScope coroutineScope) {
        this.scope = coroutineScope;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope invoke = this.calculateNestedScrollScope.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollConnection getParent$ui_release() {
        ModifierLocalModifierNode modifierLocalModifierNode = this.modifierLocalNode;
        return modifierLocalModifierNode != null ? (NestedScrollNode) modifierLocalModifierNode.getCurrent(NestedScrollNodeKt.getModifierLocalNestedScroll()) : null;
    }

    /* renamed from: dispatchPreScroll-OzD1aCk  reason: not valid java name */
    public final long m4313dispatchPreScrollOzD1aCk(long j, int i) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo598onPreScrollOzD1aCk(j, i) : Offset.Companion.m3034getZeroF1C5BW0();
    }

    /* renamed from: dispatchPostScroll-DzOQY0M  reason: not valid java name */
    public final long m4311dispatchPostScrollDzOQY0M(long j, long j2, int i) {
        NestedScrollConnection parent$ui_release = getParent$ui_release();
        return parent$ui_release != null ? parent$ui_release.mo596onPostScrollDzOQY0M(j, j2, i) : Offset.Companion.m3034getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* renamed from: dispatchPreFling-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4312dispatchPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        int i;
        long m5843getZero9UxMQ8M;
        if (continuation instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuation;
            if ((nestedScrollDispatcher$dispatchPreFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label -= Integer.MIN_VALUE;
                Object obj = nestedScrollDispatcher$dispatchPreFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection parent$ui_release = getParent$ui_release();
                    if (parent$ui_release == null) {
                        m5843getZero9UxMQ8M = Velocity.Companion.m5843getZero9UxMQ8M();
                        return Velocity.m5823boximpl(m5843getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPreFling$1.label = 1;
                    obj = parent$ui_release.mo597onPreFlingQWom1Mo(j, nestedScrollDispatcher$dispatchPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                m5843getZero9UxMQ8M = ((Velocity) obj).m5841unboximpl();
                return Velocity.m5823boximpl(m5843getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuation);
        Object obj2 = nestedScrollDispatcher$dispatchPreFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i != 0) {
        }
        m5843getZero9UxMQ8M = ((Velocity) obj2).m5841unboximpl();
        return Velocity.m5823boximpl(m5843getZero9UxMQ8M);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* renamed from: dispatchPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4310dispatchPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        int i;
        long m5843getZero9UxMQ8M;
        if (continuation instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuation;
            if ((nestedScrollDispatcher$dispatchPostFling$1.label & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label -= Integer.MIN_VALUE;
                NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
                Object obj = nestedScrollDispatcher$dispatchPostFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nestedScrollDispatcher$dispatchPostFling$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    NestedScrollConnection parent$ui_release = getParent$ui_release();
                    if (parent$ui_release == null) {
                        m5843getZero9UxMQ8M = Velocity.Companion.m5843getZero9UxMQ8M();
                        return Velocity.m5823boximpl(m5843getZero9UxMQ8M);
                    }
                    nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                    obj = parent$ui_release.mo595onPostFlingRZ2iAVY(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                m5843getZero9UxMQ8M = ((Velocity) obj).m5841unboximpl();
                return Velocity.m5823boximpl(m5843getZero9UxMQ8M);
            }
        }
        nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuation);
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$122 = nestedScrollDispatcher$dispatchPostFling$1;
        Object obj2 = nestedScrollDispatcher$dispatchPostFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nestedScrollDispatcher$dispatchPostFling$122.label;
        if (i != 0) {
        }
        m5843getZero9UxMQ8M = ((Velocity) obj2).m5841unboximpl();
        return Velocity.m5823boximpl(m5843getZero9UxMQ8M);
    }
}
