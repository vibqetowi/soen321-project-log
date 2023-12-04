package com.ifriend.data.initialLoaders;

import com.ifriend.domain.data.levels.LevelsRepository;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: InitialLevelInfoLoader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/data/initialLoaders/InitialLevelInfoLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "levelsRepository", "Lcom/ifriend/domain/data/levels/LevelsRepository;", "(Lcom/ifriend/domain/data/levels/LevelsRepository;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialLevelInfoLoader implements InitialDataLoader {
    private final LevelsRepository levelsRepository;

    public InitialLevelInfoLoader(LevelsRepository levelsRepository) {
        Intrinsics.checkNotNullParameter(levelsRepository, "levelsRepository");
        this.levelsRepository = levelsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        InitialLevelInfoLoader$load$1 initialLevelInfoLoader$load$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof InitialLevelInfoLoader$load$1) {
            initialLevelInfoLoader$load$1 = (InitialLevelInfoLoader$load$1) continuation;
            if ((initialLevelInfoLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                initialLevelInfoLoader$load$1.label -= Integer.MIN_VALUE;
                obj = initialLevelInfoLoader$load$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialLevelInfoLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    LevelsRepository levelsRepository = this.levelsRepository;
                    initialLevelInfoLoader$load$1.label = 1;
                    obj = levelsRepository.getLevelInfo(initialLevelInfoLoader$load$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                initialLevelInfoLoader$load$1.label = 2;
                if (FlowKt.first((Flow) obj, new InitialLevelInfoLoader$load$2(null), initialLevelInfoLoader$load$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(true);
            }
        }
        initialLevelInfoLoader$load$1 = new InitialLevelInfoLoader$load$1(this, continuation);
        obj = initialLevelInfoLoader$load$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialLevelInfoLoader$load$1.label;
        if (i != 0) {
        }
        initialLevelInfoLoader$load$1.label = 2;
        if (FlowKt.first((Flow) obj, new InitialLevelInfoLoader$load$2(null), initialLevelInfoLoader$load$1) == coroutine_suspended) {
        }
        return Boxing.boxBoolean(true);
    }
}
