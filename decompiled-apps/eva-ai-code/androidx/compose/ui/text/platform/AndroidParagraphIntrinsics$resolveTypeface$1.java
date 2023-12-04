package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "invoke-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends Lambda implements Function4<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> {
    final /* synthetic */ AndroidParagraphIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.this$0 = androidParagraphIntrinsics;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Typeface invoke(FontFamily fontFamily, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis) {
        return m5333invokeDPcqOEQ(fontFamily, fontWeight, fontStyle.m5205unboximpl(), fontSynthesis.m5216unboximpl());
    }

    /* renamed from: invoke-DPcqOEQ  reason: not valid java name */
    public final Typeface m5333invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        State<Object> mo5176resolveDPcqOEQ = this.this$0.getFontFamilyResolver().mo5176resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        if (!(mo5176resolveDPcqOEQ instanceof TypefaceResult.Immutable)) {
            typefaceDirtyTrackerLinkedList = this.this$0.resolvedTypefaces;
            TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new TypefaceDirtyTrackerLinkedList(mo5176resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
            this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
            return typefaceDirtyTrackerLinkedList2.getTypeface();
        }
        Object value = mo5176resolveDPcqOEQ.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }
}
