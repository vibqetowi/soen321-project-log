package u7;
/* compiled from: ExtractorInput.java */
/* loaded from: classes.dex */
public interface i extends b9.d {
    boolean a(byte[] bArr, int i6, int i10, boolean z10);

    void b(int i6, byte[] bArr, int i10);

    boolean d(byte[] bArr, int i6, int i10, boolean z10);

    long e();

    void f(int i6);

    int g(int i6, byte[] bArr, int i10);

    long getLength();

    long getPosition();

    int i(int i6);

    void k();

    void l(int i6);

    boolean m(int i6, boolean z10);

    @Override // b9.d
    int read(byte[] bArr, int i6, int i10);

    void readFully(byte[] bArr, int i6, int i10);
}
