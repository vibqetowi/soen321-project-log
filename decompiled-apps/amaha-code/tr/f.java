package tr;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import vr.i2;
import vr.s2;
/* compiled from: Codec.java */
/* loaded from: classes2.dex */
public interface f extends h, n {

    /* compiled from: Codec.java */
    /* loaded from: classes2.dex */
    public static final class a implements f {
        @Override // tr.h, tr.n
        public final String a() {
            return "gzip";
        }

        @Override // tr.n
        public final InputStream b(s2.a aVar) {
            return new GZIPInputStream(aVar);
        }

        @Override // tr.h
        public final OutputStream c(i2.a aVar) {
            return new GZIPOutputStream(aVar);
        }
    }

    /* compiled from: Codec.java */
    /* loaded from: classes2.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f33465a = new b();

        @Override // tr.h, tr.n
        public final String a() {
            return "identity";
        }

        @Override // tr.n
        public final InputStream b(s2.a aVar) {
            return aVar;
        }

        @Override // tr.h
        public final OutputStream c(i2.a aVar) {
            return aVar;
        }
    }
}
