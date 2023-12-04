package com.ifriend.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.levels.LevelInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.LevelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1", f = "LevelsRepositoryImpl.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class LevelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Resource<LevelInfo>>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ LevelsRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1(Continuation continuation, LevelsRepositoryImpl levelsRepositoryImpl) {
        super(3, continuation);
        this.this$0 = levelsRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Resource<LevelInfo>> flowCollector, String str, Continuation<? super Unit> continuation) {
        LevelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1 levelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1 = new LevelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1(continuation, this.this$0);
        levelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1.L$0 = flowCollector;
        levelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1.L$1 = str;
        return levelsRepositoryImpl$getLevelInfo$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$1;
            LevelsRepositoryImpl levelsRepositoryImpl = this.this$0;
            Flow flow = FlowKt.flow(new LevelsRepositoryImpl$getLevelInfo$lambda$4$$inlined$networkBoundResource$default$1(null, levelsRepositoryImpl, levelsRepositoryImpl, levelsRepositoryImpl));
            this.label = 1;
            if (FlowKt.emitAll((FlowCollector) this.L$0, flow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
