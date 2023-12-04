package com.ifriend.data.storages.neurones;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.domain.config.ConfigKeys;
import com.ifriend.domain.config.ConfigState;
import com.ifriend.domain.storage.NeuronsCosts;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeuronsCostsStorageImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1", f = "NeuronsCostsStorageImpl.kt", i = {1, 2, 2, 3, 3}, l = {47, 48, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF, 56}, m = "invokeSuspend", n = {"messageCost", "messageCost", "avatarsCount", "messageCost", "avatarsCount"}, s = {"I$0", "I$0", "I$1", "I$0", "I$1"})
/* loaded from: classes6.dex */
public final class NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfigState $config;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ NeuronsCostsStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1(ConfigState configState, NeuronsCostsStorageImpl neuronsCostsStorageImpl, Continuation<? super NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1> continuation) {
        super(2, continuation);
        this.$config = configState;
        this.this$0 = neuronsCostsStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1(this.$config, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NeuronsCostsStorageImpl$fetchCostsFromConfigAndEmit$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int longValue;
        Object freeGenerationsAmount;
        int i;
        int i2;
        int i3;
        MutableStateFlow mutableStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$config.getLongFeature("message_cost", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            if (i4 == 2) {
                longValue = this.I$0;
                ResultKt.throwOnFailure(obj);
                Long l = (Long) obj;
                int longValue2 = l == null ? (int) l.longValue() : 0;
                this.I$0 = longValue;
                this.I$1 = longValue2;
                this.label = 3;
                freeGenerationsAmount = this.this$0.freeGenerationsAmount(this);
                if (freeGenerationsAmount != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i5 = longValue;
                i = longValue2;
                obj = freeGenerationsAmount;
                i2 = i5;
                if (((Number) obj).intValue() <= 0) {
                }
                mutableStateFlow = this.this$0.neuronCosts;
                this.label = 5;
                if (mutableStateFlow.emit(new NeuronsCosts(i2, r7, i), this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            } else if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 == 5) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                i3 = this.I$0;
                ResultKt.throwOnFailure(obj);
                Long l2 = (Long) obj;
                r7 = l2 != null ? (int) l2.longValue() : 0;
                i2 = i3;
                mutableStateFlow = this.this$0.neuronCosts;
                this.label = 5;
                if (mutableStateFlow.emit(new NeuronsCosts(i2, r7, i), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } else {
                i = this.I$1;
                i2 = this.I$0;
                ResultKt.throwOnFailure(obj);
                if (((Number) obj).intValue() <= 0) {
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 4;
                    obj = this.$config.getLongFeature(ConfigKeys.AVATAR_GENERATION_COST, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i3 = i2;
                    Long l22 = (Long) obj;
                    if (l22 != null) {
                    }
                    i2 = i3;
                }
                mutableStateFlow = this.this$0.neuronCosts;
                this.label = 5;
                if (mutableStateFlow.emit(new NeuronsCosts(i2, r7, i), this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        Long l3 = (Long) obj;
        longValue = l3 != null ? (int) l3.longValue() : 0;
        this.I$0 = longValue;
        this.label = 2;
        obj = this.$config.getLongFeature(ConfigKeys.AVATAR_GENERATION_COUNT, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Long l4 = (Long) obj;
        if (l4 == null) {
        }
        this.I$0 = longValue;
        this.I$1 = longValue2;
        this.label = 3;
        freeGenerationsAmount = this.this$0.freeGenerationsAmount(this);
        if (freeGenerationsAmount != coroutine_suspended) {
        }
    }
}
