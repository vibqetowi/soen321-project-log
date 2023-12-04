package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowKt$ScrollableTabRow$1 extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$1(int i) {
        super(3);
        this.$selectedTabIndex = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
        invoke((List<TabPosition>) list, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(List<TabPosition> tabPositions, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        ComposerKt.sourceInformation(composer, "C230@11409L92:TabRow.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655609869, i, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
        }
        TabRowDefaults.INSTANCE.m1496Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.Companion, tabPositions.get(this.$selectedTabIndex)), 0.0f, 0L, composer, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
