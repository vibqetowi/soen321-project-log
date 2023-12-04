package androidx.compose.ui.tooling.data;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlotTree.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocationInfo;", "", "lineNumber", "", TypedValues.CycleType.S_WAVE_OFFSET, SessionDescription.ATTR_LENGTH, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLineNumber", "getOffset", "ui-tooling-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SourceLocationInfo {
    private final Integer length;
    private final Integer lineNumber;
    private final Integer offset;

    public SourceLocationInfo(Integer num, Integer num2, Integer num3) {
        this.lineNumber = num;
        this.offset = num2;
        this.length = num3;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getLineNumber() {
        return this.lineNumber;
    }

    public final Integer getOffset() {
        return this.offset;
    }
}
