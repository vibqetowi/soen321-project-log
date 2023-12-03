package qv;

import gv.n;
import java.net.ProtocolException;
import lv.y;
/* compiled from: StatusLine.kt */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final y f30158a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30159b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30160c;

    /* compiled from: StatusLine.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static i a(String statusLine) {
            int i6;
            String str;
            kotlin.jvm.internal.i.g(statusLine, "statusLine");
            boolean H0 = n.H0(statusLine, "HTTP/1.");
            y yVar = y.HTTP_1_0;
            if (H0) {
                i6 = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            yVar = y.HTTP_1_1;
                        } else {
                            throw new ProtocolException(kotlin.jvm.internal.i.n(statusLine, "Unexpected status line: "));
                        }
                    }
                } else {
                    throw new ProtocolException(kotlin.jvm.internal.i.n(statusLine, "Unexpected status line: "));
                }
            } else if (n.H0(statusLine, "ICY ")) {
                i6 = 4;
            } else {
                throw new ProtocolException(kotlin.jvm.internal.i.n(statusLine, "Unexpected status line: "));
            }
            int i10 = i6 + 3;
            if (statusLine.length() >= i10) {
                try {
                    String substring = statusLine.substring(i6, i10);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (statusLine.length() > i10) {
                        if (statusLine.charAt(i10) == ' ') {
                            str = statusLine.substring(i6 + 4);
                            kotlin.jvm.internal.i.f(str, "this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new ProtocolException(kotlin.jvm.internal.i.n(statusLine, "Unexpected status line: "));
                        }
                    } else {
                        str = "";
                    }
                    return new i(yVar, parseInt, str);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(kotlin.jvm.internal.i.n(statusLine, "Unexpected status line: "));
                }
            }
            throw new ProtocolException(kotlin.jvm.internal.i.n(statusLine, "Unexpected status line: "));
        }
    }

    public i(y yVar, int i6, String str) {
        this.f30158a = yVar;
        this.f30159b = i6;
        this.f30160c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f30158a == y.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f30159b);
        sb2.append(' ');
        sb2.append(this.f30160c);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
