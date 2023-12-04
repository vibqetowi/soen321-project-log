package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m5249updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m5078getLengthimpl;
        int m5080getMinimpl = TextRange.m5080getMinimpl(j);
        int m5079getMaximpl = TextRange.m5079getMaximpl(j);
        if (TextRange.m5084intersects5zctL8(j2, j)) {
            if (TextRange.m5072contains5zctL8(j2, j)) {
                m5080getMinimpl = TextRange.m5080getMinimpl(j2);
                m5079getMaximpl = m5080getMinimpl;
            } else {
                if (TextRange.m5072contains5zctL8(j, j2)) {
                    m5078getLengthimpl = TextRange.m5078getLengthimpl(j2);
                } else if (TextRange.m5073containsimpl(j2, m5080getMinimpl)) {
                    m5080getMinimpl = TextRange.m5080getMinimpl(j2);
                    m5078getLengthimpl = TextRange.m5078getLengthimpl(j2);
                } else {
                    m5079getMaximpl = TextRange.m5080getMinimpl(j2);
                }
                m5079getMaximpl -= m5078getLengthimpl;
            }
        } else if (m5079getMaximpl > TextRange.m5080getMinimpl(j2)) {
            m5080getMinimpl -= TextRange.m5078getLengthimpl(j2);
            m5078getLengthimpl = TextRange.m5078getLengthimpl(j2);
            m5079getMaximpl -= m5078getLengthimpl;
        }
        return TextRangeKt.TextRange(m5080getMinimpl, m5079getMaximpl);
    }
}
