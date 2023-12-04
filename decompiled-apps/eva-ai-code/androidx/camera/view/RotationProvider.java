package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.camera.view.RotationProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class RotationProvider {
    final OrientationEventListener mOrientationListener;
    final Object mLock = new Object();
    final Map<Listener, ListenerWrapper> mListeners = new HashMap();
    boolean mIgnoreCanDetectForTest = false;

    /* loaded from: classes.dex */
    public interface Listener {
        void onRotationChanged(int i);
    }

    static int orientationToSurfaceRotation(int i) {
        if (i >= 315 || i < 45) {
            return 0;
        }
        if (i >= 225) {
            return 1;
        }
        return i >= 135 ? 2 : 3;
    }

    public RotationProvider(Context context) {
        this.mOrientationListener = new OrientationEventListener(context) { // from class: androidx.camera.view.RotationProvider.1
            private static final int INVALID_SURFACE_ROTATION = -1;
            private int mRotation = -1;

            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i) {
                int orientationToSurfaceRotation;
                ArrayList<ListenerWrapper> arrayList;
                if (i == -1 || this.mRotation == (orientationToSurfaceRotation = RotationProvider.orientationToSurfaceRotation(i))) {
                    return;
                }
                this.mRotation = orientationToSurfaceRotation;
                synchronized (RotationProvider.this.mLock) {
                    arrayList = new ArrayList(RotationProvider.this.mListeners.values());
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (ListenerWrapper listenerWrapper : arrayList) {
                    listenerWrapper.onRotationChanged(orientationToSurfaceRotation);
                }
            }
        };
    }

    public boolean addListener(Executor executor, Listener listener) {
        synchronized (this.mLock) {
            if (this.mOrientationListener.canDetectOrientation() || this.mIgnoreCanDetectForTest) {
                this.mListeners.put(listener, new ListenerWrapper(listener, executor));
                this.mOrientationListener.enable();
                return true;
            }
            return false;
        }
    }

    public void removeListener(Listener listener) {
        synchronized (this.mLock) {
            ListenerWrapper listenerWrapper = this.mListeners.get(listener);
            if (listenerWrapper != null) {
                listenerWrapper.disable();
                this.mListeners.remove(listener);
            }
            if (this.mListeners.isEmpty()) {
                this.mOrientationListener.disable();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ListenerWrapper {
        private final AtomicBoolean mEnabled = new AtomicBoolean(true);
        private final Executor mExecutor;
        private final Listener mListener;

        ListenerWrapper(Listener listener, Executor executor) {
            this.mListener = listener;
            this.mExecutor = executor;
        }

        void onRotationChanged(final int i) {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.view.RotationProvider$ListenerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    RotationProvider.ListenerWrapper.this.m261xb9537cd0(i);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onRotationChanged$0$androidx-camera-view-RotationProvider$ListenerWrapper  reason: not valid java name */
        public /* synthetic */ void m261xb9537cd0(int i) {
            if (this.mEnabled.get()) {
                this.mListener.onRotationChanged(i);
            }
        }

        void disable() {
            this.mEnabled.set(false);
        }
    }
}
