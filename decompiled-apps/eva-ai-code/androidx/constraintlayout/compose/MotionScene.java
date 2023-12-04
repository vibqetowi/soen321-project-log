package androidx.constraintlayout.compose;

import androidx.compose.runtime.MutableState;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: MotionLayout.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/MotionScene;", "", "getConstraintSet", "", FirebaseAnalytics.Param.INDEX, "", "name", "getForcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedProgress", "", "getTransition", "resetForcedProgress", "", "setConstraintSetContent", FirebaseAnalytics.Param.CONTENT, "setDebugName", "setTransitionContent", "setUpdateFlag", "needsUpdate", "Landroidx/compose/runtime/MutableState;", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface MotionScene {
    String getConstraintSet(int i);

    String getConstraintSet(String str);

    MotionLayoutDebugFlags getForcedDrawDebug();

    float getForcedProgress();

    String getTransition(String str);

    void resetForcedProgress();

    void setConstraintSetContent(String str, String str2);

    void setDebugName(String str);

    void setTransitionContent(String str, String str2);

    void setUpdateFlag(MutableState<Long> mutableState);
}
