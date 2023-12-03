package r1;

import android.content.pm.ResolveInfo;
import android.media.MediaRoute2Info;
import j$.util.Objects;
import java.util.function.Function;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30214a;

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f30214a) {
            case 0:
                return Objects.requireNonNull(function);
            case 1:
                return Objects.requireNonNull(function);
            case 2:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String id2;
        switch (this.f30214a) {
            case 0:
                return q.c((MediaRoute2Info) obj);
            case 1:
                String str = (String) obj;
                str.getClass();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -2065577523:
                        if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 956939050:
                        if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 975975375:
                        if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        return "android.media.route.feature.REMOTE_PLAYBACK";
                    case 1:
                        return "android.media.route.feature.LIVE_AUDIO";
                    case 2:
                        return "android.media.route.feature.LIVE_VIDEO";
                    default:
                        return str;
                }
            case 2:
                id2 = ((MediaRoute2Info) obj).getId();
                return id2;
            default:
                return ((ResolveInfo) obj).serviceInfo;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.f30214a) {
            case 0:
                return Objects.requireNonNull(function);
            case 1:
                return Objects.requireNonNull(function);
            case 2:
                return Objects.requireNonNull(function);
            default:
                return Objects.requireNonNull(function);
        }
    }
}
