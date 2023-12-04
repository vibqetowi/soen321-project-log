package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class CameraX {
    private static final long RETRY_SLEEP_MILLIS = 500;
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private static final long WAIT_INITIALIZED_TIMEOUT_MILLIS = 3000;
    private Context mAppContext;
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final ListenableFuture<Void> mInitInternalFuture;
    private final Integer mMinLogLevel;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();
    final CameraRepository mCameraRepository = new CameraRepository();
    private final Object mInitializeLock = new Object();
    private InternalInitState mInitState = InternalInitState.UNINITIALIZED;
    private ListenableFuture<Void> mShutdownInternalFuture = Futures.immediateFuture(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(Context context, CameraXConfig.Provider provider) {
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.mCameraXConfig = configProvider.getCameraXConfig();
        }
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = HandlerCompat.createAsync(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mInitInternalFuture = initInternal(context);
    }

    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        Application applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            ServiceInfo serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, MetadataHolderService.class), 640);
            String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string == null) {
                Logger.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public ListenableFuture<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public ListenableFuture<Void> shutdown() {
        return shutdownInternal();
    }

    private ListenableFuture<Void> initInternal(final Context context) {
        ListenableFuture<Void> future;
        synchronized (this.mInitializeLock) {
            Preconditions.checkState(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda4
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return CameraX.this.m140lambda$initInternal$0$androidxcameracoreCameraX(context, completer);
                }
            });
        }
        return future;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initInternal$0$androidx-camera-core-CameraX  reason: not valid java name */
    public /* synthetic */ Object m140lambda$initInternal$0$androidxcameracoreCameraX(Context context, CallbackToFutureAdapter.Completer completer) throws Exception {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), context, completer);
        return "CameraX initInternal";
    }

    private void initAndRetryRecursively(final Executor executor, final long j, final Context context, final CallbackToFutureAdapter.Completer<Void> completer) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.this.m139lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(context, executor, completer, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initAndRetryRecursively$2$androidx-camera-core-CameraX  reason: not valid java name */
    public /* synthetic */ void m139lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(Context context, final Executor executor, final CallbackToFutureAdapter.Completer completer, final long j) {
        try {
            Application applicationFromContext = ContextUtil.getApplicationFromContext(context);
            this.mAppContext = applicationFromContext;
            if (applicationFromContext == null) {
                this.mAppContext = ContextUtil.getApplicationContext(context);
            }
            CameraFactory.Provider cameraFactoryProvider = this.mCameraXConfig.getCameraFactoryProvider(null);
            if (cameraFactoryProvider == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            CameraThreadConfig create = CameraThreadConfig.create(this.mCameraExecutor, this.mSchedulerHandler);
            CameraSelector availableCamerasLimiter = this.mCameraXConfig.getAvailableCamerasLimiter(null);
            this.mCameraFactory = cameraFactoryProvider.newInstance(this.mAppContext, create, availableCamerasLimiter);
            CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = this.mCameraXConfig.getDeviceSurfaceManagerProvider(null);
            if (deviceSurfaceManagerProvider == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            this.mSurfaceManager = deviceSurfaceManagerProvider.newInstance(this.mAppContext, this.mCameraFactory.getCameraManager(), this.mCameraFactory.getAvailableCameraIds());
            UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = this.mCameraXConfig.getUseCaseConfigFactoryProvider(null);
            if (useCaseConfigFactoryProvider == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            this.mDefaultConfigFactory = useCaseConfigFactoryProvider.newInstance(this.mAppContext);
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).init(this.mCameraFactory);
            }
            this.mCameraRepository.init(this.mCameraFactory);
            CameraValidator.validateCameras(this.mAppContext, this.mCameraRepository, availableCamerasLimiter);
            setStateToInitialized();
            completer.set(null);
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                Logger.w(TAG, "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                HandlerCompat.postDelayed(this.mSchedulerHandler, new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraX.this.m138lambda$initAndRetryRecursively$1$androidxcameracoreCameraX(executor, j, completer);
                    }
                }, RETRY_TOKEN, 500L);
                return;
            }
            synchronized (this.mInitializeLock) {
                this.mInitState = InternalInitState.INITIALIZING_ERROR;
            }
            if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                Logger.e(TAG, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                completer.set(null);
            } else if (e instanceof InitializationException) {
                completer.setException(e);
            } else {
                completer.setException(new InitializationException(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$initAndRetryRecursively$1$androidx-camera-core-CameraX  reason: not valid java name */
    public /* synthetic */ void m138lambda$initAndRetryRecursively$1$androidxcameracoreCameraX(Executor executor, long j, CallbackToFutureAdapter.Completer completer) {
        initAndRetryRecursively(executor, j, this.mAppContext, completer);
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private ListenableFuture<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
            int i = AnonymousClass1.$SwitchMap$androidx$camera$core$CameraX$InternalInitState[this.mInitState.ordinal()];
            if (i == 1) {
                this.mInitState = InternalInitState.SHUTDOWN;
                return Futures.immediateFuture(null);
            } else if (i == 2) {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            } else {
                if (i == 3 || i == 4) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    decreaseMinLogLevelReference(this.mMinLogLevel);
                    this.mShutdownInternalFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda0
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return CameraX.this.m142lambda$shutdownInternal$4$androidxcameracoreCameraX(completer);
                        }
                    });
                }
                return this.mShutdownInternalFuture;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.CameraX$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$CameraX$InternalInitState;

        static {
            int[] iArr = new int[InternalInitState.values().length];
            $SwitchMap$androidx$camera$core$CameraX$InternalInitState = iArr;
            try {
                iArr[InternalInitState.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$CameraX$InternalInitState[InternalInitState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$CameraX$InternalInitState[InternalInitState.INITIALIZING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$core$CameraX$InternalInitState[InternalInitState.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$core$CameraX$InternalInitState[InternalInitState.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$shutdownInternal$4$androidx-camera-core-CameraX  reason: not valid java name */
    public /* synthetic */ Object m142lambda$shutdownInternal$4$androidxcameracoreCameraX(final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mCameraRepository.deinit().addListener(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                CameraX.this.m141lambda$shutdownInternal$3$androidxcameracoreCameraX(completer);
            }
        }, this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$shutdownInternal$3$androidx-camera-core-CameraX  reason: not valid java name */
    public /* synthetic */ void m141lambda$shutdownInternal$3$androidxcameracoreCameraX(CallbackToFutureAdapter.Completer completer) {
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        completer.set(null);
    }

    boolean isInitialized() {
        boolean z;
        synchronized (this.mInitializeLock) {
            z = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z;
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            updateOrResetMinLogLevel();
        }
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            int intValue = sparseArray.get(num.intValue()).intValue() - 1;
            if (intValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), Integer.valueOf(intValue));
            }
            updateOrResetMinLogLevel();
        }
    }

    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
        } else if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
        } else if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }
}
