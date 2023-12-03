package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0708e implements InterfaceC0710g {

    /* renamed from: a  reason: collision with root package name */
    private final char f20892a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0708e(char c10) {
        this.f20892a = c10;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        sb2.append(this.f20892a);
        return true;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        if (i6 == charSequence.length()) {
            return ~i6;
        }
        char charAt = charSequence.charAt(i6);
        char c10 = this.f20892a;
        return (charAt == c10 || (!xVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c10) || Character.toLowerCase(charAt) == Character.toLowerCase(c10)))) ? i6 + 1 : ~i6;
    }

    public final String toString() {
        char c10 = this.f20892a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
