package com.ifriend.data.initialLoaders;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.services.initialData.InitialDataLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: InitialUserLoader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/data/initialLoaders/InitialUserLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/UserRepository;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialUserLoader implements InitialDataLoader {
    private final UserRepository userRepository;

    public InitialUserLoader(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(Continuation<? super Boolean> continuation) {
        InitialUserLoader$load$1 initialUserLoader$load$1;
        int i;
        if (continuation instanceof InitialUserLoader$load$1) {
            initialUserLoader$load$1 = (InitialUserLoader$load$1) continuation;
            if ((initialUserLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                initialUserLoader$load$1.label -= Integer.MIN_VALUE;
                Object obj = initialUserLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialUserLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    initialUserLoader$load$1.label = 1;
                    if (FlowKt.first(this.userRepository.getUser(), new InitialUserLoader$load$2(null), initialUserLoader$load$1) == coroutine_suspended) {
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
        initialUserLoader$load$1 = new InitialUserLoader$load$1(this, continuation);
        Object obj2 = initialUserLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialUserLoader$load$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(true);
    }
}
