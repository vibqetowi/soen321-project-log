package androidx.camera.lifecycle;

import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
final class LifecycleCameraRepository {
    private final Object mLock = new Object();
    private final Map<Key, LifecycleCamera> mCameraMap = new HashMap();
    private final Map<LifecycleCameraRepositoryObserver, Set<Key>> mLifecycleObserverMap = new HashMap();
    private final ArrayDeque<LifecycleOwner> mActiveLifecycleOwners = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera createLifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            Preconditions.checkArgument(this.mCameraMap.get(Key.create(lifecycleOwner, cameraUseCaseAdapter.getCameraId())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
            lifecycleCamera = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
            if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                lifecycleCamera.suspend();
            }
            registerCamera(lifecycleCamera);
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera getLifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(Key.create(lifecycleOwner, cameraId));
        }
        return lifecycleCamera;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<LifecycleCamera> getLifecycleCameras() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.mLock) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return unmodifiableCollection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        synchronized (this.mLock) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : new HashSet(this.mLifecycleObserverMap.keySet())) {
                unregisterLifecycle(lifecycleCameraRepositoryObserver.getLifecycleOwner());
            }
        }
    }

    private void registerCamera(LifecycleCamera lifecycleCamera) {
        Set<Key> hashSet;
        synchronized (this.mLock) {
            LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            Key create = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getCameraId());
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver != null) {
                hashSet = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
            } else {
                hashSet = new HashSet<>();
            }
            hashSet.add(create);
            this.mCameraMap.put(create, lifecycleCamera);
            if (lifecycleCameraRepositoryObserver == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver2);
            }
        }
    }

    void unregisterLifecycle(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            setInactive(lifecycleOwner);
            for (Key key : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                this.mCameraMap.remove(key);
            }
            this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
            lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().removeObserver(lifecycleCameraRepositoryObserver);
        }
    }

    private LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            for (LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, ViewPort viewPort, Collection<UseCase> collection) {
        synchronized (this.mLock) {
            Preconditions.checkArgument(!collection.isEmpty());
            LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner))) {
                LifecycleCamera lifecycleCamera2 = (LifecycleCamera) Preconditions.checkNotNull(this.mCameraMap.get(key));
                if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                    throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                }
            }
            try {
                lifecycleCamera.getCameraUseCaseAdapter().setViewPort(viewPort);
                lifecycleCamera.bind(collection);
                if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    setActive(lifecycleOwner);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unbind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            for (Key key : this.mCameraMap.keySet()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                boolean z = !lifecycleCamera.getUseCases().isEmpty();
                lifecycleCamera.unbind(collection);
                if (z && lifecycleCamera.getUseCases().isEmpty()) {
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unbindAll() {
        synchronized (this.mLock) {
            for (Key key : this.mCameraMap.keySet()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.unbindAll();
                setInactive(lifecycleCamera.getLifecycleOwner());
            }
        }
    }

    void setActive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            if (hasUseCaseBound(lifecycleOwner)) {
                if (this.mActiveLifecycleOwners.isEmpty()) {
                    this.mActiveLifecycleOwners.push(lifecycleOwner);
                } else {
                    LifecycleOwner peek = this.mActiveLifecycleOwners.peek();
                    if (!lifecycleOwner.equals(peek)) {
                        suspendUseCases(peek);
                        this.mActiveLifecycleOwners.remove(lifecycleOwner);
                        this.mActiveLifecycleOwners.push(lifecycleOwner);
                    }
                }
                unsuspendUseCases(lifecycleOwner);
            }
        }
    }

    void setInactive(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            this.mActiveLifecycleOwners.remove(lifecycleOwner);
            suspendUseCases(lifecycleOwner);
            if (!this.mActiveLifecycleOwners.isEmpty()) {
                unsuspendUseCases(this.mActiveLifecycleOwners.peek());
            }
        }
    }

    private boolean hasUseCaseBound(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return false;
            }
            for (Key key : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                if (!((LifecycleCamera) Preconditions.checkNotNull(this.mCameraMap.get(key))).getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void suspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            for (Key key : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                ((LifecycleCamera) Preconditions.checkNotNull(this.mCameraMap.get(key))).suspend();
            }
        }
    }

    private void unsuspendUseCases(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner))) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                if (!((LifecycleCamera) Preconditions.checkNotNull(lifecycleCamera)).getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class Key {
        public abstract CameraUseCaseAdapter.CameraId getCameraId();

        public abstract LifecycleOwner getLifecycleOwner();

        static Key create(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
            return new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LifecycleCameraRepositoryObserver implements LifecycleObserver {
        private final LifecycleCameraRepository mLifecycleCameraRepository;
        private final LifecycleOwner mLifecycleOwner;

        LifecycleCameraRepositoryObserver(LifecycleOwner lifecycleOwner, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = lifecycleOwner;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        LifecycleOwner getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setActive(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.setInactive(lifecycleOwner);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.mLifecycleCameraRepository.unregisterLifecycle(lifecycleOwner);
        }
    }
}
