package com.ifriend.domain.services.initialData;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: InitialTimeoutDataLoader.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r0\f¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u0011*\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/services/initialData/InitialTimeoutDataLoader;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "allLoadersTimeout", "", "oneLoaderTimeout", "loggingTag", "", "loaders", "", "Lkotlin/Pair;", "Lcom/ifriend/domain/services/initialData/InitialTimeoutDataLoader$Start;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;JJLjava/lang/String;Ljava/util/List;)V", "load", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "run", "(Lcom/ifriend/domain/services/initialData/InitialDataLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Start", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InitialTimeoutDataLoader implements InitialDataLoader {
    private final long allLoadersTimeout;
    private final CoroutineDispatchers dispatchers;
    private final List<Pair<Start, InitialDataLoader>> loaders;
    private final Logger logger;
    private final String loggingTag;
    private final long oneLoaderTimeout;

    /* JADX WARN: Multi-variable type inference failed */
    public InitialTimeoutDataLoader(CoroutineDispatchers dispatchers, Logger logger, long j, long j2, String loggingTag, List<? extends Pair<? extends Start, ? extends InitialDataLoader>> loaders) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(loggingTag, "loggingTag");
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.dispatchers = dispatchers;
        this.logger = logger;
        this.allLoadersTimeout = j;
        this.oneLoaderTimeout = j2;
        this.loggingTag = loggingTag;
        this.loaders = loaders;
    }

    @Override // com.ifriend.domain.services.initialData.InitialDataLoader
    public Object load(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(this.dispatchers.getIO()), new InitialTimeoutDataLoader$load$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run(InitialDataLoader initialDataLoader, Continuation<? super Boolean> continuation) {
        InitialTimeoutDataLoader$run$1 initialTimeoutDataLoader$run$1;
        Object obj;
        int i;
        InitialTimeoutDataLoader initialTimeoutDataLoader;
        if (continuation instanceof InitialTimeoutDataLoader$run$1) {
            initialTimeoutDataLoader$run$1 = (InitialTimeoutDataLoader$run$1) continuation;
            if ((initialTimeoutDataLoader$run$1.label & Integer.MIN_VALUE) != 0) {
                initialTimeoutDataLoader$run$1.label -= Integer.MIN_VALUE;
                obj = initialTimeoutDataLoader$run$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = initialTimeoutDataLoader$run$1.label;
                boolean z = true;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.logger.info("    - " + Reflection.getOrCreateKotlinClass(initialDataLoader.getClass()).getSimpleName() + " started", this.loggingTag);
                    initialTimeoutDataLoader$run$1.L$0 = this;
                    initialTimeoutDataLoader$run$1.L$1 = initialDataLoader;
                    initialTimeoutDataLoader$run$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(this.oneLoaderTimeout, new InitialTimeoutDataLoader$run$status$1(initialDataLoader, null), initialTimeoutDataLoader$run$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    initialTimeoutDataLoader = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    initialDataLoader = (InitialDataLoader) initialTimeoutDataLoader$run$1.L$1;
                    initialTimeoutDataLoader = (InitialTimeoutDataLoader) initialTimeoutDataLoader$run$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (Intrinsics.areEqual((Boolean) obj, Boxing.boxBoolean(true))) {
                    initialTimeoutDataLoader.logger.info("    - " + Reflection.getOrCreateKotlinClass(initialDataLoader.getClass()).getSimpleName() + " failed", initialTimeoutDataLoader.loggingTag);
                    z = false;
                } else {
                    initialTimeoutDataLoader.logger.info("    - " + Reflection.getOrCreateKotlinClass(initialDataLoader.getClass()).getSimpleName() + " finished", initialTimeoutDataLoader.loggingTag);
                }
                return Boxing.boxBoolean(z);
            }
        }
        initialTimeoutDataLoader$run$1 = new InitialTimeoutDataLoader$run$1(this, continuation);
        obj = initialTimeoutDataLoader$run$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = initialTimeoutDataLoader$run$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (Intrinsics.areEqual((Boolean) obj, Boxing.boxBoolean(true))) {
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InitialTimeoutDataLoader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/services/initialData/InitialTimeoutDataLoader$Start;", "", "(Ljava/lang/String;I)V", "BLOCKING", "PARALLEL", "BACKGROUND", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Start {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Start[] $VALUES;
        public static final Start BLOCKING = new Start("BLOCKING", 0);
        public static final Start PARALLEL = new Start("PARALLEL", 1);
        public static final Start BACKGROUND = new Start("BACKGROUND", 2);

        private static final /* synthetic */ Start[] $values() {
            return new Start[]{BLOCKING, PARALLEL, BACKGROUND};
        }

        public static EnumEntries<Start> getEntries() {
            return $ENTRIES;
        }

        public static Start valueOf(String str) {
            return (Start) Enum.valueOf(Start.class, str);
        }

        public static Start[] values() {
            return (Start[]) $VALUES.clone();
        }

        private Start(String str, int i) {
        }

        static {
            Start[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }
}
