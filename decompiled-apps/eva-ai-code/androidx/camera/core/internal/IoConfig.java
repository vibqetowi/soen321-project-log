package androidx.camera.core.internal;

import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface IoConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_IO_EXECUTOR = Config.Option.create("camerax.core.io.ioExecutor", Executor.class);

    /* loaded from: classes.dex */
    public interface Builder<B> {
        B setIoExecutor(Executor executor);
    }

    Executor getIoExecutor();

    Executor getIoExecutor(Executor executor);

    /* renamed from: androidx.camera.core.internal.IoConfig$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static Executor $default$getIoExecutor(IoConfig _this, Executor executor) {
            return (Executor) _this.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, executor);
        }

        public static Executor $default$getIoExecutor(IoConfig _this) {
            return (Executor) _this.retrieveOption(IoConfig.OPTION_IO_EXECUTOR);
        }
    }
}
