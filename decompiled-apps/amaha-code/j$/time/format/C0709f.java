package j$.time.format;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0709f implements InterfaceC0710g {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0710g[] f20893a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20894b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0709f(ArrayList arrayList, boolean z10) {
        this((InterfaceC0710g[]) arrayList.toArray(new InterfaceC0710g[arrayList.size()]), z10);
    }

    C0709f(InterfaceC0710g[] interfaceC0710gArr, boolean z10) {
        this.f20893a = interfaceC0710gArr;
        this.f20894b = z10;
    }

    public final C0709f a() {
        return !this.f20894b ? this : new C0709f(this.f20893a, false);
    }

    @Override // j$.time.format.InterfaceC0710g
    public final boolean l(A a10, StringBuilder sb2) {
        int length = sb2.length();
        boolean z10 = this.f20894b;
        if (z10) {
            a10.g();
        }
        try {
            for (InterfaceC0710g interfaceC0710g : this.f20893a) {
                if (!interfaceC0710g.l(a10, sb2)) {
                    sb2.setLength(length);
                    return true;
                }
            }
            if (z10) {
                a10.a();
            }
            return true;
        } finally {
            if (z10) {
                a10.a();
            }
        }
    }

    @Override // j$.time.format.InterfaceC0710g
    public final int m(x xVar, CharSequence charSequence, int i6) {
        boolean z10 = this.f20894b;
        InterfaceC0710g[] interfaceC0710gArr = this.f20893a;
        if (!z10) {
            for (InterfaceC0710g interfaceC0710g : interfaceC0710gArr) {
                i6 = interfaceC0710g.m(xVar, charSequence, i6);
                if (i6 < 0) {
                    break;
                }
            }
            return i6;
        }
        xVar.r();
        int i10 = i6;
        for (InterfaceC0710g interfaceC0710g2 : interfaceC0710gArr) {
            i10 = interfaceC0710g2.m(xVar, charSequence, i10);
            if (i10 < 0) {
                xVar.f(false);
                return i6;
            }
        }
        xVar.f(true);
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        InterfaceC0710g[] interfaceC0710gArr = this.f20893a;
        if (interfaceC0710gArr != null) {
            boolean z10 = this.f20894b;
            sb2.append(z10 ? "[" : "(");
            for (InterfaceC0710g interfaceC0710g : interfaceC0710gArr) {
                sb2.append(interfaceC0710g);
            }
            sb2.append(z10 ? "]" : ")");
        }
        return sb2.toString();
    }
}
