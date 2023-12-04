package com.ifriend.ui.progress;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ifriend.ui.progress.MultiPartProgressBar;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LevelProgressBar.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/ui/progress/LevelProgressBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "progressBar", "Lcom/ifriend/ui/progress/MultiPartProgressBar;", "setLevel", "", "currentProgress", "", "maxProgress", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LevelProgressBar extends FrameLayout {
    public static final int $stable = 8;
    private final MultiPartProgressBar progressBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        MultiPartProgressBar multiPartProgressBar = new MultiPartProgressBar(context, attributeSet);
        this.progressBar = multiPartProgressBar;
        setClipChildren(false);
        setClipToPadding(false);
        addView(multiPartProgressBar);
    }

    public /* synthetic */ LevelProgressBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final void setLevel(int i, int i2) {
        this.progressBar.setState(new MultiPartProgressBar.State(CollectionsKt.listOf(new MultiPartProgressBar.State.Part(1.0f, i2, 484302301, -1, 15.0f, i)), 0));
    }
}
