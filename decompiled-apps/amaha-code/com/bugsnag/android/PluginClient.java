package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import com.theinnerhour.b2b.utils.SessionManager;
import is.u;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: PluginClient.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\rJ\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/bugsnag/android/PluginClient;", "", "", "clz", "Lcom/bugsnag/android/Plugin;", "instantiatePlugin", "plugin", "Lcom/bugsnag/android/Client;", SessionManager.KEY_CLIENT, "Lhs/k;", "loadPluginInternal", "getNdkPlugin", "loadPlugins", "", "autoNotify", "setAutoNotify", "autoDetectAnrs", "setAutoDetectAnrs", "Ljava/lang/Class;", "findPlugin", "", "plugins", "Ljava/util/Set;", "ndkPlugin", "Lcom/bugsnag/android/Plugin;", "anrPlugin", "rnPlugin", "Lcom/bugsnag/android/internal/ImmutableConfig;", "immutableConfig", "Lcom/bugsnag/android/internal/ImmutableConfig;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "userPlugins", "<init>", "(Ljava/util/Set;Lcom/bugsnag/android/internal/ImmutableConfig;Lcom/bugsnag/android/Logger;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class PluginClient {
    private static final String ANR_PLUGIN = "com.bugsnag.android.AnrPlugin";
    public static final Companion Companion = new Companion(null);
    private static final String NDK_PLUGIN = "com.bugsnag.android.NdkPlugin";
    private static final String RN_PLUGIN = "com.bugsnag.android.BugsnagReactNativePlugin";
    private final Plugin anrPlugin;
    private final ImmutableConfig immutableConfig;
    private final Logger logger;
    private final Plugin ndkPlugin;
    private final Set<Plugin> plugins;
    private final Plugin rnPlugin;

    /* compiled from: PluginClient.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/PluginClient$Companion;", "", "()V", "ANR_PLUGIN", "", "NDK_PLUGIN", "RN_PLUGIN", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public PluginClient(Set<? extends Plugin> userPlugins, ImmutableConfig immutableConfig, Logger logger) {
        i.h(userPlugins, "userPlugins");
        i.h(immutableConfig, "immutableConfig");
        i.h(logger, "logger");
        this.immutableConfig = immutableConfig;
        this.logger = logger;
        Plugin instantiatePlugin = instantiatePlugin(NDK_PLUGIN);
        this.ndkPlugin = instantiatePlugin;
        Plugin instantiatePlugin2 = instantiatePlugin(ANR_PLUGIN);
        this.anrPlugin = instantiatePlugin2;
        Plugin instantiatePlugin3 = instantiatePlugin(RN_PLUGIN);
        this.rnPlugin = instantiatePlugin3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(userPlugins);
        if (instantiatePlugin != null) {
            linkedHashSet.add(instantiatePlugin);
        }
        if (instantiatePlugin2 != null) {
            linkedHashSet.add(instantiatePlugin2);
        }
        if (instantiatePlugin3 != null) {
            linkedHashSet.add(instantiatePlugin3);
        }
        this.plugins = u.M2(linkedHashSet);
    }

    private final Plugin instantiatePlugin(String str) {
        try {
            Object newInstance = Class.forName(str).newInstance();
            if (newInstance != null) {
                return (Plugin) newInstance;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bugsnag.android.Plugin");
        } catch (ClassNotFoundException unused) {
            Logger logger = this.logger;
            logger.d("Plugin '" + str + "' is not on the classpath - functionality will not be enabled.");
            return null;
        } catch (Throwable th2) {
            Logger logger2 = this.logger;
            logger2.e("Failed to load plugin '" + str + '\'', th2);
            return null;
        }
    }

    private final void loadPluginInternal(Plugin plugin, Client client) {
        String name = plugin.getClass().getName();
        ErrorTypes enabledErrorTypes = this.immutableConfig.getEnabledErrorTypes();
        if (i.b(name, NDK_PLUGIN)) {
            if (enabledErrorTypes.getNdkCrashes()) {
                plugin.load(client);
            }
        } else if (i.b(name, ANR_PLUGIN)) {
            if (enabledErrorTypes.getAnrs()) {
                plugin.load(client);
            }
        } else {
            plugin.load(client);
        }
    }

    public final Plugin findPlugin(Class<?> clz) {
        Object obj;
        i.h(clz, "clz");
        Iterator<T> it = this.plugins.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (i.b(((Plugin) obj).getClass(), clz)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Plugin) obj;
    }

    public final Plugin getNdkPlugin() {
        return this.ndkPlugin;
    }

    public final void loadPlugins(Client client) {
        i.h(client, "client");
        for (Plugin plugin : this.plugins) {
            try {
                loadPluginInternal(plugin, client);
            } catch (Throwable th2) {
                Logger logger = this.logger;
                logger.e("Failed to load plugin " + plugin + ", continuing with initialisation.", th2);
            }
        }
    }

    public final void setAutoDetectAnrs(Client client, boolean z10) {
        i.h(client, "client");
        if (z10) {
            Plugin plugin = this.anrPlugin;
            if (plugin != null) {
                plugin.load(client);
                return;
            }
            return;
        }
        Plugin plugin2 = this.anrPlugin;
        if (plugin2 != null) {
            plugin2.unload();
        }
    }

    public final void setAutoNotify(Client client, boolean z10) {
        i.h(client, "client");
        setAutoDetectAnrs(client, z10);
        if (z10) {
            Plugin plugin = this.ndkPlugin;
            if (plugin != null) {
                plugin.load(client);
                return;
            }
            return;
        }
        Plugin plugin2 = this.ndkPlugin;
        if (plugin2 != null) {
            plugin2.unload();
        }
    }
}
