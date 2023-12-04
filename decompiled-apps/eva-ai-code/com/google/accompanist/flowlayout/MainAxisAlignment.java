package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import kotlin.Metadata;
/* compiled from: Flow.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "arrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$Vertical;)V", "getArrangement$flowlayout_release", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Center", "Start", "End", "SpaceEvenly", "SpaceBetween", "SpaceAround", "flowlayout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MainAxisAlignment {
    Center(Arrangement.INSTANCE.getCenter()),
    Start(Arrangement.INSTANCE.getTop()),
    End(Arrangement.INSTANCE.getBottom()),
    SpaceEvenly(Arrangement.INSTANCE.getSpaceEvenly()),
    SpaceBetween(Arrangement.INSTANCE.getSpaceBetween()),
    SpaceAround(Arrangement.INSTANCE.getSpaceAround());
    
    private final Arrangement.Vertical arrangement;

    MainAxisAlignment(Arrangement.Vertical vertical) {
        this.arrangement = vertical;
    }

    public final Arrangement.Vertical getArrangement$flowlayout_release() {
        return this.arrangement;
    }
}
