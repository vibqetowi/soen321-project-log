package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BaseEngine.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"Lcom/ifriend/common_entities_engine/State;", ExifInterface.LATITUDE_SOUTH, "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.common_entities_engine.BaseEngine$handle$2", f = "BaseEngine.kt", i = {}, l = {SSL.SSL_PROTOCOL_TLS}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BaseEngine$handle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Event $event;
    Object L$0;
    int label;
    final /* synthetic */ BaseEngine<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEngine$handle$2(BaseEngine<S> baseEngine, Event event, Continuation<? super BaseEngine$handle$2> continuation) {
        super(2, continuation);
        this.this$0 = baseEngine;
        this.$event = event;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseEngine$handle$2(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseEngine$handle$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0055 -> B:15:0x005a). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        BaseEngine$handle$2 baseEngine$handle$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = CollectionsKt.reversed(this.this$0.getSystems$common_entities_engine()).iterator();
            baseEngine$handle$2 = this;
            if (!it.hasNext()) {
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            Iterator it2 = (Iterator) this.L$0;
            Object obj2 = coroutine_suspended;
            BaseEngine$handle$2 baseEngine$handle$22 = this;
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            baseEngine$handle$2 = baseEngine$handle$22;
            coroutine_suspended = obj2;
            it = it2;
            if (!it.hasNext()) {
                SystemController controller$common_entities_engine = baseEngine$handle$2.this$0.getController$common_entities_engine();
                Event event = baseEngine$handle$2.$event;
                baseEngine$handle$2.L$0 = it;
                baseEngine$handle$2.label = 1;
                Object handle = controller$common_entities_engine.handle(event, (System) it.next(), baseEngine$handle$2);
                if (handle == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj3 = coroutine_suspended;
                baseEngine$handle$22 = baseEngine$handle$2;
                obj = handle;
                it2 = it;
                obj2 = obj3;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
