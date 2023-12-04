package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BadgeKt$Badge$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgeKt$Badge$1$1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, RowScope rowScope, int i, int i2) {
        super(2);
        this.$content = function3;
        this.$this_Row = rowScope;
        this.$$changed = i;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long j;
        TextStyle m5100copyv2rsoow;
        ComposerKt.sourceInformation(composer, "C157@6099L10,158@6171L114:Badge.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1784526485, i, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:156)");
            }
            TextStyle button = MaterialTheme.INSTANCE.getTypography(composer, 6).getButton();
            j = BadgeKt.BadgeContentFontSize;
            m5100copyv2rsoow = button.m5100copyv2rsoow((r48 & 1) != 0 ? button.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? button.spanStyle.m5042getFontSizeXSAIIZE() : j, (r48 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? button.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? button.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? button.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? button.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? button.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? button.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? button.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? button.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? button.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? button.platformStyle : null, (r48 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? button.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? button.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null);
            TextKt.ProvideTextStyle(m5100copyv2rsoow, ComposableLambdaKt.composableLambda(composer, 915155142, true, new AnonymousClass1(this.$content, this.$this_Row, this.$$changed, this.$$dirty)), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Badge.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material.BadgeKt$Badge$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, RowScope rowScope, int i, int i2) {
            super(2);
            this.$content = function3;
            this.$this_Row = rowScope;
            this.$$changed = i;
            this.$$dirty = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C160@6256L9:Badge.kt#jmzs0o");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915155142, i, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:160)");
            }
            this.$content.invoke(this.$this_Row, composer, Integer.valueOf((this.$$changed & 14) | ((this.$$dirty >> 6) & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
