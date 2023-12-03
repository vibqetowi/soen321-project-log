package a9;

import com.theinnerhour.b2b.utils.Constants;
import java.net.ProtocolException;
/* compiled from: AdOverlayInfo.java */
/* loaded from: classes.dex */
public final class a implements vd.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f373a;

    /* renamed from: b  reason: collision with root package name */
    public final int f374b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f375c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f376d;

    public /* synthetic */ a(Object obj, int i6, String str, int i10) {
        this.f373a = i10;
        this.f375c = obj;
        this.f374b = i6;
        this.f376d = str;
    }

    public static a b(String str) {
        int i6;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        xr.j jVar = xr.j.HTTP_1_0;
        if (startsWith) {
            i6 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        jVar = xr.j.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            i6 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i10 = i6 + 3;
        if (str.length() >= i10) {
            try {
                int parseInt = Integer.parseInt(str.substring(i6, i10));
                if (str.length() > i10) {
                    if (str.charAt(i10) == ' ') {
                        str2 = str.substring(i6 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new a(jVar, parseInt, str2, 2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    @Override // vd.b
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        vd.b[] bVarArr;
        int length = stackTraceElementArr.length;
        int i6 = this.f374b;
        if (length <= i6) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (vd.b bVar : (vd.b[]) this.f375c) {
            if (stackTraceElementArr2.length <= i6) {
                break;
            }
            stackTraceElementArr2 = bVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > i6) {
            return ((vd.a) this.f376d).a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final String toString() {
        String str;
        switch (this.f373a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                if (((xr.j) this.f375c) == xr.j.HTTP_1_0) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb2.append(str);
                sb2.append(' ');
                sb2.append(this.f374b);
                String str2 = (String) this.f376d;
                if (str2 != null) {
                    sb2.append(' ');
                    sb2.append(str2);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public a(vd.b[] bVarArr) {
        this.f373a = 1;
        this.f374b = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        this.f375c = bVarArr;
        this.f376d = new vd.a(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(com.google.android.exoplayer2.ui.c cVar) {
        this(cVar, 0, null, 0);
        this.f373a = 0;
    }
}
