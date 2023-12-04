package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.RealImageLoader;
import coil.network.EmptyNetworkObserver;
import coil.network.NetworkObserver;
import coil.network.NetworkObserverKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SystemCallbacks.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0006\u0010!\u001a\u00020\u0019J\u0006\u0010\"\u001a\u00020\u0019J\u001d\u0010#\u001a\u00020\u00192\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190%H\u0082\bR\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00040\u00040\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcoil/util/SystemCallbacks;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/NetworkObserver$Listener;", "imageLoader", "Lcoil/RealImageLoader;", "context", "Landroid/content/Context;", "isNetworkObserverEnabled", "", "(Lcoil/RealImageLoader;Landroid/content/Context;Z)V", "_isOnline", "_isShutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getImageLoader$coil_base_release$annotations", "()V", "getImageLoader$coil_base_release", "()Ljava/lang/ref/WeakReference;", "isOnline", "()Z", "isShutdown", "networkObserver", "Lcoil/network/NetworkObserver;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onConnectivityChange", "onLowMemory", "onTrimMemory", FirebaseAnalytics.Param.LEVEL, "", "register", "shutdown", "withImageLoader", "block", "Lkotlin/Function1;", "Companion", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemCallbacks implements ComponentCallbacks2, NetworkObserver.Listener {
    public static final Companion Companion = new Companion(null);
    private static final String OFFLINE = "OFFLINE";
    private static final String ONLINE = "ONLINE";
    private static final String TAG = "NetworkObserver";
    private volatile boolean _isOnline;
    private final AtomicBoolean _isShutdown;
    private final Context context;
    private final WeakReference<RealImageLoader> imageLoader;
    private final NetworkObserver networkObserver;

    public static /* synthetic */ void getImageLoader$coil_base_release$annotations() {
    }

    public SystemCallbacks(RealImageLoader realImageLoader, Context context, boolean z) {
        EmptyNetworkObserver emptyNetworkObserver;
        this.context = context;
        this.imageLoader = new WeakReference<>(realImageLoader);
        if (z) {
            emptyNetworkObserver = NetworkObserverKt.NetworkObserver(context, this, realImageLoader.getLogger());
        } else {
            emptyNetworkObserver = new EmptyNetworkObserver();
        }
        this.networkObserver = emptyNetworkObserver;
        this._isOnline = emptyNetworkObserver.isOnline();
        this._isShutdown = new AtomicBoolean(false);
    }

    public final WeakReference<RealImageLoader> getImageLoader$coil_base_release() {
        return this.imageLoader;
    }

    public final boolean isOnline() {
        return this._isOnline;
    }

    public final boolean isShutdown() {
        return this._isShutdown.get();
    }

    public final void register() {
        this.context.registerComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.imageLoader.get() == null) {
            shutdown();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    public final void shutdown() {
        if (this._isShutdown.getAndSet(true)) {
            return;
        }
        this.context.unregisterComponentCallbacks(this);
        this.networkObserver.shutdown();
    }

    private final void withImageLoader(Function1<? super RealImageLoader, Unit> function1) {
        Unit unit;
        RealImageLoader realImageLoader = this.imageLoader.get();
        if (realImageLoader != null) {
            function1.invoke(realImageLoader);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            shutdown();
        }
    }

    /* compiled from: SystemCallbacks.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcoil/util/SystemCallbacks$Companion;", "", "()V", SystemCallbacks.OFFLINE, "", SystemCallbacks.ONLINE, "TAG", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        RealImageLoader realImageLoader = this.imageLoader.get();
        Unit unit = null;
        if (realImageLoader != null) {
            Logger logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 2) {
                logger.log(TAG, 2, "trimMemory, level=" + i, null);
            }
            realImageLoader.onTrimMemory$coil_base_release(i);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            shutdown();
        }
    }

    @Override // coil.network.NetworkObserver.Listener
    public void onConnectivityChange(boolean z) {
        RealImageLoader realImageLoader = this.imageLoader.get();
        Unit unit = null;
        if (realImageLoader != null) {
            Logger logger = realImageLoader.getLogger();
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, z ? ONLINE : OFFLINE, null);
            }
            this._isOnline = z;
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            shutdown();
        }
    }
}
