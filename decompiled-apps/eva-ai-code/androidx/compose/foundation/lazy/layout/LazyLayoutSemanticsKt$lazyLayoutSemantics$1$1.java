package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ ScrollAxisRange $accessibilityScrollState;
    final /* synthetic */ CollectionInfo $collectionInfo;
    final /* synthetic */ Function1<Object, Integer> $indexForKeyMapping;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ Function2<Float, Float, Boolean> $scrollByAction;
    final /* synthetic */ Function1<Integer, Boolean> $scrollToIndexAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(Function1<Object, Integer> function1, boolean z, ScrollAxisRange scrollAxisRange, Function2<? super Float, ? super Float, Boolean> function2, Function1<? super Integer, Boolean> function12, CollectionInfo collectionInfo) {
        super(1);
        this.$indexForKeyMapping = function1;
        this.$isVertical = z;
        this.$accessibilityScrollState = scrollAxisRange;
        this.$scrollByAction = function2;
        this.$scrollToIndexAction = function12;
        this.$collectionInfo = collectionInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        SemanticsPropertiesKt.indexForKey(semantics, this.$indexForKeyMapping);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, this.$accessibilityScrollState);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, this.$accessibilityScrollState);
        }
        Function2<Float, Float, Boolean> function2 = this.$scrollByAction;
        if (function2 != null) {
            SemanticsPropertiesKt.scrollBy$default(semantics, null, function2, 1, null);
        }
        Function1<Integer, Boolean> function1 = this.$scrollToIndexAction;
        if (function1 != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semantics, null, function1, 1, null);
        }
        SemanticsPropertiesKt.setCollectionInfo(semantics, this.$collectionInfo);
    }
}
