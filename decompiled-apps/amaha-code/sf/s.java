package sf;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToNumberPolicy.java */
/* loaded from: classes.dex */
public abstract class s implements t {

    /* renamed from: u  reason: collision with root package name */
    public static final a f31515u;

    /* renamed from: v  reason: collision with root package name */
    public static final b f31516v;

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ s[] f31517w;

    /* compiled from: ToNumberPolicy.java */
    /* loaded from: classes.dex */
    public enum a extends s {
        public a() {
            super("DOUBLE", 0);
        }

        @Override // sf.t
        public final Number d(yf.a aVar) {
            return Double.valueOf(aVar.e0());
        }
    }

    /* compiled from: ToNumberPolicy.java */
    /* loaded from: classes.dex */
    public enum b extends s {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        @Override // sf.t
        public final Number d(yf.a aVar) {
            return new uf.j(aVar.v0());
        }
    }

    static {
        a aVar = new a();
        f31515u = aVar;
        b bVar = new b();
        f31516v = bVar;
        f31517w = new s[]{aVar, bVar, new s() { // from class: sf.s.c
            @Override // sf.t
            public final Number d(yf.a aVar2) {
                String v02 = aVar2.v0();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(v02));
                    } catch (NumberFormatException unused) {
                        Double valueOf = Double.valueOf(v02);
                        if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.f38536v) {
                            return valueOf;
                        }
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.I());
                    }
                } catch (NumberFormatException e10) {
                    StringBuilder g5 = defpackage.d.g("Cannot parse ", v02, "; at path ");
                    g5.append(aVar2.I());
                    throw new JsonParseException(g5.toString(), e10);
                }
            }
        }, new s() { // from class: sf.s.d
            @Override // sf.t
            public final Number d(yf.a aVar2) {
                String v02 = aVar2.v0();
                try {
                    return new BigDecimal(v02);
                } catch (NumberFormatException e10) {
                    StringBuilder g5 = defpackage.d.g("Cannot parse ", v02, "; at path ");
                    g5.append(aVar2.I());
                    throw new JsonParseException(g5.toString(), e10);
                }
            }
        }};
    }

    public s() {
        throw null;
    }

    public s(String str, int i6) {
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f31517w.clone();
    }
}
