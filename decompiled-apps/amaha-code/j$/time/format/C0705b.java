package j$.time.format;

import java.util.Iterator;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0705b extends C {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ B f20890e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0705b(B b10) {
        this.f20890e = b10;
    }

    @Override // j$.time.format.C
    public final String e(j$.time.chrono.n nVar, j$.time.temporal.p pVar, long j10, H h10, Locale locale) {
        return this.f20890e.a(j10, h10);
    }

    @Override // j$.time.format.C
    public final String f(j$.time.temporal.p pVar, long j10, H h10, Locale locale) {
        return this.f20890e.a(j10, h10);
    }

    @Override // j$.time.format.C
    public final Iterator g(j$.time.chrono.n nVar, j$.time.temporal.p pVar, H h10, Locale locale) {
        return this.f20890e.b(h10);
    }

    @Override // j$.time.format.C
    public final Iterator h(j$.time.temporal.p pVar, H h10, Locale locale) {
        return this.f20890e.b(h10);
    }
}
