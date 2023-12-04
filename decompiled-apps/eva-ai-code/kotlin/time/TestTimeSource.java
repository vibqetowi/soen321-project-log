package kotlin.time;

import kotlin.Metadata;
import org.apache.commons.lang3.ClassUtils;
/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.time.AbstractLongTimeSource
    public long read() {
        return this.reading;
    }

    /* renamed from: plusAssign-LRDsOJo  reason: not valid java name */
    public final void m8776plusAssignLRDsOJo(long j) {
        long m8686toLongimpl = Duration.m8686toLongimpl(j, getUnit());
        if (!(((m8686toLongimpl - 1) | 1) == Long.MAX_VALUE)) {
            long j2 = this.reading;
            long j3 = j2 + m8686toLongimpl;
            if ((m8686toLongimpl ^ j2) >= 0 && (j2 ^ j3) < 0) {
                m8775overflowLRDsOJo(j);
            }
            this.reading = j3;
            return;
        }
        long m8643divUwyO8pc = Duration.m8643divUwyO8pc(j, 2);
        if (!((1 | (Duration.m8686toLongimpl(m8643divUwyO8pc, getUnit()) - 1)) == Long.MAX_VALUE)) {
            long j4 = this.reading;
            try {
                m8776plusAssignLRDsOJo(m8643divUwyO8pc);
                m8776plusAssignLRDsOJo(Duration.m8675minusLRDsOJo(j, m8643divUwyO8pc));
                return;
            } catch (IllegalStateException e) {
                this.reading = j4;
                throw e;
            }
        }
        m8775overflowLRDsOJo(j);
    }

    /* renamed from: overflow-LRDsOJo  reason: not valid java name */
    private final void m8775overflowLRDsOJo(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m8689toStringimpl(j)) + ClassUtils.PACKAGE_SEPARATOR_CHAR);
    }
}
