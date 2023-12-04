package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
/* compiled from: RequestDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0005\u001a\u00020\u0003H\u0017J\b\u0010\u0006\u001a\u00020\u0003H\u0017\u0082\u0001\u0002\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcoil/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "assertActive", "", "complete", "dispose", TtmlNode.START, "Lcoil/request/BaseRequestDelegate;", "Lcoil/request/ViewTargetRequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface RequestDelegate extends DefaultLifecycleObserver {

    /* compiled from: RequestDelegate.kt */
    /* renamed from: coil.request.RequestDelegate$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$assertActive(RequestDelegate _this) {
        }

        public static void $default$complete(RequestDelegate _this) {
        }

        public static void $default$dispose(RequestDelegate _this) {
        }

        public static void $default$start(RequestDelegate _this) {
        }
    }

    void assertActive();

    void complete();

    void dispose();

    void start();
}
