package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import java.util.Set;
/* loaded from: classes.dex */
public class CameraConfigs {
    private static final CameraConfig EMPTY_CONFIG = new EmptyCameraConfig();

    public static CameraConfig emptyConfig() {
        return EMPTY_CONFIG;
    }

    /* loaded from: classes.dex */
    static final class EmptyCameraConfig implements CameraConfig {
        private final Identifier mIdentifier = Identifier.create(new Object());

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ boolean containsOption(Config.Option option) {
            boolean containsOption;
            containsOption = getConfig().containsOption(option);
            return containsOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            getConfig().findOptions(str, optionMatcher);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            Config.OptionPriority optionPriority;
            optionPriority = getConfig().getOptionPriority(option);
            return optionPriority;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set getPriorities(Config.Option option) {
            Set priorities;
            priorities = getConfig().getPriorities(option);
            return priorities;
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ SessionProcessor getSessionProcessor() {
            return CameraConfig.CC.$default$getSessionProcessor(this);
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ SessionProcessor getSessionProcessor(SessionProcessor sessionProcessor) {
            return CameraConfig.CC.$default$getSessionProcessor(this, sessionProcessor);
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ int getUseCaseCombinationRequiredRule() {
            int intValue;
            intValue = ((Integer) retrieveOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
            return intValue;
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ UseCaseConfigFactory getUseCaseConfigFactory() {
            return CameraConfig.CC.$default$getUseCaseConfigFactory(this);
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public /* synthetic */ Boolean isZslDisabled() {
            return CameraConfig.CC.$default$isZslDisabled(this);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set listOptions() {
            Set listOptions;
            listOptions = getConfig().listOptions();
            return listOptions;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option) {
            Object retrieveOption;
            retrieveOption = getConfig().retrieveOption(option);
            return retrieveOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
            Object retrieveOption;
            retrieveOption = getConfig().retrieveOption(option, obj);
            return retrieveOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
            Object retrieveOptionWithPriority;
            retrieveOptionWithPriority = getConfig().retrieveOptionWithPriority(option, optionPriority);
            return retrieveOptionWithPriority;
        }

        EmptyCameraConfig() {
        }

        @Override // androidx.camera.core.impl.CameraConfig
        public Identifier getCompatibilityId() {
            return this.mIdentifier;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public Config getConfig() {
            return OptionsBundle.emptyBundle();
        }
    }

    private CameraConfigs() {
    }
}
