package com.ifriend.ui.features.interests;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.components.scrollable.AutoScrollKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatInterests.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"InterestsRow", "", FirebaseAnalytics.Param.ITEMS, "", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatInterestsKt {
    public static final void InterestsRow(List<String> items, Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(1579363015);
        ComposerKt.sourceInformation(startRestartGroup, "C(InterestsRow)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1579363015, i, -1, "com.ifriend.ui.features.interests.InterestsRow (ChatInterests.kt:25)");
        }
        if (!items.isEmpty()) {
            float m5607constructorimpl = Dp.m5607constructorimpl(10);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
            LazyDslKt.LazyRow(modifier, rememberLazyListState, null, false, null, Alignment.Companion.getCenterVertically(), null, false, new ChatInterestsKt$InterestsRow$1(items, m5607constructorimpl), startRestartGroup, ((i >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 220);
            AutoScrollKt.m7066InfiniteAutoScrollEffect942rkJo(rememberLazyListState, false, 0.0f, null, startRestartGroup, 0, 7);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatInterestsKt$InterestsRow$2(items, modifier, i));
    }
}
