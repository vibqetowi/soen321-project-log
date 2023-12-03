package gf;

import kf.i;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
/* compiled from: InstrumentApacheHttpResponseHandler.java */
/* loaded from: classes.dex */
public final class f<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ResponseHandler<? extends T> f16487a;

    /* renamed from: b  reason: collision with root package name */
    public final i f16488b;

    /* renamed from: c  reason: collision with root package name */
    public final ef.d f16489c;

    public f(ResponseHandler<? extends T> responseHandler, i iVar, ef.d dVar) {
        this.f16487a = responseHandler;
        this.f16488b = iVar;
        this.f16489c = dVar;
    }

    public final T handleResponse(HttpResponse httpResponse) {
        this.f16489c.j(this.f16488b.a());
        this.f16489c.e(httpResponse.getStatusLine().getStatusCode());
        Long a10 = g.a(httpResponse);
        if (a10 != null) {
            this.f16489c.i(a10.longValue());
        }
        String b10 = g.b(httpResponse);
        if (b10 != null) {
            this.f16489c.h(b10);
        }
        this.f16489c.b();
        return (T) this.f16487a.handleResponse(httpResponse);
    }
}
