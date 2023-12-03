package tr;

import com.google.common.io.BaseEncoding;
import java.nio.charset.Charset;
import java.util.BitSet;
import tr.c0;
/* compiled from: InternalMetadata.java */
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f33590a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final BaseEncoding f33591b = c0.f33441e;

    /* compiled from: InternalMetadata.java */
    /* loaded from: classes2.dex */
    public interface a<T> extends c0.g<T> {
    }

    public static c0.f a(String str, a aVar) {
        boolean z10 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = c0.d.f33445d;
        return new c0.f(str, z10, aVar);
    }
}
