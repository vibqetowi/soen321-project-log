package mg;

import java.net.InetAddress;
import kotlin.jvm.internal.b0;
/* compiled from: HttpService.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[Catch: Exception -> 0x0021, TRY_LEAVE, TryCatch #0 {Exception -> 0x0021, blocks: (B:2:0x0000, B:4:0x000c, B:9:0x0016, B:11:0x001a), top: B:14:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        try {
            InetAddress byName = InetAddress.getByName("api.mixpanel.com");
            if (!byName.isLoopbackAddress() && !byName.isAnyLocalAddress()) {
                z10 = false;
                c.f25052a = z10;
                if (!z10) {
                    b0.t("MixpanelAPI.Message", "AdBlocker is enabled. Won't be able to use Mixpanel services.");
                    return;
                }
                return;
            }
            z10 = true;
            c.f25052a = z10;
            if (!z10) {
            }
        } catch (Exception unused) {
        }
    }
}
