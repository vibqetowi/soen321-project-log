package org.threeten.bp.zone;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes5.dex */
public abstract class ZoneRulesInitializer {
    public static final ZoneRulesInitializer DO_NOTHING = new DoNothingZoneRulesInitializer();
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean(false);
    private static final AtomicReference<ZoneRulesInitializer> INITIALIZER = new AtomicReference<>();

    protected abstract void initializeProviders();

    public static void setInitializer(ZoneRulesInitializer zoneRulesInitializer) {
        if (INITIALIZED.get()) {
            throw new IllegalStateException("Already initialized");
        }
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(INITIALIZER, null, zoneRulesInitializer)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void initialize() {
        if (INITIALIZED.getAndSet(true)) {
            throw new IllegalStateException("Already initialized");
        }
        AtomicReference<ZoneRulesInitializer> atomicReference = INITIALIZER;
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, new ServiceLoaderZoneRulesInitializer());
        atomicReference.get().initializeProviders();
    }

    /* loaded from: classes5.dex */
    static class DoNothingZoneRulesInitializer extends ZoneRulesInitializer {
        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        protected void initializeProviders() {
        }

        DoNothingZoneRulesInitializer() {
        }
    }

    /* loaded from: classes5.dex */
    static class ServiceLoaderZoneRulesInitializer extends ZoneRulesInitializer {
        ServiceLoaderZoneRulesInitializer() {
        }

        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        protected void initializeProviders() {
            Iterator it = ServiceLoader.load(ZoneRulesProvider.class, ZoneRulesProvider.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    ZoneRulesProvider.registerProvider((ZoneRulesProvider) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }
}
