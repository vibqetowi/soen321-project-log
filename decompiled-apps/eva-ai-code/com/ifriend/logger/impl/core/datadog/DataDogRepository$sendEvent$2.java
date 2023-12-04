package com.ifriend.logger.impl.core.datadog;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.core.remote.services.DataDogApiService;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpHeaders;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataDogRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.logger.impl.core.datadog.DataDogRepository$sendEvent$2", f = "DataDogRepository.kt", i = {}, l = {31, 35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class DataDogRepository$sendEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $level;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $service;
    int label;
    final /* synthetic */ DataDogRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataDogRepository$sendEvent$2(DataDogRepository dataDogRepository, Map<String, String> map, String str, String str2, Continuation<? super DataDogRepository$sendEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = dataDogRepository;
        this.$params = map;
        this.$level = str;
        this.$service = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataDogRepository$sendEvent$2(this.this$0, this.$params, this.$level, this.$service, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataDogRepository$sendEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Gson gson;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            gson = this.this$0.gson;
            JsonElement jsonTree = gson.toJsonTree(this.$params);
            DataDogRepository dataDogRepository = this.this$0;
            Intrinsics.checkNotNull(jsonTree);
            this.label = 1;
            obj = dataDogRepository.provideBody(jsonTree, this.$level, this.$service, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        RequestBody create = RequestBody.Companion.create((String) obj, MediaType.Companion.parse(HttpHeaders.Values.APPLICATION_JSON));
        this.label = 2;
        if (RetryKt.oneTimeRetryRemoteRequest(new AnonymousClass1(this.this$0, create, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DataDogRepository.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.logger.impl.core.datadog.DataDogRepository$sendEvent$2$1", f = "DataDogRepository.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.logger.impl.core.datadog.DataDogRepository$sendEvent$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ RequestBody $requestBody;
        int label;
        final /* synthetic */ DataDogRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DataDogRepository dataDogRepository, RequestBody requestBody, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = dataDogRepository;
            this.$requestBody = requestBody;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$requestBody, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DataDogApiService dataDogApiService;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                dataDogApiService = this.this$0.dataDogApiService;
                this.label = 1;
                if (dataDogApiService.sendEvent(this.$requestBody, this) == coroutine_suspended) {
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
}
