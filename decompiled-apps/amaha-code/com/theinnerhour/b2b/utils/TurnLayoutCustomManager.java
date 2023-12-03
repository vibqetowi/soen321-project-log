package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import cdflynn.android.library.turn.TurnLayoutManager;
import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: TurnLayoutCustomManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015BA\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\r\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B%\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0014J$\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0016"}, d2 = {"Lcom/theinnerhour/b2b/utils/TurnLayoutCustomManager;", "Lcdflynn/android/library/turn/TurnLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$y;", "state", "", Constants.DAYMODEL_POSITION, "Lhs/k;", "smoothScrollToPosition", "Landroid/content/Context;", "context", "gravity", "orientation", "radius", "peekDistance", "", "rotate", "<init>", "(Landroid/content/Context;IIIIZ)V", "(Landroid/content/Context;II)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TurnLayoutCustomManager extends TurnLayoutManager {
    public static final Companion Companion = new Companion(null);
    public static final float MILLISECONDS_PER_INCH = 75.0f;

    /* compiled from: TurnLayoutCustomManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/utils/TurnLayoutCustomManager$Companion;", "", "()V", "MILLISECONDS_PER_INCH", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TurnLayoutCustomManager(Context context, int i6, int i10, int i11, int i12, boolean z10) {
        super(context, i6, i10, i11, i12, z10);
        kotlin.jvm.internal.i.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i6) {
        if (recyclerView != null) {
            final Context context = recyclerView.getContext();
            q qVar = new q(context) { // from class: com.theinnerhour.b2b.utils.TurnLayoutCustomManager$smoothScrollToPosition$linearSmoothScroller$1
                @Override // androidx.recyclerview.widget.q
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    kotlin.jvm.internal.i.g(displayMetrics, "displayMetrics");
                    return 75.0f / displayMetrics.densityDpi;
                }
            };
            qVar.setTargetPosition(i6);
            startSmoothScroll(qVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TurnLayoutCustomManager(Context context, int i6, int i10) {
        super(context, i6, i10);
        kotlin.jvm.internal.i.g(context, "context");
    }
}
