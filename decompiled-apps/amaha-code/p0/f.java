package p0;

import android.util.Base64;
import java.io.Serializable;
import java.util.List;
import nd.z;
/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27830a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final String f27831b;

    /* renamed from: c  reason: collision with root package name */
    public final String f27832c;

    /* renamed from: d  reason: collision with root package name */
    public final String f27833d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27834e;
    public final Serializable f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f27835g;

    public /* synthetic */ f(String[] strArr, z zVar, String str, int i6, int i10) {
        this(strArr, zVar, null, null, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? -1 : i6);
    }

    public final String toString() {
        switch (this.f27830a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FontRequest {mProviderAuthority: " + this.f27831b + ", mProviderPackage: " + this.f27832c + ", mQuery: " + this.f27833d + ", mCertificates:");
                int i6 = 0;
                while (true) {
                    List list = (List) this.f27835g;
                    if (i6 < list.size()) {
                        sb2.append(" [");
                        List list2 = (List) list.get(i6);
                        for (int i10 = 0; i10 < list2.size(); i10++) {
                            sb2.append(" \"");
                            sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                            sb2.append("\"");
                        }
                        sb2.append(" ]");
                        i6++;
                    } else {
                        sb2.append("}");
                        sb2.append("mCertificatesArray: " + this.f27834e);
                        return sb2.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(String[] strArr, z zVar, String str, String str2, String str3, int i6) {
        this.f = strArr;
        this.f27835g = zVar;
        this.f27831b = str;
        this.f27832c = str2;
        this.f27833d = str3;
        this.f27834e = i6;
    }

    public f(String str, String str2, String str3, List list) {
        str.getClass();
        this.f27831b = str;
        str2.getClass();
        this.f27832c = str2;
        this.f27833d = str3;
        list.getClass();
        this.f27835g = list;
        this.f27834e = 0;
        this.f = str + "-" + str2 + "-" + str3;
    }
}
