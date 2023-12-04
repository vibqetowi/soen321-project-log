package androidx.camera.core.impl;

import androidx.camera.core.impl.Config;
import java.util.Set;
/* loaded from: classes.dex */
public interface ReadableConfig extends Config {
    @Override // androidx.camera.core.impl.Config
    boolean containsOption(Config.Option<?> option);

    @Override // androidx.camera.core.impl.Config
    void findOptions(String str, Config.OptionMatcher optionMatcher);

    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    Config.OptionPriority getOptionPriority(Config.Option<?> option);

    @Override // androidx.camera.core.impl.Config
    Set<Config.OptionPriority> getPriorities(Config.Option<?> option);

    @Override // androidx.camera.core.impl.Config
    Set<Config.Option<?>> listOptions();

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOption(Config.Option<ValueT> option);

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOption(Config.Option<ValueT> option, ValueT valuet);

    @Override // androidx.camera.core.impl.Config
    <ValueT> ValueT retrieveOptionWithPriority(Config.Option<ValueT> option, Config.OptionPriority optionPriority);

    /* renamed from: androidx.camera.core.impl.ReadableConfig$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
    }
}
