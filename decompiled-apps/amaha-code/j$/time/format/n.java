package j$.time.format;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class n extends o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        super("", null, null, 0);
    }

    private n(String str, String str2, o oVar) {
        super(str, str2, oVar, 0);
    }

    @Override // j$.time.format.o
    protected final boolean c(char c10, char c11) {
        return x.c(c10, c11);
    }

    @Override // j$.time.format.o
    protected final o e(String str, String str2, o oVar) {
        return new n(str, str2, oVar);
    }

    @Override // j$.time.format.o
    protected final boolean h(CharSequence charSequence, int i6, int i10) {
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
            if (!x.c(this.f20911a.charAt(i11), charSequence.charAt(i6))) {
                return false;
            }
            i6 = i14;
            length = i12;
            i11 = i13;
        }
    }
}
