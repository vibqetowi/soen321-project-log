package com.ifriend.data.initialLoaders;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.levels.LevelInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialLevelInfoLoader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/common_utils/data/Resource;", "Lcom/ifriend/domain/models/levels/LevelInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.initialLoaders.InitialLevelInfoLoader$load$2", f = "InitialLevelInfoLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InitialLevelInfoLoader$load$2 extends SuspendLambda implements Function2<Resource<LevelInfo>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InitialLevelInfoLoader$load$2(Continuation<? super InitialLevelInfoLoader$load$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitialLevelInfoLoader$load$2 initialLevelInfoLoader$load$2 = new InitialLevelInfoLoader$load$2(continuation);
        initialLevelInfoLoader$load$2.L$0 = obj;
        return initialLevelInfoLoader$load$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Resource<LevelInfo> resource, Continuation<? super Boolean> continuation) {
        return ((InitialLevelInfoLoader$load$2) create(resource, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Resource resource = (Resource) this.L$0;
            return Boxing.boxBoolean((resource instanceof Resource.Success) || (resource instanceof Resource.Error));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
