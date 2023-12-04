package androidx.camera.core.impl;

import java.util.Set;
/* loaded from: classes.dex */
public interface Config {

    /* loaded from: classes.dex */
    public interface OptionMatcher {
        boolean onOptionMatched(Option<?> option);
    }

    /* loaded from: classes.dex */
    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    boolean containsOption(Option<?> option);

    void findOptions(String str, OptionMatcher optionMatcher);

    OptionPriority getOptionPriority(Option<?> option);

    Set<OptionPriority> getPriorities(Option<?> option);

    Set<Option<?>> listOptions();

    <ValueT> ValueT retrieveOption(Option<ValueT> option);

    <ValueT> ValueT retrieveOption(Option<ValueT> option, ValueT valuet);

    <ValueT> ValueT retrieveOptionWithPriority(Option<ValueT> option, OptionPriority optionPriority);

    /* loaded from: classes.dex */
    public static abstract class Option<T> {
        public abstract String getId();

        public abstract Object getToken();

        public abstract Class<T> getValueClass();

        public static <T> Option<T> create(String str, Class<?> cls) {
            return create(str, cls, null);
        }

        public static <T> Option<T> create(String str, Class<?> cls, Object obj) {
            return new AutoValue_Config_Option(str, cls, obj);
        }
    }

    /* renamed from: androidx.camera.core.impl.Config$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static boolean hasConflict(OptionPriority optionPriority, OptionPriority optionPriority2) {
            if (optionPriority == OptionPriority.ALWAYS_OVERRIDE && optionPriority2 == OptionPriority.ALWAYS_OVERRIDE) {
                return true;
            }
            return optionPriority == OptionPriority.REQUIRED && optionPriority2 == OptionPriority.REQUIRED;
        }

        public static Config mergeConfigs(Config config, Config config2) {
            MutableOptionsBundle create;
            if (config == null && config2 == null) {
                return OptionsBundle.emptyBundle();
            }
            if (config2 != null) {
                create = MutableOptionsBundle.from(config2);
            } else {
                create = MutableOptionsBundle.create();
            }
            if (config != null) {
                for (Option<?> option : config.listOptions()) {
                    create.insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
                }
            }
            return OptionsBundle.from(create);
        }
    }
}
