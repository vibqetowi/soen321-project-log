package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextMeasurer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "equals", "", "other", "hashCode", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheTextLayoutInput {
    private final TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(TextLayoutInput textLayoutInput) {
        Intrinsics.checkNotNullParameter(textLayoutInput, "textLayoutInput");
        this.textLayoutInput = textLayoutInput;
    }

    public final TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + textLayoutInput.getPlaceholders().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + UByte$$ExternalSyntheticBackport0.m(textLayoutInput.getSoftWrap())) * 31) + TextOverflow.m5510hashCodeimpl(textLayoutInput.m5051getOverflowgIe3tQ8())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + Constraints.m5551getMaxWidthimpl(textLayoutInput.m5050getConstraintsmsEJaDk())) * 31) + Constraints.m5550getMaxHeightimpl(textLayoutInput.m5050getConstraintsmsEJaDk());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CacheTextLayoutInput) {
            TextLayoutInput textLayoutInput = this.textLayoutInput;
            CacheTextLayoutInput cacheTextLayoutInput = (CacheTextLayoutInput) obj;
            return Intrinsics.areEqual(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && Intrinsics.areEqual(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && TextOverflow.m5509equalsimpl0(textLayoutInput.m5051getOverflowgIe3tQ8(), cacheTextLayoutInput.textLayoutInput.m5051getOverflowgIe3tQ8()) && Intrinsics.areEqual(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && Constraints.m5551getMaxWidthimpl(textLayoutInput.m5050getConstraintsmsEJaDk()) == Constraints.m5551getMaxWidthimpl(cacheTextLayoutInput.textLayoutInput.m5050getConstraintsmsEJaDk()) && Constraints.m5550getMaxHeightimpl(textLayoutInput.m5050getConstraintsmsEJaDk()) == Constraints.m5550getMaxHeightimpl(cacheTextLayoutInput.textLayoutInput.m5050getConstraintsmsEJaDk());
        }
        return false;
    }
}
