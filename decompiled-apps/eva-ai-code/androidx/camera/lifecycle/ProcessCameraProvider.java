package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessCameraProvider implements LifecycleCameraProvider {
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private CameraX mCameraX;
    private ListenableFuture<CameraX> mCameraXInitializeFuture;
    private Context mContext;
    private final Object mLock = new Object();
    private CameraXConfig.Provider mCameraXConfigProvider = null;
    private ListenableFuture<Void> mCameraXShutdownFuture = Futures.immediateFuture(null);
    private final LifecycleCameraRepository mLifecycleCameraRepository = new LifecycleCameraRepository();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ CameraXConfig lambda$configureInstanceInternal$3(CameraXConfig cameraXConfig) {
        return cameraXConfig;
    }

    public static ListenableFuture<ProcessCameraProvider> getInstance(final Context context) {
        Preconditions.checkNotNull(context);
        return Futures.transform(sAppInstance.getOrCreateCameraXInstance(context), new Function() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda2
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ProcessCameraProvider.lambda$getInstance$0(context, (CameraX) obj);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ProcessCameraProvider lambda$getInstance$0(Context context, CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = sAppInstance;
        processCameraProvider.setCameraX(cameraX);
        processCameraProvider.setContext(ContextUtil.getApplicationContext(context));
        return processCameraProvider;
    }

    private ListenableFuture<CameraX> getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            ListenableFuture<CameraX> listenableFuture = this.mCameraXInitializeFuture;
            if (listenableFuture != null) {
                return listenableFuture;
            }
            final CameraX cameraX = new CameraX(context, this.mCameraXConfigProvider);
            ListenableFuture<CameraX> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return ProcessCameraProvider.this.m193x6ee14178(cameraX, completer);
                }
            });
            this.mCameraXInitializeFuture = future;
            return future;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getOrCreateCameraXInstance$2$androidx-camera-lifecycle-ProcessCameraProvider  reason: not valid java name */
    public /* synthetic */ Object m193x6ee14178(final CameraX cameraX, final CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            Futures.addCallback(FutureChain.from(this.mCameraXShutdownFuture).transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    ListenableFuture initializeFuture;
                    Void r2 = (Void) obj;
                    initializeFuture = CameraX.this.getInitializeFuture();
                    return initializeFuture;
                }
            }, CameraXExecutors.directExecutor()), new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.ProcessCameraProvider.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(Void r2) {
                    completer.set(cameraX);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    completer.setException(th);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    public static void configureInstance(CameraXConfig cameraXConfig) {
        sAppInstance.configureInstanceInternal(cameraXConfig);
    }

    private void configureInstanceInternal(final CameraXConfig cameraXConfig) {
        synchronized (this.mLock) {
            Preconditions.checkNotNull(cameraXConfig);
            Preconditions.checkState(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.mCameraXConfigProvider = new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.CameraXConfig.Provider
                public final CameraXConfig getCameraXConfig() {
                    return ProcessCameraProvider.lambda$configureInstanceInternal$3(CameraXConfig.this);
                }
            };
        }
    }

    public ListenableFuture<Void> shutdown() {
        this.mLifecycleCameraRepository.clear();
        CameraX cameraX = this.mCameraX;
        ListenableFuture<Void> shutdown = cameraX != null ? cameraX.shutdown() : Futures.immediateFuture(null);
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = shutdown;
        }
        this.mCameraX = null;
        this.mContext = null;
        return shutdown;
    }

    private void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    private void setContext(Context context) {
        this.mContext = context;
    }

    public Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        return bindToLifecycle(lifecycleOwner, cameraSelector, null, useCaseArr);
    }

    public Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        return bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup.getViewPort(), (UseCase[]) useCaseGroup.getUseCases().toArray(new UseCase[0]));
    }

    Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, ViewPort viewPort, UseCase... useCaseArr) {
        CameraConfig cameraConfig;
        CameraConfig config;
        Threads.checkMainThread();
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        int length = useCaseArr.length;
        int i = 0;
        while (true) {
            cameraConfig = null;
            if (i >= length) {
                break;
            }
            CameraSelector cameraSelector2 = useCaseArr[i].getCurrentConfig().getCameraSelector(null);
            if (cameraSelector2 != null) {
                Iterator<CameraFilter> it = cameraSelector2.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    fromSelector.addCameraFilter(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<CameraInternal> filter = fromSelector.build().filter(this.mCameraX.getCameraRepository().getCameras());
        if (filter.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, CameraUseCaseAdapter.generateCameraId(filter));
        Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
        for (UseCase useCase : useCaseArr) {
            for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                if (lifecycleCamera2.isBound(useCase) && lifecycleCamera2 != lifecycleCamera) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", useCase));
                }
            }
        }
        if (lifecycleCamera == null) {
            lifecycleCamera = this.mLifecycleCameraRepository.createLifecycleCamera(lifecycleOwner, new CameraUseCaseAdapter(filter, this.mCameraX.getCameraDeviceSurfaceManager(), this.mCameraX.getDefaultConfigFactory()));
        }
        Iterator<CameraFilter> it2 = cameraSelector.getCameraFilterSet().iterator();
        while (it2.hasNext()) {
            CameraFilter next = it2.next();
            if (next.getIdentifier() != CameraFilter.DEFAULT_ID && (config = ExtendedCameraConfigProviderStore.getConfigProvider(next.getIdentifier()).getConfig(lifecycleCamera.getCameraInfo(), this.mContext)) != null) {
                if (cameraConfig != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                cameraConfig = config;
            }
        }
        lifecycleCamera.setExtendedConfig(cameraConfig);
        if (useCaseArr.length == 0) {
            return lifecycleCamera;
        }
        this.mLifecycleCameraRepository.bindToLifecycleCamera(lifecycleCamera, viewPort, Arrays.asList(useCaseArr));
        return lifecycleCamera;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(UseCase useCase) {
        for (LifecycleCamera lifecycleCamera : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbind(UseCase... useCaseArr) {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbind(Arrays.asList(useCaseArr));
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbindAll() {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbindAll();
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(CameraSelector cameraSelector) throws CameraInfoUnavailableException {
        try {
            cameraSelector.select(this.mCameraX.getCameraRepository().getCameras());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public List<CameraInfo> getAvailableCameraInfos() {
        ArrayList arrayList = new ArrayList();
        for (CameraInternal cameraInternal : this.mCameraX.getCameraRepository().getCameras()) {
            arrayList.add(cameraInternal.getCameraInfo());
        }
        return arrayList;
    }

    private ProcessCameraProvider() {
    }
}
