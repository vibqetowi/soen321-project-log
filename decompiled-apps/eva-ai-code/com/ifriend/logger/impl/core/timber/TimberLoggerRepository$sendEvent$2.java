package com.ifriend.logger.impl.core.timber;

import com.google.gson.Gson;
import com.ifriend.logger.api.events.LoggerLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimberLoggerRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.logger.impl.core.timber.TimberLoggerRepository$sendEvent$2", f = "TimberLoggerRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class TimberLoggerRepository$sendEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoggerLevel $level;
    final /* synthetic */ Map<String, String> $params;
    int label;
    final /* synthetic */ TimberLoggerRepository this$0;

    /* compiled from: TimberLoggerRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggerLevel.values().length];
            try {
                iArr[LoggerLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggerLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggerLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggerLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimberLoggerRepository$sendEvent$2(TimberLoggerRepository timberLoggerRepository, Map<String, String> map, LoggerLevel loggerLevel, Continuation<? super TimberLoggerRepository$sendEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = timberLoggerRepository;
        this.$params = map;
        this.$level = loggerLevel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimberLoggerRepository$sendEvent$2(this.this$0, this.$params, this.$level, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TimberLoggerRepository$sendEvent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Gson gson;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            gson = this.this$0.gson;
            String jsonElement = gson.toJsonTree(this.$params).toString();
            Intrinsics.checkNotNullExpressionValue(jsonElement, "toString(...)");
            int i = WhenMappings.$EnumSwitchMapping$0[this.$level.ordinal()];
            if (i == 1) {
                Timber.Forest.i(jsonElement, new Object[0]);
            } else if (i == 2) {
                Timber.Forest.d(jsonElement, new Object[0]);
            } else if (i == 3) {
                Timber.Forest.e(jsonElement, new Object[0]);
            } else if (i == 4) {
                Timber.Forest.w(jsonElement, new Object[0]);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
