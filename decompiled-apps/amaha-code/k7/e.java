package k7;

import androidx.recyclerview.widget.k;
import com.google.auto.value.AutoValue;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: EventStoreConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23033a;

    static {
        String str;
        Long l2 = 10485760L;
        Integer valueOf = Integer.valueOf((int) k.d.DEFAULT_DRAG_ANIMATION_DURATION);
        Integer valueOf2 = Integer.valueOf((int) Constants.TIMEOUT_MS);
        Long l10 = 604800000L;
        Integer num = 81920;
        if (l2 == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (valueOf == null) {
            str = str.concat(" loadBatchSize");
        }
        if (valueOf2 == null) {
            str = pl.a.f(str, " criticalSectionEnterTimeoutMs");
        }
        if (l10 == null) {
            str = pl.a.f(str, " eventCleanUpAge");
        }
        if (num == null) {
            str = pl.a.f(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f23033a = new a(l2.longValue(), valueOf.intValue(), valueOf2.intValue(), l10.longValue(), num.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
