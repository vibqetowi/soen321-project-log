package androidx.camera.extensions;

import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ExtensionsConfig implements CameraConfig {
    public static final Config.Option<Integer> OPTION_EXTENSION_MODE = Config.Option.create("camerax.extensions.extensionMode", Integer.TYPE);
    private final Config mConfig;

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

    ExtensionsConfig(Config config) {
        this.mConfig = config;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return this.mConfig;
    }

    public int getExtensionMode() {
        return ((Integer) retrieveOption(OPTION_EXTENSION_MODE)).intValue();
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public Identifier getCompatibilityId() {
        return (Identifier) retrieveOption(OPTION_COMPATIBILITY_ID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Builder implements CameraConfig.Builder<Builder> {
        private final MutableOptionsBundle mConfig = MutableOptionsBundle.create();

        /* JADX INFO: Access modifiers changed from: package-private */
        public ExtensionsConfig build() {
            return new ExtensionsConfig(this.mConfig);
        }

        public Builder setExtensionMode(int i) {
            this.mConfig.insertOption(ExtensionsConfig.OPTION_EXTENSION_MODE, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public Builder setUseCaseConfigFactory(UseCaseConfigFactory useCaseConfigFactory) {
            this.mConfig.insertOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public Builder setCompatibilityId(Identifier identifier) {
            this.mConfig.insertOption(CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public Builder setUseCaseCombinationRequiredRule(int i) {
            this.mConfig.insertOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public Builder setSessionProcessor(SessionProcessor sessionProcessor) {
            this.mConfig.insertOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public Builder setZslDisabled(boolean z) {
            this.mConfig.insertOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z));
            return this;
        }
    }
}
