package com.ifriend.analytics.impl.data.repository;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
/* compiled from: AnnalsAnalyticsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.analytics.impl.data.repository.AnnalsAnalyticsRepository$trackEvent$2", f = "AnnalsAnalyticsRepository.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class AnnalsAnalyticsRepository$trackEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $keyEvent;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ AnnalsAnalyticsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnalsAnalyticsRepository$trackEvent$2(AnnalsAnalyticsRepository annalsAnalyticsRepository, String str, Map<String, String> map, Continuation<? super AnnalsAnalyticsRepository$trackEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = annalsAnalyticsRepository;
        this.$keyEvent = str;
        this.$params = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnnalsAnalyticsRepository$trackEvent$2(this.this$0, this.$keyEvent, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnnalsAnalyticsRepository$trackEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        DispatcherProvider dispatcherProvider;
        DispatcherProvider dispatcherProvider2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.logLocalEvent(this.$keyEvent, this.$params);
            z = this.this$0.isDebuggable;
            if (!z) {
                dispatcherProvider = this.this$0.dispatcherProvider;
                CoroutineContext background = dispatcherProvider.background();
                dispatcherProvider2 = this.this$0.dispatcherProvider;
                this.label = 1;
                if (BuildersKt.withContext(background.plus(dispatcherProvider2.nonCancellable()), new AnonymousClass1(this.this$0, this.$params, this.$keyEvent, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnnalsAnalyticsRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.analytics.impl.data.repository.AnnalsAnalyticsRepository$trackEvent$2$1", f = "AnnalsAnalyticsRepository.kt", i = {1}, l = {45, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {"userId"}, s = {"L$0"})
    /* renamed from: com.ifriend.analytics.impl.data.repository.AnnalsAnalyticsRepository$trackEvent$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $keyEvent;
        final /* synthetic */ Map<String, String> $params;
        Object L$0;
        int label;
        final /* synthetic */ AnnalsAnalyticsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnnalsAnalyticsRepository annalsAnalyticsRepository, Map<String, String> map, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = annalsAnalyticsRepository;
            this.$params = map;
            this.$keyEvent = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$params, this.$keyEvent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AuthLocalDataSource authLocalDataSource;
            String str;
            AuthLocalDataSource authLocalDataSource2;
            String str2;
            AnnalsApiService annalsApiService;
            String str3;
            RequestBody.Companion companion;
            String jSONObject;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                authLocalDataSource = this.this$0.authLocalDataSource;
                this.label = 1;
                obj = authLocalDataSource.getUserId(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str2 = str;
                Map mutableMap = MapsKt.toMutableMap(this.$params);
                mutableMap.put("user-id", str2);
                annalsApiService = this.this$0.annalsApi;
                str3 = this.$keyEvent;
                companion = RequestBody.Companion;
                jSONObject = new JSONObject(new Gson().toJson(mutableMap)).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                this.L$0 = null;
                this.label = 3;
                if (annalsApiService.sendEvent((String) obj, str2, str3, companion.create(jSONObject, MediaType.Companion.parse("application/json; charset=utf-8")), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            } else {
                ResultKt.throwOnFailure(obj);
            }
            String str4 = (String) obj;
            if (str4 == null) {
                str4 = "nouser";
            }
            str = str4;
            authLocalDataSource2 = this.this$0.authLocalDataSource;
            this.L$0 = str;
            this.label = 2;
            obj = authLocalDataSource2.getFormattedUserToken(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            Map mutableMap2 = MapsKt.toMutableMap(this.$params);
            mutableMap2.put("user-id", str2);
            annalsApiService = this.this$0.annalsApi;
            str3 = this.$keyEvent;
            companion = RequestBody.Companion;
            jSONObject = new JSONObject(new Gson().toJson(mutableMap2)).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            this.L$0 = null;
            this.label = 3;
            if (annalsApiService.sendEvent((String) obj, str2, str3, companion.create(jSONObject, MediaType.Companion.parse("application/json; charset=utf-8")), this) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
