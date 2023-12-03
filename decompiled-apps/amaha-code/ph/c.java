package ph;

import java.util.Set;
import kotlin.jvm.internal.i;
/* compiled from: RemotePushConfig.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f28439a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f28440b;

    public c(long j10, Set whiteListedOems) {
        i.g(whiteListedOems, "whiteListedOems");
        this.f28439a = j10;
        this.f28440b = whiteListedOems;
    }
}
