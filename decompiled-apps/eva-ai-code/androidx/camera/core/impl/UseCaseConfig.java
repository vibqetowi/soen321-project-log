package androidx.camera.core.impl;

import android.util.Range;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
/* loaded from: classes.dex */
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, UseCaseEventConfig, ImageInputConfig {
    public static final Config.Option<SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = Config.Option.create("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    public static final Config.Option<CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = Config.Option.create("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class);
    public static final Config.Option<SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class);
    public static final Config.Option<CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class);
    public static final Config.Option<Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY = Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);
    public static final Config.Option<CameraSelector> OPTION_CAMERA_SELECTOR = Config.Option.create("camerax.core.useCase.cameraSelector", CameraSelector.class);
    public static final Config.Option<Range<Integer>> OPTION_TARGET_FRAME_RATE = Config.Option.create("camerax.core.useCase.targetFrameRate", CameraSelector.class);

    /* loaded from: classes.dex */
    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T>, UseCaseEventConfig.Builder<B> {
        C getUseCaseConfig();

        B setCameraSelector(CameraSelector cameraSelector);

        B setCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

        B setDefaultCaptureConfig(CaptureConfig captureConfig);

        B setDefaultSessionConfig(SessionConfig sessionConfig);

        B setSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

        B setSurfaceOccupancyPriority(int i);
    }

    CameraSelector getCameraSelector();

    CameraSelector getCameraSelector(CameraSelector cameraSelector);

    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker();

    CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker);

    CaptureConfig getDefaultCaptureConfig();

    CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig);

    SessionConfig getDefaultSessionConfig();

    SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig);

    SessionConfig.OptionUnpacker getSessionOptionUnpacker();

    SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker);

    int getSurfaceOccupancyPriority();

    int getSurfaceOccupancyPriority(int i);

    Range<Integer> getTargetFramerate();

    Range<Integer> getTargetFramerate(Range<Integer> range);

    /* renamed from: androidx.camera.core.impl.UseCaseConfig$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static SessionConfig $default$getDefaultSessionConfig(UseCaseConfig _this, SessionConfig sessionConfig) {
            return (SessionConfig) _this.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
        }

        public static SessionConfig $default$getDefaultSessionConfig(UseCaseConfig _this) {
            return (SessionConfig) _this.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
        }

        public static CaptureConfig $default$getDefaultCaptureConfig(UseCaseConfig _this, CaptureConfig captureConfig) {
            return (CaptureConfig) _this.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
        }

        public static CaptureConfig $default$getDefaultCaptureConfig(UseCaseConfig _this) {
            return (CaptureConfig) _this.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
        }

        public static SessionConfig.OptionUnpacker $default$getSessionOptionUnpacker(UseCaseConfig _this, SessionConfig.OptionUnpacker optionUnpacker) {
            return (SessionConfig.OptionUnpacker) _this.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
        }

        public static SessionConfig.OptionUnpacker $default$getSessionOptionUnpacker(UseCaseConfig _this) {
            return (SessionConfig.OptionUnpacker) _this.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
        }

        public static CaptureConfig.OptionUnpacker $default$getCaptureOptionUnpacker(UseCaseConfig _this, CaptureConfig.OptionUnpacker optionUnpacker) {
            return (CaptureConfig.OptionUnpacker) _this.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
        }

        public static CaptureConfig.OptionUnpacker $default$getCaptureOptionUnpacker(UseCaseConfig _this) {
            return (CaptureConfig.OptionUnpacker) _this.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
        }

        public static CameraSelector $default$getCameraSelector(UseCaseConfig _this, CameraSelector cameraSelector) {
            return (CameraSelector) _this.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
        }

        public static CameraSelector $default$getCameraSelector(UseCaseConfig _this) {
            return (CameraSelector) _this.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR);
        }

        public static Range $default$getTargetFramerate(UseCaseConfig _this, Range range) {
            return (Range) _this.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
        }

        public static Range $default$getTargetFramerate(UseCaseConfig _this) {
            return (Range) _this.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE);
        }
    }
}
