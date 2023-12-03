package y3;

import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public final HttpURLConnection f38198u;

    /* renamed from: v  reason: collision with root package name */
    public final OutputStream f38199v;

    /* renamed from: w  reason: collision with root package name */
    public String f38200w;

    /* renamed from: x  reason: collision with root package name */
    public String f38201x;

    /* renamed from: y  reason: collision with root package name */
    public Integer f38202y;

    /* renamed from: z  reason: collision with root package name */
    public l f38203z;

    public c(HttpURLConnection httpURLConnection, OutputStream outputStream) {
        this.f38198u = httpURLConnection;
        this.f38199v = outputStream;
    }

    public final void a() {
        String sb2;
        OutputStream outputStream = this.f38199v;
        if (outputStream != null) {
            if (this.f38202y == null) {
                StringBuilder sb3 = new StringBuilder("{\"api_key\":\"");
                String str = this.f38200w;
                if (str != null) {
                    sb3.append(str);
                    sb3.append("\",\"events\":");
                    String str2 = this.f38201x;
                    if (str2 != null) {
                        sb2 = v.g.c(sb3, str2, '}');
                    } else {
                        kotlin.jvm.internal.i.q("events");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("apiKey");
                    throw null;
                }
            } else {
                StringBuilder sb4 = new StringBuilder("{\"api_key\":\"");
                String str3 = this.f38200w;
                if (str3 != null) {
                    sb4.append(str3);
                    sb4.append("\",\"events\":");
                    String str4 = this.f38201x;
                    if (str4 != null) {
                        sb4.append(str4);
                        sb4.append(",\"options\":{\"min_id_length\":");
                        sb4.append(this.f38202y);
                        sb4.append("}}");
                        sb2 = sb4.toString();
                    } else {
                        kotlin.jvm.internal.i.q("events");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("apiKey");
                    throw null;
                }
            }
            Charset charset = gv.a.f16927b;
            if (sb2 != null) {
                byte[] bytes = sb2.getBytes(charset);
                kotlin.jvm.internal.i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes, 0, bytes.length);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38198u.disconnect();
    }
}
