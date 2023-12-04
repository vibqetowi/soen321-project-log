package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.share.internal.ShareConstants;
import io.grpc.netty.shaded.io.netty.handler.ssl.ApplicationProtocolNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012Bo\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006*"}, d2 = {"Landroidx/compose/material/Typography;", "", "defaultFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "h1", "Landroidx/compose/ui/text/TextStyle;", ApplicationProtocolNames.HTTP_2, "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", ShareConstants.FEED_CAPTION_PARAM, "overline", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getBody1", "()Landroidx/compose/ui/text/TextStyle;", "getBody2", "getButton", "getCaption", "getH1", "getH2", "getH3", "getH4", "getH5", "getH6", "getOverline", "getSubtitle1", "getSubtitle2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Typography {
    public static final int $stable = 0;
    private final TextStyle body1;
    private final TextStyle body2;
    private final TextStyle button;
    private final TextStyle caption;
    private final TextStyle h1;
    private final TextStyle h2;
    private final TextStyle h3;
    private final TextStyle h4;
    private final TextStyle h5;
    private final TextStyle h6;
    private final TextStyle overline;
    private final TextStyle subtitle1;
    private final TextStyle subtitle2;

    public Typography(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
        this.h5 = h5;
        this.h6 = h6;
        this.subtitle1 = subtitle1;
        this.subtitle2 = subtitle2;
        this.body1 = body1;
        this.body2 = body2;
        this.button = button;
        this.caption = caption;
        this.overline = overline;
    }

    public final TextStyle getH1() {
        return this.h1;
    }

    public final TextStyle getH2() {
        return this.h2;
    }

    public final TextStyle getH3() {
        return this.h3;
    }

    public final TextStyle getH4() {
        return this.h4;
    }

    public final TextStyle getH5() {
        return this.h5;
    }

    public final TextStyle getH6() {
        return this.h6;
    }

    public final TextStyle getSubtitle1() {
        return this.subtitle1;
    }

    public final TextStyle getSubtitle2() {
        return this.subtitle2;
    }

    public final TextStyle getBody1() {
        return this.body1;
    }

    public final TextStyle getBody2() {
        return this.body2;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    public final TextStyle getCaption() {
        return this.caption;
    }

    public final TextStyle getOverline() {
        return this.overline;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Typography(FontFamily fontFamily, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r3, r4, r6, r5, r9, r10, r11, r13, r7, r8, r12, r0);
        TextStyle textStyle14;
        TextStyle textStyle15;
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        TextStyle textStyle21;
        TextStyle textStyle22;
        TextStyle textStyle23;
        TextStyle textStyle24;
        TextStyle textStyle25;
        TextStyle textStyle26;
        SystemFontFamily systemFontFamily = (i & 1) != 0 ? FontFamily.Companion.getDefault() : fontFamily;
        if ((i & 2) != 0) {
            textStyle14 = r3.m5100copyv2rsoow((r48 & 1) != 0 ? r3.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(96), (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : FontWeight.Companion.getLight(), (r48 & 8) != 0 ? r3.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r3.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-1.5d), (r48 & 256) != 0 ? r3.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r3.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r3.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r3.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle14 = textStyle;
        }
        if ((i & 4) != 0) {
            textStyle15 = r4.m5100copyv2rsoow((r48 & 1) != 0 ? r4.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r4.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(60), (r48 & 4) != 0 ? r4.spanStyle.getFontWeight() : FontWeight.Companion.getLight(), (r48 & 8) != 0 ? r4.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r4.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r4.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r4.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r4.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(-0.5d), (r48 & 256) != 0 ? r4.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r4.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r4.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r4.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r4.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r4.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r4.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r4.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r4.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r4.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r4.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r4.platformStyle : null, (r48 & 1048576) != 0 ? r4.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r4.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r4.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle15 = textStyle2;
        }
        if ((i & 8) != 0) {
            textStyle16 = r6.m5100copyv2rsoow((r48 & 1) != 0 ? r6.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r6.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(48), (r48 & 4) != 0 ? r6.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r6.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r6.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r6.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r6.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r6.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0), (r48 & 256) != 0 ? r6.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r6.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r6.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r6.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r6.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r6.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r6.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r6.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r6.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r6.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r6.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r6.platformStyle : null, (r48 & 1048576) != 0 ? r6.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r6.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r6.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle16 = textStyle3;
        }
        if ((i & 16) != 0) {
            textStyle17 = r9.m5100copyv2rsoow((r48 & 1) != 0 ? r9.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r9.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(34), (r48 & 4) != 0 ? r9.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r9.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r9.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r9.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r9.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r9.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.25d), (r48 & 256) != 0 ? r9.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r9.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r9.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r9.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r9.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r9.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r9.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r9.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r9.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r9.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r9.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r9.platformStyle : null, (r48 & 1048576) != 0 ? r9.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r9.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r9.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle17 = textStyle4;
        }
        if ((i & 32) != 0) {
            textStyle18 = r10.m5100copyv2rsoow((r48 & 1) != 0 ? r10.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r10.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(24), (r48 & 4) != 0 ? r10.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r10.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r10.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r10.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r10.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r10.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0), (r48 & 256) != 0 ? r10.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r10.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r10.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r10.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r10.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r10.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r10.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r10.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r10.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r10.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r10.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r10.platformStyle : null, (r48 & 1048576) != 0 ? r10.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r10.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r10.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle18 = textStyle5;
        }
        if ((i & 64) != 0) {
            textStyle19 = r12.m5100copyv2rsoow((r48 & 1) != 0 ? r12.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r12.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(20), (r48 & 4) != 0 ? r12.spanStyle.getFontWeight() : FontWeight.Companion.getMedium(), (r48 & 8) != 0 ? r12.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r12.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r12.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r12.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r12.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.15d), (r48 & 256) != 0 ? r12.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r12.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r12.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r12.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r12.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r12.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r12.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r12.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r12.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r12.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r12.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r12.platformStyle : null, (r48 & 1048576) != 0 ? r12.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r12.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r12.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle19 = textStyle6;
        }
        if ((i & 128) != 0) {
            textStyle20 = r14.m5100copyv2rsoow((r48 & 1) != 0 ? r14.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r14.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(16), (r48 & 4) != 0 ? r14.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r14.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r14.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r14.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r14.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r14.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.15d), (r48 & 256) != 0 ? r14.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r14.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r14.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r14.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r14.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r14.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r14.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r14.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r14.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r14.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r14.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r14.platformStyle : null, (r48 & 1048576) != 0 ? r14.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r14.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r14.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle20 = textStyle7;
        }
        if ((i & 256) != 0) {
            textStyle21 = r14.m5100copyv2rsoow((r48 & 1) != 0 ? r14.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r14.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(14), (r48 & 4) != 0 ? r14.spanStyle.getFontWeight() : FontWeight.Companion.getMedium(), (r48 & 8) != 0 ? r14.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r14.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r14.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r14.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r14.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.1d), (r48 & 256) != 0 ? r14.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r14.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r14.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r14.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r14.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r14.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r14.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r14.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r14.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r14.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r14.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r14.platformStyle : null, (r48 & 1048576) != 0 ? r14.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r14.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r14.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle21 = textStyle8;
        }
        if ((i & 512) != 0) {
            textStyle22 = r15.m5100copyv2rsoow((r48 & 1) != 0 ? r15.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r15.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(16), (r48 & 4) != 0 ? r15.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r15.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r15.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r15.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r15.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r15.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.5d), (r48 & 256) != 0 ? r15.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r15.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r15.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r15.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r15.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r15.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r15.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r15.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r15.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r15.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r15.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r15.platformStyle : null, (r48 & 1048576) != 0 ? r15.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r15.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r15.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle22 = textStyle9;
        }
        if ((i & 1024) != 0) {
            textStyle23 = r15.m5100copyv2rsoow((r48 & 1) != 0 ? r15.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r15.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(14), (r48 & 4) != 0 ? r15.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r15.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r15.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r15.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r15.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r15.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.25d), (r48 & 256) != 0 ? r15.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r15.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r15.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r15.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r15.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r15.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r15.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r15.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r15.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r15.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r15.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r15.platformStyle : null, (r48 & 1048576) != 0 ? r15.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r15.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r15.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle23 = textStyle10;
        }
        if ((i & 2048) != 0) {
            textStyle24 = r14.m5100copyv2rsoow((r48 & 1) != 0 ? r14.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r14.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(14), (r48 & 4) != 0 ? r14.spanStyle.getFontWeight() : FontWeight.Companion.getMedium(), (r48 & 8) != 0 ? r14.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r14.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r14.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r14.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r14.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.25d), (r48 & 256) != 0 ? r14.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r14.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r14.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r14.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r14.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r14.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r14.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r14.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r14.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r14.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r14.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r14.platformStyle : null, (r48 & 1048576) != 0 ? r14.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r14.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r14.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle24 = textStyle11;
        }
        if ((i & 4096) != 0) {
            textStyle25 = r14.m5100copyv2rsoow((r48 & 1) != 0 ? r14.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r14.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(12), (r48 & 4) != 0 ? r14.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r14.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r14.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r14.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r14.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r14.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(0.4d), (r48 & 256) != 0 ? r14.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r14.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r14.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r14.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r14.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r14.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r14.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r14.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r14.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r14.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r14.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r14.platformStyle : null, (r48 & 1048576) != 0 ? r14.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r14.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r14.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle25 = textStyle12;
        }
        if ((i & 8192) != 0) {
            textStyle26 = r14.m5100copyv2rsoow((r48 & 1) != 0 ? r14.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r14.spanStyle.m5042getFontSizeXSAIIZE() : TextUnitKt.getSp(10), (r48 & 4) != 0 ? r14.spanStyle.getFontWeight() : FontWeight.Companion.getNormal(), (r48 & 8) != 0 ? r14.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r14.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r14.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r14.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r14.spanStyle.m5045getLetterSpacingXSAIIZE() : TextUnitKt.getSp(1.5d), (r48 & 256) != 0 ? r14.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r14.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r14.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r14.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r14.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r14.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r14.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r14.paragraphStyle.m4997getTextAlignbuA522U() : null, (r48 & 65536) != 0 ? r14.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r14.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r14.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r14.platformStyle : null, (r48 & 1048576) != 0 ? r14.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r14.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r14.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? TypographyKt.getDefaultTextStyle().paragraphStyle.getTextMotion() : null);
        } else {
            textStyle26 = textStyle13;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typography(FontFamily defaultFontFamily, TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        TextStyle withDefaultFontFamily;
        TextStyle withDefaultFontFamily2;
        TextStyle withDefaultFontFamily3;
        TextStyle withDefaultFontFamily4;
        TextStyle withDefaultFontFamily5;
        TextStyle withDefaultFontFamily6;
        TextStyle withDefaultFontFamily7;
        TextStyle withDefaultFontFamily8;
        TextStyle withDefaultFontFamily9;
        TextStyle withDefaultFontFamily10;
        TextStyle withDefaultFontFamily11;
        TextStyle withDefaultFontFamily12;
        TextStyle withDefaultFontFamily13;
        Intrinsics.checkNotNullParameter(defaultFontFamily, "defaultFontFamily");
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        withDefaultFontFamily = TypographyKt.withDefaultFontFamily(h1, defaultFontFamily);
        withDefaultFontFamily2 = TypographyKt.withDefaultFontFamily(h2, defaultFontFamily);
        withDefaultFontFamily3 = TypographyKt.withDefaultFontFamily(h3, defaultFontFamily);
        withDefaultFontFamily4 = TypographyKt.withDefaultFontFamily(h4, defaultFontFamily);
        withDefaultFontFamily5 = TypographyKt.withDefaultFontFamily(h5, defaultFontFamily);
        withDefaultFontFamily6 = TypographyKt.withDefaultFontFamily(h6, defaultFontFamily);
        withDefaultFontFamily7 = TypographyKt.withDefaultFontFamily(subtitle1, defaultFontFamily);
        withDefaultFontFamily8 = TypographyKt.withDefaultFontFamily(subtitle2, defaultFontFamily);
        withDefaultFontFamily9 = TypographyKt.withDefaultFontFamily(body1, defaultFontFamily);
        withDefaultFontFamily10 = TypographyKt.withDefaultFontFamily(body2, defaultFontFamily);
        withDefaultFontFamily11 = TypographyKt.withDefaultFontFamily(button, defaultFontFamily);
        withDefaultFontFamily12 = TypographyKt.withDefaultFontFamily(caption, defaultFontFamily);
        withDefaultFontFamily13 = TypographyKt.withDefaultFontFamily(overline, defaultFontFamily);
    }

    public final Typography copy(TextStyle h1, TextStyle h2, TextStyle h3, TextStyle h4, TextStyle h5, TextStyle h6, TextStyle subtitle1, TextStyle subtitle2, TextStyle body1, TextStyle body2, TextStyle button, TextStyle caption, TextStyle overline) {
        Intrinsics.checkNotNullParameter(h1, "h1");
        Intrinsics.checkNotNullParameter(h2, "h2");
        Intrinsics.checkNotNullParameter(h3, "h3");
        Intrinsics.checkNotNullParameter(h4, "h4");
        Intrinsics.checkNotNullParameter(h5, "h5");
        Intrinsics.checkNotNullParameter(h6, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        return new Typography(h1, h2, h3, h4, h5, h6, subtitle1, subtitle2, body1, body2, button, caption, overline);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Typography) {
            Typography typography = (Typography) obj;
            return Intrinsics.areEqual(this.h1, typography.h1) && Intrinsics.areEqual(this.h2, typography.h2) && Intrinsics.areEqual(this.h3, typography.h3) && Intrinsics.areEqual(this.h4, typography.h4) && Intrinsics.areEqual(this.h5, typography.h5) && Intrinsics.areEqual(this.h6, typography.h6) && Intrinsics.areEqual(this.subtitle1, typography.subtitle1) && Intrinsics.areEqual(this.subtitle2, typography.subtitle2) && Intrinsics.areEqual(this.body1, typography.body1) && Intrinsics.areEqual(this.body2, typography.body2) && Intrinsics.areEqual(this.button, typography.button) && Intrinsics.areEqual(this.caption, typography.caption) && Intrinsics.areEqual(this.overline, typography.overline);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }
}
