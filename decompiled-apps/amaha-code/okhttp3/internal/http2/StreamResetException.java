package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import sv.a;
/* compiled from: StreamResetException.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public final a f27606u;

    public StreamResetException(a aVar) {
        super(i.n(aVar, "stream was reset: "));
        this.f27606u = aVar;
    }
}
