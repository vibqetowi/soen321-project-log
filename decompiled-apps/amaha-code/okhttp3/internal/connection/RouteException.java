package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
/* compiled from: RouteException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: u  reason: collision with root package name */
    public final IOException f27604u;

    /* renamed from: v  reason: collision with root package name */
    public IOException f27605v;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f27604u = iOException;
        this.f27605v = iOException;
    }
}
