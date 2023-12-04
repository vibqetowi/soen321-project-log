package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.Brush;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VectorCompose.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VectorComposeKt$Path$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $fill;
    final /* synthetic */ float $fillAlpha;
    final /* synthetic */ String $name;
    final /* synthetic */ List<PathNode> $pathData;
    final /* synthetic */ int $pathFillType;
    final /* synthetic */ Brush $stroke;
    final /* synthetic */ float $strokeAlpha;
    final /* synthetic */ int $strokeLineCap;
    final /* synthetic */ int $strokeLineJoin;
    final /* synthetic */ float $strokeLineMiter;
    final /* synthetic */ float $strokeLineWidth;
    final /* synthetic */ float $trimPathEnd;
    final /* synthetic */ float $trimPathOffset;
    final /* synthetic */ float $trimPathStart;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VectorComposeKt$Path$3(List<? extends PathNode> list, int i, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, int i5, int i6) {
        super(2);
        this.$pathData = list;
        this.$pathFillType = i;
        this.$name = str;
        this.$fill = brush;
        this.$fillAlpha = f;
        this.$stroke = brush2;
        this.$strokeAlpha = f2;
        this.$strokeLineWidth = f3;
        this.$strokeLineCap = i2;
        this.$strokeLineJoin = i3;
        this.$strokeLineMiter = f4;
        this.$trimPathStart = f5;
        this.$trimPathEnd = f6;
        this.$trimPathOffset = f7;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        VectorComposeKt.m3936Path9cdaXJ4(this.$pathData, this.$pathFillType, this.$name, this.$fill, this.$fillAlpha, this.$stroke, this.$strokeAlpha, this.$strokeLineWidth, this.$strokeLineCap, this.$strokeLineJoin, this.$strokeLineMiter, this.$trimPathStart, this.$trimPathEnd, this.$trimPathOffset, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
