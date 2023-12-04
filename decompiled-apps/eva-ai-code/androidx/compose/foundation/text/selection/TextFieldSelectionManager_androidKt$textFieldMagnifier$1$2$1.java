package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldSelectionManager.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", TtmlNode.CENTER, "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1 extends Lambda implements Function1<Function0<? extends Offset>, Modifier> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.$density = density;
        this.$magnifierSize$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/Density;", "invoke-tuRUvjQ", "(Landroidx/compose/ui/unit/Density;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Density, Offset> {
        final /* synthetic */ Function0<Offset> $center;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Offset> function0) {
            super(1);
            this.$center = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(Density density) {
            return Offset.m3007boximpl(m1226invoketuRUvjQ(density));
        }

        /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
        public final long m1226invoketuRUvjQ(Density magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
            return this.$center.invoke().m3028unboximpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "size", "Landroidx/compose/ui/unit/DpSize;", "invoke-EaSLcWc", "(J)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<DpSize, Unit> {
        final /* synthetic */ Density $density;
        final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Density density, MutableState<IntSize> mutableState) {
            super(1);
            this.$density = density;
            this.$magnifierSize$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DpSize dpSize) {
            m1227invokeEaSLcWc(dpSize.m5713unboximpl());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-EaSLcWc  reason: not valid java name */
        public final void m1227invokeEaSLcWc(long j) {
            MutableState<IntSize> mutableState = this.$magnifierSize$delegate;
            Density density = this.$density;
            TextFieldSelectionManager_androidKt$textFieldMagnifier$1.invoke$lambda$2(mutableState, IntSizeKt.IntSize(density.mo582roundToPx0680j_4(DpSize.m5705getWidthD9Ej5fM(j)), density.mo582roundToPx0680j_4(DpSize.m5703getHeightD9Ej5fM(j))));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function0) {
        return invoke2((Function0<Offset>) function0);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Modifier invoke2(Function0<Offset> center) {
        Intrinsics.checkNotNullParameter(center, "center");
        return MagnifierKt.magnifier$default(Modifier.Companion, new AnonymousClass1(center), null, 0.0f, MagnifierStyle.Companion.getTextDefault(), new AnonymousClass2(this.$density, this.$magnifierSize$delegate), 6, null);
    }
}
