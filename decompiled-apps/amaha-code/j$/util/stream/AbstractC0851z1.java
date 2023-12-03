package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0851z1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final I0 f21608a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f21609b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0851z1(I0 i02) {
        this.f21608a = i02;
        this.f21609b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0851z1(AbstractC0851z1 abstractC0851z1, I0 i02, int i6) {
        super(abstractC0851z1);
        this.f21608a = i02;
        this.f21609b = i6;
    }

    abstract void a();

    abstract C0847y1 b(int i6, int i10);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC0851z1 abstractC0851z1 = this;
        while (abstractC0851z1.f21608a.n() != 0) {
            abstractC0851z1.setPendingCount(abstractC0851z1.f21608a.n() - 1);
            int i6 = 0;
            int i10 = 0;
            while (i6 < abstractC0851z1.f21608a.n() - 1) {
                C0847y1 b10 = abstractC0851z1.b(i6, abstractC0851z1.f21609b + i10);
                i10 = (int) (i10 + b10.f21608a.count());
                b10.fork();
                i6++;
            }
            abstractC0851z1 = abstractC0851z1.b(i6, abstractC0851z1.f21609b + i10);
        }
        abstractC0851z1.a();
        abstractC0851z1.propagateCompletion();
    }
}
