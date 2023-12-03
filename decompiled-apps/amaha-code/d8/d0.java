package d8;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: TsPayloadReader.java */
/* loaded from: classes.dex */
public interface d0 {

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12343a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f12344b;

        public a(String str, byte[] bArr) {
            this.f12343a = str;
            this.f12344b = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f12345a;

        /* renamed from: b  reason: collision with root package name */
        public final List<a> f12346b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12347c;

        public b(int i6, String str, ArrayList arrayList, byte[] bArr) {
            List<a> unmodifiableList;
            this.f12345a = str;
            if (arrayList == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            this.f12346b = unmodifiableList;
            this.f12347c = bArr;
        }
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public interface c {
        d0 a(int i6, b bVar);
    }

    /* compiled from: TsPayloadReader.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12348a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12349b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12350c;

        /* renamed from: d  reason: collision with root package name */
        public int f12351d;

        /* renamed from: e  reason: collision with root package name */
        public String f12352e;

        public d(int i6, int i10) {
            this(LinearLayoutManager.INVALID_OFFSET, i6, i10);
        }

        public final void a() {
            int i6;
            int i10 = this.f12351d;
            if (i10 == Integer.MIN_VALUE) {
                i6 = this.f12349b;
            } else {
                i6 = i10 + this.f12350c;
            }
            this.f12351d = i6;
            String str = this.f12348a;
            this.f12352e = defpackage.b.h(ri.e.c(str, 11), str, i6);
        }

        public final void b() {
            if (this.f12351d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public d(int i6, int i10, int i11) {
            String str;
            if (i6 != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(i6);
                sb2.append("/");
                str = sb2.toString();
            } else {
                str = "";
            }
            this.f12348a = str;
            this.f12349b = i10;
            this.f12350c = i11;
            this.f12351d = LinearLayoutManager.INVALID_OFFSET;
            this.f12352e = "";
        }
    }

    void a(int i6, c9.q qVar);

    void b(c9.v vVar, u7.j jVar, d dVar);

    void c();
}
