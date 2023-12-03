package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes3.dex */
class o {

    /* renamed from: a  reason: collision with root package name */
    protected String f20911a;

    /* renamed from: b  reason: collision with root package name */
    protected String f20912b;

    /* renamed from: c  reason: collision with root package name */
    protected char f20913c;

    /* renamed from: d  reason: collision with root package name */
    protected o f20914d;

    /* renamed from: e  reason: collision with root package name */
    protected o f20915e;

    private o(String str, String str2, o oVar) {
        this.f20911a = str;
        this.f20912b = str2;
        this.f20914d = oVar;
        this.f20913c = str.isEmpty() ? (char) 65535 : this.f20911a.charAt(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o(String str, String str2, o oVar, int i6) {
        this(str, str2, oVar);
    }

    private boolean b(String str, String str2) {
        int i6 = 0;
        while (i6 < str.length() && i6 < this.f20911a.length() && c(str.charAt(i6), this.f20911a.charAt(i6))) {
            i6++;
        }
        if (i6 != this.f20911a.length()) {
            o e10 = e(this.f20911a.substring(i6), this.f20912b, this.f20914d);
            this.f20911a = str.substring(0, i6);
            this.f20914d = e10;
            if (i6 < str.length()) {
                this.f20914d.f20915e = e(str.substring(i6), str2, null);
                this.f20912b = null;
            } else {
                this.f20912b = str2;
            }
            return true;
        } else if (i6 >= str.length()) {
            this.f20912b = str2;
            return true;
        } else {
            String substring = str.substring(i6);
            for (o oVar = this.f20914d; oVar != null; oVar = oVar.f20915e) {
                if (c(oVar.f20913c, substring.charAt(0))) {
                    return oVar.b(substring, str2);
                }
            }
            o e11 = e(substring, str2, null);
            e11.f20915e = this.f20914d;
            this.f20914d = e11;
            return true;
        }
    }

    public static o f(x xVar) {
        return xVar.k() ? new o("", null, null) : new n();
    }

    public static o g(Set set, x xVar) {
        o f = f(xVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.b(str, str);
        }
        return f;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    protected boolean c(char c10, char c11) {
        return c10 == c11;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (h(charSequence, index, length)) {
            int length2 = this.f20911a.length() + index;
            o oVar = this.f20914d;
            if (oVar != null && length2 != length) {
                while (true) {
                    if (!c(oVar.f20913c, charSequence.charAt(length2))) {
                        oVar = oVar.f20915e;
                        if (oVar == null) {
                            break;
                        }
                    } else {
                        parsePosition.setIndex(length2);
                        String d10 = oVar.d(charSequence, parsePosition);
                        if (d10 != null) {
                            return d10;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.f20912b;
        }
        return null;
    }

    protected o e(String str, String str2, o oVar) {
        return new o(str, str2, oVar);
    }

    protected boolean h(CharSequence charSequence, int i6, int i10) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f20911a, i6);
        }
        int length = this.f20911a.length();
        if (length > i10 - i6) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i6 + 1;
            if (!c(this.f20911a.charAt(i11), charSequence.charAt(i6))) {
                return false;
            }
            i6 = i14;
            length = i12;
            i11 = i13;
        }
    }
}
