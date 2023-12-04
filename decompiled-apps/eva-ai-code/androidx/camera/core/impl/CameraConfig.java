package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public interface CameraConfig extends ReadableConfig {
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;
    public static final Config.Option<UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = Config.Option.create("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class);
    public static final Config.Option<Identifier> OPTION_COMPATIBILITY_ID = Config.Option.create("camerax.core.camera.compatibilityId", Identifier.class);
    public static final Config.Option<Integer> OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = Config.Option.create("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final Config.Option<SessionProcessor> OPTION_SESSION_PROCESSOR = Config.Option.create("camerax.core.camera.SessionProcessor", SessionProcessor.class);
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.camera.isZslDisabled", Boolean.class);

    /* loaded from: classes.dex */
    public interface Builder<B> {
        B setCompatibilityId(Identifier identifier);

        B setSessionProcessor(SessionProcessor sessionProcessor);

        B setUseCaseCombinationRequiredRule(int i);

        B setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory);

        B setZslDisabled(boolean z);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface RequiredRule {
    }

    Identifier getCompatibilityId();

    SessionProcessor getSessionProcessor();

    SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor);

    int getUseCaseCombinationRequiredRule();

    UseCaseConfigFactory getUseCaseConfigFactory();

    Boolean isZslDisabled();

    /* renamed from: androidx.camera.core.impl.CameraConfig$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static UseCaseConfigFactory $default$getUseCaseConfigFactory(CameraConfig _this) {
            return (UseCaseConfigFactory) _this.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE);
        }

        public static Boolean $default$isZslDisabled(CameraConfig _this) {
            return (Boolean) _this.retrieveOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.FALSE);
        }

        public static SessionProcessor $default$getSessionProcessor(CameraConfig _this, SessionProcessor sessionProcessor) {
            return (SessionProcessor) _this.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
        }

        public static SessionProcessor $default$getSessionProcessor(CameraConfig _this) {
            return (SessionProcessor) _this.retrieveOption(CameraConfig.OPTION_SESSION_PROCESSOR);
        }
    }
}
