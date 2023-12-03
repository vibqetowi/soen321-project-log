package lv;

import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import lv.v;
import zv.i;
/* compiled from: MultipartBody.kt */
/* loaded from: classes2.dex */
public final class w extends c0 {

    /* renamed from: e  reason: collision with root package name */
    public static final v f24707e;
    public static final v f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f24708g;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f24709h;

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f24710i;

    /* renamed from: a  reason: collision with root package name */
    public final zv.i f24711a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f24712b;

    /* renamed from: c  reason: collision with root package name */
    public final v f24713c;

    /* renamed from: d  reason: collision with root package name */
    public long f24714d;

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final zv.i f24715a;

        /* renamed from: b  reason: collision with root package name */
        public v f24716b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f24717c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.f(uuid, "randomUUID().toString()");
            zv.i iVar = zv.i.f39888x;
            this.f24715a = i.a.c(uuid);
            this.f24716b = w.f24707e;
            this.f24717c = new ArrayList();
        }
    }

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final s f24718a;

        /* renamed from: b  reason: collision with root package name */
        public final c0 f24719b;

        public b(s sVar, c0 c0Var) {
            this.f24718a = sVar;
            this.f24719b = c0Var;
        }
    }

    static {
        Pattern pattern = v.f24702d;
        f24707e = v.a.a("multipart/mixed");
        v.a.a("multipart/alternative");
        v.a.a("multipart/digest");
        v.a.a("multipart/parallel");
        f = v.a.a("multipart/form-data");
        f24708g = new byte[]{JsonWriter.SEMI, 32};
        f24709h = new byte[]{13, 10};
        f24710i = new byte[]{45, 45};
    }

    public w(zv.i boundaryByteString, v type, List<b> list) {
        kotlin.jvm.internal.i.g(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.i.g(type, "type");
        this.f24711a = boundaryByteString;
        this.f24712b = list;
        Pattern pattern = v.f24702d;
        this.f24713c = v.a.a(type + "; boundary=" + boundaryByteString.u());
        this.f24714d = -1L;
    }

    @Override // lv.c0
    public final long a() {
        long j10 = this.f24714d;
        if (j10 == -1) {
            long d10 = d(null, true);
            this.f24714d = d10;
            return d10;
        }
        return j10;
    }

    @Override // lv.c0
    public final v b() {
        return this.f24713c;
    }

    @Override // lv.c0
    public final void c(zv.g gVar) {
        d(gVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(zv.g gVar, boolean z10) {
        zv.e eVar;
        zv.g gVar2;
        if (z10) {
            gVar2 = new zv.e();
            eVar = gVar2;
        } else {
            eVar = 0;
            gVar2 = gVar;
        }
        List<b> list = this.f24712b;
        int size = list.size();
        long j10 = 0;
        int i6 = 0;
        while (true) {
            zv.i iVar = this.f24711a;
            byte[] bArr = f24710i;
            byte[] bArr2 = f24709h;
            if (i6 < size) {
                int i10 = i6 + 1;
                b bVar = list.get(i6);
                s sVar = bVar.f24718a;
                kotlin.jvm.internal.i.d(gVar2);
                gVar2.write(bArr);
                gVar2.z(iVar);
                gVar2.write(bArr2);
                if (sVar != null) {
                    int length = sVar.f24683u.length / 2;
                    for (int i11 = 0; i11 < length; i11++) {
                        gVar2.T(sVar.m(i11)).write(f24708g).T(sVar.q(i11)).write(bArr2);
                    }
                }
                c0 c0Var = bVar.f24719b;
                v b10 = c0Var.b();
                if (b10 != null) {
                    gVar2.T("Content-Type: ").T(b10.f24704a).write(bArr2);
                }
                long a10 = c0Var.a();
                if (a10 != -1) {
                    gVar2.T("Content-Length: ").E0(a10).write(bArr2);
                } else if (z10) {
                    kotlin.jvm.internal.i.d(eVar);
                    eVar.a();
                    return -1L;
                }
                gVar2.write(bArr2);
                if (z10) {
                    j10 += a10;
                } else {
                    c0Var.c(gVar2);
                }
                gVar2.write(bArr2);
                i6 = i10;
            } else {
                kotlin.jvm.internal.i.d(gVar2);
                gVar2.write(bArr);
                gVar2.z(iVar);
                gVar2.write(bArr);
                gVar2.write(bArr2);
                if (z10) {
                    kotlin.jvm.internal.i.d(eVar);
                    long j11 = j10 + eVar.f39885v;
                    eVar.a();
                    return j11;
                }
                return j10;
            }
        }
    }
}
