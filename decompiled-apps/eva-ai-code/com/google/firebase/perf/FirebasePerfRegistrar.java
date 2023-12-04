package com.google.firebase.perf;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.sessions.FirebaseSessions;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* loaded from: classes7.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    static {
        FirebaseSessionsDependencies.INSTANCE.addDependency(SessionSubscriber.Name.PERFORMANCE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        final Qualified qualified = Qualified.qualified(UiThread.class, Executor.class);
        return Arrays.asList(Component.builder(FirebasePerformance.class).name(LIBRARY_NAME).add(Dependency.required(FirebaseApp.class)).add(Dependency.requiredProvider(RemoteConfigComponent.class)).add(Dependency.required(FirebaseInstallationsApi.class)).add(Dependency.requiredProvider(TransportFactory.class)).add(Dependency.required(FirebasePerfEarly.class)).factory(new ComponentFactory() { // from class: com.google.firebase.perf.FirebasePerfRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebasePerformance providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(componentContainer);
                return providesFirebasePerformance;
            }
        }).build(), Component.builder(FirebasePerfEarly.class).name(EARLY_LIBRARY_NAME).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(FirebaseSessions.class)).add(Dependency.optionalProvider(StartupTime.class)).add(Dependency.required(qualified)).eagerInDefaultApp().factory(new ComponentFactory() { // from class: com.google.firebase.perf.FirebasePerfRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return FirebasePerfRegistrar.lambda$getComponents$0(Qualified.this, componentContainer);
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebasePerfEarly lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        return new FirebasePerfEarly((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseSessions) componentContainer.get(FirebaseSessions.class), (StartupTime) componentContainer.getProvider(StartupTime.class).get(), (Executor) componentContainer.get(qualified));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(ComponentContainer componentContainer) {
        componentContainer.get(FirebasePerfEarly.class);
        return DaggerFirebasePerformanceComponent.builder().firebasePerformanceModule(new FirebasePerformanceModule((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getProvider(RemoteConfigComponent.class), componentContainer.getProvider(TransportFactory.class))).build().getFirebasePerformance();
    }
}
