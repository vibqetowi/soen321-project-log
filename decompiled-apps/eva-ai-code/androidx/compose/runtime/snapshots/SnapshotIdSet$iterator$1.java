package androidx.compose.runtime.snapshots;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/SequenceScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, 300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", FirebaseAnalytics.Param.INDEX, "$this$sequence", FirebaseAnalytics.Param.INDEX}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class SnapshotIdSet$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SnapshotIdSet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, Continuation<? super SnapshotIdSet$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = snapshotIdSet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, continuation);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SnapshotIdSet$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007c -> B:19:0x007f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bc -> B:32:0x00c0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bf -> B:32:0x00c0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fc -> B:44:0x0100). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ff -> B:44:0x0100). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1;
        SequenceScope sequenceScope2;
        int length;
        int[] iArr;
        int i;
        SequenceScope sequenceScope3;
        int i2;
        SequenceScope sequenceScope4;
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$12;
        int i3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            int[] iArr2 = this.this$0.belowBound;
            if (iArr2 == null) {
                snapshotIdSet$iterator$1 = this;
                if (snapshotIdSet$iterator$1.this$0.lowerSet != 0) {
                }
                if (snapshotIdSet$iterator$1.this$0.upperSet != 0) {
                }
                return Unit.INSTANCE;
            }
            snapshotIdSet$iterator$1 = this;
            sequenceScope2 = sequenceScope;
            length = iArr2.length;
            iArr = iArr2;
            i = 0;
            if (i < length) {
            }
        } else if (i4 == 1) {
            length = this.I$1;
            i = this.I$0;
            iArr = (int[]) this.L$1;
            sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            snapshotIdSet$iterator$1 = this;
            i++;
            if (i < length) {
                snapshotIdSet$iterator$1.L$0 = sequenceScope2;
                snapshotIdSet$iterator$1.L$1 = iArr;
                snapshotIdSet$iterator$1.I$0 = i;
                snapshotIdSet$iterator$1.I$1 = length;
                snapshotIdSet$iterator$1.label = 1;
                if (sequenceScope2.yield(Boxing.boxInt(iArr[i]), snapshotIdSet$iterator$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < length) {
                    sequenceScope = sequenceScope2;
                    if (snapshotIdSet$iterator$1.this$0.lowerSet != 0) {
                        sequenceScope3 = sequenceScope;
                        i2 = 0;
                        if (i2 >= 64) {
                        }
                    }
                    if (snapshotIdSet$iterator$1.this$0.upperSet != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }
        } else if (i4 != 2) {
            if (i4 == 3) {
                int i5 = this.I$0;
                sequenceScope4 = (SequenceScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i3 = i5;
                snapshotIdSet$iterator$12 = this;
                i3++;
                if (i3 < 64) {
                    if ((snapshotIdSet$iterator$12.this$0.upperSet & (1 << i3)) != 0) {
                        snapshotIdSet$iterator$12.L$0 = sequenceScope4;
                        snapshotIdSet$iterator$12.L$1 = null;
                        snapshotIdSet$iterator$12.I$0 = i3;
                        snapshotIdSet$iterator$12.label = 3;
                        if (sequenceScope4.yield(Boxing.boxInt(i3 + 64 + snapshotIdSet$iterator$12.this$0.lowerBound), snapshotIdSet$iterator$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i2 = this.I$0;
            sequenceScope3 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            snapshotIdSet$iterator$1 = this;
            i2++;
            if (i2 >= 64) {
                sequenceScope = sequenceScope3;
                if (snapshotIdSet$iterator$1.this$0.upperSet != 0) {
                    sequenceScope4 = sequenceScope;
                    snapshotIdSet$iterator$12 = snapshotIdSet$iterator$1;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.INSTANCE;
            }
            if ((snapshotIdSet$iterator$1.this$0.lowerSet & (1 << i2)) != 0) {
                snapshotIdSet$iterator$1.L$0 = sequenceScope3;
                snapshotIdSet$iterator$1.L$1 = null;
                snapshotIdSet$iterator$1.I$0 = i2;
                snapshotIdSet$iterator$1.label = 2;
                if (sequenceScope3.yield(Boxing.boxInt(snapshotIdSet$iterator$1.this$0.lowerBound + i2), snapshotIdSet$iterator$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            i2++;
            if (i2 >= 64) {
            }
        }
    }
}
