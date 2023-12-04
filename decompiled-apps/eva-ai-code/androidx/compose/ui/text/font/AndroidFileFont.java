package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidPreloadedFont.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0010¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\fH\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", "getFile", "()Ljava/io/File;", "doLoad", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "doLoad$ui_text_release", "toString", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidFileFont extends AndroidPreloadedFont {
    private final String cacheKey;
    private final File file;

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, fontWeight, i, settings);
    }

    public final File getFile() {
        return this.file;
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i2 & 4) != 0 ? FontStyle.Companion.m5207getNormal_LCdwA() : i, settings, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AndroidFileFont(File file, FontWeight weight, int i, FontVariation.Settings variationSettings) {
        super(weight, i, variationSettings, null);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.file = file;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings());
        }
        return android.graphics.Typeface.createFromFile(this.file);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m5204toStringimpl(mo5156getStyle_LCdwA())) + ')';
    }
}