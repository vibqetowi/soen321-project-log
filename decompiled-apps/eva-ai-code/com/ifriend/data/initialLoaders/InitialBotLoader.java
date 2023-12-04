package com.ifriend.data.initialLoaders;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: InitialBotLoader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/data/initialLoaders/InitialBotLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/domain/data/BotRepository;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialBotLoader implements InitialDataLoader {
    private final BotRepository botRepository;

    public InitialBotLoader(BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.botRepository = botRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        InitialBotLoader$load$1 initialBotLoader$load$1;
        int i;
        if (continuation instanceof InitialBotLoader$load$1) {
            initialBotLoader$load$1 = (InitialBotLoader$load$1) continuation;
            if ((initialBotLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                initialBotLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = initialBotLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialBotLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    initialBotLoader$load$1.label = 1;
                    if (FlowKt.first(this.botRepository.getBot(), new InitialBotLoader$load$2(null), initialBotLoader$load$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(true);
            }
        }
        initialBotLoader$load$1 = new InitialBotLoader$load$1(this, continuation);
        Object obj2 = initialBotLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialBotLoader$load$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(true);
    }
}
