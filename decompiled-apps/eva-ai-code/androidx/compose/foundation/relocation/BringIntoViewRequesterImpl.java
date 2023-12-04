package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BringIntoViewRequester.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()V", "modifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "getModifiers", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequesterNode> modifiers = new MutableVector<>(new BringIntoViewRequesterNode[16], 0);

    public final MutableVector<BringIntoViewRequesterNode> getModifiers() {
        return this.modifiers;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
        if (r8 < r2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:20:0x0069). Please submit an issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bringIntoView(Rect rect, Continuation<? super Unit> continuation) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        int i;
        int size;
        Rect rect2;
        int i2;
        Object[] objArr;
        if (continuation instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) continuation;
            if ((bringIntoViewRequesterImpl$bringIntoView$1.label & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.label -= Integer.MIN_VALUE;
                Object obj = bringIntoViewRequesterImpl$bringIntoView$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bringIntoViewRequesterImpl$bringIntoView$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableVector<BringIntoViewRequesterNode> mutableVector = this.modifiers;
                    size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        rect2 = rect;
                        i2 = 0;
                        Object[] objArr2 = content;
                        bringIntoViewRequesterImpl$bringIntoView$1.L$0 = rect2;
                        bringIntoViewRequesterImpl$bringIntoView$1.L$1 = objArr2;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$0 = size;
                        bringIntoViewRequesterImpl$bringIntoView$1.I$1 = i2;
                        bringIntoViewRequesterImpl$bringIntoView$1.label = 1;
                        Object bringIntoView = ((BringIntoViewRequesterNode) objArr2[i2]).bringIntoView(rect2, bringIntoViewRequesterImpl$bringIntoView$1);
                        objArr = objArr2;
                        if (bringIntoView == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i2++;
                        objArr2 = objArr;
                    }
                    return Unit.INSTANCE;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i2 = bringIntoViewRequesterImpl$bringIntoView$1.I$1;
                    size = bringIntoViewRequesterImpl$bringIntoView$1.I$0;
                    ResultKt.throwOnFailure(obj);
                    rect2 = (Rect) bringIntoViewRequesterImpl$bringIntoView$1.L$0;
                    objArr = (Object[]) bringIntoViewRequesterImpl$bringIntoView$1.L$1;
                    i2++;
                    objArr2 = objArr;
                }
            }
        }
        bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, continuation);
        Object obj2 = bringIntoViewRequesterImpl$bringIntoView$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bringIntoViewRequesterImpl$bringIntoView$1.label;
        if (i != 0) {
        }
    }
}
