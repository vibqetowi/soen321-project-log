package o4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public final class f implements h4.e {

    /* renamed from: b  reason: collision with root package name */
    public final g f27057b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f27058c;

    /* renamed from: d  reason: collision with root package name */
    public final String f27059d;

    /* renamed from: e  reason: collision with root package name */
    public String f27060e;
    public URL f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f27061g;

    /* renamed from: h  reason: collision with root package name */
    public int f27062h;

    public f(URL url) {
        i iVar = g.f27063a;
        kc.f.p(url);
        this.f27058c = url;
        this.f27059d = null;
        kc.f.p(iVar);
        this.f27057b = iVar;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        if (this.f27061g == null) {
            this.f27061g = c().getBytes(h4.e.f17166a);
        }
        messageDigest.update(this.f27061g);
    }

    public final String c() {
        String str = this.f27059d;
        if (str == null) {
            URL url = this.f27058c;
            kc.f.p(url);
            return url.toString();
        }
        return str;
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.f27060e)) {
                String str = this.f27059d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f27058c;
                    kc.f.p(url);
                    str = url.toString();
                }
                this.f27060e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.f27060e);
        }
        return this.f;
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!c().equals(fVar.c()) || !this.f27057b.equals(fVar.f27057b)) {
            return false;
        }
        return true;
    }

    @Override // h4.e
    public final int hashCode() {
        if (this.f27062h == 0) {
            int hashCode = c().hashCode();
            this.f27062h = hashCode;
            this.f27062h = this.f27057b.hashCode() + (hashCode * 31);
        }
        return this.f27062h;
    }

    public final String toString() {
        return c();
    }

    public f(String str) {
        i iVar = g.f27063a;
        this.f27058c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f27059d = str;
            kc.f.p(iVar);
            this.f27057b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
