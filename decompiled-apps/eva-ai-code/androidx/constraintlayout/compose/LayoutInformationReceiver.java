package androidx.constraintlayout.compose;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "", "getForcedHeight", "", "getForcedWidth", "getLayoutInformationMode", "Landroidx/constraintlayout/compose/LayoutInfoFlags;", "setLayoutInformation", "", TtmlNode.TAG_INFORMATION, "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface LayoutInformationReceiver {
    int getForcedHeight();

    int getForcedWidth();

    LayoutInfoFlags getLayoutInformationMode();

    void setLayoutInformation(String str);
}
