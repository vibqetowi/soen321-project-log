package com.ifriend.domain.services.initialData;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.services.initialData.InitialTimeoutDataLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TimeoutDataLoaderBuilder.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J'\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00102\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011J\u001f\u0010#\u001a\u00020\u001c2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\u0002\b!J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011J\u001f\u0010%\u001a\u00020\u001c2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\u0002\b!J\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0011J\u001f\u0010)\u001a\u00020\u001c2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u001c0 ¢\u0006\u0002\b!R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\f¨\u0006+"}, d2 = {"Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder;", "", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/common_utils/Logger;)V", "allLoadersTimeout", "", "getAllLoadersTimeout", "()J", "setAllLoadersTimeout", "(J)V", "loaders", "", "Lkotlin/Pair;", "Lcom/ifriend/domain/services/initialData/InitialTimeoutDataLoader$Start;", "Lcom/ifriend/domain/services/initialData/InitialDataLoader;", "loggingTag", "", "getLoggingTag", "()Ljava/lang/String;", "setLoggingTag", "(Ljava/lang/String;)V", "oneLoaderTimeout", "getOneLoaderTimeout", "setOneLoaderTimeout", "add", "", TtmlNode.START, "loader", "initializer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "backgroundLoader", "backgroundSection", "blockingLoader", "blockingSection", "build", "Lcom/ifriend/domain/services/initialData/InitialTimeoutDataLoader;", "parallelLoader", "parallelSection", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeoutDataLoaderBuilder {
    private static final long ALL_SUBLOADERS_TIMEOUT = 60000;
    public static final Companion Companion = new Companion(null);
    private static final long ONE_SUBLOADER_TIMEOUT = 30000;
    private static final String TAG = "initial_loading";
    private long allLoadersTimeout;
    private final CoroutineDispatchers dispatchers;
    private final List<Pair<InitialTimeoutDataLoader.Start, InitialDataLoader>> loaders;
    private final Logger logger;
    private String loggingTag;
    private long oneLoaderTimeout;

    public TimeoutDataLoaderBuilder(CoroutineDispatchers dispatchers, Logger logger) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.dispatchers = dispatchers;
        this.logger = logger;
        this.loaders = new ArrayList();
        this.allLoadersTimeout = 60000L;
        this.oneLoaderTimeout = 30000L;
        this.loggingTag = TAG;
    }

    /* compiled from: TimeoutDataLoaderBuilder.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder$Companion;", "", "()V", "ALL_SUBLOADERS_TIMEOUT", "", "ONE_SUBLOADER_TIMEOUT", "TAG", "", "timeoutBlockingSection", "Lcom/ifriend/domain/services/initialData/InitialTimeoutDataLoader;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "initializer", "Lkotlin/Function1;", "Lcom/ifriend/domain/services/initialData/TimeoutDataLoaderBuilder;", "", "Lkotlin/ExtensionFunctionType;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InitialTimeoutDataLoader timeoutBlockingSection(CoroutineDispatchers dispatchers, Logger logger, Function1<? super TimeoutDataLoaderBuilder, Unit> initializer) {
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            TimeoutDataLoaderBuilder timeoutDataLoaderBuilder = new TimeoutDataLoaderBuilder(dispatchers, logger);
            initializer.invoke(timeoutDataLoaderBuilder);
            return timeoutDataLoaderBuilder.build();
        }
    }

    public final long getAllLoadersTimeout() {
        return this.allLoadersTimeout;
    }

    public final void setAllLoadersTimeout(long j) {
        this.allLoadersTimeout = j;
    }

    public final long getOneLoaderTimeout() {
        return this.oneLoaderTimeout;
    }

    public final void setOneLoaderTimeout(long j) {
        this.oneLoaderTimeout = j;
    }

    public final String getLoggingTag() {
        return this.loggingTag;
    }

    public final void setLoggingTag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loggingTag = str;
    }

    public final void blockingLoader(InitialDataLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        add(InitialTimeoutDataLoader.Start.BLOCKING, loader);
    }

    public final void parallelLoader(InitialDataLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        add(InitialTimeoutDataLoader.Start.PARALLEL, loader);
    }

    public final void backgroundLoader(InitialDataLoader loader) {
        Intrinsics.checkNotNullParameter(loader, "loader");
        add(InitialTimeoutDataLoader.Start.BACKGROUND, loader);
    }

    public final void blockingSection(Function1<? super TimeoutDataLoaderBuilder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        add(InitialTimeoutDataLoader.Start.BLOCKING, initializer);
    }

    public final void parallelSection(Function1<? super TimeoutDataLoaderBuilder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        add(InitialTimeoutDataLoader.Start.PARALLEL, initializer);
    }

    public final void backgroundSection(Function1<? super TimeoutDataLoaderBuilder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        add(InitialTimeoutDataLoader.Start.BACKGROUND, initializer);
    }

    public final void add(InitialTimeoutDataLoader.Start start, Function1<? super TimeoutDataLoaderBuilder, Unit> initializer) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        TimeoutDataLoaderBuilder timeoutDataLoaderBuilder = new TimeoutDataLoaderBuilder(this.dispatchers, this.logger);
        initializer.invoke(timeoutDataLoaderBuilder);
        add(start, timeoutDataLoaderBuilder.build());
    }

    private final void add(InitialTimeoutDataLoader.Start start, InitialDataLoader initialDataLoader) {
        this.loaders.add(TuplesKt.to(start, initialDataLoader));
    }

    public final InitialTimeoutDataLoader build() {
        return new InitialTimeoutDataLoader(this.dispatchers, this.logger, this.allLoadersTimeout, this.oneLoaderTimeout, this.loggingTag, this.loaders);
    }
}
