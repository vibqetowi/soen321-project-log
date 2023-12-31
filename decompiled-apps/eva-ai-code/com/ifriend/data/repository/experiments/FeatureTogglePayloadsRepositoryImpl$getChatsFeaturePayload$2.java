package com.ifriend.data.repository.experiments;

import com.ifriend.domain.models.experiments.common.FeatureToggleChatIds;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FeatureTogglePayloadsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/domain/models/experiments/common/FeatureToggleChatIds;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.repository.experiments.FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2", f = "FeatureTogglePayloadsRepositoryImpl.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends FeatureToggleChatIds>>, Object> {
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ FeatureTogglePayloadsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2(FeatureTogglePayloadsRepositoryImpl featureTogglePayloadsRepositoryImpl, String str, Continuation<? super FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2> continuation) {
        super(2, continuation);
        this.this$0 = featureTogglePayloadsRepositoryImpl;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2(this.this$0, this.$key, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends FeatureToggleChatIds>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<FeatureToggleChatIds>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<FeatureToggleChatIds>> continuation) {
        return ((FeatureTogglePayloadsRepositoryImpl$getChatsFeaturePayload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getChatIdsPayload(this.$key, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
