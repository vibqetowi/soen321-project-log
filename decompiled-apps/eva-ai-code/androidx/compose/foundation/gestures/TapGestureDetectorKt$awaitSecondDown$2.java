package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
    final /* synthetic */ PointerInputChange $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(PointerInputChange pointerInputChange, Continuation<? super TapGestureDetectorKt$awaitSecondDown$2> continuation) {
        super(2, continuation);
        this.$firstUp = pointerInputChange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.$firstUp, continuation);
        tapGestureDetectorKt$awaitSecondDown$2.L$0 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:13:0x0055). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        long uptimeMillis;
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2;
        Object awaitFirstDown$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            awaitPointerEventScope = awaitPointerEventScope2;
            uptimeMillis = this.$firstUp.getUptimeMillis() + awaitPointerEventScope2.getViewConfiguration().getDoubleTapMinTimeMillis();
            tapGestureDetectorKt$awaitSecondDown$2 = this;
            tapGestureDetectorKt$awaitSecondDown$2.L$0 = awaitPointerEventScope;
            tapGestureDetectorKt$awaitSecondDown$2.J$0 = uptimeMillis;
            tapGestureDetectorKt$awaitSecondDown$2.label = 1;
            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, tapGestureDetectorKt$awaitSecondDown$2, 3, null);
            if (awaitFirstDown$default != coroutine_suspended) {
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            long j = this.J$0;
            ResultKt.throwOnFailure(obj);
            uptimeMillis = j;
            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
            Object obj2 = coroutine_suspended;
            TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$22 = this;
            PointerInputChange pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange.getUptimeMillis() < uptimeMillis) {
                return pointerInputChange;
            }
            tapGestureDetectorKt$awaitSecondDown$2 = tapGestureDetectorKt$awaitSecondDown$22;
            coroutine_suspended = obj2;
            awaitPointerEventScope = awaitPointerEventScope3;
            tapGestureDetectorKt$awaitSecondDown$2.L$0 = awaitPointerEventScope;
            tapGestureDetectorKt$awaitSecondDown$2.J$0 = uptimeMillis;
            tapGestureDetectorKt$awaitSecondDown$2.label = 1;
            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, tapGestureDetectorKt$awaitSecondDown$2, 3, null);
            if (awaitFirstDown$default != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            tapGestureDetectorKt$awaitSecondDown$22 = tapGestureDetectorKt$awaitSecondDown$2;
            obj = awaitFirstDown$default;
            awaitPointerEventScope3 = awaitPointerEventScope;
            obj2 = obj3;
            PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
            if (pointerInputChange2.getUptimeMillis() < uptimeMillis) {
            }
        }
    }
}
