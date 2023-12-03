package j$.time.format;
/* loaded from: classes3.dex */
final class m implements InterfaceC0710g {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0710g f20908a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20909b;

    /* renamed from: c  reason: collision with root package name */
    private final char f20910c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(InterfaceC0710g interfaceC0710g, int i6, char c10) {
        this.f20908a = interfaceC0710g;
        this.f20909b = i6;
        this.f20910c = c10;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        int length = sb2.length();
        if (this.f20908a.l(a10, sb2)) {
            int length2 = sb2.length() - length;
            int i6 = this.f20909b;
            if (length2 <= i6) {
                for (int i10 = 0; i10 < i6 - length2; i10++) {
                    sb2.insert(length, this.f20910c);
                }
                return true;
            }
            throw new j$.time.d("Cannot print as output of " + length2 + " characters exceeds pad width of " + i6);
        }
        return false;
    }

    @Override // j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        boolean l2 = xVar.l();
        if (i6 <= charSequence.length()) {
            if (i6 == charSequence.length()) {
                return ~i6;
            }
            int i10 = this.f20909b + i6;
            if (i10 > charSequence.length()) {
                if (l2) {
                    return ~i6;
                }
                i10 = charSequence.length();
            }
            int i11 = i6;
            while (i11 < i10 && xVar.b(charSequence.charAt(i11), this.f20910c)) {
                i11++;
            }
            int m10 = this.f20908a.m(xVar, charSequence.subSequence(0, i10), i11);
            return (m10 == i10 || !l2) ? m10 : ~(i6 + i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        String str;
        char c10 = this.f20910c;
        if (c10 == ' ') {
            str = ")";
        } else {
            str = ",'" + c10 + "')";
        }
        return "Pad(" + this.f20908a + "," + this.f20909b + str;
    }
}
