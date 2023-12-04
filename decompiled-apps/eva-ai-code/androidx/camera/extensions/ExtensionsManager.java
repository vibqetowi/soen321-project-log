package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.VersionName;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final class ExtensionsManager {
    private static final Object EXTENSIONS_LOCK = new Object();
    private static final String TAG = "ExtensionsManager";
    private static ListenableFuture<Void> sDeinitializeFuture;
    private static ExtensionsManager sExtensionsManager;
    private static ListenableFuture<ExtensionsManager> sInitializeFuture;
    private final ExtensionsAvailability mExtensionsAvailability;
    private final ExtensionsInfo mExtensionsInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    public static ListenableFuture<ExtensionsManager> getInstanceAsync(Context context, CameraProvider cameraProvider) {
        return getInstanceAsync(context, cameraProvider, VersionName.getCurrentVersion());
    }

    static ListenableFuture<ExtensionsManager> getInstanceAsync(final Context context, final CameraProvider cameraProvider, final VersionName versionName) {
        synchronized (EXTENSIONS_LOCK) {
            ListenableFuture<Void> listenableFuture = sDeinitializeFuture;
            if (listenableFuture != null && !listenableFuture.isDone()) {
                throw new IllegalStateException("Not yet done deinitializing extensions");
            }
            sDeinitializeFuture = null;
            if (ExtensionVersion.getRuntimeVersion() == null) {
                return Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.NONE, cameraProvider));
            } else if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) < 0) {
                return Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
            } else {
                if (sInitializeFuture == null) {
                    sInitializeFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.ExtensionsManager$$ExternalSyntheticLambda0
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return ExtensionsManager.lambda$getInstanceAsync$0(VersionName.this, context, cameraProvider, completer);
                        }
                    });
                }
                return sInitializeFuture;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$getInstanceAsync$0(VersionName versionName, Context context, final CameraProvider cameraProvider, final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            InitializerImpl.init(versionName.toVersionString(), ContextUtil.getApplicationContext(context), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onSuccess() {
                    Logger.d(ExtensionsManager.TAG, "Successfully initialized extensions");
                    CallbackToFutureAdapter.Completer.this.set(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                }

                public void onFailure(int i) {
                    Logger.e(ExtensionsManager.TAG, "Failed to initialize extensions");
                    CallbackToFutureAdapter.Completer.this.set(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
                }
            }, CameraXExecutors.directExecutor());
            return "Initialize extensions";
        } catch (AbstractMethodError e) {
            e = e;
            Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e2) {
            e = e2;
            Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (NoSuchMethodError e3) {
            e = e3;
            Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (RuntimeException e4) {
            Logger.e(TAG, "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e4);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
            return "Initialize extensions";
        }
    }

    public ListenableFuture<Void> shutdown() {
        synchronized (EXTENSIONS_LOCK) {
            if (ExtensionVersion.getRuntimeVersion() == null) {
                sInitializeFuture = null;
                sExtensionsManager = null;
                return Futures.immediateFuture(null);
            }
            ListenableFuture<ExtensionsManager> listenableFuture = sInitializeFuture;
            if (listenableFuture == null) {
                return Futures.immediateFuture(null);
            }
            ListenableFuture<Void> listenableFuture2 = sDeinitializeFuture;
            if (listenableFuture2 != null) {
                return listenableFuture2;
            }
            try {
                listenableFuture.get();
                sInitializeFuture = null;
                ExtensionsAvailability extensionsAvailability = sExtensionsManager.mExtensionsAvailability;
                sExtensionsManager = null;
                if (extensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
                    sDeinitializeFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.ExtensionsManager$$ExternalSyntheticLambda1
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return ExtensionsManager.this.m192lambda$shutdown$1$androidxcameraextensionsExtensionsManager(completer);
                        }
                    });
                } else {
                    sDeinitializeFuture = Futures.immediateFuture(null);
                }
                return sDeinitializeFuture;
            } catch (InterruptedException e) {
                e = e;
                ListenableFuture<Void> immediateFailedFuture = Futures.immediateFailedFuture(e);
                sDeinitializeFuture = immediateFailedFuture;
                return immediateFailedFuture;
            } catch (ExecutionException e2) {
                e = e2;
                ListenableFuture<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(e);
                sDeinitializeFuture = immediateFailedFuture2;
                return immediateFailedFuture2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$shutdown$1$androidx-camera-extensions-ExtensionsManager  reason: not valid java name */
    public /* synthetic */ Object m192lambda$shutdown$1$androidxcameraextensionsExtensionsManager(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            InitializerImpl.deinit(new InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                public void onSuccess() {
                    completer.set(null);
                }

                public void onFailure(int i) {
                    completer.setException(new Exception("Failed to deinitialize extensions."));
                }
            }, CameraXExecutors.directExecutor());
            return null;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            completer.setException(e);
            return null;
        }
    }

    static ExtensionsManager getOrCreateExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider) {
        synchronized (EXTENSIONS_LOCK) {
            ExtensionsManager extensionsManager = sExtensionsManager;
            if (extensionsManager != null) {
                return extensionsManager;
            }
            ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, cameraProvider);
            sExtensionsManager = extensionsManager2;
            return extensionsManager2;
        }
    }

    public CameraSelector getExtensionEnabledCameraSelector(CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return cameraSelector;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        return this.mExtensionsInfo.getExtensionCameraSelectorAndInjectCameraConfig(cameraSelector, i);
    }

    public boolean isExtensionAvailable(CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isExtensionAvailable(cameraSelector, i);
    }

    public Range<Long> getEstimatedCaptureLatencyRange(CameraSelector cameraSelector, int i) {
        if (i == 0 || this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getEstimatedCaptureLatencyRange.");
        }
        return this.mExtensionsInfo.getEstimatedCaptureLatencyRange(cameraSelector, i, null);
    }

    ExtensionsAvailability getExtensionsAvailability() {
        return this.mExtensionsAvailability;
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider) {
        this.mExtensionsAvailability = extensionsAvailability;
        this.mExtensionsInfo = new ExtensionsInfo(cameraProvider);
    }
}
