package h4;

import android.text.TextUtils;
import java.security.MessageDigest;
import r1.b0;
/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class f<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f17167e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f17168a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f17169b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17170c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f17171d;

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t3, MessageDigest messageDigest);
    }

    public f(String str, T t3, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f17170c = str;
            this.f17168a = t3;
            this.f17169b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static f a(Object obj, String str) {
        return new f(str, obj, f17167e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f17170c.equals(((f) obj).f17170c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17170c.hashCode();
    }

    public final String toString() {
        return b0.b(new StringBuilder("Option{key='"), this.f17170c, "'}");
    }

    /* compiled from: Option.java */
    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // h4.f.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
