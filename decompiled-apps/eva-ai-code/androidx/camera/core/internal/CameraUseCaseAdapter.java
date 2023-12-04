package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class CameraUseCaseAdapter implements Camera {
    private static final String TAG = "CameraUseCaseAdapter";
    private final CameraDeviceSurfaceManager mCameraDeviceSurfaceManager;
    private CameraInternal mCameraInternal;
    private final LinkedHashSet<CameraInternal> mCameraInternals;
    private final CameraId mId;
    private final UseCaseConfigFactory mUseCaseConfigFactory;
    private ViewPort mViewPort;
    private final List<UseCase> mUseCases = new ArrayList();
    private CameraConfig mCameraConfig = CameraConfigs.emptyConfig();
    private final Object mLock = new Object();
    private boolean mAttached = true;
    private Config mInteropConfig = null;
    private List<UseCase> mExtraUseCases = new ArrayList();

    public CameraUseCaseAdapter(LinkedHashSet<CameraInternal> linkedHashSet, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, UseCaseConfigFactory useCaseConfigFactory) {
        this.mCameraInternal = linkedHashSet.iterator().next();
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.mCameraInternals = linkedHashSet2;
        this.mId = new CameraId(linkedHashSet2);
        this.mCameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
    }

    public static CameraId generateCameraId(LinkedHashSet<CameraInternal> linkedHashSet) {
        return new CameraId(linkedHashSet);
    }

    public CameraId getCameraId() {
        return this.mId;
    }

    public boolean isEquivalent(CameraUseCaseAdapter cameraUseCaseAdapter) {
        return this.mId.equals(cameraUseCaseAdapter.getCameraId());
    }

    public void setViewPort(ViewPort viewPort) {
        synchronized (this.mLock) {
            this.mViewPort = viewPort;
        }
    }

    public void addUseCases(Collection<UseCase> collection) throws CameraException {
        synchronized (this.mLock) {
            ArrayList<UseCase> arrayList = new ArrayList();
            for (UseCase useCase : collection) {
                if (this.mUseCases.contains(useCase)) {
                    Logger.d(TAG, "Attempting to attach already attached UseCase");
                } else {
                    arrayList.add(useCase);
                }
            }
            List<UseCase> arrayList2 = new ArrayList<>(this.mUseCases);
            List<UseCase> emptyList = Collections.emptyList();
            List<UseCase> emptyList2 = Collections.emptyList();
            if (isCoexistingPreviewImageCaptureRequired()) {
                arrayList2.removeAll(this.mExtraUseCases);
                arrayList2.addAll(arrayList);
                emptyList = calculateRequiredExtraUseCases(arrayList2, new ArrayList<>(this.mExtraUseCases));
                ArrayList arrayList3 = new ArrayList(emptyList);
                arrayList3.removeAll(this.mExtraUseCases);
                arrayList.addAll(arrayList3);
                emptyList2 = new ArrayList<>(this.mExtraUseCases);
                emptyList2.removeAll(emptyList);
            }
            Map<UseCase, ConfigPair> configs = getConfigs(arrayList, this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory);
            try {
                List<UseCase> arrayList4 = new ArrayList<>(this.mUseCases);
                arrayList4.removeAll(emptyList2);
                Map<UseCase, Size> calculateSuggestedResolutions = calculateSuggestedResolutions(this.mCameraInternal.getCameraInfoInternal(), arrayList, arrayList4, configs);
                updateViewPort(calculateSuggestedResolutions, collection);
                this.mExtraUseCases = emptyList;
                detachUnnecessaryUseCases(emptyList2);
                for (UseCase useCase2 : arrayList) {
                    ConfigPair configPair = configs.get(useCase2);
                    useCase2.onAttach(this.mCameraInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
                    useCase2.updateSuggestedResolution((Size) Preconditions.checkNotNull(calculateSuggestedResolutions.get(useCase2)));
                }
                this.mUseCases.addAll(arrayList);
                if (this.mAttached) {
                    this.mCameraInternal.attachUseCases(arrayList);
                }
                for (UseCase useCase3 : arrayList) {
                    useCase3.notifyState();
                }
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            }
        }
    }

    public void removeUseCases(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            detachUnnecessaryUseCases(new ArrayList(collection));
            if (isCoexistingPreviewImageCaptureRequired()) {
                this.mExtraUseCases.removeAll(collection);
                try {
                    addUseCases(Collections.emptyList());
                } catch (CameraException unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public List<UseCase> getUseCases() {
        ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new ArrayList(this.mUseCases);
        }
        return arrayList;
    }

    public void attachUseCases() {
        synchronized (this.mLock) {
            if (!this.mAttached) {
                this.mCameraInternal.attachUseCases(this.mUseCases);
                restoreInteropConfig();
                for (UseCase useCase : this.mUseCases) {
                    useCase.notifyState();
                }
                this.mAttached = true;
            }
        }
    }

    public void setActiveResumingMode(boolean z) {
        this.mCameraInternal.setActiveResumingMode(z);
    }

    public void detachUseCases() {
        synchronized (this.mLock) {
            if (this.mAttached) {
                this.mCameraInternal.detachUseCases(new ArrayList(this.mUseCases));
                cacheInteropConfig();
                this.mAttached = false;
            }
        }
    }

    private void restoreInteropConfig() {
        synchronized (this.mLock) {
            if (this.mInteropConfig != null) {
                this.mCameraInternal.getCameraControlInternal().addInteropConfig(this.mInteropConfig);
            }
        }
    }

    private void cacheInteropConfig() {
        synchronized (this.mLock) {
            CameraControlInternal cameraControlInternal = this.mCameraInternal.getCameraControlInternal();
            this.mInteropConfig = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    private Map<UseCase, Size> calculateSuggestedResolutions(CameraInfoInternal cameraInfoInternal, List<UseCase> list, List<UseCase> list2, Map<UseCase, ConfigPair> map) {
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        HashMap hashMap = new HashMap();
        for (UseCase useCase : list2) {
            arrayList.add(this.mCameraDeviceSurfaceManager.transformSurfaceConfig(cameraId, useCase.getImageFormat(), useCase.getAttachedSurfaceResolution()));
            hashMap.put(useCase, useCase.getAttachedSurfaceResolution());
        }
        if (!list.isEmpty()) {
            HashMap hashMap2 = new HashMap();
            for (UseCase useCase2 : list) {
                ConfigPair configPair = map.get(useCase2);
                hashMap2.put(useCase2.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig), useCase2);
            }
            Map<UseCaseConfig<?>, Size> suggestedResolutions = this.mCameraDeviceSurfaceManager.getSuggestedResolutions(cameraId, arrayList, new ArrayList(hashMap2.keySet()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put((UseCase) entry.getValue(), suggestedResolutions.get(entry.getKey()));
            }
        }
        return hashMap;
    }

    private void updateViewPort(Map<UseCase, Size> map, Collection<UseCase> collection) {
        synchronized (this.mLock) {
            if (this.mViewPort != null) {
                Map<UseCase, Rect> calculateViewPortRects = ViewPorts.calculateViewPortRects(this.mCameraInternal.getCameraControlInternal().getSensorRect(), this.mCameraInternal.getCameraInfoInternal().getLensFacing().intValue() == 0, this.mViewPort.getAspectRatio(), this.mCameraInternal.getCameraInfoInternal().getSensorRotationDegrees(this.mViewPort.getRotation()), this.mViewPort.getScaleType(), this.mViewPort.getLayoutDirection(), map);
                for (UseCase useCase : collection) {
                    useCase.setViewPortCropRect((Rect) Preconditions.checkNotNull(calculateViewPortRects.get(useCase)));
                    useCase.setSensorToBufferTransformMatrix(calculateSensorToBufferTransformMatrix(this.mCameraInternal.getCameraControlInternal().getSensorRect(), map.get(useCase)));
                }
            }
        }
    }

    private static Matrix calculateSensorToBufferTransformMatrix(Rect rect, Size size) {
        Preconditions.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ConfigPair {
        UseCaseConfig<?> mCameraConfig;
        UseCaseConfig<?> mExtendedConfig;

        ConfigPair(UseCaseConfig<?> useCaseConfig, UseCaseConfig<?> useCaseConfig2) {
            this.mExtendedConfig = useCaseConfig;
            this.mCameraConfig = useCaseConfig2;
        }
    }

    private Map<UseCase, ConfigPair> getConfigs(List<UseCase> list, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap hashMap = new HashMap();
        for (UseCase useCase : list) {
            hashMap.put(useCase, new ConfigPair(useCase.getDefaultConfig(false, useCaseConfigFactory), useCase.getDefaultConfig(true, useCaseConfigFactory2)));
        }
        return hashMap;
    }

    /* loaded from: classes.dex */
    public static final class CameraId {
        private final List<String> mIds = new ArrayList();

        CameraId(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.mIds.add(it.next().getCameraInfoInternal().getCameraId());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof CameraId) {
                return this.mIds.equals(((CameraId) obj).mIds);
            }
            return false;
        }

        public int hashCode() {
            return this.mIds.hashCode() * 53;
        }
    }

    /* loaded from: classes.dex */
    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }

        public CameraException(Throwable th) {
            super(th);
        }
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.mCameraInternal.getCameraControlInternal();
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.mCameraInternal.getCameraInfoInternal();
    }

    @Override // androidx.camera.core.Camera
    public LinkedHashSet<CameraInternal> getCameraInternals() {
        return this.mCameraInternals;
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        CameraConfig cameraConfig;
        synchronized (this.mLock) {
            cameraConfig = this.mCameraConfig;
        }
        return cameraConfig;
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(CameraConfig cameraConfig) {
        synchronized (this.mLock) {
            if (cameraConfig == null) {
                cameraConfig = CameraConfigs.emptyConfig();
            }
            if (!this.mUseCases.isEmpty() && !this.mCameraConfig.getCompatibilityId().equals(cameraConfig.getCompatibilityId())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.mCameraConfig = cameraConfig;
            this.mCameraInternal.setExtendedConfig(cameraConfig);
        }
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        synchronized (this.mLock) {
            try {
                try {
                    calculateSuggestedResolutions(this.mCameraInternal.getCameraInfoInternal(), Arrays.asList(useCaseArr), Collections.emptyList(), getConfigs(Arrays.asList(useCaseArr), this.mCameraConfig.getUseCaseConfigFactory(), this.mUseCaseConfigFactory));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    private List<UseCase> calculateRequiredExtraUseCases(List<UseCase> list, List<UseCase> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean isExtraPreviewRequired = isExtraPreviewRequired(list);
        boolean isExtraImageCaptureRequired = isExtraImageCaptureRequired(list);
        UseCase useCase = null;
        UseCase useCase2 = null;
        for (UseCase useCase3 : list2) {
            if (isPreview(useCase3)) {
                useCase = useCase3;
            } else if (isImageCapture(useCase3)) {
                useCase2 = useCase3;
            }
        }
        if (isExtraPreviewRequired && useCase == null) {
            arrayList.add(createExtraPreview());
        } else if (!isExtraPreviewRequired && useCase != null) {
            arrayList.remove(useCase);
        }
        if (isExtraImageCaptureRequired && useCase2 == null) {
            arrayList.add(createExtraImageCapture());
        } else if (!isExtraImageCaptureRequired && useCase2 != null) {
            arrayList.remove(useCase2);
        }
        return arrayList;
    }

    private void detachUnnecessaryUseCases(List<UseCase> list) {
        synchronized (this.mLock) {
            if (!list.isEmpty()) {
                this.mCameraInternal.detachUseCases(list);
                for (UseCase useCase : list) {
                    if (this.mUseCases.contains(useCase)) {
                        useCase.onDetach(this.mCameraInternal);
                    } else {
                        Logger.e(TAG, "Attempting to detach non-attached UseCase: " + useCase);
                    }
                }
                this.mUseCases.removeAll(list);
            }
        }
    }

    private boolean isCoexistingPreviewImageCaptureRequired() {
        boolean z;
        synchronized (this.mLock) {
            z = true;
            if (this.mCameraConfig.getUseCaseCombinationRequiredRule() != 1) {
                z = false;
            }
        }
        return z;
    }

    private boolean isExtraPreviewRequired(List<UseCase> list) {
        boolean z = false;
        boolean z2 = false;
        for (UseCase useCase : list) {
            if (isPreview(useCase)) {
                z2 = true;
            } else if (isImageCapture(useCase)) {
                z = true;
            }
        }
        return z && !z2;
    }

    private boolean isExtraImageCaptureRequired(List<UseCase> list) {
        boolean z = false;
        boolean z2 = false;
        for (UseCase useCase : list) {
            if (isPreview(useCase)) {
                z = true;
            } else if (isImageCapture(useCase)) {
                z2 = true;
            }
        }
        return z && !z2;
    }

    private boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    private boolean isImageCapture(UseCase useCase) {
        return useCase instanceof ImageCapture;
    }

    private Preview createExtraPreview() {
        Preview build = new Preview.Builder().setTargetName("Preview-Extra").build();
        build.setSurfaceProvider(new Preview.SurfaceProvider() { // from class: androidx.camera.core.internal.CameraUseCaseAdapter$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.Preview.SurfaceProvider
            public final void onSurfaceRequested(SurfaceRequest surfaceRequest) {
                CameraUseCaseAdapter.lambda$createExtraPreview$1(surfaceRequest);
            }
        });
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$createExtraPreview$1(SurfaceRequest surfaceRequest) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.getResolution().getWidth(), surfaceRequest.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.provideSurface(surface, CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.core.internal.CameraUseCaseAdapter$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CameraUseCaseAdapter.lambda$createExtraPreview$0(surface, surfaceTexture, (SurfaceRequest.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$createExtraPreview$0(Surface surface, SurfaceTexture surfaceTexture, SurfaceRequest.Result result) {
        surface.release();
        surfaceTexture.release();
    }

    private ImageCapture createExtraImageCapture() {
        return new ImageCapture.Builder().setTargetName("ImageCapture-Extra").build();
    }
}
