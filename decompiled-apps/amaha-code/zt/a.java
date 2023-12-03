package zt;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
/* compiled from: KotlinClassHeader.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0686a f39838a;

    /* renamed from: b  reason: collision with root package name */
    public final eu.e f39839b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f39840c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f39841d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f39842e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final int f39843g;

    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: zt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0686a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: v  reason: collision with root package name */
        public static final LinkedHashMap f39844v;

        /* renamed from: u  reason: collision with root package name */
        public final int f39849u;

        static {
            EnumC0686a[] values = values();
            int P = sp.b.P(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(P < 16 ? 16 : P);
            for (EnumC0686a enumC0686a : values) {
                linkedHashMap.put(Integer.valueOf(enumC0686a.f39849u), enumC0686a);
            }
            f39844v = linkedHashMap;
        }

        EnumC0686a(int i6) {
            this.f39849u = i6;
        }
    }

    public a(EnumC0686a kind, eu.e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i6) {
        i.g(kind, "kind");
        this.f39838a = kind;
        this.f39839b = eVar;
        this.f39840c = strArr;
        this.f39841d = strArr2;
        this.f39842e = strArr3;
        this.f = str;
        this.f39843g = i6;
    }

    public final String toString() {
        return this.f39838a + " version=" + this.f39839b;
    }
}
