package b9;

import android.net.Uri;
import android.util.Base64;
import c9.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;
/* compiled from: DataSchemeDataSource.java */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e  reason: collision with root package name */
    public h f4119e;
    public byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public int f4120g;

    /* renamed from: h  reason: collision with root package name */
    public int f4121h;

    public e() {
        super(false);
    }

    @Override // b9.f
    public final void close() {
        if (this.f != null) {
            this.f = null;
            o();
        }
        this.f4119e = null;
    }

    @Override // b9.f
    public final Uri getUri() {
        h hVar = this.f4119e;
        if (hVar != null) {
            return hVar.f4128a;
        }
        return null;
    }

    @Override // b9.f
    public final long h(h hVar) {
        String str;
        String str2;
        p(hVar);
        this.f4119e = hVar;
        Uri uri = hVar.f4128a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        if (valueOf.length() != 0) {
            str = "Unsupported scheme: ".concat(valueOf);
        } else {
            str = new String("Unsupported scheme: ");
        }
        sc.b.p(str, equals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i6 = w.f5205a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str3 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str3, 0);
                } catch (IllegalArgumentException e10) {
                    String valueOf2 = String.valueOf(str3);
                    if (valueOf2.length() != 0) {
                        str2 = "Error while parsing Base64 encoded string: ".concat(valueOf2);
                    } else {
                        str2 = new String("Error while parsing Base64 encoded string: ");
                    }
                    throw new ParserException(str2, e10, true, 0);
                }
            } else {
                this.f = w.u(URLDecoder.decode(str3, nc.c.f25986a.name()));
            }
            byte[] bArr = this.f;
            long j10 = hVar.f;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f4120g = i10;
                int length = bArr.length - i10;
                this.f4121h = length;
                long j11 = hVar.f4133g;
                int i11 = (j11 > (-1L) ? 1 : (j11 == (-1L) ? 0 : -1));
                if (i11 != 0) {
                    this.f4121h = (int) Math.min(length, j11);
                }
                q(hVar);
                if (i11 == 0) {
                    return this.f4121h;
                }
                return j11;
            }
            this.f = null;
            throw new DataSourceException(2008);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 23);
        sb2.append("Unexpected URI format: ");
        sb2.append(valueOf3);
        throw new ParserException(sb2.toString(), null, true, 0);
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f4121h;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.f;
        int i12 = w.f5205a;
        System.arraycopy(bArr2, this.f4120g, bArr, i6, min);
        this.f4120g += min;
        this.f4121h -= min;
        n(min);
        return min;
    }
}
