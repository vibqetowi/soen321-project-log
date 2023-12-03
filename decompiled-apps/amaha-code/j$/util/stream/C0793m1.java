package j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0793m1 extends AbstractC0798n1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0793m1(I0 i02) {
        super(i02);
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        if (this.f21514a == null) {
            return;
        }
        if (this.f21517d != null) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        j$.util.S s10 = this.f21516c;
        if (s10 != null) {
            s10.forEachRemaining(consumer);
            return;
        }
        ArrayDeque b10 = b();
        while (true) {
            I0 a10 = AbstractC0798n1.a(b10);
            if (a10 == null) {
                this.f21514a = null;
                return;
            }
            a10.forEach(consumer);
        }
    }

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        I0 a10;
        if (c()) {
            boolean tryAdvance = this.f21517d.tryAdvance(consumer);
            if (!tryAdvance) {
                if (this.f21516c == null && (a10 = AbstractC0798n1.a(this.f21518e)) != null) {
                    j$.util.S spliterator = a10.spliterator();
                    this.f21517d = spliterator;
                    return spliterator.tryAdvance(consumer);
                }
                this.f21514a = null;
            }
            return tryAdvance;
        }
        return false;
    }
}
